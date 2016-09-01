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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.LunaSistemaSolarConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class LunaSistemaSolarJInternalFrame extends LunaSistemaSolarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarLunaSistemaSolar;
	
	protected JMenuBar jmenuBarLunaSistemaSolar;
	
	protected JMenu jmenuLunaSistemaSolar;
	protected JMenu jmenuDatosLunaSistemaSolar;
	protected JMenu jmenuArchivoLunaSistemaSolar;
	protected JMenu jmenuAccionesLunaSistemaSolar;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosLunaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLunaSistemaSolar;	
	protected GridBagConstraints gridBagConstraintsLunaSistemaSolar;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public LunaSistemaSolarDetalleFormJInternalFrame jInternalFrameDetalleFormLunaSistemaSolar;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoLunaSistemaSolar;	
	protected ImportacionJInternalFrame jInternalFrameImportacionLunaSistemaSolar;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoValoracionBeanSwingJInternalFrame tipovaloracionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovaloracion="";
	
	public LunaSistemaSolarSessionBean lunasistemasolarSessionBean;
		
	
	
	public TipoValoracionSessionBean tipovaloracionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<LunaSistemaSolar> lunasistemasolars;		
	public List<LunaSistemaSolar> lunasistemasolarsEliminados;	
	public List<LunaSistemaSolar> lunasistemasolarsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByLunaSistemaSolar;		
	protected JButton jButtonAbrirOrderByLunaSistemaSolar;
	
	
	//protected JPanel jPanelOrderByLunaSistemaSolar;
	//public JScrollPane jScrollPanelOrderByLunaSistemaSolar;	
	//protected JButton jButtonCerrarOrderByLunaSistemaSolar;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public LunaSistemaSolarLogic lunasistemasolarLogic;
	
	
	
	public JScrollPane jScrollPanelDatosLunaSistemaSolar;
	public JScrollPane jScrollPanelDatosEdicionLunaSistemaSolar;
	public JScrollPane jScrollPanelDatosGeneralLunaSistemaSolar;
    
	
	
	//public JScrollPane jScrollPanelDatosLunaSistemaSolarOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoLunaSistemaSolar;
	//public JScrollPane jScrollPanelImportacionLunaSistemaSolar;
	
	
	
	protected JPanel jPanelAccionesLunaSistemaSolar;
	
    protected JPanel jPanelPaginacionLunaSistemaSolar;
    protected JPanel jPanelParametrosReportesLunaSistemaSolar;
	protected JPanel jPanelParametrosReportesAccionesLunaSistemaSolar;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1LunaSistemaSolar;
	protected JPanel jPanelParametrosAuxiliar2LunaSistemaSolar;
	protected JPanel jPanelParametrosAuxiliar3LunaSistemaSolar;
	protected JPanel jPanelParametrosAuxiliar4LunaSistemaSolar;
	//protected JPanel jPanelParametrosAuxiliar5LunaSistemaSolar;
	
	
	
	//protected JPanel jPanelReporteDinamicoLunaSistemaSolar;
	//protected JPanel jPanelImportacionLunaSistemaSolar;
	
	
	public JTable jTableDatosLunaSistemaSolar;
	
	
	
	//public JTable jTableDatosLunaSistemaSolarOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoLunaSistemaSolar;
	protected JButton jButtonDuplicarLunaSistemaSolar;
	protected JButton jButtonCopiarLunaSistemaSolar;
	protected JButton jButtonVerFormLunaSistemaSolar;
	protected JButton jButtonNuevoRelacionesLunaSistemaSolar;
	protected JButton jButtonModificarLunaSistemaSolar;
	
    protected JButton jButtonGuardarCambiosTablaLunaSistemaSolar;
	protected JButton jButtonCerrarLunaSistemaSolar;
	
	
	protected JButton jButtonRecargarInformacionLunaSistemaSolar;
	protected JButton jButtonProcesarInformacionLunaSistemaSolar;
	
	
	protected JButton jButtonAnterioresLunaSistemaSolar;
	protected JButton jButtonSiguientesLunaSistemaSolar;
	protected JButton jButtonNuevoGuardarCambiosLunaSistemaSolar;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoLunaSistemaSolar;
	//protected JButton jButtonCerrarReporteDinamicoLunaSistemaSolar;
	//protected JButton jButtonGenerarExcelReporteDinamicoLunaSistemaSolar;	
	
	
	
	//protected JButton jButtonAbrirImportacionLunaSistemaSolar;
	//protected JButton jButtonGenerarImportacionLunaSistemaSolar;
	//protected JButton jButtonCerrarImportacionLunaSistemaSolar;
	//protected JFileChooser jFileChooserImportacionLunaSistemaSolar;
	//protected File fileImportacionLunaSistemaSolar;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLunaSistemaSolar;
	protected JButton jButtonDuplicarToolBarLunaSistemaSolar;
	protected JButton jButtonNuevoRelacionesToolBarLunaSistemaSolar;
	
	
	public JButton jButtonGuardarCambiosToolBarLunaSistemaSolar;
	protected JButton jButtonCopiarToolBarLunaSistemaSolar;
	protected JButton jButtonVerFormToolBarLunaSistemaSolar;
	public JButton jButtonGuardarCambiosTablaToolBarLunaSistemaSolar;
	protected JButton jButtonMostrarOcultarTablaToolBarLunaSistemaSolar;
	protected JButton jButtonCerrarToolBarLunaSistemaSolar;
	
	protected JButton jButtonRecargarInformacionToolBarLunaSistemaSolar;
	protected JButton jButtonProcesarInformacionToolBarLunaSistemaSolar;
	protected JButton jButtonAnterioresToolBarLunaSistemaSolar;
	protected JButton jButtonSiguientesToolBarLunaSistemaSolar;
	protected JButton jButtonNuevoGuardarCambiosToolBarLunaSistemaSolar;
	protected JButton jButtonAbrirOrderByToolBarLunaSistemaSolar;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLunaSistemaSolar;
	protected JMenuItem jMenuItemDuplicarLunaSistemaSolar;
	protected JMenuItem jMenuItemNuevoRelacionesLunaSistemaSolar;
	
	
	protected JMenuItem jMenuItemGuardarCambiosLunaSistemaSolar;
	protected JMenuItem jMenuItemCopiarLunaSistemaSolar;
	protected JMenuItem jMenuItemVerFormLunaSistemaSolar;
	protected JMenuItem jMenuItemGuardarCambiosTablaLunaSistemaSolar;
	protected JMenuItem jMenuItemCerrarLunaSistemaSolar;
	protected JMenuItem jMenuItemDetalleCerrarLunaSistemaSolar;
	protected JMenuItem jMenuItemDetalleAbrirOrderByLunaSistemaSolar;
	protected JMenuItem jMenuItemDetalleMostarOcultarLunaSistemaSolar;
	
	protected JMenuItem jMenuItemRecargarInformacionLunaSistemaSolar;
	protected JMenuItem jMenuItemProcesarInformacionLunaSistemaSolar;
	protected JMenuItem jMenuItemAnterioresLunaSistemaSolar;
	protected JMenuItem jMenuItemSiguientesLunaSistemaSolar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLunaSistemaSolar;
	protected JMenuItem jMenuItemAbrirOrderByLunaSistemaSolar;
	protected JMenuItem jMenuItemMostrarOcultarLunaSistemaSolar;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesLunaSistemaSolar;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosLunaSistemaSolar;
	protected JCheckBox jCheckBoxSeleccionadosLunaSistemaSolar;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaLunaSistemaSolar;
	protected JCheckBox jCheckBoxConGraficoReporteLunaSistemaSolar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesLunaSistemaSolar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesLunaSistemaSolar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoLunaSistemaSolar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoLunaSistemaSolar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesLunaSistemaSolar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionLunaSistemaSolar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLunaSistemaSolar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLunaSistemaSolar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarLunaSistemaSolar;
	protected JTextField jTextFieldValorCampoGeneralLunaSistemaSolar;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteLunaSistemaSolar;
	//public JList<Reporte> jListColumnasSelectReporteLunaSistemaSolar;
	//public JScrollPane jScrollColumnasSelectReporteLunaSistemaSolar;
	
	//public JLabel jLabelRelacionesSelectReporteLunaSistemaSolar;
	//public JList<Reporte> jListRelacionesSelectReporteLunaSistemaSolar;
	//public JScrollPane jScrollRelacionesSelectReporteLunaSistemaSolar;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoLunaSistemaSolar;
	//protected JCheckBox jCheckBoxConGraficoDinamicoLunaSistemaSolar;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoLunaSistemaSolar;
	//public JLabel jLabelTiposArchivoReporteDinamicoLunaSistemaSolar;
	
		
	//public JLabel jLabelArchivoImportacionLunaSistemaSolar;	
	//public JLabel jLabelPathArchivoImportacionLunaSistemaSolar;
	//protected JTextField jTextFieldPathArchivoImportacionLunaSistemaSolar;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoLunaSistemaSolar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoLunaSistemaSolar;
	
	//public JLabel jLabelColumnaCategoriaValorLunaSistemaSolar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorLunaSistemaSolar;
	
	//public JLabel jLabelColumnasValoresGraficoLunaSistemaSolar;
	//public JList<Reporte> jListColumnasValoresGraficoLunaSistemaSolar;
	//public JScrollPane jScrollColumnasValoresGraficoLunaSistemaSolar;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoLunaSistemaSolar;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoLunaSistemaSolar;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasLunaSistemaSolar;
	public JPanel jPanelFK_IdTipoValoracionLunaSistemaSolar;
	public JButton jButtonFK_IdTipoValoracionLunaSistemaSolar;
	
	public JPanel jPanelid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar;
	public JLabel jLabelid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar;
	public JButton jButtonid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar= new JButtonMe();
	public JButton jButtonid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolarBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public LunaSistemaSolarJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("LunaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LunaSistemaSolarJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LunaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LunaSistemaSolarJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LunaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LunaSistemaSolarJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("LunaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionLunaSistemaSolar)	{
		this.jButtonRecargarInformacionLunaSistemaSolar = jButtonRecargarInformacionLunaSistemaSolar;
	}
	
	public JButton getjButtonProcesarInformacionLunaSistemaSolar() {
		return this.jButtonProcesarInformacionLunaSistemaSolar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLunaSistemaSolar)	{
		this.jButtonProcesarInformacionLunaSistemaSolar = jButtonProcesarInformacionLunaSistemaSolar;
	}
	
	
	public JButton getjButtonRecargarInformacionLunaSistemaSolar() {
		return this.jButtonRecargarInformacionLunaSistemaSolar;
	}
	
	
	public List<LunaSistemaSolar> getlunasistemasolars() {
		return this.lunasistemasolars;
	}

	public void setlunasistemasolars(List<LunaSistemaSolar> lunasistemasolars) {
		this.lunasistemasolars = lunasistemasolars;
	}
	
	public List<LunaSistemaSolar> getlunasistemasolarsAux() {
		return this.lunasistemasolarsAux;
	}

	public void setlunasistemasolarsAux(List<LunaSistemaSolar> lunasistemasolarsAux) {
		this.lunasistemasolarsAux = lunasistemasolarsAux;
	}
	
	public List<LunaSistemaSolar> getlunasistemasolarsEliminados() {
		return this.lunasistemasolarsEliminados;
	}

	public void setLunaSistemaSolarsEliminados(List<LunaSistemaSolar> lunasistemasolarsEliminados) {
		this.lunasistemasolarsEliminados = lunasistemasolarsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarLunaSistemaSolar() {
		return jComboBoxTiposSeleccionarLunaSistemaSolar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarLunaSistemaSolar(
			JComboBox jComboBoxTiposSeleccionarLunaSistemaSolar) {
		this.jComboBoxTiposSeleccionarLunaSistemaSolar = jComboBoxTiposSeleccionarLunaSistemaSolar;
	}
	
	public void setBorderResaltarTiposSeleccionarLunaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarLunaSistemaSolar.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarLunaSistemaSolar .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralLunaSistemaSolar() {
		return jTextFieldValorCampoGeneralLunaSistemaSolar;
	}

	public void setjTextFieldValorCampoGeneralLunaSistemaSolar(
			JTextField jTextFieldValorCampoGeneralLunaSistemaSolar) {
		this.jTextFieldValorCampoGeneralLunaSistemaSolar = jTextFieldValorCampoGeneralLunaSistemaSolar;
	}

	public void setBorderResaltarValorCampoGeneralLunaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLunaSistemaSolar.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralLunaSistemaSolar .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosLunaSistemaSolar() {
		return this.jCheckBoxSeleccionarTodosLunaSistemaSolar;
	}

	public void setjCheckBoxSeleccionarTodosLunaSistemaSolar(
			JCheckBox jCheckBoxSeleccionarTodosLunaSistemaSolar) {
		this.jCheckBoxSeleccionarTodosLunaSistemaSolar = jCheckBoxSeleccionarTodosLunaSistemaSolar;
	}

	public void setBorderResaltarSeleccionarTodosLunaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLunaSistemaSolar.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosLunaSistemaSolar .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosLunaSistemaSolar() {
		return this.jCheckBoxSeleccionadosLunaSistemaSolar;
	}

	public void setjCheckBoxSeleccionadosLunaSistemaSolar(
			JCheckBox jCheckBoxSeleccionadosLunaSistemaSolar) {
		this.jCheckBoxSeleccionadosLunaSistemaSolar = jCheckBoxSeleccionadosLunaSistemaSolar;
	}
	
	public void setBorderResaltarSeleccionadosLunaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLunaSistemaSolar.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosLunaSistemaSolar .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesLunaSistemaSolar() {
		return this.jComboBoxTiposArchivosReportesLunaSistemaSolar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesLunaSistemaSolar(
			JComboBox jComboBoxTiposArchivosReportesLunaSistemaSolar) {
		this.jComboBoxTiposArchivosReportesLunaSistemaSolar = jComboBoxTiposArchivosReportesLunaSistemaSolar;
	}

	public void setBorderResaltarTiposArchivosReportesLunaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLunaSistemaSolar.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesLunaSistemaSolar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesLunaSistemaSolar() {
		return this.jComboBoxTiposReportesLunaSistemaSolar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesLunaSistemaSolar(
			JComboBox jComboBoxTiposReportesLunaSistemaSolar) {
		this.jComboBoxTiposReportesLunaSistemaSolar = jComboBoxTiposReportesLunaSistemaSolar;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoLunaSistemaSolar() {
	//	return jComboBoxTiposReportesDinamicoLunaSistemaSolar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoLunaSistemaSolar(
	//		JComboBox jComboBoxTiposReportesDinamicoLunaSistemaSolar) {
	//	this.jComboBoxTiposReportesDinamicoLunaSistemaSolar = jComboBoxTiposReportesDinamicoLunaSistemaSolar;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoLunaSistemaSolar() {
	//	return jComboBoxTiposArchivosReportesDinamicoLunaSistemaSolar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoLunaSistemaSolar(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoLunaSistemaSolar) {
	//	this.jComboBoxTiposArchivosReportesDinamicoLunaSistemaSolar = jComboBoxTiposArchivosReportesDinamicoLunaSistemaSolar;
	//}
	
	public void setBorderResaltarTiposReportesLunaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLunaSistemaSolar.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesLunaSistemaSolar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesLunaSistemaSolar() {
		return this.jComboBoxTiposGraficosReportesLunaSistemaSolar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesLunaSistemaSolar(
			JComboBox jComboBoxTiposGraficosReportesLunaSistemaSolar) {
		this.jComboBoxTiposGraficosReportesLunaSistemaSolar = jComboBoxTiposGraficosReportesLunaSistemaSolar;
	}
	
	public void setBorderResaltarTiposGraficosReportesLunaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLunaSistemaSolar.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesLunaSistemaSolar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionLunaSistemaSolar() {
		return this.jComboBoxTiposPaginacionLunaSistemaSolar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionLunaSistemaSolar(
			JComboBox jComboBoxTiposPaginacionLunaSistemaSolar) {
		this.jComboBoxTiposPaginacionLunaSistemaSolar = jComboBoxTiposPaginacionLunaSistemaSolar;
	}
	
	public void setBorderResaltarTiposPaginacionLunaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLunaSistemaSolar.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionLunaSistemaSolar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesLunaSistemaSolar() {
		return this.jComboBoxTiposRelacionesLunaSistemaSolar;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLunaSistemaSolar() {
		return this.jComboBoxTiposAccionesLunaSistemaSolar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLunaSistemaSolar(
			JComboBox jComboBoxTiposRelacionesLunaSistemaSolar) {
		this.jComboBoxTiposRelacionesLunaSistemaSolar = jComboBoxTiposRelacionesLunaSistemaSolar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLunaSistemaSolar(
			JComboBox jComboBoxTiposAccionesLunaSistemaSolar) {
		this.jComboBoxTiposAccionesLunaSistemaSolar = jComboBoxTiposAccionesLunaSistemaSolar;
	}
	
	public void setBorderResaltarTiposRelacionesLunaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLunaSistemaSolar.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesLunaSistemaSolar .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesLunaSistemaSolar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLunaSistemaSolar.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesLunaSistemaSolar .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoLunaSistemaSolar() {
	//	return jCheckBoxConGraficoDinamicoLunaSistemaSolar;
	//}

	//public void setjCheckBoxConGraficoDinamicoLunaSistemaSolar(
	//		JCheckBox jCheckBoxConGraficoDinamicoLunaSistemaSolar) {
	//	this.jCheckBoxConGraficoDinamicoLunaSistemaSolar = jCheckBoxConGraficoDinamicoLunaSistemaSolar;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoLunaSistemaSolar() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarLunaSistemaSolar.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoLunaSistemaSolar .setBorder(borderResaltar);		
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
		this.lunasistemasolarSessionBean=new LunaSistemaSolarSessionBean();
		
		this.lunasistemasolarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.lunasistemasolarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.lunasistemasolarSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=LunaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=LunaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LunaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LunaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LunaSistemaSolarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Luna Sistema Solar MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
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
		
		LunaSistemaSolarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("LunaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarLunaSistemaSolar= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarLunaSistemaSolar,this.jTtoolBarLunaSistemaSolar,
							"nuevo","nuevo","Nuevo"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarLunaSistemaSolar,this.jTtoolBarLunaSistemaSolar,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarLunaSistemaSolar,this.jTtoolBarLunaSistemaSolar,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarLunaSistemaSolar,this.jTtoolBarLunaSistemaSolar,
							"duplicar","duplicar","Duplicar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarLunaSistemaSolar,this.jTtoolBarLunaSistemaSolar,
							"copiar","copiar","Copiar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarLunaSistemaSolar,this.jTtoolBarLunaSistemaSolar,
							"ver_form","ver_form","Ver"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLunaSistemaSolar,this.jTtoolBarLunaSistemaSolar,
							"recargar","recargar","Recargar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLunaSistemaSolar,this.jTtoolBarLunaSistemaSolar,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLunaSistemaSolar,this.jTtoolBarLunaSistemaSolar,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarLunaSistemaSolar,this.jTtoolBarLunaSistemaSolar,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarLunaSistemaSolar,this.jTtoolBarLunaSistemaSolar,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarLunaSistemaSolar,this.jTtoolBarLunaSistemaSolar,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarLunaSistemaSolar,this.jTtoolBarLunaSistemaSolar,
							"cerrar","cerrar","Salir"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarLunaSistemaSolar=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarLunaSistemaSolar;
			
				this.jButtonProcesarInformacionToolBarLunaSistemaSolar=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarLunaSistemaSolar;
				
		//protected JButton jButtonModificarToolBarLunaSistemaSolar;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarLunaSistemaSolar=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuLunaSistemaSolar=new JMenuMe("General");
		this.jmenuArchivoLunaSistemaSolar=new JMenuMe("Archivo");
		this.jmenuAccionesLunaSistemaSolar=new JMenuMe("Acciones");
		this.jmenuDatosLunaSistemaSolar=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLunaSistemaSolar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLunaSistemaSolar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLunaSistemaSolar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarLunaSistemaSolar= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarLunaSistemaSolar.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarLunaSistemaSolar,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesLunaSistemaSolar= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesLunaSistemaSolar.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesLunaSistemaSolar,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosLunaSistemaSolar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLunaSistemaSolar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLunaSistemaSolar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarLunaSistemaSolar= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarLunaSistemaSolar.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarLunaSistemaSolar,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormLunaSistemaSolar= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormLunaSistemaSolar.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormLunaSistemaSolar,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaLunaSistemaSolar= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaLunaSistemaSolar.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaLunaSistemaSolar,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLunaSistemaSolar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLunaSistemaSolar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLunaSistemaSolar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionLunaSistemaSolar= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionLunaSistemaSolar.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionLunaSistemaSolar,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionLunaSistemaSolar= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionLunaSistemaSolar.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionLunaSistemaSolar,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresLunaSistemaSolar= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresLunaSistemaSolar.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresLunaSistemaSolar,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesLunaSistemaSolar= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesLunaSistemaSolar.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesLunaSistemaSolar,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByLunaSistemaSolar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByLunaSistemaSolar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByLunaSistemaSolar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLunaSistemaSolar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLunaSistemaSolar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLunaSistemaSolar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByLunaSistemaSolar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByLunaSistemaSolar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByLunaSistemaSolar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLunaSistemaSolar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLunaSistemaSolar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLunaSistemaSolar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosLunaSistemaSolar= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosLunaSistemaSolar.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosLunaSistemaSolar,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoLunaSistemaSolar.add(this.jMenuItemCerrarLunaSistemaSolar);
			
			this.jmenuAccionesLunaSistemaSolar.add(this.jMenuItemNuevoLunaSistemaSolar);
			this.jmenuAccionesLunaSistemaSolar.add(this.jMenuItemNuevoGuardarCambiosLunaSistemaSolar);
			this.jmenuAccionesLunaSistemaSolar.add(this.jMenuItemNuevoRelacionesLunaSistemaSolar);
			this.jmenuAccionesLunaSistemaSolar.add(this.jMenuItemGuardarCambiosTablaLunaSistemaSolar);		
			this.jmenuAccionesLunaSistemaSolar.add(this.jMenuItemDuplicarLunaSistemaSolar);		
			this.jmenuAccionesLunaSistemaSolar.add(this.jMenuItemCopiarLunaSistemaSolar);		
			this.jmenuAccionesLunaSistemaSolar.add(this.jMenuItemVerFormLunaSistemaSolar);		
			
			this.jmenuDatosLunaSistemaSolar.add(this.jMenuItemRecargarInformacionLunaSistemaSolar);				
			this.jmenuDatosLunaSistemaSolar.add(this.jMenuItemAnterioresLunaSistemaSolar);				
			this.jmenuDatosLunaSistemaSolar.add(this.jMenuItemSiguientesLunaSistemaSolar);				
			this.jmenuDatosLunaSistemaSolar.add(this.jMenuItemAbrirOrderByLunaSistemaSolar);				
			this.jmenuDatosLunaSistemaSolar.add(this.jMenuItemMostrarOcultarLunaSistemaSolar);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesLunaSistemaSolar.add(this.jMenuItemGuardarCambiosLunaSistemaSolar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarLunaSistemaSolar.add(this.jmenuArchivoLunaSistemaSolar);		
			this.jmenuBarLunaSistemaSolar.add(this.jmenuAccionesLunaSistemaSolar);		
			this.jmenuBarLunaSistemaSolar.add(this.jmenuDatosLunaSistemaSolar);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarLunaSistemaSolar);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasLunaSistemaSolar() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoValoracionLunaSistemaSolar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoValoracionLunaSistemaSolar.setToolTipText("Buscar Por Idtipo Valoracion ");
		this.jButtonFK_IdTipoValoracionLunaSistemaSolar= new JButtonMe();
		this.jButtonFK_IdTipoValoracionLunaSistemaSolar.setText("Buscar");
		this.jButtonFK_IdTipoValoracionLunaSistemaSolar.setToolTipText("Buscar Por Idtipo Valoracion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoValoracionLunaSistemaSolar,"buscar_button","Buscar Por Idtipo Valoracion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoValoracionLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar = new JLabelMe();
		jLabelid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.setText("Idtipo Valoracion :");
		jLabelid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.setToolTipText("Idtipo Valoracion");
		jLabelid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar= new JComboBoxMe();
		jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasLunaSistemaSolar=new JTabbedPane();


		this.jTabbedPaneBusquedasLunaSistemaSolar.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLunaSistemaSolar.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLunaSistemaSolar.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasLunaSistemaSolar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleLunaSistemaSolar = new LunaSistemaSolarDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Luna Sistema Solar DATOS");
			this.jInternalFrameDetalleFormLunaSistemaSolar = new LunaSistemaSolarDetalleFormJInternalFrame(jDesktopPane,this.lunasistemasolarSessionBean.getConGuardarRelaciones(),this.lunasistemasolarSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormLunaSistemaSolar = null;//new LunaSistemaSolarDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLunaSistemaSolar= new GridBagLayout();
		
		
		this.jTableDatosLunaSistemaSolar = new JTableMe();      
		
		String sToolTipLunaSistemaSolar="";
		sToolTipLunaSistemaSolar=LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLunaSistemaSolar+="(Seguridad.LunaSistemaSolar)";
		}
		
		if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
			sToolTipLunaSistemaSolar+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosLunaSistemaSolar.setToolTipText(sToolTipLunaSistemaSolar);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosLunaSistemaSolar);
		this.jTableDatosLunaSistemaSolar.setAutoCreateRowSorter(true);
		this.jTableDatosLunaSistemaSolar.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosLunaSistemaSolar.setRowSelectionAllowed(true);
		this.jTableDatosLunaSistemaSolar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoLunaSistemaSolar = new JButtonMe();
		this.jButtonDuplicarLunaSistemaSolar = new JButtonMe();
		this.jButtonCopiarLunaSistemaSolar = new JButtonMe();
		this.jButtonVerFormLunaSistemaSolar = new JButtonMe();
		this.jButtonNuevoRelacionesLunaSistemaSolar = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaLunaSistemaSolar = new JButtonMe();
		this.jButtonCerrarLunaSistemaSolar = new JButtonMe();
		
		this.jScrollPanelDatosLunaSistemaSolar = new JScrollPane();   
        this.jScrollPanelDatosGeneralLunaSistemaSolar = new JScrollPane();
		
				
		
		
		this.jPanelAccionesLunaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Luna Sistema Solar";
		
		if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Luna Sistema Solares" + this.sPath));
		} else {
			this.jScrollPanelDatosLunaSistemaSolar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLunaSistemaSolar.setToolTipText("Acciones");
        this.jPanelAccionesLunaSistemaSolar.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoLunaSistemaSolar=new ReporteDinamicoJInternalFrame(LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoLunaSistemaSolar();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionLunaSistemaSolar=new ImportacionJInternalFrame(LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionLunaSistemaSolar();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByLunaSistemaSolar = new JButtonMe();
		
		this.jButtonAbrirOrderByLunaSistemaSolar.setText("Orden");
		this.jButtonAbrirOrderByLunaSistemaSolar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLunaSistemaSolar,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByLunaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLunaSistemaSolar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLunaSistemaSolar,false,this);
			
			//this.cargarOrderByLunaSistemaSolar(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLunaSistemaSolar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLunaSistemaSolar,true,this);
			
			//this.cargarOrderByLunaSistemaSolar(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosLunaSistemaSolar.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosLunaSistemaSolar.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosLunaSistemaSolar.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosLunaSistemaSolar.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosLunaSistemaSolar.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosLunaSistemaSolar.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoLunaSistemaSolar.setText("Nuevo");
		this.jButtonDuplicarLunaSistemaSolar.setText("Duplicar");
		this.jButtonCopiarLunaSistemaSolar.setText("Copiar");
		this.jButtonVerFormLunaSistemaSolar.setText("Ver");
		this.jButtonNuevoRelacionesLunaSistemaSolar.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaLunaSistemaSolar.setText("Guardar");
		this.jButtonCerrarLunaSistemaSolar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLunaSistemaSolar,"nuevo_button","Nuevo",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarLunaSistemaSolar,"duplicar_button","Duplicar",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarLunaSistemaSolar,"copiar_button","Copiar",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormLunaSistemaSolar,"ver_form","Ver",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesLunaSistemaSolar,"nuevorelaciones_button","Nuevo Rel",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLunaSistemaSolar,"guardarcambiostabla_button","Guardar",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLunaSistemaSolar,"cerrar_button","Salir",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoLunaSistemaSolar.setToolTipText("Nuevo"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarLunaSistemaSolar.setToolTipText("Duplicar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarLunaSistemaSolar.setToolTipText("Copiar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormLunaSistemaSolar.setToolTipText("Ver"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesLunaSistemaSolar.setToolTipText("Nuevo Rel"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaLunaSistemaSolar.setToolTipText("Guardar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLunaSistemaSolar.setToolTipText("Salir"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoLunaSistemaSolar";
		inputMap = this.jButtonNuevoLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLunaSistemaSolar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLunaSistemaSolar"));
		
		//DUPLICAR
		sMapKey = "DuplicarLunaSistemaSolar";
		inputMap = this.jButtonDuplicarLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarLunaSistemaSolar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarLunaSistemaSolar"));
		
		//COPIAR
		sMapKey = "CopiarLunaSistemaSolar";
		inputMap = this.jButtonCopiarLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarLunaSistemaSolar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarLunaSistemaSolar"));
		
		//VEr FORM
		sMapKey = "VerFormLunaSistemaSolar";
		inputMap = this.jButtonVerFormLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormLunaSistemaSolar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormLunaSistemaSolar"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesLunaSistemaSolar";
		inputMap = this.jButtonNuevoRelacionesLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesLunaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesLunaSistemaSolar"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarLunaSistemaSolar";
		inputMap = this.jButtonModificarLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarLunaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarLunaSistemaSolar"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarLunaSistemaSolar";
		inputMap = this.jButtonCerrarLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLunaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLunaSistemaSolar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLunaSistemaSolar";
		inputMap = this.jButtonGuardarCambiosTablaLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLunaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLunaSistemaSolar"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesLunaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesLunaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionLunaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1LunaSistemaSolar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2LunaSistemaSolar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3LunaSistemaSolar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4LunaSistemaSolar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5LunaSistemaSolar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesLunaSistemaSolar.setName("jPanelParametrosReportesLunaSistemaSolar"); 
		
		this.jPanelParametrosReportesAccionesLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesLunaSistemaSolar.setName("jPanelParametrosReportesAccionesLunaSistemaSolar"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionLunaSistemaSolar = new JButtonMe();
		this.jButtonRecargarInformacionLunaSistemaSolar.setText("Recargar");
		this.jButtonRecargarInformacionLunaSistemaSolar.setToolTipText("Recargar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionLunaSistemaSolar,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionLunaSistemaSolar = new JButtonMe();
		this.jButtonProcesarInformacionLunaSistemaSolar.setText("Procesar");
		this.jButtonProcesarInformacionLunaSistemaSolar.setToolTipText("Procesar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionLunaSistemaSolar.setVisible(false);
			
		this.jButtonProcesarInformacionLunaSistemaSolar.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLunaSistemaSolar.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLunaSistemaSolar.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesLunaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLunaSistemaSolar.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesLunaSistemaSolar.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesLunaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLunaSistemaSolar.setText("TIPO");       
		this.jComboBoxTiposReportesLunaSistemaSolar.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesLunaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLunaSistemaSolar.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesLunaSistemaSolar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionLunaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionLunaSistemaSolar.setText("Paginacion");
		this.jComboBoxTiposPaginacionLunaSistemaSolar.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesLunaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesLunaSistemaSolar.setText("Accion");
		this.jComboBoxTiposRelacionesLunaSistemaSolar.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesLunaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLunaSistemaSolar.setText("Accion");
		this.jComboBoxTiposAccionesLunaSistemaSolar.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarLunaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarLunaSistemaSolar.setText("Accion");
		this.jComboBoxTiposSeleccionarLunaSistemaSolar.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralLunaSistemaSolar=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralLunaSistemaSolar.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLunaSistemaSolar.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLunaSistemaSolar.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesLunaSistemaSolar = new JLabelMe();
		
		this.jLabelAccionesLunaSistemaSolar.setText("Acciones");		
		this.jLabelAccionesLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosLunaSistemaSolar = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosLunaSistemaSolar.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosLunaSistemaSolar.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosLunaSistemaSolar = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosLunaSistemaSolar.setText("Seleccionados");
		this.jCheckBoxSeleccionadosLunaSistemaSolar.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaLunaSistemaSolar = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaLunaSistemaSolar.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaLunaSistemaSolar.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteLunaSistemaSolar = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteLunaSistemaSolar.setText("Graf.");
		this.jCheckBoxConGraficoReporteLunaSistemaSolar.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresLunaSistemaSolar = new JButtonMe();
		//this.jButtonAnterioresLunaSistemaSolar.setText("<<");
        this.jButtonAnterioresLunaSistemaSolar.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresLunaSistemaSolar,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesLunaSistemaSolar = new JButtonMe();
		//this.jButtonSiguientesLunaSistemaSolar.setText(">>");
        this.jButtonSiguientesLunaSistemaSolar.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesLunaSistemaSolar,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosLunaSistemaSolar = new JButtonMe();
		this.jButtonNuevoGuardarCambiosLunaSistemaSolar.setText("Nue");
        this.jButtonNuevoGuardarCambiosLunaSistemaSolar.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosLunaSistemaSolar,"nuevoguardarcambios_button","Nue",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosLunaSistemaSolar";
		inputMap = this.jButtonNuevoGuardarCambiosLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosLunaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosLunaSistemaSolar"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionLunaSistemaSolar";
		inputMap = this.jButtonRecargarInformacionLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionLunaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionLunaSistemaSolar"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesLunaSistemaSolar";
		inputMap = this.jButtonSiguientesLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesLunaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesLunaSistemaSolar"));
		
		//ANTERIORES		
		sMapKey = "AnterioresLunaSistemaSolar";
		inputMap = this.jButtonAnterioresLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresLunaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresLunaSistemaSolar"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasLunaSistemaSolar();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesLunaSistemaSolar.setMinimumSize(new Dimension(this.getWidth(),LunaSistemaSolarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LunaSistemaSolarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLunaSistemaSolar.setMaximumSize(new Dimension(this.getWidth(),LunaSistemaSolarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LunaSistemaSolarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLunaSistemaSolar.setPreferredSize(new Dimension(this.getWidth(),LunaSistemaSolarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LunaSistemaSolarBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionLunaSistemaSolar = new GridBagLayout();

			this.jPanelPaginacionLunaSistemaSolar.setLayout(gridaBagLayoutPaginacionLunaSistemaSolar);						
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
			this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionLunaSistemaSolar.add(this.jButtonAnterioresLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
					
						
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
			
			this.jPanelPaginacionLunaSistemaSolar.add(this.jButtonNuevoGuardarCambiosLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
						
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
			this.jPanelPaginacionLunaSistemaSolar.add(this.jButtonSiguientesLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.gridy = 1;
			this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLunaSistemaSolar.add(this.jButtonNuevoLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
						
			
			
			if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
				this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsLunaSistemaSolar.gridy = 1;
				this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionLunaSistemaSolar.add(this.jButtonGuardarCambiosTablaLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
			}
			
			
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.gridy = 1;
			this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLunaSistemaSolar.add(this.jButtonDuplicarLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.gridy = 1;
			this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLunaSistemaSolar.add(this.jButtonCopiarLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.gridy = 1;
			this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLunaSistemaSolar.add(this.jButtonVerFormLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.gridy = 1;
			this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionLunaSistemaSolar.add(this.jButtonCerrarLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		
		
		
		this.jButtonRecargarInformacionLunaSistemaSolar.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLunaSistemaSolar.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLunaSistemaSolar.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesLunaSistemaSolar.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLunaSistemaSolar.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLunaSistemaSolar.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesLunaSistemaSolar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLunaSistemaSolar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLunaSistemaSolar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesLunaSistemaSolar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLunaSistemaSolar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLunaSistemaSolar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionLunaSistemaSolar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLunaSistemaSolar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLunaSistemaSolar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesLunaSistemaSolar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLunaSistemaSolar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLunaSistemaSolar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesLunaSistemaSolar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLunaSistemaSolar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLunaSistemaSolar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarLunaSistemaSolar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLunaSistemaSolar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLunaSistemaSolar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaLunaSistemaSolar.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLunaSistemaSolar.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLunaSistemaSolar.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteLunaSistemaSolar.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLunaSistemaSolar.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLunaSistemaSolar.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosLunaSistemaSolar.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLunaSistemaSolar.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLunaSistemaSolar.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosLunaSistemaSolar.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLunaSistemaSolar.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLunaSistemaSolar.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesLunaSistemaSolar = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesLunaSistemaSolar = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1LunaSistemaSolar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2LunaSistemaSolar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3LunaSistemaSolar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4LunaSistemaSolar = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesLunaSistemaSolar.setLayout(gridaBagParametrosReportesLunaSistemaSolar);
			this.jPanelParametrosReportesAccionesLunaSistemaSolar.setLayout(gridaBagParametrosReportesAccionesLunaSistemaSolar);
			
			
			this.jPanelParametrosAuxiliar1LunaSistemaSolar.setLayout(gridaBagParametrosAuxiliar1LunaSistemaSolar);
			this.jPanelParametrosAuxiliar2LunaSistemaSolar.setLayout(gridaBagParametrosAuxiliar2LunaSistemaSolar);
			this.jPanelParametrosAuxiliar3LunaSistemaSolar.setLayout(gridaBagParametrosAuxiliar3LunaSistemaSolar);
			this.jPanelParametrosAuxiliar4LunaSistemaSolar.setLayout(gridaBagParametrosAuxiliar4LunaSistemaSolar);
			//this.jPanelParametrosAuxiliar5LunaSistemaSolar.setLayout(gridaBagParametrosAuxiliar2LunaSistemaSolar);			
			
			
			
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLunaSistemaSolar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLunaSistemaSolar.add(this.jButtonRecargarInformacionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LunaSistemaSolar.add(this.jComboBoxTiposPaginacionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LunaSistemaSolar.add(this.jCheckBoxConAltoMaximoTablaLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LunaSistemaSolar.add(this.jComboBoxTiposArchivosReportesLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLunaSistemaSolar.add(this.jPanelParametrosAuxiliar1LunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLunaSistemaSolar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4LunaSistemaSolar.add(this.jComboBoxTiposReportesLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLunaSistemaSolar.add(this.jPanelParametrosAuxiliar4LunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLunaSistemaSolar.add(this.jComboBoxTiposReportesLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLunaSistemaSolar.add(this.jCheckBoxGenerarReporteLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLunaSistemaSolar.add(this.jPanelParametrosAuxiliar2LunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLunaSistemaSolar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLunaSistemaSolar.add(this.jLabelAccionesLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
				this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsLunaSistemaSolar.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesLunaSistemaSolar.add(this.jButtonAbrirOrderByLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLunaSistemaSolar.add(this.jComboBoxTiposSeleccionarLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);			
			
			
			/*
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLunaSistemaSolar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLunaSistemaSolar.add(this.jCheckBoxSeleccionarTodosLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLunaSistemaSolar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LunaSistemaSolar.add(this.jCheckBoxSeleccionarTodosLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);															
				
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLunaSistemaSolar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LunaSistemaSolar.add(this.jCheckBoxSeleccionadosLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLunaSistemaSolar.add(this.jPanelParametrosAuxiliar3LunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLunaSistemaSolar.add(this.jComboBoxTiposAccionesLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosLunaSistemaSolar = new GridBagLayout();

			this.jScrollPanelDatosLunaSistemaSolar.setLayout(gridaBagLayoutDatosLunaSistemaSolar);
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
			this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
			
			this.jScrollPanelDatosLunaSistemaSolar.add(this.jTableDatosLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosLunaSistemaSolar.setViewportView(this.jTableDatosLunaSistemaSolar);
		this.jTableDatosLunaSistemaSolar.setFillsViewportHeight(true);
		this.jTableDatosLunaSistemaSolar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesLunaSistemaSolar= new GridBagLayout();
		this.jPanelAccionesLunaSistemaSolar.setLayout(gridaBagLayoutAccionesLunaSistemaSolar);
		
		
		/*	
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
		this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
			
		this.jPanelAccionesLunaSistemaSolar.add(this.jButtonNuevoLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoValoracionLunaSistemaSolar= new GridBagLayout();
		gridaBagLayoutFK_IdTipoValoracionLunaSistemaSolar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoValoracionLunaSistemaSolar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoValoracionLunaSistemaSolar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoValoracionLunaSistemaSolar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoValoracionLunaSistemaSolar.setLayout(gridaBagLayoutFK_IdTipoValoracionLunaSistemaSolar);

		gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLunaSistemaSolar.gridy = 0;
		gridBagConstraintsLunaSistemaSolar.gridx = 0;
		jPanelFK_IdTipoValoracionLunaSistemaSolar.add(jLabelid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar, gridBagConstraintsLunaSistemaSolar);

		gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLunaSistemaSolar.gridy = 0;
		gridBagConstraintsLunaSistemaSolar.gridx = 1;
		jPanelFK_IdTipoValoracionLunaSistemaSolar.add(jComboBoxid_tipo_valoracionFK_IdTipoValoracionLunaSistemaSolar, gridBagConstraintsLunaSistemaSolar);

		gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLunaSistemaSolar.gridy = 1;
		gridBagConstraintsLunaSistemaSolar.gridx =1;
		jPanelFK_IdTipoValoracionLunaSistemaSolar.add(jButtonFK_IdTipoValoracionLunaSistemaSolar, gridBagConstraintsLunaSistemaSolar);

		jTabbedPaneBusquedasLunaSistemaSolar.addTab("1.-Por Idtipo Valoracion ", jPanelFK_IdTipoValoracionLunaSistemaSolar);
		jTabbedPaneBusquedasLunaSistemaSolar.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLunaSistemaSolar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLunaSistemaSolar);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();						
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLunaSistemaSolar.gridx = 0;		
			//this.gridBagConstraintsLunaSistemaSolar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLunaSistemaSolar.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyPrincipal++;
		this.gridBagConstraintsLunaSistemaSolar.gridx = 0;		
		//this.gridBagConstraintsLunaSistemaSolar.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsLunaSistemaSolar.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsLunaSistemaSolar);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLunaSistemaSolar.gridx = 0;		
			this.gridBagConstraintsLunaSistemaSolar.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsLunaSistemaSolar.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);								
		
		
		/*
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		*/		
		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLunaSistemaSolar.gridx =0;
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLunaSistemaSolar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
				
		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(LunaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosLunaSistemaSolar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLunaSistemaSolar = new GridBagLayout();
			this.jPanelBusquedasParametrosLunaSistemaSolar.setLayout(gridaBagLayoutBusquedasParametrosLunaSistemaSolar);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralLunaSistemaSolar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLunaSistemaSolar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLunaSistemaSolar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLunaSistemaSolar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
			
			
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		
			
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLunaSistemaSolar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralLunaSistemaSolar;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoLunaSistemaSolar() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoLunaSistemaSolar = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoLunaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoLunaSistemaSolar.setName("jPanelReporteDinamicoLunaSistemaSolar"); 
		
		this.jPanelReporteDinamicoLunaSistemaSolar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLunaSistemaSolar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLunaSistemaSolar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoLunaSistemaSolar.setLayout(gridaBagLayoutReporteDinamicoLunaSistemaSolar);
		
		
		this.jInternalFrameReporteDinamicoLunaSistemaSolar= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoLunaSistemaSolar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLunaSistemaSolar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoLunaSistemaSolar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoLunaSistemaSolar.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoLunaSistemaSolar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoLunaSistemaSolar.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoLunaSistemaSolar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoLunaSistemaSolar.setResizable(true);
	    this.jInternalFrameReporteDinamicoLunaSistemaSolar.setClosable(true);
	    this.jInternalFrameReporteDinamicoLunaSistemaSolar.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoLunaSistemaSolar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLunaSistemaSolar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLunaSistemaSolar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Luna Sistema Solares"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteLunaSistemaSolar = new JLabelMe();

		this.jLabelColumnasSelectReporteLunaSistemaSolar.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLunaSistemaSolar.add(this.jLabelColumnasSelectReporteLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteLunaSistemaSolar = new JList<Reporte>();
		this.jListColumnasSelectReporteLunaSistemaSolar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteLunaSistemaSolar.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteLunaSistemaSolar.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLunaSistemaSolar.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLunaSistemaSolar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteLunaSistemaSolar=new JScrollPane(this.jListColumnasSelectReporteLunaSistemaSolar);
			
			this.jScrollColumnasSelectReporteLunaSistemaSolar.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLunaSistemaSolar.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLunaSistemaSolar.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoLunaSistemaSolar.add(this.jListColumnasSelectReporteLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		this.jPanelReporteDinamicoLunaSistemaSolar.add(this.jScrollColumnasSelectReporteLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteLunaSistemaSolar = new JLabelMe();

		this.jLabelRelacionesSelectReporteLunaSistemaSolar.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteLunaSistemaSolar = new JList<Reporte>();
		this.jListRelacionesSelectReporteLunaSistemaSolar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteLunaSistemaSolar.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteLunaSistemaSolar.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLunaSistemaSolar.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLunaSistemaSolar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteLunaSistemaSolar=new JScrollPane(this.jListRelacionesSelectReporteLunaSistemaSolar);
			
			this.jScrollRelacionesSelectReporteLunaSistemaSolar.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLunaSistemaSolar.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLunaSistemaSolar.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoLunaSistemaSolar = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoLunaSistemaSolar = new JComboBoxMe();
		this.jListColumnasValoresGraficoLunaSistemaSolar = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoLunaSistemaSolar = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoLunaSistemaSolar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoLunaSistemaSolar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLunaSistemaSolar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLunaSistemaSolar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoLunaSistemaSolar = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoLunaSistemaSolar.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoLunaSistemaSolar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLunaSistemaSolar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLunaSistemaSolar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoLunaSistemaSolar = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoLunaSistemaSolar.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLunaSistemaSolar.add(this.jLabelGenerarExcelReporteDinamicoLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoLunaSistemaSolar = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoLunaSistemaSolar.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoLunaSistemaSolar,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoLunaSistemaSolar.setToolTipText("Generar EXCEL"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		//this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoLunaSistemaSolar.add(this.jButtonGenerarExcelReporteDinamicoLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLunaSistemaSolar.add(this.jComboBoxTiposReportesDinamicoLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoLunaSistemaSolar = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoLunaSistemaSolar.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLunaSistemaSolar.add(this.jLabelTiposArchivoReporteDinamicoLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLunaSistemaSolar.add(this.jComboBoxTiposArchivosReportesDinamicoLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoLunaSistemaSolar = new JButtonMe();
		this.jButtonGenerarReporteDinamicoLunaSistemaSolar.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoLunaSistemaSolar,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoLunaSistemaSolar.setToolTipText("Generar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLunaSistemaSolar.add(this.jButtonGenerarReporteDinamicoLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoLunaSistemaSolar = new JButtonMe();
		this.jButtonCerrarReporteDinamicoLunaSistemaSolar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoLunaSistemaSolar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoLunaSistemaSolar.setToolTipText("Cancelar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLunaSistemaSolar.add(this.jButtonCerrarReporteDinamicoLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalLunaSistemaSolar = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoLunaSistemaSolar= new JScrollPane(jPanelReporteDinamicoLunaSistemaSolar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoLunaSistemaSolar.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLunaSistemaSolar.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLunaSistemaSolar.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Luna Sistema Solares"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsLunaSistemaSolar.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoLunaSistemaSolar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoLunaSistemaSolar.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalLunaSistemaSolar);
		this.jInternalFrameReporteDinamicoLunaSistemaSolar.getContentPane().add(this.jScrollPanelReporteDinamicoLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionLunaSistemaSolar() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionLunaSistemaSolar = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionLunaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionLunaSistemaSolar.setName("jPanelImportacionLunaSistemaSolar"); 
		
		this.jPanelImportacionLunaSistemaSolar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLunaSistemaSolar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLunaSistemaSolar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionLunaSistemaSolar.setLayout(gridaBagLayoutImportacionLunaSistemaSolar);
		
		
		this.jInternalFrameImportacionLunaSistemaSolar= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionLunaSistemaSolar= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionLunaSistemaSolar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLunaSistemaSolar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionLunaSistemaSolar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLunaSistemaSolar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLunaSistemaSolar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionLunaSistemaSolar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLunaSistemaSolar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLunaSistemaSolar.setResizable(true);
	    this.jInternalFrameImportacionLunaSistemaSolar.setClosable(true);
	    this.jInternalFrameImportacionLunaSistemaSolar.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionLunaSistemaSolar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLunaSistemaSolar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLunaSistemaSolar.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionLunaSistemaSolar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLunaSistemaSolar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLunaSistemaSolar.setResizable(true);
	    this.jInternalFrameImportacionLunaSistemaSolar.setClosable(true);
	    this.jInternalFrameImportacionLunaSistemaSolar.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionLunaSistemaSolar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLunaSistemaSolar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLunaSistemaSolar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Luna Sistema Solares"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionLunaSistemaSolar = new JLabelMe();

		this.jLabelArchivoImportacionLunaSistemaSolar.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYImportacion;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLunaSistemaSolar.add(this.jLabelArchivoImportacionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionLunaSistemaSolar = new JFileChooser();		
		this.jFileChooserImportacionLunaSistemaSolar.setToolTipText("ESCOGER ARCHIVO"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionLunaSistemaSolar = new JButtonMe();
		this.jButtonAbrirImportacionLunaSistemaSolar.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionLunaSistemaSolar,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionLunaSistemaSolar.setToolTipText("Generar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYImportacion;
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLunaSistemaSolar.add(this.jButtonAbrirImportacionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionLunaSistemaSolar = new JLabelMe();

		this.jLabelPathArchivoImportacionLunaSistemaSolar.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYImportacion;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLunaSistemaSolar.add(this.jLabelPathArchivoImportacionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionLunaSistemaSolar=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionLunaSistemaSolar.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLunaSistemaSolar.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLunaSistemaSolar.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYImportacion;
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLunaSistemaSolar.add(this.jTextFieldPathArchivoImportacionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionLunaSistemaSolar = new JButtonMe();
		this.jButtonGenerarImportacionLunaSistemaSolar.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionLunaSistemaSolar,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionLunaSistemaSolar.setToolTipText("Generar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYImportacion;
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLunaSistemaSolar.add(this.jButtonGenerarImportacionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionLunaSistemaSolar = new JButtonMe();
		this.jButtonCerrarImportacionLunaSistemaSolar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionLunaSistemaSolar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionLunaSistemaSolar.setToolTipText("Cancelar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYImportacion;
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLunaSistemaSolar.add(this.jButtonCerrarImportacionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalLunaSistemaSolar = new GridBagLayout();
		
		this.jScrollPanelImportacionLunaSistemaSolar= new JScrollPane(jPanelImportacionLunaSistemaSolar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy =iPosYImportacion;
		this.gridBagConstraintsLunaSistemaSolar.gridx =iPosXImportacion;
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionLunaSistemaSolar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionLunaSistemaSolar.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalLunaSistemaSolar);
		this.jInternalFrameImportacionLunaSistemaSolar.getContentPane().add(this.jScrollPanelImportacionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByLunaSistemaSolar(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByLunaSistemaSolar = new JButtonMe();
			this.jButtonAbrirOrderByLunaSistemaSolar.setText("Orden");
			this.jButtonAbrirOrderByLunaSistemaSolar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLunaSistemaSolar,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByLunaSistemaSolar";
			inputMap = this.jButtonAbrirOrderByLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByLunaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByLunaSistemaSolar"));
		
		
			GridBagLayout gridaBagLayoutOrderByLunaSistemaSolar = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByLunaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByLunaSistemaSolar.setName("jPanelOrderByLunaSistemaSolar"); 
			
			this.jPanelOrderByLunaSistemaSolar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLunaSistemaSolar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLunaSistemaSolar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByLunaSistemaSolar.setLayout(gridaBagLayoutOrderByLunaSistemaSolar);
			
			
			this.jTableDatosLunaSistemaSolarOrderBy = new JTableMe();        
			this.jTableDatosLunaSistemaSolarOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosLunaSistemaSolarOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosLunaSistemaSolarOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosLunaSistemaSolarOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosLunaSistemaSolarOrderBy.setViewportView(this.jTableDatosLunaSistemaSolarOrderBy);
			this.jTableDatosLunaSistemaSolarOrderBy.setFillsViewportHeight(true);
			this.jTableDatosLunaSistemaSolarOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByLunaSistemaSolar= new OrderByJInternalFrame();
			this.jInternalFrameOrderByLunaSistemaSolar= new OrderByJInternalFrame();
			this.jScrollPanelOrderByLunaSistemaSolar = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteLunaSistemaSolar= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByLunaSistemaSolar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByLunaSistemaSolar.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByLunaSistemaSolar.setTitle("Orden");
			this.jInternalFrameOrderByLunaSistemaSolar.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByLunaSistemaSolar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByLunaSistemaSolar.setResizable(true);
			this.jInternalFrameOrderByLunaSistemaSolar.setClosable(true);
			this.jInternalFrameOrderByLunaSistemaSolar.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByLunaSistemaSolar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLunaSistemaSolar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLunaSistemaSolar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Luna Sistema Solares"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.gridy =iPosYOrderBy++;
			this.gridBagConstraintsLunaSistemaSolar.gridx =iPosXOrderBy;
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsLunaSistemaSolar.ipady =150;
				
			this.jPanelOrderByLunaSistemaSolar.add(jScrollPanelDatosLunaSistemaSolarOrderBy, this.gridBagConstraintsLunaSistemaSolar);//this.jTableDatosLunaSistemaSolarTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByLunaSistemaSolar = new JButtonMe();
			this.jButtonCerrarOrderByLunaSistemaSolar.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByLunaSistemaSolar,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByLunaSistemaSolar.setToolTipText("Cancelar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.gridy = iPosYOrderBy++;
			this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXOrderBy;
									
			this.jPanelOrderByLunaSistemaSolar.add(this.jButtonCerrarOrderByLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalLunaSistemaSolar = new GridBagLayout();
			
			this.jScrollPanelOrderByLunaSistemaSolar= new JScrollPane(jPanelOrderByLunaSistemaSolar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.gridy =iPosYOrderBy;
			this.gridBagConstraintsLunaSistemaSolar.gridx =iPosXOrderBy;
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByLunaSistemaSolar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByLunaSistemaSolar.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalLunaSistemaSolar);
			
			this.jInternalFrameOrderByLunaSistemaSolar.getContentPane().add(this.jScrollPanelOrderByLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);			
		
		} else {
			this.jButtonAbrirOrderByLunaSistemaSolar = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.lunasistemasolarSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosLunaSistemaSolar.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosLunaSistemaSolar.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosLunaSistemaSolar.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosLunaSistemaSolar.getRowHeight();//LunaSistemaSolarConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > LunaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLunaSistemaSolar.isSelected()) {
					iHeightTable=LunaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LunaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LunaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > LunaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLunaSistemaSolar.isSelected()) {
					iHeightTable=LunaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LunaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LunaSistemaSolarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosLunaSistemaSolar.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLunaSistemaSolar.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLunaSistemaSolar.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosLunaSistemaSolar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLunaSistemaSolar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLunaSistemaSolar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByLunaSistemaSolar!=null && this.jInternalFrameOrderByLunaSistemaSolar.getjTableDatosOrderBy()!=null) {
			//if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByLunaSistemaSolar.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByLunaSistemaSolar.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByLunaSistemaSolar.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByLunaSistemaSolar.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByLunaSistemaSolar.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByLunaSistemaSolar.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByLunaSistemaSolar.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosLunaSistemaSolar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLunaSistemaSolar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLunaSistemaSolar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=lunasistemasolarLogic.getLunaSistemaSolars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=lunasistemasolars.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<LunaSistemaSolar> TraerLunaSistemaSolarBeans(List<LunaSistemaSolar> lunasistemasolars,ArrayList<Classe> classes)throws Exception {
		try {
			for(LunaSistemaSolar lunasistemasolar:lunasistemasolars) {
					
				if(!(LunaSistemaSolarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || LunaSistemaSolarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					lunasistemasolar.setsDetalleGeneralEntityReporte(LunaSistemaSolarConstantesFunciones.getLunaSistemaSolarDescripcion(lunasistemasolar));
										
						
					
						
					
				} else  {
							
					//lunasistemasolar.setsDetalleGeneralEntityReporte(lunasistemasolar.getsDetalleGeneralEntityReporte());
										
				}
				
				//lunasistemasolarbeans.add(lunasistemasolarbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return lunasistemasolars;
    }
	//PARA REPORTES FIN
}
