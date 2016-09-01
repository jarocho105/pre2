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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.ComisionPenaConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class ComisionPenaJInternalFrame extends ComisionPenaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarComisionPena;
	
	protected JMenuBar jmenuBarComisionPena;
	
	protected JMenu jmenuComisionPena;
	protected JMenu jmenuDatosComisionPena;
	protected JMenu jmenuArchivoComisionPena;
	protected JMenu jmenuAccionesComisionPena;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosComisionPena = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisionPena;	
	protected GridBagConstraints gridBagConstraintsComisionPena;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ComisionPenaDetalleFormJInternalFrame jInternalFrameDetalleFormComisionPena;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoComisionPena;	
	protected ImportacionJInternalFrame jInternalFrameImportacionComisionPena;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_comisionconfig="";
	
	public ComisionPenaSessionBean comisionpenaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ComisionConfigSessionBean comisionconfigSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ComisionPena> comisionpenas;		
	public List<ComisionPena> comisionpenasEliminados;	
	public List<ComisionPena> comisionpenasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByComisionPena;		
	protected JButton jButtonAbrirOrderByComisionPena;
	
	
	//protected JPanel jPanelOrderByComisionPena;
	//public JScrollPane jScrollPanelOrderByComisionPena;	
	//protected JButton jButtonCerrarOrderByComisionPena;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ComisionPenaLogic comisionpenaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosComisionPena;
	public JScrollPane jScrollPanelDatosEdicionComisionPena;
	public JScrollPane jScrollPanelDatosGeneralComisionPena;
    
	
	
	//public JScrollPane jScrollPanelDatosComisionPenaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoComisionPena;
	//public JScrollPane jScrollPanelImportacionComisionPena;
	
	
	
	protected JPanel jPanelAccionesComisionPena;
	
    protected JPanel jPanelPaginacionComisionPena;
    protected JPanel jPanelParametrosReportesComisionPena;
	protected JPanel jPanelParametrosReportesAccionesComisionPena;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ComisionPena;
	protected JPanel jPanelParametrosAuxiliar2ComisionPena;
	protected JPanel jPanelParametrosAuxiliar3ComisionPena;
	protected JPanel jPanelParametrosAuxiliar4ComisionPena;
	//protected JPanel jPanelParametrosAuxiliar5ComisionPena;
	
	
	
	//protected JPanel jPanelReporteDinamicoComisionPena;
	//protected JPanel jPanelImportacionComisionPena;
	
	
	public JTable jTableDatosComisionPena;
	
	
	
	//public JTable jTableDatosComisionPenaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoComisionPena;
	protected JButton jButtonDuplicarComisionPena;
	protected JButton jButtonCopiarComisionPena;
	protected JButton jButtonVerFormComisionPena;
	protected JButton jButtonNuevoRelacionesComisionPena;
	protected JButton jButtonModificarComisionPena;
	
    protected JButton jButtonGuardarCambiosTablaComisionPena;
	protected JButton jButtonCerrarComisionPena;
	
	
	protected JButton jButtonRecargarInformacionComisionPena;
	protected JButton jButtonProcesarInformacionComisionPena;
	
	
	protected JButton jButtonAnterioresComisionPena;
	protected JButton jButtonSiguientesComisionPena;
	protected JButton jButtonNuevoGuardarCambiosComisionPena;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoComisionPena;
	//protected JButton jButtonCerrarReporteDinamicoComisionPena;
	//protected JButton jButtonGenerarExcelReporteDinamicoComisionPena;	
	
	
	
	//protected JButton jButtonAbrirImportacionComisionPena;
	//protected JButton jButtonGenerarImportacionComisionPena;
	//protected JButton jButtonCerrarImportacionComisionPena;
	//protected JFileChooser jFileChooserImportacionComisionPena;
	//protected File fileImportacionComisionPena;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisionPena;
	protected JButton jButtonDuplicarToolBarComisionPena;
	protected JButton jButtonNuevoRelacionesToolBarComisionPena;
	
	
	public JButton jButtonGuardarCambiosToolBarComisionPena;
	protected JButton jButtonCopiarToolBarComisionPena;
	protected JButton jButtonVerFormToolBarComisionPena;
	public JButton jButtonGuardarCambiosTablaToolBarComisionPena;
	protected JButton jButtonMostrarOcultarTablaToolBarComisionPena;
	protected JButton jButtonCerrarToolBarComisionPena;
	
	protected JButton jButtonRecargarInformacionToolBarComisionPena;
	protected JButton jButtonProcesarInformacionToolBarComisionPena;
	protected JButton jButtonAnterioresToolBarComisionPena;
	protected JButton jButtonSiguientesToolBarComisionPena;
	protected JButton jButtonNuevoGuardarCambiosToolBarComisionPena;
	protected JButton jButtonAbrirOrderByToolBarComisionPena;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisionPena;
	protected JMenuItem jMenuItemDuplicarComisionPena;
	protected JMenuItem jMenuItemNuevoRelacionesComisionPena;
	
	
	protected JMenuItem jMenuItemGuardarCambiosComisionPena;
	protected JMenuItem jMenuItemCopiarComisionPena;
	protected JMenuItem jMenuItemVerFormComisionPena;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisionPena;
	protected JMenuItem jMenuItemCerrarComisionPena;
	protected JMenuItem jMenuItemDetalleCerrarComisionPena;
	protected JMenuItem jMenuItemDetalleAbrirOrderByComisionPena;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisionPena;
	
	protected JMenuItem jMenuItemRecargarInformacionComisionPena;
	protected JMenuItem jMenuItemProcesarInformacionComisionPena;
	protected JMenuItem jMenuItemAnterioresComisionPena;
	protected JMenuItem jMenuItemSiguientesComisionPena;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisionPena;
	protected JMenuItem jMenuItemAbrirOrderByComisionPena;
	protected JMenuItem jMenuItemMostrarOcultarComisionPena;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisionPena;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosComisionPena;
	protected JCheckBox jCheckBoxSeleccionadosComisionPena;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaComisionPena;
	protected JCheckBox jCheckBoxConGraficoReporteComisionPena;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesComisionPena;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesComisionPena;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoComisionPena;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoComisionPena;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesComisionPena;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionComisionPena;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisionPena;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisionPena;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarComisionPena;
	protected JTextField jTextFieldValorCampoGeneralComisionPena;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteComisionPena;
	//public JList<Reporte> jListColumnasSelectReporteComisionPena;
	//public JScrollPane jScrollColumnasSelectReporteComisionPena;
	
	//public JLabel jLabelRelacionesSelectReporteComisionPena;
	//public JList<Reporte> jListRelacionesSelectReporteComisionPena;
	//public JScrollPane jScrollRelacionesSelectReporteComisionPena;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoComisionPena;
	//protected JCheckBox jCheckBoxConGraficoDinamicoComisionPena;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoComisionPena;
	//public JLabel jLabelTiposArchivoReporteDinamicoComisionPena;
	
		
	//public JLabel jLabelArchivoImportacionComisionPena;	
	//public JLabel jLabelPathArchivoImportacionComisionPena;
	//protected JTextField jTextFieldPathArchivoImportacionComisionPena;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoComisionPena;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoComisionPena;
	
	//public JLabel jLabelColumnaCategoriaValorComisionPena;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorComisionPena;
	
	//public JLabel jLabelColumnasValoresGraficoComisionPena;
	//public JList<Reporte> jListColumnasValoresGraficoComisionPena;
	//public JScrollPane jScrollColumnasValoresGraficoComisionPena;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoComisionPena;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoComisionPena;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasComisionPena;
	public JPanel jPanelFK_IdComisionConfigComisionPena;
	public JButton jButtonFK_IdComisionConfigComisionPena;
	
	public JPanel jPanelid_comision_configFK_IdComisionConfigComisionPena;
	public JLabel jLabelid_comision_configFK_IdComisionConfigComisionPena;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_comision_configFK_IdComisionConfigComisionPena;
	public JButton jButtonid_comision_configFK_IdComisionConfigComisionPena= new JButtonMe();
	public JButton jButtonid_comision_configFK_IdComisionConfigComisionPenaUpdate= new JButtonMe();
	public JButton jButtonid_comision_configFK_IdComisionConfigComisionPenaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ComisionPenaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ComisionPena No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionPenaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionPena No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionPenaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionPena No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionPenaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComisionPena No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionComisionPena)	{
		this.jButtonRecargarInformacionComisionPena = jButtonRecargarInformacionComisionPena;
	}
	
	public JButton getjButtonProcesarInformacionComisionPena() {
		return this.jButtonProcesarInformacionComisionPena;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisionPena)	{
		this.jButtonProcesarInformacionComisionPena = jButtonProcesarInformacionComisionPena;
	}
	
	
	public JButton getjButtonRecargarInformacionComisionPena() {
		return this.jButtonRecargarInformacionComisionPena;
	}
	
	
	public List<ComisionPena> getcomisionpenas() {
		return this.comisionpenas;
	}

	public void setcomisionpenas(List<ComisionPena> comisionpenas) {
		this.comisionpenas = comisionpenas;
	}
	
	public List<ComisionPena> getcomisionpenasAux() {
		return this.comisionpenasAux;
	}

	public void setcomisionpenasAux(List<ComisionPena> comisionpenasAux) {
		this.comisionpenasAux = comisionpenasAux;
	}
	
	public List<ComisionPena> getcomisionpenasEliminados() {
		return this.comisionpenasEliminados;
	}

	public void setComisionPenasEliminados(List<ComisionPena> comisionpenasEliminados) {
		this.comisionpenasEliminados = comisionpenasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarComisionPena() {
		return jComboBoxTiposSeleccionarComisionPena;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarComisionPena(
			JComboBox jComboBoxTiposSeleccionarComisionPena) {
		this.jComboBoxTiposSeleccionarComisionPena = jComboBoxTiposSeleccionarComisionPena;
	}
	
	public void setBorderResaltarTiposSeleccionarComisionPena() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarComisionPena.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarComisionPena .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralComisionPena() {
		return jTextFieldValorCampoGeneralComisionPena;
	}

	public void setjTextFieldValorCampoGeneralComisionPena(
			JTextField jTextFieldValorCampoGeneralComisionPena) {
		this.jTextFieldValorCampoGeneralComisionPena = jTextFieldValorCampoGeneralComisionPena;
	}

	public void setBorderResaltarValorCampoGeneralComisionPena() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionPena.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralComisionPena .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosComisionPena() {
		return this.jCheckBoxSeleccionarTodosComisionPena;
	}

	public void setjCheckBoxSeleccionarTodosComisionPena(
			JCheckBox jCheckBoxSeleccionarTodosComisionPena) {
		this.jCheckBoxSeleccionarTodosComisionPena = jCheckBoxSeleccionarTodosComisionPena;
	}

	public void setBorderResaltarSeleccionarTodosComisionPena() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionPena.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosComisionPena .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosComisionPena() {
		return this.jCheckBoxSeleccionadosComisionPena;
	}

	public void setjCheckBoxSeleccionadosComisionPena(
			JCheckBox jCheckBoxSeleccionadosComisionPena) {
		this.jCheckBoxSeleccionadosComisionPena = jCheckBoxSeleccionadosComisionPena;
	}
	
	public void setBorderResaltarSeleccionadosComisionPena() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionPena.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosComisionPena .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesComisionPena() {
		return this.jComboBoxTiposArchivosReportesComisionPena;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesComisionPena(
			JComboBox jComboBoxTiposArchivosReportesComisionPena) {
		this.jComboBoxTiposArchivosReportesComisionPena = jComboBoxTiposArchivosReportesComisionPena;
	}

	public void setBorderResaltarTiposArchivosReportesComisionPena() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionPena.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesComisionPena .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesComisionPena() {
		return this.jComboBoxTiposReportesComisionPena;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesComisionPena(
			JComboBox jComboBoxTiposReportesComisionPena) {
		this.jComboBoxTiposReportesComisionPena = jComboBoxTiposReportesComisionPena;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoComisionPena() {
	//	return jComboBoxTiposReportesDinamicoComisionPena;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoComisionPena(
	//		JComboBox jComboBoxTiposReportesDinamicoComisionPena) {
	//	this.jComboBoxTiposReportesDinamicoComisionPena = jComboBoxTiposReportesDinamicoComisionPena;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoComisionPena() {
	//	return jComboBoxTiposArchivosReportesDinamicoComisionPena;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoComisionPena(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoComisionPena) {
	//	this.jComboBoxTiposArchivosReportesDinamicoComisionPena = jComboBoxTiposArchivosReportesDinamicoComisionPena;
	//}
	
	public void setBorderResaltarTiposReportesComisionPena() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionPena.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesComisionPena .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesComisionPena() {
		return this.jComboBoxTiposGraficosReportesComisionPena;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesComisionPena(
			JComboBox jComboBoxTiposGraficosReportesComisionPena) {
		this.jComboBoxTiposGraficosReportesComisionPena = jComboBoxTiposGraficosReportesComisionPena;
	}
	
	public void setBorderResaltarTiposGraficosReportesComisionPena() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionPena.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesComisionPena .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionComisionPena() {
		return this.jComboBoxTiposPaginacionComisionPena;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionComisionPena(
			JComboBox jComboBoxTiposPaginacionComisionPena) {
		this.jComboBoxTiposPaginacionComisionPena = jComboBoxTiposPaginacionComisionPena;
	}
	
	public void setBorderResaltarTiposPaginacionComisionPena() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionPena.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionComisionPena .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesComisionPena() {
		return this.jComboBoxTiposRelacionesComisionPena;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisionPena() {
		return this.jComboBoxTiposAccionesComisionPena;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisionPena(
			JComboBox jComboBoxTiposRelacionesComisionPena) {
		this.jComboBoxTiposRelacionesComisionPena = jComboBoxTiposRelacionesComisionPena;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisionPena(
			JComboBox jComboBoxTiposAccionesComisionPena) {
		this.jComboBoxTiposAccionesComisionPena = jComboBoxTiposAccionesComisionPena;
	}
	
	public void setBorderResaltarTiposRelacionesComisionPena() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionPena.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesComisionPena .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesComisionPena() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionPena.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesComisionPena .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoComisionPena() {
	//	return jCheckBoxConGraficoDinamicoComisionPena;
	//}

	//public void setjCheckBoxConGraficoDinamicoComisionPena(
	//		JCheckBox jCheckBoxConGraficoDinamicoComisionPena) {
	//	this.jCheckBoxConGraficoDinamicoComisionPena = jCheckBoxConGraficoDinamicoComisionPena;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoComisionPena() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarComisionPena.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoComisionPena .setBorder(borderResaltar);		
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
		this.comisionpenaSessionBean=new ComisionPenaSessionBean();
		
		this.comisionpenaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionpenaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisionpenaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ComisionPenaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ComisionPenaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionPenaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionPenaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionPenaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Penalidad Comision MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
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
		
		ComisionPenaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ComisionPena No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarComisionPena= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarComisionPena,this.jTtoolBarComisionPena,
							"nuevo","nuevo","Nuevo"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarComisionPena,this.jTtoolBarComisionPena,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarComisionPena,this.jTtoolBarComisionPena,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarComisionPena,this.jTtoolBarComisionPena,
							"duplicar","duplicar","Duplicar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarComisionPena,this.jTtoolBarComisionPena,
							"copiar","copiar","Copiar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarComisionPena,this.jTtoolBarComisionPena,
							"ver_form","ver_form","Ver"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionPena,this.jTtoolBarComisionPena,
							"recargar","recargar","Recargar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionPena,this.jTtoolBarComisionPena,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionPena,this.jTtoolBarComisionPena,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarComisionPena,this.jTtoolBarComisionPena,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarComisionPena,this.jTtoolBarComisionPena,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarComisionPena,this.jTtoolBarComisionPena,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarComisionPena=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarComisionPena,this.jTtoolBarComisionPena,
							"cerrar","cerrar","Salir"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarComisionPena=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarComisionPena;
			
				this.jButtonProcesarInformacionToolBarComisionPena=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarComisionPena;
				
		//protected JButton jButtonModificarToolBarComisionPena;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarComisionPena=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuComisionPena=new JMenuMe("General");
		this.jmenuArchivoComisionPena=new JMenuMe("Archivo");
		this.jmenuAccionesComisionPena=new JMenuMe("Acciones");
		this.jmenuDatosComisionPena=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisionPena= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisionPena.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisionPena,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarComisionPena= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarComisionPena.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarComisionPena,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesComisionPena= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesComisionPena.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesComisionPena,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosComisionPena= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisionPena.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisionPena,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarComisionPena= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarComisionPena.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarComisionPena,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormComisionPena= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormComisionPena.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormComisionPena,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaComisionPena= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaComisionPena.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaComisionPena,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisionPena= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisionPena.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisionPena,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionComisionPena= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionComisionPena.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionComisionPena,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionComisionPena= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionComisionPena.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionComisionPena,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresComisionPena= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresComisionPena.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresComisionPena,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesComisionPena= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesComisionPena.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesComisionPena,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByComisionPena= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByComisionPena.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByComisionPena,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisionPena= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisionPena.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisionPena,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByComisionPena= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByComisionPena.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByComisionPena,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisionPena= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisionPena.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisionPena,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosComisionPena= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosComisionPena.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosComisionPena,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoComisionPena.add(this.jMenuItemCerrarComisionPena);
			
			this.jmenuAccionesComisionPena.add(this.jMenuItemNuevoComisionPena);
			this.jmenuAccionesComisionPena.add(this.jMenuItemNuevoGuardarCambiosComisionPena);
			this.jmenuAccionesComisionPena.add(this.jMenuItemNuevoRelacionesComisionPena);
			this.jmenuAccionesComisionPena.add(this.jMenuItemGuardarCambiosTablaComisionPena);		
			this.jmenuAccionesComisionPena.add(this.jMenuItemDuplicarComisionPena);		
			this.jmenuAccionesComisionPena.add(this.jMenuItemCopiarComisionPena);		
			this.jmenuAccionesComisionPena.add(this.jMenuItemVerFormComisionPena);		
			
			this.jmenuDatosComisionPena.add(this.jMenuItemRecargarInformacionComisionPena);				
			this.jmenuDatosComisionPena.add(this.jMenuItemAnterioresComisionPena);				
			this.jmenuDatosComisionPena.add(this.jMenuItemSiguientesComisionPena);				
			this.jmenuDatosComisionPena.add(this.jMenuItemAbrirOrderByComisionPena);				
			this.jmenuDatosComisionPena.add(this.jMenuItemMostrarOcultarComisionPena);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesComisionPena.add(this.jMenuItemGuardarCambiosComisionPena);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarComisionPena.add(this.jmenuArchivoComisionPena);		
			this.jmenuBarComisionPena.add(this.jmenuAccionesComisionPena);		
			this.jmenuBarComisionPena.add(this.jmenuDatosComisionPena);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarComisionPena);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasComisionPena() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdComisionConfigComisionPena=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdComisionConfigComisionPena.setToolTipText("Buscar Por Configuracion ");
		this.jButtonFK_IdComisionConfigComisionPena= new JButtonMe();
		this.jButtonFK_IdComisionConfigComisionPena.setText("Buscar");
		this.jButtonFK_IdComisionConfigComisionPena.setToolTipText("Buscar Por Configuracion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdComisionConfigComisionPena,"buscar_button","Buscar Por Configuracion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdComisionConfigComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_comision_configFK_IdComisionConfigComisionPena = new JLabelMe();
		jLabelid_comision_configFK_IdComisionConfigComisionPena.setText("Configuracion :");
		jLabelid_comision_configFK_IdComisionConfigComisionPena.setToolTipText("Configuracion");
		jLabelid_comision_configFK_IdComisionConfigComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_comision_configFK_IdComisionConfigComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_comision_configFK_IdComisionConfigComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_comision_configFK_IdComisionConfigComisionPena,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_comision_configFK_IdComisionConfigComisionPena= new JComboBoxMe();
		jComboBoxid_comision_configFK_IdComisionConfigComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configFK_IdComisionConfigComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configFK_IdComisionConfigComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_comision_configFK_IdComisionConfigComisionPena,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasComisionPena=new JTabbedPane();


		this.jTabbedPaneBusquedasComisionPena.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComisionPena.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComisionPena.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasComisionPena.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasComisionPena,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleComisionPena = new ComisionPenaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Penalidad Comision DATOS");
			this.jInternalFrameDetalleFormComisionPena = new ComisionPenaDetalleFormJInternalFrame(jDesktopPane,this.comisionpenaSessionBean.getConGuardarRelaciones(),this.comisionpenaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormComisionPena = null;//new ComisionPenaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisionPena= new GridBagLayout();
		
		
		this.jTableDatosComisionPena = new JTableMe();      
		
		String sToolTipComisionPena="";
		sToolTipComisionPena=ComisionPenaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisionPena+="(Comisiones.ComisionPena)";
		}
		
		if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisionPena+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosComisionPena.setToolTipText(sToolTipComisionPena);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosComisionPena);
		this.jTableDatosComisionPena.setAutoCreateRowSorter(true);
		this.jTableDatosComisionPena.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosComisionPena.setRowSelectionAllowed(true);
		this.jTableDatosComisionPena.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosComisionPena,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoComisionPena = new JButtonMe();
		this.jButtonDuplicarComisionPena = new JButtonMe();
		this.jButtonCopiarComisionPena = new JButtonMe();
		this.jButtonVerFormComisionPena = new JButtonMe();
		this.jButtonNuevoRelacionesComisionPena = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaComisionPena = new JButtonMe();
		this.jButtonCerrarComisionPena = new JButtonMe();
		
		this.jScrollPanelDatosComisionPena = new JScrollPane();   
        this.jScrollPanelDatosGeneralComisionPena = new JScrollPane();
		
				
		
		
		this.jPanelAccionesComisionPena = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Penalidad Comision";
		
		if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Penalidad Comisions" + this.sPath));
		} else {
			this.jScrollPanelDatosComisionPena.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisionPena.setToolTipText("Acciones");
        this.jPanelAccionesComisionPena.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoComisionPena=new ReporteDinamicoJInternalFrame(ComisionPenaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoComisionPena();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionComisionPena=new ImportacionJInternalFrame(ComisionPenaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionComisionPena();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByComisionPena = new JButtonMe();
		
		this.jButtonAbrirOrderByComisionPena.setText("Orden");
		this.jButtonAbrirOrderByComisionPena.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisionPena,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByComisionPena.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisionPena=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionPena,false,this);
			
			//this.cargarOrderByComisionPena(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisionPena=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionPena,true,this);
			
			//this.cargarOrderByComisionPena(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosComisionPena.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosComisionPena.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosComisionPena.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosComisionPena.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisionPena.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisionPena.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoComisionPena.setText("Nuevo");
		this.jButtonDuplicarComisionPena.setText("Duplicar");
		this.jButtonCopiarComisionPena.setText("Copiar");
		this.jButtonVerFormComisionPena.setText("Ver");
		this.jButtonNuevoRelacionesComisionPena.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaComisionPena.setText("Guardar");
		this.jButtonCerrarComisionPena.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisionPena,"nuevo_button","Nuevo",this.comisionpenaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarComisionPena,"duplicar_button","Duplicar",this.comisionpenaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarComisionPena,"copiar_button","Copiar",this.comisionpenaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormComisionPena,"ver_form","Ver",this.comisionpenaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesComisionPena,"nuevorelaciones_button","Nuevo Rel",this.comisionpenaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisionPena,"guardarcambiostabla_button","Guardar",this.comisionpenaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisionPena,"cerrar_button","Salir",this.comisionpenaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoComisionPena.setToolTipText("Nuevo"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarComisionPena.setToolTipText("Duplicar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarComisionPena.setToolTipText("Copiar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormComisionPena.setToolTipText("Ver"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesComisionPena.setToolTipText("Nuevo Rel"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaComisionPena.setToolTipText("Guardar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisionPena.setToolTipText("Salir"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisionPena";
		inputMap = this.jButtonNuevoComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisionPena.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisionPena"));
		
		//DUPLICAR
		sMapKey = "DuplicarComisionPena";
		inputMap = this.jButtonDuplicarComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarComisionPena.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarComisionPena"));
		
		//COPIAR
		sMapKey = "CopiarComisionPena";
		inputMap = this.jButtonCopiarComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarComisionPena.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarComisionPena"));
		
		//VEr FORM
		sMapKey = "VerFormComisionPena";
		inputMap = this.jButtonVerFormComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormComisionPena.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormComisionPena"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesComisionPena";
		inputMap = this.jButtonNuevoRelacionesComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesComisionPena.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesComisionPena"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarComisionPena";
		inputMap = this.jButtonModificarComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarComisionPena.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarComisionPena"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarComisionPena";
		inputMap = this.jButtonCerrarComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisionPena.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisionPena"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisionPena";
		inputMap = this.jButtonGuardarCambiosTablaComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisionPena.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisionPena"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesComisionPena = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesComisionPena = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionComisionPena = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ComisionPena= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ComisionPena= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ComisionPena= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ComisionPena= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ComisionPena= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesComisionPena.setName("jPanelParametrosReportesComisionPena"); 
		
		this.jPanelParametrosReportesAccionesComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesComisionPena.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesComisionPena.setName("jPanelParametrosReportesAccionesComisionPena"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesComisionPena, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionComisionPena = new JButtonMe();
		this.jButtonRecargarInformacionComisionPena.setText("Recargar");
		this.jButtonRecargarInformacionComisionPena.setToolTipText("Recargar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionComisionPena,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionComisionPena = new JButtonMe();
		this.jButtonProcesarInformacionComisionPena.setText("Procesar");
		this.jButtonProcesarInformacionComisionPena.setToolTipText("Procesar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionComisionPena.setVisible(false);
			
		this.jButtonProcesarInformacionComisionPena.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisionPena.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisionPena.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesComisionPena = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionPena.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesComisionPena.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesComisionPena = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionPena.setText("TIPO");       
		this.jComboBoxTiposReportesComisionPena.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesComisionPena = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionPena.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesComisionPena.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionComisionPena = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionComisionPena.setText("Paginacion");
		this.jComboBoxTiposPaginacionComisionPena.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesComisionPena = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesComisionPena.setText("Accion");
		this.jComboBoxTiposRelacionesComisionPena.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesComisionPena = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisionPena.setText("Accion");
		this.jComboBoxTiposAccionesComisionPena.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarComisionPena = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarComisionPena.setText("Accion");
		this.jComboBoxTiposSeleccionarComisionPena.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralComisionPena=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralComisionPena.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisionPena.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisionPena.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesComisionPena = new JLabelMe();
		
		this.jLabelAccionesComisionPena.setText("Acciones");		
		this.jLabelAccionesComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosComisionPena = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosComisionPena.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosComisionPena.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosComisionPena = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosComisionPena.setText("Seleccionados");
		this.jCheckBoxSeleccionadosComisionPena.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaComisionPena = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaComisionPena.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaComisionPena.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteComisionPena = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteComisionPena.setText("Graf.");
		this.jCheckBoxConGraficoReporteComisionPena.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresComisionPena = new JButtonMe();
		//this.jButtonAnterioresComisionPena.setText("<<");
        this.jButtonAnterioresComisionPena.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresComisionPena,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesComisionPena = new JButtonMe();
		//this.jButtonSiguientesComisionPena.setText(">>");
        this.jButtonSiguientesComisionPena.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesComisionPena,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosComisionPena = new JButtonMe();
		this.jButtonNuevoGuardarCambiosComisionPena.setText("Nue");
        this.jButtonNuevoGuardarCambiosComisionPena.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosComisionPena,"nuevoguardarcambios_button","Nue",this.comisionpenaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosComisionPena";
		inputMap = this.jButtonNuevoGuardarCambiosComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosComisionPena.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosComisionPena"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionComisionPena";
		inputMap = this.jButtonRecargarInformacionComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionComisionPena.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionComisionPena"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesComisionPena";
		inputMap = this.jButtonSiguientesComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesComisionPena.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesComisionPena"));
		
		//ANTERIORES		
		sMapKey = "AnterioresComisionPena";
		inputMap = this.jButtonAnterioresComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresComisionPena.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresComisionPena"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasComisionPena();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesComisionPena.setMinimumSize(new Dimension(this.getWidth(),ComisionPenaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionPenaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisionPena.setMaximumSize(new Dimension(this.getWidth(),ComisionPenaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionPenaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisionPena.setPreferredSize(new Dimension(this.getWidth(),ComisionPenaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionPenaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionComisionPena = new GridBagLayout();

			this.jPanelPaginacionComisionPena.setLayout(gridaBagLayoutPaginacionComisionPena);						
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy = 0;
			this.gridBagConstraintsComisionPena.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionComisionPena.add(this.jButtonAnterioresComisionPena, this.gridBagConstraintsComisionPena);
					
						
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisionPena.gridy = 0;
			
			this.jPanelPaginacionComisionPena.add(this.jButtonNuevoGuardarCambiosComisionPena, this.gridBagConstraintsComisionPena);
						
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsComisionPena.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisionPena.gridy = 0;
			this.jPanelPaginacionComisionPena.add(this.jButtonSiguientesComisionPena, this.gridBagConstraintsComisionPena);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy = 1;
			this.gridBagConstraintsComisionPena.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionPena.add(this.jButtonNuevoComisionPena, this.gridBagConstraintsComisionPena);
						
			
			
			if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsComisionPena = new GridBagConstraints();
				this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsComisionPena.gridy = 1;
				this.gridBagConstraintsComisionPena.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionComisionPena.add(this.jButtonGuardarCambiosTablaComisionPena, this.gridBagConstraintsComisionPena);
			}
			
			
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy = 1;
			this.gridBagConstraintsComisionPena.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionPena.add(this.jButtonDuplicarComisionPena, this.gridBagConstraintsComisionPena);
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy = 1;
			this.gridBagConstraintsComisionPena.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionPena.add(this.jButtonCopiarComisionPena, this.gridBagConstraintsComisionPena);
		
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy = 1;
			this.gridBagConstraintsComisionPena.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionPena.add(this.jButtonVerFormComisionPena, this.gridBagConstraintsComisionPena);
		
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy = 1;
			this.gridBagConstraintsComisionPena.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionComisionPena.add(this.jButtonCerrarComisionPena, this.gridBagConstraintsComisionPena);
		
		
		
		this.jButtonRecargarInformacionComisionPena.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisionPena.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisionPena.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesComisionPena.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisionPena.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisionPena.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesComisionPena.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisionPena.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisionPena.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesComisionPena.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisionPena.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisionPena.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionComisionPena.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisionPena.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisionPena.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesComisionPena.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisionPena.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisionPena.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesComisionPena.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionPena.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionPena.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarComisionPena.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisionPena.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisionPena.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaComisionPena.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisionPena.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisionPena.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteComisionPena.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisionPena.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisionPena.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosComisionPena.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisionPena.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisionPena.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosComisionPena.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisionPena.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisionPena.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesComisionPena = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesComisionPena = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ComisionPena = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ComisionPena = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ComisionPena = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ComisionPena = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesComisionPena.setLayout(gridaBagParametrosReportesComisionPena);
			this.jPanelParametrosReportesAccionesComisionPena.setLayout(gridaBagParametrosReportesAccionesComisionPena);
			
			
			this.jPanelParametrosAuxiliar1ComisionPena.setLayout(gridaBagParametrosAuxiliar1ComisionPena);
			this.jPanelParametrosAuxiliar2ComisionPena.setLayout(gridaBagParametrosAuxiliar2ComisionPena);
			this.jPanelParametrosAuxiliar3ComisionPena.setLayout(gridaBagParametrosAuxiliar3ComisionPena);
			this.jPanelParametrosAuxiliar4ComisionPena.setLayout(gridaBagParametrosAuxiliar4ComisionPena);
			//this.jPanelParametrosAuxiliar5ComisionPena.setLayout(gridaBagParametrosAuxiliar2ComisionPena);			
			
			
			
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionPena.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionPena.add(this.jButtonRecargarInformacionComisionPena, this.gridBagConstraintsComisionPena);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionPena.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionPena.add(this.jComboBoxTiposPaginacionComisionPena, this.gridBagConstraintsComisionPena);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionPena.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionPena.add(this.jCheckBoxConAltoMaximoTablaComisionPena, this.gridBagConstraintsComisionPena);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionPena.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionPena.add(this.jComboBoxTiposArchivosReportesComisionPena, this.gridBagConstraintsComisionPena);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionPena.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionPena.add(this.jPanelParametrosAuxiliar1ComisionPena, this.gridBagConstraintsComisionPena);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionPena.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ComisionPena.add(this.jComboBoxTiposReportesComisionPena, this.gridBagConstraintsComisionPena);																		
			
			
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionPena.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ComisionPena.add(this.jComboBoxTiposGraficosReportesComisionPena, this.gridBagConstraintsComisionPena);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionPena.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionPena.add(this.jPanelParametrosAuxiliar4ComisionPena, this.gridBagConstraintsComisionPena);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionPena.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionPena.add(this.jComboBoxTiposReportesComisionPena, this.gridBagConstraintsComisionPena);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionPena.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionPena.add(this.jCheckBoxGenerarReporteComisionPena, this.gridBagConstraintsComisionPena);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionPena.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionPena.add(this.jPanelParametrosAuxiliar2ComisionPena, this.gridBagConstraintsComisionPena);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionPena.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionPena.add(this.jLabelAccionesComisionPena, this.gridBagConstraintsComisionPena);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsComisionPena = new GridBagConstraints();
				this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsComisionPena.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsComisionPena.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesComisionPena.add(this.jButtonAbrirOrderByComisionPena, this.gridBagConstraintsComisionPena);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionPena.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionPena.add(this.jComboBoxTiposSeleccionarComisionPena, this.gridBagConstraintsComisionPena);			
			
			
			/*
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionPena.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionPena.add(this.jCheckBoxSeleccionarTodosComisionPena, this.gridBagConstraintsComisionPena);
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionPena.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionPena.add(this.jCheckBoxConGraficoReporteComisionPena, this.gridBagConstraintsComisionPena);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionPena.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionPena.add(this.jCheckBoxSeleccionarTodosComisionPena, this.gridBagConstraintsComisionPena);															
				
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionPena.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionPena.add(this.jCheckBoxSeleccionadosComisionPena, this.gridBagConstraintsComisionPena);															
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionPena.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionPena.add(this.jCheckBoxConGraficoReporteComisionPena, this.gridBagConstraintsComisionPena);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionPena.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionPena.add(this.jPanelParametrosAuxiliar3ComisionPena, this.gridBagConstraintsComisionPena);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionPena.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionPena.add(this.jComboBoxTiposAccionesComisionPena, this.gridBagConstraintsComisionPena);
	
				
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionPena.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionPena.add(this.jTextFieldValorCampoGeneralComisionPena, this.gridBagConstraintsComisionPena);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosComisionPena = new GridBagLayout();

			this.jScrollPanelDatosComisionPena.setLayout(gridaBagLayoutDatosComisionPena);
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy = 0;
			this.gridBagConstraintsComisionPena.gridx = 0;
			
			this.jScrollPanelDatosComisionPena.add(this.jTableDatosComisionPena, this.gridBagConstraintsComisionPena);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosComisionPena.setViewportView(this.jTableDatosComisionPena);
		this.jTableDatosComisionPena.setFillsViewportHeight(true);
		this.jTableDatosComisionPena.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesComisionPena= new GridBagLayout();
		this.jPanelAccionesComisionPena.setLayout(gridaBagLayoutAccionesComisionPena);
		
		
		/*	
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionPena.gridy = 0;
		this.gridBagConstraintsComisionPena.gridx = 0;
			
		this.jPanelAccionesComisionPena.add(this.jButtonNuevoComisionPena, this.gridBagConstraintsComisionPena);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdComisionConfigComisionPena= new GridBagLayout();
		gridaBagLayoutFK_IdComisionConfigComisionPena.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdComisionConfigComisionPena.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdComisionConfigComisionPena.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdComisionConfigComisionPena.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdComisionConfigComisionPena.setLayout(gridaBagLayoutFK_IdComisionConfigComisionPena);

		gridBagConstraintsComisionPena = new GridBagConstraints();
		gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionPena.gridy = 0;
		gridBagConstraintsComisionPena.gridx = 0;
		jPanelFK_IdComisionConfigComisionPena.add(jLabelid_comision_configFK_IdComisionConfigComisionPena, gridBagConstraintsComisionPena);

		gridBagConstraintsComisionPena = new GridBagConstraints();
		gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionPena.gridy = 0;
		gridBagConstraintsComisionPena.gridx = 1;
		jPanelFK_IdComisionConfigComisionPena.add(jComboBoxid_comision_configFK_IdComisionConfigComisionPena, gridBagConstraintsComisionPena);

		gridBagConstraintsComisionPena = new GridBagConstraints();
		gridBagConstraintsComisionPena.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionPena.gridy = 1;
		gridBagConstraintsComisionPena.gridx =1;
		jPanelFK_IdComisionConfigComisionPena.add(jButtonFK_IdComisionConfigComisionPena, gridBagConstraintsComisionPena);

		jTabbedPaneBusquedasComisionPena.addTab("1.-Por Configuracion ", jPanelFK_IdComisionConfigComisionPena);
		jTabbedPaneBusquedasComisionPena.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisionPena = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisionPena);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisionpenaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisionPena = new GridBagConstraints();						
			this.gridBagConstraintsComisionPena.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionPena.gridx = 0;		
			//this.gridBagConstraintsComisionPena.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisionPena.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarComisionPena, this.gridBagConstraintsComisionPena);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy = iGridyPrincipal++;
		this.gridBagConstraintsComisionPena.gridx = 0;		
		//this.gridBagConstraintsComisionPena.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsComisionPena.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsComisionPena);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsComisionPena.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionPena.gridx = 0;		
			this.gridBagConstraintsComisionPena.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsComisionPena.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasComisionPena, this.gridBagConstraintsComisionPena);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionPena.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesComisionPena, this.gridBagConstraintsComisionPena);								
		
		
		/*
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionPena.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesComisionPena, this.gridBagConstraintsComisionPena);
		*/		
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisionPena.gridx =0;
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisionPena.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisionPena, this.gridBagConstraintsComisionPena);
				
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionPena.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionComisionPena, this.gridBagConstraintsComisionPena);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ComisionPenaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosComisionPena= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisionPena = new GridBagLayout();
			this.jPanelBusquedasParametrosComisionPena.setLayout(gridaBagLayoutBusquedasParametrosComisionPena);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralComisionPena=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisionPena.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionPena.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionPena.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionPena.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisionPena, this.gridBagConstraintsComisionPena);
			
			
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionPena.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisionPena, this.gridBagConstraintsComisionPena);
		
			
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisionPena.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisionPena, this.gridBagConstraintsComisionPena);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralComisionPena;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoComisionPena() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoComisionPena = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoComisionPena = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoComisionPena.setName("jPanelReporteDinamicoComisionPena"); 
		
		this.jPanelReporteDinamicoComisionPena.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisionPena.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisionPena.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoComisionPena.setLayout(gridaBagLayoutReporteDinamicoComisionPena);
		
		
		this.jInternalFrameReporteDinamicoComisionPena= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoComisionPena = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisionPena= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoComisionPena.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoComisionPena.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoComisionPena.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoComisionPena.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoComisionPena.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoComisionPena.setResizable(true);
	    this.jInternalFrameReporteDinamicoComisionPena.setClosable(true);
	    this.jInternalFrameReporteDinamicoComisionPena.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoComisionPena.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisionPena.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisionPena.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Penalidad Comisions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteComisionPena = new JLabelMe();

		this.jLabelColumnasSelectReporteComisionPena.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionPena.add(this.jLabelColumnasSelectReporteComisionPena, this.gridBagConstraintsComisionPena);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteComisionPena = new JList<Reporte>();
		this.jListColumnasSelectReporteComisionPena.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteComisionPena.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteComisionPena.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisionPena.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisionPena.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteComisionPena=new JScrollPane(this.jListColumnasSelectReporteComisionPena);
			
			this.jScrollColumnasSelectReporteComisionPena.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisionPena.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisionPena.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoComisionPena.add(this.jListColumnasSelectReporteComisionPena, this.gridBagConstraintsComisionPena);
		this.jPanelReporteDinamicoComisionPena.add(this.jScrollColumnasSelectReporteComisionPena, this.gridBagConstraintsComisionPena);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteComisionPena = new JLabelMe();

		this.jLabelRelacionesSelectReporteComisionPena.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteComisionPena = new JList<Reporte>();
		this.jListRelacionesSelectReporteComisionPena.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteComisionPena.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteComisionPena.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisionPena.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisionPena.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteComisionPena=new JScrollPane(this.jListRelacionesSelectReporteComisionPena);
			
			this.jScrollRelacionesSelectReporteComisionPena.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisionPena.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisionPena.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoComisionPena = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoComisionPena = new JComboBoxMe();
		this.jListColumnasValoresGraficoComisionPena = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoComisionPena = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoComisionPena.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoComisionPena.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisionPena.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisionPena.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoComisionPena = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoComisionPena.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoComisionPena.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisionPena.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisionPena.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoComisionPena = new JLabelMe();

		this.jLabelConGraficoDinamicoComisionPena.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionPena.add(this.jLabelConGraficoDinamicoComisionPena, this.gridBagConstraintsComisionPena);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoComisionPena = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoComisionPena.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoComisionPena.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoComisionPena.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComisionPena.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComisionPena.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionPena.add(this.jCheckBoxConGraficoDinamicoComisionPena, this.gridBagConstraintsComisionPena);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoComisionPena = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoComisionPena.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionPena.add(this.jLabelColumnaCategoriaGraficoComisionPena, this.gridBagConstraintsComisionPena);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoComisionPena = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComisionPena.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoComisionPena.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoComisionPena.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComisionPena.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComisionPena.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoComisionPena.add(this.jComboBoxColumnaCategoriaGraficoComisionPena, this.gridBagConstraintsComisionPena);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorComisionPena = new JLabelMe();

		this.jLabelColumnaCategoriaValorComisionPena.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionPena.add(this.jLabelColumnaCategoriaValorComisionPena, this.gridBagConstraintsComisionPena);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorComisionPena = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorComisionPena.setText("Accion");
        this.jComboBoxColumnaCategoriaValorComisionPena.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorComisionPena.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComisionPena.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComisionPena.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoComisionPena.add(this.jComboBoxColumnaCategoriaValorComisionPena, this.gridBagConstraintsComisionPena);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoComisionPena = new JLabelMe();

		this.jLabelColumnasValoresGraficoComisionPena.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionPena.add(this.jLabelColumnasValoresGraficoComisionPena, this.gridBagConstraintsComisionPena);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoComisionPena = new JList<Reporte>();
		this.jListColumnasValoresGraficoComisionPena.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoComisionPena.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoComisionPena.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComisionPena.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComisionPena.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoComisionPena=new JScrollPane(this.jListColumnasValoresGraficoComisionPena);
			
			this.jScrollColumnasValoresGraficoComisionPena.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComisionPena.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComisionPena.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoComisionPena.add(this.jListColumnasSelectReporteComisionPena, this.gridBagConstraintsComisionPena);
		this.jPanelReporteDinamicoComisionPena.add(this.jScrollColumnasValoresGraficoComisionPena, this.gridBagConstraintsComisionPena);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoComisionPena = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoComisionPena.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionPena.add(this.jLabelTiposGraficosReportesDinamicoComisionPena, this.gridBagConstraintsComisionPena);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoComisionPena = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComisionPena.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoComisionPena.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoComisionPena.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComisionPena.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComisionPena.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionPena.add(this.jComboBoxTiposGraficosReportesDinamicoComisionPena, this.gridBagConstraintsComisionPena);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoComisionPena = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoComisionPena.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionPena.add(this.jLabelGenerarExcelReporteDinamicoComisionPena, this.gridBagConstraintsComisionPena);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoComisionPena = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoComisionPena.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoComisionPena,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoComisionPena.setToolTipText("Generar EXCEL"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsComisionPena = new GridBagConstraints();
		//this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoComisionPena.add(this.jButtonGenerarExcelReporteDinamicoComisionPena, this.gridBagConstraintsComisionPena);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionPena.add(this.jComboBoxTiposReportesDinamicoComisionPena, this.gridBagConstraintsComisionPena);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoComisionPena = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoComisionPena.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionPena.add(this.jLabelTiposArchivoReporteDinamicoComisionPena, this.gridBagConstraintsComisionPena);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionPena.add(this.jComboBoxTiposArchivosReportesDinamicoComisionPena, this.gridBagConstraintsComisionPena);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoComisionPena = new JButtonMe();
		this.jButtonGenerarReporteDinamicoComisionPena.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoComisionPena,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoComisionPena.setToolTipText("Generar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionPena.add(this.jButtonGenerarReporteDinamicoComisionPena, this.gridBagConstraintsComisionPena);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoComisionPena = new JButtonMe();
		this.jButtonCerrarReporteDinamicoComisionPena.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoComisionPena,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoComisionPena.setToolTipText("Cancelar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionPena.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionPena.add(this.jButtonCerrarReporteDinamicoComisionPena, this.gridBagConstraintsComisionPena);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalComisionPena = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoComisionPena= new JScrollPane(jPanelReporteDinamicoComisionPena,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoComisionPena.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisionPena.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisionPena.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Penalidad Comisions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsComisionPena.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoComisionPena.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoComisionPena.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalComisionPena);
		this.jInternalFrameReporteDinamicoComisionPena.getContentPane().add(this.jScrollPanelReporteDinamicoComisionPena, this.gridBagConstraintsComisionPena);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionComisionPena() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionComisionPena = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionComisionPena = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionComisionPena.setName("jPanelImportacionComisionPena"); 
		
		this.jPanelImportacionComisionPena.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisionPena.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisionPena.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionComisionPena.setLayout(gridaBagLayoutImportacionComisionPena);
		
		
		this.jInternalFrameImportacionComisionPena= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionComisionPena= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionComisionPena = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisionPena= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionComisionPena.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisionPena.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisionPena.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionComisionPena.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisionPena.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisionPena.setResizable(true);
	    this.jInternalFrameImportacionComisionPena.setClosable(true);
	    this.jInternalFrameImportacionComisionPena.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionComisionPena.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisionPena.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisionPena.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionComisionPena.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisionPena.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisionPena.setResizable(true);
	    this.jInternalFrameImportacionComisionPena.setClosable(true);
	    this.jInternalFrameImportacionComisionPena.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionComisionPena.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisionPena.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisionPena.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Penalidad Comisions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionComisionPena = new JLabelMe();

		this.jLabelArchivoImportacionComisionPena.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisionPena.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisionPena.add(this.jLabelArchivoImportacionComisionPena, this.gridBagConstraintsComisionPena);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionComisionPena = new JFileChooser();		
		this.jFileChooserImportacionComisionPena.setToolTipText("ESCOGER ARCHIVO"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionComisionPena = new JButtonMe();
		this.jButtonAbrirImportacionComisionPena.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionComisionPena,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionComisionPena.setToolTipText("Generar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionPena.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionPena.add(this.jButtonAbrirImportacionComisionPena, this.gridBagConstraintsComisionPena);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionComisionPena = new JLabelMe();

		this.jLabelPathArchivoImportacionComisionPena.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionComisionPena.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisionPena.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisionPena.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisionPena.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisionPena.add(this.jLabelPathArchivoImportacionComisionPena, this.gridBagConstraintsComisionPena);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionComisionPena=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionComisionPena.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisionPena.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisionPena.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionPena.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionPena.add(this.jTextFieldPathArchivoImportacionComisionPena, this.gridBagConstraintsComisionPena);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionComisionPena = new JButtonMe();
		this.jButtonGenerarImportacionComisionPena.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionComisionPena,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionComisionPena.setToolTipText("Generar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionPena.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionPena.add(this.jButtonGenerarImportacionComisionPena, this.gridBagConstraintsComisionPena);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionComisionPena = new JButtonMe();
		this.jButtonCerrarImportacionComisionPena.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionComisionPena,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionComisionPena.setToolTipText("Cancelar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionPena.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionPena.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionPena.add(this.jButtonCerrarImportacionComisionPena, this.gridBagConstraintsComisionPena);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalComisionPena = new GridBagLayout();
		
		this.jScrollPanelImportacionComisionPena= new JScrollPane(jPanelImportacionComisionPena,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsComisionPena = new GridBagConstraints();
		this.gridBagConstraintsComisionPena.gridy =iPosYImportacion;
		this.gridBagConstraintsComisionPena.gridx =iPosXImportacion;
		this.gridBagConstraintsComisionPena.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionComisionPena.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionComisionPena.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalComisionPena);
		this.jInternalFrameImportacionComisionPena.getContentPane().add(this.jScrollPanelImportacionComisionPena, this.gridBagConstraintsComisionPena);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByComisionPena(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByComisionPena = new JButtonMe();
			this.jButtonAbrirOrderByComisionPena.setText("Orden");
			this.jButtonAbrirOrderByComisionPena.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisionPena,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByComisionPena";
			inputMap = this.jButtonAbrirOrderByComisionPena.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByComisionPena.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByComisionPena"));
		
		
			GridBagLayout gridaBagLayoutOrderByComisionPena = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByComisionPena = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByComisionPena.setName("jPanelOrderByComisionPena"); 
			
			this.jPanelOrderByComisionPena.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisionPena.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisionPena.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByComisionPena.setLayout(gridaBagLayoutOrderByComisionPena);
			
			
			this.jTableDatosComisionPenaOrderBy = new JTableMe();        
			this.jTableDatosComisionPenaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosComisionPenaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosComisionPenaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosComisionPenaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosComisionPenaOrderBy.setViewportView(this.jTableDatosComisionPenaOrderBy);
			this.jTableDatosComisionPenaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosComisionPenaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByComisionPena= new OrderByJInternalFrame();
			this.jInternalFrameOrderByComisionPena= new OrderByJInternalFrame();
			this.jScrollPanelOrderByComisionPena = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteComisionPena= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByComisionPena.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByComisionPena.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByComisionPena.setTitle("Orden");
			this.jInternalFrameOrderByComisionPena.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByComisionPena.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByComisionPena.setResizable(true);
			this.jInternalFrameOrderByComisionPena.setClosable(true);
			this.jInternalFrameOrderByComisionPena.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByComisionPena.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisionPena.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisionPena.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByComisionPena.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Penalidad Comisions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.gridy =iPosYOrderBy++;
			this.gridBagConstraintsComisionPena.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsComisionPena.ipady =150;
				
			this.jPanelOrderByComisionPena.add(jScrollPanelDatosComisionPenaOrderBy, this.gridBagConstraintsComisionPena);//this.jTableDatosComisionPenaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByComisionPena = new JButtonMe();
			this.jButtonCerrarOrderByComisionPena.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByComisionPena,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByComisionPena.setToolTipText("Cancelar"+" "+ComisionPenaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByComisionPena, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionPena.gridy = iPosYOrderBy++;
			this.gridBagConstraintsComisionPena.gridx = iPosXOrderBy;
									
			this.jPanelOrderByComisionPena.add(this.jButtonCerrarOrderByComisionPena, this.gridBagConstraintsComisionPena);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalComisionPena = new GridBagLayout();
			
			this.jScrollPanelOrderByComisionPena= new JScrollPane(jPanelOrderByComisionPena,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsComisionPena = new GridBagConstraints();
			this.gridBagConstraintsComisionPena.gridy =iPosYOrderBy;
			this.gridBagConstraintsComisionPena.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisionPena.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByComisionPena.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByComisionPena.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalComisionPena);
			
			this.jInternalFrameOrderByComisionPena.getContentPane().add(this.jScrollPanelOrderByComisionPena, this.gridBagConstraintsComisionPena);			
		
		} else {
			this.jButtonAbrirOrderByComisionPena = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.comisionpenaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosComisionPena.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosComisionPena.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosComisionPena.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosComisionPena.getRowHeight();//ComisionPenaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ComisionPenaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisionPena.isSelected()) {
					iHeightTable=ComisionPenaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionPenaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionPenaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ComisionPenaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisionPena.isSelected()) {
					iHeightTable=ComisionPenaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionPenaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionPenaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosComisionPena.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisionPena.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisionPena.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosComisionPena.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisionPena.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisionPena.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByComisionPena!=null && this.jInternalFrameOrderByComisionPena.getjTableDatosOrderBy()!=null) {
			//if(!this.comisionpenaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByComisionPena.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByComisionPena.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByComisionPena.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByComisionPena.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByComisionPena.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByComisionPena.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByComisionPena.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosComisionPena.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisionPena.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisionPena.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=comisionpenaLogic.getComisionPenas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisionpenas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ComisionPena> TraerComisionPenaBeans(List<ComisionPena> comisionpenas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ComisionPena comisionpena:comisionpenas) {
					
				if(!(ComisionPenaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ComisionPenaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					comisionpena.setsDetalleGeneralEntityReporte(ComisionPenaConstantesFunciones.getComisionPenaDescripcion(comisionpena));
										
						
					
						
					
				} else  {
							
					//comisionpena.setsDetalleGeneralEntityReporte(comisionpena.getsDetalleGeneralEntityReporte());
										
				}
				
				//comisionpenabeans.add(comisionpenabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return comisionpenas;
    }
	//PARA REPORTES FIN
}
