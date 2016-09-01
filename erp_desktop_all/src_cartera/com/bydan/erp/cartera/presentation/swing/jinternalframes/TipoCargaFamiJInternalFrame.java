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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoCargaFamiConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoCargaFamiJInternalFrame extends TipoCargaFamiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCargaFami;
	
	protected JMenuBar jmenuBarTipoCargaFami;
	
	protected JMenu jmenuTipoCargaFami;
	protected JMenu jmenuDatosTipoCargaFami;
	protected JMenu jmenuArchivoTipoCargaFami;
	protected JMenu jmenuAccionesTipoCargaFami;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCargaFami = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCargaFami;	
	protected GridBagConstraints gridBagConstraintsTipoCargaFami;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCargaFamiDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCargaFami;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCargaFami;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCargaFami;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCargaFamiSessionBean tipocargafamiSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCargaFami> tipocargafamis;		
	public List<TipoCargaFami> tipocargafamisEliminados;	
	public List<TipoCargaFami> tipocargafamisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCargaFami;		
	protected JButton jButtonAbrirOrderByTipoCargaFami;
	
	
	//protected JPanel jPanelOrderByTipoCargaFami;
	//public JScrollPane jScrollPanelOrderByTipoCargaFami;	
	//protected JButton jButtonCerrarOrderByTipoCargaFami;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCargaFamiLogic tipocargafamiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCargaFami;
	public JScrollPane jScrollPanelDatosEdicionTipoCargaFami;
	public JScrollPane jScrollPanelDatosGeneralTipoCargaFami;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCargaFamiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCargaFami;
	//public JScrollPane jScrollPanelImportacionTipoCargaFami;
	
	
	
	protected JPanel jPanelAccionesTipoCargaFami;
	
    protected JPanel jPanelPaginacionTipoCargaFami;
    protected JPanel jPanelParametrosReportesTipoCargaFami;
	protected JPanel jPanelParametrosReportesAccionesTipoCargaFami;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCargaFami;
	protected JPanel jPanelParametrosAuxiliar2TipoCargaFami;
	protected JPanel jPanelParametrosAuxiliar3TipoCargaFami;
	protected JPanel jPanelParametrosAuxiliar4TipoCargaFami;
	//protected JPanel jPanelParametrosAuxiliar5TipoCargaFami;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCargaFami;
	//protected JPanel jPanelImportacionTipoCargaFami;
	
	
	public JTable jTableDatosTipoCargaFami;
	
	
	
	//public JTable jTableDatosTipoCargaFamiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCargaFami;
	protected JButton jButtonDuplicarTipoCargaFami;
	protected JButton jButtonCopiarTipoCargaFami;
	protected JButton jButtonVerFormTipoCargaFami;
	protected JButton jButtonNuevoRelacionesTipoCargaFami;
	protected JButton jButtonModificarTipoCargaFami;
	
    protected JButton jButtonGuardarCambiosTablaTipoCargaFami;
	protected JButton jButtonCerrarTipoCargaFami;
	
	
	protected JButton jButtonRecargarInformacionTipoCargaFami;
	protected JButton jButtonProcesarInformacionTipoCargaFami;
	
	
	protected JButton jButtonAnterioresTipoCargaFami;
	protected JButton jButtonSiguientesTipoCargaFami;
	protected JButton jButtonNuevoGuardarCambiosTipoCargaFami;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCargaFami;
	//protected JButton jButtonCerrarReporteDinamicoTipoCargaFami;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCargaFami;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCargaFami;
	//protected JButton jButtonGenerarImportacionTipoCargaFami;
	//protected JButton jButtonCerrarImportacionTipoCargaFami;
	//protected JFileChooser jFileChooserImportacionTipoCargaFami;
	//protected File fileImportacionTipoCargaFami;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCargaFami;
	protected JButton jButtonDuplicarToolBarTipoCargaFami;
	protected JButton jButtonNuevoRelacionesToolBarTipoCargaFami;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCargaFami;
	protected JButton jButtonCopiarToolBarTipoCargaFami;
	protected JButton jButtonVerFormToolBarTipoCargaFami;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCargaFami;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCargaFami;
	protected JButton jButtonCerrarToolBarTipoCargaFami;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCargaFami;
	protected JButton jButtonProcesarInformacionToolBarTipoCargaFami;
	protected JButton jButtonAnterioresToolBarTipoCargaFami;
	protected JButton jButtonSiguientesToolBarTipoCargaFami;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCargaFami;
	protected JButton jButtonAbrirOrderByToolBarTipoCargaFami;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCargaFami;
	protected JMenuItem jMenuItemDuplicarTipoCargaFami;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCargaFami;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCargaFami;
	protected JMenuItem jMenuItemCopiarTipoCargaFami;
	protected JMenuItem jMenuItemVerFormTipoCargaFami;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCargaFami;
	protected JMenuItem jMenuItemCerrarTipoCargaFami;
	protected JMenuItem jMenuItemDetalleCerrarTipoCargaFami;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCargaFami;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCargaFami;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCargaFami;
	protected JMenuItem jMenuItemProcesarInformacionTipoCargaFami;
	protected JMenuItem jMenuItemAnterioresTipoCargaFami;
	protected JMenuItem jMenuItemSiguientesTipoCargaFami;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCargaFami;
	protected JMenuItem jMenuItemAbrirOrderByTipoCargaFami;
	protected JMenuItem jMenuItemMostrarOcultarTipoCargaFami;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCargaFami;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCargaFami;
	protected JCheckBox jCheckBoxSeleccionadosTipoCargaFami;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCargaFami;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCargaFami;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCargaFami;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCargaFami;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCargaFami;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCargaFami;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCargaFami;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCargaFami;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCargaFami;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCargaFami;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCargaFami;
	protected JTextField jTextFieldValorCampoGeneralTipoCargaFami;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCargaFami;
	//public JList<Reporte> jListColumnasSelectReporteTipoCargaFami;
	//public JScrollPane jScrollColumnasSelectReporteTipoCargaFami;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCargaFami;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCargaFami;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCargaFami;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCargaFami;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCargaFami;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCargaFami;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCargaFami;
	
		
	//public JLabel jLabelArchivoImportacionTipoCargaFami;	
	//public JLabel jLabelPathArchivoImportacionTipoCargaFami;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCargaFami;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCargaFami;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCargaFami;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCargaFami;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCargaFami;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCargaFami;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCargaFami;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCargaFami;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCargaFami;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCargaFami;	
	
	
	
	
	
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
	public TipoCargaFamiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCargaFami No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCargaFamiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCargaFami No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCargaFamiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCargaFami No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCargaFamiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCargaFami No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCargaFami)	{
		this.jButtonRecargarInformacionTipoCargaFami = jButtonRecargarInformacionTipoCargaFami;
	}
	
	public JButton getjButtonProcesarInformacionTipoCargaFami() {
		return this.jButtonProcesarInformacionTipoCargaFami;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCargaFami)	{
		this.jButtonProcesarInformacionTipoCargaFami = jButtonProcesarInformacionTipoCargaFami;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCargaFami() {
		return this.jButtonRecargarInformacionTipoCargaFami;
	}
	
	
	public List<TipoCargaFami> gettipocargafamis() {
		return this.tipocargafamis;
	}

	public void settipocargafamis(List<TipoCargaFami> tipocargafamis) {
		this.tipocargafamis = tipocargafamis;
	}
	
	public List<TipoCargaFami> gettipocargafamisAux() {
		return this.tipocargafamisAux;
	}

	public void settipocargafamisAux(List<TipoCargaFami> tipocargafamisAux) {
		this.tipocargafamisAux = tipocargafamisAux;
	}
	
	public List<TipoCargaFami> gettipocargafamisEliminados() {
		return this.tipocargafamisEliminados;
	}

	public void setTipoCargaFamisEliminados(List<TipoCargaFami> tipocargafamisEliminados) {
		this.tipocargafamisEliminados = tipocargafamisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCargaFami() {
		return jComboBoxTiposSeleccionarTipoCargaFami;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCargaFami(
			JComboBox jComboBoxTiposSeleccionarTipoCargaFami) {
		this.jComboBoxTiposSeleccionarTipoCargaFami = jComboBoxTiposSeleccionarTipoCargaFami;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCargaFami() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCargaFami.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCargaFami .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCargaFami() {
		return jTextFieldValorCampoGeneralTipoCargaFami;
	}

	public void setjTextFieldValorCampoGeneralTipoCargaFami(
			JTextField jTextFieldValorCampoGeneralTipoCargaFami) {
		this.jTextFieldValorCampoGeneralTipoCargaFami = jTextFieldValorCampoGeneralTipoCargaFami;
	}

	public void setBorderResaltarValorCampoGeneralTipoCargaFami() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargaFami.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCargaFami .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCargaFami() {
		return this.jCheckBoxSeleccionarTodosTipoCargaFami;
	}

	public void setjCheckBoxSeleccionarTodosTipoCargaFami(
			JCheckBox jCheckBoxSeleccionarTodosTipoCargaFami) {
		this.jCheckBoxSeleccionarTodosTipoCargaFami = jCheckBoxSeleccionarTodosTipoCargaFami;
	}

	public void setBorderResaltarSeleccionarTodosTipoCargaFami() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargaFami.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCargaFami .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCargaFami() {
		return this.jCheckBoxSeleccionadosTipoCargaFami;
	}

	public void setjCheckBoxSeleccionadosTipoCargaFami(
			JCheckBox jCheckBoxSeleccionadosTipoCargaFami) {
		this.jCheckBoxSeleccionadosTipoCargaFami = jCheckBoxSeleccionadosTipoCargaFami;
	}
	
	public void setBorderResaltarSeleccionadosTipoCargaFami() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargaFami.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCargaFami .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCargaFami() {
		return this.jComboBoxTiposArchivosReportesTipoCargaFami;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCargaFami(
			JComboBox jComboBoxTiposArchivosReportesTipoCargaFami) {
		this.jComboBoxTiposArchivosReportesTipoCargaFami = jComboBoxTiposArchivosReportesTipoCargaFami;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCargaFami() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargaFami.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCargaFami .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCargaFami() {
		return this.jComboBoxTiposReportesTipoCargaFami;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCargaFami(
			JComboBox jComboBoxTiposReportesTipoCargaFami) {
		this.jComboBoxTiposReportesTipoCargaFami = jComboBoxTiposReportesTipoCargaFami;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCargaFami() {
	//	return jComboBoxTiposReportesDinamicoTipoCargaFami;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCargaFami(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCargaFami) {
	//	this.jComboBoxTiposReportesDinamicoTipoCargaFami = jComboBoxTiposReportesDinamicoTipoCargaFami;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCargaFami() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCargaFami;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCargaFami(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCargaFami) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCargaFami = jComboBoxTiposArchivosReportesDinamicoTipoCargaFami;
	//}
	
	public void setBorderResaltarTiposReportesTipoCargaFami() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargaFami.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCargaFami .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCargaFami() {
		return this.jComboBoxTiposGraficosReportesTipoCargaFami;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCargaFami(
			JComboBox jComboBoxTiposGraficosReportesTipoCargaFami) {
		this.jComboBoxTiposGraficosReportesTipoCargaFami = jComboBoxTiposGraficosReportesTipoCargaFami;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCargaFami() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargaFami.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCargaFami .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCargaFami() {
		return this.jComboBoxTiposPaginacionTipoCargaFami;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCargaFami(
			JComboBox jComboBoxTiposPaginacionTipoCargaFami) {
		this.jComboBoxTiposPaginacionTipoCargaFami = jComboBoxTiposPaginacionTipoCargaFami;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCargaFami() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargaFami.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCargaFami .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCargaFami() {
		return this.jComboBoxTiposRelacionesTipoCargaFami;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCargaFami() {
		return this.jComboBoxTiposAccionesTipoCargaFami;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCargaFami(
			JComboBox jComboBoxTiposRelacionesTipoCargaFami) {
		this.jComboBoxTiposRelacionesTipoCargaFami = jComboBoxTiposRelacionesTipoCargaFami;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCargaFami(
			JComboBox jComboBoxTiposAccionesTipoCargaFami) {
		this.jComboBoxTiposAccionesTipoCargaFami = jComboBoxTiposAccionesTipoCargaFami;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCargaFami() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargaFami.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCargaFami .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCargaFami() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCargaFami.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCargaFami .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCargaFami() {
	//	return jCheckBoxConGraficoDinamicoTipoCargaFami;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCargaFami(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCargaFami) {
	//	this.jCheckBoxConGraficoDinamicoTipoCargaFami = jCheckBoxConGraficoDinamicoTipoCargaFami;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCargaFami() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCargaFami.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCargaFami .setBorder(borderResaltar);		
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
		this.tipocargafamiSessionBean=new TipoCargaFamiSessionBean();
		
		this.tipocargafamiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocargafamiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocargafamiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCargaFamiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCargaFamiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCargaFamiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCargaFamiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCargaFamiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Carga Fami MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCargaFamiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCargaFami No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCargaFami= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCargaFami,this.jTtoolBarTipoCargaFami,
							"nuevo","nuevo","Nuevo"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCargaFami,this.jTtoolBarTipoCargaFami,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCargaFami,this.jTtoolBarTipoCargaFami,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCargaFami,this.jTtoolBarTipoCargaFami,
							"duplicar","duplicar","Duplicar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCargaFami,this.jTtoolBarTipoCargaFami,
							"copiar","copiar","Copiar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCargaFami,this.jTtoolBarTipoCargaFami,
							"ver_form","ver_form","Ver"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCargaFami,this.jTtoolBarTipoCargaFami,
							"recargar","recargar","Recargar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCargaFami,this.jTtoolBarTipoCargaFami,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCargaFami,this.jTtoolBarTipoCargaFami,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCargaFami,this.jTtoolBarTipoCargaFami,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCargaFami,this.jTtoolBarTipoCargaFami,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCargaFami,this.jTtoolBarTipoCargaFami,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCargaFami=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCargaFami,this.jTtoolBarTipoCargaFami,
							"cerrar","cerrar","Salir"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCargaFami=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCargaFami;
			
				this.jButtonProcesarInformacionToolBarTipoCargaFami=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCargaFami;
				
		//protected JButton jButtonModificarToolBarTipoCargaFami;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCargaFami=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCargaFami=new JMenuMe("General");
		this.jmenuArchivoTipoCargaFami=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCargaFami=new JMenuMe("Acciones");
		this.jmenuDatosTipoCargaFami=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCargaFami= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCargaFami.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCargaFami,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCargaFami= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCargaFami.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCargaFami,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCargaFami= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCargaFami.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCargaFami,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCargaFami= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCargaFami.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCargaFami,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCargaFami= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCargaFami.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCargaFami,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCargaFami= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCargaFami.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCargaFami,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCargaFami= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCargaFami.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCargaFami,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCargaFami= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCargaFami.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCargaFami,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCargaFami= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCargaFami.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCargaFami,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCargaFami= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCargaFami.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCargaFami,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCargaFami= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCargaFami.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCargaFami,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCargaFami= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCargaFami.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCargaFami,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCargaFami= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCargaFami.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCargaFami,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCargaFami= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCargaFami.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCargaFami,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCargaFami= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCargaFami.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCargaFami,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCargaFami= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCargaFami.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCargaFami,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCargaFami= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCargaFami.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCargaFami,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCargaFami.add(this.jMenuItemCerrarTipoCargaFami);
			
			this.jmenuAccionesTipoCargaFami.add(this.jMenuItemNuevoTipoCargaFami);
			this.jmenuAccionesTipoCargaFami.add(this.jMenuItemNuevoGuardarCambiosTipoCargaFami);
			this.jmenuAccionesTipoCargaFami.add(this.jMenuItemNuevoRelacionesTipoCargaFami);
			this.jmenuAccionesTipoCargaFami.add(this.jMenuItemGuardarCambiosTablaTipoCargaFami);		
			this.jmenuAccionesTipoCargaFami.add(this.jMenuItemDuplicarTipoCargaFami);		
			this.jmenuAccionesTipoCargaFami.add(this.jMenuItemCopiarTipoCargaFami);		
			this.jmenuAccionesTipoCargaFami.add(this.jMenuItemVerFormTipoCargaFami);		
			
			this.jmenuDatosTipoCargaFami.add(this.jMenuItemRecargarInformacionTipoCargaFami);				
			this.jmenuDatosTipoCargaFami.add(this.jMenuItemAnterioresTipoCargaFami);				
			this.jmenuDatosTipoCargaFami.add(this.jMenuItemSiguientesTipoCargaFami);				
			this.jmenuDatosTipoCargaFami.add(this.jMenuItemAbrirOrderByTipoCargaFami);				
			this.jmenuDatosTipoCargaFami.add(this.jMenuItemMostrarOcultarTipoCargaFami);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCargaFami.add(this.jMenuItemGuardarCambiosTipoCargaFami);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCargaFami.add(this.jmenuArchivoTipoCargaFami);		
			this.jmenuBarTipoCargaFami.add(this.jmenuAccionesTipoCargaFami);		
			this.jmenuBarTipoCargaFami.add(this.jmenuDatosTipoCargaFami);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCargaFami);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCargaFami() {
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
			//this.jInternalFrameDetalleTipoCargaFami = new TipoCargaFamiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Carga Fami DATOS");
			this.jInternalFrameDetalleFormTipoCargaFami = new TipoCargaFamiDetalleFormJInternalFrame(jDesktopPane,this.tipocargafamiSessionBean.getConGuardarRelaciones(),this.tipocargafamiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCargaFami = null;//new TipoCargaFamiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCargaFami= new GridBagLayout();
		
		
		this.jTableDatosTipoCargaFami = new JTableMe();      
		
		String sToolTipTipoCargaFami="";
		sToolTipTipoCargaFami=TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCargaFami+="(Cartera.TipoCargaFami)";
		}
		
		if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCargaFami+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCargaFami.setToolTipText(sToolTipTipoCargaFami);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCargaFami);
		this.jTableDatosTipoCargaFami.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCargaFami.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCargaFami.setRowSelectionAllowed(true);
		this.jTableDatosTipoCargaFami.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCargaFami,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCargaFami = new JButtonMe();
		this.jButtonDuplicarTipoCargaFami = new JButtonMe();
		this.jButtonCopiarTipoCargaFami = new JButtonMe();
		this.jButtonVerFormTipoCargaFami = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCargaFami = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCargaFami = new JButtonMe();
		this.jButtonCerrarTipoCargaFami = new JButtonMe();
		
		this.jScrollPanelDatosTipoCargaFami = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCargaFami = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCargaFami = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Carga Fami";
		
		if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Carga Famis" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCargaFami.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCargaFami.setToolTipText("Acciones");
        this.jPanelAccionesTipoCargaFami.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCargaFami=new ReporteDinamicoJInternalFrame(TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCargaFami();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCargaFami=new ImportacionJInternalFrame(TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCargaFami();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCargaFami = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCargaFami.setText("Orden");
		this.jButtonAbrirOrderByTipoCargaFami.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCargaFami,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCargaFami.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCargaFami=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCargaFami,false,this);
			
			//this.cargarOrderByTipoCargaFami(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCargaFami=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCargaFami,true,this);
			
			//this.cargarOrderByTipoCargaFami(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCargaFami.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCargaFami.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCargaFami.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoCargaFami.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCargaFami.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCargaFami.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCargaFami.setText("Nuevo");
		this.jButtonDuplicarTipoCargaFami.setText("Duplicar");
		this.jButtonCopiarTipoCargaFami.setText("Copiar");
		this.jButtonVerFormTipoCargaFami.setText("Ver");
		this.jButtonNuevoRelacionesTipoCargaFami.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCargaFami.setText("Guardar");
		this.jButtonCerrarTipoCargaFami.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCargaFami,"nuevo_button","Nuevo",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCargaFami,"duplicar_button","Duplicar",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCargaFami,"copiar_button","Copiar",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCargaFami,"ver_form","Ver",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCargaFami,"nuevorelaciones_button","Nuevo Rel",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCargaFami,"guardarcambiostabla_button","Guardar",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCargaFami,"cerrar_button","Salir",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCargaFami.setToolTipText("Nuevo"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCargaFami.setToolTipText("Duplicar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCargaFami.setToolTipText("Copiar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCargaFami.setToolTipText("Ver"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCargaFami.setToolTipText("Nuevo Rel"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCargaFami.setToolTipText("Guardar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCargaFami.setToolTipText("Salir"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCargaFami";
		inputMap = this.jButtonNuevoTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCargaFami.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCargaFami"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCargaFami";
		inputMap = this.jButtonDuplicarTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCargaFami.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCargaFami"));
		
		//COPIAR
		sMapKey = "CopiarTipoCargaFami";
		inputMap = this.jButtonCopiarTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCargaFami.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCargaFami"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCargaFami";
		inputMap = this.jButtonVerFormTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCargaFami.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCargaFami"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCargaFami";
		inputMap = this.jButtonNuevoRelacionesTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCargaFami.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCargaFami"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCargaFami";
		inputMap = this.jButtonModificarTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCargaFami.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCargaFami"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCargaFami";
		inputMap = this.jButtonCerrarTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCargaFami.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCargaFami"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCargaFami";
		inputMap = this.jButtonGuardarCambiosTablaTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCargaFami.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCargaFami"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCargaFami = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCargaFami = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCargaFami = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCargaFami= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCargaFami= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCargaFami= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCargaFami= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCargaFami= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCargaFami.setName("jPanelParametrosReportesTipoCargaFami"); 
		
		this.jPanelParametrosReportesAccionesTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCargaFami.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCargaFami.setName("jPanelParametrosReportesAccionesTipoCargaFami"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCargaFami, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCargaFami = new JButtonMe();
		this.jButtonRecargarInformacionTipoCargaFami.setText("Recargar");
		this.jButtonRecargarInformacionTipoCargaFami.setToolTipText("Recargar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCargaFami,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCargaFami = new JButtonMe();
		this.jButtonProcesarInformacionTipoCargaFami.setText("Procesar");
		this.jButtonProcesarInformacionTipoCargaFami.setToolTipText("Procesar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCargaFami.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCargaFami.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCargaFami.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCargaFami.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCargaFami = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCargaFami.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCargaFami.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCargaFami = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCargaFami.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCargaFami.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCargaFami = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCargaFami.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCargaFami.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCargaFami = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCargaFami.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCargaFami.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCargaFami = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCargaFami.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCargaFami.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCargaFami = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCargaFami.setText("Accion");
		this.jComboBoxTiposAccionesTipoCargaFami.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCargaFami = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCargaFami.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCargaFami.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCargaFami=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCargaFami.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCargaFami.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCargaFami.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCargaFami = new JLabelMe();
		
		this.jLabelAccionesTipoCargaFami.setText("Acciones");		
		this.jLabelAccionesTipoCargaFami.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCargaFami.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCargaFami.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCargaFami = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCargaFami.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCargaFami.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCargaFami = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCargaFami.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCargaFami.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCargaFami = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCargaFami.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCargaFami.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCargaFami = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCargaFami.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCargaFami.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCargaFami = new JButtonMe();
		//this.jButtonAnterioresTipoCargaFami.setText("<<");
        this.jButtonAnterioresTipoCargaFami.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCargaFami,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCargaFami = new JButtonMe();
		//this.jButtonSiguientesTipoCargaFami.setText(">>");
        this.jButtonSiguientesTipoCargaFami.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCargaFami,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCargaFami = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCargaFami.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCargaFami.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCargaFami,"nuevoguardarcambios_button","Nue",this.tipocargafamiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCargaFami";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCargaFami.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCargaFami"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCargaFami";
		inputMap = this.jButtonRecargarInformacionTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCargaFami.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCargaFami"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCargaFami";
		inputMap = this.jButtonSiguientesTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCargaFami.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCargaFami"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCargaFami";
		inputMap = this.jButtonAnterioresTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCargaFami.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCargaFami"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCargaFami();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCargaFami.setMinimumSize(new Dimension(this.getWidth(),TipoCargaFamiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCargaFamiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCargaFami.setMaximumSize(new Dimension(this.getWidth(),TipoCargaFamiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCargaFamiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCargaFami.setPreferredSize(new Dimension(this.getWidth(),TipoCargaFamiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCargaFamiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCargaFami = new GridBagLayout();

			this.jPanelPaginacionTipoCargaFami.setLayout(gridaBagLayoutPaginacionTipoCargaFami);						
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.gridy = 0;
			this.gridBagConstraintsTipoCargaFami.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCargaFami.add(this.jButtonAnterioresTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
					
						
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCargaFami.gridy = 0;
			
			this.jPanelPaginacionTipoCargaFami.add(this.jButtonNuevoGuardarCambiosTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
						
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCargaFami.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCargaFami.gridy = 0;
			this.jPanelPaginacionTipoCargaFami.add(this.jButtonSiguientesTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.gridy = 1;
			this.gridBagConstraintsTipoCargaFami.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCargaFami.add(this.jButtonNuevoTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
				this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCargaFami.gridy = 1;
				this.gridBagConstraintsTipoCargaFami.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoCargaFami.add(this.jButtonNuevoRelacionesTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
			}
			
			
			if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
				this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCargaFami.gridy = 1;
				this.gridBagConstraintsTipoCargaFami.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCargaFami.add(this.jButtonGuardarCambiosTablaTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
			}
			
			
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.gridy = 1;
			this.gridBagConstraintsTipoCargaFami.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCargaFami.add(this.jButtonDuplicarTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.gridy = 1;
			this.gridBagConstraintsTipoCargaFami.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCargaFami.add(this.jButtonCopiarTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.gridy = 1;
			this.gridBagConstraintsTipoCargaFami.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCargaFami.add(this.jButtonVerFormTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.gridy = 1;
			this.gridBagConstraintsTipoCargaFami.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCargaFami.add(this.jButtonCerrarTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		
		
		
		this.jButtonRecargarInformacionTipoCargaFami.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCargaFami.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCargaFami.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCargaFami.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCargaFami.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCargaFami.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCargaFami.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCargaFami.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCargaFami.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCargaFami.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCargaFami.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCargaFami.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCargaFami.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCargaFami.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCargaFami.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCargaFami.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCargaFami.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCargaFami.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCargaFami.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCargaFami.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCargaFami.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCargaFami.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCargaFami.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCargaFami.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCargaFami.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCargaFami.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCargaFami.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCargaFami.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCargaFami.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCargaFami.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCargaFami.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCargaFami.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCargaFami.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCargaFami.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCargaFami.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCargaFami.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCargaFami = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCargaFami = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCargaFami = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCargaFami = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCargaFami = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCargaFami = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCargaFami.setLayout(gridaBagParametrosReportesTipoCargaFami);
			this.jPanelParametrosReportesAccionesTipoCargaFami.setLayout(gridaBagParametrosReportesAccionesTipoCargaFami);
			
			
			this.jPanelParametrosAuxiliar1TipoCargaFami.setLayout(gridaBagParametrosAuxiliar1TipoCargaFami);
			this.jPanelParametrosAuxiliar2TipoCargaFami.setLayout(gridaBagParametrosAuxiliar2TipoCargaFami);
			this.jPanelParametrosAuxiliar3TipoCargaFami.setLayout(gridaBagParametrosAuxiliar3TipoCargaFami);
			this.jPanelParametrosAuxiliar4TipoCargaFami.setLayout(gridaBagParametrosAuxiliar4TipoCargaFami);
			//this.jPanelParametrosAuxiliar5TipoCargaFami.setLayout(gridaBagParametrosAuxiliar2TipoCargaFami);			
			
			
			
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCargaFami.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCargaFami.add(this.jButtonRecargarInformacionTipoCargaFami, this.gridBagConstraintsTipoCargaFami);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargaFami.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCargaFami.add(this.jComboBoxTiposPaginacionTipoCargaFami, this.gridBagConstraintsTipoCargaFami);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargaFami.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCargaFami.add(this.jCheckBoxConAltoMaximoTablaTipoCargaFami, this.gridBagConstraintsTipoCargaFami);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargaFami.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCargaFami.add(this.jComboBoxTiposArchivosReportesTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargaFami.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCargaFami.add(this.jPanelParametrosAuxiliar1TipoCargaFami, this.gridBagConstraintsTipoCargaFami);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCargaFami.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCargaFami.add(this.jComboBoxTiposReportesTipoCargaFami, this.gridBagConstraintsTipoCargaFami);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargaFami.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCargaFami.add(this.jPanelParametrosAuxiliar4TipoCargaFami, this.gridBagConstraintsTipoCargaFami);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargaFami.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCargaFami.add(this.jComboBoxTiposReportesTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargaFami.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCargaFami.add(this.jCheckBoxGenerarReporteTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargaFami.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCargaFami.add(this.jPanelParametrosAuxiliar2TipoCargaFami, this.gridBagConstraintsTipoCargaFami);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCargaFami.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCargaFami.add(this.jLabelAccionesTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
				this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCargaFami.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCargaFami.add(this.jButtonAbrirOrderByTipoCargaFami, this.gridBagConstraintsTipoCargaFami);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargaFami.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCargaFami.add(this.jComboBoxTiposSeleccionarTipoCargaFami, this.gridBagConstraintsTipoCargaFami);			
			
			
			/*
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCargaFami.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCargaFami.add(this.jCheckBoxSeleccionarTodosTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCargaFami.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCargaFami.add(this.jCheckBoxSeleccionarTodosTipoCargaFami, this.gridBagConstraintsTipoCargaFami);															
				
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCargaFami.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCargaFami.add(this.jCheckBoxSeleccionadosTipoCargaFami, this.gridBagConstraintsTipoCargaFami);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargaFami.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCargaFami.add(this.jPanelParametrosAuxiliar3TipoCargaFami, this.gridBagConstraintsTipoCargaFami);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargaFami.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCargaFami.add(this.jComboBoxTiposRelacionesTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
				
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargaFami.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCargaFami.add(this.jComboBoxTiposAccionesTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
	
				
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCargaFami.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCargaFami.add(this.jTextFieldValorCampoGeneralTipoCargaFami, this.gridBagConstraintsTipoCargaFami);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCargaFami = new GridBagLayout();

			this.jScrollPanelDatosTipoCargaFami.setLayout(gridaBagLayoutDatosTipoCargaFami);
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.gridy = 0;
			this.gridBagConstraintsTipoCargaFami.gridx = 0;
			
			this.jScrollPanelDatosTipoCargaFami.add(this.jTableDatosTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCargaFami.setViewportView(this.jTableDatosTipoCargaFami);
		this.jTableDatosTipoCargaFami.setFillsViewportHeight(true);
		this.jTableDatosTipoCargaFami.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCargaFami= new GridBagLayout();
		this.jPanelAccionesTipoCargaFami.setLayout(gridaBagLayoutAccionesTipoCargaFami);
		
		
		/*	
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargaFami.gridy = 0;
		this.gridBagConstraintsTipoCargaFami.gridx = 0;
			
		this.jPanelAccionesTipoCargaFami.add(this.jButtonNuevoTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCargaFami = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCargaFami);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();						
			this.gridBagConstraintsTipoCargaFami.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCargaFami.gridx = 0;		
			//this.gridBagConstraintsTipoCargaFami.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCargaFami.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCargaFami, this.gridBagConstraintsTipoCargaFami);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCargaFami.gridx = 0;		
		//this.gridBagConstraintsTipoCargaFami.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargaFami.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCargaFami.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCargaFami);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargaFami.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCargaFami, this.gridBagConstraintsTipoCargaFami);								
		
		
		/*
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargaFami.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		*/		
		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCargaFami.gridx =0;
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCargaFami.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
				
		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargaFami.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoCargaFamiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCargaFami= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCargaFami = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCargaFami.setLayout(gridaBagLayoutBusquedasParametrosTipoCargaFami);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCargaFami=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCargaFami.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCargaFami.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCargaFami.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargaFami.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
			
			
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargaFami.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		
			
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCargaFami.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCargaFami;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCargaFami() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCargaFami = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCargaFami = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCargaFami.setName("jPanelReporteDinamicoTipoCargaFami"); 
		
		this.jPanelReporteDinamicoTipoCargaFami.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCargaFami.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCargaFami.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCargaFami.setLayout(gridaBagLayoutReporteDinamicoTipoCargaFami);
		
		
		this.jInternalFrameReporteDinamicoTipoCargaFami= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCargaFami = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCargaFami= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCargaFami.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCargaFami.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCargaFami.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCargaFami.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCargaFami.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCargaFami.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCargaFami.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCargaFami.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCargaFami.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCargaFami.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCargaFami.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Carga Famis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCargaFami = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCargaFami.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCargaFami.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCargaFami.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCargaFami.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCargaFami.add(this.jLabelColumnasSelectReporteTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCargaFami = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCargaFami.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCargaFami.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCargaFami.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCargaFami.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCargaFami.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCargaFami=new JScrollPane(this.jListColumnasSelectReporteTipoCargaFami);
			
			this.jScrollColumnasSelectReporteTipoCargaFami.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCargaFami.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCargaFami.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCargaFami.add(this.jListColumnasSelectReporteTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		this.jPanelReporteDinamicoTipoCargaFami.add(this.jScrollColumnasSelectReporteTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCargaFami = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCargaFami.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCargaFami.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCargaFami.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCargaFami.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCargaFami.add(this.jLabelRelacionesSelectReporteTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCargaFami = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCargaFami.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCargaFami.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCargaFami.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCargaFami.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCargaFami.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCargaFami=new JScrollPane(this.jListRelacionesSelectReporteTipoCargaFami);
			
			this.jScrollRelacionesSelectReporteTipoCargaFami.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCargaFami.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCargaFami.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCargaFami.add(this.jListRelacionesSelectReporteTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		this.jPanelReporteDinamicoTipoCargaFami.add(this.jScrollRelacionesSelectReporteTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoCargaFami = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCargaFami = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCargaFami = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCargaFami = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCargaFami.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCargaFami.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCargaFami.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCargaFami.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCargaFami = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCargaFami.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCargaFami.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCargaFami.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCargaFami.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCargaFami = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCargaFami.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCargaFami.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCargaFami.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCargaFami.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCargaFami.add(this.jLabelGenerarExcelReporteDinamicoTipoCargaFami, this.gridBagConstraintsTipoCargaFami);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCargaFami = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCargaFami.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCargaFami,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCargaFami.setToolTipText("Generar EXCEL"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		//this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCargaFami.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCargaFami.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCargaFami.add(this.jButtonGenerarExcelReporteDinamicoTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCargaFami.add(this.jComboBoxTiposReportesDinamicoTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCargaFami = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCargaFami.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCargaFami.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCargaFami.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCargaFami.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCargaFami.add(this.jLabelTiposArchivoReporteDinamicoTipoCargaFami, this.gridBagConstraintsTipoCargaFami);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCargaFami.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCargaFami = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCargaFami.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCargaFami,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCargaFami.setToolTipText("Generar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCargaFami.add(this.jButtonGenerarReporteDinamicoTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCargaFami = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCargaFami.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCargaFami,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCargaFami.setToolTipText("Cancelar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCargaFami.add(this.jButtonCerrarReporteDinamicoTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCargaFami = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCargaFami= new JScrollPane(jPanelReporteDinamicoTipoCargaFami,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCargaFami.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCargaFami.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCargaFami.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Carga Famis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCargaFami.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCargaFami.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCargaFami.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCargaFami);
		this.jInternalFrameReporteDinamicoTipoCargaFami.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCargaFami, this.gridBagConstraintsTipoCargaFami);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCargaFami() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCargaFami = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCargaFami = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCargaFami.setName("jPanelImportacionTipoCargaFami"); 
		
		this.jPanelImportacionTipoCargaFami.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCargaFami.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCargaFami.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCargaFami.setLayout(gridaBagLayoutImportacionTipoCargaFami);
		
		
		this.jInternalFrameImportacionTipoCargaFami= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCargaFami= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCargaFami = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCargaFami= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCargaFami.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCargaFami.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCargaFami.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCargaFami.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCargaFami.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCargaFami.setResizable(true);
	    this.jInternalFrameImportacionTipoCargaFami.setClosable(true);
	    this.jInternalFrameImportacionTipoCargaFami.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCargaFami.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCargaFami.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCargaFami.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCargaFami.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCargaFami.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCargaFami.setResizable(true);
	    this.jInternalFrameImportacionTipoCargaFami.setClosable(true);
	    this.jInternalFrameImportacionTipoCargaFami.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCargaFami.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCargaFami.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCargaFami.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Carga Famis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCargaFami = new JLabelMe();

		this.jLabelArchivoImportacionTipoCargaFami.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCargaFami.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCargaFami.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCargaFami.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCargaFami.add(this.jLabelArchivoImportacionTipoCargaFami, this.gridBagConstraintsTipoCargaFami);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCargaFami = new JFileChooser();		
		this.jFileChooserImportacionTipoCargaFami.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCargaFami = new JButtonMe();
		this.jButtonAbrirImportacionTipoCargaFami.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCargaFami,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCargaFami.setToolTipText("Generar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCargaFami.add(this.jButtonAbrirImportacionTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCargaFami = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCargaFami.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCargaFami.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCargaFami.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCargaFami.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCargaFami.add(this.jLabelPathArchivoImportacionTipoCargaFami, this.gridBagConstraintsTipoCargaFami);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCargaFami=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCargaFami.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCargaFami.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCargaFami.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCargaFami.add(this.jTextFieldPathArchivoImportacionTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCargaFami = new JButtonMe();
		this.jButtonGenerarImportacionTipoCargaFami.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCargaFami,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCargaFami.setToolTipText("Generar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCargaFami.add(this.jButtonGenerarImportacionTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCargaFami = new JButtonMe();
		this.jButtonCerrarImportacionTipoCargaFami.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCargaFami,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCargaFami.setToolTipText("Cancelar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCargaFami.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCargaFami.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCargaFami.add(this.jButtonCerrarImportacionTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCargaFami = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCargaFami= new JScrollPane(jPanelImportacionTipoCargaFami,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
		this.gridBagConstraintsTipoCargaFami.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCargaFami.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCargaFami.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCargaFami.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCargaFami);
		this.jInternalFrameImportacionTipoCargaFami.getContentPane().add(this.jScrollPanelImportacionTipoCargaFami, this.gridBagConstraintsTipoCargaFami);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCargaFami(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCargaFami = new JButtonMe();
			this.jButtonAbrirOrderByTipoCargaFami.setText("Orden");
			this.jButtonAbrirOrderByTipoCargaFami.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCargaFami,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCargaFami";
			inputMap = this.jButtonAbrirOrderByTipoCargaFami.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCargaFami.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCargaFami"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCargaFami = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCargaFami = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCargaFami.setName("jPanelOrderByTipoCargaFami"); 
			
			this.jPanelOrderByTipoCargaFami.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCargaFami.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCargaFami.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCargaFami.setLayout(gridaBagLayoutOrderByTipoCargaFami);
			
			
			this.jTableDatosTipoCargaFamiOrderBy = new JTableMe();        
			this.jTableDatosTipoCargaFamiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCargaFamiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCargaFamiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCargaFamiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCargaFamiOrderBy.setViewportView(this.jTableDatosTipoCargaFamiOrderBy);
			this.jTableDatosTipoCargaFamiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCargaFamiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCargaFami= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCargaFami= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCargaFami = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCargaFami= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCargaFami.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCargaFami.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCargaFami.setTitle("Orden");
			this.jInternalFrameOrderByTipoCargaFami.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCargaFami.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCargaFami.setResizable(true);
			this.jInternalFrameOrderByTipoCargaFami.setClosable(true);
			this.jInternalFrameOrderByTipoCargaFami.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCargaFami.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCargaFami.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCargaFami.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCargaFami.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Carga Famis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCargaFami.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCargaFami.ipady =150;
				
			this.jPanelOrderByTipoCargaFami.add(jScrollPanelDatosTipoCargaFamiOrderBy, this.gridBagConstraintsTipoCargaFami);//this.jTableDatosTipoCargaFamiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCargaFami = new JButtonMe();
			this.jButtonCerrarOrderByTipoCargaFami.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCargaFami,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCargaFami.setToolTipText("Cancelar"+" "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCargaFami, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCargaFami.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCargaFami.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCargaFami.add(this.jButtonCerrarOrderByTipoCargaFami, this.gridBagConstraintsTipoCargaFami);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCargaFami = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCargaFami= new JScrollPane(jPanelOrderByTipoCargaFami,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCargaFami = new GridBagConstraints();
			this.gridBagConstraintsTipoCargaFami.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCargaFami.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCargaFami.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCargaFami.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCargaFami.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCargaFami);
			
			this.jInternalFrameOrderByTipoCargaFami.getContentPane().add(this.jScrollPanelOrderByTipoCargaFami, this.gridBagConstraintsTipoCargaFami);			
		
		} else {
			this.jButtonAbrirOrderByTipoCargaFami = new JButtonMe();
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
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipocargafamiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCargaFami.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCargaFami.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCargaFami.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCargaFami.getRowHeight();//TipoCargaFamiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCargaFamiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCargaFami.isSelected()) {
					iHeightTable=TipoCargaFamiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCargaFamiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCargaFamiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCargaFamiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCargaFami.isSelected()) {
					iHeightTable=TipoCargaFamiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCargaFamiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCargaFamiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCargaFami.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCargaFami.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCargaFami.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCargaFami.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCargaFami.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCargaFami.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCargaFami!=null && this.jInternalFrameOrderByTipoCargaFami.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCargaFami.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCargaFami.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCargaFami.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCargaFami.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCargaFami.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCargaFami.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCargaFami.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCargaFami.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCargaFami.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCargaFami.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocargafamiLogic.getTipoCargaFamis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocargafamis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCargaFami> TraerTipoCargaFamiBeans(List<TipoCargaFami> tipocargafamis,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCargaFami tipocargafami:tipocargafamis) {
					
				if(!(TipoCargaFamiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCargaFamiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocargafami.setsDetalleGeneralEntityReporte(TipoCargaFamiConstantesFunciones.getTipoCargaFamiDescripcion(tipocargafami));
										
						
					
					

					if(tipocargafami.getCargaFamiliar_NMs()!=null && Funciones.existeClass(classes,CargaFamiliar_NM.class)) {
						try{tipocargafami.setcargafamiliar_nmsDescripcionReporte(new JRBeanCollectionDataSource(CargaFamiliar_NMJInternalFrame.TraerCargaFamiliar_NMBeans(tipocargafami.getCargaFamiliar_NMs(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipocargafami.getCargaFamiliars()!=null && Funciones.existeClass(classes,CargaFamiliar.class)) {
						try{tipocargafami.setcargafamiliarsDescripcionReporte(new JRBeanCollectionDataSource(CargaFamiliarJInternalFrame.TraerCargaFamiliarBeans(tipocargafami.getCargaFamiliars(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipocargafami.setsDetalleGeneralEntityReporte(tipocargafami.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocargafamibeans.add(tipocargafamibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocargafamis;
    }
	//PARA REPORTES FIN
}
