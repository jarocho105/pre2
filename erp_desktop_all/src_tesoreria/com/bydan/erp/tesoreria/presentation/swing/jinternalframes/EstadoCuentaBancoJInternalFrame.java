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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.EstadoCuentaBancoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class EstadoCuentaBancoJInternalFrame extends EstadoCuentaBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoCuentaBanco;
	
	protected JMenuBar jmenuBarEstadoCuentaBanco;
	
	protected JMenu jmenuEstadoCuentaBanco;
	protected JMenu jmenuDatosEstadoCuentaBanco;
	protected JMenu jmenuArchivoEstadoCuentaBanco;
	protected JMenu jmenuAccionesEstadoCuentaBanco;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoCuentaBanco;	
	protected GridBagConstraints gridBagConstraintsEstadoCuentaBanco;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoCuentaBancoDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoCuentaBanco;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoCuentaBanco;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoCuentaBanco;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoCuentaBancoSessionBean estadocuentabancoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoCuentaBanco> estadocuentabancos;		
	public List<EstadoCuentaBanco> estadocuentabancosEliminados;	
	public List<EstadoCuentaBanco> estadocuentabancosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoCuentaBanco;		
	protected JButton jButtonAbrirOrderByEstadoCuentaBanco;
	
	
	//protected JPanel jPanelOrderByEstadoCuentaBanco;
	//public JScrollPane jScrollPanelOrderByEstadoCuentaBanco;	
	//protected JButton jButtonCerrarOrderByEstadoCuentaBanco;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoCuentaBancoLogic estadocuentabancoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoCuentaBanco;
	public JScrollPane jScrollPanelDatosEdicionEstadoCuentaBanco;
	public JScrollPane jScrollPanelDatosGeneralEstadoCuentaBanco;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoCuentaBancoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoCuentaBanco;
	//public JScrollPane jScrollPanelImportacionEstadoCuentaBanco;
	
	
	
	protected JPanel jPanelAccionesEstadoCuentaBanco;
	
    protected JPanel jPanelPaginacionEstadoCuentaBanco;
    protected JPanel jPanelParametrosReportesEstadoCuentaBanco;
	protected JPanel jPanelParametrosReportesAccionesEstadoCuentaBanco;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoCuentaBanco;
	protected JPanel jPanelParametrosAuxiliar2EstadoCuentaBanco;
	protected JPanel jPanelParametrosAuxiliar3EstadoCuentaBanco;
	protected JPanel jPanelParametrosAuxiliar4EstadoCuentaBanco;
	//protected JPanel jPanelParametrosAuxiliar5EstadoCuentaBanco;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoCuentaBanco;
	//protected JPanel jPanelImportacionEstadoCuentaBanco;
	
	
	public JTable jTableDatosEstadoCuentaBanco;
	
	
	
	//public JTable jTableDatosEstadoCuentaBancoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoCuentaBanco;
	protected JButton jButtonDuplicarEstadoCuentaBanco;
	protected JButton jButtonCopiarEstadoCuentaBanco;
	protected JButton jButtonVerFormEstadoCuentaBanco;
	protected JButton jButtonNuevoRelacionesEstadoCuentaBanco;
	protected JButton jButtonModificarEstadoCuentaBanco;
	
    protected JButton jButtonGuardarCambiosTablaEstadoCuentaBanco;
	protected JButton jButtonCerrarEstadoCuentaBanco;
	
	
	protected JButton jButtonRecargarInformacionEstadoCuentaBanco;
	protected JButton jButtonProcesarInformacionEstadoCuentaBanco;
	
	
	protected JButton jButtonAnterioresEstadoCuentaBanco;
	protected JButton jButtonSiguientesEstadoCuentaBanco;
	protected JButton jButtonNuevoGuardarCambiosEstadoCuentaBanco;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoCuentaBanco;
	//protected JButton jButtonCerrarReporteDinamicoEstadoCuentaBanco;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoCuentaBanco;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoCuentaBanco;
	//protected JButton jButtonGenerarImportacionEstadoCuentaBanco;
	//protected JButton jButtonCerrarImportacionEstadoCuentaBanco;
	//protected JFileChooser jFileChooserImportacionEstadoCuentaBanco;
	//protected File fileImportacionEstadoCuentaBanco;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoCuentaBanco;
	protected JButton jButtonDuplicarToolBarEstadoCuentaBanco;
	protected JButton jButtonNuevoRelacionesToolBarEstadoCuentaBanco;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoCuentaBanco;
	protected JButton jButtonCopiarToolBarEstadoCuentaBanco;
	protected JButton jButtonVerFormToolBarEstadoCuentaBanco;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoCuentaBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoCuentaBanco;
	protected JButton jButtonCerrarToolBarEstadoCuentaBanco;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoCuentaBanco;
	protected JButton jButtonProcesarInformacionToolBarEstadoCuentaBanco;
	protected JButton jButtonAnterioresToolBarEstadoCuentaBanco;
	protected JButton jButtonSiguientesToolBarEstadoCuentaBanco;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoCuentaBanco;
	protected JButton jButtonAbrirOrderByToolBarEstadoCuentaBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoCuentaBanco;
	protected JMenuItem jMenuItemDuplicarEstadoCuentaBanco;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoCuentaBanco;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoCuentaBanco;
	protected JMenuItem jMenuItemCopiarEstadoCuentaBanco;
	protected JMenuItem jMenuItemVerFormEstadoCuentaBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoCuentaBanco;
	protected JMenuItem jMenuItemCerrarEstadoCuentaBanco;
	protected JMenuItem jMenuItemDetalleCerrarEstadoCuentaBanco;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoCuentaBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoCuentaBanco;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoCuentaBanco;
	protected JMenuItem jMenuItemProcesarInformacionEstadoCuentaBanco;
	protected JMenuItem jMenuItemAnterioresEstadoCuentaBanco;
	protected JMenuItem jMenuItemSiguientesEstadoCuentaBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoCuentaBanco;
	protected JMenuItem jMenuItemAbrirOrderByEstadoCuentaBanco;
	protected JMenuItem jMenuItemMostrarOcultarEstadoCuentaBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoCuentaBanco;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoCuentaBanco;
	protected JCheckBox jCheckBoxSeleccionadosEstadoCuentaBanco;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoCuentaBanco;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoCuentaBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoCuentaBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoCuentaBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoCuentaBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoCuentaBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoCuentaBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoCuentaBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoCuentaBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoCuentaBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoCuentaBanco;
	protected JTextField jTextFieldValorCampoGeneralEstadoCuentaBanco;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoCuentaBanco;
	//public JList<Reporte> jListColumnasSelectReporteEstadoCuentaBanco;
	//public JScrollPane jScrollColumnasSelectReporteEstadoCuentaBanco;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoCuentaBanco;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoCuentaBanco;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoCuentaBanco;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoCuentaBanco;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoCuentaBanco;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoCuentaBanco;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoCuentaBanco;
	
		
	//public JLabel jLabelArchivoImportacionEstadoCuentaBanco;	
	//public JLabel jLabelPathArchivoImportacionEstadoCuentaBanco;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoCuentaBanco;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoCuentaBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoCuentaBanco;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoCuentaBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoCuentaBanco;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoCuentaBanco;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoCuentaBanco;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoCuentaBanco;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoCuentaBanco;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoCuentaBanco;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EstadoCuentaBancoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCuentaBancoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCuentaBancoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCuentaBancoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoCuentaBanco)	{
		this.jButtonRecargarInformacionEstadoCuentaBanco = jButtonRecargarInformacionEstadoCuentaBanco;
	}
	
	public JButton getjButtonProcesarInformacionEstadoCuentaBanco() {
		return this.jButtonProcesarInformacionEstadoCuentaBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoCuentaBanco)	{
		this.jButtonProcesarInformacionEstadoCuentaBanco = jButtonProcesarInformacionEstadoCuentaBanco;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoCuentaBanco() {
		return this.jButtonRecargarInformacionEstadoCuentaBanco;
	}
	
	
	public List<EstadoCuentaBanco> getestadocuentabancos() {
		return this.estadocuentabancos;
	}

	public void setestadocuentabancos(List<EstadoCuentaBanco> estadocuentabancos) {
		this.estadocuentabancos = estadocuentabancos;
	}
	
	public List<EstadoCuentaBanco> getestadocuentabancosAux() {
		return this.estadocuentabancosAux;
	}

	public void setestadocuentabancosAux(List<EstadoCuentaBanco> estadocuentabancosAux) {
		this.estadocuentabancosAux = estadocuentabancosAux;
	}
	
	public List<EstadoCuentaBanco> getestadocuentabancosEliminados() {
		return this.estadocuentabancosEliminados;
	}

	public void setEstadoCuentaBancosEliminados(List<EstadoCuentaBanco> estadocuentabancosEliminados) {
		this.estadocuentabancosEliminados = estadocuentabancosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoCuentaBanco() {
		return jComboBoxTiposSeleccionarEstadoCuentaBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoCuentaBanco(
			JComboBox jComboBoxTiposSeleccionarEstadoCuentaBanco) {
		this.jComboBoxTiposSeleccionarEstadoCuentaBanco = jComboBoxTiposSeleccionarEstadoCuentaBanco;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoCuentaBanco .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoCuentaBanco() {
		return jTextFieldValorCampoGeneralEstadoCuentaBanco;
	}

	public void setjTextFieldValorCampoGeneralEstadoCuentaBanco(
			JTextField jTextFieldValorCampoGeneralEstadoCuentaBanco) {
		this.jTextFieldValorCampoGeneralEstadoCuentaBanco = jTextFieldValorCampoGeneralEstadoCuentaBanco;
	}

	public void setBorderResaltarValorCampoGeneralEstadoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuentaBanco.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoCuentaBanco .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoCuentaBanco() {
		return this.jCheckBoxSeleccionarTodosEstadoCuentaBanco;
	}

	public void setjCheckBoxSeleccionarTodosEstadoCuentaBanco(
			JCheckBox jCheckBoxSeleccionarTodosEstadoCuentaBanco) {
		this.jCheckBoxSeleccionarTodosEstadoCuentaBanco = jCheckBoxSeleccionarTodosEstadoCuentaBanco;
	}

	public void setBorderResaltarSeleccionarTodosEstadoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuentaBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoCuentaBanco .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoCuentaBanco() {
		return this.jCheckBoxSeleccionadosEstadoCuentaBanco;
	}

	public void setjCheckBoxSeleccionadosEstadoCuentaBanco(
			JCheckBox jCheckBoxSeleccionadosEstadoCuentaBanco) {
		this.jCheckBoxSeleccionadosEstadoCuentaBanco = jCheckBoxSeleccionadosEstadoCuentaBanco;
	}
	
	public void setBorderResaltarSeleccionadosEstadoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuentaBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoCuentaBanco .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoCuentaBanco() {
		return this.jComboBoxTiposArchivosReportesEstadoCuentaBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoCuentaBanco(
			JComboBox jComboBoxTiposArchivosReportesEstadoCuentaBanco) {
		this.jComboBoxTiposArchivosReportesEstadoCuentaBanco = jComboBoxTiposArchivosReportesEstadoCuentaBanco;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoCuentaBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoCuentaBanco() {
		return this.jComboBoxTiposReportesEstadoCuentaBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoCuentaBanco(
			JComboBox jComboBoxTiposReportesEstadoCuentaBanco) {
		this.jComboBoxTiposReportesEstadoCuentaBanco = jComboBoxTiposReportesEstadoCuentaBanco;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoCuentaBanco() {
	//	return jComboBoxTiposReportesDinamicoEstadoCuentaBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoCuentaBanco(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoCuentaBanco) {
	//	this.jComboBoxTiposReportesDinamicoEstadoCuentaBanco = jComboBoxTiposReportesDinamicoEstadoCuentaBanco;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoCuentaBanco() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoCuentaBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoCuentaBanco(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoCuentaBanco) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoCuentaBanco = jComboBoxTiposArchivosReportesDinamicoEstadoCuentaBanco;
	//}
	
	public void setBorderResaltarTiposReportesEstadoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoCuentaBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoCuentaBanco() {
		return this.jComboBoxTiposGraficosReportesEstadoCuentaBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoCuentaBanco(
			JComboBox jComboBoxTiposGraficosReportesEstadoCuentaBanco) {
		this.jComboBoxTiposGraficosReportesEstadoCuentaBanco = jComboBoxTiposGraficosReportesEstadoCuentaBanco;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoCuentaBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoCuentaBanco() {
		return this.jComboBoxTiposPaginacionEstadoCuentaBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoCuentaBanco(
			JComboBox jComboBoxTiposPaginacionEstadoCuentaBanco) {
		this.jComboBoxTiposPaginacionEstadoCuentaBanco = jComboBoxTiposPaginacionEstadoCuentaBanco;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoCuentaBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoCuentaBanco() {
		return this.jComboBoxTiposRelacionesEstadoCuentaBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoCuentaBanco() {
		return this.jComboBoxTiposAccionesEstadoCuentaBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoCuentaBanco(
			JComboBox jComboBoxTiposRelacionesEstadoCuentaBanco) {
		this.jComboBoxTiposRelacionesEstadoCuentaBanco = jComboBoxTiposRelacionesEstadoCuentaBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoCuentaBanco(
			JComboBox jComboBoxTiposAccionesEstadoCuentaBanco) {
		this.jComboBoxTiposAccionesEstadoCuentaBanco = jComboBoxTiposAccionesEstadoCuentaBanco;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoCuentaBanco .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoCuentaBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCuentaBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoCuentaBanco .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoCuentaBanco() {
	//	return jCheckBoxConGraficoDinamicoEstadoCuentaBanco;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoCuentaBanco(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoCuentaBanco) {
	//	this.jCheckBoxConGraficoDinamicoEstadoCuentaBanco = jCheckBoxConGraficoDinamicoEstadoCuentaBanco;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoCuentaBanco() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoCuentaBanco.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoCuentaBanco .setBorder(borderResaltar);		
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
		this.estadocuentabancoSessionBean=new EstadoCuentaBancoSessionBean();
		
		this.estadocuentabancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadocuentabancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadocuentabancoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoCuentaBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Cuenta Banco MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoCuentaBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoCuentaBanco= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoCuentaBanco,this.jTtoolBarEstadoCuentaBanco,
							"nuevo","nuevo","Nuevo"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoCuentaBanco,this.jTtoolBarEstadoCuentaBanco,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoCuentaBanco,this.jTtoolBarEstadoCuentaBanco,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoCuentaBanco,this.jTtoolBarEstadoCuentaBanco,
							"duplicar","duplicar","Duplicar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoCuentaBanco,this.jTtoolBarEstadoCuentaBanco,
							"copiar","copiar","Copiar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoCuentaBanco,this.jTtoolBarEstadoCuentaBanco,
							"ver_form","ver_form","Ver"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoCuentaBanco,this.jTtoolBarEstadoCuentaBanco,
							"recargar","recargar","Recargar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoCuentaBanco,this.jTtoolBarEstadoCuentaBanco,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoCuentaBanco,this.jTtoolBarEstadoCuentaBanco,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoCuentaBanco,this.jTtoolBarEstadoCuentaBanco,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoCuentaBanco,this.jTtoolBarEstadoCuentaBanco,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoCuentaBanco,this.jTtoolBarEstadoCuentaBanco,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoCuentaBanco,this.jTtoolBarEstadoCuentaBanco,
							"cerrar","cerrar","Salir"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoCuentaBanco=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoCuentaBanco;
			
				this.jButtonProcesarInformacionToolBarEstadoCuentaBanco=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoCuentaBanco;
				
		//protected JButton jButtonModificarToolBarEstadoCuentaBanco;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoCuentaBanco=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoCuentaBanco=new JMenuMe("General");
		this.jmenuArchivoEstadoCuentaBanco=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoCuentaBanco=new JMenuMe("Acciones");
		this.jmenuDatosEstadoCuentaBanco=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoCuentaBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoCuentaBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoCuentaBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoCuentaBanco= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoCuentaBanco.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoCuentaBanco,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoCuentaBanco= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoCuentaBanco.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoCuentaBanco,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoCuentaBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoCuentaBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoCuentaBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoCuentaBanco= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoCuentaBanco.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoCuentaBanco,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoCuentaBanco= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoCuentaBanco.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoCuentaBanco,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoCuentaBanco= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoCuentaBanco.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoCuentaBanco,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoCuentaBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoCuentaBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoCuentaBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoCuentaBanco= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoCuentaBanco.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoCuentaBanco,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoCuentaBanco= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoCuentaBanco.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoCuentaBanco,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoCuentaBanco= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoCuentaBanco.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoCuentaBanco,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoCuentaBanco= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoCuentaBanco.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoCuentaBanco,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoCuentaBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoCuentaBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoCuentaBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoCuentaBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoCuentaBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoCuentaBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoCuentaBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoCuentaBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoCuentaBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoCuentaBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoCuentaBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoCuentaBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoCuentaBanco= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoCuentaBanco.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoCuentaBanco,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoCuentaBanco.add(this.jMenuItemCerrarEstadoCuentaBanco);
			
			this.jmenuAccionesEstadoCuentaBanco.add(this.jMenuItemNuevoEstadoCuentaBanco);
			this.jmenuAccionesEstadoCuentaBanco.add(this.jMenuItemNuevoGuardarCambiosEstadoCuentaBanco);
			this.jmenuAccionesEstadoCuentaBanco.add(this.jMenuItemNuevoRelacionesEstadoCuentaBanco);
			this.jmenuAccionesEstadoCuentaBanco.add(this.jMenuItemGuardarCambiosTablaEstadoCuentaBanco);		
			this.jmenuAccionesEstadoCuentaBanco.add(this.jMenuItemDuplicarEstadoCuentaBanco);		
			this.jmenuAccionesEstadoCuentaBanco.add(this.jMenuItemCopiarEstadoCuentaBanco);		
			this.jmenuAccionesEstadoCuentaBanco.add(this.jMenuItemVerFormEstadoCuentaBanco);		
			
			this.jmenuDatosEstadoCuentaBanco.add(this.jMenuItemRecargarInformacionEstadoCuentaBanco);				
			this.jmenuDatosEstadoCuentaBanco.add(this.jMenuItemAnterioresEstadoCuentaBanco);				
			this.jmenuDatosEstadoCuentaBanco.add(this.jMenuItemSiguientesEstadoCuentaBanco);				
			this.jmenuDatosEstadoCuentaBanco.add(this.jMenuItemAbrirOrderByEstadoCuentaBanco);				
			this.jmenuDatosEstadoCuentaBanco.add(this.jMenuItemMostrarOcultarEstadoCuentaBanco);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoCuentaBanco.add(this.jMenuItemGuardarCambiosEstadoCuentaBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoCuentaBanco.add(this.jmenuArchivoEstadoCuentaBanco);		
			this.jmenuBarEstadoCuentaBanco.add(this.jmenuAccionesEstadoCuentaBanco);		
			this.jmenuBarEstadoCuentaBanco.add(this.jmenuDatosEstadoCuentaBanco);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoCuentaBanco);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoCuentaBanco() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleEstadoCuentaBanco = new EstadoCuentaBancoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Cuenta Banco DATOS");
			this.jInternalFrameDetalleFormEstadoCuentaBanco = new EstadoCuentaBancoDetalleFormJInternalFrame(jDesktopPane,this.estadocuentabancoSessionBean.getConGuardarRelaciones(),this.estadocuentabancoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoCuentaBanco = null;//new EstadoCuentaBancoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoCuentaBanco= new GridBagLayout();
		
		
		this.jTableDatosEstadoCuentaBanco = new JTableMe();      
		
		String sToolTipEstadoCuentaBanco="";
		sToolTipEstadoCuentaBanco=EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoCuentaBanco+="(Tesoreria.EstadoCuentaBanco)";
		}
		
		if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoCuentaBanco+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoCuentaBanco.setToolTipText(sToolTipEstadoCuentaBanco);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoCuentaBanco);
		this.jTableDatosEstadoCuentaBanco.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoCuentaBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoCuentaBanco.setRowSelectionAllowed(true);
		this.jTableDatosEstadoCuentaBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoCuentaBanco,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoCuentaBanco = new JButtonMe();
		this.jButtonDuplicarEstadoCuentaBanco = new JButtonMe();
		this.jButtonCopiarEstadoCuentaBanco = new JButtonMe();
		this.jButtonVerFormEstadoCuentaBanco = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoCuentaBanco = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoCuentaBanco = new JButtonMe();
		this.jButtonCerrarEstadoCuentaBanco = new JButtonMe();
		
		this.jScrollPanelDatosEstadoCuentaBanco = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoCuentaBanco = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Cuenta Banco";
		
		if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Cuenta Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoCuentaBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoCuentaBanco.setToolTipText("Acciones");
        this.jPanelAccionesEstadoCuentaBanco.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoCuentaBanco=new ReporteDinamicoJInternalFrame(EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoCuentaBanco();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoCuentaBanco=new ImportacionJInternalFrame(EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoCuentaBanco();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoCuentaBanco = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoCuentaBanco.setText("Orden");
		this.jButtonAbrirOrderByEstadoCuentaBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoCuentaBanco,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoCuentaBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCuentaBanco,false,this);
			
			//this.cargarOrderByEstadoCuentaBanco(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoCuentaBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCuentaBanco,true,this);
			
			//this.cargarOrderByEstadoCuentaBanco(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoCuentaBanco.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoCuentaBanco.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosEstadoCuentaBanco.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosEstadoCuentaBanco.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoCuentaBanco.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoCuentaBanco.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoCuentaBanco.setText("Nuevo");
		this.jButtonDuplicarEstadoCuentaBanco.setText("Duplicar");
		this.jButtonCopiarEstadoCuentaBanco.setText("Copiar");
		this.jButtonVerFormEstadoCuentaBanco.setText("Ver");
		this.jButtonNuevoRelacionesEstadoCuentaBanco.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoCuentaBanco.setText("Guardar");
		this.jButtonCerrarEstadoCuentaBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoCuentaBanco,"nuevo_button","Nuevo",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoCuentaBanco,"duplicar_button","Duplicar",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoCuentaBanco,"copiar_button","Copiar",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoCuentaBanco,"ver_form","Ver",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoCuentaBanco,"nuevorelaciones_button","Nuevo Rel",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoCuentaBanco,"guardarcambiostabla_button","Guardar",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoCuentaBanco,"cerrar_button","Salir",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoCuentaBanco.setToolTipText("Nuevo"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoCuentaBanco.setToolTipText("Duplicar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoCuentaBanco.setToolTipText("Copiar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoCuentaBanco.setToolTipText("Ver"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoCuentaBanco.setToolTipText("Nuevo Rel"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoCuentaBanco.setToolTipText("Guardar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoCuentaBanco.setToolTipText("Salir"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoCuentaBanco";
		inputMap = this.jButtonNuevoEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoCuentaBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoCuentaBanco"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoCuentaBanco";
		inputMap = this.jButtonDuplicarEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoCuentaBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoCuentaBanco"));
		
		//COPIAR
		sMapKey = "CopiarEstadoCuentaBanco";
		inputMap = this.jButtonCopiarEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoCuentaBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoCuentaBanco"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoCuentaBanco";
		inputMap = this.jButtonVerFormEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoCuentaBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoCuentaBanco"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoCuentaBanco";
		inputMap = this.jButtonNuevoRelacionesEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoCuentaBanco"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoCuentaBanco";
		inputMap = this.jButtonModificarEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoCuentaBanco"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoCuentaBanco";
		inputMap = this.jButtonCerrarEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoCuentaBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoCuentaBanco";
		inputMap = this.jButtonGuardarCambiosTablaEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoCuentaBanco"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoCuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoCuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoCuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoCuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoCuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoCuentaBanco.setName("jPanelParametrosReportesEstadoCuentaBanco"); 
		
		this.jPanelParametrosReportesAccionesEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoCuentaBanco.setName("jPanelParametrosReportesAccionesEstadoCuentaBanco"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoCuentaBanco = new JButtonMe();
		this.jButtonRecargarInformacionEstadoCuentaBanco.setText("Recargar");
		this.jButtonRecargarInformacionEstadoCuentaBanco.setToolTipText("Recargar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoCuentaBanco,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoCuentaBanco = new JButtonMe();
		this.jButtonProcesarInformacionEstadoCuentaBanco.setText("Procesar");
		this.jButtonProcesarInformacionEstadoCuentaBanco.setToolTipText("Procesar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoCuentaBanco.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoCuentaBanco.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoCuentaBanco.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoCuentaBanco.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoCuentaBanco.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoCuentaBanco.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoCuentaBanco.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoCuentaBanco.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoCuentaBanco.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoCuentaBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoCuentaBanco.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoCuentaBanco.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoCuentaBanco.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoCuentaBanco.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoCuentaBanco.setText("Accion");
		this.jComboBoxTiposAccionesEstadoCuentaBanco.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoCuentaBanco.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoCuentaBanco.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoCuentaBanco=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoCuentaBanco.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoCuentaBanco.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoCuentaBanco.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoCuentaBanco = new JLabelMe();
		
		this.jLabelAccionesEstadoCuentaBanco.setText("Acciones");		
		this.jLabelAccionesEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoCuentaBanco.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoCuentaBanco.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoCuentaBanco = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoCuentaBanco.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoCuentaBanco.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoCuentaBanco = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoCuentaBanco.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoCuentaBanco.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoCuentaBanco.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoCuentaBanco.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoCuentaBanco = new JButtonMe();
		//this.jButtonAnterioresEstadoCuentaBanco.setText("<<");
        this.jButtonAnterioresEstadoCuentaBanco.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoCuentaBanco,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoCuentaBanco = new JButtonMe();
		//this.jButtonSiguientesEstadoCuentaBanco.setText(">>");
        this.jButtonSiguientesEstadoCuentaBanco.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoCuentaBanco,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoCuentaBanco = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoCuentaBanco.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoCuentaBanco.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoCuentaBanco,"nuevoguardarcambios_button","Nue",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoCuentaBanco";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoCuentaBanco"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoCuentaBanco";
		inputMap = this.jButtonRecargarInformacionEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoCuentaBanco"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoCuentaBanco";
		inputMap = this.jButtonSiguientesEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoCuentaBanco"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoCuentaBanco";
		inputMap = this.jButtonAnterioresEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoCuentaBanco"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoCuentaBanco();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoCuentaBanco.setMinimumSize(new Dimension(this.getWidth(),EstadoCuentaBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoCuentaBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoCuentaBanco.setMaximumSize(new Dimension(this.getWidth(),EstadoCuentaBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoCuentaBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoCuentaBanco.setPreferredSize(new Dimension(this.getWidth(),EstadoCuentaBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoCuentaBancoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoCuentaBanco = new GridBagLayout();

			this.jPanelPaginacionEstadoCuentaBanco.setLayout(gridaBagLayoutPaginacionEstadoCuentaBanco);						
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoCuentaBanco.add(this.jButtonAnterioresEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
					
						
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
			
			this.jPanelPaginacionEstadoCuentaBanco.add(this.jButtonNuevoGuardarCambiosEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
						
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
			this.jPanelPaginacionEstadoCuentaBanco.add(this.jButtonSiguientesEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = 1;
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCuentaBanco.add(this.jButtonNuevoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
						
			
			
			if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
				this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoCuentaBanco.gridy = 1;
				this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoCuentaBanco.add(this.jButtonGuardarCambiosTablaEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
			}
			
			
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = 1;
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCuentaBanco.add(this.jButtonDuplicarEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = 1;
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCuentaBanco.add(this.jButtonCopiarEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = 1;
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCuentaBanco.add(this.jButtonVerFormEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = 1;
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoCuentaBanco.add(this.jButtonCerrarEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		
		
		
		this.jButtonRecargarInformacionEstadoCuentaBanco.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoCuentaBanco.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoCuentaBanco.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoCuentaBanco.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoCuentaBanco.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoCuentaBanco.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoCuentaBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoCuentaBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoCuentaBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoCuentaBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoCuentaBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoCuentaBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoCuentaBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoCuentaBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoCuentaBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoCuentaBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoCuentaBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoCuentaBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoCuentaBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCuentaBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCuentaBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoCuentaBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoCuentaBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoCuentaBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoCuentaBanco.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoCuentaBanco.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoCuentaBanco.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoCuentaBanco.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoCuentaBanco.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoCuentaBanco.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoCuentaBanco.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoCuentaBanco.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoCuentaBanco.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoCuentaBanco.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoCuentaBanco.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoCuentaBanco.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoCuentaBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoCuentaBanco = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoCuentaBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoCuentaBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoCuentaBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoCuentaBanco = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoCuentaBanco.setLayout(gridaBagParametrosReportesEstadoCuentaBanco);
			this.jPanelParametrosReportesAccionesEstadoCuentaBanco.setLayout(gridaBagParametrosReportesAccionesEstadoCuentaBanco);
			
			
			this.jPanelParametrosAuxiliar1EstadoCuentaBanco.setLayout(gridaBagParametrosAuxiliar1EstadoCuentaBanco);
			this.jPanelParametrosAuxiliar2EstadoCuentaBanco.setLayout(gridaBagParametrosAuxiliar2EstadoCuentaBanco);
			this.jPanelParametrosAuxiliar3EstadoCuentaBanco.setLayout(gridaBagParametrosAuxiliar3EstadoCuentaBanco);
			this.jPanelParametrosAuxiliar4EstadoCuentaBanco.setLayout(gridaBagParametrosAuxiliar4EstadoCuentaBanco);
			//this.jPanelParametrosAuxiliar5EstadoCuentaBanco.setLayout(gridaBagParametrosAuxiliar2EstadoCuentaBanco);			
			
			
			
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCuentaBanco.add(this.jButtonRecargarInformacionEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoCuentaBanco.add(this.jComboBoxTiposPaginacionEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoCuentaBanco.add(this.jCheckBoxConAltoMaximoTablaEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoCuentaBanco.add(this.jComboBoxTiposArchivosReportesEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCuentaBanco.add(this.jPanelParametrosAuxiliar1EstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCuentaBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoCuentaBanco.add(this.jComboBoxTiposReportesEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCuentaBanco.add(this.jPanelParametrosAuxiliar4EstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCuentaBanco.add(this.jComboBoxTiposReportesEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoCuentaBanco.add(this.jCheckBoxGenerarReporteEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCuentaBanco.add(this.jPanelParametrosAuxiliar2EstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCuentaBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoCuentaBanco.add(this.jLabelAccionesEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
				this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoCuentaBanco.add(this.jButtonAbrirOrderByEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCuentaBanco.add(this.jComboBoxTiposSeleccionarEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);			
			
			
			/*
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCuentaBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoCuentaBanco.add(this.jCheckBoxSeleccionarTodosEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCuentaBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoCuentaBanco.add(this.jCheckBoxSeleccionarTodosEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);															
				
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCuentaBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoCuentaBanco.add(this.jCheckBoxSeleccionadosEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCuentaBanco.add(this.jPanelParametrosAuxiliar3EstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCuentaBanco.add(this.jComboBoxTiposRelacionesEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
				
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCuentaBanco.add(this.jComboBoxTiposAccionesEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoCuentaBanco = new GridBagLayout();

			this.jScrollPanelDatosEstadoCuentaBanco.setLayout(gridaBagLayoutDatosEstadoCuentaBanco);
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
			this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
			
			this.jScrollPanelDatosEstadoCuentaBanco.add(this.jTableDatosEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoCuentaBanco.setViewportView(this.jTableDatosEstadoCuentaBanco);
		this.jTableDatosEstadoCuentaBanco.setFillsViewportHeight(true);
		this.jTableDatosEstadoCuentaBanco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoCuentaBanco= new GridBagLayout();
		this.jPanelAccionesEstadoCuentaBanco.setLayout(gridaBagLayoutAccionesEstadoCuentaBanco);
		
		
		/*	
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
		this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
			
		this.jPanelAccionesEstadoCuentaBanco.add(this.jButtonNuevoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoCuentaBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoCuentaBanco);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();						
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;		
			//this.gridBagConstraintsEstadoCuentaBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoCuentaBanco.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;		
		//this.gridBagConstraintsEstadoCuentaBanco.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoCuentaBanco.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoCuentaBanco);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);								
		
		
		/*
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		*/		
		
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoCuentaBanco.gridx =0;
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoCuentaBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
				
		
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EstadoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoCuentaBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoCuentaBanco = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoCuentaBanco.setLayout(gridaBagLayoutBusquedasParametrosEstadoCuentaBanco);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoCuentaBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoCuentaBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCuentaBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCuentaBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
			
			
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		
			
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoCuentaBanco;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoCuentaBanco() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoCuentaBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoCuentaBanco.setName("jPanelReporteDinamicoEstadoCuentaBanco"); 
		
		this.jPanelReporteDinamicoEstadoCuentaBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoCuentaBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoCuentaBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoCuentaBanco.setLayout(gridaBagLayoutReporteDinamicoEstadoCuentaBanco);
		
		
		this.jInternalFrameReporteDinamicoEstadoCuentaBanco= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoCuentaBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoCuentaBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoCuentaBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoCuentaBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoCuentaBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Cuenta Bancos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoCuentaBanco = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoCuentaBanco.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoCuentaBanco.add(this.jLabelColumnasSelectReporteEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoCuentaBanco = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoCuentaBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoCuentaBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoCuentaBanco.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoCuentaBanco.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoCuentaBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoCuentaBanco=new JScrollPane(this.jListColumnasSelectReporteEstadoCuentaBanco);
			
			this.jScrollColumnasSelectReporteEstadoCuentaBanco.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoCuentaBanco.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoCuentaBanco.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoCuentaBanco.add(this.jListColumnasSelectReporteEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		this.jPanelReporteDinamicoEstadoCuentaBanco.add(this.jScrollColumnasSelectReporteEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoCuentaBanco = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoCuentaBanco.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoCuentaBanco = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoCuentaBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoCuentaBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoCuentaBanco.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoCuentaBanco.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoCuentaBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoCuentaBanco=new JScrollPane(this.jListRelacionesSelectReporteEstadoCuentaBanco);
			
			this.jScrollRelacionesSelectReporteEstadoCuentaBanco.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoCuentaBanco.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoCuentaBanco.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEstadoCuentaBanco = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoCuentaBanco = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoCuentaBanco = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoCuentaBanco = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoCuentaBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoCuentaBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoCuentaBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoCuentaBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCuentaBanco = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCuentaBanco.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCuentaBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCuentaBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCuentaBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoCuentaBanco = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoCuentaBanco.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoCuentaBanco.add(this.jLabelGenerarExcelReporteDinamicoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoCuentaBanco = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoCuentaBanco.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoCuentaBanco,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoCuentaBanco.setToolTipText("Generar EXCEL"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoCuentaBanco.add(this.jButtonGenerarExcelReporteDinamicoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCuentaBanco.add(this.jComboBoxTiposReportesDinamicoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoCuentaBanco = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoCuentaBanco.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoCuentaBanco.add(this.jLabelTiposArchivoReporteDinamicoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCuentaBanco.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoCuentaBanco = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoCuentaBanco.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoCuentaBanco,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoCuentaBanco.setToolTipText("Generar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCuentaBanco.add(this.jButtonGenerarReporteDinamicoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoCuentaBanco = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoCuentaBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoCuentaBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoCuentaBanco.setToolTipText("Cancelar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCuentaBanco.add(this.jButtonCerrarReporteDinamicoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoCuentaBanco = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoCuentaBanco= new JScrollPane(jPanelReporteDinamicoEstadoCuentaBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoCuentaBanco.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoCuentaBanco.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoCuentaBanco.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Cuenta Bancos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCuentaBanco.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoCuentaBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoCuentaBanco);
		this.jInternalFrameReporteDinamicoEstadoCuentaBanco.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoCuentaBanco() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoCuentaBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoCuentaBanco.setName("jPanelImportacionEstadoCuentaBanco"); 
		
		this.jPanelImportacionEstadoCuentaBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoCuentaBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoCuentaBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoCuentaBanco.setLayout(gridaBagLayoutImportacionEstadoCuentaBanco);
		
		
		this.jInternalFrameImportacionEstadoCuentaBanco= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoCuentaBanco= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoCuentaBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoCuentaBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoCuentaBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoCuentaBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoCuentaBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoCuentaBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoCuentaBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoCuentaBanco.setResizable(true);
	    this.jInternalFrameImportacionEstadoCuentaBanco.setClosable(true);
	    this.jInternalFrameImportacionEstadoCuentaBanco.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoCuentaBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoCuentaBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoCuentaBanco.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoCuentaBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoCuentaBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoCuentaBanco.setResizable(true);
	    this.jInternalFrameImportacionEstadoCuentaBanco.setClosable(true);
	    this.jInternalFrameImportacionEstadoCuentaBanco.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoCuentaBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoCuentaBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoCuentaBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Cuenta Bancos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoCuentaBanco = new JLabelMe();

		this.jLabelArchivoImportacionEstadoCuentaBanco.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoCuentaBanco.add(this.jLabelArchivoImportacionEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoCuentaBanco = new JFileChooser();		
		this.jFileChooserImportacionEstadoCuentaBanco.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoCuentaBanco = new JButtonMe();
		this.jButtonAbrirImportacionEstadoCuentaBanco.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoCuentaBanco,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoCuentaBanco.setToolTipText("Generar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCuentaBanco.add(this.jButtonAbrirImportacionEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoCuentaBanco = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoCuentaBanco.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoCuentaBanco.add(this.jLabelPathArchivoImportacionEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoCuentaBanco=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoCuentaBanco.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoCuentaBanco.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoCuentaBanco.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCuentaBanco.add(this.jTextFieldPathArchivoImportacionEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoCuentaBanco = new JButtonMe();
		this.jButtonGenerarImportacionEstadoCuentaBanco.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoCuentaBanco,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoCuentaBanco.setToolTipText("Generar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCuentaBanco.add(this.jButtonGenerarImportacionEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoCuentaBanco = new JButtonMe();
		this.jButtonCerrarImportacionEstadoCuentaBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoCuentaBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoCuentaBanco.setToolTipText("Cancelar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCuentaBanco.add(this.jButtonCerrarImportacionEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoCuentaBanco = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoCuentaBanco= new JScrollPane(jPanelImportacionEstadoCuentaBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoCuentaBanco.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoCuentaBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoCuentaBanco.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoCuentaBanco);
		this.jInternalFrameImportacionEstadoCuentaBanco.getContentPane().add(this.jScrollPanelImportacionEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoCuentaBanco(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoCuentaBanco = new JButtonMe();
			this.jButtonAbrirOrderByEstadoCuentaBanco.setText("Orden");
			this.jButtonAbrirOrderByEstadoCuentaBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoCuentaBanco,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoCuentaBanco";
			inputMap = this.jButtonAbrirOrderByEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoCuentaBanco"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoCuentaBanco = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoCuentaBanco.setName("jPanelOrderByEstadoCuentaBanco"); 
			
			this.jPanelOrderByEstadoCuentaBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoCuentaBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoCuentaBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoCuentaBanco.setLayout(gridaBagLayoutOrderByEstadoCuentaBanco);
			
			
			this.jTableDatosEstadoCuentaBancoOrderBy = new JTableMe();        
			this.jTableDatosEstadoCuentaBancoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoCuentaBancoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoCuentaBancoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoCuentaBancoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoCuentaBancoOrderBy.setViewportView(this.jTableDatosEstadoCuentaBancoOrderBy);
			this.jTableDatosEstadoCuentaBancoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoCuentaBancoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoCuentaBanco= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoCuentaBanco= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoCuentaBanco = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoCuentaBanco= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoCuentaBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoCuentaBanco.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoCuentaBanco.setTitle("Orden");
			this.jInternalFrameOrderByEstadoCuentaBanco.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoCuentaBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoCuentaBanco.setResizable(true);
			this.jInternalFrameOrderByEstadoCuentaBanco.setClosable(true);
			this.jInternalFrameOrderByEstadoCuentaBanco.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoCuentaBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoCuentaBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoCuentaBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Cuenta Bancos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoCuentaBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoCuentaBanco.ipady =150;
				
			this.jPanelOrderByEstadoCuentaBanco.add(jScrollPanelDatosEstadoCuentaBancoOrderBy, this.gridBagConstraintsEstadoCuentaBanco);//this.jTableDatosEstadoCuentaBancoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoCuentaBanco = new JButtonMe();
			this.jButtonCerrarOrderByEstadoCuentaBanco.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoCuentaBanco,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoCuentaBanco.setToolTipText("Cancelar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoCuentaBanco.add(this.jButtonCerrarOrderByEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoCuentaBanco = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoCuentaBanco= new JScrollPane(jPanelOrderByEstadoCuentaBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoCuentaBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoCuentaBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoCuentaBanco.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoCuentaBanco);
			
			this.jInternalFrameOrderByEstadoCuentaBanco.getContentPane().add(this.jScrollPanelOrderByEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);			
		
		} else {
			this.jButtonAbrirOrderByEstadoCuentaBanco = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadocuentabancoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoCuentaBanco.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoCuentaBanco.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoCuentaBanco.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoCuentaBanco.getRowHeight();//EstadoCuentaBancoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoCuentaBanco.isSelected()) {
					iHeightTable=EstadoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoCuentaBanco.isSelected()) {
					iHeightTable=EstadoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoCuentaBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoCuentaBanco.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoCuentaBanco.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoCuentaBanco.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoCuentaBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoCuentaBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoCuentaBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoCuentaBanco!=null && this.jInternalFrameOrderByEstadoCuentaBanco.getjTableDatosOrderBy()!=null) {
			//if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoCuentaBanco.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoCuentaBanco.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoCuentaBanco.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoCuentaBanco.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoCuentaBanco.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoCuentaBanco.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoCuentaBanco.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoCuentaBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoCuentaBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoCuentaBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadocuentabancoLogic.getEstadoCuentaBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadocuentabancos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoCuentaBanco> TraerEstadoCuentaBancoBeans(List<EstadoCuentaBanco> estadocuentabancos,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoCuentaBanco estadocuentabanco:estadocuentabancos) {
					
				if(!(EstadoCuentaBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoCuentaBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadocuentabanco.setsDetalleGeneralEntityReporte(EstadoCuentaBancoConstantesFunciones.getEstadoCuentaBancoDescripcion(estadocuentabanco));
										
					estadocuentabanco.setes_defecto_descripcion(EstadoCuentaBancoConstantesFunciones.getes_defectoDescripcion(estadocuentabanco));	
					
						
					
				} else  {
							
					//estadocuentabanco.setsDetalleGeneralEntityReporte(estadocuentabanco.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadocuentabancobeans.add(estadocuentabancobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadocuentabancos;
    }
	//PARA REPORTES FIN
}
