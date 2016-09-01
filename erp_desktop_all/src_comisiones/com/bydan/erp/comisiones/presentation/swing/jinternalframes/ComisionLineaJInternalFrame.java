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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.ComisionLineaConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class ComisionLineaJInternalFrame extends ComisionLineaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarComisionLinea;
	
	protected JMenuBar jmenuBarComisionLinea;
	
	protected JMenu jmenuComisionLinea;
	protected JMenu jmenuDatosComisionLinea;
	protected JMenu jmenuArchivoComisionLinea;
	protected JMenu jmenuAccionesComisionLinea;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosComisionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisionLinea;	
	protected GridBagConstraints gridBagConstraintsComisionLinea;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ComisionLineaDetalleFormJInternalFrame jInternalFrameDetalleFormComisionLinea;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoComisionLinea;	
	protected ImportacionJInternalFrame jInternalFrameImportacionComisionLinea;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_comisionconfig="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected EstadoComisionBeanSwingJInternalFrame estadocomisionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocomision="";
	
	public ComisionLineaSessionBean comisionlineaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ComisionConfigSessionBean comisionconfigSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public LineaSessionBean lineaSessionBean;
	public EstadoComisionSessionBean estadocomisionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ComisionLinea> comisionlineas;		
	public List<ComisionLinea> comisionlineasEliminados;	
	public List<ComisionLinea> comisionlineasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByComisionLinea;		
	protected JButton jButtonAbrirOrderByComisionLinea;
	
	
	//protected JPanel jPanelOrderByComisionLinea;
	//public JScrollPane jScrollPanelOrderByComisionLinea;	
	//protected JButton jButtonCerrarOrderByComisionLinea;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ComisionLineaLogic comisionlineaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosComisionLinea;
	public JScrollPane jScrollPanelDatosEdicionComisionLinea;
	public JScrollPane jScrollPanelDatosGeneralComisionLinea;
    
	
	
	//public JScrollPane jScrollPanelDatosComisionLineaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoComisionLinea;
	//public JScrollPane jScrollPanelImportacionComisionLinea;
	
	
	
	protected JPanel jPanelAccionesComisionLinea;
	
    protected JPanel jPanelPaginacionComisionLinea;
    protected JPanel jPanelParametrosReportesComisionLinea;
	protected JPanel jPanelParametrosReportesAccionesComisionLinea;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ComisionLinea;
	protected JPanel jPanelParametrosAuxiliar2ComisionLinea;
	protected JPanel jPanelParametrosAuxiliar3ComisionLinea;
	protected JPanel jPanelParametrosAuxiliar4ComisionLinea;
	//protected JPanel jPanelParametrosAuxiliar5ComisionLinea;
	
	
	
	//protected JPanel jPanelReporteDinamicoComisionLinea;
	//protected JPanel jPanelImportacionComisionLinea;
	
	
	public JTable jTableDatosComisionLinea;
	
	
	
	//public JTable jTableDatosComisionLineaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoComisionLinea;
	protected JButton jButtonDuplicarComisionLinea;
	protected JButton jButtonCopiarComisionLinea;
	protected JButton jButtonVerFormComisionLinea;
	protected JButton jButtonNuevoRelacionesComisionLinea;
	protected JButton jButtonModificarComisionLinea;
	
    protected JButton jButtonGuardarCambiosTablaComisionLinea;
	protected JButton jButtonCerrarComisionLinea;
	
	
	protected JButton jButtonRecargarInformacionComisionLinea;
	protected JButton jButtonProcesarInformacionComisionLinea;
	
	
	protected JButton jButtonAnterioresComisionLinea;
	protected JButton jButtonSiguientesComisionLinea;
	protected JButton jButtonNuevoGuardarCambiosComisionLinea;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoComisionLinea;
	//protected JButton jButtonCerrarReporteDinamicoComisionLinea;
	//protected JButton jButtonGenerarExcelReporteDinamicoComisionLinea;	
	
	
	
	//protected JButton jButtonAbrirImportacionComisionLinea;
	//protected JButton jButtonGenerarImportacionComisionLinea;
	//protected JButton jButtonCerrarImportacionComisionLinea;
	//protected JFileChooser jFileChooserImportacionComisionLinea;
	//protected File fileImportacionComisionLinea;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisionLinea;
	protected JButton jButtonDuplicarToolBarComisionLinea;
	protected JButton jButtonNuevoRelacionesToolBarComisionLinea;
	
	
	public JButton jButtonGuardarCambiosToolBarComisionLinea;
	protected JButton jButtonCopiarToolBarComisionLinea;
	protected JButton jButtonVerFormToolBarComisionLinea;
	public JButton jButtonGuardarCambiosTablaToolBarComisionLinea;
	protected JButton jButtonMostrarOcultarTablaToolBarComisionLinea;
	protected JButton jButtonCerrarToolBarComisionLinea;
	
	protected JButton jButtonRecargarInformacionToolBarComisionLinea;
	protected JButton jButtonProcesarInformacionToolBarComisionLinea;
	protected JButton jButtonAnterioresToolBarComisionLinea;
	protected JButton jButtonSiguientesToolBarComisionLinea;
	protected JButton jButtonNuevoGuardarCambiosToolBarComisionLinea;
	protected JButton jButtonAbrirOrderByToolBarComisionLinea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisionLinea;
	protected JMenuItem jMenuItemDuplicarComisionLinea;
	protected JMenuItem jMenuItemNuevoRelacionesComisionLinea;
	
	
	protected JMenuItem jMenuItemGuardarCambiosComisionLinea;
	protected JMenuItem jMenuItemCopiarComisionLinea;
	protected JMenuItem jMenuItemVerFormComisionLinea;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisionLinea;
	protected JMenuItem jMenuItemCerrarComisionLinea;
	protected JMenuItem jMenuItemDetalleCerrarComisionLinea;
	protected JMenuItem jMenuItemDetalleAbrirOrderByComisionLinea;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisionLinea;
	
	protected JMenuItem jMenuItemRecargarInformacionComisionLinea;
	protected JMenuItem jMenuItemProcesarInformacionComisionLinea;
	protected JMenuItem jMenuItemAnterioresComisionLinea;
	protected JMenuItem jMenuItemSiguientesComisionLinea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisionLinea;
	protected JMenuItem jMenuItemAbrirOrderByComisionLinea;
	protected JMenuItem jMenuItemMostrarOcultarComisionLinea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisionLinea;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosComisionLinea;
	protected JCheckBox jCheckBoxSeleccionadosComisionLinea;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaComisionLinea;
	protected JCheckBox jCheckBoxConGraficoReporteComisionLinea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesComisionLinea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesComisionLinea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoComisionLinea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoComisionLinea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesComisionLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionComisionLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisionLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisionLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarComisionLinea;
	protected JTextField jTextFieldValorCampoGeneralComisionLinea;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteComisionLinea;
	//public JList<Reporte> jListColumnasSelectReporteComisionLinea;
	//public JScrollPane jScrollColumnasSelectReporteComisionLinea;
	
	//public JLabel jLabelRelacionesSelectReporteComisionLinea;
	//public JList<Reporte> jListRelacionesSelectReporteComisionLinea;
	//public JScrollPane jScrollRelacionesSelectReporteComisionLinea;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoComisionLinea;
	//protected JCheckBox jCheckBoxConGraficoDinamicoComisionLinea;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoComisionLinea;
	//public JLabel jLabelTiposArchivoReporteDinamicoComisionLinea;
	
		
	//public JLabel jLabelArchivoImportacionComisionLinea;	
	//public JLabel jLabelPathArchivoImportacionComisionLinea;
	//protected JTextField jTextFieldPathArchivoImportacionComisionLinea;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoComisionLinea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoComisionLinea;
	
	//public JLabel jLabelColumnaCategoriaValorComisionLinea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorComisionLinea;
	
	//public JLabel jLabelColumnasValoresGraficoComisionLinea;
	//public JList<Reporte> jListColumnasValoresGraficoComisionLinea;
	//public JScrollPane jScrollColumnasValoresGraficoComisionLinea;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoComisionLinea;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoComisionLinea;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasComisionLinea;
	public JPanel jPanelFK_IdComisionConfigComisionLinea;
	public JButton jButtonFK_IdComisionConfigComisionLinea;
	
	public JPanel jPanelid_comision_configFK_IdComisionConfigComisionLinea;
	public JLabel jLabelid_comision_configFK_IdComisionConfigComisionLinea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_comision_configFK_IdComisionConfigComisionLinea;
	public JButton jButtonid_comision_configFK_IdComisionConfigComisionLinea= new JButtonMe();
	public JButton jButtonid_comision_configFK_IdComisionConfigComisionLineaUpdate= new JButtonMe();
	public JButton jButtonid_comision_configFK_IdComisionConfigComisionLineaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public ComisionLineaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ComisionLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionLineaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionLineaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionLineaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComisionLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionComisionLinea)	{
		this.jButtonRecargarInformacionComisionLinea = jButtonRecargarInformacionComisionLinea;
	}
	
	public JButton getjButtonProcesarInformacionComisionLinea() {
		return this.jButtonProcesarInformacionComisionLinea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisionLinea)	{
		this.jButtonProcesarInformacionComisionLinea = jButtonProcesarInformacionComisionLinea;
	}
	
	
	public JButton getjButtonRecargarInformacionComisionLinea() {
		return this.jButtonRecargarInformacionComisionLinea;
	}
	
	
	public List<ComisionLinea> getcomisionlineas() {
		return this.comisionlineas;
	}

	public void setcomisionlineas(List<ComisionLinea> comisionlineas) {
		this.comisionlineas = comisionlineas;
	}
	
	public List<ComisionLinea> getcomisionlineasAux() {
		return this.comisionlineasAux;
	}

	public void setcomisionlineasAux(List<ComisionLinea> comisionlineasAux) {
		this.comisionlineasAux = comisionlineasAux;
	}
	
	public List<ComisionLinea> getcomisionlineasEliminados() {
		return this.comisionlineasEliminados;
	}

	public void setComisionLineasEliminados(List<ComisionLinea> comisionlineasEliminados) {
		this.comisionlineasEliminados = comisionlineasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarComisionLinea() {
		return jComboBoxTiposSeleccionarComisionLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarComisionLinea(
			JComboBox jComboBoxTiposSeleccionarComisionLinea) {
		this.jComboBoxTiposSeleccionarComisionLinea = jComboBoxTiposSeleccionarComisionLinea;
	}
	
	public void setBorderResaltarTiposSeleccionarComisionLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarComisionLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarComisionLinea .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralComisionLinea() {
		return jTextFieldValorCampoGeneralComisionLinea;
	}

	public void setjTextFieldValorCampoGeneralComisionLinea(
			JTextField jTextFieldValorCampoGeneralComisionLinea) {
		this.jTextFieldValorCampoGeneralComisionLinea = jTextFieldValorCampoGeneralComisionLinea;
	}

	public void setBorderResaltarValorCampoGeneralComisionLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionLinea.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralComisionLinea .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosComisionLinea() {
		return this.jCheckBoxSeleccionarTodosComisionLinea;
	}

	public void setjCheckBoxSeleccionarTodosComisionLinea(
			JCheckBox jCheckBoxSeleccionarTodosComisionLinea) {
		this.jCheckBoxSeleccionarTodosComisionLinea = jCheckBoxSeleccionarTodosComisionLinea;
	}

	public void setBorderResaltarSeleccionarTodosComisionLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionLinea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosComisionLinea .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosComisionLinea() {
		return this.jCheckBoxSeleccionadosComisionLinea;
	}

	public void setjCheckBoxSeleccionadosComisionLinea(
			JCheckBox jCheckBoxSeleccionadosComisionLinea) {
		this.jCheckBoxSeleccionadosComisionLinea = jCheckBoxSeleccionadosComisionLinea;
	}
	
	public void setBorderResaltarSeleccionadosComisionLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionLinea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosComisionLinea .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesComisionLinea() {
		return this.jComboBoxTiposArchivosReportesComisionLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesComisionLinea(
			JComboBox jComboBoxTiposArchivosReportesComisionLinea) {
		this.jComboBoxTiposArchivosReportesComisionLinea = jComboBoxTiposArchivosReportesComisionLinea;
	}

	public void setBorderResaltarTiposArchivosReportesComisionLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesComisionLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesComisionLinea() {
		return this.jComboBoxTiposReportesComisionLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesComisionLinea(
			JComboBox jComboBoxTiposReportesComisionLinea) {
		this.jComboBoxTiposReportesComisionLinea = jComboBoxTiposReportesComisionLinea;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoComisionLinea() {
	//	return jComboBoxTiposReportesDinamicoComisionLinea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoComisionLinea(
	//		JComboBox jComboBoxTiposReportesDinamicoComisionLinea) {
	//	this.jComboBoxTiposReportesDinamicoComisionLinea = jComboBoxTiposReportesDinamicoComisionLinea;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoComisionLinea() {
	//	return jComboBoxTiposArchivosReportesDinamicoComisionLinea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoComisionLinea(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoComisionLinea) {
	//	this.jComboBoxTiposArchivosReportesDinamicoComisionLinea = jComboBoxTiposArchivosReportesDinamicoComisionLinea;
	//}
	
	public void setBorderResaltarTiposReportesComisionLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesComisionLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesComisionLinea() {
		return this.jComboBoxTiposGraficosReportesComisionLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesComisionLinea(
			JComboBox jComboBoxTiposGraficosReportesComisionLinea) {
		this.jComboBoxTiposGraficosReportesComisionLinea = jComboBoxTiposGraficosReportesComisionLinea;
	}
	
	public void setBorderResaltarTiposGraficosReportesComisionLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesComisionLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionComisionLinea() {
		return this.jComboBoxTiposPaginacionComisionLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionComisionLinea(
			JComboBox jComboBoxTiposPaginacionComisionLinea) {
		this.jComboBoxTiposPaginacionComisionLinea = jComboBoxTiposPaginacionComisionLinea;
	}
	
	public void setBorderResaltarTiposPaginacionComisionLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionComisionLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesComisionLinea() {
		return this.jComboBoxTiposRelacionesComisionLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisionLinea() {
		return this.jComboBoxTiposAccionesComisionLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisionLinea(
			JComboBox jComboBoxTiposRelacionesComisionLinea) {
		this.jComboBoxTiposRelacionesComisionLinea = jComboBoxTiposRelacionesComisionLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisionLinea(
			JComboBox jComboBoxTiposAccionesComisionLinea) {
		this.jComboBoxTiposAccionesComisionLinea = jComboBoxTiposAccionesComisionLinea;
	}
	
	public void setBorderResaltarTiposRelacionesComisionLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesComisionLinea .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesComisionLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesComisionLinea .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoComisionLinea() {
	//	return jCheckBoxConGraficoDinamicoComisionLinea;
	//}

	//public void setjCheckBoxConGraficoDinamicoComisionLinea(
	//		JCheckBox jCheckBoxConGraficoDinamicoComisionLinea) {
	//	this.jCheckBoxConGraficoDinamicoComisionLinea = jCheckBoxConGraficoDinamicoComisionLinea;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoComisionLinea() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarComisionLinea.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoComisionLinea .setBorder(borderResaltar);		
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
		this.comisionlineaSessionBean=new ComisionLineaSessionBean();
		
		this.comisionlineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionlineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisionlineaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ComisionLineaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ComisionLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionLineaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionLineaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comision Linea MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
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
		
		ComisionLineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ComisionLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarComisionLinea= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarComisionLinea,this.jTtoolBarComisionLinea,
							"nuevo","nuevo","Nuevo"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarComisionLinea,this.jTtoolBarComisionLinea,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarComisionLinea,this.jTtoolBarComisionLinea,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarComisionLinea,this.jTtoolBarComisionLinea,
							"duplicar","duplicar","Duplicar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarComisionLinea,this.jTtoolBarComisionLinea,
							"copiar","copiar","Copiar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarComisionLinea,this.jTtoolBarComisionLinea,
							"ver_form","ver_form","Ver"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionLinea,this.jTtoolBarComisionLinea,
							"recargar","recargar","Recargar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionLinea,this.jTtoolBarComisionLinea,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionLinea,this.jTtoolBarComisionLinea,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarComisionLinea,this.jTtoolBarComisionLinea,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarComisionLinea,this.jTtoolBarComisionLinea,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarComisionLinea,this.jTtoolBarComisionLinea,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarComisionLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarComisionLinea,this.jTtoolBarComisionLinea,
							"cerrar","cerrar","Salir"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarComisionLinea=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarComisionLinea;
			
				this.jButtonProcesarInformacionToolBarComisionLinea=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarComisionLinea;
				
		//protected JButton jButtonModificarToolBarComisionLinea;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarComisionLinea=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuComisionLinea=new JMenuMe("General");
		this.jmenuArchivoComisionLinea=new JMenuMe("Archivo");
		this.jmenuAccionesComisionLinea=new JMenuMe("Acciones");
		this.jmenuDatosComisionLinea=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisionLinea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisionLinea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisionLinea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarComisionLinea= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarComisionLinea.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarComisionLinea,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesComisionLinea= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesComisionLinea.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesComisionLinea,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosComisionLinea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisionLinea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisionLinea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarComisionLinea= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarComisionLinea.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarComisionLinea,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormComisionLinea= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormComisionLinea.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormComisionLinea,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaComisionLinea= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaComisionLinea.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaComisionLinea,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisionLinea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisionLinea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisionLinea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionComisionLinea= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionComisionLinea.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionComisionLinea,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionComisionLinea= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionComisionLinea.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionComisionLinea,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresComisionLinea= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresComisionLinea.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresComisionLinea,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesComisionLinea= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesComisionLinea.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesComisionLinea,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByComisionLinea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByComisionLinea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByComisionLinea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisionLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisionLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisionLinea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByComisionLinea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByComisionLinea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByComisionLinea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisionLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisionLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisionLinea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosComisionLinea= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosComisionLinea.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosComisionLinea,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoComisionLinea.add(this.jMenuItemCerrarComisionLinea);
			
			this.jmenuAccionesComisionLinea.add(this.jMenuItemNuevoComisionLinea);
			this.jmenuAccionesComisionLinea.add(this.jMenuItemNuevoGuardarCambiosComisionLinea);
			this.jmenuAccionesComisionLinea.add(this.jMenuItemNuevoRelacionesComisionLinea);
			this.jmenuAccionesComisionLinea.add(this.jMenuItemGuardarCambiosTablaComisionLinea);		
			this.jmenuAccionesComisionLinea.add(this.jMenuItemDuplicarComisionLinea);		
			this.jmenuAccionesComisionLinea.add(this.jMenuItemCopiarComisionLinea);		
			this.jmenuAccionesComisionLinea.add(this.jMenuItemVerFormComisionLinea);		
			
			this.jmenuDatosComisionLinea.add(this.jMenuItemRecargarInformacionComisionLinea);				
			this.jmenuDatosComisionLinea.add(this.jMenuItemAnterioresComisionLinea);				
			this.jmenuDatosComisionLinea.add(this.jMenuItemSiguientesComisionLinea);				
			this.jmenuDatosComisionLinea.add(this.jMenuItemAbrirOrderByComisionLinea);				
			this.jmenuDatosComisionLinea.add(this.jMenuItemMostrarOcultarComisionLinea);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesComisionLinea.add(this.jMenuItemGuardarCambiosComisionLinea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarComisionLinea.add(this.jmenuArchivoComisionLinea);		
			this.jmenuBarComisionLinea.add(this.jmenuAccionesComisionLinea);		
			this.jmenuBarComisionLinea.add(this.jmenuDatosComisionLinea);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarComisionLinea);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasComisionLinea() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdComisionConfigComisionLinea=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdComisionConfigComisionLinea.setToolTipText("Buscar Por Configuracion ");
		this.jButtonFK_IdComisionConfigComisionLinea= new JButtonMe();
		this.jButtonFK_IdComisionConfigComisionLinea.setText("Buscar");
		this.jButtonFK_IdComisionConfigComisionLinea.setToolTipText("Buscar Por Configuracion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdComisionConfigComisionLinea,"buscar_button","Buscar Por Configuracion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdComisionConfigComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_comision_configFK_IdComisionConfigComisionLinea = new JLabelMe();
		jLabelid_comision_configFK_IdComisionConfigComisionLinea.setText("Configuracion :");
		jLabelid_comision_configFK_IdComisionConfigComisionLinea.setToolTipText("Configuracion");
		jLabelid_comision_configFK_IdComisionConfigComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_comision_configFK_IdComisionConfigComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_comision_configFK_IdComisionConfigComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_comision_configFK_IdComisionConfigComisionLinea,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_comision_configFK_IdComisionConfigComisionLinea= new JComboBoxMe();
		jComboBoxid_comision_configFK_IdComisionConfigComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configFK_IdComisionConfigComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configFK_IdComisionConfigComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_comision_configFK_IdComisionConfigComisionLinea,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasComisionLinea=new JTabbedPane();


		this.jTabbedPaneBusquedasComisionLinea.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComisionLinea.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComisionLinea.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasComisionLinea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasComisionLinea,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleComisionLinea = new ComisionLineaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Comision Linea DATOS");
			this.jInternalFrameDetalleFormComisionLinea = new ComisionLineaDetalleFormJInternalFrame(jDesktopPane,this.comisionlineaSessionBean.getConGuardarRelaciones(),this.comisionlineaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormComisionLinea = null;//new ComisionLineaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisionLinea= new GridBagLayout();
		
		
		this.jTableDatosComisionLinea = new JTableMe();      
		
		String sToolTipComisionLinea="";
		sToolTipComisionLinea=ComisionLineaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisionLinea+="(Comisiones.ComisionLinea)";
		}
		
		if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisionLinea+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosComisionLinea.setToolTipText(sToolTipComisionLinea);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosComisionLinea);
		this.jTableDatosComisionLinea.setAutoCreateRowSorter(true);
		this.jTableDatosComisionLinea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosComisionLinea.setRowSelectionAllowed(true);
		this.jTableDatosComisionLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosComisionLinea,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoComisionLinea = new JButtonMe();
		this.jButtonDuplicarComisionLinea = new JButtonMe();
		this.jButtonCopiarComisionLinea = new JButtonMe();
		this.jButtonVerFormComisionLinea = new JButtonMe();
		this.jButtonNuevoRelacionesComisionLinea = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaComisionLinea = new JButtonMe();
		this.jButtonCerrarComisionLinea = new JButtonMe();
		
		this.jScrollPanelDatosComisionLinea = new JScrollPane();   
        this.jScrollPanelDatosGeneralComisionLinea = new JScrollPane();
		
				
		
		
		this.jPanelAccionesComisionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Comision Linea";
		
		if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Lineas" + this.sPath));
		} else {
			this.jScrollPanelDatosComisionLinea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisionLinea.setToolTipText("Acciones");
        this.jPanelAccionesComisionLinea.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoComisionLinea=new ReporteDinamicoJInternalFrame(ComisionLineaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoComisionLinea();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionComisionLinea=new ImportacionJInternalFrame(ComisionLineaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionComisionLinea();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByComisionLinea = new JButtonMe();
		
		this.jButtonAbrirOrderByComisionLinea.setText("Orden");
		this.jButtonAbrirOrderByComisionLinea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisionLinea,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByComisionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisionLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionLinea,false,this);
			
			//this.cargarOrderByComisionLinea(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisionLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionLinea,true,this);
			
			//this.cargarOrderByComisionLinea(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosComisionLinea.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosComisionLinea.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosComisionLinea.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosComisionLinea.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisionLinea.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisionLinea.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoComisionLinea.setText("Nuevo");
		this.jButtonDuplicarComisionLinea.setText("Duplicar");
		this.jButtonCopiarComisionLinea.setText("Copiar");
		this.jButtonVerFormComisionLinea.setText("Ver");
		this.jButtonNuevoRelacionesComisionLinea.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaComisionLinea.setText("Guardar");
		this.jButtonCerrarComisionLinea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisionLinea,"nuevo_button","Nuevo",this.comisionlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarComisionLinea,"duplicar_button","Duplicar",this.comisionlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarComisionLinea,"copiar_button","Copiar",this.comisionlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormComisionLinea,"ver_form","Ver",this.comisionlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesComisionLinea,"nuevorelaciones_button","Nuevo Rel",this.comisionlineaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisionLinea,"guardarcambiostabla_button","Guardar",this.comisionlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisionLinea,"cerrar_button","Salir",this.comisionlineaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoComisionLinea.setToolTipText("Nuevo"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarComisionLinea.setToolTipText("Duplicar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarComisionLinea.setToolTipText("Copiar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormComisionLinea.setToolTipText("Ver"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesComisionLinea.setToolTipText("Nuevo Rel"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaComisionLinea.setToolTipText("Guardar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisionLinea.setToolTipText("Salir"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisionLinea";
		inputMap = this.jButtonNuevoComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisionLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisionLinea"));
		
		//DUPLICAR
		sMapKey = "DuplicarComisionLinea";
		inputMap = this.jButtonDuplicarComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarComisionLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarComisionLinea"));
		
		//COPIAR
		sMapKey = "CopiarComisionLinea";
		inputMap = this.jButtonCopiarComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarComisionLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarComisionLinea"));
		
		//VEr FORM
		sMapKey = "VerFormComisionLinea";
		inputMap = this.jButtonVerFormComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormComisionLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormComisionLinea"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesComisionLinea";
		inputMap = this.jButtonNuevoRelacionesComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesComisionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesComisionLinea"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarComisionLinea";
		inputMap = this.jButtonModificarComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarComisionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarComisionLinea"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarComisionLinea";
		inputMap = this.jButtonCerrarComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisionLinea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisionLinea";
		inputMap = this.jButtonGuardarCambiosTablaComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisionLinea"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesComisionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesComisionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionComisionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ComisionLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ComisionLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ComisionLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ComisionLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ComisionLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesComisionLinea.setName("jPanelParametrosReportesComisionLinea"); 
		
		this.jPanelParametrosReportesAccionesComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesComisionLinea.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesComisionLinea.setName("jPanelParametrosReportesAccionesComisionLinea"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesComisionLinea, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionComisionLinea = new JButtonMe();
		this.jButtonRecargarInformacionComisionLinea.setText("Recargar");
		this.jButtonRecargarInformacionComisionLinea.setToolTipText("Recargar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionComisionLinea,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionComisionLinea = new JButtonMe();
		this.jButtonProcesarInformacionComisionLinea.setText("Procesar");
		this.jButtonProcesarInformacionComisionLinea.setToolTipText("Procesar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionComisionLinea.setVisible(false);
			
		this.jButtonProcesarInformacionComisionLinea.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisionLinea.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisionLinea.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesComisionLinea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionLinea.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesComisionLinea.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesComisionLinea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionLinea.setText("TIPO");       
		this.jComboBoxTiposReportesComisionLinea.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesComisionLinea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionLinea.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesComisionLinea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionComisionLinea = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionComisionLinea.setText("Paginacion");
		this.jComboBoxTiposPaginacionComisionLinea.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesComisionLinea = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesComisionLinea.setText("Accion");
		this.jComboBoxTiposRelacionesComisionLinea.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesComisionLinea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisionLinea.setText("Accion");
		this.jComboBoxTiposAccionesComisionLinea.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarComisionLinea = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarComisionLinea.setText("Accion");
		this.jComboBoxTiposSeleccionarComisionLinea.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralComisionLinea=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralComisionLinea.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisionLinea.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisionLinea.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesComisionLinea = new JLabelMe();
		
		this.jLabelAccionesComisionLinea.setText("Acciones");		
		this.jLabelAccionesComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosComisionLinea = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosComisionLinea.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosComisionLinea.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosComisionLinea = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosComisionLinea.setText("Seleccionados");
		this.jCheckBoxSeleccionadosComisionLinea.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaComisionLinea = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaComisionLinea.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaComisionLinea.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteComisionLinea = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteComisionLinea.setText("Graf.");
		this.jCheckBoxConGraficoReporteComisionLinea.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresComisionLinea = new JButtonMe();
		//this.jButtonAnterioresComisionLinea.setText("<<");
        this.jButtonAnterioresComisionLinea.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresComisionLinea,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesComisionLinea = new JButtonMe();
		//this.jButtonSiguientesComisionLinea.setText(">>");
        this.jButtonSiguientesComisionLinea.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesComisionLinea,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosComisionLinea = new JButtonMe();
		this.jButtonNuevoGuardarCambiosComisionLinea.setText("Nue");
        this.jButtonNuevoGuardarCambiosComisionLinea.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosComisionLinea,"nuevoguardarcambios_button","Nue",this.comisionlineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosComisionLinea";
		inputMap = this.jButtonNuevoGuardarCambiosComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosComisionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosComisionLinea"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionComisionLinea";
		inputMap = this.jButtonRecargarInformacionComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionComisionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionComisionLinea"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesComisionLinea";
		inputMap = this.jButtonSiguientesComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesComisionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesComisionLinea"));
		
		//ANTERIORES		
		sMapKey = "AnterioresComisionLinea";
		inputMap = this.jButtonAnterioresComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresComisionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresComisionLinea"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasComisionLinea();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesComisionLinea.setMinimumSize(new Dimension(this.getWidth(),ComisionLineaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionLineaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisionLinea.setMaximumSize(new Dimension(this.getWidth(),ComisionLineaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionLineaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisionLinea.setPreferredSize(new Dimension(this.getWidth(),ComisionLineaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionLineaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionComisionLinea = new GridBagLayout();

			this.jPanelPaginacionComisionLinea.setLayout(gridaBagLayoutPaginacionComisionLinea);						
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy = 0;
			this.gridBagConstraintsComisionLinea.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionComisionLinea.add(this.jButtonAnterioresComisionLinea, this.gridBagConstraintsComisionLinea);
					
						
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisionLinea.gridy = 0;
			
			this.jPanelPaginacionComisionLinea.add(this.jButtonNuevoGuardarCambiosComisionLinea, this.gridBagConstraintsComisionLinea);
						
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsComisionLinea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisionLinea.gridy = 0;
			this.jPanelPaginacionComisionLinea.add(this.jButtonSiguientesComisionLinea, this.gridBagConstraintsComisionLinea);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy = 1;
			this.gridBagConstraintsComisionLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionLinea.add(this.jButtonNuevoComisionLinea, this.gridBagConstraintsComisionLinea);
						
			
			
			if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsComisionLinea = new GridBagConstraints();
				this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsComisionLinea.gridy = 1;
				this.gridBagConstraintsComisionLinea.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionComisionLinea.add(this.jButtonGuardarCambiosTablaComisionLinea, this.gridBagConstraintsComisionLinea);
			}
			
			
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy = 1;
			this.gridBagConstraintsComisionLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionLinea.add(this.jButtonDuplicarComisionLinea, this.gridBagConstraintsComisionLinea);
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy = 1;
			this.gridBagConstraintsComisionLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionLinea.add(this.jButtonCopiarComisionLinea, this.gridBagConstraintsComisionLinea);
		
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy = 1;
			this.gridBagConstraintsComisionLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionLinea.add(this.jButtonVerFormComisionLinea, this.gridBagConstraintsComisionLinea);
		
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy = 1;
			this.gridBagConstraintsComisionLinea.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionComisionLinea.add(this.jButtonCerrarComisionLinea, this.gridBagConstraintsComisionLinea);
		
		
		
		this.jButtonRecargarInformacionComisionLinea.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisionLinea.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisionLinea.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesComisionLinea.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisionLinea.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisionLinea.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesComisionLinea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisionLinea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisionLinea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesComisionLinea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisionLinea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisionLinea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionComisionLinea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisionLinea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisionLinea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesComisionLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisionLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisionLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesComisionLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarComisionLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisionLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisionLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaComisionLinea.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisionLinea.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisionLinea.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteComisionLinea.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisionLinea.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisionLinea.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosComisionLinea.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisionLinea.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisionLinea.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosComisionLinea.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisionLinea.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisionLinea.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesComisionLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesComisionLinea = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ComisionLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ComisionLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ComisionLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ComisionLinea = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesComisionLinea.setLayout(gridaBagParametrosReportesComisionLinea);
			this.jPanelParametrosReportesAccionesComisionLinea.setLayout(gridaBagParametrosReportesAccionesComisionLinea);
			
			
			this.jPanelParametrosAuxiliar1ComisionLinea.setLayout(gridaBagParametrosAuxiliar1ComisionLinea);
			this.jPanelParametrosAuxiliar2ComisionLinea.setLayout(gridaBagParametrosAuxiliar2ComisionLinea);
			this.jPanelParametrosAuxiliar3ComisionLinea.setLayout(gridaBagParametrosAuxiliar3ComisionLinea);
			this.jPanelParametrosAuxiliar4ComisionLinea.setLayout(gridaBagParametrosAuxiliar4ComisionLinea);
			//this.jPanelParametrosAuxiliar5ComisionLinea.setLayout(gridaBagParametrosAuxiliar2ComisionLinea);			
			
			
			
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionLinea.add(this.jButtonRecargarInformacionComisionLinea, this.gridBagConstraintsComisionLinea);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionLinea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionLinea.add(this.jComboBoxTiposPaginacionComisionLinea, this.gridBagConstraintsComisionLinea);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionLinea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionLinea.add(this.jCheckBoxConAltoMaximoTablaComisionLinea, this.gridBagConstraintsComisionLinea);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionLinea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionLinea.add(this.jComboBoxTiposArchivosReportesComisionLinea, this.gridBagConstraintsComisionLinea);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionLinea.add(this.jPanelParametrosAuxiliar1ComisionLinea, this.gridBagConstraintsComisionLinea);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ComisionLinea.add(this.jComboBoxTiposReportesComisionLinea, this.gridBagConstraintsComisionLinea);																		
			
			
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ComisionLinea.add(this.jComboBoxTiposGraficosReportesComisionLinea, this.gridBagConstraintsComisionLinea);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionLinea.add(this.jPanelParametrosAuxiliar4ComisionLinea, this.gridBagConstraintsComisionLinea);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionLinea.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionLinea.add(this.jComboBoxTiposReportesComisionLinea, this.gridBagConstraintsComisionLinea);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionLinea.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionLinea.add(this.jCheckBoxGenerarReporteComisionLinea, this.gridBagConstraintsComisionLinea);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionLinea.add(this.jPanelParametrosAuxiliar2ComisionLinea, this.gridBagConstraintsComisionLinea);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionLinea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionLinea.add(this.jLabelAccionesComisionLinea, this.gridBagConstraintsComisionLinea);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsComisionLinea = new GridBagConstraints();
				this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsComisionLinea.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesComisionLinea.add(this.jButtonAbrirOrderByComisionLinea, this.gridBagConstraintsComisionLinea);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionLinea.add(this.jComboBoxTiposSeleccionarComisionLinea, this.gridBagConstraintsComisionLinea);			
			
			
			/*
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionLinea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionLinea.add(this.jCheckBoxSeleccionarTodosComisionLinea, this.gridBagConstraintsComisionLinea);
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionLinea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionLinea.add(this.jCheckBoxConGraficoReporteComisionLinea, this.gridBagConstraintsComisionLinea);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionLinea.add(this.jCheckBoxSeleccionarTodosComisionLinea, this.gridBagConstraintsComisionLinea);															
				
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionLinea.add(this.jCheckBoxSeleccionadosComisionLinea, this.gridBagConstraintsComisionLinea);															
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionLinea.add(this.jCheckBoxConGraficoReporteComisionLinea, this.gridBagConstraintsComisionLinea);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionLinea.add(this.jPanelParametrosAuxiliar3ComisionLinea, this.gridBagConstraintsComisionLinea);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionLinea.add(this.jComboBoxTiposAccionesComisionLinea, this.gridBagConstraintsComisionLinea);
	
				
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionLinea.add(this.jTextFieldValorCampoGeneralComisionLinea, this.gridBagConstraintsComisionLinea);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosComisionLinea = new GridBagLayout();

			this.jScrollPanelDatosComisionLinea.setLayout(gridaBagLayoutDatosComisionLinea);
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy = 0;
			this.gridBagConstraintsComisionLinea.gridx = 0;
			
			this.jScrollPanelDatosComisionLinea.add(this.jTableDatosComisionLinea, this.gridBagConstraintsComisionLinea);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosComisionLinea.setViewportView(this.jTableDatosComisionLinea);
		this.jTableDatosComisionLinea.setFillsViewportHeight(true);
		this.jTableDatosComisionLinea.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesComisionLinea= new GridBagLayout();
		this.jPanelAccionesComisionLinea.setLayout(gridaBagLayoutAccionesComisionLinea);
		
		
		/*	
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionLinea.gridy = 0;
		this.gridBagConstraintsComisionLinea.gridx = 0;
			
		this.jPanelAccionesComisionLinea.add(this.jButtonNuevoComisionLinea, this.gridBagConstraintsComisionLinea);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdComisionConfigComisionLinea= new GridBagLayout();
		gridaBagLayoutFK_IdComisionConfigComisionLinea.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdComisionConfigComisionLinea.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdComisionConfigComisionLinea.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdComisionConfigComisionLinea.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdComisionConfigComisionLinea.setLayout(gridaBagLayoutFK_IdComisionConfigComisionLinea);

		gridBagConstraintsComisionLinea = new GridBagConstraints();
		gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionLinea.gridy = 0;
		gridBagConstraintsComisionLinea.gridx = 0;
		jPanelFK_IdComisionConfigComisionLinea.add(jLabelid_comision_configFK_IdComisionConfigComisionLinea, gridBagConstraintsComisionLinea);

		gridBagConstraintsComisionLinea = new GridBagConstraints();
		gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionLinea.gridy = 0;
		gridBagConstraintsComisionLinea.gridx = 1;
		jPanelFK_IdComisionConfigComisionLinea.add(jComboBoxid_comision_configFK_IdComisionConfigComisionLinea, gridBagConstraintsComisionLinea);

		gridBagConstraintsComisionLinea = new GridBagConstraints();
		gridBagConstraintsComisionLinea.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionLinea.gridy = 1;
		gridBagConstraintsComisionLinea.gridx =1;
		jPanelFK_IdComisionConfigComisionLinea.add(jButtonFK_IdComisionConfigComisionLinea, gridBagConstraintsComisionLinea);

		jTabbedPaneBusquedasComisionLinea.addTab("1.-Por Configuracion ", jPanelFK_IdComisionConfigComisionLinea);
		jTabbedPaneBusquedasComisionLinea.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisionLinea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisionLinea);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisionlineaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();						
			this.gridBagConstraintsComisionLinea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionLinea.gridx = 0;		
			//this.gridBagConstraintsComisionLinea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisionLinea.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarComisionLinea, this.gridBagConstraintsComisionLinea);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy = iGridyPrincipal++;
		this.gridBagConstraintsComisionLinea.gridx = 0;		
		//this.gridBagConstraintsComisionLinea.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsComisionLinea.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsComisionLinea);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsComisionLinea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionLinea.gridx = 0;		
			this.gridBagConstraintsComisionLinea.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsComisionLinea.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasComisionLinea, this.gridBagConstraintsComisionLinea);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionLinea.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesComisionLinea, this.gridBagConstraintsComisionLinea);								
		
		
		/*
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionLinea.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesComisionLinea, this.gridBagConstraintsComisionLinea);
		*/		
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisionLinea.gridx =0;
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisionLinea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisionLinea, this.gridBagConstraintsComisionLinea);
				
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionLinea.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionComisionLinea, this.gridBagConstraintsComisionLinea);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ComisionLineaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosComisionLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisionLinea = new GridBagLayout();
			this.jPanelBusquedasParametrosComisionLinea.setLayout(gridaBagLayoutBusquedasParametrosComisionLinea);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralComisionLinea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisionLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisionLinea, this.gridBagConstraintsComisionLinea);
			
			
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisionLinea, this.gridBagConstraintsComisionLinea);
		
			
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisionLinea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisionLinea, this.gridBagConstraintsComisionLinea);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralComisionLinea;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoComisionLinea() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoComisionLinea = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoComisionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoComisionLinea.setName("jPanelReporteDinamicoComisionLinea"); 
		
		this.jPanelReporteDinamicoComisionLinea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisionLinea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisionLinea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoComisionLinea.setLayout(gridaBagLayoutReporteDinamicoComisionLinea);
		
		
		this.jInternalFrameReporteDinamicoComisionLinea= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoComisionLinea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisionLinea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoComisionLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoComisionLinea.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoComisionLinea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoComisionLinea.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoComisionLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoComisionLinea.setResizable(true);
	    this.jInternalFrameReporteDinamicoComisionLinea.setClosable(true);
	    this.jInternalFrameReporteDinamicoComisionLinea.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoComisionLinea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisionLinea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisionLinea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Lineas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteComisionLinea = new JLabelMe();

		this.jLabelColumnasSelectReporteComisionLinea.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionLinea.add(this.jLabelColumnasSelectReporteComisionLinea, this.gridBagConstraintsComisionLinea);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteComisionLinea = new JList<Reporte>();
		this.jListColumnasSelectReporteComisionLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteComisionLinea.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteComisionLinea.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisionLinea.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisionLinea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteComisionLinea=new JScrollPane(this.jListColumnasSelectReporteComisionLinea);
			
			this.jScrollColumnasSelectReporteComisionLinea.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisionLinea.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisionLinea.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoComisionLinea.add(this.jListColumnasSelectReporteComisionLinea, this.gridBagConstraintsComisionLinea);
		this.jPanelReporteDinamicoComisionLinea.add(this.jScrollColumnasSelectReporteComisionLinea, this.gridBagConstraintsComisionLinea);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteComisionLinea = new JLabelMe();

		this.jLabelRelacionesSelectReporteComisionLinea.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteComisionLinea = new JList<Reporte>();
		this.jListRelacionesSelectReporteComisionLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteComisionLinea.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteComisionLinea.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisionLinea.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisionLinea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteComisionLinea=new JScrollPane(this.jListRelacionesSelectReporteComisionLinea);
			
			this.jScrollRelacionesSelectReporteComisionLinea.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisionLinea.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisionLinea.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoComisionLinea = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoComisionLinea = new JComboBoxMe();
		this.jListColumnasValoresGraficoComisionLinea = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoComisionLinea = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoComisionLinea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoComisionLinea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisionLinea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisionLinea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoComisionLinea = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoComisionLinea.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoComisionLinea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisionLinea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisionLinea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoComisionLinea = new JLabelMe();

		this.jLabelConGraficoDinamicoComisionLinea.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionLinea.add(this.jLabelConGraficoDinamicoComisionLinea, this.gridBagConstraintsComisionLinea);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoComisionLinea = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoComisionLinea.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoComisionLinea.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoComisionLinea.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComisionLinea.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComisionLinea.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionLinea.add(this.jCheckBoxConGraficoDinamicoComisionLinea, this.gridBagConstraintsComisionLinea);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoComisionLinea = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoComisionLinea.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionLinea.add(this.jLabelColumnaCategoriaGraficoComisionLinea, this.gridBagConstraintsComisionLinea);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoComisionLinea = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComisionLinea.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoComisionLinea.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoComisionLinea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComisionLinea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComisionLinea.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoComisionLinea.add(this.jComboBoxColumnaCategoriaGraficoComisionLinea, this.gridBagConstraintsComisionLinea);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorComisionLinea = new JLabelMe();

		this.jLabelColumnaCategoriaValorComisionLinea.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionLinea.add(this.jLabelColumnaCategoriaValorComisionLinea, this.gridBagConstraintsComisionLinea);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorComisionLinea = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorComisionLinea.setText("Accion");
        this.jComboBoxColumnaCategoriaValorComisionLinea.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorComisionLinea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComisionLinea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComisionLinea.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoComisionLinea.add(this.jComboBoxColumnaCategoriaValorComisionLinea, this.gridBagConstraintsComisionLinea);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoComisionLinea = new JLabelMe();

		this.jLabelColumnasValoresGraficoComisionLinea.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionLinea.add(this.jLabelColumnasValoresGraficoComisionLinea, this.gridBagConstraintsComisionLinea);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoComisionLinea = new JList<Reporte>();
		this.jListColumnasValoresGraficoComisionLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoComisionLinea.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoComisionLinea.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComisionLinea.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComisionLinea.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoComisionLinea=new JScrollPane(this.jListColumnasValoresGraficoComisionLinea);
			
			this.jScrollColumnasValoresGraficoComisionLinea.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComisionLinea.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComisionLinea.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoComisionLinea.add(this.jListColumnasSelectReporteComisionLinea, this.gridBagConstraintsComisionLinea);
		this.jPanelReporteDinamicoComisionLinea.add(this.jScrollColumnasValoresGraficoComisionLinea, this.gridBagConstraintsComisionLinea);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoComisionLinea = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoComisionLinea.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionLinea.add(this.jLabelTiposGraficosReportesDinamicoComisionLinea, this.gridBagConstraintsComisionLinea);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoComisionLinea = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComisionLinea.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoComisionLinea.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoComisionLinea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComisionLinea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComisionLinea.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionLinea.add(this.jComboBoxTiposGraficosReportesDinamicoComisionLinea, this.gridBagConstraintsComisionLinea);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoComisionLinea = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoComisionLinea.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionLinea.add(this.jLabelGenerarExcelReporteDinamicoComisionLinea, this.gridBagConstraintsComisionLinea);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoComisionLinea = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoComisionLinea.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoComisionLinea,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoComisionLinea.setToolTipText("Generar EXCEL"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		//this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoComisionLinea.add(this.jButtonGenerarExcelReporteDinamicoComisionLinea, this.gridBagConstraintsComisionLinea);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionLinea.add(this.jComboBoxTiposReportesDinamicoComisionLinea, this.gridBagConstraintsComisionLinea);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoComisionLinea = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoComisionLinea.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionLinea.add(this.jLabelTiposArchivoReporteDinamicoComisionLinea, this.gridBagConstraintsComisionLinea);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionLinea.add(this.jComboBoxTiposArchivosReportesDinamicoComisionLinea, this.gridBagConstraintsComisionLinea);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoComisionLinea = new JButtonMe();
		this.jButtonGenerarReporteDinamicoComisionLinea.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoComisionLinea,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoComisionLinea.setToolTipText("Generar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionLinea.add(this.jButtonGenerarReporteDinamicoComisionLinea, this.gridBagConstraintsComisionLinea);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoComisionLinea = new JButtonMe();
		this.jButtonCerrarReporteDinamicoComisionLinea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoComisionLinea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoComisionLinea.setToolTipText("Cancelar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionLinea.add(this.jButtonCerrarReporteDinamicoComisionLinea, this.gridBagConstraintsComisionLinea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalComisionLinea = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoComisionLinea= new JScrollPane(jPanelReporteDinamicoComisionLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoComisionLinea.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisionLinea.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisionLinea.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Lineas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsComisionLinea.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoComisionLinea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoComisionLinea.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalComisionLinea);
		this.jInternalFrameReporteDinamicoComisionLinea.getContentPane().add(this.jScrollPanelReporteDinamicoComisionLinea, this.gridBagConstraintsComisionLinea);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionComisionLinea() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionComisionLinea = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionComisionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionComisionLinea.setName("jPanelImportacionComisionLinea"); 
		
		this.jPanelImportacionComisionLinea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisionLinea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisionLinea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionComisionLinea.setLayout(gridaBagLayoutImportacionComisionLinea);
		
		
		this.jInternalFrameImportacionComisionLinea= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionComisionLinea= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionComisionLinea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisionLinea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionComisionLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisionLinea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisionLinea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionComisionLinea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisionLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisionLinea.setResizable(true);
	    this.jInternalFrameImportacionComisionLinea.setClosable(true);
	    this.jInternalFrameImportacionComisionLinea.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionComisionLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisionLinea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisionLinea.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionComisionLinea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisionLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisionLinea.setResizable(true);
	    this.jInternalFrameImportacionComisionLinea.setClosable(true);
	    this.jInternalFrameImportacionComisionLinea.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionComisionLinea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisionLinea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisionLinea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Lineas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionComisionLinea = new JLabelMe();

		this.jLabelArchivoImportacionComisionLinea.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisionLinea.add(this.jLabelArchivoImportacionComisionLinea, this.gridBagConstraintsComisionLinea);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionComisionLinea = new JFileChooser();		
		this.jFileChooserImportacionComisionLinea.setToolTipText("ESCOGER ARCHIVO"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionComisionLinea = new JButtonMe();
		this.jButtonAbrirImportacionComisionLinea.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionComisionLinea,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionComisionLinea.setToolTipText("Generar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionLinea.add(this.jButtonAbrirImportacionComisionLinea, this.gridBagConstraintsComisionLinea);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionComisionLinea = new JLabelMe();

		this.jLabelPathArchivoImportacionComisionLinea.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionComisionLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisionLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisionLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisionLinea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisionLinea.add(this.jLabelPathArchivoImportacionComisionLinea, this.gridBagConstraintsComisionLinea);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionComisionLinea=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionComisionLinea.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisionLinea.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisionLinea.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionLinea.add(this.jTextFieldPathArchivoImportacionComisionLinea, this.gridBagConstraintsComisionLinea);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionComisionLinea = new JButtonMe();
		this.jButtonGenerarImportacionComisionLinea.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionComisionLinea,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionComisionLinea.setToolTipText("Generar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionLinea.add(this.jButtonGenerarImportacionComisionLinea, this.gridBagConstraintsComisionLinea);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionComisionLinea = new JButtonMe();
		this.jButtonCerrarImportacionComisionLinea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionComisionLinea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionComisionLinea.setToolTipText("Cancelar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionLinea.add(this.jButtonCerrarImportacionComisionLinea, this.gridBagConstraintsComisionLinea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalComisionLinea = new GridBagLayout();
		
		this.jScrollPanelImportacionComisionLinea= new JScrollPane(jPanelImportacionComisionLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsComisionLinea = new GridBagConstraints();
		this.gridBagConstraintsComisionLinea.gridy =iPosYImportacion;
		this.gridBagConstraintsComisionLinea.gridx =iPosXImportacion;
		this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionComisionLinea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionComisionLinea.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalComisionLinea);
		this.jInternalFrameImportacionComisionLinea.getContentPane().add(this.jScrollPanelImportacionComisionLinea, this.gridBagConstraintsComisionLinea);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByComisionLinea(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByComisionLinea = new JButtonMe();
			this.jButtonAbrirOrderByComisionLinea.setText("Orden");
			this.jButtonAbrirOrderByComisionLinea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisionLinea,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByComisionLinea";
			inputMap = this.jButtonAbrirOrderByComisionLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByComisionLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByComisionLinea"));
		
		
			GridBagLayout gridaBagLayoutOrderByComisionLinea = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByComisionLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByComisionLinea.setName("jPanelOrderByComisionLinea"); 
			
			this.jPanelOrderByComisionLinea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisionLinea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisionLinea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByComisionLinea.setLayout(gridaBagLayoutOrderByComisionLinea);
			
			
			this.jTableDatosComisionLineaOrderBy = new JTableMe();        
			this.jTableDatosComisionLineaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosComisionLineaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosComisionLineaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosComisionLineaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosComisionLineaOrderBy.setViewportView(this.jTableDatosComisionLineaOrderBy);
			this.jTableDatosComisionLineaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosComisionLineaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByComisionLinea= new OrderByJInternalFrame();
			this.jInternalFrameOrderByComisionLinea= new OrderByJInternalFrame();
			this.jScrollPanelOrderByComisionLinea = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteComisionLinea= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByComisionLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByComisionLinea.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByComisionLinea.setTitle("Orden");
			this.jInternalFrameOrderByComisionLinea.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByComisionLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByComisionLinea.setResizable(true);
			this.jInternalFrameOrderByComisionLinea.setClosable(true);
			this.jInternalFrameOrderByComisionLinea.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByComisionLinea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisionLinea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisionLinea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByComisionLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Lineas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.gridy =iPosYOrderBy++;
			this.gridBagConstraintsComisionLinea.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsComisionLinea.ipady =150;
				
			this.jPanelOrderByComisionLinea.add(jScrollPanelDatosComisionLineaOrderBy, this.gridBagConstraintsComisionLinea);//this.jTableDatosComisionLineaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByComisionLinea = new JButtonMe();
			this.jButtonCerrarOrderByComisionLinea.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByComisionLinea,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByComisionLinea.setToolTipText("Cancelar"+" "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByComisionLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionLinea.gridy = iPosYOrderBy++;
			this.gridBagConstraintsComisionLinea.gridx = iPosXOrderBy;
									
			this.jPanelOrderByComisionLinea.add(this.jButtonCerrarOrderByComisionLinea, this.gridBagConstraintsComisionLinea);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalComisionLinea = new GridBagLayout();
			
			this.jScrollPanelOrderByComisionLinea= new JScrollPane(jPanelOrderByComisionLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsComisionLinea = new GridBagConstraints();
			this.gridBagConstraintsComisionLinea.gridy =iPosYOrderBy;
			this.gridBagConstraintsComisionLinea.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisionLinea.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByComisionLinea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByComisionLinea.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalComisionLinea);
			
			this.jInternalFrameOrderByComisionLinea.getContentPane().add(this.jScrollPanelOrderByComisionLinea, this.gridBagConstraintsComisionLinea);			
		
		} else {
			this.jButtonAbrirOrderByComisionLinea = new JButtonMe();
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
		int iWidthTableCalculado=0;//1630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.comisionlineaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosComisionLinea.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosComisionLinea.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosComisionLinea.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosComisionLinea.getRowHeight();//ComisionLineaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ComisionLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisionLinea.isSelected()) {
					iHeightTable=ComisionLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ComisionLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisionLinea.isSelected()) {
					iHeightTable=ComisionLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosComisionLinea.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisionLinea.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisionLinea.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosComisionLinea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisionLinea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisionLinea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByComisionLinea!=null && this.jInternalFrameOrderByComisionLinea.getjTableDatosOrderBy()!=null) {
			//if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByComisionLinea.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByComisionLinea.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByComisionLinea.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByComisionLinea.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByComisionLinea.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByComisionLinea.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByComisionLinea.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosComisionLinea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisionLinea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisionLinea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=comisionlineaLogic.getComisionLineas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisionlineas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ComisionLinea> TraerComisionLineaBeans(List<ComisionLinea> comisionlineas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ComisionLinea comisionlinea:comisionlineas) {
					
				if(!(ComisionLineaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ComisionLineaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					comisionlinea.setsDetalleGeneralEntityReporte(ComisionLineaConstantesFunciones.getComisionLineaDescripcion(comisionlinea));
										
						
					
						
					
				} else  {
							
					//comisionlinea.setsDetalleGeneralEntityReporte(comisionlinea.getsDetalleGeneralEntityReporte());
										
				}
				
				//comisionlineabeans.add(comisionlineabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return comisionlineas;
    }
	//PARA REPORTES FIN
}
