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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.ReciboPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class ReciboPuntoVentaJInternalFrame extends ReciboPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarReciboPuntoVenta;
	
	protected JMenuBar jmenuBarReciboPuntoVenta;
	
	protected JMenu jmenuReciboPuntoVenta;
	protected JMenu jmenuDatosReciboPuntoVenta;
	protected JMenu jmenuArchivoReciboPuntoVenta;
	protected JMenu jmenuAccionesReciboPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosReciboPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutReciboPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsReciboPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ReciboPuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormReciboPuntoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoReciboPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionReciboPuntoVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";
	
	public ReciboPuntoVentaSessionBean recibopuntoventaSessionBean;
		
	
	
	public ClienteSessionBean clienteSessionBean;
	public BancoSessionBean bancoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ReciboPuntoVenta> recibopuntoventas;		
	public List<ReciboPuntoVenta> recibopuntoventasEliminados;	
	public List<ReciboPuntoVenta> recibopuntoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByReciboPuntoVenta;		
	protected JButton jButtonAbrirOrderByReciboPuntoVenta;
	
	
	//protected JPanel jPanelOrderByReciboPuntoVenta;
	//public JScrollPane jScrollPanelOrderByReciboPuntoVenta;	
	//protected JButton jButtonCerrarOrderByReciboPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ReciboPuntoVentaLogic recibopuntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosReciboPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionReciboPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralReciboPuntoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosReciboPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoReciboPuntoVenta;
	//public JScrollPane jScrollPanelImportacionReciboPuntoVenta;
	
	
	
	protected JPanel jPanelAccionesReciboPuntoVenta;
	
    protected JPanel jPanelPaginacionReciboPuntoVenta;
    protected JPanel jPanelParametrosReportesReciboPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesReciboPuntoVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ReciboPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2ReciboPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3ReciboPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4ReciboPuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5ReciboPuntoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoReciboPuntoVenta;
	//protected JPanel jPanelImportacionReciboPuntoVenta;
	
	
	public JTable jTableDatosReciboPuntoVenta;
	
	
	
	//public JTable jTableDatosReciboPuntoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoReciboPuntoVenta;
	protected JButton jButtonDuplicarReciboPuntoVenta;
	protected JButton jButtonCopiarReciboPuntoVenta;
	protected JButton jButtonVerFormReciboPuntoVenta;
	protected JButton jButtonNuevoRelacionesReciboPuntoVenta;
	protected JButton jButtonModificarReciboPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaReciboPuntoVenta;
	protected JButton jButtonCerrarReciboPuntoVenta;
	
	
	protected JButton jButtonRecargarInformacionReciboPuntoVenta;
	protected JButton jButtonProcesarInformacionReciboPuntoVenta;
	
	
	protected JButton jButtonAnterioresReciboPuntoVenta;
	protected JButton jButtonSiguientesReciboPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosReciboPuntoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoReciboPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoReciboPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoReciboPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionReciboPuntoVenta;
	//protected JButton jButtonGenerarImportacionReciboPuntoVenta;
	//protected JButton jButtonCerrarImportacionReciboPuntoVenta;
	//protected JFileChooser jFileChooserImportacionReciboPuntoVenta;
	//protected File fileImportacionReciboPuntoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarReciboPuntoVenta;
	protected JButton jButtonDuplicarToolBarReciboPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarReciboPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarReciboPuntoVenta;
	protected JButton jButtonCopiarToolBarReciboPuntoVenta;
	protected JButton jButtonVerFormToolBarReciboPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarReciboPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarReciboPuntoVenta;
	protected JButton jButtonCerrarToolBarReciboPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarReciboPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarReciboPuntoVenta;
	protected JButton jButtonAnterioresToolBarReciboPuntoVenta;
	protected JButton jButtonSiguientesToolBarReciboPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarReciboPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarReciboPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoReciboPuntoVenta;
	protected JMenuItem jMenuItemDuplicarReciboPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesReciboPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosReciboPuntoVenta;
	protected JMenuItem jMenuItemCopiarReciboPuntoVenta;
	protected JMenuItem jMenuItemVerFormReciboPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaReciboPuntoVenta;
	protected JMenuItem jMenuItemCerrarReciboPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarReciboPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByReciboPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarReciboPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionReciboPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionReciboPuntoVenta;
	protected JMenuItem jMenuItemAnterioresReciboPuntoVenta;
	protected JMenuItem jMenuItemSiguientesReciboPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosReciboPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByReciboPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarReciboPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesReciboPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosReciboPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosReciboPuntoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaReciboPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReporteReciboPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesReciboPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesReciboPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoReciboPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoReciboPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesReciboPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionReciboPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesReciboPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesReciboPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarReciboPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralReciboPuntoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteReciboPuntoVenta;
	//public JList<Reporte> jListColumnasSelectReporteReciboPuntoVenta;
	//public JScrollPane jScrollColumnasSelectReporteReciboPuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReporteReciboPuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReporteReciboPuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReporteReciboPuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoReciboPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoReciboPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoReciboPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoReciboPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionReciboPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionReciboPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionReciboPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoReciboPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoReciboPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorReciboPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorReciboPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoReciboPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoReciboPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoReciboPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoReciboPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoReciboPuntoVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasReciboPuntoVenta;
	public JPanel jPanelFK_IdBancoReciboPuntoVenta;
	public JButton jButtonFK_IdBancoReciboPuntoVenta;
	public JPanel jPanelFK_IdClienteReciboPuntoVenta;
	public JButton jButtonFK_IdClienteReciboPuntoVenta;
	
	public JPanel jPanelid_bancoFK_IdBancoReciboPuntoVenta;
	public JLabel jLabelid_bancoFK_IdBancoReciboPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoFK_IdBancoReciboPuntoVenta;
	public JButton jButtonid_bancoFK_IdBancoReciboPuntoVenta= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoReciboPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoReciboPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteReciboPuntoVenta;
	public JLabel jLabelid_clienteFK_IdClienteReciboPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteReciboPuntoVenta;
	public JButton jButtonid_clienteFK_IdClienteReciboPuntoVenta= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteReciboPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteReciboPuntoVentaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteReciboPuntoVenta;
	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ReciboPuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ReciboPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReciboPuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReciboPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReciboPuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReciboPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReciboPuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ReciboPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionReciboPuntoVenta)	{
		this.jButtonRecargarInformacionReciboPuntoVenta = jButtonRecargarInformacionReciboPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionReciboPuntoVenta() {
		return this.jButtonProcesarInformacionReciboPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionReciboPuntoVenta)	{
		this.jButtonProcesarInformacionReciboPuntoVenta = jButtonProcesarInformacionReciboPuntoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionReciboPuntoVenta() {
		return this.jButtonRecargarInformacionReciboPuntoVenta;
	}
	
	
	public List<ReciboPuntoVenta> getrecibopuntoventas() {
		return this.recibopuntoventas;
	}

	public void setrecibopuntoventas(List<ReciboPuntoVenta> recibopuntoventas) {
		this.recibopuntoventas = recibopuntoventas;
	}
	
	public List<ReciboPuntoVenta> getrecibopuntoventasAux() {
		return this.recibopuntoventasAux;
	}

	public void setrecibopuntoventasAux(List<ReciboPuntoVenta> recibopuntoventasAux) {
		this.recibopuntoventasAux = recibopuntoventasAux;
	}
	
	public List<ReciboPuntoVenta> getrecibopuntoventasEliminados() {
		return this.recibopuntoventasEliminados;
	}

	public void setReciboPuntoVentasEliminados(List<ReciboPuntoVenta> recibopuntoventasEliminados) {
		this.recibopuntoventasEliminados = recibopuntoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarReciboPuntoVenta() {
		return jComboBoxTiposSeleccionarReciboPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarReciboPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarReciboPuntoVenta) {
		this.jComboBoxTiposSeleccionarReciboPuntoVenta = jComboBoxTiposSeleccionarReciboPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarReciboPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarReciboPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarReciboPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralReciboPuntoVenta() {
		return jTextFieldValorCampoGeneralReciboPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralReciboPuntoVenta(
			JTextField jTextFieldValorCampoGeneralReciboPuntoVenta) {
		this.jTextFieldValorCampoGeneralReciboPuntoVenta = jTextFieldValorCampoGeneralReciboPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralReciboPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReciboPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralReciboPuntoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosReciboPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosReciboPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosReciboPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosReciboPuntoVenta) {
		this.jCheckBoxSeleccionarTodosReciboPuntoVenta = jCheckBoxSeleccionarTodosReciboPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosReciboPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReciboPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosReciboPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosReciboPuntoVenta() {
		return this.jCheckBoxSeleccionadosReciboPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosReciboPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosReciboPuntoVenta) {
		this.jCheckBoxSeleccionadosReciboPuntoVenta = jCheckBoxSeleccionadosReciboPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosReciboPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReciboPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosReciboPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesReciboPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesReciboPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesReciboPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesReciboPuntoVenta) {
		this.jComboBoxTiposArchivosReportesReciboPuntoVenta = jComboBoxTiposArchivosReportesReciboPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesReciboPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReciboPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesReciboPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesReciboPuntoVenta() {
		return this.jComboBoxTiposReportesReciboPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesReciboPuntoVenta(
			JComboBox jComboBoxTiposReportesReciboPuntoVenta) {
		this.jComboBoxTiposReportesReciboPuntoVenta = jComboBoxTiposReportesReciboPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoReciboPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoReciboPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoReciboPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoReciboPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoReciboPuntoVenta = jComboBoxTiposReportesDinamicoReciboPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoReciboPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoReciboPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoReciboPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoReciboPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoReciboPuntoVenta = jComboBoxTiposArchivosReportesDinamicoReciboPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesReciboPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReciboPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesReciboPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesReciboPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesReciboPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesReciboPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesReciboPuntoVenta) {
		this.jComboBoxTiposGraficosReportesReciboPuntoVenta = jComboBoxTiposGraficosReportesReciboPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesReciboPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReciboPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesReciboPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionReciboPuntoVenta() {
		return this.jComboBoxTiposPaginacionReciboPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionReciboPuntoVenta(
			JComboBox jComboBoxTiposPaginacionReciboPuntoVenta) {
		this.jComboBoxTiposPaginacionReciboPuntoVenta = jComboBoxTiposPaginacionReciboPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionReciboPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReciboPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionReciboPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesReciboPuntoVenta() {
		return this.jComboBoxTiposRelacionesReciboPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesReciboPuntoVenta() {
		return this.jComboBoxTiposAccionesReciboPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesReciboPuntoVenta(
			JComboBox jComboBoxTiposRelacionesReciboPuntoVenta) {
		this.jComboBoxTiposRelacionesReciboPuntoVenta = jComboBoxTiposRelacionesReciboPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesReciboPuntoVenta(
			JComboBox jComboBoxTiposAccionesReciboPuntoVenta) {
		this.jComboBoxTiposAccionesReciboPuntoVenta = jComboBoxTiposAccionesReciboPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesReciboPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReciboPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesReciboPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesReciboPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReciboPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesReciboPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoReciboPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoReciboPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoReciboPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoReciboPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoReciboPuntoVenta = jCheckBoxConGraficoDinamicoReciboPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoReciboPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarReciboPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoReciboPuntoVenta .setBorder(borderResaltar);		
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
		this.recibopuntoventaSessionBean=new ReciboPuntoVentaSessionBean();
		
		this.recibopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.recibopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.recibopuntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ReciboPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ReciboPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ReciboPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ReciboPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ReciboPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Recibo Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		ReciboPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ReciboPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarReciboPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarReciboPuntoVenta,this.jTtoolBarReciboPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarReciboPuntoVenta,this.jTtoolBarReciboPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarReciboPuntoVenta,this.jTtoolBarReciboPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarReciboPuntoVenta,this.jTtoolBarReciboPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarReciboPuntoVenta,this.jTtoolBarReciboPuntoVenta,
							"copiar","copiar","Copiar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarReciboPuntoVenta,this.jTtoolBarReciboPuntoVenta,
							"ver_form","ver_form","Ver"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReciboPuntoVenta,this.jTtoolBarReciboPuntoVenta,
							"recargar","recargar","Recargar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReciboPuntoVenta,this.jTtoolBarReciboPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReciboPuntoVenta,this.jTtoolBarReciboPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarReciboPuntoVenta,this.jTtoolBarReciboPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarReciboPuntoVenta,this.jTtoolBarReciboPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarReciboPuntoVenta,this.jTtoolBarReciboPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarReciboPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarReciboPuntoVenta,this.jTtoolBarReciboPuntoVenta,
							"cerrar","cerrar","Salir"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarReciboPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarReciboPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarReciboPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarReciboPuntoVenta;
				
		//protected JButton jButtonModificarToolBarReciboPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarReciboPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuReciboPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoReciboPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesReciboPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosReciboPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoReciboPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoReciboPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoReciboPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarReciboPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarReciboPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarReciboPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesReciboPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesReciboPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesReciboPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosReciboPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosReciboPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosReciboPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarReciboPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarReciboPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarReciboPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormReciboPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormReciboPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormReciboPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaReciboPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaReciboPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaReciboPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarReciboPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarReciboPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarReciboPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionReciboPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionReciboPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionReciboPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionReciboPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionReciboPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionReciboPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresReciboPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresReciboPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresReciboPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesReciboPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesReciboPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesReciboPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByReciboPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByReciboPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByReciboPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarReciboPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarReciboPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarReciboPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByReciboPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByReciboPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByReciboPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarReciboPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarReciboPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarReciboPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosReciboPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosReciboPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosReciboPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoReciboPuntoVenta.add(this.jMenuItemCerrarReciboPuntoVenta);
			
			this.jmenuAccionesReciboPuntoVenta.add(this.jMenuItemNuevoReciboPuntoVenta);
			this.jmenuAccionesReciboPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosReciboPuntoVenta);
			this.jmenuAccionesReciboPuntoVenta.add(this.jMenuItemNuevoRelacionesReciboPuntoVenta);
			this.jmenuAccionesReciboPuntoVenta.add(this.jMenuItemGuardarCambiosTablaReciboPuntoVenta);		
			this.jmenuAccionesReciboPuntoVenta.add(this.jMenuItemDuplicarReciboPuntoVenta);		
			this.jmenuAccionesReciboPuntoVenta.add(this.jMenuItemCopiarReciboPuntoVenta);		
			this.jmenuAccionesReciboPuntoVenta.add(this.jMenuItemVerFormReciboPuntoVenta);		
			
			this.jmenuDatosReciboPuntoVenta.add(this.jMenuItemRecargarInformacionReciboPuntoVenta);				
			this.jmenuDatosReciboPuntoVenta.add(this.jMenuItemAnterioresReciboPuntoVenta);				
			this.jmenuDatosReciboPuntoVenta.add(this.jMenuItemSiguientesReciboPuntoVenta);				
			this.jmenuDatosReciboPuntoVenta.add(this.jMenuItemAbrirOrderByReciboPuntoVenta);				
			this.jmenuDatosReciboPuntoVenta.add(this.jMenuItemMostrarOcultarReciboPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesReciboPuntoVenta.add(this.jMenuItemGuardarCambiosReciboPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarReciboPuntoVenta.add(this.jmenuArchivoReciboPuntoVenta);		
			this.jmenuBarReciboPuntoVenta.add(this.jmenuAccionesReciboPuntoVenta);		
			this.jmenuBarReciboPuntoVenta.add(this.jmenuDatosReciboPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarReciboPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasReciboPuntoVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBancoReciboPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBancoReciboPuntoVenta.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdBancoReciboPuntoVenta= new JButtonMe();
		this.jButtonFK_IdBancoReciboPuntoVenta.setText("Buscar");
		this.jButtonFK_IdBancoReciboPuntoVenta.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBancoReciboPuntoVenta,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBancoReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bancoFK_IdBancoReciboPuntoVenta = new JLabelMe();
		jLabelid_bancoFK_IdBancoReciboPuntoVenta.setText("Banco :");
		jLabelid_bancoFK_IdBancoReciboPuntoVenta.setToolTipText("Banco");
		jLabelid_bancoFK_IdBancoReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bancoFK_IdBancoReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bancoFK_IdBancoReciboPuntoVenta= new JComboBoxMe();
		jComboBoxid_bancoFK_IdBancoReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoFK_IdBancoReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteReciboPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteReciboPuntoVenta.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteReciboPuntoVenta= new JButtonMe();
		this.jButtonFK_IdClienteReciboPuntoVenta.setText("Buscar");
		this.jButtonFK_IdClienteReciboPuntoVenta.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteReciboPuntoVenta,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteReciboPuntoVenta = new JLabelMe();
		jLabelid_clienteFK_IdClienteReciboPuntoVenta.setText("Cliente :");
		jLabelid_clienteFK_IdClienteReciboPuntoVenta.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteReciboPuntoVenta= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteReciboPuntoVenta= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteReciboPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteReciboPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteReciboPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteReciboPuntoVenta.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteReciboPuntoVenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteReciboPuntoVenta.setFocusable(false);


		this.jTabbedPaneBusquedasReciboPuntoVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasReciboPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasReciboPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasReciboPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasReciboPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleReciboPuntoVenta = new ReciboPuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Recibo Punto Venta DATOS");
			this.jInternalFrameDetalleFormReciboPuntoVenta = new ReciboPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.recibopuntoventaSessionBean.getConGuardarRelaciones(),this.recibopuntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormReciboPuntoVenta = null;//new ReciboPuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutReciboPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosReciboPuntoVenta = new JTableMe();      
		
		String sToolTipReciboPuntoVenta="";
		sToolTipReciboPuntoVenta=ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipReciboPuntoVenta+="(PuntoVenta.ReciboPuntoVenta)";
		}
		
		if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipReciboPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosReciboPuntoVenta.setToolTipText(sToolTipReciboPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosReciboPuntoVenta);
		this.jTableDatosReciboPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosReciboPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosReciboPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosReciboPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosReciboPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoReciboPuntoVenta = new JButtonMe();
		this.jButtonDuplicarReciboPuntoVenta = new JButtonMe();
		this.jButtonCopiarReciboPuntoVenta = new JButtonMe();
		this.jButtonVerFormReciboPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesReciboPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaReciboPuntoVenta = new JButtonMe();
		this.jButtonCerrarReciboPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosReciboPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralReciboPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesReciboPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Recibo Punto Venta";
		
		if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recibo Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosReciboPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesReciboPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesReciboPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoReciboPuntoVenta=new ReporteDinamicoJInternalFrame(ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoReciboPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionReciboPuntoVenta=new ImportacionJInternalFrame(ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionReciboPuntoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByReciboPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByReciboPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByReciboPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByReciboPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByReciboPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByReciboPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReciboPuntoVenta,false,this);
			
			//this.cargarOrderByReciboPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByReciboPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReciboPuntoVenta,true,this);
			
			//this.cargarOrderByReciboPuntoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosReciboPuntoVenta.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosReciboPuntoVenta.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosReciboPuntoVenta.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosReciboPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosReciboPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosReciboPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoReciboPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarReciboPuntoVenta.setText("Duplicar");
		this.jButtonCopiarReciboPuntoVenta.setText("Copiar");
		this.jButtonVerFormReciboPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesReciboPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaReciboPuntoVenta.setText("Guardar");
		this.jButtonCerrarReciboPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoReciboPuntoVenta,"nuevo_button","Nuevo",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarReciboPuntoVenta,"duplicar_button","Duplicar",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarReciboPuntoVenta,"copiar_button","Copiar",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormReciboPuntoVenta,"ver_form","Ver",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesReciboPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaReciboPuntoVenta,"guardarcambiostabla_button","Guardar",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReciboPuntoVenta,"cerrar_button","Salir",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoReciboPuntoVenta.setToolTipText("Nuevo"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarReciboPuntoVenta.setToolTipText("Duplicar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarReciboPuntoVenta.setToolTipText("Copiar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormReciboPuntoVenta.setToolTipText("Ver"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesReciboPuntoVenta.setToolTipText("Nuevo Rel"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaReciboPuntoVenta.setToolTipText("Guardar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarReciboPuntoVenta.setToolTipText("Salir"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoReciboPuntoVenta";
		inputMap = this.jButtonNuevoReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoReciboPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoReciboPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarReciboPuntoVenta";
		inputMap = this.jButtonDuplicarReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarReciboPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarReciboPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarReciboPuntoVenta";
		inputMap = this.jButtonCopiarReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarReciboPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarReciboPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormReciboPuntoVenta";
		inputMap = this.jButtonVerFormReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormReciboPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormReciboPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesReciboPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesReciboPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesReciboPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarReciboPuntoVenta";
		inputMap = this.jButtonModificarReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarReciboPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarReciboPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarReciboPuntoVenta";
		inputMap = this.jButtonCerrarReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarReciboPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarReciboPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaReciboPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaReciboPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaReciboPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesReciboPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesReciboPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionReciboPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ReciboPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ReciboPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ReciboPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ReciboPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ReciboPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesReciboPuntoVenta.setName("jPanelParametrosReportesReciboPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesReciboPuntoVenta.setName("jPanelParametrosReportesAccionesReciboPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionReciboPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionReciboPuntoVenta.setText("Recargar");
		this.jButtonRecargarInformacionReciboPuntoVenta.setToolTipText("Recargar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionReciboPuntoVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionReciboPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionReciboPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionReciboPuntoVenta.setToolTipText("Procesar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionReciboPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionReciboPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionReciboPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionReciboPuntoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesReciboPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReciboPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesReciboPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesReciboPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReciboPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesReciboPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesReciboPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReciboPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesReciboPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionReciboPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionReciboPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionReciboPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesReciboPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesReciboPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesReciboPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesReciboPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesReciboPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesReciboPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarReciboPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarReciboPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarReciboPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralReciboPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralReciboPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralReciboPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralReciboPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesReciboPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesReciboPuntoVenta.setText("Acciones");		
		this.jLabelAccionesReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosReciboPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosReciboPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosReciboPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosReciboPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosReciboPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosReciboPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaReciboPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaReciboPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaReciboPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteReciboPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteReciboPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteReciboPuntoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresReciboPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresReciboPuntoVenta.setText("<<");
        this.jButtonAnterioresReciboPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresReciboPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesReciboPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesReciboPuntoVenta.setText(">>");
        this.jButtonSiguientesReciboPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesReciboPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosReciboPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosReciboPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosReciboPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosReciboPuntoVenta,"nuevoguardarcambios_button","Nue",this.recibopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosReciboPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosReciboPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosReciboPuntoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionReciboPuntoVenta";
		inputMap = this.jButtonRecargarInformacionReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionReciboPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionReciboPuntoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesReciboPuntoVenta";
		inputMap = this.jButtonSiguientesReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesReciboPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesReciboPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresReciboPuntoVenta";
		inputMap = this.jButtonAnterioresReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresReciboPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresReciboPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasReciboPuntoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesReciboPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),ReciboPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReciboPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesReciboPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),ReciboPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReciboPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesReciboPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),ReciboPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReciboPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionReciboPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionReciboPuntoVenta.setLayout(gridaBagLayoutPaginacionReciboPuntoVenta);						
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
			this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionReciboPuntoVenta.add(this.jButtonAnterioresReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
					
						
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
			
			this.jPanelPaginacionReciboPuntoVenta.add(this.jButtonNuevoGuardarCambiosReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
						
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
			this.jPanelPaginacionReciboPuntoVenta.add(this.jButtonSiguientesReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy = 1;
			this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReciboPuntoVenta.add(this.jButtonNuevoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
						
			
			
			if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsReciboPuntoVenta.gridy = 1;
				this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionReciboPuntoVenta.add(this.jButtonGuardarCambiosTablaReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
			}
			
			
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy = 1;
			this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReciboPuntoVenta.add(this.jButtonDuplicarReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy = 1;
			this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReciboPuntoVenta.add(this.jButtonCopiarReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy = 1;
			this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReciboPuntoVenta.add(this.jButtonVerFormReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy = 1;
			this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionReciboPuntoVenta.add(this.jButtonCerrarReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
		
		
		this.jButtonRecargarInformacionReciboPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionReciboPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionReciboPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesReciboPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesReciboPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesReciboPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesReciboPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesReciboPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesReciboPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesReciboPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesReciboPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesReciboPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionReciboPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionReciboPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionReciboPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesReciboPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesReciboPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesReciboPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesReciboPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReciboPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReciboPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarReciboPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarReciboPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarReciboPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaReciboPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaReciboPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaReciboPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteReciboPuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteReciboPuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteReciboPuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosReciboPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosReciboPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosReciboPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosReciboPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosReciboPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosReciboPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesReciboPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesReciboPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ReciboPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ReciboPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ReciboPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ReciboPuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesReciboPuntoVenta.setLayout(gridaBagParametrosReportesReciboPuntoVenta);
			this.jPanelParametrosReportesAccionesReciboPuntoVenta.setLayout(gridaBagParametrosReportesAccionesReciboPuntoVenta);
			
			
			this.jPanelParametrosAuxiliar1ReciboPuntoVenta.setLayout(gridaBagParametrosAuxiliar1ReciboPuntoVenta);
			this.jPanelParametrosAuxiliar2ReciboPuntoVenta.setLayout(gridaBagParametrosAuxiliar2ReciboPuntoVenta);
			this.jPanelParametrosAuxiliar3ReciboPuntoVenta.setLayout(gridaBagParametrosAuxiliar3ReciboPuntoVenta);
			this.jPanelParametrosAuxiliar4ReciboPuntoVenta.setLayout(gridaBagParametrosAuxiliar4ReciboPuntoVenta);
			//this.jPanelParametrosAuxiliar5ReciboPuntoVenta.setLayout(gridaBagParametrosAuxiliar2ReciboPuntoVenta);			
			
			
			
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReciboPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReciboPuntoVenta.add(this.jButtonRecargarInformacionReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ReciboPuntoVenta.add(this.jComboBoxTiposPaginacionReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ReciboPuntoVenta.add(this.jCheckBoxConAltoMaximoTablaReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ReciboPuntoVenta.add(this.jComboBoxTiposArchivosReportesReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReciboPuntoVenta.add(this.jPanelParametrosAuxiliar1ReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReciboPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ReciboPuntoVenta.add(this.jComboBoxTiposReportesReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);																		
			
			
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReciboPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ReciboPuntoVenta.add(this.jComboBoxTiposGraficosReportesReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReciboPuntoVenta.add(this.jPanelParametrosAuxiliar4ReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReciboPuntoVenta.add(this.jComboBoxTiposReportesReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReciboPuntoVenta.add(this.jCheckBoxGenerarReporteReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReciboPuntoVenta.add(this.jPanelParametrosAuxiliar2ReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReciboPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReciboPuntoVenta.add(this.jLabelAccionesReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsReciboPuntoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesReciboPuntoVenta.add(this.jButtonAbrirOrderByReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReciboPuntoVenta.add(this.jComboBoxTiposSeleccionarReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);			
			
			
			/*
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReciboPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReciboPuntoVenta.add(this.jCheckBoxSeleccionarTodosReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReciboPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReciboPuntoVenta.add(this.jCheckBoxConGraficoReporteReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReciboPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ReciboPuntoVenta.add(this.jCheckBoxSeleccionarTodosReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);															
				
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReciboPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ReciboPuntoVenta.add(this.jCheckBoxSeleccionadosReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);															
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReciboPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ReciboPuntoVenta.add(this.jCheckBoxConGraficoReporteReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReciboPuntoVenta.add(this.jPanelParametrosAuxiliar3ReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReciboPuntoVenta.add(this.jComboBoxTiposAccionesReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
	
				
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReciboPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReciboPuntoVenta.add(this.jTextFieldValorCampoGeneralReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosReciboPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosReciboPuntoVenta.setLayout(gridaBagLayoutDatosReciboPuntoVenta);
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
			this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosReciboPuntoVenta.add(this.jTableDatosReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosReciboPuntoVenta.setViewportView(this.jTableDatosReciboPuntoVenta);
		this.jTableDatosReciboPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosReciboPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesReciboPuntoVenta= new GridBagLayout();
		this.jPanelAccionesReciboPuntoVenta.setLayout(gridaBagLayoutAccionesReciboPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = 0;
		this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
			
		this.jPanelAccionesReciboPuntoVenta.add(this.jButtonNuevoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBancoReciboPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdBancoReciboPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBancoReciboPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBancoReciboPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBancoReciboPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBancoReciboPuntoVenta.setLayout(gridaBagLayoutFK_IdBancoReciboPuntoVenta);

		gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReciboPuntoVenta.gridy = 0;
		gridBagConstraintsReciboPuntoVenta.gridx = 0;
		jPanelFK_IdBancoReciboPuntoVenta.add(jLabelid_bancoFK_IdBancoReciboPuntoVenta, gridBagConstraintsReciboPuntoVenta);

		gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReciboPuntoVenta.gridy = 0;
		gridBagConstraintsReciboPuntoVenta.gridx = 1;
		jPanelFK_IdBancoReciboPuntoVenta.add(jComboBoxid_bancoFK_IdBancoReciboPuntoVenta, gridBagConstraintsReciboPuntoVenta);

		gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReciboPuntoVenta.gridy = 1;
		gridBagConstraintsReciboPuntoVenta.gridx =1;
		jPanelFK_IdBancoReciboPuntoVenta.add(jButtonFK_IdBancoReciboPuntoVenta, gridBagConstraintsReciboPuntoVenta);

		jTabbedPaneBusquedasReciboPuntoVenta.addTab("1.-Por Banco ", jPanelFK_IdBancoReciboPuntoVenta);
		jTabbedPaneBusquedasReciboPuntoVenta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteReciboPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdClienteReciboPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteReciboPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteReciboPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteReciboPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteReciboPuntoVenta.setLayout(gridaBagLayoutFK_IdClienteReciboPuntoVenta);

		gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReciboPuntoVenta.gridy = 0;
		gridBagConstraintsReciboPuntoVenta.gridx = 0;
		jPanelFK_IdClienteReciboPuntoVenta.add(jLabelid_clienteFK_IdClienteReciboPuntoVenta, gridBagConstraintsReciboPuntoVenta);

		gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReciboPuntoVenta.gridy = 0;
		gridBagConstraintsReciboPuntoVenta.gridx = 1;
		jPanelFK_IdClienteReciboPuntoVenta.add(jComboBoxid_clienteFK_IdClienteReciboPuntoVenta, gridBagConstraintsReciboPuntoVenta);


		gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsReciboPuntoVenta.gridy = 0;
		gridBagConstraintsReciboPuntoVenta.gridx = 0;
		jPanelFK_IdClienteReciboPuntoVenta.add(this.jButtonBuscarFK_IdClienteid_clienteReciboPuntoVenta, gridBagConstraintsReciboPuntoVenta);

		gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReciboPuntoVenta.gridy = 1;
		gridBagConstraintsReciboPuntoVenta.gridx =1;
		jPanelFK_IdClienteReciboPuntoVenta.add(jButtonFK_IdClienteReciboPuntoVenta, gridBagConstraintsReciboPuntoVenta);

		jTabbedPaneBusquedasReciboPuntoVenta.addTab("2.-Por Cliente ", jPanelFK_IdClienteReciboPuntoVenta);
		jTabbedPaneBusquedasReciboPuntoVenta.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutReciboPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutReciboPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReciboPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsReciboPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsReciboPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsReciboPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsReciboPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsReciboPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsReciboPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReciboPuntoVenta.gridx = 0;		
			this.gridBagConstraintsReciboPuntoVenta.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsReciboPuntoVenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);								
		
		
		/*
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		*/		
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsReciboPuntoVenta.gridx =0;
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsReciboPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
				
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ReciboPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosReciboPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosReciboPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosReciboPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosReciboPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralReciboPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralReciboPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReciboPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReciboPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
			
			
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
			
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsReciboPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralReciboPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoReciboPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoReciboPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoReciboPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoReciboPuntoVenta.setName("jPanelReporteDinamicoReciboPuntoVenta"); 
		
		this.jPanelReporteDinamicoReciboPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoReciboPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoReciboPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoReciboPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoReciboPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoReciboPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoReciboPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteReciboPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoReciboPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoReciboPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoReciboPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoReciboPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoReciboPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoReciboPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoReciboPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoReciboPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoReciboPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoReciboPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoReciboPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recibo Punto Ventas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteReciboPuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteReciboPuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jLabelColumnasSelectReporteReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteReciboPuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteReciboPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteReciboPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteReciboPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteReciboPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteReciboPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteReciboPuntoVenta=new JScrollPane(this.jListColumnasSelectReporteReciboPuntoVenta);
			
			this.jScrollColumnasSelectReporteReciboPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteReciboPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteReciboPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jListColumnasSelectReporteReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jScrollColumnasSelectReporteReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteReciboPuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteReciboPuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteReciboPuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteReciboPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteReciboPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteReciboPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteReciboPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteReciboPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteReciboPuntoVenta=new JScrollPane(this.jListRelacionesSelectReporteReciboPuntoVenta);
			
			this.jScrollRelacionesSelectReporteReciboPuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteReciboPuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteReciboPuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoReciboPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoReciboPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoReciboPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoReciboPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoReciboPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoReciboPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoReciboPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoReciboPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoReciboPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoReciboPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoReciboPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoReciboPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoReciboPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoReciboPuntoVenta = new JLabelMe();

		this.jLabelConGraficoDinamicoReciboPuntoVenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jLabelConGraficoDinamicoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoReciboPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoReciboPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoReciboPuntoVenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoReciboPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoReciboPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoReciboPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jCheckBoxConGraficoDinamicoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoReciboPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoReciboPuntoVenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jLabelColumnaCategoriaGraficoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoReciboPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoReciboPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoReciboPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoReciboPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoReciboPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoReciboPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jComboBoxColumnaCategoriaGraficoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorReciboPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorReciboPuntoVenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jLabelColumnaCategoriaValorReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorReciboPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorReciboPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorReciboPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorReciboPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorReciboPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorReciboPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jComboBoxColumnaCategoriaValorReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoReciboPuntoVenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoReciboPuntoVenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jLabelColumnasValoresGraficoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoReciboPuntoVenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoReciboPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoReciboPuntoVenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoReciboPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoReciboPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoReciboPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoReciboPuntoVenta=new JScrollPane(this.jListColumnasValoresGraficoReciboPuntoVenta);
			
			this.jScrollColumnasValoresGraficoReciboPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoReciboPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoReciboPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jListColumnasSelectReporteReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jScrollColumnasValoresGraficoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoReciboPuntoVenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoReciboPuntoVenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jLabelTiposGraficosReportesDinamicoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoReciboPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoReciboPuntoVenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoReciboPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoReciboPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoReciboPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoReciboPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jComboBoxTiposGraficosReportesDinamicoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoReciboPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoReciboPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoReciboPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoReciboPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoReciboPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoReciboPuntoVenta.setToolTipText("Generar EXCEL"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jComboBoxTiposReportesDinamicoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoReciboPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoReciboPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoReciboPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoReciboPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoReciboPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoReciboPuntoVenta.setToolTipText("Generar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jButtonGenerarReporteDinamicoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoReciboPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoReciboPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoReciboPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoReciboPuntoVenta.setToolTipText("Cancelar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReciboPuntoVenta.add(this.jButtonCerrarReporteDinamicoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalReciboPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoReciboPuntoVenta= new JScrollPane(jPanelReporteDinamicoReciboPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoReciboPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoReciboPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoReciboPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recibo Punto Ventas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsReciboPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoReciboPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoReciboPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalReciboPuntoVenta);
		this.jInternalFrameReporteDinamicoReciboPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionReciboPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionReciboPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionReciboPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionReciboPuntoVenta.setName("jPanelImportacionReciboPuntoVenta"); 
		
		this.jPanelImportacionReciboPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionReciboPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionReciboPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionReciboPuntoVenta.setLayout(gridaBagLayoutImportacionReciboPuntoVenta);
		
		
		this.jInternalFrameImportacionReciboPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionReciboPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionReciboPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteReciboPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionReciboPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionReciboPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionReciboPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionReciboPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionReciboPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionReciboPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionReciboPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionReciboPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionReciboPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionReciboPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionReciboPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionReciboPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionReciboPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionReciboPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionReciboPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionReciboPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionReciboPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionReciboPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionReciboPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recibo Punto Ventas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionReciboPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionReciboPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionReciboPuntoVenta.add(this.jLabelArchivoImportacionReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionReciboPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionReciboPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionReciboPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionReciboPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionReciboPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionReciboPuntoVenta.setToolTipText("Generar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReciboPuntoVenta.add(this.jButtonAbrirImportacionReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionReciboPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionReciboPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionReciboPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionReciboPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionReciboPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionReciboPuntoVenta.add(this.jLabelPathArchivoImportacionReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionReciboPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionReciboPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionReciboPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionReciboPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReciboPuntoVenta.add(this.jTextFieldPathArchivoImportacionReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionReciboPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionReciboPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionReciboPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionReciboPuntoVenta.setToolTipText("Generar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReciboPuntoVenta.add(this.jButtonGenerarImportacionReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionReciboPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionReciboPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionReciboPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionReciboPuntoVenta.setToolTipText("Cancelar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReciboPuntoVenta.add(this.jButtonCerrarImportacionReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalReciboPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionReciboPuntoVenta= new JScrollPane(jPanelImportacionReciboPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsReciboPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsReciboPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionReciboPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionReciboPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalReciboPuntoVenta);
		this.jInternalFrameImportacionReciboPuntoVenta.getContentPane().add(this.jScrollPanelImportacionReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByReciboPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByReciboPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByReciboPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByReciboPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByReciboPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByReciboPuntoVenta";
			inputMap = this.jButtonAbrirOrderByReciboPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByReciboPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByReciboPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByReciboPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByReciboPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByReciboPuntoVenta.setName("jPanelOrderByReciboPuntoVenta"); 
			
			this.jPanelOrderByReciboPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByReciboPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByReciboPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByReciboPuntoVenta.setLayout(gridaBagLayoutOrderByReciboPuntoVenta);
			
			
			this.jTableDatosReciboPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosReciboPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosReciboPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosReciboPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosReciboPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosReciboPuntoVentaOrderBy.setViewportView(this.jTableDatosReciboPuntoVentaOrderBy);
			this.jTableDatosReciboPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosReciboPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByReciboPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByReciboPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByReciboPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteReciboPuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByReciboPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByReciboPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByReciboPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByReciboPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByReciboPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByReciboPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByReciboPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByReciboPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByReciboPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByReciboPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByReciboPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByReciboPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recibo Punto Ventas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsReciboPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsReciboPuntoVenta.ipady =150;
				
			this.jPanelOrderByReciboPuntoVenta.add(jScrollPanelDatosReciboPuntoVentaOrderBy, this.gridBagConstraintsReciboPuntoVenta);//this.jTableDatosReciboPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByReciboPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByReciboPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByReciboPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByReciboPuntoVenta.setToolTipText("Cancelar"+" "+ReciboPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByReciboPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReciboPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsReciboPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByReciboPuntoVenta.add(this.jButtonCerrarOrderByReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalReciboPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByReciboPuntoVenta= new JScrollPane(jPanelOrderByReciboPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsReciboPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsReciboPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsReciboPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsReciboPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByReciboPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByReciboPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalReciboPuntoVenta);
			
			this.jInternalFrameOrderByReciboPuntoVenta.getContentPane().add(this.jScrollPanelOrderByReciboPuntoVenta, this.gridBagConstraintsReciboPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByReciboPuntoVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.recibopuntoventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosReciboPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosReciboPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosReciboPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosReciboPuntoVenta.getRowHeight();//ReciboPuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ReciboPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaReciboPuntoVenta.isSelected()) {
					iHeightTable=ReciboPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ReciboPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ReciboPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ReciboPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaReciboPuntoVenta.isSelected()) {
					iHeightTable=ReciboPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ReciboPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ReciboPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosReciboPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosReciboPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosReciboPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosReciboPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosReciboPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosReciboPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByReciboPuntoVenta!=null && this.jInternalFrameOrderByReciboPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.recibopuntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByReciboPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByReciboPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByReciboPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByReciboPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByReciboPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByReciboPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByReciboPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosReciboPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosReciboPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosReciboPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=recibopuntoventaLogic.getReciboPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=recibopuntoventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ReciboPuntoVenta> TraerReciboPuntoVentaBeans(List<ReciboPuntoVenta> recibopuntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ReciboPuntoVenta recibopuntoventa:recibopuntoventas) {
					
				if(!(ReciboPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ReciboPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					recibopuntoventa.setsDetalleGeneralEntityReporte(ReciboPuntoVentaConstantesFunciones.getReciboPuntoVentaDescripcion(recibopuntoventa));
										
						
					
						
					
				} else  {
							
					//recibopuntoventa.setsDetalleGeneralEntityReporte(recibopuntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//recibopuntoventabeans.add(recibopuntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return recibopuntoventas;
    }
	//PARA REPORTES FIN
}
