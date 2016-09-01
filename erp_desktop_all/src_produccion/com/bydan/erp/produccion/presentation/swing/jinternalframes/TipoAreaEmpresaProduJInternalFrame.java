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
import com.bydan.erp.produccion.util.TipoAreaEmpresaProduConstantesFunciones;

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
public class TipoAreaEmpresaProduJInternalFrame extends TipoAreaEmpresaProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoAreaEmpresaProdu;
	
	protected JMenuBar jmenuBarTipoAreaEmpresaProdu;
	
	protected JMenu jmenuTipoAreaEmpresaProdu;
	protected JMenu jmenuDatosTipoAreaEmpresaProdu;
	protected JMenu jmenuArchivoTipoAreaEmpresaProdu;
	protected JMenu jmenuAccionesTipoAreaEmpresaProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoAreaEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoAreaEmpresaProdu;	
	protected GridBagConstraints gridBagConstraintsTipoAreaEmpresaProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoAreaEmpresaProduDetalleFormJInternalFrame jInternalFrameDetalleFormTipoAreaEmpresaProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoAreaEmpresaProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoAreaEmpresaProdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoAreaEmpresaProduSessionBean tipoareaempresaproduSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoAreaEmpresaProdu> tipoareaempresaprodus;		
	public List<TipoAreaEmpresaProdu> tipoareaempresaprodusEliminados;	
	public List<TipoAreaEmpresaProdu> tipoareaempresaprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoAreaEmpresaProdu;		
	protected JButton jButtonAbrirOrderByTipoAreaEmpresaProdu;
	
	
	//protected JPanel jPanelOrderByTipoAreaEmpresaProdu;
	//public JScrollPane jScrollPanelOrderByTipoAreaEmpresaProdu;	
	//protected JButton jButtonCerrarOrderByTipoAreaEmpresaProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoAreaEmpresaProduLogic tipoareaempresaproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoAreaEmpresaProdu;
	public JScrollPane jScrollPanelDatosEdicionTipoAreaEmpresaProdu;
	public JScrollPane jScrollPanelDatosGeneralTipoAreaEmpresaProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoAreaEmpresaProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoAreaEmpresaProdu;
	//public JScrollPane jScrollPanelImportacionTipoAreaEmpresaProdu;
	
	
	
	protected JPanel jPanelAccionesTipoAreaEmpresaProdu;
	
    protected JPanel jPanelPaginacionTipoAreaEmpresaProdu;
    protected JPanel jPanelParametrosReportesTipoAreaEmpresaProdu;
	protected JPanel jPanelParametrosReportesAccionesTipoAreaEmpresaProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoAreaEmpresaProdu;
	protected JPanel jPanelParametrosAuxiliar2TipoAreaEmpresaProdu;
	protected JPanel jPanelParametrosAuxiliar3TipoAreaEmpresaProdu;
	protected JPanel jPanelParametrosAuxiliar4TipoAreaEmpresaProdu;
	//protected JPanel jPanelParametrosAuxiliar5TipoAreaEmpresaProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoAreaEmpresaProdu;
	//protected JPanel jPanelImportacionTipoAreaEmpresaProdu;
	
	
	public JTable jTableDatosTipoAreaEmpresaProdu;
	
	
	
	//public JTable jTableDatosTipoAreaEmpresaProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoAreaEmpresaProdu;
	protected JButton jButtonDuplicarTipoAreaEmpresaProdu;
	protected JButton jButtonCopiarTipoAreaEmpresaProdu;
	protected JButton jButtonVerFormTipoAreaEmpresaProdu;
	protected JButton jButtonNuevoRelacionesTipoAreaEmpresaProdu;
	protected JButton jButtonModificarTipoAreaEmpresaProdu;
	
    protected JButton jButtonGuardarCambiosTablaTipoAreaEmpresaProdu;
	protected JButton jButtonCerrarTipoAreaEmpresaProdu;
	
	
	protected JButton jButtonRecargarInformacionTipoAreaEmpresaProdu;
	protected JButton jButtonProcesarInformacionTipoAreaEmpresaProdu;
	
	
	protected JButton jButtonAnterioresTipoAreaEmpresaProdu;
	protected JButton jButtonSiguientesTipoAreaEmpresaProdu;
	protected JButton jButtonNuevoGuardarCambiosTipoAreaEmpresaProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoAreaEmpresaProdu;
	//protected JButton jButtonCerrarReporteDinamicoTipoAreaEmpresaProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoAreaEmpresaProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoAreaEmpresaProdu;
	//protected JButton jButtonGenerarImportacionTipoAreaEmpresaProdu;
	//protected JButton jButtonCerrarImportacionTipoAreaEmpresaProdu;
	//protected JFileChooser jFileChooserImportacionTipoAreaEmpresaProdu;
	//protected File fileImportacionTipoAreaEmpresaProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonDuplicarToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonNuevoRelacionesToolBarTipoAreaEmpresaProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonCopiarToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonVerFormToolBarTipoAreaEmpresaProdu;
	public JButton jButtonGuardarCambiosTablaToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonCerrarToolBarTipoAreaEmpresaProdu;
	
	protected JButton jButtonRecargarInformacionToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonProcesarInformacionToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonAnterioresToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonSiguientesToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoAreaEmpresaProdu;
	protected JButton jButtonAbrirOrderByToolBarTipoAreaEmpresaProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemDuplicarTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemNuevoRelacionesTipoAreaEmpresaProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemCopiarTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemVerFormTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemCerrarTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemDetalleCerrarTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoAreaEmpresaProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemProcesarInformacionTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemAnterioresTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemSiguientesTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemAbrirOrderByTipoAreaEmpresaProdu;
	protected JMenuItem jMenuItemMostrarOcultarTipoAreaEmpresaProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoAreaEmpresaProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu;
	protected JCheckBox jCheckBoxSeleccionadosTipoAreaEmpresaProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoAreaEmpresaProdu;
	protected JCheckBox jCheckBoxConGraficoReporteTipoAreaEmpresaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoAreaEmpresaProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoAreaEmpresaProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoAreaEmpresaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoAreaEmpresaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoAreaEmpresaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoAreaEmpresaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoAreaEmpresaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoAreaEmpresaProdu;
	protected JTextField jTextFieldValorCampoGeneralTipoAreaEmpresaProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoAreaEmpresaProdu;
	//public JList<Reporte> jListColumnasSelectReporteTipoAreaEmpresaProdu;
	//public JScrollPane jScrollColumnasSelectReporteTipoAreaEmpresaProdu;
	
	//public JLabel jLabelRelacionesSelectReporteTipoAreaEmpresaProdu;
	//public JList<Reporte> jListRelacionesSelectReporteTipoAreaEmpresaProdu;
	//public JScrollPane jScrollRelacionesSelectReporteTipoAreaEmpresaProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoAreaEmpresaProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoAreaEmpresaProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoAreaEmpresaProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoAreaEmpresaProdu;
	
		
	//public JLabel jLabelArchivoImportacionTipoAreaEmpresaProdu;	
	//public JLabel jLabelPathArchivoImportacionTipoAreaEmpresaProdu;
	//protected JTextField jTextFieldPathArchivoImportacionTipoAreaEmpresaProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoAreaEmpresaProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoAreaEmpresaProdu;
	
	//public JLabel jLabelColumnaCategoriaValorTipoAreaEmpresaProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoAreaEmpresaProdu;
	
	//public JLabel jLabelColumnasValoresGraficoTipoAreaEmpresaProdu;
	//public JList<Reporte> jListColumnasValoresGraficoTipoAreaEmpresaProdu;
	//public JScrollPane jScrollColumnasValoresGraficoTipoAreaEmpresaProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoAreaEmpresaProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoAreaEmpresaProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoAreaEmpresaProdu;
	
	
	
	
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
	public TipoAreaEmpresaProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoAreaEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAreaEmpresaProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAreaEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAreaEmpresaProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAreaEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAreaEmpresaProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoAreaEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoAreaEmpresaProdu)	{
		this.jButtonRecargarInformacionTipoAreaEmpresaProdu = jButtonRecargarInformacionTipoAreaEmpresaProdu;
	}
	
	public JButton getjButtonProcesarInformacionTipoAreaEmpresaProdu() {
		return this.jButtonProcesarInformacionTipoAreaEmpresaProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoAreaEmpresaProdu)	{
		this.jButtonProcesarInformacionTipoAreaEmpresaProdu = jButtonProcesarInformacionTipoAreaEmpresaProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoAreaEmpresaProdu() {
		return this.jButtonRecargarInformacionTipoAreaEmpresaProdu;
	}
	
	
	public List<TipoAreaEmpresaProdu> gettipoareaempresaprodus() {
		return this.tipoareaempresaprodus;
	}

	public void settipoareaempresaprodus(List<TipoAreaEmpresaProdu> tipoareaempresaprodus) {
		this.tipoareaempresaprodus = tipoareaempresaprodus;
	}
	
	public List<TipoAreaEmpresaProdu> gettipoareaempresaprodusAux() {
		return this.tipoareaempresaprodusAux;
	}

	public void settipoareaempresaprodusAux(List<TipoAreaEmpresaProdu> tipoareaempresaprodusAux) {
		this.tipoareaempresaprodusAux = tipoareaempresaprodusAux;
	}
	
	public List<TipoAreaEmpresaProdu> gettipoareaempresaprodusEliminados() {
		return this.tipoareaempresaprodusEliminados;
	}

	public void setTipoAreaEmpresaProdusEliminados(List<TipoAreaEmpresaProdu> tipoareaempresaprodusEliminados) {
		this.tipoareaempresaprodusEliminados = tipoareaempresaprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoAreaEmpresaProdu() {
		return jComboBoxTiposSeleccionarTipoAreaEmpresaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoAreaEmpresaProdu(
			JComboBox jComboBoxTiposSeleccionarTipoAreaEmpresaProdu) {
		this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu = jComboBoxTiposSeleccionarTipoAreaEmpresaProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoAreaEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoAreaEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoAreaEmpresaProdu() {
		return jTextFieldValorCampoGeneralTipoAreaEmpresaProdu;
	}

	public void setjTextFieldValorCampoGeneralTipoAreaEmpresaProdu(
			JTextField jTextFieldValorCampoGeneralTipoAreaEmpresaProdu) {
		this.jTextFieldValorCampoGeneralTipoAreaEmpresaProdu = jTextFieldValorCampoGeneralTipoAreaEmpresaProdu;
	}

	public void setBorderResaltarValorCampoGeneralTipoAreaEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaEmpresaProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoAreaEmpresaProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoAreaEmpresaProdu() {
		return this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu;
	}

	public void setjCheckBoxSeleccionarTodosTipoAreaEmpresaProdu(
			JCheckBox jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu) {
		this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu = jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu;
	}

	public void setBorderResaltarSeleccionarTodosTipoAreaEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaEmpresaProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoAreaEmpresaProdu() {
		return this.jCheckBoxSeleccionadosTipoAreaEmpresaProdu;
	}

	public void setjCheckBoxSeleccionadosTipoAreaEmpresaProdu(
			JCheckBox jCheckBoxSeleccionadosTipoAreaEmpresaProdu) {
		this.jCheckBoxSeleccionadosTipoAreaEmpresaProdu = jCheckBoxSeleccionadosTipoAreaEmpresaProdu;
	}
	
	public void setBorderResaltarSeleccionadosTipoAreaEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaEmpresaProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoAreaEmpresaProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoAreaEmpresaProdu() {
		return this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoAreaEmpresaProdu(
			JComboBox jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu) {
		this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu = jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu;
	}

	public void setBorderResaltarTiposArchivosReportesTipoAreaEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoAreaEmpresaProdu() {
		return this.jComboBoxTiposReportesTipoAreaEmpresaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoAreaEmpresaProdu(
			JComboBox jComboBoxTiposReportesTipoAreaEmpresaProdu) {
		this.jComboBoxTiposReportesTipoAreaEmpresaProdu = jComboBoxTiposReportesTipoAreaEmpresaProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoAreaEmpresaProdu() {
	//	return jComboBoxTiposReportesDinamicoTipoAreaEmpresaProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoAreaEmpresaProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoAreaEmpresaProdu) {
	//	this.jComboBoxTiposReportesDinamicoTipoAreaEmpresaProdu = jComboBoxTiposReportesDinamicoTipoAreaEmpresaProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoAreaEmpresaProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoAreaEmpresaProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoAreaEmpresaProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoAreaEmpresaProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoAreaEmpresaProdu = jComboBoxTiposArchivosReportesDinamicoTipoAreaEmpresaProdu;
	//}
	
	public void setBorderResaltarTiposReportesTipoAreaEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoAreaEmpresaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoAreaEmpresaProdu() {
		return this.jComboBoxTiposGraficosReportesTipoAreaEmpresaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoAreaEmpresaProdu(
			JComboBox jComboBoxTiposGraficosReportesTipoAreaEmpresaProdu) {
		this.jComboBoxTiposGraficosReportesTipoAreaEmpresaProdu = jComboBoxTiposGraficosReportesTipoAreaEmpresaProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoAreaEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoAreaEmpresaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoAreaEmpresaProdu() {
		return this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoAreaEmpresaProdu(
			JComboBox jComboBoxTiposPaginacionTipoAreaEmpresaProdu) {
		this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu = jComboBoxTiposPaginacionTipoAreaEmpresaProdu;
	}
	
	public void setBorderResaltarTiposPaginacionTipoAreaEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoAreaEmpresaProdu() {
		return this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoAreaEmpresaProdu() {
		return this.jComboBoxTiposAccionesTipoAreaEmpresaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoAreaEmpresaProdu(
			JComboBox jComboBoxTiposRelacionesTipoAreaEmpresaProdu) {
		this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu = jComboBoxTiposRelacionesTipoAreaEmpresaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoAreaEmpresaProdu(
			JComboBox jComboBoxTiposAccionesTipoAreaEmpresaProdu) {
		this.jComboBoxTiposAccionesTipoAreaEmpresaProdu = jComboBoxTiposAccionesTipoAreaEmpresaProdu;
	}
	
	public void setBorderResaltarTiposRelacionesTipoAreaEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoAreaEmpresaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoAreaEmpresaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoAreaEmpresaProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoAreaEmpresaProdu() {
	//	return jCheckBoxConGraficoDinamicoTipoAreaEmpresaProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoAreaEmpresaProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoAreaEmpresaProdu) {
	//	this.jCheckBoxConGraficoDinamicoTipoAreaEmpresaProdu = jCheckBoxConGraficoDinamicoTipoAreaEmpresaProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoAreaEmpresaProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoAreaEmpresaProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoAreaEmpresaProdu .setBorder(borderResaltar);		
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
		this.tipoareaempresaproduSessionBean=new TipoAreaEmpresaProduSessionBean();
		
		this.tipoareaempresaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoareaempresaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoAreaEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoAreaEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoAreaEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoAreaEmpresaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoAreaEmpresaProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Area Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoAreaEmpresaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoAreaEmpresaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoAreaEmpresaProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoAreaEmpresaProdu,this.jTtoolBarTipoAreaEmpresaProdu,
							"nuevo","nuevo","Nuevo"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoAreaEmpresaProdu,this.jTtoolBarTipoAreaEmpresaProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoAreaEmpresaProdu,this.jTtoolBarTipoAreaEmpresaProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoAreaEmpresaProdu,this.jTtoolBarTipoAreaEmpresaProdu,
							"duplicar","duplicar","Duplicar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoAreaEmpresaProdu,this.jTtoolBarTipoAreaEmpresaProdu,
							"copiar","copiar","Copiar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoAreaEmpresaProdu,this.jTtoolBarTipoAreaEmpresaProdu,
							"ver_form","ver_form","Ver"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAreaEmpresaProdu,this.jTtoolBarTipoAreaEmpresaProdu,
							"recargar","recargar","Recargar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAreaEmpresaProdu,this.jTtoolBarTipoAreaEmpresaProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoAreaEmpresaProdu,this.jTtoolBarTipoAreaEmpresaProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoAreaEmpresaProdu,this.jTtoolBarTipoAreaEmpresaProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoAreaEmpresaProdu,this.jTtoolBarTipoAreaEmpresaProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoAreaEmpresaProdu,this.jTtoolBarTipoAreaEmpresaProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoAreaEmpresaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoAreaEmpresaProdu,this.jTtoolBarTipoAreaEmpresaProdu,
							"cerrar","cerrar","Salir"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoAreaEmpresaProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoAreaEmpresaProdu;
			
				this.jButtonProcesarInformacionToolBarTipoAreaEmpresaProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoAreaEmpresaProdu;
				
		//protected JButton jButtonModificarToolBarTipoAreaEmpresaProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoAreaEmpresaProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoAreaEmpresaProdu=new JMenuMe("General");
		this.jmenuArchivoTipoAreaEmpresaProdu=new JMenuMe("Archivo");
		this.jmenuAccionesTipoAreaEmpresaProdu=new JMenuMe("Acciones");
		this.jmenuDatosTipoAreaEmpresaProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoAreaEmpresaProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoAreaEmpresaProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoAreaEmpresaProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoAreaEmpresaProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoAreaEmpresaProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoAreaEmpresaProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoAreaEmpresaProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoAreaEmpresaProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoAreaEmpresaProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoAreaEmpresaProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoAreaEmpresaProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoAreaEmpresaProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoAreaEmpresaProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoAreaEmpresaProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoAreaEmpresaProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoAreaEmpresaProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoAreaEmpresaProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoAreaEmpresaProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoAreaEmpresaProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoAreaEmpresaProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoAreaEmpresaProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoAreaEmpresaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoAreaEmpresaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoAreaEmpresaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoAreaEmpresaProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoAreaEmpresaProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoAreaEmpresaProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoAreaEmpresaProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoAreaEmpresaProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoAreaEmpresaProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoAreaEmpresaProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoAreaEmpresaProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoAreaEmpresaProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoAreaEmpresaProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoAreaEmpresaProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoAreaEmpresaProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoAreaEmpresaProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoAreaEmpresaProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoAreaEmpresaProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoAreaEmpresaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoAreaEmpresaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoAreaEmpresaProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoAreaEmpresaProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoAreaEmpresaProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoAreaEmpresaProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoAreaEmpresaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoAreaEmpresaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoAreaEmpresaProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoAreaEmpresaProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoAreaEmpresaProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoAreaEmpresaProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoAreaEmpresaProdu.add(this.jMenuItemCerrarTipoAreaEmpresaProdu);
			
			this.jmenuAccionesTipoAreaEmpresaProdu.add(this.jMenuItemNuevoTipoAreaEmpresaProdu);
			this.jmenuAccionesTipoAreaEmpresaProdu.add(this.jMenuItemNuevoGuardarCambiosTipoAreaEmpresaProdu);
			this.jmenuAccionesTipoAreaEmpresaProdu.add(this.jMenuItemNuevoRelacionesTipoAreaEmpresaProdu);
			this.jmenuAccionesTipoAreaEmpresaProdu.add(this.jMenuItemGuardarCambiosTablaTipoAreaEmpresaProdu);		
			this.jmenuAccionesTipoAreaEmpresaProdu.add(this.jMenuItemDuplicarTipoAreaEmpresaProdu);		
			this.jmenuAccionesTipoAreaEmpresaProdu.add(this.jMenuItemCopiarTipoAreaEmpresaProdu);		
			this.jmenuAccionesTipoAreaEmpresaProdu.add(this.jMenuItemVerFormTipoAreaEmpresaProdu);		
			
			this.jmenuDatosTipoAreaEmpresaProdu.add(this.jMenuItemRecargarInformacionTipoAreaEmpresaProdu);				
			this.jmenuDatosTipoAreaEmpresaProdu.add(this.jMenuItemAnterioresTipoAreaEmpresaProdu);				
			this.jmenuDatosTipoAreaEmpresaProdu.add(this.jMenuItemSiguientesTipoAreaEmpresaProdu);				
			this.jmenuDatosTipoAreaEmpresaProdu.add(this.jMenuItemAbrirOrderByTipoAreaEmpresaProdu);				
			this.jmenuDatosTipoAreaEmpresaProdu.add(this.jMenuItemMostrarOcultarTipoAreaEmpresaProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoAreaEmpresaProdu.add(this.jMenuItemGuardarCambiosTipoAreaEmpresaProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoAreaEmpresaProdu.add(this.jmenuArchivoTipoAreaEmpresaProdu);		
			this.jmenuBarTipoAreaEmpresaProdu.add(this.jmenuAccionesTipoAreaEmpresaProdu);		
			this.jmenuBarTipoAreaEmpresaProdu.add(this.jmenuDatosTipoAreaEmpresaProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoAreaEmpresaProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoAreaEmpresaProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoAreaEmpresaProdu=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoAreaEmpresaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoAreaEmpresaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoAreaEmpresaProdu = new TipoAreaEmpresaProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Area Empresa DATOS");
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu = new TipoAreaEmpresaProduDetalleFormJInternalFrame(jDesktopPane,this.tipoareaempresaproduSessionBean.getConGuardarRelaciones(),this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoAreaEmpresaProdu = null;//new TipoAreaEmpresaProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoAreaEmpresaProdu= new GridBagLayout();
		
		
		this.jTableDatosTipoAreaEmpresaProdu = new JTableMe();      
		
		String sToolTipTipoAreaEmpresaProdu="";
		sToolTipTipoAreaEmpresaProdu=TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoAreaEmpresaProdu+="(Produccion.TipoAreaEmpresaProdu)";
		}
		
		if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoAreaEmpresaProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoAreaEmpresaProdu.setToolTipText(sToolTipTipoAreaEmpresaProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoAreaEmpresaProdu);
		this.jTableDatosTipoAreaEmpresaProdu.setAutoCreateRowSorter(true);
		this.jTableDatosTipoAreaEmpresaProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoAreaEmpresaProdu.setRowSelectionAllowed(true);
		this.jTableDatosTipoAreaEmpresaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoAreaEmpresaProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonDuplicarTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonCopiarTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonVerFormTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonNuevoRelacionesTipoAreaEmpresaProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonCerrarTipoAreaEmpresaProdu = new JButtonMe();
		
		this.jScrollPanelDatosTipoAreaEmpresaProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoAreaEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Area Empresa";
		
		if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Area Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoAreaEmpresaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoAreaEmpresaProdu.setToolTipText("Acciones");
        this.jPanelAccionesTipoAreaEmpresaProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu=new ReporteDinamicoJInternalFrame(TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoAreaEmpresaProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoAreaEmpresaProdu=new ImportacionJInternalFrame(TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoAreaEmpresaProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoAreaEmpresaProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoAreaEmpresaProdu.setText("Orden");
		this.jButtonAbrirOrderByTipoAreaEmpresaProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoAreaEmpresaProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoAreaEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoAreaEmpresaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAreaEmpresaProdu,false,this);
			
			//this.cargarOrderByTipoAreaEmpresaProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoAreaEmpresaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAreaEmpresaProdu,true,this);
			
			//this.cargarOrderByTipoAreaEmpresaProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoAreaEmpresaProdu.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoAreaEmpresaProdu.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoAreaEmpresaProdu.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoAreaEmpresaProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoAreaEmpresaProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoAreaEmpresaProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoAreaEmpresaProdu.setText("Nuevo");
		this.jButtonDuplicarTipoAreaEmpresaProdu.setText("Duplicar");
		this.jButtonCopiarTipoAreaEmpresaProdu.setText("Copiar");
		this.jButtonVerFormTipoAreaEmpresaProdu.setText("Ver");
		this.jButtonNuevoRelacionesTipoAreaEmpresaProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu.setText("Guardar");
		this.jButtonCerrarTipoAreaEmpresaProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoAreaEmpresaProdu,"nuevo_button","Nuevo",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoAreaEmpresaProdu,"duplicar_button","Duplicar",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoAreaEmpresaProdu,"copiar_button","Copiar",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoAreaEmpresaProdu,"ver_form","Ver",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoAreaEmpresaProdu,"nuevorelaciones_button","Nuevo Rel",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu,"guardarcambiostabla_button","Guardar",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoAreaEmpresaProdu,"cerrar_button","Salir",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoAreaEmpresaProdu.setToolTipText("Nuevo"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoAreaEmpresaProdu.setToolTipText("Duplicar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoAreaEmpresaProdu.setToolTipText("Copiar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoAreaEmpresaProdu.setToolTipText("Ver"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoAreaEmpresaProdu.setToolTipText("Nuevo Rel"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu.setToolTipText("Guardar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoAreaEmpresaProdu.setToolTipText("Salir"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoAreaEmpresaProdu";
		inputMap = this.jButtonNuevoTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoAreaEmpresaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoAreaEmpresaProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoAreaEmpresaProdu";
		inputMap = this.jButtonDuplicarTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoAreaEmpresaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoAreaEmpresaProdu"));
		
		//COPIAR
		sMapKey = "CopiarTipoAreaEmpresaProdu";
		inputMap = this.jButtonCopiarTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoAreaEmpresaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoAreaEmpresaProdu"));
		
		//VEr FORM
		sMapKey = "VerFormTipoAreaEmpresaProdu";
		inputMap = this.jButtonVerFormTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoAreaEmpresaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoAreaEmpresaProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoAreaEmpresaProdu";
		inputMap = this.jButtonNuevoRelacionesTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoAreaEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoAreaEmpresaProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoAreaEmpresaProdu";
		inputMap = this.jButtonModificarTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoAreaEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoAreaEmpresaProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoAreaEmpresaProdu";
		inputMap = this.jButtonCerrarTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoAreaEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoAreaEmpresaProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoAreaEmpresaProdu";
		inputMap = this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoAreaEmpresaProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoAreaEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoAreaEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoAreaEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoAreaEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoAreaEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoAreaEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoAreaEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoAreaEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoAreaEmpresaProdu.setName("jPanelParametrosReportesTipoAreaEmpresaProdu"); 
		
		this.jPanelParametrosReportesAccionesTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoAreaEmpresaProdu.setName("jPanelParametrosReportesAccionesTipoAreaEmpresaProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonRecargarInformacionTipoAreaEmpresaProdu.setText("Recargar");
		this.jButtonRecargarInformacionTipoAreaEmpresaProdu.setToolTipText("Recargar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoAreaEmpresaProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonProcesarInformacionTipoAreaEmpresaProdu.setText("Procesar");
		this.jButtonProcesarInformacionTipoAreaEmpresaProdu.setToolTipText("Procesar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoAreaEmpresaProdu.setVisible(false);
			
		this.jButtonProcesarInformacionTipoAreaEmpresaProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoAreaEmpresaProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoAreaEmpresaProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoAreaEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu.setText("TIPO");       
		this.jComboBoxTiposReportesTipoAreaEmpresaProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoAreaEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoAreaEmpresaProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu.setText("Accion");
		this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoAreaEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setText("Accion");
		this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoAreaEmpresaProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoAreaEmpresaProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoAreaEmpresaProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoAreaEmpresaProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoAreaEmpresaProdu = new JLabelMe();
		
		this.jLabelAccionesTipoAreaEmpresaProdu.setText("Acciones");		
		this.jLabelAccionesTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoAreaEmpresaProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoAreaEmpresaProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoAreaEmpresaProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoAreaEmpresaProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoAreaEmpresaProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoAreaEmpresaProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoAreaEmpresaProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoAreaEmpresaProdu.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoAreaEmpresaProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoAreaEmpresaProdu = new JButtonMe();
		//this.jButtonAnterioresTipoAreaEmpresaProdu.setText("<<");
        this.jButtonAnterioresTipoAreaEmpresaProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoAreaEmpresaProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoAreaEmpresaProdu = new JButtonMe();
		//this.jButtonSiguientesTipoAreaEmpresaProdu.setText(">>");
        this.jButtonSiguientesTipoAreaEmpresaProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoAreaEmpresaProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoAreaEmpresaProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoAreaEmpresaProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoAreaEmpresaProdu,"nuevoguardarcambios_button","Nue",this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoAreaEmpresaProdu";
		inputMap = this.jButtonNuevoGuardarCambiosTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoAreaEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoAreaEmpresaProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoAreaEmpresaProdu";
		inputMap = this.jButtonRecargarInformacionTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoAreaEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoAreaEmpresaProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoAreaEmpresaProdu";
		inputMap = this.jButtonSiguientesTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoAreaEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoAreaEmpresaProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoAreaEmpresaProdu";
		inputMap = this.jButtonAnterioresTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoAreaEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoAreaEmpresaProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoAreaEmpresaProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.setMinimumSize(new Dimension(this.getWidth(),TipoAreaEmpresaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAreaEmpresaProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.setMaximumSize(new Dimension(this.getWidth(),TipoAreaEmpresaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAreaEmpresaProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoAreaEmpresaProdu.setPreferredSize(new Dimension(this.getWidth(),TipoAreaEmpresaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoAreaEmpresaProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoAreaEmpresaProdu = new GridBagLayout();

			this.jPanelPaginacionTipoAreaEmpresaProdu.setLayout(gridaBagLayoutPaginacionTipoAreaEmpresaProdu);						
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoAreaEmpresaProdu.add(this.jButtonAnterioresTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
					
						
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
			
			this.jPanelPaginacionTipoAreaEmpresaProdu.add(this.jButtonNuevoGuardarCambiosTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
						
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
			this.jPanelPaginacionTipoAreaEmpresaProdu.add(this.jButtonSiguientesTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 1;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAreaEmpresaProdu.add(this.jButtonNuevoTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 1;
				this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoAreaEmpresaProdu.add(this.jButtonNuevoRelacionesTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
			}
			
			
			if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 1;
				this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoAreaEmpresaProdu.add(this.jButtonGuardarCambiosTablaTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
			}
			
			
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 1;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAreaEmpresaProdu.add(this.jButtonDuplicarTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 1;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAreaEmpresaProdu.add(this.jButtonCopiarTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 1;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoAreaEmpresaProdu.add(this.jButtonVerFormTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 1;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoAreaEmpresaProdu.add(this.jButtonCerrarTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		
		
		
		this.jButtonRecargarInformacionTipoAreaEmpresaProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoAreaEmpresaProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoAreaEmpresaProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoAreaEmpresaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoAreaEmpresaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoAreaEmpresaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoAreaEmpresaProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoAreaEmpresaProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoAreaEmpresaProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAreaEmpresaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoAreaEmpresaProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoAreaEmpresaProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoAreaEmpresaProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoAreaEmpresaProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoAreaEmpresaProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoAreaEmpresaProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoAreaEmpresaProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoAreaEmpresaProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoAreaEmpresaProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoAreaEmpresaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoAreaEmpresaProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoAreaEmpresaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoAreaEmpresaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoAreaEmpresaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoAreaEmpresaProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoAreaEmpresaProdu.setLayout(gridaBagParametrosReportesTipoAreaEmpresaProdu);
			this.jPanelParametrosReportesAccionesTipoAreaEmpresaProdu.setLayout(gridaBagParametrosReportesAccionesTipoAreaEmpresaProdu);
			
			
			this.jPanelParametrosAuxiliar1TipoAreaEmpresaProdu.setLayout(gridaBagParametrosAuxiliar1TipoAreaEmpresaProdu);
			this.jPanelParametrosAuxiliar2TipoAreaEmpresaProdu.setLayout(gridaBagParametrosAuxiliar2TipoAreaEmpresaProdu);
			this.jPanelParametrosAuxiliar3TipoAreaEmpresaProdu.setLayout(gridaBagParametrosAuxiliar3TipoAreaEmpresaProdu);
			this.jPanelParametrosAuxiliar4TipoAreaEmpresaProdu.setLayout(gridaBagParametrosAuxiliar4TipoAreaEmpresaProdu);
			//this.jPanelParametrosAuxiliar5TipoAreaEmpresaProdu.setLayout(gridaBagParametrosAuxiliar2TipoAreaEmpresaProdu);			
			
			
			
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAreaEmpresaProdu.add(this.jButtonRecargarInformacionTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAreaEmpresaProdu.add(this.jComboBoxTiposPaginacionTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAreaEmpresaProdu.add(this.jCheckBoxConAltoMaximoTablaTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoAreaEmpresaProdu.add(this.jComboBoxTiposArchivosReportesTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAreaEmpresaProdu.add(this.jPanelParametrosAuxiliar1TipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoAreaEmpresaProdu.add(this.jComboBoxTiposReportesTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAreaEmpresaProdu.add(this.jPanelParametrosAuxiliar4TipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAreaEmpresaProdu.add(this.jComboBoxTiposReportesTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAreaEmpresaProdu.add(this.jCheckBoxGenerarReporteTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAreaEmpresaProdu.add(this.jPanelParametrosAuxiliar2TipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAreaEmpresaProdu.add(this.jLabelAccionesTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoAreaEmpresaProdu.add(this.jButtonAbrirOrderByTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAreaEmpresaProdu.add(this.jComboBoxTiposSeleccionarTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);			
			
			
			/*
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoAreaEmpresaProdu.add(this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoAreaEmpresaProdu.add(this.jCheckBoxSeleccionarTodosTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);															
				
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoAreaEmpresaProdu.add(this.jCheckBoxSeleccionadosTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoAreaEmpresaProdu.add(this.jPanelParametrosAuxiliar3TipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAreaEmpresaProdu.add(this.jComboBoxTiposRelacionesTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
				
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAreaEmpresaProdu.add(this.jComboBoxTiposAccionesTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
	
				
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoAreaEmpresaProdu.add(this.jTextFieldValorCampoGeneralTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoAreaEmpresaProdu = new GridBagLayout();

			this.jScrollPanelDatosTipoAreaEmpresaProdu.setLayout(gridaBagLayoutDatosTipoAreaEmpresaProdu);
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
			
			this.jScrollPanelDatosTipoAreaEmpresaProdu.add(this.jTableDatosTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoAreaEmpresaProdu.setViewportView(this.jTableDatosTipoAreaEmpresaProdu);
		this.jTableDatosTipoAreaEmpresaProdu.setFillsViewportHeight(true);
		this.jTableDatosTipoAreaEmpresaProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoAreaEmpresaProdu= new GridBagLayout();
		this.jPanelAccionesTipoAreaEmpresaProdu.setLayout(gridaBagLayoutAccionesTipoAreaEmpresaProdu);
		
		
		/*	
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = 0;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
			
		this.jPanelAccionesTipoAreaEmpresaProdu.add(this.jButtonNuevoTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoAreaEmpresaProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoAreaEmpresaProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();						
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;		
			//this.gridBagConstraintsTipoAreaEmpresaProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;		
		//this.gridBagConstraintsTipoAreaEmpresaProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoAreaEmpresaProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoAreaEmpresaProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);								
		
		
		/*
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		*/		
		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx =0;
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoAreaEmpresaProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
				
		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoAreaEmpresaProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoAreaEmpresaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoAreaEmpresaProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoAreaEmpresaProdu.setLayout(gridaBagLayoutBusquedasParametrosTipoAreaEmpresaProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
			
			
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		
			
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoAreaEmpresaProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoAreaEmpresaProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoAreaEmpresaProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.setName("jPanelReporteDinamicoTipoAreaEmpresaProdu"); 
		
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.setLayout(gridaBagLayoutReporteDinamicoTipoAreaEmpresaProdu);
		
		
		this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoAreaEmpresaProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoAreaEmpresaProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoAreaEmpresaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoAreaEmpresaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoAreaEmpresaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Area Empresas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoAreaEmpresaProdu = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoAreaEmpresaProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.add(this.jLabelColumnasSelectReporteTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoAreaEmpresaProdu = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoAreaEmpresaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoAreaEmpresaProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoAreaEmpresaProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoAreaEmpresaProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoAreaEmpresaProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoAreaEmpresaProdu=new JScrollPane(this.jListColumnasSelectReporteTipoAreaEmpresaProdu);
			
			this.jScrollColumnasSelectReporteTipoAreaEmpresaProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoAreaEmpresaProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoAreaEmpresaProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoAreaEmpresaProdu.add(this.jListColumnasSelectReporteTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.add(this.jScrollColumnasSelectReporteTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoAreaEmpresaProdu = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoAreaEmpresaProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.add(this.jLabelRelacionesSelectReporteTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoAreaEmpresaProdu = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoAreaEmpresaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoAreaEmpresaProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoAreaEmpresaProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoAreaEmpresaProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoAreaEmpresaProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoAreaEmpresaProdu=new JScrollPane(this.jListRelacionesSelectReporteTipoAreaEmpresaProdu);
			
			this.jScrollRelacionesSelectReporteTipoAreaEmpresaProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoAreaEmpresaProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoAreaEmpresaProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoAreaEmpresaProdu.add(this.jListRelacionesSelectReporteTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.add(this.jScrollRelacionesSelectReporteTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoAreaEmpresaProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoAreaEmpresaProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoAreaEmpresaProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoAreaEmpresaProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoAreaEmpresaProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoAreaEmpresaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoAreaEmpresaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoAreaEmpresaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoAreaEmpresaProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoAreaEmpresaProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoAreaEmpresaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoAreaEmpresaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoAreaEmpresaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoAreaEmpresaProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoAreaEmpresaProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.add(this.jLabelGenerarExcelReporteDinamicoTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoAreaEmpresaProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoAreaEmpresaProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoAreaEmpresaProdu.setToolTipText("Generar EXCEL"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoAreaEmpresaProdu.add(this.jButtonGenerarExcelReporteDinamicoTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.add(this.jComboBoxTiposReportesDinamicoTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoAreaEmpresaProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoAreaEmpresaProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.add(this.jLabelTiposArchivoReporteDinamicoTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.add(this.jComboBoxTiposArchivosReportesDinamicoTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoAreaEmpresaProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoAreaEmpresaProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoAreaEmpresaProdu.setToolTipText("Generar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.add(this.jButtonGenerarReporteDinamicoTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoAreaEmpresaProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoAreaEmpresaProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoAreaEmpresaProdu.setToolTipText("Cancelar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoAreaEmpresaProdu.add(this.jButtonCerrarReporteDinamicoTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoAreaEmpresaProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoAreaEmpresaProdu= new JScrollPane(jPanelReporteDinamicoTipoAreaEmpresaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoAreaEmpresaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoAreaEmpresaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoAreaEmpresaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Area Empresas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoAreaEmpresaProdu);
		this.jInternalFrameReporteDinamicoTipoAreaEmpresaProdu.getContentPane().add(this.jScrollPanelReporteDinamicoTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoAreaEmpresaProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoAreaEmpresaProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoAreaEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoAreaEmpresaProdu.setName("jPanelImportacionTipoAreaEmpresaProdu"); 
		
		this.jPanelImportacionTipoAreaEmpresaProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoAreaEmpresaProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoAreaEmpresaProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoAreaEmpresaProdu.setLayout(gridaBagLayoutImportacionTipoAreaEmpresaProdu);
		
		
		this.jInternalFrameImportacionTipoAreaEmpresaProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoAreaEmpresaProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoAreaEmpresaProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoAreaEmpresaProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoAreaEmpresaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoAreaEmpresaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoAreaEmpresaProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoAreaEmpresaProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoAreaEmpresaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoAreaEmpresaProdu.setResizable(true);
	    this.jInternalFrameImportacionTipoAreaEmpresaProdu.setClosable(true);
	    this.jInternalFrameImportacionTipoAreaEmpresaProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoAreaEmpresaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoAreaEmpresaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoAreaEmpresaProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoAreaEmpresaProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoAreaEmpresaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoAreaEmpresaProdu.setResizable(true);
	    this.jInternalFrameImportacionTipoAreaEmpresaProdu.setClosable(true);
	    this.jInternalFrameImportacionTipoAreaEmpresaProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoAreaEmpresaProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoAreaEmpresaProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoAreaEmpresaProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Area Empresas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoAreaEmpresaProdu = new JLabelMe();

		this.jLabelArchivoImportacionTipoAreaEmpresaProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoAreaEmpresaProdu.add(this.jLabelArchivoImportacionTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoAreaEmpresaProdu = new JFileChooser();		
		this.jFileChooserImportacionTipoAreaEmpresaProdu.setToolTipText("ESCOGER ARCHIVO"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonAbrirImportacionTipoAreaEmpresaProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoAreaEmpresaProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoAreaEmpresaProdu.setToolTipText("Generar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAreaEmpresaProdu.add(this.jButtonAbrirImportacionTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoAreaEmpresaProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoAreaEmpresaProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoAreaEmpresaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoAreaEmpresaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoAreaEmpresaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoAreaEmpresaProdu.add(this.jLabelPathArchivoImportacionTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoAreaEmpresaProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoAreaEmpresaProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoAreaEmpresaProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoAreaEmpresaProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAreaEmpresaProdu.add(this.jTextFieldPathArchivoImportacionTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonGenerarImportacionTipoAreaEmpresaProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoAreaEmpresaProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoAreaEmpresaProdu.setToolTipText("Generar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAreaEmpresaProdu.add(this.jButtonGenerarImportacionTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoAreaEmpresaProdu = new JButtonMe();
		this.jButtonCerrarImportacionTipoAreaEmpresaProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoAreaEmpresaProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoAreaEmpresaProdu.setToolTipText("Cancelar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoAreaEmpresaProdu.add(this.jButtonCerrarImportacionTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoAreaEmpresaProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoAreaEmpresaProdu= new JScrollPane(jPanelImportacionTipoAreaEmpresaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoAreaEmpresaProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoAreaEmpresaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoAreaEmpresaProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoAreaEmpresaProdu);
		this.jInternalFrameImportacionTipoAreaEmpresaProdu.getContentPane().add(this.jScrollPanelImportacionTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoAreaEmpresaProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoAreaEmpresaProdu = new JButtonMe();
			this.jButtonAbrirOrderByTipoAreaEmpresaProdu.setText("Orden");
			this.jButtonAbrirOrderByTipoAreaEmpresaProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoAreaEmpresaProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoAreaEmpresaProdu";
			inputMap = this.jButtonAbrirOrderByTipoAreaEmpresaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoAreaEmpresaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoAreaEmpresaProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoAreaEmpresaProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoAreaEmpresaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoAreaEmpresaProdu.setName("jPanelOrderByTipoAreaEmpresaProdu"); 
			
			this.jPanelOrderByTipoAreaEmpresaProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoAreaEmpresaProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoAreaEmpresaProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoAreaEmpresaProdu.setLayout(gridaBagLayoutOrderByTipoAreaEmpresaProdu);
			
			
			this.jTableDatosTipoAreaEmpresaProduOrderBy = new JTableMe();        
			this.jTableDatosTipoAreaEmpresaProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoAreaEmpresaProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoAreaEmpresaProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoAreaEmpresaProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoAreaEmpresaProduOrderBy.setViewportView(this.jTableDatosTipoAreaEmpresaProduOrderBy);
			this.jTableDatosTipoAreaEmpresaProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoAreaEmpresaProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoAreaEmpresaProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoAreaEmpresaProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoAreaEmpresaProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoAreaEmpresaProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.setTitle("Orden");
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.setResizable(true);
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.setClosable(true);
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoAreaEmpresaProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoAreaEmpresaProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoAreaEmpresaProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoAreaEmpresaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Area Empresas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoAreaEmpresaProdu.ipady =150;
				
			this.jPanelOrderByTipoAreaEmpresaProdu.add(jScrollPanelDatosTipoAreaEmpresaProduOrderBy, this.gridBagConstraintsTipoAreaEmpresaProdu);//this.jTableDatosTipoAreaEmpresaProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoAreaEmpresaProdu = new JButtonMe();
			this.jButtonCerrarOrderByTipoAreaEmpresaProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoAreaEmpresaProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoAreaEmpresaProdu.setToolTipText("Cancelar"+" "+TipoAreaEmpresaProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoAreaEmpresaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoAreaEmpresaProdu.add(this.jButtonCerrarOrderByTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoAreaEmpresaProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoAreaEmpresaProdu= new JScrollPane(jPanelOrderByTipoAreaEmpresaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoAreaEmpresaProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoAreaEmpresaProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoAreaEmpresaProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoAreaEmpresaProdu);
			
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.getContentPane().add(this.jScrollPanelOrderByTipoAreaEmpresaProdu, this.gridBagConstraintsTipoAreaEmpresaProdu);			
		
		} else {
			this.jButtonAbrirOrderByTipoAreaEmpresaProdu = new JButtonMe();
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
			&& this.tipoareaempresaproduSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoAreaEmpresaProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoAreaEmpresaProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoAreaEmpresaProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoAreaEmpresaProdu.getRowHeight();//TipoAreaEmpresaProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoAreaEmpresaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoAreaEmpresaProdu.isSelected()) {
					iHeightTable=TipoAreaEmpresaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoAreaEmpresaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoAreaEmpresaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoAreaEmpresaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoAreaEmpresaProdu.isSelected()) {
					iHeightTable=TipoAreaEmpresaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoAreaEmpresaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoAreaEmpresaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoAreaEmpresaProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoAreaEmpresaProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoAreaEmpresaProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoAreaEmpresaProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoAreaEmpresaProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoAreaEmpresaProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoAreaEmpresaProdu!=null && this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoareaempresaproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoAreaEmpresaProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoAreaEmpresaProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoAreaEmpresaProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoAreaEmpresaProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoareaempresaproduLogic.getTipoAreaEmpresaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoareaempresaprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoAreaEmpresaProdu> TraerTipoAreaEmpresaProduBeans(List<TipoAreaEmpresaProdu> tipoareaempresaprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoAreaEmpresaProdu tipoareaempresaprodu:tipoareaempresaprodus) {
					
				if(!(TipoAreaEmpresaProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoAreaEmpresaProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoareaempresaprodu.setsDetalleGeneralEntityReporte(TipoAreaEmpresaProduConstantesFunciones.getTipoAreaEmpresaProduDescripcion(tipoareaempresaprodu));
										
						
					
					

					if(tipoareaempresaprodu.getProductoOrdenDetaProduMaquinas()!=null && Funciones.existeClass(classes,ProductoOrdenDetaProduMaquina.class)) {
						try{tipoareaempresaprodu.setproductoordendetaprodumaquinasDescripcionReporte(new JRBeanCollectionDataSource(ProductoOrdenDetaProduMaquinaJInternalFrame.TraerProductoOrdenDetaProduMaquinaBeans(tipoareaempresaprodu.getProductoOrdenDetaProduMaquinas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoareaempresaprodu.getProductoProduMaquinas()!=null && Funciones.existeClass(classes,ProductoProduMaquina.class)) {
						try{tipoareaempresaprodu.setproductoprodumaquinasDescripcionReporte(new JRBeanCollectionDataSource(ProductoProduMaquinaJInternalFrame.TraerProductoProduMaquinaBeans(tipoareaempresaprodu.getProductoProduMaquinas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoareaempresaprodu.setsDetalleGeneralEntityReporte(tipoareaempresaprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoareaempresaprodubeans.add(tipoareaempresaprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoareaempresaprodus;
    }
	//PARA REPORTES FIN
}
