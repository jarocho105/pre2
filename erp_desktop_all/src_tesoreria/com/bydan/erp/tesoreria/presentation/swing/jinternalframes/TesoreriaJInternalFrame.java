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



import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.tesoreria.util.TesoreriaConstantesFunciones;

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
public class TesoreriaJInternalFrame extends TesoreriaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTesoreria;
	
	protected JMenuBar jmenuBarTesoreria;
	
	protected JMenu jmenuTesoreria;
	protected JMenu jmenuDatosTesoreria;
	protected JMenu jmenuArchivoTesoreria;
	protected JMenu jmenuAccionesTesoreria;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTesoreria;	
	protected GridBagConstraints gridBagConstraintsTesoreria;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TesoreriaDetalleFormJInternalFrame jInternalFrameDetalleFormTesoreria;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTesoreria;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTesoreria;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TesoreriaSessionBean tesoreriaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Tesoreria> tesorerias;		
	public List<Tesoreria> tesoreriasEliminados;	
	public List<Tesoreria> tesoreriasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTesoreria;		
	protected JButton jButtonAbrirOrderByTesoreria;
	
	
	//protected JPanel jPanelOrderByTesoreria;
	//public JScrollPane jScrollPanelOrderByTesoreria;	
	//protected JButton jButtonCerrarOrderByTesoreria;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TesoreriaLogic tesoreriaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTesoreria;
	public JScrollPane jScrollPanelDatosEdicionTesoreria;
	public JScrollPane jScrollPanelDatosGeneralTesoreria;
    
	
	
	//public JScrollPane jScrollPanelDatosTesoreriaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTesoreria;
	//public JScrollPane jScrollPanelImportacionTesoreria;
	
	
	
	protected JPanel jPanelAccionesTesoreria;
	
    protected JPanel jPanelPaginacionTesoreria;
    protected JPanel jPanelParametrosReportesTesoreria;
	protected JPanel jPanelParametrosReportesAccionesTesoreria;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Tesoreria;
	protected JPanel jPanelParametrosAuxiliar2Tesoreria;
	protected JPanel jPanelParametrosAuxiliar3Tesoreria;
	protected JPanel jPanelParametrosAuxiliar4Tesoreria;
	//protected JPanel jPanelParametrosAuxiliar5Tesoreria;
	
	
	
	//protected JPanel jPanelReporteDinamicoTesoreria;
	//protected JPanel jPanelImportacionTesoreria;
	
	
	public JTable jTableDatosTesoreria;
	
	
	
	//public JTable jTableDatosTesoreriaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTesoreria;
	protected JButton jButtonDuplicarTesoreria;
	protected JButton jButtonCopiarTesoreria;
	protected JButton jButtonVerFormTesoreria;
	protected JButton jButtonNuevoRelacionesTesoreria;
	protected JButton jButtonModificarTesoreria;
	
    protected JButton jButtonGuardarCambiosTablaTesoreria;
	protected JButton jButtonCerrarTesoreria;
	
	
	protected JButton jButtonRecargarInformacionTesoreria;
	protected JButton jButtonProcesarInformacionTesoreria;
	
	
	protected JButton jButtonAnterioresTesoreria;
	protected JButton jButtonSiguientesTesoreria;
	protected JButton jButtonNuevoGuardarCambiosTesoreria;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTesoreria;
	//protected JButton jButtonCerrarReporteDinamicoTesoreria;
	//protected JButton jButtonGenerarExcelReporteDinamicoTesoreria;	
	
	
	
	//protected JButton jButtonAbrirImportacionTesoreria;
	//protected JButton jButtonGenerarImportacionTesoreria;
	//protected JButton jButtonCerrarImportacionTesoreria;
	//protected JFileChooser jFileChooserImportacionTesoreria;
	//protected File fileImportacionTesoreria;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTesoreria;
	protected JButton jButtonDuplicarToolBarTesoreria;
	protected JButton jButtonNuevoRelacionesToolBarTesoreria;
	
	
	public JButton jButtonGuardarCambiosToolBarTesoreria;
	protected JButton jButtonCopiarToolBarTesoreria;
	protected JButton jButtonVerFormToolBarTesoreria;
	public JButton jButtonGuardarCambiosTablaToolBarTesoreria;
	protected JButton jButtonMostrarOcultarTablaToolBarTesoreria;
	protected JButton jButtonCerrarToolBarTesoreria;
	
	protected JButton jButtonRecargarInformacionToolBarTesoreria;
	protected JButton jButtonProcesarInformacionToolBarTesoreria;
	protected JButton jButtonAnterioresToolBarTesoreria;
	protected JButton jButtonSiguientesToolBarTesoreria;
	protected JButton jButtonNuevoGuardarCambiosToolBarTesoreria;
	protected JButton jButtonAbrirOrderByToolBarTesoreria;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTesoreria;
	protected JMenuItem jMenuItemDuplicarTesoreria;
	protected JMenuItem jMenuItemNuevoRelacionesTesoreria;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTesoreria;
	protected JMenuItem jMenuItemCopiarTesoreria;
	protected JMenuItem jMenuItemVerFormTesoreria;
	protected JMenuItem jMenuItemGuardarCambiosTablaTesoreria;
	protected JMenuItem jMenuItemCerrarTesoreria;
	protected JMenuItem jMenuItemDetalleCerrarTesoreria;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTesoreria;
	protected JMenuItem jMenuItemDetalleMostarOcultarTesoreria;
	
	protected JMenuItem jMenuItemRecargarInformacionTesoreria;
	protected JMenuItem jMenuItemProcesarInformacionTesoreria;
	protected JMenuItem jMenuItemAnterioresTesoreria;
	protected JMenuItem jMenuItemSiguientesTesoreria;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTesoreria;
	protected JMenuItem jMenuItemAbrirOrderByTesoreria;
	protected JMenuItem jMenuItemMostrarOcultarTesoreria;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTesoreria;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTesoreria;
	protected JCheckBox jCheckBoxSeleccionadosTesoreria;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTesoreria;
	protected JCheckBox jCheckBoxConGraficoReporteTesoreria;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTesoreria;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTesoreria;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTesoreria;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTesoreria;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTesoreria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTesoreria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTesoreria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTesoreria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTesoreria;
	protected JTextField jTextFieldValorCampoGeneralTesoreria;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTesoreria;
	//public JList<Reporte> jListColumnasSelectReporteTesoreria;
	//public JScrollPane jScrollColumnasSelectReporteTesoreria;
	
	//public JLabel jLabelRelacionesSelectReporteTesoreria;
	//public JList<Reporte> jListRelacionesSelectReporteTesoreria;
	//public JScrollPane jScrollRelacionesSelectReporteTesoreria;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTesoreria;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTesoreria;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTesoreria;
	//public JLabel jLabelTiposArchivoReporteDinamicoTesoreria;
	
		
	//public JLabel jLabelArchivoImportacionTesoreria;	
	//public JLabel jLabelPathArchivoImportacionTesoreria;
	//protected JTextField jTextFieldPathArchivoImportacionTesoreria;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTesoreria;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTesoreria;
	
	//public JLabel jLabelColumnaCategoriaValorTesoreria;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTesoreria;
	
	//public JLabel jLabelColumnasValoresGraficoTesoreria;
	//public JList<Reporte> jListColumnasValoresGraficoTesoreria;
	//public JScrollPane jScrollColumnasValoresGraficoTesoreria;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTesoreria;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTesoreria;	
	
	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TesoreriaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Tesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TesoreriaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Tesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TesoreriaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Tesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TesoreriaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Tesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTesoreria)	{
		this.jButtonRecargarInformacionTesoreria = jButtonRecargarInformacionTesoreria;
	}
	
	public JButton getjButtonProcesarInformacionTesoreria() {
		return this.jButtonProcesarInformacionTesoreria;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTesoreria)	{
		this.jButtonProcesarInformacionTesoreria = jButtonProcesarInformacionTesoreria;
	}
	
	
	public JButton getjButtonRecargarInformacionTesoreria() {
		return this.jButtonRecargarInformacionTesoreria;
	}
	
	
	public List<Tesoreria> gettesorerias() {
		return this.tesorerias;
	}

	public void settesorerias(List<Tesoreria> tesorerias) {
		this.tesorerias = tesorerias;
	}
	
	public List<Tesoreria> gettesoreriasAux() {
		return this.tesoreriasAux;
	}

	public void settesoreriasAux(List<Tesoreria> tesoreriasAux) {
		this.tesoreriasAux = tesoreriasAux;
	}
	
	public List<Tesoreria> gettesoreriasEliminados() {
		return this.tesoreriasEliminados;
	}

	public void setTesoreriasEliminados(List<Tesoreria> tesoreriasEliminados) {
		this.tesoreriasEliminados = tesoreriasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTesoreria() {
		return jComboBoxTiposSeleccionarTesoreria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTesoreria(
			JComboBox jComboBoxTiposSeleccionarTesoreria) {
		this.jComboBoxTiposSeleccionarTesoreria = jComboBoxTiposSeleccionarTesoreria;
	}
	
	public void setBorderResaltarTiposSeleccionarTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTesoreria.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTesoreria .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTesoreria() {
		return jTextFieldValorCampoGeneralTesoreria;
	}

	public void setjTextFieldValorCampoGeneralTesoreria(
			JTextField jTextFieldValorCampoGeneralTesoreria) {
		this.jTextFieldValorCampoGeneralTesoreria = jTextFieldValorCampoGeneralTesoreria;
	}

	public void setBorderResaltarValorCampoGeneralTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTesoreria.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTesoreria .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTesoreria() {
		return this.jCheckBoxSeleccionarTodosTesoreria;
	}

	public void setjCheckBoxSeleccionarTodosTesoreria(
			JCheckBox jCheckBoxSeleccionarTodosTesoreria) {
		this.jCheckBoxSeleccionarTodosTesoreria = jCheckBoxSeleccionarTodosTesoreria;
	}

	public void setBorderResaltarSeleccionarTodosTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTesoreria.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTesoreria .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTesoreria() {
		return this.jCheckBoxSeleccionadosTesoreria;
	}

	public void setjCheckBoxSeleccionadosTesoreria(
			JCheckBox jCheckBoxSeleccionadosTesoreria) {
		this.jCheckBoxSeleccionadosTesoreria = jCheckBoxSeleccionadosTesoreria;
	}
	
	public void setBorderResaltarSeleccionadosTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTesoreria.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTesoreria .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTesoreria() {
		return this.jComboBoxTiposArchivosReportesTesoreria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTesoreria(
			JComboBox jComboBoxTiposArchivosReportesTesoreria) {
		this.jComboBoxTiposArchivosReportesTesoreria = jComboBoxTiposArchivosReportesTesoreria;
	}

	public void setBorderResaltarTiposArchivosReportesTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTesoreria.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTesoreria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTesoreria() {
		return this.jComboBoxTiposReportesTesoreria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTesoreria(
			JComboBox jComboBoxTiposReportesTesoreria) {
		this.jComboBoxTiposReportesTesoreria = jComboBoxTiposReportesTesoreria;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTesoreria() {
	//	return jComboBoxTiposReportesDinamicoTesoreria;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTesoreria(
	//		JComboBox jComboBoxTiposReportesDinamicoTesoreria) {
	//	this.jComboBoxTiposReportesDinamicoTesoreria = jComboBoxTiposReportesDinamicoTesoreria;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTesoreria() {
	//	return jComboBoxTiposArchivosReportesDinamicoTesoreria;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTesoreria(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTesoreria) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTesoreria = jComboBoxTiposArchivosReportesDinamicoTesoreria;
	//}
	
	public void setBorderResaltarTiposReportesTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTesoreria.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTesoreria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTesoreria() {
		return this.jComboBoxTiposGraficosReportesTesoreria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTesoreria(
			JComboBox jComboBoxTiposGraficosReportesTesoreria) {
		this.jComboBoxTiposGraficosReportesTesoreria = jComboBoxTiposGraficosReportesTesoreria;
	}
	
	public void setBorderResaltarTiposGraficosReportesTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTesoreria.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTesoreria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTesoreria() {
		return this.jComboBoxTiposPaginacionTesoreria;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTesoreria(
			JComboBox jComboBoxTiposPaginacionTesoreria) {
		this.jComboBoxTiposPaginacionTesoreria = jComboBoxTiposPaginacionTesoreria;
	}
	
	public void setBorderResaltarTiposPaginacionTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTesoreria.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTesoreria .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTesoreria() {
		return this.jComboBoxTiposRelacionesTesoreria;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTesoreria() {
		return this.jComboBoxTiposAccionesTesoreria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTesoreria(
			JComboBox jComboBoxTiposRelacionesTesoreria) {
		this.jComboBoxTiposRelacionesTesoreria = jComboBoxTiposRelacionesTesoreria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTesoreria(
			JComboBox jComboBoxTiposAccionesTesoreria) {
		this.jComboBoxTiposAccionesTesoreria = jComboBoxTiposAccionesTesoreria;
	}
	
	public void setBorderResaltarTiposRelacionesTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTesoreria.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTesoreria .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTesoreria() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTesoreria.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTesoreria .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTesoreria() {
	//	return jCheckBoxConGraficoDinamicoTesoreria;
	//}

	//public void setjCheckBoxConGraficoDinamicoTesoreria(
	//		JCheckBox jCheckBoxConGraficoDinamicoTesoreria) {
	//	this.jCheckBoxConGraficoDinamicoTesoreria = jCheckBoxConGraficoDinamicoTesoreria;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTesoreria() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTesoreria.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTesoreria .setBorder(borderResaltar);		
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
		this.tesoreriaSessionBean=new TesoreriaSessionBean();
		
		this.tesoreriaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tesoreriaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tesoreriaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TesoreriaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TesoreriaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TesoreriaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TesoreriaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TesoreriaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tesoreria MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
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
		
		TesoreriaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Tesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTesoreria= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTesoreria,this.jTtoolBarTesoreria,
							"nuevo","nuevo","Nuevo"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTesoreria,this.jTtoolBarTesoreria,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTesoreria,this.jTtoolBarTesoreria,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTesoreria,this.jTtoolBarTesoreria,
							"duplicar","duplicar","Duplicar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTesoreria,this.jTtoolBarTesoreria,
							"copiar","copiar","Copiar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTesoreria,this.jTtoolBarTesoreria,
							"ver_form","ver_form","Ver"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTesoreria,this.jTtoolBarTesoreria,
							"recargar","recargar","Recargar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTesoreria,this.jTtoolBarTesoreria,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTesoreria,this.jTtoolBarTesoreria,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTesoreria,this.jTtoolBarTesoreria,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTesoreria,this.jTtoolBarTesoreria,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTesoreria,this.jTtoolBarTesoreria,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTesoreria,this.jTtoolBarTesoreria,
							"cerrar","cerrar","Salir"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTesoreria=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTesoreria;
			
				this.jButtonProcesarInformacionToolBarTesoreria=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTesoreria;
				
		//protected JButton jButtonModificarToolBarTesoreria;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTesoreria=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTesoreria=new JMenuMe("General");
		this.jmenuArchivoTesoreria=new JMenuMe("Archivo");
		this.jmenuAccionesTesoreria=new JMenuMe("Acciones");
		this.jmenuDatosTesoreria=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTesoreria= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTesoreria.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTesoreria,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTesoreria= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTesoreria.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTesoreria,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTesoreria= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTesoreria.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTesoreria,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTesoreria= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTesoreria.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTesoreria,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTesoreria= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTesoreria.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTesoreria,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTesoreria= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTesoreria.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTesoreria,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTesoreria= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTesoreria.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTesoreria,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTesoreria= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTesoreria.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTesoreria,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTesoreria= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTesoreria.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTesoreria,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTesoreria= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTesoreria.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTesoreria,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTesoreria= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTesoreria.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTesoreria,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTesoreria= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTesoreria.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTesoreria,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTesoreria= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTesoreria.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTesoreria,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTesoreria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTesoreria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTesoreria,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTesoreria= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTesoreria.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTesoreria,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTesoreria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTesoreria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTesoreria,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTesoreria= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTesoreria.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTesoreria,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTesoreria.add(this.jMenuItemCerrarTesoreria);
			
			this.jmenuAccionesTesoreria.add(this.jMenuItemNuevoTesoreria);
			this.jmenuAccionesTesoreria.add(this.jMenuItemNuevoGuardarCambiosTesoreria);
			this.jmenuAccionesTesoreria.add(this.jMenuItemNuevoRelacionesTesoreria);
			this.jmenuAccionesTesoreria.add(this.jMenuItemGuardarCambiosTablaTesoreria);		
			this.jmenuAccionesTesoreria.add(this.jMenuItemDuplicarTesoreria);		
			this.jmenuAccionesTesoreria.add(this.jMenuItemCopiarTesoreria);		
			this.jmenuAccionesTesoreria.add(this.jMenuItemVerFormTesoreria);		
			
			this.jmenuDatosTesoreria.add(this.jMenuItemRecargarInformacionTesoreria);				
			this.jmenuDatosTesoreria.add(this.jMenuItemAnterioresTesoreria);				
			this.jmenuDatosTesoreria.add(this.jMenuItemSiguientesTesoreria);				
			this.jmenuDatosTesoreria.add(this.jMenuItemAbrirOrderByTesoreria);				
			this.jmenuDatosTesoreria.add(this.jMenuItemMostrarOcultarTesoreria);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTesoreria.add(this.jMenuItemGuardarCambiosTesoreria);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTesoreria.add(this.jmenuArchivoTesoreria);		
			this.jmenuBarTesoreria.add(this.jmenuAccionesTesoreria);		
			this.jmenuBarTesoreria.add(this.jmenuDatosTesoreria);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTesoreria);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTesoreria() {
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
			//this.jInternalFrameDetalleTesoreria = new TesoreriaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tesoreria DATOS");
			this.jInternalFrameDetalleFormTesoreria = new TesoreriaDetalleFormJInternalFrame(jDesktopPane,this.tesoreriaSessionBean.getConGuardarRelaciones(),this.tesoreriaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTesoreria = null;//new TesoreriaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTesoreria= new GridBagLayout();
		
		
		this.jTableDatosTesoreria = new JTableMe();      
		
		String sToolTipTesoreria="";
		sToolTipTesoreria=TesoreriaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTesoreria+="(Tesoreria.Tesoreria)";
		}
		
		if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTesoreria+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTesoreria.setToolTipText(sToolTipTesoreria);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTesoreria);
		this.jTableDatosTesoreria.setAutoCreateRowSorter(true);
		this.jTableDatosTesoreria.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTesoreria.setRowSelectionAllowed(true);
		this.jTableDatosTesoreria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTesoreria,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTesoreria = new JButtonMe();
		this.jButtonDuplicarTesoreria = new JButtonMe();
		this.jButtonCopiarTesoreria = new JButtonMe();
		this.jButtonVerFormTesoreria = new JButtonMe();
		this.jButtonNuevoRelacionesTesoreria = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTesoreria = new JButtonMe();
		this.jButtonCerrarTesoreria = new JButtonMe();
		
		this.jScrollPanelDatosTesoreria = new JScrollPane();   
        this.jScrollPanelDatosGeneralTesoreria = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tesoreria";
		
		if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tesorerias" + this.sPath));
		} else {
			this.jScrollPanelDatosTesoreria.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTesoreria.setToolTipText("Acciones");
        this.jPanelAccionesTesoreria.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTesoreria=new ReporteDinamicoJInternalFrame(TesoreriaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTesoreria();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTesoreria=new ImportacionJInternalFrame(TesoreriaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTesoreria();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTesoreria = new JButtonMe();
		
		this.jButtonAbrirOrderByTesoreria.setText("Orden");
		this.jButtonAbrirOrderByTesoreria.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTesoreria,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTesoreria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTesoreria,false,this);
			
			//this.cargarOrderByTesoreria(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTesoreria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTesoreria,true,this);
			
			//this.cargarOrderByTesoreria(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTesoreria.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTesoreria.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTesoreria.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTesoreria.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTesoreria.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTesoreria.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTesoreria.setText("Nuevo");
		this.jButtonDuplicarTesoreria.setText("Duplicar");
		this.jButtonCopiarTesoreria.setText("Copiar");
		this.jButtonVerFormTesoreria.setText("Ver");
		this.jButtonNuevoRelacionesTesoreria.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTesoreria.setText("Guardar");
		this.jButtonCerrarTesoreria.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTesoreria,"nuevo_button","Nuevo",this.tesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTesoreria,"duplicar_button","Duplicar",this.tesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTesoreria,"copiar_button","Copiar",this.tesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTesoreria,"ver_form","Ver",this.tesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTesoreria,"nuevorelaciones_button","Nuevo Rel",this.tesoreriaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTesoreria,"guardarcambiostabla_button","Guardar",this.tesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTesoreria,"cerrar_button","Salir",this.tesoreriaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTesoreria.setToolTipText("Nuevo"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTesoreria.setToolTipText("Duplicar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTesoreria.setToolTipText("Copiar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTesoreria.setToolTipText("Ver"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTesoreria.setToolTipText("Nuevo Rel"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTesoreria.setToolTipText("Guardar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTesoreria.setToolTipText("Salir"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTesoreria";
		inputMap = this.jButtonNuevoTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTesoreria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTesoreria"));
		
		//DUPLICAR
		sMapKey = "DuplicarTesoreria";
		inputMap = this.jButtonDuplicarTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTesoreria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTesoreria"));
		
		//COPIAR
		sMapKey = "CopiarTesoreria";
		inputMap = this.jButtonCopiarTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTesoreria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTesoreria"));
		
		//VEr FORM
		sMapKey = "VerFormTesoreria";
		inputMap = this.jButtonVerFormTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTesoreria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTesoreria"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTesoreria";
		inputMap = this.jButtonNuevoRelacionesTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTesoreria"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTesoreria";
		inputMap = this.jButtonModificarTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTesoreria"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTesoreria";
		inputMap = this.jButtonCerrarTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTesoreria"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTesoreria";
		inputMap = this.jButtonGuardarCambiosTablaTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTesoreria"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Tesoreria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Tesoreria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Tesoreria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Tesoreria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Tesoreria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTesoreria.setName("jPanelParametrosReportesTesoreria"); 
		
		this.jPanelParametrosReportesAccionesTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTesoreria.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTesoreria.setName("jPanelParametrosReportesAccionesTesoreria"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTesoreria = new JButtonMe();
		this.jButtonRecargarInformacionTesoreria.setText("Recargar");
		this.jButtonRecargarInformacionTesoreria.setToolTipText("Recargar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTesoreria,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTesoreria = new JButtonMe();
		this.jButtonProcesarInformacionTesoreria.setText("Procesar");
		this.jButtonProcesarInformacionTesoreria.setToolTipText("Procesar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTesoreria.setVisible(false);
			
		this.jButtonProcesarInformacionTesoreria.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTesoreria.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTesoreria.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTesoreria.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTesoreria.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTesoreria.setText("TIPO");       
		this.jComboBoxTiposReportesTesoreria.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTesoreria.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTesoreria.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTesoreria.setText("Paginacion");
		this.jComboBoxTiposPaginacionTesoreria.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTesoreria.setText("Accion");
		this.jComboBoxTiposRelacionesTesoreria.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTesoreria.setText("Accion");
		this.jComboBoxTiposAccionesTesoreria.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTesoreria.setText("Accion");
		this.jComboBoxTiposSeleccionarTesoreria.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTesoreria=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTesoreria.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTesoreria.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTesoreria.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTesoreria = new JLabelMe();
		
		this.jLabelAccionesTesoreria.setText("Acciones");		
		this.jLabelAccionesTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTesoreria = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTesoreria.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTesoreria.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTesoreria = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTesoreria.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTesoreria.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTesoreria = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTesoreria.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTesoreria.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTesoreria = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTesoreria.setText("Graf.");
		this.jCheckBoxConGraficoReporteTesoreria.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTesoreria = new JButtonMe();
		//this.jButtonAnterioresTesoreria.setText("<<");
        this.jButtonAnterioresTesoreria.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTesoreria,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTesoreria = new JButtonMe();
		//this.jButtonSiguientesTesoreria.setText(">>");
        this.jButtonSiguientesTesoreria.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTesoreria,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTesoreria = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTesoreria.setText("Nue");
        this.jButtonNuevoGuardarCambiosTesoreria.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTesoreria,"nuevoguardarcambios_button","Nue",this.tesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTesoreria";
		inputMap = this.jButtonNuevoGuardarCambiosTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTesoreria"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTesoreria";
		inputMap = this.jButtonRecargarInformacionTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTesoreria"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTesoreria";
		inputMap = this.jButtonSiguientesTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTesoreria"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTesoreria";
		inputMap = this.jButtonAnterioresTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTesoreria"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTesoreria();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTesoreria.setMinimumSize(new Dimension(this.getWidth(),TesoreriaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TesoreriaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTesoreria.setMaximumSize(new Dimension(this.getWidth(),TesoreriaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TesoreriaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTesoreria.setPreferredSize(new Dimension(this.getWidth(),TesoreriaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TesoreriaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTesoreria = new GridBagLayout();

			this.jPanelPaginacionTesoreria.setLayout(gridaBagLayoutPaginacionTesoreria);						
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.gridy = 0;
			this.gridBagConstraintsTesoreria.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTesoreria.add(this.jButtonAnterioresTesoreria, this.gridBagConstraintsTesoreria);
					
						
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTesoreria.gridy = 0;
			
			this.jPanelPaginacionTesoreria.add(this.jButtonNuevoGuardarCambiosTesoreria, this.gridBagConstraintsTesoreria);
						
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTesoreria.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTesoreria.gridy = 0;
			this.jPanelPaginacionTesoreria.add(this.jButtonSiguientesTesoreria, this.gridBagConstraintsTesoreria);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.gridy = 1;
			this.gridBagConstraintsTesoreria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTesoreria.add(this.jButtonNuevoTesoreria, this.gridBagConstraintsTesoreria);
						
			
			
			if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTesoreria = new GridBagConstraints();
				this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTesoreria.gridy = 1;
				this.gridBagConstraintsTesoreria.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTesoreria.add(this.jButtonGuardarCambiosTablaTesoreria, this.gridBagConstraintsTesoreria);
			}
			
			
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.gridy = 1;
			this.gridBagConstraintsTesoreria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTesoreria.add(this.jButtonDuplicarTesoreria, this.gridBagConstraintsTesoreria);
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.gridy = 1;
			this.gridBagConstraintsTesoreria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTesoreria.add(this.jButtonCopiarTesoreria, this.gridBagConstraintsTesoreria);
		
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.gridy = 1;
			this.gridBagConstraintsTesoreria.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTesoreria.add(this.jButtonVerFormTesoreria, this.gridBagConstraintsTesoreria);
		
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.gridy = 1;
			this.gridBagConstraintsTesoreria.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTesoreria.add(this.jButtonCerrarTesoreria, this.gridBagConstraintsTesoreria);
		
		
		
		this.jButtonRecargarInformacionTesoreria.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTesoreria.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTesoreria.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTesoreria.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTesoreria.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTesoreria.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTesoreria.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTesoreria.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTesoreria.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTesoreria.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTesoreria.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTesoreria.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTesoreria.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTesoreria.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTesoreria.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTesoreria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTesoreria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTesoreria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTesoreria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTesoreria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTesoreria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTesoreria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTesoreria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTesoreria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTesoreria.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTesoreria.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTesoreria.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTesoreria.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTesoreria.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTesoreria.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTesoreria.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTesoreria.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTesoreria.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTesoreria.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTesoreria.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTesoreria.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTesoreria = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTesoreria = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Tesoreria = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Tesoreria = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Tesoreria = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Tesoreria = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTesoreria.setLayout(gridaBagParametrosReportesTesoreria);
			this.jPanelParametrosReportesAccionesTesoreria.setLayout(gridaBagParametrosReportesAccionesTesoreria);
			
			
			this.jPanelParametrosAuxiliar1Tesoreria.setLayout(gridaBagParametrosAuxiliar1Tesoreria);
			this.jPanelParametrosAuxiliar2Tesoreria.setLayout(gridaBagParametrosAuxiliar2Tesoreria);
			this.jPanelParametrosAuxiliar3Tesoreria.setLayout(gridaBagParametrosAuxiliar3Tesoreria);
			this.jPanelParametrosAuxiliar4Tesoreria.setLayout(gridaBagParametrosAuxiliar4Tesoreria);
			//this.jPanelParametrosAuxiliar5Tesoreria.setLayout(gridaBagParametrosAuxiliar2Tesoreria);			
			
			
			
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTesoreria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTesoreria.add(this.jButtonRecargarInformacionTesoreria, this.gridBagConstraintsTesoreria);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTesoreria.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTesoreria.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Tesoreria.add(this.jComboBoxTiposPaginacionTesoreria, this.gridBagConstraintsTesoreria);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTesoreria.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTesoreria.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Tesoreria.add(this.jCheckBoxConAltoMaximoTablaTesoreria, this.gridBagConstraintsTesoreria);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTesoreria.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTesoreria.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Tesoreria.add(this.jComboBoxTiposArchivosReportesTesoreria, this.gridBagConstraintsTesoreria);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTesoreria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTesoreria.add(this.jPanelParametrosAuxiliar1Tesoreria, this.gridBagConstraintsTesoreria);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTesoreria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Tesoreria.add(this.jComboBoxTiposReportesTesoreria, this.gridBagConstraintsTesoreria);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTesoreria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTesoreria.add(this.jPanelParametrosAuxiliar4Tesoreria, this.gridBagConstraintsTesoreria);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTesoreria.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTesoreria.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTesoreria.add(this.jComboBoxTiposReportesTesoreria, this.gridBagConstraintsTesoreria);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTesoreria.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTesoreria.add(this.jCheckBoxGenerarReporteTesoreria, this.gridBagConstraintsTesoreria);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTesoreria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTesoreria.add(this.jPanelParametrosAuxiliar2Tesoreria, this.gridBagConstraintsTesoreria);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTesoreria.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTesoreria.add(this.jLabelAccionesTesoreria, this.gridBagConstraintsTesoreria);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTesoreria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTesoreria.add(this.jComboBoxTiposSeleccionarTesoreria, this.gridBagConstraintsTesoreria);			
			
			
			/*
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTesoreria.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTesoreria.add(this.jCheckBoxSeleccionarTodosTesoreria, this.gridBagConstraintsTesoreria);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTesoreria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Tesoreria.add(this.jCheckBoxSeleccionarTodosTesoreria, this.gridBagConstraintsTesoreria);															
				
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTesoreria.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Tesoreria.add(this.jCheckBoxSeleccionadosTesoreria, this.gridBagConstraintsTesoreria);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTesoreria.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTesoreria.add(this.jPanelParametrosAuxiliar3Tesoreria, this.gridBagConstraintsTesoreria);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTesoreria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTesoreria.add(this.jComboBoxTiposAccionesTesoreria, this.gridBagConstraintsTesoreria);
	
				
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTesoreria.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTesoreria.add(this.jTextFieldValorCampoGeneralTesoreria, this.gridBagConstraintsTesoreria);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTesoreria = new GridBagLayout();

			this.jScrollPanelDatosTesoreria.setLayout(gridaBagLayoutDatosTesoreria);
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.gridy = 0;
			this.gridBagConstraintsTesoreria.gridx = 0;
			
			this.jScrollPanelDatosTesoreria.add(this.jTableDatosTesoreria, this.gridBagConstraintsTesoreria);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTesoreria.setViewportView(this.jTableDatosTesoreria);
		this.jTableDatosTesoreria.setFillsViewportHeight(true);
		this.jTableDatosTesoreria.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTesoreria= new GridBagLayout();
		this.jPanelAccionesTesoreria.setLayout(gridaBagLayoutAccionesTesoreria);
		
		
		/*	
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTesoreria.gridy = 0;
		this.gridBagConstraintsTesoreria.gridx = 0;
			
		this.jPanelAccionesTesoreria.add(this.jButtonNuevoTesoreria, this.gridBagConstraintsTesoreria);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTesoreria = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTesoreria);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tesoreriaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTesoreria = new GridBagConstraints();						
			this.gridBagConstraintsTesoreria.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTesoreria.gridx = 0;		
			//this.gridBagConstraintsTesoreria.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTesoreria.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTesoreria, this.gridBagConstraintsTesoreria);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTesoreria.gridx = 0;		
		//this.gridBagConstraintsTesoreria.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTesoreria.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTesoreria);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTesoreria.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTesoreria, this.gridBagConstraintsTesoreria);								
		
		
		/*
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTesoreria.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTesoreria, this.gridBagConstraintsTesoreria);
		*/		
		
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTesoreria.gridx =0;
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTesoreria.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTesoreria, this.gridBagConstraintsTesoreria);
				
		
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTesoreria.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTesoreria, this.gridBagConstraintsTesoreria);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TesoreriaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTesoreria= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTesoreria = new GridBagLayout();
			this.jPanelBusquedasParametrosTesoreria.setLayout(gridaBagLayoutBusquedasParametrosTesoreria);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTesoreria=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTesoreria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTesoreria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTesoreria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTesoreria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTesoreria, this.gridBagConstraintsTesoreria);
			
			
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTesoreria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTesoreria, this.gridBagConstraintsTesoreria);
		
			
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTesoreria.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTesoreria, this.gridBagConstraintsTesoreria);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTesoreria;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTesoreria() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTesoreria = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTesoreria.setName("jPanelReporteDinamicoTesoreria"); 
		
		this.jPanelReporteDinamicoTesoreria.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTesoreria.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTesoreria.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTesoreria.setLayout(gridaBagLayoutReporteDinamicoTesoreria);
		
		
		this.jInternalFrameReporteDinamicoTesoreria= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTesoreria = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTesoreria= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTesoreria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTesoreria.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTesoreria.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTesoreria.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTesoreria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTesoreria.setResizable(true);
	    this.jInternalFrameReporteDinamicoTesoreria.setClosable(true);
	    this.jInternalFrameReporteDinamicoTesoreria.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTesoreria.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTesoreria.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTesoreria.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tesorerias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTesoreria = new JLabelMe();

		this.jLabelColumnasSelectReporteTesoreria.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTesoreria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTesoreria.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTesoreria.add(this.jLabelColumnasSelectReporteTesoreria, this.gridBagConstraintsTesoreria);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTesoreria = new JList<Reporte>();
		this.jListColumnasSelectReporteTesoreria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTesoreria.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTesoreria.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTesoreria.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTesoreria.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTesoreria=new JScrollPane(this.jListColumnasSelectReporteTesoreria);
			
			this.jScrollColumnasSelectReporteTesoreria.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTesoreria.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTesoreria.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTesoreria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTesoreria.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTesoreria.add(this.jListColumnasSelectReporteTesoreria, this.gridBagConstraintsTesoreria);
		this.jPanelReporteDinamicoTesoreria.add(this.jScrollColumnasSelectReporteTesoreria, this.gridBagConstraintsTesoreria);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTesoreria = new JLabelMe();

		this.jLabelRelacionesSelectReporteTesoreria.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTesoreria = new JList<Reporte>();
		this.jListRelacionesSelectReporteTesoreria.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTesoreria.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTesoreria.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTesoreria.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTesoreria.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTesoreria=new JScrollPane(this.jListRelacionesSelectReporteTesoreria);
			
			this.jScrollRelacionesSelectReporteTesoreria.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTesoreria.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTesoreria.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTesoreria = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTesoreria = new JComboBoxMe();
		this.jListColumnasValoresGraficoTesoreria = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTesoreria = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTesoreria.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTesoreria.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTesoreria.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTesoreria.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTesoreria = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTesoreria.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTesoreria.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTesoreria.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTesoreria.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTesoreria = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTesoreria.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTesoreria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTesoreria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTesoreria.add(this.jLabelGenerarExcelReporteDinamicoTesoreria, this.gridBagConstraintsTesoreria);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTesoreria = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTesoreria.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTesoreria,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTesoreria.setToolTipText("Generar EXCEL"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTesoreria.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTesoreria.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTesoreria.add(this.jButtonGenerarExcelReporteDinamicoTesoreria, this.gridBagConstraintsTesoreria);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTesoreria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTesoreria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTesoreria.add(this.jComboBoxTiposReportesDinamicoTesoreria, this.gridBagConstraintsTesoreria);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTesoreria = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTesoreria.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTesoreria.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTesoreria.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTesoreria.add(this.jLabelTiposArchivoReporteDinamicoTesoreria, this.gridBagConstraintsTesoreria);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTesoreria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTesoreria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTesoreria.add(this.jComboBoxTiposArchivosReportesDinamicoTesoreria, this.gridBagConstraintsTesoreria);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTesoreria = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTesoreria.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTesoreria,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTesoreria.setToolTipText("Generar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTesoreria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTesoreria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTesoreria.add(this.jButtonGenerarReporteDinamicoTesoreria, this.gridBagConstraintsTesoreria);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTesoreria = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTesoreria.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTesoreria,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTesoreria.setToolTipText("Cancelar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTesoreria.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTesoreria.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTesoreria.add(this.jButtonCerrarReporteDinamicoTesoreria, this.gridBagConstraintsTesoreria);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTesoreria = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTesoreria= new JScrollPane(jPanelReporteDinamicoTesoreria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTesoreria.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTesoreria.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTesoreria.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tesorerias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTesoreria.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTesoreria.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTesoreria.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTesoreria);
		this.jInternalFrameReporteDinamicoTesoreria.getContentPane().add(this.jScrollPanelReporteDinamicoTesoreria, this.gridBagConstraintsTesoreria);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTesoreria() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTesoreria = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTesoreria.setName("jPanelImportacionTesoreria"); 
		
		this.jPanelImportacionTesoreria.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTesoreria.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTesoreria.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTesoreria.setLayout(gridaBagLayoutImportacionTesoreria);
		
		
		this.jInternalFrameImportacionTesoreria= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTesoreria= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTesoreria = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTesoreria= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTesoreria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTesoreria.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTesoreria.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTesoreria.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTesoreria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTesoreria.setResizable(true);
	    this.jInternalFrameImportacionTesoreria.setClosable(true);
	    this.jInternalFrameImportacionTesoreria.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTesoreria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTesoreria.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTesoreria.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTesoreria.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTesoreria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTesoreria.setResizable(true);
	    this.jInternalFrameImportacionTesoreria.setClosable(true);
	    this.jInternalFrameImportacionTesoreria.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTesoreria.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTesoreria.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTesoreria.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tesorerias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTesoreria = new JLabelMe();

		this.jLabelArchivoImportacionTesoreria.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTesoreria.gridy = iPosYImportacion;		
		this.gridBagConstraintsTesoreria.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTesoreria.add(this.jLabelArchivoImportacionTesoreria, this.gridBagConstraintsTesoreria);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTesoreria = new JFileChooser();		
		this.jFileChooserImportacionTesoreria.setToolTipText("ESCOGER ARCHIVO"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTesoreria = new JButtonMe();
		this.jButtonAbrirImportacionTesoreria.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTesoreria,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTesoreria.setToolTipText("Generar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTesoreria.gridy = iPosYImportacion;
		this.gridBagConstraintsTesoreria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTesoreria.add(this.jButtonAbrirImportacionTesoreria, this.gridBagConstraintsTesoreria);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTesoreria = new JLabelMe();

		this.jLabelPathArchivoImportacionTesoreria.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTesoreria.gridy = iPosYImportacion;		
		this.gridBagConstraintsTesoreria.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTesoreria.add(this.jLabelPathArchivoImportacionTesoreria, this.gridBagConstraintsTesoreria);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTesoreria=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTesoreria.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTesoreria.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTesoreria.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTesoreria.gridy = iPosYImportacion;
		this.gridBagConstraintsTesoreria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTesoreria.add(this.jTextFieldPathArchivoImportacionTesoreria, this.gridBagConstraintsTesoreria);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTesoreria = new JButtonMe();
		this.jButtonGenerarImportacionTesoreria.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTesoreria,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTesoreria.setToolTipText("Generar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTesoreria.gridy = iPosYImportacion;
		this.gridBagConstraintsTesoreria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTesoreria.add(this.jButtonGenerarImportacionTesoreria, this.gridBagConstraintsTesoreria);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTesoreria = new JButtonMe();
		this.jButtonCerrarImportacionTesoreria.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTesoreria,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTesoreria.setToolTipText("Cancelar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTesoreria.gridy = iPosYImportacion;
		this.gridBagConstraintsTesoreria.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTesoreria.add(this.jButtonCerrarImportacionTesoreria, this.gridBagConstraintsTesoreria);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTesoreria = new GridBagLayout();
		
		this.jScrollPanelImportacionTesoreria= new JScrollPane(jPanelImportacionTesoreria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy =iPosYImportacion;
		this.gridBagConstraintsTesoreria.gridx =iPosXImportacion;
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTesoreria.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTesoreria.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTesoreria);
		this.jInternalFrameImportacionTesoreria.getContentPane().add(this.jScrollPanelImportacionTesoreria, this.gridBagConstraintsTesoreria);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTesoreria(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTesoreria = new JButtonMe();
			this.jButtonAbrirOrderByTesoreria.setText("Orden");
			this.jButtonAbrirOrderByTesoreria.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTesoreria,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTesoreria";
			inputMap = this.jButtonAbrirOrderByTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTesoreria"));
		
		
			GridBagLayout gridaBagLayoutOrderByTesoreria = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTesoreria.setName("jPanelOrderByTesoreria"); 
			
			this.jPanelOrderByTesoreria.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTesoreria.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTesoreria.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTesoreria.setLayout(gridaBagLayoutOrderByTesoreria);
			
			
			this.jTableDatosTesoreriaOrderBy = new JTableMe();        
			this.jTableDatosTesoreriaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTesoreriaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTesoreriaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTesoreriaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTesoreriaOrderBy.setViewportView(this.jTableDatosTesoreriaOrderBy);
			this.jTableDatosTesoreriaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTesoreriaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTesoreria= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTesoreria= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTesoreria = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTesoreria= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTesoreria.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTesoreria.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTesoreria.setTitle("Orden");
			this.jInternalFrameOrderByTesoreria.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTesoreria.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTesoreria.setResizable(true);
			this.jInternalFrameOrderByTesoreria.setClosable(true);
			this.jInternalFrameOrderByTesoreria.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTesoreria.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTesoreria.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTesoreria.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tesorerias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTesoreria.gridx =iPosXOrderBy;
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTesoreria.ipady =150;
				
			this.jPanelOrderByTesoreria.add(jScrollPanelDatosTesoreriaOrderBy, this.gridBagConstraintsTesoreria);//this.jTableDatosTesoreriaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTesoreria = new JButtonMe();
			this.jButtonCerrarOrderByTesoreria.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTesoreria,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTesoreria.setToolTipText("Cancelar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTesoreria.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTesoreria.add(this.jButtonCerrarOrderByTesoreria, this.gridBagConstraintsTesoreria);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTesoreria = new GridBagLayout();
			
			this.jScrollPanelOrderByTesoreria= new JScrollPane(jPanelOrderByTesoreria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.gridy =iPosYOrderBy;
			this.gridBagConstraintsTesoreria.gridx =iPosXOrderBy;
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTesoreria.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTesoreria.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTesoreria);
			
			this.jInternalFrameOrderByTesoreria.getContentPane().add(this.jScrollPanelOrderByTesoreria, this.gridBagConstraintsTesoreria);			
		
		} else {
			this.jButtonAbrirOrderByTesoreria = new JButtonMe();
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
		int iWidthTableCalculado=0;//530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tesoreriaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTesoreria.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTesoreria.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTesoreria.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTesoreria.getRowHeight();//TesoreriaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TesoreriaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTesoreria.isSelected()) {
					iHeightTable=TesoreriaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TesoreriaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TesoreriaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TesoreriaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTesoreria.isSelected()) {
					iHeightTable=TesoreriaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TesoreriaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TesoreriaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTesoreria.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTesoreria.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTesoreria.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTesoreria.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTesoreria.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTesoreria.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTesoreria!=null && this.jInternalFrameOrderByTesoreria.getjTableDatosOrderBy()!=null) {
			//if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTesoreria.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTesoreria.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTesoreria.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTesoreria.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTesoreria.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTesoreria.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTesoreria.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTesoreria.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTesoreria.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTesoreria.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tesoreriaLogic.getTesorerias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tesorerias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Tesoreria> TraerTesoreriaBeans(List<Tesoreria> tesorerias,ArrayList<Classe> classes)throws Exception {
		try {
			for(Tesoreria tesoreria:tesorerias) {
					
				if(!(TesoreriaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TesoreriaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tesoreria.setsDetalleGeneralEntityReporte(TesoreriaConstantesFunciones.getTesoreriaDescripcion(tesoreria));
										
						
					
						
					
				} else  {
							
					//tesoreria.setsDetalleGeneralEntityReporte(tesoreria.getsDetalleGeneralEntityReporte());
										
				}
				
				//tesoreriabeans.add(tesoreriabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tesorerias;
    }
	//PARA REPORTES FIN
}
