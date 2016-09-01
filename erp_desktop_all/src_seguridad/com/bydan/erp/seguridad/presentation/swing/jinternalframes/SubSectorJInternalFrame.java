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
import com.bydan.erp.seguridad.util.SubSectorConstantesFunciones;

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
public class SubSectorJInternalFrame extends SubSectorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSubSector;
	
	protected JMenuBar jmenuBarSubSector;
	
	protected JMenu jmenuSubSector;
	protected JMenu jmenuDatosSubSector;
	protected JMenu jmenuArchivoSubSector;
	protected JMenu jmenuAccionesSubSector;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSubSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSubSector;	
	protected GridBagConstraints gridBagConstraintsSubSector;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SubSectorDetalleFormJInternalFrame jInternalFrameDetalleFormSubSector;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSubSector;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSubSector;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SectorBeanSwingJInternalFrame sectorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sector="";
	
	public SubSectorSessionBean subsectorSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SectorSessionBean sectorSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SubSector> subsectors;		
	public List<SubSector> subsectorsEliminados;	
	public List<SubSector> subsectorsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySubSector;		
	protected JButton jButtonAbrirOrderBySubSector;
	
	
	//protected JPanel jPanelOrderBySubSector;
	//public JScrollPane jScrollPanelOrderBySubSector;	
	//protected JButton jButtonCerrarOrderBySubSector;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SubSectorLogic subsectorLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSubSector;
	public JScrollPane jScrollPanelDatosEdicionSubSector;
	public JScrollPane jScrollPanelDatosGeneralSubSector;
    
	
	
	//public JScrollPane jScrollPanelDatosSubSectorOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSubSector;
	//public JScrollPane jScrollPanelImportacionSubSector;
	
	
	
	protected JPanel jPanelAccionesSubSector;
	
    protected JPanel jPanelPaginacionSubSector;
    protected JPanel jPanelParametrosReportesSubSector;
	protected JPanel jPanelParametrosReportesAccionesSubSector;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SubSector;
	protected JPanel jPanelParametrosAuxiliar2SubSector;
	protected JPanel jPanelParametrosAuxiliar3SubSector;
	protected JPanel jPanelParametrosAuxiliar4SubSector;
	//protected JPanel jPanelParametrosAuxiliar5SubSector;
	
	
	
	//protected JPanel jPanelReporteDinamicoSubSector;
	//protected JPanel jPanelImportacionSubSector;
	
	
	public JTable jTableDatosSubSector;
	
	
	
	//public JTable jTableDatosSubSectorOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSubSector;
	protected JButton jButtonDuplicarSubSector;
	protected JButton jButtonCopiarSubSector;
	protected JButton jButtonVerFormSubSector;
	protected JButton jButtonNuevoRelacionesSubSector;
	protected JButton jButtonModificarSubSector;
	
    protected JButton jButtonGuardarCambiosTablaSubSector;
	protected JButton jButtonCerrarSubSector;
	
	
	protected JButton jButtonRecargarInformacionSubSector;
	protected JButton jButtonProcesarInformacionSubSector;
	
	
	protected JButton jButtonAnterioresSubSector;
	protected JButton jButtonSiguientesSubSector;
	protected JButton jButtonNuevoGuardarCambiosSubSector;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSubSector;
	//protected JButton jButtonCerrarReporteDinamicoSubSector;
	//protected JButton jButtonGenerarExcelReporteDinamicoSubSector;	
	
	
	
	//protected JButton jButtonAbrirImportacionSubSector;
	//protected JButton jButtonGenerarImportacionSubSector;
	//protected JButton jButtonCerrarImportacionSubSector;
	//protected JFileChooser jFileChooserImportacionSubSector;
	//protected File fileImportacionSubSector;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSubSector;
	protected JButton jButtonDuplicarToolBarSubSector;
	protected JButton jButtonNuevoRelacionesToolBarSubSector;
	
	
	public JButton jButtonGuardarCambiosToolBarSubSector;
	protected JButton jButtonCopiarToolBarSubSector;
	protected JButton jButtonVerFormToolBarSubSector;
	public JButton jButtonGuardarCambiosTablaToolBarSubSector;
	protected JButton jButtonMostrarOcultarTablaToolBarSubSector;
	protected JButton jButtonCerrarToolBarSubSector;
	
	protected JButton jButtonRecargarInformacionToolBarSubSector;
	protected JButton jButtonProcesarInformacionToolBarSubSector;
	protected JButton jButtonAnterioresToolBarSubSector;
	protected JButton jButtonSiguientesToolBarSubSector;
	protected JButton jButtonNuevoGuardarCambiosToolBarSubSector;
	protected JButton jButtonAbrirOrderByToolBarSubSector;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSubSector;
	protected JMenuItem jMenuItemDuplicarSubSector;
	protected JMenuItem jMenuItemNuevoRelacionesSubSector;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSubSector;
	protected JMenuItem jMenuItemCopiarSubSector;
	protected JMenuItem jMenuItemVerFormSubSector;
	protected JMenuItem jMenuItemGuardarCambiosTablaSubSector;
	protected JMenuItem jMenuItemCerrarSubSector;
	protected JMenuItem jMenuItemDetalleCerrarSubSector;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySubSector;
	protected JMenuItem jMenuItemDetalleMostarOcultarSubSector;
	
	protected JMenuItem jMenuItemRecargarInformacionSubSector;
	protected JMenuItem jMenuItemProcesarInformacionSubSector;
	protected JMenuItem jMenuItemAnterioresSubSector;
	protected JMenuItem jMenuItemSiguientesSubSector;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSubSector;
	protected JMenuItem jMenuItemAbrirOrderBySubSector;
	protected JMenuItem jMenuItemMostrarOcultarSubSector;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSubSector;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSubSector;
	protected JCheckBox jCheckBoxSeleccionadosSubSector;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSubSector;
	protected JCheckBox jCheckBoxConGraficoReporteSubSector;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSubSector;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSubSector;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSubSector;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSubSector;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSubSector;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSubSector;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSubSector;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSubSector;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSubSector;
	protected JTextField jTextFieldValorCampoGeneralSubSector;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSubSector;
	//public JList<Reporte> jListColumnasSelectReporteSubSector;
	//public JScrollPane jScrollColumnasSelectReporteSubSector;
	
	//public JLabel jLabelRelacionesSelectReporteSubSector;
	//public JList<Reporte> jListRelacionesSelectReporteSubSector;
	//public JScrollPane jScrollRelacionesSelectReporteSubSector;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSubSector;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSubSector;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSubSector;
	//public JLabel jLabelTiposArchivoReporteDinamicoSubSector;
	
		
	//public JLabel jLabelArchivoImportacionSubSector;	
	//public JLabel jLabelPathArchivoImportacionSubSector;
	//protected JTextField jTextFieldPathArchivoImportacionSubSector;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSubSector;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSubSector;
	
	//public JLabel jLabelColumnaCategoriaValorSubSector;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSubSector;
	
	//public JLabel jLabelColumnasValoresGraficoSubSector;
	//public JList<Reporte> jListColumnasValoresGraficoSubSector;
	//public JScrollPane jScrollColumnasValoresGraficoSubSector;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSubSector;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSubSector;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSubSector;
	public JPanel jPanelFK_IdSectorSubSector;
	public JButton jButtonFK_IdSectorSubSector;
	
	public JPanel jPanelid_sectorFK_IdSectorSubSector;
	public JLabel jLabelid_sectorFK_IdSectorSubSector;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sectorFK_IdSectorSubSector;
	public JButton jButtonid_sectorFK_IdSectorSubSector= new JButtonMe();
	public JButton jButtonid_sectorFK_IdSectorSubSectorUpdate= new JButtonMe();
	public JButton jButtonid_sectorFK_IdSectorSubSectorBusqueda= new JButtonMe();

	
	
	
	
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
	public SubSectorJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SubSector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubSectorJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubSector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubSectorJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubSector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubSectorJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SubSector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSubSector)	{
		this.jButtonRecargarInformacionSubSector = jButtonRecargarInformacionSubSector;
	}
	
	public JButton getjButtonProcesarInformacionSubSector() {
		return this.jButtonProcesarInformacionSubSector;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSubSector)	{
		this.jButtonProcesarInformacionSubSector = jButtonProcesarInformacionSubSector;
	}
	
	
	public JButton getjButtonRecargarInformacionSubSector() {
		return this.jButtonRecargarInformacionSubSector;
	}
	
	
	public List<SubSector> getsubsectors() {
		return this.subsectors;
	}

	public void setsubsectors(List<SubSector> subsectors) {
		this.subsectors = subsectors;
	}
	
	public List<SubSector> getsubsectorsAux() {
		return this.subsectorsAux;
	}

	public void setsubsectorsAux(List<SubSector> subsectorsAux) {
		this.subsectorsAux = subsectorsAux;
	}
	
	public List<SubSector> getsubsectorsEliminados() {
		return this.subsectorsEliminados;
	}

	public void setSubSectorsEliminados(List<SubSector> subsectorsEliminados) {
		this.subsectorsEliminados = subsectorsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSubSector() {
		return jComboBoxTiposSeleccionarSubSector;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSubSector(
			JComboBox jComboBoxTiposSeleccionarSubSector) {
		this.jComboBoxTiposSeleccionarSubSector = jComboBoxTiposSeleccionarSubSector;
	}
	
	public void setBorderResaltarTiposSeleccionarSubSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSubSector.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSubSector .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSubSector() {
		return jTextFieldValorCampoGeneralSubSector;
	}

	public void setjTextFieldValorCampoGeneralSubSector(
			JTextField jTextFieldValorCampoGeneralSubSector) {
		this.jTextFieldValorCampoGeneralSubSector = jTextFieldValorCampoGeneralSubSector;
	}

	public void setBorderResaltarValorCampoGeneralSubSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubSector.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSubSector .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSubSector() {
		return this.jCheckBoxSeleccionarTodosSubSector;
	}

	public void setjCheckBoxSeleccionarTodosSubSector(
			JCheckBox jCheckBoxSeleccionarTodosSubSector) {
		this.jCheckBoxSeleccionarTodosSubSector = jCheckBoxSeleccionarTodosSubSector;
	}

	public void setBorderResaltarSeleccionarTodosSubSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubSector.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSubSector .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSubSector() {
		return this.jCheckBoxSeleccionadosSubSector;
	}

	public void setjCheckBoxSeleccionadosSubSector(
			JCheckBox jCheckBoxSeleccionadosSubSector) {
		this.jCheckBoxSeleccionadosSubSector = jCheckBoxSeleccionadosSubSector;
	}
	
	public void setBorderResaltarSeleccionadosSubSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubSector.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSubSector .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSubSector() {
		return this.jComboBoxTiposArchivosReportesSubSector;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSubSector(
			JComboBox jComboBoxTiposArchivosReportesSubSector) {
		this.jComboBoxTiposArchivosReportesSubSector = jComboBoxTiposArchivosReportesSubSector;
	}

	public void setBorderResaltarTiposArchivosReportesSubSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubSector.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSubSector .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSubSector() {
		return this.jComboBoxTiposReportesSubSector;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSubSector(
			JComboBox jComboBoxTiposReportesSubSector) {
		this.jComboBoxTiposReportesSubSector = jComboBoxTiposReportesSubSector;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSubSector() {
	//	return jComboBoxTiposReportesDinamicoSubSector;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSubSector(
	//		JComboBox jComboBoxTiposReportesDinamicoSubSector) {
	//	this.jComboBoxTiposReportesDinamicoSubSector = jComboBoxTiposReportesDinamicoSubSector;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSubSector() {
	//	return jComboBoxTiposArchivosReportesDinamicoSubSector;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSubSector(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSubSector) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSubSector = jComboBoxTiposArchivosReportesDinamicoSubSector;
	//}
	
	public void setBorderResaltarTiposReportesSubSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubSector.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSubSector .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSubSector() {
		return this.jComboBoxTiposGraficosReportesSubSector;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSubSector(
			JComboBox jComboBoxTiposGraficosReportesSubSector) {
		this.jComboBoxTiposGraficosReportesSubSector = jComboBoxTiposGraficosReportesSubSector;
	}
	
	public void setBorderResaltarTiposGraficosReportesSubSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubSector.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSubSector .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSubSector() {
		return this.jComboBoxTiposPaginacionSubSector;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSubSector(
			JComboBox jComboBoxTiposPaginacionSubSector) {
		this.jComboBoxTiposPaginacionSubSector = jComboBoxTiposPaginacionSubSector;
	}
	
	public void setBorderResaltarTiposPaginacionSubSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubSector.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSubSector .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSubSector() {
		return this.jComboBoxTiposRelacionesSubSector;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSubSector() {
		return this.jComboBoxTiposAccionesSubSector;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSubSector(
			JComboBox jComboBoxTiposRelacionesSubSector) {
		this.jComboBoxTiposRelacionesSubSector = jComboBoxTiposRelacionesSubSector;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSubSector(
			JComboBox jComboBoxTiposAccionesSubSector) {
		this.jComboBoxTiposAccionesSubSector = jComboBoxTiposAccionesSubSector;
	}
	
	public void setBorderResaltarTiposRelacionesSubSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubSector.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSubSector .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSubSector() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubSector.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSubSector .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSubSector() {
	//	return jCheckBoxConGraficoDinamicoSubSector;
	//}

	//public void setjCheckBoxConGraficoDinamicoSubSector(
	//		JCheckBox jCheckBoxConGraficoDinamicoSubSector) {
	//	this.jCheckBoxConGraficoDinamicoSubSector = jCheckBoxConGraficoDinamicoSubSector;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSubSector() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSubSector.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSubSector .setBorder(borderResaltar);		
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
		this.subsectorSessionBean=new SubSectorSessionBean();
		
		this.subsectorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.subsectorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.subsectorSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SubSectorJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SubSectorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SubSectorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SubSectorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SubSectorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sector MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
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
		
		SubSectorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SubSector No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSubSector= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSubSector,this.jTtoolBarSubSector,
							"nuevo","nuevo","Nuevo"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSubSector,this.jTtoolBarSubSector,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSubSector,this.jTtoolBarSubSector,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSubSector,this.jTtoolBarSubSector,
							"duplicar","duplicar","Duplicar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSubSector,this.jTtoolBarSubSector,
							"copiar","copiar","Copiar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSubSector,this.jTtoolBarSubSector,
							"ver_form","ver_form","Ver"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSubSector,this.jTtoolBarSubSector,
							"recargar","recargar","Recargar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSubSector,this.jTtoolBarSubSector,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSubSector,this.jTtoolBarSubSector,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSubSector,this.jTtoolBarSubSector,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSubSector,this.jTtoolBarSubSector,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSubSector,this.jTtoolBarSubSector,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSubSector=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSubSector,this.jTtoolBarSubSector,
							"cerrar","cerrar","Salir"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSubSector=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSubSector;
			
				this.jButtonProcesarInformacionToolBarSubSector=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSubSector;
				
		//protected JButton jButtonModificarToolBarSubSector;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSubSector=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSubSector=new JMenuMe("General");
		this.jmenuArchivoSubSector=new JMenuMe("Archivo");
		this.jmenuAccionesSubSector=new JMenuMe("Acciones");
		this.jmenuDatosSubSector=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSubSector= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSubSector.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSubSector,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSubSector= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSubSector.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSubSector,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSubSector= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSubSector.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSubSector,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSubSector= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSubSector.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSubSector,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSubSector= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSubSector.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSubSector,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSubSector= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSubSector.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSubSector,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSubSector= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSubSector.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSubSector,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSubSector= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSubSector.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSubSector,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSubSector= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSubSector.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSubSector,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSubSector= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSubSector.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSubSector,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSubSector= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSubSector.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSubSector,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSubSector= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSubSector.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSubSector,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySubSector= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySubSector.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySubSector,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSubSector= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSubSector.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSubSector,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySubSector= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySubSector.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySubSector,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSubSector= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSubSector.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSubSector,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSubSector= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSubSector.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSubSector,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSubSector.add(this.jMenuItemCerrarSubSector);
			
			this.jmenuAccionesSubSector.add(this.jMenuItemNuevoSubSector);
			this.jmenuAccionesSubSector.add(this.jMenuItemNuevoGuardarCambiosSubSector);
			this.jmenuAccionesSubSector.add(this.jMenuItemNuevoRelacionesSubSector);
			this.jmenuAccionesSubSector.add(this.jMenuItemGuardarCambiosTablaSubSector);		
			this.jmenuAccionesSubSector.add(this.jMenuItemDuplicarSubSector);		
			this.jmenuAccionesSubSector.add(this.jMenuItemCopiarSubSector);		
			this.jmenuAccionesSubSector.add(this.jMenuItemVerFormSubSector);		
			
			this.jmenuDatosSubSector.add(this.jMenuItemRecargarInformacionSubSector);				
			this.jmenuDatosSubSector.add(this.jMenuItemAnterioresSubSector);				
			this.jmenuDatosSubSector.add(this.jMenuItemSiguientesSubSector);				
			this.jmenuDatosSubSector.add(this.jMenuItemAbrirOrderBySubSector);				
			this.jmenuDatosSubSector.add(this.jMenuItemMostrarOcultarSubSector);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSubSector.add(this.jMenuItemGuardarCambiosSubSector);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSubSector.add(this.jmenuArchivoSubSector);		
			this.jmenuBarSubSector.add(this.jmenuAccionesSubSector);		
			this.jmenuBarSubSector.add(this.jmenuDatosSubSector);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSubSector);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSubSector() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdSectorSubSector=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSectorSubSector.setToolTipText("Buscar Por Sector ");
		this.jButtonFK_IdSectorSubSector= new JButtonMe();
		this.jButtonFK_IdSectorSubSector.setText("Buscar");
		this.jButtonFK_IdSectorSubSector.setToolTipText("Buscar Por Sector ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSectorSubSector,"buscar_button","Buscar Por Sector ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSectorSubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sectorFK_IdSectorSubSector = new JLabelMe();
		jLabelid_sectorFK_IdSectorSubSector.setText("Sector :");
		jLabelid_sectorFK_IdSectorSubSector.setToolTipText("Sector");
		jLabelid_sectorFK_IdSectorSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sectorFK_IdSectorSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sectorFK_IdSectorSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sectorFK_IdSectorSubSector,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sectorFK_IdSectorSubSector= new JComboBoxMe();
		jComboBoxid_sectorFK_IdSectorSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sectorFK_IdSectorSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sectorFK_IdSectorSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sectorFK_IdSectorSubSector,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSubSector=new JTabbedPane();


		this.jTabbedPaneBusquedasSubSector.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSubSector.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSubSector.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSubSector.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSubSector,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSubSector = new SubSectorDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sector DATOS");
			this.jInternalFrameDetalleFormSubSector = new SubSectorDetalleFormJInternalFrame(jDesktopPane,this.subsectorSessionBean.getConGuardarRelaciones(),this.subsectorSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSubSector = null;//new SubSectorDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSubSector= new GridBagLayout();
		
		
		this.jTableDatosSubSector = new JTableMe();      
		
		String sToolTipSubSector="";
		sToolTipSubSector=SubSectorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSubSector+="(Seguridad.SubSector)";
		}
		
		if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
			sToolTipSubSector+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSubSector.setToolTipText(sToolTipSubSector);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSubSector);
		this.jTableDatosSubSector.setAutoCreateRowSorter(true);
		this.jTableDatosSubSector.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSubSector.setRowSelectionAllowed(true);
		this.jTableDatosSubSector.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSubSector,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSubSector = new JButtonMe();
		this.jButtonDuplicarSubSector = new JButtonMe();
		this.jButtonCopiarSubSector = new JButtonMe();
		this.jButtonVerFormSubSector = new JButtonMe();
		this.jButtonNuevoRelacionesSubSector = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSubSector = new JButtonMe();
		this.jButtonCerrarSubSector = new JButtonMe();
		
		this.jScrollPanelDatosSubSector = new JScrollPane();   
        this.jScrollPanelDatosGeneralSubSector = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSubSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Sector";
		
		if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sectores" + this.sPath));
		} else {
			this.jScrollPanelDatosSubSector.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSubSector.setToolTipText("Acciones");
        this.jPanelAccionesSubSector.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSubSector, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSubSector, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSubSector=new ReporteDinamicoJInternalFrame(SubSectorConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSubSector();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSubSector=new ImportacionJInternalFrame(SubSectorConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSubSector();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySubSector = new JButtonMe();
		
		this.jButtonAbrirOrderBySubSector.setText("Orden");
		this.jButtonAbrirOrderBySubSector.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySubSector,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySubSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySubSector=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubSector,false,this);
			
			//this.cargarOrderBySubSector(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySubSector=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubSector,true,this);
			
			//this.cargarOrderBySubSector(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSubSector.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosSubSector.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosSubSector.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosSubSector.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSubSector.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSubSector.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSubSector.setText("Nuevo");
		this.jButtonDuplicarSubSector.setText("Duplicar");
		this.jButtonCopiarSubSector.setText("Copiar");
		this.jButtonVerFormSubSector.setText("Ver");
		this.jButtonNuevoRelacionesSubSector.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSubSector.setText("Guardar");
		this.jButtonCerrarSubSector.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSubSector,"nuevo_button","Nuevo",this.subsectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSubSector,"duplicar_button","Duplicar",this.subsectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSubSector,"copiar_button","Copiar",this.subsectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSubSector,"ver_form","Ver",this.subsectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSubSector,"nuevorelaciones_button","Nuevo Rel",this.subsectorSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSubSector,"guardarcambiostabla_button","Guardar",this.subsectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSubSector,"cerrar_button","Salir",this.subsectorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSubSector, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSubSector.setToolTipText("Nuevo"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSubSector.setToolTipText("Duplicar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSubSector.setToolTipText("Copiar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSubSector.setToolTipText("Ver"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSubSector.setToolTipText("Nuevo Rel"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSubSector.setToolTipText("Guardar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSubSector.setToolTipText("Salir"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSubSector";
		inputMap = this.jButtonNuevoSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSubSector.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSubSector"));
		
		//DUPLICAR
		sMapKey = "DuplicarSubSector";
		inputMap = this.jButtonDuplicarSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSubSector.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSubSector"));
		
		//COPIAR
		sMapKey = "CopiarSubSector";
		inputMap = this.jButtonCopiarSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSubSector.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSubSector"));
		
		//VEr FORM
		sMapKey = "VerFormSubSector";
		inputMap = this.jButtonVerFormSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSubSector.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSubSector"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSubSector";
		inputMap = this.jButtonNuevoRelacionesSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSubSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSubSector"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSubSector";
		inputMap = this.jButtonModificarSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSubSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSubSector"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSubSector";
		inputMap = this.jButtonCerrarSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSubSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSubSector"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSubSector";
		inputMap = this.jButtonGuardarCambiosTablaSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSubSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSubSector"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSubSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSubSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSubSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SubSector= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SubSector= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SubSector= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SubSector= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SubSector= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSubSector.setName("jPanelParametrosReportesSubSector"); 
		
		this.jPanelParametrosReportesAccionesSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSubSector.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSubSector.setName("jPanelParametrosReportesAccionesSubSector"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSubSector, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSubSector, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSubSector = new JButtonMe();
		this.jButtonRecargarInformacionSubSector.setText("Recargar");
		this.jButtonRecargarInformacionSubSector.setToolTipText("Recargar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSubSector,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSubSector = new JButtonMe();
		this.jButtonProcesarInformacionSubSector.setText("Procesar");
		this.jButtonProcesarInformacionSubSector.setToolTipText("Procesar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSubSector.setVisible(false);
			
		this.jButtonProcesarInformacionSubSector.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSubSector.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSubSector.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSubSector = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSubSector.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSubSector.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSubSector = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSubSector.setText("TIPO");       
		this.jComboBoxTiposReportesSubSector.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSubSector = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSubSector.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSubSector.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSubSector = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSubSector.setText("Paginacion");
		this.jComboBoxTiposPaginacionSubSector.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSubSector = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSubSector.setText("Accion");
		this.jComboBoxTiposRelacionesSubSector.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSubSector = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSubSector.setText("Accion");
		this.jComboBoxTiposAccionesSubSector.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSubSector = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSubSector.setText("Accion");
		this.jComboBoxTiposSeleccionarSubSector.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSubSector=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSubSector.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSubSector.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSubSector.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSubSector = new JLabelMe();
		
		this.jLabelAccionesSubSector.setText("Acciones");		
		this.jLabelAccionesSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSubSector = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSubSector.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSubSector.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSubSector = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSubSector.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSubSector.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSubSector = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSubSector.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSubSector.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSubSector = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSubSector.setText("Graf.");
		this.jCheckBoxConGraficoReporteSubSector.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSubSector = new JButtonMe();
		//this.jButtonAnterioresSubSector.setText("<<");
        this.jButtonAnterioresSubSector.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSubSector,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSubSector = new JButtonMe();
		//this.jButtonSiguientesSubSector.setText(">>");
        this.jButtonSiguientesSubSector.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSubSector,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSubSector = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSubSector.setText("Nue");
        this.jButtonNuevoGuardarCambiosSubSector.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSubSector,"nuevoguardarcambios_button","Nue",this.subsectorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSubSector, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSubSector";
		inputMap = this.jButtonNuevoGuardarCambiosSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSubSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSubSector"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSubSector";
		inputMap = this.jButtonRecargarInformacionSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSubSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSubSector"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSubSector";
		inputMap = this.jButtonSiguientesSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSubSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSubSector"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSubSector";
		inputMap = this.jButtonAnterioresSubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSubSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSubSector"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSubSector();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSubSector.setMinimumSize(new Dimension(this.getWidth(),SubSectorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SubSectorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSubSector.setMaximumSize(new Dimension(this.getWidth(),SubSectorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SubSectorBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSubSector.setPreferredSize(new Dimension(this.getWidth(),SubSectorBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SubSectorBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSubSector = new GridBagLayout();

			this.jPanelPaginacionSubSector.setLayout(gridaBagLayoutPaginacionSubSector);						
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.gridy = 0;
			this.gridBagConstraintsSubSector.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSubSector.add(this.jButtonAnterioresSubSector, this.gridBagConstraintsSubSector);
					
						
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSubSector.gridy = 0;
			
			this.jPanelPaginacionSubSector.add(this.jButtonNuevoGuardarCambiosSubSector, this.gridBagConstraintsSubSector);
						
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSubSector.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSubSector.gridy = 0;
			this.jPanelPaginacionSubSector.add(this.jButtonSiguientesSubSector, this.gridBagConstraintsSubSector);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.gridy = 1;
			this.gridBagConstraintsSubSector.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubSector.add(this.jButtonNuevoSubSector, this.gridBagConstraintsSubSector);
						
			
			
			if(!this.subsectorSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSubSector = new GridBagConstraints();
				this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSubSector.gridy = 1;
				this.gridBagConstraintsSubSector.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSubSector.add(this.jButtonGuardarCambiosTablaSubSector, this.gridBagConstraintsSubSector);
			}
			
			
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.gridy = 1;
			this.gridBagConstraintsSubSector.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubSector.add(this.jButtonDuplicarSubSector, this.gridBagConstraintsSubSector);
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.gridy = 1;
			this.gridBagConstraintsSubSector.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubSector.add(this.jButtonCopiarSubSector, this.gridBagConstraintsSubSector);
		
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.gridy = 1;
			this.gridBagConstraintsSubSector.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubSector.add(this.jButtonVerFormSubSector, this.gridBagConstraintsSubSector);
		
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.gridy = 1;
			this.gridBagConstraintsSubSector.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSubSector.add(this.jButtonCerrarSubSector, this.gridBagConstraintsSubSector);
		
		
		
		this.jButtonRecargarInformacionSubSector.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSubSector.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSubSector.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSubSector, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSubSector.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSubSector.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSubSector.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSubSector.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSubSector.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSubSector.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSubSector.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSubSector.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSubSector.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSubSector.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSubSector.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSubSector.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSubSector.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSubSector.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSubSector.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSubSector.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubSector.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubSector.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSubSector.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSubSector.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSubSector.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSubSector.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSubSector.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSubSector.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSubSector.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSubSector.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSubSector.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSubSector, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSubSector.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSubSector.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSubSector.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSubSector.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSubSector.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSubSector.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSubSector = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSubSector = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SubSector = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SubSector = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SubSector = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SubSector = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSubSector.setLayout(gridaBagParametrosReportesSubSector);
			this.jPanelParametrosReportesAccionesSubSector.setLayout(gridaBagParametrosReportesAccionesSubSector);
			
			
			this.jPanelParametrosAuxiliar1SubSector.setLayout(gridaBagParametrosAuxiliar1SubSector);
			this.jPanelParametrosAuxiliar2SubSector.setLayout(gridaBagParametrosAuxiliar2SubSector);
			this.jPanelParametrosAuxiliar3SubSector.setLayout(gridaBagParametrosAuxiliar3SubSector);
			this.jPanelParametrosAuxiliar4SubSector.setLayout(gridaBagParametrosAuxiliar4SubSector);
			//this.jPanelParametrosAuxiliar5SubSector.setLayout(gridaBagParametrosAuxiliar2SubSector);			
			
			
			
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubSector.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubSector.add(this.jButtonRecargarInformacionSubSector, this.gridBagConstraintsSubSector);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubSector.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubSector.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SubSector.add(this.jComboBoxTiposPaginacionSubSector, this.gridBagConstraintsSubSector);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubSector.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubSector.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SubSector.add(this.jCheckBoxConAltoMaximoTablaSubSector, this.gridBagConstraintsSubSector);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubSector.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubSector.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SubSector.add(this.jComboBoxTiposArchivosReportesSubSector, this.gridBagConstraintsSubSector);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubSector.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubSector.add(this.jPanelParametrosAuxiliar1SubSector, this.gridBagConstraintsSubSector);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubSector.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SubSector.add(this.jComboBoxTiposReportesSubSector, this.gridBagConstraintsSubSector);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubSector.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubSector.add(this.jPanelParametrosAuxiliar4SubSector, this.gridBagConstraintsSubSector);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubSector.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubSector.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubSector.add(this.jComboBoxTiposReportesSubSector, this.gridBagConstraintsSubSector);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubSector.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubSector.add(this.jCheckBoxGenerarReporteSubSector, this.gridBagConstraintsSubSector);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubSector.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubSector.add(this.jPanelParametrosAuxiliar2SubSector, this.gridBagConstraintsSubSector);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubSector.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubSector.add(this.jLabelAccionesSubSector, this.gridBagConstraintsSubSector);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSubSector = new GridBagConstraints();
				this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSubSector.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSubSector.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSubSector.add(this.jButtonAbrirOrderBySubSector, this.gridBagConstraintsSubSector);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSubSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubSector.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubSector.add(this.jComboBoxTiposSeleccionarSubSector, this.gridBagConstraintsSubSector);			
			
			
			/*
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubSector.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubSector.add(this.jCheckBoxSeleccionarTodosSubSector, this.gridBagConstraintsSubSector);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubSector.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SubSector.add(this.jCheckBoxSeleccionarTodosSubSector, this.gridBagConstraintsSubSector);															
				
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubSector.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SubSector.add(this.jCheckBoxSeleccionadosSubSector, this.gridBagConstraintsSubSector);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubSector.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubSector.add(this.jPanelParametrosAuxiliar3SubSector, this.gridBagConstraintsSubSector);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubSector.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubSector.add(this.jComboBoxTiposAccionesSubSector, this.gridBagConstraintsSubSector);
	
				
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubSector.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubSector.add(this.jTextFieldValorCampoGeneralSubSector, this.gridBagConstraintsSubSector);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSubSector = new GridBagLayout();

			this.jScrollPanelDatosSubSector.setLayout(gridaBagLayoutDatosSubSector);
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.gridy = 0;
			this.gridBagConstraintsSubSector.gridx = 0;
			
			this.jScrollPanelDatosSubSector.add(this.jTableDatosSubSector, this.gridBagConstraintsSubSector);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSubSector.setViewportView(this.jTableDatosSubSector);
		this.jTableDatosSubSector.setFillsViewportHeight(true);
		this.jTableDatosSubSector.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSubSector= new GridBagLayout();
		this.jPanelAccionesSubSector.setLayout(gridaBagLayoutAccionesSubSector);
		
		
		/*	
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubSector.gridy = 0;
		this.gridBagConstraintsSubSector.gridx = 0;
			
		this.jPanelAccionesSubSector.add(this.jButtonNuevoSubSector, this.gridBagConstraintsSubSector);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdSectorSubSector= new GridBagLayout();
		gridaBagLayoutFK_IdSectorSubSector.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSectorSubSector.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSectorSubSector.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSectorSubSector.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSectorSubSector.setLayout(gridaBagLayoutFK_IdSectorSubSector);

		gridBagConstraintsSubSector = new GridBagConstraints();
		gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubSector.gridy = 0;
		gridBagConstraintsSubSector.gridx = 0;
		jPanelFK_IdSectorSubSector.add(jLabelid_sectorFK_IdSectorSubSector, gridBagConstraintsSubSector);

		gridBagConstraintsSubSector = new GridBagConstraints();
		gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubSector.gridy = 0;
		gridBagConstraintsSubSector.gridx = 1;
		jPanelFK_IdSectorSubSector.add(jComboBoxid_sectorFK_IdSectorSubSector, gridBagConstraintsSubSector);

		gridBagConstraintsSubSector = new GridBagConstraints();
		gridBagConstraintsSubSector.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubSector.gridy = 1;
		gridBagConstraintsSubSector.gridx =1;
		jPanelFK_IdSectorSubSector.add(jButtonFK_IdSectorSubSector, gridBagConstraintsSubSector);

		jTabbedPaneBusquedasSubSector.addTab("1.-Por Sector ", jPanelFK_IdSectorSubSector);
		jTabbedPaneBusquedasSubSector.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSubSector = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSubSector);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.subsectorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSubSector = new GridBagConstraints();						
			this.gridBagConstraintsSubSector.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSubSector.gridx = 0;		
			//this.gridBagConstraintsSubSector.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSubSector.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSubSector, this.gridBagConstraintsSubSector);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSubSector.gridx = 0;		
		//this.gridBagConstraintsSubSector.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubSector.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSubSector.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSubSector);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSubSector.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSubSector.gridx = 0;		
			this.gridBagConstraintsSubSector.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSubSector.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSubSector, this.gridBagConstraintsSubSector);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubSector.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSubSector, this.gridBagConstraintsSubSector);								
		
		
		/*
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubSector.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSubSector, this.gridBagConstraintsSubSector);
		*/		
		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSubSector.gridx =0;
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSubSector.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSubSector, this.gridBagConstraintsSubSector);
				
		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubSector.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSubSector, this.gridBagConstraintsSubSector);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SubSectorJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSubSector= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSubSector = new GridBagLayout();
			this.jPanelBusquedasParametrosSubSector.setLayout(gridaBagLayoutBusquedasParametrosSubSector);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSubSector=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSubSector.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubSector.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubSector.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubSector.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSubSector, this.gridBagConstraintsSubSector);
			
			
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubSector.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSubSector, this.gridBagConstraintsSubSector);
		
			
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSubSector.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSubSector, this.gridBagConstraintsSubSector);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSubSector;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSubSector() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSubSector = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSubSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSubSector.setName("jPanelReporteDinamicoSubSector"); 
		
		this.jPanelReporteDinamicoSubSector.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSubSector.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSubSector.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSubSector.setLayout(gridaBagLayoutReporteDinamicoSubSector);
		
		
		this.jInternalFrameReporteDinamicoSubSector= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSubSector = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSubSector= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSubSector.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSubSector.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSubSector.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSubSector.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSubSector.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSubSector.setResizable(true);
	    this.jInternalFrameReporteDinamicoSubSector.setClosable(true);
	    this.jInternalFrameReporteDinamicoSubSector.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSubSector.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSubSector.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSubSector.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sectores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSubSector = new JLabelMe();

		this.jLabelColumnasSelectReporteSubSector.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubSector.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubSector.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSubSector.add(this.jLabelColumnasSelectReporteSubSector, this.gridBagConstraintsSubSector);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSubSector = new JList<Reporte>();
		this.jListColumnasSelectReporteSubSector.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSubSector.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSubSector.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSubSector.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSubSector.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSubSector=new JScrollPane(this.jListColumnasSelectReporteSubSector);
			
			this.jScrollColumnasSelectReporteSubSector.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSubSector.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSubSector.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubSector.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubSector.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSubSector.add(this.jListColumnasSelectReporteSubSector, this.gridBagConstraintsSubSector);
		this.jPanelReporteDinamicoSubSector.add(this.jScrollColumnasSelectReporteSubSector, this.gridBagConstraintsSubSector);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSubSector = new JLabelMe();

		this.jLabelRelacionesSelectReporteSubSector.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSubSector = new JList<Reporte>();
		this.jListRelacionesSelectReporteSubSector.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSubSector.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSubSector.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSubSector.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSubSector.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSubSector=new JScrollPane(this.jListRelacionesSelectReporteSubSector);
			
			this.jScrollRelacionesSelectReporteSubSector.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSubSector.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSubSector.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSubSector = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSubSector = new JComboBoxMe();
		this.jListColumnasValoresGraficoSubSector = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSubSector = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSubSector.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSubSector.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSubSector.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSubSector.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSubSector = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSubSector.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSubSector.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSubSector.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSubSector.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSubSector = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSubSector.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubSector.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubSector.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubSector.add(this.jLabelGenerarExcelReporteDinamicoSubSector, this.gridBagConstraintsSubSector);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSubSector = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSubSector.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSubSector,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSubSector.setToolTipText("Generar EXCEL"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSubSector = new GridBagConstraints();
		//this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSubSector.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSubSector.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSubSector.add(this.jButtonGenerarExcelReporteDinamicoSubSector, this.gridBagConstraintsSubSector);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubSector.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubSector.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubSector.add(this.jComboBoxTiposReportesDinamicoSubSector, this.gridBagConstraintsSubSector);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSubSector = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSubSector.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubSector.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubSector.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubSector.add(this.jLabelTiposArchivoReporteDinamicoSubSector, this.gridBagConstraintsSubSector);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubSector.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubSector.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubSector.add(this.jComboBoxTiposArchivosReportesDinamicoSubSector, this.gridBagConstraintsSubSector);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSubSector = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSubSector.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSubSector,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSubSector.setToolTipText("Generar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubSector.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubSector.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubSector.add(this.jButtonGenerarReporteDinamicoSubSector, this.gridBagConstraintsSubSector);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSubSector = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSubSector.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSubSector,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSubSector.setToolTipText("Cancelar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubSector.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubSector.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubSector.add(this.jButtonCerrarReporteDinamicoSubSector, this.gridBagConstraintsSubSector);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSubSector = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSubSector= new JScrollPane(jPanelReporteDinamicoSubSector,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSubSector.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSubSector.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSubSector.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sectores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSubSector.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSubSector.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSubSector.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSubSector);
		this.jInternalFrameReporteDinamicoSubSector.getContentPane().add(this.jScrollPanelReporteDinamicoSubSector, this.gridBagConstraintsSubSector);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSubSector() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSubSector = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSubSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSubSector.setName("jPanelImportacionSubSector"); 
		
		this.jPanelImportacionSubSector.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSubSector.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSubSector.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSubSector.setLayout(gridaBagLayoutImportacionSubSector);
		
		
		this.jInternalFrameImportacionSubSector= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSubSector= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSubSector = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSubSector= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSubSector.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSubSector.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSubSector.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSubSector.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSubSector.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSubSector.setResizable(true);
	    this.jInternalFrameImportacionSubSector.setClosable(true);
	    this.jInternalFrameImportacionSubSector.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSubSector.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSubSector.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSubSector.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSubSector.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSubSector.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSubSector.setResizable(true);
	    this.jInternalFrameImportacionSubSector.setClosable(true);
	    this.jInternalFrameImportacionSubSector.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSubSector.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSubSector.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSubSector.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sectores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSubSector = new JLabelMe();

		this.jLabelArchivoImportacionSubSector.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubSector.gridy = iPosYImportacion;		
		this.gridBagConstraintsSubSector.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSubSector.add(this.jLabelArchivoImportacionSubSector, this.gridBagConstraintsSubSector);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSubSector = new JFileChooser();		
		this.jFileChooserImportacionSubSector.setToolTipText("ESCOGER ARCHIVO"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSubSector = new JButtonMe();
		this.jButtonAbrirImportacionSubSector.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSubSector,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSubSector.setToolTipText("Generar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubSector.gridy = iPosYImportacion;
		this.gridBagConstraintsSubSector.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubSector.add(this.jButtonAbrirImportacionSubSector, this.gridBagConstraintsSubSector);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSubSector = new JLabelMe();

		this.jLabelPathArchivoImportacionSubSector.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSubSector.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSubSector.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSubSector.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubSector.gridy = iPosYImportacion;		
		this.gridBagConstraintsSubSector.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSubSector.add(this.jLabelPathArchivoImportacionSubSector, this.gridBagConstraintsSubSector);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSubSector=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSubSector.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSubSector.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSubSector.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubSector.gridy = iPosYImportacion;
		this.gridBagConstraintsSubSector.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubSector.add(this.jTextFieldPathArchivoImportacionSubSector, this.gridBagConstraintsSubSector);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSubSector = new JButtonMe();
		this.jButtonGenerarImportacionSubSector.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSubSector,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSubSector.setToolTipText("Generar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubSector.gridy = iPosYImportacion;
		this.gridBagConstraintsSubSector.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubSector.add(this.jButtonGenerarImportacionSubSector, this.gridBagConstraintsSubSector);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSubSector = new JButtonMe();
		this.jButtonCerrarImportacionSubSector.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSubSector,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSubSector.setToolTipText("Cancelar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubSector.gridy = iPosYImportacion;
		this.gridBagConstraintsSubSector.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubSector.add(this.jButtonCerrarImportacionSubSector, this.gridBagConstraintsSubSector);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSubSector = new GridBagLayout();
		
		this.jScrollPanelImportacionSubSector= new JScrollPane(jPanelImportacionSubSector,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSubSector = new GridBagConstraints();
		this.gridBagConstraintsSubSector.gridy =iPosYImportacion;
		this.gridBagConstraintsSubSector.gridx =iPosXImportacion;
		this.gridBagConstraintsSubSector.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSubSector.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSubSector.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSubSector);
		this.jInternalFrameImportacionSubSector.getContentPane().add(this.jScrollPanelImportacionSubSector, this.gridBagConstraintsSubSector);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySubSector(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySubSector = new JButtonMe();
			this.jButtonAbrirOrderBySubSector.setText("Orden");
			this.jButtonAbrirOrderBySubSector.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySubSector,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySubSector";
			inputMap = this.jButtonAbrirOrderBySubSector.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySubSector.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySubSector"));
		
		
			GridBagLayout gridaBagLayoutOrderBySubSector = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySubSector = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySubSector.setName("jPanelOrderBySubSector"); 
			
			this.jPanelOrderBySubSector.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySubSector.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySubSector.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySubSector.setLayout(gridaBagLayoutOrderBySubSector);
			
			
			this.jTableDatosSubSectorOrderBy = new JTableMe();        
			this.jTableDatosSubSectorOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSubSectorOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSubSectorOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSubSectorOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSubSectorOrderBy.setViewportView(this.jTableDatosSubSectorOrderBy);
			this.jTableDatosSubSectorOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSubSectorOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySubSector= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySubSector= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySubSector = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSubSector= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySubSector.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySubSector.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySubSector.setTitle("Orden");
			this.jInternalFrameOrderBySubSector.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySubSector.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySubSector.setResizable(true);
			this.jInternalFrameOrderBySubSector.setClosable(true);
			this.jInternalFrameOrderBySubSector.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySubSector.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySubSector.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySubSector.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySubSector.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sectores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSubSector.gridx =iPosXOrderBy;
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSubSector.ipady =150;
				
			this.jPanelOrderBySubSector.add(jScrollPanelDatosSubSectorOrderBy, this.gridBagConstraintsSubSector);//this.jTableDatosSubSectorTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySubSector = new JButtonMe();
			this.jButtonCerrarOrderBySubSector.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySubSector,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySubSector.setToolTipText("Cancelar"+" "+SubSectorConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySubSector, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubSector.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSubSector.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySubSector.add(this.jButtonCerrarOrderBySubSector, this.gridBagConstraintsSubSector);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSubSector = new GridBagLayout();
			
			this.jScrollPanelOrderBySubSector= new JScrollPane(jPanelOrderBySubSector,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSubSector = new GridBagConstraints();
			this.gridBagConstraintsSubSector.gridy =iPosYOrderBy;
			this.gridBagConstraintsSubSector.gridx =iPosXOrderBy;
			this.gridBagConstraintsSubSector.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySubSector.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySubSector.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSubSector);
			
			this.jInternalFrameOrderBySubSector.getContentPane().add(this.jScrollPanelOrderBySubSector, this.gridBagConstraintsSubSector);			
		
		} else {
			this.jButtonAbrirOrderBySubSector = new JButtonMe();
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
			&& this.subsectorSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSubSector.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSubSector.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSubSector.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSubSector.getRowHeight();//SubSectorConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SubSectorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSubSector.isSelected()) {
					iHeightTable=SubSectorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SubSectorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SubSectorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SubSectorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSubSector.isSelected()) {
					iHeightTable=SubSectorConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SubSectorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SubSectorConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSubSector.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSubSector.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSubSector.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSubSector.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSubSector.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSubSector.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySubSector!=null && this.jInternalFrameOrderBySubSector.getjTableDatosOrderBy()!=null) {
			//if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySubSector.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySubSector.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySubSector.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySubSector.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySubSector.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySubSector.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySubSector.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSubSector.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSubSector.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSubSector.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=subsectorLogic.getSubSectors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=subsectors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SubSector> TraerSubSectorBeans(List<SubSector> subsectors,ArrayList<Classe> classes)throws Exception {
		try {
			for(SubSector subsector:subsectors) {
					
				if(!(SubSectorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SubSectorConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					subsector.setsDetalleGeneralEntityReporte(SubSectorConstantesFunciones.getSubSectorDescripcion(subsector));
										
						
					
						
					
				} else  {
							
					//subsector.setsDetalleGeneralEntityReporte(subsector.getsDetalleGeneralEntityReporte());
										
				}
				
				//subsectorbeans.add(subsectorbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return subsectors;
    }
	//PARA REPORTES FIN
}
