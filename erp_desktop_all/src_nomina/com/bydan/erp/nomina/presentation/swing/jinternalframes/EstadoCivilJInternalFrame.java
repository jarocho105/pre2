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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

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
import com.bydan.erp.nomina.util.EstadoCivilConstantesFunciones;

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
public class EstadoCivilJInternalFrame extends EstadoCivilBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoCivil;
	
	protected JMenuBar jmenuBarEstadoCivil;
	
	protected JMenu jmenuEstadoCivil;
	protected JMenu jmenuDatosEstadoCivil;
	protected JMenu jmenuArchivoEstadoCivil;
	protected JMenu jmenuAccionesEstadoCivil;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoCivil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoCivil;	
	protected GridBagConstraints gridBagConstraintsEstadoCivil;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoCivilDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoCivil;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoCivil;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoCivil;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoCivilSessionBean estadocivilSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoCivil> estadocivils;		
	public List<EstadoCivil> estadocivilsEliminados;	
	public List<EstadoCivil> estadocivilsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoCivil;		
	protected JButton jButtonAbrirOrderByEstadoCivil;
	
	
	//protected JPanel jPanelOrderByEstadoCivil;
	//public JScrollPane jScrollPanelOrderByEstadoCivil;	
	//protected JButton jButtonCerrarOrderByEstadoCivil;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoCivilLogic estadocivilLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoCivil;
	public JScrollPane jScrollPanelDatosEdicionEstadoCivil;
	public JScrollPane jScrollPanelDatosGeneralEstadoCivil;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoCivilOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoCivil;
	//public JScrollPane jScrollPanelImportacionEstadoCivil;
	
	
	
	protected JPanel jPanelAccionesEstadoCivil;
	
    protected JPanel jPanelPaginacionEstadoCivil;
    protected JPanel jPanelParametrosReportesEstadoCivil;
	protected JPanel jPanelParametrosReportesAccionesEstadoCivil;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoCivil;
	protected JPanel jPanelParametrosAuxiliar2EstadoCivil;
	protected JPanel jPanelParametrosAuxiliar3EstadoCivil;
	protected JPanel jPanelParametrosAuxiliar4EstadoCivil;
	//protected JPanel jPanelParametrosAuxiliar5EstadoCivil;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoCivil;
	//protected JPanel jPanelImportacionEstadoCivil;
	
	
	public JTable jTableDatosEstadoCivil;
	
	
	
	//public JTable jTableDatosEstadoCivilOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoCivil;
	protected JButton jButtonDuplicarEstadoCivil;
	protected JButton jButtonCopiarEstadoCivil;
	protected JButton jButtonVerFormEstadoCivil;
	protected JButton jButtonNuevoRelacionesEstadoCivil;
	protected JButton jButtonModificarEstadoCivil;
	
    protected JButton jButtonGuardarCambiosTablaEstadoCivil;
	protected JButton jButtonCerrarEstadoCivil;
	
	
	protected JButton jButtonRecargarInformacionEstadoCivil;
	protected JButton jButtonProcesarInformacionEstadoCivil;
	
	
	protected JButton jButtonAnterioresEstadoCivil;
	protected JButton jButtonSiguientesEstadoCivil;
	protected JButton jButtonNuevoGuardarCambiosEstadoCivil;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoCivil;
	//protected JButton jButtonCerrarReporteDinamicoEstadoCivil;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoCivil;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoCivil;
	//protected JButton jButtonGenerarImportacionEstadoCivil;
	//protected JButton jButtonCerrarImportacionEstadoCivil;
	//protected JFileChooser jFileChooserImportacionEstadoCivil;
	//protected File fileImportacionEstadoCivil;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoCivil;
	protected JButton jButtonDuplicarToolBarEstadoCivil;
	protected JButton jButtonNuevoRelacionesToolBarEstadoCivil;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoCivil;
	protected JButton jButtonCopiarToolBarEstadoCivil;
	protected JButton jButtonVerFormToolBarEstadoCivil;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoCivil;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoCivil;
	protected JButton jButtonCerrarToolBarEstadoCivil;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoCivil;
	protected JButton jButtonProcesarInformacionToolBarEstadoCivil;
	protected JButton jButtonAnterioresToolBarEstadoCivil;
	protected JButton jButtonSiguientesToolBarEstadoCivil;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoCivil;
	protected JButton jButtonAbrirOrderByToolBarEstadoCivil;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoCivil;
	protected JMenuItem jMenuItemDuplicarEstadoCivil;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoCivil;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoCivil;
	protected JMenuItem jMenuItemCopiarEstadoCivil;
	protected JMenuItem jMenuItemVerFormEstadoCivil;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoCivil;
	protected JMenuItem jMenuItemCerrarEstadoCivil;
	protected JMenuItem jMenuItemDetalleCerrarEstadoCivil;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoCivil;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoCivil;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoCivil;
	protected JMenuItem jMenuItemProcesarInformacionEstadoCivil;
	protected JMenuItem jMenuItemAnterioresEstadoCivil;
	protected JMenuItem jMenuItemSiguientesEstadoCivil;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoCivil;
	protected JMenuItem jMenuItemAbrirOrderByEstadoCivil;
	protected JMenuItem jMenuItemMostrarOcultarEstadoCivil;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoCivil;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoCivil;
	protected JCheckBox jCheckBoxSeleccionadosEstadoCivil;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoCivil;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoCivil;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoCivil;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoCivil;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoCivil;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoCivil;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoCivil;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoCivil;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoCivil;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoCivil;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoCivil;
	protected JTextField jTextFieldValorCampoGeneralEstadoCivil;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoCivil;
	//public JList<Reporte> jListColumnasSelectReporteEstadoCivil;
	//public JScrollPane jScrollColumnasSelectReporteEstadoCivil;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoCivil;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoCivil;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoCivil;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoCivil;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoCivil;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoCivil;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoCivil;
	
		
	//public JLabel jLabelArchivoImportacionEstadoCivil;	
	//public JLabel jLabelPathArchivoImportacionEstadoCivil;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoCivil;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoCivil;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoCivil;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoCivil;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoCivil;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoCivil;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoCivil;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoCivil;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoCivil;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoCivil;	
	
	
	
	
	
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
	public EstadoCivilJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoCivil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCivilJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCivil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCivilJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCivil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCivilJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoCivil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoCivil)	{
		this.jButtonRecargarInformacionEstadoCivil = jButtonRecargarInformacionEstadoCivil;
	}
	
	public JButton getjButtonProcesarInformacionEstadoCivil() {
		return this.jButtonProcesarInformacionEstadoCivil;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoCivil)	{
		this.jButtonProcesarInformacionEstadoCivil = jButtonProcesarInformacionEstadoCivil;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoCivil() {
		return this.jButtonRecargarInformacionEstadoCivil;
	}
	
	
	public List<EstadoCivil> getestadocivils() {
		return this.estadocivils;
	}

	public void setestadocivils(List<EstadoCivil> estadocivils) {
		this.estadocivils = estadocivils;
	}
	
	public List<EstadoCivil> getestadocivilsAux() {
		return this.estadocivilsAux;
	}

	public void setestadocivilsAux(List<EstadoCivil> estadocivilsAux) {
		this.estadocivilsAux = estadocivilsAux;
	}
	
	public List<EstadoCivil> getestadocivilsEliminados() {
		return this.estadocivilsEliminados;
	}

	public void setEstadoCivilsEliminados(List<EstadoCivil> estadocivilsEliminados) {
		this.estadocivilsEliminados = estadocivilsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoCivil() {
		return jComboBoxTiposSeleccionarEstadoCivil;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoCivil(
			JComboBox jComboBoxTiposSeleccionarEstadoCivil) {
		this.jComboBoxTiposSeleccionarEstadoCivil = jComboBoxTiposSeleccionarEstadoCivil;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoCivil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoCivil.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoCivil .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoCivil() {
		return jTextFieldValorCampoGeneralEstadoCivil;
	}

	public void setjTextFieldValorCampoGeneralEstadoCivil(
			JTextField jTextFieldValorCampoGeneralEstadoCivil) {
		this.jTextFieldValorCampoGeneralEstadoCivil = jTextFieldValorCampoGeneralEstadoCivil;
	}

	public void setBorderResaltarValorCampoGeneralEstadoCivil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCivil.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoCivil .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoCivil() {
		return this.jCheckBoxSeleccionarTodosEstadoCivil;
	}

	public void setjCheckBoxSeleccionarTodosEstadoCivil(
			JCheckBox jCheckBoxSeleccionarTodosEstadoCivil) {
		this.jCheckBoxSeleccionarTodosEstadoCivil = jCheckBoxSeleccionarTodosEstadoCivil;
	}

	public void setBorderResaltarSeleccionarTodosEstadoCivil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCivil.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoCivil .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoCivil() {
		return this.jCheckBoxSeleccionadosEstadoCivil;
	}

	public void setjCheckBoxSeleccionadosEstadoCivil(
			JCheckBox jCheckBoxSeleccionadosEstadoCivil) {
		this.jCheckBoxSeleccionadosEstadoCivil = jCheckBoxSeleccionadosEstadoCivil;
	}
	
	public void setBorderResaltarSeleccionadosEstadoCivil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCivil.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoCivil .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoCivil() {
		return this.jComboBoxTiposArchivosReportesEstadoCivil;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoCivil(
			JComboBox jComboBoxTiposArchivosReportesEstadoCivil) {
		this.jComboBoxTiposArchivosReportesEstadoCivil = jComboBoxTiposArchivosReportesEstadoCivil;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoCivil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCivil.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoCivil .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoCivil() {
		return this.jComboBoxTiposReportesEstadoCivil;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoCivil(
			JComboBox jComboBoxTiposReportesEstadoCivil) {
		this.jComboBoxTiposReportesEstadoCivil = jComboBoxTiposReportesEstadoCivil;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoCivil() {
	//	return jComboBoxTiposReportesDinamicoEstadoCivil;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoCivil(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoCivil) {
	//	this.jComboBoxTiposReportesDinamicoEstadoCivil = jComboBoxTiposReportesDinamicoEstadoCivil;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoCivil() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoCivil;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoCivil(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoCivil) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoCivil = jComboBoxTiposArchivosReportesDinamicoEstadoCivil;
	//}
	
	public void setBorderResaltarTiposReportesEstadoCivil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCivil.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoCivil .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoCivil() {
		return this.jComboBoxTiposGraficosReportesEstadoCivil;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoCivil(
			JComboBox jComboBoxTiposGraficosReportesEstadoCivil) {
		this.jComboBoxTiposGraficosReportesEstadoCivil = jComboBoxTiposGraficosReportesEstadoCivil;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoCivil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCivil.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoCivil .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoCivil() {
		return this.jComboBoxTiposPaginacionEstadoCivil;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoCivil(
			JComboBox jComboBoxTiposPaginacionEstadoCivil) {
		this.jComboBoxTiposPaginacionEstadoCivil = jComboBoxTiposPaginacionEstadoCivil;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoCivil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCivil.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoCivil .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoCivil() {
		return this.jComboBoxTiposRelacionesEstadoCivil;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoCivil() {
		return this.jComboBoxTiposAccionesEstadoCivil;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoCivil(
			JComboBox jComboBoxTiposRelacionesEstadoCivil) {
		this.jComboBoxTiposRelacionesEstadoCivil = jComboBoxTiposRelacionesEstadoCivil;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoCivil(
			JComboBox jComboBoxTiposAccionesEstadoCivil) {
		this.jComboBoxTiposAccionesEstadoCivil = jComboBoxTiposAccionesEstadoCivil;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoCivil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCivil.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoCivil .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoCivil() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoCivil.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoCivil .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoCivil() {
	//	return jCheckBoxConGraficoDinamicoEstadoCivil;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoCivil(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoCivil) {
	//	this.jCheckBoxConGraficoDinamicoEstadoCivil = jCheckBoxConGraficoDinamicoEstadoCivil;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoCivil() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoCivil.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoCivil .setBorder(borderResaltar);		
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
		this.estadocivilSessionBean=new EstadoCivilSessionBean();
		
		this.estadocivilSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadocivilSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadocivilSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoCivilJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoCivilJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Civil MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoCivilJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoCivil No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoCivil= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoCivil,this.jTtoolBarEstadoCivil,
							"nuevo","nuevo","Nuevo"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoCivil,this.jTtoolBarEstadoCivil,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoCivil,this.jTtoolBarEstadoCivil,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoCivil,this.jTtoolBarEstadoCivil,
							"duplicar","duplicar","Duplicar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoCivil,this.jTtoolBarEstadoCivil,
							"copiar","copiar","Copiar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoCivil,this.jTtoolBarEstadoCivil,
							"ver_form","ver_form","Ver"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoCivil,this.jTtoolBarEstadoCivil,
							"recargar","recargar","Recargar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoCivil,this.jTtoolBarEstadoCivil,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoCivil,this.jTtoolBarEstadoCivil,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoCivil,this.jTtoolBarEstadoCivil,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoCivil,this.jTtoolBarEstadoCivil,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoCivil,this.jTtoolBarEstadoCivil,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoCivil=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoCivil,this.jTtoolBarEstadoCivil,
							"cerrar","cerrar","Salir"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoCivil=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoCivil;
			
				this.jButtonProcesarInformacionToolBarEstadoCivil=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoCivil;
				
		//protected JButton jButtonModificarToolBarEstadoCivil;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoCivil=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoCivil=new JMenuMe("General");
		this.jmenuArchivoEstadoCivil=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoCivil=new JMenuMe("Acciones");
		this.jmenuDatosEstadoCivil=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoCivil= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoCivil.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoCivil,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoCivil= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoCivil.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoCivil,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoCivil= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoCivil.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoCivil,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoCivil= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoCivil.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoCivil,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoCivil= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoCivil.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoCivil,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoCivil= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoCivil.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoCivil,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoCivil= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoCivil.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoCivil,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoCivil= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoCivil.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoCivil,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoCivil= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoCivil.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoCivil,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoCivil= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoCivil.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoCivil,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoCivil= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoCivil.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoCivil,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoCivil= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoCivil.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoCivil,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoCivil= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoCivil.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoCivil,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoCivil= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoCivil.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoCivil,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoCivil= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoCivil.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoCivil,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoCivil= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoCivil.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoCivil,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoCivil= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoCivil.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoCivil,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoCivil.add(this.jMenuItemCerrarEstadoCivil);
			
			this.jmenuAccionesEstadoCivil.add(this.jMenuItemNuevoEstadoCivil);
			this.jmenuAccionesEstadoCivil.add(this.jMenuItemNuevoGuardarCambiosEstadoCivil);
			this.jmenuAccionesEstadoCivil.add(this.jMenuItemNuevoRelacionesEstadoCivil);
			this.jmenuAccionesEstadoCivil.add(this.jMenuItemGuardarCambiosTablaEstadoCivil);		
			this.jmenuAccionesEstadoCivil.add(this.jMenuItemDuplicarEstadoCivil);		
			this.jmenuAccionesEstadoCivil.add(this.jMenuItemCopiarEstadoCivil);		
			this.jmenuAccionesEstadoCivil.add(this.jMenuItemVerFormEstadoCivil);		
			
			this.jmenuDatosEstadoCivil.add(this.jMenuItemRecargarInformacionEstadoCivil);				
			this.jmenuDatosEstadoCivil.add(this.jMenuItemAnterioresEstadoCivil);				
			this.jmenuDatosEstadoCivil.add(this.jMenuItemSiguientesEstadoCivil);				
			this.jmenuDatosEstadoCivil.add(this.jMenuItemAbrirOrderByEstadoCivil);				
			this.jmenuDatosEstadoCivil.add(this.jMenuItemMostrarOcultarEstadoCivil);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoCivil.add(this.jMenuItemGuardarCambiosEstadoCivil);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoCivil.add(this.jmenuArchivoEstadoCivil);		
			this.jmenuBarEstadoCivil.add(this.jmenuAccionesEstadoCivil);		
			this.jmenuBarEstadoCivil.add(this.jmenuDatosEstadoCivil);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoCivil);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoCivil() {
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
			//this.jInternalFrameDetalleEstadoCivil = new EstadoCivilDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Civil DATOS");
			this.jInternalFrameDetalleFormEstadoCivil = new EstadoCivilDetalleFormJInternalFrame(jDesktopPane,this.estadocivilSessionBean.getConGuardarRelaciones(),this.estadocivilSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoCivil = null;//new EstadoCivilDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoCivil= new GridBagLayout();
		
		
		this.jTableDatosEstadoCivil = new JTableMe();      
		
		String sToolTipEstadoCivil="";
		sToolTipEstadoCivil=EstadoCivilConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoCivil+="(Nomina.EstadoCivil)";
		}
		
		if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoCivil+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoCivil.setToolTipText(sToolTipEstadoCivil);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoCivil);
		this.jTableDatosEstadoCivil.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoCivil.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoCivil.setRowSelectionAllowed(true);
		this.jTableDatosEstadoCivil.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoCivil,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoCivil = new JButtonMe();
		this.jButtonDuplicarEstadoCivil = new JButtonMe();
		this.jButtonCopiarEstadoCivil = new JButtonMe();
		this.jButtonVerFormEstadoCivil = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoCivil = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoCivil = new JButtonMe();
		this.jButtonCerrarEstadoCivil = new JButtonMe();
		
		this.jScrollPanelDatosEstadoCivil = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoCivil = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoCivil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Civil";
		
		if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Civiles" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoCivil.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoCivil.setToolTipText("Acciones");
        this.jPanelAccionesEstadoCivil.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoCivil=new ReporteDinamicoJInternalFrame(EstadoCivilConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoCivil();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoCivil=new ImportacionJInternalFrame(EstadoCivilConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoCivil();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoCivil = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoCivil.setText("Orden");
		this.jButtonAbrirOrderByEstadoCivil.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoCivil,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoCivil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoCivil=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCivil,false,this);
			
			//this.cargarOrderByEstadoCivil(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoCivil=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoCivil,true,this);
			
			//this.cargarOrderByEstadoCivil(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoCivil.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoCivil.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoCivil.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoCivil.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoCivil.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoCivil.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoCivil.setText("Nuevo");
		this.jButtonDuplicarEstadoCivil.setText("Duplicar");
		this.jButtonCopiarEstadoCivil.setText("Copiar");
		this.jButtonVerFormEstadoCivil.setText("Ver");
		this.jButtonNuevoRelacionesEstadoCivil.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoCivil.setText("Guardar");
		this.jButtonCerrarEstadoCivil.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoCivil,"nuevo_button","Nuevo",this.estadocivilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoCivil,"duplicar_button","Duplicar",this.estadocivilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoCivil,"copiar_button","Copiar",this.estadocivilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoCivil,"ver_form","Ver",this.estadocivilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoCivil,"nuevorelaciones_button","Nuevo Rel",this.estadocivilSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoCivil,"guardarcambiostabla_button","Guardar",this.estadocivilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoCivil,"cerrar_button","Salir",this.estadocivilSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoCivil.setToolTipText("Nuevo"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoCivil.setToolTipText("Duplicar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoCivil.setToolTipText("Copiar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoCivil.setToolTipText("Ver"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoCivil.setToolTipText("Nuevo Rel"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoCivil.setToolTipText("Guardar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoCivil.setToolTipText("Salir"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoCivil";
		inputMap = this.jButtonNuevoEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoCivil.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoCivil"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoCivil";
		inputMap = this.jButtonDuplicarEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoCivil.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoCivil"));
		
		//COPIAR
		sMapKey = "CopiarEstadoCivil";
		inputMap = this.jButtonCopiarEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoCivil.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoCivil"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoCivil";
		inputMap = this.jButtonVerFormEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoCivil.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoCivil"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoCivil";
		inputMap = this.jButtonNuevoRelacionesEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoCivil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoCivil"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoCivil";
		inputMap = this.jButtonModificarEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoCivil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoCivil"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoCivil";
		inputMap = this.jButtonCerrarEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoCivil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoCivil"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoCivil";
		inputMap = this.jButtonGuardarCambiosTablaEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoCivil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoCivil"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoCivil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoCivil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoCivil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoCivil= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoCivil= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoCivil= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoCivil= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoCivil= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoCivil.setName("jPanelParametrosReportesEstadoCivil"); 
		
		this.jPanelParametrosReportesAccionesEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoCivil.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoCivil.setName("jPanelParametrosReportesAccionesEstadoCivil"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoCivil, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoCivil = new JButtonMe();
		this.jButtonRecargarInformacionEstadoCivil.setText("Recargar");
		this.jButtonRecargarInformacionEstadoCivil.setToolTipText("Recargar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoCivil,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoCivil = new JButtonMe();
		this.jButtonProcesarInformacionEstadoCivil.setText("Procesar");
		this.jButtonProcesarInformacionEstadoCivil.setToolTipText("Procesar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoCivil.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoCivil.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoCivil.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoCivil.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoCivil = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoCivil.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoCivil.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoCivil = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoCivil.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoCivil.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoCivil = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoCivil.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoCivil.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoCivil = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoCivil.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoCivil.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoCivil = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoCivil.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoCivil.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoCivil = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoCivil.setText("Accion");
		this.jComboBoxTiposAccionesEstadoCivil.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoCivil = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoCivil.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoCivil.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoCivil=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoCivil.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoCivil.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoCivil.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoCivil = new JLabelMe();
		
		this.jLabelAccionesEstadoCivil.setText("Acciones");		
		this.jLabelAccionesEstadoCivil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCivil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCivil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoCivil = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoCivil.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoCivil.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoCivil = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoCivil.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoCivil.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoCivil = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoCivil.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoCivil.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoCivil = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoCivil.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoCivil.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoCivil = new JButtonMe();
		//this.jButtonAnterioresEstadoCivil.setText("<<");
        this.jButtonAnterioresEstadoCivil.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoCivil,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoCivil = new JButtonMe();
		//this.jButtonSiguientesEstadoCivil.setText(">>");
        this.jButtonSiguientesEstadoCivil.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoCivil,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoCivil = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoCivil.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoCivil.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoCivil,"nuevoguardarcambios_button","Nue",this.estadocivilSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoCivil";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoCivil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoCivil"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoCivil";
		inputMap = this.jButtonRecargarInformacionEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoCivil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoCivil"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoCivil";
		inputMap = this.jButtonSiguientesEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoCivil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoCivil"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoCivil";
		inputMap = this.jButtonAnterioresEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoCivil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoCivil"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoCivil();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoCivil.setMinimumSize(new Dimension(this.getWidth(),EstadoCivilBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoCivilBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoCivil.setMaximumSize(new Dimension(this.getWidth(),EstadoCivilBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoCivilBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoCivil.setPreferredSize(new Dimension(this.getWidth(),EstadoCivilBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoCivilBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoCivil = new GridBagLayout();

			this.jPanelPaginacionEstadoCivil.setLayout(gridaBagLayoutPaginacionEstadoCivil);						
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.gridy = 0;
			this.gridBagConstraintsEstadoCivil.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoCivil.add(this.jButtonAnterioresEstadoCivil, this.gridBagConstraintsEstadoCivil);
					
						
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoCivil.gridy = 0;
			
			this.jPanelPaginacionEstadoCivil.add(this.jButtonNuevoGuardarCambiosEstadoCivil, this.gridBagConstraintsEstadoCivil);
						
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoCivil.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoCivil.gridy = 0;
			this.jPanelPaginacionEstadoCivil.add(this.jButtonSiguientesEstadoCivil, this.gridBagConstraintsEstadoCivil);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.gridy = 1;
			this.gridBagConstraintsEstadoCivil.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCivil.add(this.jButtonNuevoEstadoCivil, this.gridBagConstraintsEstadoCivil);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
				this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoCivil.gridy = 1;
				this.gridBagConstraintsEstadoCivil.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoCivil.add(this.jButtonNuevoRelacionesEstadoCivil, this.gridBagConstraintsEstadoCivil);
			}
			
			
			if(!this.estadocivilSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
				this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoCivil.gridy = 1;
				this.gridBagConstraintsEstadoCivil.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoCivil.add(this.jButtonGuardarCambiosTablaEstadoCivil, this.gridBagConstraintsEstadoCivil);
			}
			
			
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.gridy = 1;
			this.gridBagConstraintsEstadoCivil.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCivil.add(this.jButtonDuplicarEstadoCivil, this.gridBagConstraintsEstadoCivil);
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.gridy = 1;
			this.gridBagConstraintsEstadoCivil.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCivil.add(this.jButtonCopiarEstadoCivil, this.gridBagConstraintsEstadoCivil);
		
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.gridy = 1;
			this.gridBagConstraintsEstadoCivil.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoCivil.add(this.jButtonVerFormEstadoCivil, this.gridBagConstraintsEstadoCivil);
		
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.gridy = 1;
			this.gridBagConstraintsEstadoCivil.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoCivil.add(this.jButtonCerrarEstadoCivil, this.gridBagConstraintsEstadoCivil);
		
		
		
		this.jButtonRecargarInformacionEstadoCivil.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoCivil.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoCivil.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoCivil.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoCivil.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoCivil.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoCivil.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoCivil.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoCivil.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoCivil.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoCivil.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoCivil.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoCivil.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoCivil.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoCivil.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoCivil.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoCivil.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoCivil.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoCivil.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCivil.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCivil.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoCivil.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoCivil.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoCivil.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoCivil.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoCivil.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoCivil.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoCivil.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoCivil.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoCivil.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoCivil.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoCivil.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoCivil.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoCivil.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoCivil.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoCivil.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoCivil = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoCivil = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoCivil = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoCivil = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoCivil = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoCivil = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoCivil.setLayout(gridaBagParametrosReportesEstadoCivil);
			this.jPanelParametrosReportesAccionesEstadoCivil.setLayout(gridaBagParametrosReportesAccionesEstadoCivil);
			
			
			this.jPanelParametrosAuxiliar1EstadoCivil.setLayout(gridaBagParametrosAuxiliar1EstadoCivil);
			this.jPanelParametrosAuxiliar2EstadoCivil.setLayout(gridaBagParametrosAuxiliar2EstadoCivil);
			this.jPanelParametrosAuxiliar3EstadoCivil.setLayout(gridaBagParametrosAuxiliar3EstadoCivil);
			this.jPanelParametrosAuxiliar4EstadoCivil.setLayout(gridaBagParametrosAuxiliar4EstadoCivil);
			//this.jPanelParametrosAuxiliar5EstadoCivil.setLayout(gridaBagParametrosAuxiliar2EstadoCivil);			
			
			
			
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCivil.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCivil.add(this.jButtonRecargarInformacionEstadoCivil, this.gridBagConstraintsEstadoCivil);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCivil.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoCivil.add(this.jComboBoxTiposPaginacionEstadoCivil, this.gridBagConstraintsEstadoCivil);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCivil.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoCivil.add(this.jCheckBoxConAltoMaximoTablaEstadoCivil, this.gridBagConstraintsEstadoCivil);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCivil.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoCivil.add(this.jComboBoxTiposArchivosReportesEstadoCivil, this.gridBagConstraintsEstadoCivil);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCivil.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCivil.add(this.jPanelParametrosAuxiliar1EstadoCivil, this.gridBagConstraintsEstadoCivil);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCivil.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoCivil.add(this.jComboBoxTiposReportesEstadoCivil, this.gridBagConstraintsEstadoCivil);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCivil.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCivil.add(this.jPanelParametrosAuxiliar4EstadoCivil, this.gridBagConstraintsEstadoCivil);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCivil.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCivil.add(this.jComboBoxTiposReportesEstadoCivil, this.gridBagConstraintsEstadoCivil);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCivil.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoCivil.add(this.jCheckBoxGenerarReporteEstadoCivil, this.gridBagConstraintsEstadoCivil);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCivil.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCivil.add(this.jPanelParametrosAuxiliar2EstadoCivil, this.gridBagConstraintsEstadoCivil);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCivil.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoCivil.add(this.jLabelAccionesEstadoCivil, this.gridBagConstraintsEstadoCivil);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
				this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoCivil.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoCivil.add(this.jButtonAbrirOrderByEstadoCivil, this.gridBagConstraintsEstadoCivil);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCivil.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCivil.add(this.jComboBoxTiposSeleccionarEstadoCivil, this.gridBagConstraintsEstadoCivil);			
			
			
			/*
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCivil.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoCivil.add(this.jCheckBoxSeleccionarTodosEstadoCivil, this.gridBagConstraintsEstadoCivil);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCivil.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoCivil.add(this.jCheckBoxSeleccionarTodosEstadoCivil, this.gridBagConstraintsEstadoCivil);															
				
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoCivil.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoCivil.add(this.jCheckBoxSeleccionadosEstadoCivil, this.gridBagConstraintsEstadoCivil);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCivil.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoCivil.add(this.jPanelParametrosAuxiliar3EstadoCivil, this.gridBagConstraintsEstadoCivil);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCivil.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCivil.add(this.jComboBoxTiposRelacionesEstadoCivil, this.gridBagConstraintsEstadoCivil);
				
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCivil.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCivil.add(this.jComboBoxTiposAccionesEstadoCivil, this.gridBagConstraintsEstadoCivil);
	
				
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoCivil.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoCivil.add(this.jTextFieldValorCampoGeneralEstadoCivil, this.gridBagConstraintsEstadoCivil);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoCivil = new GridBagLayout();

			this.jScrollPanelDatosEstadoCivil.setLayout(gridaBagLayoutDatosEstadoCivil);
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.gridy = 0;
			this.gridBagConstraintsEstadoCivil.gridx = 0;
			
			this.jScrollPanelDatosEstadoCivil.add(this.jTableDatosEstadoCivil, this.gridBagConstraintsEstadoCivil);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoCivil.setViewportView(this.jTableDatosEstadoCivil);
		this.jTableDatosEstadoCivil.setFillsViewportHeight(true);
		this.jTableDatosEstadoCivil.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoCivil= new GridBagLayout();
		this.jPanelAccionesEstadoCivil.setLayout(gridaBagLayoutAccionesEstadoCivil);
		
		
		/*	
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCivil.gridy = 0;
		this.gridBagConstraintsEstadoCivil.gridx = 0;
			
		this.jPanelAccionesEstadoCivil.add(this.jButtonNuevoEstadoCivil, this.gridBagConstraintsEstadoCivil);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoCivil = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoCivil);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadocivilSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();						
			this.gridBagConstraintsEstadoCivil.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoCivil.gridx = 0;		
			//this.gridBagConstraintsEstadoCivil.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoCivil.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoCivil, this.gridBagConstraintsEstadoCivil);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoCivil.gridx = 0;		
		//this.gridBagConstraintsEstadoCivil.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCivil.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoCivil.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoCivil);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCivil.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoCivil, this.gridBagConstraintsEstadoCivil);								
		
		
		/*
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCivil.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoCivil, this.gridBagConstraintsEstadoCivil);
		*/		
		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoCivil.gridx =0;
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoCivil.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoCivil, this.gridBagConstraintsEstadoCivil);
				
		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCivil.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoCivil, this.gridBagConstraintsEstadoCivil);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoCivilJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoCivil= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoCivil = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoCivil.setLayout(gridaBagLayoutBusquedasParametrosEstadoCivil);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoCivil=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoCivil.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCivil.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCivil.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCivil.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoCivil, this.gridBagConstraintsEstadoCivil);
			
			
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCivil.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoCivil, this.gridBagConstraintsEstadoCivil);
		
			
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCivil.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoCivil, this.gridBagConstraintsEstadoCivil);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoCivil;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoCivil() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoCivil = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoCivil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoCivil.setName("jPanelReporteDinamicoEstadoCivil"); 
		
		this.jPanelReporteDinamicoEstadoCivil.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoCivil.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoCivil.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoCivil.setLayout(gridaBagLayoutReporteDinamicoEstadoCivil);
		
		
		this.jInternalFrameReporteDinamicoEstadoCivil= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoCivil = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoCivil= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoCivil.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoCivil.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoCivil.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoCivil.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoCivil.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoCivil.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoCivil.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoCivil.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoCivil.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoCivil.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoCivil.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Civiles"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoCivil = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoCivil.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoCivil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoCivil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoCivil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCivil.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoCivil.add(this.jLabelColumnasSelectReporteEstadoCivil, this.gridBagConstraintsEstadoCivil);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoCivil = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoCivil.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoCivil.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoCivil.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoCivil.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoCivil.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoCivil=new JScrollPane(this.jListColumnasSelectReporteEstadoCivil);
			
			this.jScrollColumnasSelectReporteEstadoCivil.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoCivil.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoCivil.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCivil.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoCivil.add(this.jListColumnasSelectReporteEstadoCivil, this.gridBagConstraintsEstadoCivil);
		this.jPanelReporteDinamicoEstadoCivil.add(this.jScrollColumnasSelectReporteEstadoCivil, this.gridBagConstraintsEstadoCivil);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoCivil = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoCivil.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoCivil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoCivil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoCivil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCivil.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoCivil.add(this.jLabelRelacionesSelectReporteEstadoCivil, this.gridBagConstraintsEstadoCivil);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoCivil = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoCivil.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoCivil.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoCivil.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoCivil.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoCivil.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoCivil=new JScrollPane(this.jListRelacionesSelectReporteEstadoCivil);
			
			this.jScrollRelacionesSelectReporteEstadoCivil.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoCivil.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoCivil.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCivil.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoCivil.add(this.jListRelacionesSelectReporteEstadoCivil, this.gridBagConstraintsEstadoCivil);
		this.jPanelReporteDinamicoEstadoCivil.add(this.jScrollRelacionesSelectReporteEstadoCivil, this.gridBagConstraintsEstadoCivil);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoCivil = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoCivil = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoCivil = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoCivil = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoCivil.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoCivil.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoCivil.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoCivil.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCivil = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCivil.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCivil.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCivil.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoCivil.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoCivil = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoCivil.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoCivil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoCivil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoCivil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCivil.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoCivil.add(this.jLabelGenerarExcelReporteDinamicoEstadoCivil, this.gridBagConstraintsEstadoCivil);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoCivil = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoCivil.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoCivil,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoCivil.setToolTipText("Generar EXCEL"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		//this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoCivil.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoCivil.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoCivil.add(this.jButtonGenerarExcelReporteDinamicoEstadoCivil, this.gridBagConstraintsEstadoCivil);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCivil.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCivil.add(this.jComboBoxTiposReportesDinamicoEstadoCivil, this.gridBagConstraintsEstadoCivil);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoCivil = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoCivil.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoCivil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoCivil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoCivil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoCivil.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoCivil.add(this.jLabelTiposArchivoReporteDinamicoEstadoCivil, this.gridBagConstraintsEstadoCivil);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCivil.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCivil.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoCivil, this.gridBagConstraintsEstadoCivil);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoCivil = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoCivil.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoCivil,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoCivil.setToolTipText("Generar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCivil.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCivil.add(this.jButtonGenerarReporteDinamicoEstadoCivil, this.gridBagConstraintsEstadoCivil);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoCivil = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoCivil.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoCivil,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoCivil.setToolTipText("Cancelar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCivil.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoCivil.add(this.jButtonCerrarReporteDinamicoEstadoCivil, this.gridBagConstraintsEstadoCivil);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoCivil = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoCivil= new JScrollPane(jPanelReporteDinamicoEstadoCivil,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoCivil.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoCivil.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoCivil.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Civiles"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoCivil.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoCivil.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoCivil.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoCivil);
		this.jInternalFrameReporteDinamicoEstadoCivil.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoCivil, this.gridBagConstraintsEstadoCivil);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoCivil() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoCivil = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoCivil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoCivil.setName("jPanelImportacionEstadoCivil"); 
		
		this.jPanelImportacionEstadoCivil.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoCivil.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoCivil.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoCivil.setLayout(gridaBagLayoutImportacionEstadoCivil);
		
		
		this.jInternalFrameImportacionEstadoCivil= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoCivil= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoCivil = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoCivil= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoCivil.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoCivil.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoCivil.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoCivil.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoCivil.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoCivil.setResizable(true);
	    this.jInternalFrameImportacionEstadoCivil.setClosable(true);
	    this.jInternalFrameImportacionEstadoCivil.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoCivil.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoCivil.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoCivil.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoCivil.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoCivil.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoCivil.setResizable(true);
	    this.jInternalFrameImportacionEstadoCivil.setClosable(true);
	    this.jInternalFrameImportacionEstadoCivil.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoCivil.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoCivil.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoCivil.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Civiles"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoCivil = new JLabelMe();

		this.jLabelArchivoImportacionEstadoCivil.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoCivil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoCivil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoCivil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoCivil.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoCivil.add(this.jLabelArchivoImportacionEstadoCivil, this.gridBagConstraintsEstadoCivil);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoCivil = new JFileChooser();		
		this.jFileChooserImportacionEstadoCivil.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoCivil = new JButtonMe();
		this.jButtonAbrirImportacionEstadoCivil.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoCivil,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoCivil.setToolTipText("Generar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCivil.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCivil.add(this.jButtonAbrirImportacionEstadoCivil, this.gridBagConstraintsEstadoCivil);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoCivil = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoCivil.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoCivil.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoCivil.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoCivil.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoCivil.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoCivil.add(this.jLabelPathArchivoImportacionEstadoCivil, this.gridBagConstraintsEstadoCivil);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoCivil=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoCivil.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoCivil.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoCivil.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCivil.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCivil.add(this.jTextFieldPathArchivoImportacionEstadoCivil, this.gridBagConstraintsEstadoCivil);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoCivil = new JButtonMe();
		this.jButtonGenerarImportacionEstadoCivil.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoCivil,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoCivil.setToolTipText("Generar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCivil.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCivil.add(this.jButtonGenerarImportacionEstadoCivil, this.gridBagConstraintsEstadoCivil);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoCivil = new JButtonMe();
		this.jButtonCerrarImportacionEstadoCivil.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoCivil,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoCivil.setToolTipText("Cancelar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCivil.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoCivil.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoCivil.add(this.jButtonCerrarImportacionEstadoCivil, this.gridBagConstraintsEstadoCivil);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoCivil = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoCivil= new JScrollPane(jPanelImportacionEstadoCivil,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
		this.gridBagConstraintsEstadoCivil.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoCivil.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoCivil.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoCivil.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoCivil);
		this.jInternalFrameImportacionEstadoCivil.getContentPane().add(this.jScrollPanelImportacionEstadoCivil, this.gridBagConstraintsEstadoCivil);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoCivil(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoCivil = new JButtonMe();
			this.jButtonAbrirOrderByEstadoCivil.setText("Orden");
			this.jButtonAbrirOrderByEstadoCivil.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoCivil,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoCivil";
			inputMap = this.jButtonAbrirOrderByEstadoCivil.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoCivil.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoCivil"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoCivil = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoCivil = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoCivil.setName("jPanelOrderByEstadoCivil"); 
			
			this.jPanelOrderByEstadoCivil.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoCivil.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoCivil.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoCivil.setLayout(gridaBagLayoutOrderByEstadoCivil);
			
			
			this.jTableDatosEstadoCivilOrderBy = new JTableMe();        
			this.jTableDatosEstadoCivilOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoCivilOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoCivilOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoCivilOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoCivilOrderBy.setViewportView(this.jTableDatosEstadoCivilOrderBy);
			this.jTableDatosEstadoCivilOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoCivilOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoCivil= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoCivil= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoCivil = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoCivil= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoCivil.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoCivil.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoCivil.setTitle("Orden");
			this.jInternalFrameOrderByEstadoCivil.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoCivil.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoCivil.setResizable(true);
			this.jInternalFrameOrderByEstadoCivil.setClosable(true);
			this.jInternalFrameOrderByEstadoCivil.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoCivil.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoCivil.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoCivil.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Civiles"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoCivil.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoCivil.ipady =150;
				
			this.jPanelOrderByEstadoCivil.add(jScrollPanelDatosEstadoCivilOrderBy, this.gridBagConstraintsEstadoCivil);//this.jTableDatosEstadoCivilTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoCivil = new JButtonMe();
			this.jButtonCerrarOrderByEstadoCivil.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoCivil,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoCivil.setToolTipText("Cancelar"+" "+EstadoCivilConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoCivil, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCivil.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoCivil.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoCivil.add(this.jButtonCerrarOrderByEstadoCivil, this.gridBagConstraintsEstadoCivil);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoCivil = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoCivil= new JScrollPane(jPanelOrderByEstadoCivil,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoCivil = new GridBagConstraints();
			this.gridBagConstraintsEstadoCivil.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoCivil.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoCivil.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoCivil.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoCivil.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoCivil);
			
			this.jInternalFrameOrderByEstadoCivil.getContentPane().add(this.jScrollPanelOrderByEstadoCivil, this.gridBagConstraintsEstadoCivil);			
		
		} else {
			this.jButtonAbrirOrderByEstadoCivil = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=600;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadocivilSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoCivil.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoCivil.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoCivil.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoCivil.getRowHeight();//EstadoCivilConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoCivilConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoCivil.isSelected()) {
					iHeightTable=EstadoCivilConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoCivilConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoCivilConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoCivilConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoCivil.isSelected()) {
					iHeightTable=EstadoCivilConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoCivilConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoCivilConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoCivil.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoCivil.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoCivil.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoCivil.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoCivil.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoCivil.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoCivil!=null && this.jInternalFrameOrderByEstadoCivil.getjTableDatosOrderBy()!=null) {
			//if(!this.estadocivilSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoCivil.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoCivil.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoCivil.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoCivil.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoCivil.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoCivil.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoCivil.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoCivil.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoCivil.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoCivil.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadocivilLogic.getEstadoCivils().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadocivils.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoCivil> TraerEstadoCivilBeans(List<EstadoCivil> estadocivils,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoCivil estadocivil:estadocivils) {
					
				if(!(EstadoCivilConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoCivilConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadocivil.setsDetalleGeneralEntityReporte(EstadoCivilConstantesFunciones.getEstadoCivilDescripcion(estadocivil));
										
						
					
					

					if(estadocivil.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{estadocivil.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(estadocivil.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadocivil.getCargaFamiliar_NMs()!=null && Funciones.existeClass(classes,CargaFamiliar_NM.class)) {
						try{estadocivil.setcargafamiliar_nmsDescripcionReporte(new JRBeanCollectionDataSource(CargaFamiliar_NMJInternalFrame.TraerCargaFamiliar_NMBeans(estadocivil.getCargaFamiliar_NMs(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadocivil.getSubClientes()!=null && Funciones.existeClass(classes,SubCliente.class)) {
						try{estadocivil.setsubclientesDescripcionReporte(new JRBeanCollectionDataSource(SubClienteJInternalFrame.TraerSubClienteBeans(estadocivil.getSubClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadocivil.getEmpleados()!=null && Funciones.existeClass(classes,Empleado.class)) {
						try{estadocivil.setempleadosDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoJInternalFrame.TraerEmpleadoBeans(estadocivil.getEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadocivil.getParametroCarteraDefectos()!=null && Funciones.existeClass(classes,ParametroCarteraDefecto.class)) {
						try{estadocivil.setparametrocarteradefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroCarteraDefectoJInternalFrame.TraerParametroCarteraDefectoBeans(estadocivil.getParametroCarteraDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadocivil.getCargaFamiliars()!=null && Funciones.existeClass(classes,CargaFamiliar.class)) {
						try{estadocivil.setcargafamiliarsDescripcionReporte(new JRBeanCollectionDataSource(CargaFamiliarJInternalFrame.TraerCargaFamiliarBeans(estadocivil.getCargaFamiliars(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadocivil.setsDetalleGeneralEntityReporte(estadocivil.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadocivilbeans.add(estadocivilbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadocivils;
    }
	//PARA REPORTES FIN
}
