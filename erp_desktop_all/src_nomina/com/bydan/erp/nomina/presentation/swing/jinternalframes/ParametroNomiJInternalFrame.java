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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.nomina.util.ParametroNomiConstantesFunciones;

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
public class ParametroNomiJInternalFrame extends ParametroNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroNomi;
	
	protected JMenuBar jmenuBarParametroNomi;
	
	protected JMenu jmenuParametroNomi;
	protected JMenu jmenuDatosParametroNomi;
	protected JMenu jmenuArchivoParametroNomi;
	protected JMenu jmenuAccionesParametroNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroNomi;	
	protected GridBagConstraints gridBagConstraintsParametroNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroNomiDetalleFormJInternalFrame jInternalFrameDetalleFormParametroNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ParametroNomiSessionBean parametronomiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroNomi> parametronomis;		
	public List<ParametroNomi> parametronomisEliminados;	
	public List<ParametroNomi> parametronomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroNomi;		
	protected JButton jButtonAbrirOrderByParametroNomi;
	
	
	//protected JPanel jPanelOrderByParametroNomi;
	//public JScrollPane jScrollPanelOrderByParametroNomi;	
	//protected JButton jButtonCerrarOrderByParametroNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroNomiLogic parametronomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroNomi;
	public JScrollPane jScrollPanelDatosEdicionParametroNomi;
	public JScrollPane jScrollPanelDatosGeneralParametroNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroNomi;
	//public JScrollPane jScrollPanelImportacionParametroNomi;
	
	
	
	protected JPanel jPanelAccionesParametroNomi;
	
    protected JPanel jPanelPaginacionParametroNomi;
    protected JPanel jPanelParametrosReportesParametroNomi;
	protected JPanel jPanelParametrosReportesAccionesParametroNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroNomi;
	protected JPanel jPanelParametrosAuxiliar2ParametroNomi;
	protected JPanel jPanelParametrosAuxiliar3ParametroNomi;
	protected JPanel jPanelParametrosAuxiliar4ParametroNomi;
	//protected JPanel jPanelParametrosAuxiliar5ParametroNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroNomi;
	//protected JPanel jPanelImportacionParametroNomi;
	
	
	public JTable jTableDatosParametroNomi;
	
	
	
	//public JTable jTableDatosParametroNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroNomi;
	protected JButton jButtonDuplicarParametroNomi;
	protected JButton jButtonCopiarParametroNomi;
	protected JButton jButtonVerFormParametroNomi;
	protected JButton jButtonNuevoRelacionesParametroNomi;
	protected JButton jButtonModificarParametroNomi;
	
    protected JButton jButtonGuardarCambiosTablaParametroNomi;
	protected JButton jButtonCerrarParametroNomi;
	
	
	protected JButton jButtonRecargarInformacionParametroNomi;
	protected JButton jButtonProcesarInformacionParametroNomi;
	
	
	protected JButton jButtonAnterioresParametroNomi;
	protected JButton jButtonSiguientesParametroNomi;
	protected JButton jButtonNuevoGuardarCambiosParametroNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroNomi;
	//protected JButton jButtonCerrarReporteDinamicoParametroNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroNomi;
	//protected JButton jButtonGenerarImportacionParametroNomi;
	//protected JButton jButtonCerrarImportacionParametroNomi;
	//protected JFileChooser jFileChooserImportacionParametroNomi;
	//protected File fileImportacionParametroNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroNomi;
	protected JButton jButtonDuplicarToolBarParametroNomi;
	protected JButton jButtonNuevoRelacionesToolBarParametroNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroNomi;
	protected JButton jButtonCopiarToolBarParametroNomi;
	protected JButton jButtonVerFormToolBarParametroNomi;
	public JButton jButtonGuardarCambiosTablaToolBarParametroNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroNomi;
	protected JButton jButtonCerrarToolBarParametroNomi;
	
	protected JButton jButtonRecargarInformacionToolBarParametroNomi;
	protected JButton jButtonProcesarInformacionToolBarParametroNomi;
	protected JButton jButtonAnterioresToolBarParametroNomi;
	protected JButton jButtonSiguientesToolBarParametroNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroNomi;
	protected JButton jButtonAbrirOrderByToolBarParametroNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroNomi;
	protected JMenuItem jMenuItemDuplicarParametroNomi;
	protected JMenuItem jMenuItemNuevoRelacionesParametroNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroNomi;
	protected JMenuItem jMenuItemCopiarParametroNomi;
	protected JMenuItem jMenuItemVerFormParametroNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroNomi;
	protected JMenuItem jMenuItemCerrarParametroNomi;
	protected JMenuItem jMenuItemDetalleCerrarParametroNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroNomi;
	protected JMenuItem jMenuItemProcesarInformacionParametroNomi;
	protected JMenuItem jMenuItemAnterioresParametroNomi;
	protected JMenuItem jMenuItemSiguientesParametroNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroNomi;
	protected JMenuItem jMenuItemAbrirOrderByParametroNomi;
	protected JMenuItem jMenuItemMostrarOcultarParametroNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroNomi;
	protected JCheckBox jCheckBoxSeleccionadosParametroNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroNomi;
	protected JCheckBox jCheckBoxConGraficoReporteParametroNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroNomi;
	protected JTextField jTextFieldValorCampoGeneralParametroNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroNomi;
	//public JList<Reporte> jListColumnasSelectReporteParametroNomi;
	//public JScrollPane jScrollColumnasSelectReporteParametroNomi;
	
	//public JLabel jLabelRelacionesSelectReporteParametroNomi;
	//public JList<Reporte> jListRelacionesSelectReporteParametroNomi;
	//public JScrollPane jScrollRelacionesSelectReporteParametroNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroNomi;
	
		
	//public JLabel jLabelArchivoImportacionParametroNomi;	
	//public JLabel jLabelPathArchivoImportacionParametroNomi;
	//protected JTextField jTextFieldPathArchivoImportacionParametroNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroNomi;
	
	//public JLabel jLabelColumnaCategoriaValorParametroNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroNomi;
	
	//public JLabel jLabelColumnasValoresGraficoParametroNomi;
	//public JList<Reporte> jListColumnasValoresGraficoParametroNomi;
	//public JScrollPane jScrollColumnasValoresGraficoParametroNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroNomi;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroNomi;
	
	
	
	
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroNomi)	{
		this.jButtonRecargarInformacionParametroNomi = jButtonRecargarInformacionParametroNomi;
	}
	
	public JButton getjButtonProcesarInformacionParametroNomi() {
		return this.jButtonProcesarInformacionParametroNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroNomi)	{
		this.jButtonProcesarInformacionParametroNomi = jButtonProcesarInformacionParametroNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroNomi() {
		return this.jButtonRecargarInformacionParametroNomi;
	}
	
	
	public List<ParametroNomi> getparametronomis() {
		return this.parametronomis;
	}

	public void setparametronomis(List<ParametroNomi> parametronomis) {
		this.parametronomis = parametronomis;
	}
	
	public List<ParametroNomi> getparametronomisAux() {
		return this.parametronomisAux;
	}

	public void setparametronomisAux(List<ParametroNomi> parametronomisAux) {
		this.parametronomisAux = parametronomisAux;
	}
	
	public List<ParametroNomi> getparametronomisEliminados() {
		return this.parametronomisEliminados;
	}

	public void setParametroNomisEliminados(List<ParametroNomi> parametronomisEliminados) {
		this.parametronomisEliminados = parametronomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroNomi() {
		return jComboBoxTiposSeleccionarParametroNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroNomi(
			JComboBox jComboBoxTiposSeleccionarParametroNomi) {
		this.jComboBoxTiposSeleccionarParametroNomi = jComboBoxTiposSeleccionarParametroNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroNomi() {
		return jTextFieldValorCampoGeneralParametroNomi;
	}

	public void setjTextFieldValorCampoGeneralParametroNomi(
			JTextField jTextFieldValorCampoGeneralParametroNomi) {
		this.jTextFieldValorCampoGeneralParametroNomi = jTextFieldValorCampoGeneralParametroNomi;
	}

	public void setBorderResaltarValorCampoGeneralParametroNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroNomi() {
		return this.jCheckBoxSeleccionarTodosParametroNomi;
	}

	public void setjCheckBoxSeleccionarTodosParametroNomi(
			JCheckBox jCheckBoxSeleccionarTodosParametroNomi) {
		this.jCheckBoxSeleccionarTodosParametroNomi = jCheckBoxSeleccionarTodosParametroNomi;
	}

	public void setBorderResaltarSeleccionarTodosParametroNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroNomi() {
		return this.jCheckBoxSeleccionadosParametroNomi;
	}

	public void setjCheckBoxSeleccionadosParametroNomi(
			JCheckBox jCheckBoxSeleccionadosParametroNomi) {
		this.jCheckBoxSeleccionadosParametroNomi = jCheckBoxSeleccionadosParametroNomi;
	}
	
	public void setBorderResaltarSeleccionadosParametroNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroNomi() {
		return this.jComboBoxTiposArchivosReportesParametroNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroNomi(
			JComboBox jComboBoxTiposArchivosReportesParametroNomi) {
		this.jComboBoxTiposArchivosReportesParametroNomi = jComboBoxTiposArchivosReportesParametroNomi;
	}

	public void setBorderResaltarTiposArchivosReportesParametroNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroNomi() {
		return this.jComboBoxTiposReportesParametroNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroNomi(
			JComboBox jComboBoxTiposReportesParametroNomi) {
		this.jComboBoxTiposReportesParametroNomi = jComboBoxTiposReportesParametroNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroNomi() {
	//	return jComboBoxTiposReportesDinamicoParametroNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroNomi) {
	//	this.jComboBoxTiposReportesDinamicoParametroNomi = jComboBoxTiposReportesDinamicoParametroNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroNomi = jComboBoxTiposArchivosReportesDinamicoParametroNomi;
	//}
	
	public void setBorderResaltarTiposReportesParametroNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroNomi() {
		return this.jComboBoxTiposGraficosReportesParametroNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroNomi(
			JComboBox jComboBoxTiposGraficosReportesParametroNomi) {
		this.jComboBoxTiposGraficosReportesParametroNomi = jComboBoxTiposGraficosReportesParametroNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroNomi() {
		return this.jComboBoxTiposPaginacionParametroNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroNomi(
			JComboBox jComboBoxTiposPaginacionParametroNomi) {
		this.jComboBoxTiposPaginacionParametroNomi = jComboBoxTiposPaginacionParametroNomi;
	}
	
	public void setBorderResaltarTiposPaginacionParametroNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroNomi() {
		return this.jComboBoxTiposRelacionesParametroNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroNomi() {
		return this.jComboBoxTiposAccionesParametroNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroNomi(
			JComboBox jComboBoxTiposRelacionesParametroNomi) {
		this.jComboBoxTiposRelacionesParametroNomi = jComboBoxTiposRelacionesParametroNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroNomi(
			JComboBox jComboBoxTiposAccionesParametroNomi) {
		this.jComboBoxTiposAccionesParametroNomi = jComboBoxTiposAccionesParametroNomi;
	}
	
	public void setBorderResaltarTiposRelacionesParametroNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroNomi() {
	//	return jCheckBoxConGraficoDinamicoParametroNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroNomi) {
	//	this.jCheckBoxConGraficoDinamicoParametroNomi = jCheckBoxConGraficoDinamicoParametroNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroNomi .setBorder(borderResaltar);		
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
		this.parametronomiSessionBean=new ParametroNomiSessionBean();
		
		this.parametronomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametronomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametronomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroNomi,this.jTtoolBarParametroNomi,
							"nuevo","nuevo","Nuevo"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroNomi,this.jTtoolBarParametroNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroNomi,this.jTtoolBarParametroNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroNomi,this.jTtoolBarParametroNomi,
							"duplicar","duplicar","Duplicar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroNomi,this.jTtoolBarParametroNomi,
							"copiar","copiar","Copiar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroNomi,this.jTtoolBarParametroNomi,
							"ver_form","ver_form","Ver"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroNomi,this.jTtoolBarParametroNomi,
							"recargar","recargar","Recargar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroNomi,this.jTtoolBarParametroNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroNomi,this.jTtoolBarParametroNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroNomi,this.jTtoolBarParametroNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroNomi,this.jTtoolBarParametroNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroNomi,this.jTtoolBarParametroNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroNomi,this.jTtoolBarParametroNomi,
							"cerrar","cerrar","Salir"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroNomi;
			
				this.jButtonProcesarInformacionToolBarParametroNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroNomi;
				
		//protected JButton jButtonModificarToolBarParametroNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroNomi=new JMenuMe("General");
		this.jmenuArchivoParametroNomi=new JMenuMe("Archivo");
		this.jmenuAccionesParametroNomi=new JMenuMe("Acciones");
		this.jmenuDatosParametroNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroNomi.add(this.jMenuItemCerrarParametroNomi);
			
			this.jmenuAccionesParametroNomi.add(this.jMenuItemNuevoParametroNomi);
			this.jmenuAccionesParametroNomi.add(this.jMenuItemNuevoGuardarCambiosParametroNomi);
			this.jmenuAccionesParametroNomi.add(this.jMenuItemNuevoRelacionesParametroNomi);
			this.jmenuAccionesParametroNomi.add(this.jMenuItemGuardarCambiosTablaParametroNomi);		
			this.jmenuAccionesParametroNomi.add(this.jMenuItemDuplicarParametroNomi);		
			this.jmenuAccionesParametroNomi.add(this.jMenuItemCopiarParametroNomi);		
			this.jmenuAccionesParametroNomi.add(this.jMenuItemVerFormParametroNomi);		
			
			this.jmenuDatosParametroNomi.add(this.jMenuItemRecargarInformacionParametroNomi);				
			this.jmenuDatosParametroNomi.add(this.jMenuItemAnterioresParametroNomi);				
			this.jmenuDatosParametroNomi.add(this.jMenuItemSiguientesParametroNomi);				
			this.jmenuDatosParametroNomi.add(this.jMenuItemAbrirOrderByParametroNomi);				
			this.jmenuDatosParametroNomi.add(this.jMenuItemMostrarOcultarParametroNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroNomi.add(this.jMenuItemGuardarCambiosParametroNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroNomi.add(this.jmenuArchivoParametroNomi);		
			this.jmenuBarParametroNomi.add(this.jmenuAccionesParametroNomi);		
			this.jmenuBarParametroNomi.add(this.jmenuDatosParametroNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroNomi() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasParametroNomi=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroNomi.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroNomi.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroNomi.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroNomi,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroNomi = new ParametroNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Nomi DATOS");
			this.jInternalFrameDetalleFormParametroNomi = new ParametroNomiDetalleFormJInternalFrame(jDesktopPane,this.parametronomiSessionBean.getConGuardarRelaciones(),this.parametronomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroNomi = null;//new ParametroNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroNomi= new GridBagLayout();
		
		
		this.jTableDatosParametroNomi = new JTableMe();      
		
		String sToolTipParametroNomi="";
		sToolTipParametroNomi=ParametroNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroNomi+="(Nomina.ParametroNomi)";
		}
		
		if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroNomi.setToolTipText(sToolTipParametroNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroNomi);
		this.jTableDatosParametroNomi.setAutoCreateRowSorter(true);
		this.jTableDatosParametroNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroNomi.setRowSelectionAllowed(true);
		this.jTableDatosParametroNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroNomi = new JButtonMe();
		this.jButtonDuplicarParametroNomi = new JButtonMe();
		this.jButtonCopiarParametroNomi = new JButtonMe();
		this.jButtonVerFormParametroNomi = new JButtonMe();
		this.jButtonNuevoRelacionesParametroNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroNomi = new JButtonMe();
		this.jButtonCerrarParametroNomi = new JButtonMe();
		
		this.jScrollPanelDatosParametroNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Nomi";
		
		if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroNomi.setToolTipText("Acciones");
        this.jPanelAccionesParametroNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParametroNomi=new ReporteDinamicoJInternalFrame(ParametroNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroNomi=new ImportacionJInternalFrame(ParametroNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroNomi.setText("Orden");
		this.jButtonAbrirOrderByParametroNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroNomi,false,this);
			
			//this.cargarOrderByParametroNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroNomi,true,this);
			
			//this.cargarOrderByParametroNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroNomi.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosParametroNomi.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosParametroNomi.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosParametroNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroNomi.setText("Nuevo");
		this.jButtonDuplicarParametroNomi.setText("Duplicar");
		this.jButtonCopiarParametroNomi.setText("Copiar");
		this.jButtonVerFormParametroNomi.setText("Ver");
		this.jButtonNuevoRelacionesParametroNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroNomi.setText("Guardar");
		this.jButtonCerrarParametroNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroNomi,"nuevo_button","Nuevo",this.parametronomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroNomi,"duplicar_button","Duplicar",this.parametronomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroNomi,"copiar_button","Copiar",this.parametronomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroNomi,"ver_form","Ver",this.parametronomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroNomi,"nuevorelaciones_button","Nuevo Rel",this.parametronomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroNomi,"guardarcambiostabla_button","Guardar",this.parametronomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroNomi,"cerrar_button","Salir",this.parametronomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroNomi.setToolTipText("Nuevo"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroNomi.setToolTipText("Duplicar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroNomi.setToolTipText("Copiar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroNomi.setToolTipText("Ver"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroNomi.setToolTipText("Nuevo Rel"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroNomi.setToolTipText("Guardar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroNomi.setToolTipText("Salir"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroNomi";
		inputMap = this.jButtonNuevoParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroNomi";
		inputMap = this.jButtonDuplicarParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroNomi"));
		
		//COPIAR
		sMapKey = "CopiarParametroNomi";
		inputMap = this.jButtonCopiarParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroNomi"));
		
		//VEr FORM
		sMapKey = "VerFormParametroNomi";
		inputMap = this.jButtonVerFormParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroNomi";
		inputMap = this.jButtonNuevoRelacionesParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroNomi";
		inputMap = this.jButtonModificarParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroNomi";
		inputMap = this.jButtonCerrarParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroNomi";
		inputMap = this.jButtonGuardarCambiosTablaParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroNomi.setName("jPanelParametrosReportesParametroNomi"); 
		
		this.jPanelParametrosReportesAccionesParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroNomi.setName("jPanelParametrosReportesAccionesParametroNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroNomi = new JButtonMe();
		this.jButtonRecargarInformacionParametroNomi.setText("Recargar");
		this.jButtonRecargarInformacionParametroNomi.setToolTipText("Recargar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroNomi = new JButtonMe();
		this.jButtonProcesarInformacionParametroNomi.setText("Procesar");
		this.jButtonProcesarInformacionParametroNomi.setToolTipText("Procesar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroNomi.setVisible(false);
			
		this.jButtonProcesarInformacionParametroNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroNomi.setText("TIPO");       
		this.jComboBoxTiposReportesParametroNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroNomi.setText("Accion");
		this.jComboBoxTiposRelacionesParametroNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroNomi.setText("Accion");
		this.jComboBoxTiposAccionesParametroNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroNomi = new JLabelMe();
		
		this.jLabelAccionesParametroNomi.setText("Acciones");		
		this.jLabelAccionesParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroNomi = new JButtonMe();
		//this.jButtonAnterioresParametroNomi.setText("<<");
        this.jButtonAnterioresParametroNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroNomi = new JButtonMe();
		//this.jButtonSiguientesParametroNomi.setText(">>");
        this.jButtonSiguientesParametroNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroNomi,"nuevoguardarcambios_button","Nue",this.parametronomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroNomi";
		inputMap = this.jButtonNuevoGuardarCambiosParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroNomi";
		inputMap = this.jButtonRecargarInformacionParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroNomi";
		inputMap = this.jButtonSiguientesParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroNomi";
		inputMap = this.jButtonAnterioresParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroNomi.setMinimumSize(new Dimension(this.getWidth(),ParametroNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroNomi.setMaximumSize(new Dimension(this.getWidth(),ParametroNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroNomi.setPreferredSize(new Dimension(this.getWidth(),ParametroNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroNomi = new GridBagLayout();

			this.jPanelPaginacionParametroNomi.setLayout(gridaBagLayoutPaginacionParametroNomi);						
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.gridy = 0;
			this.gridBagConstraintsParametroNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroNomi.add(this.jButtonAnterioresParametroNomi, this.gridBagConstraintsParametroNomi);
					
						
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroNomi.gridy = 0;
			
			this.jPanelPaginacionParametroNomi.add(this.jButtonNuevoGuardarCambiosParametroNomi, this.gridBagConstraintsParametroNomi);
						
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroNomi.gridy = 0;
			this.jPanelPaginacionParametroNomi.add(this.jButtonSiguientesParametroNomi, this.gridBagConstraintsParametroNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.gridy = 1;
			this.gridBagConstraintsParametroNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroNomi.add(this.jButtonNuevoParametroNomi, this.gridBagConstraintsParametroNomi);
						
			
			
			if(!this.parametronomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroNomi = new GridBagConstraints();
				this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroNomi.gridy = 1;
				this.gridBagConstraintsParametroNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroNomi.add(this.jButtonGuardarCambiosTablaParametroNomi, this.gridBagConstraintsParametroNomi);
			}
			
			
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.gridy = 1;
			this.gridBagConstraintsParametroNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroNomi.add(this.jButtonDuplicarParametroNomi, this.gridBagConstraintsParametroNomi);
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.gridy = 1;
			this.gridBagConstraintsParametroNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroNomi.add(this.jButtonCopiarParametroNomi, this.gridBagConstraintsParametroNomi);
		
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.gridy = 1;
			this.gridBagConstraintsParametroNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroNomi.add(this.jButtonVerFormParametroNomi, this.gridBagConstraintsParametroNomi);
		
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.gridy = 1;
			this.gridBagConstraintsParametroNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroNomi.add(this.jButtonCerrarParametroNomi, this.gridBagConstraintsParametroNomi);
		
		
		
		this.jButtonRecargarInformacionParametroNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroNomi.setLayout(gridaBagParametrosReportesParametroNomi);
			this.jPanelParametrosReportesAccionesParametroNomi.setLayout(gridaBagParametrosReportesAccionesParametroNomi);
			
			
			this.jPanelParametrosAuxiliar1ParametroNomi.setLayout(gridaBagParametrosAuxiliar1ParametroNomi);
			this.jPanelParametrosAuxiliar2ParametroNomi.setLayout(gridaBagParametrosAuxiliar2ParametroNomi);
			this.jPanelParametrosAuxiliar3ParametroNomi.setLayout(gridaBagParametrosAuxiliar3ParametroNomi);
			this.jPanelParametrosAuxiliar4ParametroNomi.setLayout(gridaBagParametrosAuxiliar4ParametroNomi);
			//this.jPanelParametrosAuxiliar5ParametroNomi.setLayout(gridaBagParametrosAuxiliar2ParametroNomi);			
			
			
			
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroNomi.add(this.jButtonRecargarInformacionParametroNomi, this.gridBagConstraintsParametroNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroNomi.add(this.jComboBoxTiposPaginacionParametroNomi, this.gridBagConstraintsParametroNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroNomi.add(this.jCheckBoxConAltoMaximoTablaParametroNomi, this.gridBagConstraintsParametroNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroNomi.add(this.jComboBoxTiposArchivosReportesParametroNomi, this.gridBagConstraintsParametroNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroNomi.add(this.jPanelParametrosAuxiliar1ParametroNomi, this.gridBagConstraintsParametroNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroNomi.add(this.jComboBoxTiposReportesParametroNomi, this.gridBagConstraintsParametroNomi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroNomi.add(this.jPanelParametrosAuxiliar4ParametroNomi, this.gridBagConstraintsParametroNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroNomi.add(this.jComboBoxTiposReportesParametroNomi, this.gridBagConstraintsParametroNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroNomi.add(this.jCheckBoxGenerarReporteParametroNomi, this.gridBagConstraintsParametroNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroNomi.add(this.jPanelParametrosAuxiliar2ParametroNomi, this.gridBagConstraintsParametroNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroNomi.add(this.jLabelAccionesParametroNomi, this.gridBagConstraintsParametroNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroNomi = new GridBagConstraints();
				this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroNomi.add(this.jButtonAbrirOrderByParametroNomi, this.gridBagConstraintsParametroNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroNomi.add(this.jComboBoxTiposSeleccionarParametroNomi, this.gridBagConstraintsParametroNomi);			
			
			
			/*
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroNomi.add(this.jCheckBoxSeleccionarTodosParametroNomi, this.gridBagConstraintsParametroNomi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroNomi.add(this.jCheckBoxSeleccionarTodosParametroNomi, this.gridBagConstraintsParametroNomi);															
				
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroNomi.add(this.jCheckBoxSeleccionadosParametroNomi, this.gridBagConstraintsParametroNomi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroNomi.add(this.jPanelParametrosAuxiliar3ParametroNomi, this.gridBagConstraintsParametroNomi);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroNomi.add(this.jComboBoxTiposAccionesParametroNomi, this.gridBagConstraintsParametroNomi);
	
				
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroNomi.add(this.jTextFieldValorCampoGeneralParametroNomi, this.gridBagConstraintsParametroNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroNomi = new GridBagLayout();

			this.jScrollPanelDatosParametroNomi.setLayout(gridaBagLayoutDatosParametroNomi);
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.gridy = 0;
			this.gridBagConstraintsParametroNomi.gridx = 0;
			
			this.jScrollPanelDatosParametroNomi.add(this.jTableDatosParametroNomi, this.gridBagConstraintsParametroNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroNomi.setViewportView(this.jTableDatosParametroNomi);
		this.jTableDatosParametroNomi.setFillsViewportHeight(true);
		this.jTableDatosParametroNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroNomi= new GridBagLayout();
		this.jPanelAccionesParametroNomi.setLayout(gridaBagLayoutAccionesParametroNomi);
		
		
		/*	
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroNomi.gridy = 0;
		this.gridBagConstraintsParametroNomi.gridx = 0;
			
		this.jPanelAccionesParametroNomi.add(this.jButtonNuevoParametroNomi, this.gridBagConstraintsParametroNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametronomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();						
			this.gridBagConstraintsParametroNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroNomi.gridx = 0;		
			//this.gridBagConstraintsParametroNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroNomi, this.gridBagConstraintsParametroNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroNomi.gridx = 0;		
		//this.gridBagConstraintsParametroNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroNomi, this.gridBagConstraintsParametroNomi);								
		
		
		/*
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroNomi, this.gridBagConstraintsParametroNomi);
		*/		
		
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroNomi.gridx =0;
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroNomi, this.gridBagConstraintsParametroNomi);
				
		
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroNomi, this.gridBagConstraintsParametroNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroNomi.setLayout(gridaBagLayoutBusquedasParametrosParametroNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroNomi, this.gridBagConstraintsParametroNomi);
			
			
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroNomi, this.gridBagConstraintsParametroNomi);
		
			
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroNomi, this.gridBagConstraintsParametroNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroNomi.setName("jPanelReporteDinamicoParametroNomi"); 
		
		this.jPanelReporteDinamicoParametroNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroNomi.setLayout(gridaBagLayoutReporteDinamicoParametroNomi);
		
		
		this.jInternalFrameReporteDinamicoParametroNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Nomis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroNomi.add(this.jLabelColumnasSelectReporteParametroNomi, this.gridBagConstraintsParametroNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroNomi=new JScrollPane(this.jListColumnasSelectReporteParametroNomi);
			
			this.jScrollColumnasSelectReporteParametroNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroNomi.add(this.jListColumnasSelectReporteParametroNomi, this.gridBagConstraintsParametroNomi);
		this.jPanelReporteDinamicoParametroNomi.add(this.jScrollColumnasSelectReporteParametroNomi, this.gridBagConstraintsParametroNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroNomi=new JScrollPane(this.jListRelacionesSelectReporteParametroNomi);
			
			this.jScrollRelacionesSelectReporteParametroNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroNomi.add(this.jLabelGenerarExcelReporteDinamicoParametroNomi, this.gridBagConstraintsParametroNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroNomi.setToolTipText("Generar EXCEL"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		//this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroNomi.add(this.jButtonGenerarExcelReporteDinamicoParametroNomi, this.gridBagConstraintsParametroNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroNomi.add(this.jComboBoxTiposReportesDinamicoParametroNomi, this.gridBagConstraintsParametroNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroNomi.add(this.jLabelTiposArchivoReporteDinamicoParametroNomi, this.gridBagConstraintsParametroNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroNomi.add(this.jComboBoxTiposArchivosReportesDinamicoParametroNomi, this.gridBagConstraintsParametroNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroNomi.setToolTipText("Generar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroNomi.add(this.jButtonGenerarReporteDinamicoParametroNomi, this.gridBagConstraintsParametroNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroNomi.setToolTipText("Cancelar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroNomi.add(this.jButtonCerrarReporteDinamicoParametroNomi, this.gridBagConstraintsParametroNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroNomi= new JScrollPane(jPanelReporteDinamicoParametroNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Nomis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroNomi);
		this.jInternalFrameReporteDinamicoParametroNomi.getContentPane().add(this.jScrollPanelReporteDinamicoParametroNomi, this.gridBagConstraintsParametroNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroNomi.setName("jPanelImportacionParametroNomi"); 
		
		this.jPanelImportacionParametroNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroNomi.setLayout(gridaBagLayoutImportacionParametroNomi);
		
		
		this.jInternalFrameImportacionParametroNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroNomi.setResizable(true);
	    this.jInternalFrameImportacionParametroNomi.setClosable(true);
	    this.jInternalFrameImportacionParametroNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroNomi.setResizable(true);
	    this.jInternalFrameImportacionParametroNomi.setClosable(true);
	    this.jInternalFrameImportacionParametroNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Nomis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroNomi = new JLabelMe();

		this.jLabelArchivoImportacionParametroNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroNomi.add(this.jLabelArchivoImportacionParametroNomi, this.gridBagConstraintsParametroNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroNomi = new JFileChooser();		
		this.jFileChooserImportacionParametroNomi.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroNomi = new JButtonMe();
		this.jButtonAbrirImportacionParametroNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroNomi.setToolTipText("Generar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroNomi.add(this.jButtonAbrirImportacionParametroNomi, this.gridBagConstraintsParametroNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroNomi.add(this.jLabelPathArchivoImportacionParametroNomi, this.gridBagConstraintsParametroNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroNomi.add(this.jTextFieldPathArchivoImportacionParametroNomi, this.gridBagConstraintsParametroNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroNomi = new JButtonMe();
		this.jButtonGenerarImportacionParametroNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroNomi.setToolTipText("Generar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroNomi.add(this.jButtonGenerarImportacionParametroNomi, this.gridBagConstraintsParametroNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroNomi = new JButtonMe();
		this.jButtonCerrarImportacionParametroNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroNomi.setToolTipText("Cancelar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroNomi.add(this.jButtonCerrarImportacionParametroNomi, this.gridBagConstraintsParametroNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroNomi= new JScrollPane(jPanelImportacionParametroNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroNomi = new GridBagConstraints();
		this.gridBagConstraintsParametroNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroNomi);
		this.jInternalFrameImportacionParametroNomi.getContentPane().add(this.jScrollPanelImportacionParametroNomi, this.gridBagConstraintsParametroNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroNomi = new JButtonMe();
			this.jButtonAbrirOrderByParametroNomi.setText("Orden");
			this.jButtonAbrirOrderByParametroNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroNomi";
			inputMap = this.jButtonAbrirOrderByParametroNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroNomi.setName("jPanelOrderByParametroNomi"); 
			
			this.jPanelOrderByParametroNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroNomi.setLayout(gridaBagLayoutOrderByParametroNomi);
			
			
			this.jTableDatosParametroNomiOrderBy = new JTableMe();        
			this.jTableDatosParametroNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroNomiOrderBy.setViewportView(this.jTableDatosParametroNomiOrderBy);
			this.jTableDatosParametroNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroNomi.setTitle("Orden");
			this.jInternalFrameOrderByParametroNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroNomi.setResizable(true);
			this.jInternalFrameOrderByParametroNomi.setClosable(true);
			this.jInternalFrameOrderByParametroNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Nomis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroNomi.ipady =150;
				
			this.jPanelOrderByParametroNomi.add(jScrollPanelDatosParametroNomiOrderBy, this.gridBagConstraintsParametroNomi);//this.jTableDatosParametroNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroNomi = new JButtonMe();
			this.jButtonCerrarOrderByParametroNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroNomi.setToolTipText("Cancelar"+" "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroNomi.add(this.jButtonCerrarOrderByParametroNomi, this.gridBagConstraintsParametroNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroNomi= new JScrollPane(jPanelOrderByParametroNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroNomi = new GridBagConstraints();
			this.gridBagConstraintsParametroNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroNomi);
			
			this.jInternalFrameOrderByParametroNomi.getContentPane().add(this.jScrollPanelOrderByParametroNomi, this.gridBagConstraintsParametroNomi);			
		
		} else {
			this.jButtonAbrirOrderByParametroNomi = new JButtonMe();
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
			&& this.parametronomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroNomi.getRowHeight();//ParametroNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroNomi.isSelected()) {
					iHeightTable=ParametroNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroNomi.isSelected()) {
					iHeightTable=ParametroNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroNomi!=null && this.jInternalFrameOrderByParametroNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametronomiLogic.getParametroNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametronomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroNomi> TraerParametroNomiBeans(List<ParametroNomi> parametronomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroNomi parametronomi:parametronomis) {
					
				if(!(ParametroNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametronomi.setsDetalleGeneralEntityReporte(ParametroNomiConstantesFunciones.getParametroNomiDescripcion(parametronomi));
										
						
					
						
					
				} else  {
							
					//parametronomi.setsDetalleGeneralEntityReporte(parametronomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametronomibeans.add(parametronomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametronomis;
    }
	//PARA REPORTES FIN
}
