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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.nomina.util.HobbyConstantesFunciones;

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
public class HobbyJInternalFrame extends HobbyBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarHobby;
	
	protected JMenuBar jmenuBarHobby;
	
	protected JMenu jmenuHobby;
	protected JMenu jmenuDatosHobby;
	protected JMenu jmenuArchivoHobby;
	protected JMenu jmenuAccionesHobby;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHobby;	
	protected GridBagConstraints gridBagConstraintsHobby;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public HobbyDetalleFormJInternalFrame jInternalFrameDetalleFormHobby;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoHobby;	
	protected ImportacionJInternalFrame jInternalFrameImportacionHobby;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public HobbySessionBean hobbySessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Hobby> hobbys;		
	public List<Hobby> hobbysEliminados;	
	public List<Hobby> hobbysAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByHobby;		
	protected JButton jButtonAbrirOrderByHobby;
	
	
	//protected JPanel jPanelOrderByHobby;
	//public JScrollPane jScrollPanelOrderByHobby;	
	//protected JButton jButtonCerrarOrderByHobby;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public HobbyLogic hobbyLogic;
	
	
	
	public JScrollPane jScrollPanelDatosHobby;
	public JScrollPane jScrollPanelDatosEdicionHobby;
	public JScrollPane jScrollPanelDatosGeneralHobby;
    
	
	
	//public JScrollPane jScrollPanelDatosHobbyOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoHobby;
	//public JScrollPane jScrollPanelImportacionHobby;
	
	
	
	protected JPanel jPanelAccionesHobby;
	
    protected JPanel jPanelPaginacionHobby;
    protected JPanel jPanelParametrosReportesHobby;
	protected JPanel jPanelParametrosReportesAccionesHobby;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Hobby;
	protected JPanel jPanelParametrosAuxiliar2Hobby;
	protected JPanel jPanelParametrosAuxiliar3Hobby;
	protected JPanel jPanelParametrosAuxiliar4Hobby;
	//protected JPanel jPanelParametrosAuxiliar5Hobby;
	
	
	
	//protected JPanel jPanelReporteDinamicoHobby;
	//protected JPanel jPanelImportacionHobby;
	
	
	public JTable jTableDatosHobby;
	
	
	
	//public JTable jTableDatosHobbyOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoHobby;
	protected JButton jButtonDuplicarHobby;
	protected JButton jButtonCopiarHobby;
	protected JButton jButtonVerFormHobby;
	protected JButton jButtonNuevoRelacionesHobby;
	protected JButton jButtonModificarHobby;
	
    protected JButton jButtonGuardarCambiosTablaHobby;
	protected JButton jButtonCerrarHobby;
	
	
	protected JButton jButtonRecargarInformacionHobby;
	protected JButton jButtonProcesarInformacionHobby;
	
	
	protected JButton jButtonAnterioresHobby;
	protected JButton jButtonSiguientesHobby;
	protected JButton jButtonNuevoGuardarCambiosHobby;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoHobby;
	//protected JButton jButtonCerrarReporteDinamicoHobby;
	//protected JButton jButtonGenerarExcelReporteDinamicoHobby;	
	
	
	
	//protected JButton jButtonAbrirImportacionHobby;
	//protected JButton jButtonGenerarImportacionHobby;
	//protected JButton jButtonCerrarImportacionHobby;
	//protected JFileChooser jFileChooserImportacionHobby;
	//protected File fileImportacionHobby;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHobby;
	protected JButton jButtonDuplicarToolBarHobby;
	protected JButton jButtonNuevoRelacionesToolBarHobby;
	
	
	public JButton jButtonGuardarCambiosToolBarHobby;
	protected JButton jButtonCopiarToolBarHobby;
	protected JButton jButtonVerFormToolBarHobby;
	public JButton jButtonGuardarCambiosTablaToolBarHobby;
	protected JButton jButtonMostrarOcultarTablaToolBarHobby;
	protected JButton jButtonCerrarToolBarHobby;
	
	protected JButton jButtonRecargarInformacionToolBarHobby;
	protected JButton jButtonProcesarInformacionToolBarHobby;
	protected JButton jButtonAnterioresToolBarHobby;
	protected JButton jButtonSiguientesToolBarHobby;
	protected JButton jButtonNuevoGuardarCambiosToolBarHobby;
	protected JButton jButtonAbrirOrderByToolBarHobby;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHobby;
	protected JMenuItem jMenuItemDuplicarHobby;
	protected JMenuItem jMenuItemNuevoRelacionesHobby;
	
	
	protected JMenuItem jMenuItemGuardarCambiosHobby;
	protected JMenuItem jMenuItemCopiarHobby;
	protected JMenuItem jMenuItemVerFormHobby;
	protected JMenuItem jMenuItemGuardarCambiosTablaHobby;
	protected JMenuItem jMenuItemCerrarHobby;
	protected JMenuItem jMenuItemDetalleCerrarHobby;
	protected JMenuItem jMenuItemDetalleAbrirOrderByHobby;
	protected JMenuItem jMenuItemDetalleMostarOcultarHobby;
	
	protected JMenuItem jMenuItemRecargarInformacionHobby;
	protected JMenuItem jMenuItemProcesarInformacionHobby;
	protected JMenuItem jMenuItemAnterioresHobby;
	protected JMenuItem jMenuItemSiguientesHobby;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHobby;
	protected JMenuItem jMenuItemAbrirOrderByHobby;
	protected JMenuItem jMenuItemMostrarOcultarHobby;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHobby;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosHobby;
	protected JCheckBox jCheckBoxSeleccionadosHobby;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaHobby;
	protected JCheckBox jCheckBoxConGraficoReporteHobby;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesHobby;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesHobby;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoHobby;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoHobby;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesHobby;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionHobby;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHobby;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHobby;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarHobby;
	protected JTextField jTextFieldValorCampoGeneralHobby;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteHobby;
	//public JList<Reporte> jListColumnasSelectReporteHobby;
	//public JScrollPane jScrollColumnasSelectReporteHobby;
	
	//public JLabel jLabelRelacionesSelectReporteHobby;
	//public JList<Reporte> jListRelacionesSelectReporteHobby;
	//public JScrollPane jScrollRelacionesSelectReporteHobby;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoHobby;
	//protected JCheckBox jCheckBoxConGraficoDinamicoHobby;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoHobby;
	//public JLabel jLabelTiposArchivoReporteDinamicoHobby;
	
		
	//public JLabel jLabelArchivoImportacionHobby;	
	//public JLabel jLabelPathArchivoImportacionHobby;
	//protected JTextField jTextFieldPathArchivoImportacionHobby;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoHobby;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoHobby;
	
	//public JLabel jLabelColumnaCategoriaValorHobby;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorHobby;
	
	//public JLabel jLabelColumnasValoresGraficoHobby;
	//public JList<Reporte> jListColumnasValoresGraficoHobby;
	//public JScrollPane jScrollColumnasValoresGraficoHobby;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoHobby;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoHobby;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasHobby;
	public JPanel jPanelBusquedaPorCodigoHobby;
	public JButton jButtonBusquedaPorCodigoHobby;
	public JPanel jPanelBusquedaPorNombreHobby;
	public JButton jButtonBusquedaPorNombreHobby;
	
	public JPanel jPanelcodigoBusquedaPorCodigoHobby;
	public JLabel jLabelcodigoBusquedaPorCodigoHobby;
	public JTextField jTextFieldcodigoBusquedaPorCodigoHobby;
	public JButton jButtoncodigoBusquedaPorCodigoHobbyBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreHobby;
	public JLabel jLabelnombreBusquedaPorNombreHobby;
	public JTextArea jTextAreanombreBusquedaPorNombreHobby;
	public JButton jButtonnombreBusquedaPorNombreHobbyBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public HobbyJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Hobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HobbyJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Hobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HobbyJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Hobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HobbyJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Hobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionHobby)	{
		this.jButtonRecargarInformacionHobby = jButtonRecargarInformacionHobby;
	}
	
	public JButton getjButtonProcesarInformacionHobby() {
		return this.jButtonProcesarInformacionHobby;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHobby)	{
		this.jButtonProcesarInformacionHobby = jButtonProcesarInformacionHobby;
	}
	
	
	public JButton getjButtonRecargarInformacionHobby() {
		return this.jButtonRecargarInformacionHobby;
	}
	
	
	public List<Hobby> gethobbys() {
		return this.hobbys;
	}

	public void sethobbys(List<Hobby> hobbys) {
		this.hobbys = hobbys;
	}
	
	public List<Hobby> gethobbysAux() {
		return this.hobbysAux;
	}

	public void sethobbysAux(List<Hobby> hobbysAux) {
		this.hobbysAux = hobbysAux;
	}
	
	public List<Hobby> gethobbysEliminados() {
		return this.hobbysEliminados;
	}

	public void setHobbysEliminados(List<Hobby> hobbysEliminados) {
		this.hobbysEliminados = hobbysEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarHobby() {
		return jComboBoxTiposSeleccionarHobby;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarHobby(
			JComboBox jComboBoxTiposSeleccionarHobby) {
		this.jComboBoxTiposSeleccionarHobby = jComboBoxTiposSeleccionarHobby;
	}
	
	public void setBorderResaltarTiposSeleccionarHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarHobby.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarHobby .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralHobby() {
		return jTextFieldValorCampoGeneralHobby;
	}

	public void setjTextFieldValorCampoGeneralHobby(
			JTextField jTextFieldValorCampoGeneralHobby) {
		this.jTextFieldValorCampoGeneralHobby = jTextFieldValorCampoGeneralHobby;
	}

	public void setBorderResaltarValorCampoGeneralHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobby.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralHobby .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosHobby() {
		return this.jCheckBoxSeleccionarTodosHobby;
	}

	public void setjCheckBoxSeleccionarTodosHobby(
			JCheckBox jCheckBoxSeleccionarTodosHobby) {
		this.jCheckBoxSeleccionarTodosHobby = jCheckBoxSeleccionarTodosHobby;
	}

	public void setBorderResaltarSeleccionarTodosHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobby.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosHobby .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosHobby() {
		return this.jCheckBoxSeleccionadosHobby;
	}

	public void setjCheckBoxSeleccionadosHobby(
			JCheckBox jCheckBoxSeleccionadosHobby) {
		this.jCheckBoxSeleccionadosHobby = jCheckBoxSeleccionadosHobby;
	}
	
	public void setBorderResaltarSeleccionadosHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobby.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosHobby .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesHobby() {
		return this.jComboBoxTiposArchivosReportesHobby;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesHobby(
			JComboBox jComboBoxTiposArchivosReportesHobby) {
		this.jComboBoxTiposArchivosReportesHobby = jComboBoxTiposArchivosReportesHobby;
	}

	public void setBorderResaltarTiposArchivosReportesHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobby.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesHobby .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesHobby() {
		return this.jComboBoxTiposReportesHobby;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesHobby(
			JComboBox jComboBoxTiposReportesHobby) {
		this.jComboBoxTiposReportesHobby = jComboBoxTiposReportesHobby;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoHobby() {
	//	return jComboBoxTiposReportesDinamicoHobby;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoHobby(
	//		JComboBox jComboBoxTiposReportesDinamicoHobby) {
	//	this.jComboBoxTiposReportesDinamicoHobby = jComboBoxTiposReportesDinamicoHobby;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoHobby() {
	//	return jComboBoxTiposArchivosReportesDinamicoHobby;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoHobby(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoHobby) {
	//	this.jComboBoxTiposArchivosReportesDinamicoHobby = jComboBoxTiposArchivosReportesDinamicoHobby;
	//}
	
	public void setBorderResaltarTiposReportesHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobby.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesHobby .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesHobby() {
		return this.jComboBoxTiposGraficosReportesHobby;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesHobby(
			JComboBox jComboBoxTiposGraficosReportesHobby) {
		this.jComboBoxTiposGraficosReportesHobby = jComboBoxTiposGraficosReportesHobby;
	}
	
	public void setBorderResaltarTiposGraficosReportesHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobby.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesHobby .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionHobby() {
		return this.jComboBoxTiposPaginacionHobby;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionHobby(
			JComboBox jComboBoxTiposPaginacionHobby) {
		this.jComboBoxTiposPaginacionHobby = jComboBoxTiposPaginacionHobby;
	}
	
	public void setBorderResaltarTiposPaginacionHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobby.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionHobby .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesHobby() {
		return this.jComboBoxTiposRelacionesHobby;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHobby() {
		return this.jComboBoxTiposAccionesHobby;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHobby(
			JComboBox jComboBoxTiposRelacionesHobby) {
		this.jComboBoxTiposRelacionesHobby = jComboBoxTiposRelacionesHobby;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHobby(
			JComboBox jComboBoxTiposAccionesHobby) {
		this.jComboBoxTiposAccionesHobby = jComboBoxTiposAccionesHobby;
	}
	
	public void setBorderResaltarTiposRelacionesHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobby.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesHobby .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesHobby() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobby.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesHobby .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoHobby() {
	//	return jCheckBoxConGraficoDinamicoHobby;
	//}

	//public void setjCheckBoxConGraficoDinamicoHobby(
	//		JCheckBox jCheckBoxConGraficoDinamicoHobby) {
	//	this.jCheckBoxConGraficoDinamicoHobby = jCheckBoxConGraficoDinamicoHobby;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoHobby() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarHobby.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoHobby .setBorder(borderResaltar);		
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
		this.hobbySessionBean=new HobbySessionBean();
		
		this.hobbySessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.hobbySessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.hobbySessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=HobbyJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=HobbyJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HobbyJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HobbyJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HobbyJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Hobby MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
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
		
		HobbyJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Hobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarHobby= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarHobby,this.jTtoolBarHobby,
							"nuevo","nuevo","Nuevo"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarHobby,this.jTtoolBarHobby,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarHobby,this.jTtoolBarHobby,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarHobby,this.jTtoolBarHobby,
							"duplicar","duplicar","Duplicar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarHobby,this.jTtoolBarHobby,
							"copiar","copiar","Copiar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarHobby,this.jTtoolBarHobby,
							"ver_form","ver_form","Ver"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHobby,this.jTtoolBarHobby,
							"recargar","recargar","Recargar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHobby,this.jTtoolBarHobby,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHobby,this.jTtoolBarHobby,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarHobby,this.jTtoolBarHobby,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarHobby,this.jTtoolBarHobby,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarHobby,this.jTtoolBarHobby,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarHobby,this.jTtoolBarHobby,
							"cerrar","cerrar","Salir"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarHobby=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarHobby;
			
				this.jButtonProcesarInformacionToolBarHobby=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarHobby;
				
		//protected JButton jButtonModificarToolBarHobby;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarHobby=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuHobby=new JMenuMe("General");
		this.jmenuArchivoHobby=new JMenuMe("Archivo");
		this.jmenuAccionesHobby=new JMenuMe("Acciones");
		this.jmenuDatosHobby=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHobby= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHobby.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHobby,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarHobby= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarHobby.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarHobby,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesHobby= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesHobby.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesHobby,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosHobby= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHobby.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHobby,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarHobby= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarHobby.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarHobby,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormHobby= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormHobby.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormHobby,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaHobby= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaHobby.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaHobby,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHobby= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHobby.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHobby,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionHobby= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionHobby.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionHobby,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionHobby= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionHobby.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionHobby,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresHobby= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresHobby.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresHobby,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesHobby= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesHobby.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesHobby,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByHobby= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByHobby.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByHobby,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHobby= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHobby.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHobby,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByHobby= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByHobby.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByHobby,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHobby= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHobby.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHobby,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosHobby= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosHobby.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosHobby,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoHobby.add(this.jMenuItemCerrarHobby);
			
			this.jmenuAccionesHobby.add(this.jMenuItemNuevoHobby);
			this.jmenuAccionesHobby.add(this.jMenuItemNuevoGuardarCambiosHobby);
			this.jmenuAccionesHobby.add(this.jMenuItemNuevoRelacionesHobby);
			this.jmenuAccionesHobby.add(this.jMenuItemGuardarCambiosTablaHobby);		
			this.jmenuAccionesHobby.add(this.jMenuItemDuplicarHobby);		
			this.jmenuAccionesHobby.add(this.jMenuItemCopiarHobby);		
			this.jmenuAccionesHobby.add(this.jMenuItemVerFormHobby);		
			
			this.jmenuDatosHobby.add(this.jMenuItemRecargarInformacionHobby);				
			this.jmenuDatosHobby.add(this.jMenuItemAnterioresHobby);				
			this.jmenuDatosHobby.add(this.jMenuItemSiguientesHobby);				
			this.jmenuDatosHobby.add(this.jMenuItemAbrirOrderByHobby);				
			this.jmenuDatosHobby.add(this.jMenuItemMostrarOcultarHobby);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesHobby.add(this.jMenuItemGuardarCambiosHobby);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesHobby, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosHobby, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarHobby.add(this.jmenuArchivoHobby);		
			this.jmenuBarHobby.add(this.jmenuAccionesHobby);		
			this.jmenuBarHobby.add(this.jmenuDatosHobby);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarHobby);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasHobby() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoHobby=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoHobby.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoHobby= new JButtonMe();
		this.jButtonBusquedaPorCodigoHobby.setText("Buscar");
		this.jButtonBusquedaPorCodigoHobby.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoHobby,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoHobby = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoHobby.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoHobby.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoHobby,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoHobby= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoHobby,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreHobby=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreHobby.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreHobby= new JButtonMe();
		this.jButtonBusquedaPorNombreHobby.setText("Buscar");
		this.jButtonBusquedaPorNombreHobby.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreHobby,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreHobby = new JLabelMe();
		jLabelnombreBusquedaPorNombreHobby.setText("Nombre :");
		jLabelnombreBusquedaPorNombreHobby.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreHobby,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreHobby= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreHobby,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasHobby=new JTabbedPane();


		this.jTabbedPaneBusquedasHobby.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHobby.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHobby.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasHobby.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasHobby,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleHobby = new HobbyDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Hobby DATOS");
			this.jInternalFrameDetalleFormHobby = new HobbyDetalleFormJInternalFrame(jDesktopPane,this.hobbySessionBean.getConGuardarRelaciones(),this.hobbySessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormHobby = null;//new HobbyDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHobby= new GridBagLayout();
		
		
		this.jTableDatosHobby = new JTableMe();      
		
		String sToolTipHobby="";
		sToolTipHobby=HobbyConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHobby+="(Nomina.Hobby)";
		}
		
		if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
			sToolTipHobby+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosHobby.setToolTipText(sToolTipHobby);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosHobby);
		this.jTableDatosHobby.setAutoCreateRowSorter(true);
		this.jTableDatosHobby.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosHobby.setRowSelectionAllowed(true);
		this.jTableDatosHobby.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosHobby,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoHobby = new JButtonMe();
		this.jButtonDuplicarHobby = new JButtonMe();
		this.jButtonCopiarHobby = new JButtonMe();
		this.jButtonVerFormHobby = new JButtonMe();
		this.jButtonNuevoRelacionesHobby = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaHobby = new JButtonMe();
		this.jButtonCerrarHobby = new JButtonMe();
		
		this.jScrollPanelDatosHobby = new JScrollPane();   
        this.jScrollPanelDatosGeneralHobby = new JScrollPane();
		
				
		
		
		this.jPanelAccionesHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Hobby";
		
		if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Hobbyes" + this.sPath));
		} else {
			this.jScrollPanelDatosHobby.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHobby.setToolTipText("Acciones");
        this.jPanelAccionesHobby.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHobby, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHobby, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoHobby=new ReporteDinamicoJInternalFrame(HobbyConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoHobby();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionHobby=new ImportacionJInternalFrame(HobbyConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionHobby();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByHobby = new JButtonMe();
		
		this.jButtonAbrirOrderByHobby.setText("Orden");
		this.jButtonAbrirOrderByHobby.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHobby,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHobby=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHobby,false,this);
			
			//this.cargarOrderByHobby(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHobby=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHobby,true,this);
			
			//this.cargarOrderByHobby(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosHobby.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosHobby.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosHobby.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosHobby.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosHobby.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosHobby.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoHobby.setText("Nuevo");
		this.jButtonDuplicarHobby.setText("Duplicar");
		this.jButtonCopiarHobby.setText("Copiar");
		this.jButtonVerFormHobby.setText("Ver");
		this.jButtonNuevoRelacionesHobby.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaHobby.setText("Guardar");
		this.jButtonCerrarHobby.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHobby,"nuevo_button","Nuevo",this.hobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarHobby,"duplicar_button","Duplicar",this.hobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarHobby,"copiar_button","Copiar",this.hobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormHobby,"ver_form","Ver",this.hobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesHobby,"nuevorelaciones_button","Nuevo Rel",this.hobbySessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHobby,"guardarcambiostabla_button","Guardar",this.hobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHobby,"cerrar_button","Salir",this.hobbySessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesHobby, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoHobby.setToolTipText("Nuevo"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarHobby.setToolTipText("Duplicar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarHobby.setToolTipText("Copiar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormHobby.setToolTipText("Ver"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesHobby.setToolTipText("Nuevo Rel"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaHobby.setToolTipText("Guardar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHobby.setToolTipText("Salir"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHobby";
		inputMap = this.jButtonNuevoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHobby.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHobby"));
		
		//DUPLICAR
		sMapKey = "DuplicarHobby";
		inputMap = this.jButtonDuplicarHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarHobby.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarHobby"));
		
		//COPIAR
		sMapKey = "CopiarHobby";
		inputMap = this.jButtonCopiarHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarHobby.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarHobby"));
		
		//VEr FORM
		sMapKey = "VerFormHobby";
		inputMap = this.jButtonVerFormHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormHobby.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormHobby"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesHobby";
		inputMap = this.jButtonNuevoRelacionesHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesHobby"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarHobby";
		inputMap = this.jButtonModificarHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarHobby"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarHobby";
		inputMap = this.jButtonCerrarHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHobby"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHobby";
		inputMap = this.jButtonGuardarCambiosTablaHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHobby"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Hobby= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Hobby= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Hobby= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Hobby= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Hobby= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesHobby.setName("jPanelParametrosReportesHobby"); 
		
		this.jPanelParametrosReportesAccionesHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesHobby.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesHobby.setName("jPanelParametrosReportesAccionesHobby"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesHobby, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesHobby, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionHobby = new JButtonMe();
		this.jButtonRecargarInformacionHobby.setText("Recargar");
		this.jButtonRecargarInformacionHobby.setToolTipText("Recargar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionHobby,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionHobby = new JButtonMe();
		this.jButtonProcesarInformacionHobby.setText("Procesar");
		this.jButtonProcesarInformacionHobby.setToolTipText("Procesar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionHobby.setVisible(false);
			
		this.jButtonProcesarInformacionHobby.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHobby.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHobby.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesHobby = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHobby.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesHobby.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesHobby = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHobby.setText("TIPO");       
		this.jComboBoxTiposReportesHobby.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesHobby = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHobby.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesHobby.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionHobby = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionHobby.setText("Paginacion");
		this.jComboBoxTiposPaginacionHobby.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesHobby = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesHobby.setText("Accion");
		this.jComboBoxTiposRelacionesHobby.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesHobby = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHobby.setText("Accion");
		this.jComboBoxTiposAccionesHobby.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarHobby = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarHobby.setText("Accion");
		this.jComboBoxTiposSeleccionarHobby.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralHobby=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralHobby.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHobby.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHobby.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesHobby = new JLabelMe();
		
		this.jLabelAccionesHobby.setText("Acciones");		
		this.jLabelAccionesHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosHobby = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosHobby.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosHobby.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosHobby = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosHobby.setText("Seleccionados");
		this.jCheckBoxSeleccionadosHobby.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaHobby = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaHobby.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaHobby.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteHobby = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteHobby.setText("Graf.");
		this.jCheckBoxConGraficoReporteHobby.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresHobby = new JButtonMe();
		//this.jButtonAnterioresHobby.setText("<<");
        this.jButtonAnterioresHobby.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresHobby,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesHobby = new JButtonMe();
		//this.jButtonSiguientesHobby.setText(">>");
        this.jButtonSiguientesHobby.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesHobby,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosHobby = new JButtonMe();
		this.jButtonNuevoGuardarCambiosHobby.setText("Nue");
        this.jButtonNuevoGuardarCambiosHobby.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosHobby,"nuevoguardarcambios_button","Nue",this.hobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosHobby";
		inputMap = this.jButtonNuevoGuardarCambiosHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosHobby"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionHobby";
		inputMap = this.jButtonRecargarInformacionHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionHobby"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesHobby";
		inputMap = this.jButtonSiguientesHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesHobby"));
		
		//ANTERIORES		
		sMapKey = "AnterioresHobby";
		inputMap = this.jButtonAnterioresHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresHobby"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasHobby();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesHobby.setMinimumSize(new Dimension(this.getWidth(),HobbyBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HobbyBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHobby.setMaximumSize(new Dimension(this.getWidth(),HobbyBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HobbyBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHobby.setPreferredSize(new Dimension(this.getWidth(),HobbyBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HobbyBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionHobby = new GridBagLayout();

			this.jPanelPaginacionHobby.setLayout(gridaBagLayoutPaginacionHobby);						
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.gridy = 0;
			this.gridBagConstraintsHobby.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionHobby.add(this.jButtonAnterioresHobby, this.gridBagConstraintsHobby);
					
						
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHobby.gridy = 0;
			
			this.jPanelPaginacionHobby.add(this.jButtonNuevoGuardarCambiosHobby, this.gridBagConstraintsHobby);
						
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsHobby.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHobby.gridy = 0;
			this.jPanelPaginacionHobby.add(this.jButtonSiguientesHobby, this.gridBagConstraintsHobby);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.gridy = 1;
			this.gridBagConstraintsHobby.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHobby.add(this.jButtonNuevoHobby, this.gridBagConstraintsHobby);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsHobby = new GridBagConstraints();
				this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsHobby.gridy = 1;
				this.gridBagConstraintsHobby.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionHobby.add(this.jButtonNuevoRelacionesHobby, this.gridBagConstraintsHobby);
			}
			
			
			if(!this.hobbySessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsHobby = new GridBagConstraints();
				this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsHobby.gridy = 1;
				this.gridBagConstraintsHobby.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionHobby.add(this.jButtonGuardarCambiosTablaHobby, this.gridBagConstraintsHobby);
			}
			
			
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.gridy = 1;
			this.gridBagConstraintsHobby.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHobby.add(this.jButtonDuplicarHobby, this.gridBagConstraintsHobby);
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.gridy = 1;
			this.gridBagConstraintsHobby.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHobby.add(this.jButtonCopiarHobby, this.gridBagConstraintsHobby);
		
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.gridy = 1;
			this.gridBagConstraintsHobby.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHobby.add(this.jButtonVerFormHobby, this.gridBagConstraintsHobby);
		
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.gridy = 1;
			this.gridBagConstraintsHobby.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionHobby.add(this.jButtonCerrarHobby, this.gridBagConstraintsHobby);
		
		
		
		this.jButtonRecargarInformacionHobby.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHobby.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHobby.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionHobby, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesHobby.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHobby.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHobby.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesHobby.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHobby.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHobby.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesHobby.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHobby.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHobby.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionHobby.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHobby.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHobby.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesHobby.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHobby.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHobby.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesHobby.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHobby.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHobby.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarHobby.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHobby.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHobby.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaHobby.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHobby.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHobby.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteHobby.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHobby.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHobby.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteHobby, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosHobby.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHobby.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHobby.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosHobby.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHobby.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHobby.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesHobby = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesHobby = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Hobby = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Hobby = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Hobby = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Hobby = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesHobby.setLayout(gridaBagParametrosReportesHobby);
			this.jPanelParametrosReportesAccionesHobby.setLayout(gridaBagParametrosReportesAccionesHobby);
			
			
			this.jPanelParametrosAuxiliar1Hobby.setLayout(gridaBagParametrosAuxiliar1Hobby);
			this.jPanelParametrosAuxiliar2Hobby.setLayout(gridaBagParametrosAuxiliar2Hobby);
			this.jPanelParametrosAuxiliar3Hobby.setLayout(gridaBagParametrosAuxiliar3Hobby);
			this.jPanelParametrosAuxiliar4Hobby.setLayout(gridaBagParametrosAuxiliar4Hobby);
			//this.jPanelParametrosAuxiliar5Hobby.setLayout(gridaBagParametrosAuxiliar2Hobby);			
			
			
			
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHobby.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHobby.add(this.jButtonRecargarInformacionHobby, this.gridBagConstraintsHobby);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobby.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHobby.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Hobby.add(this.jComboBoxTiposPaginacionHobby, this.gridBagConstraintsHobby);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobby.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHobby.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Hobby.add(this.jCheckBoxConAltoMaximoTablaHobby, this.gridBagConstraintsHobby);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobby.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHobby.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Hobby.add(this.jComboBoxTiposArchivosReportesHobby, this.gridBagConstraintsHobby);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobby.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHobby.add(this.jPanelParametrosAuxiliar1Hobby, this.gridBagConstraintsHobby);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHobby.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Hobby.add(this.jComboBoxTiposReportesHobby, this.gridBagConstraintsHobby);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobby.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHobby.add(this.jPanelParametrosAuxiliar4Hobby, this.gridBagConstraintsHobby);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobby.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsHobby.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHobby.add(this.jComboBoxTiposReportesHobby, this.gridBagConstraintsHobby);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobby.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHobby.add(this.jCheckBoxGenerarReporteHobby, this.gridBagConstraintsHobby);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobby.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHobby.add(this.jPanelParametrosAuxiliar2Hobby, this.gridBagConstraintsHobby);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHobby.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHobby.add(this.jLabelAccionesHobby, this.gridBagConstraintsHobby);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsHobby = new GridBagConstraints();
				this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsHobby.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsHobby.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesHobby.add(this.jButtonAbrirOrderByHobby, this.gridBagConstraintsHobby);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobby.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHobby.add(this.jComboBoxTiposSeleccionarHobby, this.gridBagConstraintsHobby);			
			
			
			/*
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHobby.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHobby.add(this.jCheckBoxSeleccionarTodosHobby, this.gridBagConstraintsHobby);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHobby.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Hobby.add(this.jCheckBoxSeleccionarTodosHobby, this.gridBagConstraintsHobby);															
				
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHobby.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Hobby.add(this.jCheckBoxSeleccionadosHobby, this.gridBagConstraintsHobby);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobby.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHobby.add(this.jPanelParametrosAuxiliar3Hobby, this.gridBagConstraintsHobby);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobby.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHobby.add(this.jComboBoxTiposRelacionesHobby, this.gridBagConstraintsHobby);
				
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobby.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHobby.add(this.jComboBoxTiposAccionesHobby, this.gridBagConstraintsHobby);
	
				
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobby.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHobby.add(this.jTextFieldValorCampoGeneralHobby, this.gridBagConstraintsHobby);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosHobby = new GridBagLayout();

			this.jScrollPanelDatosHobby.setLayout(gridaBagLayoutDatosHobby);
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.gridy = 0;
			this.gridBagConstraintsHobby.gridx = 0;
			
			this.jScrollPanelDatosHobby.add(this.jTableDatosHobby, this.gridBagConstraintsHobby);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosHobby.setViewportView(this.jTableDatosHobby);
		this.jTableDatosHobby.setFillsViewportHeight(true);
		this.jTableDatosHobby.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesHobby= new GridBagLayout();
		this.jPanelAccionesHobby.setLayout(gridaBagLayoutAccionesHobby);
		
		
		/*	
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobby.gridy = 0;
		this.gridBagConstraintsHobby.gridx = 0;
			
		this.jPanelAccionesHobby.add(this.jButtonNuevoHobby, this.gridBagConstraintsHobby);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoHobby= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoHobby.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoHobby.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoHobby.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoHobby.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoHobby.setLayout(gridaBagLayoutBusquedaPorCodigoHobby);

		gridBagConstraintsHobby = new GridBagConstraints();
		gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHobby.gridy = 0;
		gridBagConstraintsHobby.gridx = 0;
		jPanelBusquedaPorCodigoHobby.add(jLabelcodigoBusquedaPorCodigoHobby, gridBagConstraintsHobby);

		gridBagConstraintsHobby = new GridBagConstraints();
		gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHobby.gridy = 0;
		gridBagConstraintsHobby.gridx = 1;
		jPanelBusquedaPorCodigoHobby.add(jTextFieldcodigoBusquedaPorCodigoHobby, gridBagConstraintsHobby);

		gridBagConstraintsHobby = new GridBagConstraints();
		gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHobby.gridy = 1;
		gridBagConstraintsHobby.gridx =1;
		jPanelBusquedaPorCodigoHobby.add(jButtonBusquedaPorCodigoHobby, gridBagConstraintsHobby);

		jTabbedPaneBusquedasHobby.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoHobby);
		jTabbedPaneBusquedasHobby.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreHobby= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreHobby.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreHobby.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreHobby.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreHobby.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreHobby.setLayout(gridaBagLayoutBusquedaPorNombreHobby);

		gridBagConstraintsHobby = new GridBagConstraints();
		gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHobby.gridy = 0;
		gridBagConstraintsHobby.gridx = 0;
		jPanelBusquedaPorNombreHobby.add(jLabelnombreBusquedaPorNombreHobby, gridBagConstraintsHobby);

		gridBagConstraintsHobby = new GridBagConstraints();
		gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHobby.gridy = 0;
		gridBagConstraintsHobby.gridx = 1;
		jPanelBusquedaPorNombreHobby.add(jTextAreanombreBusquedaPorNombreHobby, gridBagConstraintsHobby);

		gridBagConstraintsHobby = new GridBagConstraints();
		gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHobby.gridy = 1;
		gridBagConstraintsHobby.gridx =1;
		jPanelBusquedaPorNombreHobby.add(jButtonBusquedaPorNombreHobby, gridBagConstraintsHobby);

		jTabbedPaneBusquedasHobby.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreHobby);
		jTabbedPaneBusquedasHobby.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHobby = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHobby);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.hobbySessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHobby = new GridBagConstraints();						
			this.gridBagConstraintsHobby.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHobby.gridx = 0;		
			//this.gridBagConstraintsHobby.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHobby.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarHobby, this.gridBagConstraintsHobby);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy = iGridyPrincipal++;
		this.gridBagConstraintsHobby.gridx = 0;		
		//this.gridBagConstraintsHobby.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobby.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsHobby.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsHobby);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsHobby.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHobby.gridx = 0;		
			this.gridBagConstraintsHobby.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsHobby.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasHobby, this.gridBagConstraintsHobby);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHobby.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesHobby, this.gridBagConstraintsHobby);								
		
		
		/*
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHobby.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesHobby, this.gridBagConstraintsHobby);
		*/		
		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHobby.gridx =0;
		this.gridBagConstraintsHobby.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHobby.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHobby, this.gridBagConstraintsHobby);
				
		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHobby.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionHobby, this.gridBagConstraintsHobby);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(HobbyJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosHobby= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHobby = new GridBagLayout();
			this.jPanelBusquedasParametrosHobby.setLayout(gridaBagLayoutBusquedasParametrosHobby);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralHobby=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHobby.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHobby.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHobby.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHobby.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHobby, this.gridBagConstraintsHobby);
			
			
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHobby.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHobby, this.gridBagConstraintsHobby);
		
			
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHobby.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHobby, this.gridBagConstraintsHobby);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralHobby;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoHobby() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoHobby = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoHobby.setName("jPanelReporteDinamicoHobby"); 
		
		this.jPanelReporteDinamicoHobby.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHobby.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHobby.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoHobby.setLayout(gridaBagLayoutReporteDinamicoHobby);
		
		
		this.jInternalFrameReporteDinamicoHobby= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoHobby = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHobby= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoHobby.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoHobby.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoHobby.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoHobby.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoHobby.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoHobby.setResizable(true);
	    this.jInternalFrameReporteDinamicoHobby.setClosable(true);
	    this.jInternalFrameReporteDinamicoHobby.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoHobby.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHobby.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHobby.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Hobbyes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteHobby = new JLabelMe();

		this.jLabelColumnasSelectReporteHobby.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobby.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHobby.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHobby.add(this.jLabelColumnasSelectReporteHobby, this.gridBagConstraintsHobby);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteHobby = new JList<Reporte>();
		this.jListColumnasSelectReporteHobby.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteHobby.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteHobby.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHobby.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHobby.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteHobby=new JScrollPane(this.jListColumnasSelectReporteHobby);
			
			this.jScrollColumnasSelectReporteHobby.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHobby.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHobby.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobby.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHobby.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoHobby.add(this.jListColumnasSelectReporteHobby, this.gridBagConstraintsHobby);
		this.jPanelReporteDinamicoHobby.add(this.jScrollColumnasSelectReporteHobby, this.gridBagConstraintsHobby);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteHobby = new JLabelMe();

		this.jLabelRelacionesSelectReporteHobby.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobby.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHobby.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHobby.add(this.jLabelRelacionesSelectReporteHobby, this.gridBagConstraintsHobby);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteHobby = new JList<Reporte>();
		this.jListRelacionesSelectReporteHobby.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteHobby.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteHobby.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHobby.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHobby.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteHobby=new JScrollPane(this.jListRelacionesSelectReporteHobby);
			
			this.jScrollRelacionesSelectReporteHobby.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHobby.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHobby.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobby.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHobby.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoHobby.add(this.jListRelacionesSelectReporteHobby, this.gridBagConstraintsHobby);
		this.jPanelReporteDinamicoHobby.add(this.jScrollRelacionesSelectReporteHobby, this.gridBagConstraintsHobby);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoHobby = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoHobby = new JComboBoxMe();
		this.jListColumnasValoresGraficoHobby = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoHobby = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoHobby.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoHobby.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHobby.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHobby.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoHobby = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoHobby.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoHobby.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHobby.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHobby.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoHobby = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoHobby.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobby.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHobby.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHobby.add(this.jLabelGenerarExcelReporteDinamicoHobby, this.gridBagConstraintsHobby);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoHobby = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoHobby.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoHobby,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoHobby.setToolTipText("Generar EXCEL"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsHobby = new GridBagConstraints();
		//this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsHobby.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsHobby.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoHobby.add(this.jButtonGenerarExcelReporteDinamicoHobby, this.gridBagConstraintsHobby);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobby.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHobby.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHobby.add(this.jComboBoxTiposReportesDinamicoHobby, this.gridBagConstraintsHobby);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoHobby = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoHobby.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobby.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHobby.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHobby.add(this.jLabelTiposArchivoReporteDinamicoHobby, this.gridBagConstraintsHobby);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobby.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHobby.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHobby.add(this.jComboBoxTiposArchivosReportesDinamicoHobby, this.gridBagConstraintsHobby);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoHobby = new JButtonMe();
		this.jButtonGenerarReporteDinamicoHobby.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoHobby,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoHobby.setToolTipText("Generar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobby.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHobby.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHobby.add(this.jButtonGenerarReporteDinamicoHobby, this.gridBagConstraintsHobby);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoHobby = new JButtonMe();
		this.jButtonCerrarReporteDinamicoHobby.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoHobby,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoHobby.setToolTipText("Cancelar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobby.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHobby.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHobby.add(this.jButtonCerrarReporteDinamicoHobby, this.gridBagConstraintsHobby);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalHobby = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoHobby= new JScrollPane(jPanelReporteDinamicoHobby,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoHobby.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHobby.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHobby.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Hobbyes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsHobby.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsHobby.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoHobby.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoHobby.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalHobby);
		this.jInternalFrameReporteDinamicoHobby.getContentPane().add(this.jScrollPanelReporteDinamicoHobby, this.gridBagConstraintsHobby);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionHobby() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionHobby = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionHobby.setName("jPanelImportacionHobby"); 
		
		this.jPanelImportacionHobby.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHobby.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHobby.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionHobby.setLayout(gridaBagLayoutImportacionHobby);
		
		
		this.jInternalFrameImportacionHobby= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionHobby= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionHobby = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHobby= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionHobby.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHobby.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHobby.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionHobby.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHobby.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHobby.setResizable(true);
	    this.jInternalFrameImportacionHobby.setClosable(true);
	    this.jInternalFrameImportacionHobby.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionHobby.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHobby.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHobby.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionHobby.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHobby.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHobby.setResizable(true);
	    this.jInternalFrameImportacionHobby.setClosable(true);
	    this.jInternalFrameImportacionHobby.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionHobby.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHobby.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHobby.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Hobbyes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionHobby = new JLabelMe();

		this.jLabelArchivoImportacionHobby.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobby.gridy = iPosYImportacion;		
		this.gridBagConstraintsHobby.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHobby.add(this.jLabelArchivoImportacionHobby, this.gridBagConstraintsHobby);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionHobby = new JFileChooser();		
		this.jFileChooserImportacionHobby.setToolTipText("ESCOGER ARCHIVO"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionHobby = new JButtonMe();
		this.jButtonAbrirImportacionHobby.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionHobby,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionHobby.setToolTipText("Generar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobby.gridy = iPosYImportacion;
		this.gridBagConstraintsHobby.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHobby.add(this.jButtonAbrirImportacionHobby, this.gridBagConstraintsHobby);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionHobby = new JLabelMe();

		this.jLabelPathArchivoImportacionHobby.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobby.gridy = iPosYImportacion;		
		this.gridBagConstraintsHobby.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHobby.add(this.jLabelPathArchivoImportacionHobby, this.gridBagConstraintsHobby);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionHobby=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionHobby.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHobby.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHobby.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobby.gridy = iPosYImportacion;
		this.gridBagConstraintsHobby.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHobby.add(this.jTextFieldPathArchivoImportacionHobby, this.gridBagConstraintsHobby);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionHobby = new JButtonMe();
		this.jButtonGenerarImportacionHobby.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionHobby,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionHobby.setToolTipText("Generar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobby.gridy = iPosYImportacion;
		this.gridBagConstraintsHobby.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHobby.add(this.jButtonGenerarImportacionHobby, this.gridBagConstraintsHobby);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionHobby = new JButtonMe();
		this.jButtonCerrarImportacionHobby.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionHobby,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionHobby.setToolTipText("Cancelar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobby.gridy = iPosYImportacion;
		this.gridBagConstraintsHobby.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHobby.add(this.jButtonCerrarImportacionHobby, this.gridBagConstraintsHobby);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalHobby = new GridBagLayout();
		
		this.jScrollPanelImportacionHobby= new JScrollPane(jPanelImportacionHobby,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy =iPosYImportacion;
		this.gridBagConstraintsHobby.gridx =iPosXImportacion;
		this.gridBagConstraintsHobby.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionHobby.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionHobby.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalHobby);
		this.jInternalFrameImportacionHobby.getContentPane().add(this.jScrollPanelImportacionHobby, this.gridBagConstraintsHobby);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByHobby(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByHobby = new JButtonMe();
			this.jButtonAbrirOrderByHobby.setText("Orden");
			this.jButtonAbrirOrderByHobby.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHobby,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByHobby";
			inputMap = this.jButtonAbrirOrderByHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByHobby"));
		
		
			GridBagLayout gridaBagLayoutOrderByHobby = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByHobby.setName("jPanelOrderByHobby"); 
			
			this.jPanelOrderByHobby.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHobby.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHobby.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByHobby.setLayout(gridaBagLayoutOrderByHobby);
			
			
			this.jTableDatosHobbyOrderBy = new JTableMe();        
			this.jTableDatosHobbyOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosHobbyOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosHobbyOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosHobbyOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosHobbyOrderBy.setViewportView(this.jTableDatosHobbyOrderBy);
			this.jTableDatosHobbyOrderBy.setFillsViewportHeight(true);
			this.jTableDatosHobbyOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByHobby= new OrderByJInternalFrame();
			this.jInternalFrameOrderByHobby= new OrderByJInternalFrame();
			this.jScrollPanelOrderByHobby = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteHobby= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByHobby.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByHobby.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByHobby.setTitle("Orden");
			this.jInternalFrameOrderByHobby.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByHobby.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByHobby.setResizable(true);
			this.jInternalFrameOrderByHobby.setClosable(true);
			this.jInternalFrameOrderByHobby.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByHobby.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHobby.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHobby.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Hobbyes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.gridy =iPosYOrderBy++;
			this.gridBagConstraintsHobby.gridx =iPosXOrderBy;
			this.gridBagConstraintsHobby.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsHobby.ipady =150;
				
			this.jPanelOrderByHobby.add(jScrollPanelDatosHobbyOrderBy, this.gridBagConstraintsHobby);//this.jTableDatosHobbyTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByHobby = new JButtonMe();
			this.jButtonCerrarOrderByHobby.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByHobby,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByHobby.setToolTipText("Cancelar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.gridy = iPosYOrderBy++;
			this.gridBagConstraintsHobby.gridx = iPosXOrderBy;
									
			this.jPanelOrderByHobby.add(this.jButtonCerrarOrderByHobby, this.gridBagConstraintsHobby);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalHobby = new GridBagLayout();
			
			this.jScrollPanelOrderByHobby= new JScrollPane(jPanelOrderByHobby,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.gridy =iPosYOrderBy;
			this.gridBagConstraintsHobby.gridx =iPosXOrderBy;
			this.gridBagConstraintsHobby.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByHobby.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByHobby.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalHobby);
			
			this.jInternalFrameOrderByHobby.getContentPane().add(this.jScrollPanelOrderByHobby, this.gridBagConstraintsHobby);			
		
		} else {
			this.jButtonAbrirOrderByHobby = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.hobbySessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosHobby.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosHobby.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosHobby.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosHobby.getRowHeight();//HobbyConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.hobbySessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > HobbyConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHobby.isSelected()) {
					iHeightTable=HobbyConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HobbyConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HobbyConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > HobbyConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHobby.isSelected()) {
					iHeightTable=HobbyConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HobbyConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HobbyConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosHobby.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHobby.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHobby.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosHobby.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHobby.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHobby.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByHobby!=null && this.jInternalFrameOrderByHobby.getjTableDatosOrderBy()!=null) {
			//if(!this.hobbySessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByHobby.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByHobby.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByHobby.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByHobby.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByHobby.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByHobby.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByHobby.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosHobby.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHobby.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHobby.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=hobbyLogic.getHobbys().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=hobbys.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Hobby> TraerHobbyBeans(List<Hobby> hobbys,ArrayList<Classe> classes)throws Exception {
		try {
			for(Hobby hobby:hobbys) {
					
				if(!(HobbyConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || HobbyConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					hobby.setsDetalleGeneralEntityReporte(HobbyConstantesFunciones.getHobbyDescripcion(hobby));
										
						
					
					

					if(hobby.getEmpleadoHobbys()!=null && Funciones.existeClass(classes,EmpleadoHobby.class)) {
						try{hobby.setempleadohobbysDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoHobbyJInternalFrame.TraerEmpleadoHobbyBeans(hobby.getEmpleadoHobbys(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(hobby.getHobbyClientes()!=null && Funciones.existeClass(classes,HobbyCliente.class)) {
						try{hobby.sethobbyclientesDescripcionReporte(new JRBeanCollectionDataSource(HobbyClienteJInternalFrame.TraerHobbyClienteBeans(hobby.getHobbyClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//hobby.setsDetalleGeneralEntityReporte(hobby.getsDetalleGeneralEntityReporte());
										
				}
				
				//hobbybeans.add(hobbybean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return hobbys;
    }
	//PARA REPORTES FIN
}
