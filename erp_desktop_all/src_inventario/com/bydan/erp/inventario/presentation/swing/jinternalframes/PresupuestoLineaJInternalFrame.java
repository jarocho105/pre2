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
import com.bydan.erp.inventario.util.PresupuestoLineaConstantesFunciones;

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
public class PresupuestoLineaJInternalFrame extends PresupuestoLineaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPresupuestoLinea;
	
	protected JMenuBar jmenuBarPresupuestoLinea;
	
	protected JMenu jmenuPresupuestoLinea;
	protected JMenu jmenuDatosPresupuestoLinea;
	protected JMenu jmenuArchivoPresupuestoLinea;
	protected JMenu jmenuAccionesPresupuestoLinea;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPresupuestoLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresupuestoLinea;	
	protected GridBagConstraints gridBagConstraintsPresupuestoLinea;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PresupuestoLineaDetalleFormJInternalFrame jInternalFrameDetalleFormPresupuestoLinea;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPresupuestoLinea;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPresupuestoLinea;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";
	
	public PresupuestoLineaSessionBean presupuestolineaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public LineaSessionBean lineaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PresupuestoLinea> presupuestolineas;		
	public List<PresupuestoLinea> presupuestolineasEliminados;	
	public List<PresupuestoLinea> presupuestolineasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPresupuestoLinea;		
	protected JButton jButtonAbrirOrderByPresupuestoLinea;
	
	
	//protected JPanel jPanelOrderByPresupuestoLinea;
	//public JScrollPane jScrollPanelOrderByPresupuestoLinea;	
	//protected JButton jButtonCerrarOrderByPresupuestoLinea;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PresupuestoLineaLogic presupuestolineaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPresupuestoLinea;
	public JScrollPane jScrollPanelDatosEdicionPresupuestoLinea;
	public JScrollPane jScrollPanelDatosGeneralPresupuestoLinea;
    
	
	
	//public JScrollPane jScrollPanelDatosPresupuestoLineaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPresupuestoLinea;
	//public JScrollPane jScrollPanelImportacionPresupuestoLinea;
	
	
	
	protected JPanel jPanelAccionesPresupuestoLinea;
	
    protected JPanel jPanelPaginacionPresupuestoLinea;
    protected JPanel jPanelParametrosReportesPresupuestoLinea;
	protected JPanel jPanelParametrosReportesAccionesPresupuestoLinea;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PresupuestoLinea;
	protected JPanel jPanelParametrosAuxiliar2PresupuestoLinea;
	protected JPanel jPanelParametrosAuxiliar3PresupuestoLinea;
	protected JPanel jPanelParametrosAuxiliar4PresupuestoLinea;
	//protected JPanel jPanelParametrosAuxiliar5PresupuestoLinea;
	
	
	
	//protected JPanel jPanelReporteDinamicoPresupuestoLinea;
	//protected JPanel jPanelImportacionPresupuestoLinea;
	
	
	public JTable jTableDatosPresupuestoLinea;
	
	
	
	//public JTable jTableDatosPresupuestoLineaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPresupuestoLinea;
	protected JButton jButtonDuplicarPresupuestoLinea;
	protected JButton jButtonCopiarPresupuestoLinea;
	protected JButton jButtonVerFormPresupuestoLinea;
	protected JButton jButtonNuevoRelacionesPresupuestoLinea;
	protected JButton jButtonModificarPresupuestoLinea;
	
    protected JButton jButtonGuardarCambiosTablaPresupuestoLinea;
	protected JButton jButtonCerrarPresupuestoLinea;
	
	
	protected JButton jButtonRecargarInformacionPresupuestoLinea;
	protected JButton jButtonProcesarInformacionPresupuestoLinea;
	
	
	protected JButton jButtonAnterioresPresupuestoLinea;
	protected JButton jButtonSiguientesPresupuestoLinea;
	protected JButton jButtonNuevoGuardarCambiosPresupuestoLinea;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPresupuestoLinea;
	//protected JButton jButtonCerrarReporteDinamicoPresupuestoLinea;
	//protected JButton jButtonGenerarExcelReporteDinamicoPresupuestoLinea;	
	
	
	
	//protected JButton jButtonAbrirImportacionPresupuestoLinea;
	//protected JButton jButtonGenerarImportacionPresupuestoLinea;
	//protected JButton jButtonCerrarImportacionPresupuestoLinea;
	//protected JFileChooser jFileChooserImportacionPresupuestoLinea;
	//protected File fileImportacionPresupuestoLinea;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresupuestoLinea;
	protected JButton jButtonDuplicarToolBarPresupuestoLinea;
	protected JButton jButtonNuevoRelacionesToolBarPresupuestoLinea;
	
	
	public JButton jButtonGuardarCambiosToolBarPresupuestoLinea;
	protected JButton jButtonCopiarToolBarPresupuestoLinea;
	protected JButton jButtonVerFormToolBarPresupuestoLinea;
	public JButton jButtonGuardarCambiosTablaToolBarPresupuestoLinea;
	protected JButton jButtonMostrarOcultarTablaToolBarPresupuestoLinea;
	protected JButton jButtonCerrarToolBarPresupuestoLinea;
	
	protected JButton jButtonRecargarInformacionToolBarPresupuestoLinea;
	protected JButton jButtonProcesarInformacionToolBarPresupuestoLinea;
	protected JButton jButtonAnterioresToolBarPresupuestoLinea;
	protected JButton jButtonSiguientesToolBarPresupuestoLinea;
	protected JButton jButtonNuevoGuardarCambiosToolBarPresupuestoLinea;
	protected JButton jButtonAbrirOrderByToolBarPresupuestoLinea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresupuestoLinea;
	protected JMenuItem jMenuItemDuplicarPresupuestoLinea;
	protected JMenuItem jMenuItemNuevoRelacionesPresupuestoLinea;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPresupuestoLinea;
	protected JMenuItem jMenuItemCopiarPresupuestoLinea;
	protected JMenuItem jMenuItemVerFormPresupuestoLinea;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresupuestoLinea;
	protected JMenuItem jMenuItemCerrarPresupuestoLinea;
	protected JMenuItem jMenuItemDetalleCerrarPresupuestoLinea;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPresupuestoLinea;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresupuestoLinea;
	
	protected JMenuItem jMenuItemRecargarInformacionPresupuestoLinea;
	protected JMenuItem jMenuItemProcesarInformacionPresupuestoLinea;
	protected JMenuItem jMenuItemAnterioresPresupuestoLinea;
	protected JMenuItem jMenuItemSiguientesPresupuestoLinea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresupuestoLinea;
	protected JMenuItem jMenuItemAbrirOrderByPresupuestoLinea;
	protected JMenuItem jMenuItemMostrarOcultarPresupuestoLinea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresupuestoLinea;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPresupuestoLinea;
	protected JCheckBox jCheckBoxSeleccionadosPresupuestoLinea;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPresupuestoLinea;
	protected JCheckBox jCheckBoxConGraficoReportePresupuestoLinea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPresupuestoLinea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPresupuestoLinea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestoLinea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPresupuestoLinea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPresupuestoLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPresupuestoLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresupuestoLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresupuestoLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPresupuestoLinea;
	protected JTextField jTextFieldValorCampoGeneralPresupuestoLinea;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePresupuestoLinea;
	//public JList<Reporte> jListColumnasSelectReportePresupuestoLinea;
	//public JScrollPane jScrollColumnasSelectReportePresupuestoLinea;
	
	//public JLabel jLabelRelacionesSelectReportePresupuestoLinea;
	//public JList<Reporte> jListRelacionesSelectReportePresupuestoLinea;
	//public JScrollPane jScrollRelacionesSelectReportePresupuestoLinea;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPresupuestoLinea;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPresupuestoLinea;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPresupuestoLinea;
	//public JLabel jLabelTiposArchivoReporteDinamicoPresupuestoLinea;
	
		
	//public JLabel jLabelArchivoImportacionPresupuestoLinea;	
	//public JLabel jLabelPathArchivoImportacionPresupuestoLinea;
	//protected JTextField jTextFieldPathArchivoImportacionPresupuestoLinea;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPresupuestoLinea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPresupuestoLinea;
	
	//public JLabel jLabelColumnaCategoriaValorPresupuestoLinea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPresupuestoLinea;
	
	//public JLabel jLabelColumnasValoresGraficoPresupuestoLinea;
	//public JList<Reporte> jListColumnasValoresGraficoPresupuestoLinea;
	//public JScrollPane jScrollColumnasValoresGraficoPresupuestoLinea;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPresupuestoLinea;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPresupuestoLinea;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPresupuestoLinea;
	public JPanel jPanelFK_IdLineaPresupuestoLinea;
	public JButton jButtonFK_IdLineaPresupuestoLinea;
	
	public JPanel jPanelid_lineaFK_IdLineaPresupuestoLinea;
	public JLabel jLabelid_lineaFK_IdLineaPresupuestoLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaFK_IdLineaPresupuestoLinea;
	public JButton jButtonid_lineaFK_IdLineaPresupuestoLinea= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaPresupuestoLineaUpdate= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaPresupuestoLineaBusqueda= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaPresupuestoLineaArbol= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public PresupuestoLineaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PresupuestoLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoLineaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoLineaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresupuestoLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresupuestoLineaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresupuestoLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPresupuestoLinea)	{
		this.jButtonRecargarInformacionPresupuestoLinea = jButtonRecargarInformacionPresupuestoLinea;
	}
	
	public JButton getjButtonProcesarInformacionPresupuestoLinea() {
		return this.jButtonProcesarInformacionPresupuestoLinea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresupuestoLinea)	{
		this.jButtonProcesarInformacionPresupuestoLinea = jButtonProcesarInformacionPresupuestoLinea;
	}
	
	
	public JButton getjButtonRecargarInformacionPresupuestoLinea() {
		return this.jButtonRecargarInformacionPresupuestoLinea;
	}
	
	
	public List<PresupuestoLinea> getpresupuestolineas() {
		return this.presupuestolineas;
	}

	public void setpresupuestolineas(List<PresupuestoLinea> presupuestolineas) {
		this.presupuestolineas = presupuestolineas;
	}
	
	public List<PresupuestoLinea> getpresupuestolineasAux() {
		return this.presupuestolineasAux;
	}

	public void setpresupuestolineasAux(List<PresupuestoLinea> presupuestolineasAux) {
		this.presupuestolineasAux = presupuestolineasAux;
	}
	
	public List<PresupuestoLinea> getpresupuestolineasEliminados() {
		return this.presupuestolineasEliminados;
	}

	public void setPresupuestoLineasEliminados(List<PresupuestoLinea> presupuestolineasEliminados) {
		this.presupuestolineasEliminados = presupuestolineasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPresupuestoLinea() {
		return jComboBoxTiposSeleccionarPresupuestoLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPresupuestoLinea(
			JComboBox jComboBoxTiposSeleccionarPresupuestoLinea) {
		this.jComboBoxTiposSeleccionarPresupuestoLinea = jComboBoxTiposSeleccionarPresupuestoLinea;
	}
	
	public void setBorderResaltarTiposSeleccionarPresupuestoLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPresupuestoLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPresupuestoLinea .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPresupuestoLinea() {
		return jTextFieldValorCampoGeneralPresupuestoLinea;
	}

	public void setjTextFieldValorCampoGeneralPresupuestoLinea(
			JTextField jTextFieldValorCampoGeneralPresupuestoLinea) {
		this.jTextFieldValorCampoGeneralPresupuestoLinea = jTextFieldValorCampoGeneralPresupuestoLinea;
	}

	public void setBorderResaltarValorCampoGeneralPresupuestoLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoLinea.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPresupuestoLinea .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPresupuestoLinea() {
		return this.jCheckBoxSeleccionarTodosPresupuestoLinea;
	}

	public void setjCheckBoxSeleccionarTodosPresupuestoLinea(
			JCheckBox jCheckBoxSeleccionarTodosPresupuestoLinea) {
		this.jCheckBoxSeleccionarTodosPresupuestoLinea = jCheckBoxSeleccionarTodosPresupuestoLinea;
	}

	public void setBorderResaltarSeleccionarTodosPresupuestoLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoLinea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPresupuestoLinea .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPresupuestoLinea() {
		return this.jCheckBoxSeleccionadosPresupuestoLinea;
	}

	public void setjCheckBoxSeleccionadosPresupuestoLinea(
			JCheckBox jCheckBoxSeleccionadosPresupuestoLinea) {
		this.jCheckBoxSeleccionadosPresupuestoLinea = jCheckBoxSeleccionadosPresupuestoLinea;
	}
	
	public void setBorderResaltarSeleccionadosPresupuestoLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoLinea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPresupuestoLinea .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPresupuestoLinea() {
		return this.jComboBoxTiposArchivosReportesPresupuestoLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPresupuestoLinea(
			JComboBox jComboBoxTiposArchivosReportesPresupuestoLinea) {
		this.jComboBoxTiposArchivosReportesPresupuestoLinea = jComboBoxTiposArchivosReportesPresupuestoLinea;
	}

	public void setBorderResaltarTiposArchivosReportesPresupuestoLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPresupuestoLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPresupuestoLinea() {
		return this.jComboBoxTiposReportesPresupuestoLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPresupuestoLinea(
			JComboBox jComboBoxTiposReportesPresupuestoLinea) {
		this.jComboBoxTiposReportesPresupuestoLinea = jComboBoxTiposReportesPresupuestoLinea;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPresupuestoLinea() {
	//	return jComboBoxTiposReportesDinamicoPresupuestoLinea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPresupuestoLinea(
	//		JComboBox jComboBoxTiposReportesDinamicoPresupuestoLinea) {
	//	this.jComboBoxTiposReportesDinamicoPresupuestoLinea = jComboBoxTiposReportesDinamicoPresupuestoLinea;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPresupuestoLinea() {
	//	return jComboBoxTiposArchivosReportesDinamicoPresupuestoLinea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPresupuestoLinea(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPresupuestoLinea) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPresupuestoLinea = jComboBoxTiposArchivosReportesDinamicoPresupuestoLinea;
	//}
	
	public void setBorderResaltarTiposReportesPresupuestoLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPresupuestoLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPresupuestoLinea() {
		return this.jComboBoxTiposGraficosReportesPresupuestoLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPresupuestoLinea(
			JComboBox jComboBoxTiposGraficosReportesPresupuestoLinea) {
		this.jComboBoxTiposGraficosReportesPresupuestoLinea = jComboBoxTiposGraficosReportesPresupuestoLinea;
	}
	
	public void setBorderResaltarTiposGraficosReportesPresupuestoLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPresupuestoLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPresupuestoLinea() {
		return this.jComboBoxTiposPaginacionPresupuestoLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPresupuestoLinea(
			JComboBox jComboBoxTiposPaginacionPresupuestoLinea) {
		this.jComboBoxTiposPaginacionPresupuestoLinea = jComboBoxTiposPaginacionPresupuestoLinea;
	}
	
	public void setBorderResaltarTiposPaginacionPresupuestoLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPresupuestoLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPresupuestoLinea() {
		return this.jComboBoxTiposRelacionesPresupuestoLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresupuestoLinea() {
		return this.jComboBoxTiposAccionesPresupuestoLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresupuestoLinea(
			JComboBox jComboBoxTiposRelacionesPresupuestoLinea) {
		this.jComboBoxTiposRelacionesPresupuestoLinea = jComboBoxTiposRelacionesPresupuestoLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresupuestoLinea(
			JComboBox jComboBoxTiposAccionesPresupuestoLinea) {
		this.jComboBoxTiposAccionesPresupuestoLinea = jComboBoxTiposAccionesPresupuestoLinea;
	}
	
	public void setBorderResaltarTiposRelacionesPresupuestoLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPresupuestoLinea .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPresupuestoLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresupuestoLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPresupuestoLinea .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPresupuestoLinea() {
	//	return jCheckBoxConGraficoDinamicoPresupuestoLinea;
	//}

	//public void setjCheckBoxConGraficoDinamicoPresupuestoLinea(
	//		JCheckBox jCheckBoxConGraficoDinamicoPresupuestoLinea) {
	//	this.jCheckBoxConGraficoDinamicoPresupuestoLinea = jCheckBoxConGraficoDinamicoPresupuestoLinea;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPresupuestoLinea() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPresupuestoLinea.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPresupuestoLinea .setBorder(borderResaltar);		
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
		this.presupuestolineaSessionBean=new PresupuestoLineaSessionBean();
		
		this.presupuestolineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestolineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presupuestolineaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PresupuestoLineaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PresupuestoLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresupuestoLineaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresupuestoLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresupuestoLineaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Presupuesto Linea MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
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
		
		PresupuestoLineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PresupuestoLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPresupuestoLinea= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPresupuestoLinea,this.jTtoolBarPresupuestoLinea,
							"nuevo","nuevo","Nuevo"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPresupuestoLinea,this.jTtoolBarPresupuestoLinea,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPresupuestoLinea,this.jTtoolBarPresupuestoLinea,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPresupuestoLinea,this.jTtoolBarPresupuestoLinea,
							"duplicar","duplicar","Duplicar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPresupuestoLinea,this.jTtoolBarPresupuestoLinea,
							"copiar","copiar","Copiar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPresupuestoLinea,this.jTtoolBarPresupuestoLinea,
							"ver_form","ver_form","Ver"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoLinea,this.jTtoolBarPresupuestoLinea,
							"recargar","recargar","Recargar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoLinea,this.jTtoolBarPresupuestoLinea,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresupuestoLinea,this.jTtoolBarPresupuestoLinea,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPresupuestoLinea,this.jTtoolBarPresupuestoLinea,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPresupuestoLinea,this.jTtoolBarPresupuestoLinea,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPresupuestoLinea,this.jTtoolBarPresupuestoLinea,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPresupuestoLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPresupuestoLinea,this.jTtoolBarPresupuestoLinea,
							"cerrar","cerrar","Salir"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPresupuestoLinea=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPresupuestoLinea;
			
				this.jButtonProcesarInformacionToolBarPresupuestoLinea=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPresupuestoLinea;
				
		//protected JButton jButtonModificarToolBarPresupuestoLinea;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPresupuestoLinea=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPresupuestoLinea=new JMenuMe("General");
		this.jmenuArchivoPresupuestoLinea=new JMenuMe("Archivo");
		this.jmenuAccionesPresupuestoLinea=new JMenuMe("Acciones");
		this.jmenuDatosPresupuestoLinea=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresupuestoLinea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresupuestoLinea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresupuestoLinea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPresupuestoLinea= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPresupuestoLinea.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPresupuestoLinea,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPresupuestoLinea= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPresupuestoLinea.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPresupuestoLinea,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPresupuestoLinea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresupuestoLinea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresupuestoLinea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPresupuestoLinea= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPresupuestoLinea.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPresupuestoLinea,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPresupuestoLinea= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPresupuestoLinea.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPresupuestoLinea,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPresupuestoLinea= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPresupuestoLinea.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPresupuestoLinea,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresupuestoLinea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresupuestoLinea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresupuestoLinea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPresupuestoLinea= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPresupuestoLinea.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPresupuestoLinea,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPresupuestoLinea= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPresupuestoLinea.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPresupuestoLinea,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPresupuestoLinea= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPresupuestoLinea.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPresupuestoLinea,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPresupuestoLinea= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPresupuestoLinea.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPresupuestoLinea,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPresupuestoLinea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPresupuestoLinea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPresupuestoLinea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresupuestoLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresupuestoLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresupuestoLinea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPresupuestoLinea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPresupuestoLinea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPresupuestoLinea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresupuestoLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresupuestoLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresupuestoLinea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPresupuestoLinea= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPresupuestoLinea.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPresupuestoLinea,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPresupuestoLinea.add(this.jMenuItemCerrarPresupuestoLinea);
			
			this.jmenuAccionesPresupuestoLinea.add(this.jMenuItemNuevoPresupuestoLinea);
			this.jmenuAccionesPresupuestoLinea.add(this.jMenuItemNuevoGuardarCambiosPresupuestoLinea);
			this.jmenuAccionesPresupuestoLinea.add(this.jMenuItemNuevoRelacionesPresupuestoLinea);
			this.jmenuAccionesPresupuestoLinea.add(this.jMenuItemGuardarCambiosTablaPresupuestoLinea);		
			this.jmenuAccionesPresupuestoLinea.add(this.jMenuItemDuplicarPresupuestoLinea);		
			this.jmenuAccionesPresupuestoLinea.add(this.jMenuItemCopiarPresupuestoLinea);		
			this.jmenuAccionesPresupuestoLinea.add(this.jMenuItemVerFormPresupuestoLinea);		
			
			this.jmenuDatosPresupuestoLinea.add(this.jMenuItemRecargarInformacionPresupuestoLinea);				
			this.jmenuDatosPresupuestoLinea.add(this.jMenuItemAnterioresPresupuestoLinea);				
			this.jmenuDatosPresupuestoLinea.add(this.jMenuItemSiguientesPresupuestoLinea);				
			this.jmenuDatosPresupuestoLinea.add(this.jMenuItemAbrirOrderByPresupuestoLinea);				
			this.jmenuDatosPresupuestoLinea.add(this.jMenuItemMostrarOcultarPresupuestoLinea);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPresupuestoLinea.add(this.jMenuItemGuardarCambiosPresupuestoLinea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPresupuestoLinea.add(this.jmenuArchivoPresupuestoLinea);		
			this.jmenuBarPresupuestoLinea.add(this.jmenuAccionesPresupuestoLinea);		
			this.jmenuBarPresupuestoLinea.add(this.jmenuDatosPresupuestoLinea);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPresupuestoLinea);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPresupuestoLinea() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdLineaPresupuestoLinea=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaPresupuestoLinea.setToolTipText("Buscar Por Linea ");
		this.jButtonFK_IdLineaPresupuestoLinea= new JButtonMe();
		this.jButtonFK_IdLineaPresupuestoLinea.setText("Buscar");
		this.jButtonFK_IdLineaPresupuestoLinea.setToolTipText("Buscar Por Linea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaPresupuestoLinea,"buscar_button","Buscar Por Linea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_lineaFK_IdLineaPresupuestoLinea = new JLabelMe();
		jLabelid_lineaFK_IdLineaPresupuestoLinea.setText("Linea :");
		jLabelid_lineaFK_IdLineaPresupuestoLinea.setToolTipText("Linea");
		jLabelid_lineaFK_IdLineaPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaFK_IdLineaPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaFK_IdLineaPresupuestoLinea= new JComboBoxMe();
		jComboBoxid_lineaFK_IdLineaPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaFK_IdLineaPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPresupuestoLinea=new JTabbedPane();


		this.jTabbedPaneBusquedasPresupuestoLinea.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresupuestoLinea.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresupuestoLinea.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPresupuestoLinea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePresupuestoLinea = new PresupuestoLineaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Presupuesto Linea DATOS");
			this.jInternalFrameDetalleFormPresupuestoLinea = new PresupuestoLineaDetalleFormJInternalFrame(jDesktopPane,this.presupuestolineaSessionBean.getConGuardarRelaciones(),this.presupuestolineaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPresupuestoLinea = null;//new PresupuestoLineaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresupuestoLinea= new GridBagLayout();
		
		
		this.jTableDatosPresupuestoLinea = new JTableMe();      
		
		String sToolTipPresupuestoLinea="";
		sToolTipPresupuestoLinea=PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresupuestoLinea+="(Inventario.PresupuestoLinea)";
		}
		
		if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresupuestoLinea+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPresupuestoLinea.setToolTipText(sToolTipPresupuestoLinea);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPresupuestoLinea);
		this.jTableDatosPresupuestoLinea.setAutoCreateRowSorter(true);
		this.jTableDatosPresupuestoLinea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPresupuestoLinea.setRowSelectionAllowed(true);
		this.jTableDatosPresupuestoLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPresupuestoLinea,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPresupuestoLinea = new JButtonMe();
		this.jButtonDuplicarPresupuestoLinea = new JButtonMe();
		this.jButtonCopiarPresupuestoLinea = new JButtonMe();
		this.jButtonVerFormPresupuestoLinea = new JButtonMe();
		this.jButtonNuevoRelacionesPresupuestoLinea = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPresupuestoLinea = new JButtonMe();
		this.jButtonCerrarPresupuestoLinea = new JButtonMe();
		
		this.jScrollPanelDatosPresupuestoLinea = new JScrollPane();   
        this.jScrollPanelDatosGeneralPresupuestoLinea = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPresupuestoLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Presupuesto Linea";
		
		if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Lineaes" + this.sPath));
		} else {
			this.jScrollPanelDatosPresupuestoLinea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresupuestoLinea.setToolTipText("Acciones");
        this.jPanelAccionesPresupuestoLinea.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPresupuestoLinea=new ReporteDinamicoJInternalFrame(PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPresupuestoLinea();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPresupuestoLinea=new ImportacionJInternalFrame(PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPresupuestoLinea();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPresupuestoLinea = new JButtonMe();
		
		this.jButtonAbrirOrderByPresupuestoLinea.setText("Orden");
		this.jButtonAbrirOrderByPresupuestoLinea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestoLinea,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPresupuestoLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestoLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoLinea,false,this);
			
			//this.cargarOrderByPresupuestoLinea(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresupuestoLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoLinea,true,this);
			
			//this.cargarOrderByPresupuestoLinea(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPresupuestoLinea.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosPresupuestoLinea.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosPresupuestoLinea.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosPresupuestoLinea.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestoLinea.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresupuestoLinea.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPresupuestoLinea.setText("Nuevo");
		this.jButtonDuplicarPresupuestoLinea.setText("Duplicar");
		this.jButtonCopiarPresupuestoLinea.setText("Copiar");
		this.jButtonVerFormPresupuestoLinea.setText("Ver");
		this.jButtonNuevoRelacionesPresupuestoLinea.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPresupuestoLinea.setText("Guardar");
		this.jButtonCerrarPresupuestoLinea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresupuestoLinea,"nuevo_button","Nuevo",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPresupuestoLinea,"duplicar_button","Duplicar",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPresupuestoLinea,"copiar_button","Copiar",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPresupuestoLinea,"ver_form","Ver",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPresupuestoLinea,"nuevorelaciones_button","Nuevo Rel",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresupuestoLinea,"guardarcambiostabla_button","Guardar",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresupuestoLinea,"cerrar_button","Salir",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPresupuestoLinea.setToolTipText("Nuevo"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPresupuestoLinea.setToolTipText("Duplicar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPresupuestoLinea.setToolTipText("Copiar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPresupuestoLinea.setToolTipText("Ver"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPresupuestoLinea.setToolTipText("Nuevo Rel"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPresupuestoLinea.setToolTipText("Guardar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresupuestoLinea.setToolTipText("Salir"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresupuestoLinea";
		inputMap = this.jButtonNuevoPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresupuestoLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresupuestoLinea"));
		
		//DUPLICAR
		sMapKey = "DuplicarPresupuestoLinea";
		inputMap = this.jButtonDuplicarPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPresupuestoLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPresupuestoLinea"));
		
		//COPIAR
		sMapKey = "CopiarPresupuestoLinea";
		inputMap = this.jButtonCopiarPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPresupuestoLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPresupuestoLinea"));
		
		//VEr FORM
		sMapKey = "VerFormPresupuestoLinea";
		inputMap = this.jButtonVerFormPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPresupuestoLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPresupuestoLinea"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPresupuestoLinea";
		inputMap = this.jButtonNuevoRelacionesPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPresupuestoLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPresupuestoLinea"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPresupuestoLinea";
		inputMap = this.jButtonModificarPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPresupuestoLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPresupuestoLinea"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPresupuestoLinea";
		inputMap = this.jButtonCerrarPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresupuestoLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresupuestoLinea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresupuestoLinea";
		inputMap = this.jButtonGuardarCambiosTablaPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresupuestoLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresupuestoLinea"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPresupuestoLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPresupuestoLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPresupuestoLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PresupuestoLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PresupuestoLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PresupuestoLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PresupuestoLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PresupuestoLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPresupuestoLinea.setName("jPanelParametrosReportesPresupuestoLinea"); 
		
		this.jPanelParametrosReportesAccionesPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPresupuestoLinea.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPresupuestoLinea.setName("jPanelParametrosReportesAccionesPresupuestoLinea"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPresupuestoLinea = new JButtonMe();
		this.jButtonRecargarInformacionPresupuestoLinea.setText("Recargar");
		this.jButtonRecargarInformacionPresupuestoLinea.setToolTipText("Recargar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPresupuestoLinea,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPresupuestoLinea = new JButtonMe();
		this.jButtonProcesarInformacionPresupuestoLinea.setText("Procesar");
		this.jButtonProcesarInformacionPresupuestoLinea.setToolTipText("Procesar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPresupuestoLinea.setVisible(false);
			
		this.jButtonProcesarInformacionPresupuestoLinea.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestoLinea.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresupuestoLinea.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPresupuestoLinea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoLinea.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPresupuestoLinea.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPresupuestoLinea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoLinea.setText("TIPO");       
		this.jComboBoxTiposReportesPresupuestoLinea.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPresupuestoLinea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresupuestoLinea.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPresupuestoLinea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPresupuestoLinea = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPresupuestoLinea.setText("Paginacion");
		this.jComboBoxTiposPaginacionPresupuestoLinea.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPresupuestoLinea = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPresupuestoLinea.setText("Accion");
		this.jComboBoxTiposRelacionesPresupuestoLinea.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPresupuestoLinea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresupuestoLinea.setText("Accion");
		this.jComboBoxTiposAccionesPresupuestoLinea.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPresupuestoLinea = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPresupuestoLinea.setText("Accion");
		this.jComboBoxTiposSeleccionarPresupuestoLinea.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPresupuestoLinea=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPresupuestoLinea.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestoLinea.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresupuestoLinea.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPresupuestoLinea = new JLabelMe();
		
		this.jLabelAccionesPresupuestoLinea.setText("Acciones");		
		this.jLabelAccionesPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPresupuestoLinea = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPresupuestoLinea.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPresupuestoLinea.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPresupuestoLinea = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPresupuestoLinea.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPresupuestoLinea.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPresupuestoLinea = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPresupuestoLinea.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPresupuestoLinea.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePresupuestoLinea = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePresupuestoLinea.setText("Graf.");
		this.jCheckBoxConGraficoReportePresupuestoLinea.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPresupuestoLinea = new JButtonMe();
		//this.jButtonAnterioresPresupuestoLinea.setText("<<");
        this.jButtonAnterioresPresupuestoLinea.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPresupuestoLinea,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPresupuestoLinea = new JButtonMe();
		//this.jButtonSiguientesPresupuestoLinea.setText(">>");
        this.jButtonSiguientesPresupuestoLinea.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPresupuestoLinea,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPresupuestoLinea = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPresupuestoLinea.setText("Nue");
        this.jButtonNuevoGuardarCambiosPresupuestoLinea.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPresupuestoLinea,"nuevoguardarcambios_button","Nue",this.presupuestolineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPresupuestoLinea";
		inputMap = this.jButtonNuevoGuardarCambiosPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPresupuestoLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPresupuestoLinea"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPresupuestoLinea";
		inputMap = this.jButtonRecargarInformacionPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPresupuestoLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPresupuestoLinea"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPresupuestoLinea";
		inputMap = this.jButtonSiguientesPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPresupuestoLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPresupuestoLinea"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPresupuestoLinea";
		inputMap = this.jButtonAnterioresPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPresupuestoLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPresupuestoLinea"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPresupuestoLinea();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPresupuestoLinea.setMinimumSize(new Dimension(this.getWidth(),PresupuestoLineaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoLineaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestoLinea.setMaximumSize(new Dimension(this.getWidth(),PresupuestoLineaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoLineaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresupuestoLinea.setPreferredSize(new Dimension(this.getWidth(),PresupuestoLineaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresupuestoLineaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPresupuestoLinea = new GridBagLayout();

			this.jPanelPaginacionPresupuestoLinea.setLayout(gridaBagLayoutPaginacionPresupuestoLinea);						
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy = 0;
			this.gridBagConstraintsPresupuestoLinea.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPresupuestoLinea.add(this.jButtonAnterioresPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
					
						
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestoLinea.gridy = 0;
			
			this.jPanelPaginacionPresupuestoLinea.add(this.jButtonNuevoGuardarCambiosPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
						
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPresupuestoLinea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresupuestoLinea.gridy = 0;
			this.jPanelPaginacionPresupuestoLinea.add(this.jButtonSiguientesPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy = 1;
			this.gridBagConstraintsPresupuestoLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoLinea.add(this.jButtonNuevoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
						
			
			
			if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresupuestoLinea.gridy = 1;
				this.gridBagConstraintsPresupuestoLinea.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPresupuestoLinea.add(this.jButtonGuardarCambiosTablaPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
			}
			
			
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy = 1;
			this.gridBagConstraintsPresupuestoLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoLinea.add(this.jButtonDuplicarPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy = 1;
			this.gridBagConstraintsPresupuestoLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoLinea.add(this.jButtonCopiarPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy = 1;
			this.gridBagConstraintsPresupuestoLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresupuestoLinea.add(this.jButtonVerFormPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy = 1;
			this.gridBagConstraintsPresupuestoLinea.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPresupuestoLinea.add(this.jButtonCerrarPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
		
		
		this.jButtonRecargarInformacionPresupuestoLinea.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestoLinea.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresupuestoLinea.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPresupuestoLinea.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestoLinea.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresupuestoLinea.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPresupuestoLinea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestoLinea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresupuestoLinea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPresupuestoLinea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestoLinea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresupuestoLinea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPresupuestoLinea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestoLinea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresupuestoLinea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPresupuestoLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestoLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresupuestoLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPresupuestoLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresupuestoLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPresupuestoLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestoLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresupuestoLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPresupuestoLinea.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestoLinea.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresupuestoLinea.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePresupuestoLinea.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestoLinea.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresupuestoLinea.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPresupuestoLinea.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestoLinea.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresupuestoLinea.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPresupuestoLinea.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestoLinea.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresupuestoLinea.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPresupuestoLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPresupuestoLinea = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PresupuestoLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PresupuestoLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PresupuestoLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PresupuestoLinea = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPresupuestoLinea.setLayout(gridaBagParametrosReportesPresupuestoLinea);
			this.jPanelParametrosReportesAccionesPresupuestoLinea.setLayout(gridaBagParametrosReportesAccionesPresupuestoLinea);
			
			
			this.jPanelParametrosAuxiliar1PresupuestoLinea.setLayout(gridaBagParametrosAuxiliar1PresupuestoLinea);
			this.jPanelParametrosAuxiliar2PresupuestoLinea.setLayout(gridaBagParametrosAuxiliar2PresupuestoLinea);
			this.jPanelParametrosAuxiliar3PresupuestoLinea.setLayout(gridaBagParametrosAuxiliar3PresupuestoLinea);
			this.jPanelParametrosAuxiliar4PresupuestoLinea.setLayout(gridaBagParametrosAuxiliar4PresupuestoLinea);
			//this.jPanelParametrosAuxiliar5PresupuestoLinea.setLayout(gridaBagParametrosAuxiliar2PresupuestoLinea);			
			
			
			
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoLinea.add(this.jButtonRecargarInformacionPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoLinea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoLinea.add(this.jComboBoxTiposPaginacionPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoLinea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoLinea.add(this.jCheckBoxConAltoMaximoTablaPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoLinea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresupuestoLinea.add(this.jComboBoxTiposArchivosReportesPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoLinea.add(this.jPanelParametrosAuxiliar1PresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PresupuestoLinea.add(this.jComboBoxTiposReportesPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);																		
			
			
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PresupuestoLinea.add(this.jComboBoxTiposGraficosReportesPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoLinea.add(this.jPanelParametrosAuxiliar4PresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoLinea.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoLinea.add(this.jComboBoxTiposReportesPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoLinea.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoLinea.add(this.jCheckBoxGenerarReportePresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoLinea.add(this.jPanelParametrosAuxiliar2PresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoLinea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoLinea.add(this.jLabelAccionesPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
				this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPresupuestoLinea.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPresupuestoLinea.add(this.jButtonAbrirOrderByPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoLinea.add(this.jComboBoxTiposSeleccionarPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);			
			
			
			/*
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoLinea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoLinea.add(this.jCheckBoxSeleccionarTodosPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoLinea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresupuestoLinea.add(this.jCheckBoxConGraficoReportePresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoLinea.add(this.jCheckBoxSeleccionarTodosPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);															
				
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoLinea.add(this.jCheckBoxSeleccionadosPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);															
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresupuestoLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresupuestoLinea.add(this.jCheckBoxConGraficoReportePresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresupuestoLinea.add(this.jPanelParametrosAuxiliar3PresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoLinea.add(this.jComboBoxTiposAccionesPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
	
				
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresupuestoLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresupuestoLinea.add(this.jTextFieldValorCampoGeneralPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPresupuestoLinea = new GridBagLayout();

			this.jScrollPanelDatosPresupuestoLinea.setLayout(gridaBagLayoutDatosPresupuestoLinea);
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy = 0;
			this.gridBagConstraintsPresupuestoLinea.gridx = 0;
			
			this.jScrollPanelDatosPresupuestoLinea.add(this.jTableDatosPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPresupuestoLinea.setViewportView(this.jTableDatosPresupuestoLinea);
		this.jTableDatosPresupuestoLinea.setFillsViewportHeight(true);
		this.jTableDatosPresupuestoLinea.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresupuestoLinea= new GridBagLayout();
		this.jPanelAccionesPresupuestoLinea.setLayout(gridaBagLayoutAccionesPresupuestoLinea);
		
		
		/*	
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = 0;
		this.gridBagConstraintsPresupuestoLinea.gridx = 0;
			
		this.jPanelAccionesPresupuestoLinea.add(this.jButtonNuevoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdLineaPresupuestoLinea= new GridBagLayout();
		gridaBagLayoutFK_IdLineaPresupuestoLinea.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaPresupuestoLinea.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaPresupuestoLinea.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaPresupuestoLinea.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaPresupuestoLinea.setLayout(gridaBagLayoutFK_IdLineaPresupuestoLinea);

		gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoLinea.gridy = 0;
		gridBagConstraintsPresupuestoLinea.gridx = 0;
		jPanelFK_IdLineaPresupuestoLinea.add(jLabelid_lineaFK_IdLineaPresupuestoLinea, gridBagConstraintsPresupuestoLinea);

		gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoLinea.gridy = 0;
		gridBagConstraintsPresupuestoLinea.gridx = 1;
		jPanelFK_IdLineaPresupuestoLinea.add(jComboBoxid_lineaFK_IdLineaPresupuestoLinea, gridBagConstraintsPresupuestoLinea);

		gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresupuestoLinea.gridy = 1;
		gridBagConstraintsPresupuestoLinea.gridx =1;
		jPanelFK_IdLineaPresupuestoLinea.add(jButtonFK_IdLineaPresupuestoLinea, gridBagConstraintsPresupuestoLinea);

		jTabbedPaneBusquedasPresupuestoLinea.addTab("1.-Por Linea ", jPanelFK_IdLineaPresupuestoLinea);
		jTabbedPaneBusquedasPresupuestoLinea.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresupuestoLinea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresupuestoLinea);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();						
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoLinea.gridx = 0;		
			//this.gridBagConstraintsPresupuestoLinea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresupuestoLinea.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoLinea.gridx = 0;		
		//this.gridBagConstraintsPresupuestoLinea.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPresupuestoLinea.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPresupuestoLinea);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPresupuestoLinea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresupuestoLinea.gridx = 0;		
			this.gridBagConstraintsPresupuestoLinea.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPresupuestoLinea.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoLinea.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);								
		
		
		/*
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoLinea.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		*/		
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresupuestoLinea.gridx =0;
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresupuestoLinea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
				
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoLinea.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PresupuestoLineaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPresupuestoLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresupuestoLinea = new GridBagLayout();
			this.jPanelBusquedasParametrosPresupuestoLinea.setLayout(gridaBagLayoutBusquedasParametrosPresupuestoLinea);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPresupuestoLinea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresupuestoLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresupuestoLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
			
			
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
			
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresupuestoLinea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPresupuestoLinea;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPresupuestoLinea() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPresupuestoLinea = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPresupuestoLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPresupuestoLinea.setName("jPanelReporteDinamicoPresupuestoLinea"); 
		
		this.jPanelReporteDinamicoPresupuestoLinea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestoLinea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresupuestoLinea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPresupuestoLinea.setLayout(gridaBagLayoutReporteDinamicoPresupuestoLinea);
		
		
		this.jInternalFrameReporteDinamicoPresupuestoLinea= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPresupuestoLinea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestoLinea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPresupuestoLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPresupuestoLinea.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPresupuestoLinea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPresupuestoLinea.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPresupuestoLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPresupuestoLinea.setResizable(true);
	    this.jInternalFrameReporteDinamicoPresupuestoLinea.setClosable(true);
	    this.jInternalFrameReporteDinamicoPresupuestoLinea.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPresupuestoLinea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestoLinea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresupuestoLinea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Lineaes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePresupuestoLinea = new JLabelMe();

		this.jLabelColumnasSelectReportePresupuestoLinea.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jLabelColumnasSelectReportePresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePresupuestoLinea = new JList<Reporte>();
		this.jListColumnasSelectReportePresupuestoLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePresupuestoLinea.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePresupuestoLinea.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestoLinea.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresupuestoLinea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePresupuestoLinea=new JScrollPane(this.jListColumnasSelectReportePresupuestoLinea);
			
			this.jScrollColumnasSelectReportePresupuestoLinea.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestoLinea.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresupuestoLinea.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresupuestoLinea.add(this.jListColumnasSelectReportePresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jScrollColumnasSelectReportePresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePresupuestoLinea = new JLabelMe();

		this.jLabelRelacionesSelectReportePresupuestoLinea.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePresupuestoLinea = new JList<Reporte>();
		this.jListRelacionesSelectReportePresupuestoLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePresupuestoLinea.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePresupuestoLinea.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestoLinea.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresupuestoLinea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePresupuestoLinea=new JScrollPane(this.jListRelacionesSelectReportePresupuestoLinea);
			
			this.jScrollRelacionesSelectReportePresupuestoLinea.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestoLinea.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresupuestoLinea.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPresupuestoLinea = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPresupuestoLinea = new JComboBoxMe();
		this.jListColumnasValoresGraficoPresupuestoLinea = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPresupuestoLinea = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPresupuestoLinea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPresupuestoLinea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestoLinea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresupuestoLinea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoLinea = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoLinea.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoLinea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoLinea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresupuestoLinea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPresupuestoLinea = new JLabelMe();

		this.jLabelConGraficoDinamicoPresupuestoLinea.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jLabelConGraficoDinamicoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPresupuestoLinea = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPresupuestoLinea.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPresupuestoLinea.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPresupuestoLinea.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestoLinea.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPresupuestoLinea.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jCheckBoxConGraficoDinamicoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPresupuestoLinea = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPresupuestoLinea.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jLabelColumnaCategoriaGraficoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPresupuestoLinea = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestoLinea.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPresupuestoLinea.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPresupuestoLinea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestoLinea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPresupuestoLinea.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jComboBoxColumnaCategoriaGraficoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPresupuestoLinea = new JLabelMe();

		this.jLabelColumnaCategoriaValorPresupuestoLinea.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jLabelColumnaCategoriaValorPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPresupuestoLinea = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPresupuestoLinea.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPresupuestoLinea.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPresupuestoLinea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestoLinea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPresupuestoLinea.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jComboBoxColumnaCategoriaValorPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPresupuestoLinea = new JLabelMe();

		this.jLabelColumnasValoresGraficoPresupuestoLinea.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jLabelColumnasValoresGraficoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPresupuestoLinea = new JList<Reporte>();
		this.jListColumnasValoresGraficoPresupuestoLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPresupuestoLinea.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPresupuestoLinea.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestoLinea.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPresupuestoLinea.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPresupuestoLinea=new JScrollPane(this.jListColumnasValoresGraficoPresupuestoLinea);
			
			this.jScrollColumnasValoresGraficoPresupuestoLinea.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestoLinea.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPresupuestoLinea.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPresupuestoLinea.add(this.jListColumnasSelectReportePresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jScrollColumnasValoresGraficoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPresupuestoLinea = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPresupuestoLinea.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jLabelTiposGraficosReportesDinamicoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestoLinea = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPresupuestoLinea.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoLinea.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPresupuestoLinea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoLinea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPresupuestoLinea.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jComboBoxTiposGraficosReportesDinamicoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPresupuestoLinea = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPresupuestoLinea.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jLabelGenerarExcelReporteDinamicoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoLinea = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPresupuestoLinea.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPresupuestoLinea,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoLinea.setToolTipText("Generar EXCEL"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		//this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPresupuestoLinea.add(this.jButtonGenerarExcelReporteDinamicoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jComboBoxTiposReportesDinamicoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPresupuestoLinea = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPresupuestoLinea.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jLabelTiposArchivoReporteDinamicoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jComboBoxTiposArchivosReportesDinamicoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPresupuestoLinea = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPresupuestoLinea.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPresupuestoLinea,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPresupuestoLinea.setToolTipText("Generar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jButtonGenerarReporteDinamicoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPresupuestoLinea = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPresupuestoLinea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPresupuestoLinea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPresupuestoLinea.setToolTipText("Cancelar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresupuestoLinea.add(this.jButtonCerrarReporteDinamicoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPresupuestoLinea = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPresupuestoLinea= new JScrollPane(jPanelReporteDinamicoPresupuestoLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPresupuestoLinea.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestoLinea.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresupuestoLinea.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Lineaes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPresupuestoLinea.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPresupuestoLinea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPresupuestoLinea.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPresupuestoLinea);
		this.jInternalFrameReporteDinamicoPresupuestoLinea.getContentPane().add(this.jScrollPanelReporteDinamicoPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPresupuestoLinea() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPresupuestoLinea = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPresupuestoLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPresupuestoLinea.setName("jPanelImportacionPresupuestoLinea"); 
		
		this.jPanelImportacionPresupuestoLinea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestoLinea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresupuestoLinea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPresupuestoLinea.setLayout(gridaBagLayoutImportacionPresupuestoLinea);
		
		
		this.jInternalFrameImportacionPresupuestoLinea= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPresupuestoLinea= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPresupuestoLinea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresupuestoLinea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPresupuestoLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestoLinea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestoLinea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPresupuestoLinea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestoLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestoLinea.setResizable(true);
	    this.jInternalFrameImportacionPresupuestoLinea.setClosable(true);
	    this.jInternalFrameImportacionPresupuestoLinea.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPresupuestoLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresupuestoLinea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresupuestoLinea.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPresupuestoLinea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresupuestoLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresupuestoLinea.setResizable(true);
	    this.jInternalFrameImportacionPresupuestoLinea.setClosable(true);
	    this.jInternalFrameImportacionPresupuestoLinea.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPresupuestoLinea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestoLinea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresupuestoLinea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Lineaes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPresupuestoLinea = new JLabelMe();

		this.jLabelArchivoImportacionPresupuestoLinea.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestoLinea.add(this.jLabelArchivoImportacionPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPresupuestoLinea = new JFileChooser();		
		this.jFileChooserImportacionPresupuestoLinea.setToolTipText("ESCOGER ARCHIVO"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPresupuestoLinea = new JButtonMe();
		this.jButtonAbrirImportacionPresupuestoLinea.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPresupuestoLinea,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPresupuestoLinea.setToolTipText("Generar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoLinea.add(this.jButtonAbrirImportacionPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPresupuestoLinea = new JLabelMe();

		this.jLabelPathArchivoImportacionPresupuestoLinea.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPresupuestoLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestoLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresupuestoLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresupuestoLinea.add(this.jLabelPathArchivoImportacionPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPresupuestoLinea=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPresupuestoLinea.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestoLinea.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresupuestoLinea.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoLinea.add(this.jTextFieldPathArchivoImportacionPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPresupuestoLinea = new JButtonMe();
		this.jButtonGenerarImportacionPresupuestoLinea.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPresupuestoLinea,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPresupuestoLinea.setToolTipText("Generar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoLinea.add(this.jButtonGenerarImportacionPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPresupuestoLinea = new JButtonMe();
		this.jButtonCerrarImportacionPresupuestoLinea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPresupuestoLinea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPresupuestoLinea.setToolTipText("Cancelar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresupuestoLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsPresupuestoLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresupuestoLinea.add(this.jButtonCerrarImportacionPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPresupuestoLinea = new GridBagLayout();
		
		this.jScrollPanelImportacionPresupuestoLinea= new JScrollPane(jPanelImportacionPresupuestoLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
		this.gridBagConstraintsPresupuestoLinea.gridy =iPosYImportacion;
		this.gridBagConstraintsPresupuestoLinea.gridx =iPosXImportacion;
		this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPresupuestoLinea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPresupuestoLinea.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPresupuestoLinea);
		this.jInternalFrameImportacionPresupuestoLinea.getContentPane().add(this.jScrollPanelImportacionPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPresupuestoLinea(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPresupuestoLinea = new JButtonMe();
			this.jButtonAbrirOrderByPresupuestoLinea.setText("Orden");
			this.jButtonAbrirOrderByPresupuestoLinea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresupuestoLinea,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPresupuestoLinea";
			inputMap = this.jButtonAbrirOrderByPresupuestoLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPresupuestoLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPresupuestoLinea"));
		
		
			GridBagLayout gridaBagLayoutOrderByPresupuestoLinea = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPresupuestoLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPresupuestoLinea.setName("jPanelOrderByPresupuestoLinea"); 
			
			this.jPanelOrderByPresupuestoLinea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestoLinea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresupuestoLinea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPresupuestoLinea.setLayout(gridaBagLayoutOrderByPresupuestoLinea);
			
			
			this.jTableDatosPresupuestoLineaOrderBy = new JTableMe();        
			this.jTableDatosPresupuestoLineaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPresupuestoLineaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPresupuestoLineaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPresupuestoLineaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPresupuestoLineaOrderBy.setViewportView(this.jTableDatosPresupuestoLineaOrderBy);
			this.jTableDatosPresupuestoLineaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPresupuestoLineaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPresupuestoLinea= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPresupuestoLinea= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPresupuestoLinea = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePresupuestoLinea= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPresupuestoLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPresupuestoLinea.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPresupuestoLinea.setTitle("Orden");
			this.jInternalFrameOrderByPresupuestoLinea.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPresupuestoLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPresupuestoLinea.setResizable(true);
			this.jInternalFrameOrderByPresupuestoLinea.setClosable(true);
			this.jInternalFrameOrderByPresupuestoLinea.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPresupuestoLinea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestoLinea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresupuestoLinea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPresupuestoLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Presupuesto Lineaes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPresupuestoLinea.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPresupuestoLinea.ipady =150;
				
			this.jPanelOrderByPresupuestoLinea.add(jScrollPanelDatosPresupuestoLineaOrderBy, this.gridBagConstraintsPresupuestoLinea);//this.jTableDatosPresupuestoLineaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPresupuestoLinea = new JButtonMe();
			this.jButtonCerrarOrderByPresupuestoLinea.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPresupuestoLinea,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPresupuestoLinea.setToolTipText("Cancelar"+" "+PresupuestoLineaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPresupuestoLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresupuestoLinea.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPresupuestoLinea.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPresupuestoLinea.add(this.jButtonCerrarOrderByPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPresupuestoLinea = new GridBagLayout();
			
			this.jScrollPanelOrderByPresupuestoLinea= new JScrollPane(jPanelOrderByPresupuestoLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPresupuestoLinea = new GridBagConstraints();
			this.gridBagConstraintsPresupuestoLinea.gridy =iPosYOrderBy;
			this.gridBagConstraintsPresupuestoLinea.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresupuestoLinea.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPresupuestoLinea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPresupuestoLinea.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPresupuestoLinea);
			
			this.jInternalFrameOrderByPresupuestoLinea.getContentPane().add(this.jScrollPanelOrderByPresupuestoLinea, this.gridBagConstraintsPresupuestoLinea);			
		
		} else {
			this.jButtonAbrirOrderByPresupuestoLinea = new JButtonMe();
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
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.presupuestolineaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPresupuestoLinea.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPresupuestoLinea.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPresupuestoLinea.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPresupuestoLinea.getRowHeight();//PresupuestoLineaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PresupuestoLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestoLinea.isSelected()) {
					iHeightTable=PresupuestoLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestoLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestoLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PresupuestoLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresupuestoLinea.isSelected()) {
					iHeightTable=PresupuestoLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresupuestoLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresupuestoLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPresupuestoLinea.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestoLinea.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresupuestoLinea.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPresupuestoLinea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestoLinea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresupuestoLinea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPresupuestoLinea!=null && this.jInternalFrameOrderByPresupuestoLinea.getjTableDatosOrderBy()!=null) {
			//if(!this.presupuestolineaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPresupuestoLinea.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPresupuestoLinea.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPresupuestoLinea.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPresupuestoLinea.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPresupuestoLinea.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPresupuestoLinea.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPresupuestoLinea.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPresupuestoLinea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestoLinea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresupuestoLinea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=presupuestolineaLogic.getPresupuestoLineas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestolineas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PresupuestoLinea> TraerPresupuestoLineaBeans(List<PresupuestoLinea> presupuestolineas,ArrayList<Classe> classes)throws Exception {
		try {
			for(PresupuestoLinea presupuestolinea:presupuestolineas) {
					
				if(!(PresupuestoLineaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PresupuestoLineaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					presupuestolinea.setsDetalleGeneralEntityReporte(PresupuestoLineaConstantesFunciones.getPresupuestoLineaDescripcion(presupuestolinea));
										
					presupuestolinea.setes_para_presupuesto_descripcion(PresupuestoLineaConstantesFunciones.getes_para_presupuestoDescripcion(presupuestolinea));	
					
						
					
				} else  {
							
					//presupuestolinea.setsDetalleGeneralEntityReporte(presupuestolinea.getsDetalleGeneralEntityReporte());
										
				}
				
				//presupuestolineabeans.add(presupuestolineabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return presupuestolineas;
    }
	//PARA REPORTES FIN
}
