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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.IndiceCorreccionActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class IndiceCorreccionActivoFijoJInternalFrame extends IndiceCorreccionActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarIndiceCorreccionActivoFijo;
	
	protected JMenuBar jmenuBarIndiceCorreccionActivoFijo;
	
	protected JMenu jmenuIndiceCorreccionActivoFijo;
	protected JMenu jmenuDatosIndiceCorreccionActivoFijo;
	protected JMenu jmenuArchivoIndiceCorreccionActivoFijo;
	protected JMenu jmenuAccionesIndiceCorreccionActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosIndiceCorreccionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutIndiceCorreccionActivoFijo;	
	protected GridBagConstraints gridBagConstraintsIndiceCorreccionActivoFijo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public IndiceCorreccionActivoFijoDetalleFormJInternalFrame jInternalFrameDetalleFormIndiceCorreccionActivoFijo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionIndiceCorreccionActivoFijo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public IndiceCorreccionActivoFijoSessionBean indicecorreccionactivofijoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<IndiceCorreccionActivoFijo> indicecorreccionactivofijos;		
	public List<IndiceCorreccionActivoFijo> indicecorreccionactivofijosEliminados;	
	public List<IndiceCorreccionActivoFijo> indicecorreccionactivofijosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByIndiceCorreccionActivoFijo;		
	protected JButton jButtonAbrirOrderByIndiceCorreccionActivoFijo;
	
	
	//protected JPanel jPanelOrderByIndiceCorreccionActivoFijo;
	//public JScrollPane jScrollPanelOrderByIndiceCorreccionActivoFijo;	
	//protected JButton jButtonCerrarOrderByIndiceCorreccionActivoFijo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public IndiceCorreccionActivoFijoLogic indicecorreccionactivofijoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosIndiceCorreccionActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionIndiceCorreccionActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralIndiceCorreccionActivoFijo;
    
	
	
	//public JScrollPane jScrollPanelDatosIndiceCorreccionActivoFijoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoIndiceCorreccionActivoFijo;
	//public JScrollPane jScrollPanelImportacionIndiceCorreccionActivoFijo;
	
	
	
	protected JPanel jPanelAccionesIndiceCorreccionActivoFijo;
	
    protected JPanel jPanelPaginacionIndiceCorreccionActivoFijo;
    protected JPanel jPanelParametrosReportesIndiceCorreccionActivoFijo;
	protected JPanel jPanelParametrosReportesAccionesIndiceCorreccionActivoFijo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1IndiceCorreccionActivoFijo;
	protected JPanel jPanelParametrosAuxiliar2IndiceCorreccionActivoFijo;
	protected JPanel jPanelParametrosAuxiliar3IndiceCorreccionActivoFijo;
	protected JPanel jPanelParametrosAuxiliar4IndiceCorreccionActivoFijo;
	//protected JPanel jPanelParametrosAuxiliar5IndiceCorreccionActivoFijo;
	
	
	
	//protected JPanel jPanelReporteDinamicoIndiceCorreccionActivoFijo;
	//protected JPanel jPanelImportacionIndiceCorreccionActivoFijo;
	
	
	public JTable jTableDatosIndiceCorreccionActivoFijo;
	
	
	
	//public JTable jTableDatosIndiceCorreccionActivoFijoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoIndiceCorreccionActivoFijo;
	protected JButton jButtonDuplicarIndiceCorreccionActivoFijo;
	protected JButton jButtonCopiarIndiceCorreccionActivoFijo;
	protected JButton jButtonVerFormIndiceCorreccionActivoFijo;
	protected JButton jButtonNuevoRelacionesIndiceCorreccionActivoFijo;
	protected JButton jButtonModificarIndiceCorreccionActivoFijo;
	
    protected JButton jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo;
	protected JButton jButtonCerrarIndiceCorreccionActivoFijo;
	
	
	protected JButton jButtonRecargarInformacionIndiceCorreccionActivoFijo;
	protected JButton jButtonProcesarInformacionIndiceCorreccionActivoFijo;
	
	
	protected JButton jButtonAnterioresIndiceCorreccionActivoFijo;
	protected JButton jButtonSiguientesIndiceCorreccionActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoIndiceCorreccionActivoFijo;
	//protected JButton jButtonCerrarReporteDinamicoIndiceCorreccionActivoFijo;
	//protected JButton jButtonGenerarExcelReporteDinamicoIndiceCorreccionActivoFijo;	
	
	
	
	//protected JButton jButtonAbrirImportacionIndiceCorreccionActivoFijo;
	//protected JButton jButtonGenerarImportacionIndiceCorreccionActivoFijo;
	//protected JButton jButtonCerrarImportacionIndiceCorreccionActivoFijo;
	//protected JFileChooser jFileChooserImportacionIndiceCorreccionActivoFijo;
	//protected File fileImportacionIndiceCorreccionActivoFijo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonDuplicarToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonNuevoRelacionesToolBarIndiceCorreccionActivoFijo;
	
	
	public JButton jButtonGuardarCambiosToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonCopiarToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonVerFormToolBarIndiceCorreccionActivoFijo;
	public JButton jButtonGuardarCambiosTablaToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonCerrarToolBarIndiceCorreccionActivoFijo;
	
	protected JButton jButtonRecargarInformacionToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonProcesarInformacionToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonAnterioresToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonSiguientesToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosToolBarIndiceCorreccionActivoFijo;
	protected JButton jButtonAbrirOrderByToolBarIndiceCorreccionActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemDuplicarIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemNuevoRelacionesIndiceCorreccionActivoFijo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemCopiarIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemVerFormIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemCerrarIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarIndiceCorreccionActivoFijo;
	
	protected JMenuItem jMenuItemRecargarInformacionIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemProcesarInformacionIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemAnterioresIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemSiguientesIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemAbrirOrderByIndiceCorreccionActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarIndiceCorreccionActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesIndiceCorreccionActivoFijo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo;
	protected JCheckBox jCheckBoxSeleccionadosIndiceCorreccionActivoFijo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaIndiceCorreccionActivoFijo;
	protected JCheckBox jCheckBoxConGraficoReporteIndiceCorreccionActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesIndiceCorreccionActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoIndiceCorreccionActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoIndiceCorreccionActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionIndiceCorreccionActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesIndiceCorreccionActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesIndiceCorreccionActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo;
	protected JTextField jTextFieldValorCampoGeneralIndiceCorreccionActivoFijo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteIndiceCorreccionActivoFijo;
	//public JList<Reporte> jListColumnasSelectReporteIndiceCorreccionActivoFijo;
	//public JScrollPane jScrollColumnasSelectReporteIndiceCorreccionActivoFijo;
	
	//public JLabel jLabelRelacionesSelectReporteIndiceCorreccionActivoFijo;
	//public JList<Reporte> jListRelacionesSelectReporteIndiceCorreccionActivoFijo;
	//public JScrollPane jScrollRelacionesSelectReporteIndiceCorreccionActivoFijo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoIndiceCorreccionActivoFijo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoIndiceCorreccionActivoFijo;
	//public JLabel jLabelTiposArchivoReporteDinamicoIndiceCorreccionActivoFijo;
	
		
	//public JLabel jLabelArchivoImportacionIndiceCorreccionActivoFijo;	
	//public JLabel jLabelPathArchivoImportacionIndiceCorreccionActivoFijo;
	//protected JTextField jTextFieldPathArchivoImportacionIndiceCorreccionActivoFijo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoIndiceCorreccionActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoIndiceCorreccionActivoFijo;
	
	//public JLabel jLabelColumnaCategoriaValorIndiceCorreccionActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorIndiceCorreccionActivoFijo;
	
	//public JLabel jLabelColumnasValoresGraficoIndiceCorreccionActivoFijo;
	//public JList<Reporte> jListColumnasValoresGraficoIndiceCorreccionActivoFijo;
	//public JScrollPane jScrollColumnasValoresGraficoIndiceCorreccionActivoFijo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoIndiceCorreccionActivoFijo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoIndiceCorreccionActivoFijo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasIndiceCorreccionActivoFijo;
	
	
	
	
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
	public IndiceCorreccionActivoFijoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("IndiceCorreccionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IndiceCorreccionActivoFijoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("IndiceCorreccionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IndiceCorreccionActivoFijoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("IndiceCorreccionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IndiceCorreccionActivoFijoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("IndiceCorreccionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionIndiceCorreccionActivoFijo)	{
		this.jButtonRecargarInformacionIndiceCorreccionActivoFijo = jButtonRecargarInformacionIndiceCorreccionActivoFijo;
	}
	
	public JButton getjButtonProcesarInformacionIndiceCorreccionActivoFijo() {
		return this.jButtonProcesarInformacionIndiceCorreccionActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionIndiceCorreccionActivoFijo)	{
		this.jButtonProcesarInformacionIndiceCorreccionActivoFijo = jButtonProcesarInformacionIndiceCorreccionActivoFijo;
	}
	
	
	public JButton getjButtonRecargarInformacionIndiceCorreccionActivoFijo() {
		return this.jButtonRecargarInformacionIndiceCorreccionActivoFijo;
	}
	
	
	public List<IndiceCorreccionActivoFijo> getindicecorreccionactivofijos() {
		return this.indicecorreccionactivofijos;
	}

	public void setindicecorreccionactivofijos(List<IndiceCorreccionActivoFijo> indicecorreccionactivofijos) {
		this.indicecorreccionactivofijos = indicecorreccionactivofijos;
	}
	
	public List<IndiceCorreccionActivoFijo> getindicecorreccionactivofijosAux() {
		return this.indicecorreccionactivofijosAux;
	}

	public void setindicecorreccionactivofijosAux(List<IndiceCorreccionActivoFijo> indicecorreccionactivofijosAux) {
		this.indicecorreccionactivofijosAux = indicecorreccionactivofijosAux;
	}
	
	public List<IndiceCorreccionActivoFijo> getindicecorreccionactivofijosEliminados() {
		return this.indicecorreccionactivofijosEliminados;
	}

	public void setIndiceCorreccionActivoFijosEliminados(List<IndiceCorreccionActivoFijo> indicecorreccionactivofijosEliminados) {
		this.indicecorreccionactivofijosEliminados = indicecorreccionactivofijosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarIndiceCorreccionActivoFijo() {
		return jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarIndiceCorreccionActivoFijo(
			JComboBox jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo) {
		this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo = jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo;
	}
	
	public void setBorderResaltarTiposSeleccionarIndiceCorreccionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarIndiceCorreccionActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralIndiceCorreccionActivoFijo() {
		return jTextFieldValorCampoGeneralIndiceCorreccionActivoFijo;
	}

	public void setjTextFieldValorCampoGeneralIndiceCorreccionActivoFijo(
			JTextField jTextFieldValorCampoGeneralIndiceCorreccionActivoFijo) {
		this.jTextFieldValorCampoGeneralIndiceCorreccionActivoFijo = jTextFieldValorCampoGeneralIndiceCorreccionActivoFijo;
	}

	public void setBorderResaltarValorCampoGeneralIndiceCorreccionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIndiceCorreccionActivoFijo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralIndiceCorreccionActivoFijo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo() {
		return this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo;
	}

	public void setjCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo(
			JCheckBox jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo) {
		this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo = jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo;
	}

	public void setBorderResaltarSeleccionarTodosIndiceCorreccionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIndiceCorreccionActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosIndiceCorreccionActivoFijo() {
		return this.jCheckBoxSeleccionadosIndiceCorreccionActivoFijo;
	}

	public void setjCheckBoxSeleccionadosIndiceCorreccionActivoFijo(
			JCheckBox jCheckBoxSeleccionadosIndiceCorreccionActivoFijo) {
		this.jCheckBoxSeleccionadosIndiceCorreccionActivoFijo = jCheckBoxSeleccionadosIndiceCorreccionActivoFijo;
	}
	
	public void setBorderResaltarSeleccionadosIndiceCorreccionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIndiceCorreccionActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosIndiceCorreccionActivoFijo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo() {
		return this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo(
			JComboBox jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo) {
		this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo = jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo;
	}

	public void setBorderResaltarTiposArchivosReportesIndiceCorreccionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIndiceCorreccionActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesIndiceCorreccionActivoFijo() {
		return this.jComboBoxTiposReportesIndiceCorreccionActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesIndiceCorreccionActivoFijo(
			JComboBox jComboBoxTiposReportesIndiceCorreccionActivoFijo) {
		this.jComboBoxTiposReportesIndiceCorreccionActivoFijo = jComboBoxTiposReportesIndiceCorreccionActivoFijo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoIndiceCorreccionActivoFijo() {
	//	return jComboBoxTiposReportesDinamicoIndiceCorreccionActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoIndiceCorreccionActivoFijo(
	//		JComboBox jComboBoxTiposReportesDinamicoIndiceCorreccionActivoFijo) {
	//	this.jComboBoxTiposReportesDinamicoIndiceCorreccionActivoFijo = jComboBoxTiposReportesDinamicoIndiceCorreccionActivoFijo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoIndiceCorreccionActivoFijo() {
	//	return jComboBoxTiposArchivosReportesDinamicoIndiceCorreccionActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoIndiceCorreccionActivoFijo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoIndiceCorreccionActivoFijo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoIndiceCorreccionActivoFijo = jComboBoxTiposArchivosReportesDinamicoIndiceCorreccionActivoFijo;
	//}
	
	public void setBorderResaltarTiposReportesIndiceCorreccionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIndiceCorreccionActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesIndiceCorreccionActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo() {
		return this.jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo(
			JComboBox jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo) {
		this.jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo = jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo;
	}
	
	public void setBorderResaltarTiposGraficosReportesIndiceCorreccionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIndiceCorreccionActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionIndiceCorreccionActivoFijo() {
		return this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionIndiceCorreccionActivoFijo(
			JComboBox jComboBoxTiposPaginacionIndiceCorreccionActivoFijo) {
		this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo = jComboBoxTiposPaginacionIndiceCorreccionActivoFijo;
	}
	
	public void setBorderResaltarTiposPaginacionIndiceCorreccionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIndiceCorreccionActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesIndiceCorreccionActivoFijo() {
		return this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesIndiceCorreccionActivoFijo() {
		return this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesIndiceCorreccionActivoFijo(
			JComboBox jComboBoxTiposRelacionesIndiceCorreccionActivoFijo) {
		this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo = jComboBoxTiposRelacionesIndiceCorreccionActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesIndiceCorreccionActivoFijo(
			JComboBox jComboBoxTiposAccionesIndiceCorreccionActivoFijo) {
		this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo = jComboBoxTiposAccionesIndiceCorreccionActivoFijo;
	}
	
	public void setBorderResaltarTiposRelacionesIndiceCorreccionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIndiceCorreccionActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesIndiceCorreccionActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIndiceCorreccionActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo() {
	//	return jCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo;
	//}

	//public void setjCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo(
	//		JCheckBox jCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo) {
	//	this.jCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo = jCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoIndiceCorreccionActivoFijo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarIndiceCorreccionActivoFijo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo .setBorder(borderResaltar);		
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
		this.indicecorreccionactivofijoSessionBean=new IndiceCorreccionActivoFijoSessionBean();
		
		this.indicecorreccionactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.indicecorreccionactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=IndiceCorreccionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=IndiceCorreccionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		IndiceCorreccionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		IndiceCorreccionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		IndiceCorreccionActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Indice Correccion Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
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
		
		IndiceCorreccionActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("IndiceCorreccionActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarIndiceCorreccionActivoFijo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarIndiceCorreccionActivoFijo,this.jTtoolBarIndiceCorreccionActivoFijo,
							"nuevo","nuevo","Nuevo"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarIndiceCorreccionActivoFijo,this.jTtoolBarIndiceCorreccionActivoFijo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarIndiceCorreccionActivoFijo,this.jTtoolBarIndiceCorreccionActivoFijo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarIndiceCorreccionActivoFijo,this.jTtoolBarIndiceCorreccionActivoFijo,
							"duplicar","duplicar","Duplicar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarIndiceCorreccionActivoFijo,this.jTtoolBarIndiceCorreccionActivoFijo,
							"copiar","copiar","Copiar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarIndiceCorreccionActivoFijo,this.jTtoolBarIndiceCorreccionActivoFijo,
							"ver_form","ver_form","Ver"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarIndiceCorreccionActivoFijo,this.jTtoolBarIndiceCorreccionActivoFijo,
							"recargar","recargar","Recargar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarIndiceCorreccionActivoFijo,this.jTtoolBarIndiceCorreccionActivoFijo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarIndiceCorreccionActivoFijo,this.jTtoolBarIndiceCorreccionActivoFijo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarIndiceCorreccionActivoFijo,this.jTtoolBarIndiceCorreccionActivoFijo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarIndiceCorreccionActivoFijo,this.jTtoolBarIndiceCorreccionActivoFijo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarIndiceCorreccionActivoFijo,this.jTtoolBarIndiceCorreccionActivoFijo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarIndiceCorreccionActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarIndiceCorreccionActivoFijo,this.jTtoolBarIndiceCorreccionActivoFijo,
							"cerrar","cerrar","Salir"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarIndiceCorreccionActivoFijo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarIndiceCorreccionActivoFijo;
			
				this.jButtonProcesarInformacionToolBarIndiceCorreccionActivoFijo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarIndiceCorreccionActivoFijo;
				
		//protected JButton jButtonModificarToolBarIndiceCorreccionActivoFijo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarIndiceCorreccionActivoFijo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuIndiceCorreccionActivoFijo=new JMenuMe("General");
		this.jmenuArchivoIndiceCorreccionActivoFijo=new JMenuMe("Archivo");
		this.jmenuAccionesIndiceCorreccionActivoFijo=new JMenuMe("Acciones");
		this.jmenuDatosIndiceCorreccionActivoFijo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoIndiceCorreccionActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoIndiceCorreccionActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoIndiceCorreccionActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarIndiceCorreccionActivoFijo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarIndiceCorreccionActivoFijo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarIndiceCorreccionActivoFijo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesIndiceCorreccionActivoFijo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesIndiceCorreccionActivoFijo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesIndiceCorreccionActivoFijo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosIndiceCorreccionActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosIndiceCorreccionActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosIndiceCorreccionActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarIndiceCorreccionActivoFijo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarIndiceCorreccionActivoFijo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarIndiceCorreccionActivoFijo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormIndiceCorreccionActivoFijo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormIndiceCorreccionActivoFijo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormIndiceCorreccionActivoFijo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaIndiceCorreccionActivoFijo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaIndiceCorreccionActivoFijo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaIndiceCorreccionActivoFijo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarIndiceCorreccionActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarIndiceCorreccionActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarIndiceCorreccionActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionIndiceCorreccionActivoFijo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionIndiceCorreccionActivoFijo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionIndiceCorreccionActivoFijo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionIndiceCorreccionActivoFijo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionIndiceCorreccionActivoFijo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionIndiceCorreccionActivoFijo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresIndiceCorreccionActivoFijo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresIndiceCorreccionActivoFijo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresIndiceCorreccionActivoFijo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesIndiceCorreccionActivoFijo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesIndiceCorreccionActivoFijo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesIndiceCorreccionActivoFijo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByIndiceCorreccionActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByIndiceCorreccionActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByIndiceCorreccionActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarIndiceCorreccionActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarIndiceCorreccionActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarIndiceCorreccionActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByIndiceCorreccionActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByIndiceCorreccionActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByIndiceCorreccionActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarIndiceCorreccionActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarIndiceCorreccionActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarIndiceCorreccionActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosIndiceCorreccionActivoFijo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosIndiceCorreccionActivoFijo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosIndiceCorreccionActivoFijo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoIndiceCorreccionActivoFijo.add(this.jMenuItemCerrarIndiceCorreccionActivoFijo);
			
			this.jmenuAccionesIndiceCorreccionActivoFijo.add(this.jMenuItemNuevoIndiceCorreccionActivoFijo);
			this.jmenuAccionesIndiceCorreccionActivoFijo.add(this.jMenuItemNuevoGuardarCambiosIndiceCorreccionActivoFijo);
			this.jmenuAccionesIndiceCorreccionActivoFijo.add(this.jMenuItemNuevoRelacionesIndiceCorreccionActivoFijo);
			this.jmenuAccionesIndiceCorreccionActivoFijo.add(this.jMenuItemGuardarCambiosTablaIndiceCorreccionActivoFijo);		
			this.jmenuAccionesIndiceCorreccionActivoFijo.add(this.jMenuItemDuplicarIndiceCorreccionActivoFijo);		
			this.jmenuAccionesIndiceCorreccionActivoFijo.add(this.jMenuItemCopiarIndiceCorreccionActivoFijo);		
			this.jmenuAccionesIndiceCorreccionActivoFijo.add(this.jMenuItemVerFormIndiceCorreccionActivoFijo);		
			
			this.jmenuDatosIndiceCorreccionActivoFijo.add(this.jMenuItemRecargarInformacionIndiceCorreccionActivoFijo);				
			this.jmenuDatosIndiceCorreccionActivoFijo.add(this.jMenuItemAnterioresIndiceCorreccionActivoFijo);				
			this.jmenuDatosIndiceCorreccionActivoFijo.add(this.jMenuItemSiguientesIndiceCorreccionActivoFijo);				
			this.jmenuDatosIndiceCorreccionActivoFijo.add(this.jMenuItemAbrirOrderByIndiceCorreccionActivoFijo);				
			this.jmenuDatosIndiceCorreccionActivoFijo.add(this.jMenuItemMostrarOcultarIndiceCorreccionActivoFijo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesIndiceCorreccionActivoFijo.add(this.jMenuItemGuardarCambiosIndiceCorreccionActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarIndiceCorreccionActivoFijo.add(this.jmenuArchivoIndiceCorreccionActivoFijo);		
			this.jmenuBarIndiceCorreccionActivoFijo.add(this.jmenuAccionesIndiceCorreccionActivoFijo);		
			this.jmenuBarIndiceCorreccionActivoFijo.add(this.jmenuDatosIndiceCorreccionActivoFijo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarIndiceCorreccionActivoFijo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasIndiceCorreccionActivoFijo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo=new JTabbedPane();


		this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasIndiceCorreccionActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleIndiceCorreccionActivoFijo = new IndiceCorreccionActivoFijoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Indice Correccion Activo Fijo DATOS");
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo = new IndiceCorreccionActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones(),this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormIndiceCorreccionActivoFijo = null;//new IndiceCorreccionActivoFijoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutIndiceCorreccionActivoFijo= new GridBagLayout();
		
		
		this.jTableDatosIndiceCorreccionActivoFijo = new JTableMe();      
		
		String sToolTipIndiceCorreccionActivoFijo="";
		sToolTipIndiceCorreccionActivoFijo=IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipIndiceCorreccionActivoFijo+="(ActivosFijos.IndiceCorreccionActivoFijo)";
		}
		
		if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipIndiceCorreccionActivoFijo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosIndiceCorreccionActivoFijo.setToolTipText(sToolTipIndiceCorreccionActivoFijo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosIndiceCorreccionActivoFijo);
		this.jTableDatosIndiceCorreccionActivoFijo.setAutoCreateRowSorter(true);
		this.jTableDatosIndiceCorreccionActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosIndiceCorreccionActivoFijo.setRowSelectionAllowed(true);
		this.jTableDatosIndiceCorreccionActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosIndiceCorreccionActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonDuplicarIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonCopiarIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonVerFormIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonNuevoRelacionesIndiceCorreccionActivoFijo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonCerrarIndiceCorreccionActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosIndiceCorreccionActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesIndiceCorreccionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Indice Correccion Activo Fijo";
		
		if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Indice Correccion Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosIndiceCorreccionActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesIndiceCorreccionActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesIndiceCorreccionActivoFijo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo=new ReporteDinamicoJInternalFrame(IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoIndiceCorreccionActivoFijo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionIndiceCorreccionActivoFijo=new ImportacionJInternalFrame(IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionIndiceCorreccionActivoFijo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByIndiceCorreccionActivoFijo = new JButtonMe();
		
		this.jButtonAbrirOrderByIndiceCorreccionActivoFijo.setText("Orden");
		this.jButtonAbrirOrderByIndiceCorreccionActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByIndiceCorreccionActivoFijo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByIndiceCorreccionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByIndiceCorreccionActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIndiceCorreccionActivoFijo,false,this);
			
			//this.cargarOrderByIndiceCorreccionActivoFijo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByIndiceCorreccionActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIndiceCorreccionActivoFijo,true,this);
			
			//this.cargarOrderByIndiceCorreccionActivoFijo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoIndiceCorreccionActivoFijo.setText("Nuevo");
		this.jButtonDuplicarIndiceCorreccionActivoFijo.setText("Duplicar");
		this.jButtonCopiarIndiceCorreccionActivoFijo.setText("Copiar");
		this.jButtonVerFormIndiceCorreccionActivoFijo.setText("Ver");
		this.jButtonNuevoRelacionesIndiceCorreccionActivoFijo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo.setText("Guardar");
		this.jButtonCerrarIndiceCorreccionActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoIndiceCorreccionActivoFijo,"nuevo_button","Nuevo",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarIndiceCorreccionActivoFijo,"duplicar_button","Duplicar",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarIndiceCorreccionActivoFijo,"copiar_button","Copiar",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormIndiceCorreccionActivoFijo,"ver_form","Ver",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesIndiceCorreccionActivoFijo,"nuevorelaciones_button","Nuevo Rel",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo,"guardarcambiostabla_button","Guardar",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarIndiceCorreccionActivoFijo,"cerrar_button","Salir",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoIndiceCorreccionActivoFijo.setToolTipText("Nuevo"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarIndiceCorreccionActivoFijo.setToolTipText("Duplicar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarIndiceCorreccionActivoFijo.setToolTipText("Copiar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormIndiceCorreccionActivoFijo.setToolTipText("Ver"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesIndiceCorreccionActivoFijo.setToolTipText("Nuevo Rel"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo.setToolTipText("Guardar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarIndiceCorreccionActivoFijo.setToolTipText("Salir"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoIndiceCorreccionActivoFijo";
		inputMap = this.jButtonNuevoIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoIndiceCorreccionActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoIndiceCorreccionActivoFijo"));
		
		//DUPLICAR
		sMapKey = "DuplicarIndiceCorreccionActivoFijo";
		inputMap = this.jButtonDuplicarIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarIndiceCorreccionActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarIndiceCorreccionActivoFijo"));
		
		//COPIAR
		sMapKey = "CopiarIndiceCorreccionActivoFijo";
		inputMap = this.jButtonCopiarIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarIndiceCorreccionActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarIndiceCorreccionActivoFijo"));
		
		//VEr FORM
		sMapKey = "VerFormIndiceCorreccionActivoFijo";
		inputMap = this.jButtonVerFormIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormIndiceCorreccionActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormIndiceCorreccionActivoFijo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesIndiceCorreccionActivoFijo";
		inputMap = this.jButtonNuevoRelacionesIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesIndiceCorreccionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesIndiceCorreccionActivoFijo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarIndiceCorreccionActivoFijo";
		inputMap = this.jButtonModificarIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarIndiceCorreccionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarIndiceCorreccionActivoFijo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarIndiceCorreccionActivoFijo";
		inputMap = this.jButtonCerrarIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarIndiceCorreccionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarIndiceCorreccionActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaIndiceCorreccionActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaIndiceCorreccionActivoFijo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesIndiceCorreccionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesIndiceCorreccionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionIndiceCorreccionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1IndiceCorreccionActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2IndiceCorreccionActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3IndiceCorreccionActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4IndiceCorreccionActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5IndiceCorreccionActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesIndiceCorreccionActivoFijo.setName("jPanelParametrosReportesIndiceCorreccionActivoFijo"); 
		
		this.jPanelParametrosReportesAccionesIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesIndiceCorreccionActivoFijo.setName("jPanelParametrosReportesAccionesIndiceCorreccionActivoFijo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonRecargarInformacionIndiceCorreccionActivoFijo.setText("Recargar");
		this.jButtonRecargarInformacionIndiceCorreccionActivoFijo.setToolTipText("Recargar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionIndiceCorreccionActivoFijo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonProcesarInformacionIndiceCorreccionActivoFijo.setText("Procesar");
		this.jButtonProcesarInformacionIndiceCorreccionActivoFijo.setToolTipText("Procesar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionIndiceCorreccionActivoFijo.setVisible(false);
			
		this.jButtonProcesarInformacionIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesIndiceCorreccionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo.setText("TIPO");       
		this.jComboBoxTiposReportesIndiceCorreccionActivoFijo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo.setText("Paginacion");
		this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo.setText("Accion");
		this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo.setText("Accion");
		this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralIndiceCorreccionActivoFijo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesIndiceCorreccionActivoFijo = new JLabelMe();
		
		this.jLabelAccionesIndiceCorreccionActivoFijo.setText("Acciones");		
		this.jLabelAccionesIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosIndiceCorreccionActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosIndiceCorreccionActivoFijo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosIndiceCorreccionActivoFijo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaIndiceCorreccionActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaIndiceCorreccionActivoFijo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaIndiceCorreccionActivoFijo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteIndiceCorreccionActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteIndiceCorreccionActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoReporteIndiceCorreccionActivoFijo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresIndiceCorreccionActivoFijo = new JButtonMe();
		//this.jButtonAnterioresIndiceCorreccionActivoFijo.setText("<<");
        this.jButtonAnterioresIndiceCorreccionActivoFijo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresIndiceCorreccionActivoFijo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesIndiceCorreccionActivoFijo = new JButtonMe();
		//this.jButtonSiguientesIndiceCorreccionActivoFijo.setText(">>");
        this.jButtonSiguientesIndiceCorreccionActivoFijo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesIndiceCorreccionActivoFijo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijo.setText("Nue");
        this.jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijo,"nuevoguardarcambios_button","Nue",this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosIndiceCorreccionActivoFijo";
		inputMap = this.jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosIndiceCorreccionActivoFijo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionIndiceCorreccionActivoFijo";
		inputMap = this.jButtonRecargarInformacionIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionIndiceCorreccionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionIndiceCorreccionActivoFijo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesIndiceCorreccionActivoFijo";
		inputMap = this.jButtonSiguientesIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesIndiceCorreccionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesIndiceCorreccionActivoFijo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresIndiceCorreccionActivoFijo";
		inputMap = this.jButtonAnterioresIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresIndiceCorreccionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresIndiceCorreccionActivoFijo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasIndiceCorreccionActivoFijo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(this.getWidth(),IndiceCorreccionActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(IndiceCorreccionActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(this.getWidth(),IndiceCorreccionActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(IndiceCorreccionActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(this.getWidth(),IndiceCorreccionActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(IndiceCorreccionActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionIndiceCorreccionActivoFijo = new GridBagLayout();

			this.jPanelPaginacionIndiceCorreccionActivoFijo.setLayout(gridaBagLayoutPaginacionIndiceCorreccionActivoFijo);						
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionIndiceCorreccionActivoFijo.add(this.jButtonAnterioresIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
					
						
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
			
			this.jPanelPaginacionIndiceCorreccionActivoFijo.add(this.jButtonNuevoGuardarCambiosIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
						
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
			this.jPanelPaginacionIndiceCorreccionActivoFijo.add(this.jButtonSiguientesIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 1;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIndiceCorreccionActivoFijo.add(this.jButtonNuevoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
						
			
			
			if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 1;
				this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionIndiceCorreccionActivoFijo.add(this.jButtonGuardarCambiosTablaIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
			}
			
			
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 1;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIndiceCorreccionActivoFijo.add(this.jButtonDuplicarIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 1;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIndiceCorreccionActivoFijo.add(this.jButtonCopiarIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 1;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIndiceCorreccionActivoFijo.add(this.jButtonVerFormIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 1;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionIndiceCorreccionActivoFijo.add(this.jButtonCerrarIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
		
		
		this.jButtonRecargarInformacionIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesIndiceCorreccionActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesIndiceCorreccionActivoFijo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1IndiceCorreccionActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2IndiceCorreccionActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3IndiceCorreccionActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4IndiceCorreccionActivoFijo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesIndiceCorreccionActivoFijo.setLayout(gridaBagParametrosReportesIndiceCorreccionActivoFijo);
			this.jPanelParametrosReportesAccionesIndiceCorreccionActivoFijo.setLayout(gridaBagParametrosReportesAccionesIndiceCorreccionActivoFijo);
			
			
			this.jPanelParametrosAuxiliar1IndiceCorreccionActivoFijo.setLayout(gridaBagParametrosAuxiliar1IndiceCorreccionActivoFijo);
			this.jPanelParametrosAuxiliar2IndiceCorreccionActivoFijo.setLayout(gridaBagParametrosAuxiliar2IndiceCorreccionActivoFijo);
			this.jPanelParametrosAuxiliar3IndiceCorreccionActivoFijo.setLayout(gridaBagParametrosAuxiliar3IndiceCorreccionActivoFijo);
			this.jPanelParametrosAuxiliar4IndiceCorreccionActivoFijo.setLayout(gridaBagParametrosAuxiliar4IndiceCorreccionActivoFijo);
			//this.jPanelParametrosAuxiliar5IndiceCorreccionActivoFijo.setLayout(gridaBagParametrosAuxiliar2IndiceCorreccionActivoFijo);			
			
			
			
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIndiceCorreccionActivoFijo.add(this.jButtonRecargarInformacionIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1IndiceCorreccionActivoFijo.add(this.jComboBoxTiposPaginacionIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1IndiceCorreccionActivoFijo.add(this.jCheckBoxConAltoMaximoTablaIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1IndiceCorreccionActivoFijo.add(this.jComboBoxTiposArchivosReportesIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIndiceCorreccionActivoFijo.add(this.jPanelParametrosAuxiliar1IndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4IndiceCorreccionActivoFijo.add(this.jComboBoxTiposReportesIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);																		
			
			
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4IndiceCorreccionActivoFijo.add(this.jComboBoxTiposGraficosReportesIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIndiceCorreccionActivoFijo.add(this.jPanelParametrosAuxiliar4IndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIndiceCorreccionActivoFijo.add(this.jComboBoxTiposReportesIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIndiceCorreccionActivoFijo.add(this.jCheckBoxGenerarReporteIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIndiceCorreccionActivoFijo.add(this.jPanelParametrosAuxiliar2IndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIndiceCorreccionActivoFijo.add(this.jLabelAccionesIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesIndiceCorreccionActivoFijo.add(this.jButtonAbrirOrderByIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIndiceCorreccionActivoFijo.add(this.jComboBoxTiposSeleccionarIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);			
			
			
			/*
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIndiceCorreccionActivoFijo.add(this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIndiceCorreccionActivoFijo.add(this.jCheckBoxConGraficoReporteIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3IndiceCorreccionActivoFijo.add(this.jCheckBoxSeleccionarTodosIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);															
				
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3IndiceCorreccionActivoFijo.add(this.jCheckBoxSeleccionadosIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);															
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3IndiceCorreccionActivoFijo.add(this.jCheckBoxConGraficoReporteIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIndiceCorreccionActivoFijo.add(this.jPanelParametrosAuxiliar3IndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIndiceCorreccionActivoFijo.add(this.jComboBoxTiposAccionesIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
	
				
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIndiceCorreccionActivoFijo.add(this.jTextFieldValorCampoGeneralIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosIndiceCorreccionActivoFijo = new GridBagLayout();

			this.jScrollPanelDatosIndiceCorreccionActivoFijo.setLayout(gridaBagLayoutDatosIndiceCorreccionActivoFijo);
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
			
			this.jScrollPanelDatosIndiceCorreccionActivoFijo.add(this.jTableDatosIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosIndiceCorreccionActivoFijo.setViewportView(this.jTableDatosIndiceCorreccionActivoFijo);
		this.jTableDatosIndiceCorreccionActivoFijo.setFillsViewportHeight(true);
		this.jTableDatosIndiceCorreccionActivoFijo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesIndiceCorreccionActivoFijo= new GridBagLayout();
		this.jPanelAccionesIndiceCorreccionActivoFijo.setLayout(gridaBagLayoutAccionesIndiceCorreccionActivoFijo);
		
		
		/*	
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = 0;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
			
		this.jPanelAccionesIndiceCorreccionActivoFijo.add(this.jButtonNuevoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutIndiceCorreccionActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutIndiceCorreccionActivoFijo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;		
			//this.gridBagConstraintsIndiceCorreccionActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;		
		//this.gridBagConstraintsIndiceCorreccionActivoFijo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);								
		
		
		/*
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		*/		
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =0;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsIndiceCorreccionActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
				
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(IndiceCorreccionActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosIndiceCorreccionActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosIndiceCorreccionActivoFijo = new GridBagLayout();
			this.jPanelBusquedasParametrosIndiceCorreccionActivoFijo.setLayout(gridaBagLayoutBusquedasParametrosIndiceCorreccionActivoFijo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
			
			
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
			
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralIndiceCorreccionActivoFijo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoIndiceCorreccionActivoFijo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoIndiceCorreccionActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.setName("jPanelReporteDinamicoIndiceCorreccionActivoFijo"); 
		
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.setLayout(gridaBagLayoutReporteDinamicoIndiceCorreccionActivoFijo);
		
		
		this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoIndiceCorreccionActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteIndiceCorreccionActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setResizable(true);
	    this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setClosable(true);
	    this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Indice Correccion Activo Fijos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteIndiceCorreccionActivoFijo = new JLabelMe();

		this.jLabelColumnasSelectReporteIndiceCorreccionActivoFijo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jLabelColumnasSelectReporteIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteIndiceCorreccionActivoFijo = new JList<Reporte>();
		this.jListColumnasSelectReporteIndiceCorreccionActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteIndiceCorreccionActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteIndiceCorreccionActivoFijo=new JScrollPane(this.jListColumnasSelectReporteIndiceCorreccionActivoFijo);
			
			this.jScrollColumnasSelectReporteIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jListColumnasSelectReporteIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jScrollColumnasSelectReporteIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteIndiceCorreccionActivoFijo = new JLabelMe();

		this.jLabelRelacionesSelectReporteIndiceCorreccionActivoFijo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteIndiceCorreccionActivoFijo = new JList<Reporte>();
		this.jListRelacionesSelectReporteIndiceCorreccionActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteIndiceCorreccionActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteIndiceCorreccionActivoFijo=new JScrollPane(this.jListRelacionesSelectReporteIndiceCorreccionActivoFijo);
			
			this.jScrollRelacionesSelectReporteIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoIndiceCorreccionActivoFijo = new JComboBoxMe();
		this.jListColumnasValoresGraficoIndiceCorreccionActivoFijo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoIndiceCorreccionActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoIndiceCorreccionActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoIndiceCorreccionActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoIndiceCorreccionActivoFijo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoIndiceCorreccionActivoFijo = new JLabelMe();

		this.jLabelConGraficoDinamicoIndiceCorreccionActivoFijo.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jLabelConGraficoDinamicoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jCheckBoxConGraficoDinamicoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoIndiceCorreccionActivoFijo = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoIndiceCorreccionActivoFijo.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jLabelColumnaCategoriaGraficoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoIndiceCorreccionActivoFijo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoIndiceCorreccionActivoFijo.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoIndiceCorreccionActivoFijo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jComboBoxColumnaCategoriaGraficoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorIndiceCorreccionActivoFijo = new JLabelMe();

		this.jLabelColumnaCategoriaValorIndiceCorreccionActivoFijo.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jLabelColumnaCategoriaValorIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorIndiceCorreccionActivoFijo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorIndiceCorreccionActivoFijo.setText("Accion");
        this.jComboBoxColumnaCategoriaValorIndiceCorreccionActivoFijo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jComboBoxColumnaCategoriaValorIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoIndiceCorreccionActivoFijo = new JLabelMe();

		this.jLabelColumnasValoresGraficoIndiceCorreccionActivoFijo.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jLabelColumnasValoresGraficoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoIndiceCorreccionActivoFijo = new JList<Reporte>();
		this.jListColumnasValoresGraficoIndiceCorreccionActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoIndiceCorreccionActivoFijo.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoIndiceCorreccionActivoFijo=new JScrollPane(this.jListColumnasValoresGraficoIndiceCorreccionActivoFijo);
			
			this.jScrollColumnasValoresGraficoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jListColumnasSelectReporteIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jScrollColumnasValoresGraficoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoIndiceCorreccionActivoFijo = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoIndiceCorreccionActivoFijo.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jLabelTiposGraficosReportesDinamicoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoIndiceCorreccionActivoFijo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoIndiceCorreccionActivoFijo.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoIndiceCorreccionActivoFijo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jComboBoxTiposGraficosReportesDinamicoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoIndiceCorreccionActivoFijo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoIndiceCorreccionActivoFijo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jLabelGenerarExcelReporteDinamicoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoIndiceCorreccionActivoFijo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoIndiceCorreccionActivoFijo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoIndiceCorreccionActivoFijo.setToolTipText("Generar EXCEL"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jButtonGenerarExcelReporteDinamicoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jComboBoxTiposReportesDinamicoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoIndiceCorreccionActivoFijo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoIndiceCorreccionActivoFijo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jLabelTiposArchivoReporteDinamicoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jComboBoxTiposArchivosReportesDinamicoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoIndiceCorreccionActivoFijo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoIndiceCorreccionActivoFijo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoIndiceCorreccionActivoFijo.setToolTipText("Generar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jButtonGenerarReporteDinamicoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoIndiceCorreccionActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoIndiceCorreccionActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoIndiceCorreccionActivoFijo.setToolTipText("Cancelar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIndiceCorreccionActivoFijo.add(this.jButtonCerrarReporteDinamicoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalIndiceCorreccionActivoFijo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoIndiceCorreccionActivoFijo= new JScrollPane(jPanelReporteDinamicoIndiceCorreccionActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Indice Correccion Activo Fijos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalIndiceCorreccionActivoFijo);
		this.jInternalFrameReporteDinamicoIndiceCorreccionActivoFijo.getContentPane().add(this.jScrollPanelReporteDinamicoIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionIndiceCorreccionActivoFijo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionIndiceCorreccionActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionIndiceCorreccionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionIndiceCorreccionActivoFijo.setName("jPanelImportacionIndiceCorreccionActivoFijo"); 
		
		this.jPanelImportacionIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionIndiceCorreccionActivoFijo.setLayout(gridaBagLayoutImportacionIndiceCorreccionActivoFijo);
		
		
		this.jInternalFrameImportacionIndiceCorreccionActivoFijo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionIndiceCorreccionActivoFijo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionIndiceCorreccionActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteIndiceCorreccionActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Indice Correccion Activo Fijos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionIndiceCorreccionActivoFijo = new JLabelMe();

		this.jLabelArchivoImportacionIndiceCorreccionActivoFijo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionIndiceCorreccionActivoFijo.add(this.jLabelArchivoImportacionIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionIndiceCorreccionActivoFijo = new JFileChooser();		
		this.jFileChooserImportacionIndiceCorreccionActivoFijo.setToolTipText("ESCOGER ARCHIVO"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonAbrirImportacionIndiceCorreccionActivoFijo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionIndiceCorreccionActivoFijo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionIndiceCorreccionActivoFijo.setToolTipText("Generar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIndiceCorreccionActivoFijo.add(this.jButtonAbrirImportacionIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionIndiceCorreccionActivoFijo = new JLabelMe();

		this.jLabelPathArchivoImportacionIndiceCorreccionActivoFijo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionIndiceCorreccionActivoFijo.add(this.jLabelPathArchivoImportacionIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionIndiceCorreccionActivoFijo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIndiceCorreccionActivoFijo.add(this.jTextFieldPathArchivoImportacionIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonGenerarImportacionIndiceCorreccionActivoFijo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionIndiceCorreccionActivoFijo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionIndiceCorreccionActivoFijo.setToolTipText("Generar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIndiceCorreccionActivoFijo.add(this.jButtonGenerarImportacionIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionIndiceCorreccionActivoFijo = new JButtonMe();
		this.jButtonCerrarImportacionIndiceCorreccionActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionIndiceCorreccionActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionIndiceCorreccionActivoFijo.setToolTipText("Cancelar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIndiceCorreccionActivoFijo.add(this.jButtonCerrarImportacionIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalIndiceCorreccionActivoFijo = new GridBagLayout();
		
		this.jScrollPanelImportacionIndiceCorreccionActivoFijo= new JScrollPane(jPanelImportacionIndiceCorreccionActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy =iPosYImportacion;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =iPosXImportacion;
		this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionIndiceCorreccionActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionIndiceCorreccionActivoFijo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalIndiceCorreccionActivoFijo);
		this.jInternalFrameImportacionIndiceCorreccionActivoFijo.getContentPane().add(this.jScrollPanelImportacionIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByIndiceCorreccionActivoFijo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByIndiceCorreccionActivoFijo = new JButtonMe();
			this.jButtonAbrirOrderByIndiceCorreccionActivoFijo.setText("Orden");
			this.jButtonAbrirOrderByIndiceCorreccionActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByIndiceCorreccionActivoFijo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByIndiceCorreccionActivoFijo";
			inputMap = this.jButtonAbrirOrderByIndiceCorreccionActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByIndiceCorreccionActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByIndiceCorreccionActivoFijo"));
		
		
			GridBagLayout gridaBagLayoutOrderByIndiceCorreccionActivoFijo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByIndiceCorreccionActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByIndiceCorreccionActivoFijo.setName("jPanelOrderByIndiceCorreccionActivoFijo"); 
			
			this.jPanelOrderByIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByIndiceCorreccionActivoFijo.setLayout(gridaBagLayoutOrderByIndiceCorreccionActivoFijo);
			
			
			this.jTableDatosIndiceCorreccionActivoFijoOrderBy = new JTableMe();        
			this.jTableDatosIndiceCorreccionActivoFijoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosIndiceCorreccionActivoFijoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosIndiceCorreccionActivoFijoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosIndiceCorreccionActivoFijoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosIndiceCorreccionActivoFijoOrderBy.setViewportView(this.jTableDatosIndiceCorreccionActivoFijoOrderBy);
			this.jTableDatosIndiceCorreccionActivoFijoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosIndiceCorreccionActivoFijoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByIndiceCorreccionActivoFijo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteIndiceCorreccionActivoFijo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setTitle("Orden");
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setResizable(true);
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setClosable(true);
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByIndiceCorreccionActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Indice Correccion Activo Fijos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsIndiceCorreccionActivoFijo.ipady =150;
				
			this.jPanelOrderByIndiceCorreccionActivoFijo.add(jScrollPanelDatosIndiceCorreccionActivoFijoOrderBy, this.gridBagConstraintsIndiceCorreccionActivoFijo);//this.jTableDatosIndiceCorreccionActivoFijoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByIndiceCorreccionActivoFijo = new JButtonMe();
			this.jButtonCerrarOrderByIndiceCorreccionActivoFijo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByIndiceCorreccionActivoFijo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByIndiceCorreccionActivoFijo.setToolTipText("Cancelar"+" "+IndiceCorreccionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByIndiceCorreccionActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByIndiceCorreccionActivoFijo.add(this.jButtonCerrarOrderByIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalIndiceCorreccionActivoFijo = new GridBagLayout();
			
			this.jScrollPanelOrderByIndiceCorreccionActivoFijo= new JScrollPane(jPanelOrderByIndiceCorreccionActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsIndiceCorreccionActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridy =iPosYOrderBy;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsIndiceCorreccionActivoFijo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalIndiceCorreccionActivoFijo);
			
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getContentPane().add(this.jScrollPanelOrderByIndiceCorreccionActivoFijo, this.gridBagConstraintsIndiceCorreccionActivoFijo);			
		
		} else {
			this.jButtonAbrirOrderByIndiceCorreccionActivoFijo = new JButtonMe();
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
			&& this.indicecorreccionactivofijoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosIndiceCorreccionActivoFijo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosIndiceCorreccionActivoFijo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosIndiceCorreccionActivoFijo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosIndiceCorreccionActivoFijo.getRowHeight();//IndiceCorreccionActivoFijoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > IndiceCorreccionActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaIndiceCorreccionActivoFijo.isSelected()) {
					iHeightTable=IndiceCorreccionActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < IndiceCorreccionActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=IndiceCorreccionActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > IndiceCorreccionActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaIndiceCorreccionActivoFijo.isSelected()) {
					iHeightTable=IndiceCorreccionActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < IndiceCorreccionActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=IndiceCorreccionActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByIndiceCorreccionActivoFijo!=null && this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjTableDatosOrderBy()!=null) {
			//if(!this.indicecorreccionactivofijoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByIndiceCorreccionActivoFijo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosIndiceCorreccionActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosIndiceCorreccionActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosIndiceCorreccionActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=indicecorreccionactivofijoLogic.getIndiceCorreccionActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=indicecorreccionactivofijos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<IndiceCorreccionActivoFijo> TraerIndiceCorreccionActivoFijoBeans(List<IndiceCorreccionActivoFijo> indicecorreccionactivofijos,ArrayList<Classe> classes)throws Exception {
		try {
			for(IndiceCorreccionActivoFijo indicecorreccionactivofijo:indicecorreccionactivofijos) {
					
				if(!(IndiceCorreccionActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || IndiceCorreccionActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					indicecorreccionactivofijo.setsDetalleGeneralEntityReporte(IndiceCorreccionActivoFijoConstantesFunciones.getIndiceCorreccionActivoFijoDescripcion(indicecorreccionactivofijo));
										
						
					
						
					
				} else  {
							
					//indicecorreccionactivofijo.setsDetalleGeneralEntityReporte(indicecorreccionactivofijo.getsDetalleGeneralEntityReporte());
										
				}
				
				//indicecorreccionactivofijobeans.add(indicecorreccionactivofijobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return indicecorreccionactivofijos;
    }
	//PARA REPORTES FIN
}
