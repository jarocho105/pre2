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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.ProcesoImpuestoRentaConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class ProcesoImpuestoRentaJInternalFrame extends ProcesoImpuestoRentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoImpuestoRenta;
	
	protected JMenuBar jmenuBarProcesoImpuestoRenta;
	
	protected JMenu jmenuProcesoImpuestoRenta;
	protected JMenu jmenuDatosProcesoImpuestoRenta;
	protected JMenu jmenuArchivoProcesoImpuestoRenta;
	protected JMenu jmenuAccionesProcesoImpuestoRenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoImpuestoRenta;	
	protected GridBagConstraints gridBagConstraintsProcesoImpuestoRenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoImpuestoRentaDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoImpuestoRenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoImpuestoRenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoImpuestoRenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";
	
	public ProcesoImpuestoRentaSessionBean procesoimpuestorentaSessionBean;
		
	
	
	public AnioSessionBean anioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoImpuestoRenta> procesoimpuestorentas;		
	public List<ProcesoImpuestoRenta> procesoimpuestorentasEliminados;	
	public List<ProcesoImpuestoRenta> procesoimpuestorentasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoImpuestoRenta;		
	protected JButton jButtonAbrirOrderByProcesoImpuestoRenta;
	
	
	//protected JPanel jPanelOrderByProcesoImpuestoRenta;
	//public JScrollPane jScrollPanelOrderByProcesoImpuestoRenta;	
	//protected JButton jButtonCerrarOrderByProcesoImpuestoRenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoImpuestoRentaLogic procesoimpuestorentaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoImpuestoRenta;
	public JScrollPane jScrollPanelDatosEdicionProcesoImpuestoRenta;
	public JScrollPane jScrollPanelDatosGeneralProcesoImpuestoRenta;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoImpuestoRentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoImpuestoRenta;
	//public JScrollPane jScrollPanelImportacionProcesoImpuestoRenta;
	
	
	
	protected JPanel jPanelAccionesProcesoImpuestoRenta;
	
    protected JPanel jPanelPaginacionProcesoImpuestoRenta;
    protected JPanel jPanelParametrosReportesProcesoImpuestoRenta;
	protected JPanel jPanelParametrosReportesAccionesProcesoImpuestoRenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoImpuestoRenta;
	protected JPanel jPanelParametrosAuxiliar2ProcesoImpuestoRenta;
	protected JPanel jPanelParametrosAuxiliar3ProcesoImpuestoRenta;
	protected JPanel jPanelParametrosAuxiliar4ProcesoImpuestoRenta;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoImpuestoRenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoImpuestoRenta;
	//protected JPanel jPanelImportacionProcesoImpuestoRenta;
	
	
	public JTable jTableDatosProcesoImpuestoRenta;
	
	
	
	//public JTable jTableDatosProcesoImpuestoRentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoImpuestoRenta;
	protected JButton jButtonDuplicarProcesoImpuestoRenta;
	protected JButton jButtonCopiarProcesoImpuestoRenta;
	protected JButton jButtonVerFormProcesoImpuestoRenta;
	protected JButton jButtonNuevoRelacionesProcesoImpuestoRenta;
	protected JButton jButtonModificarProcesoImpuestoRenta;
	
    protected JButton jButtonGuardarCambiosTablaProcesoImpuestoRenta;
	protected JButton jButtonCerrarProcesoImpuestoRenta;
	
	
	protected JButton jButtonRecargarInformacionProcesoImpuestoRenta;
	protected JButton jButtonProcesarInformacionProcesoImpuestoRenta;
	
	
	protected JButton jButtonAnterioresProcesoImpuestoRenta;
	protected JButton jButtonSiguientesProcesoImpuestoRenta;
	protected JButton jButtonNuevoGuardarCambiosProcesoImpuestoRenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoImpuestoRenta;
	//protected JButton jButtonCerrarReporteDinamicoProcesoImpuestoRenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoImpuestoRenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoImpuestoRenta;
	//protected JButton jButtonGenerarImportacionProcesoImpuestoRenta;
	//protected JButton jButtonCerrarImportacionProcesoImpuestoRenta;
	//protected JFileChooser jFileChooserImportacionProcesoImpuestoRenta;
	//protected File fileImportacionProcesoImpuestoRenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoImpuestoRenta;
	protected JButton jButtonDuplicarToolBarProcesoImpuestoRenta;
	protected JButton jButtonNuevoRelacionesToolBarProcesoImpuestoRenta;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoImpuestoRenta;
	protected JButton jButtonCopiarToolBarProcesoImpuestoRenta;
	protected JButton jButtonVerFormToolBarProcesoImpuestoRenta;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoImpuestoRenta;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoImpuestoRenta;
	protected JButton jButtonCerrarToolBarProcesoImpuestoRenta;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoImpuestoRenta;
	protected JButton jButtonProcesarInformacionToolBarProcesoImpuestoRenta;
	protected JButton jButtonAnterioresToolBarProcesoImpuestoRenta;
	protected JButton jButtonSiguientesToolBarProcesoImpuestoRenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoImpuestoRenta;
	protected JButton jButtonAbrirOrderByToolBarProcesoImpuestoRenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoImpuestoRenta;
	protected JMenuItem jMenuItemDuplicarProcesoImpuestoRenta;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoImpuestoRenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoImpuestoRenta;
	protected JMenuItem jMenuItemCopiarProcesoImpuestoRenta;
	protected JMenuItem jMenuItemVerFormProcesoImpuestoRenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoImpuestoRenta;
	protected JMenuItem jMenuItemCerrarProcesoImpuestoRenta;
	protected JMenuItem jMenuItemDetalleCerrarProcesoImpuestoRenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoImpuestoRenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoImpuestoRenta;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoImpuestoRenta;
	protected JMenuItem jMenuItemProcesarInformacionProcesoImpuestoRenta;
	protected JMenuItem jMenuItemAnterioresProcesoImpuestoRenta;
	protected JMenuItem jMenuItemSiguientesProcesoImpuestoRenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoImpuestoRenta;
	protected JMenuItem jMenuItemAbrirOrderByProcesoImpuestoRenta;
	protected JMenuItem jMenuItemMostrarOcultarProcesoImpuestoRenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoImpuestoRenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoImpuestoRenta;
	protected JCheckBox jCheckBoxSeleccionadosProcesoImpuestoRenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoImpuestoRenta;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoImpuestoRenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoImpuestoRenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoImpuestoRenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoImpuestoRenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoImpuestoRenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoImpuestoRenta;
	protected JTextField jTextFieldValorCampoGeneralProcesoImpuestoRenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoImpuestoRenta;
	//public JList<Reporte> jListColumnasSelectReporteProcesoImpuestoRenta;
	//public JScrollPane jScrollColumnasSelectReporteProcesoImpuestoRenta;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoImpuestoRenta;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoImpuestoRenta;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoImpuestoRenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoImpuestoRenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoImpuestoRenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoImpuestoRenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoImpuestoRenta;
	
		
	//public JLabel jLabelArchivoImportacionProcesoImpuestoRenta;	
	//public JLabel jLabelPathArchivoImportacionProcesoImpuestoRenta;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoImpuestoRenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoImpuestoRenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoImpuestoRenta;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoImpuestoRenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoImpuestoRenta;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoImpuestoRenta;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoImpuestoRenta;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoImpuestoRenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoImpuestoRenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoImpuestoRenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoImpuestoRenta;
	public JPanel jPanelBusquedaProcesoImpuestoRentaProcesoImpuestoRenta;
	public JButton jButtonBusquedaProcesoImpuestoRentaProcesoImpuestoRenta;
	
	public JPanel jPanelid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta;
	public JLabel jLabelid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta;
	public JButton jButtonid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRentaUpdate= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRentaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	//public int iHeightFormulario=198;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoImpuestoRentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoImpuestoRentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoImpuestoRentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoImpuestoRentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoImpuestoRenta)	{
		this.jButtonRecargarInformacionProcesoImpuestoRenta = jButtonRecargarInformacionProcesoImpuestoRenta;
	}
	
	public JButton getjButtonProcesarInformacionProcesoImpuestoRenta() {
		return this.jButtonProcesarInformacionProcesoImpuestoRenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoImpuestoRenta)	{
		this.jButtonProcesarInformacionProcesoImpuestoRenta = jButtonProcesarInformacionProcesoImpuestoRenta;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoImpuestoRenta() {
		return this.jButtonRecargarInformacionProcesoImpuestoRenta;
	}
	
	
	public List<ProcesoImpuestoRenta> getprocesoimpuestorentas() {
		return this.procesoimpuestorentas;
	}

	public void setprocesoimpuestorentas(List<ProcesoImpuestoRenta> procesoimpuestorentas) {
		this.procesoimpuestorentas = procesoimpuestorentas;
	}
	
	public List<ProcesoImpuestoRenta> getprocesoimpuestorentasAux() {
		return this.procesoimpuestorentasAux;
	}

	public void setprocesoimpuestorentasAux(List<ProcesoImpuestoRenta> procesoimpuestorentasAux) {
		this.procesoimpuestorentasAux = procesoimpuestorentasAux;
	}
	
	public List<ProcesoImpuestoRenta> getprocesoimpuestorentasEliminados() {
		return this.procesoimpuestorentasEliminados;
	}

	public void setProcesoImpuestoRentasEliminados(List<ProcesoImpuestoRenta> procesoimpuestorentasEliminados) {
		this.procesoimpuestorentasEliminados = procesoimpuestorentasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoImpuestoRenta() {
		return jComboBoxTiposSeleccionarProcesoImpuestoRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoImpuestoRenta(
			JComboBox jComboBoxTiposSeleccionarProcesoImpuestoRenta) {
		this.jComboBoxTiposSeleccionarProcesoImpuestoRenta = jComboBoxTiposSeleccionarProcesoImpuestoRenta;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoImpuestoRenta() {
		return jTextFieldValorCampoGeneralProcesoImpuestoRenta;
	}

	public void setjTextFieldValorCampoGeneralProcesoImpuestoRenta(
			JTextField jTextFieldValorCampoGeneralProcesoImpuestoRenta) {
		this.jTextFieldValorCampoGeneralProcesoImpuestoRenta = jTextFieldValorCampoGeneralProcesoImpuestoRenta;
	}

	public void setBorderResaltarValorCampoGeneralProcesoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoImpuestoRenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoImpuestoRenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoImpuestoRenta() {
		return this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta;
	}

	public void setjCheckBoxSeleccionarTodosProcesoImpuestoRenta(
			JCheckBox jCheckBoxSeleccionarTodosProcesoImpuestoRenta) {
		this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta = jCheckBoxSeleccionarTodosProcesoImpuestoRenta;
	}

	public void setBorderResaltarSeleccionarTodosProcesoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoImpuestoRenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoImpuestoRenta() {
		return this.jCheckBoxSeleccionadosProcesoImpuestoRenta;
	}

	public void setjCheckBoxSeleccionadosProcesoImpuestoRenta(
			JCheckBox jCheckBoxSeleccionadosProcesoImpuestoRenta) {
		this.jCheckBoxSeleccionadosProcesoImpuestoRenta = jCheckBoxSeleccionadosProcesoImpuestoRenta;
	}
	
	public void setBorderResaltarSeleccionadosProcesoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoImpuestoRenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoImpuestoRenta() {
		return this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoImpuestoRenta(
			JComboBox jComboBoxTiposArchivosReportesProcesoImpuestoRenta) {
		this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta = jComboBoxTiposArchivosReportesProcesoImpuestoRenta;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoImpuestoRenta() {
		return this.jComboBoxTiposReportesProcesoImpuestoRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoImpuestoRenta(
			JComboBox jComboBoxTiposReportesProcesoImpuestoRenta) {
		this.jComboBoxTiposReportesProcesoImpuestoRenta = jComboBoxTiposReportesProcesoImpuestoRenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoImpuestoRenta() {
	//	return jComboBoxTiposReportesDinamicoProcesoImpuestoRenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoImpuestoRenta(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoImpuestoRenta) {
	//	this.jComboBoxTiposReportesDinamicoProcesoImpuestoRenta = jComboBoxTiposReportesDinamicoProcesoImpuestoRenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoImpuestoRenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoImpuestoRenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoImpuestoRenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoImpuestoRenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoImpuestoRenta = jComboBoxTiposArchivosReportesDinamicoProcesoImpuestoRenta;
	//}
	
	public void setBorderResaltarTiposReportesProcesoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoImpuestoRenta() {
		return this.jComboBoxTiposGraficosReportesProcesoImpuestoRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoImpuestoRenta(
			JComboBox jComboBoxTiposGraficosReportesProcesoImpuestoRenta) {
		this.jComboBoxTiposGraficosReportesProcesoImpuestoRenta = jComboBoxTiposGraficosReportesProcesoImpuestoRenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoImpuestoRenta() {
		return this.jComboBoxTiposPaginacionProcesoImpuestoRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoImpuestoRenta(
			JComboBox jComboBoxTiposPaginacionProcesoImpuestoRenta) {
		this.jComboBoxTiposPaginacionProcesoImpuestoRenta = jComboBoxTiposPaginacionProcesoImpuestoRenta;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoImpuestoRenta() {
		return this.jComboBoxTiposRelacionesProcesoImpuestoRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoImpuestoRenta() {
		return this.jComboBoxTiposAccionesProcesoImpuestoRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoImpuestoRenta(
			JComboBox jComboBoxTiposRelacionesProcesoImpuestoRenta) {
		this.jComboBoxTiposRelacionesProcesoImpuestoRenta = jComboBoxTiposRelacionesProcesoImpuestoRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoImpuestoRenta(
			JComboBox jComboBoxTiposAccionesProcesoImpuestoRenta) {
		this.jComboBoxTiposAccionesProcesoImpuestoRenta = jComboBoxTiposAccionesProcesoImpuestoRenta;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoImpuestoRenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoImpuestoRenta() {
	//	return jCheckBoxConGraficoDinamicoProcesoImpuestoRenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoImpuestoRenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoImpuestoRenta) {
	//	this.jCheckBoxConGraficoDinamicoProcesoImpuestoRenta = jCheckBoxConGraficoDinamicoProcesoImpuestoRenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoImpuestoRenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoImpuestoRenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoImpuestoRenta .setBorder(borderResaltar);		
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
		this.procesoimpuestorentaSessionBean=new ProcesoImpuestoRentaSessionBean();
		
		this.procesoimpuestorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoimpuestorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoImpuestoRentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Impuesto Renta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoImpuestoRentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoImpuestoRenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoImpuestoRenta,this.jTtoolBarProcesoImpuestoRenta,
							"nuevo","nuevo","Nuevo"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoImpuestoRenta,this.jTtoolBarProcesoImpuestoRenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoImpuestoRenta,this.jTtoolBarProcesoImpuestoRenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoImpuestoRenta,this.jTtoolBarProcesoImpuestoRenta,
							"duplicar","duplicar","Duplicar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoImpuestoRenta,this.jTtoolBarProcesoImpuestoRenta,
							"copiar","copiar","Copiar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoImpuestoRenta,this.jTtoolBarProcesoImpuestoRenta,
							"ver_form","ver_form","Ver"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoImpuestoRenta,this.jTtoolBarProcesoImpuestoRenta,
							"recargar","recargar","Procesar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoImpuestoRenta,this.jTtoolBarProcesoImpuestoRenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoImpuestoRenta,this.jTtoolBarProcesoImpuestoRenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoImpuestoRenta,this.jTtoolBarProcesoImpuestoRenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoImpuestoRenta,this.jTtoolBarProcesoImpuestoRenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoImpuestoRenta,this.jTtoolBarProcesoImpuestoRenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoImpuestoRenta,this.jTtoolBarProcesoImpuestoRenta,
							"cerrar","cerrar","Salir"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoImpuestoRenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoImpuestoRenta;
			
				this.jButtonProcesarInformacionToolBarProcesoImpuestoRenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoImpuestoRenta;
				
		//protected JButton jButtonModificarToolBarProcesoImpuestoRenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoImpuestoRenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoImpuestoRenta=new JMenuMe("General");
		this.jmenuArchivoProcesoImpuestoRenta=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoImpuestoRenta=new JMenuMe("Acciones");
		this.jmenuDatosProcesoImpuestoRenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoImpuestoRenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoImpuestoRenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoImpuestoRenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoImpuestoRenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoImpuestoRenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoImpuestoRenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoImpuestoRenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoImpuestoRenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoImpuestoRenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoImpuestoRenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoImpuestoRenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoImpuestoRenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoImpuestoRenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoImpuestoRenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoImpuestoRenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoImpuestoRenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoImpuestoRenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoImpuestoRenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoImpuestoRenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoImpuestoRenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoImpuestoRenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoImpuestoRenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoImpuestoRenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoImpuestoRenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoImpuestoRenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoImpuestoRenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoImpuestoRenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoImpuestoRenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoImpuestoRenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoImpuestoRenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoImpuestoRenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoImpuestoRenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoImpuestoRenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoImpuestoRenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoImpuestoRenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoImpuestoRenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoImpuestoRenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoImpuestoRenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoImpuestoRenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoImpuestoRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoImpuestoRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoImpuestoRenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoImpuestoRenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoImpuestoRenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoImpuestoRenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoImpuestoRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoImpuestoRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoImpuestoRenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoImpuestoRenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoImpuestoRenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoImpuestoRenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoImpuestoRenta.add(this.jMenuItemCerrarProcesoImpuestoRenta);
			
			this.jmenuAccionesProcesoImpuestoRenta.add(this.jMenuItemNuevoProcesoImpuestoRenta);
			this.jmenuAccionesProcesoImpuestoRenta.add(this.jMenuItemNuevoGuardarCambiosProcesoImpuestoRenta);
			this.jmenuAccionesProcesoImpuestoRenta.add(this.jMenuItemNuevoRelacionesProcesoImpuestoRenta);
			this.jmenuAccionesProcesoImpuestoRenta.add(this.jMenuItemGuardarCambiosTablaProcesoImpuestoRenta);		
			this.jmenuAccionesProcesoImpuestoRenta.add(this.jMenuItemDuplicarProcesoImpuestoRenta);		
			this.jmenuAccionesProcesoImpuestoRenta.add(this.jMenuItemCopiarProcesoImpuestoRenta);		
			this.jmenuAccionesProcesoImpuestoRenta.add(this.jMenuItemVerFormProcesoImpuestoRenta);		
			
			this.jmenuDatosProcesoImpuestoRenta.add(this.jMenuItemRecargarInformacionProcesoImpuestoRenta);				
			this.jmenuDatosProcesoImpuestoRenta.add(this.jMenuItemAnterioresProcesoImpuestoRenta);				
			this.jmenuDatosProcesoImpuestoRenta.add(this.jMenuItemSiguientesProcesoImpuestoRenta);				
			this.jmenuDatosProcesoImpuestoRenta.add(this.jMenuItemAbrirOrderByProcesoImpuestoRenta);				
			this.jmenuDatosProcesoImpuestoRenta.add(this.jMenuItemMostrarOcultarProcesoImpuestoRenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoImpuestoRenta.add(this.jMenuItemGuardarCambiosProcesoImpuestoRenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoImpuestoRenta.add(this.jmenuArchivoProcesoImpuestoRenta);		
			this.jmenuBarProcesoImpuestoRenta.add(this.jmenuAccionesProcesoImpuestoRenta);		
			this.jmenuBarProcesoImpuestoRenta.add(this.jmenuDatosProcesoImpuestoRenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoImpuestoRenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoImpuestoRenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoImpuestoRentaProcesoImpuestoRenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setToolTipText("Procesar Proceso Impuesto Renta");
		this.jButtonBusquedaProcesoImpuestoRentaProcesoImpuestoRenta= new JButtonMe();
		this.jButtonBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setText("Procesar");
		this.jButtonBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setToolTipText("Procesar Proceso Impuesto Renta");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoImpuestoRentaProcesoImpuestoRenta,"buscar_button","Procesar Proceso Impuesto Renta");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoImpuestoRentaProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta = new JLabelMe();
		jLabelid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setText("Anio :");
		jLabelid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setToolTipText("Anio");
		jLabelid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta= new JComboBoxMe();
		jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoImpuestoRenta=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoImpuestoRenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasProcesoImpuestoRenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasProcesoImpuestoRenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Impuesto Renta"));
		this.jTabbedPaneBusquedasProcesoImpuestoRenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoImpuestoRenta = new ProcesoImpuestoRentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Impuesto Renta DATOS");
			this.jInternalFrameDetalleFormProcesoImpuestoRenta = new ProcesoImpuestoRentaDetalleFormJInternalFrame(jDesktopPane,this.procesoimpuestorentaSessionBean.getConGuardarRelaciones(),this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoImpuestoRenta = null;//new ProcesoImpuestoRentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoImpuestoRenta= new GridBagLayout();
		
		
		this.jTableDatosProcesoImpuestoRenta = new JTableMe();      
		
		String sToolTipProcesoImpuestoRenta="";
		sToolTipProcesoImpuestoRenta=ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoImpuestoRenta+="(Nomina.ProcesoImpuestoRenta)";
		}
		
		if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoImpuestoRenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoImpuestoRenta.setToolTipText(sToolTipProcesoImpuestoRenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoImpuestoRenta);
		this.jTableDatosProcesoImpuestoRenta.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoImpuestoRenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoImpuestoRenta.setRowSelectionAllowed(true);
		this.jTableDatosProcesoImpuestoRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoImpuestoRenta = new JButtonMe();
		this.jButtonDuplicarProcesoImpuestoRenta = new JButtonMe();
		this.jButtonCopiarProcesoImpuestoRenta = new JButtonMe();
		this.jButtonVerFormProcesoImpuestoRenta = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoImpuestoRenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoImpuestoRenta = new JButtonMe();
		this.jButtonCerrarProcesoImpuestoRenta = new JButtonMe();
		
		this.jScrollPanelDatosProcesoImpuestoRenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoImpuestoRenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Impuesto Renta";
		
		if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Impuesto Rentas" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoImpuestoRenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoImpuestoRenta.setToolTipText("Acciones");
        this.jPanelAccionesProcesoImpuestoRenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoImpuestoRenta=new ReporteDinamicoJInternalFrame(ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoImpuestoRenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoImpuestoRenta=new ImportacionJInternalFrame(ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoImpuestoRenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoImpuestoRenta = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoImpuestoRenta.setText("Orden");
		this.jButtonAbrirOrderByProcesoImpuestoRenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoImpuestoRenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoImpuestoRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoImpuestoRenta,false,this);
			
			//this.cargarOrderByProcesoImpuestoRenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoImpuestoRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoImpuestoRenta,true,this);
			
			//this.cargarOrderByProcesoImpuestoRenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoImpuestoRenta.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosProcesoImpuestoRenta.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosProcesoImpuestoRenta.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosProcesoImpuestoRenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoImpuestoRenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoImpuestoRenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoImpuestoRenta.setText("Nuevo");
		this.jButtonDuplicarProcesoImpuestoRenta.setText("Duplicar");
		this.jButtonCopiarProcesoImpuestoRenta.setText("Copiar");
		this.jButtonVerFormProcesoImpuestoRenta.setText("Ver");
		this.jButtonNuevoRelacionesProcesoImpuestoRenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoImpuestoRenta.setText("Guardar");
		this.jButtonCerrarProcesoImpuestoRenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoImpuestoRenta,"nuevo_button","Nuevo",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoImpuestoRenta,"duplicar_button","Duplicar",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoImpuestoRenta,"copiar_button","Copiar",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoImpuestoRenta,"ver_form","Ver",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoImpuestoRenta,"nuevorelaciones_button","Nuevo Rel",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoImpuestoRenta,"guardarcambiostabla_button","Guardar",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoImpuestoRenta,"cerrar_button","Salir",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoImpuestoRenta.setToolTipText("Nuevo"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoImpuestoRenta.setToolTipText("Duplicar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoImpuestoRenta.setToolTipText("Copiar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoImpuestoRenta.setToolTipText("Ver"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoImpuestoRenta.setToolTipText("Nuevo Rel"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoImpuestoRenta.setToolTipText("Guardar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoImpuestoRenta.setToolTipText("Salir"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoImpuestoRenta";
		inputMap = this.jButtonNuevoProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoImpuestoRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoImpuestoRenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoImpuestoRenta";
		inputMap = this.jButtonDuplicarProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoImpuestoRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoImpuestoRenta"));
		
		//COPIAR
		sMapKey = "CopiarProcesoImpuestoRenta";
		inputMap = this.jButtonCopiarProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoImpuestoRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoImpuestoRenta"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoImpuestoRenta";
		inputMap = this.jButtonVerFormProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoImpuestoRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoImpuestoRenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoImpuestoRenta";
		inputMap = this.jButtonNuevoRelacionesProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoImpuestoRenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoImpuestoRenta";
		inputMap = this.jButtonModificarProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoImpuestoRenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoImpuestoRenta";
		inputMap = this.jButtonCerrarProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoImpuestoRenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoImpuestoRenta";
		inputMap = this.jButtonGuardarCambiosTablaProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoImpuestoRenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoImpuestoRenta.setName("jPanelParametrosReportesProcesoImpuestoRenta"); 
		
		this.jPanelParametrosReportesAccionesProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoImpuestoRenta.setName("jPanelParametrosReportesAccionesProcesoImpuestoRenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoImpuestoRenta = new JButtonMe();
		this.jButtonRecargarInformacionProcesoImpuestoRenta.setText("Procesar");
		this.jButtonRecargarInformacionProcesoImpuestoRenta.setToolTipText("Procesar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoImpuestoRenta,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoImpuestoRenta.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoImpuestoRenta = new JButtonMe();
		this.jButtonProcesarInformacionProcesoImpuestoRenta.setText("Procesar");
		this.jButtonProcesarInformacionProcesoImpuestoRenta.setToolTipText("Procesar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoImpuestoRenta.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoImpuestoRenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoImpuestoRenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoImpuestoRenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoImpuestoRenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoImpuestoRenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoImpuestoRenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoImpuestoRenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoImpuestoRenta.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoImpuestoRenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoImpuestoRenta.setText("Accion");
		this.jComboBoxTiposAccionesProcesoImpuestoRenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoImpuestoRenta.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoImpuestoRenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoImpuestoRenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoImpuestoRenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoImpuestoRenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoImpuestoRenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoImpuestoRenta = new JLabelMe();
		
		this.jLabelAccionesProcesoImpuestoRenta.setText("Acciones");		
		this.jLabelAccionesProcesoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoImpuestoRenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoImpuestoRenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoImpuestoRenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoImpuestoRenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoImpuestoRenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoImpuestoRenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoImpuestoRenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoImpuestoRenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoImpuestoRenta = new JButtonMe();
		//this.jButtonAnterioresProcesoImpuestoRenta.setText("<<");
        this.jButtonAnterioresProcesoImpuestoRenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoImpuestoRenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoImpuestoRenta = new JButtonMe();
		//this.jButtonSiguientesProcesoImpuestoRenta.setText(">>");
        this.jButtonSiguientesProcesoImpuestoRenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoImpuestoRenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoImpuestoRenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoImpuestoRenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoImpuestoRenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoImpuestoRenta,"nuevoguardarcambios_button","Nue",this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoImpuestoRenta";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoImpuestoRenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoImpuestoRenta";
		inputMap = this.jButtonRecargarInformacionProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoImpuestoRenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoImpuestoRenta";
		inputMap = this.jButtonSiguientesProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoImpuestoRenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoImpuestoRenta";
		inputMap = this.jButtonAnterioresProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoImpuestoRenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoImpuestoRenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoImpuestoRenta.setMinimumSize(new Dimension(this.getWidth(),ProcesoImpuestoRentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoImpuestoRentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoImpuestoRenta.setMaximumSize(new Dimension(this.getWidth(),ProcesoImpuestoRentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoImpuestoRentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoImpuestoRenta.setPreferredSize(new Dimension(this.getWidth(),ProcesoImpuestoRentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoImpuestoRentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoImpuestoRenta = new GridBagLayout();

			this.jPanelPaginacionProcesoImpuestoRenta.setLayout(gridaBagLayoutPaginacionProcesoImpuestoRenta);						
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoImpuestoRenta.add(this.jButtonAnterioresProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
					
						
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;
			
			this.jPanelPaginacionProcesoImpuestoRenta.add(this.jButtonNuevoGuardarCambiosProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
						
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;
			this.jPanelPaginacionProcesoImpuestoRenta.add(this.jButtonSiguientesProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = 1;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoImpuestoRenta.add(this.jButtonNuevoProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
						
			
			
			if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
				this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoImpuestoRenta.gridy = 1;
				this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoImpuestoRenta.add(this.jButtonGuardarCambiosTablaProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
			}
			
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = 1;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoImpuestoRenta.add(this.jButtonProcesarInformacionProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = 1;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoImpuestoRenta.add(this.jButtonDuplicarProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = 1;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoImpuestoRenta.add(this.jButtonCopiarProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = 1;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoImpuestoRenta.add(this.jButtonVerFormProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = 1;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoImpuestoRenta.add(this.jButtonCerrarProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		
		
		
		this.jButtonRecargarInformacionProcesoImpuestoRenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoImpuestoRenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoImpuestoRenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoImpuestoRenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoImpuestoRenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoImpuestoRenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoImpuestoRenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoImpuestoRenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoImpuestoRenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoImpuestoRenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoImpuestoRenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoImpuestoRenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoImpuestoRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoImpuestoRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoImpuestoRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoImpuestoRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoImpuestoRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoImpuestoRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoImpuestoRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoImpuestoRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoImpuestoRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoImpuestoRenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoImpuestoRenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoImpuestoRenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoImpuestoRenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoImpuestoRenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoImpuestoRenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoImpuestoRenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoImpuestoRenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoImpuestoRenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoImpuestoRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoImpuestoRenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoImpuestoRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoImpuestoRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoImpuestoRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoImpuestoRenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoImpuestoRenta.setLayout(gridaBagParametrosReportesProcesoImpuestoRenta);
			this.jPanelParametrosReportesAccionesProcesoImpuestoRenta.setLayout(gridaBagParametrosReportesAccionesProcesoImpuestoRenta);
			
			
			this.jPanelParametrosAuxiliar1ProcesoImpuestoRenta.setLayout(gridaBagParametrosAuxiliar1ProcesoImpuestoRenta);
			this.jPanelParametrosAuxiliar2ProcesoImpuestoRenta.setLayout(gridaBagParametrosAuxiliar2ProcesoImpuestoRenta);
			this.jPanelParametrosAuxiliar3ProcesoImpuestoRenta.setLayout(gridaBagParametrosAuxiliar3ProcesoImpuestoRenta);
			this.jPanelParametrosAuxiliar4ProcesoImpuestoRenta.setLayout(gridaBagParametrosAuxiliar4ProcesoImpuestoRenta);
			//this.jPanelParametrosAuxiliar5ProcesoImpuestoRenta.setLayout(gridaBagParametrosAuxiliar2ProcesoImpuestoRenta);			
			
			
			
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoImpuestoRenta.add(this.jButtonRecargarInformacionProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoImpuestoRenta.add(this.jComboBoxTiposPaginacionProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoImpuestoRenta.add(this.jCheckBoxConAltoMaximoTablaProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoImpuestoRenta.add(this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoImpuestoRenta.add(this.jPanelParametrosAuxiliar1ProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoImpuestoRenta.add(this.jComboBoxTiposReportesProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoImpuestoRenta.add(this.jPanelParametrosAuxiliar4ProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoImpuestoRenta.add(this.jComboBoxTiposReportesProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoImpuestoRenta.add(this.jCheckBoxGenerarReporteProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoImpuestoRenta.add(this.jPanelParametrosAuxiliar2ProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoImpuestoRenta.add(this.jLabelAccionesProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoImpuestoRenta.add(this.jComboBoxTiposSeleccionarProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);			
			
			
			/*
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoImpuestoRenta.add(this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoImpuestoRenta.add(this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);															
				
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoImpuestoRenta.add(this.jCheckBoxSeleccionadosProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoImpuestoRenta.add(this.jPanelParametrosAuxiliar3ProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoImpuestoRenta.add(this.jComboBoxTiposAccionesProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoImpuestoRenta = new GridBagLayout();

			this.jScrollPanelDatosProcesoImpuestoRenta.setLayout(gridaBagLayoutDatosProcesoImpuestoRenta);
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
			
			this.jScrollPanelDatosProcesoImpuestoRenta.add(this.jTableDatosProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoImpuestoRenta.setViewportView(this.jTableDatosProcesoImpuestoRenta);
		this.jTableDatosProcesoImpuestoRenta.setFillsViewportHeight(true);
		this.jTableDatosProcesoImpuestoRenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoImpuestoRenta= new GridBagLayout();
		this.jPanelAccionesProcesoImpuestoRenta.setLayout(gridaBagLayoutAccionesProcesoImpuestoRenta);
		
		
		/*	
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = 0;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
			
		this.jPanelAccionesProcesoImpuestoRenta.add(this.jButtonNuevoProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoImpuestoRentaProcesoImpuestoRenta= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.setLayout(gridaBagLayoutBusquedaProcesoImpuestoRentaProcesoImpuestoRenta);

		gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoImpuestoRenta.gridy = 0;
		gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
		jPanelBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.add(jLabelid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta, gridBagConstraintsProcesoImpuestoRenta);

		gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoImpuestoRenta.gridy = 0;
		gridBagConstraintsProcesoImpuestoRenta.gridx = 1;
		jPanelBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.add(jComboBoxid_anioBusquedaProcesoImpuestoRentaProcesoImpuestoRenta, gridBagConstraintsProcesoImpuestoRenta);

		gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoImpuestoRenta.gridy = 1;
		gridBagConstraintsProcesoImpuestoRenta.gridx =1;
		jPanelBusquedaProcesoImpuestoRentaProcesoImpuestoRenta.add(jButtonBusquedaProcesoImpuestoRentaProcesoImpuestoRenta, gridBagConstraintsProcesoImpuestoRenta);

		jTabbedPaneBusquedasProcesoImpuestoRenta.addTab("1.-Por Anio ", jPanelBusquedaProcesoImpuestoRentaProcesoImpuestoRenta);
		jTabbedPaneBusquedasProcesoImpuestoRenta.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoImpuestoRenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoImpuestoRenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();						
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;		
			//this.gridBagConstraintsProcesoImpuestoRenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoImpuestoRenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;		
		//this.gridBagConstraintsProcesoImpuestoRenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoImpuestoRenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoImpuestoRenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;		
			this.gridBagConstraintsProcesoImpuestoRenta.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoImpuestoRenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);								
		
		
		/*
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		*/		
		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx =0;
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoImpuestoRenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
				
		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoImpuestoRenta = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoImpuestoRenta.setLayout(gridaBagLayoutBusquedasParametrosProcesoImpuestoRenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoImpuestoRenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoImpuestoRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoImpuestoRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoImpuestoRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
			
			
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		
			
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoImpuestoRenta.setVisible(false);
		this.jButtonAnterioresProcesoImpuestoRenta.setVisible(false);
		this.jButtonSiguientesProcesoImpuestoRenta.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoImpuestoRenta.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoImpuestoRenta.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoImpuestoRenta.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoImpuestoRenta.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoImpuestoRenta.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoImpuestoRenta.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoImpuestoRenta.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoImpuestoRenta.setVisible(false);
		this.jComboBoxTiposReportesProcesoImpuestoRenta.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoImpuestoRenta.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoImpuestoRenta.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoImpuestoRenta.setVisible(false);
		this.jComboBoxTiposAccionesProcesoImpuestoRenta.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoImpuestoRenta.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoImpuestoRenta.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoImpuestoRenta.setVisible(false);
		
		this.jPanelParametrosReportesProcesoImpuestoRenta.setVisible(false);
		
		
		this.jTtoolBarProcesoImpuestoRenta.setVisible(false);
			
		this.jMenuItemAnterioresProcesoImpuestoRenta.setVisible(false);
		this.jMenuItemSiguientesProcesoImpuestoRenta.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoImpuestoRenta.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoImpuestoRenta.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoImpuestoRenta.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoImpuestoRenta.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoImpuestoRenta.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoImpuestoRenta.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoImpuestoRenta.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoImpuestoRenta.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoImpuestoRenta.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoImpuestoRenta.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoImpuestoRenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoImpuestoRenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoImpuestoRenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoImpuestoRenta.setName("jPanelReporteDinamicoProcesoImpuestoRenta"); 
		
		this.jPanelReporteDinamicoProcesoImpuestoRenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoImpuestoRenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoImpuestoRenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoImpuestoRenta.setLayout(gridaBagLayoutReporteDinamicoProcesoImpuestoRenta);
		
		
		this.jInternalFrameReporteDinamicoProcesoImpuestoRenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoImpuestoRenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoImpuestoRenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoImpuestoRenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoImpuestoRenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoImpuestoRenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Impuesto Rentas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoImpuestoRenta = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoImpuestoRenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoImpuestoRenta.add(this.jLabelColumnasSelectReporteProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoImpuestoRenta = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoImpuestoRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoImpuestoRenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoImpuestoRenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoImpuestoRenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoImpuestoRenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoImpuestoRenta=new JScrollPane(this.jListColumnasSelectReporteProcesoImpuestoRenta);
			
			this.jScrollColumnasSelectReporteProcesoImpuestoRenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoImpuestoRenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoImpuestoRenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoImpuestoRenta.add(this.jListColumnasSelectReporteProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		this.jPanelReporteDinamicoProcesoImpuestoRenta.add(this.jScrollColumnasSelectReporteProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoImpuestoRenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoImpuestoRenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoImpuestoRenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoImpuestoRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoImpuestoRenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoImpuestoRenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoImpuestoRenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoImpuestoRenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoImpuestoRenta=new JScrollPane(this.jListRelacionesSelectReporteProcesoImpuestoRenta);
			
			this.jScrollRelacionesSelectReporteProcesoImpuestoRenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoImpuestoRenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoImpuestoRenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoImpuestoRenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoImpuestoRenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoImpuestoRenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoImpuestoRenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoImpuestoRenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoImpuestoRenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoImpuestoRenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoImpuestoRenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoImpuestoRenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoImpuestoRenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoImpuestoRenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoImpuestoRenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoImpuestoRenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoImpuestoRenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoImpuestoRenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoImpuestoRenta.add(this.jLabelGenerarExcelReporteDinamicoProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoImpuestoRenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoImpuestoRenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoImpuestoRenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoImpuestoRenta.setToolTipText("Generar EXCEL"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoImpuestoRenta.add(this.jButtonGenerarExcelReporteDinamicoProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoImpuestoRenta.add(this.jComboBoxTiposReportesDinamicoProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoImpuestoRenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoImpuestoRenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoImpuestoRenta.add(this.jLabelTiposArchivoReporteDinamicoProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoImpuestoRenta.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoImpuestoRenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoImpuestoRenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoImpuestoRenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoImpuestoRenta.setToolTipText("Generar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoImpuestoRenta.add(this.jButtonGenerarReporteDinamicoProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoImpuestoRenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoImpuestoRenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoImpuestoRenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoImpuestoRenta.setToolTipText("Cancelar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoImpuestoRenta.add(this.jButtonCerrarReporteDinamicoProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoImpuestoRenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoImpuestoRenta= new JScrollPane(jPanelReporteDinamicoProcesoImpuestoRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoImpuestoRenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoImpuestoRenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoImpuestoRenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Impuesto Rentas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoImpuestoRenta);
		this.jInternalFrameReporteDinamicoProcesoImpuestoRenta.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoImpuestoRenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoImpuestoRenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoImpuestoRenta.setName("jPanelImportacionProcesoImpuestoRenta"); 
		
		this.jPanelImportacionProcesoImpuestoRenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoImpuestoRenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoImpuestoRenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoImpuestoRenta.setLayout(gridaBagLayoutImportacionProcesoImpuestoRenta);
		
		
		this.jInternalFrameImportacionProcesoImpuestoRenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoImpuestoRenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoImpuestoRenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoImpuestoRenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoImpuestoRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoImpuestoRenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoImpuestoRenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoImpuestoRenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoImpuestoRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoImpuestoRenta.setResizable(true);
	    this.jInternalFrameImportacionProcesoImpuestoRenta.setClosable(true);
	    this.jInternalFrameImportacionProcesoImpuestoRenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoImpuestoRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoImpuestoRenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoImpuestoRenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoImpuestoRenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoImpuestoRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoImpuestoRenta.setResizable(true);
	    this.jInternalFrameImportacionProcesoImpuestoRenta.setClosable(true);
	    this.jInternalFrameImportacionProcesoImpuestoRenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoImpuestoRenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoImpuestoRenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoImpuestoRenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Impuesto Rentas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoImpuestoRenta = new JLabelMe();

		this.jLabelArchivoImportacionProcesoImpuestoRenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoImpuestoRenta.add(this.jLabelArchivoImportacionProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoImpuestoRenta = new JFileChooser();		
		this.jFileChooserImportacionProcesoImpuestoRenta.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoImpuestoRenta = new JButtonMe();
		this.jButtonAbrirImportacionProcesoImpuestoRenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoImpuestoRenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoImpuestoRenta.setToolTipText("Generar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoImpuestoRenta.add(this.jButtonAbrirImportacionProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoImpuestoRenta = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoImpuestoRenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoImpuestoRenta.add(this.jLabelPathArchivoImportacionProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoImpuestoRenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoImpuestoRenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoImpuestoRenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoImpuestoRenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoImpuestoRenta.add(this.jTextFieldPathArchivoImportacionProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoImpuestoRenta = new JButtonMe();
		this.jButtonGenerarImportacionProcesoImpuestoRenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoImpuestoRenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoImpuestoRenta.setToolTipText("Generar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoImpuestoRenta.add(this.jButtonGenerarImportacionProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoImpuestoRenta = new JButtonMe();
		this.jButtonCerrarImportacionProcesoImpuestoRenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoImpuestoRenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoImpuestoRenta.setToolTipText("Cancelar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoImpuestoRenta.add(this.jButtonCerrarImportacionProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoImpuestoRenta = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoImpuestoRenta= new JScrollPane(jPanelImportacionProcesoImpuestoRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsProcesoImpuestoRenta.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoImpuestoRenta.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoImpuestoRenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoImpuestoRenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoImpuestoRenta);
		this.jInternalFrameImportacionProcesoImpuestoRenta.getContentPane().add(this.jScrollPanelImportacionProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoImpuestoRenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoImpuestoRenta = new JButtonMe();
			this.jButtonAbrirOrderByProcesoImpuestoRenta.setText("Orden");
			this.jButtonAbrirOrderByProcesoImpuestoRenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoImpuestoRenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoImpuestoRenta";
			inputMap = this.jButtonAbrirOrderByProcesoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoImpuestoRenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoImpuestoRenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoImpuestoRenta.setName("jPanelOrderByProcesoImpuestoRenta"); 
			
			this.jPanelOrderByProcesoImpuestoRenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoImpuestoRenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoImpuestoRenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoImpuestoRenta.setLayout(gridaBagLayoutOrderByProcesoImpuestoRenta);
			
			
			this.jTableDatosProcesoImpuestoRentaOrderBy = new JTableMe();        
			this.jTableDatosProcesoImpuestoRentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoImpuestoRentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoImpuestoRentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoImpuestoRentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoImpuestoRentaOrderBy.setViewportView(this.jTableDatosProcesoImpuestoRentaOrderBy);
			this.jTableDatosProcesoImpuestoRentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoImpuestoRentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoImpuestoRenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoImpuestoRenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoImpuestoRenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoImpuestoRenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoImpuestoRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoImpuestoRenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoImpuestoRenta.setTitle("Orden");
			this.jInternalFrameOrderByProcesoImpuestoRenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoImpuestoRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoImpuestoRenta.setResizable(true);
			this.jInternalFrameOrderByProcesoImpuestoRenta.setClosable(true);
			this.jInternalFrameOrderByProcesoImpuestoRenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoImpuestoRenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoImpuestoRenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoImpuestoRenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Impuesto Rentas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoImpuestoRenta.ipady =150;
				
			this.jPanelOrderByProcesoImpuestoRenta.add(jScrollPanelDatosProcesoImpuestoRentaOrderBy, this.gridBagConstraintsProcesoImpuestoRenta);//this.jTableDatosProcesoImpuestoRentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoImpuestoRenta = new JButtonMe();
			this.jButtonCerrarOrderByProcesoImpuestoRenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoImpuestoRenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoImpuestoRenta.setToolTipText("Cancelar"+" "+ProcesoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoImpuestoRenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoImpuestoRenta.add(this.jButtonCerrarOrderByProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoImpuestoRenta = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoImpuestoRenta= new JScrollPane(jPanelOrderByProcesoImpuestoRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsProcesoImpuestoRenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoImpuestoRenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoImpuestoRenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoImpuestoRenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoImpuestoRenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoImpuestoRenta);
			
			this.jInternalFrameOrderByProcesoImpuestoRenta.getContentPane().add(this.jScrollPanelOrderByProcesoImpuestoRenta, this.gridBagConstraintsProcesoImpuestoRenta);			
		
		} else {
			this.jButtonAbrirOrderByProcesoImpuestoRenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesoimpuestorentaSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosProcesoImpuestoRenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoImpuestoRenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoImpuestoRenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoImpuestoRenta.getRowHeight();//ProcesoImpuestoRentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoImpuestoRenta.isSelected()) {
					iHeightTable=ProcesoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoImpuestoRenta.isSelected()) {
					iHeightTable=ProcesoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoImpuestoRenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoImpuestoRenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoImpuestoRenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoImpuestoRenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoImpuestoRenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoImpuestoRenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoImpuestoRenta!=null && this.jInternalFrameOrderByProcesoImpuestoRenta.getjTableDatosOrderBy()!=null) {
			//if(!this.procesoimpuestorentaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoImpuestoRenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoImpuestoRenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoImpuestoRenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoImpuestoRenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoImpuestoRenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoImpuestoRenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoImpuestoRenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoImpuestoRenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoImpuestoRenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoImpuestoRenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesoimpuestorentaLogic.getProcesoImpuestoRentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoimpuestorentas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoImpuestoRenta> TraerProcesoImpuestoRentaBeans(List<ProcesoImpuestoRenta> procesoimpuestorentas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoImpuestoRenta procesoimpuestorenta:procesoimpuestorentas) {
					
				if(!(ProcesoImpuestoRentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoImpuestoRentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesoimpuestorenta.setsDetalleGeneralEntityReporte(ProcesoImpuestoRentaConstantesFunciones.getProcesoImpuestoRentaDescripcion(procesoimpuestorenta));
										
						
					
						
					
				} else  {
							
					//procesoimpuestorenta.setsDetalleGeneralEntityReporte(procesoimpuestorenta.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesoimpuestorentabeans.add(procesoimpuestorentabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesoimpuestorentas;
    }
	//PARA REPORTES FIN
}
