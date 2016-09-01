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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.ParametroInvenConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class ParametroInvenJInternalFrame extends ParametroInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroInven;
	
	protected JMenuBar jmenuBarParametroInven;
	
	protected JMenu jmenuParametroInven;
	protected JMenu jmenuDatosParametroInven;
	protected JMenu jmenuArchivoParametroInven;
	protected JMenu jmenuAccionesParametroInven;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroInven;	
	protected GridBagConstraints gridBagConstraintsParametroInven;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroInvenDetalleFormJInternalFrame jInternalFrameDetalleFormParametroInven;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroInven;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroInven;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ParametroInvenSessionBean parametroinvenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroInven> parametroinvens;		
	public List<ParametroInven> parametroinvensEliminados;	
	public List<ParametroInven> parametroinvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroInven;		
	protected JButton jButtonAbrirOrderByParametroInven;
	
	
	//protected JPanel jPanelOrderByParametroInven;
	//public JScrollPane jScrollPanelOrderByParametroInven;	
	//protected JButton jButtonCerrarOrderByParametroInven;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroInvenLogic parametroinvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroInven;
	public JScrollPane jScrollPanelDatosEdicionParametroInven;
	public JScrollPane jScrollPanelDatosGeneralParametroInven;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroInvenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroInven;
	//public JScrollPane jScrollPanelImportacionParametroInven;
	
	
	
	protected JPanel jPanelAccionesParametroInven;
	
    protected JPanel jPanelPaginacionParametroInven;
    protected JPanel jPanelParametrosReportesParametroInven;
	protected JPanel jPanelParametrosReportesAccionesParametroInven;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroInven;
	protected JPanel jPanelParametrosAuxiliar2ParametroInven;
	protected JPanel jPanelParametrosAuxiliar3ParametroInven;
	protected JPanel jPanelParametrosAuxiliar4ParametroInven;
	//protected JPanel jPanelParametrosAuxiliar5ParametroInven;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroInven;
	//protected JPanel jPanelImportacionParametroInven;
	
	
	public JTable jTableDatosParametroInven;
	
	
	
	//public JTable jTableDatosParametroInvenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroInven;
	protected JButton jButtonDuplicarParametroInven;
	protected JButton jButtonCopiarParametroInven;
	protected JButton jButtonVerFormParametroInven;
	protected JButton jButtonNuevoRelacionesParametroInven;
	protected JButton jButtonModificarParametroInven;
	
    protected JButton jButtonGuardarCambiosTablaParametroInven;
	protected JButton jButtonCerrarParametroInven;
	
	
	protected JButton jButtonRecargarInformacionParametroInven;
	protected JButton jButtonProcesarInformacionParametroInven;
	
	
	protected JButton jButtonAnterioresParametroInven;
	protected JButton jButtonSiguientesParametroInven;
	protected JButton jButtonNuevoGuardarCambiosParametroInven;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroInven;
	//protected JButton jButtonCerrarReporteDinamicoParametroInven;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroInven;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroInven;
	//protected JButton jButtonGenerarImportacionParametroInven;
	//protected JButton jButtonCerrarImportacionParametroInven;
	//protected JFileChooser jFileChooserImportacionParametroInven;
	//protected File fileImportacionParametroInven;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroInven;
	protected JButton jButtonDuplicarToolBarParametroInven;
	protected JButton jButtonNuevoRelacionesToolBarParametroInven;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroInven;
	protected JButton jButtonCopiarToolBarParametroInven;
	protected JButton jButtonVerFormToolBarParametroInven;
	public JButton jButtonGuardarCambiosTablaToolBarParametroInven;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroInven;
	protected JButton jButtonCerrarToolBarParametroInven;
	
	protected JButton jButtonRecargarInformacionToolBarParametroInven;
	protected JButton jButtonProcesarInformacionToolBarParametroInven;
	protected JButton jButtonAnterioresToolBarParametroInven;
	protected JButton jButtonSiguientesToolBarParametroInven;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroInven;
	protected JButton jButtonAbrirOrderByToolBarParametroInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroInven;
	protected JMenuItem jMenuItemDuplicarParametroInven;
	protected JMenuItem jMenuItemNuevoRelacionesParametroInven;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroInven;
	protected JMenuItem jMenuItemCopiarParametroInven;
	protected JMenuItem jMenuItemVerFormParametroInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroInven;
	protected JMenuItem jMenuItemCerrarParametroInven;
	protected JMenuItem jMenuItemDetalleCerrarParametroInven;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroInven;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroInven;
	protected JMenuItem jMenuItemProcesarInformacionParametroInven;
	protected JMenuItem jMenuItemAnterioresParametroInven;
	protected JMenuItem jMenuItemSiguientesParametroInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroInven;
	protected JMenuItem jMenuItemAbrirOrderByParametroInven;
	protected JMenuItem jMenuItemMostrarOcultarParametroInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroInven;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroInven;
	protected JCheckBox jCheckBoxSeleccionadosParametroInven;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroInven;
	protected JCheckBox jCheckBoxConGraficoReporteParametroInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroInven;
	protected JTextField jTextFieldValorCampoGeneralParametroInven;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroInven;
	//public JList<Reporte> jListColumnasSelectReporteParametroInven;
	//public JScrollPane jScrollColumnasSelectReporteParametroInven;
	
	//public JLabel jLabelRelacionesSelectReporteParametroInven;
	//public JList<Reporte> jListRelacionesSelectReporteParametroInven;
	//public JScrollPane jScrollRelacionesSelectReporteParametroInven;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroInven;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroInven;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroInven;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroInven;
	
		
	//public JLabel jLabelArchivoImportacionParametroInven;	
	//public JLabel jLabelPathArchivoImportacionParametroInven;
	//protected JTextField jTextFieldPathArchivoImportacionParametroInven;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroInven;
	
	//public JLabel jLabelColumnaCategoriaValorParametroInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroInven;
	
	//public JLabel jLabelColumnasValoresGraficoParametroInven;
	//public JList<Reporte> jListColumnasValoresGraficoParametroInven;
	//public JScrollPane jScrollColumnasValoresGraficoParametroInven;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroInven;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroInven;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroInven;
	
	
	
	
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroInvenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroInvenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroInvenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroInvenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroInven)	{
		this.jButtonRecargarInformacionParametroInven = jButtonRecargarInformacionParametroInven;
	}
	
	public JButton getjButtonProcesarInformacionParametroInven() {
		return this.jButtonProcesarInformacionParametroInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroInven)	{
		this.jButtonProcesarInformacionParametroInven = jButtonProcesarInformacionParametroInven;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroInven() {
		return this.jButtonRecargarInformacionParametroInven;
	}
	
	
	public List<ParametroInven> getparametroinvens() {
		return this.parametroinvens;
	}

	public void setparametroinvens(List<ParametroInven> parametroinvens) {
		this.parametroinvens = parametroinvens;
	}
	
	public List<ParametroInven> getparametroinvensAux() {
		return this.parametroinvensAux;
	}

	public void setparametroinvensAux(List<ParametroInven> parametroinvensAux) {
		this.parametroinvensAux = parametroinvensAux;
	}
	
	public List<ParametroInven> getparametroinvensEliminados() {
		return this.parametroinvensEliminados;
	}

	public void setParametroInvensEliminados(List<ParametroInven> parametroinvensEliminados) {
		this.parametroinvensEliminados = parametroinvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroInven() {
		return jComboBoxTiposSeleccionarParametroInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroInven(
			JComboBox jComboBoxTiposSeleccionarParametroInven) {
		this.jComboBoxTiposSeleccionarParametroInven = jComboBoxTiposSeleccionarParametroInven;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroInven .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroInven() {
		return jTextFieldValorCampoGeneralParametroInven;
	}

	public void setjTextFieldValorCampoGeneralParametroInven(
			JTextField jTextFieldValorCampoGeneralParametroInven) {
		this.jTextFieldValorCampoGeneralParametroInven = jTextFieldValorCampoGeneralParametroInven;
	}

	public void setBorderResaltarValorCampoGeneralParametroInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInven.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroInven .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroInven() {
		return this.jCheckBoxSeleccionarTodosParametroInven;
	}

	public void setjCheckBoxSeleccionarTodosParametroInven(
			JCheckBox jCheckBoxSeleccionarTodosParametroInven) {
		this.jCheckBoxSeleccionarTodosParametroInven = jCheckBoxSeleccionarTodosParametroInven;
	}

	public void setBorderResaltarSeleccionarTodosParametroInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroInven .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroInven() {
		return this.jCheckBoxSeleccionadosParametroInven;
	}

	public void setjCheckBoxSeleccionadosParametroInven(
			JCheckBox jCheckBoxSeleccionadosParametroInven) {
		this.jCheckBoxSeleccionadosParametroInven = jCheckBoxSeleccionadosParametroInven;
	}
	
	public void setBorderResaltarSeleccionadosParametroInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroInven .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroInven() {
		return this.jComboBoxTiposArchivosReportesParametroInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroInven(
			JComboBox jComboBoxTiposArchivosReportesParametroInven) {
		this.jComboBoxTiposArchivosReportesParametroInven = jComboBoxTiposArchivosReportesParametroInven;
	}

	public void setBorderResaltarTiposArchivosReportesParametroInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroInven() {
		return this.jComboBoxTiposReportesParametroInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroInven(
			JComboBox jComboBoxTiposReportesParametroInven) {
		this.jComboBoxTiposReportesParametroInven = jComboBoxTiposReportesParametroInven;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroInven() {
	//	return jComboBoxTiposReportesDinamicoParametroInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroInven(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroInven) {
	//	this.jComboBoxTiposReportesDinamicoParametroInven = jComboBoxTiposReportesDinamicoParametroInven;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroInven() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroInven(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroInven) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroInven = jComboBoxTiposArchivosReportesDinamicoParametroInven;
	//}
	
	public void setBorderResaltarTiposReportesParametroInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroInven() {
		return this.jComboBoxTiposGraficosReportesParametroInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroInven(
			JComboBox jComboBoxTiposGraficosReportesParametroInven) {
		this.jComboBoxTiposGraficosReportesParametroInven = jComboBoxTiposGraficosReportesParametroInven;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroInven() {
		return this.jComboBoxTiposPaginacionParametroInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroInven(
			JComboBox jComboBoxTiposPaginacionParametroInven) {
		this.jComboBoxTiposPaginacionParametroInven = jComboBoxTiposPaginacionParametroInven;
	}
	
	public void setBorderResaltarTiposPaginacionParametroInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroInven() {
		return this.jComboBoxTiposRelacionesParametroInven;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroInven() {
		return this.jComboBoxTiposAccionesParametroInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroInven(
			JComboBox jComboBoxTiposRelacionesParametroInven) {
		this.jComboBoxTiposRelacionesParametroInven = jComboBoxTiposRelacionesParametroInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroInven(
			JComboBox jComboBoxTiposAccionesParametroInven) {
		this.jComboBoxTiposAccionesParametroInven = jComboBoxTiposAccionesParametroInven;
	}
	
	public void setBorderResaltarTiposRelacionesParametroInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroInven .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroInven .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroInven() {
	//	return jCheckBoxConGraficoDinamicoParametroInven;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroInven(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroInven) {
	//	this.jCheckBoxConGraficoDinamicoParametroInven = jCheckBoxConGraficoDinamicoParametroInven;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroInven() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroInven.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroInven .setBorder(borderResaltar);		
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
		this.parametroinvenSessionBean=new ParametroInvenSessionBean();
		
		this.parametroinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroinvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Inven MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroInven= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroInven,this.jTtoolBarParametroInven,
							"nuevo","nuevo","Nuevo"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroInven,this.jTtoolBarParametroInven,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroInven,this.jTtoolBarParametroInven,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroInven,this.jTtoolBarParametroInven,
							"duplicar","duplicar","Duplicar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroInven,this.jTtoolBarParametroInven,
							"copiar","copiar","Copiar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroInven,this.jTtoolBarParametroInven,
							"ver_form","ver_form","Ver"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroInven,this.jTtoolBarParametroInven,
							"recargar","recargar","Recargar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroInven,this.jTtoolBarParametroInven,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroInven,this.jTtoolBarParametroInven,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroInven,this.jTtoolBarParametroInven,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroInven,this.jTtoolBarParametroInven,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroInven,this.jTtoolBarParametroInven,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroInven,this.jTtoolBarParametroInven,
							"cerrar","cerrar","Salir"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroInven=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroInven;
			
				this.jButtonProcesarInformacionToolBarParametroInven=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroInven;
				
		//protected JButton jButtonModificarToolBarParametroInven;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroInven=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroInven=new JMenuMe("General");
		this.jmenuArchivoParametroInven=new JMenuMe("Archivo");
		this.jmenuAccionesParametroInven=new JMenuMe("Acciones");
		this.jmenuDatosParametroInven=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroInven= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroInven.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroInven,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroInven= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroInven.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroInven,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroInven= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroInven.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroInven,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroInven= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroInven.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroInven,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroInven= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroInven.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroInven,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroInven= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroInven.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroInven,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroInven= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroInven.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroInven,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroInven= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroInven.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroInven,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroInven= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroInven.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroInven,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroInven= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroInven.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroInven,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroInven.add(this.jMenuItemCerrarParametroInven);
			
			this.jmenuAccionesParametroInven.add(this.jMenuItemNuevoParametroInven);
			this.jmenuAccionesParametroInven.add(this.jMenuItemNuevoGuardarCambiosParametroInven);
			this.jmenuAccionesParametroInven.add(this.jMenuItemNuevoRelacionesParametroInven);
			this.jmenuAccionesParametroInven.add(this.jMenuItemGuardarCambiosTablaParametroInven);		
			this.jmenuAccionesParametroInven.add(this.jMenuItemDuplicarParametroInven);		
			this.jmenuAccionesParametroInven.add(this.jMenuItemCopiarParametroInven);		
			this.jmenuAccionesParametroInven.add(this.jMenuItemVerFormParametroInven);		
			
			this.jmenuDatosParametroInven.add(this.jMenuItemRecargarInformacionParametroInven);				
			this.jmenuDatosParametroInven.add(this.jMenuItemAnterioresParametroInven);				
			this.jmenuDatosParametroInven.add(this.jMenuItemSiguientesParametroInven);				
			this.jmenuDatosParametroInven.add(this.jMenuItemAbrirOrderByParametroInven);				
			this.jmenuDatosParametroInven.add(this.jMenuItemMostrarOcultarParametroInven);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroInven.add(this.jMenuItemGuardarCambiosParametroInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroInven.add(this.jmenuArchivoParametroInven);		
			this.jmenuBarParametroInven.add(this.jmenuAccionesParametroInven);		
			this.jmenuBarParametroInven.add(this.jmenuDatosParametroInven);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroInven);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroInven() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasParametroInven=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroInven.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroInven.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroInven.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroInven,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroInven = new ParametroInvenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Inven DATOS");
			this.jInternalFrameDetalleFormParametroInven = new ParametroInvenDetalleFormJInternalFrame(jDesktopPane,this.parametroinvenSessionBean.getConGuardarRelaciones(),this.parametroinvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroInven = null;//new ParametroInvenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroInven= new GridBagLayout();
		
		
		this.jTableDatosParametroInven = new JTableMe();      
		
		String sToolTipParametroInven="";
		sToolTipParametroInven=ParametroInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroInven+="(Inventario.ParametroInven)";
		}
		
		if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroInven+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroInven.setToolTipText(sToolTipParametroInven);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroInven);
		this.jTableDatosParametroInven.setAutoCreateRowSorter(true);
		this.jTableDatosParametroInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroInven.setRowSelectionAllowed(true);
		this.jTableDatosParametroInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroInven,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroInven = new JButtonMe();
		this.jButtonDuplicarParametroInven = new JButtonMe();
		this.jButtonCopiarParametroInven = new JButtonMe();
		this.jButtonVerFormParametroInven = new JButtonMe();
		this.jButtonNuevoRelacionesParametroInven = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroInven = new JButtonMe();
		this.jButtonCerrarParametroInven = new JButtonMe();
		
		this.jScrollPanelDatosParametroInven = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroInven = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Inven";
		
		if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroInven.setToolTipText("Acciones");
        this.jPanelAccionesParametroInven.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroInven=new ReporteDinamicoJInternalFrame(ParametroInvenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroInven();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroInven=new ImportacionJInternalFrame(ParametroInvenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroInven();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroInven = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroInven.setText("Orden");
		this.jButtonAbrirOrderByParametroInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroInven,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroInven,false,this);
			
			//this.cargarOrderByParametroInven(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroInven,true,this);
			
			//this.cargarOrderByParametroInven(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroInven.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosParametroInven.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosParametroInven.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosParametroInven.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroInven.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroInven.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroInven.setText("Nuevo");
		this.jButtonDuplicarParametroInven.setText("Duplicar");
		this.jButtonCopiarParametroInven.setText("Copiar");
		this.jButtonVerFormParametroInven.setText("Ver");
		this.jButtonNuevoRelacionesParametroInven.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroInven.setText("Guardar");
		this.jButtonCerrarParametroInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroInven,"nuevo_button","Nuevo",this.parametroinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroInven,"duplicar_button","Duplicar",this.parametroinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroInven,"copiar_button","Copiar",this.parametroinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroInven,"ver_form","Ver",this.parametroinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroInven,"nuevorelaciones_button","Nuevo Rel",this.parametroinvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroInven,"guardarcambiostabla_button","Guardar",this.parametroinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroInven,"cerrar_button","Salir",this.parametroinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroInven.setToolTipText("Nuevo"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroInven.setToolTipText("Duplicar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroInven.setToolTipText("Copiar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroInven.setToolTipText("Ver"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroInven.setToolTipText("Nuevo Rel"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroInven.setToolTipText("Guardar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroInven.setToolTipText("Salir"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroInven";
		inputMap = this.jButtonNuevoParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroInven"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroInven";
		inputMap = this.jButtonDuplicarParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroInven"));
		
		//COPIAR
		sMapKey = "CopiarParametroInven";
		inputMap = this.jButtonCopiarParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroInven"));
		
		//VEr FORM
		sMapKey = "VerFormParametroInven";
		inputMap = this.jButtonVerFormParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroInven"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroInven";
		inputMap = this.jButtonNuevoRelacionesParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroInven"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroInven";
		inputMap = this.jButtonModificarParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroInven"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroInven";
		inputMap = this.jButtonCerrarParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroInven";
		inputMap = this.jButtonGuardarCambiosTablaParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroInven"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroInven.setName("jPanelParametrosReportesParametroInven"); 
		
		this.jPanelParametrosReportesAccionesParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroInven.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroInven.setName("jPanelParametrosReportesAccionesParametroInven"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroInven = new JButtonMe();
		this.jButtonRecargarInformacionParametroInven.setText("Recargar");
		this.jButtonRecargarInformacionParametroInven.setToolTipText("Recargar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroInven,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroInven = new JButtonMe();
		this.jButtonProcesarInformacionParametroInven.setText("Procesar");
		this.jButtonProcesarInformacionParametroInven.setToolTipText("Procesar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroInven.setVisible(false);
			
		this.jButtonProcesarInformacionParametroInven.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroInven.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroInven.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroInven.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroInven.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroInven.setText("TIPO");       
		this.jComboBoxTiposReportesParametroInven.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroInven.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroInven = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroInven.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroInven.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroInven = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroInven.setText("Accion");
		this.jComboBoxTiposRelacionesParametroInven.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroInven.setText("Accion");
		this.jComboBoxTiposAccionesParametroInven.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroInven = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroInven.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroInven.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroInven=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroInven.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroInven.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroInven.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroInven = new JLabelMe();
		
		this.jLabelAccionesParametroInven.setText("Acciones");		
		this.jLabelAccionesParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroInven = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroInven.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroInven.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroInven = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroInven.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroInven.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroInven = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroInven.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroInven.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroInven.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroInven.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroInven = new JButtonMe();
		//this.jButtonAnterioresParametroInven.setText("<<");
        this.jButtonAnterioresParametroInven.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroInven,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroInven = new JButtonMe();
		//this.jButtonSiguientesParametroInven.setText(">>");
        this.jButtonSiguientesParametroInven.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroInven,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroInven = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroInven.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroInven.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroInven,"nuevoguardarcambios_button","Nue",this.parametroinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroInven";
		inputMap = this.jButtonNuevoGuardarCambiosParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroInven"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroInven";
		inputMap = this.jButtonRecargarInformacionParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroInven"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroInven";
		inputMap = this.jButtonSiguientesParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroInven"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroInven";
		inputMap = this.jButtonAnterioresParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroInven"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroInven();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroInven.setMinimumSize(new Dimension(this.getWidth(),ParametroInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroInven.setMaximumSize(new Dimension(this.getWidth(),ParametroInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroInven.setPreferredSize(new Dimension(this.getWidth(),ParametroInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroInvenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroInven = new GridBagLayout();

			this.jPanelPaginacionParametroInven.setLayout(gridaBagLayoutPaginacionParametroInven);						
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.gridy = 0;
			this.gridBagConstraintsParametroInven.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroInven.add(this.jButtonAnterioresParametroInven, this.gridBagConstraintsParametroInven);
					
						
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroInven.gridy = 0;
			
			this.jPanelPaginacionParametroInven.add(this.jButtonNuevoGuardarCambiosParametroInven, this.gridBagConstraintsParametroInven);
						
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroInven.gridy = 0;
			this.jPanelPaginacionParametroInven.add(this.jButtonSiguientesParametroInven, this.gridBagConstraintsParametroInven);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.gridy = 1;
			this.gridBagConstraintsParametroInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroInven.add(this.jButtonNuevoParametroInven, this.gridBagConstraintsParametroInven);
						
			
			
			if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroInven = new GridBagConstraints();
				this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroInven.gridy = 1;
				this.gridBagConstraintsParametroInven.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroInven.add(this.jButtonGuardarCambiosTablaParametroInven, this.gridBagConstraintsParametroInven);
			}
			
			
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.gridy = 1;
			this.gridBagConstraintsParametroInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroInven.add(this.jButtonDuplicarParametroInven, this.gridBagConstraintsParametroInven);
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.gridy = 1;
			this.gridBagConstraintsParametroInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroInven.add(this.jButtonCopiarParametroInven, this.gridBagConstraintsParametroInven);
		
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.gridy = 1;
			this.gridBagConstraintsParametroInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroInven.add(this.jButtonVerFormParametroInven, this.gridBagConstraintsParametroInven);
		
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.gridy = 1;
			this.gridBagConstraintsParametroInven.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroInven.add(this.jButtonCerrarParametroInven, this.gridBagConstraintsParametroInven);
		
		
		
		this.jButtonRecargarInformacionParametroInven.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroInven.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroInven.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroInven.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroInven.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroInven.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroInven.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroInven.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroInven.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroInven.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroInven.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroInven.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroInven.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroInven.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroInven.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroInven.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroInven = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroInven = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroInven.setLayout(gridaBagParametrosReportesParametroInven);
			this.jPanelParametrosReportesAccionesParametroInven.setLayout(gridaBagParametrosReportesAccionesParametroInven);
			
			
			this.jPanelParametrosAuxiliar1ParametroInven.setLayout(gridaBagParametrosAuxiliar1ParametroInven);
			this.jPanelParametrosAuxiliar2ParametroInven.setLayout(gridaBagParametrosAuxiliar2ParametroInven);
			this.jPanelParametrosAuxiliar3ParametroInven.setLayout(gridaBagParametrosAuxiliar3ParametroInven);
			this.jPanelParametrosAuxiliar4ParametroInven.setLayout(gridaBagParametrosAuxiliar4ParametroInven);
			//this.jPanelParametrosAuxiliar5ParametroInven.setLayout(gridaBagParametrosAuxiliar2ParametroInven);			
			
			
			
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroInven.add(this.jButtonRecargarInformacionParametroInven, this.gridBagConstraintsParametroInven);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroInven.add(this.jComboBoxTiposPaginacionParametroInven, this.gridBagConstraintsParametroInven);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroInven.add(this.jCheckBoxConAltoMaximoTablaParametroInven, this.gridBagConstraintsParametroInven);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroInven.add(this.jComboBoxTiposArchivosReportesParametroInven, this.gridBagConstraintsParametroInven);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroInven.add(this.jPanelParametrosAuxiliar1ParametroInven, this.gridBagConstraintsParametroInven);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroInven.add(this.jComboBoxTiposReportesParametroInven, this.gridBagConstraintsParametroInven);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroInven.add(this.jPanelParametrosAuxiliar4ParametroInven, this.gridBagConstraintsParametroInven);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInven.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInven.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroInven.add(this.jComboBoxTiposReportesParametroInven, this.gridBagConstraintsParametroInven);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInven.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroInven.add(this.jCheckBoxGenerarReporteParametroInven, this.gridBagConstraintsParametroInven);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroInven.add(this.jPanelParametrosAuxiliar2ParametroInven, this.gridBagConstraintsParametroInven);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroInven.add(this.jLabelAccionesParametroInven, this.gridBagConstraintsParametroInven);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroInven = new GridBagConstraints();
				this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroInven.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroInven.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroInven.add(this.jButtonAbrirOrderByParametroInven, this.gridBagConstraintsParametroInven);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroInven.add(this.jComboBoxTiposSeleccionarParametroInven, this.gridBagConstraintsParametroInven);			
			
			
			/*
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroInven.add(this.jCheckBoxSeleccionarTodosParametroInven, this.gridBagConstraintsParametroInven);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroInven.add(this.jCheckBoxSeleccionarTodosParametroInven, this.gridBagConstraintsParametroInven);															
				
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroInven.add(this.jCheckBoxSeleccionadosParametroInven, this.gridBagConstraintsParametroInven);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroInven.add(this.jPanelParametrosAuxiliar3ParametroInven, this.gridBagConstraintsParametroInven);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroInven.add(this.jComboBoxTiposAccionesParametroInven, this.gridBagConstraintsParametroInven);
	
				
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroInven.add(this.jTextFieldValorCampoGeneralParametroInven, this.gridBagConstraintsParametroInven);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroInven = new GridBagLayout();

			this.jScrollPanelDatosParametroInven.setLayout(gridaBagLayoutDatosParametroInven);
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.gridy = 0;
			this.gridBagConstraintsParametroInven.gridx = 0;
			
			this.jScrollPanelDatosParametroInven.add(this.jTableDatosParametroInven, this.gridBagConstraintsParametroInven);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroInven.setViewportView(this.jTableDatosParametroInven);
		this.jTableDatosParametroInven.setFillsViewportHeight(true);
		this.jTableDatosParametroInven.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroInven= new GridBagLayout();
		this.jPanelAccionesParametroInven.setLayout(gridaBagLayoutAccionesParametroInven);
		
		
		/*	
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = 0;
			
		this.jPanelAccionesParametroInven.add(this.jButtonNuevoParametroInven, this.gridBagConstraintsParametroInven);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroInven);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametroinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroInven = new GridBagConstraints();						
			this.gridBagConstraintsParametroInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroInven.gridx = 0;		
			//this.gridBagConstraintsParametroInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroInven.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroInven, this.gridBagConstraintsParametroInven);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroInven.gridx = 0;		
		//this.gridBagConstraintsParametroInven.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroInven.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroInven);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroInven.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroInven, this.gridBagConstraintsParametroInven);								
		
		
		/*
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroInven, this.gridBagConstraintsParametroInven);
		*/		
		
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroInven.gridx =0;
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroInven, this.gridBagConstraintsParametroInven);
				
		
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroInven, this.gridBagConstraintsParametroInven);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroInvenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroInven = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroInven.setLayout(gridaBagLayoutBusquedasParametrosParametroInven);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroInven, this.gridBagConstraintsParametroInven);
			
			
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroInven, this.gridBagConstraintsParametroInven);
		
			
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroInven, this.gridBagConstraintsParametroInven);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroInven;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroInven() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroInven = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroInven.setName("jPanelReporteDinamicoParametroInven"); 
		
		this.jPanelReporteDinamicoParametroInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroInven.setLayout(gridaBagLayoutReporteDinamicoParametroInven);
		
		
		this.jInternalFrameReporteDinamicoParametroInven= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroInven.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroInven.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroInven.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroInven.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroInven.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Invenes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroInven = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroInven.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroInven.add(this.jLabelColumnasSelectReporteParametroInven, this.gridBagConstraintsParametroInven);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroInven = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroInven=new JScrollPane(this.jListColumnasSelectReporteParametroInven);
			
			this.jScrollColumnasSelectReporteParametroInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroInven.add(this.jListColumnasSelectReporteParametroInven, this.gridBagConstraintsParametroInven);
		this.jPanelReporteDinamicoParametroInven.add(this.jScrollColumnasSelectReporteParametroInven, this.gridBagConstraintsParametroInven);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroInven = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroInven.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroInven = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroInven.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroInven.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroInven=new JScrollPane(this.jListRelacionesSelectReporteParametroInven);
			
			this.jScrollRelacionesSelectReporteParametroInven.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroInven.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroInven.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroInven = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroInven = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroInven = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroInven = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroInven = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroInven.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroInven = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroInven.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroInven.add(this.jLabelGenerarExcelReporteDinamicoParametroInven, this.gridBagConstraintsParametroInven);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroInven = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroInven.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroInven,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroInven.setToolTipText("Generar EXCEL"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroInven = new GridBagConstraints();
		//this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroInven.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroInven.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroInven.add(this.jButtonGenerarExcelReporteDinamicoParametroInven, this.gridBagConstraintsParametroInven);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroInven.add(this.jComboBoxTiposReportesDinamicoParametroInven, this.gridBagConstraintsParametroInven);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroInven = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroInven.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroInven.add(this.jLabelTiposArchivoReporteDinamicoParametroInven, this.gridBagConstraintsParametroInven);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroInven.add(this.jComboBoxTiposArchivosReportesDinamicoParametroInven, this.gridBagConstraintsParametroInven);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroInven = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroInven.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroInven,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroInven.setToolTipText("Generar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroInven.add(this.jButtonGenerarReporteDinamicoParametroInven, this.gridBagConstraintsParametroInven);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroInven = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroInven.setToolTipText("Cancelar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroInven.add(this.jButtonCerrarReporteDinamicoParametroInven, this.gridBagConstraintsParametroInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroInven = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroInven= new JScrollPane(jPanelReporteDinamicoParametroInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroInven.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroInven.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroInven.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Invenes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroInven.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroInven.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroInven);
		this.jInternalFrameReporteDinamicoParametroInven.getContentPane().add(this.jScrollPanelReporteDinamicoParametroInven, this.gridBagConstraintsParametroInven);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroInven() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroInven = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroInven.setName("jPanelImportacionParametroInven"); 
		
		this.jPanelImportacionParametroInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroInven.setLayout(gridaBagLayoutImportacionParametroInven);
		
		
		this.jInternalFrameImportacionParametroInven= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroInven= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroInven.setResizable(true);
	    this.jInternalFrameImportacionParametroInven.setClosable(true);
	    this.jInternalFrameImportacionParametroInven.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroInven.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroInven.setResizable(true);
	    this.jInternalFrameImportacionParametroInven.setClosable(true);
	    this.jInternalFrameImportacionParametroInven.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Invenes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroInven = new JLabelMe();

		this.jLabelArchivoImportacionParametroInven.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroInven.add(this.jLabelArchivoImportacionParametroInven, this.gridBagConstraintsParametroInven);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroInven = new JFileChooser();		
		this.jFileChooserImportacionParametroInven.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroInven = new JButtonMe();
		this.jButtonAbrirImportacionParametroInven.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroInven,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroInven.setToolTipText("Generar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInven.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroInven.add(this.jButtonAbrirImportacionParametroInven, this.gridBagConstraintsParametroInven);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroInven = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroInven.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroInven.add(this.jLabelPathArchivoImportacionParametroInven, this.gridBagConstraintsParametroInven);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroInven=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroInven.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroInven.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroInven.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInven.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroInven.add(this.jTextFieldPathArchivoImportacionParametroInven, this.gridBagConstraintsParametroInven);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroInven = new JButtonMe();
		this.jButtonGenerarImportacionParametroInven.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroInven,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroInven.setToolTipText("Generar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInven.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroInven.add(this.jButtonGenerarImportacionParametroInven, this.gridBagConstraintsParametroInven);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroInven = new JButtonMe();
		this.jButtonCerrarImportacionParametroInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroInven.setToolTipText("Cancelar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInven.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroInven.add(this.jButtonCerrarImportacionParametroInven, this.gridBagConstraintsParametroInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroInven = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroInven= new JScrollPane(jPanelImportacionParametroInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroInven.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroInven.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroInven);
		this.jInternalFrameImportacionParametroInven.getContentPane().add(this.jScrollPanelImportacionParametroInven, this.gridBagConstraintsParametroInven);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroInven(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroInven = new JButtonMe();
			this.jButtonAbrirOrderByParametroInven.setText("Orden");
			this.jButtonAbrirOrderByParametroInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroInven,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroInven";
			inputMap = this.jButtonAbrirOrderByParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroInven"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroInven = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroInven.setName("jPanelOrderByParametroInven"); 
			
			this.jPanelOrderByParametroInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroInven.setLayout(gridaBagLayoutOrderByParametroInven);
			
			
			this.jTableDatosParametroInvenOrderBy = new JTableMe();        
			this.jTableDatosParametroInvenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroInvenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroInvenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroInvenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroInvenOrderBy.setViewportView(this.jTableDatosParametroInvenOrderBy);
			this.jTableDatosParametroInvenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroInvenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroInven= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroInven= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroInven = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroInven= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroInven.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroInven.setTitle("Orden");
			this.jInternalFrameOrderByParametroInven.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroInven.setResizable(true);
			this.jInternalFrameOrderByParametroInven.setClosable(true);
			this.jInternalFrameOrderByParametroInven.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Invenes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroInven.ipady =150;
				
			this.jPanelOrderByParametroInven.add(jScrollPanelDatosParametroInvenOrderBy, this.gridBagConstraintsParametroInven);//this.jTableDatosParametroInvenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroInven = new JButtonMe();
			this.jButtonCerrarOrderByParametroInven.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroInven,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroInven.setToolTipText("Cancelar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroInven.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroInven.add(this.jButtonCerrarOrderByParametroInven, this.gridBagConstraintsParametroInven);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroInven = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroInven= new JScrollPane(jPanelOrderByParametroInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroInven.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroInven);
			
			this.jInternalFrameOrderByParametroInven.getContentPane().add(this.jScrollPanelOrderByParametroInven, this.gridBagConstraintsParametroInven);			
		
		} else {
			this.jButtonAbrirOrderByParametroInven = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametroinvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroInven.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroInven.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroInven.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroInven.getRowHeight();//ParametroInvenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroInven.isSelected()) {
					iHeightTable=ParametroInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroInven.isSelected()) {
					iHeightTable=ParametroInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroInven.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroInven.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroInven.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroInven!=null && this.jInternalFrameOrderByParametroInven.getjTableDatosOrderBy()!=null) {
			//if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroInven.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroInven.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroInven.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroInven.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroInven.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroInven.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroInven.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametroinvenLogic.getParametroInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroinvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroInven> TraerParametroInvenBeans(List<ParametroInven> parametroinvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroInven parametroinven:parametroinvens) {
					
				if(!(ParametroInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametroinven.setsDetalleGeneralEntityReporte(ParametroInvenConstantesFunciones.getParametroInvenDescripcion(parametroinven));
										
					parametroinven.setcon_cuenta_contable_descripcion(ParametroInvenConstantesFunciones.getcon_cuenta_contableDescripcion(parametroinven));parametroinven.setcon_cuenta_contable_linea_descripcion(ParametroInvenConstantesFunciones.getcon_cuenta_contable_lineaDescripcion(parametroinven));parametroinven.setcon_cuenta_banco_descripcion(ParametroInvenConstantesFunciones.getcon_cuenta_bancoDescripcion(parametroinven));parametroinven.setcon_copiar_producto_descripcion(ParametroInvenConstantesFunciones.getcon_copiar_productoDescripcion(parametroinven));parametroinven.setcon_crear_producto_sucursal_descripcion(ParametroInvenConstantesFunciones.getcon_crear_producto_sucursalDescripcion(parametroinven));parametroinven.setcon_crear_lista_precio_sucursal_bodega_descripcion(ParametroInvenConstantesFunciones.getcon_crear_lista_precio_sucursal_bodegaDescripcion(parametroinven));parametroinven.setcon_compras_aprobacion_descripcion(ParametroInvenConstantesFunciones.getcon_compras_aprobacionDescripcion(parametroinven));parametroinven.setcon_envio_mail_descripcion(ParametroInvenConstantesFunciones.getcon_envio_mailDescripcion(parametroinven));	
					
						
					
				} else  {
							
					//parametroinven.setsDetalleGeneralEntityReporte(parametroinven.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametroinvenbeans.add(parametroinvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametroinvens;
    }
	//PARA REPORTES FIN
}
