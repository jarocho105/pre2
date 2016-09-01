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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
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
import com.bydan.erp.nomina.util.CargoGrupoConstantesFunciones;

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
public class CargoGrupoJInternalFrame extends CargoGrupoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCargoGrupo;
	
	protected JMenuBar jmenuBarCargoGrupo;
	
	protected JMenu jmenuCargoGrupo;
	protected JMenu jmenuDatosCargoGrupo;
	protected JMenu jmenuArchivoCargoGrupo;
	protected JMenu jmenuAccionesCargoGrupo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCargoGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCargoGrupo;	
	protected GridBagConstraints gridBagConstraintsCargoGrupo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CargoGrupoDetalleFormJInternalFrame jInternalFrameDetalleFormCargoGrupo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCargoGrupo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCargoGrupo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CargoGrupoSessionBean cargogrupoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CargoGrupo> cargogrupos;		
	public List<CargoGrupo> cargogruposEliminados;	
	public List<CargoGrupo> cargogruposAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCargoGrupo;		
	protected JButton jButtonAbrirOrderByCargoGrupo;
	
	
	//protected JPanel jPanelOrderByCargoGrupo;
	//public JScrollPane jScrollPanelOrderByCargoGrupo;	
	//protected JButton jButtonCerrarOrderByCargoGrupo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CargoGrupoLogic cargogrupoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCargoGrupo;
	public JScrollPane jScrollPanelDatosEdicionCargoGrupo;
	public JScrollPane jScrollPanelDatosGeneralCargoGrupo;
    
	
	
	//public JScrollPane jScrollPanelDatosCargoGrupoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCargoGrupo;
	//public JScrollPane jScrollPanelImportacionCargoGrupo;
	
	
	
	protected JPanel jPanelAccionesCargoGrupo;
	
    protected JPanel jPanelPaginacionCargoGrupo;
    protected JPanel jPanelParametrosReportesCargoGrupo;
	protected JPanel jPanelParametrosReportesAccionesCargoGrupo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CargoGrupo;
	protected JPanel jPanelParametrosAuxiliar2CargoGrupo;
	protected JPanel jPanelParametrosAuxiliar3CargoGrupo;
	protected JPanel jPanelParametrosAuxiliar4CargoGrupo;
	//protected JPanel jPanelParametrosAuxiliar5CargoGrupo;
	
	
	
	//protected JPanel jPanelReporteDinamicoCargoGrupo;
	//protected JPanel jPanelImportacionCargoGrupo;
	
	
	public JTable jTableDatosCargoGrupo;
	
	
	
	//public JTable jTableDatosCargoGrupoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCargoGrupo;
	protected JButton jButtonDuplicarCargoGrupo;
	protected JButton jButtonCopiarCargoGrupo;
	protected JButton jButtonVerFormCargoGrupo;
	protected JButton jButtonNuevoRelacionesCargoGrupo;
	protected JButton jButtonModificarCargoGrupo;
	
    protected JButton jButtonGuardarCambiosTablaCargoGrupo;
	protected JButton jButtonCerrarCargoGrupo;
	
	
	protected JButton jButtonRecargarInformacionCargoGrupo;
	protected JButton jButtonProcesarInformacionCargoGrupo;
	
	
	protected JButton jButtonAnterioresCargoGrupo;
	protected JButton jButtonSiguientesCargoGrupo;
	protected JButton jButtonNuevoGuardarCambiosCargoGrupo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCargoGrupo;
	//protected JButton jButtonCerrarReporteDinamicoCargoGrupo;
	//protected JButton jButtonGenerarExcelReporteDinamicoCargoGrupo;	
	
	
	
	//protected JButton jButtonAbrirImportacionCargoGrupo;
	//protected JButton jButtonGenerarImportacionCargoGrupo;
	//protected JButton jButtonCerrarImportacionCargoGrupo;
	//protected JFileChooser jFileChooserImportacionCargoGrupo;
	//protected File fileImportacionCargoGrupo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCargoGrupo;
	protected JButton jButtonDuplicarToolBarCargoGrupo;
	protected JButton jButtonNuevoRelacionesToolBarCargoGrupo;
	
	
	public JButton jButtonGuardarCambiosToolBarCargoGrupo;
	protected JButton jButtonCopiarToolBarCargoGrupo;
	protected JButton jButtonVerFormToolBarCargoGrupo;
	public JButton jButtonGuardarCambiosTablaToolBarCargoGrupo;
	protected JButton jButtonMostrarOcultarTablaToolBarCargoGrupo;
	protected JButton jButtonCerrarToolBarCargoGrupo;
	
	protected JButton jButtonRecargarInformacionToolBarCargoGrupo;
	protected JButton jButtonProcesarInformacionToolBarCargoGrupo;
	protected JButton jButtonAnterioresToolBarCargoGrupo;
	protected JButton jButtonSiguientesToolBarCargoGrupo;
	protected JButton jButtonNuevoGuardarCambiosToolBarCargoGrupo;
	protected JButton jButtonAbrirOrderByToolBarCargoGrupo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCargoGrupo;
	protected JMenuItem jMenuItemDuplicarCargoGrupo;
	protected JMenuItem jMenuItemNuevoRelacionesCargoGrupo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCargoGrupo;
	protected JMenuItem jMenuItemCopiarCargoGrupo;
	protected JMenuItem jMenuItemVerFormCargoGrupo;
	protected JMenuItem jMenuItemGuardarCambiosTablaCargoGrupo;
	protected JMenuItem jMenuItemCerrarCargoGrupo;
	protected JMenuItem jMenuItemDetalleCerrarCargoGrupo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCargoGrupo;
	protected JMenuItem jMenuItemDetalleMostarOcultarCargoGrupo;
	
	protected JMenuItem jMenuItemRecargarInformacionCargoGrupo;
	protected JMenuItem jMenuItemProcesarInformacionCargoGrupo;
	protected JMenuItem jMenuItemAnterioresCargoGrupo;
	protected JMenuItem jMenuItemSiguientesCargoGrupo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCargoGrupo;
	protected JMenuItem jMenuItemAbrirOrderByCargoGrupo;
	protected JMenuItem jMenuItemMostrarOcultarCargoGrupo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCargoGrupo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCargoGrupo;
	protected JCheckBox jCheckBoxSeleccionadosCargoGrupo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCargoGrupo;
	protected JCheckBox jCheckBoxConGraficoReporteCargoGrupo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCargoGrupo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCargoGrupo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCargoGrupo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCargoGrupo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCargoGrupo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCargoGrupo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCargoGrupo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCargoGrupo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCargoGrupo;
	protected JTextField jTextFieldValorCampoGeneralCargoGrupo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCargoGrupo;
	//public JList<Reporte> jListColumnasSelectReporteCargoGrupo;
	//public JScrollPane jScrollColumnasSelectReporteCargoGrupo;
	
	//public JLabel jLabelRelacionesSelectReporteCargoGrupo;
	//public JList<Reporte> jListRelacionesSelectReporteCargoGrupo;
	//public JScrollPane jScrollRelacionesSelectReporteCargoGrupo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCargoGrupo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCargoGrupo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCargoGrupo;
	//public JLabel jLabelTiposArchivoReporteDinamicoCargoGrupo;
	
		
	//public JLabel jLabelArchivoImportacionCargoGrupo;	
	//public JLabel jLabelPathArchivoImportacionCargoGrupo;
	//protected JTextField jTextFieldPathArchivoImportacionCargoGrupo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCargoGrupo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCargoGrupo;
	
	//public JLabel jLabelColumnaCategoriaValorCargoGrupo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCargoGrupo;
	
	//public JLabel jLabelColumnasValoresGraficoCargoGrupo;
	//public JList<Reporte> jListColumnasValoresGraficoCargoGrupo;
	//public JScrollPane jScrollColumnasValoresGraficoCargoGrupo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCargoGrupo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCargoGrupo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCargoGrupo;
	
	
	
	
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
	public CargoGrupoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CargoGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoGrupoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargoGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoGrupoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargoGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoGrupoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CargoGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCargoGrupo)	{
		this.jButtonRecargarInformacionCargoGrupo = jButtonRecargarInformacionCargoGrupo;
	}
	
	public JButton getjButtonProcesarInformacionCargoGrupo() {
		return this.jButtonProcesarInformacionCargoGrupo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCargoGrupo)	{
		this.jButtonProcesarInformacionCargoGrupo = jButtonProcesarInformacionCargoGrupo;
	}
	
	
	public JButton getjButtonRecargarInformacionCargoGrupo() {
		return this.jButtonRecargarInformacionCargoGrupo;
	}
	
	
	public List<CargoGrupo> getcargogrupos() {
		return this.cargogrupos;
	}

	public void setcargogrupos(List<CargoGrupo> cargogrupos) {
		this.cargogrupos = cargogrupos;
	}
	
	public List<CargoGrupo> getcargogruposAux() {
		return this.cargogruposAux;
	}

	public void setcargogruposAux(List<CargoGrupo> cargogruposAux) {
		this.cargogruposAux = cargogruposAux;
	}
	
	public List<CargoGrupo> getcargogruposEliminados() {
		return this.cargogruposEliminados;
	}

	public void setCargoGruposEliminados(List<CargoGrupo> cargogruposEliminados) {
		this.cargogruposEliminados = cargogruposEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCargoGrupo() {
		return jComboBoxTiposSeleccionarCargoGrupo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCargoGrupo(
			JComboBox jComboBoxTiposSeleccionarCargoGrupo) {
		this.jComboBoxTiposSeleccionarCargoGrupo = jComboBoxTiposSeleccionarCargoGrupo;
	}
	
	public void setBorderResaltarTiposSeleccionarCargoGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCargoGrupo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCargoGrupo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCargoGrupo() {
		return jTextFieldValorCampoGeneralCargoGrupo;
	}

	public void setjTextFieldValorCampoGeneralCargoGrupo(
			JTextField jTextFieldValorCampoGeneralCargoGrupo) {
		this.jTextFieldValorCampoGeneralCargoGrupo = jTextFieldValorCampoGeneralCargoGrupo;
	}

	public void setBorderResaltarValorCampoGeneralCargoGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoGrupo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCargoGrupo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCargoGrupo() {
		return this.jCheckBoxSeleccionarTodosCargoGrupo;
	}

	public void setjCheckBoxSeleccionarTodosCargoGrupo(
			JCheckBox jCheckBoxSeleccionarTodosCargoGrupo) {
		this.jCheckBoxSeleccionarTodosCargoGrupo = jCheckBoxSeleccionarTodosCargoGrupo;
	}

	public void setBorderResaltarSeleccionarTodosCargoGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoGrupo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCargoGrupo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCargoGrupo() {
		return this.jCheckBoxSeleccionadosCargoGrupo;
	}

	public void setjCheckBoxSeleccionadosCargoGrupo(
			JCheckBox jCheckBoxSeleccionadosCargoGrupo) {
		this.jCheckBoxSeleccionadosCargoGrupo = jCheckBoxSeleccionadosCargoGrupo;
	}
	
	public void setBorderResaltarSeleccionadosCargoGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoGrupo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCargoGrupo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCargoGrupo() {
		return this.jComboBoxTiposArchivosReportesCargoGrupo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCargoGrupo(
			JComboBox jComboBoxTiposArchivosReportesCargoGrupo) {
		this.jComboBoxTiposArchivosReportesCargoGrupo = jComboBoxTiposArchivosReportesCargoGrupo;
	}

	public void setBorderResaltarTiposArchivosReportesCargoGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoGrupo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCargoGrupo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCargoGrupo() {
		return this.jComboBoxTiposReportesCargoGrupo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCargoGrupo(
			JComboBox jComboBoxTiposReportesCargoGrupo) {
		this.jComboBoxTiposReportesCargoGrupo = jComboBoxTiposReportesCargoGrupo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCargoGrupo() {
	//	return jComboBoxTiposReportesDinamicoCargoGrupo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCargoGrupo(
	//		JComboBox jComboBoxTiposReportesDinamicoCargoGrupo) {
	//	this.jComboBoxTiposReportesDinamicoCargoGrupo = jComboBoxTiposReportesDinamicoCargoGrupo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCargoGrupo() {
	//	return jComboBoxTiposArchivosReportesDinamicoCargoGrupo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCargoGrupo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCargoGrupo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCargoGrupo = jComboBoxTiposArchivosReportesDinamicoCargoGrupo;
	//}
	
	public void setBorderResaltarTiposReportesCargoGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoGrupo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCargoGrupo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCargoGrupo() {
		return this.jComboBoxTiposGraficosReportesCargoGrupo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCargoGrupo(
			JComboBox jComboBoxTiposGraficosReportesCargoGrupo) {
		this.jComboBoxTiposGraficosReportesCargoGrupo = jComboBoxTiposGraficosReportesCargoGrupo;
	}
	
	public void setBorderResaltarTiposGraficosReportesCargoGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoGrupo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCargoGrupo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCargoGrupo() {
		return this.jComboBoxTiposPaginacionCargoGrupo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCargoGrupo(
			JComboBox jComboBoxTiposPaginacionCargoGrupo) {
		this.jComboBoxTiposPaginacionCargoGrupo = jComboBoxTiposPaginacionCargoGrupo;
	}
	
	public void setBorderResaltarTiposPaginacionCargoGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoGrupo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCargoGrupo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCargoGrupo() {
		return this.jComboBoxTiposRelacionesCargoGrupo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCargoGrupo() {
		return this.jComboBoxTiposAccionesCargoGrupo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCargoGrupo(
			JComboBox jComboBoxTiposRelacionesCargoGrupo) {
		this.jComboBoxTiposRelacionesCargoGrupo = jComboBoxTiposRelacionesCargoGrupo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCargoGrupo(
			JComboBox jComboBoxTiposAccionesCargoGrupo) {
		this.jComboBoxTiposAccionesCargoGrupo = jComboBoxTiposAccionesCargoGrupo;
	}
	
	public void setBorderResaltarTiposRelacionesCargoGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoGrupo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCargoGrupo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCargoGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargoGrupo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCargoGrupo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCargoGrupo() {
	//	return jCheckBoxConGraficoDinamicoCargoGrupo;
	//}

	//public void setjCheckBoxConGraficoDinamicoCargoGrupo(
	//		JCheckBox jCheckBoxConGraficoDinamicoCargoGrupo) {
	//	this.jCheckBoxConGraficoDinamicoCargoGrupo = jCheckBoxConGraficoDinamicoCargoGrupo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCargoGrupo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCargoGrupo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCargoGrupo .setBorder(borderResaltar);		
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
		this.cargogrupoSessionBean=new CargoGrupoSessionBean();
		
		this.cargogrupoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cargogrupoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cargogrupoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CargoGrupoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CargoGrupoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CargoGrupoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CargoGrupoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CargoGrupoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cargo Grupo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
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
		
		CargoGrupoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CargoGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCargoGrupo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCargoGrupo,this.jTtoolBarCargoGrupo,
							"nuevo","nuevo","Nuevo"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCargoGrupo,this.jTtoolBarCargoGrupo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCargoGrupo,this.jTtoolBarCargoGrupo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCargoGrupo,this.jTtoolBarCargoGrupo,
							"duplicar","duplicar","Duplicar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCargoGrupo,this.jTtoolBarCargoGrupo,
							"copiar","copiar","Copiar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCargoGrupo,this.jTtoolBarCargoGrupo,
							"ver_form","ver_form","Ver"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCargoGrupo,this.jTtoolBarCargoGrupo,
							"recargar","recargar","Recargar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCargoGrupo,this.jTtoolBarCargoGrupo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCargoGrupo,this.jTtoolBarCargoGrupo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCargoGrupo,this.jTtoolBarCargoGrupo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCargoGrupo,this.jTtoolBarCargoGrupo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCargoGrupo,this.jTtoolBarCargoGrupo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCargoGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCargoGrupo,this.jTtoolBarCargoGrupo,
							"cerrar","cerrar","Salir"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCargoGrupo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCargoGrupo;
			
				this.jButtonProcesarInformacionToolBarCargoGrupo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCargoGrupo;
				
		//protected JButton jButtonModificarToolBarCargoGrupo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCargoGrupo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCargoGrupo=new JMenuMe("General");
		this.jmenuArchivoCargoGrupo=new JMenuMe("Archivo");
		this.jmenuAccionesCargoGrupo=new JMenuMe("Acciones");
		this.jmenuDatosCargoGrupo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCargoGrupo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCargoGrupo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCargoGrupo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCargoGrupo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCargoGrupo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCargoGrupo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCargoGrupo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCargoGrupo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCargoGrupo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCargoGrupo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCargoGrupo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCargoGrupo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCargoGrupo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCargoGrupo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCargoGrupo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCargoGrupo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCargoGrupo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCargoGrupo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCargoGrupo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCargoGrupo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCargoGrupo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCargoGrupo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCargoGrupo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCargoGrupo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCargoGrupo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCargoGrupo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCargoGrupo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCargoGrupo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCargoGrupo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCargoGrupo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCargoGrupo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCargoGrupo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCargoGrupo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCargoGrupo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCargoGrupo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCargoGrupo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCargoGrupo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCargoGrupo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCargoGrupo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCargoGrupo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCargoGrupo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCargoGrupo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCargoGrupo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCargoGrupo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCargoGrupo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCargoGrupo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCargoGrupo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCargoGrupo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCargoGrupo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCargoGrupo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCargoGrupo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCargoGrupo.add(this.jMenuItemCerrarCargoGrupo);
			
			this.jmenuAccionesCargoGrupo.add(this.jMenuItemNuevoCargoGrupo);
			this.jmenuAccionesCargoGrupo.add(this.jMenuItemNuevoGuardarCambiosCargoGrupo);
			this.jmenuAccionesCargoGrupo.add(this.jMenuItemNuevoRelacionesCargoGrupo);
			this.jmenuAccionesCargoGrupo.add(this.jMenuItemGuardarCambiosTablaCargoGrupo);		
			this.jmenuAccionesCargoGrupo.add(this.jMenuItemDuplicarCargoGrupo);		
			this.jmenuAccionesCargoGrupo.add(this.jMenuItemCopiarCargoGrupo);		
			this.jmenuAccionesCargoGrupo.add(this.jMenuItemVerFormCargoGrupo);		
			
			this.jmenuDatosCargoGrupo.add(this.jMenuItemRecargarInformacionCargoGrupo);				
			this.jmenuDatosCargoGrupo.add(this.jMenuItemAnterioresCargoGrupo);				
			this.jmenuDatosCargoGrupo.add(this.jMenuItemSiguientesCargoGrupo);				
			this.jmenuDatosCargoGrupo.add(this.jMenuItemAbrirOrderByCargoGrupo);				
			this.jmenuDatosCargoGrupo.add(this.jMenuItemMostrarOcultarCargoGrupo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCargoGrupo.add(this.jMenuItemGuardarCambiosCargoGrupo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCargoGrupo.add(this.jmenuArchivoCargoGrupo);		
			this.jmenuBarCargoGrupo.add(this.jmenuAccionesCargoGrupo);		
			this.jmenuBarCargoGrupo.add(this.jmenuDatosCargoGrupo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCargoGrupo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCargoGrupo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasCargoGrupo=new JTabbedPane();


		this.jTabbedPaneBusquedasCargoGrupo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCargoGrupo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCargoGrupo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCargoGrupo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCargoGrupo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCargoGrupo = new CargoGrupoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cargo Grupo DATOS");
			this.jInternalFrameDetalleFormCargoGrupo = new CargoGrupoDetalleFormJInternalFrame(jDesktopPane,this.cargogrupoSessionBean.getConGuardarRelaciones(),this.cargogrupoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCargoGrupo = null;//new CargoGrupoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCargoGrupo= new GridBagLayout();
		
		
		this.jTableDatosCargoGrupo = new JTableMe();      
		
		String sToolTipCargoGrupo="";
		sToolTipCargoGrupo=CargoGrupoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCargoGrupo+="(Nomina.CargoGrupo)";
		}
		
		if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCargoGrupo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCargoGrupo.setToolTipText(sToolTipCargoGrupo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCargoGrupo);
		this.jTableDatosCargoGrupo.setAutoCreateRowSorter(true);
		this.jTableDatosCargoGrupo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCargoGrupo.setRowSelectionAllowed(true);
		this.jTableDatosCargoGrupo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCargoGrupo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCargoGrupo = new JButtonMe();
		this.jButtonDuplicarCargoGrupo = new JButtonMe();
		this.jButtonCopiarCargoGrupo = new JButtonMe();
		this.jButtonVerFormCargoGrupo = new JButtonMe();
		this.jButtonNuevoRelacionesCargoGrupo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCargoGrupo = new JButtonMe();
		this.jButtonCerrarCargoGrupo = new JButtonMe();
		
		this.jScrollPanelDatosCargoGrupo = new JScrollPane();   
        this.jScrollPanelDatosGeneralCargoGrupo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCargoGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cargo Grupo";
		
		if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargo Grupos" + this.sPath));
		} else {
			this.jScrollPanelDatosCargoGrupo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCargoGrupo.setToolTipText("Acciones");
        this.jPanelAccionesCargoGrupo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCargoGrupo=new ReporteDinamicoJInternalFrame(CargoGrupoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCargoGrupo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCargoGrupo=new ImportacionJInternalFrame(CargoGrupoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCargoGrupo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCargoGrupo = new JButtonMe();
		
		this.jButtonAbrirOrderByCargoGrupo.setText("Orden");
		this.jButtonAbrirOrderByCargoGrupo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCargoGrupo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCargoGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCargoGrupo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargoGrupo,false,this);
			
			//this.cargarOrderByCargoGrupo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCargoGrupo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargoGrupo,true,this);
			
			//this.cargarOrderByCargoGrupo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCargoGrupo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosCargoGrupo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosCargoGrupo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosCargoGrupo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCargoGrupo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCargoGrupo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCargoGrupo.setText("Nuevo");
		this.jButtonDuplicarCargoGrupo.setText("Duplicar");
		this.jButtonCopiarCargoGrupo.setText("Copiar");
		this.jButtonVerFormCargoGrupo.setText("Ver");
		this.jButtonNuevoRelacionesCargoGrupo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCargoGrupo.setText("Guardar");
		this.jButtonCerrarCargoGrupo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCargoGrupo,"nuevo_button","Nuevo",this.cargogrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCargoGrupo,"duplicar_button","Duplicar",this.cargogrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCargoGrupo,"copiar_button","Copiar",this.cargogrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCargoGrupo,"ver_form","Ver",this.cargogrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCargoGrupo,"nuevorelaciones_button","Nuevo Rel",this.cargogrupoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCargoGrupo,"guardarcambiostabla_button","Guardar",this.cargogrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCargoGrupo,"cerrar_button","Salir",this.cargogrupoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCargoGrupo.setToolTipText("Nuevo"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCargoGrupo.setToolTipText("Duplicar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCargoGrupo.setToolTipText("Copiar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCargoGrupo.setToolTipText("Ver"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCargoGrupo.setToolTipText("Nuevo Rel"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCargoGrupo.setToolTipText("Guardar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCargoGrupo.setToolTipText("Salir"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCargoGrupo";
		inputMap = this.jButtonNuevoCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCargoGrupo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCargoGrupo"));
		
		//DUPLICAR
		sMapKey = "DuplicarCargoGrupo";
		inputMap = this.jButtonDuplicarCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCargoGrupo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCargoGrupo"));
		
		//COPIAR
		sMapKey = "CopiarCargoGrupo";
		inputMap = this.jButtonCopiarCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCargoGrupo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCargoGrupo"));
		
		//VEr FORM
		sMapKey = "VerFormCargoGrupo";
		inputMap = this.jButtonVerFormCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCargoGrupo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCargoGrupo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCargoGrupo";
		inputMap = this.jButtonNuevoRelacionesCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCargoGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCargoGrupo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCargoGrupo";
		inputMap = this.jButtonModificarCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCargoGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCargoGrupo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCargoGrupo";
		inputMap = this.jButtonCerrarCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCargoGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCargoGrupo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCargoGrupo";
		inputMap = this.jButtonGuardarCambiosTablaCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCargoGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCargoGrupo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCargoGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCargoGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCargoGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CargoGrupo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CargoGrupo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CargoGrupo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CargoGrupo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CargoGrupo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCargoGrupo.setName("jPanelParametrosReportesCargoGrupo"); 
		
		this.jPanelParametrosReportesAccionesCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCargoGrupo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCargoGrupo.setName("jPanelParametrosReportesAccionesCargoGrupo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCargoGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCargoGrupo = new JButtonMe();
		this.jButtonRecargarInformacionCargoGrupo.setText("Recargar");
		this.jButtonRecargarInformacionCargoGrupo.setToolTipText("Recargar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCargoGrupo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCargoGrupo = new JButtonMe();
		this.jButtonProcesarInformacionCargoGrupo.setText("Procesar");
		this.jButtonProcesarInformacionCargoGrupo.setToolTipText("Procesar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCargoGrupo.setVisible(false);
			
		this.jButtonProcesarInformacionCargoGrupo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCargoGrupo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCargoGrupo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCargoGrupo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCargoGrupo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCargoGrupo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCargoGrupo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCargoGrupo.setText("TIPO");       
		this.jComboBoxTiposReportesCargoGrupo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCargoGrupo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCargoGrupo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCargoGrupo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCargoGrupo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCargoGrupo.setText("Paginacion");
		this.jComboBoxTiposPaginacionCargoGrupo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCargoGrupo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCargoGrupo.setText("Accion");
		this.jComboBoxTiposRelacionesCargoGrupo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCargoGrupo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCargoGrupo.setText("Accion");
		this.jComboBoxTiposAccionesCargoGrupo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCargoGrupo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCargoGrupo.setText("Accion");
		this.jComboBoxTiposSeleccionarCargoGrupo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCargoGrupo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCargoGrupo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCargoGrupo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCargoGrupo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCargoGrupo = new JLabelMe();
		
		this.jLabelAccionesCargoGrupo.setText("Acciones");		
		this.jLabelAccionesCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCargoGrupo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCargoGrupo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCargoGrupo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCargoGrupo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCargoGrupo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCargoGrupo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCargoGrupo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCargoGrupo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCargoGrupo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCargoGrupo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCargoGrupo.setText("Graf.");
		this.jCheckBoxConGraficoReporteCargoGrupo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCargoGrupo = new JButtonMe();
		//this.jButtonAnterioresCargoGrupo.setText("<<");
        this.jButtonAnterioresCargoGrupo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCargoGrupo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCargoGrupo = new JButtonMe();
		//this.jButtonSiguientesCargoGrupo.setText(">>");
        this.jButtonSiguientesCargoGrupo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCargoGrupo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCargoGrupo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCargoGrupo.setText("Nue");
        this.jButtonNuevoGuardarCambiosCargoGrupo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCargoGrupo,"nuevoguardarcambios_button","Nue",this.cargogrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCargoGrupo";
		inputMap = this.jButtonNuevoGuardarCambiosCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCargoGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCargoGrupo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCargoGrupo";
		inputMap = this.jButtonRecargarInformacionCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCargoGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCargoGrupo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCargoGrupo";
		inputMap = this.jButtonSiguientesCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCargoGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCargoGrupo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCargoGrupo";
		inputMap = this.jButtonAnterioresCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCargoGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCargoGrupo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCargoGrupo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCargoGrupo.setMinimumSize(new Dimension(this.getWidth(),CargoGrupoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CargoGrupoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCargoGrupo.setMaximumSize(new Dimension(this.getWidth(),CargoGrupoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CargoGrupoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCargoGrupo.setPreferredSize(new Dimension(this.getWidth(),CargoGrupoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CargoGrupoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCargoGrupo = new GridBagLayout();

			this.jPanelPaginacionCargoGrupo.setLayout(gridaBagLayoutPaginacionCargoGrupo);						
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.gridy = 0;
			this.gridBagConstraintsCargoGrupo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCargoGrupo.add(this.jButtonAnterioresCargoGrupo, this.gridBagConstraintsCargoGrupo);
					
						
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCargoGrupo.gridy = 0;
			
			this.jPanelPaginacionCargoGrupo.add(this.jButtonNuevoGuardarCambiosCargoGrupo, this.gridBagConstraintsCargoGrupo);
						
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCargoGrupo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCargoGrupo.gridy = 0;
			this.jPanelPaginacionCargoGrupo.add(this.jButtonSiguientesCargoGrupo, this.gridBagConstraintsCargoGrupo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.gridy = 1;
			this.gridBagConstraintsCargoGrupo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargoGrupo.add(this.jButtonNuevoCargoGrupo, this.gridBagConstraintsCargoGrupo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
				this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCargoGrupo.gridy = 1;
				this.gridBagConstraintsCargoGrupo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCargoGrupo.add(this.jButtonNuevoRelacionesCargoGrupo, this.gridBagConstraintsCargoGrupo);
			}
			
			
			if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
				this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCargoGrupo.gridy = 1;
				this.gridBagConstraintsCargoGrupo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCargoGrupo.add(this.jButtonGuardarCambiosTablaCargoGrupo, this.gridBagConstraintsCargoGrupo);
			}
			
			
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.gridy = 1;
			this.gridBagConstraintsCargoGrupo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargoGrupo.add(this.jButtonDuplicarCargoGrupo, this.gridBagConstraintsCargoGrupo);
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.gridy = 1;
			this.gridBagConstraintsCargoGrupo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargoGrupo.add(this.jButtonCopiarCargoGrupo, this.gridBagConstraintsCargoGrupo);
		
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.gridy = 1;
			this.gridBagConstraintsCargoGrupo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargoGrupo.add(this.jButtonVerFormCargoGrupo, this.gridBagConstraintsCargoGrupo);
		
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.gridy = 1;
			this.gridBagConstraintsCargoGrupo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCargoGrupo.add(this.jButtonCerrarCargoGrupo, this.gridBagConstraintsCargoGrupo);
		
		
		
		this.jButtonRecargarInformacionCargoGrupo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCargoGrupo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCargoGrupo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCargoGrupo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCargoGrupo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCargoGrupo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCargoGrupo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCargoGrupo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCargoGrupo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCargoGrupo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCargoGrupo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCargoGrupo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCargoGrupo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCargoGrupo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCargoGrupo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCargoGrupo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCargoGrupo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCargoGrupo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCargoGrupo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargoGrupo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargoGrupo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCargoGrupo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCargoGrupo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCargoGrupo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCargoGrupo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCargoGrupo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCargoGrupo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCargoGrupo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCargoGrupo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCargoGrupo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCargoGrupo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCargoGrupo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCargoGrupo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCargoGrupo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCargoGrupo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCargoGrupo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCargoGrupo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCargoGrupo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CargoGrupo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CargoGrupo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CargoGrupo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CargoGrupo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCargoGrupo.setLayout(gridaBagParametrosReportesCargoGrupo);
			this.jPanelParametrosReportesAccionesCargoGrupo.setLayout(gridaBagParametrosReportesAccionesCargoGrupo);
			
			
			this.jPanelParametrosAuxiliar1CargoGrupo.setLayout(gridaBagParametrosAuxiliar1CargoGrupo);
			this.jPanelParametrosAuxiliar2CargoGrupo.setLayout(gridaBagParametrosAuxiliar2CargoGrupo);
			this.jPanelParametrosAuxiliar3CargoGrupo.setLayout(gridaBagParametrosAuxiliar3CargoGrupo);
			this.jPanelParametrosAuxiliar4CargoGrupo.setLayout(gridaBagParametrosAuxiliar4CargoGrupo);
			//this.jPanelParametrosAuxiliar5CargoGrupo.setLayout(gridaBagParametrosAuxiliar2CargoGrupo);			
			
			
			
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargoGrupo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargoGrupo.add(this.jButtonRecargarInformacionCargoGrupo, this.gridBagConstraintsCargoGrupo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargoGrupo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CargoGrupo.add(this.jComboBoxTiposPaginacionCargoGrupo, this.gridBagConstraintsCargoGrupo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargoGrupo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CargoGrupo.add(this.jCheckBoxConAltoMaximoTablaCargoGrupo, this.gridBagConstraintsCargoGrupo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargoGrupo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CargoGrupo.add(this.jComboBoxTiposArchivosReportesCargoGrupo, this.gridBagConstraintsCargoGrupo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoGrupo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargoGrupo.add(this.jPanelParametrosAuxiliar1CargoGrupo, this.gridBagConstraintsCargoGrupo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargoGrupo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CargoGrupo.add(this.jComboBoxTiposReportesCargoGrupo, this.gridBagConstraintsCargoGrupo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoGrupo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargoGrupo.add(this.jPanelParametrosAuxiliar4CargoGrupo, this.gridBagConstraintsCargoGrupo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargoGrupo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargoGrupo.add(this.jComboBoxTiposReportesCargoGrupo, this.gridBagConstraintsCargoGrupo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoGrupo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargoGrupo.add(this.jCheckBoxGenerarReporteCargoGrupo, this.gridBagConstraintsCargoGrupo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoGrupo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargoGrupo.add(this.jPanelParametrosAuxiliar2CargoGrupo, this.gridBagConstraintsCargoGrupo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargoGrupo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargoGrupo.add(this.jLabelAccionesCargoGrupo, this.gridBagConstraintsCargoGrupo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
				this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCargoGrupo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCargoGrupo.add(this.jButtonAbrirOrderByCargoGrupo, this.gridBagConstraintsCargoGrupo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoGrupo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargoGrupo.add(this.jComboBoxTiposSeleccionarCargoGrupo, this.gridBagConstraintsCargoGrupo);			
			
			
			/*
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargoGrupo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargoGrupo.add(this.jCheckBoxSeleccionarTodosCargoGrupo, this.gridBagConstraintsCargoGrupo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargoGrupo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CargoGrupo.add(this.jCheckBoxSeleccionarTodosCargoGrupo, this.gridBagConstraintsCargoGrupo);															
				
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargoGrupo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CargoGrupo.add(this.jCheckBoxSeleccionadosCargoGrupo, this.gridBagConstraintsCargoGrupo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoGrupo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargoGrupo.add(this.jPanelParametrosAuxiliar3CargoGrupo, this.gridBagConstraintsCargoGrupo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoGrupo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargoGrupo.add(this.jComboBoxTiposRelacionesCargoGrupo, this.gridBagConstraintsCargoGrupo);
				
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoGrupo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargoGrupo.add(this.jComboBoxTiposAccionesCargoGrupo, this.gridBagConstraintsCargoGrupo);
	
				
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargoGrupo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargoGrupo.add(this.jTextFieldValorCampoGeneralCargoGrupo, this.gridBagConstraintsCargoGrupo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCargoGrupo = new GridBagLayout();

			this.jScrollPanelDatosCargoGrupo.setLayout(gridaBagLayoutDatosCargoGrupo);
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.gridy = 0;
			this.gridBagConstraintsCargoGrupo.gridx = 0;
			
			this.jScrollPanelDatosCargoGrupo.add(this.jTableDatosCargoGrupo, this.gridBagConstraintsCargoGrupo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCargoGrupo.setViewportView(this.jTableDatosCargoGrupo);
		this.jTableDatosCargoGrupo.setFillsViewportHeight(true);
		this.jTableDatosCargoGrupo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCargoGrupo= new GridBagLayout();
		this.jPanelAccionesCargoGrupo.setLayout(gridaBagLayoutAccionesCargoGrupo);
		
		
		/*	
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoGrupo.gridy = 0;
		this.gridBagConstraintsCargoGrupo.gridx = 0;
			
		this.jPanelAccionesCargoGrupo.add(this.jButtonNuevoCargoGrupo, this.gridBagConstraintsCargoGrupo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCargoGrupo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCargoGrupo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cargogrupoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();						
			this.gridBagConstraintsCargoGrupo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCargoGrupo.gridx = 0;		
			//this.gridBagConstraintsCargoGrupo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCargoGrupo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCargoGrupo, this.gridBagConstraintsCargoGrupo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCargoGrupo.gridx = 0;		
		//this.gridBagConstraintsCargoGrupo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoGrupo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCargoGrupo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCargoGrupo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargoGrupo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCargoGrupo, this.gridBagConstraintsCargoGrupo);								
		
		
		/*
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargoGrupo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCargoGrupo, this.gridBagConstraintsCargoGrupo);
		*/		
		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCargoGrupo.gridx =0;
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCargoGrupo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCargoGrupo, this.gridBagConstraintsCargoGrupo);
				
		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargoGrupo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCargoGrupo, this.gridBagConstraintsCargoGrupo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(CargoGrupoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCargoGrupo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCargoGrupo = new GridBagLayout();
			this.jPanelBusquedasParametrosCargoGrupo.setLayout(gridaBagLayoutBusquedasParametrosCargoGrupo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCargoGrupo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCargoGrupo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargoGrupo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargoGrupo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargoGrupo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCargoGrupo, this.gridBagConstraintsCargoGrupo);
			
			
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargoGrupo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCargoGrupo, this.gridBagConstraintsCargoGrupo);
		
			
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCargoGrupo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCargoGrupo, this.gridBagConstraintsCargoGrupo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCargoGrupo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCargoGrupo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCargoGrupo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCargoGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCargoGrupo.setName("jPanelReporteDinamicoCargoGrupo"); 
		
		this.jPanelReporteDinamicoCargoGrupo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCargoGrupo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCargoGrupo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCargoGrupo.setLayout(gridaBagLayoutReporteDinamicoCargoGrupo);
		
		
		this.jInternalFrameReporteDinamicoCargoGrupo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCargoGrupo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCargoGrupo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCargoGrupo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCargoGrupo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCargoGrupo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCargoGrupo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCargoGrupo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCargoGrupo.setResizable(true);
	    this.jInternalFrameReporteDinamicoCargoGrupo.setClosable(true);
	    this.jInternalFrameReporteDinamicoCargoGrupo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCargoGrupo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCargoGrupo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCargoGrupo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargo Grupos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCargoGrupo = new JLabelMe();

		this.jLabelColumnasSelectReporteCargoGrupo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargoGrupo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCargoGrupo.add(this.jLabelColumnasSelectReporteCargoGrupo, this.gridBagConstraintsCargoGrupo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCargoGrupo = new JList<Reporte>();
		this.jListColumnasSelectReporteCargoGrupo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCargoGrupo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCargoGrupo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCargoGrupo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCargoGrupo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCargoGrupo=new JScrollPane(this.jListColumnasSelectReporteCargoGrupo);
			
			this.jScrollColumnasSelectReporteCargoGrupo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCargoGrupo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCargoGrupo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargoGrupo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCargoGrupo.add(this.jListColumnasSelectReporteCargoGrupo, this.gridBagConstraintsCargoGrupo);
		this.jPanelReporteDinamicoCargoGrupo.add(this.jScrollColumnasSelectReporteCargoGrupo, this.gridBagConstraintsCargoGrupo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCargoGrupo = new JLabelMe();

		this.jLabelRelacionesSelectReporteCargoGrupo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargoGrupo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCargoGrupo.add(this.jLabelRelacionesSelectReporteCargoGrupo, this.gridBagConstraintsCargoGrupo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCargoGrupo = new JList<Reporte>();
		this.jListRelacionesSelectReporteCargoGrupo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCargoGrupo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCargoGrupo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCargoGrupo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCargoGrupo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCargoGrupo=new JScrollPane(this.jListRelacionesSelectReporteCargoGrupo);
			
			this.jScrollRelacionesSelectReporteCargoGrupo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCargoGrupo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCargoGrupo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargoGrupo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCargoGrupo.add(this.jListRelacionesSelectReporteCargoGrupo, this.gridBagConstraintsCargoGrupo);
		this.jPanelReporteDinamicoCargoGrupo.add(this.jScrollRelacionesSelectReporteCargoGrupo, this.gridBagConstraintsCargoGrupo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCargoGrupo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCargoGrupo = new JComboBoxMe();
		this.jListColumnasValoresGraficoCargoGrupo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCargoGrupo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCargoGrupo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCargoGrupo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCargoGrupo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCargoGrupo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCargoGrupo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCargoGrupo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCargoGrupo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCargoGrupo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCargoGrupo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCargoGrupo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCargoGrupo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargoGrupo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargoGrupo.add(this.jLabelGenerarExcelReporteDinamicoCargoGrupo, this.gridBagConstraintsCargoGrupo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCargoGrupo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCargoGrupo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCargoGrupo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCargoGrupo.setToolTipText("Generar EXCEL"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		//this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCargoGrupo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCargoGrupo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCargoGrupo.add(this.jButtonGenerarExcelReporteDinamicoCargoGrupo, this.gridBagConstraintsCargoGrupo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargoGrupo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargoGrupo.add(this.jComboBoxTiposReportesDinamicoCargoGrupo, this.gridBagConstraintsCargoGrupo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCargoGrupo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCargoGrupo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargoGrupo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargoGrupo.add(this.jLabelTiposArchivoReporteDinamicoCargoGrupo, this.gridBagConstraintsCargoGrupo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargoGrupo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargoGrupo.add(this.jComboBoxTiposArchivosReportesDinamicoCargoGrupo, this.gridBagConstraintsCargoGrupo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCargoGrupo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCargoGrupo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCargoGrupo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCargoGrupo.setToolTipText("Generar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargoGrupo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargoGrupo.add(this.jButtonGenerarReporteDinamicoCargoGrupo, this.gridBagConstraintsCargoGrupo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCargoGrupo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCargoGrupo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCargoGrupo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCargoGrupo.setToolTipText("Cancelar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargoGrupo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargoGrupo.add(this.jButtonCerrarReporteDinamicoCargoGrupo, this.gridBagConstraintsCargoGrupo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCargoGrupo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCargoGrupo= new JScrollPane(jPanelReporteDinamicoCargoGrupo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCargoGrupo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCargoGrupo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCargoGrupo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargo Grupos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCargoGrupo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCargoGrupo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCargoGrupo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCargoGrupo);
		this.jInternalFrameReporteDinamicoCargoGrupo.getContentPane().add(this.jScrollPanelReporteDinamicoCargoGrupo, this.gridBagConstraintsCargoGrupo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCargoGrupo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCargoGrupo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCargoGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCargoGrupo.setName("jPanelImportacionCargoGrupo"); 
		
		this.jPanelImportacionCargoGrupo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCargoGrupo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCargoGrupo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCargoGrupo.setLayout(gridaBagLayoutImportacionCargoGrupo);
		
		
		this.jInternalFrameImportacionCargoGrupo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCargoGrupo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCargoGrupo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCargoGrupo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCargoGrupo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCargoGrupo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCargoGrupo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCargoGrupo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCargoGrupo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCargoGrupo.setResizable(true);
	    this.jInternalFrameImportacionCargoGrupo.setClosable(true);
	    this.jInternalFrameImportacionCargoGrupo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCargoGrupo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCargoGrupo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCargoGrupo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCargoGrupo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCargoGrupo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCargoGrupo.setResizable(true);
	    this.jInternalFrameImportacionCargoGrupo.setClosable(true);
	    this.jInternalFrameImportacionCargoGrupo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCargoGrupo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCargoGrupo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCargoGrupo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargo Grupos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCargoGrupo = new JLabelMe();

		this.jLabelArchivoImportacionCargoGrupo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYImportacion;		
		this.gridBagConstraintsCargoGrupo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCargoGrupo.add(this.jLabelArchivoImportacionCargoGrupo, this.gridBagConstraintsCargoGrupo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCargoGrupo = new JFileChooser();		
		this.jFileChooserImportacionCargoGrupo.setToolTipText("ESCOGER ARCHIVO"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCargoGrupo = new JButtonMe();
		this.jButtonAbrirImportacionCargoGrupo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCargoGrupo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCargoGrupo.setToolTipText("Generar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYImportacion;
		this.gridBagConstraintsCargoGrupo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargoGrupo.add(this.jButtonAbrirImportacionCargoGrupo, this.gridBagConstraintsCargoGrupo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCargoGrupo = new JLabelMe();

		this.jLabelPathArchivoImportacionCargoGrupo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCargoGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCargoGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCargoGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYImportacion;		
		this.gridBagConstraintsCargoGrupo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCargoGrupo.add(this.jLabelPathArchivoImportacionCargoGrupo, this.gridBagConstraintsCargoGrupo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCargoGrupo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCargoGrupo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCargoGrupo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCargoGrupo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYImportacion;
		this.gridBagConstraintsCargoGrupo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargoGrupo.add(this.jTextFieldPathArchivoImportacionCargoGrupo, this.gridBagConstraintsCargoGrupo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCargoGrupo = new JButtonMe();
		this.jButtonGenerarImportacionCargoGrupo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCargoGrupo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCargoGrupo.setToolTipText("Generar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYImportacion;
		this.gridBagConstraintsCargoGrupo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargoGrupo.add(this.jButtonGenerarImportacionCargoGrupo, this.gridBagConstraintsCargoGrupo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCargoGrupo = new JButtonMe();
		this.jButtonCerrarImportacionCargoGrupo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCargoGrupo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCargoGrupo.setToolTipText("Cancelar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoGrupo.gridy = iPosYImportacion;
		this.gridBagConstraintsCargoGrupo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargoGrupo.add(this.jButtonCerrarImportacionCargoGrupo, this.gridBagConstraintsCargoGrupo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCargoGrupo = new GridBagLayout();
		
		this.jScrollPanelImportacionCargoGrupo= new JScrollPane(jPanelImportacionCargoGrupo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
		this.gridBagConstraintsCargoGrupo.gridy =iPosYImportacion;
		this.gridBagConstraintsCargoGrupo.gridx =iPosXImportacion;
		this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCargoGrupo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCargoGrupo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCargoGrupo);
		this.jInternalFrameImportacionCargoGrupo.getContentPane().add(this.jScrollPanelImportacionCargoGrupo, this.gridBagConstraintsCargoGrupo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCargoGrupo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCargoGrupo = new JButtonMe();
			this.jButtonAbrirOrderByCargoGrupo.setText("Orden");
			this.jButtonAbrirOrderByCargoGrupo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCargoGrupo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCargoGrupo";
			inputMap = this.jButtonAbrirOrderByCargoGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCargoGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCargoGrupo"));
		
		
			GridBagLayout gridaBagLayoutOrderByCargoGrupo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCargoGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCargoGrupo.setName("jPanelOrderByCargoGrupo"); 
			
			this.jPanelOrderByCargoGrupo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCargoGrupo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCargoGrupo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCargoGrupo.setLayout(gridaBagLayoutOrderByCargoGrupo);
			
			
			this.jTableDatosCargoGrupoOrderBy = new JTableMe();        
			this.jTableDatosCargoGrupoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCargoGrupoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCargoGrupoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCargoGrupoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCargoGrupoOrderBy.setViewportView(this.jTableDatosCargoGrupoOrderBy);
			this.jTableDatosCargoGrupoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCargoGrupoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCargoGrupo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCargoGrupo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCargoGrupo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCargoGrupo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCargoGrupo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCargoGrupo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCargoGrupo.setTitle("Orden");
			this.jInternalFrameOrderByCargoGrupo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCargoGrupo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCargoGrupo.setResizable(true);
			this.jInternalFrameOrderByCargoGrupo.setClosable(true);
			this.jInternalFrameOrderByCargoGrupo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCargoGrupo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCargoGrupo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCargoGrupo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCargoGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargo Grupos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCargoGrupo.gridx =iPosXOrderBy;
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCargoGrupo.ipady =150;
				
			this.jPanelOrderByCargoGrupo.add(jScrollPanelDatosCargoGrupoOrderBy, this.gridBagConstraintsCargoGrupo);//this.jTableDatosCargoGrupoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCargoGrupo = new JButtonMe();
			this.jButtonCerrarOrderByCargoGrupo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCargoGrupo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCargoGrupo.setToolTipText("Cancelar"+" "+CargoGrupoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCargoGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoGrupo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCargoGrupo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCargoGrupo.add(this.jButtonCerrarOrderByCargoGrupo, this.gridBagConstraintsCargoGrupo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCargoGrupo = new GridBagLayout();
			
			this.jScrollPanelOrderByCargoGrupo= new JScrollPane(jPanelOrderByCargoGrupo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCargoGrupo = new GridBagConstraints();
			this.gridBagConstraintsCargoGrupo.gridy =iPosYOrderBy;
			this.gridBagConstraintsCargoGrupo.gridx =iPosXOrderBy;
			this.gridBagConstraintsCargoGrupo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCargoGrupo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCargoGrupo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCargoGrupo);
			
			this.jInternalFrameOrderByCargoGrupo.getContentPane().add(this.jScrollPanelOrderByCargoGrupo, this.gridBagConstraintsCargoGrupo);			
		
		} else {
			this.jButtonAbrirOrderByCargoGrupo = new JButtonMe();
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
			&& this.cargogrupoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCargoGrupo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCargoGrupo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCargoGrupo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCargoGrupo.getRowHeight();//CargoGrupoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CargoGrupoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCargoGrupo.isSelected()) {
					iHeightTable=CargoGrupoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CargoGrupoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CargoGrupoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CargoGrupoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCargoGrupo.isSelected()) {
					iHeightTable=CargoGrupoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CargoGrupoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CargoGrupoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCargoGrupo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCargoGrupo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCargoGrupo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCargoGrupo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCargoGrupo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCargoGrupo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCargoGrupo!=null && this.jInternalFrameOrderByCargoGrupo.getjTableDatosOrderBy()!=null) {
			//if(!this.cargogrupoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCargoGrupo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCargoGrupo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCargoGrupo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCargoGrupo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCargoGrupo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCargoGrupo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCargoGrupo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCargoGrupo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCargoGrupo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCargoGrupo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cargogrupoLogic.getCargoGrupos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cargogrupos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CargoGrupo> TraerCargoGrupoBeans(List<CargoGrupo> cargogrupos,ArrayList<Classe> classes)throws Exception {
		try {
			for(CargoGrupo cargogrupo:cargogrupos) {
					
				if(!(CargoGrupoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CargoGrupoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cargogrupo.setsDetalleGeneralEntityReporte(CargoGrupoConstantesFunciones.getCargoGrupoDescripcion(cargogrupo));
										
						
					
					

					if(cargogrupo.getCargos()!=null && Funciones.existeClass(classes,Cargo.class)) {
						try{cargogrupo.setcargosDescripcionReporte(new JRBeanCollectionDataSource(CargoJInternalFrame.TraerCargoBeans(cargogrupo.getCargos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//cargogrupo.setsDetalleGeneralEntityReporte(cargogrupo.getsDetalleGeneralEntityReporte());
										
				}
				
				//cargogrupobeans.add(cargogrupobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cargogrupos;
    }
	//PARA REPORTES FIN
}
