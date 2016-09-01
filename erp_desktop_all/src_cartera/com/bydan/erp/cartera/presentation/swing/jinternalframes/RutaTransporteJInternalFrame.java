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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.cartera.util.RutaTransporteConstantesFunciones;

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
public class RutaTransporteJInternalFrame extends RutaTransporteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRutaTransporte;
	
	protected JMenuBar jmenuBarRutaTransporte;
	
	protected JMenu jmenuRutaTransporte;
	protected JMenu jmenuDatosRutaTransporte;
	protected JMenu jmenuArchivoRutaTransporte;
	protected JMenu jmenuAccionesRutaTransporte;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRutaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRutaTransporte;	
	protected GridBagConstraints gridBagConstraintsRutaTransporte;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RutaTransporteDetalleFormJInternalFrame jInternalFrameDetalleFormRutaTransporte;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRutaTransporte;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRutaTransporte;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public RutaTransporteSessionBean rutatransporteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RutaTransporte> rutatransportes;		
	public List<RutaTransporte> rutatransportesEliminados;	
	public List<RutaTransporte> rutatransportesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRutaTransporte;		
	protected JButton jButtonAbrirOrderByRutaTransporte;
	
	
	//protected JPanel jPanelOrderByRutaTransporte;
	//public JScrollPane jScrollPanelOrderByRutaTransporte;	
	//protected JButton jButtonCerrarOrderByRutaTransporte;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RutaTransporteLogic rutatransporteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRutaTransporte;
	public JScrollPane jScrollPanelDatosEdicionRutaTransporte;
	public JScrollPane jScrollPanelDatosGeneralRutaTransporte;
    
	
	
	//public JScrollPane jScrollPanelDatosRutaTransporteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRutaTransporte;
	//public JScrollPane jScrollPanelImportacionRutaTransporte;
	
	
	
	protected JPanel jPanelAccionesRutaTransporte;
	
    protected JPanel jPanelPaginacionRutaTransporte;
    protected JPanel jPanelParametrosReportesRutaTransporte;
	protected JPanel jPanelParametrosReportesAccionesRutaTransporte;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RutaTransporte;
	protected JPanel jPanelParametrosAuxiliar2RutaTransporte;
	protected JPanel jPanelParametrosAuxiliar3RutaTransporte;
	protected JPanel jPanelParametrosAuxiliar4RutaTransporte;
	//protected JPanel jPanelParametrosAuxiliar5RutaTransporte;
	
	
	
	//protected JPanel jPanelReporteDinamicoRutaTransporte;
	//protected JPanel jPanelImportacionRutaTransporte;
	
	
	public JTable jTableDatosRutaTransporte;
	
	
	
	//public JTable jTableDatosRutaTransporteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRutaTransporte;
	protected JButton jButtonDuplicarRutaTransporte;
	protected JButton jButtonCopiarRutaTransporte;
	protected JButton jButtonVerFormRutaTransporte;
	protected JButton jButtonNuevoRelacionesRutaTransporte;
	protected JButton jButtonModificarRutaTransporte;
	
    protected JButton jButtonGuardarCambiosTablaRutaTransporte;
	protected JButton jButtonCerrarRutaTransporte;
	
	
	protected JButton jButtonRecargarInformacionRutaTransporte;
	protected JButton jButtonProcesarInformacionRutaTransporte;
	
	
	protected JButton jButtonAnterioresRutaTransporte;
	protected JButton jButtonSiguientesRutaTransporte;
	protected JButton jButtonNuevoGuardarCambiosRutaTransporte;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRutaTransporte;
	//protected JButton jButtonCerrarReporteDinamicoRutaTransporte;
	//protected JButton jButtonGenerarExcelReporteDinamicoRutaTransporte;	
	
	
	
	//protected JButton jButtonAbrirImportacionRutaTransporte;
	//protected JButton jButtonGenerarImportacionRutaTransporte;
	//protected JButton jButtonCerrarImportacionRutaTransporte;
	//protected JFileChooser jFileChooserImportacionRutaTransporte;
	//protected File fileImportacionRutaTransporte;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRutaTransporte;
	protected JButton jButtonDuplicarToolBarRutaTransporte;
	protected JButton jButtonNuevoRelacionesToolBarRutaTransporte;
	
	
	public JButton jButtonGuardarCambiosToolBarRutaTransporte;
	protected JButton jButtonCopiarToolBarRutaTransporte;
	protected JButton jButtonVerFormToolBarRutaTransporte;
	public JButton jButtonGuardarCambiosTablaToolBarRutaTransporte;
	protected JButton jButtonMostrarOcultarTablaToolBarRutaTransporte;
	protected JButton jButtonCerrarToolBarRutaTransporte;
	
	protected JButton jButtonRecargarInformacionToolBarRutaTransporte;
	protected JButton jButtonProcesarInformacionToolBarRutaTransporte;
	protected JButton jButtonAnterioresToolBarRutaTransporte;
	protected JButton jButtonSiguientesToolBarRutaTransporte;
	protected JButton jButtonNuevoGuardarCambiosToolBarRutaTransporte;
	protected JButton jButtonAbrirOrderByToolBarRutaTransporte;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRutaTransporte;
	protected JMenuItem jMenuItemDuplicarRutaTransporte;
	protected JMenuItem jMenuItemNuevoRelacionesRutaTransporte;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRutaTransporte;
	protected JMenuItem jMenuItemCopiarRutaTransporte;
	protected JMenuItem jMenuItemVerFormRutaTransporte;
	protected JMenuItem jMenuItemGuardarCambiosTablaRutaTransporte;
	protected JMenuItem jMenuItemCerrarRutaTransporte;
	protected JMenuItem jMenuItemDetalleCerrarRutaTransporte;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRutaTransporte;
	protected JMenuItem jMenuItemDetalleMostarOcultarRutaTransporte;
	
	protected JMenuItem jMenuItemRecargarInformacionRutaTransporte;
	protected JMenuItem jMenuItemProcesarInformacionRutaTransporte;
	protected JMenuItem jMenuItemAnterioresRutaTransporte;
	protected JMenuItem jMenuItemSiguientesRutaTransporte;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRutaTransporte;
	protected JMenuItem jMenuItemAbrirOrderByRutaTransporte;
	protected JMenuItem jMenuItemMostrarOcultarRutaTransporte;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRutaTransporte;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRutaTransporte;
	protected JCheckBox jCheckBoxSeleccionadosRutaTransporte;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRutaTransporte;
	protected JCheckBox jCheckBoxConGraficoReporteRutaTransporte;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRutaTransporte;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRutaTransporte;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRutaTransporte;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRutaTransporte;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRutaTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRutaTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRutaTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRutaTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRutaTransporte;
	protected JTextField jTextFieldValorCampoGeneralRutaTransporte;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRutaTransporte;
	//public JList<Reporte> jListColumnasSelectReporteRutaTransporte;
	//public JScrollPane jScrollColumnasSelectReporteRutaTransporte;
	
	//public JLabel jLabelRelacionesSelectReporteRutaTransporte;
	//public JList<Reporte> jListRelacionesSelectReporteRutaTransporte;
	//public JScrollPane jScrollRelacionesSelectReporteRutaTransporte;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRutaTransporte;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRutaTransporte;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRutaTransporte;
	//public JLabel jLabelTiposArchivoReporteDinamicoRutaTransporte;
	
		
	//public JLabel jLabelArchivoImportacionRutaTransporte;	
	//public JLabel jLabelPathArchivoImportacionRutaTransporte;
	//protected JTextField jTextFieldPathArchivoImportacionRutaTransporte;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRutaTransporte;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRutaTransporte;
	
	//public JLabel jLabelColumnaCategoriaValorRutaTransporte;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRutaTransporte;
	
	//public JLabel jLabelColumnasValoresGraficoRutaTransporte;
	//public JList<Reporte> jListColumnasValoresGraficoRutaTransporte;
	//public JScrollPane jScrollColumnasValoresGraficoRutaTransporte;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRutaTransporte;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRutaTransporte;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRutaTransporte;
	public JPanel jPanelBusquedaPorDestinoRutaTransporte;
	public JButton jButtonBusquedaPorDestinoRutaTransporte;
	public JPanel jPanelBusquedaPorNombreRutaTransporte;
	public JButton jButtonBusquedaPorNombreRutaTransporte;
	public JPanel jPanelBusquedaPorOrigenRutaTransporte;
	public JButton jButtonBusquedaPorOrigenRutaTransporte;
	
	public JPanel jPaneldestinoBusquedaPorDestinoRutaTransporte;
	public JLabel jLabeldestinoBusquedaPorDestinoRutaTransporte;
	public JTextArea jTextAreadestinoBusquedaPorDestinoRutaTransporte;
	public JButton jButtondestinoBusquedaPorDestinoRutaTransporteBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreRutaTransporte;
	public JLabel jLabelnombreBusquedaPorNombreRutaTransporte;
	public JTextArea jTextAreanombreBusquedaPorNombreRutaTransporte;
	public JButton jButtonnombreBusquedaPorNombreRutaTransporteBusqueda= new JButtonMe();

	
	public JPanel jPanelorigenBusquedaPorOrigenRutaTransporte;
	public JLabel jLabelorigenBusquedaPorOrigenRutaTransporte;
	public JTextArea jTextAreaorigenBusquedaPorOrigenRutaTransporte;
	public JButton jButtonorigenBusquedaPorOrigenRutaTransporteBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RutaTransporteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RutaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RutaTransporteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RutaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RutaTransporteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RutaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RutaTransporteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RutaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRutaTransporte)	{
		this.jButtonRecargarInformacionRutaTransporte = jButtonRecargarInformacionRutaTransporte;
	}
	
	public JButton getjButtonProcesarInformacionRutaTransporte() {
		return this.jButtonProcesarInformacionRutaTransporte;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRutaTransporte)	{
		this.jButtonProcesarInformacionRutaTransporte = jButtonProcesarInformacionRutaTransporte;
	}
	
	
	public JButton getjButtonRecargarInformacionRutaTransporte() {
		return this.jButtonRecargarInformacionRutaTransporte;
	}
	
	
	public List<RutaTransporte> getrutatransportes() {
		return this.rutatransportes;
	}

	public void setrutatransportes(List<RutaTransporte> rutatransportes) {
		this.rutatransportes = rutatransportes;
	}
	
	public List<RutaTransporte> getrutatransportesAux() {
		return this.rutatransportesAux;
	}

	public void setrutatransportesAux(List<RutaTransporte> rutatransportesAux) {
		this.rutatransportesAux = rutatransportesAux;
	}
	
	public List<RutaTransporte> getrutatransportesEliminados() {
		return this.rutatransportesEliminados;
	}

	public void setRutaTransportesEliminados(List<RutaTransporte> rutatransportesEliminados) {
		this.rutatransportesEliminados = rutatransportesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRutaTransporte() {
		return jComboBoxTiposSeleccionarRutaTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRutaTransporte(
			JComboBox jComboBoxTiposSeleccionarRutaTransporte) {
		this.jComboBoxTiposSeleccionarRutaTransporte = jComboBoxTiposSeleccionarRutaTransporte;
	}
	
	public void setBorderResaltarTiposSeleccionarRutaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRutaTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRutaTransporte .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRutaTransporte() {
		return jTextFieldValorCampoGeneralRutaTransporte;
	}

	public void setjTextFieldValorCampoGeneralRutaTransporte(
			JTextField jTextFieldValorCampoGeneralRutaTransporte) {
		this.jTextFieldValorCampoGeneralRutaTransporte = jTextFieldValorCampoGeneralRutaTransporte;
	}

	public void setBorderResaltarValorCampoGeneralRutaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRutaTransporte.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRutaTransporte .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRutaTransporte() {
		return this.jCheckBoxSeleccionarTodosRutaTransporte;
	}

	public void setjCheckBoxSeleccionarTodosRutaTransporte(
			JCheckBox jCheckBoxSeleccionarTodosRutaTransporte) {
		this.jCheckBoxSeleccionarTodosRutaTransporte = jCheckBoxSeleccionarTodosRutaTransporte;
	}

	public void setBorderResaltarSeleccionarTodosRutaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRutaTransporte.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRutaTransporte .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRutaTransporte() {
		return this.jCheckBoxSeleccionadosRutaTransporte;
	}

	public void setjCheckBoxSeleccionadosRutaTransporte(
			JCheckBox jCheckBoxSeleccionadosRutaTransporte) {
		this.jCheckBoxSeleccionadosRutaTransporte = jCheckBoxSeleccionadosRutaTransporte;
	}
	
	public void setBorderResaltarSeleccionadosRutaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRutaTransporte.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRutaTransporte .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRutaTransporte() {
		return this.jComboBoxTiposArchivosReportesRutaTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRutaTransporte(
			JComboBox jComboBoxTiposArchivosReportesRutaTransporte) {
		this.jComboBoxTiposArchivosReportesRutaTransporte = jComboBoxTiposArchivosReportesRutaTransporte;
	}

	public void setBorderResaltarTiposArchivosReportesRutaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRutaTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRutaTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRutaTransporte() {
		return this.jComboBoxTiposReportesRutaTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRutaTransporte(
			JComboBox jComboBoxTiposReportesRutaTransporte) {
		this.jComboBoxTiposReportesRutaTransporte = jComboBoxTiposReportesRutaTransporte;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRutaTransporte() {
	//	return jComboBoxTiposReportesDinamicoRutaTransporte;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRutaTransporte(
	//		JComboBox jComboBoxTiposReportesDinamicoRutaTransporte) {
	//	this.jComboBoxTiposReportesDinamicoRutaTransporte = jComboBoxTiposReportesDinamicoRutaTransporte;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRutaTransporte() {
	//	return jComboBoxTiposArchivosReportesDinamicoRutaTransporte;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRutaTransporte(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRutaTransporte) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRutaTransporte = jComboBoxTiposArchivosReportesDinamicoRutaTransporte;
	//}
	
	public void setBorderResaltarTiposReportesRutaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRutaTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRutaTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRutaTransporte() {
		return this.jComboBoxTiposGraficosReportesRutaTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRutaTransporte(
			JComboBox jComboBoxTiposGraficosReportesRutaTransporte) {
		this.jComboBoxTiposGraficosReportesRutaTransporte = jComboBoxTiposGraficosReportesRutaTransporte;
	}
	
	public void setBorderResaltarTiposGraficosReportesRutaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRutaTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRutaTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRutaTransporte() {
		return this.jComboBoxTiposPaginacionRutaTransporte;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRutaTransporte(
			JComboBox jComboBoxTiposPaginacionRutaTransporte) {
		this.jComboBoxTiposPaginacionRutaTransporte = jComboBoxTiposPaginacionRutaTransporte;
	}
	
	public void setBorderResaltarTiposPaginacionRutaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRutaTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRutaTransporte .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRutaTransporte() {
		return this.jComboBoxTiposRelacionesRutaTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRutaTransporte() {
		return this.jComboBoxTiposAccionesRutaTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRutaTransporte(
			JComboBox jComboBoxTiposRelacionesRutaTransporte) {
		this.jComboBoxTiposRelacionesRutaTransporte = jComboBoxTiposRelacionesRutaTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRutaTransporte(
			JComboBox jComboBoxTiposAccionesRutaTransporte) {
		this.jComboBoxTiposAccionesRutaTransporte = jComboBoxTiposAccionesRutaTransporte;
	}
	
	public void setBorderResaltarTiposRelacionesRutaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRutaTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRutaTransporte .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRutaTransporte() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRutaTransporte.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRutaTransporte .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRutaTransporte() {
	//	return jCheckBoxConGraficoDinamicoRutaTransporte;
	//}

	//public void setjCheckBoxConGraficoDinamicoRutaTransporte(
	//		JCheckBox jCheckBoxConGraficoDinamicoRutaTransporte) {
	//	this.jCheckBoxConGraficoDinamicoRutaTransporte = jCheckBoxConGraficoDinamicoRutaTransporte;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRutaTransporte() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRutaTransporte.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRutaTransporte .setBorder(borderResaltar);		
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
		this.rutatransporteSessionBean=new RutaTransporteSessionBean();
		
		this.rutatransporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rutatransporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rutatransporteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RutaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RutaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RutaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RutaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RutaTransporteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ruta Transporte MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
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
		
		RutaTransporteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RutaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRutaTransporte= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRutaTransporte,this.jTtoolBarRutaTransporte,
							"nuevo","nuevo","Nuevo"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRutaTransporte,this.jTtoolBarRutaTransporte,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRutaTransporte,this.jTtoolBarRutaTransporte,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRutaTransporte,this.jTtoolBarRutaTransporte,
							"duplicar","duplicar","Duplicar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRutaTransporte,this.jTtoolBarRutaTransporte,
							"copiar","copiar","Copiar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRutaTransporte,this.jTtoolBarRutaTransporte,
							"ver_form","ver_form","Ver"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRutaTransporte,this.jTtoolBarRutaTransporte,
							"recargar","recargar","Recargar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRutaTransporte,this.jTtoolBarRutaTransporte,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRutaTransporte,this.jTtoolBarRutaTransporte,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRutaTransporte,this.jTtoolBarRutaTransporte,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRutaTransporte,this.jTtoolBarRutaTransporte,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRutaTransporte,this.jTtoolBarRutaTransporte,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRutaTransporte,this.jTtoolBarRutaTransporte,
							"cerrar","cerrar","Salir"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRutaTransporte=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRutaTransporte;
			
				this.jButtonProcesarInformacionToolBarRutaTransporte=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRutaTransporte;
				
		//protected JButton jButtonModificarToolBarRutaTransporte;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRutaTransporte=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRutaTransporte=new JMenuMe("General");
		this.jmenuArchivoRutaTransporte=new JMenuMe("Archivo");
		this.jmenuAccionesRutaTransporte=new JMenuMe("Acciones");
		this.jmenuDatosRutaTransporte=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRutaTransporte= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRutaTransporte.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRutaTransporte,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRutaTransporte= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRutaTransporte.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRutaTransporte,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRutaTransporte= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRutaTransporte.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRutaTransporte,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRutaTransporte= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRutaTransporte.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRutaTransporte,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRutaTransporte= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRutaTransporte.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRutaTransporte,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRutaTransporte= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRutaTransporte.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRutaTransporte,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRutaTransporte= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRutaTransporte.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRutaTransporte,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRutaTransporte= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRutaTransporte.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRutaTransporte,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRutaTransporte= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRutaTransporte.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRutaTransporte,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRutaTransporte= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRutaTransporte.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRutaTransporte,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRutaTransporte= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRutaTransporte.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRutaTransporte,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRutaTransporte= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRutaTransporte.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRutaTransporte,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRutaTransporte= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRutaTransporte.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRutaTransporte,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRutaTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRutaTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRutaTransporte,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRutaTransporte= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRutaTransporte.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRutaTransporte,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRutaTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRutaTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRutaTransporte,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRutaTransporte= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRutaTransporte.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRutaTransporte,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRutaTransporte.add(this.jMenuItemCerrarRutaTransporte);
			
			this.jmenuAccionesRutaTransporte.add(this.jMenuItemNuevoRutaTransporte);
			this.jmenuAccionesRutaTransporte.add(this.jMenuItemNuevoGuardarCambiosRutaTransporte);
			this.jmenuAccionesRutaTransporte.add(this.jMenuItemNuevoRelacionesRutaTransporte);
			this.jmenuAccionesRutaTransporte.add(this.jMenuItemGuardarCambiosTablaRutaTransporte);		
			this.jmenuAccionesRutaTransporte.add(this.jMenuItemDuplicarRutaTransporte);		
			this.jmenuAccionesRutaTransporte.add(this.jMenuItemCopiarRutaTransporte);		
			this.jmenuAccionesRutaTransporte.add(this.jMenuItemVerFormRutaTransporte);		
			
			this.jmenuDatosRutaTransporte.add(this.jMenuItemRecargarInformacionRutaTransporte);				
			this.jmenuDatosRutaTransporte.add(this.jMenuItemAnterioresRutaTransporte);				
			this.jmenuDatosRutaTransporte.add(this.jMenuItemSiguientesRutaTransporte);				
			this.jmenuDatosRutaTransporte.add(this.jMenuItemAbrirOrderByRutaTransporte);				
			this.jmenuDatosRutaTransporte.add(this.jMenuItemMostrarOcultarRutaTransporte);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRutaTransporte.add(this.jMenuItemGuardarCambiosRutaTransporte);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRutaTransporte.add(this.jmenuArchivoRutaTransporte);		
			this.jmenuBarRutaTransporte.add(this.jmenuAccionesRutaTransporte);		
			this.jmenuBarRutaTransporte.add(this.jmenuDatosRutaTransporte);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRutaTransporte);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRutaTransporte() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorDestinoRutaTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorDestinoRutaTransporte.setToolTipText("Buscar Por Destino ");
		this.jButtonBusquedaPorDestinoRutaTransporte= new JButtonMe();
		this.jButtonBusquedaPorDestinoRutaTransporte.setText("Buscar");
		this.jButtonBusquedaPorDestinoRutaTransporte.setToolTipText("Buscar Por Destino ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorDestinoRutaTransporte,"buscar_button","Buscar Por Destino ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorDestinoRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabeldestinoBusquedaPorDestinoRutaTransporte = new JLabelMe();
		jLabeldestinoBusquedaPorDestinoRutaTransporte.setText("Destino :");
		jLabeldestinoBusquedaPorDestinoRutaTransporte.setToolTipText("Destino");
		jLabeldestinoBusquedaPorDestinoRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeldestinoBusquedaPorDestinoRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeldestinoBusquedaPorDestinoRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabeldestinoBusquedaPorDestinoRutaTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreadestinoBusquedaPorDestinoRutaTransporte= new JTextAreaMe();
		jTextAreadestinoBusquedaPorDestinoRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoBusquedaPorDestinoRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoBusquedaPorDestinoRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreadestinoBusquedaPorDestinoRutaTransporte,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreRutaTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreRutaTransporte.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreRutaTransporte= new JButtonMe();
		this.jButtonBusquedaPorNombreRutaTransporte.setText("Buscar");
		this.jButtonBusquedaPorNombreRutaTransporte.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreRutaTransporte,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreRutaTransporte = new JLabelMe();
		jLabelnombreBusquedaPorNombreRutaTransporte.setText("Nombre :");
		jLabelnombreBusquedaPorNombreRutaTransporte.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreRutaTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreRutaTransporte= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreRutaTransporte,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorOrigenRutaTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorOrigenRutaTransporte.setToolTipText("Buscar Por Origen ");
		this.jButtonBusquedaPorOrigenRutaTransporte= new JButtonMe();
		this.jButtonBusquedaPorOrigenRutaTransporte.setText("Buscar");
		this.jButtonBusquedaPorOrigenRutaTransporte.setToolTipText("Buscar Por Origen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorOrigenRutaTransporte,"buscar_button","Buscar Por Origen ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorOrigenRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelorigenBusquedaPorOrigenRutaTransporte = new JLabelMe();
		jLabelorigenBusquedaPorOrigenRutaTransporte.setText("Origen :");
		jLabelorigenBusquedaPorOrigenRutaTransporte.setToolTipText("Origen");
		jLabelorigenBusquedaPorOrigenRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelorigenBusquedaPorOrigenRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelorigenBusquedaPorOrigenRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelorigenBusquedaPorOrigenRutaTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreaorigenBusquedaPorOrigenRutaTransporte= new JTextAreaMe();
		jTextAreaorigenBusquedaPorOrigenRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaorigenBusquedaPorOrigenRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaorigenBusquedaPorOrigenRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreaorigenBusquedaPorOrigenRutaTransporte,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRutaTransporte=new JTabbedPane();


		this.jTabbedPaneBusquedasRutaTransporte.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRutaTransporte.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRutaTransporte.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRutaTransporte.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRutaTransporte,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRutaTransporte = new RutaTransporteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ruta Transporte DATOS");
			this.jInternalFrameDetalleFormRutaTransporte = new RutaTransporteDetalleFormJInternalFrame(jDesktopPane,this.rutatransporteSessionBean.getConGuardarRelaciones(),this.rutatransporteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRutaTransporte = null;//new RutaTransporteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRutaTransporte= new GridBagLayout();
		
		
		this.jTableDatosRutaTransporte = new JTableMe();      
		
		String sToolTipRutaTransporte="";
		sToolTipRutaTransporte=RutaTransporteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRutaTransporte+="(Cartera.RutaTransporte)";
		}
		
		if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
			sToolTipRutaTransporte+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRutaTransporte.setToolTipText(sToolTipRutaTransporte);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRutaTransporte);
		this.jTableDatosRutaTransporte.setAutoCreateRowSorter(true);
		this.jTableDatosRutaTransporte.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRutaTransporte.setRowSelectionAllowed(true);
		this.jTableDatosRutaTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRutaTransporte,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRutaTransporte = new JButtonMe();
		this.jButtonDuplicarRutaTransporte = new JButtonMe();
		this.jButtonCopiarRutaTransporte = new JButtonMe();
		this.jButtonVerFormRutaTransporte = new JButtonMe();
		this.jButtonNuevoRelacionesRutaTransporte = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRutaTransporte = new JButtonMe();
		this.jButtonCerrarRutaTransporte = new JButtonMe();
		
		this.jScrollPanelDatosRutaTransporte = new JScrollPane();   
        this.jScrollPanelDatosGeneralRutaTransporte = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRutaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ruta Transporte";
		
		if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ruta Transportes" + this.sPath));
		} else {
			this.jScrollPanelDatosRutaTransporte.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRutaTransporte.setToolTipText("Acciones");
        this.jPanelAccionesRutaTransporte.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRutaTransporte=new ReporteDinamicoJInternalFrame(RutaTransporteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRutaTransporte();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRutaTransporte=new ImportacionJInternalFrame(RutaTransporteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRutaTransporte();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRutaTransporte = new JButtonMe();
		
		this.jButtonAbrirOrderByRutaTransporte.setText("Orden");
		this.jButtonAbrirOrderByRutaTransporte.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRutaTransporte,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRutaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRutaTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRutaTransporte,false,this);
			
			//this.cargarOrderByRutaTransporte(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRutaTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRutaTransporte,true,this);
			
			//this.cargarOrderByRutaTransporte(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRutaTransporte.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosRutaTransporte.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosRutaTransporte.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosRutaTransporte.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRutaTransporte.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRutaTransporte.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRutaTransporte.setText("Nuevo");
		this.jButtonDuplicarRutaTransporte.setText("Duplicar");
		this.jButtonCopiarRutaTransporte.setText("Copiar");
		this.jButtonVerFormRutaTransporte.setText("Ver");
		this.jButtonNuevoRelacionesRutaTransporte.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRutaTransporte.setText("Guardar");
		this.jButtonCerrarRutaTransporte.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRutaTransporte,"nuevo_button","Nuevo",this.rutatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRutaTransporte,"duplicar_button","Duplicar",this.rutatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRutaTransporte,"copiar_button","Copiar",this.rutatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRutaTransporte,"ver_form","Ver",this.rutatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRutaTransporte,"nuevorelaciones_button","Nuevo Rel",this.rutatransporteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRutaTransporte,"guardarcambiostabla_button","Guardar",this.rutatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRutaTransporte,"cerrar_button","Salir",this.rutatransporteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRutaTransporte.setToolTipText("Nuevo"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRutaTransporte.setToolTipText("Duplicar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRutaTransporte.setToolTipText("Copiar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRutaTransporte.setToolTipText("Ver"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRutaTransporte.setToolTipText("Nuevo Rel"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRutaTransporte.setToolTipText("Guardar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRutaTransporte.setToolTipText("Salir"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRutaTransporte";
		inputMap = this.jButtonNuevoRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRutaTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRutaTransporte"));
		
		//DUPLICAR
		sMapKey = "DuplicarRutaTransporte";
		inputMap = this.jButtonDuplicarRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRutaTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRutaTransporte"));
		
		//COPIAR
		sMapKey = "CopiarRutaTransporte";
		inputMap = this.jButtonCopiarRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRutaTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRutaTransporte"));
		
		//VEr FORM
		sMapKey = "VerFormRutaTransporte";
		inputMap = this.jButtonVerFormRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRutaTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRutaTransporte"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRutaTransporte";
		inputMap = this.jButtonNuevoRelacionesRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRutaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRutaTransporte"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRutaTransporte";
		inputMap = this.jButtonModificarRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRutaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRutaTransporte"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRutaTransporte";
		inputMap = this.jButtonCerrarRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRutaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRutaTransporte"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRutaTransporte";
		inputMap = this.jButtonGuardarCambiosTablaRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRutaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRutaTransporte"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRutaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRutaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRutaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RutaTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RutaTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RutaTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RutaTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RutaTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRutaTransporte.setName("jPanelParametrosReportesRutaTransporte"); 
		
		this.jPanelParametrosReportesAccionesRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRutaTransporte.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRutaTransporte.setName("jPanelParametrosReportesAccionesRutaTransporte"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRutaTransporte = new JButtonMe();
		this.jButtonRecargarInformacionRutaTransporte.setText("Recargar");
		this.jButtonRecargarInformacionRutaTransporte.setToolTipText("Recargar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRutaTransporte,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionRutaTransporte = new JButtonMe();
		this.jButtonProcesarInformacionRutaTransporte.setText("Procesar");
		this.jButtonProcesarInformacionRutaTransporte.setToolTipText("Procesar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRutaTransporte.setVisible(false);
			
		this.jButtonProcesarInformacionRutaTransporte.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRutaTransporte.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRutaTransporte.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRutaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRutaTransporte.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRutaTransporte.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRutaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRutaTransporte.setText("TIPO");       
		this.jComboBoxTiposReportesRutaTransporte.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRutaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRutaTransporte.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRutaTransporte.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRutaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRutaTransporte.setText("Paginacion");
		this.jComboBoxTiposPaginacionRutaTransporte.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRutaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRutaTransporte.setText("Accion");
		this.jComboBoxTiposRelacionesRutaTransporte.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRutaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRutaTransporte.setText("Accion");
		this.jComboBoxTiposAccionesRutaTransporte.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRutaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRutaTransporte.setText("Accion");
		this.jComboBoxTiposSeleccionarRutaTransporte.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRutaTransporte=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRutaTransporte.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRutaTransporte.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRutaTransporte.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRutaTransporte = new JLabelMe();
		
		this.jLabelAccionesRutaTransporte.setText("Acciones");		
		this.jLabelAccionesRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRutaTransporte = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRutaTransporte.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRutaTransporte.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRutaTransporte = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRutaTransporte.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRutaTransporte.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRutaTransporte = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRutaTransporte.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRutaTransporte.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRutaTransporte = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRutaTransporte.setText("Graf.");
		this.jCheckBoxConGraficoReporteRutaTransporte.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRutaTransporte = new JButtonMe();
		//this.jButtonAnterioresRutaTransporte.setText("<<");
        this.jButtonAnterioresRutaTransporte.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRutaTransporte,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRutaTransporte = new JButtonMe();
		//this.jButtonSiguientesRutaTransporte.setText(">>");
        this.jButtonSiguientesRutaTransporte.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRutaTransporte,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRutaTransporte = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRutaTransporte.setText("Nue");
        this.jButtonNuevoGuardarCambiosRutaTransporte.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRutaTransporte,"nuevoguardarcambios_button","Nue",this.rutatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRutaTransporte";
		inputMap = this.jButtonNuevoGuardarCambiosRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRutaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRutaTransporte"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRutaTransporte";
		inputMap = this.jButtonRecargarInformacionRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRutaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRutaTransporte"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRutaTransporte";
		inputMap = this.jButtonSiguientesRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRutaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRutaTransporte"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRutaTransporte";
		inputMap = this.jButtonAnterioresRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRutaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRutaTransporte"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRutaTransporte();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRutaTransporte.setMinimumSize(new Dimension(this.getWidth(),RutaTransporteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RutaTransporteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRutaTransporte.setMaximumSize(new Dimension(this.getWidth(),RutaTransporteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RutaTransporteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRutaTransporte.setPreferredSize(new Dimension(this.getWidth(),RutaTransporteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RutaTransporteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRutaTransporte = new GridBagLayout();

			this.jPanelPaginacionRutaTransporte.setLayout(gridaBagLayoutPaginacionRutaTransporte);						
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy = 0;
			this.gridBagConstraintsRutaTransporte.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRutaTransporte.add(this.jButtonAnterioresRutaTransporte, this.gridBagConstraintsRutaTransporte);
					
						
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRutaTransporte.gridy = 0;
			
			this.jPanelPaginacionRutaTransporte.add(this.jButtonNuevoGuardarCambiosRutaTransporte, this.gridBagConstraintsRutaTransporte);
						
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRutaTransporte.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRutaTransporte.gridy = 0;
			this.jPanelPaginacionRutaTransporte.add(this.jButtonSiguientesRutaTransporte, this.gridBagConstraintsRutaTransporte);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy = 1;
			this.gridBagConstraintsRutaTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRutaTransporte.add(this.jButtonNuevoRutaTransporte, this.gridBagConstraintsRutaTransporte);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
				this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRutaTransporte.gridy = 1;
				this.gridBagConstraintsRutaTransporte.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionRutaTransporte.add(this.jButtonNuevoRelacionesRutaTransporte, this.gridBagConstraintsRutaTransporte);
			}
			
			
			if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
				this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRutaTransporte.gridy = 1;
				this.gridBagConstraintsRutaTransporte.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRutaTransporte.add(this.jButtonGuardarCambiosTablaRutaTransporte, this.gridBagConstraintsRutaTransporte);
			}
			
			
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy = 1;
			this.gridBagConstraintsRutaTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRutaTransporte.add(this.jButtonDuplicarRutaTransporte, this.gridBagConstraintsRutaTransporte);
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy = 1;
			this.gridBagConstraintsRutaTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRutaTransporte.add(this.jButtonCopiarRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy = 1;
			this.gridBagConstraintsRutaTransporte.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRutaTransporte.add(this.jButtonVerFormRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy = 1;
			this.gridBagConstraintsRutaTransporte.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRutaTransporte.add(this.jButtonCerrarRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
		
		
		this.jButtonRecargarInformacionRutaTransporte.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRutaTransporte.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRutaTransporte.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRutaTransporte.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRutaTransporte.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRutaTransporte.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRutaTransporte.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRutaTransporte.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRutaTransporte.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRutaTransporte.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRutaTransporte.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRutaTransporte.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRutaTransporte.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRutaTransporte.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRutaTransporte.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRutaTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRutaTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRutaTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRutaTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRutaTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRutaTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRutaTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRutaTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRutaTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRutaTransporte.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRutaTransporte.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRutaTransporte.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRutaTransporte.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRutaTransporte.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRutaTransporte.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRutaTransporte.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRutaTransporte.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRutaTransporte.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRutaTransporte.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRutaTransporte.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRutaTransporte.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRutaTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRutaTransporte = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RutaTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RutaTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RutaTransporte = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RutaTransporte = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRutaTransporte.setLayout(gridaBagParametrosReportesRutaTransporte);
			this.jPanelParametrosReportesAccionesRutaTransporte.setLayout(gridaBagParametrosReportesAccionesRutaTransporte);
			
			
			this.jPanelParametrosAuxiliar1RutaTransporte.setLayout(gridaBagParametrosAuxiliar1RutaTransporte);
			this.jPanelParametrosAuxiliar2RutaTransporte.setLayout(gridaBagParametrosAuxiliar2RutaTransporte);
			this.jPanelParametrosAuxiliar3RutaTransporte.setLayout(gridaBagParametrosAuxiliar3RutaTransporte);
			this.jPanelParametrosAuxiliar4RutaTransporte.setLayout(gridaBagParametrosAuxiliar4RutaTransporte);
			//this.jPanelParametrosAuxiliar5RutaTransporte.setLayout(gridaBagParametrosAuxiliar2RutaTransporte);			
			
			
			
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRutaTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRutaTransporte.add(this.jButtonRecargarInformacionRutaTransporte, this.gridBagConstraintsRutaTransporte);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRutaTransporte.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RutaTransporte.add(this.jComboBoxTiposPaginacionRutaTransporte, this.gridBagConstraintsRutaTransporte);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRutaTransporte.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RutaTransporte.add(this.jCheckBoxConAltoMaximoTablaRutaTransporte, this.gridBagConstraintsRutaTransporte);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRutaTransporte.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RutaTransporte.add(this.jComboBoxTiposArchivosReportesRutaTransporte, this.gridBagConstraintsRutaTransporte);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRutaTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRutaTransporte.add(this.jPanelParametrosAuxiliar1RutaTransporte, this.gridBagConstraintsRutaTransporte);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRutaTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RutaTransporte.add(this.jComboBoxTiposReportesRutaTransporte, this.gridBagConstraintsRutaTransporte);																		
			
			
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRutaTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4RutaTransporte.add(this.jComboBoxTiposGraficosReportesRutaTransporte, this.gridBagConstraintsRutaTransporte);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRutaTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRutaTransporte.add(this.jPanelParametrosAuxiliar4RutaTransporte, this.gridBagConstraintsRutaTransporte);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRutaTransporte.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRutaTransporte.add(this.jComboBoxTiposReportesRutaTransporte, this.gridBagConstraintsRutaTransporte);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRutaTransporte.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRutaTransporte.add(this.jCheckBoxGenerarReporteRutaTransporte, this.gridBagConstraintsRutaTransporte);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRutaTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRutaTransporte.add(this.jPanelParametrosAuxiliar2RutaTransporte, this.gridBagConstraintsRutaTransporte);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRutaTransporte.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRutaTransporte.add(this.jLabelAccionesRutaTransporte, this.gridBagConstraintsRutaTransporte);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
				this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRutaTransporte.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRutaTransporte.add(this.jButtonAbrirOrderByRutaTransporte, this.gridBagConstraintsRutaTransporte);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRutaTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRutaTransporte.add(this.jComboBoxTiposSeleccionarRutaTransporte, this.gridBagConstraintsRutaTransporte);			
			
			
			/*
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRutaTransporte.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRutaTransporte.add(this.jCheckBoxSeleccionarTodosRutaTransporte, this.gridBagConstraintsRutaTransporte);
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRutaTransporte.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRutaTransporte.add(this.jCheckBoxConGraficoReporteRutaTransporte, this.gridBagConstraintsRutaTransporte);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRutaTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RutaTransporte.add(this.jCheckBoxSeleccionarTodosRutaTransporte, this.gridBagConstraintsRutaTransporte);															
				
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRutaTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RutaTransporte.add(this.jCheckBoxSeleccionadosRutaTransporte, this.gridBagConstraintsRutaTransporte);															
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRutaTransporte.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RutaTransporte.add(this.jCheckBoxConGraficoReporteRutaTransporte, this.gridBagConstraintsRutaTransporte);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRutaTransporte.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRutaTransporte.add(this.jPanelParametrosAuxiliar3RutaTransporte, this.gridBagConstraintsRutaTransporte);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRutaTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRutaTransporte.add(this.jComboBoxTiposRelacionesRutaTransporte, this.gridBagConstraintsRutaTransporte);
				
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRutaTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRutaTransporte.add(this.jComboBoxTiposAccionesRutaTransporte, this.gridBagConstraintsRutaTransporte);
	
				
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRutaTransporte.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRutaTransporte.add(this.jTextFieldValorCampoGeneralRutaTransporte, this.gridBagConstraintsRutaTransporte);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRutaTransporte = new GridBagLayout();

			this.jScrollPanelDatosRutaTransporte.setLayout(gridaBagLayoutDatosRutaTransporte);
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy = 0;
			this.gridBagConstraintsRutaTransporte.gridx = 0;
			
			this.jScrollPanelDatosRutaTransporte.add(this.jTableDatosRutaTransporte, this.gridBagConstraintsRutaTransporte);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRutaTransporte.setViewportView(this.jTableDatosRutaTransporte);
		this.jTableDatosRutaTransporte.setFillsViewportHeight(true);
		this.jTableDatosRutaTransporte.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRutaTransporte= new GridBagLayout();
		this.jPanelAccionesRutaTransporte.setLayout(gridaBagLayoutAccionesRutaTransporte);
		
		
		/*	
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRutaTransporte.gridy = 0;
		this.gridBagConstraintsRutaTransporte.gridx = 0;
			
		this.jPanelAccionesRutaTransporte.add(this.jButtonNuevoRutaTransporte, this.gridBagConstraintsRutaTransporte);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorDestinoRutaTransporte= new GridBagLayout();
		gridaBagLayoutBusquedaPorDestinoRutaTransporte.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorDestinoRutaTransporte.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorDestinoRutaTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorDestinoRutaTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorDestinoRutaTransporte.setLayout(gridaBagLayoutBusquedaPorDestinoRutaTransporte);

		gridBagConstraintsRutaTransporte = new GridBagConstraints();
		gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRutaTransporte.gridy = 0;
		gridBagConstraintsRutaTransporte.gridx = 0;
		jPanelBusquedaPorDestinoRutaTransporte.add(jLabeldestinoBusquedaPorDestinoRutaTransporte, gridBagConstraintsRutaTransporte);

		gridBagConstraintsRutaTransporte = new GridBagConstraints();
		gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRutaTransporte.gridy = 0;
		gridBagConstraintsRutaTransporte.gridx = 1;
		jPanelBusquedaPorDestinoRutaTransporte.add(jTextAreadestinoBusquedaPorDestinoRutaTransporte, gridBagConstraintsRutaTransporte);

		gridBagConstraintsRutaTransporte = new GridBagConstraints();
		gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRutaTransporte.gridy = 1;
		gridBagConstraintsRutaTransporte.gridx =1;
		jPanelBusquedaPorDestinoRutaTransporte.add(jButtonBusquedaPorDestinoRutaTransporte, gridBagConstraintsRutaTransporte);

		jTabbedPaneBusquedasRutaTransporte.addTab("1.-Por Destino ", jPanelBusquedaPorDestinoRutaTransporte);
		jTabbedPaneBusquedasRutaTransporte.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreRutaTransporte= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreRutaTransporte.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreRutaTransporte.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreRutaTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreRutaTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreRutaTransporte.setLayout(gridaBagLayoutBusquedaPorNombreRutaTransporte);

		gridBagConstraintsRutaTransporte = new GridBagConstraints();
		gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRutaTransporte.gridy = 0;
		gridBagConstraintsRutaTransporte.gridx = 0;
		jPanelBusquedaPorNombreRutaTransporte.add(jLabelnombreBusquedaPorNombreRutaTransporte, gridBagConstraintsRutaTransporte);

		gridBagConstraintsRutaTransporte = new GridBagConstraints();
		gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRutaTransporte.gridy = 0;
		gridBagConstraintsRutaTransporte.gridx = 1;
		jPanelBusquedaPorNombreRutaTransporte.add(jTextAreanombreBusquedaPorNombreRutaTransporte, gridBagConstraintsRutaTransporte);

		gridBagConstraintsRutaTransporte = new GridBagConstraints();
		gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRutaTransporte.gridy = 1;
		gridBagConstraintsRutaTransporte.gridx =1;
		jPanelBusquedaPorNombreRutaTransporte.add(jButtonBusquedaPorNombreRutaTransporte, gridBagConstraintsRutaTransporte);

		jTabbedPaneBusquedasRutaTransporte.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreRutaTransporte);
		jTabbedPaneBusquedasRutaTransporte.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorOrigenRutaTransporte= new GridBagLayout();
		gridaBagLayoutBusquedaPorOrigenRutaTransporte.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorOrigenRutaTransporte.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorOrigenRutaTransporte.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorOrigenRutaTransporte.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorOrigenRutaTransporte.setLayout(gridaBagLayoutBusquedaPorOrigenRutaTransporte);

		gridBagConstraintsRutaTransporte = new GridBagConstraints();
		gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRutaTransporte.gridy = 0;
		gridBagConstraintsRutaTransporte.gridx = 0;
		jPanelBusquedaPorOrigenRutaTransporte.add(jLabelorigenBusquedaPorOrigenRutaTransporte, gridBagConstraintsRutaTransporte);

		gridBagConstraintsRutaTransporte = new GridBagConstraints();
		gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRutaTransporte.gridy = 0;
		gridBagConstraintsRutaTransporte.gridx = 1;
		jPanelBusquedaPorOrigenRutaTransporte.add(jTextAreaorigenBusquedaPorOrigenRutaTransporte, gridBagConstraintsRutaTransporte);

		gridBagConstraintsRutaTransporte = new GridBagConstraints();
		gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRutaTransporte.gridy = 1;
		gridBagConstraintsRutaTransporte.gridx =1;
		jPanelBusquedaPorOrigenRutaTransporte.add(jButtonBusquedaPorOrigenRutaTransporte, gridBagConstraintsRutaTransporte);

		jTabbedPaneBusquedasRutaTransporte.addTab("3.-Por Origen ", jPanelBusquedaPorOrigenRutaTransporte);
		jTabbedPaneBusquedasRutaTransporte.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRutaTransporte = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRutaTransporte);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rutatransporteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();						
			this.gridBagConstraintsRutaTransporte.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRutaTransporte.gridx = 0;		
			//this.gridBagConstraintsRutaTransporte.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRutaTransporte.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRutaTransporte, this.gridBagConstraintsRutaTransporte);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRutaTransporte.gridx = 0;		
		//this.gridBagConstraintsRutaTransporte.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRutaTransporte.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRutaTransporte);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRutaTransporte.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRutaTransporte.gridx = 0;		
			this.gridBagConstraintsRutaTransporte.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRutaTransporte.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRutaTransporte, this.gridBagConstraintsRutaTransporte);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRutaTransporte.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRutaTransporte, this.gridBagConstraintsRutaTransporte);								
		
		
		/*
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRutaTransporte.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRutaTransporte, this.gridBagConstraintsRutaTransporte);
		*/		
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRutaTransporte.gridx =0;
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRutaTransporte.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRutaTransporte, this.gridBagConstraintsRutaTransporte);
				
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRutaTransporte.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRutaTransporte, this.gridBagConstraintsRutaTransporte);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(RutaTransporteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRutaTransporte= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRutaTransporte = new GridBagLayout();
			this.jPanelBusquedasParametrosRutaTransporte.setLayout(gridaBagLayoutBusquedasParametrosRutaTransporte);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRutaTransporte=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRutaTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRutaTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRutaTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRutaTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRutaTransporte, this.gridBagConstraintsRutaTransporte);
			
			
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRutaTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
			
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRutaTransporte.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRutaTransporte, this.gridBagConstraintsRutaTransporte);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRutaTransporte;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRutaTransporte() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRutaTransporte = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRutaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRutaTransporte.setName("jPanelReporteDinamicoRutaTransporte"); 
		
		this.jPanelReporteDinamicoRutaTransporte.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRutaTransporte.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRutaTransporte.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRutaTransporte.setLayout(gridaBagLayoutReporteDinamicoRutaTransporte);
		
		
		this.jInternalFrameReporteDinamicoRutaTransporte= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRutaTransporte = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRutaTransporte= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRutaTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRutaTransporte.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRutaTransporte.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRutaTransporte.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRutaTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRutaTransporte.setResizable(true);
	    this.jInternalFrameReporteDinamicoRutaTransporte.setClosable(true);
	    this.jInternalFrameReporteDinamicoRutaTransporte.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRutaTransporte.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRutaTransporte.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRutaTransporte.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ruta Transportes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRutaTransporte = new JLabelMe();

		this.jLabelColumnasSelectReporteRutaTransporte.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRutaTransporte.add(this.jLabelColumnasSelectReporteRutaTransporte, this.gridBagConstraintsRutaTransporte);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRutaTransporte = new JList<Reporte>();
		this.jListColumnasSelectReporteRutaTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRutaTransporte.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRutaTransporte.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRutaTransporte.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRutaTransporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRutaTransporte=new JScrollPane(this.jListColumnasSelectReporteRutaTransporte);
			
			this.jScrollColumnasSelectReporteRutaTransporte.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRutaTransporte.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRutaTransporte.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRutaTransporte.add(this.jListColumnasSelectReporteRutaTransporte, this.gridBagConstraintsRutaTransporte);
		this.jPanelReporteDinamicoRutaTransporte.add(this.jScrollColumnasSelectReporteRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRutaTransporte = new JLabelMe();

		this.jLabelRelacionesSelectReporteRutaTransporte.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRutaTransporte.add(this.jLabelRelacionesSelectReporteRutaTransporte, this.gridBagConstraintsRutaTransporte);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRutaTransporte = new JList<Reporte>();
		this.jListRelacionesSelectReporteRutaTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRutaTransporte.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRutaTransporte.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRutaTransporte.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRutaTransporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRutaTransporte=new JScrollPane(this.jListRelacionesSelectReporteRutaTransporte);
			
			this.jScrollRelacionesSelectReporteRutaTransporte.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRutaTransporte.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRutaTransporte.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRutaTransporte.add(this.jListRelacionesSelectReporteRutaTransporte, this.gridBagConstraintsRutaTransporte);
		this.jPanelReporteDinamicoRutaTransporte.add(this.jScrollRelacionesSelectReporteRutaTransporte, this.gridBagConstraintsRutaTransporte);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoRutaTransporte = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRutaTransporte = new JComboBoxMe();
		this.jListColumnasValoresGraficoRutaTransporte = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRutaTransporte = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRutaTransporte.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRutaTransporte.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRutaTransporte.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRutaTransporte.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRutaTransporte = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRutaTransporte.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRutaTransporte.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRutaTransporte.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRutaTransporte.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoRutaTransporte = new JLabelMe();

		this.jLabelConGraficoDinamicoRutaTransporte.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRutaTransporte.add(this.jLabelConGraficoDinamicoRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoRutaTransporte = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoRutaTransporte.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoRutaTransporte.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoRutaTransporte.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRutaTransporte.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRutaTransporte.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRutaTransporte.add(this.jCheckBoxConGraficoDinamicoRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoRutaTransporte = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoRutaTransporte.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRutaTransporte.add(this.jLabelColumnaCategoriaGraficoRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoRutaTransporte = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRutaTransporte.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoRutaTransporte.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoRutaTransporte.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRutaTransporte.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRutaTransporte.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoRutaTransporte.add(this.jComboBoxColumnaCategoriaGraficoRutaTransporte, this.gridBagConstraintsRutaTransporte);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorRutaTransporte = new JLabelMe();

		this.jLabelColumnaCategoriaValorRutaTransporte.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRutaTransporte.add(this.jLabelColumnaCategoriaValorRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorRutaTransporte = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorRutaTransporte.setText("Accion");
        this.jComboBoxColumnaCategoriaValorRutaTransporte.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorRutaTransporte.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRutaTransporte.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRutaTransporte.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoRutaTransporte.add(this.jComboBoxColumnaCategoriaValorRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoRutaTransporte = new JLabelMe();

		this.jLabelColumnasValoresGraficoRutaTransporte.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRutaTransporte.add(this.jLabelColumnasValoresGraficoRutaTransporte, this.gridBagConstraintsRutaTransporte);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoRutaTransporte = new JList<Reporte>();
		this.jListColumnasValoresGraficoRutaTransporte.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoRutaTransporte.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoRutaTransporte.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRutaTransporte.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRutaTransporte.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoRutaTransporte=new JScrollPane(this.jListColumnasValoresGraficoRutaTransporte);
			
			this.jScrollColumnasValoresGraficoRutaTransporte.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRutaTransporte.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRutaTransporte.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoRutaTransporte.add(this.jListColumnasSelectReporteRutaTransporte, this.gridBagConstraintsRutaTransporte);
		this.jPanelReporteDinamicoRutaTransporte.add(this.jScrollColumnasValoresGraficoRutaTransporte, this.gridBagConstraintsRutaTransporte);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoRutaTransporte = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoRutaTransporte.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRutaTransporte.add(this.jLabelTiposGraficosReportesDinamicoRutaTransporte, this.gridBagConstraintsRutaTransporte);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoRutaTransporte = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRutaTransporte.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoRutaTransporte.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoRutaTransporte.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRutaTransporte.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRutaTransporte.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRutaTransporte.add(this.jComboBoxTiposGraficosReportesDinamicoRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRutaTransporte = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRutaTransporte.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRutaTransporte.add(this.jLabelGenerarExcelReporteDinamicoRutaTransporte, this.gridBagConstraintsRutaTransporte);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRutaTransporte = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRutaTransporte.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRutaTransporte,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRutaTransporte.setToolTipText("Generar EXCEL"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		//this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRutaTransporte.add(this.jButtonGenerarExcelReporteDinamicoRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRutaTransporte.add(this.jComboBoxTiposReportesDinamicoRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRutaTransporte = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRutaTransporte.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRutaTransporte.add(this.jLabelTiposArchivoReporteDinamicoRutaTransporte, this.gridBagConstraintsRutaTransporte);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRutaTransporte.add(this.jComboBoxTiposArchivosReportesDinamicoRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRutaTransporte = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRutaTransporte.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRutaTransporte,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRutaTransporte.setToolTipText("Generar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRutaTransporte.add(this.jButtonGenerarReporteDinamicoRutaTransporte, this.gridBagConstraintsRutaTransporte);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRutaTransporte = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRutaTransporte.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRutaTransporte,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRutaTransporte.setToolTipText("Cancelar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRutaTransporte.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRutaTransporte.add(this.jButtonCerrarReporteDinamicoRutaTransporte, this.gridBagConstraintsRutaTransporte);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRutaTransporte = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRutaTransporte= new JScrollPane(jPanelReporteDinamicoRutaTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRutaTransporte.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRutaTransporte.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRutaTransporte.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ruta Transportes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRutaTransporte.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRutaTransporte.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRutaTransporte.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRutaTransporte);
		this.jInternalFrameReporteDinamicoRutaTransporte.getContentPane().add(this.jScrollPanelReporteDinamicoRutaTransporte, this.gridBagConstraintsRutaTransporte);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRutaTransporte() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRutaTransporte = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRutaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRutaTransporte.setName("jPanelImportacionRutaTransporte"); 
		
		this.jPanelImportacionRutaTransporte.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRutaTransporte.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRutaTransporte.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRutaTransporte.setLayout(gridaBagLayoutImportacionRutaTransporte);
		
		
		this.jInternalFrameImportacionRutaTransporte= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRutaTransporte= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRutaTransporte = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRutaTransporte= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRutaTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRutaTransporte.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRutaTransporte.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRutaTransporte.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRutaTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRutaTransporte.setResizable(true);
	    this.jInternalFrameImportacionRutaTransporte.setClosable(true);
	    this.jInternalFrameImportacionRutaTransporte.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRutaTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRutaTransporte.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRutaTransporte.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRutaTransporte.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRutaTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRutaTransporte.setResizable(true);
	    this.jInternalFrameImportacionRutaTransporte.setClosable(true);
	    this.jInternalFrameImportacionRutaTransporte.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRutaTransporte.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRutaTransporte.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRutaTransporte.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ruta Transportes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRutaTransporte = new JLabelMe();

		this.jLabelArchivoImportacionRutaTransporte.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYImportacion;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRutaTransporte.add(this.jLabelArchivoImportacionRutaTransporte, this.gridBagConstraintsRutaTransporte);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRutaTransporte = new JFileChooser();		
		this.jFileChooserImportacionRutaTransporte.setToolTipText("ESCOGER ARCHIVO"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRutaTransporte = new JButtonMe();
		this.jButtonAbrirImportacionRutaTransporte.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRutaTransporte,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRutaTransporte.setToolTipText("Generar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsRutaTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRutaTransporte.add(this.jButtonAbrirImportacionRutaTransporte, this.gridBagConstraintsRutaTransporte);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRutaTransporte = new JLabelMe();

		this.jLabelPathArchivoImportacionRutaTransporte.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYImportacion;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRutaTransporte.add(this.jLabelPathArchivoImportacionRutaTransporte, this.gridBagConstraintsRutaTransporte);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRutaTransporte=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRutaTransporte.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRutaTransporte.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRutaTransporte.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsRutaTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRutaTransporte.add(this.jTextFieldPathArchivoImportacionRutaTransporte, this.gridBagConstraintsRutaTransporte);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRutaTransporte = new JButtonMe();
		this.jButtonGenerarImportacionRutaTransporte.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRutaTransporte,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRutaTransporte.setToolTipText("Generar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsRutaTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRutaTransporte.add(this.jButtonGenerarImportacionRutaTransporte, this.gridBagConstraintsRutaTransporte);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRutaTransporte = new JButtonMe();
		this.jButtonCerrarImportacionRutaTransporte.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRutaTransporte,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRutaTransporte.setToolTipText("Cancelar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRutaTransporte.gridy = iPosYImportacion;
		this.gridBagConstraintsRutaTransporte.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRutaTransporte.add(this.jButtonCerrarImportacionRutaTransporte, this.gridBagConstraintsRutaTransporte);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRutaTransporte = new GridBagLayout();
		
		this.jScrollPanelImportacionRutaTransporte= new JScrollPane(jPanelImportacionRutaTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy =iPosYImportacion;
		this.gridBagConstraintsRutaTransporte.gridx =iPosXImportacion;
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRutaTransporte.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRutaTransporte.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRutaTransporte);
		this.jInternalFrameImportacionRutaTransporte.getContentPane().add(this.jScrollPanelImportacionRutaTransporte, this.gridBagConstraintsRutaTransporte);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRutaTransporte(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRutaTransporte = new JButtonMe();
			this.jButtonAbrirOrderByRutaTransporte.setText("Orden");
			this.jButtonAbrirOrderByRutaTransporte.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRutaTransporte,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRutaTransporte";
			inputMap = this.jButtonAbrirOrderByRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRutaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRutaTransporte"));
		
		
			GridBagLayout gridaBagLayoutOrderByRutaTransporte = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRutaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRutaTransporte.setName("jPanelOrderByRutaTransporte"); 
			
			this.jPanelOrderByRutaTransporte.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRutaTransporte.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRutaTransporte.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRutaTransporte.setLayout(gridaBagLayoutOrderByRutaTransporte);
			
			
			this.jTableDatosRutaTransporteOrderBy = new JTableMe();        
			this.jTableDatosRutaTransporteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRutaTransporteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRutaTransporteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRutaTransporteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRutaTransporteOrderBy.setViewportView(this.jTableDatosRutaTransporteOrderBy);
			this.jTableDatosRutaTransporteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRutaTransporteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRutaTransporte= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRutaTransporte= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRutaTransporte = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRutaTransporte= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRutaTransporte.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRutaTransporte.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRutaTransporte.setTitle("Orden");
			this.jInternalFrameOrderByRutaTransporte.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRutaTransporte.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRutaTransporte.setResizable(true);
			this.jInternalFrameOrderByRutaTransporte.setClosable(true);
			this.jInternalFrameOrderByRutaTransporte.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRutaTransporte.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRutaTransporte.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRutaTransporte.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ruta Transportes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRutaTransporte.gridx =iPosXOrderBy;
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRutaTransporte.ipady =150;
				
			this.jPanelOrderByRutaTransporte.add(jScrollPanelDatosRutaTransporteOrderBy, this.gridBagConstraintsRutaTransporte);//this.jTableDatosRutaTransporteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRutaTransporte = new JButtonMe();
			this.jButtonCerrarOrderByRutaTransporte.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRutaTransporte,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRutaTransporte.setToolTipText("Cancelar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRutaTransporte.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRutaTransporte.add(this.jButtonCerrarOrderByRutaTransporte, this.gridBagConstraintsRutaTransporte);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRutaTransporte = new GridBagLayout();
			
			this.jScrollPanelOrderByRutaTransporte= new JScrollPane(jPanelOrderByRutaTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.gridy =iPosYOrderBy;
			this.gridBagConstraintsRutaTransporte.gridx =iPosXOrderBy;
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRutaTransporte.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRutaTransporte.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRutaTransporte);
			
			this.jInternalFrameOrderByRutaTransporte.getContentPane().add(this.jScrollPanelOrderByRutaTransporte, this.gridBagConstraintsRutaTransporte);			
		
		} else {
			this.jButtonAbrirOrderByRutaTransporte = new JButtonMe();
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
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.rutatransporteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRutaTransporte.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRutaTransporte.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRutaTransporte.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRutaTransporte.getRowHeight();//RutaTransporteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RutaTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRutaTransporte.isSelected()) {
					iHeightTable=RutaTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RutaTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RutaTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RutaTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRutaTransporte.isSelected()) {
					iHeightTable=RutaTransporteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RutaTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RutaTransporteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRutaTransporte.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRutaTransporte.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRutaTransporte.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRutaTransporte.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRutaTransporte.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRutaTransporte.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRutaTransporte!=null && this.jInternalFrameOrderByRutaTransporte.getjTableDatosOrderBy()!=null) {
			//if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRutaTransporte.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRutaTransporte.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRutaTransporte.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRutaTransporte.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRutaTransporte.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRutaTransporte.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRutaTransporte.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRutaTransporte.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRutaTransporte.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRutaTransporte.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=rutatransporteLogic.getRutaTransportes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rutatransportes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RutaTransporte> TraerRutaTransporteBeans(List<RutaTransporte> rutatransportes,ArrayList<Classe> classes)throws Exception {
		try {
			for(RutaTransporte rutatransporte:rutatransportes) {
					
				if(!(RutaTransporteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RutaTransporteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					rutatransporte.setsDetalleGeneralEntityReporte(RutaTransporteConstantesFunciones.getRutaTransporteDescripcion(rutatransporte));
										
						
					
					

					if(rutatransporte.getProformas()!=null && Funciones.existeClass(classes,Proforma.class)) {
						try{rutatransporte.setproformasDescripcionReporte(new JRBeanCollectionDataSource(ProformaJInternalFrame.TraerProformaBeans(rutatransporte.getProformas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(rutatransporte.getPedidos()!=null && Funciones.existeClass(classes,Pedido.class)) {
						try{rutatransporte.setpedidosDescripcionReporte(new JRBeanCollectionDataSource(PedidoJInternalFrame.TraerPedidoBeans(rutatransporte.getPedidos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(rutatransporte.getServicioTransportes()!=null && Funciones.existeClass(classes,ServicioTransporte.class)) {
						try{rutatransporte.setserviciotransportesDescripcionReporte(new JRBeanCollectionDataSource(ServicioTransporteJInternalFrame.TraerServicioTransporteBeans(rutatransporte.getServicioTransportes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//rutatransporte.setsDetalleGeneralEntityReporte(rutatransporte.getsDetalleGeneralEntityReporte());
										
				}
				
				//rutatransportebeans.add(rutatransportebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return rutatransportes;
    }
	//PARA REPORTES FIN
}
