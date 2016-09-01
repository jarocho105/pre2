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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
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
import com.bydan.erp.cartera.util.HobbyClienteConstantesFunciones;

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
public class HobbyClienteJInternalFrame extends HobbyClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarHobbyCliente;
	
	protected JMenuBar jmenuBarHobbyCliente;
	
	protected JMenu jmenuHobbyCliente;
	protected JMenu jmenuDatosHobbyCliente;
	protected JMenu jmenuArchivoHobbyCliente;
	protected JMenu jmenuAccionesHobbyCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosHobbyCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHobbyCliente;	
	protected GridBagConstraints gridBagConstraintsHobbyCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public HobbyClienteDetalleFormJInternalFrame jInternalFrameDetalleFormHobbyCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoHobbyCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionHobbyCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected HobbyBeanSwingJInternalFrame hobbyBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_hobby="";
	
	public HobbyClienteSessionBean hobbyclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public HobbySessionBean hobbySessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<HobbyCliente> hobbyclientes;		
	public List<HobbyCliente> hobbyclientesEliminados;	
	public List<HobbyCliente> hobbyclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByHobbyCliente;		
	protected JButton jButtonAbrirOrderByHobbyCliente;
	
	
	//protected JPanel jPanelOrderByHobbyCliente;
	//public JScrollPane jScrollPanelOrderByHobbyCliente;	
	//protected JButton jButtonCerrarOrderByHobbyCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public HobbyClienteLogic hobbyclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosHobbyCliente;
	public JScrollPane jScrollPanelDatosEdicionHobbyCliente;
	public JScrollPane jScrollPanelDatosGeneralHobbyCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosHobbyClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoHobbyCliente;
	//public JScrollPane jScrollPanelImportacionHobbyCliente;
	
	
	
	protected JPanel jPanelAccionesHobbyCliente;
	
    protected JPanel jPanelPaginacionHobbyCliente;
    protected JPanel jPanelParametrosReportesHobbyCliente;
	protected JPanel jPanelParametrosReportesAccionesHobbyCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1HobbyCliente;
	protected JPanel jPanelParametrosAuxiliar2HobbyCliente;
	protected JPanel jPanelParametrosAuxiliar3HobbyCliente;
	protected JPanel jPanelParametrosAuxiliar4HobbyCliente;
	//protected JPanel jPanelParametrosAuxiliar5HobbyCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoHobbyCliente;
	//protected JPanel jPanelImportacionHobbyCliente;
	
	
	public JTable jTableDatosHobbyCliente;
	
	
	
	//public JTable jTableDatosHobbyClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoHobbyCliente;
	protected JButton jButtonDuplicarHobbyCliente;
	protected JButton jButtonCopiarHobbyCliente;
	protected JButton jButtonVerFormHobbyCliente;
	protected JButton jButtonNuevoRelacionesHobbyCliente;
	protected JButton jButtonModificarHobbyCliente;
	
    protected JButton jButtonGuardarCambiosTablaHobbyCliente;
	protected JButton jButtonCerrarHobbyCliente;
	
	
	protected JButton jButtonRecargarInformacionHobbyCliente;
	protected JButton jButtonProcesarInformacionHobbyCliente;
	
	
	protected JButton jButtonAnterioresHobbyCliente;
	protected JButton jButtonSiguientesHobbyCliente;
	protected JButton jButtonNuevoGuardarCambiosHobbyCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoHobbyCliente;
	//protected JButton jButtonCerrarReporteDinamicoHobbyCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoHobbyCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionHobbyCliente;
	//protected JButton jButtonGenerarImportacionHobbyCliente;
	//protected JButton jButtonCerrarImportacionHobbyCliente;
	//protected JFileChooser jFileChooserImportacionHobbyCliente;
	//protected File fileImportacionHobbyCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHobbyCliente;
	protected JButton jButtonDuplicarToolBarHobbyCliente;
	protected JButton jButtonNuevoRelacionesToolBarHobbyCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarHobbyCliente;
	protected JButton jButtonCopiarToolBarHobbyCliente;
	protected JButton jButtonVerFormToolBarHobbyCliente;
	public JButton jButtonGuardarCambiosTablaToolBarHobbyCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarHobbyCliente;
	protected JButton jButtonCerrarToolBarHobbyCliente;
	
	protected JButton jButtonRecargarInformacionToolBarHobbyCliente;
	protected JButton jButtonProcesarInformacionToolBarHobbyCliente;
	protected JButton jButtonAnterioresToolBarHobbyCliente;
	protected JButton jButtonSiguientesToolBarHobbyCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarHobbyCliente;
	protected JButton jButtonAbrirOrderByToolBarHobbyCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHobbyCliente;
	protected JMenuItem jMenuItemDuplicarHobbyCliente;
	protected JMenuItem jMenuItemNuevoRelacionesHobbyCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosHobbyCliente;
	protected JMenuItem jMenuItemCopiarHobbyCliente;
	protected JMenuItem jMenuItemVerFormHobbyCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaHobbyCliente;
	protected JMenuItem jMenuItemCerrarHobbyCliente;
	protected JMenuItem jMenuItemDetalleCerrarHobbyCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByHobbyCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarHobbyCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionHobbyCliente;
	protected JMenuItem jMenuItemProcesarInformacionHobbyCliente;
	protected JMenuItem jMenuItemAnterioresHobbyCliente;
	protected JMenuItem jMenuItemSiguientesHobbyCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHobbyCliente;
	protected JMenuItem jMenuItemAbrirOrderByHobbyCliente;
	protected JMenuItem jMenuItemMostrarOcultarHobbyCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHobbyCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosHobbyCliente;
	protected JCheckBox jCheckBoxSeleccionadosHobbyCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaHobbyCliente;
	protected JCheckBox jCheckBoxConGraficoReporteHobbyCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesHobbyCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesHobbyCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoHobbyCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoHobbyCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesHobbyCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionHobbyCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHobbyCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHobbyCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarHobbyCliente;
	protected JTextField jTextFieldValorCampoGeneralHobbyCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteHobbyCliente;
	//public JList<Reporte> jListColumnasSelectReporteHobbyCliente;
	//public JScrollPane jScrollColumnasSelectReporteHobbyCliente;
	
	//public JLabel jLabelRelacionesSelectReporteHobbyCliente;
	//public JList<Reporte> jListRelacionesSelectReporteHobbyCliente;
	//public JScrollPane jScrollRelacionesSelectReporteHobbyCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoHobbyCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoHobbyCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoHobbyCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoHobbyCliente;
	
		
	//public JLabel jLabelArchivoImportacionHobbyCliente;	
	//public JLabel jLabelPathArchivoImportacionHobbyCliente;
	//protected JTextField jTextFieldPathArchivoImportacionHobbyCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoHobbyCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoHobbyCliente;
	
	//public JLabel jLabelColumnaCategoriaValorHobbyCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorHobbyCliente;
	
	//public JLabel jLabelColumnasValoresGraficoHobbyCliente;
	//public JList<Reporte> jListColumnasValoresGraficoHobbyCliente;
	//public JScrollPane jScrollColumnasValoresGraficoHobbyCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoHobbyCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoHobbyCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasHobbyCliente;
	public JPanel jPanelFK_IdClienteHobbyCliente;
	public JButton jButtonFK_IdClienteHobbyCliente;
	public JPanel jPanelFK_IdHobbyHobbyCliente;
	public JButton jButtonFK_IdHobbyHobbyCliente;
	
	public JPanel jPanelid_clienteFK_IdClienteHobbyCliente;
	public JLabel jLabelid_clienteFK_IdClienteHobbyCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteHobbyCliente;
	public JButton jButtonid_clienteFK_IdClienteHobbyCliente= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteHobbyClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteHobbyClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteHobbyCliente;
	
	public JPanel jPanelid_hobbyFK_IdHobbyHobbyCliente;
	public JLabel jLabelid_hobbyFK_IdHobbyHobbyCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_hobbyFK_IdHobbyHobbyCliente;
	public JButton jButtonid_hobbyFK_IdHobbyHobbyCliente= new JButtonMe();
	public JButton jButtonid_hobbyFK_IdHobbyHobbyClienteUpdate= new JButtonMe();
	public JButton jButtonid_hobbyFK_IdHobbyHobbyClienteBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public HobbyClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("HobbyCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HobbyClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HobbyCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HobbyClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HobbyCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HobbyClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("HobbyCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionHobbyCliente)	{
		this.jButtonRecargarInformacionHobbyCliente = jButtonRecargarInformacionHobbyCliente;
	}
	
	public JButton getjButtonProcesarInformacionHobbyCliente() {
		return this.jButtonProcesarInformacionHobbyCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHobbyCliente)	{
		this.jButtonProcesarInformacionHobbyCliente = jButtonProcesarInformacionHobbyCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionHobbyCliente() {
		return this.jButtonRecargarInformacionHobbyCliente;
	}
	
	
	public List<HobbyCliente> gethobbyclientes() {
		return this.hobbyclientes;
	}

	public void sethobbyclientes(List<HobbyCliente> hobbyclientes) {
		this.hobbyclientes = hobbyclientes;
	}
	
	public List<HobbyCliente> gethobbyclientesAux() {
		return this.hobbyclientesAux;
	}

	public void sethobbyclientesAux(List<HobbyCliente> hobbyclientesAux) {
		this.hobbyclientesAux = hobbyclientesAux;
	}
	
	public List<HobbyCliente> gethobbyclientesEliminados() {
		return this.hobbyclientesEliminados;
	}

	public void setHobbyClientesEliminados(List<HobbyCliente> hobbyclientesEliminados) {
		this.hobbyclientesEliminados = hobbyclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarHobbyCliente() {
		return jComboBoxTiposSeleccionarHobbyCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarHobbyCliente(
			JComboBox jComboBoxTiposSeleccionarHobbyCliente) {
		this.jComboBoxTiposSeleccionarHobbyCliente = jComboBoxTiposSeleccionarHobbyCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarHobbyCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarHobbyCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarHobbyCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralHobbyCliente() {
		return jTextFieldValorCampoGeneralHobbyCliente;
	}

	public void setjTextFieldValorCampoGeneralHobbyCliente(
			JTextField jTextFieldValorCampoGeneralHobbyCliente) {
		this.jTextFieldValorCampoGeneralHobbyCliente = jTextFieldValorCampoGeneralHobbyCliente;
	}

	public void setBorderResaltarValorCampoGeneralHobbyCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobbyCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralHobbyCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosHobbyCliente() {
		return this.jCheckBoxSeleccionarTodosHobbyCliente;
	}

	public void setjCheckBoxSeleccionarTodosHobbyCliente(
			JCheckBox jCheckBoxSeleccionarTodosHobbyCliente) {
		this.jCheckBoxSeleccionarTodosHobbyCliente = jCheckBoxSeleccionarTodosHobbyCliente;
	}

	public void setBorderResaltarSeleccionarTodosHobbyCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobbyCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosHobbyCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosHobbyCliente() {
		return this.jCheckBoxSeleccionadosHobbyCliente;
	}

	public void setjCheckBoxSeleccionadosHobbyCliente(
			JCheckBox jCheckBoxSeleccionadosHobbyCliente) {
		this.jCheckBoxSeleccionadosHobbyCliente = jCheckBoxSeleccionadosHobbyCliente;
	}
	
	public void setBorderResaltarSeleccionadosHobbyCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobbyCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosHobbyCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesHobbyCliente() {
		return this.jComboBoxTiposArchivosReportesHobbyCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesHobbyCliente(
			JComboBox jComboBoxTiposArchivosReportesHobbyCliente) {
		this.jComboBoxTiposArchivosReportesHobbyCliente = jComboBoxTiposArchivosReportesHobbyCliente;
	}

	public void setBorderResaltarTiposArchivosReportesHobbyCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobbyCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesHobbyCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesHobbyCliente() {
		return this.jComboBoxTiposReportesHobbyCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesHobbyCliente(
			JComboBox jComboBoxTiposReportesHobbyCliente) {
		this.jComboBoxTiposReportesHobbyCliente = jComboBoxTiposReportesHobbyCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoHobbyCliente() {
	//	return jComboBoxTiposReportesDinamicoHobbyCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoHobbyCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoHobbyCliente) {
	//	this.jComboBoxTiposReportesDinamicoHobbyCliente = jComboBoxTiposReportesDinamicoHobbyCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoHobbyCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoHobbyCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoHobbyCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoHobbyCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoHobbyCliente = jComboBoxTiposArchivosReportesDinamicoHobbyCliente;
	//}
	
	public void setBorderResaltarTiposReportesHobbyCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobbyCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesHobbyCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesHobbyCliente() {
		return this.jComboBoxTiposGraficosReportesHobbyCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesHobbyCliente(
			JComboBox jComboBoxTiposGraficosReportesHobbyCliente) {
		this.jComboBoxTiposGraficosReportesHobbyCliente = jComboBoxTiposGraficosReportesHobbyCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesHobbyCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobbyCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesHobbyCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionHobbyCliente() {
		return this.jComboBoxTiposPaginacionHobbyCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionHobbyCliente(
			JComboBox jComboBoxTiposPaginacionHobbyCliente) {
		this.jComboBoxTiposPaginacionHobbyCliente = jComboBoxTiposPaginacionHobbyCliente;
	}
	
	public void setBorderResaltarTiposPaginacionHobbyCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobbyCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionHobbyCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesHobbyCliente() {
		return this.jComboBoxTiposRelacionesHobbyCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHobbyCliente() {
		return this.jComboBoxTiposAccionesHobbyCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHobbyCliente(
			JComboBox jComboBoxTiposRelacionesHobbyCliente) {
		this.jComboBoxTiposRelacionesHobbyCliente = jComboBoxTiposRelacionesHobbyCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHobbyCliente(
			JComboBox jComboBoxTiposAccionesHobbyCliente) {
		this.jComboBoxTiposAccionesHobbyCliente = jComboBoxTiposAccionesHobbyCliente;
	}
	
	public void setBorderResaltarTiposRelacionesHobbyCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobbyCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesHobbyCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesHobbyCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHobbyCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesHobbyCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoHobbyCliente() {
	//	return jCheckBoxConGraficoDinamicoHobbyCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoHobbyCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoHobbyCliente) {
	//	this.jCheckBoxConGraficoDinamicoHobbyCliente = jCheckBoxConGraficoDinamicoHobbyCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoHobbyCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarHobbyCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoHobbyCliente .setBorder(borderResaltar);		
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
		this.hobbyclienteSessionBean=new HobbyClienteSessionBean();
		
		this.hobbyclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.hobbyclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.hobbyclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=HobbyClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=HobbyClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HobbyClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HobbyClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HobbyClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Hobby Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		HobbyClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("HobbyCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarHobbyCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarHobbyCliente,this.jTtoolBarHobbyCliente,
							"nuevo","nuevo","Nuevo"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarHobbyCliente,this.jTtoolBarHobbyCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarHobbyCliente,this.jTtoolBarHobbyCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarHobbyCliente,this.jTtoolBarHobbyCliente,
							"duplicar","duplicar","Duplicar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarHobbyCliente,this.jTtoolBarHobbyCliente,
							"copiar","copiar","Copiar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarHobbyCliente,this.jTtoolBarHobbyCliente,
							"ver_form","ver_form","Ver"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHobbyCliente,this.jTtoolBarHobbyCliente,
							"recargar","recargar","Recargar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHobbyCliente,this.jTtoolBarHobbyCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHobbyCliente,this.jTtoolBarHobbyCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarHobbyCliente,this.jTtoolBarHobbyCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarHobbyCliente,this.jTtoolBarHobbyCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarHobbyCliente,this.jTtoolBarHobbyCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarHobbyCliente,this.jTtoolBarHobbyCliente,
							"cerrar","cerrar","Salir"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarHobbyCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarHobbyCliente;
			
				this.jButtonProcesarInformacionToolBarHobbyCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarHobbyCliente;
				
		//protected JButton jButtonModificarToolBarHobbyCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarHobbyCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuHobbyCliente=new JMenuMe("General");
		this.jmenuArchivoHobbyCliente=new JMenuMe("Archivo");
		this.jmenuAccionesHobbyCliente=new JMenuMe("Acciones");
		this.jmenuDatosHobbyCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHobbyCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHobbyCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHobbyCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarHobbyCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarHobbyCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarHobbyCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesHobbyCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesHobbyCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesHobbyCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosHobbyCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHobbyCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHobbyCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarHobbyCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarHobbyCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarHobbyCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormHobbyCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormHobbyCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormHobbyCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaHobbyCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaHobbyCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaHobbyCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHobbyCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHobbyCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHobbyCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionHobbyCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionHobbyCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionHobbyCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionHobbyCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionHobbyCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionHobbyCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresHobbyCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresHobbyCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresHobbyCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesHobbyCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesHobbyCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesHobbyCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByHobbyCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByHobbyCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByHobbyCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHobbyCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHobbyCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHobbyCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByHobbyCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByHobbyCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByHobbyCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHobbyCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHobbyCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHobbyCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosHobbyCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosHobbyCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosHobbyCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoHobbyCliente.add(this.jMenuItemCerrarHobbyCliente);
			
			this.jmenuAccionesHobbyCliente.add(this.jMenuItemNuevoHobbyCliente);
			this.jmenuAccionesHobbyCliente.add(this.jMenuItemNuevoGuardarCambiosHobbyCliente);
			this.jmenuAccionesHobbyCliente.add(this.jMenuItemNuevoRelacionesHobbyCliente);
			this.jmenuAccionesHobbyCliente.add(this.jMenuItemGuardarCambiosTablaHobbyCliente);		
			this.jmenuAccionesHobbyCliente.add(this.jMenuItemDuplicarHobbyCliente);		
			this.jmenuAccionesHobbyCliente.add(this.jMenuItemCopiarHobbyCliente);		
			this.jmenuAccionesHobbyCliente.add(this.jMenuItemVerFormHobbyCliente);		
			
			this.jmenuDatosHobbyCliente.add(this.jMenuItemRecargarInformacionHobbyCliente);				
			this.jmenuDatosHobbyCliente.add(this.jMenuItemAnterioresHobbyCliente);				
			this.jmenuDatosHobbyCliente.add(this.jMenuItemSiguientesHobbyCliente);				
			this.jmenuDatosHobbyCliente.add(this.jMenuItemAbrirOrderByHobbyCliente);				
			this.jmenuDatosHobbyCliente.add(this.jMenuItemMostrarOcultarHobbyCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesHobbyCliente.add(this.jMenuItemGuardarCambiosHobbyCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarHobbyCliente.add(this.jmenuArchivoHobbyCliente);		
			this.jmenuBarHobbyCliente.add(this.jmenuAccionesHobbyCliente);		
			this.jmenuBarHobbyCliente.add(this.jmenuDatosHobbyCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarHobbyCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasHobbyCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteHobbyCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteHobbyCliente.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteHobbyCliente= new JButtonMe();
		this.jButtonFK_IdClienteHobbyCliente.setText("Buscar");
		this.jButtonFK_IdClienteHobbyCliente.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteHobbyCliente,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteHobbyCliente = new JLabelMe();
		jLabelid_clienteFK_IdClienteHobbyCliente.setText("Cliente :");
		jLabelid_clienteFK_IdClienteHobbyCliente.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteHobbyCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteHobbyCliente= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteHobbyCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteHobbyCliente= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteHobbyCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteHobbyCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteHobbyCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteHobbyCliente.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteHobbyCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteHobbyCliente.setFocusable(false);

		this.jPanelFK_IdHobbyHobbyCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdHobbyHobbyCliente.setToolTipText("Buscar Por Hobby ");
		this.jButtonFK_IdHobbyHobbyCliente= new JButtonMe();
		this.jButtonFK_IdHobbyHobbyCliente.setText("Buscar");
		this.jButtonFK_IdHobbyHobbyCliente.setToolTipText("Buscar Por Hobby ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdHobbyHobbyCliente,"buscar_button","Buscar Por Hobby ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdHobbyHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_hobbyFK_IdHobbyHobbyCliente = new JLabelMe();
		jLabelid_hobbyFK_IdHobbyHobbyCliente.setText("Hobby :");
		jLabelid_hobbyFK_IdHobbyHobbyCliente.setToolTipText("Hobby");
		jLabelid_hobbyFK_IdHobbyHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_hobbyFK_IdHobbyHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_hobbyFK_IdHobbyHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_hobbyFK_IdHobbyHobbyCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_hobbyFK_IdHobbyHobbyCliente= new JComboBoxMe();
		jComboBoxid_hobbyFK_IdHobbyHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_hobbyFK_IdHobbyHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_hobbyFK_IdHobbyHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_hobbyFK_IdHobbyHobbyCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasHobbyCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasHobbyCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHobbyCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHobbyCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasHobbyCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasHobbyCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleHobbyCliente = new HobbyClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Hobby Cliente DATOS");
			this.jInternalFrameDetalleFormHobbyCliente = new HobbyClienteDetalleFormJInternalFrame(jDesktopPane,this.hobbyclienteSessionBean.getConGuardarRelaciones(),this.hobbyclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormHobbyCliente = null;//new HobbyClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHobbyCliente= new GridBagLayout();
		
		
		this.jTableDatosHobbyCliente = new JTableMe();      
		
		String sToolTipHobbyCliente="";
		sToolTipHobbyCliente=HobbyClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHobbyCliente+="(Cartera.HobbyCliente)";
		}
		
		if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipHobbyCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosHobbyCliente.setToolTipText(sToolTipHobbyCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosHobbyCliente);
		this.jTableDatosHobbyCliente.setAutoCreateRowSorter(true);
		this.jTableDatosHobbyCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosHobbyCliente.setRowSelectionAllowed(true);
		this.jTableDatosHobbyCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosHobbyCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoHobbyCliente = new JButtonMe();
		this.jButtonDuplicarHobbyCliente = new JButtonMe();
		this.jButtonCopiarHobbyCliente = new JButtonMe();
		this.jButtonVerFormHobbyCliente = new JButtonMe();
		this.jButtonNuevoRelacionesHobbyCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaHobbyCliente = new JButtonMe();
		this.jButtonCerrarHobbyCliente = new JButtonMe();
		
		this.jScrollPanelDatosHobbyCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralHobbyCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesHobbyCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Hobby Cliente";
		
		if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Hobby Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosHobbyCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHobbyCliente.setToolTipText("Acciones");
        this.jPanelAccionesHobbyCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoHobbyCliente=new ReporteDinamicoJInternalFrame(HobbyClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoHobbyCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionHobbyCliente=new ImportacionJInternalFrame(HobbyClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionHobbyCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByHobbyCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByHobbyCliente.setText("Orden");
		this.jButtonAbrirOrderByHobbyCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHobbyCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByHobbyCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHobbyCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHobbyCliente,false,this);
			
			//this.cargarOrderByHobbyCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHobbyCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHobbyCliente,true,this);
			
			//this.cargarOrderByHobbyCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosHobbyCliente.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosHobbyCliente.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosHobbyCliente.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosHobbyCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosHobbyCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosHobbyCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoHobbyCliente.setText("Nuevo");
		this.jButtonDuplicarHobbyCliente.setText("Duplicar");
		this.jButtonCopiarHobbyCliente.setText("Copiar");
		this.jButtonVerFormHobbyCliente.setText("Ver");
		this.jButtonNuevoRelacionesHobbyCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaHobbyCliente.setText("Guardar");
		this.jButtonCerrarHobbyCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHobbyCliente,"nuevo_button","Nuevo",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarHobbyCliente,"duplicar_button","Duplicar",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarHobbyCliente,"copiar_button","Copiar",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormHobbyCliente,"ver_form","Ver",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesHobbyCliente,"nuevorelaciones_button","Nuevo Rel",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHobbyCliente,"guardarcambiostabla_button","Guardar",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHobbyCliente,"cerrar_button","Salir",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoHobbyCliente.setToolTipText("Nuevo"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarHobbyCliente.setToolTipText("Duplicar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarHobbyCliente.setToolTipText("Copiar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormHobbyCliente.setToolTipText("Ver"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesHobbyCliente.setToolTipText("Nuevo Rel"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaHobbyCliente.setToolTipText("Guardar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHobbyCliente.setToolTipText("Salir"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHobbyCliente";
		inputMap = this.jButtonNuevoHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHobbyCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHobbyCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarHobbyCliente";
		inputMap = this.jButtonDuplicarHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarHobbyCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarHobbyCliente"));
		
		//COPIAR
		sMapKey = "CopiarHobbyCliente";
		inputMap = this.jButtonCopiarHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarHobbyCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarHobbyCliente"));
		
		//VEr FORM
		sMapKey = "VerFormHobbyCliente";
		inputMap = this.jButtonVerFormHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormHobbyCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormHobbyCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesHobbyCliente";
		inputMap = this.jButtonNuevoRelacionesHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesHobbyCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesHobbyCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarHobbyCliente";
		inputMap = this.jButtonModificarHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarHobbyCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarHobbyCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarHobbyCliente";
		inputMap = this.jButtonCerrarHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHobbyCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHobbyCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHobbyCliente";
		inputMap = this.jButtonGuardarCambiosTablaHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHobbyCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHobbyCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesHobbyCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesHobbyCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionHobbyCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1HobbyCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2HobbyCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3HobbyCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4HobbyCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5HobbyCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesHobbyCliente.setName("jPanelParametrosReportesHobbyCliente"); 
		
		this.jPanelParametrosReportesAccionesHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesHobbyCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesHobbyCliente.setName("jPanelParametrosReportesAccionesHobbyCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionHobbyCliente = new JButtonMe();
		this.jButtonRecargarInformacionHobbyCliente.setText("Recargar");
		this.jButtonRecargarInformacionHobbyCliente.setToolTipText("Recargar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionHobbyCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionHobbyCliente = new JButtonMe();
		this.jButtonProcesarInformacionHobbyCliente.setText("Procesar");
		this.jButtonProcesarInformacionHobbyCliente.setToolTipText("Procesar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionHobbyCliente.setVisible(false);
			
		this.jButtonProcesarInformacionHobbyCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHobbyCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHobbyCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesHobbyCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHobbyCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesHobbyCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesHobbyCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHobbyCliente.setText("TIPO");       
		this.jComboBoxTiposReportesHobbyCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesHobbyCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHobbyCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesHobbyCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionHobbyCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionHobbyCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionHobbyCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesHobbyCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesHobbyCliente.setText("Accion");
		this.jComboBoxTiposRelacionesHobbyCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesHobbyCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHobbyCliente.setText("Accion");
		this.jComboBoxTiposAccionesHobbyCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarHobbyCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarHobbyCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarHobbyCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralHobbyCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralHobbyCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHobbyCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHobbyCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesHobbyCliente = new JLabelMe();
		
		this.jLabelAccionesHobbyCliente.setText("Acciones");		
		this.jLabelAccionesHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosHobbyCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosHobbyCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosHobbyCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosHobbyCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosHobbyCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosHobbyCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaHobbyCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaHobbyCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaHobbyCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteHobbyCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteHobbyCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteHobbyCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresHobbyCliente = new JButtonMe();
		//this.jButtonAnterioresHobbyCliente.setText("<<");
        this.jButtonAnterioresHobbyCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresHobbyCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesHobbyCliente = new JButtonMe();
		//this.jButtonSiguientesHobbyCliente.setText(">>");
        this.jButtonSiguientesHobbyCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesHobbyCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosHobbyCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosHobbyCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosHobbyCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosHobbyCliente,"nuevoguardarcambios_button","Nue",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosHobbyCliente";
		inputMap = this.jButtonNuevoGuardarCambiosHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosHobbyCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosHobbyCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionHobbyCliente";
		inputMap = this.jButtonRecargarInformacionHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionHobbyCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionHobbyCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesHobbyCliente";
		inputMap = this.jButtonSiguientesHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesHobbyCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesHobbyCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresHobbyCliente";
		inputMap = this.jButtonAnterioresHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresHobbyCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresHobbyCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasHobbyCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesHobbyCliente.setMinimumSize(new Dimension(this.getWidth(),HobbyClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HobbyClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHobbyCliente.setMaximumSize(new Dimension(this.getWidth(),HobbyClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HobbyClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHobbyCliente.setPreferredSize(new Dimension(this.getWidth(),HobbyClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HobbyClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionHobbyCliente = new GridBagLayout();

			this.jPanelPaginacionHobbyCliente.setLayout(gridaBagLayoutPaginacionHobbyCliente);						
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.gridy = 0;
			this.gridBagConstraintsHobbyCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionHobbyCliente.add(this.jButtonAnterioresHobbyCliente, this.gridBagConstraintsHobbyCliente);
					
						
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHobbyCliente.gridy = 0;
			
			this.jPanelPaginacionHobbyCliente.add(this.jButtonNuevoGuardarCambiosHobbyCliente, this.gridBagConstraintsHobbyCliente);
						
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsHobbyCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHobbyCliente.gridy = 0;
			this.jPanelPaginacionHobbyCliente.add(this.jButtonSiguientesHobbyCliente, this.gridBagConstraintsHobbyCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.gridy = 1;
			this.gridBagConstraintsHobbyCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHobbyCliente.add(this.jButtonNuevoHobbyCliente, this.gridBagConstraintsHobbyCliente);
						
			
			
			if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
				this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsHobbyCliente.gridy = 1;
				this.gridBagConstraintsHobbyCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionHobbyCliente.add(this.jButtonGuardarCambiosTablaHobbyCliente, this.gridBagConstraintsHobbyCliente);
			}
			
			
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.gridy = 1;
			this.gridBagConstraintsHobbyCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHobbyCliente.add(this.jButtonDuplicarHobbyCliente, this.gridBagConstraintsHobbyCliente);
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.gridy = 1;
			this.gridBagConstraintsHobbyCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHobbyCliente.add(this.jButtonCopiarHobbyCliente, this.gridBagConstraintsHobbyCliente);
		
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.gridy = 1;
			this.gridBagConstraintsHobbyCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHobbyCliente.add(this.jButtonVerFormHobbyCliente, this.gridBagConstraintsHobbyCliente);
		
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.gridy = 1;
			this.gridBagConstraintsHobbyCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionHobbyCliente.add(this.jButtonCerrarHobbyCliente, this.gridBagConstraintsHobbyCliente);
		
		
		
		this.jButtonRecargarInformacionHobbyCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHobbyCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHobbyCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesHobbyCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHobbyCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHobbyCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesHobbyCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHobbyCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHobbyCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesHobbyCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHobbyCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHobbyCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionHobbyCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHobbyCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHobbyCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesHobbyCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHobbyCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHobbyCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesHobbyCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHobbyCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHobbyCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarHobbyCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHobbyCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHobbyCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaHobbyCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHobbyCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHobbyCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteHobbyCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHobbyCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHobbyCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosHobbyCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHobbyCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHobbyCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosHobbyCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHobbyCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHobbyCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesHobbyCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesHobbyCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1HobbyCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2HobbyCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3HobbyCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4HobbyCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesHobbyCliente.setLayout(gridaBagParametrosReportesHobbyCliente);
			this.jPanelParametrosReportesAccionesHobbyCliente.setLayout(gridaBagParametrosReportesAccionesHobbyCliente);
			
			
			this.jPanelParametrosAuxiliar1HobbyCliente.setLayout(gridaBagParametrosAuxiliar1HobbyCliente);
			this.jPanelParametrosAuxiliar2HobbyCliente.setLayout(gridaBagParametrosAuxiliar2HobbyCliente);
			this.jPanelParametrosAuxiliar3HobbyCliente.setLayout(gridaBagParametrosAuxiliar3HobbyCliente);
			this.jPanelParametrosAuxiliar4HobbyCliente.setLayout(gridaBagParametrosAuxiliar4HobbyCliente);
			//this.jPanelParametrosAuxiliar5HobbyCliente.setLayout(gridaBagParametrosAuxiliar2HobbyCliente);			
			
			
			
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHobbyCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHobbyCliente.add(this.jButtonRecargarInformacionHobbyCliente, this.gridBagConstraintsHobbyCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHobbyCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HobbyCliente.add(this.jComboBoxTiposPaginacionHobbyCliente, this.gridBagConstraintsHobbyCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHobbyCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HobbyCliente.add(this.jCheckBoxConAltoMaximoTablaHobbyCliente, this.gridBagConstraintsHobbyCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHobbyCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HobbyCliente.add(this.jComboBoxTiposArchivosReportesHobbyCliente, this.gridBagConstraintsHobbyCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobbyCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHobbyCliente.add(this.jPanelParametrosAuxiliar1HobbyCliente, this.gridBagConstraintsHobbyCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHobbyCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4HobbyCliente.add(this.jComboBoxTiposReportesHobbyCliente, this.gridBagConstraintsHobbyCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobbyCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHobbyCliente.add(this.jPanelParametrosAuxiliar4HobbyCliente, this.gridBagConstraintsHobbyCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsHobbyCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHobbyCliente.add(this.jComboBoxTiposReportesHobbyCliente, this.gridBagConstraintsHobbyCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobbyCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHobbyCliente.add(this.jCheckBoxGenerarReporteHobbyCliente, this.gridBagConstraintsHobbyCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobbyCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHobbyCliente.add(this.jPanelParametrosAuxiliar2HobbyCliente, this.gridBagConstraintsHobbyCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHobbyCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHobbyCliente.add(this.jLabelAccionesHobbyCliente, this.gridBagConstraintsHobbyCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
				this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsHobbyCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesHobbyCliente.add(this.jButtonAbrirOrderByHobbyCliente, this.gridBagConstraintsHobbyCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobbyCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHobbyCliente.add(this.jComboBoxTiposSeleccionarHobbyCliente, this.gridBagConstraintsHobbyCliente);			
			
			
			/*
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHobbyCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHobbyCliente.add(this.jCheckBoxSeleccionarTodosHobbyCliente, this.gridBagConstraintsHobbyCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHobbyCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HobbyCliente.add(this.jCheckBoxSeleccionarTodosHobbyCliente, this.gridBagConstraintsHobbyCliente);															
				
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHobbyCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HobbyCliente.add(this.jCheckBoxSeleccionadosHobbyCliente, this.gridBagConstraintsHobbyCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobbyCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHobbyCliente.add(this.jPanelParametrosAuxiliar3HobbyCliente, this.gridBagConstraintsHobbyCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobbyCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHobbyCliente.add(this.jComboBoxTiposAccionesHobbyCliente, this.gridBagConstraintsHobbyCliente);
	
				
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHobbyCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHobbyCliente.add(this.jTextFieldValorCampoGeneralHobbyCliente, this.gridBagConstraintsHobbyCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosHobbyCliente = new GridBagLayout();

			this.jScrollPanelDatosHobbyCliente.setLayout(gridaBagLayoutDatosHobbyCliente);
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.gridy = 0;
			this.gridBagConstraintsHobbyCliente.gridx = 0;
			
			this.jScrollPanelDatosHobbyCliente.add(this.jTableDatosHobbyCliente, this.gridBagConstraintsHobbyCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosHobbyCliente.setViewportView(this.jTableDatosHobbyCliente);
		this.jTableDatosHobbyCliente.setFillsViewportHeight(true);
		this.jTableDatosHobbyCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesHobbyCliente= new GridBagLayout();
		this.jPanelAccionesHobbyCliente.setLayout(gridaBagLayoutAccionesHobbyCliente);
		
		
		/*	
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobbyCliente.gridy = 0;
		this.gridBagConstraintsHobbyCliente.gridx = 0;
			
		this.jPanelAccionesHobbyCliente.add(this.jButtonNuevoHobbyCliente, this.gridBagConstraintsHobbyCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteHobbyCliente= new GridBagLayout();
		gridaBagLayoutFK_IdClienteHobbyCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteHobbyCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteHobbyCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteHobbyCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteHobbyCliente.setLayout(gridaBagLayoutFK_IdClienteHobbyCliente);

		gridBagConstraintsHobbyCliente = new GridBagConstraints();
		gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHobbyCliente.gridy = 0;
		gridBagConstraintsHobbyCliente.gridx = 0;
		jPanelFK_IdClienteHobbyCliente.add(jLabelid_clienteFK_IdClienteHobbyCliente, gridBagConstraintsHobbyCliente);

		gridBagConstraintsHobbyCliente = new GridBagConstraints();
		gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHobbyCliente.gridy = 0;
		gridBagConstraintsHobbyCliente.gridx = 1;
		jPanelFK_IdClienteHobbyCliente.add(jComboBoxid_clienteFK_IdClienteHobbyCliente, gridBagConstraintsHobbyCliente);


		gridBagConstraintsHobbyCliente = new GridBagConstraints();
		gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsHobbyCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsHobbyCliente.gridy = 0;
		gridBagConstraintsHobbyCliente.gridx = 0;
		jPanelFK_IdClienteHobbyCliente.add(this.jButtonBuscarFK_IdClienteid_clienteHobbyCliente, gridBagConstraintsHobbyCliente);

		gridBagConstraintsHobbyCliente = new GridBagConstraints();
		gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHobbyCliente.gridy = 1;
		gridBagConstraintsHobbyCliente.gridx =1;
		jPanelFK_IdClienteHobbyCliente.add(jButtonFK_IdClienteHobbyCliente, gridBagConstraintsHobbyCliente);

		jTabbedPaneBusquedasHobbyCliente.addTab("1.-Por Cliente ", jPanelFK_IdClienteHobbyCliente);
		jTabbedPaneBusquedasHobbyCliente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdHobbyHobbyCliente= new GridBagLayout();
		gridaBagLayoutFK_IdHobbyHobbyCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdHobbyHobbyCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdHobbyHobbyCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdHobbyHobbyCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdHobbyHobbyCliente.setLayout(gridaBagLayoutFK_IdHobbyHobbyCliente);

		gridBagConstraintsHobbyCliente = new GridBagConstraints();
		gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHobbyCliente.gridy = 0;
		gridBagConstraintsHobbyCliente.gridx = 0;
		jPanelFK_IdHobbyHobbyCliente.add(jLabelid_hobbyFK_IdHobbyHobbyCliente, gridBagConstraintsHobbyCliente);

		gridBagConstraintsHobbyCliente = new GridBagConstraints();
		gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHobbyCliente.gridy = 0;
		gridBagConstraintsHobbyCliente.gridx = 1;
		jPanelFK_IdHobbyHobbyCliente.add(jComboBoxid_hobbyFK_IdHobbyHobbyCliente, gridBagConstraintsHobbyCliente);

		gridBagConstraintsHobbyCliente = new GridBagConstraints();
		gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHobbyCliente.gridy = 1;
		gridBagConstraintsHobbyCliente.gridx =1;
		jPanelFK_IdHobbyHobbyCliente.add(jButtonFK_IdHobbyHobbyCliente, gridBagConstraintsHobbyCliente);

		jTabbedPaneBusquedasHobbyCliente.addTab("2.-Por Hobby ", jPanelFK_IdHobbyHobbyCliente);
		jTabbedPaneBusquedasHobbyCliente.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHobbyCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHobbyCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();						
			this.gridBagConstraintsHobbyCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHobbyCliente.gridx = 0;		
			//this.gridBagConstraintsHobbyCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHobbyCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarHobbyCliente, this.gridBagConstraintsHobbyCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsHobbyCliente.gridx = 0;		
		//this.gridBagConstraintsHobbyCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsHobbyCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsHobbyCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsHobbyCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHobbyCliente.gridx = 0;		
			this.gridBagConstraintsHobbyCliente.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsHobbyCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasHobbyCliente, this.gridBagConstraintsHobbyCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHobbyCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesHobbyCliente, this.gridBagConstraintsHobbyCliente);								
		
		
		/*
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHobbyCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesHobbyCliente, this.gridBagConstraintsHobbyCliente);
		*/		
		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHobbyCliente.gridx =0;
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHobbyCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHobbyCliente, this.gridBagConstraintsHobbyCliente);
				
		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHobbyCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionHobbyCliente, this.gridBagConstraintsHobbyCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(HobbyClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosHobbyCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHobbyCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosHobbyCliente.setLayout(gridaBagLayoutBusquedasParametrosHobbyCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralHobbyCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHobbyCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHobbyCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHobbyCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHobbyCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHobbyCliente, this.gridBagConstraintsHobbyCliente);
			
			
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHobbyCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHobbyCliente, this.gridBagConstraintsHobbyCliente);
		
			
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHobbyCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHobbyCliente, this.gridBagConstraintsHobbyCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralHobbyCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoHobbyCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoHobbyCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoHobbyCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoHobbyCliente.setName("jPanelReporteDinamicoHobbyCliente"); 
		
		this.jPanelReporteDinamicoHobbyCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHobbyCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHobbyCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoHobbyCliente.setLayout(gridaBagLayoutReporteDinamicoHobbyCliente);
		
		
		this.jInternalFrameReporteDinamicoHobbyCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoHobbyCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHobbyCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoHobbyCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoHobbyCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoHobbyCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoHobbyCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoHobbyCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoHobbyCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoHobbyCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoHobbyCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoHobbyCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHobbyCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHobbyCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Hobby Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteHobbyCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteHobbyCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobbyCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHobbyCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHobbyCliente.add(this.jLabelColumnasSelectReporteHobbyCliente, this.gridBagConstraintsHobbyCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteHobbyCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteHobbyCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteHobbyCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteHobbyCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHobbyCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHobbyCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteHobbyCliente=new JScrollPane(this.jListColumnasSelectReporteHobbyCliente);
			
			this.jScrollColumnasSelectReporteHobbyCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHobbyCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHobbyCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobbyCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHobbyCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoHobbyCliente.add(this.jListColumnasSelectReporteHobbyCliente, this.gridBagConstraintsHobbyCliente);
		this.jPanelReporteDinamicoHobbyCliente.add(this.jScrollColumnasSelectReporteHobbyCliente, this.gridBagConstraintsHobbyCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteHobbyCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteHobbyCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteHobbyCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteHobbyCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteHobbyCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteHobbyCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHobbyCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHobbyCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteHobbyCliente=new JScrollPane(this.jListRelacionesSelectReporteHobbyCliente);
			
			this.jScrollRelacionesSelectReporteHobbyCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHobbyCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHobbyCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoHobbyCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoHobbyCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoHobbyCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoHobbyCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoHobbyCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoHobbyCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHobbyCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHobbyCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoHobbyCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoHobbyCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoHobbyCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHobbyCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHobbyCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoHobbyCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoHobbyCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobbyCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHobbyCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHobbyCliente.add(this.jLabelGenerarExcelReporteDinamicoHobbyCliente, this.gridBagConstraintsHobbyCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoHobbyCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoHobbyCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoHobbyCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoHobbyCliente.setToolTipText("Generar EXCEL"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		//this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsHobbyCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsHobbyCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoHobbyCliente.add(this.jButtonGenerarExcelReporteDinamicoHobbyCliente, this.gridBagConstraintsHobbyCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobbyCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHobbyCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHobbyCliente.add(this.jComboBoxTiposReportesDinamicoHobbyCliente, this.gridBagConstraintsHobbyCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoHobbyCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoHobbyCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobbyCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHobbyCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHobbyCliente.add(this.jLabelTiposArchivoReporteDinamicoHobbyCliente, this.gridBagConstraintsHobbyCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobbyCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHobbyCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHobbyCliente.add(this.jComboBoxTiposArchivosReportesDinamicoHobbyCliente, this.gridBagConstraintsHobbyCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoHobbyCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoHobbyCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoHobbyCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoHobbyCliente.setToolTipText("Generar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobbyCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHobbyCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHobbyCliente.add(this.jButtonGenerarReporteDinamicoHobbyCliente, this.gridBagConstraintsHobbyCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoHobbyCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoHobbyCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoHobbyCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoHobbyCliente.setToolTipText("Cancelar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobbyCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHobbyCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHobbyCliente.add(this.jButtonCerrarReporteDinamicoHobbyCliente, this.gridBagConstraintsHobbyCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalHobbyCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoHobbyCliente= new JScrollPane(jPanelReporteDinamicoHobbyCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoHobbyCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHobbyCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHobbyCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Hobby Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsHobbyCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoHobbyCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoHobbyCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalHobbyCliente);
		this.jInternalFrameReporteDinamicoHobbyCliente.getContentPane().add(this.jScrollPanelReporteDinamicoHobbyCliente, this.gridBagConstraintsHobbyCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionHobbyCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionHobbyCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionHobbyCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionHobbyCliente.setName("jPanelImportacionHobbyCliente"); 
		
		this.jPanelImportacionHobbyCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHobbyCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHobbyCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionHobbyCliente.setLayout(gridaBagLayoutImportacionHobbyCliente);
		
		
		this.jInternalFrameImportacionHobbyCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionHobbyCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionHobbyCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHobbyCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionHobbyCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHobbyCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHobbyCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionHobbyCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHobbyCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHobbyCliente.setResizable(true);
	    this.jInternalFrameImportacionHobbyCliente.setClosable(true);
	    this.jInternalFrameImportacionHobbyCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionHobbyCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHobbyCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHobbyCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionHobbyCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHobbyCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHobbyCliente.setResizable(true);
	    this.jInternalFrameImportacionHobbyCliente.setClosable(true);
	    this.jInternalFrameImportacionHobbyCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionHobbyCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHobbyCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHobbyCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Hobby Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionHobbyCliente = new JLabelMe();

		this.jLabelArchivoImportacionHobbyCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobbyCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsHobbyCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHobbyCliente.add(this.jLabelArchivoImportacionHobbyCliente, this.gridBagConstraintsHobbyCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionHobbyCliente = new JFileChooser();		
		this.jFileChooserImportacionHobbyCliente.setToolTipText("ESCOGER ARCHIVO"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionHobbyCliente = new JButtonMe();
		this.jButtonAbrirImportacionHobbyCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionHobbyCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionHobbyCliente.setToolTipText("Generar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobbyCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsHobbyCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHobbyCliente.add(this.jButtonAbrirImportacionHobbyCliente, this.gridBagConstraintsHobbyCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionHobbyCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionHobbyCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobbyCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsHobbyCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHobbyCliente.add(this.jLabelPathArchivoImportacionHobbyCliente, this.gridBagConstraintsHobbyCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionHobbyCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionHobbyCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHobbyCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHobbyCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobbyCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsHobbyCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHobbyCliente.add(this.jTextFieldPathArchivoImportacionHobbyCliente, this.gridBagConstraintsHobbyCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionHobbyCliente = new JButtonMe();
		this.jButtonGenerarImportacionHobbyCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionHobbyCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionHobbyCliente.setToolTipText("Generar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobbyCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsHobbyCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHobbyCliente.add(this.jButtonGenerarImportacionHobbyCliente, this.gridBagConstraintsHobbyCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionHobbyCliente = new JButtonMe();
		this.jButtonCerrarImportacionHobbyCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionHobbyCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionHobbyCliente.setToolTipText("Cancelar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobbyCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsHobbyCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHobbyCliente.add(this.jButtonCerrarImportacionHobbyCliente, this.gridBagConstraintsHobbyCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalHobbyCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionHobbyCliente= new JScrollPane(jPanelImportacionHobbyCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsHobbyCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionHobbyCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionHobbyCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalHobbyCliente);
		this.jInternalFrameImportacionHobbyCliente.getContentPane().add(this.jScrollPanelImportacionHobbyCliente, this.gridBagConstraintsHobbyCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByHobbyCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByHobbyCliente = new JButtonMe();
			this.jButtonAbrirOrderByHobbyCliente.setText("Orden");
			this.jButtonAbrirOrderByHobbyCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHobbyCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByHobbyCliente";
			inputMap = this.jButtonAbrirOrderByHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByHobbyCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByHobbyCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByHobbyCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByHobbyCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByHobbyCliente.setName("jPanelOrderByHobbyCliente"); 
			
			this.jPanelOrderByHobbyCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHobbyCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHobbyCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByHobbyCliente.setLayout(gridaBagLayoutOrderByHobbyCliente);
			
			
			this.jTableDatosHobbyClienteOrderBy = new JTableMe();        
			this.jTableDatosHobbyClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosHobbyClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosHobbyClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosHobbyClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosHobbyClienteOrderBy.setViewportView(this.jTableDatosHobbyClienteOrderBy);
			this.jTableDatosHobbyClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosHobbyClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByHobbyCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByHobbyCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByHobbyCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteHobbyCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByHobbyCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByHobbyCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByHobbyCliente.setTitle("Orden");
			this.jInternalFrameOrderByHobbyCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByHobbyCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByHobbyCliente.setResizable(true);
			this.jInternalFrameOrderByHobbyCliente.setClosable(true);
			this.jInternalFrameOrderByHobbyCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByHobbyCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHobbyCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHobbyCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Hobby Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsHobbyCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsHobbyCliente.ipady =150;
				
			this.jPanelOrderByHobbyCliente.add(jScrollPanelDatosHobbyClienteOrderBy, this.gridBagConstraintsHobbyCliente);//this.jTableDatosHobbyClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByHobbyCliente = new JButtonMe();
			this.jButtonCerrarOrderByHobbyCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByHobbyCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByHobbyCliente.setToolTipText("Cancelar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsHobbyCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByHobbyCliente.add(this.jButtonCerrarOrderByHobbyCliente, this.gridBagConstraintsHobbyCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalHobbyCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByHobbyCliente= new JScrollPane(jPanelOrderByHobbyCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsHobbyCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByHobbyCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByHobbyCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalHobbyCliente);
			
			this.jInternalFrameOrderByHobbyCliente.getContentPane().add(this.jScrollPanelOrderByHobbyCliente, this.gridBagConstraintsHobbyCliente);			
		
		} else {
			this.jButtonAbrirOrderByHobbyCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.hobbyclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosHobbyCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosHobbyCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosHobbyCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosHobbyCliente.getRowHeight();//HobbyClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > HobbyClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHobbyCliente.isSelected()) {
					iHeightTable=HobbyClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HobbyClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HobbyClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > HobbyClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHobbyCliente.isSelected()) {
					iHeightTable=HobbyClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HobbyClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HobbyClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosHobbyCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHobbyCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHobbyCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosHobbyCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHobbyCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHobbyCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByHobbyCliente!=null && this.jInternalFrameOrderByHobbyCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByHobbyCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByHobbyCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByHobbyCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByHobbyCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByHobbyCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByHobbyCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByHobbyCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosHobbyCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHobbyCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHobbyCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=hobbyclienteLogic.getHobbyClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=hobbyclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<HobbyCliente> TraerHobbyClienteBeans(List<HobbyCliente> hobbyclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(HobbyCliente hobbycliente:hobbyclientes) {
					
				if(!(HobbyClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || HobbyClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					hobbycliente.setsDetalleGeneralEntityReporte(HobbyClienteConstantesFunciones.getHobbyClienteDescripcion(hobbycliente));
										
						
					
						
					
				} else  {
							
					//hobbycliente.setsDetalleGeneralEntityReporte(hobbycliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//hobbyclientebeans.add(hobbyclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return hobbyclientes;
    }
	//PARA REPORTES FIN
}
