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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.cartera.util.LineaNegocioConstantesFunciones;

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
public class LineaNegocioJInternalFrame extends LineaNegocioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarLineaNegocio;
	
	protected JMenuBar jmenuBarLineaNegocio;
	
	protected JMenu jmenuLineaNegocio;
	protected JMenu jmenuDatosLineaNegocio;
	protected JMenu jmenuArchivoLineaNegocio;
	protected JMenu jmenuAccionesLineaNegocio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosLineaNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLineaNegocio;	
	protected GridBagConstraints gridBagConstraintsLineaNegocio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public LineaNegocioDetalleFormJInternalFrame jInternalFrameDetalleFormLineaNegocio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoLineaNegocio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionLineaNegocio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public LineaNegocioSessionBean lineanegocioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<LineaNegocio> lineanegocios;		
	public List<LineaNegocio> lineanegociosEliminados;	
	public List<LineaNegocio> lineanegociosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByLineaNegocio;		
	protected JButton jButtonAbrirOrderByLineaNegocio;
	
	
	//protected JPanel jPanelOrderByLineaNegocio;
	//public JScrollPane jScrollPanelOrderByLineaNegocio;	
	//protected JButton jButtonCerrarOrderByLineaNegocio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public LineaNegocioLogic lineanegocioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosLineaNegocio;
	public JScrollPane jScrollPanelDatosEdicionLineaNegocio;
	public JScrollPane jScrollPanelDatosGeneralLineaNegocio;
    
	
	
	//public JScrollPane jScrollPanelDatosLineaNegocioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoLineaNegocio;
	//public JScrollPane jScrollPanelImportacionLineaNegocio;
	
	
	
	protected JPanel jPanelAccionesLineaNegocio;
	
    protected JPanel jPanelPaginacionLineaNegocio;
    protected JPanel jPanelParametrosReportesLineaNegocio;
	protected JPanel jPanelParametrosReportesAccionesLineaNegocio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1LineaNegocio;
	protected JPanel jPanelParametrosAuxiliar2LineaNegocio;
	protected JPanel jPanelParametrosAuxiliar3LineaNegocio;
	protected JPanel jPanelParametrosAuxiliar4LineaNegocio;
	//protected JPanel jPanelParametrosAuxiliar5LineaNegocio;
	
	
	
	//protected JPanel jPanelReporteDinamicoLineaNegocio;
	//protected JPanel jPanelImportacionLineaNegocio;
	
	
	public JTable jTableDatosLineaNegocio;
	
	
	
	//public JTable jTableDatosLineaNegocioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoLineaNegocio;
	protected JButton jButtonDuplicarLineaNegocio;
	protected JButton jButtonCopiarLineaNegocio;
	protected JButton jButtonVerFormLineaNegocio;
	protected JButton jButtonNuevoRelacionesLineaNegocio;
	protected JButton jButtonModificarLineaNegocio;
	
    protected JButton jButtonGuardarCambiosTablaLineaNegocio;
	protected JButton jButtonCerrarLineaNegocio;
	
	
	protected JButton jButtonRecargarInformacionLineaNegocio;
	protected JButton jButtonProcesarInformacionLineaNegocio;
	
	
	protected JButton jButtonAnterioresLineaNegocio;
	protected JButton jButtonSiguientesLineaNegocio;
	protected JButton jButtonNuevoGuardarCambiosLineaNegocio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoLineaNegocio;
	//protected JButton jButtonCerrarReporteDinamicoLineaNegocio;
	//protected JButton jButtonGenerarExcelReporteDinamicoLineaNegocio;	
	
	
	
	//protected JButton jButtonAbrirImportacionLineaNegocio;
	//protected JButton jButtonGenerarImportacionLineaNegocio;
	//protected JButton jButtonCerrarImportacionLineaNegocio;
	//protected JFileChooser jFileChooserImportacionLineaNegocio;
	//protected File fileImportacionLineaNegocio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLineaNegocio;
	protected JButton jButtonDuplicarToolBarLineaNegocio;
	protected JButton jButtonNuevoRelacionesToolBarLineaNegocio;
	
	
	public JButton jButtonGuardarCambiosToolBarLineaNegocio;
	protected JButton jButtonCopiarToolBarLineaNegocio;
	protected JButton jButtonVerFormToolBarLineaNegocio;
	public JButton jButtonGuardarCambiosTablaToolBarLineaNegocio;
	protected JButton jButtonMostrarOcultarTablaToolBarLineaNegocio;
	protected JButton jButtonCerrarToolBarLineaNegocio;
	
	protected JButton jButtonRecargarInformacionToolBarLineaNegocio;
	protected JButton jButtonProcesarInformacionToolBarLineaNegocio;
	protected JButton jButtonAnterioresToolBarLineaNegocio;
	protected JButton jButtonSiguientesToolBarLineaNegocio;
	protected JButton jButtonNuevoGuardarCambiosToolBarLineaNegocio;
	protected JButton jButtonAbrirOrderByToolBarLineaNegocio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLineaNegocio;
	protected JMenuItem jMenuItemDuplicarLineaNegocio;
	protected JMenuItem jMenuItemNuevoRelacionesLineaNegocio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosLineaNegocio;
	protected JMenuItem jMenuItemCopiarLineaNegocio;
	protected JMenuItem jMenuItemVerFormLineaNegocio;
	protected JMenuItem jMenuItemGuardarCambiosTablaLineaNegocio;
	protected JMenuItem jMenuItemCerrarLineaNegocio;
	protected JMenuItem jMenuItemDetalleCerrarLineaNegocio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByLineaNegocio;
	protected JMenuItem jMenuItemDetalleMostarOcultarLineaNegocio;
	
	protected JMenuItem jMenuItemRecargarInformacionLineaNegocio;
	protected JMenuItem jMenuItemProcesarInformacionLineaNegocio;
	protected JMenuItem jMenuItemAnterioresLineaNegocio;
	protected JMenuItem jMenuItemSiguientesLineaNegocio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLineaNegocio;
	protected JMenuItem jMenuItemAbrirOrderByLineaNegocio;
	protected JMenuItem jMenuItemMostrarOcultarLineaNegocio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesLineaNegocio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosLineaNegocio;
	protected JCheckBox jCheckBoxSeleccionadosLineaNegocio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaLineaNegocio;
	protected JCheckBox jCheckBoxConGraficoReporteLineaNegocio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesLineaNegocio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesLineaNegocio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoLineaNegocio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoLineaNegocio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesLineaNegocio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionLineaNegocio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLineaNegocio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLineaNegocio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarLineaNegocio;
	protected JTextField jTextFieldValorCampoGeneralLineaNegocio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteLineaNegocio;
	//public JList<Reporte> jListColumnasSelectReporteLineaNegocio;
	//public JScrollPane jScrollColumnasSelectReporteLineaNegocio;
	
	//public JLabel jLabelRelacionesSelectReporteLineaNegocio;
	//public JList<Reporte> jListRelacionesSelectReporteLineaNegocio;
	//public JScrollPane jScrollRelacionesSelectReporteLineaNegocio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoLineaNegocio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoLineaNegocio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoLineaNegocio;
	//public JLabel jLabelTiposArchivoReporteDinamicoLineaNegocio;
	
		
	//public JLabel jLabelArchivoImportacionLineaNegocio;	
	//public JLabel jLabelPathArchivoImportacionLineaNegocio;
	//protected JTextField jTextFieldPathArchivoImportacionLineaNegocio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoLineaNegocio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoLineaNegocio;
	
	//public JLabel jLabelColumnaCategoriaValorLineaNegocio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorLineaNegocio;
	
	//public JLabel jLabelColumnasValoresGraficoLineaNegocio;
	//public JList<Reporte> jListColumnasValoresGraficoLineaNegocio;
	//public JScrollPane jScrollColumnasValoresGraficoLineaNegocio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoLineaNegocio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoLineaNegocio;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasLineaNegocio;
	public JPanel jPanelBusquedaPorCodigoLineaNegocio;
	public JButton jButtonBusquedaPorCodigoLineaNegocio;
	public JPanel jPanelBusquedaPorNombreLineaNegocio;
	public JButton jButtonBusquedaPorNombreLineaNegocio;
	
	public JPanel jPanelcodigoBusquedaPorCodigoLineaNegocio;
	public JLabel jLabelcodigoBusquedaPorCodigoLineaNegocio;
	public JTextField jTextFieldcodigoBusquedaPorCodigoLineaNegocio;
	public JButton jButtoncodigoBusquedaPorCodigoLineaNegocioBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreLineaNegocio;
	public JLabel jLabelnombreBusquedaPorNombreLineaNegocio;
	public JTextArea jTextAreanombreBusquedaPorNombreLineaNegocio;
	public JButton jButtonnombreBusquedaPorNombreLineaNegocioBusqueda= new JButtonMe();

	
	
	
	
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
	public LineaNegocioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("LineaNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaNegocioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LineaNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaNegocioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LineaNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaNegocioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("LineaNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionLineaNegocio)	{
		this.jButtonRecargarInformacionLineaNegocio = jButtonRecargarInformacionLineaNegocio;
	}
	
	public JButton getjButtonProcesarInformacionLineaNegocio() {
		return this.jButtonProcesarInformacionLineaNegocio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLineaNegocio)	{
		this.jButtonProcesarInformacionLineaNegocio = jButtonProcesarInformacionLineaNegocio;
	}
	
	
	public JButton getjButtonRecargarInformacionLineaNegocio() {
		return this.jButtonRecargarInformacionLineaNegocio;
	}
	
	
	public List<LineaNegocio> getlineanegocios() {
		return this.lineanegocios;
	}

	public void setlineanegocios(List<LineaNegocio> lineanegocios) {
		this.lineanegocios = lineanegocios;
	}
	
	public List<LineaNegocio> getlineanegociosAux() {
		return this.lineanegociosAux;
	}

	public void setlineanegociosAux(List<LineaNegocio> lineanegociosAux) {
		this.lineanegociosAux = lineanegociosAux;
	}
	
	public List<LineaNegocio> getlineanegociosEliminados() {
		return this.lineanegociosEliminados;
	}

	public void setLineaNegociosEliminados(List<LineaNegocio> lineanegociosEliminados) {
		this.lineanegociosEliminados = lineanegociosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarLineaNegocio() {
		return jComboBoxTiposSeleccionarLineaNegocio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarLineaNegocio(
			JComboBox jComboBoxTiposSeleccionarLineaNegocio) {
		this.jComboBoxTiposSeleccionarLineaNegocio = jComboBoxTiposSeleccionarLineaNegocio;
	}
	
	public void setBorderResaltarTiposSeleccionarLineaNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarLineaNegocio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarLineaNegocio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralLineaNegocio() {
		return jTextFieldValorCampoGeneralLineaNegocio;
	}

	public void setjTextFieldValorCampoGeneralLineaNegocio(
			JTextField jTextFieldValorCampoGeneralLineaNegocio) {
		this.jTextFieldValorCampoGeneralLineaNegocio = jTextFieldValorCampoGeneralLineaNegocio;
	}

	public void setBorderResaltarValorCampoGeneralLineaNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaNegocio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralLineaNegocio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosLineaNegocio() {
		return this.jCheckBoxSeleccionarTodosLineaNegocio;
	}

	public void setjCheckBoxSeleccionarTodosLineaNegocio(
			JCheckBox jCheckBoxSeleccionarTodosLineaNegocio) {
		this.jCheckBoxSeleccionarTodosLineaNegocio = jCheckBoxSeleccionarTodosLineaNegocio;
	}

	public void setBorderResaltarSeleccionarTodosLineaNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaNegocio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosLineaNegocio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosLineaNegocio() {
		return this.jCheckBoxSeleccionadosLineaNegocio;
	}

	public void setjCheckBoxSeleccionadosLineaNegocio(
			JCheckBox jCheckBoxSeleccionadosLineaNegocio) {
		this.jCheckBoxSeleccionadosLineaNegocio = jCheckBoxSeleccionadosLineaNegocio;
	}
	
	public void setBorderResaltarSeleccionadosLineaNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaNegocio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosLineaNegocio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesLineaNegocio() {
		return this.jComboBoxTiposArchivosReportesLineaNegocio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesLineaNegocio(
			JComboBox jComboBoxTiposArchivosReportesLineaNegocio) {
		this.jComboBoxTiposArchivosReportesLineaNegocio = jComboBoxTiposArchivosReportesLineaNegocio;
	}

	public void setBorderResaltarTiposArchivosReportesLineaNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaNegocio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesLineaNegocio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesLineaNegocio() {
		return this.jComboBoxTiposReportesLineaNegocio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesLineaNegocio(
			JComboBox jComboBoxTiposReportesLineaNegocio) {
		this.jComboBoxTiposReportesLineaNegocio = jComboBoxTiposReportesLineaNegocio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoLineaNegocio() {
	//	return jComboBoxTiposReportesDinamicoLineaNegocio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoLineaNegocio(
	//		JComboBox jComboBoxTiposReportesDinamicoLineaNegocio) {
	//	this.jComboBoxTiposReportesDinamicoLineaNegocio = jComboBoxTiposReportesDinamicoLineaNegocio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoLineaNegocio() {
	//	return jComboBoxTiposArchivosReportesDinamicoLineaNegocio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoLineaNegocio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoLineaNegocio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoLineaNegocio = jComboBoxTiposArchivosReportesDinamicoLineaNegocio;
	//}
	
	public void setBorderResaltarTiposReportesLineaNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaNegocio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesLineaNegocio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesLineaNegocio() {
		return this.jComboBoxTiposGraficosReportesLineaNegocio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesLineaNegocio(
			JComboBox jComboBoxTiposGraficosReportesLineaNegocio) {
		this.jComboBoxTiposGraficosReportesLineaNegocio = jComboBoxTiposGraficosReportesLineaNegocio;
	}
	
	public void setBorderResaltarTiposGraficosReportesLineaNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaNegocio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesLineaNegocio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionLineaNegocio() {
		return this.jComboBoxTiposPaginacionLineaNegocio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionLineaNegocio(
			JComboBox jComboBoxTiposPaginacionLineaNegocio) {
		this.jComboBoxTiposPaginacionLineaNegocio = jComboBoxTiposPaginacionLineaNegocio;
	}
	
	public void setBorderResaltarTiposPaginacionLineaNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaNegocio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionLineaNegocio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesLineaNegocio() {
		return this.jComboBoxTiposRelacionesLineaNegocio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLineaNegocio() {
		return this.jComboBoxTiposAccionesLineaNegocio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLineaNegocio(
			JComboBox jComboBoxTiposRelacionesLineaNegocio) {
		this.jComboBoxTiposRelacionesLineaNegocio = jComboBoxTiposRelacionesLineaNegocio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLineaNegocio(
			JComboBox jComboBoxTiposAccionesLineaNegocio) {
		this.jComboBoxTiposAccionesLineaNegocio = jComboBoxTiposAccionesLineaNegocio;
	}
	
	public void setBorderResaltarTiposRelacionesLineaNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaNegocio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesLineaNegocio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesLineaNegocio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaNegocio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesLineaNegocio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoLineaNegocio() {
	//	return jCheckBoxConGraficoDinamicoLineaNegocio;
	//}

	//public void setjCheckBoxConGraficoDinamicoLineaNegocio(
	//		JCheckBox jCheckBoxConGraficoDinamicoLineaNegocio) {
	//	this.jCheckBoxConGraficoDinamicoLineaNegocio = jCheckBoxConGraficoDinamicoLineaNegocio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoLineaNegocio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarLineaNegocio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoLineaNegocio .setBorder(borderResaltar);		
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
		this.lineanegocioSessionBean=new LineaNegocioSessionBean();
		
		this.lineanegocioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.lineanegocioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.lineanegocioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=LineaNegocioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=LineaNegocioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LineaNegocioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LineaNegocioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LineaNegocioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Linea_negocio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
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
		
		LineaNegocioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("LineaNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarLineaNegocio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarLineaNegocio,this.jTtoolBarLineaNegocio,
							"nuevo","nuevo","Nuevo"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarLineaNegocio,this.jTtoolBarLineaNegocio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarLineaNegocio,this.jTtoolBarLineaNegocio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarLineaNegocio,this.jTtoolBarLineaNegocio,
							"duplicar","duplicar","Duplicar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarLineaNegocio,this.jTtoolBarLineaNegocio,
							"copiar","copiar","Copiar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarLineaNegocio,this.jTtoolBarLineaNegocio,
							"ver_form","ver_form","Ver"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLineaNegocio,this.jTtoolBarLineaNegocio,
							"recargar","recargar","Recargar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLineaNegocio,this.jTtoolBarLineaNegocio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLineaNegocio,this.jTtoolBarLineaNegocio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarLineaNegocio,this.jTtoolBarLineaNegocio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarLineaNegocio,this.jTtoolBarLineaNegocio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarLineaNegocio,this.jTtoolBarLineaNegocio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarLineaNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarLineaNegocio,this.jTtoolBarLineaNegocio,
							"cerrar","cerrar","Salir"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarLineaNegocio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarLineaNegocio;
			
				this.jButtonProcesarInformacionToolBarLineaNegocio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarLineaNegocio;
				
		//protected JButton jButtonModificarToolBarLineaNegocio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarLineaNegocio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuLineaNegocio=new JMenuMe("General");
		this.jmenuArchivoLineaNegocio=new JMenuMe("Archivo");
		this.jmenuAccionesLineaNegocio=new JMenuMe("Acciones");
		this.jmenuDatosLineaNegocio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLineaNegocio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLineaNegocio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLineaNegocio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarLineaNegocio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarLineaNegocio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarLineaNegocio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesLineaNegocio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesLineaNegocio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesLineaNegocio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosLineaNegocio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLineaNegocio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLineaNegocio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarLineaNegocio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarLineaNegocio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarLineaNegocio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormLineaNegocio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormLineaNegocio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormLineaNegocio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaLineaNegocio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaLineaNegocio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaLineaNegocio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLineaNegocio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLineaNegocio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLineaNegocio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionLineaNegocio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionLineaNegocio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionLineaNegocio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionLineaNegocio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionLineaNegocio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionLineaNegocio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresLineaNegocio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresLineaNegocio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresLineaNegocio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesLineaNegocio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesLineaNegocio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesLineaNegocio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByLineaNegocio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByLineaNegocio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByLineaNegocio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLineaNegocio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLineaNegocio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLineaNegocio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByLineaNegocio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByLineaNegocio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByLineaNegocio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLineaNegocio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLineaNegocio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLineaNegocio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosLineaNegocio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosLineaNegocio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosLineaNegocio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoLineaNegocio.add(this.jMenuItemCerrarLineaNegocio);
			
			this.jmenuAccionesLineaNegocio.add(this.jMenuItemNuevoLineaNegocio);
			this.jmenuAccionesLineaNegocio.add(this.jMenuItemNuevoGuardarCambiosLineaNegocio);
			this.jmenuAccionesLineaNegocio.add(this.jMenuItemNuevoRelacionesLineaNegocio);
			this.jmenuAccionesLineaNegocio.add(this.jMenuItemGuardarCambiosTablaLineaNegocio);		
			this.jmenuAccionesLineaNegocio.add(this.jMenuItemDuplicarLineaNegocio);		
			this.jmenuAccionesLineaNegocio.add(this.jMenuItemCopiarLineaNegocio);		
			this.jmenuAccionesLineaNegocio.add(this.jMenuItemVerFormLineaNegocio);		
			
			this.jmenuDatosLineaNegocio.add(this.jMenuItemRecargarInformacionLineaNegocio);				
			this.jmenuDatosLineaNegocio.add(this.jMenuItemAnterioresLineaNegocio);				
			this.jmenuDatosLineaNegocio.add(this.jMenuItemSiguientesLineaNegocio);				
			this.jmenuDatosLineaNegocio.add(this.jMenuItemAbrirOrderByLineaNegocio);				
			this.jmenuDatosLineaNegocio.add(this.jMenuItemMostrarOcultarLineaNegocio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesLineaNegocio.add(this.jMenuItemGuardarCambiosLineaNegocio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarLineaNegocio.add(this.jmenuArchivoLineaNegocio);		
			this.jmenuBarLineaNegocio.add(this.jmenuAccionesLineaNegocio);		
			this.jmenuBarLineaNegocio.add(this.jmenuDatosLineaNegocio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarLineaNegocio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasLineaNegocio() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoLineaNegocio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoLineaNegocio.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoLineaNegocio= new JButtonMe();
		this.jButtonBusquedaPorCodigoLineaNegocio.setText("Buscar");
		this.jButtonBusquedaPorCodigoLineaNegocio.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoLineaNegocio,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoLineaNegocio = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoLineaNegocio.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoLineaNegocio.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoLineaNegocio,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoLineaNegocio= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoLineaNegocio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreLineaNegocio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreLineaNegocio.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreLineaNegocio= new JButtonMe();
		this.jButtonBusquedaPorNombreLineaNegocio.setText("Buscar");
		this.jButtonBusquedaPorNombreLineaNegocio.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreLineaNegocio,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreLineaNegocio = new JLabelMe();
		jLabelnombreBusquedaPorNombreLineaNegocio.setText("Nombre :");
		jLabelnombreBusquedaPorNombreLineaNegocio.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreLineaNegocio,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreLineaNegocio= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreLineaNegocio,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasLineaNegocio=new JTabbedPane();


		this.jTabbedPaneBusquedasLineaNegocio.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLineaNegocio.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLineaNegocio.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasLineaNegocio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasLineaNegocio,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleLineaNegocio = new LineaNegocioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Linea_negocio DATOS");
			this.jInternalFrameDetalleFormLineaNegocio = new LineaNegocioDetalleFormJInternalFrame(jDesktopPane,this.lineanegocioSessionBean.getConGuardarRelaciones(),this.lineanegocioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormLineaNegocio = null;//new LineaNegocioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLineaNegocio= new GridBagLayout();
		
		
		this.jTableDatosLineaNegocio = new JTableMe();      
		
		String sToolTipLineaNegocio="";
		sToolTipLineaNegocio=LineaNegocioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLineaNegocio+="(Cartera.LineaNegocio)";
		}
		
		if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
			sToolTipLineaNegocio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosLineaNegocio.setToolTipText(sToolTipLineaNegocio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosLineaNegocio);
		this.jTableDatosLineaNegocio.setAutoCreateRowSorter(true);
		this.jTableDatosLineaNegocio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosLineaNegocio.setRowSelectionAllowed(true);
		this.jTableDatosLineaNegocio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosLineaNegocio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoLineaNegocio = new JButtonMe();
		this.jButtonDuplicarLineaNegocio = new JButtonMe();
		this.jButtonCopiarLineaNegocio = new JButtonMe();
		this.jButtonVerFormLineaNegocio = new JButtonMe();
		this.jButtonNuevoRelacionesLineaNegocio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaLineaNegocio = new JButtonMe();
		this.jButtonCerrarLineaNegocio = new JButtonMe();
		
		this.jScrollPanelDatosLineaNegocio = new JScrollPane();   
        this.jScrollPanelDatosGeneralLineaNegocio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesLineaNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Linea_negocio";
		
		if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea_negocios" + this.sPath));
		} else {
			this.jScrollPanelDatosLineaNegocio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLineaNegocio.setToolTipText("Acciones");
        this.jPanelAccionesLineaNegocio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoLineaNegocio=new ReporteDinamicoJInternalFrame(LineaNegocioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoLineaNegocio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionLineaNegocio=new ImportacionJInternalFrame(LineaNegocioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionLineaNegocio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByLineaNegocio = new JButtonMe();
		
		this.jButtonAbrirOrderByLineaNegocio.setText("Orden");
		this.jButtonAbrirOrderByLineaNegocio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLineaNegocio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByLineaNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLineaNegocio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLineaNegocio,false,this);
			
			//this.cargarOrderByLineaNegocio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLineaNegocio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLineaNegocio,true,this);
			
			//this.cargarOrderByLineaNegocio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosLineaNegocio.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosLineaNegocio.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosLineaNegocio.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosLineaNegocio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosLineaNegocio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosLineaNegocio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoLineaNegocio.setText("Nuevo");
		this.jButtonDuplicarLineaNegocio.setText("Duplicar");
		this.jButtonCopiarLineaNegocio.setText("Copiar");
		this.jButtonVerFormLineaNegocio.setText("Ver");
		this.jButtonNuevoRelacionesLineaNegocio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaLineaNegocio.setText("Guardar");
		this.jButtonCerrarLineaNegocio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLineaNegocio,"nuevo_button","Nuevo",this.lineanegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarLineaNegocio,"duplicar_button","Duplicar",this.lineanegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarLineaNegocio,"copiar_button","Copiar",this.lineanegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormLineaNegocio,"ver_form","Ver",this.lineanegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesLineaNegocio,"nuevorelaciones_button","Nuevo Rel",this.lineanegocioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLineaNegocio,"guardarcambiostabla_button","Guardar",this.lineanegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLineaNegocio,"cerrar_button","Salir",this.lineanegocioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoLineaNegocio.setToolTipText("Nuevo"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarLineaNegocio.setToolTipText("Duplicar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarLineaNegocio.setToolTipText("Copiar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormLineaNegocio.setToolTipText("Ver"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesLineaNegocio.setToolTipText("Nuevo Rel"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaLineaNegocio.setToolTipText("Guardar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLineaNegocio.setToolTipText("Salir"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoLineaNegocio";
		inputMap = this.jButtonNuevoLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLineaNegocio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLineaNegocio"));
		
		//DUPLICAR
		sMapKey = "DuplicarLineaNegocio";
		inputMap = this.jButtonDuplicarLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarLineaNegocio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarLineaNegocio"));
		
		//COPIAR
		sMapKey = "CopiarLineaNegocio";
		inputMap = this.jButtonCopiarLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarLineaNegocio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarLineaNegocio"));
		
		//VEr FORM
		sMapKey = "VerFormLineaNegocio";
		inputMap = this.jButtonVerFormLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormLineaNegocio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormLineaNegocio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesLineaNegocio";
		inputMap = this.jButtonNuevoRelacionesLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesLineaNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesLineaNegocio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarLineaNegocio";
		inputMap = this.jButtonModificarLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarLineaNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarLineaNegocio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarLineaNegocio";
		inputMap = this.jButtonCerrarLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLineaNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLineaNegocio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLineaNegocio";
		inputMap = this.jButtonGuardarCambiosTablaLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLineaNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLineaNegocio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesLineaNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesLineaNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionLineaNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1LineaNegocio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2LineaNegocio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3LineaNegocio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4LineaNegocio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5LineaNegocio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesLineaNegocio.setName("jPanelParametrosReportesLineaNegocio"); 
		
		this.jPanelParametrosReportesAccionesLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesLineaNegocio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesLineaNegocio.setName("jPanelParametrosReportesAccionesLineaNegocio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesLineaNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionLineaNegocio = new JButtonMe();
		this.jButtonRecargarInformacionLineaNegocio.setText("Recargar");
		this.jButtonRecargarInformacionLineaNegocio.setToolTipText("Recargar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionLineaNegocio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionLineaNegocio = new JButtonMe();
		this.jButtonProcesarInformacionLineaNegocio.setText("Procesar");
		this.jButtonProcesarInformacionLineaNegocio.setToolTipText("Procesar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionLineaNegocio.setVisible(false);
			
		this.jButtonProcesarInformacionLineaNegocio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLineaNegocio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLineaNegocio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesLineaNegocio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLineaNegocio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesLineaNegocio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesLineaNegocio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLineaNegocio.setText("TIPO");       
		this.jComboBoxTiposReportesLineaNegocio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesLineaNegocio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLineaNegocio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesLineaNegocio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionLineaNegocio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionLineaNegocio.setText("Paginacion");
		this.jComboBoxTiposPaginacionLineaNegocio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesLineaNegocio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesLineaNegocio.setText("Accion");
		this.jComboBoxTiposRelacionesLineaNegocio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesLineaNegocio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLineaNegocio.setText("Accion");
		this.jComboBoxTiposAccionesLineaNegocio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarLineaNegocio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarLineaNegocio.setText("Accion");
		this.jComboBoxTiposSeleccionarLineaNegocio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralLineaNegocio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralLineaNegocio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLineaNegocio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLineaNegocio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesLineaNegocio = new JLabelMe();
		
		this.jLabelAccionesLineaNegocio.setText("Acciones");		
		this.jLabelAccionesLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosLineaNegocio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosLineaNegocio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosLineaNegocio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosLineaNegocio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosLineaNegocio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosLineaNegocio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaLineaNegocio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaLineaNegocio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaLineaNegocio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteLineaNegocio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteLineaNegocio.setText("Graf.");
		this.jCheckBoxConGraficoReporteLineaNegocio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresLineaNegocio = new JButtonMe();
		//this.jButtonAnterioresLineaNegocio.setText("<<");
        this.jButtonAnterioresLineaNegocio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresLineaNegocio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesLineaNegocio = new JButtonMe();
		//this.jButtonSiguientesLineaNegocio.setText(">>");
        this.jButtonSiguientesLineaNegocio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesLineaNegocio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosLineaNegocio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosLineaNegocio.setText("Nue");
        this.jButtonNuevoGuardarCambiosLineaNegocio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosLineaNegocio,"nuevoguardarcambios_button","Nue",this.lineanegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosLineaNegocio";
		inputMap = this.jButtonNuevoGuardarCambiosLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosLineaNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosLineaNegocio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionLineaNegocio";
		inputMap = this.jButtonRecargarInformacionLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionLineaNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionLineaNegocio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesLineaNegocio";
		inputMap = this.jButtonSiguientesLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesLineaNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesLineaNegocio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresLineaNegocio";
		inputMap = this.jButtonAnterioresLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresLineaNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresLineaNegocio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasLineaNegocio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesLineaNegocio.setMinimumSize(new Dimension(this.getWidth(),LineaNegocioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LineaNegocioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLineaNegocio.setMaximumSize(new Dimension(this.getWidth(),LineaNegocioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LineaNegocioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLineaNegocio.setPreferredSize(new Dimension(this.getWidth(),LineaNegocioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LineaNegocioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionLineaNegocio = new GridBagLayout();

			this.jPanelPaginacionLineaNegocio.setLayout(gridaBagLayoutPaginacionLineaNegocio);						
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.gridy = 0;
			this.gridBagConstraintsLineaNegocio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionLineaNegocio.add(this.jButtonAnterioresLineaNegocio, this.gridBagConstraintsLineaNegocio);
					
						
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLineaNegocio.gridy = 0;
			
			this.jPanelPaginacionLineaNegocio.add(this.jButtonNuevoGuardarCambiosLineaNegocio, this.gridBagConstraintsLineaNegocio);
						
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsLineaNegocio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLineaNegocio.gridy = 0;
			this.jPanelPaginacionLineaNegocio.add(this.jButtonSiguientesLineaNegocio, this.gridBagConstraintsLineaNegocio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.gridy = 1;
			this.gridBagConstraintsLineaNegocio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLineaNegocio.add(this.jButtonNuevoLineaNegocio, this.gridBagConstraintsLineaNegocio);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
				this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsLineaNegocio.gridy = 1;
				this.gridBagConstraintsLineaNegocio.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionLineaNegocio.add(this.jButtonNuevoRelacionesLineaNegocio, this.gridBagConstraintsLineaNegocio);
			}
			
			
			if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
				this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsLineaNegocio.gridy = 1;
				this.gridBagConstraintsLineaNegocio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionLineaNegocio.add(this.jButtonGuardarCambiosTablaLineaNegocio, this.gridBagConstraintsLineaNegocio);
			}
			
			
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.gridy = 1;
			this.gridBagConstraintsLineaNegocio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLineaNegocio.add(this.jButtonDuplicarLineaNegocio, this.gridBagConstraintsLineaNegocio);
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.gridy = 1;
			this.gridBagConstraintsLineaNegocio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLineaNegocio.add(this.jButtonCopiarLineaNegocio, this.gridBagConstraintsLineaNegocio);
		
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.gridy = 1;
			this.gridBagConstraintsLineaNegocio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLineaNegocio.add(this.jButtonVerFormLineaNegocio, this.gridBagConstraintsLineaNegocio);
		
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.gridy = 1;
			this.gridBagConstraintsLineaNegocio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionLineaNegocio.add(this.jButtonCerrarLineaNegocio, this.gridBagConstraintsLineaNegocio);
		
		
		
		this.jButtonRecargarInformacionLineaNegocio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLineaNegocio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLineaNegocio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesLineaNegocio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLineaNegocio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLineaNegocio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesLineaNegocio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLineaNegocio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLineaNegocio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesLineaNegocio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLineaNegocio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLineaNegocio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionLineaNegocio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLineaNegocio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLineaNegocio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesLineaNegocio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLineaNegocio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLineaNegocio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesLineaNegocio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLineaNegocio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLineaNegocio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarLineaNegocio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLineaNegocio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLineaNegocio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaLineaNegocio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLineaNegocio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLineaNegocio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteLineaNegocio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLineaNegocio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLineaNegocio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosLineaNegocio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLineaNegocio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLineaNegocio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosLineaNegocio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLineaNegocio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLineaNegocio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesLineaNegocio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesLineaNegocio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1LineaNegocio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2LineaNegocio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3LineaNegocio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4LineaNegocio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesLineaNegocio.setLayout(gridaBagParametrosReportesLineaNegocio);
			this.jPanelParametrosReportesAccionesLineaNegocio.setLayout(gridaBagParametrosReportesAccionesLineaNegocio);
			
			
			this.jPanelParametrosAuxiliar1LineaNegocio.setLayout(gridaBagParametrosAuxiliar1LineaNegocio);
			this.jPanelParametrosAuxiliar2LineaNegocio.setLayout(gridaBagParametrosAuxiliar2LineaNegocio);
			this.jPanelParametrosAuxiliar3LineaNegocio.setLayout(gridaBagParametrosAuxiliar3LineaNegocio);
			this.jPanelParametrosAuxiliar4LineaNegocio.setLayout(gridaBagParametrosAuxiliar4LineaNegocio);
			//this.jPanelParametrosAuxiliar5LineaNegocio.setLayout(gridaBagParametrosAuxiliar2LineaNegocio);			
			
			
			
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLineaNegocio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLineaNegocio.add(this.jButtonRecargarInformacionLineaNegocio, this.gridBagConstraintsLineaNegocio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLineaNegocio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LineaNegocio.add(this.jComboBoxTiposPaginacionLineaNegocio, this.gridBagConstraintsLineaNegocio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLineaNegocio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LineaNegocio.add(this.jCheckBoxConAltoMaximoTablaLineaNegocio, this.gridBagConstraintsLineaNegocio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLineaNegocio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LineaNegocio.add(this.jComboBoxTiposArchivosReportesLineaNegocio, this.gridBagConstraintsLineaNegocio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaNegocio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLineaNegocio.add(this.jPanelParametrosAuxiliar1LineaNegocio, this.gridBagConstraintsLineaNegocio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLineaNegocio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4LineaNegocio.add(this.jComboBoxTiposReportesLineaNegocio, this.gridBagConstraintsLineaNegocio);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaNegocio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLineaNegocio.add(this.jPanelParametrosAuxiliar4LineaNegocio, this.gridBagConstraintsLineaNegocio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsLineaNegocio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLineaNegocio.add(this.jComboBoxTiposReportesLineaNegocio, this.gridBagConstraintsLineaNegocio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaNegocio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLineaNegocio.add(this.jCheckBoxGenerarReporteLineaNegocio, this.gridBagConstraintsLineaNegocio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaNegocio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLineaNegocio.add(this.jPanelParametrosAuxiliar2LineaNegocio, this.gridBagConstraintsLineaNegocio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLineaNegocio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLineaNegocio.add(this.jLabelAccionesLineaNegocio, this.gridBagConstraintsLineaNegocio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
				this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsLineaNegocio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesLineaNegocio.add(this.jButtonAbrirOrderByLineaNegocio, this.gridBagConstraintsLineaNegocio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaNegocio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLineaNegocio.add(this.jComboBoxTiposSeleccionarLineaNegocio, this.gridBagConstraintsLineaNegocio);			
			
			
			/*
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLineaNegocio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLineaNegocio.add(this.jCheckBoxSeleccionarTodosLineaNegocio, this.gridBagConstraintsLineaNegocio);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLineaNegocio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LineaNegocio.add(this.jCheckBoxSeleccionarTodosLineaNegocio, this.gridBagConstraintsLineaNegocio);															
				
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLineaNegocio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LineaNegocio.add(this.jCheckBoxSeleccionadosLineaNegocio, this.gridBagConstraintsLineaNegocio);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaNegocio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLineaNegocio.add(this.jPanelParametrosAuxiliar3LineaNegocio, this.gridBagConstraintsLineaNegocio);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaNegocio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLineaNegocio.add(this.jComboBoxTiposRelacionesLineaNegocio, this.gridBagConstraintsLineaNegocio);
				
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaNegocio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLineaNegocio.add(this.jComboBoxTiposAccionesLineaNegocio, this.gridBagConstraintsLineaNegocio);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosLineaNegocio = new GridBagLayout();

			this.jScrollPanelDatosLineaNegocio.setLayout(gridaBagLayoutDatosLineaNegocio);
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.gridy = 0;
			this.gridBagConstraintsLineaNegocio.gridx = 0;
			
			this.jScrollPanelDatosLineaNegocio.add(this.jTableDatosLineaNegocio, this.gridBagConstraintsLineaNegocio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosLineaNegocio.setViewportView(this.jTableDatosLineaNegocio);
		this.jTableDatosLineaNegocio.setFillsViewportHeight(true);
		this.jTableDatosLineaNegocio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesLineaNegocio= new GridBagLayout();
		this.jPanelAccionesLineaNegocio.setLayout(gridaBagLayoutAccionesLineaNegocio);
		
		
		/*	
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaNegocio.gridy = 0;
		this.gridBagConstraintsLineaNegocio.gridx = 0;
			
		this.jPanelAccionesLineaNegocio.add(this.jButtonNuevoLineaNegocio, this.gridBagConstraintsLineaNegocio);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoLineaNegocio= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoLineaNegocio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoLineaNegocio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoLineaNegocio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoLineaNegocio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoLineaNegocio.setLayout(gridaBagLayoutBusquedaPorCodigoLineaNegocio);

		gridBagConstraintsLineaNegocio = new GridBagConstraints();
		gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaNegocio.gridy = 0;
		gridBagConstraintsLineaNegocio.gridx = 0;
		jPanelBusquedaPorCodigoLineaNegocio.add(jLabelcodigoBusquedaPorCodigoLineaNegocio, gridBagConstraintsLineaNegocio);

		gridBagConstraintsLineaNegocio = new GridBagConstraints();
		gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaNegocio.gridy = 0;
		gridBagConstraintsLineaNegocio.gridx = 1;
		jPanelBusquedaPorCodigoLineaNegocio.add(jTextFieldcodigoBusquedaPorCodigoLineaNegocio, gridBagConstraintsLineaNegocio);

		gridBagConstraintsLineaNegocio = new GridBagConstraints();
		gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaNegocio.gridy = 1;
		gridBagConstraintsLineaNegocio.gridx =1;
		jPanelBusquedaPorCodigoLineaNegocio.add(jButtonBusquedaPorCodigoLineaNegocio, gridBagConstraintsLineaNegocio);

		jTabbedPaneBusquedasLineaNegocio.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoLineaNegocio);
		jTabbedPaneBusquedasLineaNegocio.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreLineaNegocio= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreLineaNegocio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreLineaNegocio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreLineaNegocio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreLineaNegocio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreLineaNegocio.setLayout(gridaBagLayoutBusquedaPorNombreLineaNegocio);

		gridBagConstraintsLineaNegocio = new GridBagConstraints();
		gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaNegocio.gridy = 0;
		gridBagConstraintsLineaNegocio.gridx = 0;
		jPanelBusquedaPorNombreLineaNegocio.add(jLabelnombreBusquedaPorNombreLineaNegocio, gridBagConstraintsLineaNegocio);

		gridBagConstraintsLineaNegocio = new GridBagConstraints();
		gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaNegocio.gridy = 0;
		gridBagConstraintsLineaNegocio.gridx = 1;
		jPanelBusquedaPorNombreLineaNegocio.add(jTextAreanombreBusquedaPorNombreLineaNegocio, gridBagConstraintsLineaNegocio);

		gridBagConstraintsLineaNegocio = new GridBagConstraints();
		gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaNegocio.gridy = 1;
		gridBagConstraintsLineaNegocio.gridx =1;
		jPanelBusquedaPorNombreLineaNegocio.add(jButtonBusquedaPorNombreLineaNegocio, gridBagConstraintsLineaNegocio);

		jTabbedPaneBusquedasLineaNegocio.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreLineaNegocio);
		jTabbedPaneBusquedasLineaNegocio.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLineaNegocio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLineaNegocio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.lineanegocioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();						
			this.gridBagConstraintsLineaNegocio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLineaNegocio.gridx = 0;		
			//this.gridBagConstraintsLineaNegocio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLineaNegocio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarLineaNegocio, this.gridBagConstraintsLineaNegocio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsLineaNegocio.gridx = 0;		
		//this.gridBagConstraintsLineaNegocio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsLineaNegocio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsLineaNegocio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsLineaNegocio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLineaNegocio.gridx = 0;		
			this.gridBagConstraintsLineaNegocio.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsLineaNegocio.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasLineaNegocio, this.gridBagConstraintsLineaNegocio);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaNegocio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesLineaNegocio, this.gridBagConstraintsLineaNegocio);								
		
		
		/*
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaNegocio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesLineaNegocio, this.gridBagConstraintsLineaNegocio);
		*/		
		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLineaNegocio.gridx =0;
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLineaNegocio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLineaNegocio, this.gridBagConstraintsLineaNegocio);
				
		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaNegocio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionLineaNegocio, this.gridBagConstraintsLineaNegocio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(LineaNegocioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosLineaNegocio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLineaNegocio = new GridBagLayout();
			this.jPanelBusquedasParametrosLineaNegocio.setLayout(gridaBagLayoutBusquedasParametrosLineaNegocio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralLineaNegocio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLineaNegocio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLineaNegocio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLineaNegocio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaNegocio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLineaNegocio, this.gridBagConstraintsLineaNegocio);
			
			
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaNegocio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLineaNegocio, this.gridBagConstraintsLineaNegocio);
		
			
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLineaNegocio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLineaNegocio, this.gridBagConstraintsLineaNegocio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralLineaNegocio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoLineaNegocio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoLineaNegocio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoLineaNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoLineaNegocio.setName("jPanelReporteDinamicoLineaNegocio"); 
		
		this.jPanelReporteDinamicoLineaNegocio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLineaNegocio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLineaNegocio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoLineaNegocio.setLayout(gridaBagLayoutReporteDinamicoLineaNegocio);
		
		
		this.jInternalFrameReporteDinamicoLineaNegocio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoLineaNegocio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLineaNegocio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoLineaNegocio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoLineaNegocio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoLineaNegocio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoLineaNegocio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoLineaNegocio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoLineaNegocio.setResizable(true);
	    this.jInternalFrameReporteDinamicoLineaNegocio.setClosable(true);
	    this.jInternalFrameReporteDinamicoLineaNegocio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoLineaNegocio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLineaNegocio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLineaNegocio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea_negocios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteLineaNegocio = new JLabelMe();

		this.jLabelColumnasSelectReporteLineaNegocio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLineaNegocio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLineaNegocio.add(this.jLabelColumnasSelectReporteLineaNegocio, this.gridBagConstraintsLineaNegocio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteLineaNegocio = new JList<Reporte>();
		this.jListColumnasSelectReporteLineaNegocio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteLineaNegocio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteLineaNegocio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLineaNegocio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLineaNegocio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteLineaNegocio=new JScrollPane(this.jListColumnasSelectReporteLineaNegocio);
			
			this.jScrollColumnasSelectReporteLineaNegocio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLineaNegocio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLineaNegocio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLineaNegocio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoLineaNegocio.add(this.jListColumnasSelectReporteLineaNegocio, this.gridBagConstraintsLineaNegocio);
		this.jPanelReporteDinamicoLineaNegocio.add(this.jScrollColumnasSelectReporteLineaNegocio, this.gridBagConstraintsLineaNegocio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteLineaNegocio = new JLabelMe();

		this.jLabelRelacionesSelectReporteLineaNegocio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLineaNegocio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLineaNegocio.add(this.jLabelRelacionesSelectReporteLineaNegocio, this.gridBagConstraintsLineaNegocio);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteLineaNegocio = new JList<Reporte>();
		this.jListRelacionesSelectReporteLineaNegocio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteLineaNegocio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteLineaNegocio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLineaNegocio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLineaNegocio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteLineaNegocio=new JScrollPane(this.jListRelacionesSelectReporteLineaNegocio);
			
			this.jScrollRelacionesSelectReporteLineaNegocio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLineaNegocio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLineaNegocio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLineaNegocio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoLineaNegocio.add(this.jListRelacionesSelectReporteLineaNegocio, this.gridBagConstraintsLineaNegocio);
		this.jPanelReporteDinamicoLineaNegocio.add(this.jScrollRelacionesSelectReporteLineaNegocio, this.gridBagConstraintsLineaNegocio);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoLineaNegocio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoLineaNegocio = new JComboBoxMe();
		this.jListColumnasValoresGraficoLineaNegocio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoLineaNegocio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoLineaNegocio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoLineaNegocio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLineaNegocio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLineaNegocio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoLineaNegocio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoLineaNegocio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoLineaNegocio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLineaNegocio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLineaNegocio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoLineaNegocio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoLineaNegocio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLineaNegocio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLineaNegocio.add(this.jLabelGenerarExcelReporteDinamicoLineaNegocio, this.gridBagConstraintsLineaNegocio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoLineaNegocio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoLineaNegocio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoLineaNegocio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoLineaNegocio.setToolTipText("Generar EXCEL"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		//this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsLineaNegocio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsLineaNegocio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoLineaNegocio.add(this.jButtonGenerarExcelReporteDinamicoLineaNegocio, this.gridBagConstraintsLineaNegocio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLineaNegocio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLineaNegocio.add(this.jComboBoxTiposReportesDinamicoLineaNegocio, this.gridBagConstraintsLineaNegocio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoLineaNegocio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoLineaNegocio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLineaNegocio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLineaNegocio.add(this.jLabelTiposArchivoReporteDinamicoLineaNegocio, this.gridBagConstraintsLineaNegocio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLineaNegocio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLineaNegocio.add(this.jComboBoxTiposArchivosReportesDinamicoLineaNegocio, this.gridBagConstraintsLineaNegocio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoLineaNegocio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoLineaNegocio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoLineaNegocio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoLineaNegocio.setToolTipText("Generar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLineaNegocio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLineaNegocio.add(this.jButtonGenerarReporteDinamicoLineaNegocio, this.gridBagConstraintsLineaNegocio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoLineaNegocio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoLineaNegocio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoLineaNegocio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoLineaNegocio.setToolTipText("Cancelar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLineaNegocio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLineaNegocio.add(this.jButtonCerrarReporteDinamicoLineaNegocio, this.gridBagConstraintsLineaNegocio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalLineaNegocio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoLineaNegocio= new JScrollPane(jPanelReporteDinamicoLineaNegocio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoLineaNegocio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLineaNegocio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLineaNegocio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea_negocios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsLineaNegocio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoLineaNegocio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoLineaNegocio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalLineaNegocio);
		this.jInternalFrameReporteDinamicoLineaNegocio.getContentPane().add(this.jScrollPanelReporteDinamicoLineaNegocio, this.gridBagConstraintsLineaNegocio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionLineaNegocio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionLineaNegocio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionLineaNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionLineaNegocio.setName("jPanelImportacionLineaNegocio"); 
		
		this.jPanelImportacionLineaNegocio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLineaNegocio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLineaNegocio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionLineaNegocio.setLayout(gridaBagLayoutImportacionLineaNegocio);
		
		
		this.jInternalFrameImportacionLineaNegocio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionLineaNegocio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionLineaNegocio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLineaNegocio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionLineaNegocio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLineaNegocio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLineaNegocio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionLineaNegocio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLineaNegocio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLineaNegocio.setResizable(true);
	    this.jInternalFrameImportacionLineaNegocio.setClosable(true);
	    this.jInternalFrameImportacionLineaNegocio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionLineaNegocio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLineaNegocio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLineaNegocio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionLineaNegocio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLineaNegocio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLineaNegocio.setResizable(true);
	    this.jInternalFrameImportacionLineaNegocio.setClosable(true);
	    this.jInternalFrameImportacionLineaNegocio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionLineaNegocio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLineaNegocio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLineaNegocio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea_negocios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionLineaNegocio = new JLabelMe();

		this.jLabelArchivoImportacionLineaNegocio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYImportacion;		
		this.gridBagConstraintsLineaNegocio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLineaNegocio.add(this.jLabelArchivoImportacionLineaNegocio, this.gridBagConstraintsLineaNegocio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionLineaNegocio = new JFileChooser();		
		this.jFileChooserImportacionLineaNegocio.setToolTipText("ESCOGER ARCHIVO"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionLineaNegocio = new JButtonMe();
		this.jButtonAbrirImportacionLineaNegocio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionLineaNegocio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionLineaNegocio.setToolTipText("Generar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYImportacion;
		this.gridBagConstraintsLineaNegocio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLineaNegocio.add(this.jButtonAbrirImportacionLineaNegocio, this.gridBagConstraintsLineaNegocio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionLineaNegocio = new JLabelMe();

		this.jLabelPathArchivoImportacionLineaNegocio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionLineaNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLineaNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLineaNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYImportacion;		
		this.gridBagConstraintsLineaNegocio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLineaNegocio.add(this.jLabelPathArchivoImportacionLineaNegocio, this.gridBagConstraintsLineaNegocio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionLineaNegocio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionLineaNegocio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLineaNegocio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLineaNegocio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYImportacion;
		this.gridBagConstraintsLineaNegocio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLineaNegocio.add(this.jTextFieldPathArchivoImportacionLineaNegocio, this.gridBagConstraintsLineaNegocio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionLineaNegocio = new JButtonMe();
		this.jButtonGenerarImportacionLineaNegocio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionLineaNegocio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionLineaNegocio.setToolTipText("Generar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYImportacion;
		this.gridBagConstraintsLineaNegocio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLineaNegocio.add(this.jButtonGenerarImportacionLineaNegocio, this.gridBagConstraintsLineaNegocio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionLineaNegocio = new JButtonMe();
		this.jButtonCerrarImportacionLineaNegocio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionLineaNegocio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionLineaNegocio.setToolTipText("Cancelar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaNegocio.gridy = iPosYImportacion;
		this.gridBagConstraintsLineaNegocio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLineaNegocio.add(this.jButtonCerrarImportacionLineaNegocio, this.gridBagConstraintsLineaNegocio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalLineaNegocio = new GridBagLayout();
		
		this.jScrollPanelImportacionLineaNegocio= new JScrollPane(jPanelImportacionLineaNegocio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
		this.gridBagConstraintsLineaNegocio.gridy =iPosYImportacion;
		this.gridBagConstraintsLineaNegocio.gridx =iPosXImportacion;
		this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionLineaNegocio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionLineaNegocio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalLineaNegocio);
		this.jInternalFrameImportacionLineaNegocio.getContentPane().add(this.jScrollPanelImportacionLineaNegocio, this.gridBagConstraintsLineaNegocio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByLineaNegocio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByLineaNegocio = new JButtonMe();
			this.jButtonAbrirOrderByLineaNegocio.setText("Orden");
			this.jButtonAbrirOrderByLineaNegocio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLineaNegocio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByLineaNegocio";
			inputMap = this.jButtonAbrirOrderByLineaNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByLineaNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByLineaNegocio"));
		
		
			GridBagLayout gridaBagLayoutOrderByLineaNegocio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByLineaNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByLineaNegocio.setName("jPanelOrderByLineaNegocio"); 
			
			this.jPanelOrderByLineaNegocio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLineaNegocio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLineaNegocio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByLineaNegocio.setLayout(gridaBagLayoutOrderByLineaNegocio);
			
			
			this.jTableDatosLineaNegocioOrderBy = new JTableMe();        
			this.jTableDatosLineaNegocioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosLineaNegocioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosLineaNegocioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosLineaNegocioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosLineaNegocioOrderBy.setViewportView(this.jTableDatosLineaNegocioOrderBy);
			this.jTableDatosLineaNegocioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosLineaNegocioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByLineaNegocio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByLineaNegocio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByLineaNegocio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteLineaNegocio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByLineaNegocio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByLineaNegocio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByLineaNegocio.setTitle("Orden");
			this.jInternalFrameOrderByLineaNegocio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByLineaNegocio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByLineaNegocio.setResizable(true);
			this.jInternalFrameOrderByLineaNegocio.setClosable(true);
			this.jInternalFrameOrderByLineaNegocio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByLineaNegocio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLineaNegocio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLineaNegocio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByLineaNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea_negocios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsLineaNegocio.gridx =iPosXOrderBy;
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsLineaNegocio.ipady =150;
				
			this.jPanelOrderByLineaNegocio.add(jScrollPanelDatosLineaNegocioOrderBy, this.gridBagConstraintsLineaNegocio);//this.jTableDatosLineaNegocioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByLineaNegocio = new JButtonMe();
			this.jButtonCerrarOrderByLineaNegocio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByLineaNegocio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByLineaNegocio.setToolTipText("Cancelar"+" "+LineaNegocioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByLineaNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaNegocio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsLineaNegocio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByLineaNegocio.add(this.jButtonCerrarOrderByLineaNegocio, this.gridBagConstraintsLineaNegocio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalLineaNegocio = new GridBagLayout();
			
			this.jScrollPanelOrderByLineaNegocio= new JScrollPane(jPanelOrderByLineaNegocio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsLineaNegocio = new GridBagConstraints();
			this.gridBagConstraintsLineaNegocio.gridy =iPosYOrderBy;
			this.gridBagConstraintsLineaNegocio.gridx =iPosXOrderBy;
			this.gridBagConstraintsLineaNegocio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByLineaNegocio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByLineaNegocio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalLineaNegocio);
			
			this.jInternalFrameOrderByLineaNegocio.getContentPane().add(this.jScrollPanelOrderByLineaNegocio, this.gridBagConstraintsLineaNegocio);			
		
		} else {
			this.jButtonAbrirOrderByLineaNegocio = new JButtonMe();
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
			&& this.lineanegocioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosLineaNegocio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosLineaNegocio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosLineaNegocio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosLineaNegocio.getRowHeight();//LineaNegocioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > LineaNegocioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLineaNegocio.isSelected()) {
					iHeightTable=LineaNegocioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LineaNegocioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LineaNegocioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > LineaNegocioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLineaNegocio.isSelected()) {
					iHeightTable=LineaNegocioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LineaNegocioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LineaNegocioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosLineaNegocio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLineaNegocio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLineaNegocio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosLineaNegocio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLineaNegocio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLineaNegocio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByLineaNegocio!=null && this.jInternalFrameOrderByLineaNegocio.getjTableDatosOrderBy()!=null) {
			//if(!this.lineanegocioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByLineaNegocio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByLineaNegocio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByLineaNegocio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByLineaNegocio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByLineaNegocio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByLineaNegocio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByLineaNegocio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosLineaNegocio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLineaNegocio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLineaNegocio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=lineanegocioLogic.getLineaNegocios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=lineanegocios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<LineaNegocio> TraerLineaNegocioBeans(List<LineaNegocio> lineanegocios,ArrayList<Classe> classes)throws Exception {
		try {
			for(LineaNegocio lineanegocio:lineanegocios) {
					
				if(!(LineaNegocioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || LineaNegocioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					lineanegocio.setsDetalleGeneralEntityReporte(LineaNegocioConstantesFunciones.getLineaNegocioDescripcion(lineanegocio));
										
						
					
					

					if(lineanegocio.getPoliticasClientes()!=null && Funciones.existeClass(classes,PoliticasCliente.class)) {
						try{lineanegocio.setpoliticasclientesDescripcionReporte(new JRBeanCollectionDataSource(PoliticasClienteJInternalFrame.TraerPoliticasClienteBeans(lineanegocio.getPoliticasClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//lineanegocio.setsDetalleGeneralEntityReporte(lineanegocio.getsDetalleGeneralEntityReporte());
										
				}
				
				//lineanegociobeans.add(lineanegociobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return lineanegocios;
    }
	//PARA REPORTES FIN
}
