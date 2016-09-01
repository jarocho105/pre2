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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.PartidaPresuConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class PartidaPresuJInternalFrame extends PartidaPresuBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPartidaPresu;
	
	protected JMenuBar jmenuBarPartidaPresu;
	
	protected JMenu jmenuPartidaPresu;
	protected JMenu jmenuDatosPartidaPresu;
	protected JMenu jmenuArchivoPartidaPresu;
	protected JMenu jmenuAccionesPartidaPresu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPartidaPresu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPartidaPresu;	
	protected GridBagConstraints gridBagConstraintsPartidaPresu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PartidaPresuDetalleFormJInternalFrame jInternalFrameDetalleFormPartidaPresu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPartidaPresu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPartidaPresu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PartidaPresuSessionBean partidapresuSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PartidaPresu> partidapresus;		
	public List<PartidaPresu> partidapresusEliminados;	
	public List<PartidaPresu> partidapresusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPartidaPresu;		
	protected JButton jButtonAbrirOrderByPartidaPresu;
	
	
	//protected JPanel jPanelOrderByPartidaPresu;
	//public JScrollPane jScrollPanelOrderByPartidaPresu;	
	//protected JButton jButtonCerrarOrderByPartidaPresu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PartidaPresuLogic partidapresuLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPartidaPresu;
	public JScrollPane jScrollPanelDatosEdicionPartidaPresu;
	public JScrollPane jScrollPanelDatosGeneralPartidaPresu;
    
	
	
	//public JScrollPane jScrollPanelDatosPartidaPresuOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPartidaPresu;
	//public JScrollPane jScrollPanelImportacionPartidaPresu;
	
	
	
	protected JPanel jPanelAccionesPartidaPresu;
	
    protected JPanel jPanelPaginacionPartidaPresu;
    protected JPanel jPanelParametrosReportesPartidaPresu;
	protected JPanel jPanelParametrosReportesAccionesPartidaPresu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PartidaPresu;
	protected JPanel jPanelParametrosAuxiliar2PartidaPresu;
	protected JPanel jPanelParametrosAuxiliar3PartidaPresu;
	protected JPanel jPanelParametrosAuxiliar4PartidaPresu;
	//protected JPanel jPanelParametrosAuxiliar5PartidaPresu;
	
	
	
	//protected JPanel jPanelReporteDinamicoPartidaPresu;
	//protected JPanel jPanelImportacionPartidaPresu;
	
	
	public JTable jTableDatosPartidaPresu;
	
	
	
	//public JTable jTableDatosPartidaPresuOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPartidaPresu;
	protected JButton jButtonDuplicarPartidaPresu;
	protected JButton jButtonCopiarPartidaPresu;
	protected JButton jButtonVerFormPartidaPresu;
	protected JButton jButtonNuevoRelacionesPartidaPresu;
	protected JButton jButtonModificarPartidaPresu;
	
    protected JButton jButtonGuardarCambiosTablaPartidaPresu;
	protected JButton jButtonCerrarPartidaPresu;
	
	
	protected JButton jButtonRecargarInformacionPartidaPresu;
	protected JButton jButtonProcesarInformacionPartidaPresu;
	
	
	protected JButton jButtonAnterioresPartidaPresu;
	protected JButton jButtonSiguientesPartidaPresu;
	protected JButton jButtonNuevoGuardarCambiosPartidaPresu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPartidaPresu;
	//protected JButton jButtonCerrarReporteDinamicoPartidaPresu;
	//protected JButton jButtonGenerarExcelReporteDinamicoPartidaPresu;	
	
	
	
	//protected JButton jButtonAbrirImportacionPartidaPresu;
	//protected JButton jButtonGenerarImportacionPartidaPresu;
	//protected JButton jButtonCerrarImportacionPartidaPresu;
	//protected JFileChooser jFileChooserImportacionPartidaPresu;
	//protected File fileImportacionPartidaPresu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPartidaPresu;
	protected JButton jButtonDuplicarToolBarPartidaPresu;
	protected JButton jButtonNuevoRelacionesToolBarPartidaPresu;
	
	
	public JButton jButtonGuardarCambiosToolBarPartidaPresu;
	protected JButton jButtonCopiarToolBarPartidaPresu;
	protected JButton jButtonVerFormToolBarPartidaPresu;
	public JButton jButtonGuardarCambiosTablaToolBarPartidaPresu;
	protected JButton jButtonMostrarOcultarTablaToolBarPartidaPresu;
	protected JButton jButtonCerrarToolBarPartidaPresu;
	
	protected JButton jButtonRecargarInformacionToolBarPartidaPresu;
	protected JButton jButtonProcesarInformacionToolBarPartidaPresu;
	protected JButton jButtonAnterioresToolBarPartidaPresu;
	protected JButton jButtonSiguientesToolBarPartidaPresu;
	protected JButton jButtonNuevoGuardarCambiosToolBarPartidaPresu;
	protected JButton jButtonAbrirOrderByToolBarPartidaPresu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPartidaPresu;
	protected JMenuItem jMenuItemDuplicarPartidaPresu;
	protected JMenuItem jMenuItemNuevoRelacionesPartidaPresu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPartidaPresu;
	protected JMenuItem jMenuItemCopiarPartidaPresu;
	protected JMenuItem jMenuItemVerFormPartidaPresu;
	protected JMenuItem jMenuItemGuardarCambiosTablaPartidaPresu;
	protected JMenuItem jMenuItemCerrarPartidaPresu;
	protected JMenuItem jMenuItemDetalleCerrarPartidaPresu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPartidaPresu;
	protected JMenuItem jMenuItemDetalleMostarOcultarPartidaPresu;
	
	protected JMenuItem jMenuItemRecargarInformacionPartidaPresu;
	protected JMenuItem jMenuItemProcesarInformacionPartidaPresu;
	protected JMenuItem jMenuItemAnterioresPartidaPresu;
	protected JMenuItem jMenuItemSiguientesPartidaPresu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPartidaPresu;
	protected JMenuItem jMenuItemAbrirOrderByPartidaPresu;
	protected JMenuItem jMenuItemMostrarOcultarPartidaPresu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPartidaPresu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPartidaPresu;
	protected JCheckBox jCheckBoxSeleccionadosPartidaPresu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPartidaPresu;
	protected JCheckBox jCheckBoxConGraficoReportePartidaPresu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPartidaPresu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPartidaPresu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPartidaPresu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPartidaPresu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPartidaPresu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPartidaPresu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPartidaPresu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPartidaPresu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPartidaPresu;
	protected JTextField jTextFieldValorCampoGeneralPartidaPresu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePartidaPresu;
	//public JList<Reporte> jListColumnasSelectReportePartidaPresu;
	//public JScrollPane jScrollColumnasSelectReportePartidaPresu;
	
	//public JLabel jLabelRelacionesSelectReportePartidaPresu;
	//public JList<Reporte> jListRelacionesSelectReportePartidaPresu;
	//public JScrollPane jScrollRelacionesSelectReportePartidaPresu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPartidaPresu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPartidaPresu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPartidaPresu;
	//public JLabel jLabelTiposArchivoReporteDinamicoPartidaPresu;
	
		
	//public JLabel jLabelArchivoImportacionPartidaPresu;	
	//public JLabel jLabelPathArchivoImportacionPartidaPresu;
	//protected JTextField jTextFieldPathArchivoImportacionPartidaPresu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPartidaPresu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPartidaPresu;
	
	//public JLabel jLabelColumnaCategoriaValorPartidaPresu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPartidaPresu;
	
	//public JLabel jLabelColumnasValoresGraficoPartidaPresu;
	//public JList<Reporte> jListColumnasValoresGraficoPartidaPresu;
	//public JScrollPane jScrollColumnasValoresGraficoPartidaPresu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPartidaPresu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPartidaPresu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPartidaPresu;
	
	
	
	
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
	public PartidaPresuJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PartidaPresu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PartidaPresuJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PartidaPresu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PartidaPresuJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PartidaPresu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PartidaPresuJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PartidaPresu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPartidaPresu)	{
		this.jButtonRecargarInformacionPartidaPresu = jButtonRecargarInformacionPartidaPresu;
	}
	
	public JButton getjButtonProcesarInformacionPartidaPresu() {
		return this.jButtonProcesarInformacionPartidaPresu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPartidaPresu)	{
		this.jButtonProcesarInformacionPartidaPresu = jButtonProcesarInformacionPartidaPresu;
	}
	
	
	public JButton getjButtonRecargarInformacionPartidaPresu() {
		return this.jButtonRecargarInformacionPartidaPresu;
	}
	
	
	public List<PartidaPresu> getpartidapresus() {
		return this.partidapresus;
	}

	public void setpartidapresus(List<PartidaPresu> partidapresus) {
		this.partidapresus = partidapresus;
	}
	
	public List<PartidaPresu> getpartidapresusAux() {
		return this.partidapresusAux;
	}

	public void setpartidapresusAux(List<PartidaPresu> partidapresusAux) {
		this.partidapresusAux = partidapresusAux;
	}
	
	public List<PartidaPresu> getpartidapresusEliminados() {
		return this.partidapresusEliminados;
	}

	public void setPartidaPresusEliminados(List<PartidaPresu> partidapresusEliminados) {
		this.partidapresusEliminados = partidapresusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPartidaPresu() {
		return jComboBoxTiposSeleccionarPartidaPresu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPartidaPresu(
			JComboBox jComboBoxTiposSeleccionarPartidaPresu) {
		this.jComboBoxTiposSeleccionarPartidaPresu = jComboBoxTiposSeleccionarPartidaPresu;
	}
	
	public void setBorderResaltarTiposSeleccionarPartidaPresu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPartidaPresu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPartidaPresu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPartidaPresu() {
		return jTextFieldValorCampoGeneralPartidaPresu;
	}

	public void setjTextFieldValorCampoGeneralPartidaPresu(
			JTextField jTextFieldValorCampoGeneralPartidaPresu) {
		this.jTextFieldValorCampoGeneralPartidaPresu = jTextFieldValorCampoGeneralPartidaPresu;
	}

	public void setBorderResaltarValorCampoGeneralPartidaPresu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPartidaPresu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPartidaPresu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPartidaPresu() {
		return this.jCheckBoxSeleccionarTodosPartidaPresu;
	}

	public void setjCheckBoxSeleccionarTodosPartidaPresu(
			JCheckBox jCheckBoxSeleccionarTodosPartidaPresu) {
		this.jCheckBoxSeleccionarTodosPartidaPresu = jCheckBoxSeleccionarTodosPartidaPresu;
	}

	public void setBorderResaltarSeleccionarTodosPartidaPresu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPartidaPresu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPartidaPresu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPartidaPresu() {
		return this.jCheckBoxSeleccionadosPartidaPresu;
	}

	public void setjCheckBoxSeleccionadosPartidaPresu(
			JCheckBox jCheckBoxSeleccionadosPartidaPresu) {
		this.jCheckBoxSeleccionadosPartidaPresu = jCheckBoxSeleccionadosPartidaPresu;
	}
	
	public void setBorderResaltarSeleccionadosPartidaPresu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPartidaPresu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPartidaPresu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPartidaPresu() {
		return this.jComboBoxTiposArchivosReportesPartidaPresu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPartidaPresu(
			JComboBox jComboBoxTiposArchivosReportesPartidaPresu) {
		this.jComboBoxTiposArchivosReportesPartidaPresu = jComboBoxTiposArchivosReportesPartidaPresu;
	}

	public void setBorderResaltarTiposArchivosReportesPartidaPresu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPartidaPresu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPartidaPresu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPartidaPresu() {
		return this.jComboBoxTiposReportesPartidaPresu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPartidaPresu(
			JComboBox jComboBoxTiposReportesPartidaPresu) {
		this.jComboBoxTiposReportesPartidaPresu = jComboBoxTiposReportesPartidaPresu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPartidaPresu() {
	//	return jComboBoxTiposReportesDinamicoPartidaPresu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPartidaPresu(
	//		JComboBox jComboBoxTiposReportesDinamicoPartidaPresu) {
	//	this.jComboBoxTiposReportesDinamicoPartidaPresu = jComboBoxTiposReportesDinamicoPartidaPresu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPartidaPresu() {
	//	return jComboBoxTiposArchivosReportesDinamicoPartidaPresu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPartidaPresu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPartidaPresu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPartidaPresu = jComboBoxTiposArchivosReportesDinamicoPartidaPresu;
	//}
	
	public void setBorderResaltarTiposReportesPartidaPresu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPartidaPresu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPartidaPresu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPartidaPresu() {
		return this.jComboBoxTiposGraficosReportesPartidaPresu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPartidaPresu(
			JComboBox jComboBoxTiposGraficosReportesPartidaPresu) {
		this.jComboBoxTiposGraficosReportesPartidaPresu = jComboBoxTiposGraficosReportesPartidaPresu;
	}
	
	public void setBorderResaltarTiposGraficosReportesPartidaPresu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPartidaPresu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPartidaPresu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPartidaPresu() {
		return this.jComboBoxTiposPaginacionPartidaPresu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPartidaPresu(
			JComboBox jComboBoxTiposPaginacionPartidaPresu) {
		this.jComboBoxTiposPaginacionPartidaPresu = jComboBoxTiposPaginacionPartidaPresu;
	}
	
	public void setBorderResaltarTiposPaginacionPartidaPresu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPartidaPresu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPartidaPresu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPartidaPresu() {
		return this.jComboBoxTiposRelacionesPartidaPresu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPartidaPresu() {
		return this.jComboBoxTiposAccionesPartidaPresu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPartidaPresu(
			JComboBox jComboBoxTiposRelacionesPartidaPresu) {
		this.jComboBoxTiposRelacionesPartidaPresu = jComboBoxTiposRelacionesPartidaPresu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPartidaPresu(
			JComboBox jComboBoxTiposAccionesPartidaPresu) {
		this.jComboBoxTiposAccionesPartidaPresu = jComboBoxTiposAccionesPartidaPresu;
	}
	
	public void setBorderResaltarTiposRelacionesPartidaPresu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPartidaPresu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPartidaPresu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPartidaPresu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPartidaPresu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPartidaPresu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPartidaPresu() {
	//	return jCheckBoxConGraficoDinamicoPartidaPresu;
	//}

	//public void setjCheckBoxConGraficoDinamicoPartidaPresu(
	//		JCheckBox jCheckBoxConGraficoDinamicoPartidaPresu) {
	//	this.jCheckBoxConGraficoDinamicoPartidaPresu = jCheckBoxConGraficoDinamicoPartidaPresu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPartidaPresu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPartidaPresu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPartidaPresu .setBorder(borderResaltar);		
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
		this.partidapresuSessionBean=new PartidaPresuSessionBean();
		
		this.partidapresuSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.partidapresuSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.partidapresuSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PartidaPresuJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PartidaPresuJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PartidaPresuJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PartidaPresuJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PartidaPresuJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Partida Presupuestaria MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
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
		
		PartidaPresuJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PartidaPresu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPartidaPresu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPartidaPresu,this.jTtoolBarPartidaPresu,
							"nuevo","nuevo","Nuevo"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPartidaPresu,this.jTtoolBarPartidaPresu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPartidaPresu,this.jTtoolBarPartidaPresu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPartidaPresu,this.jTtoolBarPartidaPresu,
							"duplicar","duplicar","Duplicar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPartidaPresu,this.jTtoolBarPartidaPresu,
							"copiar","copiar","Copiar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPartidaPresu,this.jTtoolBarPartidaPresu,
							"ver_form","ver_form","Ver"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPartidaPresu,this.jTtoolBarPartidaPresu,
							"recargar","recargar","Recargar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPartidaPresu,this.jTtoolBarPartidaPresu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPartidaPresu,this.jTtoolBarPartidaPresu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPartidaPresu,this.jTtoolBarPartidaPresu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPartidaPresu,this.jTtoolBarPartidaPresu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPartidaPresu,this.jTtoolBarPartidaPresu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPartidaPresu,this.jTtoolBarPartidaPresu,
							"cerrar","cerrar","Salir"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPartidaPresu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPartidaPresu;
			
				this.jButtonProcesarInformacionToolBarPartidaPresu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPartidaPresu;
				
		//protected JButton jButtonModificarToolBarPartidaPresu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPartidaPresu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPartidaPresu=new JMenuMe("General");
		this.jmenuArchivoPartidaPresu=new JMenuMe("Archivo");
		this.jmenuAccionesPartidaPresu=new JMenuMe("Acciones");
		this.jmenuDatosPartidaPresu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPartidaPresu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPartidaPresu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPartidaPresu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPartidaPresu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPartidaPresu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPartidaPresu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPartidaPresu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPartidaPresu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPartidaPresu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPartidaPresu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPartidaPresu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPartidaPresu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPartidaPresu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPartidaPresu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPartidaPresu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPartidaPresu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPartidaPresu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPartidaPresu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPartidaPresu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPartidaPresu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPartidaPresu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPartidaPresu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPartidaPresu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPartidaPresu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPartidaPresu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPartidaPresu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPartidaPresu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPartidaPresu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPartidaPresu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPartidaPresu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPartidaPresu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPartidaPresu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPartidaPresu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPartidaPresu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPartidaPresu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPartidaPresu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPartidaPresu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPartidaPresu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPartidaPresu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPartidaPresu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPartidaPresu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPartidaPresu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPartidaPresu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPartidaPresu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPartidaPresu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPartidaPresu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPartidaPresu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPartidaPresu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPartidaPresu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPartidaPresu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPartidaPresu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPartidaPresu.add(this.jMenuItemCerrarPartidaPresu);
			
			this.jmenuAccionesPartidaPresu.add(this.jMenuItemNuevoPartidaPresu);
			this.jmenuAccionesPartidaPresu.add(this.jMenuItemNuevoGuardarCambiosPartidaPresu);
			this.jmenuAccionesPartidaPresu.add(this.jMenuItemNuevoRelacionesPartidaPresu);
			this.jmenuAccionesPartidaPresu.add(this.jMenuItemGuardarCambiosTablaPartidaPresu);		
			this.jmenuAccionesPartidaPresu.add(this.jMenuItemDuplicarPartidaPresu);		
			this.jmenuAccionesPartidaPresu.add(this.jMenuItemCopiarPartidaPresu);		
			this.jmenuAccionesPartidaPresu.add(this.jMenuItemVerFormPartidaPresu);		
			
			this.jmenuDatosPartidaPresu.add(this.jMenuItemRecargarInformacionPartidaPresu);				
			this.jmenuDatosPartidaPresu.add(this.jMenuItemAnterioresPartidaPresu);				
			this.jmenuDatosPartidaPresu.add(this.jMenuItemSiguientesPartidaPresu);				
			this.jmenuDatosPartidaPresu.add(this.jMenuItemAbrirOrderByPartidaPresu);				
			this.jmenuDatosPartidaPresu.add(this.jMenuItemMostrarOcultarPartidaPresu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPartidaPresu.add(this.jMenuItemGuardarCambiosPartidaPresu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPartidaPresu.add(this.jmenuArchivoPartidaPresu);		
			this.jmenuBarPartidaPresu.add(this.jmenuAccionesPartidaPresu);		
			this.jmenuBarPartidaPresu.add(this.jmenuDatosPartidaPresu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPartidaPresu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPartidaPresu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasPartidaPresu=new JTabbedPane();


		this.jTabbedPaneBusquedasPartidaPresu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasPartidaPresu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasPartidaPresu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPartidaPresu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPartidaPresu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePartidaPresu = new PartidaPresuDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Partida Presupuestaria DATOS");
			this.jInternalFrameDetalleFormPartidaPresu = new PartidaPresuDetalleFormJInternalFrame(jDesktopPane,this.partidapresuSessionBean.getConGuardarRelaciones(),this.partidapresuSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPartidaPresu = null;//new PartidaPresuDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPartidaPresu= new GridBagLayout();
		
		
		this.jTableDatosPartidaPresu = new JTableMe();      
		
		String sToolTipPartidaPresu="";
		sToolTipPartidaPresu=PartidaPresuConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPartidaPresu+="(ActivosFijos.PartidaPresu)";
		}
		
		if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
			sToolTipPartidaPresu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPartidaPresu.setToolTipText(sToolTipPartidaPresu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPartidaPresu);
		this.jTableDatosPartidaPresu.setAutoCreateRowSorter(true);
		this.jTableDatosPartidaPresu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPartidaPresu.setRowSelectionAllowed(true);
		this.jTableDatosPartidaPresu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPartidaPresu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPartidaPresu = new JButtonMe();
		this.jButtonDuplicarPartidaPresu = new JButtonMe();
		this.jButtonCopiarPartidaPresu = new JButtonMe();
		this.jButtonVerFormPartidaPresu = new JButtonMe();
		this.jButtonNuevoRelacionesPartidaPresu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPartidaPresu = new JButtonMe();
		this.jButtonCerrarPartidaPresu = new JButtonMe();
		
		this.jScrollPanelDatosPartidaPresu = new JScrollPane();   
        this.jScrollPanelDatosGeneralPartidaPresu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPartidaPresu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Partida Presupuestaria";
		
		if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Partida Presupuestarias" + this.sPath));
		} else {
			this.jScrollPanelDatosPartidaPresu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPartidaPresu.setToolTipText("Acciones");
        this.jPanelAccionesPartidaPresu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPartidaPresu=new ReporteDinamicoJInternalFrame(PartidaPresuConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPartidaPresu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPartidaPresu=new ImportacionJInternalFrame(PartidaPresuConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPartidaPresu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPartidaPresu = new JButtonMe();
		
		this.jButtonAbrirOrderByPartidaPresu.setText("Orden");
		this.jButtonAbrirOrderByPartidaPresu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPartidaPresu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPartidaPresu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPartidaPresu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPartidaPresu,false,this);
			
			//this.cargarOrderByPartidaPresu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPartidaPresu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPartidaPresu,true,this);
			
			//this.cargarOrderByPartidaPresu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPartidaPresu.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosPartidaPresu.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosPartidaPresu.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosPartidaPresu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPartidaPresu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPartidaPresu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPartidaPresu.setText("Nuevo");
		this.jButtonDuplicarPartidaPresu.setText("Duplicar");
		this.jButtonCopiarPartidaPresu.setText("Copiar");
		this.jButtonVerFormPartidaPresu.setText("Ver");
		this.jButtonNuevoRelacionesPartidaPresu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPartidaPresu.setText("Guardar");
		this.jButtonCerrarPartidaPresu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPartidaPresu,"nuevo_button","Nuevo",this.partidapresuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPartidaPresu,"duplicar_button","Duplicar",this.partidapresuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPartidaPresu,"copiar_button","Copiar",this.partidapresuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPartidaPresu,"ver_form","Ver",this.partidapresuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPartidaPresu,"nuevorelaciones_button","Nuevo Rel",this.partidapresuSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPartidaPresu,"guardarcambiostabla_button","Guardar",this.partidapresuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPartidaPresu,"cerrar_button","Salir",this.partidapresuSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPartidaPresu.setToolTipText("Nuevo"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPartidaPresu.setToolTipText("Duplicar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPartidaPresu.setToolTipText("Copiar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPartidaPresu.setToolTipText("Ver"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPartidaPresu.setToolTipText("Nuevo Rel"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPartidaPresu.setToolTipText("Guardar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPartidaPresu.setToolTipText("Salir"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPartidaPresu";
		inputMap = this.jButtonNuevoPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPartidaPresu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPartidaPresu"));
		
		//DUPLICAR
		sMapKey = "DuplicarPartidaPresu";
		inputMap = this.jButtonDuplicarPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPartidaPresu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPartidaPresu"));
		
		//COPIAR
		sMapKey = "CopiarPartidaPresu";
		inputMap = this.jButtonCopiarPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPartidaPresu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPartidaPresu"));
		
		//VEr FORM
		sMapKey = "VerFormPartidaPresu";
		inputMap = this.jButtonVerFormPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPartidaPresu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPartidaPresu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPartidaPresu";
		inputMap = this.jButtonNuevoRelacionesPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPartidaPresu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPartidaPresu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPartidaPresu";
		inputMap = this.jButtonModificarPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPartidaPresu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPartidaPresu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPartidaPresu";
		inputMap = this.jButtonCerrarPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPartidaPresu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPartidaPresu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPartidaPresu";
		inputMap = this.jButtonGuardarCambiosTablaPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPartidaPresu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPartidaPresu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPartidaPresu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPartidaPresu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPartidaPresu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PartidaPresu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PartidaPresu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PartidaPresu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PartidaPresu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PartidaPresu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPartidaPresu.setName("jPanelParametrosReportesPartidaPresu"); 
		
		this.jPanelParametrosReportesAccionesPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPartidaPresu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPartidaPresu.setName("jPanelParametrosReportesAccionesPartidaPresu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPartidaPresu = new JButtonMe();
		this.jButtonRecargarInformacionPartidaPresu.setText("Recargar");
		this.jButtonRecargarInformacionPartidaPresu.setToolTipText("Recargar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPartidaPresu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPartidaPresu = new JButtonMe();
		this.jButtonProcesarInformacionPartidaPresu.setText("Procesar");
		this.jButtonProcesarInformacionPartidaPresu.setToolTipText("Procesar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPartidaPresu.setVisible(false);
			
		this.jButtonProcesarInformacionPartidaPresu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPartidaPresu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPartidaPresu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPartidaPresu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPartidaPresu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPartidaPresu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPartidaPresu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPartidaPresu.setText("TIPO");       
		this.jComboBoxTiposReportesPartidaPresu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPartidaPresu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPartidaPresu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPartidaPresu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPartidaPresu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPartidaPresu.setText("Paginacion");
		this.jComboBoxTiposPaginacionPartidaPresu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPartidaPresu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPartidaPresu.setText("Accion");
		this.jComboBoxTiposRelacionesPartidaPresu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPartidaPresu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPartidaPresu.setText("Accion");
		this.jComboBoxTiposAccionesPartidaPresu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPartidaPresu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPartidaPresu.setText("Accion");
		this.jComboBoxTiposSeleccionarPartidaPresu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPartidaPresu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPartidaPresu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPartidaPresu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPartidaPresu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPartidaPresu = new JLabelMe();
		
		this.jLabelAccionesPartidaPresu.setText("Acciones");		
		this.jLabelAccionesPartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPartidaPresu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPartidaPresu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPartidaPresu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPartidaPresu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPartidaPresu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPartidaPresu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPartidaPresu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPartidaPresu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPartidaPresu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePartidaPresu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePartidaPresu.setText("Graf.");
		this.jCheckBoxConGraficoReportePartidaPresu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPartidaPresu = new JButtonMe();
		//this.jButtonAnterioresPartidaPresu.setText("<<");
        this.jButtonAnterioresPartidaPresu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPartidaPresu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPartidaPresu = new JButtonMe();
		//this.jButtonSiguientesPartidaPresu.setText(">>");
        this.jButtonSiguientesPartidaPresu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPartidaPresu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPartidaPresu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPartidaPresu.setText("Nue");
        this.jButtonNuevoGuardarCambiosPartidaPresu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPartidaPresu,"nuevoguardarcambios_button","Nue",this.partidapresuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPartidaPresu";
		inputMap = this.jButtonNuevoGuardarCambiosPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPartidaPresu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPartidaPresu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPartidaPresu";
		inputMap = this.jButtonRecargarInformacionPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPartidaPresu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPartidaPresu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPartidaPresu";
		inputMap = this.jButtonSiguientesPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPartidaPresu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPartidaPresu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPartidaPresu";
		inputMap = this.jButtonAnterioresPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPartidaPresu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPartidaPresu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPartidaPresu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPartidaPresu.setMinimumSize(new Dimension(this.getWidth(),PartidaPresuBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PartidaPresuBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPartidaPresu.setMaximumSize(new Dimension(this.getWidth(),PartidaPresuBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PartidaPresuBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPartidaPresu.setPreferredSize(new Dimension(this.getWidth(),PartidaPresuBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PartidaPresuBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPartidaPresu = new GridBagLayout();

			this.jPanelPaginacionPartidaPresu.setLayout(gridaBagLayoutPaginacionPartidaPresu);						
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.gridy = 0;
			this.gridBagConstraintsPartidaPresu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPartidaPresu.add(this.jButtonAnterioresPartidaPresu, this.gridBagConstraintsPartidaPresu);
					
						
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPartidaPresu.gridy = 0;
			
			this.jPanelPaginacionPartidaPresu.add(this.jButtonNuevoGuardarCambiosPartidaPresu, this.gridBagConstraintsPartidaPresu);
						
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPartidaPresu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPartidaPresu.gridy = 0;
			this.jPanelPaginacionPartidaPresu.add(this.jButtonSiguientesPartidaPresu, this.gridBagConstraintsPartidaPresu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.gridy = 1;
			this.gridBagConstraintsPartidaPresu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPartidaPresu.add(this.jButtonNuevoPartidaPresu, this.gridBagConstraintsPartidaPresu);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
				this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPartidaPresu.gridy = 1;
				this.gridBagConstraintsPartidaPresu.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPartidaPresu.add(this.jButtonNuevoRelacionesPartidaPresu, this.gridBagConstraintsPartidaPresu);
			}
			
			
			if(!this.partidapresuSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
				this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPartidaPresu.gridy = 1;
				this.gridBagConstraintsPartidaPresu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPartidaPresu.add(this.jButtonGuardarCambiosTablaPartidaPresu, this.gridBagConstraintsPartidaPresu);
			}
			
			
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.gridy = 1;
			this.gridBagConstraintsPartidaPresu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPartidaPresu.add(this.jButtonDuplicarPartidaPresu, this.gridBagConstraintsPartidaPresu);
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.gridy = 1;
			this.gridBagConstraintsPartidaPresu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPartidaPresu.add(this.jButtonCopiarPartidaPresu, this.gridBagConstraintsPartidaPresu);
		
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.gridy = 1;
			this.gridBagConstraintsPartidaPresu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPartidaPresu.add(this.jButtonVerFormPartidaPresu, this.gridBagConstraintsPartidaPresu);
		
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.gridy = 1;
			this.gridBagConstraintsPartidaPresu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPartidaPresu.add(this.jButtonCerrarPartidaPresu, this.gridBagConstraintsPartidaPresu);
		
		
		
		this.jButtonRecargarInformacionPartidaPresu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPartidaPresu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPartidaPresu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPartidaPresu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPartidaPresu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPartidaPresu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPartidaPresu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPartidaPresu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPartidaPresu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPartidaPresu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPartidaPresu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPartidaPresu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPartidaPresu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPartidaPresu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPartidaPresu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPartidaPresu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPartidaPresu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPartidaPresu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPartidaPresu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPartidaPresu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPartidaPresu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPartidaPresu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPartidaPresu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPartidaPresu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPartidaPresu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPartidaPresu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPartidaPresu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePartidaPresu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePartidaPresu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePartidaPresu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPartidaPresu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPartidaPresu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPartidaPresu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPartidaPresu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPartidaPresu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPartidaPresu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPartidaPresu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPartidaPresu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PartidaPresu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PartidaPresu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PartidaPresu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PartidaPresu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPartidaPresu.setLayout(gridaBagParametrosReportesPartidaPresu);
			this.jPanelParametrosReportesAccionesPartidaPresu.setLayout(gridaBagParametrosReportesAccionesPartidaPresu);
			
			
			this.jPanelParametrosAuxiliar1PartidaPresu.setLayout(gridaBagParametrosAuxiliar1PartidaPresu);
			this.jPanelParametrosAuxiliar2PartidaPresu.setLayout(gridaBagParametrosAuxiliar2PartidaPresu);
			this.jPanelParametrosAuxiliar3PartidaPresu.setLayout(gridaBagParametrosAuxiliar3PartidaPresu);
			this.jPanelParametrosAuxiliar4PartidaPresu.setLayout(gridaBagParametrosAuxiliar4PartidaPresu);
			//this.jPanelParametrosAuxiliar5PartidaPresu.setLayout(gridaBagParametrosAuxiliar2PartidaPresu);			
			
			
			
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPartidaPresu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPartidaPresu.add(this.jButtonRecargarInformacionPartidaPresu, this.gridBagConstraintsPartidaPresu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPartidaPresu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PartidaPresu.add(this.jComboBoxTiposPaginacionPartidaPresu, this.gridBagConstraintsPartidaPresu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPartidaPresu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PartidaPresu.add(this.jCheckBoxConAltoMaximoTablaPartidaPresu, this.gridBagConstraintsPartidaPresu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPartidaPresu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PartidaPresu.add(this.jComboBoxTiposArchivosReportesPartidaPresu, this.gridBagConstraintsPartidaPresu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPartidaPresu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPartidaPresu.add(this.jPanelParametrosAuxiliar1PartidaPresu, this.gridBagConstraintsPartidaPresu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPartidaPresu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PartidaPresu.add(this.jComboBoxTiposReportesPartidaPresu, this.gridBagConstraintsPartidaPresu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPartidaPresu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPartidaPresu.add(this.jPanelParametrosAuxiliar4PartidaPresu, this.gridBagConstraintsPartidaPresu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPartidaPresu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPartidaPresu.add(this.jComboBoxTiposReportesPartidaPresu, this.gridBagConstraintsPartidaPresu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPartidaPresu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPartidaPresu.add(this.jCheckBoxGenerarReportePartidaPresu, this.gridBagConstraintsPartidaPresu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPartidaPresu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPartidaPresu.add(this.jPanelParametrosAuxiliar2PartidaPresu, this.gridBagConstraintsPartidaPresu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPartidaPresu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPartidaPresu.add(this.jLabelAccionesPartidaPresu, this.gridBagConstraintsPartidaPresu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
				this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPartidaPresu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPartidaPresu.add(this.jButtonAbrirOrderByPartidaPresu, this.gridBagConstraintsPartidaPresu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPartidaPresu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPartidaPresu.add(this.jComboBoxTiposSeleccionarPartidaPresu, this.gridBagConstraintsPartidaPresu);			
			
			
			/*
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPartidaPresu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPartidaPresu.add(this.jCheckBoxSeleccionarTodosPartidaPresu, this.gridBagConstraintsPartidaPresu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPartidaPresu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PartidaPresu.add(this.jCheckBoxSeleccionarTodosPartidaPresu, this.gridBagConstraintsPartidaPresu);															
				
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPartidaPresu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PartidaPresu.add(this.jCheckBoxSeleccionadosPartidaPresu, this.gridBagConstraintsPartidaPresu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPartidaPresu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPartidaPresu.add(this.jPanelParametrosAuxiliar3PartidaPresu, this.gridBagConstraintsPartidaPresu);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPartidaPresu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPartidaPresu.add(this.jComboBoxTiposRelacionesPartidaPresu, this.gridBagConstraintsPartidaPresu);
				
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPartidaPresu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPartidaPresu.add(this.jComboBoxTiposAccionesPartidaPresu, this.gridBagConstraintsPartidaPresu);
	
				
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPartidaPresu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPartidaPresu.add(this.jTextFieldValorCampoGeneralPartidaPresu, this.gridBagConstraintsPartidaPresu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPartidaPresu = new GridBagLayout();

			this.jScrollPanelDatosPartidaPresu.setLayout(gridaBagLayoutDatosPartidaPresu);
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.gridy = 0;
			this.gridBagConstraintsPartidaPresu.gridx = 0;
			
			this.jScrollPanelDatosPartidaPresu.add(this.jTableDatosPartidaPresu, this.gridBagConstraintsPartidaPresu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPartidaPresu.setViewportView(this.jTableDatosPartidaPresu);
		this.jTableDatosPartidaPresu.setFillsViewportHeight(true);
		this.jTableDatosPartidaPresu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPartidaPresu= new GridBagLayout();
		this.jPanelAccionesPartidaPresu.setLayout(gridaBagLayoutAccionesPartidaPresu);
		
		
		/*	
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPartidaPresu.gridy = 0;
		this.gridBagConstraintsPartidaPresu.gridx = 0;
			
		this.jPanelAccionesPartidaPresu.add(this.jButtonNuevoPartidaPresu, this.gridBagConstraintsPartidaPresu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPartidaPresu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPartidaPresu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.partidapresuSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();						
			this.gridBagConstraintsPartidaPresu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPartidaPresu.gridx = 0;		
			//this.gridBagConstraintsPartidaPresu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPartidaPresu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPartidaPresu, this.gridBagConstraintsPartidaPresu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPartidaPresu.gridx = 0;		
		//this.gridBagConstraintsPartidaPresu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPartidaPresu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPartidaPresu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPartidaPresu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPartidaPresu, this.gridBagConstraintsPartidaPresu);								
		
		
		/*
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPartidaPresu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPartidaPresu, this.gridBagConstraintsPartidaPresu);
		*/		
		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPartidaPresu.gridx =0;
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPartidaPresu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPartidaPresu, this.gridBagConstraintsPartidaPresu);
				
		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPartidaPresu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPartidaPresu, this.gridBagConstraintsPartidaPresu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PartidaPresuJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPartidaPresu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPartidaPresu = new GridBagLayout();
			this.jPanelBusquedasParametrosPartidaPresu.setLayout(gridaBagLayoutBusquedasParametrosPartidaPresu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPartidaPresu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPartidaPresu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPartidaPresu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPartidaPresu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPartidaPresu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPartidaPresu, this.gridBagConstraintsPartidaPresu);
			
			
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPartidaPresu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPartidaPresu, this.gridBagConstraintsPartidaPresu);
		
			
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPartidaPresu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPartidaPresu, this.gridBagConstraintsPartidaPresu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPartidaPresu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPartidaPresu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPartidaPresu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPartidaPresu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPartidaPresu.setName("jPanelReporteDinamicoPartidaPresu"); 
		
		this.jPanelReporteDinamicoPartidaPresu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPartidaPresu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPartidaPresu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPartidaPresu.setLayout(gridaBagLayoutReporteDinamicoPartidaPresu);
		
		
		this.jInternalFrameReporteDinamicoPartidaPresu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPartidaPresu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePartidaPresu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPartidaPresu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPartidaPresu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPartidaPresu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPartidaPresu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPartidaPresu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPartidaPresu.setResizable(true);
	    this.jInternalFrameReporteDinamicoPartidaPresu.setClosable(true);
	    this.jInternalFrameReporteDinamicoPartidaPresu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPartidaPresu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPartidaPresu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPartidaPresu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Partida Presupuestarias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePartidaPresu = new JLabelMe();

		this.jLabelColumnasSelectReportePartidaPresu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPartidaPresu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPartidaPresu.add(this.jLabelColumnasSelectReportePartidaPresu, this.gridBagConstraintsPartidaPresu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePartidaPresu = new JList<Reporte>();
		this.jListColumnasSelectReportePartidaPresu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePartidaPresu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePartidaPresu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePartidaPresu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePartidaPresu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePartidaPresu=new JScrollPane(this.jListColumnasSelectReportePartidaPresu);
			
			this.jScrollColumnasSelectReportePartidaPresu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePartidaPresu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePartidaPresu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPartidaPresu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPartidaPresu.add(this.jListColumnasSelectReportePartidaPresu, this.gridBagConstraintsPartidaPresu);
		this.jPanelReporteDinamicoPartidaPresu.add(this.jScrollColumnasSelectReportePartidaPresu, this.gridBagConstraintsPartidaPresu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePartidaPresu = new JLabelMe();

		this.jLabelRelacionesSelectReportePartidaPresu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPartidaPresu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPartidaPresu.add(this.jLabelRelacionesSelectReportePartidaPresu, this.gridBagConstraintsPartidaPresu);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePartidaPresu = new JList<Reporte>();
		this.jListRelacionesSelectReportePartidaPresu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePartidaPresu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePartidaPresu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePartidaPresu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePartidaPresu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePartidaPresu=new JScrollPane(this.jListRelacionesSelectReportePartidaPresu);
			
			this.jScrollRelacionesSelectReportePartidaPresu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePartidaPresu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePartidaPresu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPartidaPresu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPartidaPresu.add(this.jListRelacionesSelectReportePartidaPresu, this.gridBagConstraintsPartidaPresu);
		this.jPanelReporteDinamicoPartidaPresu.add(this.jScrollRelacionesSelectReportePartidaPresu, this.gridBagConstraintsPartidaPresu);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPartidaPresu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPartidaPresu = new JComboBoxMe();
		this.jListColumnasValoresGraficoPartidaPresu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPartidaPresu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPartidaPresu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPartidaPresu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPartidaPresu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPartidaPresu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPartidaPresu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPartidaPresu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPartidaPresu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPartidaPresu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPartidaPresu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPartidaPresu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPartidaPresu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPartidaPresu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPartidaPresu.add(this.jLabelGenerarExcelReporteDinamicoPartidaPresu, this.gridBagConstraintsPartidaPresu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPartidaPresu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPartidaPresu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPartidaPresu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPartidaPresu.setToolTipText("Generar EXCEL"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		//this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPartidaPresu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPartidaPresu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPartidaPresu.add(this.jButtonGenerarExcelReporteDinamicoPartidaPresu, this.gridBagConstraintsPartidaPresu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPartidaPresu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPartidaPresu.add(this.jComboBoxTiposReportesDinamicoPartidaPresu, this.gridBagConstraintsPartidaPresu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPartidaPresu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPartidaPresu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPartidaPresu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPartidaPresu.add(this.jLabelTiposArchivoReporteDinamicoPartidaPresu, this.gridBagConstraintsPartidaPresu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPartidaPresu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPartidaPresu.add(this.jComboBoxTiposArchivosReportesDinamicoPartidaPresu, this.gridBagConstraintsPartidaPresu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPartidaPresu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPartidaPresu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPartidaPresu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPartidaPresu.setToolTipText("Generar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPartidaPresu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPartidaPresu.add(this.jButtonGenerarReporteDinamicoPartidaPresu, this.gridBagConstraintsPartidaPresu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPartidaPresu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPartidaPresu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPartidaPresu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPartidaPresu.setToolTipText("Cancelar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPartidaPresu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPartidaPresu.add(this.jButtonCerrarReporteDinamicoPartidaPresu, this.gridBagConstraintsPartidaPresu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPartidaPresu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPartidaPresu= new JScrollPane(jPanelReporteDinamicoPartidaPresu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPartidaPresu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPartidaPresu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPartidaPresu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Partida Presupuestarias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPartidaPresu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPartidaPresu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPartidaPresu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPartidaPresu);
		this.jInternalFrameReporteDinamicoPartidaPresu.getContentPane().add(this.jScrollPanelReporteDinamicoPartidaPresu, this.gridBagConstraintsPartidaPresu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPartidaPresu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPartidaPresu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPartidaPresu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPartidaPresu.setName("jPanelImportacionPartidaPresu"); 
		
		this.jPanelImportacionPartidaPresu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPartidaPresu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPartidaPresu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPartidaPresu.setLayout(gridaBagLayoutImportacionPartidaPresu);
		
		
		this.jInternalFrameImportacionPartidaPresu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPartidaPresu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPartidaPresu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePartidaPresu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPartidaPresu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPartidaPresu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPartidaPresu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPartidaPresu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPartidaPresu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPartidaPresu.setResizable(true);
	    this.jInternalFrameImportacionPartidaPresu.setClosable(true);
	    this.jInternalFrameImportacionPartidaPresu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPartidaPresu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPartidaPresu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPartidaPresu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPartidaPresu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPartidaPresu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPartidaPresu.setResizable(true);
	    this.jInternalFrameImportacionPartidaPresu.setClosable(true);
	    this.jInternalFrameImportacionPartidaPresu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPartidaPresu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPartidaPresu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPartidaPresu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Partida Presupuestarias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPartidaPresu = new JLabelMe();

		this.jLabelArchivoImportacionPartidaPresu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYImportacion;		
		this.gridBagConstraintsPartidaPresu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPartidaPresu.add(this.jLabelArchivoImportacionPartidaPresu, this.gridBagConstraintsPartidaPresu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPartidaPresu = new JFileChooser();		
		this.jFileChooserImportacionPartidaPresu.setToolTipText("ESCOGER ARCHIVO"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPartidaPresu = new JButtonMe();
		this.jButtonAbrirImportacionPartidaPresu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPartidaPresu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPartidaPresu.setToolTipText("Generar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYImportacion;
		this.gridBagConstraintsPartidaPresu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPartidaPresu.add(this.jButtonAbrirImportacionPartidaPresu, this.gridBagConstraintsPartidaPresu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPartidaPresu = new JLabelMe();

		this.jLabelPathArchivoImportacionPartidaPresu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYImportacion;		
		this.gridBagConstraintsPartidaPresu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPartidaPresu.add(this.jLabelPathArchivoImportacionPartidaPresu, this.gridBagConstraintsPartidaPresu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPartidaPresu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPartidaPresu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPartidaPresu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPartidaPresu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYImportacion;
		this.gridBagConstraintsPartidaPresu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPartidaPresu.add(this.jTextFieldPathArchivoImportacionPartidaPresu, this.gridBagConstraintsPartidaPresu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPartidaPresu = new JButtonMe();
		this.jButtonGenerarImportacionPartidaPresu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPartidaPresu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPartidaPresu.setToolTipText("Generar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYImportacion;
		this.gridBagConstraintsPartidaPresu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPartidaPresu.add(this.jButtonGenerarImportacionPartidaPresu, this.gridBagConstraintsPartidaPresu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPartidaPresu = new JButtonMe();
		this.jButtonCerrarImportacionPartidaPresu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPartidaPresu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPartidaPresu.setToolTipText("Cancelar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPartidaPresu.gridy = iPosYImportacion;
		this.gridBagConstraintsPartidaPresu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPartidaPresu.add(this.jButtonCerrarImportacionPartidaPresu, this.gridBagConstraintsPartidaPresu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPartidaPresu = new GridBagLayout();
		
		this.jScrollPanelImportacionPartidaPresu= new JScrollPane(jPanelImportacionPartidaPresu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy =iPosYImportacion;
		this.gridBagConstraintsPartidaPresu.gridx =iPosXImportacion;
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPartidaPresu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPartidaPresu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPartidaPresu);
		this.jInternalFrameImportacionPartidaPresu.getContentPane().add(this.jScrollPanelImportacionPartidaPresu, this.gridBagConstraintsPartidaPresu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPartidaPresu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPartidaPresu = new JButtonMe();
			this.jButtonAbrirOrderByPartidaPresu.setText("Orden");
			this.jButtonAbrirOrderByPartidaPresu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPartidaPresu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPartidaPresu";
			inputMap = this.jButtonAbrirOrderByPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPartidaPresu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPartidaPresu"));
		
		
			GridBagLayout gridaBagLayoutOrderByPartidaPresu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPartidaPresu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPartidaPresu.setName("jPanelOrderByPartidaPresu"); 
			
			this.jPanelOrderByPartidaPresu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPartidaPresu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPartidaPresu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPartidaPresu.setLayout(gridaBagLayoutOrderByPartidaPresu);
			
			
			this.jTableDatosPartidaPresuOrderBy = new JTableMe();        
			this.jTableDatosPartidaPresuOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPartidaPresuOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPartidaPresuOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPartidaPresuOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPartidaPresuOrderBy.setViewportView(this.jTableDatosPartidaPresuOrderBy);
			this.jTableDatosPartidaPresuOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPartidaPresuOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPartidaPresu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPartidaPresu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPartidaPresu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePartidaPresu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPartidaPresu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPartidaPresu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPartidaPresu.setTitle("Orden");
			this.jInternalFrameOrderByPartidaPresu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPartidaPresu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPartidaPresu.setResizable(true);
			this.jInternalFrameOrderByPartidaPresu.setClosable(true);
			this.jInternalFrameOrderByPartidaPresu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPartidaPresu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPartidaPresu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPartidaPresu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Partida Presupuestarias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPartidaPresu.gridx =iPosXOrderBy;
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPartidaPresu.ipady =150;
				
			this.jPanelOrderByPartidaPresu.add(jScrollPanelDatosPartidaPresuOrderBy, this.gridBagConstraintsPartidaPresu);//this.jTableDatosPartidaPresuTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPartidaPresu = new JButtonMe();
			this.jButtonCerrarOrderByPartidaPresu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPartidaPresu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPartidaPresu.setToolTipText("Cancelar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPartidaPresu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPartidaPresu.add(this.jButtonCerrarOrderByPartidaPresu, this.gridBagConstraintsPartidaPresu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPartidaPresu = new GridBagLayout();
			
			this.jScrollPanelOrderByPartidaPresu= new JScrollPane(jPanelOrderByPartidaPresu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.gridy =iPosYOrderBy;
			this.gridBagConstraintsPartidaPresu.gridx =iPosXOrderBy;
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPartidaPresu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPartidaPresu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPartidaPresu);
			
			this.jInternalFrameOrderByPartidaPresu.getContentPane().add(this.jScrollPanelOrderByPartidaPresu, this.gridBagConstraintsPartidaPresu);			
		
		} else {
			this.jButtonAbrirOrderByPartidaPresu = new JButtonMe();
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
			&& this.partidapresuSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPartidaPresu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPartidaPresu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPartidaPresu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPartidaPresu.getRowHeight();//PartidaPresuConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PartidaPresuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPartidaPresu.isSelected()) {
					iHeightTable=PartidaPresuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PartidaPresuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PartidaPresuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PartidaPresuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPartidaPresu.isSelected()) {
					iHeightTable=PartidaPresuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PartidaPresuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PartidaPresuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPartidaPresu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPartidaPresu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPartidaPresu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPartidaPresu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPartidaPresu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPartidaPresu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPartidaPresu!=null && this.jInternalFrameOrderByPartidaPresu.getjTableDatosOrderBy()!=null) {
			//if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPartidaPresu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPartidaPresu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPartidaPresu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPartidaPresu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPartidaPresu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPartidaPresu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPartidaPresu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPartidaPresu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPartidaPresu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPartidaPresu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=partidapresuLogic.getPartidaPresus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=partidapresus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PartidaPresu> TraerPartidaPresuBeans(List<PartidaPresu> partidapresus,ArrayList<Classe> classes)throws Exception {
		try {
			for(PartidaPresu partidapresu:partidapresus) {
					
				if(!(PartidaPresuConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PartidaPresuConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					partidapresu.setsDetalleGeneralEntityReporte(PartidaPresuConstantesFunciones.getPartidaPresuDescripcion(partidapresu));
										
						
					
					

					if(partidapresu.getDetalleActivoFijos()!=null && Funciones.existeClass(classes,DetalleActivoFijo.class)) {
						try{partidapresu.setdetalleactivofijosDescripcionReporte(new JRBeanCollectionDataSource(DetalleActivoFijoJInternalFrame.TraerDetalleActivoFijoBeans(partidapresu.getDetalleActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//partidapresu.setsDetalleGeneralEntityReporte(partidapresu.getsDetalleGeneralEntityReporte());
										
				}
				
				//partidapresubeans.add(partidapresubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return partidapresus;
    }
	//PARA REPORTES FIN
}
