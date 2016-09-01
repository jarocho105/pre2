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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.NivelCentroCostoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class NivelCentroCostoJInternalFrame extends NivelCentroCostoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNivelCentroCosto;
	
	protected JMenuBar jmenuBarNivelCentroCosto;
	
	protected JMenu jmenuNivelCentroCosto;
	protected JMenu jmenuDatosNivelCentroCosto;
	protected JMenu jmenuArchivoNivelCentroCosto;
	protected JMenu jmenuAccionesNivelCentroCosto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNivelCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNivelCentroCosto;	
	protected GridBagConstraints gridBagConstraintsNivelCentroCosto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NivelCentroCostoDetalleFormJInternalFrame jInternalFrameDetalleFormNivelCentroCosto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNivelCentroCosto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNivelCentroCosto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public NivelCentroCostoSessionBean nivelcentrocostoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<NivelCentroCosto> nivelcentrocostos;		
	public List<NivelCentroCosto> nivelcentrocostosEliminados;	
	public List<NivelCentroCosto> nivelcentrocostosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNivelCentroCosto;		
	protected JButton jButtonAbrirOrderByNivelCentroCosto;
	
	
	//protected JPanel jPanelOrderByNivelCentroCosto;
	//public JScrollPane jScrollPanelOrderByNivelCentroCosto;	
	//protected JButton jButtonCerrarOrderByNivelCentroCosto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NivelCentroCostoLogic nivelcentrocostoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNivelCentroCosto;
	public JScrollPane jScrollPanelDatosEdicionNivelCentroCosto;
	public JScrollPane jScrollPanelDatosGeneralNivelCentroCosto;
    
	
	
	//public JScrollPane jScrollPanelDatosNivelCentroCostoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNivelCentroCosto;
	//public JScrollPane jScrollPanelImportacionNivelCentroCosto;
	
	
	
	protected JPanel jPanelAccionesNivelCentroCosto;
	
    protected JPanel jPanelPaginacionNivelCentroCosto;
    protected JPanel jPanelParametrosReportesNivelCentroCosto;
	protected JPanel jPanelParametrosReportesAccionesNivelCentroCosto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1NivelCentroCosto;
	protected JPanel jPanelParametrosAuxiliar2NivelCentroCosto;
	protected JPanel jPanelParametrosAuxiliar3NivelCentroCosto;
	protected JPanel jPanelParametrosAuxiliar4NivelCentroCosto;
	//protected JPanel jPanelParametrosAuxiliar5NivelCentroCosto;
	
	
	
	//protected JPanel jPanelReporteDinamicoNivelCentroCosto;
	//protected JPanel jPanelImportacionNivelCentroCosto;
	
	
	public JTable jTableDatosNivelCentroCosto;
	
	
	
	//public JTable jTableDatosNivelCentroCostoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNivelCentroCosto;
	protected JButton jButtonDuplicarNivelCentroCosto;
	protected JButton jButtonCopiarNivelCentroCosto;
	protected JButton jButtonVerFormNivelCentroCosto;
	protected JButton jButtonNuevoRelacionesNivelCentroCosto;
	protected JButton jButtonModificarNivelCentroCosto;
	
    protected JButton jButtonGuardarCambiosTablaNivelCentroCosto;
	protected JButton jButtonCerrarNivelCentroCosto;
	
	
	protected JButton jButtonRecargarInformacionNivelCentroCosto;
	protected JButton jButtonProcesarInformacionNivelCentroCosto;
	
	
	protected JButton jButtonAnterioresNivelCentroCosto;
	protected JButton jButtonSiguientesNivelCentroCosto;
	protected JButton jButtonNuevoGuardarCambiosNivelCentroCosto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNivelCentroCosto;
	//protected JButton jButtonCerrarReporteDinamicoNivelCentroCosto;
	//protected JButton jButtonGenerarExcelReporteDinamicoNivelCentroCosto;	
	
	
	
	//protected JButton jButtonAbrirImportacionNivelCentroCosto;
	//protected JButton jButtonGenerarImportacionNivelCentroCosto;
	//protected JButton jButtonCerrarImportacionNivelCentroCosto;
	//protected JFileChooser jFileChooserImportacionNivelCentroCosto;
	//protected File fileImportacionNivelCentroCosto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNivelCentroCosto;
	protected JButton jButtonDuplicarToolBarNivelCentroCosto;
	protected JButton jButtonNuevoRelacionesToolBarNivelCentroCosto;
	
	
	public JButton jButtonGuardarCambiosToolBarNivelCentroCosto;
	protected JButton jButtonCopiarToolBarNivelCentroCosto;
	protected JButton jButtonVerFormToolBarNivelCentroCosto;
	public JButton jButtonGuardarCambiosTablaToolBarNivelCentroCosto;
	protected JButton jButtonMostrarOcultarTablaToolBarNivelCentroCosto;
	protected JButton jButtonCerrarToolBarNivelCentroCosto;
	
	protected JButton jButtonRecargarInformacionToolBarNivelCentroCosto;
	protected JButton jButtonProcesarInformacionToolBarNivelCentroCosto;
	protected JButton jButtonAnterioresToolBarNivelCentroCosto;
	protected JButton jButtonSiguientesToolBarNivelCentroCosto;
	protected JButton jButtonNuevoGuardarCambiosToolBarNivelCentroCosto;
	protected JButton jButtonAbrirOrderByToolBarNivelCentroCosto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNivelCentroCosto;
	protected JMenuItem jMenuItemDuplicarNivelCentroCosto;
	protected JMenuItem jMenuItemNuevoRelacionesNivelCentroCosto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNivelCentroCosto;
	protected JMenuItem jMenuItemCopiarNivelCentroCosto;
	protected JMenuItem jMenuItemVerFormNivelCentroCosto;
	protected JMenuItem jMenuItemGuardarCambiosTablaNivelCentroCosto;
	protected JMenuItem jMenuItemCerrarNivelCentroCosto;
	protected JMenuItem jMenuItemDetalleCerrarNivelCentroCosto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNivelCentroCosto;
	protected JMenuItem jMenuItemDetalleMostarOcultarNivelCentroCosto;
	
	protected JMenuItem jMenuItemRecargarInformacionNivelCentroCosto;
	protected JMenuItem jMenuItemProcesarInformacionNivelCentroCosto;
	protected JMenuItem jMenuItemAnterioresNivelCentroCosto;
	protected JMenuItem jMenuItemSiguientesNivelCentroCosto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNivelCentroCosto;
	protected JMenuItem jMenuItemAbrirOrderByNivelCentroCosto;
	protected JMenuItem jMenuItemMostrarOcultarNivelCentroCosto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNivelCentroCosto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNivelCentroCosto;
	protected JCheckBox jCheckBoxSeleccionadosNivelCentroCosto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNivelCentroCosto;
	protected JCheckBox jCheckBoxConGraficoReporteNivelCentroCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNivelCentroCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNivelCentroCosto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNivelCentroCosto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNivelCentroCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNivelCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNivelCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNivelCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNivelCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNivelCentroCosto;
	protected JTextField jTextFieldValorCampoGeneralNivelCentroCosto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNivelCentroCosto;
	//public JList<Reporte> jListColumnasSelectReporteNivelCentroCosto;
	//public JScrollPane jScrollColumnasSelectReporteNivelCentroCosto;
	
	//public JLabel jLabelRelacionesSelectReporteNivelCentroCosto;
	//public JList<Reporte> jListRelacionesSelectReporteNivelCentroCosto;
	//public JScrollPane jScrollRelacionesSelectReporteNivelCentroCosto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNivelCentroCosto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNivelCentroCosto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNivelCentroCosto;
	//public JLabel jLabelTiposArchivoReporteDinamicoNivelCentroCosto;
	
		
	//public JLabel jLabelArchivoImportacionNivelCentroCosto;	
	//public JLabel jLabelPathArchivoImportacionNivelCentroCosto;
	//protected JTextField jTextFieldPathArchivoImportacionNivelCentroCosto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNivelCentroCosto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNivelCentroCosto;
	
	//public JLabel jLabelColumnaCategoriaValorNivelCentroCosto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNivelCentroCosto;
	
	//public JLabel jLabelColumnasValoresGraficoNivelCentroCosto;
	//public JList<Reporte> jListColumnasValoresGraficoNivelCentroCosto;
	//public JScrollPane jScrollColumnasValoresGraficoNivelCentroCosto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNivelCentroCosto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNivelCentroCosto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasNivelCentroCosto;
	
	
	
	
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
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public NivelCentroCostoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("NivelCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCentroCostoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCentroCostoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCentroCostoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NivelCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNivelCentroCosto)	{
		this.jButtonRecargarInformacionNivelCentroCosto = jButtonRecargarInformacionNivelCentroCosto;
	}
	
	public JButton getjButtonProcesarInformacionNivelCentroCosto() {
		return this.jButtonProcesarInformacionNivelCentroCosto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNivelCentroCosto)	{
		this.jButtonProcesarInformacionNivelCentroCosto = jButtonProcesarInformacionNivelCentroCosto;
	}
	
	
	public JButton getjButtonRecargarInformacionNivelCentroCosto() {
		return this.jButtonRecargarInformacionNivelCentroCosto;
	}
	
	
	public List<NivelCentroCosto> getnivelcentrocostos() {
		return this.nivelcentrocostos;
	}

	public void setnivelcentrocostos(List<NivelCentroCosto> nivelcentrocostos) {
		this.nivelcentrocostos = nivelcentrocostos;
	}
	
	public List<NivelCentroCosto> getnivelcentrocostosAux() {
		return this.nivelcentrocostosAux;
	}

	public void setnivelcentrocostosAux(List<NivelCentroCosto> nivelcentrocostosAux) {
		this.nivelcentrocostosAux = nivelcentrocostosAux;
	}
	
	public List<NivelCentroCosto> getnivelcentrocostosEliminados() {
		return this.nivelcentrocostosEliminados;
	}

	public void setNivelCentroCostosEliminados(List<NivelCentroCosto> nivelcentrocostosEliminados) {
		this.nivelcentrocostosEliminados = nivelcentrocostosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNivelCentroCosto() {
		return jComboBoxTiposSeleccionarNivelCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNivelCentroCosto(
			JComboBox jComboBoxTiposSeleccionarNivelCentroCosto) {
		this.jComboBoxTiposSeleccionarNivelCentroCosto = jComboBoxTiposSeleccionarNivelCentroCosto;
	}
	
	public void setBorderResaltarTiposSeleccionarNivelCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNivelCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNivelCentroCosto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNivelCentroCosto() {
		return jTextFieldValorCampoGeneralNivelCentroCosto;
	}

	public void setjTextFieldValorCampoGeneralNivelCentroCosto(
			JTextField jTextFieldValorCampoGeneralNivelCentroCosto) {
		this.jTextFieldValorCampoGeneralNivelCentroCosto = jTextFieldValorCampoGeneralNivelCentroCosto;
	}

	public void setBorderResaltarValorCampoGeneralNivelCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCentroCosto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNivelCentroCosto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNivelCentroCosto() {
		return this.jCheckBoxSeleccionarTodosNivelCentroCosto;
	}

	public void setjCheckBoxSeleccionarTodosNivelCentroCosto(
			JCheckBox jCheckBoxSeleccionarTodosNivelCentroCosto) {
		this.jCheckBoxSeleccionarTodosNivelCentroCosto = jCheckBoxSeleccionarTodosNivelCentroCosto;
	}

	public void setBorderResaltarSeleccionarTodosNivelCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCentroCosto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNivelCentroCosto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNivelCentroCosto() {
		return this.jCheckBoxSeleccionadosNivelCentroCosto;
	}

	public void setjCheckBoxSeleccionadosNivelCentroCosto(
			JCheckBox jCheckBoxSeleccionadosNivelCentroCosto) {
		this.jCheckBoxSeleccionadosNivelCentroCosto = jCheckBoxSeleccionadosNivelCentroCosto;
	}
	
	public void setBorderResaltarSeleccionadosNivelCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCentroCosto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNivelCentroCosto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNivelCentroCosto() {
		return this.jComboBoxTiposArchivosReportesNivelCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNivelCentroCosto(
			JComboBox jComboBoxTiposArchivosReportesNivelCentroCosto) {
		this.jComboBoxTiposArchivosReportesNivelCentroCosto = jComboBoxTiposArchivosReportesNivelCentroCosto;
	}

	public void setBorderResaltarTiposArchivosReportesNivelCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNivelCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNivelCentroCosto() {
		return this.jComboBoxTiposReportesNivelCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNivelCentroCosto(
			JComboBox jComboBoxTiposReportesNivelCentroCosto) {
		this.jComboBoxTiposReportesNivelCentroCosto = jComboBoxTiposReportesNivelCentroCosto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNivelCentroCosto() {
	//	return jComboBoxTiposReportesDinamicoNivelCentroCosto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNivelCentroCosto(
	//		JComboBox jComboBoxTiposReportesDinamicoNivelCentroCosto) {
	//	this.jComboBoxTiposReportesDinamicoNivelCentroCosto = jComboBoxTiposReportesDinamicoNivelCentroCosto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNivelCentroCosto() {
	//	return jComboBoxTiposArchivosReportesDinamicoNivelCentroCosto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNivelCentroCosto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNivelCentroCosto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNivelCentroCosto = jComboBoxTiposArchivosReportesDinamicoNivelCentroCosto;
	//}
	
	public void setBorderResaltarTiposReportesNivelCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNivelCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNivelCentroCosto() {
		return this.jComboBoxTiposGraficosReportesNivelCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNivelCentroCosto(
			JComboBox jComboBoxTiposGraficosReportesNivelCentroCosto) {
		this.jComboBoxTiposGraficosReportesNivelCentroCosto = jComboBoxTiposGraficosReportesNivelCentroCosto;
	}
	
	public void setBorderResaltarTiposGraficosReportesNivelCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNivelCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNivelCentroCosto() {
		return this.jComboBoxTiposPaginacionNivelCentroCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNivelCentroCosto(
			JComboBox jComboBoxTiposPaginacionNivelCentroCosto) {
		this.jComboBoxTiposPaginacionNivelCentroCosto = jComboBoxTiposPaginacionNivelCentroCosto;
	}
	
	public void setBorderResaltarTiposPaginacionNivelCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNivelCentroCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNivelCentroCosto() {
		return this.jComboBoxTiposRelacionesNivelCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNivelCentroCosto() {
		return this.jComboBoxTiposAccionesNivelCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNivelCentroCosto(
			JComboBox jComboBoxTiposRelacionesNivelCentroCosto) {
		this.jComboBoxTiposRelacionesNivelCentroCosto = jComboBoxTiposRelacionesNivelCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNivelCentroCosto(
			JComboBox jComboBoxTiposAccionesNivelCentroCosto) {
		this.jComboBoxTiposAccionesNivelCentroCosto = jComboBoxTiposAccionesNivelCentroCosto;
	}
	
	public void setBorderResaltarTiposRelacionesNivelCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNivelCentroCosto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNivelCentroCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCentroCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNivelCentroCosto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNivelCentroCosto() {
	//	return jCheckBoxConGraficoDinamicoNivelCentroCosto;
	//}

	//public void setjCheckBoxConGraficoDinamicoNivelCentroCosto(
	//		JCheckBox jCheckBoxConGraficoDinamicoNivelCentroCosto) {
	//	this.jCheckBoxConGraficoDinamicoNivelCentroCosto = jCheckBoxConGraficoDinamicoNivelCentroCosto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNivelCentroCosto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNivelCentroCosto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNivelCentroCosto .setBorder(borderResaltar);		
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
		this.nivelcentrocostoSessionBean=new NivelCentroCostoSessionBean();
		
		this.nivelcentrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.nivelcentrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.nivelcentrocostoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NivelCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NivelCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NivelCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NivelCentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NivelCentroCostoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Nivel Centro Costo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
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
		
		NivelCentroCostoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("NivelCentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNivelCentroCosto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNivelCentroCosto,this.jTtoolBarNivelCentroCosto,
							"nuevo","nuevo","Nuevo"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNivelCentroCosto,this.jTtoolBarNivelCentroCosto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNivelCentroCosto,this.jTtoolBarNivelCentroCosto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNivelCentroCosto,this.jTtoolBarNivelCentroCosto,
							"duplicar","duplicar","Duplicar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNivelCentroCosto,this.jTtoolBarNivelCentroCosto,
							"copiar","copiar","Copiar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNivelCentroCosto,this.jTtoolBarNivelCentroCosto,
							"ver_form","ver_form","Ver"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNivelCentroCosto,this.jTtoolBarNivelCentroCosto,
							"recargar","recargar","Recargar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNivelCentroCosto,this.jTtoolBarNivelCentroCosto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNivelCentroCosto,this.jTtoolBarNivelCentroCosto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNivelCentroCosto,this.jTtoolBarNivelCentroCosto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNivelCentroCosto,this.jTtoolBarNivelCentroCosto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNivelCentroCosto,this.jTtoolBarNivelCentroCosto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNivelCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNivelCentroCosto,this.jTtoolBarNivelCentroCosto,
							"cerrar","cerrar","Salir"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNivelCentroCosto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNivelCentroCosto;
			
				this.jButtonProcesarInformacionToolBarNivelCentroCosto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNivelCentroCosto;
				
		//protected JButton jButtonModificarToolBarNivelCentroCosto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNivelCentroCosto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNivelCentroCosto=new JMenuMe("General");
		this.jmenuArchivoNivelCentroCosto=new JMenuMe("Archivo");
		this.jmenuAccionesNivelCentroCosto=new JMenuMe("Acciones");
		this.jmenuDatosNivelCentroCosto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNivelCentroCosto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNivelCentroCosto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNivelCentroCosto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNivelCentroCosto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNivelCentroCosto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNivelCentroCosto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNivelCentroCosto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNivelCentroCosto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNivelCentroCosto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNivelCentroCosto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNivelCentroCosto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNivelCentroCosto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNivelCentroCosto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNivelCentroCosto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNivelCentroCosto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNivelCentroCosto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNivelCentroCosto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNivelCentroCosto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNivelCentroCosto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNivelCentroCosto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNivelCentroCosto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNivelCentroCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNivelCentroCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNivelCentroCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNivelCentroCosto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNivelCentroCosto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNivelCentroCosto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNivelCentroCosto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNivelCentroCosto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNivelCentroCosto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNivelCentroCosto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNivelCentroCosto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNivelCentroCosto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNivelCentroCosto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNivelCentroCosto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNivelCentroCosto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNivelCentroCosto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNivelCentroCosto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNivelCentroCosto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNivelCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNivelCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNivelCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNivelCentroCosto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNivelCentroCosto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNivelCentroCosto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNivelCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNivelCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNivelCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNivelCentroCosto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNivelCentroCosto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNivelCentroCosto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNivelCentroCosto.add(this.jMenuItemCerrarNivelCentroCosto);
			
			this.jmenuAccionesNivelCentroCosto.add(this.jMenuItemNuevoNivelCentroCosto);
			this.jmenuAccionesNivelCentroCosto.add(this.jMenuItemNuevoGuardarCambiosNivelCentroCosto);
			this.jmenuAccionesNivelCentroCosto.add(this.jMenuItemNuevoRelacionesNivelCentroCosto);
			this.jmenuAccionesNivelCentroCosto.add(this.jMenuItemGuardarCambiosTablaNivelCentroCosto);		
			this.jmenuAccionesNivelCentroCosto.add(this.jMenuItemDuplicarNivelCentroCosto);		
			this.jmenuAccionesNivelCentroCosto.add(this.jMenuItemCopiarNivelCentroCosto);		
			this.jmenuAccionesNivelCentroCosto.add(this.jMenuItemVerFormNivelCentroCosto);		
			
			this.jmenuDatosNivelCentroCosto.add(this.jMenuItemRecargarInformacionNivelCentroCosto);				
			this.jmenuDatosNivelCentroCosto.add(this.jMenuItemAnterioresNivelCentroCosto);				
			this.jmenuDatosNivelCentroCosto.add(this.jMenuItemSiguientesNivelCentroCosto);				
			this.jmenuDatosNivelCentroCosto.add(this.jMenuItemAbrirOrderByNivelCentroCosto);				
			this.jmenuDatosNivelCentroCosto.add(this.jMenuItemMostrarOcultarNivelCentroCosto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNivelCentroCosto.add(this.jMenuItemGuardarCambiosNivelCentroCosto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNivelCentroCosto.add(this.jmenuArchivoNivelCentroCosto);		
			this.jmenuBarNivelCentroCosto.add(this.jmenuAccionesNivelCentroCosto);		
			this.jmenuBarNivelCentroCosto.add(this.jmenuDatosNivelCentroCosto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNivelCentroCosto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNivelCentroCosto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasNivelCentroCosto=new JTabbedPane();


		this.jTabbedPaneBusquedasNivelCentroCosto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNivelCentroCosto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNivelCentroCosto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasNivelCentroCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasNivelCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleNivelCentroCosto = new NivelCentroCostoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Nivel Centro Costo DATOS");
			this.jInternalFrameDetalleFormNivelCentroCosto = new NivelCentroCostoDetalleFormJInternalFrame(jDesktopPane,this.nivelcentrocostoSessionBean.getConGuardarRelaciones(),this.nivelcentrocostoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNivelCentroCosto = null;//new NivelCentroCostoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNivelCentroCosto= new GridBagLayout();
		
		
		this.jTableDatosNivelCentroCosto = new JTableMe();      
		
		String sToolTipNivelCentroCosto="";
		sToolTipNivelCentroCosto=NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNivelCentroCosto+="(Contabilidad.NivelCentroCosto)";
		}
		
		if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
			sToolTipNivelCentroCosto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNivelCentroCosto.setToolTipText(sToolTipNivelCentroCosto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNivelCentroCosto);
		this.jTableDatosNivelCentroCosto.setAutoCreateRowSorter(true);
		this.jTableDatosNivelCentroCosto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNivelCentroCosto.setRowSelectionAllowed(true);
		this.jTableDatosNivelCentroCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNivelCentroCosto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNivelCentroCosto = new JButtonMe();
		this.jButtonDuplicarNivelCentroCosto = new JButtonMe();
		this.jButtonCopiarNivelCentroCosto = new JButtonMe();
		this.jButtonVerFormNivelCentroCosto = new JButtonMe();
		this.jButtonNuevoRelacionesNivelCentroCosto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNivelCentroCosto = new JButtonMe();
		this.jButtonCerrarNivelCentroCosto = new JButtonMe();
		
		this.jScrollPanelDatosNivelCentroCosto = new JScrollPane();   
        this.jScrollPanelDatosGeneralNivelCentroCosto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNivelCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Nivel Centro Costo";
		
		if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Centro Costos" + this.sPath));
		} else {
			this.jScrollPanelDatosNivelCentroCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNivelCentroCosto.setToolTipText("Acciones");
        this.jPanelAccionesNivelCentroCosto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoNivelCentroCosto=new ReporteDinamicoJInternalFrame(NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNivelCentroCosto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNivelCentroCosto=new ImportacionJInternalFrame(NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNivelCentroCosto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNivelCentroCosto = new JButtonMe();
		
		this.jButtonAbrirOrderByNivelCentroCosto.setText("Orden");
		this.jButtonAbrirOrderByNivelCentroCosto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNivelCentroCosto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNivelCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNivelCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelCentroCosto,false,this);
			
			//this.cargarOrderByNivelCentroCosto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNivelCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelCentroCosto,true,this);
			
			//this.cargarOrderByNivelCentroCosto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNivelCentroCosto.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosNivelCentroCosto.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosNivelCentroCosto.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosNivelCentroCosto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNivelCentroCosto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNivelCentroCosto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNivelCentroCosto.setText("Nuevo");
		this.jButtonDuplicarNivelCentroCosto.setText("Duplicar");
		this.jButtonCopiarNivelCentroCosto.setText("Copiar");
		this.jButtonVerFormNivelCentroCosto.setText("Ver");
		this.jButtonNuevoRelacionesNivelCentroCosto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNivelCentroCosto.setText("Guardar");
		this.jButtonCerrarNivelCentroCosto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNivelCentroCosto,"nuevo_button","Nuevo",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNivelCentroCosto,"duplicar_button","Duplicar",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNivelCentroCosto,"copiar_button","Copiar",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNivelCentroCosto,"ver_form","Ver",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNivelCentroCosto,"nuevorelaciones_button","Nuevo Rel",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNivelCentroCosto,"guardarcambiostabla_button","Guardar",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNivelCentroCosto,"cerrar_button","Salir",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNivelCentroCosto.setToolTipText("Nuevo"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNivelCentroCosto.setToolTipText("Duplicar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNivelCentroCosto.setToolTipText("Copiar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNivelCentroCosto.setToolTipText("Ver"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNivelCentroCosto.setToolTipText("Nuevo Rel"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNivelCentroCosto.setToolTipText("Guardar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNivelCentroCosto.setToolTipText("Salir"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNivelCentroCosto";
		inputMap = this.jButtonNuevoNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNivelCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNivelCentroCosto"));
		
		//DUPLICAR
		sMapKey = "DuplicarNivelCentroCosto";
		inputMap = this.jButtonDuplicarNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNivelCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNivelCentroCosto"));
		
		//COPIAR
		sMapKey = "CopiarNivelCentroCosto";
		inputMap = this.jButtonCopiarNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNivelCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNivelCentroCosto"));
		
		//VEr FORM
		sMapKey = "VerFormNivelCentroCosto";
		inputMap = this.jButtonVerFormNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNivelCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNivelCentroCosto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNivelCentroCosto";
		inputMap = this.jButtonNuevoRelacionesNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNivelCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNivelCentroCosto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNivelCentroCosto";
		inputMap = this.jButtonModificarNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNivelCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNivelCentroCosto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNivelCentroCosto";
		inputMap = this.jButtonCerrarNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNivelCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNivelCentroCosto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNivelCentroCosto";
		inputMap = this.jButtonGuardarCambiosTablaNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNivelCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNivelCentroCosto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNivelCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNivelCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNivelCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1NivelCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2NivelCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3NivelCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4NivelCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5NivelCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNivelCentroCosto.setName("jPanelParametrosReportesNivelCentroCosto"); 
		
		this.jPanelParametrosReportesAccionesNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNivelCentroCosto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNivelCentroCosto.setName("jPanelParametrosReportesAccionesNivelCentroCosto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNivelCentroCosto = new JButtonMe();
		this.jButtonRecargarInformacionNivelCentroCosto.setText("Recargar");
		this.jButtonRecargarInformacionNivelCentroCosto.setToolTipText("Recargar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNivelCentroCosto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionNivelCentroCosto = new JButtonMe();
		this.jButtonProcesarInformacionNivelCentroCosto.setText("Procesar");
		this.jButtonProcesarInformacionNivelCentroCosto.setToolTipText("Procesar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNivelCentroCosto.setVisible(false);
			
		this.jButtonProcesarInformacionNivelCentroCosto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNivelCentroCosto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNivelCentroCosto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNivelCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNivelCentroCosto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNivelCentroCosto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNivelCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNivelCentroCosto.setText("TIPO");       
		this.jComboBoxTiposReportesNivelCentroCosto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNivelCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNivelCentroCosto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNivelCentroCosto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNivelCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNivelCentroCosto.setText("Paginacion");
		this.jComboBoxTiposPaginacionNivelCentroCosto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNivelCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNivelCentroCosto.setText("Accion");
		this.jComboBoxTiposRelacionesNivelCentroCosto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNivelCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNivelCentroCosto.setText("Accion");
		this.jComboBoxTiposAccionesNivelCentroCosto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNivelCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNivelCentroCosto.setText("Accion");
		this.jComboBoxTiposSeleccionarNivelCentroCosto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNivelCentroCosto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNivelCentroCosto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNivelCentroCosto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNivelCentroCosto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNivelCentroCosto = new JLabelMe();
		
		this.jLabelAccionesNivelCentroCosto.setText("Acciones");		
		this.jLabelAccionesNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNivelCentroCosto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNivelCentroCosto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNivelCentroCosto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNivelCentroCosto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNivelCentroCosto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNivelCentroCosto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNivelCentroCosto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNivelCentroCosto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNivelCentroCosto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNivelCentroCosto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNivelCentroCosto.setText("Graf.");
		this.jCheckBoxConGraficoReporteNivelCentroCosto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNivelCentroCosto = new JButtonMe();
		//this.jButtonAnterioresNivelCentroCosto.setText("<<");
        this.jButtonAnterioresNivelCentroCosto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNivelCentroCosto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNivelCentroCosto = new JButtonMe();
		//this.jButtonSiguientesNivelCentroCosto.setText(">>");
        this.jButtonSiguientesNivelCentroCosto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNivelCentroCosto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNivelCentroCosto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNivelCentroCosto.setText("Nue");
        this.jButtonNuevoGuardarCambiosNivelCentroCosto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNivelCentroCosto,"nuevoguardarcambios_button","Nue",this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNivelCentroCosto";
		inputMap = this.jButtonNuevoGuardarCambiosNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNivelCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNivelCentroCosto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNivelCentroCosto";
		inputMap = this.jButtonRecargarInformacionNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNivelCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNivelCentroCosto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNivelCentroCosto";
		inputMap = this.jButtonSiguientesNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNivelCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNivelCentroCosto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNivelCentroCosto";
		inputMap = this.jButtonAnterioresNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNivelCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNivelCentroCosto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNivelCentroCosto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNivelCentroCosto.setMinimumSize(new Dimension(this.getWidth(),NivelCentroCostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NivelCentroCostoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNivelCentroCosto.setMaximumSize(new Dimension(this.getWidth(),NivelCentroCostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NivelCentroCostoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNivelCentroCosto.setPreferredSize(new Dimension(this.getWidth(),NivelCentroCostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NivelCentroCostoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNivelCentroCosto = new GridBagLayout();

			this.jPanelPaginacionNivelCentroCosto.setLayout(gridaBagLayoutPaginacionNivelCentroCosto);						
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.gridy = 0;
			this.gridBagConstraintsNivelCentroCosto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNivelCentroCosto.add(this.jButtonAnterioresNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
					
						
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNivelCentroCosto.gridy = 0;
			
			this.jPanelPaginacionNivelCentroCosto.add(this.jButtonNuevoGuardarCambiosNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
						
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNivelCentroCosto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNivelCentroCosto.gridy = 0;
			this.jPanelPaginacionNivelCentroCosto.add(this.jButtonSiguientesNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.gridy = 1;
			this.gridBagConstraintsNivelCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelCentroCosto.add(this.jButtonNuevoNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
						
			
			
			if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
				this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNivelCentroCosto.gridy = 1;
				this.gridBagConstraintsNivelCentroCosto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionNivelCentroCosto.add(this.jButtonGuardarCambiosTablaNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
			}
			
			
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.gridy = 1;
			this.gridBagConstraintsNivelCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelCentroCosto.add(this.jButtonDuplicarNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.gridy = 1;
			this.gridBagConstraintsNivelCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelCentroCosto.add(this.jButtonCopiarNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.gridy = 1;
			this.gridBagConstraintsNivelCentroCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelCentroCosto.add(this.jButtonVerFormNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.gridy = 1;
			this.gridBagConstraintsNivelCentroCosto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNivelCentroCosto.add(this.jButtonCerrarNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		
		
		
		this.jButtonRecargarInformacionNivelCentroCosto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNivelCentroCosto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNivelCentroCosto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNivelCentroCosto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNivelCentroCosto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNivelCentroCosto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNivelCentroCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNivelCentroCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNivelCentroCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNivelCentroCosto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNivelCentroCosto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNivelCentroCosto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNivelCentroCosto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNivelCentroCosto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNivelCentroCosto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNivelCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNivelCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNivelCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNivelCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNivelCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNivelCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNivelCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNivelCentroCosto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNivelCentroCosto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNivelCentroCosto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNivelCentroCosto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNivelCentroCosto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNivelCentroCosto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNivelCentroCosto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNivelCentroCosto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNivelCentroCosto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNivelCentroCosto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNivelCentroCosto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNivelCentroCosto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNivelCentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNivelCentroCosto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1NivelCentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2NivelCentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3NivelCentroCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4NivelCentroCosto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNivelCentroCosto.setLayout(gridaBagParametrosReportesNivelCentroCosto);
			this.jPanelParametrosReportesAccionesNivelCentroCosto.setLayout(gridaBagParametrosReportesAccionesNivelCentroCosto);
			
			
			this.jPanelParametrosAuxiliar1NivelCentroCosto.setLayout(gridaBagParametrosAuxiliar1NivelCentroCosto);
			this.jPanelParametrosAuxiliar2NivelCentroCosto.setLayout(gridaBagParametrosAuxiliar2NivelCentroCosto);
			this.jPanelParametrosAuxiliar3NivelCentroCosto.setLayout(gridaBagParametrosAuxiliar3NivelCentroCosto);
			this.jPanelParametrosAuxiliar4NivelCentroCosto.setLayout(gridaBagParametrosAuxiliar4NivelCentroCosto);
			//this.jPanelParametrosAuxiliar5NivelCentroCosto.setLayout(gridaBagParametrosAuxiliar2NivelCentroCosto);			
			
			
			
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNivelCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelCentroCosto.add(this.jButtonRecargarInformacionNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCentroCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NivelCentroCosto.add(this.jComboBoxTiposPaginacionNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCentroCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NivelCentroCosto.add(this.jCheckBoxConAltoMaximoTablaNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCentroCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NivelCentroCosto.add(this.jComboBoxTiposArchivosReportesNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelCentroCosto.add(this.jPanelParametrosAuxiliar1NivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNivelCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4NivelCentroCosto.add(this.jComboBoxTiposReportesNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelCentroCosto.add(this.jPanelParametrosAuxiliar4NivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCentroCosto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelCentroCosto.add(this.jComboBoxTiposReportesNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCentroCosto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNivelCentroCosto.add(this.jCheckBoxGenerarReporteNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelCentroCosto.add(this.jPanelParametrosAuxiliar2NivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNivelCentroCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNivelCentroCosto.add(this.jLabelAccionesNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
				this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsNivelCentroCosto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesNivelCentroCosto.add(this.jButtonAbrirOrderByNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelCentroCosto.add(this.jComboBoxTiposSeleccionarNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);			
			
			
			/*
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNivelCentroCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNivelCentroCosto.add(this.jCheckBoxSeleccionarTodosNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNivelCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NivelCentroCosto.add(this.jCheckBoxSeleccionarTodosNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);															
				
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNivelCentroCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NivelCentroCosto.add(this.jCheckBoxSeleccionadosNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCentroCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelCentroCosto.add(this.jPanelParametrosAuxiliar3NivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelCentroCosto.add(this.jComboBoxTiposAccionesNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
	
				
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCentroCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelCentroCosto.add(this.jTextFieldValorCampoGeneralNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNivelCentroCosto = new GridBagLayout();

			this.jScrollPanelDatosNivelCentroCosto.setLayout(gridaBagLayoutDatosNivelCentroCosto);
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.gridy = 0;
			this.gridBagConstraintsNivelCentroCosto.gridx = 0;
			
			this.jScrollPanelDatosNivelCentroCosto.add(this.jTableDatosNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNivelCentroCosto.setViewportView(this.jTableDatosNivelCentroCosto);
		this.jTableDatosNivelCentroCosto.setFillsViewportHeight(true);
		this.jTableDatosNivelCentroCosto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNivelCentroCosto= new GridBagLayout();
		this.jPanelAccionesNivelCentroCosto.setLayout(gridaBagLayoutAccionesNivelCentroCosto);
		
		
		/*	
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = 0;
		this.gridBagConstraintsNivelCentroCosto.gridx = 0;
			
		this.jPanelAccionesNivelCentroCosto.add(this.jButtonNuevoNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNivelCentroCosto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNivelCentroCosto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();						
			this.gridBagConstraintsNivelCentroCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNivelCentroCosto.gridx = 0;		
			//this.gridBagConstraintsNivelCentroCosto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNivelCentroCosto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNivelCentroCosto.gridx = 0;		
		//this.gridBagConstraintsNivelCentroCosto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCentroCosto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNivelCentroCosto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNivelCentroCosto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCentroCosto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);								
		
		
		/*
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCentroCosto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		*/		
		
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNivelCentroCosto.gridx =0;
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNivelCentroCosto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
				
		
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCentroCosto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(NivelCentroCostoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNivelCentroCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNivelCentroCosto = new GridBagLayout();
			this.jPanelBusquedasParametrosNivelCentroCosto.setLayout(gridaBagLayoutBusquedasParametrosNivelCentroCosto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNivelCentroCosto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNivelCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
			
			
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		
			
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNivelCentroCosto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNivelCentroCosto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNivelCentroCosto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNivelCentroCosto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNivelCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNivelCentroCosto.setName("jPanelReporteDinamicoNivelCentroCosto"); 
		
		this.jPanelReporteDinamicoNivelCentroCosto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNivelCentroCosto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNivelCentroCosto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNivelCentroCosto.setLayout(gridaBagLayoutReporteDinamicoNivelCentroCosto);
		
		
		this.jInternalFrameReporteDinamicoNivelCentroCosto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNivelCentroCosto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNivelCentroCosto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNivelCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNivelCentroCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNivelCentroCosto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNivelCentroCosto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNivelCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNivelCentroCosto.setResizable(true);
	    this.jInternalFrameReporteDinamicoNivelCentroCosto.setClosable(true);
	    this.jInternalFrameReporteDinamicoNivelCentroCosto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNivelCentroCosto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNivelCentroCosto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNivelCentroCosto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Centro Costos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNivelCentroCosto = new JLabelMe();

		this.jLabelColumnasSelectReporteNivelCentroCosto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNivelCentroCosto.add(this.jLabelColumnasSelectReporteNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNivelCentroCosto = new JList<Reporte>();
		this.jListColumnasSelectReporteNivelCentroCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNivelCentroCosto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNivelCentroCosto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNivelCentroCosto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNivelCentroCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNivelCentroCosto=new JScrollPane(this.jListColumnasSelectReporteNivelCentroCosto);
			
			this.jScrollColumnasSelectReporteNivelCentroCosto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNivelCentroCosto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNivelCentroCosto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNivelCentroCosto.add(this.jListColumnasSelectReporteNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		this.jPanelReporteDinamicoNivelCentroCosto.add(this.jScrollColumnasSelectReporteNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNivelCentroCosto = new JLabelMe();

		this.jLabelRelacionesSelectReporteNivelCentroCosto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNivelCentroCosto = new JList<Reporte>();
		this.jListRelacionesSelectReporteNivelCentroCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNivelCentroCosto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNivelCentroCosto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNivelCentroCosto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNivelCentroCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNivelCentroCosto=new JScrollPane(this.jListRelacionesSelectReporteNivelCentroCosto);
			
			this.jScrollRelacionesSelectReporteNivelCentroCosto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNivelCentroCosto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNivelCentroCosto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoNivelCentroCosto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNivelCentroCosto = new JComboBoxMe();
		this.jListColumnasValoresGraficoNivelCentroCosto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNivelCentroCosto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNivelCentroCosto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNivelCentroCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNivelCentroCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNivelCentroCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNivelCentroCosto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNivelCentroCosto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNivelCentroCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNivelCentroCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNivelCentroCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNivelCentroCosto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNivelCentroCosto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNivelCentroCosto.add(this.jLabelGenerarExcelReporteDinamicoNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNivelCentroCosto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNivelCentroCosto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNivelCentroCosto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNivelCentroCosto.setToolTipText("Generar EXCEL"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNivelCentroCosto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNivelCentroCosto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNivelCentroCosto.add(this.jButtonGenerarExcelReporteDinamicoNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelCentroCosto.add(this.jComboBoxTiposReportesDinamicoNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNivelCentroCosto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNivelCentroCosto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNivelCentroCosto.add(this.jLabelTiposArchivoReporteDinamicoNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelCentroCosto.add(this.jComboBoxTiposArchivosReportesDinamicoNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNivelCentroCosto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNivelCentroCosto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNivelCentroCosto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNivelCentroCosto.setToolTipText("Generar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelCentroCosto.add(this.jButtonGenerarReporteDinamicoNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNivelCentroCosto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNivelCentroCosto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNivelCentroCosto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNivelCentroCosto.setToolTipText("Cancelar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelCentroCosto.add(this.jButtonCerrarReporteDinamicoNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNivelCentroCosto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNivelCentroCosto= new JScrollPane(jPanelReporteDinamicoNivelCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNivelCentroCosto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNivelCentroCosto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNivelCentroCosto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Centro Costos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNivelCentroCosto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNivelCentroCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNivelCentroCosto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNivelCentroCosto);
		this.jInternalFrameReporteDinamicoNivelCentroCosto.getContentPane().add(this.jScrollPanelReporteDinamicoNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNivelCentroCosto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNivelCentroCosto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNivelCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNivelCentroCosto.setName("jPanelImportacionNivelCentroCosto"); 
		
		this.jPanelImportacionNivelCentroCosto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNivelCentroCosto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNivelCentroCosto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNivelCentroCosto.setLayout(gridaBagLayoutImportacionNivelCentroCosto);
		
		
		this.jInternalFrameImportacionNivelCentroCosto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNivelCentroCosto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNivelCentroCosto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNivelCentroCosto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNivelCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNivelCentroCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNivelCentroCosto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNivelCentroCosto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNivelCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNivelCentroCosto.setResizable(true);
	    this.jInternalFrameImportacionNivelCentroCosto.setClosable(true);
	    this.jInternalFrameImportacionNivelCentroCosto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNivelCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNivelCentroCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNivelCentroCosto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNivelCentroCosto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNivelCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNivelCentroCosto.setResizable(true);
	    this.jInternalFrameImportacionNivelCentroCosto.setClosable(true);
	    this.jInternalFrameImportacionNivelCentroCosto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNivelCentroCosto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNivelCentroCosto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNivelCentroCosto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Centro Costos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNivelCentroCosto = new JLabelMe();

		this.jLabelArchivoImportacionNivelCentroCosto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = iPosYImportacion;		
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNivelCentroCosto.add(this.jLabelArchivoImportacionNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNivelCentroCosto = new JFileChooser();		
		this.jFileChooserImportacionNivelCentroCosto.setToolTipText("ESCOGER ARCHIVO"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNivelCentroCosto = new JButtonMe();
		this.jButtonAbrirImportacionNivelCentroCosto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNivelCentroCosto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNivelCentroCosto.setToolTipText("Generar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelCentroCosto.add(this.jButtonAbrirImportacionNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNivelCentroCosto = new JLabelMe();

		this.jLabelPathArchivoImportacionNivelCentroCosto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNivelCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNivelCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNivelCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = iPosYImportacion;		
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNivelCentroCosto.add(this.jLabelPathArchivoImportacionNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNivelCentroCosto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNivelCentroCosto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNivelCentroCosto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNivelCentroCosto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelCentroCosto.add(this.jTextFieldPathArchivoImportacionNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNivelCentroCosto = new JButtonMe();
		this.jButtonGenerarImportacionNivelCentroCosto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNivelCentroCosto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNivelCentroCosto.setToolTipText("Generar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelCentroCosto.add(this.jButtonGenerarImportacionNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNivelCentroCosto = new JButtonMe();
		this.jButtonCerrarImportacionNivelCentroCosto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNivelCentroCosto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNivelCentroCosto.setToolTipText("Cancelar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCentroCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelCentroCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelCentroCosto.add(this.jButtonCerrarImportacionNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNivelCentroCosto = new GridBagLayout();
		
		this.jScrollPanelImportacionNivelCentroCosto= new JScrollPane(jPanelImportacionNivelCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsNivelCentroCosto.gridy =iPosYImportacion;
		this.gridBagConstraintsNivelCentroCosto.gridx =iPosXImportacion;
		this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNivelCentroCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNivelCentroCosto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNivelCentroCosto);
		this.jInternalFrameImportacionNivelCentroCosto.getContentPane().add(this.jScrollPanelImportacionNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNivelCentroCosto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNivelCentroCosto = new JButtonMe();
			this.jButtonAbrirOrderByNivelCentroCosto.setText("Orden");
			this.jButtonAbrirOrderByNivelCentroCosto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNivelCentroCosto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNivelCentroCosto";
			inputMap = this.jButtonAbrirOrderByNivelCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNivelCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNivelCentroCosto"));
		
		
			GridBagLayout gridaBagLayoutOrderByNivelCentroCosto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNivelCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNivelCentroCosto.setName("jPanelOrderByNivelCentroCosto"); 
			
			this.jPanelOrderByNivelCentroCosto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNivelCentroCosto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNivelCentroCosto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNivelCentroCosto.setLayout(gridaBagLayoutOrderByNivelCentroCosto);
			
			
			this.jTableDatosNivelCentroCostoOrderBy = new JTableMe();        
			this.jTableDatosNivelCentroCostoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNivelCentroCostoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNivelCentroCostoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNivelCentroCostoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNivelCentroCostoOrderBy.setViewportView(this.jTableDatosNivelCentroCostoOrderBy);
			this.jTableDatosNivelCentroCostoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNivelCentroCostoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNivelCentroCosto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNivelCentroCosto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNivelCentroCosto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNivelCentroCosto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNivelCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNivelCentroCosto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNivelCentroCosto.setTitle("Orden");
			this.jInternalFrameOrderByNivelCentroCosto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNivelCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNivelCentroCosto.setResizable(true);
			this.jInternalFrameOrderByNivelCentroCosto.setClosable(true);
			this.jInternalFrameOrderByNivelCentroCosto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNivelCentroCosto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNivelCentroCosto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNivelCentroCosto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNivelCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Centro Costos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNivelCentroCosto.gridx =iPosXOrderBy;
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNivelCentroCosto.ipady =150;
				
			this.jPanelOrderByNivelCentroCosto.add(jScrollPanelDatosNivelCentroCostoOrderBy, this.gridBagConstraintsNivelCentroCosto);//this.jTableDatosNivelCentroCostoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNivelCentroCosto = new JButtonMe();
			this.jButtonCerrarOrderByNivelCentroCosto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNivelCentroCosto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNivelCentroCosto.setToolTipText("Cancelar"+" "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNivelCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCentroCosto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNivelCentroCosto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNivelCentroCosto.add(this.jButtonCerrarOrderByNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNivelCentroCosto = new GridBagLayout();
			
			this.jScrollPanelOrderByNivelCentroCosto= new JScrollPane(jPanelOrderByNivelCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNivelCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsNivelCentroCosto.gridy =iPosYOrderBy;
			this.gridBagConstraintsNivelCentroCosto.gridx =iPosXOrderBy;
			this.gridBagConstraintsNivelCentroCosto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNivelCentroCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNivelCentroCosto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNivelCentroCosto);
			
			this.jInternalFrameOrderByNivelCentroCosto.getContentPane().add(this.jScrollPanelOrderByNivelCentroCosto, this.gridBagConstraintsNivelCentroCosto);			
		
		} else {
			this.jButtonAbrirOrderByNivelCentroCosto = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.nivelcentrocostoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNivelCentroCosto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNivelCentroCosto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNivelCentroCosto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosNivelCentroCosto.getRowHeight();//NivelCentroCostoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NivelCentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNivelCentroCosto.isSelected()) {
					iHeightTable=NivelCentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NivelCentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NivelCentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NivelCentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNivelCentroCosto.isSelected()) {
					iHeightTable=NivelCentroCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NivelCentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NivelCentroCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNivelCentroCosto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNivelCentroCosto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNivelCentroCosto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNivelCentroCosto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNivelCentroCosto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNivelCentroCosto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNivelCentroCosto!=null && this.jInternalFrameOrderByNivelCentroCosto.getjTableDatosOrderBy()!=null) {
			//if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNivelCentroCosto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNivelCentroCosto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNivelCentroCosto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNivelCentroCosto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNivelCentroCosto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNivelCentroCosto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNivelCentroCosto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNivelCentroCosto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNivelCentroCosto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNivelCentroCosto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=nivelcentrocostoLogic.getNivelCentroCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=nivelcentrocostos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<NivelCentroCosto> TraerNivelCentroCostoBeans(List<NivelCentroCosto> nivelcentrocostos,ArrayList<Classe> classes)throws Exception {
		try {
			for(NivelCentroCosto nivelcentrocosto:nivelcentrocostos) {
					
				if(!(NivelCentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NivelCentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					nivelcentrocosto.setsDetalleGeneralEntityReporte(NivelCentroCostoConstantesFunciones.getNivelCentroCostoDescripcion(nivelcentrocosto));
										
						
					
						
					
				} else  {
							
					//nivelcentrocosto.setsDetalleGeneralEntityReporte(nivelcentrocosto.getsDetalleGeneralEntityReporte());
										
				}
				
				//nivelcentrocostobeans.add(nivelcentrocostobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return nivelcentrocostos;
    }
	//PARA REPORTES FIN
}
