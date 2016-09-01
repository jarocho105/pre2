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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.activosfijos.util.FormatoActivoFijoConstantesFunciones;

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
public class FormatoActivoFijoJInternalFrame extends FormatoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFormatoActivoFijo;
	
	protected JMenuBar jmenuBarFormatoActivoFijo;
	
	protected JMenu jmenuFormatoActivoFijo;
	protected JMenu jmenuDatosFormatoActivoFijo;
	protected JMenu jmenuArchivoFormatoActivoFijo;
	protected JMenu jmenuAccionesFormatoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFormatoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormatoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsFormatoActivoFijo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FormatoActivoFijoDetalleFormJInternalFrame jInternalFrameDetalleFormFormatoActivoFijo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFormatoActivoFijo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFormatoActivoFijo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected FormatoBeanSwingJInternalFrame formato2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato2="";
	
	public FormatoActivoFijoSessionBean formatoactivofijoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public FormatoSessionBean formato2SessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FormatoActivoFijo> formatoactivofijos;		
	public List<FormatoActivoFijo> formatoactivofijosEliminados;	
	public List<FormatoActivoFijo> formatoactivofijosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFormatoActivoFijo;		
	protected JButton jButtonAbrirOrderByFormatoActivoFijo;
	
	
	//protected JPanel jPanelOrderByFormatoActivoFijo;
	//public JScrollPane jScrollPanelOrderByFormatoActivoFijo;	
	//protected JButton jButtonCerrarOrderByFormatoActivoFijo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FormatoActivoFijoLogic formatoactivofijoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFormatoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionFormatoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralFormatoActivoFijo;
    
	
	
	//public JScrollPane jScrollPanelDatosFormatoActivoFijoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFormatoActivoFijo;
	//public JScrollPane jScrollPanelImportacionFormatoActivoFijo;
	
	
	
	protected JPanel jPanelAccionesFormatoActivoFijo;
	
    protected JPanel jPanelPaginacionFormatoActivoFijo;
    protected JPanel jPanelParametrosReportesFormatoActivoFijo;
	protected JPanel jPanelParametrosReportesAccionesFormatoActivoFijo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FormatoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar2FormatoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar3FormatoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar4FormatoActivoFijo;
	//protected JPanel jPanelParametrosAuxiliar5FormatoActivoFijo;
	
	
	
	//protected JPanel jPanelReporteDinamicoFormatoActivoFijo;
	//protected JPanel jPanelImportacionFormatoActivoFijo;
	
	
	public JTable jTableDatosFormatoActivoFijo;
	
	
	
	//public JTable jTableDatosFormatoActivoFijoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFormatoActivoFijo;
	protected JButton jButtonDuplicarFormatoActivoFijo;
	protected JButton jButtonCopiarFormatoActivoFijo;
	protected JButton jButtonVerFormFormatoActivoFijo;
	protected JButton jButtonNuevoRelacionesFormatoActivoFijo;
	protected JButton jButtonModificarFormatoActivoFijo;
	
    protected JButton jButtonGuardarCambiosTablaFormatoActivoFijo;
	protected JButton jButtonCerrarFormatoActivoFijo;
	
	
	protected JButton jButtonRecargarInformacionFormatoActivoFijo;
	protected JButton jButtonProcesarInformacionFormatoActivoFijo;
	
	
	protected JButton jButtonAnterioresFormatoActivoFijo;
	protected JButton jButtonSiguientesFormatoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosFormatoActivoFijo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFormatoActivoFijo;
	//protected JButton jButtonCerrarReporteDinamicoFormatoActivoFijo;
	//protected JButton jButtonGenerarExcelReporteDinamicoFormatoActivoFijo;	
	
	
	
	//protected JButton jButtonAbrirImportacionFormatoActivoFijo;
	//protected JButton jButtonGenerarImportacionFormatoActivoFijo;
	//protected JButton jButtonCerrarImportacionFormatoActivoFijo;
	//protected JFileChooser jFileChooserImportacionFormatoActivoFijo;
	//protected File fileImportacionFormatoActivoFijo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormatoActivoFijo;
	protected JButton jButtonDuplicarToolBarFormatoActivoFijo;
	protected JButton jButtonNuevoRelacionesToolBarFormatoActivoFijo;
	
	
	public JButton jButtonGuardarCambiosToolBarFormatoActivoFijo;
	protected JButton jButtonCopiarToolBarFormatoActivoFijo;
	protected JButton jButtonVerFormToolBarFormatoActivoFijo;
	public JButton jButtonGuardarCambiosTablaToolBarFormatoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarFormatoActivoFijo;
	protected JButton jButtonCerrarToolBarFormatoActivoFijo;
	
	protected JButton jButtonRecargarInformacionToolBarFormatoActivoFijo;
	protected JButton jButtonProcesarInformacionToolBarFormatoActivoFijo;
	protected JButton jButtonAnterioresToolBarFormatoActivoFijo;
	protected JButton jButtonSiguientesToolBarFormatoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosToolBarFormatoActivoFijo;
	protected JButton jButtonAbrirOrderByToolBarFormatoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormatoActivoFijo;
	protected JMenuItem jMenuItemDuplicarFormatoActivoFijo;
	protected JMenuItem jMenuItemNuevoRelacionesFormatoActivoFijo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFormatoActivoFijo;
	protected JMenuItem jMenuItemCopiarFormatoActivoFijo;
	protected JMenuItem jMenuItemVerFormFormatoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormatoActivoFijo;
	protected JMenuItem jMenuItemCerrarFormatoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarFormatoActivoFijo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFormatoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormatoActivoFijo;
	
	protected JMenuItem jMenuItemRecargarInformacionFormatoActivoFijo;
	protected JMenuItem jMenuItemProcesarInformacionFormatoActivoFijo;
	protected JMenuItem jMenuItemAnterioresFormatoActivoFijo;
	protected JMenuItem jMenuItemSiguientesFormatoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormatoActivoFijo;
	protected JMenuItem jMenuItemAbrirOrderByFormatoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarFormatoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormatoActivoFijo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFormatoActivoFijo;
	protected JCheckBox jCheckBoxSeleccionadosFormatoActivoFijo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFormatoActivoFijo;
	protected JCheckBox jCheckBoxConGraficoReporteFormatoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFormatoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFormatoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFormatoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFormatoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFormatoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFormatoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormatoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormatoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFormatoActivoFijo;
	protected JTextField jTextFieldValorCampoGeneralFormatoActivoFijo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFormatoActivoFijo;
	//public JList<Reporte> jListColumnasSelectReporteFormatoActivoFijo;
	//public JScrollPane jScrollColumnasSelectReporteFormatoActivoFijo;
	
	//public JLabel jLabelRelacionesSelectReporteFormatoActivoFijo;
	//public JList<Reporte> jListRelacionesSelectReporteFormatoActivoFijo;
	//public JScrollPane jScrollRelacionesSelectReporteFormatoActivoFijo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFormatoActivoFijo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFormatoActivoFijo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFormatoActivoFijo;
	//public JLabel jLabelTiposArchivoReporteDinamicoFormatoActivoFijo;
	
		
	//public JLabel jLabelArchivoImportacionFormatoActivoFijo;	
	//public JLabel jLabelPathArchivoImportacionFormatoActivoFijo;
	//protected JTextField jTextFieldPathArchivoImportacionFormatoActivoFijo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFormatoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFormatoActivoFijo;
	
	//public JLabel jLabelColumnaCategoriaValorFormatoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFormatoActivoFijo;
	
	//public JLabel jLabelColumnasValoresGraficoFormatoActivoFijo;
	//public JList<Reporte> jListColumnasValoresGraficoFormatoActivoFijo;
	//public JScrollPane jScrollColumnasValoresGraficoFormatoActivoFijo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFormatoActivoFijo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFormatoActivoFijo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFormatoActivoFijo;
	
	
	
	
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
	public FormatoActivoFijoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FormatoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoActivoFijoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoActivoFijoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoActivoFijoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormatoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFormatoActivoFijo)	{
		this.jButtonRecargarInformacionFormatoActivoFijo = jButtonRecargarInformacionFormatoActivoFijo;
	}
	
	public JButton getjButtonProcesarInformacionFormatoActivoFijo() {
		return this.jButtonProcesarInformacionFormatoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormatoActivoFijo)	{
		this.jButtonProcesarInformacionFormatoActivoFijo = jButtonProcesarInformacionFormatoActivoFijo;
	}
	
	
	public JButton getjButtonRecargarInformacionFormatoActivoFijo() {
		return this.jButtonRecargarInformacionFormatoActivoFijo;
	}
	
	
	public List<FormatoActivoFijo> getformatoactivofijos() {
		return this.formatoactivofijos;
	}

	public void setformatoactivofijos(List<FormatoActivoFijo> formatoactivofijos) {
		this.formatoactivofijos = formatoactivofijos;
	}
	
	public List<FormatoActivoFijo> getformatoactivofijosAux() {
		return this.formatoactivofijosAux;
	}

	public void setformatoactivofijosAux(List<FormatoActivoFijo> formatoactivofijosAux) {
		this.formatoactivofijosAux = formatoactivofijosAux;
	}
	
	public List<FormatoActivoFijo> getformatoactivofijosEliminados() {
		return this.formatoactivofijosEliminados;
	}

	public void setFormatoActivoFijosEliminados(List<FormatoActivoFijo> formatoactivofijosEliminados) {
		this.formatoactivofijosEliminados = formatoactivofijosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFormatoActivoFijo() {
		return jComboBoxTiposSeleccionarFormatoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFormatoActivoFijo(
			JComboBox jComboBoxTiposSeleccionarFormatoActivoFijo) {
		this.jComboBoxTiposSeleccionarFormatoActivoFijo = jComboBoxTiposSeleccionarFormatoActivoFijo;
	}
	
	public void setBorderResaltarTiposSeleccionarFormatoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFormatoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFormatoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFormatoActivoFijo() {
		return jTextFieldValorCampoGeneralFormatoActivoFijo;
	}

	public void setjTextFieldValorCampoGeneralFormatoActivoFijo(
			JTextField jTextFieldValorCampoGeneralFormatoActivoFijo) {
		this.jTextFieldValorCampoGeneralFormatoActivoFijo = jTextFieldValorCampoGeneralFormatoActivoFijo;
	}

	public void setBorderResaltarValorCampoGeneralFormatoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoActivoFijo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFormatoActivoFijo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFormatoActivoFijo() {
		return this.jCheckBoxSeleccionarTodosFormatoActivoFijo;
	}

	public void setjCheckBoxSeleccionarTodosFormatoActivoFijo(
			JCheckBox jCheckBoxSeleccionarTodosFormatoActivoFijo) {
		this.jCheckBoxSeleccionarTodosFormatoActivoFijo = jCheckBoxSeleccionarTodosFormatoActivoFijo;
	}

	public void setBorderResaltarSeleccionarTodosFormatoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFormatoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFormatoActivoFijo() {
		return this.jCheckBoxSeleccionadosFormatoActivoFijo;
	}

	public void setjCheckBoxSeleccionadosFormatoActivoFijo(
			JCheckBox jCheckBoxSeleccionadosFormatoActivoFijo) {
		this.jCheckBoxSeleccionadosFormatoActivoFijo = jCheckBoxSeleccionadosFormatoActivoFijo;
	}
	
	public void setBorderResaltarSeleccionadosFormatoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFormatoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFormatoActivoFijo() {
		return this.jComboBoxTiposArchivosReportesFormatoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFormatoActivoFijo(
			JComboBox jComboBoxTiposArchivosReportesFormatoActivoFijo) {
		this.jComboBoxTiposArchivosReportesFormatoActivoFijo = jComboBoxTiposArchivosReportesFormatoActivoFijo;
	}

	public void setBorderResaltarTiposArchivosReportesFormatoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFormatoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFormatoActivoFijo() {
		return this.jComboBoxTiposReportesFormatoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFormatoActivoFijo(
			JComboBox jComboBoxTiposReportesFormatoActivoFijo) {
		this.jComboBoxTiposReportesFormatoActivoFijo = jComboBoxTiposReportesFormatoActivoFijo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFormatoActivoFijo() {
	//	return jComboBoxTiposReportesDinamicoFormatoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFormatoActivoFijo(
	//		JComboBox jComboBoxTiposReportesDinamicoFormatoActivoFijo) {
	//	this.jComboBoxTiposReportesDinamicoFormatoActivoFijo = jComboBoxTiposReportesDinamicoFormatoActivoFijo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFormatoActivoFijo() {
	//	return jComboBoxTiposArchivosReportesDinamicoFormatoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFormatoActivoFijo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFormatoActivoFijo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFormatoActivoFijo = jComboBoxTiposArchivosReportesDinamicoFormatoActivoFijo;
	//}
	
	public void setBorderResaltarTiposReportesFormatoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFormatoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFormatoActivoFijo() {
		return this.jComboBoxTiposGraficosReportesFormatoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFormatoActivoFijo(
			JComboBox jComboBoxTiposGraficosReportesFormatoActivoFijo) {
		this.jComboBoxTiposGraficosReportesFormatoActivoFijo = jComboBoxTiposGraficosReportesFormatoActivoFijo;
	}
	
	public void setBorderResaltarTiposGraficosReportesFormatoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFormatoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFormatoActivoFijo() {
		return this.jComboBoxTiposPaginacionFormatoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFormatoActivoFijo(
			JComboBox jComboBoxTiposPaginacionFormatoActivoFijo) {
		this.jComboBoxTiposPaginacionFormatoActivoFijo = jComboBoxTiposPaginacionFormatoActivoFijo;
	}
	
	public void setBorderResaltarTiposPaginacionFormatoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFormatoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFormatoActivoFijo() {
		return this.jComboBoxTiposRelacionesFormatoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormatoActivoFijo() {
		return this.jComboBoxTiposAccionesFormatoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormatoActivoFijo(
			JComboBox jComboBoxTiposRelacionesFormatoActivoFijo) {
		this.jComboBoxTiposRelacionesFormatoActivoFijo = jComboBoxTiposRelacionesFormatoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormatoActivoFijo(
			JComboBox jComboBoxTiposAccionesFormatoActivoFijo) {
		this.jComboBoxTiposAccionesFormatoActivoFijo = jComboBoxTiposAccionesFormatoActivoFijo;
	}
	
	public void setBorderResaltarTiposRelacionesFormatoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFormatoActivoFijo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFormatoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormatoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFormatoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFormatoActivoFijo() {
	//	return jCheckBoxConGraficoDinamicoFormatoActivoFijo;
	//}

	//public void setjCheckBoxConGraficoDinamicoFormatoActivoFijo(
	//		JCheckBox jCheckBoxConGraficoDinamicoFormatoActivoFijo) {
	//	this.jCheckBoxConGraficoDinamicoFormatoActivoFijo = jCheckBoxConGraficoDinamicoFormatoActivoFijo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFormatoActivoFijo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFormatoActivoFijo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFormatoActivoFijo .setBorder(borderResaltar);		
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
		this.formatoactivofijoSessionBean=new FormatoActivoFijoSessionBean();
		
		this.formatoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formatoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formatoactivofijoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FormatoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FormatoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormatoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormatoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormatoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formatos MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
		
		FormatoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FormatoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFormatoActivoFijo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFormatoActivoFijo,this.jTtoolBarFormatoActivoFijo,
							"nuevo","nuevo","Nuevo"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFormatoActivoFijo,this.jTtoolBarFormatoActivoFijo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFormatoActivoFijo,this.jTtoolBarFormatoActivoFijo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFormatoActivoFijo,this.jTtoolBarFormatoActivoFijo,
							"duplicar","duplicar","Duplicar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFormatoActivoFijo,this.jTtoolBarFormatoActivoFijo,
							"copiar","copiar","Copiar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFormatoActivoFijo,this.jTtoolBarFormatoActivoFijo,
							"ver_form","ver_form","Ver"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormatoActivoFijo,this.jTtoolBarFormatoActivoFijo,
							"recargar","recargar","Recargar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormatoActivoFijo,this.jTtoolBarFormatoActivoFijo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormatoActivoFijo,this.jTtoolBarFormatoActivoFijo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFormatoActivoFijo,this.jTtoolBarFormatoActivoFijo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFormatoActivoFijo,this.jTtoolBarFormatoActivoFijo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFormatoActivoFijo,this.jTtoolBarFormatoActivoFijo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFormatoActivoFijo,this.jTtoolBarFormatoActivoFijo,
							"cerrar","cerrar","Salir"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFormatoActivoFijo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFormatoActivoFijo;
			
				this.jButtonProcesarInformacionToolBarFormatoActivoFijo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFormatoActivoFijo;
				
		//protected JButton jButtonModificarToolBarFormatoActivoFijo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFormatoActivoFijo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFormatoActivoFijo=new JMenuMe("General");
		this.jmenuArchivoFormatoActivoFijo=new JMenuMe("Archivo");
		this.jmenuAccionesFormatoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDatosFormatoActivoFijo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormatoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormatoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormatoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFormatoActivoFijo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFormatoActivoFijo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFormatoActivoFijo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFormatoActivoFijo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFormatoActivoFijo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFormatoActivoFijo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFormatoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormatoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormatoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFormatoActivoFijo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFormatoActivoFijo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFormatoActivoFijo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFormatoActivoFijo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFormatoActivoFijo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFormatoActivoFijo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFormatoActivoFijo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFormatoActivoFijo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFormatoActivoFijo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormatoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormatoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormatoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFormatoActivoFijo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFormatoActivoFijo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFormatoActivoFijo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFormatoActivoFijo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFormatoActivoFijo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFormatoActivoFijo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFormatoActivoFijo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFormatoActivoFijo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFormatoActivoFijo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFormatoActivoFijo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFormatoActivoFijo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFormatoActivoFijo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFormatoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFormatoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFormatoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormatoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormatoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormatoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFormatoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFormatoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFormatoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormatoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormatoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormatoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFormatoActivoFijo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFormatoActivoFijo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFormatoActivoFijo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFormatoActivoFijo.add(this.jMenuItemCerrarFormatoActivoFijo);
			
			this.jmenuAccionesFormatoActivoFijo.add(this.jMenuItemNuevoFormatoActivoFijo);
			this.jmenuAccionesFormatoActivoFijo.add(this.jMenuItemNuevoGuardarCambiosFormatoActivoFijo);
			this.jmenuAccionesFormatoActivoFijo.add(this.jMenuItemNuevoRelacionesFormatoActivoFijo);
			this.jmenuAccionesFormatoActivoFijo.add(this.jMenuItemGuardarCambiosTablaFormatoActivoFijo);		
			this.jmenuAccionesFormatoActivoFijo.add(this.jMenuItemDuplicarFormatoActivoFijo);		
			this.jmenuAccionesFormatoActivoFijo.add(this.jMenuItemCopiarFormatoActivoFijo);		
			this.jmenuAccionesFormatoActivoFijo.add(this.jMenuItemVerFormFormatoActivoFijo);		
			
			this.jmenuDatosFormatoActivoFijo.add(this.jMenuItemRecargarInformacionFormatoActivoFijo);				
			this.jmenuDatosFormatoActivoFijo.add(this.jMenuItemAnterioresFormatoActivoFijo);				
			this.jmenuDatosFormatoActivoFijo.add(this.jMenuItemSiguientesFormatoActivoFijo);				
			this.jmenuDatosFormatoActivoFijo.add(this.jMenuItemAbrirOrderByFormatoActivoFijo);				
			this.jmenuDatosFormatoActivoFijo.add(this.jMenuItemMostrarOcultarFormatoActivoFijo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFormatoActivoFijo.add(this.jMenuItemGuardarCambiosFormatoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFormatoActivoFijo.add(this.jmenuArchivoFormatoActivoFijo);		
			this.jmenuBarFormatoActivoFijo.add(this.jmenuAccionesFormatoActivoFijo);		
			this.jmenuBarFormatoActivoFijo.add(this.jmenuDatosFormatoActivoFijo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFormatoActivoFijo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFormatoActivoFijo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasFormatoActivoFijo=new JTabbedPane();


		this.jTabbedPaneBusquedasFormatoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasFormatoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasFormatoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFormatoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFormatoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFormatoActivoFijo = new FormatoActivoFijoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Formatos DATOS");
			this.jInternalFrameDetalleFormFormatoActivoFijo = new FormatoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.formatoactivofijoSessionBean.getConGuardarRelaciones(),this.formatoactivofijoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFormatoActivoFijo = null;//new FormatoActivoFijoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormatoActivoFijo= new GridBagLayout();
		
		
		this.jTableDatosFormatoActivoFijo = new JTableMe();      
		
		String sToolTipFormatoActivoFijo="";
		sToolTipFormatoActivoFijo=FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormatoActivoFijo+="(ActivosFijos.FormatoActivoFijo)";
		}
		
		if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormatoActivoFijo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFormatoActivoFijo.setToolTipText(sToolTipFormatoActivoFijo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFormatoActivoFijo);
		this.jTableDatosFormatoActivoFijo.setAutoCreateRowSorter(true);
		this.jTableDatosFormatoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFormatoActivoFijo.setRowSelectionAllowed(true);
		this.jTableDatosFormatoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFormatoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFormatoActivoFijo = new JButtonMe();
		this.jButtonDuplicarFormatoActivoFijo = new JButtonMe();
		this.jButtonCopiarFormatoActivoFijo = new JButtonMe();
		this.jButtonVerFormFormatoActivoFijo = new JButtonMe();
		this.jButtonNuevoRelacionesFormatoActivoFijo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFormatoActivoFijo = new JButtonMe();
		this.jButtonCerrarFormatoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosFormatoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosGeneralFormatoActivoFijo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFormatoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Formatos";
		
		if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formatoss" + this.sPath));
		} else {
			this.jScrollPanelDatosFormatoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormatoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormatoActivoFijo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFormatoActivoFijo=new ReporteDinamicoJInternalFrame(FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFormatoActivoFijo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFormatoActivoFijo=new ImportacionJInternalFrame(FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFormatoActivoFijo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFormatoActivoFijo = new JButtonMe();
		
		this.jButtonAbrirOrderByFormatoActivoFijo.setText("Orden");
		this.jButtonAbrirOrderByFormatoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormatoActivoFijo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFormatoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormatoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoActivoFijo,false,this);
			
			//this.cargarOrderByFormatoActivoFijo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormatoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoActivoFijo,true,this);
			
			//this.cargarOrderByFormatoActivoFijo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFormatoActivoFijo.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosFormatoActivoFijo.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosFormatoActivoFijo.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosFormatoActivoFijo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormatoActivoFijo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormatoActivoFijo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFormatoActivoFijo.setText("Nuevo");
		this.jButtonDuplicarFormatoActivoFijo.setText("Duplicar");
		this.jButtonCopiarFormatoActivoFijo.setText("Copiar");
		this.jButtonVerFormFormatoActivoFijo.setText("Ver");
		this.jButtonNuevoRelacionesFormatoActivoFijo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFormatoActivoFijo.setText("Guardar");
		this.jButtonCerrarFormatoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormatoActivoFijo,"nuevo_button","Nuevo",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFormatoActivoFijo,"duplicar_button","Duplicar",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFormatoActivoFijo,"copiar_button","Copiar",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFormatoActivoFijo,"ver_form","Ver",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFormatoActivoFijo,"nuevorelaciones_button","Nuevo Rel",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormatoActivoFijo,"guardarcambiostabla_button","Guardar",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormatoActivoFijo,"cerrar_button","Salir",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFormatoActivoFijo.setToolTipText("Nuevo"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFormatoActivoFijo.setToolTipText("Duplicar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFormatoActivoFijo.setToolTipText("Copiar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFormatoActivoFijo.setToolTipText("Ver"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFormatoActivoFijo.setToolTipText("Nuevo Rel"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFormatoActivoFijo.setToolTipText("Guardar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormatoActivoFijo.setToolTipText("Salir"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormatoActivoFijo";
		inputMap = this.jButtonNuevoFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormatoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormatoActivoFijo"));
		
		//DUPLICAR
		sMapKey = "DuplicarFormatoActivoFijo";
		inputMap = this.jButtonDuplicarFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFormatoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFormatoActivoFijo"));
		
		//COPIAR
		sMapKey = "CopiarFormatoActivoFijo";
		inputMap = this.jButtonCopiarFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFormatoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFormatoActivoFijo"));
		
		//VEr FORM
		sMapKey = "VerFormFormatoActivoFijo";
		inputMap = this.jButtonVerFormFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFormatoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFormatoActivoFijo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFormatoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFormatoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFormatoActivoFijo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFormatoActivoFijo";
		inputMap = this.jButtonModificarFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFormatoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFormatoActivoFijo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFormatoActivoFijo";
		inputMap = this.jButtonCerrarFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormatoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormatoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormatoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormatoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormatoActivoFijo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFormatoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFormatoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFormatoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FormatoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FormatoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FormatoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FormatoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FormatoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFormatoActivoFijo.setName("jPanelParametrosReportesFormatoActivoFijo"); 
		
		this.jPanelParametrosReportesAccionesFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFormatoActivoFijo.setName("jPanelParametrosReportesAccionesFormatoActivoFijo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFormatoActivoFijo = new JButtonMe();
		this.jButtonRecargarInformacionFormatoActivoFijo.setText("Recargar");
		this.jButtonRecargarInformacionFormatoActivoFijo.setToolTipText("Recargar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFormatoActivoFijo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFormatoActivoFijo = new JButtonMe();
		this.jButtonProcesarInformacionFormatoActivoFijo.setText("Procesar");
		this.jButtonProcesarInformacionFormatoActivoFijo.setToolTipText("Procesar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFormatoActivoFijo.setVisible(false);
			
		this.jButtonProcesarInformacionFormatoActivoFijo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormatoActivoFijo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormatoActivoFijo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFormatoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormatoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFormatoActivoFijo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFormatoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormatoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposReportesFormatoActivoFijo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFormatoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormatoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFormatoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFormatoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFormatoActivoFijo.setText("Paginacion");
		this.jComboBoxTiposPaginacionFormatoActivoFijo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFormatoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFormatoActivoFijo.setText("Accion");
		this.jComboBoxTiposRelacionesFormatoActivoFijo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFormatoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormatoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesFormatoActivoFijo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFormatoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFormatoActivoFijo.setText("Accion");
		this.jComboBoxTiposSeleccionarFormatoActivoFijo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFormatoActivoFijo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFormatoActivoFijo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormatoActivoFijo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormatoActivoFijo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFormatoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesFormatoActivoFijo.setText("Acciones");		
		this.jLabelAccionesFormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFormatoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFormatoActivoFijo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFormatoActivoFijo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFormatoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFormatoActivoFijo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFormatoActivoFijo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFormatoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFormatoActivoFijo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFormatoActivoFijo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFormatoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFormatoActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoReporteFormatoActivoFijo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFormatoActivoFijo = new JButtonMe();
		//this.jButtonAnterioresFormatoActivoFijo.setText("<<");
        this.jButtonAnterioresFormatoActivoFijo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFormatoActivoFijo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFormatoActivoFijo = new JButtonMe();
		//this.jButtonSiguientesFormatoActivoFijo.setText(">>");
        this.jButtonSiguientesFormatoActivoFijo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFormatoActivoFijo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFormatoActivoFijo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFormatoActivoFijo.setText("Nue");
        this.jButtonNuevoGuardarCambiosFormatoActivoFijo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFormatoActivoFijo,"nuevoguardarcambios_button","Nue",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFormatoActivoFijo";
		inputMap = this.jButtonNuevoGuardarCambiosFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFormatoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFormatoActivoFijo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFormatoActivoFijo";
		inputMap = this.jButtonRecargarInformacionFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFormatoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFormatoActivoFijo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFormatoActivoFijo";
		inputMap = this.jButtonSiguientesFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFormatoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFormatoActivoFijo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFormatoActivoFijo";
		inputMap = this.jButtonAnterioresFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFormatoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFormatoActivoFijo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFormatoActivoFijo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFormatoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),FormatoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormatoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormatoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),FormatoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormatoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormatoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),FormatoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormatoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFormatoActivoFijo = new GridBagLayout();

			this.jPanelPaginacionFormatoActivoFijo.setLayout(gridaBagLayoutPaginacionFormatoActivoFijo);						
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
			this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFormatoActivoFijo.add(this.jButtonAnterioresFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
					
						
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
			
			this.jPanelPaginacionFormatoActivoFijo.add(this.jButtonNuevoGuardarCambiosFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
						
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
			this.jPanelPaginacionFormatoActivoFijo.add(this.jButtonSiguientesFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.gridy = 1;
			this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoActivoFijo.add(this.jButtonNuevoFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
						
			
			
			if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormatoActivoFijo.gridy = 1;
				this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFormatoActivoFijo.add(this.jButtonGuardarCambiosTablaFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
			}
			
			
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.gridy = 1;
			this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoActivoFijo.add(this.jButtonDuplicarFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.gridy = 1;
			this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoActivoFijo.add(this.jButtonCopiarFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.gridy = 1;
			this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormatoActivoFijo.add(this.jButtonVerFormFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.gridy = 1;
			this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFormatoActivoFijo.add(this.jButtonCerrarFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		
		
		
		this.jButtonRecargarInformacionFormatoActivoFijo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormatoActivoFijo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormatoActivoFijo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFormatoActivoFijo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormatoActivoFijo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormatoActivoFijo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFormatoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormatoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormatoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFormatoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormatoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormatoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFormatoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormatoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormatoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFormatoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormatoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormatoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFormatoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFormatoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormatoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormatoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFormatoActivoFijo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormatoActivoFijo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormatoActivoFijo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFormatoActivoFijo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormatoActivoFijo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormatoActivoFijo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFormatoActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormatoActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormatoActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFormatoActivoFijo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormatoActivoFijo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormatoActivoFijo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFormatoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFormatoActivoFijo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FormatoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FormatoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FormatoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FormatoActivoFijo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFormatoActivoFijo.setLayout(gridaBagParametrosReportesFormatoActivoFijo);
			this.jPanelParametrosReportesAccionesFormatoActivoFijo.setLayout(gridaBagParametrosReportesAccionesFormatoActivoFijo);
			
			
			this.jPanelParametrosAuxiliar1FormatoActivoFijo.setLayout(gridaBagParametrosAuxiliar1FormatoActivoFijo);
			this.jPanelParametrosAuxiliar2FormatoActivoFijo.setLayout(gridaBagParametrosAuxiliar2FormatoActivoFijo);
			this.jPanelParametrosAuxiliar3FormatoActivoFijo.setLayout(gridaBagParametrosAuxiliar3FormatoActivoFijo);
			this.jPanelParametrosAuxiliar4FormatoActivoFijo.setLayout(gridaBagParametrosAuxiliar4FormatoActivoFijo);
			//this.jPanelParametrosAuxiliar5FormatoActivoFijo.setLayout(gridaBagParametrosAuxiliar2FormatoActivoFijo);			
			
			
			
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormatoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoActivoFijo.add(this.jButtonRecargarInformacionFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormatoActivoFijo.add(this.jComboBoxTiposPaginacionFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormatoActivoFijo.add(this.jCheckBoxConAltoMaximoTablaFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormatoActivoFijo.add(this.jComboBoxTiposArchivosReportesFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoActivoFijo.add(this.jPanelParametrosAuxiliar1FormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FormatoActivoFijo.add(this.jComboBoxTiposReportesFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoActivoFijo.add(this.jPanelParametrosAuxiliar4FormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoActivoFijo.add(this.jComboBoxTiposReportesFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormatoActivoFijo.add(this.jCheckBoxGenerarReporteFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoActivoFijo.add(this.jPanelParametrosAuxiliar2FormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormatoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormatoActivoFijo.add(this.jLabelAccionesFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFormatoActivoFijo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFormatoActivoFijo.add(this.jButtonAbrirOrderByFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoActivoFijo.add(this.jComboBoxTiposSeleccionarFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);			
			
			
			/*
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormatoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormatoActivoFijo.add(this.jCheckBoxSeleccionarTodosFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormatoActivoFijo.add(this.jCheckBoxSeleccionarTodosFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);															
				
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormatoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormatoActivoFijo.add(this.jCheckBoxSeleccionadosFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormatoActivoFijo.add(this.jPanelParametrosAuxiliar3FormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoActivoFijo.add(this.jComboBoxTiposAccionesFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
	
				
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormatoActivoFijo.add(this.jTextFieldValorCampoGeneralFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFormatoActivoFijo = new GridBagLayout();

			this.jScrollPanelDatosFormatoActivoFijo.setLayout(gridaBagLayoutDatosFormatoActivoFijo);
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
			this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
			
			this.jScrollPanelDatosFormatoActivoFijo.add(this.jTableDatosFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFormatoActivoFijo.setViewportView(this.jTableDatosFormatoActivoFijo);
		this.jTableDatosFormatoActivoFijo.setFillsViewportHeight(true);
		this.jTableDatosFormatoActivoFijo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFormatoActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormatoActivoFijo.setLayout(gridaBagLayoutAccionesFormatoActivoFijo);
		
		
		/*	
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
		this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
			
		this.jPanelAccionesFormatoActivoFijo.add(this.jButtonNuevoFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormatoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormatoActivoFijo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormatoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsFormatoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormatoActivoFijo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFormatoActivoFijo.gridx = 0;		
		//this.gridBagConstraintsFormatoActivoFijo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFormatoActivoFijo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFormatoActivoFijo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);								
		
		
		/*
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		*/		
		
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormatoActivoFijo.gridx =0;
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormatoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
				
		
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FormatoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFormatoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormatoActivoFijo = new GridBagLayout();
			this.jPanelBusquedasParametrosFormatoActivoFijo.setLayout(gridaBagLayoutBusquedasParametrosFormatoActivoFijo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFormatoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormatoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
			
			
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		
			
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormatoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFormatoActivoFijo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFormatoActivoFijo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFormatoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFormatoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFormatoActivoFijo.setName("jPanelReporteDinamicoFormatoActivoFijo"); 
		
		this.jPanelReporteDinamicoFormatoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormatoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormatoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFormatoActivoFijo.setLayout(gridaBagLayoutReporteDinamicoFormatoActivoFijo);
		
		
		this.jInternalFrameReporteDinamicoFormatoActivoFijo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFormatoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormatoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFormatoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFormatoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFormatoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFormatoActivoFijo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFormatoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFormatoActivoFijo.setResizable(true);
	    this.jInternalFrameReporteDinamicoFormatoActivoFijo.setClosable(true);
	    this.jInternalFrameReporteDinamicoFormatoActivoFijo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFormatoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormatoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormatoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formatoss"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFormatoActivoFijo = new JLabelMe();

		this.jLabelColumnasSelectReporteFormatoActivoFijo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormatoActivoFijo.add(this.jLabelColumnasSelectReporteFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFormatoActivoFijo = new JList<Reporte>();
		this.jListColumnasSelectReporteFormatoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFormatoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFormatoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormatoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormatoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFormatoActivoFijo=new JScrollPane(this.jListColumnasSelectReporteFormatoActivoFijo);
			
			this.jScrollColumnasSelectReporteFormatoActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormatoActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormatoActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormatoActivoFijo.add(this.jListColumnasSelectReporteFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		this.jPanelReporteDinamicoFormatoActivoFijo.add(this.jScrollColumnasSelectReporteFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFormatoActivoFijo = new JLabelMe();

		this.jLabelRelacionesSelectReporteFormatoActivoFijo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFormatoActivoFijo = new JList<Reporte>();
		this.jListRelacionesSelectReporteFormatoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFormatoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFormatoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormatoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormatoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFormatoActivoFijo=new JScrollPane(this.jListRelacionesSelectReporteFormatoActivoFijo);
			
			this.jScrollRelacionesSelectReporteFormatoActivoFijo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormatoActivoFijo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormatoActivoFijo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFormatoActivoFijo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFormatoActivoFijo = new JComboBoxMe();
		this.jListColumnasValoresGraficoFormatoActivoFijo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFormatoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFormatoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFormatoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormatoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormatoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFormatoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFormatoActivoFijo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFormatoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormatoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormatoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFormatoActivoFijo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFormatoActivoFijo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoActivoFijo.add(this.jLabelGenerarExcelReporteDinamicoFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFormatoActivoFijo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFormatoActivoFijo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFormatoActivoFijo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFormatoActivoFijo.setToolTipText("Generar EXCEL"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFormatoActivoFijo.add(this.jButtonGenerarExcelReporteDinamicoFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoActivoFijo.add(this.jComboBoxTiposReportesDinamicoFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFormatoActivoFijo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFormatoActivoFijo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormatoActivoFijo.add(this.jLabelTiposArchivoReporteDinamicoFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoActivoFijo.add(this.jComboBoxTiposArchivosReportesDinamicoFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFormatoActivoFijo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFormatoActivoFijo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFormatoActivoFijo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFormatoActivoFijo.setToolTipText("Generar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoActivoFijo.add(this.jButtonGenerarReporteDinamicoFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFormatoActivoFijo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFormatoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFormatoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFormatoActivoFijo.setToolTipText("Cancelar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormatoActivoFijo.add(this.jButtonCerrarReporteDinamicoFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFormatoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFormatoActivoFijo= new JScrollPane(jPanelReporteDinamicoFormatoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFormatoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormatoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormatoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formatoss"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFormatoActivoFijo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFormatoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFormatoActivoFijo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFormatoActivoFijo);
		this.jInternalFrameReporteDinamicoFormatoActivoFijo.getContentPane().add(this.jScrollPanelReporteDinamicoFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFormatoActivoFijo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFormatoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFormatoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFormatoActivoFijo.setName("jPanelImportacionFormatoActivoFijo"); 
		
		this.jPanelImportacionFormatoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormatoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormatoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFormatoActivoFijo.setLayout(gridaBagLayoutImportacionFormatoActivoFijo);
		
		
		this.jInternalFrameImportacionFormatoActivoFijo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFormatoActivoFijo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFormatoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormatoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFormatoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormatoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormatoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFormatoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormatoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormatoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionFormatoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionFormatoActivoFijo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFormatoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormatoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormatoActivoFijo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFormatoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormatoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormatoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionFormatoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionFormatoActivoFijo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFormatoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormatoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormatoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formatoss"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFormatoActivoFijo = new JLabelMe();

		this.jLabelArchivoImportacionFormatoActivoFijo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormatoActivoFijo.add(this.jLabelArchivoImportacionFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFormatoActivoFijo = new JFileChooser();		
		this.jFileChooserImportacionFormatoActivoFijo.setToolTipText("ESCOGER ARCHIVO"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFormatoActivoFijo = new JButtonMe();
		this.jButtonAbrirImportacionFormatoActivoFijo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFormatoActivoFijo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFormatoActivoFijo.setToolTipText("Generar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoActivoFijo.add(this.jButtonAbrirImportacionFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFormatoActivoFijo = new JLabelMe();

		this.jLabelPathArchivoImportacionFormatoActivoFijo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormatoActivoFijo.add(this.jLabelPathArchivoImportacionFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFormatoActivoFijo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFormatoActivoFijo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormatoActivoFijo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormatoActivoFijo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoActivoFijo.add(this.jTextFieldPathArchivoImportacionFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFormatoActivoFijo = new JButtonMe();
		this.jButtonGenerarImportacionFormatoActivoFijo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFormatoActivoFijo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFormatoActivoFijo.setToolTipText("Generar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoActivoFijo.add(this.jButtonGenerarImportacionFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFormatoActivoFijo = new JButtonMe();
		this.jButtonCerrarImportacionFormatoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFormatoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFormatoActivoFijo.setToolTipText("Cancelar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormatoActivoFijo.add(this.jButtonCerrarImportacionFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFormatoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelImportacionFormatoActivoFijo= new JScrollPane(jPanelImportacionFormatoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy =iPosYImportacion;
		this.gridBagConstraintsFormatoActivoFijo.gridx =iPosXImportacion;
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFormatoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFormatoActivoFijo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFormatoActivoFijo);
		this.jInternalFrameImportacionFormatoActivoFijo.getContentPane().add(this.jScrollPanelImportacionFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFormatoActivoFijo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFormatoActivoFijo = new JButtonMe();
			this.jButtonAbrirOrderByFormatoActivoFijo.setText("Orden");
			this.jButtonAbrirOrderByFormatoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormatoActivoFijo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFormatoActivoFijo";
			inputMap = this.jButtonAbrirOrderByFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFormatoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFormatoActivoFijo"));
		
		
			GridBagLayout gridaBagLayoutOrderByFormatoActivoFijo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFormatoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFormatoActivoFijo.setName("jPanelOrderByFormatoActivoFijo"); 
			
			this.jPanelOrderByFormatoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormatoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormatoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFormatoActivoFijo.setLayout(gridaBagLayoutOrderByFormatoActivoFijo);
			
			
			this.jTableDatosFormatoActivoFijoOrderBy = new JTableMe();        
			this.jTableDatosFormatoActivoFijoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFormatoActivoFijoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFormatoActivoFijoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFormatoActivoFijoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFormatoActivoFijoOrderBy.setViewportView(this.jTableDatosFormatoActivoFijoOrderBy);
			this.jTableDatosFormatoActivoFijoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFormatoActivoFijoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFormatoActivoFijo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFormatoActivoFijo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFormatoActivoFijo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFormatoActivoFijo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFormatoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFormatoActivoFijo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFormatoActivoFijo.setTitle("Orden");
			this.jInternalFrameOrderByFormatoActivoFijo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFormatoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFormatoActivoFijo.setResizable(true);
			this.jInternalFrameOrderByFormatoActivoFijo.setClosable(true);
			this.jInternalFrameOrderByFormatoActivoFijo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFormatoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormatoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormatoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formatoss"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFormatoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFormatoActivoFijo.ipady =150;
				
			this.jPanelOrderByFormatoActivoFijo.add(jScrollPanelDatosFormatoActivoFijoOrderBy, this.gridBagConstraintsFormatoActivoFijo);//this.jTableDatosFormatoActivoFijoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFormatoActivoFijo = new JButtonMe();
			this.jButtonCerrarOrderByFormatoActivoFijo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFormatoActivoFijo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFormatoActivoFijo.setToolTipText("Cancelar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFormatoActivoFijo.add(this.jButtonCerrarOrderByFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFormatoActivoFijo = new GridBagLayout();
			
			this.jScrollPanelOrderByFormatoActivoFijo= new JScrollPane(jPanelOrderByFormatoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.gridy =iPosYOrderBy;
			this.gridBagConstraintsFormatoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFormatoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFormatoActivoFijo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFormatoActivoFijo);
			
			this.jInternalFrameOrderByFormatoActivoFijo.getContentPane().add(this.jScrollPanelOrderByFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);			
		
		} else {
			this.jButtonAbrirOrderByFormatoActivoFijo = new JButtonMe();
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
			&& this.formatoactivofijoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFormatoActivoFijo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFormatoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFormatoActivoFijo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFormatoActivoFijo.getRowHeight();//FormatoActivoFijoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FormatoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormatoActivoFijo.isSelected()) {
					iHeightTable=FormatoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormatoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormatoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FormatoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormatoActivoFijo.isSelected()) {
					iHeightTable=FormatoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormatoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormatoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFormatoActivoFijo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormatoActivoFijo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormatoActivoFijo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFormatoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormatoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormatoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFormatoActivoFijo!=null && this.jInternalFrameOrderByFormatoActivoFijo.getjTableDatosOrderBy()!=null) {
			//if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFormatoActivoFijo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFormatoActivoFijo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFormatoActivoFijo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFormatoActivoFijo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFormatoActivoFijo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFormatoActivoFijo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFormatoActivoFijo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFormatoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormatoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormatoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=formatoactivofijoLogic.getFormatoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formatoactivofijos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FormatoActivoFijo> TraerFormatoActivoFijoBeans(List<FormatoActivoFijo> formatoactivofijos,ArrayList<Classe> classes)throws Exception {
		try {
			for(FormatoActivoFijo formatoactivofijo:formatoactivofijos) {
					
				if(!(FormatoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FormatoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					formatoactivofijo.setsDetalleGeneralEntityReporte(FormatoActivoFijoConstantesFunciones.getFormatoActivoFijoDescripcion(formatoactivofijo));
										
						
					
						
					
				} else  {
							
					//formatoactivofijo.setsDetalleGeneralEntityReporte(formatoactivofijo.getsDetalleGeneralEntityReporte());
										
				}
				
				//formatoactivofijobeans.add(formatoactivofijobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return formatoactivofijos;
    }
	//PARA REPORTES FIN
}
