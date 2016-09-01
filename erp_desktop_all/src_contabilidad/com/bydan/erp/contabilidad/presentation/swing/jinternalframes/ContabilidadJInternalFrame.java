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



import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.contabilidad.util.ContabilidadConstantesFunciones;

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
public class ContabilidadJInternalFrame extends ContabilidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarContabilidad;
	
	protected JMenuBar jmenuBarContabilidad;
	
	protected JMenu jmenuContabilidad;
	protected JMenu jmenuDatosContabilidad;
	protected JMenu jmenuArchivoContabilidad;
	protected JMenu jmenuAccionesContabilidad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutContabilidad;	
	protected GridBagConstraints gridBagConstraintsContabilidad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ContabilidadDetalleFormJInternalFrame jInternalFrameDetalleFormContabilidad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoContabilidad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionContabilidad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ContabilidadSessionBean contabilidadSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Contabilidad> contabilidads;		
	public List<Contabilidad> contabilidadsEliminados;	
	public List<Contabilidad> contabilidadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByContabilidad;		
	protected JButton jButtonAbrirOrderByContabilidad;
	
	
	//protected JPanel jPanelOrderByContabilidad;
	//public JScrollPane jScrollPanelOrderByContabilidad;	
	//protected JButton jButtonCerrarOrderByContabilidad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ContabilidadLogic contabilidadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosContabilidad;
	public JScrollPane jScrollPanelDatosEdicionContabilidad;
	public JScrollPane jScrollPanelDatosGeneralContabilidad;
    
	
	
	//public JScrollPane jScrollPanelDatosContabilidadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoContabilidad;
	//public JScrollPane jScrollPanelImportacionContabilidad;
	
	
	
	protected JPanel jPanelAccionesContabilidad;
	
    protected JPanel jPanelPaginacionContabilidad;
    protected JPanel jPanelParametrosReportesContabilidad;
	protected JPanel jPanelParametrosReportesAccionesContabilidad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Contabilidad;
	protected JPanel jPanelParametrosAuxiliar2Contabilidad;
	protected JPanel jPanelParametrosAuxiliar3Contabilidad;
	protected JPanel jPanelParametrosAuxiliar4Contabilidad;
	//protected JPanel jPanelParametrosAuxiliar5Contabilidad;
	
	
	
	//protected JPanel jPanelReporteDinamicoContabilidad;
	//protected JPanel jPanelImportacionContabilidad;
	
	
	public JTable jTableDatosContabilidad;
	
	
	
	//public JTable jTableDatosContabilidadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoContabilidad;
	protected JButton jButtonDuplicarContabilidad;
	protected JButton jButtonCopiarContabilidad;
	protected JButton jButtonVerFormContabilidad;
	protected JButton jButtonNuevoRelacionesContabilidad;
	protected JButton jButtonModificarContabilidad;
	
    protected JButton jButtonGuardarCambiosTablaContabilidad;
	protected JButton jButtonCerrarContabilidad;
	
	
	protected JButton jButtonRecargarInformacionContabilidad;
	protected JButton jButtonProcesarInformacionContabilidad;
	
	
	protected JButton jButtonAnterioresContabilidad;
	protected JButton jButtonSiguientesContabilidad;
	protected JButton jButtonNuevoGuardarCambiosContabilidad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoContabilidad;
	//protected JButton jButtonCerrarReporteDinamicoContabilidad;
	//protected JButton jButtonGenerarExcelReporteDinamicoContabilidad;	
	
	
	
	//protected JButton jButtonAbrirImportacionContabilidad;
	//protected JButton jButtonGenerarImportacionContabilidad;
	//protected JButton jButtonCerrarImportacionContabilidad;
	//protected JFileChooser jFileChooserImportacionContabilidad;
	//protected File fileImportacionContabilidad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarContabilidad;
	protected JButton jButtonDuplicarToolBarContabilidad;
	protected JButton jButtonNuevoRelacionesToolBarContabilidad;
	
	
	public JButton jButtonGuardarCambiosToolBarContabilidad;
	protected JButton jButtonCopiarToolBarContabilidad;
	protected JButton jButtonVerFormToolBarContabilidad;
	public JButton jButtonGuardarCambiosTablaToolBarContabilidad;
	protected JButton jButtonMostrarOcultarTablaToolBarContabilidad;
	protected JButton jButtonCerrarToolBarContabilidad;
	
	protected JButton jButtonRecargarInformacionToolBarContabilidad;
	protected JButton jButtonProcesarInformacionToolBarContabilidad;
	protected JButton jButtonAnterioresToolBarContabilidad;
	protected JButton jButtonSiguientesToolBarContabilidad;
	protected JButton jButtonNuevoGuardarCambiosToolBarContabilidad;
	protected JButton jButtonAbrirOrderByToolBarContabilidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoContabilidad;
	protected JMenuItem jMenuItemDuplicarContabilidad;
	protected JMenuItem jMenuItemNuevoRelacionesContabilidad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosContabilidad;
	protected JMenuItem jMenuItemCopiarContabilidad;
	protected JMenuItem jMenuItemVerFormContabilidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaContabilidad;
	protected JMenuItem jMenuItemCerrarContabilidad;
	protected JMenuItem jMenuItemDetalleCerrarContabilidad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByContabilidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarContabilidad;
	
	protected JMenuItem jMenuItemRecargarInformacionContabilidad;
	protected JMenuItem jMenuItemProcesarInformacionContabilidad;
	protected JMenuItem jMenuItemAnterioresContabilidad;
	protected JMenuItem jMenuItemSiguientesContabilidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosContabilidad;
	protected JMenuItem jMenuItemAbrirOrderByContabilidad;
	protected JMenuItem jMenuItemMostrarOcultarContabilidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesContabilidad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosContabilidad;
	protected JCheckBox jCheckBoxSeleccionadosContabilidad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaContabilidad;
	protected JCheckBox jCheckBoxConGraficoReporteContabilidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesContabilidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesContabilidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoContabilidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoContabilidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesContabilidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionContabilidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesContabilidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesContabilidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarContabilidad;
	protected JTextField jTextFieldValorCampoGeneralContabilidad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteContabilidad;
	//public JList<Reporte> jListColumnasSelectReporteContabilidad;
	//public JScrollPane jScrollColumnasSelectReporteContabilidad;
	
	//public JLabel jLabelRelacionesSelectReporteContabilidad;
	//public JList<Reporte> jListRelacionesSelectReporteContabilidad;
	//public JScrollPane jScrollRelacionesSelectReporteContabilidad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoContabilidad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoContabilidad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoContabilidad;
	//public JLabel jLabelTiposArchivoReporteDinamicoContabilidad;
	
		
	//public JLabel jLabelArchivoImportacionContabilidad;	
	//public JLabel jLabelPathArchivoImportacionContabilidad;
	//protected JTextField jTextFieldPathArchivoImportacionContabilidad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoContabilidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoContabilidad;
	
	//public JLabel jLabelColumnaCategoriaValorContabilidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorContabilidad;
	
	//public JLabel jLabelColumnasValoresGraficoContabilidad;
	//public JList<Reporte> jListColumnasValoresGraficoContabilidad;
	//public JScrollPane jScrollColumnasValoresGraficoContabilidad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoContabilidad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoContabilidad;	
	
	
	
	
	
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
	public ContabilidadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Contabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContabilidadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Contabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContabilidadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Contabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContabilidadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Contabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionContabilidad)	{
		this.jButtonRecargarInformacionContabilidad = jButtonRecargarInformacionContabilidad;
	}
	
	public JButton getjButtonProcesarInformacionContabilidad() {
		return this.jButtonProcesarInformacionContabilidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionContabilidad)	{
		this.jButtonProcesarInformacionContabilidad = jButtonProcesarInformacionContabilidad;
	}
	
	
	public JButton getjButtonRecargarInformacionContabilidad() {
		return this.jButtonRecargarInformacionContabilidad;
	}
	
	
	public List<Contabilidad> getcontabilidads() {
		return this.contabilidads;
	}

	public void setcontabilidads(List<Contabilidad> contabilidads) {
		this.contabilidads = contabilidads;
	}
	
	public List<Contabilidad> getcontabilidadsAux() {
		return this.contabilidadsAux;
	}

	public void setcontabilidadsAux(List<Contabilidad> contabilidadsAux) {
		this.contabilidadsAux = contabilidadsAux;
	}
	
	public List<Contabilidad> getcontabilidadsEliminados() {
		return this.contabilidadsEliminados;
	}

	public void setContabilidadsEliminados(List<Contabilidad> contabilidadsEliminados) {
		this.contabilidadsEliminados = contabilidadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarContabilidad() {
		return jComboBoxTiposSeleccionarContabilidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarContabilidad(
			JComboBox jComboBoxTiposSeleccionarContabilidad) {
		this.jComboBoxTiposSeleccionarContabilidad = jComboBoxTiposSeleccionarContabilidad;
	}
	
	public void setBorderResaltarTiposSeleccionarContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarContabilidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarContabilidad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralContabilidad() {
		return jTextFieldValorCampoGeneralContabilidad;
	}

	public void setjTextFieldValorCampoGeneralContabilidad(
			JTextField jTextFieldValorCampoGeneralContabilidad) {
		this.jTextFieldValorCampoGeneralContabilidad = jTextFieldValorCampoGeneralContabilidad;
	}

	public void setBorderResaltarValorCampoGeneralContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContabilidad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralContabilidad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosContabilidad() {
		return this.jCheckBoxSeleccionarTodosContabilidad;
	}

	public void setjCheckBoxSeleccionarTodosContabilidad(
			JCheckBox jCheckBoxSeleccionarTodosContabilidad) {
		this.jCheckBoxSeleccionarTodosContabilidad = jCheckBoxSeleccionarTodosContabilidad;
	}

	public void setBorderResaltarSeleccionarTodosContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContabilidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosContabilidad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosContabilidad() {
		return this.jCheckBoxSeleccionadosContabilidad;
	}

	public void setjCheckBoxSeleccionadosContabilidad(
			JCheckBox jCheckBoxSeleccionadosContabilidad) {
		this.jCheckBoxSeleccionadosContabilidad = jCheckBoxSeleccionadosContabilidad;
	}
	
	public void setBorderResaltarSeleccionadosContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContabilidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosContabilidad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesContabilidad() {
		return this.jComboBoxTiposArchivosReportesContabilidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesContabilidad(
			JComboBox jComboBoxTiposArchivosReportesContabilidad) {
		this.jComboBoxTiposArchivosReportesContabilidad = jComboBoxTiposArchivosReportesContabilidad;
	}

	public void setBorderResaltarTiposArchivosReportesContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContabilidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesContabilidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesContabilidad() {
		return this.jComboBoxTiposReportesContabilidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesContabilidad(
			JComboBox jComboBoxTiposReportesContabilidad) {
		this.jComboBoxTiposReportesContabilidad = jComboBoxTiposReportesContabilidad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoContabilidad() {
	//	return jComboBoxTiposReportesDinamicoContabilidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoContabilidad(
	//		JComboBox jComboBoxTiposReportesDinamicoContabilidad) {
	//	this.jComboBoxTiposReportesDinamicoContabilidad = jComboBoxTiposReportesDinamicoContabilidad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoContabilidad() {
	//	return jComboBoxTiposArchivosReportesDinamicoContabilidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoContabilidad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoContabilidad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoContabilidad = jComboBoxTiposArchivosReportesDinamicoContabilidad;
	//}
	
	public void setBorderResaltarTiposReportesContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContabilidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesContabilidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesContabilidad() {
		return this.jComboBoxTiposGraficosReportesContabilidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesContabilidad(
			JComboBox jComboBoxTiposGraficosReportesContabilidad) {
		this.jComboBoxTiposGraficosReportesContabilidad = jComboBoxTiposGraficosReportesContabilidad;
	}
	
	public void setBorderResaltarTiposGraficosReportesContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContabilidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesContabilidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionContabilidad() {
		return this.jComboBoxTiposPaginacionContabilidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionContabilidad(
			JComboBox jComboBoxTiposPaginacionContabilidad) {
		this.jComboBoxTiposPaginacionContabilidad = jComboBoxTiposPaginacionContabilidad;
	}
	
	public void setBorderResaltarTiposPaginacionContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContabilidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionContabilidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesContabilidad() {
		return this.jComboBoxTiposRelacionesContabilidad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesContabilidad() {
		return this.jComboBoxTiposAccionesContabilidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesContabilidad(
			JComboBox jComboBoxTiposRelacionesContabilidad) {
		this.jComboBoxTiposRelacionesContabilidad = jComboBoxTiposRelacionesContabilidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesContabilidad(
			JComboBox jComboBoxTiposAccionesContabilidad) {
		this.jComboBoxTiposAccionesContabilidad = jComboBoxTiposAccionesContabilidad;
	}
	
	public void setBorderResaltarTiposRelacionesContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContabilidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesContabilidad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesContabilidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContabilidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesContabilidad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoContabilidad() {
	//	return jCheckBoxConGraficoDinamicoContabilidad;
	//}

	//public void setjCheckBoxConGraficoDinamicoContabilidad(
	//		JCheckBox jCheckBoxConGraficoDinamicoContabilidad) {
	//	this.jCheckBoxConGraficoDinamicoContabilidad = jCheckBoxConGraficoDinamicoContabilidad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoContabilidad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarContabilidad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoContabilidad .setBorder(borderResaltar);		
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
		this.contabilidadSessionBean=new ContabilidadSessionBean();
		
		this.contabilidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.contabilidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.contabilidadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ContabilidadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ContabilidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ContabilidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ContabilidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ContabilidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Contabilidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
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
		
		ContabilidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Contabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarContabilidad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarContabilidad,this.jTtoolBarContabilidad,
							"nuevo","nuevo","Nuevo"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarContabilidad,this.jTtoolBarContabilidad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarContabilidad,this.jTtoolBarContabilidad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarContabilidad,this.jTtoolBarContabilidad,
							"duplicar","duplicar","Duplicar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarContabilidad,this.jTtoolBarContabilidad,
							"copiar","copiar","Copiar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarContabilidad,this.jTtoolBarContabilidad,
							"ver_form","ver_form","Ver"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarContabilidad,this.jTtoolBarContabilidad,
							"recargar","recargar","Recargar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarContabilidad,this.jTtoolBarContabilidad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarContabilidad,this.jTtoolBarContabilidad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarContabilidad,this.jTtoolBarContabilidad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarContabilidad,this.jTtoolBarContabilidad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarContabilidad,this.jTtoolBarContabilidad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarContabilidad,this.jTtoolBarContabilidad,
							"cerrar","cerrar","Salir"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarContabilidad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarContabilidad;
			
				this.jButtonProcesarInformacionToolBarContabilidad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarContabilidad;
				
		//protected JButton jButtonModificarToolBarContabilidad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarContabilidad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuContabilidad=new JMenuMe("General");
		this.jmenuArchivoContabilidad=new JMenuMe("Archivo");
		this.jmenuAccionesContabilidad=new JMenuMe("Acciones");
		this.jmenuDatosContabilidad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoContabilidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoContabilidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoContabilidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarContabilidad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarContabilidad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarContabilidad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesContabilidad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesContabilidad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesContabilidad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosContabilidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosContabilidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosContabilidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarContabilidad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarContabilidad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarContabilidad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormContabilidad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormContabilidad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormContabilidad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaContabilidad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaContabilidad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaContabilidad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarContabilidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarContabilidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarContabilidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionContabilidad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionContabilidad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionContabilidad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionContabilidad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionContabilidad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionContabilidad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresContabilidad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresContabilidad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresContabilidad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesContabilidad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesContabilidad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesContabilidad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByContabilidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByContabilidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByContabilidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarContabilidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarContabilidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarContabilidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByContabilidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByContabilidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByContabilidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarContabilidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarContabilidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarContabilidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosContabilidad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosContabilidad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosContabilidad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoContabilidad.add(this.jMenuItemCerrarContabilidad);
			
			this.jmenuAccionesContabilidad.add(this.jMenuItemNuevoContabilidad);
			this.jmenuAccionesContabilidad.add(this.jMenuItemNuevoGuardarCambiosContabilidad);
			this.jmenuAccionesContabilidad.add(this.jMenuItemNuevoRelacionesContabilidad);
			this.jmenuAccionesContabilidad.add(this.jMenuItemGuardarCambiosTablaContabilidad);		
			this.jmenuAccionesContabilidad.add(this.jMenuItemDuplicarContabilidad);		
			this.jmenuAccionesContabilidad.add(this.jMenuItemCopiarContabilidad);		
			this.jmenuAccionesContabilidad.add(this.jMenuItemVerFormContabilidad);		
			
			this.jmenuDatosContabilidad.add(this.jMenuItemRecargarInformacionContabilidad);				
			this.jmenuDatosContabilidad.add(this.jMenuItemAnterioresContabilidad);				
			this.jmenuDatosContabilidad.add(this.jMenuItemSiguientesContabilidad);				
			this.jmenuDatosContabilidad.add(this.jMenuItemAbrirOrderByContabilidad);				
			this.jmenuDatosContabilidad.add(this.jMenuItemMostrarOcultarContabilidad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesContabilidad.add(this.jMenuItemGuardarCambiosContabilidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarContabilidad.add(this.jmenuArchivoContabilidad);		
			this.jmenuBarContabilidad.add(this.jmenuAccionesContabilidad);		
			this.jmenuBarContabilidad.add(this.jmenuDatosContabilidad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarContabilidad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasContabilidad() {
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
			//this.jInternalFrameDetalleContabilidad = new ContabilidadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Contabilidad DATOS");
			this.jInternalFrameDetalleFormContabilidad = new ContabilidadDetalleFormJInternalFrame(jDesktopPane,this.contabilidadSessionBean.getConGuardarRelaciones(),this.contabilidadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormContabilidad = null;//new ContabilidadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutContabilidad= new GridBagLayout();
		
		
		this.jTableDatosContabilidad = new JTableMe();      
		
		String sToolTipContabilidad="";
		sToolTipContabilidad=ContabilidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipContabilidad+="(Contabilidad.Contabilidad)";
		}
		
		if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipContabilidad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosContabilidad.setToolTipText(sToolTipContabilidad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosContabilidad);
		this.jTableDatosContabilidad.setAutoCreateRowSorter(true);
		this.jTableDatosContabilidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosContabilidad.setRowSelectionAllowed(true);
		this.jTableDatosContabilidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosContabilidad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoContabilidad = new JButtonMe();
		this.jButtonDuplicarContabilidad = new JButtonMe();
		this.jButtonCopiarContabilidad = new JButtonMe();
		this.jButtonVerFormContabilidad = new JButtonMe();
		this.jButtonNuevoRelacionesContabilidad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaContabilidad = new JButtonMe();
		this.jButtonCerrarContabilidad = new JButtonMe();
		
		this.jScrollPanelDatosContabilidad = new JScrollPane();   
        this.jScrollPanelDatosGeneralContabilidad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Contabilidad";
		
		if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contabilidads" + this.sPath));
		} else {
			this.jScrollPanelDatosContabilidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesContabilidad.setToolTipText("Acciones");
        this.jPanelAccionesContabilidad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoContabilidad=new ReporteDinamicoJInternalFrame(ContabilidadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoContabilidad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionContabilidad=new ImportacionJInternalFrame(ContabilidadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionContabilidad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByContabilidad = new JButtonMe();
		
		this.jButtonAbrirOrderByContabilidad.setText("Orden");
		this.jButtonAbrirOrderByContabilidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByContabilidad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByContabilidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContabilidad,false,this);
			
			//this.cargarOrderByContabilidad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByContabilidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContabilidad,true,this);
			
			//this.cargarOrderByContabilidad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosContabilidad.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosContabilidad.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosContabilidad.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosContabilidad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosContabilidad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosContabilidad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoContabilidad.setText("Nuevo");
		this.jButtonDuplicarContabilidad.setText("Duplicar");
		this.jButtonCopiarContabilidad.setText("Copiar");
		this.jButtonVerFormContabilidad.setText("Ver");
		this.jButtonNuevoRelacionesContabilidad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaContabilidad.setText("Guardar");
		this.jButtonCerrarContabilidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoContabilidad,"nuevo_button","Nuevo",this.contabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarContabilidad,"duplicar_button","Duplicar",this.contabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarContabilidad,"copiar_button","Copiar",this.contabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormContabilidad,"ver_form","Ver",this.contabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesContabilidad,"nuevorelaciones_button","Nuevo Rel",this.contabilidadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaContabilidad,"guardarcambiostabla_button","Guardar",this.contabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarContabilidad,"cerrar_button","Salir",this.contabilidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoContabilidad.setToolTipText("Nuevo"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarContabilidad.setToolTipText("Duplicar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarContabilidad.setToolTipText("Copiar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormContabilidad.setToolTipText("Ver"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesContabilidad.setToolTipText("Nuevo Rel"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaContabilidad.setToolTipText("Guardar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarContabilidad.setToolTipText("Salir"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoContabilidad";
		inputMap = this.jButtonNuevoContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoContabilidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoContabilidad"));
		
		//DUPLICAR
		sMapKey = "DuplicarContabilidad";
		inputMap = this.jButtonDuplicarContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarContabilidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarContabilidad"));
		
		//COPIAR
		sMapKey = "CopiarContabilidad";
		inputMap = this.jButtonCopiarContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarContabilidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarContabilidad"));
		
		//VEr FORM
		sMapKey = "VerFormContabilidad";
		inputMap = this.jButtonVerFormContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormContabilidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormContabilidad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesContabilidad";
		inputMap = this.jButtonNuevoRelacionesContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesContabilidad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarContabilidad";
		inputMap = this.jButtonModificarContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarContabilidad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarContabilidad";
		inputMap = this.jButtonCerrarContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarContabilidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaContabilidad";
		inputMap = this.jButtonGuardarCambiosTablaContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaContabilidad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Contabilidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Contabilidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Contabilidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Contabilidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Contabilidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesContabilidad.setName("jPanelParametrosReportesContabilidad"); 
		
		this.jPanelParametrosReportesAccionesContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesContabilidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesContabilidad.setName("jPanelParametrosReportesAccionesContabilidad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionContabilidad = new JButtonMe();
		this.jButtonRecargarInformacionContabilidad.setText("Recargar");
		this.jButtonRecargarInformacionContabilidad.setToolTipText("Recargar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionContabilidad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionContabilidad = new JButtonMe();
		this.jButtonProcesarInformacionContabilidad.setText("Procesar");
		this.jButtonProcesarInformacionContabilidad.setToolTipText("Procesar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionContabilidad.setVisible(false);
			
		this.jButtonProcesarInformacionContabilidad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionContabilidad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionContabilidad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesContabilidad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesContabilidad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesContabilidad.setText("TIPO");       
		this.jComboBoxTiposReportesContabilidad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesContabilidad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesContabilidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionContabilidad.setText("Paginacion");
		this.jComboBoxTiposPaginacionContabilidad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesContabilidad.setText("Accion");
		this.jComboBoxTiposRelacionesContabilidad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesContabilidad.setText("Accion");
		this.jComboBoxTiposAccionesContabilidad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarContabilidad.setText("Accion");
		this.jComboBoxTiposSeleccionarContabilidad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralContabilidad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralContabilidad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralContabilidad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralContabilidad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesContabilidad = new JLabelMe();
		
		this.jLabelAccionesContabilidad.setText("Acciones");		
		this.jLabelAccionesContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosContabilidad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosContabilidad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosContabilidad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosContabilidad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosContabilidad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosContabilidad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaContabilidad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaContabilidad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaContabilidad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteContabilidad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteContabilidad.setText("Graf.");
		this.jCheckBoxConGraficoReporteContabilidad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresContabilidad = new JButtonMe();
		//this.jButtonAnterioresContabilidad.setText("<<");
        this.jButtonAnterioresContabilidad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresContabilidad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesContabilidad = new JButtonMe();
		//this.jButtonSiguientesContabilidad.setText(">>");
        this.jButtonSiguientesContabilidad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesContabilidad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosContabilidad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosContabilidad.setText("Nue");
        this.jButtonNuevoGuardarCambiosContabilidad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosContabilidad,"nuevoguardarcambios_button","Nue",this.contabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosContabilidad";
		inputMap = this.jButtonNuevoGuardarCambiosContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosContabilidad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionContabilidad";
		inputMap = this.jButtonRecargarInformacionContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionContabilidad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesContabilidad";
		inputMap = this.jButtonSiguientesContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesContabilidad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresContabilidad";
		inputMap = this.jButtonAnterioresContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresContabilidad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasContabilidad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesContabilidad.setMinimumSize(new Dimension(this.getWidth(),ContabilidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ContabilidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesContabilidad.setMaximumSize(new Dimension(this.getWidth(),ContabilidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ContabilidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesContabilidad.setPreferredSize(new Dimension(this.getWidth(),ContabilidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ContabilidadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionContabilidad = new GridBagLayout();

			this.jPanelPaginacionContabilidad.setLayout(gridaBagLayoutPaginacionContabilidad);						
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.gridy = 0;
			this.gridBagConstraintsContabilidad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionContabilidad.add(this.jButtonAnterioresContabilidad, this.gridBagConstraintsContabilidad);
					
						
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsContabilidad.gridy = 0;
			
			this.jPanelPaginacionContabilidad.add(this.jButtonNuevoGuardarCambiosContabilidad, this.gridBagConstraintsContabilidad);
						
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsContabilidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsContabilidad.gridy = 0;
			this.jPanelPaginacionContabilidad.add(this.jButtonSiguientesContabilidad, this.gridBagConstraintsContabilidad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.gridy = 1;
			this.gridBagConstraintsContabilidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContabilidad.add(this.jButtonNuevoContabilidad, this.gridBagConstraintsContabilidad);
						
			
			
			if(!this.contabilidadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsContabilidad = new GridBagConstraints();
				this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsContabilidad.gridy = 1;
				this.gridBagConstraintsContabilidad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionContabilidad.add(this.jButtonGuardarCambiosTablaContabilidad, this.gridBagConstraintsContabilidad);
			}
			
			
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.gridy = 1;
			this.gridBagConstraintsContabilidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContabilidad.add(this.jButtonDuplicarContabilidad, this.gridBagConstraintsContabilidad);
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.gridy = 1;
			this.gridBagConstraintsContabilidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContabilidad.add(this.jButtonCopiarContabilidad, this.gridBagConstraintsContabilidad);
		
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.gridy = 1;
			this.gridBagConstraintsContabilidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContabilidad.add(this.jButtonVerFormContabilidad, this.gridBagConstraintsContabilidad);
		
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.gridy = 1;
			this.gridBagConstraintsContabilidad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionContabilidad.add(this.jButtonCerrarContabilidad, this.gridBagConstraintsContabilidad);
		
		
		
		this.jButtonRecargarInformacionContabilidad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionContabilidad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionContabilidad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesContabilidad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesContabilidad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesContabilidad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesContabilidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesContabilidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesContabilidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesContabilidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesContabilidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesContabilidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionContabilidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionContabilidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionContabilidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesContabilidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesContabilidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesContabilidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesContabilidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContabilidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContabilidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarContabilidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarContabilidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarContabilidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaContabilidad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaContabilidad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaContabilidad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteContabilidad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteContabilidad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteContabilidad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosContabilidad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosContabilidad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosContabilidad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosContabilidad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosContabilidad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosContabilidad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesContabilidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesContabilidad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Contabilidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Contabilidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Contabilidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Contabilidad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesContabilidad.setLayout(gridaBagParametrosReportesContabilidad);
			this.jPanelParametrosReportesAccionesContabilidad.setLayout(gridaBagParametrosReportesAccionesContabilidad);
			
			
			this.jPanelParametrosAuxiliar1Contabilidad.setLayout(gridaBagParametrosAuxiliar1Contabilidad);
			this.jPanelParametrosAuxiliar2Contabilidad.setLayout(gridaBagParametrosAuxiliar2Contabilidad);
			this.jPanelParametrosAuxiliar3Contabilidad.setLayout(gridaBagParametrosAuxiliar3Contabilidad);
			this.jPanelParametrosAuxiliar4Contabilidad.setLayout(gridaBagParametrosAuxiliar4Contabilidad);
			//this.jPanelParametrosAuxiliar5Contabilidad.setLayout(gridaBagParametrosAuxiliar2Contabilidad);			
			
			
			
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsContabilidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContabilidad.add(this.jButtonRecargarInformacionContabilidad, this.gridBagConstraintsContabilidad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContabilidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsContabilidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Contabilidad.add(this.jComboBoxTiposPaginacionContabilidad, this.gridBagConstraintsContabilidad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContabilidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsContabilidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Contabilidad.add(this.jCheckBoxConAltoMaximoTablaContabilidad, this.gridBagConstraintsContabilidad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContabilidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsContabilidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Contabilidad.add(this.jComboBoxTiposArchivosReportesContabilidad, this.gridBagConstraintsContabilidad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContabilidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContabilidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContabilidad.add(this.jPanelParametrosAuxiliar1Contabilidad, this.gridBagConstraintsContabilidad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsContabilidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Contabilidad.add(this.jComboBoxTiposReportesContabilidad, this.gridBagConstraintsContabilidad);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContabilidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContabilidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContabilidad.add(this.jPanelParametrosAuxiliar4Contabilidad, this.gridBagConstraintsContabilidad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContabilidad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsContabilidad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContabilidad.add(this.jComboBoxTiposReportesContabilidad, this.gridBagConstraintsContabilidad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContabilidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContabilidad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesContabilidad.add(this.jCheckBoxGenerarReporteContabilidad, this.gridBagConstraintsContabilidad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContabilidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContabilidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContabilidad.add(this.jPanelParametrosAuxiliar2Contabilidad, this.gridBagConstraintsContabilidad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsContabilidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesContabilidad.add(this.jLabelAccionesContabilidad, this.gridBagConstraintsContabilidad);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsContabilidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContabilidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContabilidad.add(this.jComboBoxTiposSeleccionarContabilidad, this.gridBagConstraintsContabilidad);			
			
			
			/*
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsContabilidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesContabilidad.add(this.jCheckBoxSeleccionarTodosContabilidad, this.gridBagConstraintsContabilidad);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsContabilidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Contabilidad.add(this.jCheckBoxSeleccionarTodosContabilidad, this.gridBagConstraintsContabilidad);															
				
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsContabilidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Contabilidad.add(this.jCheckBoxSeleccionadosContabilidad, this.gridBagConstraintsContabilidad);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContabilidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContabilidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContabilidad.add(this.jPanelParametrosAuxiliar3Contabilidad, this.gridBagConstraintsContabilidad);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContabilidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContabilidad.add(this.jComboBoxTiposAccionesContabilidad, this.gridBagConstraintsContabilidad);
	
				
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContabilidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContabilidad.add(this.jTextFieldValorCampoGeneralContabilidad, this.gridBagConstraintsContabilidad);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosContabilidad = new GridBagLayout();

			this.jScrollPanelDatosContabilidad.setLayout(gridaBagLayoutDatosContabilidad);
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.gridy = 0;
			this.gridBagConstraintsContabilidad.gridx = 0;
			
			this.jScrollPanelDatosContabilidad.add(this.jTableDatosContabilidad, this.gridBagConstraintsContabilidad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosContabilidad.setViewportView(this.jTableDatosContabilidad);
		this.jTableDatosContabilidad.setFillsViewportHeight(true);
		this.jTableDatosContabilidad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesContabilidad= new GridBagLayout();
		this.jPanelAccionesContabilidad.setLayout(gridaBagLayoutAccionesContabilidad);
		
		
		/*	
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContabilidad.gridy = 0;
		this.gridBagConstraintsContabilidad.gridx = 0;
			
		this.jPanelAccionesContabilidad.add(this.jButtonNuevoContabilidad, this.gridBagConstraintsContabilidad);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutContabilidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutContabilidad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.contabilidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsContabilidad = new GridBagConstraints();						
			this.gridBagConstraintsContabilidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsContabilidad.gridx = 0;		
			//this.gridBagConstraintsContabilidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsContabilidad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarContabilidad, this.gridBagConstraintsContabilidad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsContabilidad.gridx = 0;		
		//this.gridBagConstraintsContabilidad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsContabilidad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsContabilidad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContabilidad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesContabilidad, this.gridBagConstraintsContabilidad);								
		
		
		/*
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContabilidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesContabilidad, this.gridBagConstraintsContabilidad);
		*/		
		
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsContabilidad.gridx =0;
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsContabilidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosContabilidad, this.gridBagConstraintsContabilidad);
				
		
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContabilidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionContabilidad, this.gridBagConstraintsContabilidad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ContabilidadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosContabilidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosContabilidad = new GridBagLayout();
			this.jPanelBusquedasParametrosContabilidad.setLayout(gridaBagLayoutBusquedasParametrosContabilidad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralContabilidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralContabilidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContabilidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContabilidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContabilidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposContabilidad, this.gridBagConstraintsContabilidad);
			
			
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContabilidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosContabilidad, this.gridBagConstraintsContabilidad);
		
			
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsContabilidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesContabilidad, this.gridBagConstraintsContabilidad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralContabilidad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoContabilidad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoContabilidad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoContabilidad.setName("jPanelReporteDinamicoContabilidad"); 
		
		this.jPanelReporteDinamicoContabilidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoContabilidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoContabilidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoContabilidad.setLayout(gridaBagLayoutReporteDinamicoContabilidad);
		
		
		this.jInternalFrameReporteDinamicoContabilidad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoContabilidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteContabilidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoContabilidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoContabilidad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoContabilidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoContabilidad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoContabilidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoContabilidad.setResizable(true);
	    this.jInternalFrameReporteDinamicoContabilidad.setClosable(true);
	    this.jInternalFrameReporteDinamicoContabilidad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoContabilidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoContabilidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoContabilidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contabilidads"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteContabilidad = new JLabelMe();

		this.jLabelColumnasSelectReporteContabilidad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContabilidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoContabilidad.add(this.jLabelColumnasSelectReporteContabilidad, this.gridBagConstraintsContabilidad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteContabilidad = new JList<Reporte>();
		this.jListColumnasSelectReporteContabilidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteContabilidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteContabilidad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteContabilidad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteContabilidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteContabilidad=new JScrollPane(this.jListColumnasSelectReporteContabilidad);
			
			this.jScrollColumnasSelectReporteContabilidad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteContabilidad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteContabilidad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContabilidad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoContabilidad.add(this.jListColumnasSelectReporteContabilidad, this.gridBagConstraintsContabilidad);
		this.jPanelReporteDinamicoContabilidad.add(this.jScrollColumnasSelectReporteContabilidad, this.gridBagConstraintsContabilidad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteContabilidad = new JLabelMe();

		this.jLabelRelacionesSelectReporteContabilidad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteContabilidad = new JList<Reporte>();
		this.jListRelacionesSelectReporteContabilidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteContabilidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteContabilidad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteContabilidad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteContabilidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteContabilidad=new JScrollPane(this.jListRelacionesSelectReporteContabilidad);
			
			this.jScrollRelacionesSelectReporteContabilidad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteContabilidad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteContabilidad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoContabilidad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoContabilidad = new JComboBoxMe();
		this.jListColumnasValoresGraficoContabilidad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoContabilidad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoContabilidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoContabilidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoContabilidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoContabilidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoContabilidad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoContabilidad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoContabilidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoContabilidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoContabilidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoContabilidad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoContabilidad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContabilidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoContabilidad.add(this.jLabelGenerarExcelReporteDinamicoContabilidad, this.gridBagConstraintsContabilidad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoContabilidad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoContabilidad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoContabilidad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoContabilidad.setToolTipText("Generar EXCEL"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsContabilidad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsContabilidad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoContabilidad.add(this.jButtonGenerarExcelReporteDinamicoContabilidad, this.gridBagConstraintsContabilidad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContabilidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContabilidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContabilidad.add(this.jComboBoxTiposReportesDinamicoContabilidad, this.gridBagConstraintsContabilidad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoContabilidad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoContabilidad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContabilidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContabilidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoContabilidad.add(this.jLabelTiposArchivoReporteDinamicoContabilidad, this.gridBagConstraintsContabilidad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContabilidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContabilidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContabilidad.add(this.jComboBoxTiposArchivosReportesDinamicoContabilidad, this.gridBagConstraintsContabilidad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoContabilidad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoContabilidad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoContabilidad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoContabilidad.setToolTipText("Generar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContabilidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContabilidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContabilidad.add(this.jButtonGenerarReporteDinamicoContabilidad, this.gridBagConstraintsContabilidad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoContabilidad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoContabilidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoContabilidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoContabilidad.setToolTipText("Cancelar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContabilidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContabilidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContabilidad.add(this.jButtonCerrarReporteDinamicoContabilidad, this.gridBagConstraintsContabilidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalContabilidad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoContabilidad= new JScrollPane(jPanelReporteDinamicoContabilidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoContabilidad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoContabilidad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoContabilidad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contabilidads"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsContabilidad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoContabilidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoContabilidad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalContabilidad);
		this.jInternalFrameReporteDinamicoContabilidad.getContentPane().add(this.jScrollPanelReporteDinamicoContabilidad, this.gridBagConstraintsContabilidad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionContabilidad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionContabilidad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionContabilidad.setName("jPanelImportacionContabilidad"); 
		
		this.jPanelImportacionContabilidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionContabilidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionContabilidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionContabilidad.setLayout(gridaBagLayoutImportacionContabilidad);
		
		
		this.jInternalFrameImportacionContabilidad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionContabilidad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionContabilidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteContabilidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionContabilidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionContabilidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionContabilidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionContabilidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionContabilidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionContabilidad.setResizable(true);
	    this.jInternalFrameImportacionContabilidad.setClosable(true);
	    this.jInternalFrameImportacionContabilidad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionContabilidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionContabilidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionContabilidad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionContabilidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionContabilidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionContabilidad.setResizable(true);
	    this.jInternalFrameImportacionContabilidad.setClosable(true);
	    this.jInternalFrameImportacionContabilidad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionContabilidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionContabilidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionContabilidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contabilidads"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionContabilidad = new JLabelMe();

		this.jLabelArchivoImportacionContabilidad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContabilidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsContabilidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionContabilidad.add(this.jLabelArchivoImportacionContabilidad, this.gridBagConstraintsContabilidad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionContabilidad = new JFileChooser();		
		this.jFileChooserImportacionContabilidad.setToolTipText("ESCOGER ARCHIVO"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionContabilidad = new JButtonMe();
		this.jButtonAbrirImportacionContabilidad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionContabilidad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionContabilidad.setToolTipText("Generar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContabilidad.gridy = iPosYImportacion;
		this.gridBagConstraintsContabilidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContabilidad.add(this.jButtonAbrirImportacionContabilidad, this.gridBagConstraintsContabilidad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionContabilidad = new JLabelMe();

		this.jLabelPathArchivoImportacionContabilidad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContabilidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsContabilidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionContabilidad.add(this.jLabelPathArchivoImportacionContabilidad, this.gridBagConstraintsContabilidad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionContabilidad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionContabilidad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionContabilidad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionContabilidad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContabilidad.gridy = iPosYImportacion;
		this.gridBagConstraintsContabilidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContabilidad.add(this.jTextFieldPathArchivoImportacionContabilidad, this.gridBagConstraintsContabilidad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionContabilidad = new JButtonMe();
		this.jButtonGenerarImportacionContabilidad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionContabilidad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionContabilidad.setToolTipText("Generar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContabilidad.gridy = iPosYImportacion;
		this.gridBagConstraintsContabilidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContabilidad.add(this.jButtonGenerarImportacionContabilidad, this.gridBagConstraintsContabilidad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionContabilidad = new JButtonMe();
		this.jButtonCerrarImportacionContabilidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionContabilidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionContabilidad.setToolTipText("Cancelar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContabilidad.gridy = iPosYImportacion;
		this.gridBagConstraintsContabilidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContabilidad.add(this.jButtonCerrarImportacionContabilidad, this.gridBagConstraintsContabilidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalContabilidad = new GridBagLayout();
		
		this.jScrollPanelImportacionContabilidad= new JScrollPane(jPanelImportacionContabilidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy =iPosYImportacion;
		this.gridBagConstraintsContabilidad.gridx =iPosXImportacion;
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionContabilidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionContabilidad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalContabilidad);
		this.jInternalFrameImportacionContabilidad.getContentPane().add(this.jScrollPanelImportacionContabilidad, this.gridBagConstraintsContabilidad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByContabilidad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByContabilidad = new JButtonMe();
			this.jButtonAbrirOrderByContabilidad.setText("Orden");
			this.jButtonAbrirOrderByContabilidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByContabilidad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByContabilidad";
			inputMap = this.jButtonAbrirOrderByContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByContabilidad"));
		
		
			GridBagLayout gridaBagLayoutOrderByContabilidad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByContabilidad.setName("jPanelOrderByContabilidad"); 
			
			this.jPanelOrderByContabilidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByContabilidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByContabilidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByContabilidad.setLayout(gridaBagLayoutOrderByContabilidad);
			
			
			this.jTableDatosContabilidadOrderBy = new JTableMe();        
			this.jTableDatosContabilidadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosContabilidadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosContabilidadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosContabilidadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosContabilidadOrderBy.setViewportView(this.jTableDatosContabilidadOrderBy);
			this.jTableDatosContabilidadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosContabilidadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByContabilidad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByContabilidad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByContabilidad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteContabilidad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByContabilidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByContabilidad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByContabilidad.setTitle("Orden");
			this.jInternalFrameOrderByContabilidad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByContabilidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByContabilidad.setResizable(true);
			this.jInternalFrameOrderByContabilidad.setClosable(true);
			this.jInternalFrameOrderByContabilidad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByContabilidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByContabilidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByContabilidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contabilidads"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsContabilidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsContabilidad.ipady =150;
				
			this.jPanelOrderByContabilidad.add(jScrollPanelDatosContabilidadOrderBy, this.gridBagConstraintsContabilidad);//this.jTableDatosContabilidadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByContabilidad = new JButtonMe();
			this.jButtonCerrarOrderByContabilidad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByContabilidad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByContabilidad.setToolTipText("Cancelar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsContabilidad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByContabilidad.add(this.jButtonCerrarOrderByContabilidad, this.gridBagConstraintsContabilidad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalContabilidad = new GridBagLayout();
			
			this.jScrollPanelOrderByContabilidad= new JScrollPane(jPanelOrderByContabilidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.gridy =iPosYOrderBy;
			this.gridBagConstraintsContabilidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByContabilidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByContabilidad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalContabilidad);
			
			this.jInternalFrameOrderByContabilidad.getContentPane().add(this.jScrollPanelOrderByContabilidad, this.gridBagConstraintsContabilidad);			
		
		} else {
			this.jButtonAbrirOrderByContabilidad = new JButtonMe();
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
			&& this.contabilidadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosContabilidad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosContabilidad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosContabilidad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosContabilidad.getRowHeight();//ContabilidadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ContabilidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaContabilidad.isSelected()) {
					iHeightTable=ContabilidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ContabilidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ContabilidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ContabilidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaContabilidad.isSelected()) {
					iHeightTable=ContabilidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ContabilidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ContabilidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosContabilidad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosContabilidad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosContabilidad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosContabilidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosContabilidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosContabilidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByContabilidad!=null && this.jInternalFrameOrderByContabilidad.getjTableDatosOrderBy()!=null) {
			//if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByContabilidad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByContabilidad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByContabilidad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByContabilidad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByContabilidad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByContabilidad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByContabilidad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosContabilidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosContabilidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosContabilidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=contabilidadLogic.getContabilidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=contabilidads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Contabilidad> TraerContabilidadBeans(List<Contabilidad> contabilidads,ArrayList<Classe> classes)throws Exception {
		try {
			for(Contabilidad contabilidad:contabilidads) {
					
				if(!(ContabilidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ContabilidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					contabilidad.setsDetalleGeneralEntityReporte(ContabilidadConstantesFunciones.getContabilidadDescripcion(contabilidad));
										
						
					
						
					
				} else  {
							
					//contabilidad.setsDetalleGeneralEntityReporte(contabilidad.getsDetalleGeneralEntityReporte());
										
				}
				
				//contabilidadbeans.add(contabilidadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return contabilidads;
    }
	//PARA REPORTES FIN
}
