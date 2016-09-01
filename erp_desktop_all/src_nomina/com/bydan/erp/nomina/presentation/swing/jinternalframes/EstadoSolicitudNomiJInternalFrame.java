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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.nomina.util.EstadoSolicitudNomiConstantesFunciones;

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
public class EstadoSolicitudNomiJInternalFrame extends EstadoSolicitudNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEstadoSolicitudNomi;
	
	protected JMenuBar jmenuBarEstadoSolicitudNomi;
	
	protected JMenu jmenuEstadoSolicitudNomi;
	protected JMenu jmenuDatosEstadoSolicitudNomi;
	protected JMenu jmenuArchivoEstadoSolicitudNomi;
	protected JMenu jmenuAccionesEstadoSolicitudNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEstadoSolicitudNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoSolicitudNomi;	
	protected GridBagConstraints gridBagConstraintsEstadoSolicitudNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EstadoSolicitudNomiDetalleFormJInternalFrame jInternalFrameDetalleFormEstadoSolicitudNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEstadoSolicitudNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEstadoSolicitudNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoSolicitudNomiSessionBean estadosolicitudnomiSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<EstadoSolicitudNomi> estadosolicitudnomis;		
	public List<EstadoSolicitudNomi> estadosolicitudnomisEliminados;	
	public List<EstadoSolicitudNomi> estadosolicitudnomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEstadoSolicitudNomi;		
	protected JButton jButtonAbrirOrderByEstadoSolicitudNomi;
	
	
	//protected JPanel jPanelOrderByEstadoSolicitudNomi;
	//public JScrollPane jScrollPanelOrderByEstadoSolicitudNomi;	
	//protected JButton jButtonCerrarOrderByEstadoSolicitudNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EstadoSolicitudNomiLogic estadosolicitudnomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEstadoSolicitudNomi;
	public JScrollPane jScrollPanelDatosEdicionEstadoSolicitudNomi;
	public JScrollPane jScrollPanelDatosGeneralEstadoSolicitudNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosEstadoSolicitudNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEstadoSolicitudNomi;
	//public JScrollPane jScrollPanelImportacionEstadoSolicitudNomi;
	
	
	
	protected JPanel jPanelAccionesEstadoSolicitudNomi;
	
    protected JPanel jPanelPaginacionEstadoSolicitudNomi;
    protected JPanel jPanelParametrosReportesEstadoSolicitudNomi;
	protected JPanel jPanelParametrosReportesAccionesEstadoSolicitudNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EstadoSolicitudNomi;
	protected JPanel jPanelParametrosAuxiliar2EstadoSolicitudNomi;
	protected JPanel jPanelParametrosAuxiliar3EstadoSolicitudNomi;
	protected JPanel jPanelParametrosAuxiliar4EstadoSolicitudNomi;
	//protected JPanel jPanelParametrosAuxiliar5EstadoSolicitudNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoEstadoSolicitudNomi;
	//protected JPanel jPanelImportacionEstadoSolicitudNomi;
	
	
	public JTable jTableDatosEstadoSolicitudNomi;
	
	
	
	//public JTable jTableDatosEstadoSolicitudNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEstadoSolicitudNomi;
	protected JButton jButtonDuplicarEstadoSolicitudNomi;
	protected JButton jButtonCopiarEstadoSolicitudNomi;
	protected JButton jButtonVerFormEstadoSolicitudNomi;
	protected JButton jButtonNuevoRelacionesEstadoSolicitudNomi;
	protected JButton jButtonModificarEstadoSolicitudNomi;
	
    protected JButton jButtonGuardarCambiosTablaEstadoSolicitudNomi;
	protected JButton jButtonCerrarEstadoSolicitudNomi;
	
	
	protected JButton jButtonRecargarInformacionEstadoSolicitudNomi;
	protected JButton jButtonProcesarInformacionEstadoSolicitudNomi;
	
	
	protected JButton jButtonAnterioresEstadoSolicitudNomi;
	protected JButton jButtonSiguientesEstadoSolicitudNomi;
	protected JButton jButtonNuevoGuardarCambiosEstadoSolicitudNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEstadoSolicitudNomi;
	//protected JButton jButtonCerrarReporteDinamicoEstadoSolicitudNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoEstadoSolicitudNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionEstadoSolicitudNomi;
	//protected JButton jButtonGenerarImportacionEstadoSolicitudNomi;
	//protected JButton jButtonCerrarImportacionEstadoSolicitudNomi;
	//protected JFileChooser jFileChooserImportacionEstadoSolicitudNomi;
	//protected File fileImportacionEstadoSolicitudNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoSolicitudNomi;
	protected JButton jButtonDuplicarToolBarEstadoSolicitudNomi;
	protected JButton jButtonNuevoRelacionesToolBarEstadoSolicitudNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarEstadoSolicitudNomi;
	protected JButton jButtonCopiarToolBarEstadoSolicitudNomi;
	protected JButton jButtonVerFormToolBarEstadoSolicitudNomi;
	public JButton jButtonGuardarCambiosTablaToolBarEstadoSolicitudNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoSolicitudNomi;
	protected JButton jButtonCerrarToolBarEstadoSolicitudNomi;
	
	protected JButton jButtonRecargarInformacionToolBarEstadoSolicitudNomi;
	protected JButton jButtonProcesarInformacionToolBarEstadoSolicitudNomi;
	protected JButton jButtonAnterioresToolBarEstadoSolicitudNomi;
	protected JButton jButtonSiguientesToolBarEstadoSolicitudNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarEstadoSolicitudNomi;
	protected JButton jButtonAbrirOrderByToolBarEstadoSolicitudNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoSolicitudNomi;
	protected JMenuItem jMenuItemDuplicarEstadoSolicitudNomi;
	protected JMenuItem jMenuItemNuevoRelacionesEstadoSolicitudNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEstadoSolicitudNomi;
	protected JMenuItem jMenuItemCopiarEstadoSolicitudNomi;
	protected JMenuItem jMenuItemVerFormEstadoSolicitudNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoSolicitudNomi;
	protected JMenuItem jMenuItemCerrarEstadoSolicitudNomi;
	protected JMenuItem jMenuItemDetalleCerrarEstadoSolicitudNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEstadoSolicitudNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoSolicitudNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionEstadoSolicitudNomi;
	protected JMenuItem jMenuItemProcesarInformacionEstadoSolicitudNomi;
	protected JMenuItem jMenuItemAnterioresEstadoSolicitudNomi;
	protected JMenuItem jMenuItemSiguientesEstadoSolicitudNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoSolicitudNomi;
	protected JMenuItem jMenuItemAbrirOrderByEstadoSolicitudNomi;
	protected JMenuItem jMenuItemMostrarOcultarEstadoSolicitudNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoSolicitudNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEstadoSolicitudNomi;
	protected JCheckBox jCheckBoxSeleccionadosEstadoSolicitudNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEstadoSolicitudNomi;
	protected JCheckBox jCheckBoxConGraficoReporteEstadoSolicitudNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEstadoSolicitudNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEstadoSolicitudNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoSolicitudNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEstadoSolicitudNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEstadoSolicitudNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEstadoSolicitudNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoSolicitudNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoSolicitudNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEstadoSolicitudNomi;
	protected JTextField jTextFieldValorCampoGeneralEstadoSolicitudNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEstadoSolicitudNomi;
	//public JList<Reporte> jListColumnasSelectReporteEstadoSolicitudNomi;
	//public JScrollPane jScrollColumnasSelectReporteEstadoSolicitudNomi;
	
	//public JLabel jLabelRelacionesSelectReporteEstadoSolicitudNomi;
	//public JList<Reporte> jListRelacionesSelectReporteEstadoSolicitudNomi;
	//public JScrollPane jScrollRelacionesSelectReporteEstadoSolicitudNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEstadoSolicitudNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEstadoSolicitudNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEstadoSolicitudNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoEstadoSolicitudNomi;
	
		
	//public JLabel jLabelArchivoImportacionEstadoSolicitudNomi;	
	//public JLabel jLabelPathArchivoImportacionEstadoSolicitudNomi;
	//protected JTextField jTextFieldPathArchivoImportacionEstadoSolicitudNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEstadoSolicitudNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEstadoSolicitudNomi;
	
	//public JLabel jLabelColumnaCategoriaValorEstadoSolicitudNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEstadoSolicitudNomi;
	
	//public JLabel jLabelColumnasValoresGraficoEstadoSolicitudNomi;
	//public JList<Reporte> jListColumnasValoresGraficoEstadoSolicitudNomi;
	//public JScrollPane jScrollColumnasValoresGraficoEstadoSolicitudNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEstadoSolicitudNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEstadoSolicitudNomi;	
	
	
	
	
	
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
	public EstadoSolicitudNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EstadoSolicitudNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoSolicitudNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoSolicitudNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoSolicitudNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoSolicitudNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoSolicitudNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoSolicitudNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEstadoSolicitudNomi)	{
		this.jButtonRecargarInformacionEstadoSolicitudNomi = jButtonRecargarInformacionEstadoSolicitudNomi;
	}
	
	public JButton getjButtonProcesarInformacionEstadoSolicitudNomi() {
		return this.jButtonProcesarInformacionEstadoSolicitudNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoSolicitudNomi)	{
		this.jButtonProcesarInformacionEstadoSolicitudNomi = jButtonProcesarInformacionEstadoSolicitudNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionEstadoSolicitudNomi() {
		return this.jButtonRecargarInformacionEstadoSolicitudNomi;
	}
	
	
	public List<EstadoSolicitudNomi> getestadosolicitudnomis() {
		return this.estadosolicitudnomis;
	}

	public void setestadosolicitudnomis(List<EstadoSolicitudNomi> estadosolicitudnomis) {
		this.estadosolicitudnomis = estadosolicitudnomis;
	}
	
	public List<EstadoSolicitudNomi> getestadosolicitudnomisAux() {
		return this.estadosolicitudnomisAux;
	}

	public void setestadosolicitudnomisAux(List<EstadoSolicitudNomi> estadosolicitudnomisAux) {
		this.estadosolicitudnomisAux = estadosolicitudnomisAux;
	}
	
	public List<EstadoSolicitudNomi> getestadosolicitudnomisEliminados() {
		return this.estadosolicitudnomisEliminados;
	}

	public void setEstadoSolicitudNomisEliminados(List<EstadoSolicitudNomi> estadosolicitudnomisEliminados) {
		this.estadosolicitudnomisEliminados = estadosolicitudnomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEstadoSolicitudNomi() {
		return jComboBoxTiposSeleccionarEstadoSolicitudNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEstadoSolicitudNomi(
			JComboBox jComboBoxTiposSeleccionarEstadoSolicitudNomi) {
		this.jComboBoxTiposSeleccionarEstadoSolicitudNomi = jComboBoxTiposSeleccionarEstadoSolicitudNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarEstadoSolicitudNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEstadoSolicitudNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEstadoSolicitudNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEstadoSolicitudNomi() {
		return jTextFieldValorCampoGeneralEstadoSolicitudNomi;
	}

	public void setjTextFieldValorCampoGeneralEstadoSolicitudNomi(
			JTextField jTextFieldValorCampoGeneralEstadoSolicitudNomi) {
		this.jTextFieldValorCampoGeneralEstadoSolicitudNomi = jTextFieldValorCampoGeneralEstadoSolicitudNomi;
	}

	public void setBorderResaltarValorCampoGeneralEstadoSolicitudNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoSolicitudNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEstadoSolicitudNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEstadoSolicitudNomi() {
		return this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi;
	}

	public void setjCheckBoxSeleccionarTodosEstadoSolicitudNomi(
			JCheckBox jCheckBoxSeleccionarTodosEstadoSolicitudNomi) {
		this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi = jCheckBoxSeleccionarTodosEstadoSolicitudNomi;
	}

	public void setBorderResaltarSeleccionarTodosEstadoSolicitudNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoSolicitudNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEstadoSolicitudNomi() {
		return this.jCheckBoxSeleccionadosEstadoSolicitudNomi;
	}

	public void setjCheckBoxSeleccionadosEstadoSolicitudNomi(
			JCheckBox jCheckBoxSeleccionadosEstadoSolicitudNomi) {
		this.jCheckBoxSeleccionadosEstadoSolicitudNomi = jCheckBoxSeleccionadosEstadoSolicitudNomi;
	}
	
	public void setBorderResaltarSeleccionadosEstadoSolicitudNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoSolicitudNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEstadoSolicitudNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEstadoSolicitudNomi() {
		return this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEstadoSolicitudNomi(
			JComboBox jComboBoxTiposArchivosReportesEstadoSolicitudNomi) {
		this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi = jComboBoxTiposArchivosReportesEstadoSolicitudNomi;
	}

	public void setBorderResaltarTiposArchivosReportesEstadoSolicitudNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoSolicitudNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEstadoSolicitudNomi() {
		return this.jComboBoxTiposReportesEstadoSolicitudNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEstadoSolicitudNomi(
			JComboBox jComboBoxTiposReportesEstadoSolicitudNomi) {
		this.jComboBoxTiposReportesEstadoSolicitudNomi = jComboBoxTiposReportesEstadoSolicitudNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEstadoSolicitudNomi() {
	//	return jComboBoxTiposReportesDinamicoEstadoSolicitudNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEstadoSolicitudNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoEstadoSolicitudNomi) {
	//	this.jComboBoxTiposReportesDinamicoEstadoSolicitudNomi = jComboBoxTiposReportesDinamicoEstadoSolicitudNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEstadoSolicitudNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoEstadoSolicitudNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEstadoSolicitudNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEstadoSolicitudNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEstadoSolicitudNomi = jComboBoxTiposArchivosReportesDinamicoEstadoSolicitudNomi;
	//}
	
	public void setBorderResaltarTiposReportesEstadoSolicitudNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoSolicitudNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEstadoSolicitudNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEstadoSolicitudNomi() {
		return this.jComboBoxTiposGraficosReportesEstadoSolicitudNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEstadoSolicitudNomi(
			JComboBox jComboBoxTiposGraficosReportesEstadoSolicitudNomi) {
		this.jComboBoxTiposGraficosReportesEstadoSolicitudNomi = jComboBoxTiposGraficosReportesEstadoSolicitudNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesEstadoSolicitudNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoSolicitudNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEstadoSolicitudNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEstadoSolicitudNomi() {
		return this.jComboBoxTiposPaginacionEstadoSolicitudNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEstadoSolicitudNomi(
			JComboBox jComboBoxTiposPaginacionEstadoSolicitudNomi) {
		this.jComboBoxTiposPaginacionEstadoSolicitudNomi = jComboBoxTiposPaginacionEstadoSolicitudNomi;
	}
	
	public void setBorderResaltarTiposPaginacionEstadoSolicitudNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoSolicitudNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEstadoSolicitudNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEstadoSolicitudNomi() {
		return this.jComboBoxTiposRelacionesEstadoSolicitudNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoSolicitudNomi() {
		return this.jComboBoxTiposAccionesEstadoSolicitudNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoSolicitudNomi(
			JComboBox jComboBoxTiposRelacionesEstadoSolicitudNomi) {
		this.jComboBoxTiposRelacionesEstadoSolicitudNomi = jComboBoxTiposRelacionesEstadoSolicitudNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoSolicitudNomi(
			JComboBox jComboBoxTiposAccionesEstadoSolicitudNomi) {
		this.jComboBoxTiposAccionesEstadoSolicitudNomi = jComboBoxTiposAccionesEstadoSolicitudNomi;
	}
	
	public void setBorderResaltarTiposRelacionesEstadoSolicitudNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoSolicitudNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEstadoSolicitudNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEstadoSolicitudNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEstadoSolicitudNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEstadoSolicitudNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEstadoSolicitudNomi() {
	//	return jCheckBoxConGraficoDinamicoEstadoSolicitudNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoEstadoSolicitudNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoEstadoSolicitudNomi) {
	//	this.jCheckBoxConGraficoDinamicoEstadoSolicitudNomi = jCheckBoxConGraficoDinamicoEstadoSolicitudNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEstadoSolicitudNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEstadoSolicitudNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEstadoSolicitudNomi .setBorder(borderResaltar);		
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
		this.estadosolicitudnomiSessionBean=new EstadoSolicitudNomiSessionBean();
		
		this.estadosolicitudnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadosolicitudnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EstadoSolicitudNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EstadoSolicitudNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoSolicitudNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoSolicitudNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoSolicitudNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Solicitud MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
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
		
		EstadoSolicitudNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EstadoSolicitudNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEstadoSolicitudNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEstadoSolicitudNomi,this.jTtoolBarEstadoSolicitudNomi,
							"nuevo","nuevo","Nuevo"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEstadoSolicitudNomi,this.jTtoolBarEstadoSolicitudNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEstadoSolicitudNomi,this.jTtoolBarEstadoSolicitudNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEstadoSolicitudNomi,this.jTtoolBarEstadoSolicitudNomi,
							"duplicar","duplicar","Duplicar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEstadoSolicitudNomi,this.jTtoolBarEstadoSolicitudNomi,
							"copiar","copiar","Copiar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEstadoSolicitudNomi,this.jTtoolBarEstadoSolicitudNomi,
							"ver_form","ver_form","Ver"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoSolicitudNomi,this.jTtoolBarEstadoSolicitudNomi,
							"recargar","recargar","Recargar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoSolicitudNomi,this.jTtoolBarEstadoSolicitudNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEstadoSolicitudNomi,this.jTtoolBarEstadoSolicitudNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEstadoSolicitudNomi,this.jTtoolBarEstadoSolicitudNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEstadoSolicitudNomi,this.jTtoolBarEstadoSolicitudNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEstadoSolicitudNomi,this.jTtoolBarEstadoSolicitudNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEstadoSolicitudNomi,this.jTtoolBarEstadoSolicitudNomi,
							"cerrar","cerrar","Salir"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEstadoSolicitudNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEstadoSolicitudNomi;
			
				this.jButtonProcesarInformacionToolBarEstadoSolicitudNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEstadoSolicitudNomi;
				
		//protected JButton jButtonModificarToolBarEstadoSolicitudNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEstadoSolicitudNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEstadoSolicitudNomi=new JMenuMe("General");
		this.jmenuArchivoEstadoSolicitudNomi=new JMenuMe("Archivo");
		this.jmenuAccionesEstadoSolicitudNomi=new JMenuMe("Acciones");
		this.jmenuDatosEstadoSolicitudNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoSolicitudNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoSolicitudNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoSolicitudNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEstadoSolicitudNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEstadoSolicitudNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEstadoSolicitudNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEstadoSolicitudNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEstadoSolicitudNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEstadoSolicitudNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEstadoSolicitudNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoSolicitudNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoSolicitudNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEstadoSolicitudNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEstadoSolicitudNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEstadoSolicitudNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEstadoSolicitudNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEstadoSolicitudNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEstadoSolicitudNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEstadoSolicitudNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEstadoSolicitudNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEstadoSolicitudNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoSolicitudNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoSolicitudNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoSolicitudNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEstadoSolicitudNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEstadoSolicitudNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEstadoSolicitudNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEstadoSolicitudNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEstadoSolicitudNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEstadoSolicitudNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEstadoSolicitudNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEstadoSolicitudNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEstadoSolicitudNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEstadoSolicitudNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEstadoSolicitudNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEstadoSolicitudNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEstadoSolicitudNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEstadoSolicitudNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEstadoSolicitudNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoSolicitudNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoSolicitudNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoSolicitudNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEstadoSolicitudNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEstadoSolicitudNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEstadoSolicitudNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoSolicitudNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoSolicitudNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoSolicitudNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEstadoSolicitudNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEstadoSolicitudNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEstadoSolicitudNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEstadoSolicitudNomi.add(this.jMenuItemCerrarEstadoSolicitudNomi);
			
			this.jmenuAccionesEstadoSolicitudNomi.add(this.jMenuItemNuevoEstadoSolicitudNomi);
			this.jmenuAccionesEstadoSolicitudNomi.add(this.jMenuItemNuevoGuardarCambiosEstadoSolicitudNomi);
			this.jmenuAccionesEstadoSolicitudNomi.add(this.jMenuItemNuevoRelacionesEstadoSolicitudNomi);
			this.jmenuAccionesEstadoSolicitudNomi.add(this.jMenuItemGuardarCambiosTablaEstadoSolicitudNomi);		
			this.jmenuAccionesEstadoSolicitudNomi.add(this.jMenuItemDuplicarEstadoSolicitudNomi);		
			this.jmenuAccionesEstadoSolicitudNomi.add(this.jMenuItemCopiarEstadoSolicitudNomi);		
			this.jmenuAccionesEstadoSolicitudNomi.add(this.jMenuItemVerFormEstadoSolicitudNomi);		
			
			this.jmenuDatosEstadoSolicitudNomi.add(this.jMenuItemRecargarInformacionEstadoSolicitudNomi);				
			this.jmenuDatosEstadoSolicitudNomi.add(this.jMenuItemAnterioresEstadoSolicitudNomi);				
			this.jmenuDatosEstadoSolicitudNomi.add(this.jMenuItemSiguientesEstadoSolicitudNomi);				
			this.jmenuDatosEstadoSolicitudNomi.add(this.jMenuItemAbrirOrderByEstadoSolicitudNomi);				
			this.jmenuDatosEstadoSolicitudNomi.add(this.jMenuItemMostrarOcultarEstadoSolicitudNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEstadoSolicitudNomi.add(this.jMenuItemGuardarCambiosEstadoSolicitudNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEstadoSolicitudNomi.add(this.jmenuArchivoEstadoSolicitudNomi);		
			this.jmenuBarEstadoSolicitudNomi.add(this.jmenuAccionesEstadoSolicitudNomi);		
			this.jmenuBarEstadoSolicitudNomi.add(this.jmenuDatosEstadoSolicitudNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEstadoSolicitudNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEstadoSolicitudNomi() {
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
			//this.jInternalFrameDetalleEstadoSolicitudNomi = new EstadoSolicitudNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Estado Solicitud DATOS");
			this.jInternalFrameDetalleFormEstadoSolicitudNomi = new EstadoSolicitudNomiDetalleFormJInternalFrame(jDesktopPane,this.estadosolicitudnomiSessionBean.getConGuardarRelaciones(),this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi = null;//new EstadoSolicitudNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoSolicitudNomi= new GridBagLayout();
		
		
		this.jTableDatosEstadoSolicitudNomi = new JTableMe();      
		
		String sToolTipEstadoSolicitudNomi="";
		sToolTipEstadoSolicitudNomi=EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoSolicitudNomi+="(Nomina.EstadoSolicitudNomi)";
		}
		
		if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoSolicitudNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEstadoSolicitudNomi.setToolTipText(sToolTipEstadoSolicitudNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEstadoSolicitudNomi);
		this.jTableDatosEstadoSolicitudNomi.setAutoCreateRowSorter(true);
		this.jTableDatosEstadoSolicitudNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEstadoSolicitudNomi.setRowSelectionAllowed(true);
		this.jTableDatosEstadoSolicitudNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEstadoSolicitudNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEstadoSolicitudNomi = new JButtonMe();
		this.jButtonDuplicarEstadoSolicitudNomi = new JButtonMe();
		this.jButtonCopiarEstadoSolicitudNomi = new JButtonMe();
		this.jButtonVerFormEstadoSolicitudNomi = new JButtonMe();
		this.jButtonNuevoRelacionesEstadoSolicitudNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEstadoSolicitudNomi = new JButtonMe();
		this.jButtonCerrarEstadoSolicitudNomi = new JButtonMe();
		
		this.jScrollPanelDatosEstadoSolicitudNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralEstadoSolicitudNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEstadoSolicitudNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Solicitud";
		
		if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Solicituds" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoSolicitudNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoSolicitudNomi.setToolTipText("Acciones");
        this.jPanelAccionesEstadoSolicitudNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEstadoSolicitudNomi=new ReporteDinamicoJInternalFrame(EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEstadoSolicitudNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEstadoSolicitudNomi=new ImportacionJInternalFrame(EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEstadoSolicitudNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEstadoSolicitudNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByEstadoSolicitudNomi.setText("Orden");
		this.jButtonAbrirOrderByEstadoSolicitudNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoSolicitudNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEstadoSolicitudNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoSolicitudNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoSolicitudNomi,false,this);
			
			//this.cargarOrderByEstadoSolicitudNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEstadoSolicitudNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoSolicitudNomi,true,this);
			
			//this.cargarOrderByEstadoSolicitudNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEstadoSolicitudNomi.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoSolicitudNomi.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEstadoSolicitudNomi.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEstadoSolicitudNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoSolicitudNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEstadoSolicitudNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEstadoSolicitudNomi.setText("Nuevo");
		this.jButtonDuplicarEstadoSolicitudNomi.setText("Duplicar");
		this.jButtonCopiarEstadoSolicitudNomi.setText("Copiar");
		this.jButtonVerFormEstadoSolicitudNomi.setText("Ver");
		this.jButtonNuevoRelacionesEstadoSolicitudNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEstadoSolicitudNomi.setText("Guardar");
		this.jButtonCerrarEstadoSolicitudNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoSolicitudNomi,"nuevo_button","Nuevo",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEstadoSolicitudNomi,"duplicar_button","Duplicar",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEstadoSolicitudNomi,"copiar_button","Copiar",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEstadoSolicitudNomi,"ver_form","Ver",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEstadoSolicitudNomi,"nuevorelaciones_button","Nuevo Rel",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoSolicitudNomi,"guardarcambiostabla_button","Guardar",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoSolicitudNomi,"cerrar_button","Salir",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEstadoSolicitudNomi.setToolTipText("Nuevo"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEstadoSolicitudNomi.setToolTipText("Duplicar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEstadoSolicitudNomi.setToolTipText("Copiar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEstadoSolicitudNomi.setToolTipText("Ver"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEstadoSolicitudNomi.setToolTipText("Nuevo Rel"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEstadoSolicitudNomi.setToolTipText("Guardar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoSolicitudNomi.setToolTipText("Salir"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoSolicitudNomi";
		inputMap = this.jButtonNuevoEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoSolicitudNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoSolicitudNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarEstadoSolicitudNomi";
		inputMap = this.jButtonDuplicarEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEstadoSolicitudNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEstadoSolicitudNomi"));
		
		//COPIAR
		sMapKey = "CopiarEstadoSolicitudNomi";
		inputMap = this.jButtonCopiarEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEstadoSolicitudNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEstadoSolicitudNomi"));
		
		//VEr FORM
		sMapKey = "VerFormEstadoSolicitudNomi";
		inputMap = this.jButtonVerFormEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEstadoSolicitudNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEstadoSolicitudNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEstadoSolicitudNomi";
		inputMap = this.jButtonNuevoRelacionesEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEstadoSolicitudNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEstadoSolicitudNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEstadoSolicitudNomi";
		inputMap = this.jButtonModificarEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEstadoSolicitudNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEstadoSolicitudNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEstadoSolicitudNomi";
		inputMap = this.jButtonCerrarEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoSolicitudNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoSolicitudNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoSolicitudNomi";
		inputMap = this.jButtonGuardarCambiosTablaEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoSolicitudNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoSolicitudNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEstadoSolicitudNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEstadoSolicitudNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEstadoSolicitudNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EstadoSolicitudNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EstadoSolicitudNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EstadoSolicitudNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EstadoSolicitudNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EstadoSolicitudNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEstadoSolicitudNomi.setName("jPanelParametrosReportesEstadoSolicitudNomi"); 
		
		this.jPanelParametrosReportesAccionesEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEstadoSolicitudNomi.setName("jPanelParametrosReportesAccionesEstadoSolicitudNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEstadoSolicitudNomi = new JButtonMe();
		this.jButtonRecargarInformacionEstadoSolicitudNomi.setText("Recargar");
		this.jButtonRecargarInformacionEstadoSolicitudNomi.setToolTipText("Recargar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEstadoSolicitudNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEstadoSolicitudNomi = new JButtonMe();
		this.jButtonProcesarInformacionEstadoSolicitudNomi.setText("Procesar");
		this.jButtonProcesarInformacionEstadoSolicitudNomi.setToolTipText("Procesar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEstadoSolicitudNomi.setVisible(false);
			
		this.jButtonProcesarInformacionEstadoSolicitudNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoSolicitudNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEstadoSolicitudNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEstadoSolicitudNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi.setText("TIPO");       
		this.jComboBoxTiposReportesEstadoSolicitudNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEstadoSolicitudNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEstadoSolicitudNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEstadoSolicitudNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEstadoSolicitudNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionEstadoSolicitudNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEstadoSolicitudNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEstadoSolicitudNomi.setText("Accion");
		this.jComboBoxTiposRelacionesEstadoSolicitudNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEstadoSolicitudNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoSolicitudNomi.setText("Accion");
		this.jComboBoxTiposAccionesEstadoSolicitudNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEstadoSolicitudNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEstadoSolicitudNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarEstadoSolicitudNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEstadoSolicitudNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEstadoSolicitudNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoSolicitudNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEstadoSolicitudNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEstadoSolicitudNomi = new JLabelMe();
		
		this.jLabelAccionesEstadoSolicitudNomi.setText("Acciones");		
		this.jLabelAccionesEstadoSolicitudNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoSolicitudNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoSolicitudNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEstadoSolicitudNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEstadoSolicitudNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEstadoSolicitudNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEstadoSolicitudNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEstadoSolicitudNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEstadoSolicitudNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEstadoSolicitudNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEstadoSolicitudNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteEstadoSolicitudNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEstadoSolicitudNomi = new JButtonMe();
		//this.jButtonAnterioresEstadoSolicitudNomi.setText("<<");
        this.jButtonAnterioresEstadoSolicitudNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEstadoSolicitudNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEstadoSolicitudNomi = new JButtonMe();
		//this.jButtonSiguientesEstadoSolicitudNomi.setText(">>");
        this.jButtonSiguientesEstadoSolicitudNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEstadoSolicitudNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEstadoSolicitudNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEstadoSolicitudNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosEstadoSolicitudNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEstadoSolicitudNomi,"nuevoguardarcambios_button","Nue",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEstadoSolicitudNomi";
		inputMap = this.jButtonNuevoGuardarCambiosEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEstadoSolicitudNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEstadoSolicitudNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEstadoSolicitudNomi";
		inputMap = this.jButtonRecargarInformacionEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEstadoSolicitudNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEstadoSolicitudNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEstadoSolicitudNomi";
		inputMap = this.jButtonSiguientesEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEstadoSolicitudNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEstadoSolicitudNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEstadoSolicitudNomi";
		inputMap = this.jButtonAnterioresEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEstadoSolicitudNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEstadoSolicitudNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEstadoSolicitudNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEstadoSolicitudNomi.setMinimumSize(new Dimension(this.getWidth(),EstadoSolicitudNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoSolicitudNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoSolicitudNomi.setMaximumSize(new Dimension(this.getWidth(),EstadoSolicitudNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoSolicitudNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEstadoSolicitudNomi.setPreferredSize(new Dimension(this.getWidth(),EstadoSolicitudNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EstadoSolicitudNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEstadoSolicitudNomi = new GridBagLayout();

			this.jPanelPaginacionEstadoSolicitudNomi.setLayout(gridaBagLayoutPaginacionEstadoSolicitudNomi);						
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEstadoSolicitudNomi.add(this.jButtonAnterioresEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
					
						
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;
			
			this.jPanelPaginacionEstadoSolicitudNomi.add(this.jButtonNuevoGuardarCambiosEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
						
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;
			this.jPanelPaginacionEstadoSolicitudNomi.add(this.jButtonSiguientesEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = 1;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoSolicitudNomi.add(this.jButtonNuevoEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
				this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoSolicitudNomi.gridy = 1;
				this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEstadoSolicitudNomi.add(this.jButtonNuevoRelacionesEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
			}
			
			
			if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
				this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEstadoSolicitudNomi.gridy = 1;
				this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEstadoSolicitudNomi.add(this.jButtonGuardarCambiosTablaEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
			}
			
			
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = 1;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoSolicitudNomi.add(this.jButtonDuplicarEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = 1;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoSolicitudNomi.add(this.jButtonCopiarEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = 1;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEstadoSolicitudNomi.add(this.jButtonVerFormEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = 1;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEstadoSolicitudNomi.add(this.jButtonCerrarEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		
		
		
		this.jButtonRecargarInformacionEstadoSolicitudNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoSolicitudNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEstadoSolicitudNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEstadoSolicitudNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoSolicitudNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEstadoSolicitudNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEstadoSolicitudNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoSolicitudNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEstadoSolicitudNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEstadoSolicitudNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoSolicitudNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEstadoSolicitudNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEstadoSolicitudNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoSolicitudNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEstadoSolicitudNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEstadoSolicitudNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoSolicitudNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoSolicitudNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEstadoSolicitudNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoSolicitudNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEstadoSolicitudNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEstadoSolicitudNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoSolicitudNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEstadoSolicitudNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEstadoSolicitudNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoSolicitudNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEstadoSolicitudNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEstadoSolicitudNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoSolicitudNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEstadoSolicitudNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEstadoSolicitudNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEstadoSolicitudNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EstadoSolicitudNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EstadoSolicitudNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EstadoSolicitudNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EstadoSolicitudNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEstadoSolicitudNomi.setLayout(gridaBagParametrosReportesEstadoSolicitudNomi);
			this.jPanelParametrosReportesAccionesEstadoSolicitudNomi.setLayout(gridaBagParametrosReportesAccionesEstadoSolicitudNomi);
			
			
			this.jPanelParametrosAuxiliar1EstadoSolicitudNomi.setLayout(gridaBagParametrosAuxiliar1EstadoSolicitudNomi);
			this.jPanelParametrosAuxiliar2EstadoSolicitudNomi.setLayout(gridaBagParametrosAuxiliar2EstadoSolicitudNomi);
			this.jPanelParametrosAuxiliar3EstadoSolicitudNomi.setLayout(gridaBagParametrosAuxiliar3EstadoSolicitudNomi);
			this.jPanelParametrosAuxiliar4EstadoSolicitudNomi.setLayout(gridaBagParametrosAuxiliar4EstadoSolicitudNomi);
			//this.jPanelParametrosAuxiliar5EstadoSolicitudNomi.setLayout(gridaBagParametrosAuxiliar2EstadoSolicitudNomi);			
			
			
			
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoSolicitudNomi.add(this.jButtonRecargarInformacionEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoSolicitudNomi.add(this.jComboBoxTiposPaginacionEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoSolicitudNomi.add(this.jCheckBoxConAltoMaximoTablaEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EstadoSolicitudNomi.add(this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoSolicitudNomi.add(this.jPanelParametrosAuxiliar1EstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EstadoSolicitudNomi.add(this.jComboBoxTiposReportesEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoSolicitudNomi.add(this.jPanelParametrosAuxiliar4EstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoSolicitudNomi.add(this.jComboBoxTiposReportesEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoSolicitudNomi.add(this.jCheckBoxGenerarReporteEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoSolicitudNomi.add(this.jPanelParametrosAuxiliar2EstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoSolicitudNomi.add(this.jLabelAccionesEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
				this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEstadoSolicitudNomi.add(this.jButtonAbrirOrderByEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoSolicitudNomi.add(this.jComboBoxTiposSeleccionarEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);			
			
			
			/*
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEstadoSolicitudNomi.add(this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoSolicitudNomi.add(this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);															
				
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EstadoSolicitudNomi.add(this.jCheckBoxSeleccionadosEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEstadoSolicitudNomi.add(this.jPanelParametrosAuxiliar3EstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoSolicitudNomi.add(this.jComboBoxTiposRelacionesEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
				
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoSolicitudNomi.add(this.jComboBoxTiposAccionesEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
	
				
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEstadoSolicitudNomi.add(this.jTextFieldValorCampoGeneralEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEstadoSolicitudNomi = new GridBagLayout();

			this.jScrollPanelDatosEstadoSolicitudNomi.setLayout(gridaBagLayoutDatosEstadoSolicitudNomi);
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
			
			this.jScrollPanelDatosEstadoSolicitudNomi.add(this.jTableDatosEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEstadoSolicitudNomi.setViewportView(this.jTableDatosEstadoSolicitudNomi);
		this.jTableDatosEstadoSolicitudNomi.setFillsViewportHeight(true);
		this.jTableDatosEstadoSolicitudNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEstadoSolicitudNomi= new GridBagLayout();
		this.jPanelAccionesEstadoSolicitudNomi.setLayout(gridaBagLayoutAccionesEstadoSolicitudNomi);
		
		
		/*	
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
			
		this.jPanelAccionesEstadoSolicitudNomi.add(this.jButtonNuevoEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoSolicitudNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoSolicitudNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();						
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;		
			//this.gridBagConstraintsEstadoSolicitudNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoSolicitudNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;		
		//this.gridBagConstraintsEstadoSolicitudNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEstadoSolicitudNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEstadoSolicitudNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);								
		
		
		/*
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		*/		
		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx =0;
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoSolicitudNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
				
		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EstadoSolicitudNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEstadoSolicitudNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoSolicitudNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosEstadoSolicitudNomi.setLayout(gridaBagLayoutBusquedasParametrosEstadoSolicitudNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEstadoSolicitudNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoSolicitudNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoSolicitudNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoSolicitudNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
			
			
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		
			
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEstadoSolicitudNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEstadoSolicitudNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEstadoSolicitudNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEstadoSolicitudNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEstadoSolicitudNomi.setName("jPanelReporteDinamicoEstadoSolicitudNomi"); 
		
		this.jPanelReporteDinamicoEstadoSolicitudNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoSolicitudNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEstadoSolicitudNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEstadoSolicitudNomi.setLayout(gridaBagLayoutReporteDinamicoEstadoSolicitudNomi);
		
		
		this.jInternalFrameReporteDinamicoEstadoSolicitudNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEstadoSolicitudNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoSolicitudNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEstadoSolicitudNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoSolicitudNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEstadoSolicitudNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Solicituds"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEstadoSolicitudNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteEstadoSolicitudNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEstadoSolicitudNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoSolicitudNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEstadoSolicitudNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoSolicitudNomi.add(this.jLabelColumnasSelectReporteEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEstadoSolicitudNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteEstadoSolicitudNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEstadoSolicitudNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEstadoSolicitudNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoSolicitudNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEstadoSolicitudNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEstadoSolicitudNomi=new JScrollPane(this.jListColumnasSelectReporteEstadoSolicitudNomi);
			
			this.jScrollColumnasSelectReporteEstadoSolicitudNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoSolicitudNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEstadoSolicitudNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoSolicitudNomi.add(this.jListColumnasSelectReporteEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		this.jPanelReporteDinamicoEstadoSolicitudNomi.add(this.jScrollColumnasSelectReporteEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEstadoSolicitudNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteEstadoSolicitudNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEstadoSolicitudNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoSolicitudNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEstadoSolicitudNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEstadoSolicitudNomi.add(this.jLabelRelacionesSelectReporteEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEstadoSolicitudNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteEstadoSolicitudNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEstadoSolicitudNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEstadoSolicitudNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoSolicitudNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEstadoSolicitudNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEstadoSolicitudNomi=new JScrollPane(this.jListRelacionesSelectReporteEstadoSolicitudNomi);
			
			this.jScrollRelacionesSelectReporteEstadoSolicitudNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoSolicitudNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEstadoSolicitudNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEstadoSolicitudNomi.add(this.jListRelacionesSelectReporteEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		this.jPanelReporteDinamicoEstadoSolicitudNomi.add(this.jScrollRelacionesSelectReporteEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEstadoSolicitudNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEstadoSolicitudNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoEstadoSolicitudNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEstadoSolicitudNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEstadoSolicitudNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEstadoSolicitudNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoSolicitudNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEstadoSolicitudNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEstadoSolicitudNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoSolicitudNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEstadoSolicitudNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoSolicitudNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEstadoSolicitudNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEstadoSolicitudNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEstadoSolicitudNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEstadoSolicitudNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoSolicitudNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEstadoSolicitudNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoSolicitudNomi.add(this.jLabelGenerarExcelReporteDinamicoEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEstadoSolicitudNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEstadoSolicitudNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEstadoSolicitudNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEstadoSolicitudNomi.setToolTipText("Generar EXCEL"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		//this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEstadoSolicitudNomi.add(this.jButtonGenerarExcelReporteDinamicoEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoSolicitudNomi.add(this.jComboBoxTiposReportesDinamicoEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEstadoSolicitudNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEstadoSolicitudNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEstadoSolicitudNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoSolicitudNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEstadoSolicitudNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEstadoSolicitudNomi.add(this.jLabelTiposArchivoReporteDinamicoEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoSolicitudNomi.add(this.jComboBoxTiposArchivosReportesDinamicoEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEstadoSolicitudNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEstadoSolicitudNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEstadoSolicitudNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEstadoSolicitudNomi.setToolTipText("Generar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoSolicitudNomi.add(this.jButtonGenerarReporteDinamicoEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEstadoSolicitudNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEstadoSolicitudNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEstadoSolicitudNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEstadoSolicitudNomi.setToolTipText("Cancelar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEstadoSolicitudNomi.add(this.jButtonCerrarReporteDinamicoEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEstadoSolicitudNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEstadoSolicitudNomi= new JScrollPane(jPanelReporteDinamicoEstadoSolicitudNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEstadoSolicitudNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoSolicitudNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEstadoSolicitudNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Solicituds"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEstadoSolicitudNomi);
		this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getContentPane().add(this.jScrollPanelReporteDinamicoEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEstadoSolicitudNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEstadoSolicitudNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEstadoSolicitudNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEstadoSolicitudNomi.setName("jPanelImportacionEstadoSolicitudNomi"); 
		
		this.jPanelImportacionEstadoSolicitudNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoSolicitudNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEstadoSolicitudNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEstadoSolicitudNomi.setLayout(gridaBagLayoutImportacionEstadoSolicitudNomi);
		
		
		this.jInternalFrameImportacionEstadoSolicitudNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEstadoSolicitudNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEstadoSolicitudNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEstadoSolicitudNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEstadoSolicitudNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoSolicitudNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoSolicitudNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEstadoSolicitudNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoSolicitudNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoSolicitudNomi.setResizable(true);
	    this.jInternalFrameImportacionEstadoSolicitudNomi.setClosable(true);
	    this.jInternalFrameImportacionEstadoSolicitudNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEstadoSolicitudNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEstadoSolicitudNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEstadoSolicitudNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEstadoSolicitudNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEstadoSolicitudNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEstadoSolicitudNomi.setResizable(true);
	    this.jInternalFrameImportacionEstadoSolicitudNomi.setClosable(true);
	    this.jInternalFrameImportacionEstadoSolicitudNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEstadoSolicitudNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoSolicitudNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEstadoSolicitudNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Solicituds"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEstadoSolicitudNomi = new JLabelMe();

		this.jLabelArchivoImportacionEstadoSolicitudNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEstadoSolicitudNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoSolicitudNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEstadoSolicitudNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoSolicitudNomi.add(this.jLabelArchivoImportacionEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEstadoSolicitudNomi = new JFileChooser();		
		this.jFileChooserImportacionEstadoSolicitudNomi.setToolTipText("ESCOGER ARCHIVO"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEstadoSolicitudNomi = new JButtonMe();
		this.jButtonAbrirImportacionEstadoSolicitudNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEstadoSolicitudNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEstadoSolicitudNomi.setToolTipText("Generar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoSolicitudNomi.add(this.jButtonAbrirImportacionEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEstadoSolicitudNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionEstadoSolicitudNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEstadoSolicitudNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoSolicitudNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEstadoSolicitudNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEstadoSolicitudNomi.add(this.jLabelPathArchivoImportacionEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEstadoSolicitudNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEstadoSolicitudNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoSolicitudNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEstadoSolicitudNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoSolicitudNomi.add(this.jTextFieldPathArchivoImportacionEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEstadoSolicitudNomi = new JButtonMe();
		this.jButtonGenerarImportacionEstadoSolicitudNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEstadoSolicitudNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEstadoSolicitudNomi.setToolTipText("Generar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoSolicitudNomi.add(this.jButtonGenerarImportacionEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEstadoSolicitudNomi = new JButtonMe();
		this.jButtonCerrarImportacionEstadoSolicitudNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEstadoSolicitudNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEstadoSolicitudNomi.setToolTipText("Cancelar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEstadoSolicitudNomi.add(this.jButtonCerrarImportacionEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEstadoSolicitudNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionEstadoSolicitudNomi= new JScrollPane(jPanelImportacionEstadoSolicitudNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEstadoSolicitudNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEstadoSolicitudNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEstadoSolicitudNomi);
		this.jInternalFrameImportacionEstadoSolicitudNomi.getContentPane().add(this.jScrollPanelImportacionEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEstadoSolicitudNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEstadoSolicitudNomi = new JButtonMe();
			this.jButtonAbrirOrderByEstadoSolicitudNomi.setText("Orden");
			this.jButtonAbrirOrderByEstadoSolicitudNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEstadoSolicitudNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEstadoSolicitudNomi";
			inputMap = this.jButtonAbrirOrderByEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEstadoSolicitudNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEstadoSolicitudNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByEstadoSolicitudNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEstadoSolicitudNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEstadoSolicitudNomi.setName("jPanelOrderByEstadoSolicitudNomi"); 
			
			this.jPanelOrderByEstadoSolicitudNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoSolicitudNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEstadoSolicitudNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEstadoSolicitudNomi.setLayout(gridaBagLayoutOrderByEstadoSolicitudNomi);
			
			
			this.jTableDatosEstadoSolicitudNomiOrderBy = new JTableMe();        
			this.jTableDatosEstadoSolicitudNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEstadoSolicitudNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEstadoSolicitudNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEstadoSolicitudNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEstadoSolicitudNomiOrderBy.setViewportView(this.jTableDatosEstadoSolicitudNomiOrderBy);
			this.jTableDatosEstadoSolicitudNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEstadoSolicitudNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEstadoSolicitudNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEstadoSolicitudNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEstadoSolicitudNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEstadoSolicitudNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEstadoSolicitudNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEstadoSolicitudNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEstadoSolicitudNomi.setTitle("Orden");
			this.jInternalFrameOrderByEstadoSolicitudNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEstadoSolicitudNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEstadoSolicitudNomi.setResizable(true);
			this.jInternalFrameOrderByEstadoSolicitudNomi.setClosable(true);
			this.jInternalFrameOrderByEstadoSolicitudNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEstadoSolicitudNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoSolicitudNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEstadoSolicitudNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Solicituds"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEstadoSolicitudNomi.ipady =150;
				
			this.jPanelOrderByEstadoSolicitudNomi.add(jScrollPanelDatosEstadoSolicitudNomiOrderBy, this.gridBagConstraintsEstadoSolicitudNomi);//this.jTableDatosEstadoSolicitudNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEstadoSolicitudNomi = new JButtonMe();
			this.jButtonCerrarOrderByEstadoSolicitudNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEstadoSolicitudNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEstadoSolicitudNomi.setToolTipText("Cancelar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEstadoSolicitudNomi.add(this.jButtonCerrarOrderByEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEstadoSolicitudNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByEstadoSolicitudNomi= new JScrollPane(jPanelOrderByEstadoSolicitudNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEstadoSolicitudNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEstadoSolicitudNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEstadoSolicitudNomi);
			
			this.jInternalFrameOrderByEstadoSolicitudNomi.getContentPane().add(this.jScrollPanelOrderByEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);			
		
		} else {
			this.jButtonAbrirOrderByEstadoSolicitudNomi = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEstadoSolicitudNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEstadoSolicitudNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEstadoSolicitudNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEstadoSolicitudNomi.getRowHeight();//EstadoSolicitudNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EstadoSolicitudNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoSolicitudNomi.isSelected()) {
					iHeightTable=EstadoSolicitudNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoSolicitudNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoSolicitudNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EstadoSolicitudNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEstadoSolicitudNomi.isSelected()) {
					iHeightTable=EstadoSolicitudNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EstadoSolicitudNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EstadoSolicitudNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEstadoSolicitudNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoSolicitudNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEstadoSolicitudNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEstadoSolicitudNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoSolicitudNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEstadoSolicitudNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEstadoSolicitudNomi!=null && this.jInternalFrameOrderByEstadoSolicitudNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEstadoSolicitudNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEstadoSolicitudNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEstadoSolicitudNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEstadoSolicitudNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEstadoSolicitudNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEstadoSolicitudNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEstadoSolicitudNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEstadoSolicitudNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoSolicitudNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEstadoSolicitudNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=estadosolicitudnomiLogic.getEstadoSolicitudNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadosolicitudnomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EstadoSolicitudNomi> TraerEstadoSolicitudNomiBeans(List<EstadoSolicitudNomi> estadosolicitudnomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(EstadoSolicitudNomi estadosolicitudnomi:estadosolicitudnomis) {
					
				if(!(EstadoSolicitudNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EstadoSolicitudNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					estadosolicitudnomi.setsDetalleGeneralEntityReporte(EstadoSolicitudNomiConstantesFunciones.getEstadoSolicitudNomiDescripcion(estadosolicitudnomi));
										
						
					
					

					if(estadosolicitudnomi.getSolicitudReemplazos()!=null && Funciones.existeClass(classes,SolicitudReemplazo.class)) {
						try{estadosolicitudnomi.setsolicitudreemplazosDescripcionReporte(new JRBeanCollectionDataSource(SolicitudReemplazoJInternalFrame.TraerSolicitudReemplazoBeans(estadosolicitudnomi.getSolicitudReemplazos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadosolicitudnomi.getSolicitudHoraExtras()!=null && Funciones.existeClass(classes,SolicitudHoraExtra.class)) {
						try{estadosolicitudnomi.setsolicitudhoraextrasDescripcionReporte(new JRBeanCollectionDataSource(SolicitudHoraExtraJInternalFrame.TraerSolicitudHoraExtraBeans(estadosolicitudnomi.getSolicitudHoraExtras(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(estadosolicitudnomi.getSolicitudVacacions()!=null && Funciones.existeClass(classes,SolicitudVacacion.class)) {
						try{estadosolicitudnomi.setsolicitudvacacionsDescripcionReporte(new JRBeanCollectionDataSource(SolicitudVacacionJInternalFrame.TraerSolicitudVacacionBeans(estadosolicitudnomi.getSolicitudVacacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//estadosolicitudnomi.setsDetalleGeneralEntityReporte(estadosolicitudnomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//estadosolicitudnomibeans.add(estadosolicitudnomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return estadosolicitudnomis;
    }
	//PARA REPORTES FIN
}
