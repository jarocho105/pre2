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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.contabilidad.util.PresuTipoProyectoConstantesFunciones;

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
public class PresuTipoProyectoJInternalFrame extends PresuTipoProyectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPresuTipoProyecto;
	
	protected JMenuBar jmenuBarPresuTipoProyecto;
	
	protected JMenu jmenuPresuTipoProyecto;
	protected JMenu jmenuDatosPresuTipoProyecto;
	protected JMenu jmenuArchivoPresuTipoProyecto;
	protected JMenu jmenuAccionesPresuTipoProyecto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPresuTipoProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresuTipoProyecto;	
	protected GridBagConstraints gridBagConstraintsPresuTipoProyecto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PresuTipoProyectoDetalleFormJInternalFrame jInternalFrameDetalleFormPresuTipoProyecto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPresuTipoProyecto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPresuTipoProyecto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PresuTipoProyectoSessionBean presutipoproyectoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PresuTipoProyecto> presutipoproyectos;		
	public List<PresuTipoProyecto> presutipoproyectosEliminados;	
	public List<PresuTipoProyecto> presutipoproyectosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPresuTipoProyecto;		
	protected JButton jButtonAbrirOrderByPresuTipoProyecto;
	
	
	//protected JPanel jPanelOrderByPresuTipoProyecto;
	//public JScrollPane jScrollPanelOrderByPresuTipoProyecto;	
	//protected JButton jButtonCerrarOrderByPresuTipoProyecto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PresuTipoProyectoLogic presutipoproyectoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPresuTipoProyecto;
	public JScrollPane jScrollPanelDatosEdicionPresuTipoProyecto;
	public JScrollPane jScrollPanelDatosGeneralPresuTipoProyecto;
    
	
	
	//public JScrollPane jScrollPanelDatosPresuTipoProyectoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPresuTipoProyecto;
	//public JScrollPane jScrollPanelImportacionPresuTipoProyecto;
	
	
	
	protected JPanel jPanelAccionesPresuTipoProyecto;
	
    protected JPanel jPanelPaginacionPresuTipoProyecto;
    protected JPanel jPanelParametrosReportesPresuTipoProyecto;
	protected JPanel jPanelParametrosReportesAccionesPresuTipoProyecto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PresuTipoProyecto;
	protected JPanel jPanelParametrosAuxiliar2PresuTipoProyecto;
	protected JPanel jPanelParametrosAuxiliar3PresuTipoProyecto;
	protected JPanel jPanelParametrosAuxiliar4PresuTipoProyecto;
	//protected JPanel jPanelParametrosAuxiliar5PresuTipoProyecto;
	
	
	
	//protected JPanel jPanelReporteDinamicoPresuTipoProyecto;
	//protected JPanel jPanelImportacionPresuTipoProyecto;
	
	
	public JTable jTableDatosPresuTipoProyecto;
	
	
	
	//public JTable jTableDatosPresuTipoProyectoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPresuTipoProyecto;
	protected JButton jButtonDuplicarPresuTipoProyecto;
	protected JButton jButtonCopiarPresuTipoProyecto;
	protected JButton jButtonVerFormPresuTipoProyecto;
	protected JButton jButtonNuevoRelacionesPresuTipoProyecto;
	protected JButton jButtonModificarPresuTipoProyecto;
	
    protected JButton jButtonGuardarCambiosTablaPresuTipoProyecto;
	protected JButton jButtonCerrarPresuTipoProyecto;
	
	
	protected JButton jButtonRecargarInformacionPresuTipoProyecto;
	protected JButton jButtonProcesarInformacionPresuTipoProyecto;
	
	
	protected JButton jButtonAnterioresPresuTipoProyecto;
	protected JButton jButtonSiguientesPresuTipoProyecto;
	protected JButton jButtonNuevoGuardarCambiosPresuTipoProyecto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPresuTipoProyecto;
	//protected JButton jButtonCerrarReporteDinamicoPresuTipoProyecto;
	//protected JButton jButtonGenerarExcelReporteDinamicoPresuTipoProyecto;	
	
	
	
	//protected JButton jButtonAbrirImportacionPresuTipoProyecto;
	//protected JButton jButtonGenerarImportacionPresuTipoProyecto;
	//protected JButton jButtonCerrarImportacionPresuTipoProyecto;
	//protected JFileChooser jFileChooserImportacionPresuTipoProyecto;
	//protected File fileImportacionPresuTipoProyecto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresuTipoProyecto;
	protected JButton jButtonDuplicarToolBarPresuTipoProyecto;
	protected JButton jButtonNuevoRelacionesToolBarPresuTipoProyecto;
	
	
	public JButton jButtonGuardarCambiosToolBarPresuTipoProyecto;
	protected JButton jButtonCopiarToolBarPresuTipoProyecto;
	protected JButton jButtonVerFormToolBarPresuTipoProyecto;
	public JButton jButtonGuardarCambiosTablaToolBarPresuTipoProyecto;
	protected JButton jButtonMostrarOcultarTablaToolBarPresuTipoProyecto;
	protected JButton jButtonCerrarToolBarPresuTipoProyecto;
	
	protected JButton jButtonRecargarInformacionToolBarPresuTipoProyecto;
	protected JButton jButtonProcesarInformacionToolBarPresuTipoProyecto;
	protected JButton jButtonAnterioresToolBarPresuTipoProyecto;
	protected JButton jButtonSiguientesToolBarPresuTipoProyecto;
	protected JButton jButtonNuevoGuardarCambiosToolBarPresuTipoProyecto;
	protected JButton jButtonAbrirOrderByToolBarPresuTipoProyecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresuTipoProyecto;
	protected JMenuItem jMenuItemDuplicarPresuTipoProyecto;
	protected JMenuItem jMenuItemNuevoRelacionesPresuTipoProyecto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPresuTipoProyecto;
	protected JMenuItem jMenuItemCopiarPresuTipoProyecto;
	protected JMenuItem jMenuItemVerFormPresuTipoProyecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresuTipoProyecto;
	protected JMenuItem jMenuItemCerrarPresuTipoProyecto;
	protected JMenuItem jMenuItemDetalleCerrarPresuTipoProyecto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPresuTipoProyecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresuTipoProyecto;
	
	protected JMenuItem jMenuItemRecargarInformacionPresuTipoProyecto;
	protected JMenuItem jMenuItemProcesarInformacionPresuTipoProyecto;
	protected JMenuItem jMenuItemAnterioresPresuTipoProyecto;
	protected JMenuItem jMenuItemSiguientesPresuTipoProyecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresuTipoProyecto;
	protected JMenuItem jMenuItemAbrirOrderByPresuTipoProyecto;
	protected JMenuItem jMenuItemMostrarOcultarPresuTipoProyecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresuTipoProyecto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPresuTipoProyecto;
	protected JCheckBox jCheckBoxSeleccionadosPresuTipoProyecto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPresuTipoProyecto;
	protected JCheckBox jCheckBoxConGraficoReportePresuTipoProyecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPresuTipoProyecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPresuTipoProyecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPresuTipoProyecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPresuTipoProyecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPresuTipoProyecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPresuTipoProyecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresuTipoProyecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresuTipoProyecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPresuTipoProyecto;
	protected JTextField jTextFieldValorCampoGeneralPresuTipoProyecto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePresuTipoProyecto;
	//public JList<Reporte> jListColumnasSelectReportePresuTipoProyecto;
	//public JScrollPane jScrollColumnasSelectReportePresuTipoProyecto;
	
	//public JLabel jLabelRelacionesSelectReportePresuTipoProyecto;
	//public JList<Reporte> jListRelacionesSelectReportePresuTipoProyecto;
	//public JScrollPane jScrollRelacionesSelectReportePresuTipoProyecto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPresuTipoProyecto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPresuTipoProyecto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPresuTipoProyecto;
	//public JLabel jLabelTiposArchivoReporteDinamicoPresuTipoProyecto;
	
		
	//public JLabel jLabelArchivoImportacionPresuTipoProyecto;	
	//public JLabel jLabelPathArchivoImportacionPresuTipoProyecto;
	//protected JTextField jTextFieldPathArchivoImportacionPresuTipoProyecto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPresuTipoProyecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPresuTipoProyecto;
	
	//public JLabel jLabelColumnaCategoriaValorPresuTipoProyecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPresuTipoProyecto;
	
	//public JLabel jLabelColumnasValoresGraficoPresuTipoProyecto;
	//public JList<Reporte> jListColumnasValoresGraficoPresuTipoProyecto;
	//public JScrollPane jScrollColumnasValoresGraficoPresuTipoProyecto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPresuTipoProyecto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPresuTipoProyecto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPresuTipoProyecto;
	public JPanel jPanelBusquedaPorCodigoPresuTipoProyecto;
	public JButton jButtonBusquedaPorCodigoPresuTipoProyecto;
	public JPanel jPanelBusquedaPorNombrePresuTipoProyecto;
	public JButton jButtonBusquedaPorNombrePresuTipoProyecto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoPresuTipoProyecto;
	public JLabel jLabelcodigoBusquedaPorCodigoPresuTipoProyecto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoPresuTipoProyecto;
	public JButton jButtoncodigoBusquedaPorCodigoPresuTipoProyectoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombrePresuTipoProyecto;
	public JLabel jLabelnombreBusquedaPorNombrePresuTipoProyecto;
	public JTextArea jTextAreanombreBusquedaPorNombrePresuTipoProyecto;
	public JButton jButtonnombreBusquedaPorNombrePresuTipoProyectoBusqueda= new JButtonMe();

	
	
	
	
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
	public PresuTipoProyectoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PresuTipoProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTipoProyectoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuTipoProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTipoProyectoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuTipoProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTipoProyectoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresuTipoProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPresuTipoProyecto)	{
		this.jButtonRecargarInformacionPresuTipoProyecto = jButtonRecargarInformacionPresuTipoProyecto;
	}
	
	public JButton getjButtonProcesarInformacionPresuTipoProyecto() {
		return this.jButtonProcesarInformacionPresuTipoProyecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresuTipoProyecto)	{
		this.jButtonProcesarInformacionPresuTipoProyecto = jButtonProcesarInformacionPresuTipoProyecto;
	}
	
	
	public JButton getjButtonRecargarInformacionPresuTipoProyecto() {
		return this.jButtonRecargarInformacionPresuTipoProyecto;
	}
	
	
	public List<PresuTipoProyecto> getpresutipoproyectos() {
		return this.presutipoproyectos;
	}

	public void setpresutipoproyectos(List<PresuTipoProyecto> presutipoproyectos) {
		this.presutipoproyectos = presutipoproyectos;
	}
	
	public List<PresuTipoProyecto> getpresutipoproyectosAux() {
		return this.presutipoproyectosAux;
	}

	public void setpresutipoproyectosAux(List<PresuTipoProyecto> presutipoproyectosAux) {
		this.presutipoproyectosAux = presutipoproyectosAux;
	}
	
	public List<PresuTipoProyecto> getpresutipoproyectosEliminados() {
		return this.presutipoproyectosEliminados;
	}

	public void setPresuTipoProyectosEliminados(List<PresuTipoProyecto> presutipoproyectosEliminados) {
		this.presutipoproyectosEliminados = presutipoproyectosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPresuTipoProyecto() {
		return jComboBoxTiposSeleccionarPresuTipoProyecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPresuTipoProyecto(
			JComboBox jComboBoxTiposSeleccionarPresuTipoProyecto) {
		this.jComboBoxTiposSeleccionarPresuTipoProyecto = jComboBoxTiposSeleccionarPresuTipoProyecto;
	}
	
	public void setBorderResaltarTiposSeleccionarPresuTipoProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPresuTipoProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPresuTipoProyecto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPresuTipoProyecto() {
		return jTextFieldValorCampoGeneralPresuTipoProyecto;
	}

	public void setjTextFieldValorCampoGeneralPresuTipoProyecto(
			JTextField jTextFieldValorCampoGeneralPresuTipoProyecto) {
		this.jTextFieldValorCampoGeneralPresuTipoProyecto = jTextFieldValorCampoGeneralPresuTipoProyecto;
	}

	public void setBorderResaltarValorCampoGeneralPresuTipoProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoProyecto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPresuTipoProyecto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPresuTipoProyecto() {
		return this.jCheckBoxSeleccionarTodosPresuTipoProyecto;
	}

	public void setjCheckBoxSeleccionarTodosPresuTipoProyecto(
			JCheckBox jCheckBoxSeleccionarTodosPresuTipoProyecto) {
		this.jCheckBoxSeleccionarTodosPresuTipoProyecto = jCheckBoxSeleccionarTodosPresuTipoProyecto;
	}

	public void setBorderResaltarSeleccionarTodosPresuTipoProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoProyecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPresuTipoProyecto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPresuTipoProyecto() {
		return this.jCheckBoxSeleccionadosPresuTipoProyecto;
	}

	public void setjCheckBoxSeleccionadosPresuTipoProyecto(
			JCheckBox jCheckBoxSeleccionadosPresuTipoProyecto) {
		this.jCheckBoxSeleccionadosPresuTipoProyecto = jCheckBoxSeleccionadosPresuTipoProyecto;
	}
	
	public void setBorderResaltarSeleccionadosPresuTipoProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoProyecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPresuTipoProyecto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPresuTipoProyecto() {
		return this.jComboBoxTiposArchivosReportesPresuTipoProyecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPresuTipoProyecto(
			JComboBox jComboBoxTiposArchivosReportesPresuTipoProyecto) {
		this.jComboBoxTiposArchivosReportesPresuTipoProyecto = jComboBoxTiposArchivosReportesPresuTipoProyecto;
	}

	public void setBorderResaltarTiposArchivosReportesPresuTipoProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPresuTipoProyecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPresuTipoProyecto() {
		return this.jComboBoxTiposReportesPresuTipoProyecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPresuTipoProyecto(
			JComboBox jComboBoxTiposReportesPresuTipoProyecto) {
		this.jComboBoxTiposReportesPresuTipoProyecto = jComboBoxTiposReportesPresuTipoProyecto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPresuTipoProyecto() {
	//	return jComboBoxTiposReportesDinamicoPresuTipoProyecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPresuTipoProyecto(
	//		JComboBox jComboBoxTiposReportesDinamicoPresuTipoProyecto) {
	//	this.jComboBoxTiposReportesDinamicoPresuTipoProyecto = jComboBoxTiposReportesDinamicoPresuTipoProyecto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPresuTipoProyecto() {
	//	return jComboBoxTiposArchivosReportesDinamicoPresuTipoProyecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPresuTipoProyecto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPresuTipoProyecto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPresuTipoProyecto = jComboBoxTiposArchivosReportesDinamicoPresuTipoProyecto;
	//}
	
	public void setBorderResaltarTiposReportesPresuTipoProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPresuTipoProyecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPresuTipoProyecto() {
		return this.jComboBoxTiposGraficosReportesPresuTipoProyecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPresuTipoProyecto(
			JComboBox jComboBoxTiposGraficosReportesPresuTipoProyecto) {
		this.jComboBoxTiposGraficosReportesPresuTipoProyecto = jComboBoxTiposGraficosReportesPresuTipoProyecto;
	}
	
	public void setBorderResaltarTiposGraficosReportesPresuTipoProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPresuTipoProyecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPresuTipoProyecto() {
		return this.jComboBoxTiposPaginacionPresuTipoProyecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPresuTipoProyecto(
			JComboBox jComboBoxTiposPaginacionPresuTipoProyecto) {
		this.jComboBoxTiposPaginacionPresuTipoProyecto = jComboBoxTiposPaginacionPresuTipoProyecto;
	}
	
	public void setBorderResaltarTiposPaginacionPresuTipoProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPresuTipoProyecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPresuTipoProyecto() {
		return this.jComboBoxTiposRelacionesPresuTipoProyecto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresuTipoProyecto() {
		return this.jComboBoxTiposAccionesPresuTipoProyecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresuTipoProyecto(
			JComboBox jComboBoxTiposRelacionesPresuTipoProyecto) {
		this.jComboBoxTiposRelacionesPresuTipoProyecto = jComboBoxTiposRelacionesPresuTipoProyecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresuTipoProyecto(
			JComboBox jComboBoxTiposAccionesPresuTipoProyecto) {
		this.jComboBoxTiposAccionesPresuTipoProyecto = jComboBoxTiposAccionesPresuTipoProyecto;
	}
	
	public void setBorderResaltarTiposRelacionesPresuTipoProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPresuTipoProyecto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPresuTipoProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPresuTipoProyecto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPresuTipoProyecto() {
	//	return jCheckBoxConGraficoDinamicoPresuTipoProyecto;
	//}

	//public void setjCheckBoxConGraficoDinamicoPresuTipoProyecto(
	//		JCheckBox jCheckBoxConGraficoDinamicoPresuTipoProyecto) {
	//	this.jCheckBoxConGraficoDinamicoPresuTipoProyecto = jCheckBoxConGraficoDinamicoPresuTipoProyecto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPresuTipoProyecto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPresuTipoProyecto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPresuTipoProyecto .setBorder(borderResaltar);		
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
		this.presutipoproyectoSessionBean=new PresuTipoProyectoSessionBean();
		
		this.presutipoproyectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presutipoproyectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presutipoproyectoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PresuTipoProyectoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PresuTipoProyectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresuTipoProyectoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresuTipoProyectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresuTipoProyectoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Proyecto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
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
		
		PresuTipoProyectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PresuTipoProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPresuTipoProyecto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPresuTipoProyecto,this.jTtoolBarPresuTipoProyecto,
							"nuevo","nuevo","Nuevo"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPresuTipoProyecto,this.jTtoolBarPresuTipoProyecto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPresuTipoProyecto,this.jTtoolBarPresuTipoProyecto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPresuTipoProyecto,this.jTtoolBarPresuTipoProyecto,
							"duplicar","duplicar","Duplicar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPresuTipoProyecto,this.jTtoolBarPresuTipoProyecto,
							"copiar","copiar","Copiar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPresuTipoProyecto,this.jTtoolBarPresuTipoProyecto,
							"ver_form","ver_form","Ver"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuTipoProyecto,this.jTtoolBarPresuTipoProyecto,
							"recargar","recargar","Recargar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuTipoProyecto,this.jTtoolBarPresuTipoProyecto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuTipoProyecto,this.jTtoolBarPresuTipoProyecto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPresuTipoProyecto,this.jTtoolBarPresuTipoProyecto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPresuTipoProyecto,this.jTtoolBarPresuTipoProyecto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPresuTipoProyecto,this.jTtoolBarPresuTipoProyecto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPresuTipoProyecto,this.jTtoolBarPresuTipoProyecto,
							"cerrar","cerrar","Salir"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPresuTipoProyecto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPresuTipoProyecto;
			
				this.jButtonProcesarInformacionToolBarPresuTipoProyecto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPresuTipoProyecto;
				
		//protected JButton jButtonModificarToolBarPresuTipoProyecto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPresuTipoProyecto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPresuTipoProyecto=new JMenuMe("General");
		this.jmenuArchivoPresuTipoProyecto=new JMenuMe("Archivo");
		this.jmenuAccionesPresuTipoProyecto=new JMenuMe("Acciones");
		this.jmenuDatosPresuTipoProyecto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresuTipoProyecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresuTipoProyecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresuTipoProyecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPresuTipoProyecto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPresuTipoProyecto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPresuTipoProyecto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPresuTipoProyecto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPresuTipoProyecto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPresuTipoProyecto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPresuTipoProyecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresuTipoProyecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresuTipoProyecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPresuTipoProyecto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPresuTipoProyecto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPresuTipoProyecto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPresuTipoProyecto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPresuTipoProyecto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPresuTipoProyecto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPresuTipoProyecto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPresuTipoProyecto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPresuTipoProyecto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresuTipoProyecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresuTipoProyecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresuTipoProyecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPresuTipoProyecto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPresuTipoProyecto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPresuTipoProyecto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPresuTipoProyecto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPresuTipoProyecto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPresuTipoProyecto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPresuTipoProyecto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPresuTipoProyecto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPresuTipoProyecto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPresuTipoProyecto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPresuTipoProyecto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPresuTipoProyecto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPresuTipoProyecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPresuTipoProyecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPresuTipoProyecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresuTipoProyecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresuTipoProyecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresuTipoProyecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPresuTipoProyecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPresuTipoProyecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPresuTipoProyecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresuTipoProyecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresuTipoProyecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresuTipoProyecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPresuTipoProyecto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPresuTipoProyecto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPresuTipoProyecto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPresuTipoProyecto.add(this.jMenuItemCerrarPresuTipoProyecto);
			
			this.jmenuAccionesPresuTipoProyecto.add(this.jMenuItemNuevoPresuTipoProyecto);
			this.jmenuAccionesPresuTipoProyecto.add(this.jMenuItemNuevoGuardarCambiosPresuTipoProyecto);
			this.jmenuAccionesPresuTipoProyecto.add(this.jMenuItemNuevoRelacionesPresuTipoProyecto);
			this.jmenuAccionesPresuTipoProyecto.add(this.jMenuItemGuardarCambiosTablaPresuTipoProyecto);		
			this.jmenuAccionesPresuTipoProyecto.add(this.jMenuItemDuplicarPresuTipoProyecto);		
			this.jmenuAccionesPresuTipoProyecto.add(this.jMenuItemCopiarPresuTipoProyecto);		
			this.jmenuAccionesPresuTipoProyecto.add(this.jMenuItemVerFormPresuTipoProyecto);		
			
			this.jmenuDatosPresuTipoProyecto.add(this.jMenuItemRecargarInformacionPresuTipoProyecto);				
			this.jmenuDatosPresuTipoProyecto.add(this.jMenuItemAnterioresPresuTipoProyecto);				
			this.jmenuDatosPresuTipoProyecto.add(this.jMenuItemSiguientesPresuTipoProyecto);				
			this.jmenuDatosPresuTipoProyecto.add(this.jMenuItemAbrirOrderByPresuTipoProyecto);				
			this.jmenuDatosPresuTipoProyecto.add(this.jMenuItemMostrarOcultarPresuTipoProyecto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPresuTipoProyecto.add(this.jMenuItemGuardarCambiosPresuTipoProyecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPresuTipoProyecto.add(this.jmenuArchivoPresuTipoProyecto);		
			this.jmenuBarPresuTipoProyecto.add(this.jmenuAccionesPresuTipoProyecto);		
			this.jmenuBarPresuTipoProyecto.add(this.jmenuDatosPresuTipoProyecto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPresuTipoProyecto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPresuTipoProyecto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoPresuTipoProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoPresuTipoProyecto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoPresuTipoProyecto= new JButtonMe();
		this.jButtonBusquedaPorCodigoPresuTipoProyecto.setText("Buscar");
		this.jButtonBusquedaPorCodigoPresuTipoProyecto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoPresuTipoProyecto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoPresuTipoProyecto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoPresuTipoProyecto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoPresuTipoProyecto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoPresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoPresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoPresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoPresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoPresuTipoProyecto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoPresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoPresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoPresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoPresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombrePresuTipoProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombrePresuTipoProyecto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombrePresuTipoProyecto= new JButtonMe();
		this.jButtonBusquedaPorNombrePresuTipoProyecto.setText("Buscar");
		this.jButtonBusquedaPorNombrePresuTipoProyecto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombrePresuTipoProyecto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombrePresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombrePresuTipoProyecto = new JLabelMe();
		jLabelnombreBusquedaPorNombrePresuTipoProyecto.setText("Nombre :");
		jLabelnombreBusquedaPorNombrePresuTipoProyecto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombrePresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombrePresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombrePresuTipoProyecto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombrePresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombrePresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombrePresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombrePresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPresuTipoProyecto=new JTabbedPane();


		this.jTabbedPaneBusquedasPresuTipoProyecto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresuTipoProyecto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresuTipoProyecto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPresuTipoProyecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePresuTipoProyecto = new PresuTipoProyectoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Proyecto DATOS");
			this.jInternalFrameDetalleFormPresuTipoProyecto = new PresuTipoProyectoDetalleFormJInternalFrame(jDesktopPane,this.presutipoproyectoSessionBean.getConGuardarRelaciones(),this.presutipoproyectoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPresuTipoProyecto = null;//new PresuTipoProyectoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresuTipoProyecto= new GridBagLayout();
		
		
		this.jTableDatosPresuTipoProyecto = new JTableMe();      
		
		String sToolTipPresuTipoProyecto="";
		sToolTipPresuTipoProyecto=PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresuTipoProyecto+="(Contabilidad.PresuTipoProyecto)";
		}
		
		if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresuTipoProyecto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPresuTipoProyecto.setToolTipText(sToolTipPresuTipoProyecto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPresuTipoProyecto);
		this.jTableDatosPresuTipoProyecto.setAutoCreateRowSorter(true);
		this.jTableDatosPresuTipoProyecto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPresuTipoProyecto.setRowSelectionAllowed(true);
		this.jTableDatosPresuTipoProyecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPresuTipoProyecto = new JButtonMe();
		this.jButtonDuplicarPresuTipoProyecto = new JButtonMe();
		this.jButtonCopiarPresuTipoProyecto = new JButtonMe();
		this.jButtonVerFormPresuTipoProyecto = new JButtonMe();
		this.jButtonNuevoRelacionesPresuTipoProyecto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPresuTipoProyecto = new JButtonMe();
		this.jButtonCerrarPresuTipoProyecto = new JButtonMe();
		
		this.jScrollPanelDatosPresuTipoProyecto = new JScrollPane();   
        this.jScrollPanelDatosGeneralPresuTipoProyecto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPresuTipoProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Proyecto";
		
		if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proyectos" + this.sPath));
		} else {
			this.jScrollPanelDatosPresuTipoProyecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresuTipoProyecto.setToolTipText("Acciones");
        this.jPanelAccionesPresuTipoProyecto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPresuTipoProyecto=new ReporteDinamicoJInternalFrame(PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPresuTipoProyecto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPresuTipoProyecto=new ImportacionJInternalFrame(PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPresuTipoProyecto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPresuTipoProyecto = new JButtonMe();
		
		this.jButtonAbrirOrderByPresuTipoProyecto.setText("Orden");
		this.jButtonAbrirOrderByPresuTipoProyecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresuTipoProyecto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPresuTipoProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresuTipoProyecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuTipoProyecto,false,this);
			
			//this.cargarOrderByPresuTipoProyecto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresuTipoProyecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuTipoProyecto,true,this);
			
			//this.cargarOrderByPresuTipoProyecto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPresuTipoProyecto.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosPresuTipoProyecto.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosPresuTipoProyecto.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosPresuTipoProyecto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresuTipoProyecto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresuTipoProyecto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPresuTipoProyecto.setText("Nuevo");
		this.jButtonDuplicarPresuTipoProyecto.setText("Duplicar");
		this.jButtonCopiarPresuTipoProyecto.setText("Copiar");
		this.jButtonVerFormPresuTipoProyecto.setText("Ver");
		this.jButtonNuevoRelacionesPresuTipoProyecto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPresuTipoProyecto.setText("Guardar");
		this.jButtonCerrarPresuTipoProyecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresuTipoProyecto,"nuevo_button","Nuevo",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPresuTipoProyecto,"duplicar_button","Duplicar",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPresuTipoProyecto,"copiar_button","Copiar",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPresuTipoProyecto,"ver_form","Ver",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPresuTipoProyecto,"nuevorelaciones_button","Nuevo Rel",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresuTipoProyecto,"guardarcambiostabla_button","Guardar",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresuTipoProyecto,"cerrar_button","Salir",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPresuTipoProyecto.setToolTipText("Nuevo"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPresuTipoProyecto.setToolTipText("Duplicar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPresuTipoProyecto.setToolTipText("Copiar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPresuTipoProyecto.setToolTipText("Ver"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPresuTipoProyecto.setToolTipText("Nuevo Rel"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPresuTipoProyecto.setToolTipText("Guardar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresuTipoProyecto.setToolTipText("Salir"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresuTipoProyecto";
		inputMap = this.jButtonNuevoPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresuTipoProyecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresuTipoProyecto"));
		
		//DUPLICAR
		sMapKey = "DuplicarPresuTipoProyecto";
		inputMap = this.jButtonDuplicarPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPresuTipoProyecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPresuTipoProyecto"));
		
		//COPIAR
		sMapKey = "CopiarPresuTipoProyecto";
		inputMap = this.jButtonCopiarPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPresuTipoProyecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPresuTipoProyecto"));
		
		//VEr FORM
		sMapKey = "VerFormPresuTipoProyecto";
		inputMap = this.jButtonVerFormPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPresuTipoProyecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPresuTipoProyecto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPresuTipoProyecto";
		inputMap = this.jButtonNuevoRelacionesPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPresuTipoProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPresuTipoProyecto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPresuTipoProyecto";
		inputMap = this.jButtonModificarPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPresuTipoProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPresuTipoProyecto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPresuTipoProyecto";
		inputMap = this.jButtonCerrarPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresuTipoProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresuTipoProyecto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresuTipoProyecto";
		inputMap = this.jButtonGuardarCambiosTablaPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresuTipoProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresuTipoProyecto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPresuTipoProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPresuTipoProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPresuTipoProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PresuTipoProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PresuTipoProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PresuTipoProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PresuTipoProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PresuTipoProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPresuTipoProyecto.setName("jPanelParametrosReportesPresuTipoProyecto"); 
		
		this.jPanelParametrosReportesAccionesPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPresuTipoProyecto.setName("jPanelParametrosReportesAccionesPresuTipoProyecto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPresuTipoProyecto = new JButtonMe();
		this.jButtonRecargarInformacionPresuTipoProyecto.setText("Recargar");
		this.jButtonRecargarInformacionPresuTipoProyecto.setToolTipText("Recargar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPresuTipoProyecto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPresuTipoProyecto = new JButtonMe();
		this.jButtonProcesarInformacionPresuTipoProyecto.setText("Procesar");
		this.jButtonProcesarInformacionPresuTipoProyecto.setToolTipText("Procesar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPresuTipoProyecto.setVisible(false);
			
		this.jButtonProcesarInformacionPresuTipoProyecto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresuTipoProyecto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresuTipoProyecto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPresuTipoProyecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuTipoProyecto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPresuTipoProyecto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPresuTipoProyecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuTipoProyecto.setText("TIPO");       
		this.jComboBoxTiposReportesPresuTipoProyecto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPresuTipoProyecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuTipoProyecto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPresuTipoProyecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPresuTipoProyecto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPresuTipoProyecto.setText("Paginacion");
		this.jComboBoxTiposPaginacionPresuTipoProyecto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPresuTipoProyecto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPresuTipoProyecto.setText("Accion");
		this.jComboBoxTiposRelacionesPresuTipoProyecto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPresuTipoProyecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresuTipoProyecto.setText("Accion");
		this.jComboBoxTiposAccionesPresuTipoProyecto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPresuTipoProyecto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPresuTipoProyecto.setText("Accion");
		this.jComboBoxTiposSeleccionarPresuTipoProyecto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPresuTipoProyecto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPresuTipoProyecto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresuTipoProyecto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresuTipoProyecto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPresuTipoProyecto = new JLabelMe();
		
		this.jLabelAccionesPresuTipoProyecto.setText("Acciones");		
		this.jLabelAccionesPresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPresuTipoProyecto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPresuTipoProyecto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPresuTipoProyecto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPresuTipoProyecto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPresuTipoProyecto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPresuTipoProyecto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPresuTipoProyecto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPresuTipoProyecto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPresuTipoProyecto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePresuTipoProyecto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePresuTipoProyecto.setText("Graf.");
		this.jCheckBoxConGraficoReportePresuTipoProyecto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPresuTipoProyecto = new JButtonMe();
		//this.jButtonAnterioresPresuTipoProyecto.setText("<<");
        this.jButtonAnterioresPresuTipoProyecto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPresuTipoProyecto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPresuTipoProyecto = new JButtonMe();
		//this.jButtonSiguientesPresuTipoProyecto.setText(">>");
        this.jButtonSiguientesPresuTipoProyecto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPresuTipoProyecto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPresuTipoProyecto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPresuTipoProyecto.setText("Nue");
        this.jButtonNuevoGuardarCambiosPresuTipoProyecto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPresuTipoProyecto,"nuevoguardarcambios_button","Nue",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPresuTipoProyecto";
		inputMap = this.jButtonNuevoGuardarCambiosPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPresuTipoProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPresuTipoProyecto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPresuTipoProyecto";
		inputMap = this.jButtonRecargarInformacionPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPresuTipoProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPresuTipoProyecto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPresuTipoProyecto";
		inputMap = this.jButtonSiguientesPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPresuTipoProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPresuTipoProyecto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPresuTipoProyecto";
		inputMap = this.jButtonAnterioresPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPresuTipoProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPresuTipoProyecto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPresuTipoProyecto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPresuTipoProyecto.setMinimumSize(new Dimension(this.getWidth(),PresuTipoProyectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuTipoProyectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresuTipoProyecto.setMaximumSize(new Dimension(this.getWidth(),PresuTipoProyectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuTipoProyectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresuTipoProyecto.setPreferredSize(new Dimension(this.getWidth(),PresuTipoProyectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuTipoProyectoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPresuTipoProyecto = new GridBagLayout();

			this.jPanelPaginacionPresuTipoProyecto.setLayout(gridaBagLayoutPaginacionPresuTipoProyecto);						
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
			this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPresuTipoProyecto.add(this.jButtonAnterioresPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
					
						
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
			
			this.jPanelPaginacionPresuTipoProyecto.add(this.jButtonNuevoGuardarCambiosPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
						
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
			this.jPanelPaginacionPresuTipoProyecto.add(this.jButtonSiguientesPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.gridy = 1;
			this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuTipoProyecto.add(this.jButtonNuevoPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
						
			
			
			if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
				this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresuTipoProyecto.gridy = 1;
				this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPresuTipoProyecto.add(this.jButtonGuardarCambiosTablaPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
			}
			
			
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.gridy = 1;
			this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuTipoProyecto.add(this.jButtonDuplicarPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.gridy = 1;
			this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuTipoProyecto.add(this.jButtonCopiarPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.gridy = 1;
			this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuTipoProyecto.add(this.jButtonVerFormPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.gridy = 1;
			this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPresuTipoProyecto.add(this.jButtonCerrarPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		
		
		
		this.jButtonRecargarInformacionPresuTipoProyecto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresuTipoProyecto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresuTipoProyecto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPresuTipoProyecto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresuTipoProyecto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresuTipoProyecto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPresuTipoProyecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresuTipoProyecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresuTipoProyecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPresuTipoProyecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresuTipoProyecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresuTipoProyecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPresuTipoProyecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresuTipoProyecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresuTipoProyecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPresuTipoProyecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresuTipoProyecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresuTipoProyecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPresuTipoProyecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuTipoProyecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuTipoProyecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPresuTipoProyecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresuTipoProyecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresuTipoProyecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPresuTipoProyecto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresuTipoProyecto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresuTipoProyecto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePresuTipoProyecto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresuTipoProyecto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresuTipoProyecto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPresuTipoProyecto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresuTipoProyecto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresuTipoProyecto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPresuTipoProyecto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresuTipoProyecto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresuTipoProyecto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPresuTipoProyecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPresuTipoProyecto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PresuTipoProyecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PresuTipoProyecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PresuTipoProyecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PresuTipoProyecto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPresuTipoProyecto.setLayout(gridaBagParametrosReportesPresuTipoProyecto);
			this.jPanelParametrosReportesAccionesPresuTipoProyecto.setLayout(gridaBagParametrosReportesAccionesPresuTipoProyecto);
			
			
			this.jPanelParametrosAuxiliar1PresuTipoProyecto.setLayout(gridaBagParametrosAuxiliar1PresuTipoProyecto);
			this.jPanelParametrosAuxiliar2PresuTipoProyecto.setLayout(gridaBagParametrosAuxiliar2PresuTipoProyecto);
			this.jPanelParametrosAuxiliar3PresuTipoProyecto.setLayout(gridaBagParametrosAuxiliar3PresuTipoProyecto);
			this.jPanelParametrosAuxiliar4PresuTipoProyecto.setLayout(gridaBagParametrosAuxiliar4PresuTipoProyecto);
			//this.jPanelParametrosAuxiliar5PresuTipoProyecto.setLayout(gridaBagParametrosAuxiliar2PresuTipoProyecto);			
			
			
			
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuTipoProyecto.add(this.jButtonRecargarInformacionPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuTipoProyecto.add(this.jComboBoxTiposPaginacionPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuTipoProyecto.add(this.jCheckBoxConAltoMaximoTablaPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuTipoProyecto.add(this.jComboBoxTiposArchivosReportesPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuTipoProyecto.add(this.jPanelParametrosAuxiliar1PresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuTipoProyecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PresuTipoProyecto.add(this.jComboBoxTiposReportesPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuTipoProyecto.add(this.jPanelParametrosAuxiliar4PresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuTipoProyecto.add(this.jComboBoxTiposReportesPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuTipoProyecto.add(this.jCheckBoxGenerarReportePresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuTipoProyecto.add(this.jPanelParametrosAuxiliar2PresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuTipoProyecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuTipoProyecto.add(this.jLabelAccionesPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
				this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPresuTipoProyecto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPresuTipoProyecto.add(this.jButtonAbrirOrderByPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuTipoProyecto.add(this.jComboBoxTiposSeleccionarPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);			
			
			
			/*
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuTipoProyecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuTipoProyecto.add(this.jCheckBoxSeleccionarTodosPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuTipoProyecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuTipoProyecto.add(this.jCheckBoxSeleccionarTodosPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);															
				
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuTipoProyecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuTipoProyecto.add(this.jCheckBoxSeleccionadosPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuTipoProyecto.add(this.jPanelParametrosAuxiliar3PresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuTipoProyecto.add(this.jComboBoxTiposRelacionesPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
				
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuTipoProyecto.add(this.jComboBoxTiposAccionesPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
	
				
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuTipoProyecto.add(this.jTextFieldValorCampoGeneralPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPresuTipoProyecto = new GridBagLayout();

			this.jScrollPanelDatosPresuTipoProyecto.setLayout(gridaBagLayoutDatosPresuTipoProyecto);
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
			this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
			
			this.jScrollPanelDatosPresuTipoProyecto.add(this.jTableDatosPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPresuTipoProyecto.setViewportView(this.jTableDatosPresuTipoProyecto);
		this.jTableDatosPresuTipoProyecto.setFillsViewportHeight(true);
		this.jTableDatosPresuTipoProyecto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresuTipoProyecto= new GridBagLayout();
		this.jPanelAccionesPresuTipoProyecto.setLayout(gridaBagLayoutAccionesPresuTipoProyecto);
		
		
		/*	
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
		this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
			
		this.jPanelAccionesPresuTipoProyecto.add(this.jButtonNuevoPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoPresuTipoProyecto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoPresuTipoProyecto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoPresuTipoProyecto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoPresuTipoProyecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoPresuTipoProyecto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoPresuTipoProyecto.setLayout(gridaBagLayoutBusquedaPorCodigoPresuTipoProyecto);

		gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTipoProyecto.gridy = 0;
		gridBagConstraintsPresuTipoProyecto.gridx = 0;
		jPanelBusquedaPorCodigoPresuTipoProyecto.add(jLabelcodigoBusquedaPorCodigoPresuTipoProyecto, gridBagConstraintsPresuTipoProyecto);

		gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTipoProyecto.gridy = 0;
		gridBagConstraintsPresuTipoProyecto.gridx = 1;
		jPanelBusquedaPorCodigoPresuTipoProyecto.add(jTextFieldcodigoBusquedaPorCodigoPresuTipoProyecto, gridBagConstraintsPresuTipoProyecto);

		gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTipoProyecto.gridy = 1;
		gridBagConstraintsPresuTipoProyecto.gridx =1;
		jPanelBusquedaPorCodigoPresuTipoProyecto.add(jButtonBusquedaPorCodigoPresuTipoProyecto, gridBagConstraintsPresuTipoProyecto);

		jTabbedPaneBusquedasPresuTipoProyecto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoPresuTipoProyecto);
		jTabbedPaneBusquedasPresuTipoProyecto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombrePresuTipoProyecto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombrePresuTipoProyecto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePresuTipoProyecto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePresuTipoProyecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombrePresuTipoProyecto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombrePresuTipoProyecto.setLayout(gridaBagLayoutBusquedaPorNombrePresuTipoProyecto);

		gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTipoProyecto.gridy = 0;
		gridBagConstraintsPresuTipoProyecto.gridx = 0;
		jPanelBusquedaPorNombrePresuTipoProyecto.add(jLabelnombreBusquedaPorNombrePresuTipoProyecto, gridBagConstraintsPresuTipoProyecto);

		gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTipoProyecto.gridy = 0;
		gridBagConstraintsPresuTipoProyecto.gridx = 1;
		jPanelBusquedaPorNombrePresuTipoProyecto.add(jTextAreanombreBusquedaPorNombrePresuTipoProyecto, gridBagConstraintsPresuTipoProyecto);

		gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTipoProyecto.gridy = 1;
		gridBagConstraintsPresuTipoProyecto.gridx =1;
		jPanelBusquedaPorNombrePresuTipoProyecto.add(jButtonBusquedaPorNombrePresuTipoProyecto, gridBagConstraintsPresuTipoProyecto);

		jTabbedPaneBusquedasPresuTipoProyecto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombrePresuTipoProyecto);
		jTabbedPaneBusquedasPresuTipoProyecto.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresuTipoProyecto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresuTipoProyecto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();						
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuTipoProyecto.gridx = 0;		
			//this.gridBagConstraintsPresuTipoProyecto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresuTipoProyecto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPresuTipoProyecto.gridx = 0;		
		//this.gridBagConstraintsPresuTipoProyecto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPresuTipoProyecto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPresuTipoProyecto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuTipoProyecto.gridx = 0;		
			this.gridBagConstraintsPresuTipoProyecto.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPresuTipoProyecto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);								
		
		
		/*
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		*/		
		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresuTipoProyecto.gridx =0;
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresuTipoProyecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
				
		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PresuTipoProyectoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPresuTipoProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresuTipoProyecto = new GridBagLayout();
			this.jPanelBusquedasParametrosPresuTipoProyecto.setLayout(gridaBagLayoutBusquedasParametrosPresuTipoProyecto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPresuTipoProyecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresuTipoProyecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuTipoProyecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuTipoProyecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
			
			
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		
			
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoProyecto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPresuTipoProyecto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPresuTipoProyecto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPresuTipoProyecto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPresuTipoProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPresuTipoProyecto.setName("jPanelReporteDinamicoPresuTipoProyecto"); 
		
		this.jPanelReporteDinamicoPresuTipoProyecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresuTipoProyecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresuTipoProyecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPresuTipoProyecto.setLayout(gridaBagLayoutReporteDinamicoPresuTipoProyecto);
		
		
		this.jInternalFrameReporteDinamicoPresuTipoProyecto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPresuTipoProyecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresuTipoProyecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPresuTipoProyecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPresuTipoProyecto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPresuTipoProyecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPresuTipoProyecto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPresuTipoProyecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPresuTipoProyecto.setResizable(true);
	    this.jInternalFrameReporteDinamicoPresuTipoProyecto.setClosable(true);
	    this.jInternalFrameReporteDinamicoPresuTipoProyecto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPresuTipoProyecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresuTipoProyecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresuTipoProyecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proyectos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePresuTipoProyecto = new JLabelMe();

		this.jLabelColumnasSelectReportePresuTipoProyecto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuTipoProyecto.add(this.jLabelColumnasSelectReportePresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePresuTipoProyecto = new JList<Reporte>();
		this.jListColumnasSelectReportePresuTipoProyecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePresuTipoProyecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePresuTipoProyecto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresuTipoProyecto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresuTipoProyecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePresuTipoProyecto=new JScrollPane(this.jListColumnasSelectReportePresuTipoProyecto);
			
			this.jScrollColumnasSelectReportePresuTipoProyecto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresuTipoProyecto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresuTipoProyecto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresuTipoProyecto.add(this.jListColumnasSelectReportePresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		this.jPanelReporteDinamicoPresuTipoProyecto.add(this.jScrollColumnasSelectReportePresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePresuTipoProyecto = new JLabelMe();

		this.jLabelRelacionesSelectReportePresuTipoProyecto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePresuTipoProyecto = new JList<Reporte>();
		this.jListRelacionesSelectReportePresuTipoProyecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePresuTipoProyecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePresuTipoProyecto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresuTipoProyecto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresuTipoProyecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePresuTipoProyecto=new JScrollPane(this.jListRelacionesSelectReportePresuTipoProyecto);
			
			this.jScrollRelacionesSelectReportePresuTipoProyecto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresuTipoProyecto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresuTipoProyecto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPresuTipoProyecto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPresuTipoProyecto = new JComboBoxMe();
		this.jListColumnasValoresGraficoPresuTipoProyecto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPresuTipoProyecto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPresuTipoProyecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPresuTipoProyecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresuTipoProyecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresuTipoProyecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPresuTipoProyecto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPresuTipoProyecto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPresuTipoProyecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresuTipoProyecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresuTipoProyecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPresuTipoProyecto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPresuTipoProyecto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuTipoProyecto.add(this.jLabelGenerarExcelReporteDinamicoPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPresuTipoProyecto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPresuTipoProyecto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPresuTipoProyecto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPresuTipoProyecto.setToolTipText("Generar EXCEL"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPresuTipoProyecto.add(this.jButtonGenerarExcelReporteDinamicoPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuTipoProyecto.add(this.jComboBoxTiposReportesDinamicoPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPresuTipoProyecto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPresuTipoProyecto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuTipoProyecto.add(this.jLabelTiposArchivoReporteDinamicoPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuTipoProyecto.add(this.jComboBoxTiposArchivosReportesDinamicoPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPresuTipoProyecto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPresuTipoProyecto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPresuTipoProyecto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPresuTipoProyecto.setToolTipText("Generar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuTipoProyecto.add(this.jButtonGenerarReporteDinamicoPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPresuTipoProyecto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPresuTipoProyecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPresuTipoProyecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPresuTipoProyecto.setToolTipText("Cancelar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuTipoProyecto.add(this.jButtonCerrarReporteDinamicoPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPresuTipoProyecto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPresuTipoProyecto= new JScrollPane(jPanelReporteDinamicoPresuTipoProyecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPresuTipoProyecto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresuTipoProyecto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresuTipoProyecto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proyectos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPresuTipoProyecto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPresuTipoProyecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPresuTipoProyecto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPresuTipoProyecto);
		this.jInternalFrameReporteDinamicoPresuTipoProyecto.getContentPane().add(this.jScrollPanelReporteDinamicoPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPresuTipoProyecto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPresuTipoProyecto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPresuTipoProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPresuTipoProyecto.setName("jPanelImportacionPresuTipoProyecto"); 
		
		this.jPanelImportacionPresuTipoProyecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresuTipoProyecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresuTipoProyecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPresuTipoProyecto.setLayout(gridaBagLayoutImportacionPresuTipoProyecto);
		
		
		this.jInternalFrameImportacionPresuTipoProyecto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPresuTipoProyecto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPresuTipoProyecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresuTipoProyecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPresuTipoProyecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresuTipoProyecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresuTipoProyecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPresuTipoProyecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresuTipoProyecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresuTipoProyecto.setResizable(true);
	    this.jInternalFrameImportacionPresuTipoProyecto.setClosable(true);
	    this.jInternalFrameImportacionPresuTipoProyecto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPresuTipoProyecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresuTipoProyecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresuTipoProyecto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPresuTipoProyecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresuTipoProyecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresuTipoProyecto.setResizable(true);
	    this.jInternalFrameImportacionPresuTipoProyecto.setClosable(true);
	    this.jInternalFrameImportacionPresuTipoProyecto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPresuTipoProyecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresuTipoProyecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresuTipoProyecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proyectos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPresuTipoProyecto = new JLabelMe();

		this.jLabelArchivoImportacionPresuTipoProyecto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresuTipoProyecto.add(this.jLabelArchivoImportacionPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPresuTipoProyecto = new JFileChooser();		
		this.jFileChooserImportacionPresuTipoProyecto.setToolTipText("ESCOGER ARCHIVO"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPresuTipoProyecto = new JButtonMe();
		this.jButtonAbrirImportacionPresuTipoProyecto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPresuTipoProyecto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPresuTipoProyecto.setToolTipText("Generar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuTipoProyecto.add(this.jButtonAbrirImportacionPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPresuTipoProyecto = new JLabelMe();

		this.jLabelPathArchivoImportacionPresuTipoProyecto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresuTipoProyecto.add(this.jLabelPathArchivoImportacionPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPresuTipoProyecto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPresuTipoProyecto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresuTipoProyecto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresuTipoProyecto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuTipoProyecto.add(this.jTextFieldPathArchivoImportacionPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPresuTipoProyecto = new JButtonMe();
		this.jButtonGenerarImportacionPresuTipoProyecto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPresuTipoProyecto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPresuTipoProyecto.setToolTipText("Generar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuTipoProyecto.add(this.jButtonGenerarImportacionPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPresuTipoProyecto = new JButtonMe();
		this.jButtonCerrarImportacionPresuTipoProyecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPresuTipoProyecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPresuTipoProyecto.setToolTipText("Cancelar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuTipoProyecto.add(this.jButtonCerrarImportacionPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPresuTipoProyecto = new GridBagLayout();
		
		this.jScrollPanelImportacionPresuTipoProyecto= new JScrollPane(jPanelImportacionPresuTipoProyecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy =iPosYImportacion;
		this.gridBagConstraintsPresuTipoProyecto.gridx =iPosXImportacion;
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPresuTipoProyecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPresuTipoProyecto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPresuTipoProyecto);
		this.jInternalFrameImportacionPresuTipoProyecto.getContentPane().add(this.jScrollPanelImportacionPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPresuTipoProyecto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPresuTipoProyecto = new JButtonMe();
			this.jButtonAbrirOrderByPresuTipoProyecto.setText("Orden");
			this.jButtonAbrirOrderByPresuTipoProyecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresuTipoProyecto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPresuTipoProyecto";
			inputMap = this.jButtonAbrirOrderByPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPresuTipoProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPresuTipoProyecto"));
		
		
			GridBagLayout gridaBagLayoutOrderByPresuTipoProyecto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPresuTipoProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPresuTipoProyecto.setName("jPanelOrderByPresuTipoProyecto"); 
			
			this.jPanelOrderByPresuTipoProyecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresuTipoProyecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresuTipoProyecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPresuTipoProyecto.setLayout(gridaBagLayoutOrderByPresuTipoProyecto);
			
			
			this.jTableDatosPresuTipoProyectoOrderBy = new JTableMe();        
			this.jTableDatosPresuTipoProyectoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPresuTipoProyectoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPresuTipoProyectoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPresuTipoProyectoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPresuTipoProyectoOrderBy.setViewportView(this.jTableDatosPresuTipoProyectoOrderBy);
			this.jTableDatosPresuTipoProyectoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPresuTipoProyectoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPresuTipoProyecto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPresuTipoProyecto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPresuTipoProyecto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePresuTipoProyecto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPresuTipoProyecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPresuTipoProyecto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPresuTipoProyecto.setTitle("Orden");
			this.jInternalFrameOrderByPresuTipoProyecto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPresuTipoProyecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPresuTipoProyecto.setResizable(true);
			this.jInternalFrameOrderByPresuTipoProyecto.setClosable(true);
			this.jInternalFrameOrderByPresuTipoProyecto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPresuTipoProyecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresuTipoProyecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresuTipoProyecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proyectos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPresuTipoProyecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPresuTipoProyecto.ipady =150;
				
			this.jPanelOrderByPresuTipoProyecto.add(jScrollPanelDatosPresuTipoProyectoOrderBy, this.gridBagConstraintsPresuTipoProyecto);//this.jTableDatosPresuTipoProyectoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPresuTipoProyecto = new JButtonMe();
			this.jButtonCerrarOrderByPresuTipoProyecto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPresuTipoProyecto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPresuTipoProyecto.setToolTipText("Cancelar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPresuTipoProyecto.add(this.jButtonCerrarOrderByPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPresuTipoProyecto = new GridBagLayout();
			
			this.jScrollPanelOrderByPresuTipoProyecto= new JScrollPane(jPanelOrderByPresuTipoProyecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.gridy =iPosYOrderBy;
			this.gridBagConstraintsPresuTipoProyecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPresuTipoProyecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPresuTipoProyecto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPresuTipoProyecto);
			
			this.jInternalFrameOrderByPresuTipoProyecto.getContentPane().add(this.jScrollPanelOrderByPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);			
		
		} else {
			this.jButtonAbrirOrderByPresuTipoProyecto = new JButtonMe();
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
			&& this.presutipoproyectoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPresuTipoProyecto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPresuTipoProyecto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPresuTipoProyecto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPresuTipoProyecto.getRowHeight();//PresuTipoProyectoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PresuTipoProyectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresuTipoProyecto.isSelected()) {
					iHeightTable=PresuTipoProyectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresuTipoProyectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresuTipoProyectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PresuTipoProyectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresuTipoProyecto.isSelected()) {
					iHeightTable=PresuTipoProyectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresuTipoProyectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresuTipoProyectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPresuTipoProyecto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresuTipoProyecto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresuTipoProyecto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPresuTipoProyecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresuTipoProyecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresuTipoProyecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPresuTipoProyecto!=null && this.jInternalFrameOrderByPresuTipoProyecto.getjTableDatosOrderBy()!=null) {
			//if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPresuTipoProyecto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPresuTipoProyecto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPresuTipoProyecto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPresuTipoProyecto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPresuTipoProyecto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPresuTipoProyecto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPresuTipoProyecto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPresuTipoProyecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresuTipoProyecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresuTipoProyecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=presutipoproyectoLogic.getPresuTipoProyectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presutipoproyectos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PresuTipoProyecto> TraerPresuTipoProyectoBeans(List<PresuTipoProyecto> presutipoproyectos,ArrayList<Classe> classes)throws Exception {
		try {
			for(PresuTipoProyecto presutipoproyecto:presutipoproyectos) {
					
				if(!(PresuTipoProyectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PresuTipoProyectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					presutipoproyecto.setsDetalleGeneralEntityReporte(PresuTipoProyectoConstantesFunciones.getPresuTipoProyectoDescripcion(presutipoproyecto));
										
						
					
						
					
				} else  {
							
					//presutipoproyecto.setsDetalleGeneralEntityReporte(presutipoproyecto.getsDetalleGeneralEntityReporte());
										
				}
				
				//presutipoproyectobeans.add(presutipoproyectobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return presutipoproyectos;
    }
	//PARA REPORTES FIN
}
