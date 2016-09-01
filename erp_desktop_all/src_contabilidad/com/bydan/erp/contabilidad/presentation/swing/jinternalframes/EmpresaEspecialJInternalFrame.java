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
import com.bydan.erp.contabilidad.util.EmpresaEspecialConstantesFunciones;

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
public class EmpresaEspecialJInternalFrame extends EmpresaEspecialBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmpresaEspecial;
	
	protected JMenuBar jmenuBarEmpresaEspecial;
	
	protected JMenu jmenuEmpresaEspecial;
	protected JMenu jmenuDatosEmpresaEspecial;
	protected JMenu jmenuArchivoEmpresaEspecial;
	protected JMenu jmenuAccionesEmpresaEspecial;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmpresaEspecial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpresaEspecial;	
	protected GridBagConstraints gridBagConstraintsEmpresaEspecial;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmpresaEspecialDetalleFormJInternalFrame jInternalFrameDetalleFormEmpresaEspecial;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmpresaEspecial;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmpresaEspecial;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EmpresaEspecialSessionBean empresaespecialSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EmpresaEspecial> empresaespecials;		
	public List<EmpresaEspecial> empresaespecialsEliminados;	
	public List<EmpresaEspecial> empresaespecialsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmpresaEspecial;		
	protected JButton jButtonAbrirOrderByEmpresaEspecial;
	
	
	//protected JPanel jPanelOrderByEmpresaEspecial;
	//public JScrollPane jScrollPanelOrderByEmpresaEspecial;	
	//protected JButton jButtonCerrarOrderByEmpresaEspecial;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmpresaEspecialLogic empresaespecialLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmpresaEspecial;
	public JScrollPane jScrollPanelDatosEdicionEmpresaEspecial;
	public JScrollPane jScrollPanelDatosGeneralEmpresaEspecial;
    
	
	
	//public JScrollPane jScrollPanelDatosEmpresaEspecialOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmpresaEspecial;
	//public JScrollPane jScrollPanelImportacionEmpresaEspecial;
	
	
	
	protected JPanel jPanelAccionesEmpresaEspecial;
	
    protected JPanel jPanelPaginacionEmpresaEspecial;
    protected JPanel jPanelParametrosReportesEmpresaEspecial;
	protected JPanel jPanelParametrosReportesAccionesEmpresaEspecial;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EmpresaEspecial;
	protected JPanel jPanelParametrosAuxiliar2EmpresaEspecial;
	protected JPanel jPanelParametrosAuxiliar3EmpresaEspecial;
	protected JPanel jPanelParametrosAuxiliar4EmpresaEspecial;
	//protected JPanel jPanelParametrosAuxiliar5EmpresaEspecial;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmpresaEspecial;
	//protected JPanel jPanelImportacionEmpresaEspecial;
	
	
	public JTable jTableDatosEmpresaEspecial;
	
	
	
	//public JTable jTableDatosEmpresaEspecialOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmpresaEspecial;
	protected JButton jButtonDuplicarEmpresaEspecial;
	protected JButton jButtonCopiarEmpresaEspecial;
	protected JButton jButtonVerFormEmpresaEspecial;
	protected JButton jButtonNuevoRelacionesEmpresaEspecial;
	protected JButton jButtonModificarEmpresaEspecial;
	
    protected JButton jButtonGuardarCambiosTablaEmpresaEspecial;
	protected JButton jButtonCerrarEmpresaEspecial;
	
	
	protected JButton jButtonRecargarInformacionEmpresaEspecial;
	protected JButton jButtonProcesarInformacionEmpresaEspecial;
	
	
	protected JButton jButtonAnterioresEmpresaEspecial;
	protected JButton jButtonSiguientesEmpresaEspecial;
	protected JButton jButtonNuevoGuardarCambiosEmpresaEspecial;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmpresaEspecial;
	//protected JButton jButtonCerrarReporteDinamicoEmpresaEspecial;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmpresaEspecial;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmpresaEspecial;
	//protected JButton jButtonGenerarImportacionEmpresaEspecial;
	//protected JButton jButtonCerrarImportacionEmpresaEspecial;
	//protected JFileChooser jFileChooserImportacionEmpresaEspecial;
	//protected File fileImportacionEmpresaEspecial;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpresaEspecial;
	protected JButton jButtonDuplicarToolBarEmpresaEspecial;
	protected JButton jButtonNuevoRelacionesToolBarEmpresaEspecial;
	
	
	public JButton jButtonGuardarCambiosToolBarEmpresaEspecial;
	protected JButton jButtonCopiarToolBarEmpresaEspecial;
	protected JButton jButtonVerFormToolBarEmpresaEspecial;
	public JButton jButtonGuardarCambiosTablaToolBarEmpresaEspecial;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpresaEspecial;
	protected JButton jButtonCerrarToolBarEmpresaEspecial;
	
	protected JButton jButtonRecargarInformacionToolBarEmpresaEspecial;
	protected JButton jButtonProcesarInformacionToolBarEmpresaEspecial;
	protected JButton jButtonAnterioresToolBarEmpresaEspecial;
	protected JButton jButtonSiguientesToolBarEmpresaEspecial;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmpresaEspecial;
	protected JButton jButtonAbrirOrderByToolBarEmpresaEspecial;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpresaEspecial;
	protected JMenuItem jMenuItemDuplicarEmpresaEspecial;
	protected JMenuItem jMenuItemNuevoRelacionesEmpresaEspecial;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmpresaEspecial;
	protected JMenuItem jMenuItemCopiarEmpresaEspecial;
	protected JMenuItem jMenuItemVerFormEmpresaEspecial;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpresaEspecial;
	protected JMenuItem jMenuItemCerrarEmpresaEspecial;
	protected JMenuItem jMenuItemDetalleCerrarEmpresaEspecial;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmpresaEspecial;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpresaEspecial;
	
	protected JMenuItem jMenuItemRecargarInformacionEmpresaEspecial;
	protected JMenuItem jMenuItemProcesarInformacionEmpresaEspecial;
	protected JMenuItem jMenuItemAnterioresEmpresaEspecial;
	protected JMenuItem jMenuItemSiguientesEmpresaEspecial;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpresaEspecial;
	protected JMenuItem jMenuItemAbrirOrderByEmpresaEspecial;
	protected JMenuItem jMenuItemMostrarOcultarEmpresaEspecial;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpresaEspecial;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmpresaEspecial;
	protected JCheckBox jCheckBoxSeleccionadosEmpresaEspecial;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmpresaEspecial;
	protected JCheckBox jCheckBoxConGraficoReporteEmpresaEspecial;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmpresaEspecial;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmpresaEspecial;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmpresaEspecial;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmpresaEspecial;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmpresaEspecial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmpresaEspecial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpresaEspecial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpresaEspecial;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmpresaEspecial;
	protected JTextField jTextFieldValorCampoGeneralEmpresaEspecial;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmpresaEspecial;
	//public JList<Reporte> jListColumnasSelectReporteEmpresaEspecial;
	//public JScrollPane jScrollColumnasSelectReporteEmpresaEspecial;
	
	//public JLabel jLabelRelacionesSelectReporteEmpresaEspecial;
	//public JList<Reporte> jListRelacionesSelectReporteEmpresaEspecial;
	//public JScrollPane jScrollRelacionesSelectReporteEmpresaEspecial;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmpresaEspecial;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmpresaEspecial;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmpresaEspecial;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmpresaEspecial;
	
		
	//public JLabel jLabelArchivoImportacionEmpresaEspecial;	
	//public JLabel jLabelPathArchivoImportacionEmpresaEspecial;
	//protected JTextField jTextFieldPathArchivoImportacionEmpresaEspecial;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmpresaEspecial;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmpresaEspecial;
	
	//public JLabel jLabelColumnaCategoriaValorEmpresaEspecial;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmpresaEspecial;
	
	//public JLabel jLabelColumnasValoresGraficoEmpresaEspecial;
	//public JList<Reporte> jListColumnasValoresGraficoEmpresaEspecial;
	//public JScrollPane jScrollColumnasValoresGraficoEmpresaEspecial;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmpresaEspecial;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmpresaEspecial;	
	
	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EmpresaEspecialJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EmpresaEspecial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpresaEspecialJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpresaEspecial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpresaEspecialJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpresaEspecial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpresaEspecialJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpresaEspecial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmpresaEspecial)	{
		this.jButtonRecargarInformacionEmpresaEspecial = jButtonRecargarInformacionEmpresaEspecial;
	}
	
	public JButton getjButtonProcesarInformacionEmpresaEspecial() {
		return this.jButtonProcesarInformacionEmpresaEspecial;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpresaEspecial)	{
		this.jButtonProcesarInformacionEmpresaEspecial = jButtonProcesarInformacionEmpresaEspecial;
	}
	
	
	public JButton getjButtonRecargarInformacionEmpresaEspecial() {
		return this.jButtonRecargarInformacionEmpresaEspecial;
	}
	
	
	public List<EmpresaEspecial> getempresaespecials() {
		return this.empresaespecials;
	}

	public void setempresaespecials(List<EmpresaEspecial> empresaespecials) {
		this.empresaespecials = empresaespecials;
	}
	
	public List<EmpresaEspecial> getempresaespecialsAux() {
		return this.empresaespecialsAux;
	}

	public void setempresaespecialsAux(List<EmpresaEspecial> empresaespecialsAux) {
		this.empresaespecialsAux = empresaespecialsAux;
	}
	
	public List<EmpresaEspecial> getempresaespecialsEliminados() {
		return this.empresaespecialsEliminados;
	}

	public void setEmpresaEspecialsEliminados(List<EmpresaEspecial> empresaespecialsEliminados) {
		this.empresaespecialsEliminados = empresaespecialsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmpresaEspecial() {
		return jComboBoxTiposSeleccionarEmpresaEspecial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmpresaEspecial(
			JComboBox jComboBoxTiposSeleccionarEmpresaEspecial) {
		this.jComboBoxTiposSeleccionarEmpresaEspecial = jComboBoxTiposSeleccionarEmpresaEspecial;
	}
	
	public void setBorderResaltarTiposSeleccionarEmpresaEspecial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmpresaEspecial.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmpresaEspecial .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmpresaEspecial() {
		return jTextFieldValorCampoGeneralEmpresaEspecial;
	}

	public void setjTextFieldValorCampoGeneralEmpresaEspecial(
			JTextField jTextFieldValorCampoGeneralEmpresaEspecial) {
		this.jTextFieldValorCampoGeneralEmpresaEspecial = jTextFieldValorCampoGeneralEmpresaEspecial;
	}

	public void setBorderResaltarValorCampoGeneralEmpresaEspecial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresaEspecial.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmpresaEspecial .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmpresaEspecial() {
		return this.jCheckBoxSeleccionarTodosEmpresaEspecial;
	}

	public void setjCheckBoxSeleccionarTodosEmpresaEspecial(
			JCheckBox jCheckBoxSeleccionarTodosEmpresaEspecial) {
		this.jCheckBoxSeleccionarTodosEmpresaEspecial = jCheckBoxSeleccionarTodosEmpresaEspecial;
	}

	public void setBorderResaltarSeleccionarTodosEmpresaEspecial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresaEspecial.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmpresaEspecial .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmpresaEspecial() {
		return this.jCheckBoxSeleccionadosEmpresaEspecial;
	}

	public void setjCheckBoxSeleccionadosEmpresaEspecial(
			JCheckBox jCheckBoxSeleccionadosEmpresaEspecial) {
		this.jCheckBoxSeleccionadosEmpresaEspecial = jCheckBoxSeleccionadosEmpresaEspecial;
	}
	
	public void setBorderResaltarSeleccionadosEmpresaEspecial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresaEspecial.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmpresaEspecial .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmpresaEspecial() {
		return this.jComboBoxTiposArchivosReportesEmpresaEspecial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmpresaEspecial(
			JComboBox jComboBoxTiposArchivosReportesEmpresaEspecial) {
		this.jComboBoxTiposArchivosReportesEmpresaEspecial = jComboBoxTiposArchivosReportesEmpresaEspecial;
	}

	public void setBorderResaltarTiposArchivosReportesEmpresaEspecial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresaEspecial.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmpresaEspecial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmpresaEspecial() {
		return this.jComboBoxTiposReportesEmpresaEspecial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmpresaEspecial(
			JComboBox jComboBoxTiposReportesEmpresaEspecial) {
		this.jComboBoxTiposReportesEmpresaEspecial = jComboBoxTiposReportesEmpresaEspecial;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmpresaEspecial() {
	//	return jComboBoxTiposReportesDinamicoEmpresaEspecial;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmpresaEspecial(
	//		JComboBox jComboBoxTiposReportesDinamicoEmpresaEspecial) {
	//	this.jComboBoxTiposReportesDinamicoEmpresaEspecial = jComboBoxTiposReportesDinamicoEmpresaEspecial;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmpresaEspecial() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmpresaEspecial;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmpresaEspecial(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmpresaEspecial) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmpresaEspecial = jComboBoxTiposArchivosReportesDinamicoEmpresaEspecial;
	//}
	
	public void setBorderResaltarTiposReportesEmpresaEspecial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresaEspecial.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmpresaEspecial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmpresaEspecial() {
		return this.jComboBoxTiposGraficosReportesEmpresaEspecial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmpresaEspecial(
			JComboBox jComboBoxTiposGraficosReportesEmpresaEspecial) {
		this.jComboBoxTiposGraficosReportesEmpresaEspecial = jComboBoxTiposGraficosReportesEmpresaEspecial;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmpresaEspecial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresaEspecial.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmpresaEspecial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmpresaEspecial() {
		return this.jComboBoxTiposPaginacionEmpresaEspecial;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmpresaEspecial(
			JComboBox jComboBoxTiposPaginacionEmpresaEspecial) {
		this.jComboBoxTiposPaginacionEmpresaEspecial = jComboBoxTiposPaginacionEmpresaEspecial;
	}
	
	public void setBorderResaltarTiposPaginacionEmpresaEspecial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresaEspecial.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmpresaEspecial .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmpresaEspecial() {
		return this.jComboBoxTiposRelacionesEmpresaEspecial;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpresaEspecial() {
		return this.jComboBoxTiposAccionesEmpresaEspecial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpresaEspecial(
			JComboBox jComboBoxTiposRelacionesEmpresaEspecial) {
		this.jComboBoxTiposRelacionesEmpresaEspecial = jComboBoxTiposRelacionesEmpresaEspecial;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpresaEspecial(
			JComboBox jComboBoxTiposAccionesEmpresaEspecial) {
		this.jComboBoxTiposAccionesEmpresaEspecial = jComboBoxTiposAccionesEmpresaEspecial;
	}
	
	public void setBorderResaltarTiposRelacionesEmpresaEspecial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresaEspecial.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmpresaEspecial .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmpresaEspecial() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpresaEspecial.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmpresaEspecial .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmpresaEspecial() {
	//	return jCheckBoxConGraficoDinamicoEmpresaEspecial;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmpresaEspecial(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmpresaEspecial) {
	//	this.jCheckBoxConGraficoDinamicoEmpresaEspecial = jCheckBoxConGraficoDinamicoEmpresaEspecial;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmpresaEspecial() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmpresaEspecial.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmpresaEspecial .setBorder(borderResaltar);		
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
		this.empresaespecialSessionBean=new EmpresaEspecialSessionBean();
		
		this.empresaespecialSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empresaespecialSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empresaespecialSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmpresaEspecialJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmpresaEspecialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpresaEspecialJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpresaEspecialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpresaEspecialJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empresa Especial MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
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
		
		EmpresaEspecialJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EmpresaEspecial No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmpresaEspecial= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmpresaEspecial,this.jTtoolBarEmpresaEspecial,
							"nuevo","nuevo","Nuevo"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmpresaEspecial,this.jTtoolBarEmpresaEspecial,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmpresaEspecial,this.jTtoolBarEmpresaEspecial,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmpresaEspecial,this.jTtoolBarEmpresaEspecial,
							"duplicar","duplicar","Duplicar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmpresaEspecial,this.jTtoolBarEmpresaEspecial,
							"copiar","copiar","Copiar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmpresaEspecial,this.jTtoolBarEmpresaEspecial,
							"ver_form","ver_form","Ver"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpresaEspecial,this.jTtoolBarEmpresaEspecial,
							"recargar","recargar","Recargar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpresaEspecial,this.jTtoolBarEmpresaEspecial,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpresaEspecial,this.jTtoolBarEmpresaEspecial,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmpresaEspecial,this.jTtoolBarEmpresaEspecial,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmpresaEspecial,this.jTtoolBarEmpresaEspecial,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmpresaEspecial,this.jTtoolBarEmpresaEspecial,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmpresaEspecial=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmpresaEspecial,this.jTtoolBarEmpresaEspecial,
							"cerrar","cerrar","Salir"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmpresaEspecial=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmpresaEspecial;
			
				this.jButtonProcesarInformacionToolBarEmpresaEspecial=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmpresaEspecial;
				
		//protected JButton jButtonModificarToolBarEmpresaEspecial;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmpresaEspecial=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmpresaEspecial=new JMenuMe("General");
		this.jmenuArchivoEmpresaEspecial=new JMenuMe("Archivo");
		this.jmenuAccionesEmpresaEspecial=new JMenuMe("Acciones");
		this.jmenuDatosEmpresaEspecial=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpresaEspecial= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpresaEspecial.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpresaEspecial,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmpresaEspecial= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmpresaEspecial.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmpresaEspecial,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmpresaEspecial= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmpresaEspecial.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmpresaEspecial,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmpresaEspecial= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpresaEspecial.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpresaEspecial,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmpresaEspecial= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmpresaEspecial.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmpresaEspecial,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmpresaEspecial= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmpresaEspecial.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmpresaEspecial,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmpresaEspecial= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmpresaEspecial.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmpresaEspecial,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpresaEspecial= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpresaEspecial.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpresaEspecial,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmpresaEspecial= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmpresaEspecial.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmpresaEspecial,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmpresaEspecial= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmpresaEspecial.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmpresaEspecial,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmpresaEspecial= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmpresaEspecial.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmpresaEspecial,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmpresaEspecial= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmpresaEspecial.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmpresaEspecial,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmpresaEspecial= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmpresaEspecial.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmpresaEspecial,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpresaEspecial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpresaEspecial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpresaEspecial,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmpresaEspecial= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmpresaEspecial.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmpresaEspecial,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpresaEspecial= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpresaEspecial.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpresaEspecial,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmpresaEspecial= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmpresaEspecial.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmpresaEspecial,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmpresaEspecial.add(this.jMenuItemCerrarEmpresaEspecial);
			
			this.jmenuAccionesEmpresaEspecial.add(this.jMenuItemNuevoEmpresaEspecial);
			this.jmenuAccionesEmpresaEspecial.add(this.jMenuItemNuevoGuardarCambiosEmpresaEspecial);
			this.jmenuAccionesEmpresaEspecial.add(this.jMenuItemNuevoRelacionesEmpresaEspecial);
			this.jmenuAccionesEmpresaEspecial.add(this.jMenuItemGuardarCambiosTablaEmpresaEspecial);		
			this.jmenuAccionesEmpresaEspecial.add(this.jMenuItemDuplicarEmpresaEspecial);		
			this.jmenuAccionesEmpresaEspecial.add(this.jMenuItemCopiarEmpresaEspecial);		
			this.jmenuAccionesEmpresaEspecial.add(this.jMenuItemVerFormEmpresaEspecial);		
			
			this.jmenuDatosEmpresaEspecial.add(this.jMenuItemRecargarInformacionEmpresaEspecial);				
			this.jmenuDatosEmpresaEspecial.add(this.jMenuItemAnterioresEmpresaEspecial);				
			this.jmenuDatosEmpresaEspecial.add(this.jMenuItemSiguientesEmpresaEspecial);				
			this.jmenuDatosEmpresaEspecial.add(this.jMenuItemAbrirOrderByEmpresaEspecial);				
			this.jmenuDatosEmpresaEspecial.add(this.jMenuItemMostrarOcultarEmpresaEspecial);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmpresaEspecial.add(this.jMenuItemGuardarCambiosEmpresaEspecial);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmpresaEspecial.add(this.jmenuArchivoEmpresaEspecial);		
			this.jmenuBarEmpresaEspecial.add(this.jmenuAccionesEmpresaEspecial);		
			this.jmenuBarEmpresaEspecial.add(this.jmenuDatosEmpresaEspecial);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmpresaEspecial);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmpresaEspecial() {
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
			//this.jInternalFrameDetalleEmpresaEspecial = new EmpresaEspecialDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Empresa Especial DATOS");
			this.jInternalFrameDetalleFormEmpresaEspecial = new EmpresaEspecialDetalleFormJInternalFrame(jDesktopPane,this.empresaespecialSessionBean.getConGuardarRelaciones(),this.empresaespecialSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmpresaEspecial = null;//new EmpresaEspecialDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpresaEspecial= new GridBagLayout();
		
		
		this.jTableDatosEmpresaEspecial = new JTableMe();      
		
		String sToolTipEmpresaEspecial="";
		sToolTipEmpresaEspecial=EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpresaEspecial+="(Contabilidad.EmpresaEspecial)";
		}
		
		if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpresaEspecial+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmpresaEspecial.setToolTipText(sToolTipEmpresaEspecial);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmpresaEspecial);
		this.jTableDatosEmpresaEspecial.setAutoCreateRowSorter(true);
		this.jTableDatosEmpresaEspecial.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmpresaEspecial.setRowSelectionAllowed(true);
		this.jTableDatosEmpresaEspecial.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmpresaEspecial,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmpresaEspecial = new JButtonMe();
		this.jButtonDuplicarEmpresaEspecial = new JButtonMe();
		this.jButtonCopiarEmpresaEspecial = new JButtonMe();
		this.jButtonVerFormEmpresaEspecial = new JButtonMe();
		this.jButtonNuevoRelacionesEmpresaEspecial = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmpresaEspecial = new JButtonMe();
		this.jButtonCerrarEmpresaEspecial = new JButtonMe();
		
		this.jScrollPanelDatosEmpresaEspecial = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmpresaEspecial = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmpresaEspecial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Empresa Especial";
		
		if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empresa Especiales" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpresaEspecial.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpresaEspecial.setToolTipText("Acciones");
        this.jPanelAccionesEmpresaEspecial.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEmpresaEspecial=new ReporteDinamicoJInternalFrame(EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmpresaEspecial();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmpresaEspecial=new ImportacionJInternalFrame(EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmpresaEspecial();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmpresaEspecial = new JButtonMe();
		
		this.jButtonAbrirOrderByEmpresaEspecial.setText("Orden");
		this.jButtonAbrirOrderByEmpresaEspecial.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpresaEspecial,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmpresaEspecial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpresaEspecial=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpresaEspecial,false,this);
			
			//this.cargarOrderByEmpresaEspecial(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpresaEspecial=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpresaEspecial,true,this);
			
			//this.cargarOrderByEmpresaEspecial(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmpresaEspecial.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEmpresaEspecial.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEmpresaEspecial.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEmpresaEspecial.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpresaEspecial.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpresaEspecial.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmpresaEspecial.setText("Nuevo");
		this.jButtonDuplicarEmpresaEspecial.setText("Duplicar");
		this.jButtonCopiarEmpresaEspecial.setText("Copiar");
		this.jButtonVerFormEmpresaEspecial.setText("Ver");
		this.jButtonNuevoRelacionesEmpresaEspecial.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmpresaEspecial.setText("Guardar");
		this.jButtonCerrarEmpresaEspecial.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpresaEspecial,"nuevo_button","Nuevo",this.empresaespecialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmpresaEspecial,"duplicar_button","Duplicar",this.empresaespecialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmpresaEspecial,"copiar_button","Copiar",this.empresaespecialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmpresaEspecial,"ver_form","Ver",this.empresaespecialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmpresaEspecial,"nuevorelaciones_button","Nuevo Rel",this.empresaespecialSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpresaEspecial,"guardarcambiostabla_button","Guardar",this.empresaespecialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpresaEspecial,"cerrar_button","Salir",this.empresaespecialSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmpresaEspecial.setToolTipText("Nuevo"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmpresaEspecial.setToolTipText("Duplicar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmpresaEspecial.setToolTipText("Copiar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmpresaEspecial.setToolTipText("Ver"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmpresaEspecial.setToolTipText("Nuevo Rel"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmpresaEspecial.setToolTipText("Guardar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpresaEspecial.setToolTipText("Salir"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpresaEspecial";
		inputMap = this.jButtonNuevoEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpresaEspecial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpresaEspecial"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmpresaEspecial";
		inputMap = this.jButtonDuplicarEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmpresaEspecial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmpresaEspecial"));
		
		//COPIAR
		sMapKey = "CopiarEmpresaEspecial";
		inputMap = this.jButtonCopiarEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmpresaEspecial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmpresaEspecial"));
		
		//VEr FORM
		sMapKey = "VerFormEmpresaEspecial";
		inputMap = this.jButtonVerFormEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmpresaEspecial.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmpresaEspecial"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmpresaEspecial";
		inputMap = this.jButtonNuevoRelacionesEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmpresaEspecial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmpresaEspecial"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmpresaEspecial";
		inputMap = this.jButtonModificarEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmpresaEspecial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmpresaEspecial"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmpresaEspecial";
		inputMap = this.jButtonCerrarEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpresaEspecial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpresaEspecial"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpresaEspecial";
		inputMap = this.jButtonGuardarCambiosTablaEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpresaEspecial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpresaEspecial"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmpresaEspecial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmpresaEspecial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmpresaEspecial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EmpresaEspecial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EmpresaEspecial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EmpresaEspecial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EmpresaEspecial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EmpresaEspecial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmpresaEspecial.setName("jPanelParametrosReportesEmpresaEspecial"); 
		
		this.jPanelParametrosReportesAccionesEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmpresaEspecial.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmpresaEspecial.setName("jPanelParametrosReportesAccionesEmpresaEspecial"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmpresaEspecial = new JButtonMe();
		this.jButtonRecargarInformacionEmpresaEspecial.setText("Recargar");
		this.jButtonRecargarInformacionEmpresaEspecial.setToolTipText("Recargar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmpresaEspecial,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmpresaEspecial = new JButtonMe();
		this.jButtonProcesarInformacionEmpresaEspecial.setText("Procesar");
		this.jButtonProcesarInformacionEmpresaEspecial.setToolTipText("Procesar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmpresaEspecial.setVisible(false);
			
		this.jButtonProcesarInformacionEmpresaEspecial.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpresaEspecial.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpresaEspecial.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmpresaEspecial = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpresaEspecial.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmpresaEspecial.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmpresaEspecial = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpresaEspecial.setText("TIPO");       
		this.jComboBoxTiposReportesEmpresaEspecial.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmpresaEspecial = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpresaEspecial.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmpresaEspecial.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmpresaEspecial = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmpresaEspecial.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmpresaEspecial.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmpresaEspecial = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmpresaEspecial.setText("Accion");
		this.jComboBoxTiposRelacionesEmpresaEspecial.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmpresaEspecial = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpresaEspecial.setText("Accion");
		this.jComboBoxTiposAccionesEmpresaEspecial.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmpresaEspecial = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmpresaEspecial.setText("Accion");
		this.jComboBoxTiposSeleccionarEmpresaEspecial.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmpresaEspecial=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmpresaEspecial.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpresaEspecial.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpresaEspecial.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmpresaEspecial = new JLabelMe();
		
		this.jLabelAccionesEmpresaEspecial.setText("Acciones");		
		this.jLabelAccionesEmpresaEspecial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpresaEspecial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpresaEspecial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmpresaEspecial = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmpresaEspecial.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmpresaEspecial.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmpresaEspecial = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmpresaEspecial.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmpresaEspecial.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmpresaEspecial = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmpresaEspecial.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmpresaEspecial.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmpresaEspecial = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmpresaEspecial.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmpresaEspecial.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmpresaEspecial = new JButtonMe();
		//this.jButtonAnterioresEmpresaEspecial.setText("<<");
        this.jButtonAnterioresEmpresaEspecial.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmpresaEspecial,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmpresaEspecial = new JButtonMe();
		//this.jButtonSiguientesEmpresaEspecial.setText(">>");
        this.jButtonSiguientesEmpresaEspecial.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmpresaEspecial,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmpresaEspecial = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmpresaEspecial.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmpresaEspecial.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmpresaEspecial,"nuevoguardarcambios_button","Nue",this.empresaespecialSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmpresaEspecial";
		inputMap = this.jButtonNuevoGuardarCambiosEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmpresaEspecial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmpresaEspecial"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmpresaEspecial";
		inputMap = this.jButtonRecargarInformacionEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmpresaEspecial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmpresaEspecial"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmpresaEspecial";
		inputMap = this.jButtonSiguientesEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmpresaEspecial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmpresaEspecial"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmpresaEspecial";
		inputMap = this.jButtonAnterioresEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmpresaEspecial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmpresaEspecial"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmpresaEspecial();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmpresaEspecial.setMinimumSize(new Dimension(this.getWidth(),EmpresaEspecialBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpresaEspecialBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpresaEspecial.setMaximumSize(new Dimension(this.getWidth(),EmpresaEspecialBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpresaEspecialBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpresaEspecial.setPreferredSize(new Dimension(this.getWidth(),EmpresaEspecialBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpresaEspecialBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmpresaEspecial = new GridBagLayout();

			this.jPanelPaginacionEmpresaEspecial.setLayout(gridaBagLayoutPaginacionEmpresaEspecial);						
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.gridy = 0;
			this.gridBagConstraintsEmpresaEspecial.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmpresaEspecial.add(this.jButtonAnterioresEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
					
						
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpresaEspecial.gridy = 0;
			
			this.jPanelPaginacionEmpresaEspecial.add(this.jButtonNuevoGuardarCambiosEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
						
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmpresaEspecial.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpresaEspecial.gridy = 0;
			this.jPanelPaginacionEmpresaEspecial.add(this.jButtonSiguientesEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.gridy = 1;
			this.gridBagConstraintsEmpresaEspecial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpresaEspecial.add(this.jButtonNuevoEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
						
			
			
			if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
				this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpresaEspecial.gridy = 1;
				this.gridBagConstraintsEmpresaEspecial.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmpresaEspecial.add(this.jButtonGuardarCambiosTablaEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
			}
			
			
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.gridy = 1;
			this.gridBagConstraintsEmpresaEspecial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpresaEspecial.add(this.jButtonDuplicarEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.gridy = 1;
			this.gridBagConstraintsEmpresaEspecial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpresaEspecial.add(this.jButtonCopiarEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.gridy = 1;
			this.gridBagConstraintsEmpresaEspecial.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpresaEspecial.add(this.jButtonVerFormEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.gridy = 1;
			this.gridBagConstraintsEmpresaEspecial.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmpresaEspecial.add(this.jButtonCerrarEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		
		
		
		this.jButtonRecargarInformacionEmpresaEspecial.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpresaEspecial.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpresaEspecial.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmpresaEspecial.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpresaEspecial.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpresaEspecial.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmpresaEspecial.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpresaEspecial.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpresaEspecial.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmpresaEspecial.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpresaEspecial.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpresaEspecial.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmpresaEspecial.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpresaEspecial.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpresaEspecial.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmpresaEspecial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpresaEspecial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpresaEspecial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmpresaEspecial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpresaEspecial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpresaEspecial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmpresaEspecial.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpresaEspecial.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpresaEspecial.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmpresaEspecial.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpresaEspecial.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpresaEspecial.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmpresaEspecial.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpresaEspecial.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpresaEspecial.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmpresaEspecial.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpresaEspecial.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpresaEspecial.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmpresaEspecial.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpresaEspecial.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpresaEspecial.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmpresaEspecial = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmpresaEspecial = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EmpresaEspecial = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EmpresaEspecial = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EmpresaEspecial = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EmpresaEspecial = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmpresaEspecial.setLayout(gridaBagParametrosReportesEmpresaEspecial);
			this.jPanelParametrosReportesAccionesEmpresaEspecial.setLayout(gridaBagParametrosReportesAccionesEmpresaEspecial);
			
			
			this.jPanelParametrosAuxiliar1EmpresaEspecial.setLayout(gridaBagParametrosAuxiliar1EmpresaEspecial);
			this.jPanelParametrosAuxiliar2EmpresaEspecial.setLayout(gridaBagParametrosAuxiliar2EmpresaEspecial);
			this.jPanelParametrosAuxiliar3EmpresaEspecial.setLayout(gridaBagParametrosAuxiliar3EmpresaEspecial);
			this.jPanelParametrosAuxiliar4EmpresaEspecial.setLayout(gridaBagParametrosAuxiliar4EmpresaEspecial);
			//this.jPanelParametrosAuxiliar5EmpresaEspecial.setLayout(gridaBagParametrosAuxiliar2EmpresaEspecial);			
			
			
			
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpresaEspecial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpresaEspecial.add(this.jButtonRecargarInformacionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresaEspecial.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpresaEspecial.add(this.jComboBoxTiposPaginacionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresaEspecial.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpresaEspecial.add(this.jCheckBoxConAltoMaximoTablaEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresaEspecial.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpresaEspecial.add(this.jComboBoxTiposArchivosReportesEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresaEspecial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpresaEspecial.add(this.jPanelParametrosAuxiliar1EmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpresaEspecial.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EmpresaEspecial.add(this.jComboBoxTiposReportesEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresaEspecial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpresaEspecial.add(this.jPanelParametrosAuxiliar4EmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresaEspecial.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpresaEspecial.add(this.jComboBoxTiposReportesEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresaEspecial.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpresaEspecial.add(this.jCheckBoxGenerarReporteEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresaEspecial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpresaEspecial.add(this.jPanelParametrosAuxiliar2EmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpresaEspecial.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpresaEspecial.add(this.jLabelAccionesEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
				this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmpresaEspecial.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmpresaEspecial.add(this.jButtonAbrirOrderByEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresaEspecial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpresaEspecial.add(this.jComboBoxTiposSeleccionarEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);			
			
			
			/*
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpresaEspecial.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpresaEspecial.add(this.jCheckBoxSeleccionarTodosEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpresaEspecial.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpresaEspecial.add(this.jCheckBoxSeleccionarTodosEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);															
				
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpresaEspecial.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpresaEspecial.add(this.jCheckBoxSeleccionadosEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresaEspecial.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpresaEspecial.add(this.jPanelParametrosAuxiliar3EmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresaEspecial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpresaEspecial.add(this.jComboBoxTiposAccionesEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
	
				
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpresaEspecial.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpresaEspecial.add(this.jTextFieldValorCampoGeneralEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmpresaEspecial = new GridBagLayout();

			this.jScrollPanelDatosEmpresaEspecial.setLayout(gridaBagLayoutDatosEmpresaEspecial);
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.gridy = 0;
			this.gridBagConstraintsEmpresaEspecial.gridx = 0;
			
			this.jScrollPanelDatosEmpresaEspecial.add(this.jTableDatosEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmpresaEspecial.setViewportView(this.jTableDatosEmpresaEspecial);
		this.jTableDatosEmpresaEspecial.setFillsViewportHeight(true);
		this.jTableDatosEmpresaEspecial.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmpresaEspecial= new GridBagLayout();
		this.jPanelAccionesEmpresaEspecial.setLayout(gridaBagLayoutAccionesEmpresaEspecial);
		
		
		/*	
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = 0;
		this.gridBagConstraintsEmpresaEspecial.gridx = 0;
			
		this.jPanelAccionesEmpresaEspecial.add(this.jButtonNuevoEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpresaEspecial = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpresaEspecial);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empresaespecialSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();						
			this.gridBagConstraintsEmpresaEspecial.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpresaEspecial.gridx = 0;		
			//this.gridBagConstraintsEmpresaEspecial.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpresaEspecial.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmpresaEspecial.gridx = 0;		
		//this.gridBagConstraintsEmpresaEspecial.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresaEspecial.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmpresaEspecial.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmpresaEspecial);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpresaEspecial.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);								
		
		
		/*
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpresaEspecial.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		*/		
		
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpresaEspecial.gridx =0;
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpresaEspecial.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
				
		
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpresaEspecial.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EmpresaEspecialJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmpresaEspecial= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpresaEspecial = new GridBagLayout();
			this.jPanelBusquedasParametrosEmpresaEspecial.setLayout(gridaBagLayoutBusquedasParametrosEmpresaEspecial);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmpresaEspecial=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpresaEspecial.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpresaEspecial.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpresaEspecial.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpresaEspecial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
			
			
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpresaEspecial.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		
			
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpresaEspecial.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmpresaEspecial;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmpresaEspecial() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmpresaEspecial = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmpresaEspecial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmpresaEspecial.setName("jPanelReporteDinamicoEmpresaEspecial"); 
		
		this.jPanelReporteDinamicoEmpresaEspecial.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpresaEspecial.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpresaEspecial.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmpresaEspecial.setLayout(gridaBagLayoutReporteDinamicoEmpresaEspecial);
		
		
		this.jInternalFrameReporteDinamicoEmpresaEspecial= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmpresaEspecial = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpresaEspecial= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmpresaEspecial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmpresaEspecial.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmpresaEspecial.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmpresaEspecial.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmpresaEspecial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmpresaEspecial.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmpresaEspecial.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmpresaEspecial.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmpresaEspecial.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpresaEspecial.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpresaEspecial.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empresa Especiales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmpresaEspecial = new JLabelMe();

		this.jLabelColumnasSelectReporteEmpresaEspecial.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmpresaEspecial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpresaEspecial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpresaEspecial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpresaEspecial.add(this.jLabelColumnasSelectReporteEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmpresaEspecial = new JList<Reporte>();
		this.jListColumnasSelectReporteEmpresaEspecial.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmpresaEspecial.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmpresaEspecial.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpresaEspecial.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpresaEspecial.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmpresaEspecial=new JScrollPane(this.jListColumnasSelectReporteEmpresaEspecial);
			
			this.jScrollColumnasSelectReporteEmpresaEspecial.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpresaEspecial.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpresaEspecial.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpresaEspecial.add(this.jListColumnasSelectReporteEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		this.jPanelReporteDinamicoEmpresaEspecial.add(this.jScrollColumnasSelectReporteEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmpresaEspecial = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmpresaEspecial.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmpresaEspecial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpresaEspecial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpresaEspecial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmpresaEspecial = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmpresaEspecial.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmpresaEspecial.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmpresaEspecial.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpresaEspecial.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpresaEspecial.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmpresaEspecial=new JScrollPane(this.jListRelacionesSelectReporteEmpresaEspecial);
			
			this.jScrollRelacionesSelectReporteEmpresaEspecial.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpresaEspecial.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpresaEspecial.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEmpresaEspecial = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmpresaEspecial = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmpresaEspecial = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmpresaEspecial = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmpresaEspecial.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmpresaEspecial.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpresaEspecial.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpresaEspecial.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmpresaEspecial = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmpresaEspecial.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmpresaEspecial.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpresaEspecial.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpresaEspecial.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmpresaEspecial = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmpresaEspecial.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmpresaEspecial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpresaEspecial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpresaEspecial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpresaEspecial.add(this.jLabelGenerarExcelReporteDinamicoEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmpresaEspecial = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmpresaEspecial.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmpresaEspecial,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmpresaEspecial.setToolTipText("Generar EXCEL"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		//this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmpresaEspecial.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmpresaEspecial.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmpresaEspecial.add(this.jButtonGenerarExcelReporteDinamicoEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpresaEspecial.add(this.jComboBoxTiposReportesDinamicoEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmpresaEspecial = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmpresaEspecial.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmpresaEspecial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpresaEspecial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpresaEspecial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpresaEspecial.add(this.jLabelTiposArchivoReporteDinamicoEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpresaEspecial.add(this.jComboBoxTiposArchivosReportesDinamicoEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmpresaEspecial = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmpresaEspecial.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmpresaEspecial,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmpresaEspecial.setToolTipText("Generar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpresaEspecial.add(this.jButtonGenerarReporteDinamicoEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmpresaEspecial = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmpresaEspecial.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmpresaEspecial,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmpresaEspecial.setToolTipText("Cancelar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpresaEspecial.add(this.jButtonCerrarReporteDinamicoEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmpresaEspecial = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmpresaEspecial= new JScrollPane(jPanelReporteDinamicoEmpresaEspecial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmpresaEspecial.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpresaEspecial.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpresaEspecial.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empresa Especiales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmpresaEspecial.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmpresaEspecial.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmpresaEspecial.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmpresaEspecial);
		this.jInternalFrameReporteDinamicoEmpresaEspecial.getContentPane().add(this.jScrollPanelReporteDinamicoEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmpresaEspecial() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmpresaEspecial = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmpresaEspecial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmpresaEspecial.setName("jPanelImportacionEmpresaEspecial"); 
		
		this.jPanelImportacionEmpresaEspecial.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpresaEspecial.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpresaEspecial.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmpresaEspecial.setLayout(gridaBagLayoutImportacionEmpresaEspecial);
		
		
		this.jInternalFrameImportacionEmpresaEspecial= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmpresaEspecial= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmpresaEspecial = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpresaEspecial= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmpresaEspecial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpresaEspecial.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpresaEspecial.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmpresaEspecial.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpresaEspecial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpresaEspecial.setResizable(true);
	    this.jInternalFrameImportacionEmpresaEspecial.setClosable(true);
	    this.jInternalFrameImportacionEmpresaEspecial.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmpresaEspecial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpresaEspecial.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpresaEspecial.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmpresaEspecial.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpresaEspecial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpresaEspecial.setResizable(true);
	    this.jInternalFrameImportacionEmpresaEspecial.setClosable(true);
	    this.jInternalFrameImportacionEmpresaEspecial.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmpresaEspecial.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpresaEspecial.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpresaEspecial.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empresa Especiales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmpresaEspecial = new JLabelMe();

		this.jLabelArchivoImportacionEmpresaEspecial.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmpresaEspecial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpresaEspecial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpresaEspecial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpresaEspecial.add(this.jLabelArchivoImportacionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmpresaEspecial = new JFileChooser();		
		this.jFileChooserImportacionEmpresaEspecial.setToolTipText("ESCOGER ARCHIVO"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmpresaEspecial = new JButtonMe();
		this.jButtonAbrirImportacionEmpresaEspecial.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmpresaEspecial,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmpresaEspecial.setToolTipText("Generar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpresaEspecial.add(this.jButtonAbrirImportacionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmpresaEspecial = new JLabelMe();

		this.jLabelPathArchivoImportacionEmpresaEspecial.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmpresaEspecial.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpresaEspecial.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpresaEspecial.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpresaEspecial.add(this.jLabelPathArchivoImportacionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmpresaEspecial=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmpresaEspecial.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpresaEspecial.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpresaEspecial.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpresaEspecial.add(this.jTextFieldPathArchivoImportacionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmpresaEspecial = new JButtonMe();
		this.jButtonGenerarImportacionEmpresaEspecial.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmpresaEspecial,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmpresaEspecial.setToolTipText("Generar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpresaEspecial.add(this.jButtonGenerarImportacionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmpresaEspecial = new JButtonMe();
		this.jButtonCerrarImportacionEmpresaEspecial.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmpresaEspecial,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmpresaEspecial.setToolTipText("Cancelar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpresaEspecial.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpresaEspecial.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpresaEspecial.add(this.jButtonCerrarImportacionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmpresaEspecial = new GridBagLayout();
		
		this.jScrollPanelImportacionEmpresaEspecial= new JScrollPane(jPanelImportacionEmpresaEspecial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
		this.gridBagConstraintsEmpresaEspecial.gridy =iPosYImportacion;
		this.gridBagConstraintsEmpresaEspecial.gridx =iPosXImportacion;
		this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmpresaEspecial.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmpresaEspecial.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmpresaEspecial);
		this.jInternalFrameImportacionEmpresaEspecial.getContentPane().add(this.jScrollPanelImportacionEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmpresaEspecial(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmpresaEspecial = new JButtonMe();
			this.jButtonAbrirOrderByEmpresaEspecial.setText("Orden");
			this.jButtonAbrirOrderByEmpresaEspecial.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpresaEspecial,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmpresaEspecial";
			inputMap = this.jButtonAbrirOrderByEmpresaEspecial.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmpresaEspecial.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmpresaEspecial"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmpresaEspecial = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmpresaEspecial = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmpresaEspecial.setName("jPanelOrderByEmpresaEspecial"); 
			
			this.jPanelOrderByEmpresaEspecial.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpresaEspecial.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpresaEspecial.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmpresaEspecial.setLayout(gridaBagLayoutOrderByEmpresaEspecial);
			
			
			this.jTableDatosEmpresaEspecialOrderBy = new JTableMe();        
			this.jTableDatosEmpresaEspecialOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmpresaEspecialOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmpresaEspecialOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmpresaEspecialOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmpresaEspecialOrderBy.setViewportView(this.jTableDatosEmpresaEspecialOrderBy);
			this.jTableDatosEmpresaEspecialOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmpresaEspecialOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmpresaEspecial= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmpresaEspecial= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmpresaEspecial = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmpresaEspecial= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmpresaEspecial.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmpresaEspecial.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmpresaEspecial.setTitle("Orden");
			this.jInternalFrameOrderByEmpresaEspecial.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmpresaEspecial.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmpresaEspecial.setResizable(true);
			this.jInternalFrameOrderByEmpresaEspecial.setClosable(true);
			this.jInternalFrameOrderByEmpresaEspecial.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmpresaEspecial.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpresaEspecial.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpresaEspecial.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmpresaEspecial.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empresa Especiales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmpresaEspecial.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmpresaEspecial.ipady =150;
				
			this.jPanelOrderByEmpresaEspecial.add(jScrollPanelDatosEmpresaEspecialOrderBy, this.gridBagConstraintsEmpresaEspecial);//this.jTableDatosEmpresaEspecialTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmpresaEspecial = new JButtonMe();
			this.jButtonCerrarOrderByEmpresaEspecial.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmpresaEspecial,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmpresaEspecial.setToolTipText("Cancelar"+" "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmpresaEspecial, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpresaEspecial.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmpresaEspecial.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmpresaEspecial.add(this.jButtonCerrarOrderByEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmpresaEspecial = new GridBagLayout();
			
			this.jScrollPanelOrderByEmpresaEspecial= new JScrollPane(jPanelOrderByEmpresaEspecial,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmpresaEspecial = new GridBagConstraints();
			this.gridBagConstraintsEmpresaEspecial.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmpresaEspecial.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpresaEspecial.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmpresaEspecial.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmpresaEspecial.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmpresaEspecial);
			
			this.jInternalFrameOrderByEmpresaEspecial.getContentPane().add(this.jScrollPanelOrderByEmpresaEspecial, this.gridBagConstraintsEmpresaEspecial);			
		
		} else {
			this.jButtonAbrirOrderByEmpresaEspecial = new JButtonMe();
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
			&& this.empresaespecialSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmpresaEspecial.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmpresaEspecial.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmpresaEspecial.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmpresaEspecial.getRowHeight();//EmpresaEspecialConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmpresaEspecialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpresaEspecial.isSelected()) {
					iHeightTable=EmpresaEspecialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpresaEspecialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpresaEspecialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmpresaEspecialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpresaEspecial.isSelected()) {
					iHeightTable=EmpresaEspecialConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpresaEspecialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpresaEspecialConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmpresaEspecial.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpresaEspecial.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpresaEspecial.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmpresaEspecial.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpresaEspecial.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpresaEspecial.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmpresaEspecial!=null && this.jInternalFrameOrderByEmpresaEspecial.getjTableDatosOrderBy()!=null) {
			//if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmpresaEspecial.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmpresaEspecial.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmpresaEspecial.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmpresaEspecial.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmpresaEspecial.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmpresaEspecial.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmpresaEspecial.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmpresaEspecial.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpresaEspecial.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpresaEspecial.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=empresaespecialLogic.getEmpresaEspecials().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empresaespecials.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EmpresaEspecial> TraerEmpresaEspecialBeans(List<EmpresaEspecial> empresaespecials,ArrayList<Classe> classes)throws Exception {
		try {
			for(EmpresaEspecial empresaespecial:empresaespecials) {
					
				if(!(EmpresaEspecialConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmpresaEspecialConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					empresaespecial.setsDetalleGeneralEntityReporte(EmpresaEspecialConstantesFunciones.getEmpresaEspecialDescripcion(empresaespecial));
										
						
					
						
					
				} else  {
							
					//empresaespecial.setsDetalleGeneralEntityReporte(empresaespecial.getsDetalleGeneralEntityReporte());
										
				}
				
				//empresaespecialbeans.add(empresaespecialbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return empresaespecials;
    }
	//PARA REPORTES FIN
}
