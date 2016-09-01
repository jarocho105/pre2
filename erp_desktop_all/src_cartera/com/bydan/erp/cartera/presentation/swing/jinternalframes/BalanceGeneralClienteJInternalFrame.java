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
import com.bydan.erp.cartera.util.BalanceGeneralClienteConstantesFunciones;

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
public class BalanceGeneralClienteJInternalFrame extends BalanceGeneralClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarBalanceGeneralCliente;
	
	protected JMenuBar jmenuBarBalanceGeneralCliente;
	
	protected JMenu jmenuBalanceGeneralCliente;
	protected JMenu jmenuDatosBalanceGeneralCliente;
	protected JMenu jmenuArchivoBalanceGeneralCliente;
	protected JMenu jmenuAccionesBalanceGeneralCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosBalanceGeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBalanceGeneralCliente;	
	protected GridBagConstraints gridBagConstraintsBalanceGeneralCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public BalanceGeneralClienteDetalleFormJInternalFrame jInternalFrameDetalleFormBalanceGeneralCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoBalanceGeneralCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionBalanceGeneralCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public BalanceGeneralClienteSessionBean balancegeneralclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<BalanceGeneralCliente> balancegeneralclientes;		
	public List<BalanceGeneralCliente> balancegeneralclientesEliminados;	
	public List<BalanceGeneralCliente> balancegeneralclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByBalanceGeneralCliente;		
	protected JButton jButtonAbrirOrderByBalanceGeneralCliente;
	
	
	//protected JPanel jPanelOrderByBalanceGeneralCliente;
	//public JScrollPane jScrollPanelOrderByBalanceGeneralCliente;	
	//protected JButton jButtonCerrarOrderByBalanceGeneralCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public BalanceGeneralClienteLogic balancegeneralclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosBalanceGeneralCliente;
	public JScrollPane jScrollPanelDatosEdicionBalanceGeneralCliente;
	public JScrollPane jScrollPanelDatosGeneralBalanceGeneralCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosBalanceGeneralClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoBalanceGeneralCliente;
	//public JScrollPane jScrollPanelImportacionBalanceGeneralCliente;
	
	
	
	protected JPanel jPanelAccionesBalanceGeneralCliente;
	
    protected JPanel jPanelPaginacionBalanceGeneralCliente;
    protected JPanel jPanelParametrosReportesBalanceGeneralCliente;
	protected JPanel jPanelParametrosReportesAccionesBalanceGeneralCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1BalanceGeneralCliente;
	protected JPanel jPanelParametrosAuxiliar2BalanceGeneralCliente;
	protected JPanel jPanelParametrosAuxiliar3BalanceGeneralCliente;
	protected JPanel jPanelParametrosAuxiliar4BalanceGeneralCliente;
	//protected JPanel jPanelParametrosAuxiliar5BalanceGeneralCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoBalanceGeneralCliente;
	//protected JPanel jPanelImportacionBalanceGeneralCliente;
	
	
	public JTable jTableDatosBalanceGeneralCliente;
	
	
	
	//public JTable jTableDatosBalanceGeneralClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoBalanceGeneralCliente;
	protected JButton jButtonDuplicarBalanceGeneralCliente;
	protected JButton jButtonCopiarBalanceGeneralCliente;
	protected JButton jButtonVerFormBalanceGeneralCliente;
	protected JButton jButtonNuevoRelacionesBalanceGeneralCliente;
	protected JButton jButtonModificarBalanceGeneralCliente;
	
    protected JButton jButtonGuardarCambiosTablaBalanceGeneralCliente;
	protected JButton jButtonCerrarBalanceGeneralCliente;
	
	
	protected JButton jButtonRecargarInformacionBalanceGeneralCliente;
	protected JButton jButtonProcesarInformacionBalanceGeneralCliente;
	
	
	protected JButton jButtonAnterioresBalanceGeneralCliente;
	protected JButton jButtonSiguientesBalanceGeneralCliente;
	protected JButton jButtonNuevoGuardarCambiosBalanceGeneralCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoBalanceGeneralCliente;
	//protected JButton jButtonCerrarReporteDinamicoBalanceGeneralCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoBalanceGeneralCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionBalanceGeneralCliente;
	//protected JButton jButtonGenerarImportacionBalanceGeneralCliente;
	//protected JButton jButtonCerrarImportacionBalanceGeneralCliente;
	//protected JFileChooser jFileChooserImportacionBalanceGeneralCliente;
	//protected File fileImportacionBalanceGeneralCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBalanceGeneralCliente;
	protected JButton jButtonDuplicarToolBarBalanceGeneralCliente;
	protected JButton jButtonNuevoRelacionesToolBarBalanceGeneralCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarBalanceGeneralCliente;
	protected JButton jButtonCopiarToolBarBalanceGeneralCliente;
	protected JButton jButtonVerFormToolBarBalanceGeneralCliente;
	public JButton jButtonGuardarCambiosTablaToolBarBalanceGeneralCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarBalanceGeneralCliente;
	protected JButton jButtonCerrarToolBarBalanceGeneralCliente;
	
	protected JButton jButtonRecargarInformacionToolBarBalanceGeneralCliente;
	protected JButton jButtonProcesarInformacionToolBarBalanceGeneralCliente;
	protected JButton jButtonAnterioresToolBarBalanceGeneralCliente;
	protected JButton jButtonSiguientesToolBarBalanceGeneralCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarBalanceGeneralCliente;
	protected JButton jButtonAbrirOrderByToolBarBalanceGeneralCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBalanceGeneralCliente;
	protected JMenuItem jMenuItemDuplicarBalanceGeneralCliente;
	protected JMenuItem jMenuItemNuevoRelacionesBalanceGeneralCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosBalanceGeneralCliente;
	protected JMenuItem jMenuItemCopiarBalanceGeneralCliente;
	protected JMenuItem jMenuItemVerFormBalanceGeneralCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaBalanceGeneralCliente;
	protected JMenuItem jMenuItemCerrarBalanceGeneralCliente;
	protected JMenuItem jMenuItemDetalleCerrarBalanceGeneralCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByBalanceGeneralCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarBalanceGeneralCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionBalanceGeneralCliente;
	protected JMenuItem jMenuItemProcesarInformacionBalanceGeneralCliente;
	protected JMenuItem jMenuItemAnterioresBalanceGeneralCliente;
	protected JMenuItem jMenuItemSiguientesBalanceGeneralCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBalanceGeneralCliente;
	protected JMenuItem jMenuItemAbrirOrderByBalanceGeneralCliente;
	protected JMenuItem jMenuItemMostrarOcultarBalanceGeneralCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBalanceGeneralCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosBalanceGeneralCliente;
	protected JCheckBox jCheckBoxSeleccionadosBalanceGeneralCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaBalanceGeneralCliente;
	protected JCheckBox jCheckBoxConGraficoReporteBalanceGeneralCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesBalanceGeneralCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesBalanceGeneralCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoBalanceGeneralCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoBalanceGeneralCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesBalanceGeneralCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionBalanceGeneralCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBalanceGeneralCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBalanceGeneralCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarBalanceGeneralCliente;
	protected JTextField jTextFieldValorCampoGeneralBalanceGeneralCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteBalanceGeneralCliente;
	//public JList<Reporte> jListColumnasSelectReporteBalanceGeneralCliente;
	//public JScrollPane jScrollColumnasSelectReporteBalanceGeneralCliente;
	
	//public JLabel jLabelRelacionesSelectReporteBalanceGeneralCliente;
	//public JList<Reporte> jListRelacionesSelectReporteBalanceGeneralCliente;
	//public JScrollPane jScrollRelacionesSelectReporteBalanceGeneralCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoBalanceGeneralCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoBalanceGeneralCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoBalanceGeneralCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoBalanceGeneralCliente;
	
		
	//public JLabel jLabelArchivoImportacionBalanceGeneralCliente;	
	//public JLabel jLabelPathArchivoImportacionBalanceGeneralCliente;
	//protected JTextField jTextFieldPathArchivoImportacionBalanceGeneralCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoBalanceGeneralCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoBalanceGeneralCliente;
	
	//public JLabel jLabelColumnaCategoriaValorBalanceGeneralCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorBalanceGeneralCliente;
	
	//public JLabel jLabelColumnasValoresGraficoBalanceGeneralCliente;
	//public JList<Reporte> jListColumnasValoresGraficoBalanceGeneralCliente;
	//public JScrollPane jScrollColumnasValoresGraficoBalanceGeneralCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoBalanceGeneralCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoBalanceGeneralCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasBalanceGeneralCliente;
	public JPanel jPanelFK_IdClienteBalanceGeneralCliente;
	public JButton jButtonFK_IdClienteBalanceGeneralCliente;
	
	public JPanel jPanelid_clienteFK_IdClienteBalanceGeneralCliente;
	public JLabel jLabelid_clienteFK_IdClienteBalanceGeneralCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteBalanceGeneralCliente;
	public JButton jButtonid_clienteFK_IdClienteBalanceGeneralCliente= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteBalanceGeneralClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteBalanceGeneralClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteBalanceGeneralCliente;
	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public BalanceGeneralClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("BalanceGeneralCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BalanceGeneralClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BalanceGeneralCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BalanceGeneralClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BalanceGeneralCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BalanceGeneralClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BalanceGeneralCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionBalanceGeneralCliente)	{
		this.jButtonRecargarInformacionBalanceGeneralCliente = jButtonRecargarInformacionBalanceGeneralCliente;
	}
	
	public JButton getjButtonProcesarInformacionBalanceGeneralCliente() {
		return this.jButtonProcesarInformacionBalanceGeneralCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBalanceGeneralCliente)	{
		this.jButtonProcesarInformacionBalanceGeneralCliente = jButtonProcesarInformacionBalanceGeneralCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionBalanceGeneralCliente() {
		return this.jButtonRecargarInformacionBalanceGeneralCliente;
	}
	
	
	public List<BalanceGeneralCliente> getbalancegeneralclientes() {
		return this.balancegeneralclientes;
	}

	public void setbalancegeneralclientes(List<BalanceGeneralCliente> balancegeneralclientes) {
		this.balancegeneralclientes = balancegeneralclientes;
	}
	
	public List<BalanceGeneralCliente> getbalancegeneralclientesAux() {
		return this.balancegeneralclientesAux;
	}

	public void setbalancegeneralclientesAux(List<BalanceGeneralCliente> balancegeneralclientesAux) {
		this.balancegeneralclientesAux = balancegeneralclientesAux;
	}
	
	public List<BalanceGeneralCliente> getbalancegeneralclientesEliminados() {
		return this.balancegeneralclientesEliminados;
	}

	public void setBalanceGeneralClientesEliminados(List<BalanceGeneralCliente> balancegeneralclientesEliminados) {
		this.balancegeneralclientesEliminados = balancegeneralclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarBalanceGeneralCliente() {
		return jComboBoxTiposSeleccionarBalanceGeneralCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarBalanceGeneralCliente(
			JComboBox jComboBoxTiposSeleccionarBalanceGeneralCliente) {
		this.jComboBoxTiposSeleccionarBalanceGeneralCliente = jComboBoxTiposSeleccionarBalanceGeneralCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarBalanceGeneralCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarBalanceGeneralCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarBalanceGeneralCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralBalanceGeneralCliente() {
		return jTextFieldValorCampoGeneralBalanceGeneralCliente;
	}

	public void setjTextFieldValorCampoGeneralBalanceGeneralCliente(
			JTextField jTextFieldValorCampoGeneralBalanceGeneralCliente) {
		this.jTextFieldValorCampoGeneralBalanceGeneralCliente = jTextFieldValorCampoGeneralBalanceGeneralCliente;
	}

	public void setBorderResaltarValorCampoGeneralBalanceGeneralCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBalanceGeneralCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralBalanceGeneralCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosBalanceGeneralCliente() {
		return this.jCheckBoxSeleccionarTodosBalanceGeneralCliente;
	}

	public void setjCheckBoxSeleccionarTodosBalanceGeneralCliente(
			JCheckBox jCheckBoxSeleccionarTodosBalanceGeneralCliente) {
		this.jCheckBoxSeleccionarTodosBalanceGeneralCliente = jCheckBoxSeleccionarTodosBalanceGeneralCliente;
	}

	public void setBorderResaltarSeleccionarTodosBalanceGeneralCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBalanceGeneralCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosBalanceGeneralCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosBalanceGeneralCliente() {
		return this.jCheckBoxSeleccionadosBalanceGeneralCliente;
	}

	public void setjCheckBoxSeleccionadosBalanceGeneralCliente(
			JCheckBox jCheckBoxSeleccionadosBalanceGeneralCliente) {
		this.jCheckBoxSeleccionadosBalanceGeneralCliente = jCheckBoxSeleccionadosBalanceGeneralCliente;
	}
	
	public void setBorderResaltarSeleccionadosBalanceGeneralCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBalanceGeneralCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosBalanceGeneralCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesBalanceGeneralCliente() {
		return this.jComboBoxTiposArchivosReportesBalanceGeneralCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesBalanceGeneralCliente(
			JComboBox jComboBoxTiposArchivosReportesBalanceGeneralCliente) {
		this.jComboBoxTiposArchivosReportesBalanceGeneralCliente = jComboBoxTiposArchivosReportesBalanceGeneralCliente;
	}

	public void setBorderResaltarTiposArchivosReportesBalanceGeneralCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBalanceGeneralCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesBalanceGeneralCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesBalanceGeneralCliente() {
		return this.jComboBoxTiposReportesBalanceGeneralCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesBalanceGeneralCliente(
			JComboBox jComboBoxTiposReportesBalanceGeneralCliente) {
		this.jComboBoxTiposReportesBalanceGeneralCliente = jComboBoxTiposReportesBalanceGeneralCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoBalanceGeneralCliente() {
	//	return jComboBoxTiposReportesDinamicoBalanceGeneralCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoBalanceGeneralCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoBalanceGeneralCliente) {
	//	this.jComboBoxTiposReportesDinamicoBalanceGeneralCliente = jComboBoxTiposReportesDinamicoBalanceGeneralCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoBalanceGeneralCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoBalanceGeneralCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoBalanceGeneralCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoBalanceGeneralCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoBalanceGeneralCliente = jComboBoxTiposArchivosReportesDinamicoBalanceGeneralCliente;
	//}
	
	public void setBorderResaltarTiposReportesBalanceGeneralCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBalanceGeneralCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesBalanceGeneralCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesBalanceGeneralCliente() {
		return this.jComboBoxTiposGraficosReportesBalanceGeneralCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesBalanceGeneralCliente(
			JComboBox jComboBoxTiposGraficosReportesBalanceGeneralCliente) {
		this.jComboBoxTiposGraficosReportesBalanceGeneralCliente = jComboBoxTiposGraficosReportesBalanceGeneralCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesBalanceGeneralCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBalanceGeneralCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesBalanceGeneralCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionBalanceGeneralCliente() {
		return this.jComboBoxTiposPaginacionBalanceGeneralCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionBalanceGeneralCliente(
			JComboBox jComboBoxTiposPaginacionBalanceGeneralCliente) {
		this.jComboBoxTiposPaginacionBalanceGeneralCliente = jComboBoxTiposPaginacionBalanceGeneralCliente;
	}
	
	public void setBorderResaltarTiposPaginacionBalanceGeneralCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBalanceGeneralCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionBalanceGeneralCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesBalanceGeneralCliente() {
		return this.jComboBoxTiposRelacionesBalanceGeneralCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBalanceGeneralCliente() {
		return this.jComboBoxTiposAccionesBalanceGeneralCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBalanceGeneralCliente(
			JComboBox jComboBoxTiposRelacionesBalanceGeneralCliente) {
		this.jComboBoxTiposRelacionesBalanceGeneralCliente = jComboBoxTiposRelacionesBalanceGeneralCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBalanceGeneralCliente(
			JComboBox jComboBoxTiposAccionesBalanceGeneralCliente) {
		this.jComboBoxTiposAccionesBalanceGeneralCliente = jComboBoxTiposAccionesBalanceGeneralCliente;
	}
	
	public void setBorderResaltarTiposRelacionesBalanceGeneralCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBalanceGeneralCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesBalanceGeneralCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesBalanceGeneralCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBalanceGeneralCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesBalanceGeneralCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoBalanceGeneralCliente() {
	//	return jCheckBoxConGraficoDinamicoBalanceGeneralCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoBalanceGeneralCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoBalanceGeneralCliente) {
	//	this.jCheckBoxConGraficoDinamicoBalanceGeneralCliente = jCheckBoxConGraficoDinamicoBalanceGeneralCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoBalanceGeneralCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarBalanceGeneralCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoBalanceGeneralCliente .setBorder(borderResaltar);		
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
		this.balancegeneralclienteSessionBean=new BalanceGeneralClienteSessionBean();
		
		this.balancegeneralclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.balancegeneralclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.balancegeneralclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=BalanceGeneralClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=BalanceGeneralClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BalanceGeneralClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BalanceGeneralClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BalanceGeneralClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Balance General Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 3750) {
			iWidth=3750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.balancegeneralclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		BalanceGeneralClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("BalanceGeneralCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarBalanceGeneralCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarBalanceGeneralCliente,this.jTtoolBarBalanceGeneralCliente,
							"nuevo","nuevo","Nuevo"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarBalanceGeneralCliente,this.jTtoolBarBalanceGeneralCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarBalanceGeneralCliente,this.jTtoolBarBalanceGeneralCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarBalanceGeneralCliente,this.jTtoolBarBalanceGeneralCliente,
							"duplicar","duplicar","Duplicar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarBalanceGeneralCliente,this.jTtoolBarBalanceGeneralCliente,
							"copiar","copiar","Copiar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarBalanceGeneralCliente,this.jTtoolBarBalanceGeneralCliente,
							"ver_form","ver_form","Ver"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBalanceGeneralCliente,this.jTtoolBarBalanceGeneralCliente,
							"recargar","recargar","Recargar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBalanceGeneralCliente,this.jTtoolBarBalanceGeneralCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBalanceGeneralCliente,this.jTtoolBarBalanceGeneralCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarBalanceGeneralCliente,this.jTtoolBarBalanceGeneralCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarBalanceGeneralCliente,this.jTtoolBarBalanceGeneralCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarBalanceGeneralCliente,this.jTtoolBarBalanceGeneralCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarBalanceGeneralCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarBalanceGeneralCliente,this.jTtoolBarBalanceGeneralCliente,
							"cerrar","cerrar","Salir"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarBalanceGeneralCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarBalanceGeneralCliente;
			
				this.jButtonProcesarInformacionToolBarBalanceGeneralCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarBalanceGeneralCliente;
				
		//protected JButton jButtonModificarToolBarBalanceGeneralCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarBalanceGeneralCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuBalanceGeneralCliente=new JMenuMe("General");
		this.jmenuArchivoBalanceGeneralCliente=new JMenuMe("Archivo");
		this.jmenuAccionesBalanceGeneralCliente=new JMenuMe("Acciones");
		this.jmenuDatosBalanceGeneralCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBalanceGeneralCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBalanceGeneralCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBalanceGeneralCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarBalanceGeneralCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarBalanceGeneralCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarBalanceGeneralCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesBalanceGeneralCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesBalanceGeneralCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesBalanceGeneralCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosBalanceGeneralCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBalanceGeneralCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBalanceGeneralCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarBalanceGeneralCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarBalanceGeneralCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarBalanceGeneralCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormBalanceGeneralCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormBalanceGeneralCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormBalanceGeneralCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaBalanceGeneralCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaBalanceGeneralCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaBalanceGeneralCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBalanceGeneralCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBalanceGeneralCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBalanceGeneralCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionBalanceGeneralCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionBalanceGeneralCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionBalanceGeneralCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionBalanceGeneralCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionBalanceGeneralCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionBalanceGeneralCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresBalanceGeneralCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresBalanceGeneralCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresBalanceGeneralCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesBalanceGeneralCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesBalanceGeneralCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesBalanceGeneralCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByBalanceGeneralCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByBalanceGeneralCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByBalanceGeneralCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBalanceGeneralCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBalanceGeneralCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBalanceGeneralCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByBalanceGeneralCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByBalanceGeneralCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByBalanceGeneralCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBalanceGeneralCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBalanceGeneralCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBalanceGeneralCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosBalanceGeneralCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosBalanceGeneralCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosBalanceGeneralCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoBalanceGeneralCliente.add(this.jMenuItemCerrarBalanceGeneralCliente);
			
			this.jmenuAccionesBalanceGeneralCliente.add(this.jMenuItemNuevoBalanceGeneralCliente);
			this.jmenuAccionesBalanceGeneralCliente.add(this.jMenuItemNuevoGuardarCambiosBalanceGeneralCliente);
			this.jmenuAccionesBalanceGeneralCliente.add(this.jMenuItemNuevoRelacionesBalanceGeneralCliente);
			this.jmenuAccionesBalanceGeneralCliente.add(this.jMenuItemGuardarCambiosTablaBalanceGeneralCliente);		
			this.jmenuAccionesBalanceGeneralCliente.add(this.jMenuItemDuplicarBalanceGeneralCliente);		
			this.jmenuAccionesBalanceGeneralCliente.add(this.jMenuItemCopiarBalanceGeneralCliente);		
			this.jmenuAccionesBalanceGeneralCliente.add(this.jMenuItemVerFormBalanceGeneralCliente);		
			
			this.jmenuDatosBalanceGeneralCliente.add(this.jMenuItemRecargarInformacionBalanceGeneralCliente);				
			this.jmenuDatosBalanceGeneralCliente.add(this.jMenuItemAnterioresBalanceGeneralCliente);				
			this.jmenuDatosBalanceGeneralCliente.add(this.jMenuItemSiguientesBalanceGeneralCliente);				
			this.jmenuDatosBalanceGeneralCliente.add(this.jMenuItemAbrirOrderByBalanceGeneralCliente);				
			this.jmenuDatosBalanceGeneralCliente.add(this.jMenuItemMostrarOcultarBalanceGeneralCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesBalanceGeneralCliente.add(this.jMenuItemGuardarCambiosBalanceGeneralCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarBalanceGeneralCliente.add(this.jmenuArchivoBalanceGeneralCliente);		
			this.jmenuBarBalanceGeneralCliente.add(this.jmenuAccionesBalanceGeneralCliente);		
			this.jmenuBarBalanceGeneralCliente.add(this.jmenuDatosBalanceGeneralCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarBalanceGeneralCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasBalanceGeneralCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteBalanceGeneralCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteBalanceGeneralCliente.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteBalanceGeneralCliente= new JButtonMe();
		this.jButtonFK_IdClienteBalanceGeneralCliente.setText("Buscar");
		this.jButtonFK_IdClienteBalanceGeneralCliente.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteBalanceGeneralCliente,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteBalanceGeneralCliente = new JLabelMe();
		jLabelid_clienteFK_IdClienteBalanceGeneralCliente.setText("Cliente :");
		jLabelid_clienteFK_IdClienteBalanceGeneralCliente.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteBalanceGeneralCliente= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteBalanceGeneralCliente= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteBalanceGeneralCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteBalanceGeneralCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteBalanceGeneralCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteBalanceGeneralCliente.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteBalanceGeneralCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteBalanceGeneralCliente.setFocusable(false);


		this.jTabbedPaneBusquedasBalanceGeneralCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasBalanceGeneralCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasBalanceGeneralCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasBalanceGeneralCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasBalanceGeneralCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleBalanceGeneralCliente = new BalanceGeneralClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Balance General Cliente DATOS");
			this.jInternalFrameDetalleFormBalanceGeneralCliente = new BalanceGeneralClienteDetalleFormJInternalFrame(jDesktopPane,this.balancegeneralclienteSessionBean.getConGuardarRelaciones(),this.balancegeneralclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormBalanceGeneralCliente = null;//new BalanceGeneralClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBalanceGeneralCliente= new GridBagLayout();
		
		
		this.jTableDatosBalanceGeneralCliente = new JTableMe();      
		
		String sToolTipBalanceGeneralCliente="";
		sToolTipBalanceGeneralCliente=BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBalanceGeneralCliente+="(Cartera.BalanceGeneralCliente)";
		}
		
		if(!this.balancegeneralclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipBalanceGeneralCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosBalanceGeneralCliente.setToolTipText(sToolTipBalanceGeneralCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosBalanceGeneralCliente);
		this.jTableDatosBalanceGeneralCliente.setAutoCreateRowSorter(true);
		this.jTableDatosBalanceGeneralCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosBalanceGeneralCliente.setRowSelectionAllowed(true);
		this.jTableDatosBalanceGeneralCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosBalanceGeneralCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoBalanceGeneralCliente = new JButtonMe();
		this.jButtonDuplicarBalanceGeneralCliente = new JButtonMe();
		this.jButtonCopiarBalanceGeneralCliente = new JButtonMe();
		this.jButtonVerFormBalanceGeneralCliente = new JButtonMe();
		this.jButtonNuevoRelacionesBalanceGeneralCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaBalanceGeneralCliente = new JButtonMe();
		this.jButtonCerrarBalanceGeneralCliente = new JButtonMe();
		
		this.jScrollPanelDatosBalanceGeneralCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralBalanceGeneralCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesBalanceGeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Balance General Cliente";
		
		if(!this.balancegeneralclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Balance General Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosBalanceGeneralCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBalanceGeneralCliente.setToolTipText("Acciones");
        this.jPanelAccionesBalanceGeneralCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoBalanceGeneralCliente=new ReporteDinamicoJInternalFrame(BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoBalanceGeneralCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionBalanceGeneralCliente=new ImportacionJInternalFrame(BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionBalanceGeneralCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByBalanceGeneralCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByBalanceGeneralCliente.setText("Orden");
		this.jButtonAbrirOrderByBalanceGeneralCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBalanceGeneralCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByBalanceGeneralCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBalanceGeneralCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBalanceGeneralCliente,false,this);
			
			//this.cargarOrderByBalanceGeneralCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBalanceGeneralCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBalanceGeneralCliente,true,this);
			
			//this.cargarOrderByBalanceGeneralCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosBalanceGeneralCliente.setMinimumSize(new Dimension(400,50));//3730
		this.jTableDatosBalanceGeneralCliente.setMaximumSize(new Dimension(400,50));//3730
		this.jTableDatosBalanceGeneralCliente.setPreferredSize(new Dimension(400,50));//3730
		
		this.jScrollPanelDatosBalanceGeneralCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosBalanceGeneralCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosBalanceGeneralCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoBalanceGeneralCliente.setText("Nuevo");
		this.jButtonDuplicarBalanceGeneralCliente.setText("Duplicar");
		this.jButtonCopiarBalanceGeneralCliente.setText("Copiar");
		this.jButtonVerFormBalanceGeneralCliente.setText("Ver");
		this.jButtonNuevoRelacionesBalanceGeneralCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaBalanceGeneralCliente.setText("Guardar");
		this.jButtonCerrarBalanceGeneralCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBalanceGeneralCliente,"nuevo_button","Nuevo",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarBalanceGeneralCliente,"duplicar_button","Duplicar",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarBalanceGeneralCliente,"copiar_button","Copiar",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormBalanceGeneralCliente,"ver_form","Ver",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesBalanceGeneralCliente,"nuevorelaciones_button","Nuevo Rel",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBalanceGeneralCliente,"guardarcambiostabla_button","Guardar",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBalanceGeneralCliente,"cerrar_button","Salir",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoBalanceGeneralCliente.setToolTipText("Nuevo"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarBalanceGeneralCliente.setToolTipText("Duplicar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarBalanceGeneralCliente.setToolTipText("Copiar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormBalanceGeneralCliente.setToolTipText("Ver"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesBalanceGeneralCliente.setToolTipText("Nuevo Rel"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaBalanceGeneralCliente.setToolTipText("Guardar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBalanceGeneralCliente.setToolTipText("Salir"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBalanceGeneralCliente";
		inputMap = this.jButtonNuevoBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBalanceGeneralCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBalanceGeneralCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarBalanceGeneralCliente";
		inputMap = this.jButtonDuplicarBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarBalanceGeneralCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarBalanceGeneralCliente"));
		
		//COPIAR
		sMapKey = "CopiarBalanceGeneralCliente";
		inputMap = this.jButtonCopiarBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarBalanceGeneralCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarBalanceGeneralCliente"));
		
		//VEr FORM
		sMapKey = "VerFormBalanceGeneralCliente";
		inputMap = this.jButtonVerFormBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormBalanceGeneralCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormBalanceGeneralCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesBalanceGeneralCliente";
		inputMap = this.jButtonNuevoRelacionesBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesBalanceGeneralCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesBalanceGeneralCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarBalanceGeneralCliente";
		inputMap = this.jButtonModificarBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarBalanceGeneralCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarBalanceGeneralCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarBalanceGeneralCliente";
		inputMap = this.jButtonCerrarBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBalanceGeneralCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBalanceGeneralCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBalanceGeneralCliente";
		inputMap = this.jButtonGuardarCambiosTablaBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBalanceGeneralCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBalanceGeneralCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesBalanceGeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesBalanceGeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionBalanceGeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1BalanceGeneralCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2BalanceGeneralCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3BalanceGeneralCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4BalanceGeneralCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5BalanceGeneralCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesBalanceGeneralCliente.setName("jPanelParametrosReportesBalanceGeneralCliente"); 
		
		this.jPanelParametrosReportesAccionesBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesBalanceGeneralCliente.setName("jPanelParametrosReportesAccionesBalanceGeneralCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionBalanceGeneralCliente = new JButtonMe();
		this.jButtonRecargarInformacionBalanceGeneralCliente.setText("Recargar");
		this.jButtonRecargarInformacionBalanceGeneralCliente.setToolTipText("Recargar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionBalanceGeneralCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionBalanceGeneralCliente = new JButtonMe();
		this.jButtonProcesarInformacionBalanceGeneralCliente.setText("Procesar");
		this.jButtonProcesarInformacionBalanceGeneralCliente.setToolTipText("Procesar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionBalanceGeneralCliente.setVisible(false);
			
		this.jButtonProcesarInformacionBalanceGeneralCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBalanceGeneralCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBalanceGeneralCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesBalanceGeneralCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBalanceGeneralCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesBalanceGeneralCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesBalanceGeneralCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBalanceGeneralCliente.setText("TIPO");       
		this.jComboBoxTiposReportesBalanceGeneralCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesBalanceGeneralCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBalanceGeneralCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesBalanceGeneralCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionBalanceGeneralCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionBalanceGeneralCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionBalanceGeneralCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesBalanceGeneralCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesBalanceGeneralCliente.setText("Accion");
		this.jComboBoxTiposRelacionesBalanceGeneralCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesBalanceGeneralCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBalanceGeneralCliente.setText("Accion");
		this.jComboBoxTiposAccionesBalanceGeneralCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarBalanceGeneralCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarBalanceGeneralCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarBalanceGeneralCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralBalanceGeneralCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralBalanceGeneralCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBalanceGeneralCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBalanceGeneralCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesBalanceGeneralCliente = new JLabelMe();
		
		this.jLabelAccionesBalanceGeneralCliente.setText("Acciones");		
		this.jLabelAccionesBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosBalanceGeneralCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosBalanceGeneralCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosBalanceGeneralCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosBalanceGeneralCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosBalanceGeneralCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosBalanceGeneralCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaBalanceGeneralCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaBalanceGeneralCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaBalanceGeneralCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteBalanceGeneralCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteBalanceGeneralCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteBalanceGeneralCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresBalanceGeneralCliente = new JButtonMe();
		//this.jButtonAnterioresBalanceGeneralCliente.setText("<<");
        this.jButtonAnterioresBalanceGeneralCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresBalanceGeneralCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesBalanceGeneralCliente = new JButtonMe();
		//this.jButtonSiguientesBalanceGeneralCliente.setText(">>");
        this.jButtonSiguientesBalanceGeneralCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesBalanceGeneralCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosBalanceGeneralCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosBalanceGeneralCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosBalanceGeneralCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosBalanceGeneralCliente,"nuevoguardarcambios_button","Nue",this.balancegeneralclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosBalanceGeneralCliente";
		inputMap = this.jButtonNuevoGuardarCambiosBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosBalanceGeneralCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosBalanceGeneralCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionBalanceGeneralCliente";
		inputMap = this.jButtonRecargarInformacionBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionBalanceGeneralCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionBalanceGeneralCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesBalanceGeneralCliente";
		inputMap = this.jButtonSiguientesBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesBalanceGeneralCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesBalanceGeneralCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresBalanceGeneralCliente";
		inputMap = this.jButtonAnterioresBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresBalanceGeneralCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresBalanceGeneralCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasBalanceGeneralCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesBalanceGeneralCliente.setMinimumSize(new Dimension(this.getWidth(),BalanceGeneralClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BalanceGeneralClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBalanceGeneralCliente.setMaximumSize(new Dimension(this.getWidth(),BalanceGeneralClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BalanceGeneralClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBalanceGeneralCliente.setPreferredSize(new Dimension(this.getWidth(),BalanceGeneralClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BalanceGeneralClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionBalanceGeneralCliente = new GridBagLayout();

			this.jPanelPaginacionBalanceGeneralCliente.setLayout(gridaBagLayoutPaginacionBalanceGeneralCliente);						
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionBalanceGeneralCliente.add(this.jButtonAnterioresBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
					
						
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
			
			this.jPanelPaginacionBalanceGeneralCliente.add(this.jButtonNuevoGuardarCambiosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
						
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
			this.jPanelPaginacionBalanceGeneralCliente.add(this.jButtonSiguientesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = 1;
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBalanceGeneralCliente.add(this.jButtonNuevoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
						
			
			
			if(!this.balancegeneralclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
				this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsBalanceGeneralCliente.gridy = 1;
				this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionBalanceGeneralCliente.add(this.jButtonGuardarCambiosTablaBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
			}
			
			
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = 1;
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBalanceGeneralCliente.add(this.jButtonDuplicarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = 1;
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBalanceGeneralCliente.add(this.jButtonCopiarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = 1;
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBalanceGeneralCliente.add(this.jButtonVerFormBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = 1;
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionBalanceGeneralCliente.add(this.jButtonCerrarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
		
		
		this.jButtonRecargarInformacionBalanceGeneralCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBalanceGeneralCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBalanceGeneralCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesBalanceGeneralCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBalanceGeneralCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBalanceGeneralCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesBalanceGeneralCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBalanceGeneralCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBalanceGeneralCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesBalanceGeneralCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBalanceGeneralCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBalanceGeneralCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionBalanceGeneralCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBalanceGeneralCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBalanceGeneralCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesBalanceGeneralCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBalanceGeneralCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBalanceGeneralCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesBalanceGeneralCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBalanceGeneralCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBalanceGeneralCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarBalanceGeneralCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBalanceGeneralCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBalanceGeneralCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaBalanceGeneralCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBalanceGeneralCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBalanceGeneralCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteBalanceGeneralCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBalanceGeneralCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBalanceGeneralCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosBalanceGeneralCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBalanceGeneralCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBalanceGeneralCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosBalanceGeneralCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBalanceGeneralCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBalanceGeneralCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesBalanceGeneralCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesBalanceGeneralCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1BalanceGeneralCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2BalanceGeneralCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3BalanceGeneralCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4BalanceGeneralCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesBalanceGeneralCliente.setLayout(gridaBagParametrosReportesBalanceGeneralCliente);
			this.jPanelParametrosReportesAccionesBalanceGeneralCliente.setLayout(gridaBagParametrosReportesAccionesBalanceGeneralCliente);
			
			
			this.jPanelParametrosAuxiliar1BalanceGeneralCliente.setLayout(gridaBagParametrosAuxiliar1BalanceGeneralCliente);
			this.jPanelParametrosAuxiliar2BalanceGeneralCliente.setLayout(gridaBagParametrosAuxiliar2BalanceGeneralCliente);
			this.jPanelParametrosAuxiliar3BalanceGeneralCliente.setLayout(gridaBagParametrosAuxiliar3BalanceGeneralCliente);
			this.jPanelParametrosAuxiliar4BalanceGeneralCliente.setLayout(gridaBagParametrosAuxiliar4BalanceGeneralCliente);
			//this.jPanelParametrosAuxiliar5BalanceGeneralCliente.setLayout(gridaBagParametrosAuxiliar2BalanceGeneralCliente);			
			
			
			
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBalanceGeneralCliente.add(this.jButtonRecargarInformacionBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BalanceGeneralCliente.add(this.jComboBoxTiposPaginacionBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BalanceGeneralCliente.add(this.jCheckBoxConAltoMaximoTablaBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BalanceGeneralCliente.add(this.jComboBoxTiposArchivosReportesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBalanceGeneralCliente.add(this.jPanelParametrosAuxiliar1BalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBalanceGeneralCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4BalanceGeneralCliente.add(this.jComboBoxTiposReportesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);																		
			
			
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBalanceGeneralCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4BalanceGeneralCliente.add(this.jComboBoxTiposGraficosReportesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBalanceGeneralCliente.add(this.jPanelParametrosAuxiliar4BalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBalanceGeneralCliente.add(this.jComboBoxTiposReportesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBalanceGeneralCliente.add(this.jCheckBoxGenerarReporteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBalanceGeneralCliente.add(this.jPanelParametrosAuxiliar2BalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBalanceGeneralCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBalanceGeneralCliente.add(this.jLabelAccionesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
				this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesBalanceGeneralCliente.add(this.jButtonAbrirOrderByBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBalanceGeneralCliente.add(this.jComboBoxTiposSeleccionarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);			
			
			
			/*
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBalanceGeneralCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBalanceGeneralCliente.add(this.jCheckBoxSeleccionarTodosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBalanceGeneralCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBalanceGeneralCliente.add(this.jCheckBoxConGraficoReporteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBalanceGeneralCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BalanceGeneralCliente.add(this.jCheckBoxSeleccionarTodosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);															
				
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBalanceGeneralCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BalanceGeneralCliente.add(this.jCheckBoxSeleccionadosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);															
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBalanceGeneralCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BalanceGeneralCliente.add(this.jCheckBoxConGraficoReporteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBalanceGeneralCliente.add(this.jPanelParametrosAuxiliar3BalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBalanceGeneralCliente.add(this.jComboBoxTiposAccionesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
	
				
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBalanceGeneralCliente.add(this.jTextFieldValorCampoGeneralBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosBalanceGeneralCliente = new GridBagLayout();

			this.jScrollPanelDatosBalanceGeneralCliente.setLayout(gridaBagLayoutDatosBalanceGeneralCliente);
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
			this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
			
			this.jScrollPanelDatosBalanceGeneralCliente.add(this.jTableDatosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosBalanceGeneralCliente.setViewportView(this.jTableDatosBalanceGeneralCliente);
		this.jTableDatosBalanceGeneralCliente.setFillsViewportHeight(true);
		this.jTableDatosBalanceGeneralCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesBalanceGeneralCliente= new GridBagLayout();
		this.jPanelAccionesBalanceGeneralCliente.setLayout(gridaBagLayoutAccionesBalanceGeneralCliente);
		
		
		/*	
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
			
		this.jPanelAccionesBalanceGeneralCliente.add(this.jButtonNuevoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteBalanceGeneralCliente= new GridBagLayout();
		gridaBagLayoutFK_IdClienteBalanceGeneralCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteBalanceGeneralCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteBalanceGeneralCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteBalanceGeneralCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteBalanceGeneralCliente.setLayout(gridaBagLayoutFK_IdClienteBalanceGeneralCliente);

		gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		gridBagConstraintsBalanceGeneralCliente.gridx = 0;
		jPanelFK_IdClienteBalanceGeneralCliente.add(jLabelid_clienteFK_IdClienteBalanceGeneralCliente, gridBagConstraintsBalanceGeneralCliente);

		gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		gridBagConstraintsBalanceGeneralCliente.gridx = 1;
		jPanelFK_IdClienteBalanceGeneralCliente.add(jComboBoxid_clienteFK_IdClienteBalanceGeneralCliente, gridBagConstraintsBalanceGeneralCliente);


		gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsBalanceGeneralCliente.gridy = 0;
		gridBagConstraintsBalanceGeneralCliente.gridx = 0;
		jPanelFK_IdClienteBalanceGeneralCliente.add(this.jButtonBuscarFK_IdClienteid_clienteBalanceGeneralCliente, gridBagConstraintsBalanceGeneralCliente);

		gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBalanceGeneralCliente.gridy = 1;
		gridBagConstraintsBalanceGeneralCliente.gridx =1;
		jPanelFK_IdClienteBalanceGeneralCliente.add(jButtonFK_IdClienteBalanceGeneralCliente, gridBagConstraintsBalanceGeneralCliente);

		jTabbedPaneBusquedasBalanceGeneralCliente.addTab("1.-Por Cliente ", jPanelFK_IdClienteBalanceGeneralCliente);
		jTabbedPaneBusquedasBalanceGeneralCliente.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBalanceGeneralCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBalanceGeneralCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.balancegeneralclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();						
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;		
			//this.gridBagConstraintsBalanceGeneralCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBalanceGeneralCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;		
		//this.gridBagConstraintsBalanceGeneralCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsBalanceGeneralCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsBalanceGeneralCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;		
			this.gridBagConstraintsBalanceGeneralCliente.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsBalanceGeneralCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);								
		
		
		/*
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		*/		
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBalanceGeneralCliente.gridx =0;
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBalanceGeneralCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
				
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(BalanceGeneralClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosBalanceGeneralCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBalanceGeneralCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosBalanceGeneralCliente.setLayout(gridaBagLayoutBusquedasParametrosBalanceGeneralCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralBalanceGeneralCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBalanceGeneralCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBalanceGeneralCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBalanceGeneralCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
			
			
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
			
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralBalanceGeneralCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoBalanceGeneralCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoBalanceGeneralCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoBalanceGeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoBalanceGeneralCliente.setName("jPanelReporteDinamicoBalanceGeneralCliente"); 
		
		this.jPanelReporteDinamicoBalanceGeneralCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBalanceGeneralCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBalanceGeneralCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoBalanceGeneralCliente.setLayout(gridaBagLayoutReporteDinamicoBalanceGeneralCliente);
		
		
		this.jInternalFrameReporteDinamicoBalanceGeneralCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoBalanceGeneralCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBalanceGeneralCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoBalanceGeneralCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoBalanceGeneralCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoBalanceGeneralCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoBalanceGeneralCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoBalanceGeneralCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoBalanceGeneralCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoBalanceGeneralCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoBalanceGeneralCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoBalanceGeneralCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBalanceGeneralCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBalanceGeneralCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Balance General Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteBalanceGeneralCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteBalanceGeneralCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jLabelColumnasSelectReporteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteBalanceGeneralCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteBalanceGeneralCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteBalanceGeneralCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteBalanceGeneralCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBalanceGeneralCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBalanceGeneralCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteBalanceGeneralCliente=new JScrollPane(this.jListColumnasSelectReporteBalanceGeneralCliente);
			
			this.jScrollColumnasSelectReporteBalanceGeneralCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBalanceGeneralCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBalanceGeneralCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jListColumnasSelectReporteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jScrollColumnasSelectReporteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteBalanceGeneralCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteBalanceGeneralCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteBalanceGeneralCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteBalanceGeneralCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteBalanceGeneralCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteBalanceGeneralCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBalanceGeneralCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBalanceGeneralCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteBalanceGeneralCliente=new JScrollPane(this.jListRelacionesSelectReporteBalanceGeneralCliente);
			
			this.jScrollRelacionesSelectReporteBalanceGeneralCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBalanceGeneralCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBalanceGeneralCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoBalanceGeneralCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoBalanceGeneralCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoBalanceGeneralCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoBalanceGeneralCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoBalanceGeneralCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoBalanceGeneralCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBalanceGeneralCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBalanceGeneralCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoBalanceGeneralCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoBalanceGeneralCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoBalanceGeneralCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBalanceGeneralCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBalanceGeneralCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoBalanceGeneralCliente = new JLabelMe();

		this.jLabelConGraficoDinamicoBalanceGeneralCliente.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jLabelConGraficoDinamicoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoBalanceGeneralCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoBalanceGeneralCliente.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoBalanceGeneralCliente.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoBalanceGeneralCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBalanceGeneralCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBalanceGeneralCliente.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jCheckBoxConGraficoDinamicoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoBalanceGeneralCliente = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoBalanceGeneralCliente.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jLabelColumnaCategoriaGraficoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoBalanceGeneralCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBalanceGeneralCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoBalanceGeneralCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoBalanceGeneralCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBalanceGeneralCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBalanceGeneralCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jComboBoxColumnaCategoriaGraficoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorBalanceGeneralCliente = new JLabelMe();

		this.jLabelColumnaCategoriaValorBalanceGeneralCliente.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jLabelColumnaCategoriaValorBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorBalanceGeneralCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorBalanceGeneralCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaValorBalanceGeneralCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorBalanceGeneralCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBalanceGeneralCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBalanceGeneralCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jComboBoxColumnaCategoriaValorBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoBalanceGeneralCliente = new JLabelMe();

		this.jLabelColumnasValoresGraficoBalanceGeneralCliente.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jLabelColumnasValoresGraficoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoBalanceGeneralCliente = new JList<Reporte>();
		this.jListColumnasValoresGraficoBalanceGeneralCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoBalanceGeneralCliente.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoBalanceGeneralCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBalanceGeneralCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBalanceGeneralCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoBalanceGeneralCliente=new JScrollPane(this.jListColumnasValoresGraficoBalanceGeneralCliente);
			
			this.jScrollColumnasValoresGraficoBalanceGeneralCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBalanceGeneralCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBalanceGeneralCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jListColumnasSelectReporteBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jScrollColumnasValoresGraficoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoBalanceGeneralCliente = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoBalanceGeneralCliente.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jLabelTiposGraficosReportesDinamicoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoBalanceGeneralCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBalanceGeneralCliente.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoBalanceGeneralCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoBalanceGeneralCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBalanceGeneralCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBalanceGeneralCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jComboBoxTiposGraficosReportesDinamicoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoBalanceGeneralCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoBalanceGeneralCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jLabelGenerarExcelReporteDinamicoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoBalanceGeneralCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoBalanceGeneralCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoBalanceGeneralCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoBalanceGeneralCliente.setToolTipText("Generar EXCEL"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		//this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jButtonGenerarExcelReporteDinamicoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jComboBoxTiposReportesDinamicoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoBalanceGeneralCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoBalanceGeneralCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jLabelTiposArchivoReporteDinamicoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jComboBoxTiposArchivosReportesDinamicoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoBalanceGeneralCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoBalanceGeneralCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoBalanceGeneralCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoBalanceGeneralCliente.setToolTipText("Generar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jButtonGenerarReporteDinamicoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoBalanceGeneralCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoBalanceGeneralCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoBalanceGeneralCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoBalanceGeneralCliente.setToolTipText("Cancelar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBalanceGeneralCliente.add(this.jButtonCerrarReporteDinamicoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalBalanceGeneralCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoBalanceGeneralCliente= new JScrollPane(jPanelReporteDinamicoBalanceGeneralCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoBalanceGeneralCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBalanceGeneralCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBalanceGeneralCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Balance General Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsBalanceGeneralCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoBalanceGeneralCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoBalanceGeneralCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalBalanceGeneralCliente);
		this.jInternalFrameReporteDinamicoBalanceGeneralCliente.getContentPane().add(this.jScrollPanelReporteDinamicoBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionBalanceGeneralCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionBalanceGeneralCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionBalanceGeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionBalanceGeneralCliente.setName("jPanelImportacionBalanceGeneralCliente"); 
		
		this.jPanelImportacionBalanceGeneralCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBalanceGeneralCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBalanceGeneralCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionBalanceGeneralCliente.setLayout(gridaBagLayoutImportacionBalanceGeneralCliente);
		
		
		this.jInternalFrameImportacionBalanceGeneralCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionBalanceGeneralCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionBalanceGeneralCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBalanceGeneralCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionBalanceGeneralCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBalanceGeneralCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBalanceGeneralCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionBalanceGeneralCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBalanceGeneralCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBalanceGeneralCliente.setResizable(true);
	    this.jInternalFrameImportacionBalanceGeneralCliente.setClosable(true);
	    this.jInternalFrameImportacionBalanceGeneralCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionBalanceGeneralCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBalanceGeneralCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBalanceGeneralCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionBalanceGeneralCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBalanceGeneralCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBalanceGeneralCliente.setResizable(true);
	    this.jInternalFrameImportacionBalanceGeneralCliente.setClosable(true);
	    this.jInternalFrameImportacionBalanceGeneralCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionBalanceGeneralCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBalanceGeneralCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBalanceGeneralCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Balance General Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionBalanceGeneralCliente = new JLabelMe();

		this.jLabelArchivoImportacionBalanceGeneralCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBalanceGeneralCliente.add(this.jLabelArchivoImportacionBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionBalanceGeneralCliente = new JFileChooser();		
		this.jFileChooserImportacionBalanceGeneralCliente.setToolTipText("ESCOGER ARCHIVO"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionBalanceGeneralCliente = new JButtonMe();
		this.jButtonAbrirImportacionBalanceGeneralCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionBalanceGeneralCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionBalanceGeneralCliente.setToolTipText("Generar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBalanceGeneralCliente.add(this.jButtonAbrirImportacionBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionBalanceGeneralCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionBalanceGeneralCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionBalanceGeneralCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBalanceGeneralCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBalanceGeneralCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBalanceGeneralCliente.add(this.jLabelPathArchivoImportacionBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionBalanceGeneralCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionBalanceGeneralCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBalanceGeneralCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBalanceGeneralCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBalanceGeneralCliente.add(this.jTextFieldPathArchivoImportacionBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionBalanceGeneralCliente = new JButtonMe();
		this.jButtonGenerarImportacionBalanceGeneralCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionBalanceGeneralCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionBalanceGeneralCliente.setToolTipText("Generar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBalanceGeneralCliente.add(this.jButtonGenerarImportacionBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionBalanceGeneralCliente = new JButtonMe();
		this.jButtonCerrarImportacionBalanceGeneralCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionBalanceGeneralCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionBalanceGeneralCliente.setToolTipText("Cancelar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBalanceGeneralCliente.add(this.jButtonCerrarImportacionBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalBalanceGeneralCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionBalanceGeneralCliente= new JScrollPane(jPanelImportacionBalanceGeneralCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
		this.gridBagConstraintsBalanceGeneralCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsBalanceGeneralCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionBalanceGeneralCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionBalanceGeneralCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalBalanceGeneralCliente);
		this.jInternalFrameImportacionBalanceGeneralCliente.getContentPane().add(this.jScrollPanelImportacionBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByBalanceGeneralCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByBalanceGeneralCliente = new JButtonMe();
			this.jButtonAbrirOrderByBalanceGeneralCliente.setText("Orden");
			this.jButtonAbrirOrderByBalanceGeneralCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBalanceGeneralCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByBalanceGeneralCliente";
			inputMap = this.jButtonAbrirOrderByBalanceGeneralCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByBalanceGeneralCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByBalanceGeneralCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByBalanceGeneralCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByBalanceGeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByBalanceGeneralCliente.setName("jPanelOrderByBalanceGeneralCliente"); 
			
			this.jPanelOrderByBalanceGeneralCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBalanceGeneralCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBalanceGeneralCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByBalanceGeneralCliente.setLayout(gridaBagLayoutOrderByBalanceGeneralCliente);
			
			
			this.jTableDatosBalanceGeneralClienteOrderBy = new JTableMe();        
			this.jTableDatosBalanceGeneralClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosBalanceGeneralClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosBalanceGeneralClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosBalanceGeneralClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosBalanceGeneralClienteOrderBy.setViewportView(this.jTableDatosBalanceGeneralClienteOrderBy);
			this.jTableDatosBalanceGeneralClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosBalanceGeneralClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByBalanceGeneralCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByBalanceGeneralCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByBalanceGeneralCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteBalanceGeneralCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByBalanceGeneralCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByBalanceGeneralCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByBalanceGeneralCliente.setTitle("Orden");
			this.jInternalFrameOrderByBalanceGeneralCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByBalanceGeneralCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByBalanceGeneralCliente.setResizable(true);
			this.jInternalFrameOrderByBalanceGeneralCliente.setClosable(true);
			this.jInternalFrameOrderByBalanceGeneralCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByBalanceGeneralCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBalanceGeneralCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBalanceGeneralCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByBalanceGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Balance General Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsBalanceGeneralCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsBalanceGeneralCliente.ipady =150;
				
			this.jPanelOrderByBalanceGeneralCliente.add(jScrollPanelDatosBalanceGeneralClienteOrderBy, this.gridBagConstraintsBalanceGeneralCliente);//this.jTableDatosBalanceGeneralClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByBalanceGeneralCliente = new JButtonMe();
			this.jButtonCerrarOrderByBalanceGeneralCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByBalanceGeneralCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByBalanceGeneralCliente.setToolTipText("Cancelar"+" "+BalanceGeneralClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByBalanceGeneralCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBalanceGeneralCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsBalanceGeneralCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByBalanceGeneralCliente.add(this.jButtonCerrarOrderByBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalBalanceGeneralCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByBalanceGeneralCliente= new JScrollPane(jPanelOrderByBalanceGeneralCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsBalanceGeneralCliente = new GridBagConstraints();
			this.gridBagConstraintsBalanceGeneralCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsBalanceGeneralCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsBalanceGeneralCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByBalanceGeneralCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByBalanceGeneralCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalBalanceGeneralCliente);
			
			this.jInternalFrameOrderByBalanceGeneralCliente.getContentPane().add(this.jScrollPanelOrderByBalanceGeneralCliente, this.gridBagConstraintsBalanceGeneralCliente);			
		
		} else {
			this.jButtonAbrirOrderByBalanceGeneralCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//7430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.balancegeneralclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosBalanceGeneralCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosBalanceGeneralCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosBalanceGeneralCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosBalanceGeneralCliente.getRowHeight();//BalanceGeneralClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.balancegeneralclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > BalanceGeneralClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBalanceGeneralCliente.isSelected()) {
					iHeightTable=BalanceGeneralClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BalanceGeneralClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BalanceGeneralClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > BalanceGeneralClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBalanceGeneralCliente.isSelected()) {
					iHeightTable=BalanceGeneralClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BalanceGeneralClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BalanceGeneralClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosBalanceGeneralCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBalanceGeneralCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBalanceGeneralCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosBalanceGeneralCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBalanceGeneralCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBalanceGeneralCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByBalanceGeneralCliente!=null && this.jInternalFrameOrderByBalanceGeneralCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.balancegeneralclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByBalanceGeneralCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByBalanceGeneralCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByBalanceGeneralCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByBalanceGeneralCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByBalanceGeneralCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByBalanceGeneralCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByBalanceGeneralCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosBalanceGeneralCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBalanceGeneralCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBalanceGeneralCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=balancegeneralclienteLogic.getBalanceGeneralClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=balancegeneralclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<BalanceGeneralCliente> TraerBalanceGeneralClienteBeans(List<BalanceGeneralCliente> balancegeneralclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(BalanceGeneralCliente balancegeneralcliente:balancegeneralclientes) {
					
				if(!(BalanceGeneralClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || BalanceGeneralClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					balancegeneralcliente.setsDetalleGeneralEntityReporte(BalanceGeneralClienteConstantesFunciones.getBalanceGeneralClienteDescripcion(balancegeneralcliente));
										
						
					
						
					
				} else  {
							
					//balancegeneralcliente.setsDetalleGeneralEntityReporte(balancegeneralcliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//balancegeneralclientebeans.add(balancegeneralclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return balancegeneralclientes;
    }
	//PARA REPORTES FIN
}
