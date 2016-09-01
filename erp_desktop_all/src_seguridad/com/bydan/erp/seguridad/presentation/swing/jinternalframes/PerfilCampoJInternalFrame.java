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
import com.bydan.erp.seguridad.util.PerfilCampoConstantesFunciones;

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
public class PerfilCampoJInternalFrame extends PerfilCampoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPerfilCampo;
	
	protected JMenuBar jmenuBarPerfilCampo;
	
	protected JMenu jmenuPerfilCampo;
	protected JMenu jmenuDatosPerfilCampo;
	protected JMenu jmenuArchivoPerfilCampo;
	protected JMenu jmenuAccionesPerfilCampo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPerfilCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPerfilCampo;	
	protected GridBagConstraints gridBagConstraintsPerfilCampo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PerfilCampoDetalleFormJInternalFrame jInternalFrameDetalleFormPerfilCampo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPerfilCampo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPerfilCampo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_perfil="";

	protected CampoBeanSwingJInternalFrame campoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_campo="";
	
	public PerfilCampoSessionBean perfilcampoSessionBean;
		
	
	
	public PerfilSessionBean perfilSessionBean;
	public CampoSessionBean campoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PerfilCampo> perfilcampos;		
	public List<PerfilCampo> perfilcamposEliminados;	
	public List<PerfilCampo> perfilcamposAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPerfilCampo;		
	protected JButton jButtonAbrirOrderByPerfilCampo;
	
	
	//protected JPanel jPanelOrderByPerfilCampo;
	//public JScrollPane jScrollPanelOrderByPerfilCampo;	
	//protected JButton jButtonCerrarOrderByPerfilCampo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PerfilCampoLogic perfilcampoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPerfilCampo;
	public JScrollPane jScrollPanelDatosEdicionPerfilCampo;
	public JScrollPane jScrollPanelDatosGeneralPerfilCampo;
    
	
	
	//public JScrollPane jScrollPanelDatosPerfilCampoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPerfilCampo;
	//public JScrollPane jScrollPanelImportacionPerfilCampo;
	
	
	
	protected JPanel jPanelAccionesPerfilCampo;
	
    protected JPanel jPanelPaginacionPerfilCampo;
    protected JPanel jPanelParametrosReportesPerfilCampo;
	protected JPanel jPanelParametrosReportesAccionesPerfilCampo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PerfilCampo;
	protected JPanel jPanelParametrosAuxiliar2PerfilCampo;
	protected JPanel jPanelParametrosAuxiliar3PerfilCampo;
	protected JPanel jPanelParametrosAuxiliar4PerfilCampo;
	//protected JPanel jPanelParametrosAuxiliar5PerfilCampo;
	
	
	
	//protected JPanel jPanelReporteDinamicoPerfilCampo;
	//protected JPanel jPanelImportacionPerfilCampo;
	
	
	public JTable jTableDatosPerfilCampo;
	
	
	
	//public JTable jTableDatosPerfilCampoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPerfilCampo;
	protected JButton jButtonDuplicarPerfilCampo;
	protected JButton jButtonCopiarPerfilCampo;
	protected JButton jButtonVerFormPerfilCampo;
	protected JButton jButtonNuevoRelacionesPerfilCampo;
	protected JButton jButtonModificarPerfilCampo;
	
    protected JButton jButtonGuardarCambiosTablaPerfilCampo;
	protected JButton jButtonCerrarPerfilCampo;
	
	
	protected JButton jButtonRecargarInformacionPerfilCampo;
	protected JButton jButtonProcesarInformacionPerfilCampo;
	
	
	protected JButton jButtonAnterioresPerfilCampo;
	protected JButton jButtonSiguientesPerfilCampo;
	protected JButton jButtonNuevoGuardarCambiosPerfilCampo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPerfilCampo;
	//protected JButton jButtonCerrarReporteDinamicoPerfilCampo;
	//protected JButton jButtonGenerarExcelReporteDinamicoPerfilCampo;	
	
	
	
	//protected JButton jButtonAbrirImportacionPerfilCampo;
	//protected JButton jButtonGenerarImportacionPerfilCampo;
	//protected JButton jButtonCerrarImportacionPerfilCampo;
	//protected JFileChooser jFileChooserImportacionPerfilCampo;
	//protected File fileImportacionPerfilCampo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPerfilCampo;
	protected JButton jButtonDuplicarToolBarPerfilCampo;
	protected JButton jButtonNuevoRelacionesToolBarPerfilCampo;
	
	
	public JButton jButtonGuardarCambiosToolBarPerfilCampo;
	protected JButton jButtonCopiarToolBarPerfilCampo;
	protected JButton jButtonVerFormToolBarPerfilCampo;
	public JButton jButtonGuardarCambiosTablaToolBarPerfilCampo;
	protected JButton jButtonMostrarOcultarTablaToolBarPerfilCampo;
	protected JButton jButtonCerrarToolBarPerfilCampo;
	
	protected JButton jButtonRecargarInformacionToolBarPerfilCampo;
	protected JButton jButtonProcesarInformacionToolBarPerfilCampo;
	protected JButton jButtonAnterioresToolBarPerfilCampo;
	protected JButton jButtonSiguientesToolBarPerfilCampo;
	protected JButton jButtonNuevoGuardarCambiosToolBarPerfilCampo;
	protected JButton jButtonAbrirOrderByToolBarPerfilCampo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPerfilCampo;
	protected JMenuItem jMenuItemDuplicarPerfilCampo;
	protected JMenuItem jMenuItemNuevoRelacionesPerfilCampo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPerfilCampo;
	protected JMenuItem jMenuItemCopiarPerfilCampo;
	protected JMenuItem jMenuItemVerFormPerfilCampo;
	protected JMenuItem jMenuItemGuardarCambiosTablaPerfilCampo;
	protected JMenuItem jMenuItemCerrarPerfilCampo;
	protected JMenuItem jMenuItemDetalleCerrarPerfilCampo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPerfilCampo;
	protected JMenuItem jMenuItemDetalleMostarOcultarPerfilCampo;
	
	protected JMenuItem jMenuItemRecargarInformacionPerfilCampo;
	protected JMenuItem jMenuItemProcesarInformacionPerfilCampo;
	protected JMenuItem jMenuItemAnterioresPerfilCampo;
	protected JMenuItem jMenuItemSiguientesPerfilCampo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPerfilCampo;
	protected JMenuItem jMenuItemAbrirOrderByPerfilCampo;
	protected JMenuItem jMenuItemMostrarOcultarPerfilCampo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPerfilCampo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPerfilCampo;
	protected JCheckBox jCheckBoxSeleccionadosPerfilCampo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPerfilCampo;
	protected JCheckBox jCheckBoxConGraficoReportePerfilCampo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPerfilCampo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPerfilCampo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPerfilCampo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPerfilCampo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPerfilCampo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPerfilCampo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPerfilCampo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPerfilCampo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPerfilCampo;
	protected JTextField jTextFieldValorCampoGeneralPerfilCampo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePerfilCampo;
	//public JList<Reporte> jListColumnasSelectReportePerfilCampo;
	//public JScrollPane jScrollColumnasSelectReportePerfilCampo;
	
	//public JLabel jLabelRelacionesSelectReportePerfilCampo;
	//public JList<Reporte> jListRelacionesSelectReportePerfilCampo;
	//public JScrollPane jScrollRelacionesSelectReportePerfilCampo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPerfilCampo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPerfilCampo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPerfilCampo;
	//public JLabel jLabelTiposArchivoReporteDinamicoPerfilCampo;
	
		
	//public JLabel jLabelArchivoImportacionPerfilCampo;	
	//public JLabel jLabelPathArchivoImportacionPerfilCampo;
	//protected JTextField jTextFieldPathArchivoImportacionPerfilCampo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPerfilCampo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPerfilCampo;
	
	//public JLabel jLabelColumnaCategoriaValorPerfilCampo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPerfilCampo;
	
	//public JLabel jLabelColumnasValoresGraficoPerfilCampo;
	//public JList<Reporte> jListColumnasValoresGraficoPerfilCampo;
	//public JScrollPane jScrollColumnasValoresGraficoPerfilCampo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPerfilCampo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPerfilCampo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPerfilCampo;
	public JPanel jPanelFK_IdCampoPerfilCampo;
	public JButton jButtonFK_IdCampoPerfilCampo;
	public JPanel jPanelFK_IdPerfilPerfilCampo;
	public JButton jButtonFK_IdPerfilPerfilCampo;
	
	public JPanel jPanelid_campoFK_IdCampoPerfilCampo;
	public JLabel jLabelid_campoFK_IdCampoPerfilCampo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_campoFK_IdCampoPerfilCampo;
	public JButton jButtonid_campoFK_IdCampoPerfilCampo= new JButtonMe();
	public JButton jButtonid_campoFK_IdCampoPerfilCampoUpdate= new JButtonMe();
	public JButton jButtonid_campoFK_IdCampoPerfilCampoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_perfilFK_IdPerfilPerfilCampo;
	public JLabel jLabelid_perfilFK_IdPerfilPerfilCampo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_perfilFK_IdPerfilPerfilCampo;
	public JButton jButtonid_perfilFK_IdPerfilPerfilCampo= new JButtonMe();
	public JButton jButtonid_perfilFK_IdPerfilPerfilCampoUpdate= new JButtonMe();
	public JButton jButtonid_perfilFK_IdPerfilPerfilCampoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdPerfilid_perfilPerfilCampo;
	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PerfilCampoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PerfilCampo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilCampoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilCampo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilCampoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PerfilCampo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PerfilCampoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PerfilCampo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPerfilCampo)	{
		this.jButtonRecargarInformacionPerfilCampo = jButtonRecargarInformacionPerfilCampo;
	}
	
	public JButton getjButtonProcesarInformacionPerfilCampo() {
		return this.jButtonProcesarInformacionPerfilCampo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPerfilCampo)	{
		this.jButtonProcesarInformacionPerfilCampo = jButtonProcesarInformacionPerfilCampo;
	}
	
	
	public JButton getjButtonRecargarInformacionPerfilCampo() {
		return this.jButtonRecargarInformacionPerfilCampo;
	}
	
	
	public List<PerfilCampo> getperfilcampos() {
		return this.perfilcampos;
	}

	public void setperfilcampos(List<PerfilCampo> perfilcampos) {
		this.perfilcampos = perfilcampos;
	}
	
	public List<PerfilCampo> getperfilcamposAux() {
		return this.perfilcamposAux;
	}

	public void setperfilcamposAux(List<PerfilCampo> perfilcamposAux) {
		this.perfilcamposAux = perfilcamposAux;
	}
	
	public List<PerfilCampo> getperfilcamposEliminados() {
		return this.perfilcamposEliminados;
	}

	public void setPerfilCamposEliminados(List<PerfilCampo> perfilcamposEliminados) {
		this.perfilcamposEliminados = perfilcamposEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPerfilCampo() {
		return jComboBoxTiposSeleccionarPerfilCampo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPerfilCampo(
			JComboBox jComboBoxTiposSeleccionarPerfilCampo) {
		this.jComboBoxTiposSeleccionarPerfilCampo = jComboBoxTiposSeleccionarPerfilCampo;
	}
	
	public void setBorderResaltarTiposSeleccionarPerfilCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPerfilCampo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPerfilCampo() {
		return jTextFieldValorCampoGeneralPerfilCampo;
	}

	public void setjTextFieldValorCampoGeneralPerfilCampo(
			JTextField jTextFieldValorCampoGeneralPerfilCampo) {
		this.jTextFieldValorCampoGeneralPerfilCampo = jTextFieldValorCampoGeneralPerfilCampo;
	}

	public void setBorderResaltarValorCampoGeneralPerfilCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPerfilCampo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPerfilCampo() {
		return this.jCheckBoxSeleccionarTodosPerfilCampo;
	}

	public void setjCheckBoxSeleccionarTodosPerfilCampo(
			JCheckBox jCheckBoxSeleccionarTodosPerfilCampo) {
		this.jCheckBoxSeleccionarTodosPerfilCampo = jCheckBoxSeleccionarTodosPerfilCampo;
	}

	public void setBorderResaltarSeleccionarTodosPerfilCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPerfilCampo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPerfilCampo() {
		return this.jCheckBoxSeleccionadosPerfilCampo;
	}

	public void setjCheckBoxSeleccionadosPerfilCampo(
			JCheckBox jCheckBoxSeleccionadosPerfilCampo) {
		this.jCheckBoxSeleccionadosPerfilCampo = jCheckBoxSeleccionadosPerfilCampo;
	}
	
	public void setBorderResaltarSeleccionadosPerfilCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPerfilCampo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPerfilCampo() {
		return this.jComboBoxTiposArchivosReportesPerfilCampo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPerfilCampo(
			JComboBox jComboBoxTiposArchivosReportesPerfilCampo) {
		this.jComboBoxTiposArchivosReportesPerfilCampo = jComboBoxTiposArchivosReportesPerfilCampo;
	}

	public void setBorderResaltarTiposArchivosReportesPerfilCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPerfilCampo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPerfilCampo() {
		return this.jComboBoxTiposReportesPerfilCampo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPerfilCampo(
			JComboBox jComboBoxTiposReportesPerfilCampo) {
		this.jComboBoxTiposReportesPerfilCampo = jComboBoxTiposReportesPerfilCampo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPerfilCampo() {
	//	return jComboBoxTiposReportesDinamicoPerfilCampo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPerfilCampo(
	//		JComboBox jComboBoxTiposReportesDinamicoPerfilCampo) {
	//	this.jComboBoxTiposReportesDinamicoPerfilCampo = jComboBoxTiposReportesDinamicoPerfilCampo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPerfilCampo() {
	//	return jComboBoxTiposArchivosReportesDinamicoPerfilCampo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPerfilCampo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPerfilCampo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPerfilCampo = jComboBoxTiposArchivosReportesDinamicoPerfilCampo;
	//}
	
	public void setBorderResaltarTiposReportesPerfilCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPerfilCampo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPerfilCampo() {
		return this.jComboBoxTiposGraficosReportesPerfilCampo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPerfilCampo(
			JComboBox jComboBoxTiposGraficosReportesPerfilCampo) {
		this.jComboBoxTiposGraficosReportesPerfilCampo = jComboBoxTiposGraficosReportesPerfilCampo;
	}
	
	public void setBorderResaltarTiposGraficosReportesPerfilCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPerfilCampo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPerfilCampo() {
		return this.jComboBoxTiposPaginacionPerfilCampo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPerfilCampo(
			JComboBox jComboBoxTiposPaginacionPerfilCampo) {
		this.jComboBoxTiposPaginacionPerfilCampo = jComboBoxTiposPaginacionPerfilCampo;
	}
	
	public void setBorderResaltarTiposPaginacionPerfilCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPerfilCampo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPerfilCampo() {
		return this.jComboBoxTiposRelacionesPerfilCampo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPerfilCampo() {
		return this.jComboBoxTiposAccionesPerfilCampo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPerfilCampo(
			JComboBox jComboBoxTiposRelacionesPerfilCampo) {
		this.jComboBoxTiposRelacionesPerfilCampo = jComboBoxTiposRelacionesPerfilCampo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPerfilCampo(
			JComboBox jComboBoxTiposAccionesPerfilCampo) {
		this.jComboBoxTiposAccionesPerfilCampo = jComboBoxTiposAccionesPerfilCampo;
	}
	
	public void setBorderResaltarTiposRelacionesPerfilCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPerfilCampo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPerfilCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPerfilCampo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPerfilCampo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPerfilCampo() {
	//	return jCheckBoxConGraficoDinamicoPerfilCampo;
	//}

	//public void setjCheckBoxConGraficoDinamicoPerfilCampo(
	//		JCheckBox jCheckBoxConGraficoDinamicoPerfilCampo) {
	//	this.jCheckBoxConGraficoDinamicoPerfilCampo = jCheckBoxConGraficoDinamicoPerfilCampo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPerfilCampo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPerfilCampo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPerfilCampo .setBorder(borderResaltar);		
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
		this.perfilcampoSessionBean=new PerfilCampoSessionBean();
		
		this.perfilcampoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilcampoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.perfilcampoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PerfilCampoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PerfilCampoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PerfilCampoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PerfilCampoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PerfilCampoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Perfil Campo MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
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
		
		PerfilCampoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PerfilCampo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPerfilCampo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPerfilCampo,this.jTtoolBarPerfilCampo,
							"nuevo","nuevo","Nuevo"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPerfilCampo,this.jTtoolBarPerfilCampo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPerfilCampo,this.jTtoolBarPerfilCampo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPerfilCampo,this.jTtoolBarPerfilCampo,
							"duplicar","duplicar","Duplicar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPerfilCampo,this.jTtoolBarPerfilCampo,
							"copiar","copiar","Copiar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPerfilCampo,this.jTtoolBarPerfilCampo,
							"ver_form","ver_form","Ver"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPerfilCampo,this.jTtoolBarPerfilCampo,
							"recargar","recargar","Recargar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPerfilCampo,this.jTtoolBarPerfilCampo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPerfilCampo,this.jTtoolBarPerfilCampo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPerfilCampo,this.jTtoolBarPerfilCampo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPerfilCampo,this.jTtoolBarPerfilCampo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPerfilCampo,this.jTtoolBarPerfilCampo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPerfilCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPerfilCampo,this.jTtoolBarPerfilCampo,
							"cerrar","cerrar","Salir"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPerfilCampo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPerfilCampo;
			
				this.jButtonProcesarInformacionToolBarPerfilCampo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPerfilCampo;
				
		//protected JButton jButtonModificarToolBarPerfilCampo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPerfilCampo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPerfilCampo=new JMenuMe("General");
		this.jmenuArchivoPerfilCampo=new JMenuMe("Archivo");
		this.jmenuAccionesPerfilCampo=new JMenuMe("Acciones");
		this.jmenuDatosPerfilCampo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPerfilCampo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPerfilCampo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPerfilCampo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPerfilCampo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPerfilCampo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPerfilCampo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPerfilCampo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPerfilCampo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPerfilCampo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPerfilCampo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPerfilCampo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPerfilCampo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPerfilCampo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPerfilCampo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPerfilCampo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPerfilCampo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPerfilCampo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPerfilCampo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPerfilCampo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPerfilCampo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPerfilCampo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPerfilCampo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPerfilCampo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPerfilCampo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPerfilCampo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPerfilCampo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPerfilCampo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPerfilCampo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPerfilCampo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPerfilCampo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPerfilCampo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPerfilCampo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPerfilCampo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPerfilCampo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPerfilCampo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPerfilCampo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPerfilCampo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPerfilCampo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPerfilCampo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPerfilCampo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPerfilCampo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPerfilCampo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPerfilCampo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPerfilCampo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPerfilCampo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPerfilCampo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPerfilCampo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPerfilCampo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPerfilCampo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPerfilCampo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPerfilCampo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPerfilCampo.add(this.jMenuItemCerrarPerfilCampo);
			
			this.jmenuAccionesPerfilCampo.add(this.jMenuItemNuevoPerfilCampo);
			this.jmenuAccionesPerfilCampo.add(this.jMenuItemNuevoGuardarCambiosPerfilCampo);
			this.jmenuAccionesPerfilCampo.add(this.jMenuItemNuevoRelacionesPerfilCampo);
			this.jmenuAccionesPerfilCampo.add(this.jMenuItemGuardarCambiosTablaPerfilCampo);		
			this.jmenuAccionesPerfilCampo.add(this.jMenuItemDuplicarPerfilCampo);		
			this.jmenuAccionesPerfilCampo.add(this.jMenuItemCopiarPerfilCampo);		
			this.jmenuAccionesPerfilCampo.add(this.jMenuItemVerFormPerfilCampo);		
			
			this.jmenuDatosPerfilCampo.add(this.jMenuItemRecargarInformacionPerfilCampo);				
			this.jmenuDatosPerfilCampo.add(this.jMenuItemAnterioresPerfilCampo);				
			this.jmenuDatosPerfilCampo.add(this.jMenuItemSiguientesPerfilCampo);				
			this.jmenuDatosPerfilCampo.add(this.jMenuItemAbrirOrderByPerfilCampo);				
			this.jmenuDatosPerfilCampo.add(this.jMenuItemMostrarOcultarPerfilCampo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPerfilCampo.add(this.jMenuItemGuardarCambiosPerfilCampo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPerfilCampo.add(this.jmenuArchivoPerfilCampo);		
			this.jmenuBarPerfilCampo.add(this.jmenuAccionesPerfilCampo);		
			this.jmenuBarPerfilCampo.add(this.jmenuDatosPerfilCampo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPerfilCampo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPerfilCampo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCampoPerfilCampo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCampoPerfilCampo.setToolTipText("Buscar Por Campo ");
		this.jButtonFK_IdCampoPerfilCampo= new JButtonMe();
		this.jButtonFK_IdCampoPerfilCampo.setText("Buscar");
		this.jButtonFK_IdCampoPerfilCampo.setToolTipText("Buscar Por Campo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCampoPerfilCampo,"buscar_button","Buscar Por Campo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCampoPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_campoFK_IdCampoPerfilCampo = new JLabelMe();
		jLabelid_campoFK_IdCampoPerfilCampo.setText("Campo :");
		jLabelid_campoFK_IdCampoPerfilCampo.setToolTipText("Campo");
		jLabelid_campoFK_IdCampoPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_campoFK_IdCampoPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_campoFK_IdCampoPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_campoFK_IdCampoPerfilCampo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_campoFK_IdCampoPerfilCampo= new JComboBoxMe();
		jComboBoxid_campoFK_IdCampoPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_campoFK_IdCampoPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_campoFK_IdCampoPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_campoFK_IdCampoPerfilCampo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPerfilPerfilCampo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPerfilPerfilCampo.setToolTipText("Buscar Por Perfil ");
		this.jButtonFK_IdPerfilPerfilCampo= new JButtonMe();
		this.jButtonFK_IdPerfilPerfilCampo.setText("Buscar");
		this.jButtonFK_IdPerfilPerfilCampo.setToolTipText("Buscar Por Perfil ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPerfilPerfilCampo,"buscar_button","Buscar Por Perfil ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPerfilPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_perfilFK_IdPerfilPerfilCampo = new JLabelMe();
		jLabelid_perfilFK_IdPerfilPerfilCampo.setText("Perfil :");
		jLabelid_perfilFK_IdPerfilPerfilCampo.setToolTipText("Perfil");
		jLabelid_perfilFK_IdPerfilPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_perfilFK_IdPerfilPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_perfilFK_IdPerfilPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_perfilFK_IdPerfilPerfilCampo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_perfilFK_IdPerfilPerfilCampo= new JComboBoxMe();
		jComboBoxid_perfilFK_IdPerfilPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilFK_IdPerfilPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_perfilFK_IdPerfilPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_perfilFK_IdPerfilPerfilCampo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdPerfilid_perfilPerfilCampo= new JButtonMe();
		this.jButtonBuscarFK_IdPerfilid_perfilPerfilCampo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdPerfilid_perfilPerfilCampo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdPerfilid_perfilPerfilCampo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdPerfilid_perfilPerfilCampo.setText("Buscar");
		this.jButtonBuscarFK_IdPerfilid_perfilPerfilCampo.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdPerfilid_perfilPerfilCampo.setFocusable(false);


		this.jTabbedPaneBusquedasPerfilCampo=new JTabbedPane();


		this.jTabbedPaneBusquedasPerfilCampo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPerfilCampo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPerfilCampo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPerfilCampo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPerfilCampo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePerfilCampo = new PerfilCampoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Perfil Campo DATOS");
			this.jInternalFrameDetalleFormPerfilCampo = new PerfilCampoDetalleFormJInternalFrame(jDesktopPane,this.perfilcampoSessionBean.getConGuardarRelaciones(),this.perfilcampoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPerfilCampo = null;//new PerfilCampoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPerfilCampo= new GridBagLayout();
		
		
		this.jTableDatosPerfilCampo = new JTableMe();      
		
		String sToolTipPerfilCampo="";
		sToolTipPerfilCampo=PerfilCampoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPerfilCampo+="(Seguridad.PerfilCampo)";
		}
		
		if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPerfilCampo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPerfilCampo.setToolTipText(sToolTipPerfilCampo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPerfilCampo);
		this.jTableDatosPerfilCampo.setAutoCreateRowSorter(true);
		this.jTableDatosPerfilCampo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPerfilCampo.setRowSelectionAllowed(true);
		this.jTableDatosPerfilCampo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPerfilCampo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPerfilCampo = new JButtonMe();
		this.jButtonDuplicarPerfilCampo = new JButtonMe();
		this.jButtonCopiarPerfilCampo = new JButtonMe();
		this.jButtonVerFormPerfilCampo = new JButtonMe();
		this.jButtonNuevoRelacionesPerfilCampo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPerfilCampo = new JButtonMe();
		this.jButtonCerrarPerfilCampo = new JButtonMe();
		
		this.jScrollPanelDatosPerfilCampo = new JScrollPane();   
        this.jScrollPanelDatosGeneralPerfilCampo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPerfilCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Perfil Campo";
		
		if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Campos" + this.sPath));
		} else {
			this.jScrollPanelDatosPerfilCampo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPerfilCampo.setToolTipText("Acciones");
        this.jPanelAccionesPerfilCampo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPerfilCampo=new ReporteDinamicoJInternalFrame(PerfilCampoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPerfilCampo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPerfilCampo=new ImportacionJInternalFrame(PerfilCampoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPerfilCampo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPerfilCampo = new JButtonMe();
		
		this.jButtonAbrirOrderByPerfilCampo.setText("Orden");
		this.jButtonAbrirOrderByPerfilCampo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPerfilCampo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPerfilCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPerfilCampo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilCampo,false,this);
			
			//this.cargarOrderByPerfilCampo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPerfilCampo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilCampo,true,this);
			
			//this.cargarOrderByPerfilCampo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPerfilCampo.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosPerfilCampo.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosPerfilCampo.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosPerfilCampo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPerfilCampo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPerfilCampo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPerfilCampo.setText("Nuevo");
		this.jButtonDuplicarPerfilCampo.setText("Duplicar");
		this.jButtonCopiarPerfilCampo.setText("Copiar");
		this.jButtonVerFormPerfilCampo.setText("Ver");
		this.jButtonNuevoRelacionesPerfilCampo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPerfilCampo.setText("Guardar");
		this.jButtonCerrarPerfilCampo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPerfilCampo,"nuevo_button","Nuevo",this.perfilcampoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPerfilCampo,"duplicar_button","Duplicar",this.perfilcampoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPerfilCampo,"copiar_button","Copiar",this.perfilcampoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPerfilCampo,"ver_form","Ver",this.perfilcampoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPerfilCampo,"nuevorelaciones_button","Nuevo Rel",this.perfilcampoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPerfilCampo,"guardarcambiostabla_button","Guardar",this.perfilcampoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPerfilCampo,"cerrar_button","Salir",this.perfilcampoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPerfilCampo.setToolTipText("Nuevo"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPerfilCampo.setToolTipText("Duplicar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPerfilCampo.setToolTipText("Copiar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPerfilCampo.setToolTipText("Ver"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPerfilCampo.setToolTipText("Nuevo Rel"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPerfilCampo.setToolTipText("Guardar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPerfilCampo.setToolTipText("Salir"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPerfilCampo";
		inputMap = this.jButtonNuevoPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPerfilCampo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPerfilCampo"));
		
		//DUPLICAR
		sMapKey = "DuplicarPerfilCampo";
		inputMap = this.jButtonDuplicarPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPerfilCampo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPerfilCampo"));
		
		//COPIAR
		sMapKey = "CopiarPerfilCampo";
		inputMap = this.jButtonCopiarPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPerfilCampo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPerfilCampo"));
		
		//VEr FORM
		sMapKey = "VerFormPerfilCampo";
		inputMap = this.jButtonVerFormPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPerfilCampo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPerfilCampo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPerfilCampo";
		inputMap = this.jButtonNuevoRelacionesPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPerfilCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPerfilCampo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPerfilCampo";
		inputMap = this.jButtonModificarPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPerfilCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPerfilCampo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPerfilCampo";
		inputMap = this.jButtonCerrarPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPerfilCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPerfilCampo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPerfilCampo";
		inputMap = this.jButtonGuardarCambiosTablaPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPerfilCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPerfilCampo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPerfilCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPerfilCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPerfilCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PerfilCampo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PerfilCampo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PerfilCampo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PerfilCampo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PerfilCampo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPerfilCampo.setName("jPanelParametrosReportesPerfilCampo"); 
		
		this.jPanelParametrosReportesAccionesPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPerfilCampo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPerfilCampo.setName("jPanelParametrosReportesAccionesPerfilCampo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPerfilCampo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPerfilCampo = new JButtonMe();
		this.jButtonRecargarInformacionPerfilCampo.setText("Recargar");
		this.jButtonRecargarInformacionPerfilCampo.setToolTipText("Recargar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPerfilCampo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPerfilCampo = new JButtonMe();
		this.jButtonProcesarInformacionPerfilCampo.setText("Procesar");
		this.jButtonProcesarInformacionPerfilCampo.setToolTipText("Procesar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPerfilCampo.setVisible(false);
			
		this.jButtonProcesarInformacionPerfilCampo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPerfilCampo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPerfilCampo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPerfilCampo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPerfilCampo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPerfilCampo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPerfilCampo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPerfilCampo.setText("TIPO");       
		this.jComboBoxTiposReportesPerfilCampo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPerfilCampo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPerfilCampo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPerfilCampo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPerfilCampo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPerfilCampo.setText("Paginacion");
		this.jComboBoxTiposPaginacionPerfilCampo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPerfilCampo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPerfilCampo.setText("Accion");
		this.jComboBoxTiposRelacionesPerfilCampo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPerfilCampo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPerfilCampo.setText("Accion");
		this.jComboBoxTiposAccionesPerfilCampo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPerfilCampo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPerfilCampo.setText("Accion");
		this.jComboBoxTiposSeleccionarPerfilCampo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPerfilCampo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPerfilCampo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPerfilCampo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPerfilCampo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPerfilCampo = new JLabelMe();
		
		this.jLabelAccionesPerfilCampo.setText("Acciones");		
		this.jLabelAccionesPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPerfilCampo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPerfilCampo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPerfilCampo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPerfilCampo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPerfilCampo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPerfilCampo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPerfilCampo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPerfilCampo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPerfilCampo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePerfilCampo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePerfilCampo.setText("Graf.");
		this.jCheckBoxConGraficoReportePerfilCampo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPerfilCampo = new JButtonMe();
		//this.jButtonAnterioresPerfilCampo.setText("<<");
        this.jButtonAnterioresPerfilCampo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPerfilCampo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPerfilCampo = new JButtonMe();
		//this.jButtonSiguientesPerfilCampo.setText(">>");
        this.jButtonSiguientesPerfilCampo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPerfilCampo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPerfilCampo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPerfilCampo.setText("Nue");
        this.jButtonNuevoGuardarCambiosPerfilCampo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPerfilCampo,"nuevoguardarcambios_button","Nue",this.perfilcampoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPerfilCampo";
		inputMap = this.jButtonNuevoGuardarCambiosPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPerfilCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPerfilCampo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPerfilCampo";
		inputMap = this.jButtonRecargarInformacionPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPerfilCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPerfilCampo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPerfilCampo";
		inputMap = this.jButtonSiguientesPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPerfilCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPerfilCampo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPerfilCampo";
		inputMap = this.jButtonAnterioresPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPerfilCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPerfilCampo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPerfilCampo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPerfilCampo.setMinimumSize(new Dimension(this.getWidth(),PerfilCampoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilCampoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPerfilCampo.setMaximumSize(new Dimension(this.getWidth(),PerfilCampoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilCampoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPerfilCampo.setPreferredSize(new Dimension(this.getWidth(),PerfilCampoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PerfilCampoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPerfilCampo = new GridBagLayout();

			this.jPanelPaginacionPerfilCampo.setLayout(gridaBagLayoutPaginacionPerfilCampo);						
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.gridy = 0;
			this.gridBagConstraintsPerfilCampo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPerfilCampo.add(this.jButtonAnterioresPerfilCampo, this.gridBagConstraintsPerfilCampo);
					
						
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPerfilCampo.gridy = 0;
			
			this.jPanelPaginacionPerfilCampo.add(this.jButtonNuevoGuardarCambiosPerfilCampo, this.gridBagConstraintsPerfilCampo);
						
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPerfilCampo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPerfilCampo.gridy = 0;
			this.jPanelPaginacionPerfilCampo.add(this.jButtonSiguientesPerfilCampo, this.gridBagConstraintsPerfilCampo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.gridy = 1;
			this.gridBagConstraintsPerfilCampo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilCampo.add(this.jButtonNuevoPerfilCampo, this.gridBagConstraintsPerfilCampo);
						
			
			
			if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
				this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPerfilCampo.gridy = 1;
				this.gridBagConstraintsPerfilCampo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPerfilCampo.add(this.jButtonGuardarCambiosTablaPerfilCampo, this.gridBagConstraintsPerfilCampo);
			}
			
			
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.gridy = 1;
			this.gridBagConstraintsPerfilCampo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilCampo.add(this.jButtonDuplicarPerfilCampo, this.gridBagConstraintsPerfilCampo);
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.gridy = 1;
			this.gridBagConstraintsPerfilCampo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilCampo.add(this.jButtonCopiarPerfilCampo, this.gridBagConstraintsPerfilCampo);
		
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.gridy = 1;
			this.gridBagConstraintsPerfilCampo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPerfilCampo.add(this.jButtonVerFormPerfilCampo, this.gridBagConstraintsPerfilCampo);
		
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.gridy = 1;
			this.gridBagConstraintsPerfilCampo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPerfilCampo.add(this.jButtonCerrarPerfilCampo, this.gridBagConstraintsPerfilCampo);
		
		
		
		this.jButtonRecargarInformacionPerfilCampo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPerfilCampo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPerfilCampo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPerfilCampo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPerfilCampo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPerfilCampo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPerfilCampo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPerfilCampo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPerfilCampo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPerfilCampo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPerfilCampo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPerfilCampo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPerfilCampo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPerfilCampo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPerfilCampo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPerfilCampo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPerfilCampo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPerfilCampo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPerfilCampo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilCampo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPerfilCampo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPerfilCampo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPerfilCampo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPerfilCampo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPerfilCampo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPerfilCampo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPerfilCampo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePerfilCampo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePerfilCampo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePerfilCampo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPerfilCampo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPerfilCampo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPerfilCampo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPerfilCampo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPerfilCampo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPerfilCampo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPerfilCampo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPerfilCampo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PerfilCampo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PerfilCampo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PerfilCampo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PerfilCampo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPerfilCampo.setLayout(gridaBagParametrosReportesPerfilCampo);
			this.jPanelParametrosReportesAccionesPerfilCampo.setLayout(gridaBagParametrosReportesAccionesPerfilCampo);
			
			
			this.jPanelParametrosAuxiliar1PerfilCampo.setLayout(gridaBagParametrosAuxiliar1PerfilCampo);
			this.jPanelParametrosAuxiliar2PerfilCampo.setLayout(gridaBagParametrosAuxiliar2PerfilCampo);
			this.jPanelParametrosAuxiliar3PerfilCampo.setLayout(gridaBagParametrosAuxiliar3PerfilCampo);
			this.jPanelParametrosAuxiliar4PerfilCampo.setLayout(gridaBagParametrosAuxiliar4PerfilCampo);
			//this.jPanelParametrosAuxiliar5PerfilCampo.setLayout(gridaBagParametrosAuxiliar2PerfilCampo);			
			
			
			
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPerfilCampo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilCampo.add(this.jButtonRecargarInformacionPerfilCampo, this.gridBagConstraintsPerfilCampo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilCampo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PerfilCampo.add(this.jComboBoxTiposPaginacionPerfilCampo, this.gridBagConstraintsPerfilCampo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilCampo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PerfilCampo.add(this.jCheckBoxConAltoMaximoTablaPerfilCampo, this.gridBagConstraintsPerfilCampo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilCampo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PerfilCampo.add(this.jComboBoxTiposArchivosReportesPerfilCampo, this.gridBagConstraintsPerfilCampo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilCampo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilCampo.add(this.jPanelParametrosAuxiliar1PerfilCampo, this.gridBagConstraintsPerfilCampo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPerfilCampo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PerfilCampo.add(this.jComboBoxTiposReportesPerfilCampo, this.gridBagConstraintsPerfilCampo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilCampo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilCampo.add(this.jPanelParametrosAuxiliar4PerfilCampo, this.gridBagConstraintsPerfilCampo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilCampo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilCampo.add(this.jComboBoxTiposReportesPerfilCampo, this.gridBagConstraintsPerfilCampo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilCampo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPerfilCampo.add(this.jCheckBoxGenerarReportePerfilCampo, this.gridBagConstraintsPerfilCampo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilCampo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilCampo.add(this.jPanelParametrosAuxiliar2PerfilCampo, this.gridBagConstraintsPerfilCampo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPerfilCampo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPerfilCampo.add(this.jLabelAccionesPerfilCampo, this.gridBagConstraintsPerfilCampo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
				this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPerfilCampo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPerfilCampo.add(this.jButtonAbrirOrderByPerfilCampo, this.gridBagConstraintsPerfilCampo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilCampo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilCampo.add(this.jComboBoxTiposSeleccionarPerfilCampo, this.gridBagConstraintsPerfilCampo);			
			
			
			/*
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPerfilCampo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPerfilCampo.add(this.jCheckBoxSeleccionarTodosPerfilCampo, this.gridBagConstraintsPerfilCampo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPerfilCampo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PerfilCampo.add(this.jCheckBoxSeleccionarTodosPerfilCampo, this.gridBagConstraintsPerfilCampo);															
				
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPerfilCampo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PerfilCampo.add(this.jCheckBoxSeleccionadosPerfilCampo, this.gridBagConstraintsPerfilCampo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilCampo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPerfilCampo.add(this.jPanelParametrosAuxiliar3PerfilCampo, this.gridBagConstraintsPerfilCampo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilCampo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilCampo.add(this.jComboBoxTiposAccionesPerfilCampo, this.gridBagConstraintsPerfilCampo);
	
				
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPerfilCampo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPerfilCampo.add(this.jTextFieldValorCampoGeneralPerfilCampo, this.gridBagConstraintsPerfilCampo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPerfilCampo = new GridBagLayout();

			this.jScrollPanelDatosPerfilCampo.setLayout(gridaBagLayoutDatosPerfilCampo);
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.gridy = 0;
			this.gridBagConstraintsPerfilCampo.gridx = 0;
			
			this.jScrollPanelDatosPerfilCampo.add(this.jTableDatosPerfilCampo, this.gridBagConstraintsPerfilCampo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPerfilCampo.setViewportView(this.jTableDatosPerfilCampo);
		this.jTableDatosPerfilCampo.setFillsViewportHeight(true);
		this.jTableDatosPerfilCampo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPerfilCampo= new GridBagLayout();
		this.jPanelAccionesPerfilCampo.setLayout(gridaBagLayoutAccionesPerfilCampo);
		
		
		/*	
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilCampo.gridy = 0;
		this.gridBagConstraintsPerfilCampo.gridx = 0;
			
		this.jPanelAccionesPerfilCampo.add(this.jButtonNuevoPerfilCampo, this.gridBagConstraintsPerfilCampo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCampoPerfilCampo= new GridBagLayout();
		gridaBagLayoutFK_IdCampoPerfilCampo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCampoPerfilCampo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCampoPerfilCampo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCampoPerfilCampo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCampoPerfilCampo.setLayout(gridaBagLayoutFK_IdCampoPerfilCampo);

		gridBagConstraintsPerfilCampo = new GridBagConstraints();
		gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilCampo.gridy = 0;
		gridBagConstraintsPerfilCampo.gridx = 0;
		jPanelFK_IdCampoPerfilCampo.add(jLabelid_campoFK_IdCampoPerfilCampo, gridBagConstraintsPerfilCampo);

		gridBagConstraintsPerfilCampo = new GridBagConstraints();
		gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilCampo.gridy = 0;
		gridBagConstraintsPerfilCampo.gridx = 1;
		jPanelFK_IdCampoPerfilCampo.add(jComboBoxid_campoFK_IdCampoPerfilCampo, gridBagConstraintsPerfilCampo);

		gridBagConstraintsPerfilCampo = new GridBagConstraints();
		gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilCampo.gridy = 1;
		gridBagConstraintsPerfilCampo.gridx =1;
		jPanelFK_IdCampoPerfilCampo.add(jButtonFK_IdCampoPerfilCampo, gridBagConstraintsPerfilCampo);

		jTabbedPaneBusquedasPerfilCampo.addTab("1.-Por Campo ", jPanelFK_IdCampoPerfilCampo);
		jTabbedPaneBusquedasPerfilCampo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPerfilPerfilCampo= new GridBagLayout();
		gridaBagLayoutFK_IdPerfilPerfilCampo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPerfilPerfilCampo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPerfilPerfilCampo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPerfilPerfilCampo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPerfilPerfilCampo.setLayout(gridaBagLayoutFK_IdPerfilPerfilCampo);

		gridBagConstraintsPerfilCampo = new GridBagConstraints();
		gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilCampo.gridy = 0;
		gridBagConstraintsPerfilCampo.gridx = 0;
		jPanelFK_IdPerfilPerfilCampo.add(jLabelid_perfilFK_IdPerfilPerfilCampo, gridBagConstraintsPerfilCampo);

		gridBagConstraintsPerfilCampo = new GridBagConstraints();
		gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilCampo.gridy = 0;
		gridBagConstraintsPerfilCampo.gridx = 1;
		jPanelFK_IdPerfilPerfilCampo.add(jComboBoxid_perfilFK_IdPerfilPerfilCampo, gridBagConstraintsPerfilCampo);


		gridBagConstraintsPerfilCampo = new GridBagConstraints();
		gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPerfilCampo.fill = GridBagConstraints.NONE;
		gridBagConstraintsPerfilCampo.gridy = 0;
		gridBagConstraintsPerfilCampo.gridx = 0;
		jPanelFK_IdPerfilPerfilCampo.add(this.jButtonBuscarFK_IdPerfilid_perfilPerfilCampo, gridBagConstraintsPerfilCampo);

		gridBagConstraintsPerfilCampo = new GridBagConstraints();
		gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPerfilCampo.gridy = 1;
		gridBagConstraintsPerfilCampo.gridx =1;
		jPanelFK_IdPerfilPerfilCampo.add(jButtonFK_IdPerfilPerfilCampo, gridBagConstraintsPerfilCampo);

		jTabbedPaneBusquedasPerfilCampo.addTab("2.-Por Perfil ", jPanelFK_IdPerfilPerfilCampo);
		jTabbedPaneBusquedasPerfilCampo.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPerfilCampo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPerfilCampo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.perfilcampoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();						
			this.gridBagConstraintsPerfilCampo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPerfilCampo.gridx = 0;		
			//this.gridBagConstraintsPerfilCampo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPerfilCampo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPerfilCampo, this.gridBagConstraintsPerfilCampo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPerfilCampo.gridx = 0;		
		//this.gridBagConstraintsPerfilCampo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPerfilCampo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPerfilCampo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPerfilCampo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPerfilCampo.gridx = 0;		
			this.gridBagConstraintsPerfilCampo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPerfilCampo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPerfilCampo, this.gridBagConstraintsPerfilCampo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilCampo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPerfilCampo, this.gridBagConstraintsPerfilCampo);								
		
		
		/*
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilCampo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPerfilCampo, this.gridBagConstraintsPerfilCampo);
		*/		
		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPerfilCampo.gridx =0;
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPerfilCampo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPerfilCampo, this.gridBagConstraintsPerfilCampo);
				
		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilCampo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPerfilCampo, this.gridBagConstraintsPerfilCampo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PerfilCampoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPerfilCampo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPerfilCampo = new GridBagLayout();
			this.jPanelBusquedasParametrosPerfilCampo.setLayout(gridaBagLayoutBusquedasParametrosPerfilCampo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPerfilCampo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPerfilCampo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilCampo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPerfilCampo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilCampo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPerfilCampo, this.gridBagConstraintsPerfilCampo);
			
			
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPerfilCampo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPerfilCampo, this.gridBagConstraintsPerfilCampo);
		
			
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPerfilCampo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPerfilCampo, this.gridBagConstraintsPerfilCampo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPerfilCampo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPerfilCampo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPerfilCampo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPerfilCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPerfilCampo.setName("jPanelReporteDinamicoPerfilCampo"); 
		
		this.jPanelReporteDinamicoPerfilCampo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPerfilCampo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPerfilCampo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPerfilCampo.setLayout(gridaBagLayoutReporteDinamicoPerfilCampo);
		
		
		this.jInternalFrameReporteDinamicoPerfilCampo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPerfilCampo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePerfilCampo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPerfilCampo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPerfilCampo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPerfilCampo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPerfilCampo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPerfilCampo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPerfilCampo.setResizable(true);
	    this.jInternalFrameReporteDinamicoPerfilCampo.setClosable(true);
	    this.jInternalFrameReporteDinamicoPerfilCampo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPerfilCampo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPerfilCampo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPerfilCampo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Campos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePerfilCampo = new JLabelMe();

		this.jLabelColumnasSelectReportePerfilCampo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilCampo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPerfilCampo.add(this.jLabelColumnasSelectReportePerfilCampo, this.gridBagConstraintsPerfilCampo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePerfilCampo = new JList<Reporte>();
		this.jListColumnasSelectReportePerfilCampo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePerfilCampo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePerfilCampo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePerfilCampo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePerfilCampo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePerfilCampo=new JScrollPane(this.jListColumnasSelectReportePerfilCampo);
			
			this.jScrollColumnasSelectReportePerfilCampo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePerfilCampo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePerfilCampo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilCampo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPerfilCampo.add(this.jListColumnasSelectReportePerfilCampo, this.gridBagConstraintsPerfilCampo);
		this.jPanelReporteDinamicoPerfilCampo.add(this.jScrollColumnasSelectReportePerfilCampo, this.gridBagConstraintsPerfilCampo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePerfilCampo = new JLabelMe();

		this.jLabelRelacionesSelectReportePerfilCampo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePerfilCampo = new JList<Reporte>();
		this.jListRelacionesSelectReportePerfilCampo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePerfilCampo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePerfilCampo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePerfilCampo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePerfilCampo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePerfilCampo=new JScrollPane(this.jListRelacionesSelectReportePerfilCampo);
			
			this.jScrollRelacionesSelectReportePerfilCampo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePerfilCampo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePerfilCampo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPerfilCampo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPerfilCampo = new JComboBoxMe();
		this.jListColumnasValoresGraficoPerfilCampo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPerfilCampo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPerfilCampo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPerfilCampo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPerfilCampo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPerfilCampo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPerfilCampo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPerfilCampo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPerfilCampo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPerfilCampo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPerfilCampo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPerfilCampo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPerfilCampo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilCampo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPerfilCampo.add(this.jLabelGenerarExcelReporteDinamicoPerfilCampo, this.gridBagConstraintsPerfilCampo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPerfilCampo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPerfilCampo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPerfilCampo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPerfilCampo.setToolTipText("Generar EXCEL"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		//this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPerfilCampo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPerfilCampo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPerfilCampo.add(this.jButtonGenerarExcelReporteDinamicoPerfilCampo, this.gridBagConstraintsPerfilCampo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilCampo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilCampo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilCampo.add(this.jComboBoxTiposReportesDinamicoPerfilCampo, this.gridBagConstraintsPerfilCampo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPerfilCampo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPerfilCampo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPerfilCampo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPerfilCampo.add(this.jLabelTiposArchivoReporteDinamicoPerfilCampo, this.gridBagConstraintsPerfilCampo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilCampo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilCampo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilCampo.add(this.jComboBoxTiposArchivosReportesDinamicoPerfilCampo, this.gridBagConstraintsPerfilCampo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPerfilCampo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPerfilCampo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPerfilCampo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPerfilCampo.setToolTipText("Generar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilCampo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilCampo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilCampo.add(this.jButtonGenerarReporteDinamicoPerfilCampo, this.gridBagConstraintsPerfilCampo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPerfilCampo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPerfilCampo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPerfilCampo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPerfilCampo.setToolTipText("Cancelar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilCampo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPerfilCampo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPerfilCampo.add(this.jButtonCerrarReporteDinamicoPerfilCampo, this.gridBagConstraintsPerfilCampo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPerfilCampo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPerfilCampo= new JScrollPane(jPanelReporteDinamicoPerfilCampo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPerfilCampo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPerfilCampo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPerfilCampo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Campos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPerfilCampo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPerfilCampo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPerfilCampo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPerfilCampo);
		this.jInternalFrameReporteDinamicoPerfilCampo.getContentPane().add(this.jScrollPanelReporteDinamicoPerfilCampo, this.gridBagConstraintsPerfilCampo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPerfilCampo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPerfilCampo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPerfilCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPerfilCampo.setName("jPanelImportacionPerfilCampo"); 
		
		this.jPanelImportacionPerfilCampo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPerfilCampo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPerfilCampo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPerfilCampo.setLayout(gridaBagLayoutImportacionPerfilCampo);
		
		
		this.jInternalFrameImportacionPerfilCampo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPerfilCampo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPerfilCampo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePerfilCampo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPerfilCampo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPerfilCampo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPerfilCampo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPerfilCampo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPerfilCampo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPerfilCampo.setResizable(true);
	    this.jInternalFrameImportacionPerfilCampo.setClosable(true);
	    this.jInternalFrameImportacionPerfilCampo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPerfilCampo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPerfilCampo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPerfilCampo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPerfilCampo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPerfilCampo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPerfilCampo.setResizable(true);
	    this.jInternalFrameImportacionPerfilCampo.setClosable(true);
	    this.jInternalFrameImportacionPerfilCampo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPerfilCampo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPerfilCampo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPerfilCampo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Campos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPerfilCampo = new JLabelMe();

		this.jLabelArchivoImportacionPerfilCampo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = iPosYImportacion;		
		this.gridBagConstraintsPerfilCampo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPerfilCampo.add(this.jLabelArchivoImportacionPerfilCampo, this.gridBagConstraintsPerfilCampo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPerfilCampo = new JFileChooser();		
		this.jFileChooserImportacionPerfilCampo.setToolTipText("ESCOGER ARCHIVO"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPerfilCampo = new JButtonMe();
		this.jButtonAbrirImportacionPerfilCampo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPerfilCampo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPerfilCampo.setToolTipText("Generar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilCampo.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilCampo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilCampo.add(this.jButtonAbrirImportacionPerfilCampo, this.gridBagConstraintsPerfilCampo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPerfilCampo = new JLabelMe();

		this.jLabelPathArchivoImportacionPerfilCampo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPerfilCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPerfilCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPerfilCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPerfilCampo.gridy = iPosYImportacion;		
		this.gridBagConstraintsPerfilCampo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPerfilCampo.add(this.jLabelPathArchivoImportacionPerfilCampo, this.gridBagConstraintsPerfilCampo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPerfilCampo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPerfilCampo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPerfilCampo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPerfilCampo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilCampo.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilCampo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilCampo.add(this.jTextFieldPathArchivoImportacionPerfilCampo, this.gridBagConstraintsPerfilCampo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPerfilCampo = new JButtonMe();
		this.jButtonGenerarImportacionPerfilCampo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPerfilCampo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPerfilCampo.setToolTipText("Generar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilCampo.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilCampo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilCampo.add(this.jButtonGenerarImportacionPerfilCampo, this.gridBagConstraintsPerfilCampo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPerfilCampo = new JButtonMe();
		this.jButtonCerrarImportacionPerfilCampo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPerfilCampo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPerfilCampo.setToolTipText("Cancelar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPerfilCampo.gridy = iPosYImportacion;
		this.gridBagConstraintsPerfilCampo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPerfilCampo.add(this.jButtonCerrarImportacionPerfilCampo, this.gridBagConstraintsPerfilCampo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPerfilCampo = new GridBagLayout();
		
		this.jScrollPanelImportacionPerfilCampo= new JScrollPane(jPanelImportacionPerfilCampo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
		this.gridBagConstraintsPerfilCampo.gridy =iPosYImportacion;
		this.gridBagConstraintsPerfilCampo.gridx =iPosXImportacion;
		this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPerfilCampo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPerfilCampo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPerfilCampo);
		this.jInternalFrameImportacionPerfilCampo.getContentPane().add(this.jScrollPanelImportacionPerfilCampo, this.gridBagConstraintsPerfilCampo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPerfilCampo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPerfilCampo = new JButtonMe();
			this.jButtonAbrirOrderByPerfilCampo.setText("Orden");
			this.jButtonAbrirOrderByPerfilCampo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPerfilCampo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPerfilCampo";
			inputMap = this.jButtonAbrirOrderByPerfilCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPerfilCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPerfilCampo"));
		
		
			GridBagLayout gridaBagLayoutOrderByPerfilCampo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPerfilCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPerfilCampo.setName("jPanelOrderByPerfilCampo"); 
			
			this.jPanelOrderByPerfilCampo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPerfilCampo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPerfilCampo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPerfilCampo.setLayout(gridaBagLayoutOrderByPerfilCampo);
			
			
			this.jTableDatosPerfilCampoOrderBy = new JTableMe();        
			this.jTableDatosPerfilCampoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPerfilCampoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPerfilCampoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPerfilCampoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPerfilCampoOrderBy.setViewportView(this.jTableDatosPerfilCampoOrderBy);
			this.jTableDatosPerfilCampoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPerfilCampoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPerfilCampo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPerfilCampo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPerfilCampo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePerfilCampo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPerfilCampo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPerfilCampo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPerfilCampo.setTitle("Orden");
			this.jInternalFrameOrderByPerfilCampo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPerfilCampo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPerfilCampo.setResizable(true);
			this.jInternalFrameOrderByPerfilCampo.setClosable(true);
			this.jInternalFrameOrderByPerfilCampo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPerfilCampo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPerfilCampo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPerfilCampo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPerfilCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Perfil Campos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPerfilCampo.gridx =iPosXOrderBy;
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPerfilCampo.ipady =150;
				
			this.jPanelOrderByPerfilCampo.add(jScrollPanelDatosPerfilCampoOrderBy, this.gridBagConstraintsPerfilCampo);//this.jTableDatosPerfilCampoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPerfilCampo = new JButtonMe();
			this.jButtonCerrarOrderByPerfilCampo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPerfilCampo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPerfilCampo.setToolTipText("Cancelar"+" "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPerfilCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPerfilCampo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPerfilCampo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPerfilCampo.add(this.jButtonCerrarOrderByPerfilCampo, this.gridBagConstraintsPerfilCampo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPerfilCampo = new GridBagLayout();
			
			this.jScrollPanelOrderByPerfilCampo= new JScrollPane(jPanelOrderByPerfilCampo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPerfilCampo = new GridBagConstraints();
			this.gridBagConstraintsPerfilCampo.gridy =iPosYOrderBy;
			this.gridBagConstraintsPerfilCampo.gridx =iPosXOrderBy;
			this.gridBagConstraintsPerfilCampo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPerfilCampo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPerfilCampo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPerfilCampo);
			
			this.jInternalFrameOrderByPerfilCampo.getContentPane().add(this.jScrollPanelOrderByPerfilCampo, this.gridBagConstraintsPerfilCampo);			
		
		} else {
			this.jButtonAbrirOrderByPerfilCampo = new JButtonMe();
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
		int iWidthTableCalculado=0;//1930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.perfilcampoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPerfilCampo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPerfilCampo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPerfilCampo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPerfilCampo.getRowHeight();//PerfilCampoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PerfilCampoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPerfilCampo.isSelected()) {
					iHeightTable=PerfilCampoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PerfilCampoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PerfilCampoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PerfilCampoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPerfilCampo.isSelected()) {
					iHeightTable=PerfilCampoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PerfilCampoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PerfilCampoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPerfilCampo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPerfilCampo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPerfilCampo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPerfilCampo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPerfilCampo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPerfilCampo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPerfilCampo!=null && this.jInternalFrameOrderByPerfilCampo.getjTableDatosOrderBy()!=null) {
			//if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPerfilCampo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPerfilCampo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPerfilCampo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPerfilCampo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPerfilCampo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPerfilCampo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPerfilCampo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPerfilCampo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPerfilCampo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPerfilCampo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=perfilcampoLogic.getPerfilCampos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=perfilcampos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PerfilCampo> TraerPerfilCampoBeans(List<PerfilCampo> perfilcampos,ArrayList<Classe> classes)throws Exception {
		try {
			for(PerfilCampo perfilcampo:perfilcampos) {
					
				if(!(PerfilCampoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PerfilCampoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					perfilcampo.setsDetalleGeneralEntityReporte(PerfilCampoConstantesFunciones.getPerfilCampoDescripcion(perfilcampo));
										
					perfilcampo.settodo_descripcion(PerfilCampoConstantesFunciones.gettodoDescripcion(perfilcampo));perfilcampo.setingreso_descripcion(PerfilCampoConstantesFunciones.getingresoDescripcion(perfilcampo));perfilcampo.setmodificacion_descripcion(PerfilCampoConstantesFunciones.getmodificacionDescripcion(perfilcampo));perfilcampo.seteliminacion_descripcion(PerfilCampoConstantesFunciones.geteliminacionDescripcion(perfilcampo));perfilcampo.setconsulta_descripcion(PerfilCampoConstantesFunciones.getconsultaDescripcion(perfilcampo));perfilcampo.setestado_descripcion(PerfilCampoConstantesFunciones.getestadoDescripcion(perfilcampo));	
					
						
					
				} else  {
							
					//perfilcampo.setsDetalleGeneralEntityReporte(perfilcampo.getsDetalleGeneralEntityReporte());
										
				}
				
				//perfilcampobeans.add(perfilcampobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return perfilcampos;
    }
	//PARA REPORTES FIN
}
