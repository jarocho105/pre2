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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.TipoCostoGastoImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class TipoCostoGastoImporJInternalFrame extends TipoCostoGastoImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCostoGastoImpor;
	
	protected JMenuBar jmenuBarTipoCostoGastoImpor;
	
	protected JMenu jmenuTipoCostoGastoImpor;
	protected JMenu jmenuDatosTipoCostoGastoImpor;
	protected JMenu jmenuArchivoTipoCostoGastoImpor;
	protected JMenu jmenuAccionesTipoCostoGastoImpor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCostoGastoImpor;	
	protected GridBagConstraints gridBagConstraintsTipoCostoGastoImpor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCostoGastoImporDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCostoGastoImpor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCostoGastoImpor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCostoGastoImpor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCostoGastoImporSessionBean tipocostogastoimporSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCostoGastoImpor> tipocostogastoimpors;		
	public List<TipoCostoGastoImpor> tipocostogastoimporsEliminados;	
	public List<TipoCostoGastoImpor> tipocostogastoimporsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCostoGastoImpor;		
	protected JButton jButtonAbrirOrderByTipoCostoGastoImpor;
	
	
	//protected JPanel jPanelOrderByTipoCostoGastoImpor;
	//public JScrollPane jScrollPanelOrderByTipoCostoGastoImpor;	
	//protected JButton jButtonCerrarOrderByTipoCostoGastoImpor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCostoGastoImporLogic tipocostogastoimporLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCostoGastoImpor;
	public JScrollPane jScrollPanelDatosEdicionTipoCostoGastoImpor;
	public JScrollPane jScrollPanelDatosGeneralTipoCostoGastoImpor;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCostoGastoImporOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCostoGastoImpor;
	//public JScrollPane jScrollPanelImportacionTipoCostoGastoImpor;
	
	
	
	protected JPanel jPanelAccionesTipoCostoGastoImpor;
	
    protected JPanel jPanelPaginacionTipoCostoGastoImpor;
    protected JPanel jPanelParametrosReportesTipoCostoGastoImpor;
	protected JPanel jPanelParametrosReportesAccionesTipoCostoGastoImpor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCostoGastoImpor;
	protected JPanel jPanelParametrosAuxiliar2TipoCostoGastoImpor;
	protected JPanel jPanelParametrosAuxiliar3TipoCostoGastoImpor;
	protected JPanel jPanelParametrosAuxiliar4TipoCostoGastoImpor;
	//protected JPanel jPanelParametrosAuxiliar5TipoCostoGastoImpor;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCostoGastoImpor;
	//protected JPanel jPanelImportacionTipoCostoGastoImpor;
	
	
	public JTable jTableDatosTipoCostoGastoImpor;
	
	
	
	//public JTable jTableDatosTipoCostoGastoImporOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCostoGastoImpor;
	protected JButton jButtonDuplicarTipoCostoGastoImpor;
	protected JButton jButtonCopiarTipoCostoGastoImpor;
	protected JButton jButtonVerFormTipoCostoGastoImpor;
	protected JButton jButtonNuevoRelacionesTipoCostoGastoImpor;
	protected JButton jButtonModificarTipoCostoGastoImpor;
	
    protected JButton jButtonGuardarCambiosTablaTipoCostoGastoImpor;
	protected JButton jButtonCerrarTipoCostoGastoImpor;
	
	
	protected JButton jButtonRecargarInformacionTipoCostoGastoImpor;
	protected JButton jButtonProcesarInformacionTipoCostoGastoImpor;
	
	
	protected JButton jButtonAnterioresTipoCostoGastoImpor;
	protected JButton jButtonSiguientesTipoCostoGastoImpor;
	protected JButton jButtonNuevoGuardarCambiosTipoCostoGastoImpor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCostoGastoImpor;
	//protected JButton jButtonCerrarReporteDinamicoTipoCostoGastoImpor;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCostoGastoImpor;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCostoGastoImpor;
	//protected JButton jButtonGenerarImportacionTipoCostoGastoImpor;
	//protected JButton jButtonCerrarImportacionTipoCostoGastoImpor;
	//protected JFileChooser jFileChooserImportacionTipoCostoGastoImpor;
	//protected File fileImportacionTipoCostoGastoImpor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCostoGastoImpor;
	protected JButton jButtonDuplicarToolBarTipoCostoGastoImpor;
	protected JButton jButtonNuevoRelacionesToolBarTipoCostoGastoImpor;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCostoGastoImpor;
	protected JButton jButtonCopiarToolBarTipoCostoGastoImpor;
	protected JButton jButtonVerFormToolBarTipoCostoGastoImpor;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCostoGastoImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCostoGastoImpor;
	protected JButton jButtonCerrarToolBarTipoCostoGastoImpor;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCostoGastoImpor;
	protected JButton jButtonProcesarInformacionToolBarTipoCostoGastoImpor;
	protected JButton jButtonAnterioresToolBarTipoCostoGastoImpor;
	protected JButton jButtonSiguientesToolBarTipoCostoGastoImpor;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCostoGastoImpor;
	protected JButton jButtonAbrirOrderByToolBarTipoCostoGastoImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCostoGastoImpor;
	protected JMenuItem jMenuItemDuplicarTipoCostoGastoImpor;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCostoGastoImpor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCostoGastoImpor;
	protected JMenuItem jMenuItemCopiarTipoCostoGastoImpor;
	protected JMenuItem jMenuItemVerFormTipoCostoGastoImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCostoGastoImpor;
	protected JMenuItem jMenuItemCerrarTipoCostoGastoImpor;
	protected JMenuItem jMenuItemDetalleCerrarTipoCostoGastoImpor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCostoGastoImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCostoGastoImpor;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCostoGastoImpor;
	protected JMenuItem jMenuItemProcesarInformacionTipoCostoGastoImpor;
	protected JMenuItem jMenuItemAnterioresTipoCostoGastoImpor;
	protected JMenuItem jMenuItemSiguientesTipoCostoGastoImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCostoGastoImpor;
	protected JMenuItem jMenuItemAbrirOrderByTipoCostoGastoImpor;
	protected JMenuItem jMenuItemMostrarOcultarTipoCostoGastoImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCostoGastoImpor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCostoGastoImpor;
	protected JCheckBox jCheckBoxSeleccionadosTipoCostoGastoImpor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCostoGastoImpor;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCostoGastoImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCostoGastoImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCostoGastoImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCostoGastoImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCostoGastoImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCostoGastoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCostoGastoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCostoGastoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCostoGastoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCostoGastoImpor;
	protected JTextField jTextFieldValorCampoGeneralTipoCostoGastoImpor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCostoGastoImpor;
	//public JList<Reporte> jListColumnasSelectReporteTipoCostoGastoImpor;
	//public JScrollPane jScrollColumnasSelectReporteTipoCostoGastoImpor;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCostoGastoImpor;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCostoGastoImpor;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCostoGastoImpor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCostoGastoImpor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCostoGastoImpor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCostoGastoImpor;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCostoGastoImpor;
	
		
	//public JLabel jLabelArchivoImportacionTipoCostoGastoImpor;	
	//public JLabel jLabelPathArchivoImportacionTipoCostoGastoImpor;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCostoGastoImpor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCostoGastoImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCostoGastoImpor;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCostoGastoImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCostoGastoImpor;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCostoGastoImpor;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCostoGastoImpor;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCostoGastoImpor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCostoGastoImpor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCostoGastoImpor;	
	
	
	
	
	
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
	public TipoCostoGastoImporJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoGastoImporJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoGastoImporJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoGastoImporJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCostoGastoImpor)	{
		this.jButtonRecargarInformacionTipoCostoGastoImpor = jButtonRecargarInformacionTipoCostoGastoImpor;
	}
	
	public JButton getjButtonProcesarInformacionTipoCostoGastoImpor() {
		return this.jButtonProcesarInformacionTipoCostoGastoImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCostoGastoImpor)	{
		this.jButtonProcesarInformacionTipoCostoGastoImpor = jButtonProcesarInformacionTipoCostoGastoImpor;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCostoGastoImpor() {
		return this.jButtonRecargarInformacionTipoCostoGastoImpor;
	}
	
	
	public List<TipoCostoGastoImpor> gettipocostogastoimpors() {
		return this.tipocostogastoimpors;
	}

	public void settipocostogastoimpors(List<TipoCostoGastoImpor> tipocostogastoimpors) {
		this.tipocostogastoimpors = tipocostogastoimpors;
	}
	
	public List<TipoCostoGastoImpor> gettipocostogastoimporsAux() {
		return this.tipocostogastoimporsAux;
	}

	public void settipocostogastoimporsAux(List<TipoCostoGastoImpor> tipocostogastoimporsAux) {
		this.tipocostogastoimporsAux = tipocostogastoimporsAux;
	}
	
	public List<TipoCostoGastoImpor> gettipocostogastoimporsEliminados() {
		return this.tipocostogastoimporsEliminados;
	}

	public void setTipoCostoGastoImporsEliminados(List<TipoCostoGastoImpor> tipocostogastoimporsEliminados) {
		this.tipocostogastoimporsEliminados = tipocostogastoimporsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCostoGastoImpor() {
		return jComboBoxTiposSeleccionarTipoCostoGastoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCostoGastoImpor(
			JComboBox jComboBoxTiposSeleccionarTipoCostoGastoImpor) {
		this.jComboBoxTiposSeleccionarTipoCostoGastoImpor = jComboBoxTiposSeleccionarTipoCostoGastoImpor;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCostoGastoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCostoGastoImpor() {
		return jTextFieldValorCampoGeneralTipoCostoGastoImpor;
	}

	public void setjTextFieldValorCampoGeneralTipoCostoGastoImpor(
			JTextField jTextFieldValorCampoGeneralTipoCostoGastoImpor) {
		this.jTextFieldValorCampoGeneralTipoCostoGastoImpor = jTextFieldValorCampoGeneralTipoCostoGastoImpor;
	}

	public void setBorderResaltarValorCampoGeneralTipoCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoGastoImpor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCostoGastoImpor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCostoGastoImpor() {
		return this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor;
	}

	public void setjCheckBoxSeleccionarTodosTipoCostoGastoImpor(
			JCheckBox jCheckBoxSeleccionarTodosTipoCostoGastoImpor) {
		this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor = jCheckBoxSeleccionarTodosTipoCostoGastoImpor;
	}

	public void setBorderResaltarSeleccionarTodosTipoCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoGastoImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCostoGastoImpor() {
		return this.jCheckBoxSeleccionadosTipoCostoGastoImpor;
	}

	public void setjCheckBoxSeleccionadosTipoCostoGastoImpor(
			JCheckBox jCheckBoxSeleccionadosTipoCostoGastoImpor) {
		this.jCheckBoxSeleccionadosTipoCostoGastoImpor = jCheckBoxSeleccionadosTipoCostoGastoImpor;
	}
	
	public void setBorderResaltarSeleccionadosTipoCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoGastoImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCostoGastoImpor() {
		return this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCostoGastoImpor(
			JComboBox jComboBoxTiposArchivosReportesTipoCostoGastoImpor) {
		this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor = jComboBoxTiposArchivosReportesTipoCostoGastoImpor;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoGastoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCostoGastoImpor() {
		return this.jComboBoxTiposReportesTipoCostoGastoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCostoGastoImpor(
			JComboBox jComboBoxTiposReportesTipoCostoGastoImpor) {
		this.jComboBoxTiposReportesTipoCostoGastoImpor = jComboBoxTiposReportesTipoCostoGastoImpor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCostoGastoImpor() {
	//	return jComboBoxTiposReportesDinamicoTipoCostoGastoImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCostoGastoImpor(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCostoGastoImpor) {
	//	this.jComboBoxTiposReportesDinamicoTipoCostoGastoImpor = jComboBoxTiposReportesDinamicoTipoCostoGastoImpor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCostoGastoImpor() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCostoGastoImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCostoGastoImpor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCostoGastoImpor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCostoGastoImpor = jComboBoxTiposArchivosReportesDinamicoTipoCostoGastoImpor;
	//}
	
	public void setBorderResaltarTiposReportesTipoCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoGastoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCostoGastoImpor() {
		return this.jComboBoxTiposGraficosReportesTipoCostoGastoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCostoGastoImpor(
			JComboBox jComboBoxTiposGraficosReportesTipoCostoGastoImpor) {
		this.jComboBoxTiposGraficosReportesTipoCostoGastoImpor = jComboBoxTiposGraficosReportesTipoCostoGastoImpor;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoGastoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCostoGastoImpor() {
		return this.jComboBoxTiposPaginacionTipoCostoGastoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCostoGastoImpor(
			JComboBox jComboBoxTiposPaginacionTipoCostoGastoImpor) {
		this.jComboBoxTiposPaginacionTipoCostoGastoImpor = jComboBoxTiposPaginacionTipoCostoGastoImpor;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoGastoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCostoGastoImpor() {
		return this.jComboBoxTiposRelacionesTipoCostoGastoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCostoGastoImpor() {
		return this.jComboBoxTiposAccionesTipoCostoGastoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCostoGastoImpor(
			JComboBox jComboBoxTiposRelacionesTipoCostoGastoImpor) {
		this.jComboBoxTiposRelacionesTipoCostoGastoImpor = jComboBoxTiposRelacionesTipoCostoGastoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCostoGastoImpor(
			JComboBox jComboBoxTiposAccionesTipoCostoGastoImpor) {
		this.jComboBoxTiposAccionesTipoCostoGastoImpor = jComboBoxTiposAccionesTipoCostoGastoImpor;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoGastoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCostoGastoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCostoGastoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCostoGastoImpor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCostoGastoImpor() {
	//	return jCheckBoxConGraficoDinamicoTipoCostoGastoImpor;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCostoGastoImpor(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCostoGastoImpor) {
	//	this.jCheckBoxConGraficoDinamicoTipoCostoGastoImpor = jCheckBoxConGraficoDinamicoTipoCostoGastoImpor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCostoGastoImpor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCostoGastoImpor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCostoGastoImpor .setBorder(borderResaltar);		
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
		this.tipocostogastoimporSessionBean=new TipoCostoGastoImporSessionBean();
		
		this.tipocostogastoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocostogastoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocostogastoimporSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCostoGastoImporJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCostoGastoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCostoGastoImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCostoGastoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCostoGastoImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Costo Gasto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCostoGastoImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCostoGastoImpor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCostoGastoImpor,this.jTtoolBarTipoCostoGastoImpor,
							"nuevo","nuevo","Nuevo"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCostoGastoImpor,this.jTtoolBarTipoCostoGastoImpor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCostoGastoImpor,this.jTtoolBarTipoCostoGastoImpor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCostoGastoImpor,this.jTtoolBarTipoCostoGastoImpor,
							"duplicar","duplicar","Duplicar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCostoGastoImpor,this.jTtoolBarTipoCostoGastoImpor,
							"copiar","copiar","Copiar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCostoGastoImpor,this.jTtoolBarTipoCostoGastoImpor,
							"ver_form","ver_form","Ver"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCostoGastoImpor,this.jTtoolBarTipoCostoGastoImpor,
							"recargar","recargar","Recargar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCostoGastoImpor,this.jTtoolBarTipoCostoGastoImpor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCostoGastoImpor,this.jTtoolBarTipoCostoGastoImpor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCostoGastoImpor,this.jTtoolBarTipoCostoGastoImpor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCostoGastoImpor,this.jTtoolBarTipoCostoGastoImpor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCostoGastoImpor,this.jTtoolBarTipoCostoGastoImpor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCostoGastoImpor,this.jTtoolBarTipoCostoGastoImpor,
							"cerrar","cerrar","Salir"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCostoGastoImpor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCostoGastoImpor;
			
				this.jButtonProcesarInformacionToolBarTipoCostoGastoImpor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCostoGastoImpor;
				
		//protected JButton jButtonModificarToolBarTipoCostoGastoImpor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCostoGastoImpor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCostoGastoImpor=new JMenuMe("General");
		this.jmenuArchivoTipoCostoGastoImpor=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCostoGastoImpor=new JMenuMe("Acciones");
		this.jmenuDatosTipoCostoGastoImpor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCostoGastoImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCostoGastoImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCostoGastoImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCostoGastoImpor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCostoGastoImpor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCostoGastoImpor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCostoGastoImpor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCostoGastoImpor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCostoGastoImpor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCostoGastoImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCostoGastoImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCostoGastoImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCostoGastoImpor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCostoGastoImpor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCostoGastoImpor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCostoGastoImpor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCostoGastoImpor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCostoGastoImpor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCostoGastoImpor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCostoGastoImpor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCostoGastoImpor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCostoGastoImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCostoGastoImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCostoGastoImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCostoGastoImpor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCostoGastoImpor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCostoGastoImpor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCostoGastoImpor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCostoGastoImpor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCostoGastoImpor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCostoGastoImpor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCostoGastoImpor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCostoGastoImpor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCostoGastoImpor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCostoGastoImpor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCostoGastoImpor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCostoGastoImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCostoGastoImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCostoGastoImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCostoGastoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCostoGastoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCostoGastoImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCostoGastoImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCostoGastoImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCostoGastoImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCostoGastoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCostoGastoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCostoGastoImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCostoGastoImpor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCostoGastoImpor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCostoGastoImpor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCostoGastoImpor.add(this.jMenuItemCerrarTipoCostoGastoImpor);
			
			this.jmenuAccionesTipoCostoGastoImpor.add(this.jMenuItemNuevoTipoCostoGastoImpor);
			this.jmenuAccionesTipoCostoGastoImpor.add(this.jMenuItemNuevoGuardarCambiosTipoCostoGastoImpor);
			this.jmenuAccionesTipoCostoGastoImpor.add(this.jMenuItemNuevoRelacionesTipoCostoGastoImpor);
			this.jmenuAccionesTipoCostoGastoImpor.add(this.jMenuItemGuardarCambiosTablaTipoCostoGastoImpor);		
			this.jmenuAccionesTipoCostoGastoImpor.add(this.jMenuItemDuplicarTipoCostoGastoImpor);		
			this.jmenuAccionesTipoCostoGastoImpor.add(this.jMenuItemCopiarTipoCostoGastoImpor);		
			this.jmenuAccionesTipoCostoGastoImpor.add(this.jMenuItemVerFormTipoCostoGastoImpor);		
			
			this.jmenuDatosTipoCostoGastoImpor.add(this.jMenuItemRecargarInformacionTipoCostoGastoImpor);				
			this.jmenuDatosTipoCostoGastoImpor.add(this.jMenuItemAnterioresTipoCostoGastoImpor);				
			this.jmenuDatosTipoCostoGastoImpor.add(this.jMenuItemSiguientesTipoCostoGastoImpor);				
			this.jmenuDatosTipoCostoGastoImpor.add(this.jMenuItemAbrirOrderByTipoCostoGastoImpor);				
			this.jmenuDatosTipoCostoGastoImpor.add(this.jMenuItemMostrarOcultarTipoCostoGastoImpor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCostoGastoImpor.add(this.jMenuItemGuardarCambiosTipoCostoGastoImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCostoGastoImpor.add(this.jmenuArchivoTipoCostoGastoImpor);		
			this.jmenuBarTipoCostoGastoImpor.add(this.jmenuAccionesTipoCostoGastoImpor);		
			this.jmenuBarTipoCostoGastoImpor.add(this.jmenuDatosTipoCostoGastoImpor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCostoGastoImpor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCostoGastoImpor() {
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
			//this.jInternalFrameDetalleTipoCostoGastoImpor = new TipoCostoGastoImporDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Costo Gasto DATOS");
			this.jInternalFrameDetalleFormTipoCostoGastoImpor = new TipoCostoGastoImporDetalleFormJInternalFrame(jDesktopPane,this.tipocostogastoimporSessionBean.getConGuardarRelaciones(),this.tipocostogastoimporSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor = null;//new TipoCostoGastoImporDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCostoGastoImpor= new GridBagLayout();
		
		
		this.jTableDatosTipoCostoGastoImpor = new JTableMe();      
		
		String sToolTipTipoCostoGastoImpor="";
		sToolTipTipoCostoGastoImpor=TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCostoGastoImpor+="(Importaciones.TipoCostoGastoImpor)";
		}
		
		if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCostoGastoImpor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCostoGastoImpor.setToolTipText(sToolTipTipoCostoGastoImpor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCostoGastoImpor);
		this.jTableDatosTipoCostoGastoImpor.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCostoGastoImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCostoGastoImpor.setRowSelectionAllowed(true);
		this.jTableDatosTipoCostoGastoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCostoGastoImpor = new JButtonMe();
		this.jButtonDuplicarTipoCostoGastoImpor = new JButtonMe();
		this.jButtonCopiarTipoCostoGastoImpor = new JButtonMe();
		this.jButtonVerFormTipoCostoGastoImpor = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCostoGastoImpor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCostoGastoImpor = new JButtonMe();
		this.jButtonCerrarTipoCostoGastoImpor = new JButtonMe();
		
		this.jScrollPanelDatosTipoCostoGastoImpor = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCostoGastoImpor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Costo Gasto";
		
		if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costo Gastos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCostoGastoImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCostoGastoImpor.setToolTipText("Acciones");
        this.jPanelAccionesTipoCostoGastoImpor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCostoGastoImpor=new ReporteDinamicoJInternalFrame(TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCostoGastoImpor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCostoGastoImpor=new ImportacionJInternalFrame(TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCostoGastoImpor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCostoGastoImpor = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCostoGastoImpor.setText("Orden");
		this.jButtonAbrirOrderByTipoCostoGastoImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCostoGastoImpor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCostoGastoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCostoGastoImpor,false,this);
			
			//this.cargarOrderByTipoCostoGastoImpor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCostoGastoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCostoGastoImpor,true,this);
			
			//this.cargarOrderByTipoCostoGastoImpor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCostoGastoImpor.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCostoGastoImpor.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCostoGastoImpor.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoCostoGastoImpor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCostoGastoImpor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCostoGastoImpor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCostoGastoImpor.setText("Nuevo");
		this.jButtonDuplicarTipoCostoGastoImpor.setText("Duplicar");
		this.jButtonCopiarTipoCostoGastoImpor.setText("Copiar");
		this.jButtonVerFormTipoCostoGastoImpor.setText("Ver");
		this.jButtonNuevoRelacionesTipoCostoGastoImpor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCostoGastoImpor.setText("Guardar");
		this.jButtonCerrarTipoCostoGastoImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCostoGastoImpor,"nuevo_button","Nuevo",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCostoGastoImpor,"duplicar_button","Duplicar",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCostoGastoImpor,"copiar_button","Copiar",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCostoGastoImpor,"ver_form","Ver",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCostoGastoImpor,"nuevorelaciones_button","Nuevo Rel",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCostoGastoImpor,"guardarcambiostabla_button","Guardar",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCostoGastoImpor,"cerrar_button","Salir",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCostoGastoImpor.setToolTipText("Nuevo"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCostoGastoImpor.setToolTipText("Duplicar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCostoGastoImpor.setToolTipText("Copiar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCostoGastoImpor.setToolTipText("Ver"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCostoGastoImpor.setToolTipText("Nuevo Rel"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCostoGastoImpor.setToolTipText("Guardar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCostoGastoImpor.setToolTipText("Salir"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCostoGastoImpor";
		inputMap = this.jButtonNuevoTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCostoGastoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCostoGastoImpor"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCostoGastoImpor";
		inputMap = this.jButtonDuplicarTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCostoGastoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCostoGastoImpor"));
		
		//COPIAR
		sMapKey = "CopiarTipoCostoGastoImpor";
		inputMap = this.jButtonCopiarTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCostoGastoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCostoGastoImpor"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCostoGastoImpor";
		inputMap = this.jButtonVerFormTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCostoGastoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCostoGastoImpor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCostoGastoImpor";
		inputMap = this.jButtonNuevoRelacionesTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCostoGastoImpor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCostoGastoImpor";
		inputMap = this.jButtonModificarTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCostoGastoImpor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCostoGastoImpor";
		inputMap = this.jButtonCerrarTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCostoGastoImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCostoGastoImpor";
		inputMap = this.jButtonGuardarCambiosTablaTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCostoGastoImpor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCostoGastoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCostoGastoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCostoGastoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCostoGastoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCostoGastoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCostoGastoImpor.setName("jPanelParametrosReportesTipoCostoGastoImpor"); 
		
		this.jPanelParametrosReportesAccionesTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCostoGastoImpor.setName("jPanelParametrosReportesAccionesTipoCostoGastoImpor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCostoGastoImpor = new JButtonMe();
		this.jButtonRecargarInformacionTipoCostoGastoImpor.setText("Recargar");
		this.jButtonRecargarInformacionTipoCostoGastoImpor.setToolTipText("Recargar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCostoGastoImpor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCostoGastoImpor = new JButtonMe();
		this.jButtonProcesarInformacionTipoCostoGastoImpor.setText("Procesar");
		this.jButtonProcesarInformacionTipoCostoGastoImpor.setToolTipText("Procesar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCostoGastoImpor.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCostoGastoImpor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCostoGastoImpor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCostoGastoImpor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCostoGastoImpor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCostoGastoImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCostoGastoImpor.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCostoGastoImpor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCostoGastoImpor.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCostoGastoImpor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCostoGastoImpor.setText("Accion");
		this.jComboBoxTiposAccionesTipoCostoGastoImpor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCostoGastoImpor.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCostoGastoImpor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCostoGastoImpor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCostoGastoImpor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCostoGastoImpor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCostoGastoImpor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCostoGastoImpor = new JLabelMe();
		
		this.jLabelAccionesTipoCostoGastoImpor.setText("Acciones");		
		this.jLabelAccionesTipoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCostoGastoImpor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCostoGastoImpor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCostoGastoImpor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCostoGastoImpor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCostoGastoImpor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCostoGastoImpor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCostoGastoImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCostoGastoImpor.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCostoGastoImpor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCostoGastoImpor = new JButtonMe();
		//this.jButtonAnterioresTipoCostoGastoImpor.setText("<<");
        this.jButtonAnterioresTipoCostoGastoImpor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCostoGastoImpor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCostoGastoImpor = new JButtonMe();
		//this.jButtonSiguientesTipoCostoGastoImpor.setText(">>");
        this.jButtonSiguientesTipoCostoGastoImpor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCostoGastoImpor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCostoGastoImpor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCostoGastoImpor.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCostoGastoImpor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCostoGastoImpor,"nuevoguardarcambios_button","Nue",this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCostoGastoImpor";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCostoGastoImpor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCostoGastoImpor";
		inputMap = this.jButtonRecargarInformacionTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCostoGastoImpor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCostoGastoImpor";
		inputMap = this.jButtonSiguientesTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCostoGastoImpor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCostoGastoImpor";
		inputMap = this.jButtonAnterioresTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCostoGastoImpor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCostoGastoImpor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCostoGastoImpor.setMinimumSize(new Dimension(this.getWidth(),TipoCostoGastoImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCostoGastoImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCostoGastoImpor.setMaximumSize(new Dimension(this.getWidth(),TipoCostoGastoImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCostoGastoImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCostoGastoImpor.setPreferredSize(new Dimension(this.getWidth(),TipoCostoGastoImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCostoGastoImporBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCostoGastoImpor = new GridBagLayout();

			this.jPanelPaginacionTipoCostoGastoImpor.setLayout(gridaBagLayoutPaginacionTipoCostoGastoImpor);						
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCostoGastoImpor.add(this.jButtonAnterioresTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
					
						
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;
			
			this.jPanelPaginacionTipoCostoGastoImpor.add(this.jButtonNuevoGuardarCambiosTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
						
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;
			this.jPanelPaginacionTipoCostoGastoImpor.add(this.jButtonSiguientesTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = 1;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCostoGastoImpor.add(this.jButtonNuevoTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
						
			
			
			if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
				this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCostoGastoImpor.gridy = 1;
				this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCostoGastoImpor.add(this.jButtonGuardarCambiosTablaTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
			}
			
			
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = 1;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCostoGastoImpor.add(this.jButtonDuplicarTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = 1;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCostoGastoImpor.add(this.jButtonCopiarTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = 1;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCostoGastoImpor.add(this.jButtonVerFormTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = 1;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCostoGastoImpor.add(this.jButtonCerrarTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		
		
		
		this.jButtonRecargarInformacionTipoCostoGastoImpor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCostoGastoImpor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCostoGastoImpor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCostoGastoImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCostoGastoImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCostoGastoImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCostoGastoImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCostoGastoImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCostoGastoImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCostoGastoImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCostoGastoImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCostoGastoImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCostoGastoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCostoGastoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCostoGastoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCostoGastoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCostoGastoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCostoGastoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCostoGastoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCostoGastoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCostoGastoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCostoGastoImpor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCostoGastoImpor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCostoGastoImpor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCostoGastoImpor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCostoGastoImpor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCostoGastoImpor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCostoGastoImpor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCostoGastoImpor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCostoGastoImpor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCostoGastoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCostoGastoImpor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCostoGastoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCostoGastoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCostoGastoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCostoGastoImpor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCostoGastoImpor.setLayout(gridaBagParametrosReportesTipoCostoGastoImpor);
			this.jPanelParametrosReportesAccionesTipoCostoGastoImpor.setLayout(gridaBagParametrosReportesAccionesTipoCostoGastoImpor);
			
			
			this.jPanelParametrosAuxiliar1TipoCostoGastoImpor.setLayout(gridaBagParametrosAuxiliar1TipoCostoGastoImpor);
			this.jPanelParametrosAuxiliar2TipoCostoGastoImpor.setLayout(gridaBagParametrosAuxiliar2TipoCostoGastoImpor);
			this.jPanelParametrosAuxiliar3TipoCostoGastoImpor.setLayout(gridaBagParametrosAuxiliar3TipoCostoGastoImpor);
			this.jPanelParametrosAuxiliar4TipoCostoGastoImpor.setLayout(gridaBagParametrosAuxiliar4TipoCostoGastoImpor);
			//this.jPanelParametrosAuxiliar5TipoCostoGastoImpor.setLayout(gridaBagParametrosAuxiliar2TipoCostoGastoImpor);			
			
			
			
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCostoGastoImpor.add(this.jButtonRecargarInformacionTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCostoGastoImpor.add(this.jComboBoxTiposPaginacionTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCostoGastoImpor.add(this.jCheckBoxConAltoMaximoTablaTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCostoGastoImpor.add(this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCostoGastoImpor.add(this.jPanelParametrosAuxiliar1TipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCostoGastoImpor.add(this.jComboBoxTiposReportesTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCostoGastoImpor.add(this.jPanelParametrosAuxiliar4TipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCostoGastoImpor.add(this.jComboBoxTiposReportesTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCostoGastoImpor.add(this.jCheckBoxGenerarReporteTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCostoGastoImpor.add(this.jPanelParametrosAuxiliar2TipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCostoGastoImpor.add(this.jLabelAccionesTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
				this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCostoGastoImpor.add(this.jButtonAbrirOrderByTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCostoGastoImpor.add(this.jComboBoxTiposSeleccionarTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);			
			
			
			/*
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCostoGastoImpor.add(this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCostoGastoImpor.add(this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);															
				
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCostoGastoImpor.add(this.jCheckBoxSeleccionadosTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCostoGastoImpor.add(this.jPanelParametrosAuxiliar3TipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCostoGastoImpor.add(this.jComboBoxTiposRelacionesTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
				
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCostoGastoImpor.add(this.jComboBoxTiposAccionesTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCostoGastoImpor = new GridBagLayout();

			this.jScrollPanelDatosTipoCostoGastoImpor.setLayout(gridaBagLayoutDatosTipoCostoGastoImpor);
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
			
			this.jScrollPanelDatosTipoCostoGastoImpor.add(this.jTableDatosTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCostoGastoImpor.setViewportView(this.jTableDatosTipoCostoGastoImpor);
		this.jTableDatosTipoCostoGastoImpor.setFillsViewportHeight(true);
		this.jTableDatosTipoCostoGastoImpor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCostoGastoImpor= new GridBagLayout();
		this.jPanelAccionesTipoCostoGastoImpor.setLayout(gridaBagLayoutAccionesTipoCostoGastoImpor);
		
		
		/*	
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
			
		this.jPanelAccionesTipoCostoGastoImpor.add(this.jButtonNuevoTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCostoGastoImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCostoGastoImpor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();						
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;		
			//this.gridBagConstraintsTipoCostoGastoImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCostoGastoImpor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;		
		//this.gridBagConstraintsTipoCostoGastoImpor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoGastoImpor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCostoGastoImpor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCostoGastoImpor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);								
		
		
		/*
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		*/		
		
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx =0;
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCostoGastoImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
				
		
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoCostoGastoImporJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCostoGastoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCostoGastoImpor = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCostoGastoImpor.setLayout(gridaBagLayoutBusquedasParametrosTipoCostoGastoImpor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCostoGastoImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCostoGastoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCostoGastoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCostoGastoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
			
			
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		
			
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCostoGastoImpor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCostoGastoImpor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCostoGastoImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCostoGastoImpor.setName("jPanelReporteDinamicoTipoCostoGastoImpor"); 
		
		this.jPanelReporteDinamicoTipoCostoGastoImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCostoGastoImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCostoGastoImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCostoGastoImpor.setLayout(gridaBagLayoutReporteDinamicoTipoCostoGastoImpor);
		
		
		this.jInternalFrameReporteDinamicoTipoCostoGastoImpor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCostoGastoImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCostoGastoImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCostoGastoImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCostoGastoImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCostoGastoImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costo Gastos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCostoGastoImpor = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCostoGastoImpor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCostoGastoImpor.add(this.jLabelColumnasSelectReporteTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCostoGastoImpor = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCostoGastoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCostoGastoImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCostoGastoImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCostoGastoImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCostoGastoImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCostoGastoImpor=new JScrollPane(this.jListColumnasSelectReporteTipoCostoGastoImpor);
			
			this.jScrollColumnasSelectReporteTipoCostoGastoImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCostoGastoImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCostoGastoImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCostoGastoImpor.add(this.jListColumnasSelectReporteTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		this.jPanelReporteDinamicoTipoCostoGastoImpor.add(this.jScrollColumnasSelectReporteTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCostoGastoImpor = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCostoGastoImpor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCostoGastoImpor = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCostoGastoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCostoGastoImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCostoGastoImpor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCostoGastoImpor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCostoGastoImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCostoGastoImpor=new JScrollPane(this.jListRelacionesSelectReporteTipoCostoGastoImpor);
			
			this.jScrollRelacionesSelectReporteTipoCostoGastoImpor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCostoGastoImpor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCostoGastoImpor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoCostoGastoImpor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCostoGastoImpor = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCostoGastoImpor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCostoGastoImpor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCostoGastoImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCostoGastoImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCostoGastoImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCostoGastoImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCostoGastoImpor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCostoGastoImpor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCostoGastoImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCostoGastoImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCostoGastoImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCostoGastoImpor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCostoGastoImpor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCostoGastoImpor.add(this.jLabelGenerarExcelReporteDinamicoTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCostoGastoImpor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCostoGastoImpor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCostoGastoImpor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCostoGastoImpor.setToolTipText("Generar EXCEL"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCostoGastoImpor.add(this.jButtonGenerarExcelReporteDinamicoTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCostoGastoImpor.add(this.jComboBoxTiposReportesDinamicoTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCostoGastoImpor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCostoGastoImpor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCostoGastoImpor.add(this.jLabelTiposArchivoReporteDinamicoTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCostoGastoImpor.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCostoGastoImpor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCostoGastoImpor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCostoGastoImpor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCostoGastoImpor.setToolTipText("Generar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCostoGastoImpor.add(this.jButtonGenerarReporteDinamicoTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCostoGastoImpor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCostoGastoImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCostoGastoImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCostoGastoImpor.setToolTipText("Cancelar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCostoGastoImpor.add(this.jButtonCerrarReporteDinamicoTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCostoGastoImpor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCostoGastoImpor= new JScrollPane(jPanelReporteDinamicoTipoCostoGastoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCostoGastoImpor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCostoGastoImpor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCostoGastoImpor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costo Gastos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCostoGastoImpor);
		this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCostoGastoImpor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCostoGastoImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCostoGastoImpor.setName("jPanelImportacionTipoCostoGastoImpor"); 
		
		this.jPanelImportacionTipoCostoGastoImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCostoGastoImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCostoGastoImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCostoGastoImpor.setLayout(gridaBagLayoutImportacionTipoCostoGastoImpor);
		
		
		this.jInternalFrameImportacionTipoCostoGastoImpor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCostoGastoImpor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCostoGastoImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCostoGastoImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCostoGastoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCostoGastoImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCostoGastoImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCostoGastoImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCostoGastoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCostoGastoImpor.setResizable(true);
	    this.jInternalFrameImportacionTipoCostoGastoImpor.setClosable(true);
	    this.jInternalFrameImportacionTipoCostoGastoImpor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCostoGastoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCostoGastoImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCostoGastoImpor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCostoGastoImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCostoGastoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCostoGastoImpor.setResizable(true);
	    this.jInternalFrameImportacionTipoCostoGastoImpor.setClosable(true);
	    this.jInternalFrameImportacionTipoCostoGastoImpor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCostoGastoImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCostoGastoImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCostoGastoImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costo Gastos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCostoGastoImpor = new JLabelMe();

		this.jLabelArchivoImportacionTipoCostoGastoImpor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCostoGastoImpor.add(this.jLabelArchivoImportacionTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCostoGastoImpor = new JFileChooser();		
		this.jFileChooserImportacionTipoCostoGastoImpor.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCostoGastoImpor = new JButtonMe();
		this.jButtonAbrirImportacionTipoCostoGastoImpor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCostoGastoImpor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCostoGastoImpor.setToolTipText("Generar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCostoGastoImpor.add(this.jButtonAbrirImportacionTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCostoGastoImpor = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCostoGastoImpor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCostoGastoImpor.add(this.jLabelPathArchivoImportacionTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCostoGastoImpor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCostoGastoImpor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCostoGastoImpor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCostoGastoImpor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCostoGastoImpor.add(this.jTextFieldPathArchivoImportacionTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCostoGastoImpor = new JButtonMe();
		this.jButtonGenerarImportacionTipoCostoGastoImpor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCostoGastoImpor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCostoGastoImpor.setToolTipText("Generar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCostoGastoImpor.add(this.jButtonGenerarImportacionTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCostoGastoImpor = new JButtonMe();
		this.jButtonCerrarImportacionTipoCostoGastoImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCostoGastoImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCostoGastoImpor.setToolTipText("Cancelar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCostoGastoImpor.add(this.jButtonCerrarImportacionTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCostoGastoImpor = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCostoGastoImpor= new JScrollPane(jPanelImportacionTipoCostoGastoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoCostoGastoImpor.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCostoGastoImpor.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCostoGastoImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCostoGastoImpor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCostoGastoImpor);
		this.jInternalFrameImportacionTipoCostoGastoImpor.getContentPane().add(this.jScrollPanelImportacionTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCostoGastoImpor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCostoGastoImpor = new JButtonMe();
			this.jButtonAbrirOrderByTipoCostoGastoImpor.setText("Orden");
			this.jButtonAbrirOrderByTipoCostoGastoImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCostoGastoImpor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCostoGastoImpor";
			inputMap = this.jButtonAbrirOrderByTipoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCostoGastoImpor"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCostoGastoImpor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCostoGastoImpor.setName("jPanelOrderByTipoCostoGastoImpor"); 
			
			this.jPanelOrderByTipoCostoGastoImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCostoGastoImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCostoGastoImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCostoGastoImpor.setLayout(gridaBagLayoutOrderByTipoCostoGastoImpor);
			
			
			this.jTableDatosTipoCostoGastoImporOrderBy = new JTableMe();        
			this.jTableDatosTipoCostoGastoImporOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCostoGastoImporOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCostoGastoImporOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCostoGastoImporOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCostoGastoImporOrderBy.setViewportView(this.jTableDatosTipoCostoGastoImporOrderBy);
			this.jTableDatosTipoCostoGastoImporOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCostoGastoImporOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCostoGastoImpor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCostoGastoImpor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCostoGastoImpor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCostoGastoImpor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCostoGastoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCostoGastoImpor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCostoGastoImpor.setTitle("Orden");
			this.jInternalFrameOrderByTipoCostoGastoImpor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCostoGastoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCostoGastoImpor.setResizable(true);
			this.jInternalFrameOrderByTipoCostoGastoImpor.setClosable(true);
			this.jInternalFrameOrderByTipoCostoGastoImpor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCostoGastoImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCostoGastoImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCostoGastoImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costo Gastos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCostoGastoImpor.ipady =150;
				
			this.jPanelOrderByTipoCostoGastoImpor.add(jScrollPanelDatosTipoCostoGastoImporOrderBy, this.gridBagConstraintsTipoCostoGastoImpor);//this.jTableDatosTipoCostoGastoImporTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCostoGastoImpor = new JButtonMe();
			this.jButtonCerrarOrderByTipoCostoGastoImpor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCostoGastoImpor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCostoGastoImpor.setToolTipText("Cancelar"+" "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCostoGastoImpor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCostoGastoImpor.add(this.jButtonCerrarOrderByTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCostoGastoImpor = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCostoGastoImpor= new JScrollPane(jPanelOrderByTipoCostoGastoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoCostoGastoImpor.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCostoGastoImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCostoGastoImpor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCostoGastoImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCostoGastoImpor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCostoGastoImpor);
			
			this.jInternalFrameOrderByTipoCostoGastoImpor.getContentPane().add(this.jScrollPanelOrderByTipoCostoGastoImpor, this.gridBagConstraintsTipoCostoGastoImpor);			
		
		} else {
			this.jButtonAbrirOrderByTipoCostoGastoImpor = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipocostogastoimporSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCostoGastoImpor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCostoGastoImpor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCostoGastoImpor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCostoGastoImpor.getRowHeight();//TipoCostoGastoImporConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCostoGastoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCostoGastoImpor.isSelected()) {
					iHeightTable=TipoCostoGastoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCostoGastoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCostoGastoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCostoGastoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCostoGastoImpor.isSelected()) {
					iHeightTable=TipoCostoGastoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCostoGastoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCostoGastoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCostoGastoImpor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCostoGastoImpor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCostoGastoImpor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCostoGastoImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCostoGastoImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCostoGastoImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCostoGastoImpor!=null && this.jInternalFrameOrderByTipoCostoGastoImpor.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCostoGastoImpor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCostoGastoImpor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCostoGastoImpor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCostoGastoImpor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCostoGastoImpor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCostoGastoImpor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCostoGastoImpor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCostoGastoImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCostoGastoImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCostoGastoImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocostogastoimporLogic.getTipoCostoGastoImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocostogastoimpors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCostoGastoImpor> TraerTipoCostoGastoImporBeans(List<TipoCostoGastoImpor> tipocostogastoimpors,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCostoGastoImpor tipocostogastoimpor:tipocostogastoimpors) {
					
				if(!(TipoCostoGastoImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCostoGastoImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocostogastoimpor.setsDetalleGeneralEntityReporte(TipoCostoGastoImporConstantesFunciones.getTipoCostoGastoImporDescripcion(tipocostogastoimpor));
										
						
					
						
					
				} else  {
							
					//tipocostogastoimpor.setsDetalleGeneralEntityReporte(tipocostogastoimpor.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocostogastoimporbeans.add(tipocostogastoimporbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocostogastoimpors;
    }
	//PARA REPORTES FIN
}
