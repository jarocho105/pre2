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
import com.bydan.erp.nomina.util.TipoLibretaMiliConstantesFunciones;

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
public class TipoLibretaMiliJInternalFrame extends TipoLibretaMiliBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoLibretaMili;
	
	protected JMenuBar jmenuBarTipoLibretaMili;
	
	protected JMenu jmenuTipoLibretaMili;
	protected JMenu jmenuDatosTipoLibretaMili;
	protected JMenu jmenuArchivoTipoLibretaMili;
	protected JMenu jmenuAccionesTipoLibretaMili;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoLibretaMili = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoLibretaMili;	
	protected GridBagConstraints gridBagConstraintsTipoLibretaMili;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoLibretaMiliDetalleFormJInternalFrame jInternalFrameDetalleFormTipoLibretaMili;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoLibretaMili;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoLibretaMili;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoLibretaMiliSessionBean tipolibretamiliSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoLibretaMili> tipolibretamilis;		
	public List<TipoLibretaMili> tipolibretamilisEliminados;	
	public List<TipoLibretaMili> tipolibretamilisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoLibretaMili;		
	protected JButton jButtonAbrirOrderByTipoLibretaMili;
	
	
	//protected JPanel jPanelOrderByTipoLibretaMili;
	//public JScrollPane jScrollPanelOrderByTipoLibretaMili;	
	//protected JButton jButtonCerrarOrderByTipoLibretaMili;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoLibretaMiliLogic tipolibretamiliLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoLibretaMili;
	public JScrollPane jScrollPanelDatosEdicionTipoLibretaMili;
	public JScrollPane jScrollPanelDatosGeneralTipoLibretaMili;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoLibretaMiliOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoLibretaMili;
	//public JScrollPane jScrollPanelImportacionTipoLibretaMili;
	
	
	
	protected JPanel jPanelAccionesTipoLibretaMili;
	
    protected JPanel jPanelPaginacionTipoLibretaMili;
    protected JPanel jPanelParametrosReportesTipoLibretaMili;
	protected JPanel jPanelParametrosReportesAccionesTipoLibretaMili;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoLibretaMili;
	protected JPanel jPanelParametrosAuxiliar2TipoLibretaMili;
	protected JPanel jPanelParametrosAuxiliar3TipoLibretaMili;
	protected JPanel jPanelParametrosAuxiliar4TipoLibretaMili;
	//protected JPanel jPanelParametrosAuxiliar5TipoLibretaMili;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoLibretaMili;
	//protected JPanel jPanelImportacionTipoLibretaMili;
	
	
	public JTable jTableDatosTipoLibretaMili;
	
	
	
	//public JTable jTableDatosTipoLibretaMiliOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoLibretaMili;
	protected JButton jButtonDuplicarTipoLibretaMili;
	protected JButton jButtonCopiarTipoLibretaMili;
	protected JButton jButtonVerFormTipoLibretaMili;
	protected JButton jButtonNuevoRelacionesTipoLibretaMili;
	protected JButton jButtonModificarTipoLibretaMili;
	
    protected JButton jButtonGuardarCambiosTablaTipoLibretaMili;
	protected JButton jButtonCerrarTipoLibretaMili;
	
	
	protected JButton jButtonRecargarInformacionTipoLibretaMili;
	protected JButton jButtonProcesarInformacionTipoLibretaMili;
	
	
	protected JButton jButtonAnterioresTipoLibretaMili;
	protected JButton jButtonSiguientesTipoLibretaMili;
	protected JButton jButtonNuevoGuardarCambiosTipoLibretaMili;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoLibretaMili;
	//protected JButton jButtonCerrarReporteDinamicoTipoLibretaMili;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoLibretaMili;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoLibretaMili;
	//protected JButton jButtonGenerarImportacionTipoLibretaMili;
	//protected JButton jButtonCerrarImportacionTipoLibretaMili;
	//protected JFileChooser jFileChooserImportacionTipoLibretaMili;
	//protected File fileImportacionTipoLibretaMili;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoLibretaMili;
	protected JButton jButtonDuplicarToolBarTipoLibretaMili;
	protected JButton jButtonNuevoRelacionesToolBarTipoLibretaMili;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoLibretaMili;
	protected JButton jButtonCopiarToolBarTipoLibretaMili;
	protected JButton jButtonVerFormToolBarTipoLibretaMili;
	public JButton jButtonGuardarCambiosTablaToolBarTipoLibretaMili;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoLibretaMili;
	protected JButton jButtonCerrarToolBarTipoLibretaMili;
	
	protected JButton jButtonRecargarInformacionToolBarTipoLibretaMili;
	protected JButton jButtonProcesarInformacionToolBarTipoLibretaMili;
	protected JButton jButtonAnterioresToolBarTipoLibretaMili;
	protected JButton jButtonSiguientesToolBarTipoLibretaMili;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoLibretaMili;
	protected JButton jButtonAbrirOrderByToolBarTipoLibretaMili;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoLibretaMili;
	protected JMenuItem jMenuItemDuplicarTipoLibretaMili;
	protected JMenuItem jMenuItemNuevoRelacionesTipoLibretaMili;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoLibretaMili;
	protected JMenuItem jMenuItemCopiarTipoLibretaMili;
	protected JMenuItem jMenuItemVerFormTipoLibretaMili;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoLibretaMili;
	protected JMenuItem jMenuItemCerrarTipoLibretaMili;
	protected JMenuItem jMenuItemDetalleCerrarTipoLibretaMili;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoLibretaMili;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoLibretaMili;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoLibretaMili;
	protected JMenuItem jMenuItemProcesarInformacionTipoLibretaMili;
	protected JMenuItem jMenuItemAnterioresTipoLibretaMili;
	protected JMenuItem jMenuItemSiguientesTipoLibretaMili;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoLibretaMili;
	protected JMenuItem jMenuItemAbrirOrderByTipoLibretaMili;
	protected JMenuItem jMenuItemMostrarOcultarTipoLibretaMili;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoLibretaMili;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoLibretaMili;
	protected JCheckBox jCheckBoxSeleccionadosTipoLibretaMili;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoLibretaMili;
	protected JCheckBox jCheckBoxConGraficoReporteTipoLibretaMili;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoLibretaMili;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoLibretaMili;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoLibretaMili;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoLibretaMili;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoLibretaMili;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoLibretaMili;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoLibretaMili;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoLibretaMili;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoLibretaMili;
	protected JTextField jTextFieldValorCampoGeneralTipoLibretaMili;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoLibretaMili;
	//public JList<Reporte> jListColumnasSelectReporteTipoLibretaMili;
	//public JScrollPane jScrollColumnasSelectReporteTipoLibretaMili;
	
	//public JLabel jLabelRelacionesSelectReporteTipoLibretaMili;
	//public JList<Reporte> jListRelacionesSelectReporteTipoLibretaMili;
	//public JScrollPane jScrollRelacionesSelectReporteTipoLibretaMili;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoLibretaMili;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoLibretaMili;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoLibretaMili;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoLibretaMili;
	
		
	//public JLabel jLabelArchivoImportacionTipoLibretaMili;	
	//public JLabel jLabelPathArchivoImportacionTipoLibretaMili;
	//protected JTextField jTextFieldPathArchivoImportacionTipoLibretaMili;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoLibretaMili;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoLibretaMili;
	
	//public JLabel jLabelColumnaCategoriaValorTipoLibretaMili;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoLibretaMili;
	
	//public JLabel jLabelColumnasValoresGraficoTipoLibretaMili;
	//public JList<Reporte> jListColumnasValoresGraficoTipoLibretaMili;
	//public JScrollPane jScrollColumnasValoresGraficoTipoLibretaMili;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoLibretaMili;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoLibretaMili;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoLibretaMili;
	
	
	
	
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
	public TipoLibretaMiliJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoLibretaMili No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLibretaMiliJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLibretaMili No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLibretaMiliJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLibretaMili No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLibretaMiliJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoLibretaMili No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoLibretaMili)	{
		this.jButtonRecargarInformacionTipoLibretaMili = jButtonRecargarInformacionTipoLibretaMili;
	}
	
	public JButton getjButtonProcesarInformacionTipoLibretaMili() {
		return this.jButtonProcesarInformacionTipoLibretaMili;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoLibretaMili)	{
		this.jButtonProcesarInformacionTipoLibretaMili = jButtonProcesarInformacionTipoLibretaMili;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoLibretaMili() {
		return this.jButtonRecargarInformacionTipoLibretaMili;
	}
	
	
	public List<TipoLibretaMili> gettipolibretamilis() {
		return this.tipolibretamilis;
	}

	public void settipolibretamilis(List<TipoLibretaMili> tipolibretamilis) {
		this.tipolibretamilis = tipolibretamilis;
	}
	
	public List<TipoLibretaMili> gettipolibretamilisAux() {
		return this.tipolibretamilisAux;
	}

	public void settipolibretamilisAux(List<TipoLibretaMili> tipolibretamilisAux) {
		this.tipolibretamilisAux = tipolibretamilisAux;
	}
	
	public List<TipoLibretaMili> gettipolibretamilisEliminados() {
		return this.tipolibretamilisEliminados;
	}

	public void setTipoLibretaMilisEliminados(List<TipoLibretaMili> tipolibretamilisEliminados) {
		this.tipolibretamilisEliminados = tipolibretamilisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoLibretaMili() {
		return jComboBoxTiposSeleccionarTipoLibretaMili;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoLibretaMili(
			JComboBox jComboBoxTiposSeleccionarTipoLibretaMili) {
		this.jComboBoxTiposSeleccionarTipoLibretaMili = jComboBoxTiposSeleccionarTipoLibretaMili;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoLibretaMili() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoLibretaMili.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoLibretaMili .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoLibretaMili() {
		return jTextFieldValorCampoGeneralTipoLibretaMili;
	}

	public void setjTextFieldValorCampoGeneralTipoLibretaMili(
			JTextField jTextFieldValorCampoGeneralTipoLibretaMili) {
		this.jTextFieldValorCampoGeneralTipoLibretaMili = jTextFieldValorCampoGeneralTipoLibretaMili;
	}

	public void setBorderResaltarValorCampoGeneralTipoLibretaMili() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLibretaMili.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoLibretaMili .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoLibretaMili() {
		return this.jCheckBoxSeleccionarTodosTipoLibretaMili;
	}

	public void setjCheckBoxSeleccionarTodosTipoLibretaMili(
			JCheckBox jCheckBoxSeleccionarTodosTipoLibretaMili) {
		this.jCheckBoxSeleccionarTodosTipoLibretaMili = jCheckBoxSeleccionarTodosTipoLibretaMili;
	}

	public void setBorderResaltarSeleccionarTodosTipoLibretaMili() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLibretaMili.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoLibretaMili .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoLibretaMili() {
		return this.jCheckBoxSeleccionadosTipoLibretaMili;
	}

	public void setjCheckBoxSeleccionadosTipoLibretaMili(
			JCheckBox jCheckBoxSeleccionadosTipoLibretaMili) {
		this.jCheckBoxSeleccionadosTipoLibretaMili = jCheckBoxSeleccionadosTipoLibretaMili;
	}
	
	public void setBorderResaltarSeleccionadosTipoLibretaMili() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLibretaMili.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoLibretaMili .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoLibretaMili() {
		return this.jComboBoxTiposArchivosReportesTipoLibretaMili;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoLibretaMili(
			JComboBox jComboBoxTiposArchivosReportesTipoLibretaMili) {
		this.jComboBoxTiposArchivosReportesTipoLibretaMili = jComboBoxTiposArchivosReportesTipoLibretaMili;
	}

	public void setBorderResaltarTiposArchivosReportesTipoLibretaMili() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLibretaMili.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoLibretaMili .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoLibretaMili() {
		return this.jComboBoxTiposReportesTipoLibretaMili;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoLibretaMili(
			JComboBox jComboBoxTiposReportesTipoLibretaMili) {
		this.jComboBoxTiposReportesTipoLibretaMili = jComboBoxTiposReportesTipoLibretaMili;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoLibretaMili() {
	//	return jComboBoxTiposReportesDinamicoTipoLibretaMili;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoLibretaMili(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoLibretaMili) {
	//	this.jComboBoxTiposReportesDinamicoTipoLibretaMili = jComboBoxTiposReportesDinamicoTipoLibretaMili;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoLibretaMili() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoLibretaMili;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoLibretaMili(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoLibretaMili) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoLibretaMili = jComboBoxTiposArchivosReportesDinamicoTipoLibretaMili;
	//}
	
	public void setBorderResaltarTiposReportesTipoLibretaMili() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLibretaMili.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoLibretaMili .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoLibretaMili() {
		return this.jComboBoxTiposGraficosReportesTipoLibretaMili;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoLibretaMili(
			JComboBox jComboBoxTiposGraficosReportesTipoLibretaMili) {
		this.jComboBoxTiposGraficosReportesTipoLibretaMili = jComboBoxTiposGraficosReportesTipoLibretaMili;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoLibretaMili() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLibretaMili.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoLibretaMili .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoLibretaMili() {
		return this.jComboBoxTiposPaginacionTipoLibretaMili;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoLibretaMili(
			JComboBox jComboBoxTiposPaginacionTipoLibretaMili) {
		this.jComboBoxTiposPaginacionTipoLibretaMili = jComboBoxTiposPaginacionTipoLibretaMili;
	}
	
	public void setBorderResaltarTiposPaginacionTipoLibretaMili() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLibretaMili.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoLibretaMili .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoLibretaMili() {
		return this.jComboBoxTiposRelacionesTipoLibretaMili;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoLibretaMili() {
		return this.jComboBoxTiposAccionesTipoLibretaMili;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoLibretaMili(
			JComboBox jComboBoxTiposRelacionesTipoLibretaMili) {
		this.jComboBoxTiposRelacionesTipoLibretaMili = jComboBoxTiposRelacionesTipoLibretaMili;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoLibretaMili(
			JComboBox jComboBoxTiposAccionesTipoLibretaMili) {
		this.jComboBoxTiposAccionesTipoLibretaMili = jComboBoxTiposAccionesTipoLibretaMili;
	}
	
	public void setBorderResaltarTiposRelacionesTipoLibretaMili() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLibretaMili.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoLibretaMili .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoLibretaMili() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLibretaMili.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoLibretaMili .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoLibretaMili() {
	//	return jCheckBoxConGraficoDinamicoTipoLibretaMili;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoLibretaMili(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoLibretaMili) {
	//	this.jCheckBoxConGraficoDinamicoTipoLibretaMili = jCheckBoxConGraficoDinamicoTipoLibretaMili;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoLibretaMili() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoLibretaMili.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoLibretaMili .setBorder(borderResaltar);		
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
		this.tipolibretamiliSessionBean=new TipoLibretaMiliSessionBean();
		
		this.tipolibretamiliSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipolibretamiliSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipolibretamiliSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoLibretaMiliJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoLibretaMiliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoLibretaMiliJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoLibretaMiliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoLibretaMiliJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Libreta Mili MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoLibretaMiliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoLibretaMili No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoLibretaMili= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoLibretaMili,this.jTtoolBarTipoLibretaMili,
							"nuevo","nuevo","Nuevo"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoLibretaMili,this.jTtoolBarTipoLibretaMili,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoLibretaMili,this.jTtoolBarTipoLibretaMili,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoLibretaMili,this.jTtoolBarTipoLibretaMili,
							"duplicar","duplicar","Duplicar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoLibretaMili,this.jTtoolBarTipoLibretaMili,
							"copiar","copiar","Copiar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoLibretaMili,this.jTtoolBarTipoLibretaMili,
							"ver_form","ver_form","Ver"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoLibretaMili,this.jTtoolBarTipoLibretaMili,
							"recargar","recargar","Recargar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoLibretaMili,this.jTtoolBarTipoLibretaMili,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoLibretaMili,this.jTtoolBarTipoLibretaMili,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoLibretaMili,this.jTtoolBarTipoLibretaMili,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoLibretaMili,this.jTtoolBarTipoLibretaMili,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoLibretaMili,this.jTtoolBarTipoLibretaMili,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoLibretaMili=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoLibretaMili,this.jTtoolBarTipoLibretaMili,
							"cerrar","cerrar","Salir"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoLibretaMili=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoLibretaMili;
			
				this.jButtonProcesarInformacionToolBarTipoLibretaMili=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoLibretaMili;
				
		//protected JButton jButtonModificarToolBarTipoLibretaMili;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoLibretaMili=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoLibretaMili=new JMenuMe("General");
		this.jmenuArchivoTipoLibretaMili=new JMenuMe("Archivo");
		this.jmenuAccionesTipoLibretaMili=new JMenuMe("Acciones");
		this.jmenuDatosTipoLibretaMili=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoLibretaMili= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoLibretaMili.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoLibretaMili,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoLibretaMili= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoLibretaMili.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoLibretaMili,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoLibretaMili= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoLibretaMili.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoLibretaMili,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoLibretaMili= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoLibretaMili.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoLibretaMili,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoLibretaMili= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoLibretaMili.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoLibretaMili,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoLibretaMili= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoLibretaMili.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoLibretaMili,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoLibretaMili= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoLibretaMili.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoLibretaMili,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoLibretaMili= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoLibretaMili.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoLibretaMili,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoLibretaMili= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoLibretaMili.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoLibretaMili,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoLibretaMili= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoLibretaMili.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoLibretaMili,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoLibretaMili= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoLibretaMili.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoLibretaMili,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoLibretaMili= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoLibretaMili.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoLibretaMili,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoLibretaMili= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoLibretaMili.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoLibretaMili,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoLibretaMili= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoLibretaMili.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoLibretaMili,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoLibretaMili= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoLibretaMili.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoLibretaMili,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoLibretaMili= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoLibretaMili.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoLibretaMili,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoLibretaMili= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoLibretaMili.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoLibretaMili,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoLibretaMili.add(this.jMenuItemCerrarTipoLibretaMili);
			
			this.jmenuAccionesTipoLibretaMili.add(this.jMenuItemNuevoTipoLibretaMili);
			this.jmenuAccionesTipoLibretaMili.add(this.jMenuItemNuevoGuardarCambiosTipoLibretaMili);
			this.jmenuAccionesTipoLibretaMili.add(this.jMenuItemNuevoRelacionesTipoLibretaMili);
			this.jmenuAccionesTipoLibretaMili.add(this.jMenuItemGuardarCambiosTablaTipoLibretaMili);		
			this.jmenuAccionesTipoLibretaMili.add(this.jMenuItemDuplicarTipoLibretaMili);		
			this.jmenuAccionesTipoLibretaMili.add(this.jMenuItemCopiarTipoLibretaMili);		
			this.jmenuAccionesTipoLibretaMili.add(this.jMenuItemVerFormTipoLibretaMili);		
			
			this.jmenuDatosTipoLibretaMili.add(this.jMenuItemRecargarInformacionTipoLibretaMili);				
			this.jmenuDatosTipoLibretaMili.add(this.jMenuItemAnterioresTipoLibretaMili);				
			this.jmenuDatosTipoLibretaMili.add(this.jMenuItemSiguientesTipoLibretaMili);				
			this.jmenuDatosTipoLibretaMili.add(this.jMenuItemAbrirOrderByTipoLibretaMili);				
			this.jmenuDatosTipoLibretaMili.add(this.jMenuItemMostrarOcultarTipoLibretaMili);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoLibretaMili.add(this.jMenuItemGuardarCambiosTipoLibretaMili);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoLibretaMili.add(this.jmenuArchivoTipoLibretaMili);		
			this.jmenuBarTipoLibretaMili.add(this.jmenuAccionesTipoLibretaMili);		
			this.jmenuBarTipoLibretaMili.add(this.jmenuDatosTipoLibretaMili);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoLibretaMili);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoLibretaMili() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoLibretaMili=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoLibretaMili.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoLibretaMili.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoLibretaMili.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoLibretaMili.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoLibretaMili,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoLibretaMili = new TipoLibretaMiliDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Libreta Mili DATOS");
			this.jInternalFrameDetalleFormTipoLibretaMili = new TipoLibretaMiliDetalleFormJInternalFrame(jDesktopPane,this.tipolibretamiliSessionBean.getConGuardarRelaciones(),this.tipolibretamiliSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoLibretaMili = null;//new TipoLibretaMiliDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoLibretaMili= new GridBagLayout();
		
		
		this.jTableDatosTipoLibretaMili = new JTableMe();      
		
		String sToolTipTipoLibretaMili="";
		sToolTipTipoLibretaMili=TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoLibretaMili+="(Nomina.TipoLibretaMili)";
		}
		
		if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoLibretaMili+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoLibretaMili.setToolTipText(sToolTipTipoLibretaMili);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoLibretaMili);
		this.jTableDatosTipoLibretaMili.setAutoCreateRowSorter(true);
		this.jTableDatosTipoLibretaMili.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoLibretaMili.setRowSelectionAllowed(true);
		this.jTableDatosTipoLibretaMili.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoLibretaMili,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoLibretaMili = new JButtonMe();
		this.jButtonDuplicarTipoLibretaMili = new JButtonMe();
		this.jButtonCopiarTipoLibretaMili = new JButtonMe();
		this.jButtonVerFormTipoLibretaMili = new JButtonMe();
		this.jButtonNuevoRelacionesTipoLibretaMili = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoLibretaMili = new JButtonMe();
		this.jButtonCerrarTipoLibretaMili = new JButtonMe();
		
		this.jScrollPanelDatosTipoLibretaMili = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoLibretaMili = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoLibretaMili = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Libreta Mili";
		
		if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Libreta Milis" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoLibretaMili.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoLibretaMili.setToolTipText("Acciones");
        this.jPanelAccionesTipoLibretaMili.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoLibretaMili=new ReporteDinamicoJInternalFrame(TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoLibretaMili();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoLibretaMili=new ImportacionJInternalFrame(TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoLibretaMili();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoLibretaMili = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoLibretaMili.setText("Orden");
		this.jButtonAbrirOrderByTipoLibretaMili.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoLibretaMili,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoLibretaMili.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoLibretaMili=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLibretaMili,false,this);
			
			//this.cargarOrderByTipoLibretaMili(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoLibretaMili=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLibretaMili,true,this);
			
			//this.cargarOrderByTipoLibretaMili(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoLibretaMili.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoLibretaMili.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoLibretaMili.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoLibretaMili.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoLibretaMili.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoLibretaMili.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoLibretaMili.setText("Nuevo");
		this.jButtonDuplicarTipoLibretaMili.setText("Duplicar");
		this.jButtonCopiarTipoLibretaMili.setText("Copiar");
		this.jButtonVerFormTipoLibretaMili.setText("Ver");
		this.jButtonNuevoRelacionesTipoLibretaMili.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoLibretaMili.setText("Guardar");
		this.jButtonCerrarTipoLibretaMili.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoLibretaMili,"nuevo_button","Nuevo",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoLibretaMili,"duplicar_button","Duplicar",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoLibretaMili,"copiar_button","Copiar",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoLibretaMili,"ver_form","Ver",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoLibretaMili,"nuevorelaciones_button","Nuevo Rel",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoLibretaMili,"guardarcambiostabla_button","Guardar",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoLibretaMili,"cerrar_button","Salir",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoLibretaMili.setToolTipText("Nuevo"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoLibretaMili.setToolTipText("Duplicar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoLibretaMili.setToolTipText("Copiar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoLibretaMili.setToolTipText("Ver"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoLibretaMili.setToolTipText("Nuevo Rel"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoLibretaMili.setToolTipText("Guardar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoLibretaMili.setToolTipText("Salir"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoLibretaMili";
		inputMap = this.jButtonNuevoTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoLibretaMili.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoLibretaMili"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoLibretaMili";
		inputMap = this.jButtonDuplicarTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoLibretaMili.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoLibretaMili"));
		
		//COPIAR
		sMapKey = "CopiarTipoLibretaMili";
		inputMap = this.jButtonCopiarTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoLibretaMili.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoLibretaMili"));
		
		//VEr FORM
		sMapKey = "VerFormTipoLibretaMili";
		inputMap = this.jButtonVerFormTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoLibretaMili.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoLibretaMili"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoLibretaMili";
		inputMap = this.jButtonNuevoRelacionesTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoLibretaMili.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoLibretaMili"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoLibretaMili";
		inputMap = this.jButtonModificarTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoLibretaMili.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoLibretaMili"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoLibretaMili";
		inputMap = this.jButtonCerrarTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoLibretaMili.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoLibretaMili"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoLibretaMili";
		inputMap = this.jButtonGuardarCambiosTablaTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoLibretaMili.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoLibretaMili"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoLibretaMili = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoLibretaMili = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoLibretaMili = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoLibretaMili= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoLibretaMili= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoLibretaMili= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoLibretaMili= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoLibretaMili= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoLibretaMili.setName("jPanelParametrosReportesTipoLibretaMili"); 
		
		this.jPanelParametrosReportesAccionesTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoLibretaMili.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoLibretaMili.setName("jPanelParametrosReportesAccionesTipoLibretaMili"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoLibretaMili = new JButtonMe();
		this.jButtonRecargarInformacionTipoLibretaMili.setText("Recargar");
		this.jButtonRecargarInformacionTipoLibretaMili.setToolTipText("Recargar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoLibretaMili,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoLibretaMili = new JButtonMe();
		this.jButtonProcesarInformacionTipoLibretaMili.setText("Procesar");
		this.jButtonProcesarInformacionTipoLibretaMili.setToolTipText("Procesar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoLibretaMili.setVisible(false);
			
		this.jButtonProcesarInformacionTipoLibretaMili.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoLibretaMili.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoLibretaMili.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoLibretaMili = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoLibretaMili.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoLibretaMili.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoLibretaMili = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoLibretaMili.setText("TIPO");       
		this.jComboBoxTiposReportesTipoLibretaMili.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoLibretaMili = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoLibretaMili.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoLibretaMili.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoLibretaMili = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoLibretaMili.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoLibretaMili.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoLibretaMili = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoLibretaMili.setText("Accion");
		this.jComboBoxTiposRelacionesTipoLibretaMili.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoLibretaMili = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoLibretaMili.setText("Accion");
		this.jComboBoxTiposAccionesTipoLibretaMili.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoLibretaMili = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoLibretaMili.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoLibretaMili.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoLibretaMili=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoLibretaMili.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoLibretaMili.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoLibretaMili.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoLibretaMili = new JLabelMe();
		
		this.jLabelAccionesTipoLibretaMili.setText("Acciones");		
		this.jLabelAccionesTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoLibretaMili = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoLibretaMili.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoLibretaMili.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoLibretaMili = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoLibretaMili.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoLibretaMili.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoLibretaMili = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoLibretaMili.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoLibretaMili.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoLibretaMili = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoLibretaMili.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoLibretaMili.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoLibretaMili = new JButtonMe();
		//this.jButtonAnterioresTipoLibretaMili.setText("<<");
        this.jButtonAnterioresTipoLibretaMili.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoLibretaMili,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoLibretaMili = new JButtonMe();
		//this.jButtonSiguientesTipoLibretaMili.setText(">>");
        this.jButtonSiguientesTipoLibretaMili.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoLibretaMili,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoLibretaMili = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoLibretaMili.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoLibretaMili.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoLibretaMili,"nuevoguardarcambios_button","Nue",this.tipolibretamiliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoLibretaMili";
		inputMap = this.jButtonNuevoGuardarCambiosTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoLibretaMili.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoLibretaMili"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoLibretaMili";
		inputMap = this.jButtonRecargarInformacionTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoLibretaMili.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoLibretaMili"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoLibretaMili";
		inputMap = this.jButtonSiguientesTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoLibretaMili.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoLibretaMili"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoLibretaMili";
		inputMap = this.jButtonAnterioresTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoLibretaMili.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoLibretaMili"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoLibretaMili();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoLibretaMili.setMinimumSize(new Dimension(this.getWidth(),TipoLibretaMiliBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoLibretaMiliBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoLibretaMili.setMaximumSize(new Dimension(this.getWidth(),TipoLibretaMiliBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoLibretaMiliBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoLibretaMili.setPreferredSize(new Dimension(this.getWidth(),TipoLibretaMiliBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoLibretaMiliBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoLibretaMili = new GridBagLayout();

			this.jPanelPaginacionTipoLibretaMili.setLayout(gridaBagLayoutPaginacionTipoLibretaMili);						
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.gridy = 0;
			this.gridBagConstraintsTipoLibretaMili.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoLibretaMili.add(this.jButtonAnterioresTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
					
						
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoLibretaMili.gridy = 0;
			
			this.jPanelPaginacionTipoLibretaMili.add(this.jButtonNuevoGuardarCambiosTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
						
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoLibretaMili.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoLibretaMili.gridy = 0;
			this.jPanelPaginacionTipoLibretaMili.add(this.jButtonSiguientesTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.gridy = 1;
			this.gridBagConstraintsTipoLibretaMili.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLibretaMili.add(this.jButtonNuevoTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
				this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoLibretaMili.gridy = 1;
				this.gridBagConstraintsTipoLibretaMili.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoLibretaMili.add(this.jButtonNuevoRelacionesTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
			}
			
			
			if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
				this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoLibretaMili.gridy = 1;
				this.gridBagConstraintsTipoLibretaMili.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoLibretaMili.add(this.jButtonGuardarCambiosTablaTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
			}
			
			
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.gridy = 1;
			this.gridBagConstraintsTipoLibretaMili.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLibretaMili.add(this.jButtonDuplicarTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.gridy = 1;
			this.gridBagConstraintsTipoLibretaMili.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLibretaMili.add(this.jButtonCopiarTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.gridy = 1;
			this.gridBagConstraintsTipoLibretaMili.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLibretaMili.add(this.jButtonVerFormTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.gridy = 1;
			this.gridBagConstraintsTipoLibretaMili.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoLibretaMili.add(this.jButtonCerrarTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		
		
		
		this.jButtonRecargarInformacionTipoLibretaMili.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoLibretaMili.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoLibretaMili.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoLibretaMili.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoLibretaMili.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoLibretaMili.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoLibretaMili.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoLibretaMili.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoLibretaMili.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoLibretaMili.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoLibretaMili.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoLibretaMili.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoLibretaMili.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoLibretaMili.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoLibretaMili.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoLibretaMili.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoLibretaMili.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoLibretaMili.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoLibretaMili.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLibretaMili.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLibretaMili.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoLibretaMili.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoLibretaMili.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoLibretaMili.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoLibretaMili.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoLibretaMili.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoLibretaMili.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoLibretaMili.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoLibretaMili.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoLibretaMili.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoLibretaMili.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoLibretaMili.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoLibretaMili.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoLibretaMili.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoLibretaMili.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoLibretaMili.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoLibretaMili = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoLibretaMili = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoLibretaMili = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoLibretaMili = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoLibretaMili = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoLibretaMili = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoLibretaMili.setLayout(gridaBagParametrosReportesTipoLibretaMili);
			this.jPanelParametrosReportesAccionesTipoLibretaMili.setLayout(gridaBagParametrosReportesAccionesTipoLibretaMili);
			
			
			this.jPanelParametrosAuxiliar1TipoLibretaMili.setLayout(gridaBagParametrosAuxiliar1TipoLibretaMili);
			this.jPanelParametrosAuxiliar2TipoLibretaMili.setLayout(gridaBagParametrosAuxiliar2TipoLibretaMili);
			this.jPanelParametrosAuxiliar3TipoLibretaMili.setLayout(gridaBagParametrosAuxiliar3TipoLibretaMili);
			this.jPanelParametrosAuxiliar4TipoLibretaMili.setLayout(gridaBagParametrosAuxiliar4TipoLibretaMili);
			//this.jPanelParametrosAuxiliar5TipoLibretaMili.setLayout(gridaBagParametrosAuxiliar2TipoLibretaMili);			
			
			
			
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLibretaMili.add(this.jButtonRecargarInformacionTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoLibretaMili.add(this.jComboBoxTiposPaginacionTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoLibretaMili.add(this.jCheckBoxConAltoMaximoTablaTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoLibretaMili.add(this.jComboBoxTiposArchivosReportesTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLibretaMili.add(this.jPanelParametrosAuxiliar1TipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoLibretaMili.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoLibretaMili.add(this.jComboBoxTiposReportesTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLibretaMili.add(this.jPanelParametrosAuxiliar4TipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLibretaMili.add(this.jComboBoxTiposReportesTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoLibretaMili.add(this.jCheckBoxGenerarReporteTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLibretaMili.add(this.jPanelParametrosAuxiliar2TipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoLibretaMili.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoLibretaMili.add(this.jLabelAccionesTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
				this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoLibretaMili.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoLibretaMili.add(this.jButtonAbrirOrderByTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLibretaMili.add(this.jComboBoxTiposSeleccionarTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);			
			
			
			/*
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoLibretaMili.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoLibretaMili.add(this.jCheckBoxSeleccionarTodosTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoLibretaMili.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoLibretaMili.add(this.jCheckBoxSeleccionarTodosTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);															
				
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoLibretaMili.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoLibretaMili.add(this.jCheckBoxSeleccionadosTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLibretaMili.add(this.jPanelParametrosAuxiliar3TipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLibretaMili.add(this.jComboBoxTiposRelacionesTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
				
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLibretaMili.add(this.jComboBoxTiposAccionesTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
	
				
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLibretaMili.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLibretaMili.add(this.jTextFieldValorCampoGeneralTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoLibretaMili = new GridBagLayout();

			this.jScrollPanelDatosTipoLibretaMili.setLayout(gridaBagLayoutDatosTipoLibretaMili);
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.gridy = 0;
			this.gridBagConstraintsTipoLibretaMili.gridx = 0;
			
			this.jScrollPanelDatosTipoLibretaMili.add(this.jTableDatosTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoLibretaMili.setViewportView(this.jTableDatosTipoLibretaMili);
		this.jTableDatosTipoLibretaMili.setFillsViewportHeight(true);
		this.jTableDatosTipoLibretaMili.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoLibretaMili= new GridBagLayout();
		this.jPanelAccionesTipoLibretaMili.setLayout(gridaBagLayoutAccionesTipoLibretaMili);
		
		
		/*	
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = 0;
		this.gridBagConstraintsTipoLibretaMili.gridx = 0;
			
		this.jPanelAccionesTipoLibretaMili.add(this.jButtonNuevoTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoLibretaMili = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoLibretaMili);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();						
			this.gridBagConstraintsTipoLibretaMili.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoLibretaMili.gridx = 0;		
			//this.gridBagConstraintsTipoLibretaMili.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoLibretaMili.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoLibretaMili.gridx = 0;		
		//this.gridBagConstraintsTipoLibretaMili.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLibretaMili.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoLibretaMili.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoLibretaMili);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLibretaMili.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);								
		
		
		/*
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLibretaMili.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		*/		
		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoLibretaMili.gridx =0;
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoLibretaMili.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
				
		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLibretaMili.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoLibretaMiliJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoLibretaMili= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoLibretaMili = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoLibretaMili.setLayout(gridaBagLayoutBusquedasParametrosTipoLibretaMili);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoLibretaMili=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoLibretaMili.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLibretaMili.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLibretaMili.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLibretaMili.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
			
			
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLibretaMili.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		
			
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoLibretaMili.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoLibretaMili;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoLibretaMili() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoLibretaMili = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoLibretaMili = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoLibretaMili.setName("jPanelReporteDinamicoTipoLibretaMili"); 
		
		this.jPanelReporteDinamicoTipoLibretaMili.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoLibretaMili.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoLibretaMili.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoLibretaMili.setLayout(gridaBagLayoutReporteDinamicoTipoLibretaMili);
		
		
		this.jInternalFrameReporteDinamicoTipoLibretaMili= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoLibretaMili = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoLibretaMili= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoLibretaMili.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoLibretaMili.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoLibretaMili.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoLibretaMili.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoLibretaMili.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoLibretaMili.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoLibretaMili.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoLibretaMili.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoLibretaMili.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoLibretaMili.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoLibretaMili.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Libreta Milis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoLibretaMili = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoLibretaMili.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoLibretaMili.add(this.jLabelColumnasSelectReporteTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoLibretaMili = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoLibretaMili.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoLibretaMili.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoLibretaMili.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoLibretaMili.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoLibretaMili.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoLibretaMili=new JScrollPane(this.jListColumnasSelectReporteTipoLibretaMili);
			
			this.jScrollColumnasSelectReporteTipoLibretaMili.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoLibretaMili.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoLibretaMili.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoLibretaMili.add(this.jListColumnasSelectReporteTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		this.jPanelReporteDinamicoTipoLibretaMili.add(this.jScrollColumnasSelectReporteTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoLibretaMili = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoLibretaMili.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoLibretaMili.add(this.jLabelRelacionesSelectReporteTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoLibretaMili = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoLibretaMili.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoLibretaMili.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoLibretaMili.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoLibretaMili.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoLibretaMili.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoLibretaMili=new JScrollPane(this.jListRelacionesSelectReporteTipoLibretaMili);
			
			this.jScrollRelacionesSelectReporteTipoLibretaMili.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoLibretaMili.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoLibretaMili.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoLibretaMili.add(this.jListRelacionesSelectReporteTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		this.jPanelReporteDinamicoTipoLibretaMili.add(this.jScrollRelacionesSelectReporteTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoLibretaMili = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoLibretaMili = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoLibretaMili = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoLibretaMili = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoLibretaMili.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoLibretaMili.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoLibretaMili.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoLibretaMili.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoLibretaMili = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoLibretaMili.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoLibretaMili.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoLibretaMili.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoLibretaMili.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoLibretaMili = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoLibretaMili.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoLibretaMili.add(this.jLabelGenerarExcelReporteDinamicoTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoLibretaMili = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoLibretaMili.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoLibretaMili,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoLibretaMili.setToolTipText("Generar EXCEL"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		//this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoLibretaMili.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoLibretaMili.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoLibretaMili.add(this.jButtonGenerarExcelReporteDinamicoTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLibretaMili.add(this.jComboBoxTiposReportesDinamicoTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoLibretaMili = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoLibretaMili.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoLibretaMili.add(this.jLabelTiposArchivoReporteDinamicoTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLibretaMili.add(this.jComboBoxTiposArchivosReportesDinamicoTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoLibretaMili = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoLibretaMili.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoLibretaMili,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoLibretaMili.setToolTipText("Generar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLibretaMili.add(this.jButtonGenerarReporteDinamicoTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoLibretaMili = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoLibretaMili.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoLibretaMili,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoLibretaMili.setToolTipText("Cancelar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLibretaMili.add(this.jButtonCerrarReporteDinamicoTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoLibretaMili = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoLibretaMili= new JScrollPane(jPanelReporteDinamicoTipoLibretaMili,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoLibretaMili.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoLibretaMili.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoLibretaMili.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Libreta Milis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoLibretaMili.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoLibretaMili.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoLibretaMili.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoLibretaMili);
		this.jInternalFrameReporteDinamicoTipoLibretaMili.getContentPane().add(this.jScrollPanelReporteDinamicoTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoLibretaMili() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoLibretaMili = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoLibretaMili = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoLibretaMili.setName("jPanelImportacionTipoLibretaMili"); 
		
		this.jPanelImportacionTipoLibretaMili.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoLibretaMili.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoLibretaMili.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoLibretaMili.setLayout(gridaBagLayoutImportacionTipoLibretaMili);
		
		
		this.jInternalFrameImportacionTipoLibretaMili= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoLibretaMili= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoLibretaMili = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoLibretaMili= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoLibretaMili.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoLibretaMili.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoLibretaMili.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoLibretaMili.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoLibretaMili.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoLibretaMili.setResizable(true);
	    this.jInternalFrameImportacionTipoLibretaMili.setClosable(true);
	    this.jInternalFrameImportacionTipoLibretaMili.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoLibretaMili.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoLibretaMili.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoLibretaMili.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoLibretaMili.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoLibretaMili.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoLibretaMili.setResizable(true);
	    this.jInternalFrameImportacionTipoLibretaMili.setClosable(true);
	    this.jInternalFrameImportacionTipoLibretaMili.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoLibretaMili.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoLibretaMili.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoLibretaMili.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Libreta Milis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoLibretaMili = new JLabelMe();

		this.jLabelArchivoImportacionTipoLibretaMili.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoLibretaMili.add(this.jLabelArchivoImportacionTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoLibretaMili = new JFileChooser();		
		this.jFileChooserImportacionTipoLibretaMili.setToolTipText("ESCOGER ARCHIVO"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoLibretaMili = new JButtonMe();
		this.jButtonAbrirImportacionTipoLibretaMili.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoLibretaMili,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoLibretaMili.setToolTipText("Generar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLibretaMili.add(this.jButtonAbrirImportacionTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoLibretaMili = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoLibretaMili.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoLibretaMili.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoLibretaMili.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoLibretaMili.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoLibretaMili.add(this.jLabelPathArchivoImportacionTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoLibretaMili=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoLibretaMili.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoLibretaMili.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoLibretaMili.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLibretaMili.add(this.jTextFieldPathArchivoImportacionTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoLibretaMili = new JButtonMe();
		this.jButtonGenerarImportacionTipoLibretaMili.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoLibretaMili,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoLibretaMili.setToolTipText("Generar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLibretaMili.add(this.jButtonGenerarImportacionTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoLibretaMili = new JButtonMe();
		this.jButtonCerrarImportacionTipoLibretaMili.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoLibretaMili,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoLibretaMili.setToolTipText("Cancelar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLibretaMili.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLibretaMili.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLibretaMili.add(this.jButtonCerrarImportacionTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoLibretaMili = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoLibretaMili= new JScrollPane(jPanelImportacionTipoLibretaMili,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
		this.gridBagConstraintsTipoLibretaMili.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoLibretaMili.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoLibretaMili.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoLibretaMili.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoLibretaMili);
		this.jInternalFrameImportacionTipoLibretaMili.getContentPane().add(this.jScrollPanelImportacionTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoLibretaMili(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoLibretaMili = new JButtonMe();
			this.jButtonAbrirOrderByTipoLibretaMili.setText("Orden");
			this.jButtonAbrirOrderByTipoLibretaMili.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoLibretaMili,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoLibretaMili";
			inputMap = this.jButtonAbrirOrderByTipoLibretaMili.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoLibretaMili.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoLibretaMili"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoLibretaMili = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoLibretaMili = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoLibretaMili.setName("jPanelOrderByTipoLibretaMili"); 
			
			this.jPanelOrderByTipoLibretaMili.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoLibretaMili.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoLibretaMili.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoLibretaMili.setLayout(gridaBagLayoutOrderByTipoLibretaMili);
			
			
			this.jTableDatosTipoLibretaMiliOrderBy = new JTableMe();        
			this.jTableDatosTipoLibretaMiliOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoLibretaMiliOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoLibretaMiliOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoLibretaMiliOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoLibretaMiliOrderBy.setViewportView(this.jTableDatosTipoLibretaMiliOrderBy);
			this.jTableDatosTipoLibretaMiliOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoLibretaMiliOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoLibretaMili= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoLibretaMili= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoLibretaMili = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoLibretaMili= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoLibretaMili.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoLibretaMili.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoLibretaMili.setTitle("Orden");
			this.jInternalFrameOrderByTipoLibretaMili.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoLibretaMili.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoLibretaMili.setResizable(true);
			this.jInternalFrameOrderByTipoLibretaMili.setClosable(true);
			this.jInternalFrameOrderByTipoLibretaMili.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoLibretaMili.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoLibretaMili.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoLibretaMili.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoLibretaMili.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Libreta Milis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoLibretaMili.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoLibretaMili.ipady =150;
				
			this.jPanelOrderByTipoLibretaMili.add(jScrollPanelDatosTipoLibretaMiliOrderBy, this.gridBagConstraintsTipoLibretaMili);//this.jTableDatosTipoLibretaMiliTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoLibretaMili = new JButtonMe();
			this.jButtonCerrarOrderByTipoLibretaMili.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoLibretaMili,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoLibretaMili.setToolTipText("Cancelar"+" "+TipoLibretaMiliConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoLibretaMili, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLibretaMili.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoLibretaMili.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoLibretaMili.add(this.jButtonCerrarOrderByTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoLibretaMili = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoLibretaMili= new JScrollPane(jPanelOrderByTipoLibretaMili,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoLibretaMili = new GridBagConstraints();
			this.gridBagConstraintsTipoLibretaMili.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoLibretaMili.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoLibretaMili.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoLibretaMili.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoLibretaMili.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoLibretaMili);
			
			this.jInternalFrameOrderByTipoLibretaMili.getContentPane().add(this.jScrollPanelOrderByTipoLibretaMili, this.gridBagConstraintsTipoLibretaMili);			
		
		} else {
			this.jButtonAbrirOrderByTipoLibretaMili = new JButtonMe();
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
			&& this.tipolibretamiliSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoLibretaMili.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoLibretaMili.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoLibretaMili.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoLibretaMili.getRowHeight();//TipoLibretaMiliConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoLibretaMiliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoLibretaMili.isSelected()) {
					iHeightTable=TipoLibretaMiliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoLibretaMiliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoLibretaMiliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoLibretaMiliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoLibretaMili.isSelected()) {
					iHeightTable=TipoLibretaMiliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoLibretaMiliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoLibretaMiliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoLibretaMili.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoLibretaMili.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoLibretaMili.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoLibretaMili.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoLibretaMili.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoLibretaMili.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoLibretaMili!=null && this.jInternalFrameOrderByTipoLibretaMili.getjTableDatosOrderBy()!=null) {
			//if(!this.tipolibretamiliSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoLibretaMili.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoLibretaMili.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoLibretaMili.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoLibretaMili.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoLibretaMili.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoLibretaMili.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoLibretaMili.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoLibretaMili.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoLibretaMili.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoLibretaMili.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipolibretamiliLogic.getTipoLibretaMilis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipolibretamilis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoLibretaMili> TraerTipoLibretaMiliBeans(List<TipoLibretaMili> tipolibretamilis,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoLibretaMili tipolibretamili:tipolibretamilis) {
					
				if(!(TipoLibretaMiliConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoLibretaMiliConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipolibretamili.setsDetalleGeneralEntityReporte(TipoLibretaMiliConstantesFunciones.getTipoLibretaMiliDescripcion(tipolibretamili));
										
						
					
					

					if(tipolibretamili.getDatoGeneralEmpleados()!=null && Funciones.existeClass(classes,DatoGeneralEmpleado.class)) {
						try{tipolibretamili.setdatogeneralempleadosDescripcionReporte(new JRBeanCollectionDataSource(DatoGeneralEmpleadoJInternalFrame.TraerDatoGeneralEmpleadoBeans(tipolibretamili.getDatoGeneralEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipolibretamili.setsDetalleGeneralEntityReporte(tipolibretamili.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipolibretamilibeans.add(tipolibretamilibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipolibretamilis;
    }
	//PARA REPORTES FIN
}
