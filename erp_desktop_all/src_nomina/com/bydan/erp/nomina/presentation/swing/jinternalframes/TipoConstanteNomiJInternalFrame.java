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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoConstanteNomiConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoConstanteNomiJInternalFrame extends TipoConstanteNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoConstanteNomi;
	
	protected JMenuBar jmenuBarTipoConstanteNomi;
	
	protected JMenu jmenuTipoConstanteNomi;
	protected JMenu jmenuDatosTipoConstanteNomi;
	protected JMenu jmenuArchivoTipoConstanteNomi;
	protected JMenu jmenuAccionesTipoConstanteNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoConstanteNomi;	
	protected GridBagConstraints gridBagConstraintsTipoConstanteNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoConstanteNomiDetalleFormJInternalFrame jInternalFrameDetalleFormTipoConstanteNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoConstanteNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoConstanteNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoConstanteNomiSessionBean tipoconstantenomiSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoConstanteNomi> tipoconstantenomis;		
	public List<TipoConstanteNomi> tipoconstantenomisEliminados;	
	public List<TipoConstanteNomi> tipoconstantenomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoConstanteNomi;		
	protected JButton jButtonAbrirOrderByTipoConstanteNomi;
	
	
	//protected JPanel jPanelOrderByTipoConstanteNomi;
	//public JScrollPane jScrollPanelOrderByTipoConstanteNomi;	
	//protected JButton jButtonCerrarOrderByTipoConstanteNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoConstanteNomiLogic tipoconstantenomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoConstanteNomi;
	public JScrollPane jScrollPanelDatosEdicionTipoConstanteNomi;
	public JScrollPane jScrollPanelDatosGeneralTipoConstanteNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoConstanteNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoConstanteNomi;
	//public JScrollPane jScrollPanelImportacionTipoConstanteNomi;
	
	
	
	protected JPanel jPanelAccionesTipoConstanteNomi;
	
    protected JPanel jPanelPaginacionTipoConstanteNomi;
    protected JPanel jPanelParametrosReportesTipoConstanteNomi;
	protected JPanel jPanelParametrosReportesAccionesTipoConstanteNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoConstanteNomi;
	protected JPanel jPanelParametrosAuxiliar2TipoConstanteNomi;
	protected JPanel jPanelParametrosAuxiliar3TipoConstanteNomi;
	protected JPanel jPanelParametrosAuxiliar4TipoConstanteNomi;
	//protected JPanel jPanelParametrosAuxiliar5TipoConstanteNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoConstanteNomi;
	//protected JPanel jPanelImportacionTipoConstanteNomi;
	
	
	public JTable jTableDatosTipoConstanteNomi;
	
	
	
	//public JTable jTableDatosTipoConstanteNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoConstanteNomi;
	protected JButton jButtonDuplicarTipoConstanteNomi;
	protected JButton jButtonCopiarTipoConstanteNomi;
	protected JButton jButtonVerFormTipoConstanteNomi;
	protected JButton jButtonNuevoRelacionesTipoConstanteNomi;
	protected JButton jButtonModificarTipoConstanteNomi;
	
    protected JButton jButtonGuardarCambiosTablaTipoConstanteNomi;
	protected JButton jButtonCerrarTipoConstanteNomi;
	
	
	protected JButton jButtonRecargarInformacionTipoConstanteNomi;
	protected JButton jButtonProcesarInformacionTipoConstanteNomi;
	
	
	protected JButton jButtonAnterioresTipoConstanteNomi;
	protected JButton jButtonSiguientesTipoConstanteNomi;
	protected JButton jButtonNuevoGuardarCambiosTipoConstanteNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoConstanteNomi;
	//protected JButton jButtonCerrarReporteDinamicoTipoConstanteNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoConstanteNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoConstanteNomi;
	//protected JButton jButtonGenerarImportacionTipoConstanteNomi;
	//protected JButton jButtonCerrarImportacionTipoConstanteNomi;
	//protected JFileChooser jFileChooserImportacionTipoConstanteNomi;
	//protected File fileImportacionTipoConstanteNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoConstanteNomi;
	protected JButton jButtonDuplicarToolBarTipoConstanteNomi;
	protected JButton jButtonNuevoRelacionesToolBarTipoConstanteNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoConstanteNomi;
	protected JButton jButtonCopiarToolBarTipoConstanteNomi;
	protected JButton jButtonVerFormToolBarTipoConstanteNomi;
	public JButton jButtonGuardarCambiosTablaToolBarTipoConstanteNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoConstanteNomi;
	protected JButton jButtonCerrarToolBarTipoConstanteNomi;
	
	protected JButton jButtonRecargarInformacionToolBarTipoConstanteNomi;
	protected JButton jButtonProcesarInformacionToolBarTipoConstanteNomi;
	protected JButton jButtonAnterioresToolBarTipoConstanteNomi;
	protected JButton jButtonSiguientesToolBarTipoConstanteNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoConstanteNomi;
	protected JButton jButtonAbrirOrderByToolBarTipoConstanteNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoConstanteNomi;
	protected JMenuItem jMenuItemDuplicarTipoConstanteNomi;
	protected JMenuItem jMenuItemNuevoRelacionesTipoConstanteNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoConstanteNomi;
	protected JMenuItem jMenuItemCopiarTipoConstanteNomi;
	protected JMenuItem jMenuItemVerFormTipoConstanteNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoConstanteNomi;
	protected JMenuItem jMenuItemCerrarTipoConstanteNomi;
	protected JMenuItem jMenuItemDetalleCerrarTipoConstanteNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoConstanteNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoConstanteNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoConstanteNomi;
	protected JMenuItem jMenuItemProcesarInformacionTipoConstanteNomi;
	protected JMenuItem jMenuItemAnterioresTipoConstanteNomi;
	protected JMenuItem jMenuItemSiguientesTipoConstanteNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoConstanteNomi;
	protected JMenuItem jMenuItemAbrirOrderByTipoConstanteNomi;
	protected JMenuItem jMenuItemMostrarOcultarTipoConstanteNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoConstanteNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoConstanteNomi;
	protected JCheckBox jCheckBoxSeleccionadosTipoConstanteNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoConstanteNomi;
	protected JCheckBox jCheckBoxConGraficoReporteTipoConstanteNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoConstanteNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoConstanteNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoConstanteNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoConstanteNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoConstanteNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoConstanteNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoConstanteNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoConstanteNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoConstanteNomi;
	protected JTextField jTextFieldValorCampoGeneralTipoConstanteNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoConstanteNomi;
	//public JList<Reporte> jListColumnasSelectReporteTipoConstanteNomi;
	//public JScrollPane jScrollColumnasSelectReporteTipoConstanteNomi;
	
	//public JLabel jLabelRelacionesSelectReporteTipoConstanteNomi;
	//public JList<Reporte> jListRelacionesSelectReporteTipoConstanteNomi;
	//public JScrollPane jScrollRelacionesSelectReporteTipoConstanteNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoConstanteNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoConstanteNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoConstanteNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoConstanteNomi;
	
		
	//public JLabel jLabelArchivoImportacionTipoConstanteNomi;	
	//public JLabel jLabelPathArchivoImportacionTipoConstanteNomi;
	//protected JTextField jTextFieldPathArchivoImportacionTipoConstanteNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoConstanteNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoConstanteNomi;
	
	//public JLabel jLabelColumnaCategoriaValorTipoConstanteNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoConstanteNomi;
	
	//public JLabel jLabelColumnasValoresGraficoTipoConstanteNomi;
	//public JList<Reporte> jListColumnasValoresGraficoTipoConstanteNomi;
	//public JScrollPane jScrollColumnasValoresGraficoTipoConstanteNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoConstanteNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoConstanteNomi;	
	
	
	
	
	
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
	public TipoConstanteNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConstanteNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConstanteNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConstanteNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoConstanteNomi)	{
		this.jButtonRecargarInformacionTipoConstanteNomi = jButtonRecargarInformacionTipoConstanteNomi;
	}
	
	public JButton getjButtonProcesarInformacionTipoConstanteNomi() {
		return this.jButtonProcesarInformacionTipoConstanteNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoConstanteNomi)	{
		this.jButtonProcesarInformacionTipoConstanteNomi = jButtonProcesarInformacionTipoConstanteNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoConstanteNomi() {
		return this.jButtonRecargarInformacionTipoConstanteNomi;
	}
	
	
	public List<TipoConstanteNomi> gettipoconstantenomis() {
		return this.tipoconstantenomis;
	}

	public void settipoconstantenomis(List<TipoConstanteNomi> tipoconstantenomis) {
		this.tipoconstantenomis = tipoconstantenomis;
	}
	
	public List<TipoConstanteNomi> gettipoconstantenomisAux() {
		return this.tipoconstantenomisAux;
	}

	public void settipoconstantenomisAux(List<TipoConstanteNomi> tipoconstantenomisAux) {
		this.tipoconstantenomisAux = tipoconstantenomisAux;
	}
	
	public List<TipoConstanteNomi> gettipoconstantenomisEliminados() {
		return this.tipoconstantenomisEliminados;
	}

	public void setTipoConstanteNomisEliminados(List<TipoConstanteNomi> tipoconstantenomisEliminados) {
		this.tipoconstantenomisEliminados = tipoconstantenomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoConstanteNomi() {
		return jComboBoxTiposSeleccionarTipoConstanteNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoConstanteNomi(
			JComboBox jComboBoxTiposSeleccionarTipoConstanteNomi) {
		this.jComboBoxTiposSeleccionarTipoConstanteNomi = jComboBoxTiposSeleccionarTipoConstanteNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoConstanteNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoConstanteNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoConstanteNomi() {
		return jTextFieldValorCampoGeneralTipoConstanteNomi;
	}

	public void setjTextFieldValorCampoGeneralTipoConstanteNomi(
			JTextField jTextFieldValorCampoGeneralTipoConstanteNomi) {
		this.jTextFieldValorCampoGeneralTipoConstanteNomi = jTextFieldValorCampoGeneralTipoConstanteNomi;
	}

	public void setBorderResaltarValorCampoGeneralTipoConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConstanteNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoConstanteNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoConstanteNomi() {
		return this.jCheckBoxSeleccionarTodosTipoConstanteNomi;
	}

	public void setjCheckBoxSeleccionarTodosTipoConstanteNomi(
			JCheckBox jCheckBoxSeleccionarTodosTipoConstanteNomi) {
		this.jCheckBoxSeleccionarTodosTipoConstanteNomi = jCheckBoxSeleccionarTodosTipoConstanteNomi;
	}

	public void setBorderResaltarSeleccionarTodosTipoConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConstanteNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoConstanteNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoConstanteNomi() {
		return this.jCheckBoxSeleccionadosTipoConstanteNomi;
	}

	public void setjCheckBoxSeleccionadosTipoConstanteNomi(
			JCheckBox jCheckBoxSeleccionadosTipoConstanteNomi) {
		this.jCheckBoxSeleccionadosTipoConstanteNomi = jCheckBoxSeleccionadosTipoConstanteNomi;
	}
	
	public void setBorderResaltarSeleccionadosTipoConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConstanteNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoConstanteNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoConstanteNomi() {
		return this.jComboBoxTiposArchivosReportesTipoConstanteNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoConstanteNomi(
			JComboBox jComboBoxTiposArchivosReportesTipoConstanteNomi) {
		this.jComboBoxTiposArchivosReportesTipoConstanteNomi = jComboBoxTiposArchivosReportesTipoConstanteNomi;
	}

	public void setBorderResaltarTiposArchivosReportesTipoConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConstanteNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoConstanteNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoConstanteNomi() {
		return this.jComboBoxTiposReportesTipoConstanteNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoConstanteNomi(
			JComboBox jComboBoxTiposReportesTipoConstanteNomi) {
		this.jComboBoxTiposReportesTipoConstanteNomi = jComboBoxTiposReportesTipoConstanteNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoConstanteNomi() {
	//	return jComboBoxTiposReportesDinamicoTipoConstanteNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoConstanteNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoConstanteNomi) {
	//	this.jComboBoxTiposReportesDinamicoTipoConstanteNomi = jComboBoxTiposReportesDinamicoTipoConstanteNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoConstanteNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoConstanteNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoConstanteNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoConstanteNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoConstanteNomi = jComboBoxTiposArchivosReportesDinamicoTipoConstanteNomi;
	//}
	
	public void setBorderResaltarTiposReportesTipoConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConstanteNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoConstanteNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoConstanteNomi() {
		return this.jComboBoxTiposGraficosReportesTipoConstanteNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoConstanteNomi(
			JComboBox jComboBoxTiposGraficosReportesTipoConstanteNomi) {
		this.jComboBoxTiposGraficosReportesTipoConstanteNomi = jComboBoxTiposGraficosReportesTipoConstanteNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConstanteNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoConstanteNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoConstanteNomi() {
		return this.jComboBoxTiposPaginacionTipoConstanteNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoConstanteNomi(
			JComboBox jComboBoxTiposPaginacionTipoConstanteNomi) {
		this.jComboBoxTiposPaginacionTipoConstanteNomi = jComboBoxTiposPaginacionTipoConstanteNomi;
	}
	
	public void setBorderResaltarTiposPaginacionTipoConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConstanteNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoConstanteNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoConstanteNomi() {
		return this.jComboBoxTiposRelacionesTipoConstanteNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoConstanteNomi() {
		return this.jComboBoxTiposAccionesTipoConstanteNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoConstanteNomi(
			JComboBox jComboBoxTiposRelacionesTipoConstanteNomi) {
		this.jComboBoxTiposRelacionesTipoConstanteNomi = jComboBoxTiposRelacionesTipoConstanteNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoConstanteNomi(
			JComboBox jComboBoxTiposAccionesTipoConstanteNomi) {
		this.jComboBoxTiposAccionesTipoConstanteNomi = jComboBoxTiposAccionesTipoConstanteNomi;
	}
	
	public void setBorderResaltarTiposRelacionesTipoConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConstanteNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoConstanteNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoConstanteNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoConstanteNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoConstanteNomi() {
	//	return jCheckBoxConGraficoDinamicoTipoConstanteNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoConstanteNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoConstanteNomi) {
	//	this.jCheckBoxConGraficoDinamicoTipoConstanteNomi = jCheckBoxConGraficoDinamicoTipoConstanteNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoConstanteNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoConstanteNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoConstanteNomi .setBorder(borderResaltar);		
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
		this.tipoconstantenomiSessionBean=new TipoConstanteNomiSessionBean();
		
		this.tipoconstantenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoconstantenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoconstantenomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoConstanteNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Constante MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoConstanteNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoConstanteNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoConstanteNomi,this.jTtoolBarTipoConstanteNomi,
							"nuevo","nuevo","Nuevo"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoConstanteNomi,this.jTtoolBarTipoConstanteNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoConstanteNomi,this.jTtoolBarTipoConstanteNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoConstanteNomi,this.jTtoolBarTipoConstanteNomi,
							"duplicar","duplicar","Duplicar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoConstanteNomi,this.jTtoolBarTipoConstanteNomi,
							"copiar","copiar","Copiar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoConstanteNomi,this.jTtoolBarTipoConstanteNomi,
							"ver_form","ver_form","Ver"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoConstanteNomi,this.jTtoolBarTipoConstanteNomi,
							"recargar","recargar","Recargar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoConstanteNomi,this.jTtoolBarTipoConstanteNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoConstanteNomi,this.jTtoolBarTipoConstanteNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoConstanteNomi,this.jTtoolBarTipoConstanteNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoConstanteNomi,this.jTtoolBarTipoConstanteNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoConstanteNomi,this.jTtoolBarTipoConstanteNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoConstanteNomi,this.jTtoolBarTipoConstanteNomi,
							"cerrar","cerrar","Salir"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoConstanteNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoConstanteNomi;
			
				this.jButtonProcesarInformacionToolBarTipoConstanteNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoConstanteNomi;
				
		//protected JButton jButtonModificarToolBarTipoConstanteNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoConstanteNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoConstanteNomi=new JMenuMe("General");
		this.jmenuArchivoTipoConstanteNomi=new JMenuMe("Archivo");
		this.jmenuAccionesTipoConstanteNomi=new JMenuMe("Acciones");
		this.jmenuDatosTipoConstanteNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoConstanteNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoConstanteNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoConstanteNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoConstanteNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoConstanteNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoConstanteNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoConstanteNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoConstanteNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoConstanteNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoConstanteNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoConstanteNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoConstanteNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoConstanteNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoConstanteNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoConstanteNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoConstanteNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoConstanteNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoConstanteNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoConstanteNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoConstanteNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoConstanteNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoConstanteNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoConstanteNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoConstanteNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoConstanteNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoConstanteNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoConstanteNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoConstanteNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoConstanteNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoConstanteNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoConstanteNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoConstanteNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoConstanteNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoConstanteNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoConstanteNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoConstanteNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoConstanteNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoConstanteNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoConstanteNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoConstanteNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoConstanteNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoConstanteNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoConstanteNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoConstanteNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoConstanteNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoConstanteNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoConstanteNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoConstanteNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoConstanteNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoConstanteNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoConstanteNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoConstanteNomi.add(this.jMenuItemCerrarTipoConstanteNomi);
			
			this.jmenuAccionesTipoConstanteNomi.add(this.jMenuItemNuevoTipoConstanteNomi);
			this.jmenuAccionesTipoConstanteNomi.add(this.jMenuItemNuevoGuardarCambiosTipoConstanteNomi);
			this.jmenuAccionesTipoConstanteNomi.add(this.jMenuItemNuevoRelacionesTipoConstanteNomi);
			this.jmenuAccionesTipoConstanteNomi.add(this.jMenuItemGuardarCambiosTablaTipoConstanteNomi);		
			this.jmenuAccionesTipoConstanteNomi.add(this.jMenuItemDuplicarTipoConstanteNomi);		
			this.jmenuAccionesTipoConstanteNomi.add(this.jMenuItemCopiarTipoConstanteNomi);		
			this.jmenuAccionesTipoConstanteNomi.add(this.jMenuItemVerFormTipoConstanteNomi);		
			
			this.jmenuDatosTipoConstanteNomi.add(this.jMenuItemRecargarInformacionTipoConstanteNomi);				
			this.jmenuDatosTipoConstanteNomi.add(this.jMenuItemAnterioresTipoConstanteNomi);				
			this.jmenuDatosTipoConstanteNomi.add(this.jMenuItemSiguientesTipoConstanteNomi);				
			this.jmenuDatosTipoConstanteNomi.add(this.jMenuItemAbrirOrderByTipoConstanteNomi);				
			this.jmenuDatosTipoConstanteNomi.add(this.jMenuItemMostrarOcultarTipoConstanteNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoConstanteNomi.add(this.jMenuItemGuardarCambiosTipoConstanteNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoConstanteNomi.add(this.jmenuArchivoTipoConstanteNomi);		
			this.jmenuBarTipoConstanteNomi.add(this.jmenuAccionesTipoConstanteNomi);		
			this.jmenuBarTipoConstanteNomi.add(this.jmenuDatosTipoConstanteNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoConstanteNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoConstanteNomi() {
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
			//this.jInternalFrameDetalleTipoConstanteNomi = new TipoConstanteNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Constante DATOS");
			this.jInternalFrameDetalleFormTipoConstanteNomi = new TipoConstanteNomiDetalleFormJInternalFrame(jDesktopPane,this.tipoconstantenomiSessionBean.getConGuardarRelaciones(),this.tipoconstantenomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoConstanteNomi = null;//new TipoConstanteNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoConstanteNomi= new GridBagLayout();
		
		
		this.jTableDatosTipoConstanteNomi = new JTableMe();      
		
		String sToolTipTipoConstanteNomi="";
		sToolTipTipoConstanteNomi=TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoConstanteNomi+="(Nomina.TipoConstanteNomi)";
		}
		
		if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoConstanteNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoConstanteNomi.setToolTipText(sToolTipTipoConstanteNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoConstanteNomi);
		this.jTableDatosTipoConstanteNomi.setAutoCreateRowSorter(true);
		this.jTableDatosTipoConstanteNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoConstanteNomi.setRowSelectionAllowed(true);
		this.jTableDatosTipoConstanteNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoConstanteNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoConstanteNomi = new JButtonMe();
		this.jButtonDuplicarTipoConstanteNomi = new JButtonMe();
		this.jButtonCopiarTipoConstanteNomi = new JButtonMe();
		this.jButtonVerFormTipoConstanteNomi = new JButtonMe();
		this.jButtonNuevoRelacionesTipoConstanteNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoConstanteNomi = new JButtonMe();
		this.jButtonCerrarTipoConstanteNomi = new JButtonMe();
		
		this.jScrollPanelDatosTipoConstanteNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoConstanteNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Constante";
		
		if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Constantes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoConstanteNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoConstanteNomi.setToolTipText("Acciones");
        this.jPanelAccionesTipoConstanteNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoConstanteNomi=new ReporteDinamicoJInternalFrame(TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoConstanteNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoConstanteNomi=new ImportacionJInternalFrame(TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoConstanteNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoConstanteNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoConstanteNomi.setText("Orden");
		this.jButtonAbrirOrderByTipoConstanteNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoConstanteNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoConstanteNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConstanteNomi,false,this);
			
			//this.cargarOrderByTipoConstanteNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoConstanteNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConstanteNomi,true,this);
			
			//this.cargarOrderByTipoConstanteNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoConstanteNomi.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoConstanteNomi.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoConstanteNomi.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoConstanteNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoConstanteNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoConstanteNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoConstanteNomi.setText("Nuevo");
		this.jButtonDuplicarTipoConstanteNomi.setText("Duplicar");
		this.jButtonCopiarTipoConstanteNomi.setText("Copiar");
		this.jButtonVerFormTipoConstanteNomi.setText("Ver");
		this.jButtonNuevoRelacionesTipoConstanteNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoConstanteNomi.setText("Guardar");
		this.jButtonCerrarTipoConstanteNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoConstanteNomi,"nuevo_button","Nuevo",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoConstanteNomi,"duplicar_button","Duplicar",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoConstanteNomi,"copiar_button","Copiar",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoConstanteNomi,"ver_form","Ver",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoConstanteNomi,"nuevorelaciones_button","Nuevo Rel",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoConstanteNomi,"guardarcambiostabla_button","Guardar",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoConstanteNomi,"cerrar_button","Salir",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoConstanteNomi.setToolTipText("Nuevo"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoConstanteNomi.setToolTipText("Duplicar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoConstanteNomi.setToolTipText("Copiar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoConstanteNomi.setToolTipText("Ver"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoConstanteNomi.setToolTipText("Nuevo Rel"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoConstanteNomi.setToolTipText("Guardar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoConstanteNomi.setToolTipText("Salir"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoConstanteNomi";
		inputMap = this.jButtonNuevoTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoConstanteNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoConstanteNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoConstanteNomi";
		inputMap = this.jButtonDuplicarTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoConstanteNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoConstanteNomi"));
		
		//COPIAR
		sMapKey = "CopiarTipoConstanteNomi";
		inputMap = this.jButtonCopiarTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoConstanteNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoConstanteNomi"));
		
		//VEr FORM
		sMapKey = "VerFormTipoConstanteNomi";
		inputMap = this.jButtonVerFormTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoConstanteNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoConstanteNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoConstanteNomi";
		inputMap = this.jButtonNuevoRelacionesTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoConstanteNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoConstanteNomi";
		inputMap = this.jButtonModificarTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoConstanteNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoConstanteNomi";
		inputMap = this.jButtonCerrarTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoConstanteNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoConstanteNomi";
		inputMap = this.jButtonGuardarCambiosTablaTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoConstanteNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoConstanteNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoConstanteNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoConstanteNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoConstanteNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoConstanteNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoConstanteNomi.setName("jPanelParametrosReportesTipoConstanteNomi"); 
		
		this.jPanelParametrosReportesAccionesTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoConstanteNomi.setName("jPanelParametrosReportesAccionesTipoConstanteNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoConstanteNomi = new JButtonMe();
		this.jButtonRecargarInformacionTipoConstanteNomi.setText("Recargar");
		this.jButtonRecargarInformacionTipoConstanteNomi.setToolTipText("Recargar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoConstanteNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoConstanteNomi = new JButtonMe();
		this.jButtonProcesarInformacionTipoConstanteNomi.setText("Procesar");
		this.jButtonProcesarInformacionTipoConstanteNomi.setToolTipText("Procesar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoConstanteNomi.setVisible(false);
			
		this.jButtonProcesarInformacionTipoConstanteNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoConstanteNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoConstanteNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoConstanteNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoConstanteNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoConstanteNomi.setText("TIPO");       
		this.jComboBoxTiposReportesTipoConstanteNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoConstanteNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoConstanteNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoConstanteNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoConstanteNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoConstanteNomi.setText("Accion");
		this.jComboBoxTiposRelacionesTipoConstanteNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoConstanteNomi.setText("Accion");
		this.jComboBoxTiposAccionesTipoConstanteNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoConstanteNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoConstanteNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoConstanteNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoConstanteNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoConstanteNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoConstanteNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoConstanteNomi = new JLabelMe();
		
		this.jLabelAccionesTipoConstanteNomi.setText("Acciones");		
		this.jLabelAccionesTipoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoConstanteNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoConstanteNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoConstanteNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoConstanteNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoConstanteNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoConstanteNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoConstanteNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoConstanteNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoConstanteNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoConstanteNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoConstanteNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoConstanteNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoConstanteNomi = new JButtonMe();
		//this.jButtonAnterioresTipoConstanteNomi.setText("<<");
        this.jButtonAnterioresTipoConstanteNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoConstanteNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoConstanteNomi = new JButtonMe();
		//this.jButtonSiguientesTipoConstanteNomi.setText(">>");
        this.jButtonSiguientesTipoConstanteNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoConstanteNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoConstanteNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoConstanteNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoConstanteNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoConstanteNomi,"nuevoguardarcambios_button","Nue",this.tipoconstantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoConstanteNomi";
		inputMap = this.jButtonNuevoGuardarCambiosTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoConstanteNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoConstanteNomi";
		inputMap = this.jButtonRecargarInformacionTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoConstanteNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoConstanteNomi";
		inputMap = this.jButtonSiguientesTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoConstanteNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoConstanteNomi";
		inputMap = this.jButtonAnterioresTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoConstanteNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoConstanteNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoConstanteNomi.setMinimumSize(new Dimension(this.getWidth(),TipoConstanteNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoConstanteNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoConstanteNomi.setMaximumSize(new Dimension(this.getWidth(),TipoConstanteNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoConstanteNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoConstanteNomi.setPreferredSize(new Dimension(this.getWidth(),TipoConstanteNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoConstanteNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoConstanteNomi = new GridBagLayout();

			this.jPanelPaginacionTipoConstanteNomi.setLayout(gridaBagLayoutPaginacionTipoConstanteNomi);						
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.gridy = 0;
			this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoConstanteNomi.add(this.jButtonAnterioresTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
					
						
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoConstanteNomi.gridy = 0;
			
			this.jPanelPaginacionTipoConstanteNomi.add(this.jButtonNuevoGuardarCambiosTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
						
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoConstanteNomi.gridy = 0;
			this.jPanelPaginacionTipoConstanteNomi.add(this.jButtonSiguientesTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.gridy = 1;
			this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConstanteNomi.add(this.jButtonNuevoTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoConstanteNomi.gridy = 1;
				this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoConstanteNomi.add(this.jButtonNuevoRelacionesTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
			}
			
			
			if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoConstanteNomi.gridy = 1;
				this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoConstanteNomi.add(this.jButtonGuardarCambiosTablaTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
			}
			
			
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.gridy = 1;
			this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConstanteNomi.add(this.jButtonDuplicarTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.gridy = 1;
			this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConstanteNomi.add(this.jButtonCopiarTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.gridy = 1;
			this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoConstanteNomi.add(this.jButtonVerFormTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.gridy = 1;
			this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoConstanteNomi.add(this.jButtonCerrarTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		
		
		
		this.jButtonRecargarInformacionTipoConstanteNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoConstanteNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoConstanteNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoConstanteNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoConstanteNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoConstanteNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoConstanteNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoConstanteNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoConstanteNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoConstanteNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoConstanteNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoConstanteNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoConstanteNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoConstanteNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoConstanteNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoConstanteNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoConstanteNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoConstanteNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoConstanteNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConstanteNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConstanteNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoConstanteNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoConstanteNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoConstanteNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoConstanteNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoConstanteNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoConstanteNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoConstanteNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoConstanteNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoConstanteNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoConstanteNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoConstanteNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoConstanteNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoConstanteNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoConstanteNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoConstanteNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoConstanteNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoConstanteNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoConstanteNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoConstanteNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoConstanteNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoConstanteNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoConstanteNomi.setLayout(gridaBagParametrosReportesTipoConstanteNomi);
			this.jPanelParametrosReportesAccionesTipoConstanteNomi.setLayout(gridaBagParametrosReportesAccionesTipoConstanteNomi);
			
			
			this.jPanelParametrosAuxiliar1TipoConstanteNomi.setLayout(gridaBagParametrosAuxiliar1TipoConstanteNomi);
			this.jPanelParametrosAuxiliar2TipoConstanteNomi.setLayout(gridaBagParametrosAuxiliar2TipoConstanteNomi);
			this.jPanelParametrosAuxiliar3TipoConstanteNomi.setLayout(gridaBagParametrosAuxiliar3TipoConstanteNomi);
			this.jPanelParametrosAuxiliar4TipoConstanteNomi.setLayout(gridaBagParametrosAuxiliar4TipoConstanteNomi);
			//this.jPanelParametrosAuxiliar5TipoConstanteNomi.setLayout(gridaBagParametrosAuxiliar2TipoConstanteNomi);			
			
			
			
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConstanteNomi.add(this.jButtonRecargarInformacionTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoConstanteNomi.add(this.jComboBoxTiposPaginacionTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoConstanteNomi.add(this.jCheckBoxConAltoMaximoTablaTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoConstanteNomi.add(this.jComboBoxTiposArchivosReportesTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConstanteNomi.add(this.jPanelParametrosAuxiliar1TipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoConstanteNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoConstanteNomi.add(this.jComboBoxTiposReportesTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConstanteNomi.add(this.jPanelParametrosAuxiliar4TipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConstanteNomi.add(this.jComboBoxTiposReportesTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoConstanteNomi.add(this.jCheckBoxGenerarReporteTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConstanteNomi.add(this.jPanelParametrosAuxiliar2TipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoConstanteNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoConstanteNomi.add(this.jLabelAccionesTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
				this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoConstanteNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoConstanteNomi.add(this.jButtonAbrirOrderByTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConstanteNomi.add(this.jComboBoxTiposSeleccionarTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);			
			
			
			/*
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoConstanteNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoConstanteNomi.add(this.jCheckBoxSeleccionarTodosTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoConstanteNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoConstanteNomi.add(this.jCheckBoxSeleccionarTodosTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);															
				
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoConstanteNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoConstanteNomi.add(this.jCheckBoxSeleccionadosTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoConstanteNomi.add(this.jPanelParametrosAuxiliar3TipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConstanteNomi.add(this.jComboBoxTiposRelacionesTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
				
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConstanteNomi.add(this.jComboBoxTiposAccionesTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
	
				
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoConstanteNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoConstanteNomi.add(this.jTextFieldValorCampoGeneralTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoConstanteNomi = new GridBagLayout();

			this.jScrollPanelDatosTipoConstanteNomi.setLayout(gridaBagLayoutDatosTipoConstanteNomi);
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.gridy = 0;
			this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
			
			this.jScrollPanelDatosTipoConstanteNomi.add(this.jTableDatosTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoConstanteNomi.setViewportView(this.jTableDatosTipoConstanteNomi);
		this.jTableDatosTipoConstanteNomi.setFillsViewportHeight(true);
		this.jTableDatosTipoConstanteNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoConstanteNomi= new GridBagLayout();
		this.jPanelAccionesTipoConstanteNomi.setLayout(gridaBagLayoutAccionesTipoConstanteNomi);
		
		
		/*	
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = 0;
		this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
			
		this.jPanelAccionesTipoConstanteNomi.add(this.jButtonNuevoTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoConstanteNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoConstanteNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();						
			this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoConstanteNomi.gridx = 0;		
			//this.gridBagConstraintsTipoConstanteNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoConstanteNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoConstanteNomi.gridx = 0;		
		//this.gridBagConstraintsTipoConstanteNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConstanteNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoConstanteNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoConstanteNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);								
		
		
		/*
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		*/		
		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoConstanteNomi.gridx =0;
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoConstanteNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
				
		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoConstanteNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoConstanteNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoConstanteNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoConstanteNomi.setLayout(gridaBagLayoutBusquedasParametrosTipoConstanteNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoConstanteNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoConstanteNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConstanteNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConstanteNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
			
			
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		
			
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoConstanteNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoConstanteNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoConstanteNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoConstanteNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoConstanteNomi.setName("jPanelReporteDinamicoTipoConstanteNomi"); 
		
		this.jPanelReporteDinamicoTipoConstanteNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoConstanteNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoConstanteNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoConstanteNomi.setLayout(gridaBagLayoutReporteDinamicoTipoConstanteNomi);
		
		
		this.jInternalFrameReporteDinamicoTipoConstanteNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoConstanteNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoConstanteNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoConstanteNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoConstanteNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoConstanteNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoConstanteNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoConstanteNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoConstanteNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoConstanteNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoConstanteNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoConstanteNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoConstanteNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoConstanteNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Constantes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoConstanteNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoConstanteNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoConstanteNomi.add(this.jLabelColumnasSelectReporteTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoConstanteNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoConstanteNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoConstanteNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoConstanteNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoConstanteNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoConstanteNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoConstanteNomi=new JScrollPane(this.jListColumnasSelectReporteTipoConstanteNomi);
			
			this.jScrollColumnasSelectReporteTipoConstanteNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoConstanteNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoConstanteNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoConstanteNomi.add(this.jListColumnasSelectReporteTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		this.jPanelReporteDinamicoTipoConstanteNomi.add(this.jScrollColumnasSelectReporteTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoConstanteNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoConstanteNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoConstanteNomi.add(this.jLabelRelacionesSelectReporteTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoConstanteNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoConstanteNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoConstanteNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoConstanteNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoConstanteNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoConstanteNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoConstanteNomi=new JScrollPane(this.jListRelacionesSelectReporteTipoConstanteNomi);
			
			this.jScrollRelacionesSelectReporteTipoConstanteNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoConstanteNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoConstanteNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoConstanteNomi.add(this.jListRelacionesSelectReporteTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		this.jPanelReporteDinamicoTipoConstanteNomi.add(this.jScrollRelacionesSelectReporteTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoConstanteNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoConstanteNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoConstanteNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoConstanteNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoConstanteNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoConstanteNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoConstanteNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoConstanteNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoConstanteNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoConstanteNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoConstanteNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoConstanteNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoConstanteNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoConstanteNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoConstanteNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoConstanteNomi.add(this.jLabelGenerarExcelReporteDinamicoTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoConstanteNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoConstanteNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoConstanteNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoConstanteNomi.setToolTipText("Generar EXCEL"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		//this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoConstanteNomi.add(this.jButtonGenerarExcelReporteDinamicoTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConstanteNomi.add(this.jComboBoxTiposReportesDinamicoTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoConstanteNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoConstanteNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoConstanteNomi.add(this.jLabelTiposArchivoReporteDinamicoTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConstanteNomi.add(this.jComboBoxTiposArchivosReportesDinamicoTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoConstanteNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoConstanteNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoConstanteNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoConstanteNomi.setToolTipText("Generar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConstanteNomi.add(this.jButtonGenerarReporteDinamicoTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoConstanteNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoConstanteNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoConstanteNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoConstanteNomi.setToolTipText("Cancelar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoConstanteNomi.add(this.jButtonCerrarReporteDinamicoTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoConstanteNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoConstanteNomi= new JScrollPane(jPanelReporteDinamicoTipoConstanteNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoConstanteNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoConstanteNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoConstanteNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Constantes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoConstanteNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoConstanteNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoConstanteNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoConstanteNomi);
		this.jInternalFrameReporteDinamicoTipoConstanteNomi.getContentPane().add(this.jScrollPanelReporteDinamicoTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoConstanteNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoConstanteNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoConstanteNomi.setName("jPanelImportacionTipoConstanteNomi"); 
		
		this.jPanelImportacionTipoConstanteNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoConstanteNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoConstanteNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoConstanteNomi.setLayout(gridaBagLayoutImportacionTipoConstanteNomi);
		
		
		this.jInternalFrameImportacionTipoConstanteNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoConstanteNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoConstanteNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoConstanteNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoConstanteNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoConstanteNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoConstanteNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoConstanteNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoConstanteNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoConstanteNomi.setResizable(true);
	    this.jInternalFrameImportacionTipoConstanteNomi.setClosable(true);
	    this.jInternalFrameImportacionTipoConstanteNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoConstanteNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoConstanteNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoConstanteNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoConstanteNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoConstanteNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoConstanteNomi.setResizable(true);
	    this.jInternalFrameImportacionTipoConstanteNomi.setClosable(true);
	    this.jInternalFrameImportacionTipoConstanteNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoConstanteNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoConstanteNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoConstanteNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Constantes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoConstanteNomi = new JLabelMe();

		this.jLabelArchivoImportacionTipoConstanteNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoConstanteNomi.add(this.jLabelArchivoImportacionTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoConstanteNomi = new JFileChooser();		
		this.jFileChooserImportacionTipoConstanteNomi.setToolTipText("ESCOGER ARCHIVO"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoConstanteNomi = new JButtonMe();
		this.jButtonAbrirImportacionTipoConstanteNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoConstanteNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoConstanteNomi.setToolTipText("Generar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConstanteNomi.add(this.jButtonAbrirImportacionTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoConstanteNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoConstanteNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoConstanteNomi.add(this.jLabelPathArchivoImportacionTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoConstanteNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoConstanteNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoConstanteNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoConstanteNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConstanteNomi.add(this.jTextFieldPathArchivoImportacionTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoConstanteNomi = new JButtonMe();
		this.jButtonGenerarImportacionTipoConstanteNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoConstanteNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoConstanteNomi.setToolTipText("Generar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConstanteNomi.add(this.jButtonGenerarImportacionTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoConstanteNomi = new JButtonMe();
		this.jButtonCerrarImportacionTipoConstanteNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoConstanteNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoConstanteNomi.setToolTipText("Cancelar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoConstanteNomi.add(this.jButtonCerrarImportacionTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoConstanteNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoConstanteNomi= new JScrollPane(jPanelImportacionTipoConstanteNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsTipoConstanteNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoConstanteNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoConstanteNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoConstanteNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoConstanteNomi);
		this.jInternalFrameImportacionTipoConstanteNomi.getContentPane().add(this.jScrollPanelImportacionTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoConstanteNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoConstanteNomi = new JButtonMe();
			this.jButtonAbrirOrderByTipoConstanteNomi.setText("Orden");
			this.jButtonAbrirOrderByTipoConstanteNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoConstanteNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoConstanteNomi";
			inputMap = this.jButtonAbrirOrderByTipoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoConstanteNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoConstanteNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoConstanteNomi.setName("jPanelOrderByTipoConstanteNomi"); 
			
			this.jPanelOrderByTipoConstanteNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoConstanteNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoConstanteNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoConstanteNomi.setLayout(gridaBagLayoutOrderByTipoConstanteNomi);
			
			
			this.jTableDatosTipoConstanteNomiOrderBy = new JTableMe();        
			this.jTableDatosTipoConstanteNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoConstanteNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoConstanteNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoConstanteNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoConstanteNomiOrderBy.setViewportView(this.jTableDatosTipoConstanteNomiOrderBy);
			this.jTableDatosTipoConstanteNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoConstanteNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoConstanteNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoConstanteNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoConstanteNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoConstanteNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoConstanteNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoConstanteNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoConstanteNomi.setTitle("Orden");
			this.jInternalFrameOrderByTipoConstanteNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoConstanteNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoConstanteNomi.setResizable(true);
			this.jInternalFrameOrderByTipoConstanteNomi.setClosable(true);
			this.jInternalFrameOrderByTipoConstanteNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoConstanteNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoConstanteNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoConstanteNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Constantes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoConstanteNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoConstanteNomi.ipady =150;
				
			this.jPanelOrderByTipoConstanteNomi.add(jScrollPanelDatosTipoConstanteNomiOrderBy, this.gridBagConstraintsTipoConstanteNomi);//this.jTableDatosTipoConstanteNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoConstanteNomi = new JButtonMe();
			this.jButtonCerrarOrderByTipoConstanteNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoConstanteNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoConstanteNomi.setToolTipText("Cancelar"+" "+TipoConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConstanteNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoConstanteNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoConstanteNomi.add(this.jButtonCerrarOrderByTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoConstanteNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoConstanteNomi= new JScrollPane(jPanelOrderByTipoConstanteNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsTipoConstanteNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoConstanteNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoConstanteNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoConstanteNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoConstanteNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoConstanteNomi);
			
			this.jInternalFrameOrderByTipoConstanteNomi.getContentPane().add(this.jScrollPanelOrderByTipoConstanteNomi, this.gridBagConstraintsTipoConstanteNomi);			
		
		} else {
			this.jButtonAbrirOrderByTipoConstanteNomi = new JButtonMe();
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
			&& this.tipoconstantenomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoConstanteNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoConstanteNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoConstanteNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoConstanteNomi.getRowHeight();//TipoConstanteNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoConstanteNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoConstanteNomi.isSelected()) {
					iHeightTable=TipoConstanteNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoConstanteNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoConstanteNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoConstanteNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoConstanteNomi.isSelected()) {
					iHeightTable=TipoConstanteNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoConstanteNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoConstanteNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoConstanteNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoConstanteNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoConstanteNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoConstanteNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoConstanteNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoConstanteNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoConstanteNomi!=null && this.jInternalFrameOrderByTipoConstanteNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoconstantenomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoConstanteNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoConstanteNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoConstanteNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoConstanteNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoConstanteNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoConstanteNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoConstanteNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoConstanteNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoConstanteNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoConstanteNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoconstantenomiLogic.getTipoConstanteNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoconstantenomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoConstanteNomi> TraerTipoConstanteNomiBeans(List<TipoConstanteNomi> tipoconstantenomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoConstanteNomi tipoconstantenomi:tipoconstantenomis) {
					
				if(!(TipoConstanteNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoConstanteNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoconstantenomi.setsDetalleGeneralEntityReporte(TipoConstanteNomiConstantesFunciones.getTipoConstanteNomiDescripcion(tipoconstantenomi));
										
						
					
					

					if(tipoconstantenomi.getConstanteNomis()!=null && Funciones.existeClass(classes,ConstanteNomi.class)) {
						try{tipoconstantenomi.setconstantenomisDescripcionReporte(new JRBeanCollectionDataSource(ConstanteNomiJInternalFrame.TraerConstanteNomiBeans(tipoconstantenomi.getConstanteNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoconstantenomi.setsDetalleGeneralEntityReporte(tipoconstantenomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoconstantenomibeans.add(tipoconstantenomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoconstantenomis;
    }
	//PARA REPORTES FIN
}
