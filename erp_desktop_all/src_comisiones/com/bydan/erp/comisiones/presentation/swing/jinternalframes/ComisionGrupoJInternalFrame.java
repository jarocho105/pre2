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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.comisiones.util.ComisionGrupoConstantesFunciones;

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
public class ComisionGrupoJInternalFrame extends ComisionGrupoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarComisionGrupo;
	
	protected JMenuBar jmenuBarComisionGrupo;
	
	protected JMenu jmenuComisionGrupo;
	protected JMenu jmenuDatosComisionGrupo;
	protected JMenu jmenuArchivoComisionGrupo;
	protected JMenu jmenuAccionesComisionGrupo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosComisionGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisionGrupo;	
	protected GridBagConstraints gridBagConstraintsComisionGrupo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ComisionGrupoDetalleFormJInternalFrame jInternalFrameDetalleFormComisionGrupo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoComisionGrupo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionComisionGrupo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_comisionconfig="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected EstadoComisionBeanSwingJInternalFrame estadocomisionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocomision="";
	
	public ComisionGrupoSessionBean comisiongrupoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ComisionConfigSessionBean comisionconfigSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public EstadoComisionSessionBean estadocomisionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ComisionGrupo> comisiongrupos;		
	public List<ComisionGrupo> comisiongruposEliminados;	
	public List<ComisionGrupo> comisiongruposAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByComisionGrupo;		
	protected JButton jButtonAbrirOrderByComisionGrupo;
	
	
	//protected JPanel jPanelOrderByComisionGrupo;
	//public JScrollPane jScrollPanelOrderByComisionGrupo;	
	//protected JButton jButtonCerrarOrderByComisionGrupo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ComisionGrupoLogic comisiongrupoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosComisionGrupo;
	public JScrollPane jScrollPanelDatosEdicionComisionGrupo;
	public JScrollPane jScrollPanelDatosGeneralComisionGrupo;
    
	
	
	//public JScrollPane jScrollPanelDatosComisionGrupoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoComisionGrupo;
	//public JScrollPane jScrollPanelImportacionComisionGrupo;
	
	
	
	protected JPanel jPanelAccionesComisionGrupo;
	
    protected JPanel jPanelPaginacionComisionGrupo;
    protected JPanel jPanelParametrosReportesComisionGrupo;
	protected JPanel jPanelParametrosReportesAccionesComisionGrupo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ComisionGrupo;
	protected JPanel jPanelParametrosAuxiliar2ComisionGrupo;
	protected JPanel jPanelParametrosAuxiliar3ComisionGrupo;
	protected JPanel jPanelParametrosAuxiliar4ComisionGrupo;
	//protected JPanel jPanelParametrosAuxiliar5ComisionGrupo;
	
	
	
	//protected JPanel jPanelReporteDinamicoComisionGrupo;
	//protected JPanel jPanelImportacionComisionGrupo;
	
	
	public JTable jTableDatosComisionGrupo;
	
	
	
	//public JTable jTableDatosComisionGrupoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoComisionGrupo;
	protected JButton jButtonDuplicarComisionGrupo;
	protected JButton jButtonCopiarComisionGrupo;
	protected JButton jButtonVerFormComisionGrupo;
	protected JButton jButtonNuevoRelacionesComisionGrupo;
	protected JButton jButtonModificarComisionGrupo;
	
    protected JButton jButtonGuardarCambiosTablaComisionGrupo;
	protected JButton jButtonCerrarComisionGrupo;
	
	
	protected JButton jButtonRecargarInformacionComisionGrupo;
	protected JButton jButtonProcesarInformacionComisionGrupo;
	
	
	protected JButton jButtonAnterioresComisionGrupo;
	protected JButton jButtonSiguientesComisionGrupo;
	protected JButton jButtonNuevoGuardarCambiosComisionGrupo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoComisionGrupo;
	//protected JButton jButtonCerrarReporteDinamicoComisionGrupo;
	//protected JButton jButtonGenerarExcelReporteDinamicoComisionGrupo;	
	
	
	
	//protected JButton jButtonAbrirImportacionComisionGrupo;
	//protected JButton jButtonGenerarImportacionComisionGrupo;
	//protected JButton jButtonCerrarImportacionComisionGrupo;
	//protected JFileChooser jFileChooserImportacionComisionGrupo;
	//protected File fileImportacionComisionGrupo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisionGrupo;
	protected JButton jButtonDuplicarToolBarComisionGrupo;
	protected JButton jButtonNuevoRelacionesToolBarComisionGrupo;
	
	
	public JButton jButtonGuardarCambiosToolBarComisionGrupo;
	protected JButton jButtonCopiarToolBarComisionGrupo;
	protected JButton jButtonVerFormToolBarComisionGrupo;
	public JButton jButtonGuardarCambiosTablaToolBarComisionGrupo;
	protected JButton jButtonMostrarOcultarTablaToolBarComisionGrupo;
	protected JButton jButtonCerrarToolBarComisionGrupo;
	
	protected JButton jButtonRecargarInformacionToolBarComisionGrupo;
	protected JButton jButtonProcesarInformacionToolBarComisionGrupo;
	protected JButton jButtonAnterioresToolBarComisionGrupo;
	protected JButton jButtonSiguientesToolBarComisionGrupo;
	protected JButton jButtonNuevoGuardarCambiosToolBarComisionGrupo;
	protected JButton jButtonAbrirOrderByToolBarComisionGrupo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisionGrupo;
	protected JMenuItem jMenuItemDuplicarComisionGrupo;
	protected JMenuItem jMenuItemNuevoRelacionesComisionGrupo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosComisionGrupo;
	protected JMenuItem jMenuItemCopiarComisionGrupo;
	protected JMenuItem jMenuItemVerFormComisionGrupo;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisionGrupo;
	protected JMenuItem jMenuItemCerrarComisionGrupo;
	protected JMenuItem jMenuItemDetalleCerrarComisionGrupo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByComisionGrupo;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisionGrupo;
	
	protected JMenuItem jMenuItemRecargarInformacionComisionGrupo;
	protected JMenuItem jMenuItemProcesarInformacionComisionGrupo;
	protected JMenuItem jMenuItemAnterioresComisionGrupo;
	protected JMenuItem jMenuItemSiguientesComisionGrupo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisionGrupo;
	protected JMenuItem jMenuItemAbrirOrderByComisionGrupo;
	protected JMenuItem jMenuItemMostrarOcultarComisionGrupo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisionGrupo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosComisionGrupo;
	protected JCheckBox jCheckBoxSeleccionadosComisionGrupo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaComisionGrupo;
	protected JCheckBox jCheckBoxConGraficoReporteComisionGrupo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesComisionGrupo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesComisionGrupo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoComisionGrupo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoComisionGrupo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesComisionGrupo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionComisionGrupo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisionGrupo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisionGrupo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarComisionGrupo;
	protected JTextField jTextFieldValorCampoGeneralComisionGrupo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteComisionGrupo;
	//public JList<Reporte> jListColumnasSelectReporteComisionGrupo;
	//public JScrollPane jScrollColumnasSelectReporteComisionGrupo;
	
	//public JLabel jLabelRelacionesSelectReporteComisionGrupo;
	//public JList<Reporte> jListRelacionesSelectReporteComisionGrupo;
	//public JScrollPane jScrollRelacionesSelectReporteComisionGrupo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoComisionGrupo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoComisionGrupo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoComisionGrupo;
	//public JLabel jLabelTiposArchivoReporteDinamicoComisionGrupo;
	
		
	//public JLabel jLabelArchivoImportacionComisionGrupo;	
	//public JLabel jLabelPathArchivoImportacionComisionGrupo;
	//protected JTextField jTextFieldPathArchivoImportacionComisionGrupo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoComisionGrupo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoComisionGrupo;
	
	//public JLabel jLabelColumnaCategoriaValorComisionGrupo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorComisionGrupo;
	
	//public JLabel jLabelColumnasValoresGraficoComisionGrupo;
	//public JList<Reporte> jListColumnasValoresGraficoComisionGrupo;
	//public JScrollPane jScrollColumnasValoresGraficoComisionGrupo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoComisionGrupo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoComisionGrupo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasComisionGrupo;
	public JPanel jPanelFK_IdComisionConfigComisionGrupo;
	public JButton jButtonFK_IdComisionConfigComisionGrupo;
	
	public JPanel jPanelid_comision_configFK_IdComisionConfigComisionGrupo;
	public JLabel jLabelid_comision_configFK_IdComisionConfigComisionGrupo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo;
	public JButton jButtonid_comision_configFK_IdComisionConfigComisionGrupo= new JButtonMe();
	public JButton jButtonid_comision_configFK_IdComisionConfigComisionGrupoUpdate= new JButtonMe();
	public JButton jButtonid_comision_configFK_IdComisionConfigComisionGrupoBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ComisionGrupoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ComisionGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionGrupoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionGrupoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionGrupoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComisionGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionComisionGrupo)	{
		this.jButtonRecargarInformacionComisionGrupo = jButtonRecargarInformacionComisionGrupo;
	}
	
	public JButton getjButtonProcesarInformacionComisionGrupo() {
		return this.jButtonProcesarInformacionComisionGrupo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisionGrupo)	{
		this.jButtonProcesarInformacionComisionGrupo = jButtonProcesarInformacionComisionGrupo;
	}
	
	
	public JButton getjButtonRecargarInformacionComisionGrupo() {
		return this.jButtonRecargarInformacionComisionGrupo;
	}
	
	
	public List<ComisionGrupo> getcomisiongrupos() {
		return this.comisiongrupos;
	}

	public void setcomisiongrupos(List<ComisionGrupo> comisiongrupos) {
		this.comisiongrupos = comisiongrupos;
	}
	
	public List<ComisionGrupo> getcomisiongruposAux() {
		return this.comisiongruposAux;
	}

	public void setcomisiongruposAux(List<ComisionGrupo> comisiongruposAux) {
		this.comisiongruposAux = comisiongruposAux;
	}
	
	public List<ComisionGrupo> getcomisiongruposEliminados() {
		return this.comisiongruposEliminados;
	}

	public void setComisionGruposEliminados(List<ComisionGrupo> comisiongruposEliminados) {
		this.comisiongruposEliminados = comisiongruposEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarComisionGrupo() {
		return jComboBoxTiposSeleccionarComisionGrupo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarComisionGrupo(
			JComboBox jComboBoxTiposSeleccionarComisionGrupo) {
		this.jComboBoxTiposSeleccionarComisionGrupo = jComboBoxTiposSeleccionarComisionGrupo;
	}
	
	public void setBorderResaltarTiposSeleccionarComisionGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarComisionGrupo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarComisionGrupo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralComisionGrupo() {
		return jTextFieldValorCampoGeneralComisionGrupo;
	}

	public void setjTextFieldValorCampoGeneralComisionGrupo(
			JTextField jTextFieldValorCampoGeneralComisionGrupo) {
		this.jTextFieldValorCampoGeneralComisionGrupo = jTextFieldValorCampoGeneralComisionGrupo;
	}

	public void setBorderResaltarValorCampoGeneralComisionGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionGrupo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralComisionGrupo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosComisionGrupo() {
		return this.jCheckBoxSeleccionarTodosComisionGrupo;
	}

	public void setjCheckBoxSeleccionarTodosComisionGrupo(
			JCheckBox jCheckBoxSeleccionarTodosComisionGrupo) {
		this.jCheckBoxSeleccionarTodosComisionGrupo = jCheckBoxSeleccionarTodosComisionGrupo;
	}

	public void setBorderResaltarSeleccionarTodosComisionGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionGrupo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosComisionGrupo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosComisionGrupo() {
		return this.jCheckBoxSeleccionadosComisionGrupo;
	}

	public void setjCheckBoxSeleccionadosComisionGrupo(
			JCheckBox jCheckBoxSeleccionadosComisionGrupo) {
		this.jCheckBoxSeleccionadosComisionGrupo = jCheckBoxSeleccionadosComisionGrupo;
	}
	
	public void setBorderResaltarSeleccionadosComisionGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionGrupo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosComisionGrupo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesComisionGrupo() {
		return this.jComboBoxTiposArchivosReportesComisionGrupo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesComisionGrupo(
			JComboBox jComboBoxTiposArchivosReportesComisionGrupo) {
		this.jComboBoxTiposArchivosReportesComisionGrupo = jComboBoxTiposArchivosReportesComisionGrupo;
	}

	public void setBorderResaltarTiposArchivosReportesComisionGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionGrupo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesComisionGrupo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesComisionGrupo() {
		return this.jComboBoxTiposReportesComisionGrupo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesComisionGrupo(
			JComboBox jComboBoxTiposReportesComisionGrupo) {
		this.jComboBoxTiposReportesComisionGrupo = jComboBoxTiposReportesComisionGrupo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoComisionGrupo() {
	//	return jComboBoxTiposReportesDinamicoComisionGrupo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoComisionGrupo(
	//		JComboBox jComboBoxTiposReportesDinamicoComisionGrupo) {
	//	this.jComboBoxTiposReportesDinamicoComisionGrupo = jComboBoxTiposReportesDinamicoComisionGrupo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoComisionGrupo() {
	//	return jComboBoxTiposArchivosReportesDinamicoComisionGrupo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoComisionGrupo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoComisionGrupo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoComisionGrupo = jComboBoxTiposArchivosReportesDinamicoComisionGrupo;
	//}
	
	public void setBorderResaltarTiposReportesComisionGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionGrupo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesComisionGrupo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesComisionGrupo() {
		return this.jComboBoxTiposGraficosReportesComisionGrupo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesComisionGrupo(
			JComboBox jComboBoxTiposGraficosReportesComisionGrupo) {
		this.jComboBoxTiposGraficosReportesComisionGrupo = jComboBoxTiposGraficosReportesComisionGrupo;
	}
	
	public void setBorderResaltarTiposGraficosReportesComisionGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionGrupo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesComisionGrupo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionComisionGrupo() {
		return this.jComboBoxTiposPaginacionComisionGrupo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionComisionGrupo(
			JComboBox jComboBoxTiposPaginacionComisionGrupo) {
		this.jComboBoxTiposPaginacionComisionGrupo = jComboBoxTiposPaginacionComisionGrupo;
	}
	
	public void setBorderResaltarTiposPaginacionComisionGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionGrupo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionComisionGrupo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesComisionGrupo() {
		return this.jComboBoxTiposRelacionesComisionGrupo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisionGrupo() {
		return this.jComboBoxTiposAccionesComisionGrupo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisionGrupo(
			JComboBox jComboBoxTiposRelacionesComisionGrupo) {
		this.jComboBoxTiposRelacionesComisionGrupo = jComboBoxTiposRelacionesComisionGrupo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisionGrupo(
			JComboBox jComboBoxTiposAccionesComisionGrupo) {
		this.jComboBoxTiposAccionesComisionGrupo = jComboBoxTiposAccionesComisionGrupo;
	}
	
	public void setBorderResaltarTiposRelacionesComisionGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionGrupo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesComisionGrupo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesComisionGrupo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarComisionGrupo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesComisionGrupo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoComisionGrupo() {
	//	return jCheckBoxConGraficoDinamicoComisionGrupo;
	//}

	//public void setjCheckBoxConGraficoDinamicoComisionGrupo(
	//		JCheckBox jCheckBoxConGraficoDinamicoComisionGrupo) {
	//	this.jCheckBoxConGraficoDinamicoComisionGrupo = jCheckBoxConGraficoDinamicoComisionGrupo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoComisionGrupo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarComisionGrupo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoComisionGrupo .setBorder(borderResaltar);		
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
		this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
		
		this.comisiongrupoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisiongrupoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisiongrupoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ComisionGrupoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ComisionGrupoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionGrupoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionGrupoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionGrupoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comision Grupo MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
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
		
		ComisionGrupoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ComisionGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarComisionGrupo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarComisionGrupo,this.jTtoolBarComisionGrupo,
							"nuevo","nuevo","Nuevo"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarComisionGrupo,this.jTtoolBarComisionGrupo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarComisionGrupo,this.jTtoolBarComisionGrupo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarComisionGrupo,this.jTtoolBarComisionGrupo,
							"duplicar","duplicar","Duplicar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarComisionGrupo,this.jTtoolBarComisionGrupo,
							"copiar","copiar","Copiar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarComisionGrupo,this.jTtoolBarComisionGrupo,
							"ver_form","ver_form","Ver"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionGrupo,this.jTtoolBarComisionGrupo,
							"recargar","recargar","Recargar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionGrupo,this.jTtoolBarComisionGrupo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarComisionGrupo,this.jTtoolBarComisionGrupo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarComisionGrupo,this.jTtoolBarComisionGrupo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarComisionGrupo,this.jTtoolBarComisionGrupo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarComisionGrupo,this.jTtoolBarComisionGrupo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarComisionGrupo,this.jTtoolBarComisionGrupo,
							"cerrar","cerrar","Salir"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarComisionGrupo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarComisionGrupo;
			
				this.jButtonProcesarInformacionToolBarComisionGrupo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarComisionGrupo;
				
		//protected JButton jButtonModificarToolBarComisionGrupo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarComisionGrupo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuComisionGrupo=new JMenuMe("General");
		this.jmenuArchivoComisionGrupo=new JMenuMe("Archivo");
		this.jmenuAccionesComisionGrupo=new JMenuMe("Acciones");
		this.jmenuDatosComisionGrupo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisionGrupo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisionGrupo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisionGrupo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarComisionGrupo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarComisionGrupo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarComisionGrupo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesComisionGrupo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesComisionGrupo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesComisionGrupo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosComisionGrupo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisionGrupo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisionGrupo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarComisionGrupo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarComisionGrupo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarComisionGrupo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormComisionGrupo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormComisionGrupo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormComisionGrupo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaComisionGrupo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaComisionGrupo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaComisionGrupo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisionGrupo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisionGrupo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisionGrupo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionComisionGrupo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionComisionGrupo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionComisionGrupo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionComisionGrupo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionComisionGrupo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionComisionGrupo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresComisionGrupo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresComisionGrupo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresComisionGrupo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesComisionGrupo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesComisionGrupo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesComisionGrupo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByComisionGrupo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByComisionGrupo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByComisionGrupo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisionGrupo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisionGrupo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisionGrupo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByComisionGrupo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByComisionGrupo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByComisionGrupo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisionGrupo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisionGrupo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisionGrupo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosComisionGrupo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosComisionGrupo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosComisionGrupo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoComisionGrupo.add(this.jMenuItemCerrarComisionGrupo);
			
			this.jmenuAccionesComisionGrupo.add(this.jMenuItemNuevoComisionGrupo);
			this.jmenuAccionesComisionGrupo.add(this.jMenuItemNuevoGuardarCambiosComisionGrupo);
			this.jmenuAccionesComisionGrupo.add(this.jMenuItemNuevoRelacionesComisionGrupo);
			this.jmenuAccionesComisionGrupo.add(this.jMenuItemGuardarCambiosTablaComisionGrupo);		
			this.jmenuAccionesComisionGrupo.add(this.jMenuItemDuplicarComisionGrupo);		
			this.jmenuAccionesComisionGrupo.add(this.jMenuItemCopiarComisionGrupo);		
			this.jmenuAccionesComisionGrupo.add(this.jMenuItemVerFormComisionGrupo);		
			
			this.jmenuDatosComisionGrupo.add(this.jMenuItemRecargarInformacionComisionGrupo);				
			this.jmenuDatosComisionGrupo.add(this.jMenuItemAnterioresComisionGrupo);				
			this.jmenuDatosComisionGrupo.add(this.jMenuItemSiguientesComisionGrupo);				
			this.jmenuDatosComisionGrupo.add(this.jMenuItemAbrirOrderByComisionGrupo);				
			this.jmenuDatosComisionGrupo.add(this.jMenuItemMostrarOcultarComisionGrupo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesComisionGrupo.add(this.jMenuItemGuardarCambiosComisionGrupo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarComisionGrupo.add(this.jmenuArchivoComisionGrupo);		
			this.jmenuBarComisionGrupo.add(this.jmenuAccionesComisionGrupo);		
			this.jmenuBarComisionGrupo.add(this.jmenuDatosComisionGrupo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarComisionGrupo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasComisionGrupo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdComisionConfigComisionGrupo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdComisionConfigComisionGrupo.setToolTipText("Buscar Por Configuracion ");
		this.jButtonFK_IdComisionConfigComisionGrupo= new JButtonMe();
		this.jButtonFK_IdComisionConfigComisionGrupo.setText("Buscar");
		this.jButtonFK_IdComisionConfigComisionGrupo.setToolTipText("Buscar Por Configuracion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdComisionConfigComisionGrupo,"buscar_button","Buscar Por Configuracion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdComisionConfigComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_comision_configFK_IdComisionConfigComisionGrupo = new JLabelMe();
		jLabelid_comision_configFK_IdComisionConfigComisionGrupo.setText("Configuracion :");
		jLabelid_comision_configFK_IdComisionConfigComisionGrupo.setToolTipText("Configuracion");
		jLabelid_comision_configFK_IdComisionConfigComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_comision_configFK_IdComisionConfigComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_comision_configFK_IdComisionConfigComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_comision_configFK_IdComisionConfigComisionGrupo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo= new JComboBoxMe();
		jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasComisionGrupo=new JTabbedPane();


		this.jTabbedPaneBusquedasComisionGrupo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComisionGrupo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasComisionGrupo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasComisionGrupo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasComisionGrupo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleComisionGrupo = new ComisionGrupoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Comision Grupo DATOS");
			this.jInternalFrameDetalleFormComisionGrupo = new ComisionGrupoDetalleFormJInternalFrame(jDesktopPane,this.comisiongrupoSessionBean.getConGuardarRelaciones(),this.comisiongrupoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormComisionGrupo = null;//new ComisionGrupoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisionGrupo= new GridBagLayout();
		
		
		this.jTableDatosComisionGrupo = new JTableMe();      
		
		String sToolTipComisionGrupo="";
		sToolTipComisionGrupo=ComisionGrupoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisionGrupo+="(Comisiones.ComisionGrupo)";
		}
		
		if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisionGrupo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosComisionGrupo.setToolTipText(sToolTipComisionGrupo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosComisionGrupo);
		this.jTableDatosComisionGrupo.setAutoCreateRowSorter(true);
		this.jTableDatosComisionGrupo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosComisionGrupo.setRowSelectionAllowed(true);
		this.jTableDatosComisionGrupo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosComisionGrupo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoComisionGrupo = new JButtonMe();
		this.jButtonDuplicarComisionGrupo = new JButtonMe();
		this.jButtonCopiarComisionGrupo = new JButtonMe();
		this.jButtonVerFormComisionGrupo = new JButtonMe();
		this.jButtonNuevoRelacionesComisionGrupo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaComisionGrupo = new JButtonMe();
		this.jButtonCerrarComisionGrupo = new JButtonMe();
		
		this.jScrollPanelDatosComisionGrupo = new JScrollPane();   
        this.jScrollPanelDatosGeneralComisionGrupo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesComisionGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Comision Grupo";
		
		if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Grupos" + this.sPath));
		} else {
			this.jScrollPanelDatosComisionGrupo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisionGrupo.setToolTipText("Acciones");
        this.jPanelAccionesComisionGrupo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoComisionGrupo=new ReporteDinamicoJInternalFrame(ComisionGrupoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoComisionGrupo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionComisionGrupo=new ImportacionJInternalFrame(ComisionGrupoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionComisionGrupo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByComisionGrupo = new JButtonMe();
		
		this.jButtonAbrirOrderByComisionGrupo.setText("Orden");
		this.jButtonAbrirOrderByComisionGrupo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisionGrupo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByComisionGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisionGrupo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionGrupo,false,this);
			
			//this.cargarOrderByComisionGrupo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByComisionGrupo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionGrupo,true,this);
			
			//this.cargarOrderByComisionGrupo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosComisionGrupo.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosComisionGrupo.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosComisionGrupo.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosComisionGrupo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisionGrupo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosComisionGrupo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoComisionGrupo.setText("Nuevo");
		this.jButtonDuplicarComisionGrupo.setText("Duplicar");
		this.jButtonCopiarComisionGrupo.setText("Copiar");
		this.jButtonVerFormComisionGrupo.setText("Ver");
		this.jButtonNuevoRelacionesComisionGrupo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaComisionGrupo.setText("Guardar");
		this.jButtonCerrarComisionGrupo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisionGrupo,"nuevo_button","Nuevo",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarComisionGrupo,"duplicar_button","Duplicar",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarComisionGrupo,"copiar_button","Copiar",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormComisionGrupo,"ver_form","Ver",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesComisionGrupo,"nuevorelaciones_button","Nuevo Rel",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisionGrupo,"guardarcambiostabla_button","Guardar",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisionGrupo,"cerrar_button","Salir",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoComisionGrupo.setToolTipText("Nuevo"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarComisionGrupo.setToolTipText("Duplicar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarComisionGrupo.setToolTipText("Copiar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormComisionGrupo.setToolTipText("Ver"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesComisionGrupo.setToolTipText("Nuevo Rel"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaComisionGrupo.setToolTipText("Guardar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisionGrupo.setToolTipText("Salir"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisionGrupo";
		inputMap = this.jButtonNuevoComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisionGrupo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisionGrupo"));
		
		//DUPLICAR
		sMapKey = "DuplicarComisionGrupo";
		inputMap = this.jButtonDuplicarComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarComisionGrupo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarComisionGrupo"));
		
		//COPIAR
		sMapKey = "CopiarComisionGrupo";
		inputMap = this.jButtonCopiarComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarComisionGrupo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarComisionGrupo"));
		
		//VEr FORM
		sMapKey = "VerFormComisionGrupo";
		inputMap = this.jButtonVerFormComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormComisionGrupo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormComisionGrupo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesComisionGrupo";
		inputMap = this.jButtonNuevoRelacionesComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesComisionGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesComisionGrupo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarComisionGrupo";
		inputMap = this.jButtonModificarComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarComisionGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarComisionGrupo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarComisionGrupo";
		inputMap = this.jButtonCerrarComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisionGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisionGrupo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisionGrupo";
		inputMap = this.jButtonGuardarCambiosTablaComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisionGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisionGrupo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesComisionGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesComisionGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionComisionGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ComisionGrupo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ComisionGrupo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ComisionGrupo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ComisionGrupo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ComisionGrupo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesComisionGrupo.setName("jPanelParametrosReportesComisionGrupo"); 
		
		this.jPanelParametrosReportesAccionesComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesComisionGrupo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesComisionGrupo.setName("jPanelParametrosReportesAccionesComisionGrupo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionComisionGrupo = new JButtonMe();
		this.jButtonRecargarInformacionComisionGrupo.setText("Recargar");
		this.jButtonRecargarInformacionComisionGrupo.setToolTipText("Recargar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionComisionGrupo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionComisionGrupo = new JButtonMe();
		this.jButtonProcesarInformacionComisionGrupo.setText("Procesar");
		this.jButtonProcesarInformacionComisionGrupo.setToolTipText("Procesar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionComisionGrupo.setVisible(false);
			
		this.jButtonProcesarInformacionComisionGrupo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisionGrupo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionComisionGrupo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesComisionGrupo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionGrupo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesComisionGrupo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesComisionGrupo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionGrupo.setText("TIPO");       
		this.jComboBoxTiposReportesComisionGrupo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesComisionGrupo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesComisionGrupo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesComisionGrupo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionComisionGrupo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionComisionGrupo.setText("Paginacion");
		this.jComboBoxTiposPaginacionComisionGrupo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesComisionGrupo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesComisionGrupo.setText("Accion");
		this.jComboBoxTiposRelacionesComisionGrupo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesComisionGrupo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisionGrupo.setText("Accion");
		this.jComboBoxTiposAccionesComisionGrupo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarComisionGrupo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarComisionGrupo.setText("Accion");
		this.jComboBoxTiposSeleccionarComisionGrupo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralComisionGrupo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralComisionGrupo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisionGrupo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralComisionGrupo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesComisionGrupo = new JLabelMe();
		
		this.jLabelAccionesComisionGrupo.setText("Acciones");		
		this.jLabelAccionesComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosComisionGrupo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosComisionGrupo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosComisionGrupo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosComisionGrupo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosComisionGrupo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosComisionGrupo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaComisionGrupo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaComisionGrupo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaComisionGrupo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteComisionGrupo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteComisionGrupo.setText("Graf.");
		this.jCheckBoxConGraficoReporteComisionGrupo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresComisionGrupo = new JButtonMe();
		//this.jButtonAnterioresComisionGrupo.setText("<<");
        this.jButtonAnterioresComisionGrupo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresComisionGrupo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesComisionGrupo = new JButtonMe();
		//this.jButtonSiguientesComisionGrupo.setText(">>");
        this.jButtonSiguientesComisionGrupo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesComisionGrupo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosComisionGrupo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosComisionGrupo.setText("Nue");
        this.jButtonNuevoGuardarCambiosComisionGrupo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosComisionGrupo,"nuevoguardarcambios_button","Nue",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosComisionGrupo";
		inputMap = this.jButtonNuevoGuardarCambiosComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosComisionGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosComisionGrupo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionComisionGrupo";
		inputMap = this.jButtonRecargarInformacionComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionComisionGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionComisionGrupo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesComisionGrupo";
		inputMap = this.jButtonSiguientesComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesComisionGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesComisionGrupo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresComisionGrupo";
		inputMap = this.jButtonAnterioresComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresComisionGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresComisionGrupo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasComisionGrupo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesComisionGrupo.setMinimumSize(new Dimension(this.getWidth(),ComisionGrupoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionGrupoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisionGrupo.setMaximumSize(new Dimension(this.getWidth(),ComisionGrupoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionGrupoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesComisionGrupo.setPreferredSize(new Dimension(this.getWidth(),ComisionGrupoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ComisionGrupoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionComisionGrupo = new GridBagLayout();

			this.jPanelPaginacionComisionGrupo.setLayout(gridaBagLayoutPaginacionComisionGrupo);						
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy = 0;
			this.gridBagConstraintsComisionGrupo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionComisionGrupo.add(this.jButtonAnterioresComisionGrupo, this.gridBagConstraintsComisionGrupo);
					
						
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisionGrupo.gridy = 0;
			
			this.jPanelPaginacionComisionGrupo.add(this.jButtonNuevoGuardarCambiosComisionGrupo, this.gridBagConstraintsComisionGrupo);
						
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsComisionGrupo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsComisionGrupo.gridy = 0;
			this.jPanelPaginacionComisionGrupo.add(this.jButtonSiguientesComisionGrupo, this.gridBagConstraintsComisionGrupo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy = 1;
			this.gridBagConstraintsComisionGrupo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionGrupo.add(this.jButtonNuevoComisionGrupo, this.gridBagConstraintsComisionGrupo);
						
			
			
			if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
				this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsComisionGrupo.gridy = 1;
				this.gridBagConstraintsComisionGrupo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionComisionGrupo.add(this.jButtonGuardarCambiosTablaComisionGrupo, this.gridBagConstraintsComisionGrupo);
			}
			
			
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy = 1;
			this.gridBagConstraintsComisionGrupo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionGrupo.add(this.jButtonDuplicarComisionGrupo, this.gridBagConstraintsComisionGrupo);
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy = 1;
			this.gridBagConstraintsComisionGrupo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionGrupo.add(this.jButtonCopiarComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy = 1;
			this.gridBagConstraintsComisionGrupo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionComisionGrupo.add(this.jButtonVerFormComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy = 1;
			this.gridBagConstraintsComisionGrupo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionComisionGrupo.add(this.jButtonCerrarComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
		
		
		this.jButtonRecargarInformacionComisionGrupo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisionGrupo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionComisionGrupo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesComisionGrupo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisionGrupo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesComisionGrupo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesComisionGrupo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisionGrupo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesComisionGrupo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesComisionGrupo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisionGrupo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesComisionGrupo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionComisionGrupo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisionGrupo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionComisionGrupo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesComisionGrupo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisionGrupo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesComisionGrupo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesComisionGrupo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionGrupo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionGrupo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarComisionGrupo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisionGrupo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarComisionGrupo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaComisionGrupo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisionGrupo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaComisionGrupo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteComisionGrupo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisionGrupo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteComisionGrupo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosComisionGrupo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisionGrupo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosComisionGrupo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosComisionGrupo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisionGrupo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosComisionGrupo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesComisionGrupo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesComisionGrupo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ComisionGrupo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ComisionGrupo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ComisionGrupo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ComisionGrupo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesComisionGrupo.setLayout(gridaBagParametrosReportesComisionGrupo);
			this.jPanelParametrosReportesAccionesComisionGrupo.setLayout(gridaBagParametrosReportesAccionesComisionGrupo);
			
			
			this.jPanelParametrosAuxiliar1ComisionGrupo.setLayout(gridaBagParametrosAuxiliar1ComisionGrupo);
			this.jPanelParametrosAuxiliar2ComisionGrupo.setLayout(gridaBagParametrosAuxiliar2ComisionGrupo);
			this.jPanelParametrosAuxiliar3ComisionGrupo.setLayout(gridaBagParametrosAuxiliar3ComisionGrupo);
			this.jPanelParametrosAuxiliar4ComisionGrupo.setLayout(gridaBagParametrosAuxiliar4ComisionGrupo);
			//this.jPanelParametrosAuxiliar5ComisionGrupo.setLayout(gridaBagParametrosAuxiliar2ComisionGrupo);			
			
			
			
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionGrupo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionGrupo.add(this.jButtonRecargarInformacionComisionGrupo, this.gridBagConstraintsComisionGrupo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionGrupo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionGrupo.add(this.jComboBoxTiposPaginacionComisionGrupo, this.gridBagConstraintsComisionGrupo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionGrupo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionGrupo.add(this.jCheckBoxConAltoMaximoTablaComisionGrupo, this.gridBagConstraintsComisionGrupo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionGrupo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ComisionGrupo.add(this.jComboBoxTiposArchivosReportesComisionGrupo, this.gridBagConstraintsComisionGrupo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionGrupo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionGrupo.add(this.jPanelParametrosAuxiliar1ComisionGrupo, this.gridBagConstraintsComisionGrupo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionGrupo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ComisionGrupo.add(this.jComboBoxTiposReportesComisionGrupo, this.gridBagConstraintsComisionGrupo);																		
			
			
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionGrupo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ComisionGrupo.add(this.jComboBoxTiposGraficosReportesComisionGrupo, this.gridBagConstraintsComisionGrupo);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionGrupo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionGrupo.add(this.jPanelParametrosAuxiliar4ComisionGrupo, this.gridBagConstraintsComisionGrupo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsComisionGrupo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionGrupo.add(this.jComboBoxTiposReportesComisionGrupo, this.gridBagConstraintsComisionGrupo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionGrupo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionGrupo.add(this.jCheckBoxGenerarReporteComisionGrupo, this.gridBagConstraintsComisionGrupo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionGrupo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionGrupo.add(this.jPanelParametrosAuxiliar2ComisionGrupo, this.gridBagConstraintsComisionGrupo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionGrupo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionGrupo.add(this.jLabelAccionesComisionGrupo, this.gridBagConstraintsComisionGrupo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
				this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsComisionGrupo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesComisionGrupo.add(this.jButtonAbrirOrderByComisionGrupo, this.gridBagConstraintsComisionGrupo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionGrupo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionGrupo.add(this.jComboBoxTiposSeleccionarComisionGrupo, this.gridBagConstraintsComisionGrupo);			
			
			
			/*
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionGrupo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionGrupo.add(this.jCheckBoxSeleccionarTodosComisionGrupo, this.gridBagConstraintsComisionGrupo);
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsComisionGrupo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesComisionGrupo.add(this.jCheckBoxConGraficoReporteComisionGrupo, this.gridBagConstraintsComisionGrupo);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionGrupo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionGrupo.add(this.jCheckBoxSeleccionarTodosComisionGrupo, this.gridBagConstraintsComisionGrupo);															
				
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionGrupo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionGrupo.add(this.jCheckBoxSeleccionadosComisionGrupo, this.gridBagConstraintsComisionGrupo);															
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsComisionGrupo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ComisionGrupo.add(this.jCheckBoxConGraficoReporteComisionGrupo, this.gridBagConstraintsComisionGrupo);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionGrupo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesComisionGrupo.add(this.jPanelParametrosAuxiliar3ComisionGrupo, this.gridBagConstraintsComisionGrupo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionGrupo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionGrupo.add(this.jComboBoxTiposAccionesComisionGrupo, this.gridBagConstraintsComisionGrupo);
	
				
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsComisionGrupo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesComisionGrupo.add(this.jTextFieldValorCampoGeneralComisionGrupo, this.gridBagConstraintsComisionGrupo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosComisionGrupo = new GridBagLayout();

			this.jScrollPanelDatosComisionGrupo.setLayout(gridaBagLayoutDatosComisionGrupo);
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy = 0;
			this.gridBagConstraintsComisionGrupo.gridx = 0;
			
			this.jScrollPanelDatosComisionGrupo.add(this.jTableDatosComisionGrupo, this.gridBagConstraintsComisionGrupo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosComisionGrupo.setViewportView(this.jTableDatosComisionGrupo);
		this.jTableDatosComisionGrupo.setFillsViewportHeight(true);
		this.jTableDatosComisionGrupo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesComisionGrupo= new GridBagLayout();
		this.jPanelAccionesComisionGrupo.setLayout(gridaBagLayoutAccionesComisionGrupo);
		
		
		/*	
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = 0;
			
		this.jPanelAccionesComisionGrupo.add(this.jButtonNuevoComisionGrupo, this.gridBagConstraintsComisionGrupo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdComisionConfigComisionGrupo= new GridBagLayout();
		gridaBagLayoutFK_IdComisionConfigComisionGrupo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdComisionConfigComisionGrupo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdComisionConfigComisionGrupo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdComisionConfigComisionGrupo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdComisionConfigComisionGrupo.setLayout(gridaBagLayoutFK_IdComisionConfigComisionGrupo);

		gridBagConstraintsComisionGrupo = new GridBagConstraints();
		gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionGrupo.gridy = 0;
		gridBagConstraintsComisionGrupo.gridx = 0;
		jPanelFK_IdComisionConfigComisionGrupo.add(jLabelid_comision_configFK_IdComisionConfigComisionGrupo, gridBagConstraintsComisionGrupo);

		gridBagConstraintsComisionGrupo = new GridBagConstraints();
		gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionGrupo.gridy = 0;
		gridBagConstraintsComisionGrupo.gridx = 1;
		jPanelFK_IdComisionConfigComisionGrupo.add(jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo, gridBagConstraintsComisionGrupo);

		gridBagConstraintsComisionGrupo = new GridBagConstraints();
		gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsComisionGrupo.gridy = 1;
		gridBagConstraintsComisionGrupo.gridx =1;
		jPanelFK_IdComisionConfigComisionGrupo.add(jButtonFK_IdComisionConfigComisionGrupo, gridBagConstraintsComisionGrupo);

		jTabbedPaneBusquedasComisionGrupo.addTab("1.-Por Configuracion ", jPanelFK_IdComisionConfigComisionGrupo);
		jTabbedPaneBusquedasComisionGrupo.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisionGrupo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisionGrupo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();						
			this.gridBagConstraintsComisionGrupo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionGrupo.gridx = 0;		
			//this.gridBagConstraintsComisionGrupo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisionGrupo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarComisionGrupo, this.gridBagConstraintsComisionGrupo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsComisionGrupo.gridx = 0;		
		//this.gridBagConstraintsComisionGrupo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsComisionGrupo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsComisionGrupo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsComisionGrupo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionGrupo.gridx = 0;		
			this.gridBagConstraintsComisionGrupo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsComisionGrupo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasComisionGrupo, this.gridBagConstraintsComisionGrupo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionGrupo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesComisionGrupo, this.gridBagConstraintsComisionGrupo);								
		
		
		/*
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionGrupo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesComisionGrupo, this.gridBagConstraintsComisionGrupo);
		*/		
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisionGrupo.gridx =0;
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisionGrupo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisionGrupo, this.gridBagConstraintsComisionGrupo);
				
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionGrupo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionComisionGrupo, this.gridBagConstraintsComisionGrupo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ComisionGrupoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosComisionGrupo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisionGrupo = new GridBagLayout();
			this.jPanelBusquedasParametrosComisionGrupo.setLayout(gridaBagLayoutBusquedasParametrosComisionGrupo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralComisionGrupo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisionGrupo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionGrupo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionGrupo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionGrupo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisionGrupo, this.gridBagConstraintsComisionGrupo);
			
			
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionGrupo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
			
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisionGrupo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisionGrupo, this.gridBagConstraintsComisionGrupo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralComisionGrupo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoComisionGrupo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoComisionGrupo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoComisionGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoComisionGrupo.setName("jPanelReporteDinamicoComisionGrupo"); 
		
		this.jPanelReporteDinamicoComisionGrupo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisionGrupo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoComisionGrupo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoComisionGrupo.setLayout(gridaBagLayoutReporteDinamicoComisionGrupo);
		
		
		this.jInternalFrameReporteDinamicoComisionGrupo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoComisionGrupo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisionGrupo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoComisionGrupo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoComisionGrupo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoComisionGrupo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoComisionGrupo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoComisionGrupo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoComisionGrupo.setResizable(true);
	    this.jInternalFrameReporteDinamicoComisionGrupo.setClosable(true);
	    this.jInternalFrameReporteDinamicoComisionGrupo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoComisionGrupo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisionGrupo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoComisionGrupo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Grupos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteComisionGrupo = new JLabelMe();

		this.jLabelColumnasSelectReporteComisionGrupo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionGrupo.add(this.jLabelColumnasSelectReporteComisionGrupo, this.gridBagConstraintsComisionGrupo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteComisionGrupo = new JList<Reporte>();
		this.jListColumnasSelectReporteComisionGrupo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteComisionGrupo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteComisionGrupo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisionGrupo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteComisionGrupo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteComisionGrupo=new JScrollPane(this.jListColumnasSelectReporteComisionGrupo);
			
			this.jScrollColumnasSelectReporteComisionGrupo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisionGrupo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteComisionGrupo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoComisionGrupo.add(this.jListColumnasSelectReporteComisionGrupo, this.gridBagConstraintsComisionGrupo);
		this.jPanelReporteDinamicoComisionGrupo.add(this.jScrollColumnasSelectReporteComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteComisionGrupo = new JLabelMe();

		this.jLabelRelacionesSelectReporteComisionGrupo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteComisionGrupo = new JList<Reporte>();
		this.jListRelacionesSelectReporteComisionGrupo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteComisionGrupo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteComisionGrupo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisionGrupo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteComisionGrupo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteComisionGrupo=new JScrollPane(this.jListRelacionesSelectReporteComisionGrupo);
			
			this.jScrollRelacionesSelectReporteComisionGrupo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisionGrupo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteComisionGrupo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoComisionGrupo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoComisionGrupo = new JComboBoxMe();
		this.jListColumnasValoresGraficoComisionGrupo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoComisionGrupo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoComisionGrupo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoComisionGrupo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisionGrupo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoComisionGrupo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoComisionGrupo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoComisionGrupo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoComisionGrupo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisionGrupo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoComisionGrupo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoComisionGrupo = new JLabelMe();

		this.jLabelConGraficoDinamicoComisionGrupo.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionGrupo.add(this.jLabelConGraficoDinamicoComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoComisionGrupo = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoComisionGrupo.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoComisionGrupo.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoComisionGrupo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComisionGrupo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoComisionGrupo.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionGrupo.add(this.jCheckBoxConGraficoDinamicoComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoComisionGrupo = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoComisionGrupo.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoComisionGrupo.add(this.jLabelColumnaCategoriaGraficoComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoComisionGrupo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComisionGrupo.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoComisionGrupo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoComisionGrupo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComisionGrupo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoComisionGrupo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoComisionGrupo.add(this.jComboBoxColumnaCategoriaGraficoComisionGrupo, this.gridBagConstraintsComisionGrupo);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorComisionGrupo = new JLabelMe();

		this.jLabelColumnaCategoriaValorComisionGrupo.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionGrupo.add(this.jLabelColumnaCategoriaValorComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorComisionGrupo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorComisionGrupo.setText("Accion");
        this.jComboBoxColumnaCategoriaValorComisionGrupo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorComisionGrupo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComisionGrupo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorComisionGrupo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoComisionGrupo.add(this.jComboBoxColumnaCategoriaValorComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoComisionGrupo = new JLabelMe();

		this.jLabelColumnasValoresGraficoComisionGrupo.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionGrupo.add(this.jLabelColumnasValoresGraficoComisionGrupo, this.gridBagConstraintsComisionGrupo);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoComisionGrupo = new JList<Reporte>();
		this.jListColumnasValoresGraficoComisionGrupo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoComisionGrupo.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoComisionGrupo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComisionGrupo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoComisionGrupo.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoComisionGrupo=new JScrollPane(this.jListColumnasValoresGraficoComisionGrupo);
			
			this.jScrollColumnasValoresGraficoComisionGrupo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComisionGrupo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoComisionGrupo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoComisionGrupo.add(this.jListColumnasSelectReporteComisionGrupo, this.gridBagConstraintsComisionGrupo);
		this.jPanelReporteDinamicoComisionGrupo.add(this.jScrollColumnasValoresGraficoComisionGrupo, this.gridBagConstraintsComisionGrupo);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoComisionGrupo = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoComisionGrupo.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionGrupo.add(this.jLabelTiposGraficosReportesDinamicoComisionGrupo, this.gridBagConstraintsComisionGrupo);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoComisionGrupo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoComisionGrupo.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoComisionGrupo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoComisionGrupo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComisionGrupo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoComisionGrupo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionGrupo.add(this.jComboBoxTiposGraficosReportesDinamicoComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoComisionGrupo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoComisionGrupo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionGrupo.add(this.jLabelGenerarExcelReporteDinamicoComisionGrupo, this.gridBagConstraintsComisionGrupo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoComisionGrupo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoComisionGrupo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoComisionGrupo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoComisionGrupo.setToolTipText("Generar EXCEL"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoComisionGrupo.add(this.jButtonGenerarExcelReporteDinamicoComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionGrupo.add(this.jComboBoxTiposReportesDinamicoComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoComisionGrupo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoComisionGrupo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoComisionGrupo.add(this.jLabelTiposArchivoReporteDinamicoComisionGrupo, this.gridBagConstraintsComisionGrupo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionGrupo.add(this.jComboBoxTiposArchivosReportesDinamicoComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoComisionGrupo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoComisionGrupo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoComisionGrupo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoComisionGrupo.setToolTipText("Generar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionGrupo.add(this.jButtonGenerarReporteDinamicoComisionGrupo, this.gridBagConstraintsComisionGrupo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoComisionGrupo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoComisionGrupo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoComisionGrupo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoComisionGrupo.setToolTipText("Cancelar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsComisionGrupo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoComisionGrupo.add(this.jButtonCerrarReporteDinamicoComisionGrupo, this.gridBagConstraintsComisionGrupo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalComisionGrupo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoComisionGrupo= new JScrollPane(jPanelReporteDinamicoComisionGrupo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoComisionGrupo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisionGrupo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoComisionGrupo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Grupos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsComisionGrupo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoComisionGrupo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoComisionGrupo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalComisionGrupo);
		this.jInternalFrameReporteDinamicoComisionGrupo.getContentPane().add(this.jScrollPanelReporteDinamicoComisionGrupo, this.gridBagConstraintsComisionGrupo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionComisionGrupo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionComisionGrupo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionComisionGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionComisionGrupo.setName("jPanelImportacionComisionGrupo"); 
		
		this.jPanelImportacionComisionGrupo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisionGrupo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionComisionGrupo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionComisionGrupo.setLayout(gridaBagLayoutImportacionComisionGrupo);
		
		
		this.jInternalFrameImportacionComisionGrupo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionComisionGrupo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionComisionGrupo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteComisionGrupo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionComisionGrupo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisionGrupo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisionGrupo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionComisionGrupo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisionGrupo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisionGrupo.setResizable(true);
	    this.jInternalFrameImportacionComisionGrupo.setClosable(true);
	    this.jInternalFrameImportacionComisionGrupo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionComisionGrupo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionComisionGrupo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionComisionGrupo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionComisionGrupo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionComisionGrupo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionComisionGrupo.setResizable(true);
	    this.jInternalFrameImportacionComisionGrupo.setClosable(true);
	    this.jInternalFrameImportacionComisionGrupo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionComisionGrupo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisionGrupo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionComisionGrupo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Grupos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionComisionGrupo = new JLabelMe();

		this.jLabelArchivoImportacionComisionGrupo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisionGrupo.add(this.jLabelArchivoImportacionComisionGrupo, this.gridBagConstraintsComisionGrupo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionComisionGrupo = new JFileChooser();		
		this.jFileChooserImportacionComisionGrupo.setToolTipText("ESCOGER ARCHIVO"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionComisionGrupo = new JButtonMe();
		this.jButtonAbrirImportacionComisionGrupo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionComisionGrupo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionComisionGrupo.setToolTipText("Generar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionGrupo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionGrupo.add(this.jButtonAbrirImportacionComisionGrupo, this.gridBagConstraintsComisionGrupo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionComisionGrupo = new JLabelMe();

		this.jLabelPathArchivoImportacionComisionGrupo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYImportacion;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionComisionGrupo.add(this.jLabelPathArchivoImportacionComisionGrupo, this.gridBagConstraintsComisionGrupo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionComisionGrupo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionComisionGrupo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisionGrupo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionComisionGrupo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionGrupo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionGrupo.add(this.jTextFieldPathArchivoImportacionComisionGrupo, this.gridBagConstraintsComisionGrupo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionComisionGrupo = new JButtonMe();
		this.jButtonGenerarImportacionComisionGrupo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionComisionGrupo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionComisionGrupo.setToolTipText("Generar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionGrupo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionGrupo.add(this.jButtonGenerarImportacionComisionGrupo, this.gridBagConstraintsComisionGrupo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionComisionGrupo = new JButtonMe();
		this.jButtonCerrarImportacionComisionGrupo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionComisionGrupo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionComisionGrupo.setToolTipText("Cancelar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionGrupo.gridy = iPosYImportacion;
		this.gridBagConstraintsComisionGrupo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionComisionGrupo.add(this.jButtonCerrarImportacionComisionGrupo, this.gridBagConstraintsComisionGrupo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalComisionGrupo = new GridBagLayout();
		
		this.jScrollPanelImportacionComisionGrupo= new JScrollPane(jPanelImportacionComisionGrupo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy =iPosYImportacion;
		this.gridBagConstraintsComisionGrupo.gridx =iPosXImportacion;
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionComisionGrupo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionComisionGrupo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalComisionGrupo);
		this.jInternalFrameImportacionComisionGrupo.getContentPane().add(this.jScrollPanelImportacionComisionGrupo, this.gridBagConstraintsComisionGrupo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByComisionGrupo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByComisionGrupo = new JButtonMe();
			this.jButtonAbrirOrderByComisionGrupo.setText("Orden");
			this.jButtonAbrirOrderByComisionGrupo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByComisionGrupo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByComisionGrupo";
			inputMap = this.jButtonAbrirOrderByComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByComisionGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByComisionGrupo"));
		
		
			GridBagLayout gridaBagLayoutOrderByComisionGrupo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByComisionGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByComisionGrupo.setName("jPanelOrderByComisionGrupo"); 
			
			this.jPanelOrderByComisionGrupo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisionGrupo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByComisionGrupo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByComisionGrupo.setLayout(gridaBagLayoutOrderByComisionGrupo);
			
			
			this.jTableDatosComisionGrupoOrderBy = new JTableMe();        
			this.jTableDatosComisionGrupoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosComisionGrupoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosComisionGrupoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosComisionGrupoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosComisionGrupoOrderBy.setViewportView(this.jTableDatosComisionGrupoOrderBy);
			this.jTableDatosComisionGrupoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosComisionGrupoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByComisionGrupo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByComisionGrupo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByComisionGrupo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteComisionGrupo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByComisionGrupo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByComisionGrupo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByComisionGrupo.setTitle("Orden");
			this.jInternalFrameOrderByComisionGrupo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByComisionGrupo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByComisionGrupo.setResizable(true);
			this.jInternalFrameOrderByComisionGrupo.setClosable(true);
			this.jInternalFrameOrderByComisionGrupo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByComisionGrupo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisionGrupo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByComisionGrupo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Grupos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsComisionGrupo.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsComisionGrupo.ipady =150;
				
			this.jPanelOrderByComisionGrupo.add(jScrollPanelDatosComisionGrupoOrderBy, this.gridBagConstraintsComisionGrupo);//this.jTableDatosComisionGrupoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByComisionGrupo = new JButtonMe();
			this.jButtonCerrarOrderByComisionGrupo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByComisionGrupo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByComisionGrupo.setToolTipText("Cancelar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsComisionGrupo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByComisionGrupo.add(this.jButtonCerrarOrderByComisionGrupo, this.gridBagConstraintsComisionGrupo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalComisionGrupo = new GridBagLayout();
			
			this.jScrollPanelOrderByComisionGrupo= new JScrollPane(jPanelOrderByComisionGrupo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.gridy =iPosYOrderBy;
			this.gridBagConstraintsComisionGrupo.gridx =iPosXOrderBy;
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByComisionGrupo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByComisionGrupo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalComisionGrupo);
			
			this.jInternalFrameOrderByComisionGrupo.getContentPane().add(this.jScrollPanelOrderByComisionGrupo, this.gridBagConstraintsComisionGrupo);			
		
		} else {
			this.jButtonAbrirOrderByComisionGrupo = new JButtonMe();
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
		int iWidthTableCalculado=0;//1830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.comisiongrupoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosComisionGrupo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosComisionGrupo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosComisionGrupo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosComisionGrupo.getRowHeight();//ComisionGrupoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ComisionGrupoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisionGrupo.isSelected()) {
					iHeightTable=ComisionGrupoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionGrupoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionGrupoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ComisionGrupoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaComisionGrupo.isSelected()) {
					iHeightTable=ComisionGrupoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ComisionGrupoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ComisionGrupoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosComisionGrupo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisionGrupo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosComisionGrupo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosComisionGrupo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisionGrupo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosComisionGrupo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByComisionGrupo!=null && this.jInternalFrameOrderByComisionGrupo.getjTableDatosOrderBy()!=null) {
			//if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByComisionGrupo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByComisionGrupo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByComisionGrupo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByComisionGrupo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByComisionGrupo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByComisionGrupo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByComisionGrupo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosComisionGrupo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisionGrupo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosComisionGrupo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=comisiongrupoLogic.getComisionGrupos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisiongrupos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ComisionGrupo> TraerComisionGrupoBeans(List<ComisionGrupo> comisiongrupos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ComisionGrupo comisiongrupo:comisiongrupos) {
					
				if(!(ComisionGrupoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ComisionGrupoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					comisiongrupo.setsDetalleGeneralEntityReporte(ComisionGrupoConstantesFunciones.getComisionGrupoDescripcion(comisiongrupo));
										
						
					
						
					
				} else  {
							
					//comisiongrupo.setsDetalleGeneralEntityReporte(comisiongrupo.getsDetalleGeneralEntityReporte());
										
				}
				
				//comisiongrupobeans.add(comisiongrupobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return comisiongrupos;
    }
	//PARA REPORTES FIN
}
