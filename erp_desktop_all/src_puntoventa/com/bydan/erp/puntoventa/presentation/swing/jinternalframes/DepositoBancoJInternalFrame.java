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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.DepositoBancoConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class DepositoBancoJInternalFrame extends DepositoBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDepositoBanco;
	
	protected JMenuBar jmenuBarDepositoBanco;
	
	protected JMenu jmenuDepositoBanco;
	protected JMenu jmenuDatosDepositoBanco;
	protected JMenu jmenuArchivoDepositoBanco;
	protected JMenu jmenuAccionesDepositoBanco;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDepositoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDepositoBanco;	
	protected GridBagConstraints gridBagConstraintsDepositoBanco;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DepositoBancoDetalleFormJInternalFrame jInternalFrameDetalleFormDepositoBanco;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDepositoBanco;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDepositoBanco;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public DepositoBancoSessionBean depositobancoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public BancoSessionBean bancoSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DepositoBanco> depositobancos;		
	public List<DepositoBanco> depositobancosEliminados;	
	public List<DepositoBanco> depositobancosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDepositoBanco;		
	protected JButton jButtonAbrirOrderByDepositoBanco;
	
	
	//protected JPanel jPanelOrderByDepositoBanco;
	//public JScrollPane jScrollPanelOrderByDepositoBanco;	
	//protected JButton jButtonCerrarOrderByDepositoBanco;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DepositoBancoLogic depositobancoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDepositoBanco;
	public JScrollPane jScrollPanelDatosEdicionDepositoBanco;
	public JScrollPane jScrollPanelDatosGeneralDepositoBanco;
    
	
	
	//public JScrollPane jScrollPanelDatosDepositoBancoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDepositoBanco;
	//public JScrollPane jScrollPanelImportacionDepositoBanco;
	
	
	
	protected JPanel jPanelAccionesDepositoBanco;
	
    protected JPanel jPanelPaginacionDepositoBanco;
    protected JPanel jPanelParametrosReportesDepositoBanco;
	protected JPanel jPanelParametrosReportesAccionesDepositoBanco;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DepositoBanco;
	protected JPanel jPanelParametrosAuxiliar2DepositoBanco;
	protected JPanel jPanelParametrosAuxiliar3DepositoBanco;
	protected JPanel jPanelParametrosAuxiliar4DepositoBanco;
	//protected JPanel jPanelParametrosAuxiliar5DepositoBanco;
	
	
	
	//protected JPanel jPanelReporteDinamicoDepositoBanco;
	//protected JPanel jPanelImportacionDepositoBanco;
	
	
	public JTable jTableDatosDepositoBanco;
	
	
	
	//public JTable jTableDatosDepositoBancoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDepositoBanco;
	protected JButton jButtonDuplicarDepositoBanco;
	protected JButton jButtonCopiarDepositoBanco;
	protected JButton jButtonVerFormDepositoBanco;
	protected JButton jButtonNuevoRelacionesDepositoBanco;
	protected JButton jButtonModificarDepositoBanco;
	
    protected JButton jButtonGuardarCambiosTablaDepositoBanco;
	protected JButton jButtonCerrarDepositoBanco;
	
	
	protected JButton jButtonRecargarInformacionDepositoBanco;
	protected JButton jButtonProcesarInformacionDepositoBanco;
	
	
	protected JButton jButtonAnterioresDepositoBanco;
	protected JButton jButtonSiguientesDepositoBanco;
	protected JButton jButtonNuevoGuardarCambiosDepositoBanco;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDepositoBanco;
	//protected JButton jButtonCerrarReporteDinamicoDepositoBanco;
	//protected JButton jButtonGenerarExcelReporteDinamicoDepositoBanco;	
	
	
	
	//protected JButton jButtonAbrirImportacionDepositoBanco;
	//protected JButton jButtonGenerarImportacionDepositoBanco;
	//protected JButton jButtonCerrarImportacionDepositoBanco;
	//protected JFileChooser jFileChooserImportacionDepositoBanco;
	//protected File fileImportacionDepositoBanco;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDepositoBanco;
	protected JButton jButtonDuplicarToolBarDepositoBanco;
	protected JButton jButtonNuevoRelacionesToolBarDepositoBanco;
	
	
	public JButton jButtonGuardarCambiosToolBarDepositoBanco;
	protected JButton jButtonCopiarToolBarDepositoBanco;
	protected JButton jButtonVerFormToolBarDepositoBanco;
	public JButton jButtonGuardarCambiosTablaToolBarDepositoBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarDepositoBanco;
	protected JButton jButtonCerrarToolBarDepositoBanco;
	
	protected JButton jButtonRecargarInformacionToolBarDepositoBanco;
	protected JButton jButtonProcesarInformacionToolBarDepositoBanco;
	protected JButton jButtonAnterioresToolBarDepositoBanco;
	protected JButton jButtonSiguientesToolBarDepositoBanco;
	protected JButton jButtonNuevoGuardarCambiosToolBarDepositoBanco;
	protected JButton jButtonAbrirOrderByToolBarDepositoBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDepositoBanco;
	protected JMenuItem jMenuItemDuplicarDepositoBanco;
	protected JMenuItem jMenuItemNuevoRelacionesDepositoBanco;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDepositoBanco;
	protected JMenuItem jMenuItemCopiarDepositoBanco;
	protected JMenuItem jMenuItemVerFormDepositoBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaDepositoBanco;
	protected JMenuItem jMenuItemCerrarDepositoBanco;
	protected JMenuItem jMenuItemDetalleCerrarDepositoBanco;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDepositoBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarDepositoBanco;
	
	protected JMenuItem jMenuItemRecargarInformacionDepositoBanco;
	protected JMenuItem jMenuItemProcesarInformacionDepositoBanco;
	protected JMenuItem jMenuItemAnterioresDepositoBanco;
	protected JMenuItem jMenuItemSiguientesDepositoBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDepositoBanco;
	protected JMenuItem jMenuItemAbrirOrderByDepositoBanco;
	protected JMenuItem jMenuItemMostrarOcultarDepositoBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDepositoBanco;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDepositoBanco;
	protected JCheckBox jCheckBoxSeleccionadosDepositoBanco;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDepositoBanco;
	protected JCheckBox jCheckBoxConGraficoReporteDepositoBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDepositoBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDepositoBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDepositoBanco;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDepositoBanco;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDepositoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDepositoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDepositoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDepositoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDepositoBanco;
	protected JTextField jTextFieldValorCampoGeneralDepositoBanco;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDepositoBanco;
	//public JList<Reporte> jListColumnasSelectReporteDepositoBanco;
	//public JScrollPane jScrollColumnasSelectReporteDepositoBanco;
	
	//public JLabel jLabelRelacionesSelectReporteDepositoBanco;
	//public JList<Reporte> jListRelacionesSelectReporteDepositoBanco;
	//public JScrollPane jScrollRelacionesSelectReporteDepositoBanco;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDepositoBanco;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDepositoBanco;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDepositoBanco;
	//public JLabel jLabelTiposArchivoReporteDinamicoDepositoBanco;
	
		
	//public JLabel jLabelArchivoImportacionDepositoBanco;	
	//public JLabel jLabelPathArchivoImportacionDepositoBanco;
	//protected JTextField jTextFieldPathArchivoImportacionDepositoBanco;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDepositoBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDepositoBanco;
	
	//public JLabel jLabelColumnaCategoriaValorDepositoBanco;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDepositoBanco;
	
	//public JLabel jLabelColumnasValoresGraficoDepositoBanco;
	//public JList<Reporte> jListColumnasValoresGraficoDepositoBanco;
	//public JScrollPane jScrollColumnasValoresGraficoDepositoBanco;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDepositoBanco;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDepositoBanco;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDepositoBanco;
	public JPanel jPanelFK_IdAsientoContableDepositoBanco;
	public JButton jButtonFK_IdAsientoContableDepositoBanco;
	public JPanel jPanelFK_IdBancoDepositoBanco;
	public JButton jButtonFK_IdBancoDepositoBanco;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableDepositoBanco;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableDepositoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDepositoBanco= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDepositoBancoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDepositoBancoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableDepositoBanco;
	
	public JPanel jPanelid_bancoFK_IdBancoDepositoBanco;
	public JLabel jLabelid_bancoFK_IdBancoDepositoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoFK_IdBancoDepositoBanco;
	public JButton jButtonid_bancoFK_IdBancoDepositoBanco= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoDepositoBancoUpdate= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoDepositoBancoBusqueda= new JButtonMe();

	
	
	
	
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
	public DepositoBancoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DepositoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepositoBancoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DepositoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepositoBancoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DepositoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepositoBancoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DepositoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDepositoBanco)	{
		this.jButtonRecargarInformacionDepositoBanco = jButtonRecargarInformacionDepositoBanco;
	}
	
	public JButton getjButtonProcesarInformacionDepositoBanco() {
		return this.jButtonProcesarInformacionDepositoBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDepositoBanco)	{
		this.jButtonProcesarInformacionDepositoBanco = jButtonProcesarInformacionDepositoBanco;
	}
	
	
	public JButton getjButtonRecargarInformacionDepositoBanco() {
		return this.jButtonRecargarInformacionDepositoBanco;
	}
	
	
	public List<DepositoBanco> getdepositobancos() {
		return this.depositobancos;
	}

	public void setdepositobancos(List<DepositoBanco> depositobancos) {
		this.depositobancos = depositobancos;
	}
	
	public List<DepositoBanco> getdepositobancosAux() {
		return this.depositobancosAux;
	}

	public void setdepositobancosAux(List<DepositoBanco> depositobancosAux) {
		this.depositobancosAux = depositobancosAux;
	}
	
	public List<DepositoBanco> getdepositobancosEliminados() {
		return this.depositobancosEliminados;
	}

	public void setDepositoBancosEliminados(List<DepositoBanco> depositobancosEliminados) {
		this.depositobancosEliminados = depositobancosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDepositoBanco() {
		return jComboBoxTiposSeleccionarDepositoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDepositoBanco(
			JComboBox jComboBoxTiposSeleccionarDepositoBanco) {
		this.jComboBoxTiposSeleccionarDepositoBanco = jComboBoxTiposSeleccionarDepositoBanco;
	}
	
	public void setBorderResaltarTiposSeleccionarDepositoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDepositoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDepositoBanco .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDepositoBanco() {
		return jTextFieldValorCampoGeneralDepositoBanco;
	}

	public void setjTextFieldValorCampoGeneralDepositoBanco(
			JTextField jTextFieldValorCampoGeneralDepositoBanco) {
		this.jTextFieldValorCampoGeneralDepositoBanco = jTextFieldValorCampoGeneralDepositoBanco;
	}

	public void setBorderResaltarValorCampoGeneralDepositoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepositoBanco.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDepositoBanco .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDepositoBanco() {
		return this.jCheckBoxSeleccionarTodosDepositoBanco;
	}

	public void setjCheckBoxSeleccionarTodosDepositoBanco(
			JCheckBox jCheckBoxSeleccionarTodosDepositoBanco) {
		this.jCheckBoxSeleccionarTodosDepositoBanco = jCheckBoxSeleccionarTodosDepositoBanco;
	}

	public void setBorderResaltarSeleccionarTodosDepositoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepositoBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDepositoBanco .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDepositoBanco() {
		return this.jCheckBoxSeleccionadosDepositoBanco;
	}

	public void setjCheckBoxSeleccionadosDepositoBanco(
			JCheckBox jCheckBoxSeleccionadosDepositoBanco) {
		this.jCheckBoxSeleccionadosDepositoBanco = jCheckBoxSeleccionadosDepositoBanco;
	}
	
	public void setBorderResaltarSeleccionadosDepositoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepositoBanco.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDepositoBanco .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDepositoBanco() {
		return this.jComboBoxTiposArchivosReportesDepositoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDepositoBanco(
			JComboBox jComboBoxTiposArchivosReportesDepositoBanco) {
		this.jComboBoxTiposArchivosReportesDepositoBanco = jComboBoxTiposArchivosReportesDepositoBanco;
	}

	public void setBorderResaltarTiposArchivosReportesDepositoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepositoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDepositoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDepositoBanco() {
		return this.jComboBoxTiposReportesDepositoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDepositoBanco(
			JComboBox jComboBoxTiposReportesDepositoBanco) {
		this.jComboBoxTiposReportesDepositoBanco = jComboBoxTiposReportesDepositoBanco;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDepositoBanco() {
	//	return jComboBoxTiposReportesDinamicoDepositoBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDepositoBanco(
	//		JComboBox jComboBoxTiposReportesDinamicoDepositoBanco) {
	//	this.jComboBoxTiposReportesDinamicoDepositoBanco = jComboBoxTiposReportesDinamicoDepositoBanco;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDepositoBanco() {
	//	return jComboBoxTiposArchivosReportesDinamicoDepositoBanco;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDepositoBanco(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDepositoBanco) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDepositoBanco = jComboBoxTiposArchivosReportesDinamicoDepositoBanco;
	//}
	
	public void setBorderResaltarTiposReportesDepositoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepositoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDepositoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDepositoBanco() {
		return this.jComboBoxTiposGraficosReportesDepositoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDepositoBanco(
			JComboBox jComboBoxTiposGraficosReportesDepositoBanco) {
		this.jComboBoxTiposGraficosReportesDepositoBanco = jComboBoxTiposGraficosReportesDepositoBanco;
	}
	
	public void setBorderResaltarTiposGraficosReportesDepositoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepositoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDepositoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDepositoBanco() {
		return this.jComboBoxTiposPaginacionDepositoBanco;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDepositoBanco(
			JComboBox jComboBoxTiposPaginacionDepositoBanco) {
		this.jComboBoxTiposPaginacionDepositoBanco = jComboBoxTiposPaginacionDepositoBanco;
	}
	
	public void setBorderResaltarTiposPaginacionDepositoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepositoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDepositoBanco .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDepositoBanco() {
		return this.jComboBoxTiposRelacionesDepositoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDepositoBanco() {
		return this.jComboBoxTiposAccionesDepositoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDepositoBanco(
			JComboBox jComboBoxTiposRelacionesDepositoBanco) {
		this.jComboBoxTiposRelacionesDepositoBanco = jComboBoxTiposRelacionesDepositoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDepositoBanco(
			JComboBox jComboBoxTiposAccionesDepositoBanco) {
		this.jComboBoxTiposAccionesDepositoBanco = jComboBoxTiposAccionesDepositoBanco;
	}
	
	public void setBorderResaltarTiposRelacionesDepositoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepositoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDepositoBanco .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDepositoBanco() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDepositoBanco.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDepositoBanco .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDepositoBanco() {
	//	return jCheckBoxConGraficoDinamicoDepositoBanco;
	//}

	//public void setjCheckBoxConGraficoDinamicoDepositoBanco(
	//		JCheckBox jCheckBoxConGraficoDinamicoDepositoBanco) {
	//	this.jCheckBoxConGraficoDinamicoDepositoBanco = jCheckBoxConGraficoDinamicoDepositoBanco;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDepositoBanco() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDepositoBanco.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDepositoBanco .setBorder(borderResaltar);		
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
		this.depositobancoSessionBean=new DepositoBancoSessionBean();
		
		this.depositobancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.depositobancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.depositobancoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DepositoBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DepositoBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DepositoBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DepositoBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DepositoBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Deposito Banco MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
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
		
		DepositoBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DepositoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDepositoBanco= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDepositoBanco,this.jTtoolBarDepositoBanco,
							"nuevo","nuevo","Nuevo"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDepositoBanco,this.jTtoolBarDepositoBanco,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDepositoBanco,this.jTtoolBarDepositoBanco,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDepositoBanco,this.jTtoolBarDepositoBanco,
							"duplicar","duplicar","Duplicar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDepositoBanco,this.jTtoolBarDepositoBanco,
							"copiar","copiar","Copiar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDepositoBanco,this.jTtoolBarDepositoBanco,
							"ver_form","ver_form","Ver"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDepositoBanco,this.jTtoolBarDepositoBanco,
							"recargar","recargar","Recargar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDepositoBanco,this.jTtoolBarDepositoBanco,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDepositoBanco,this.jTtoolBarDepositoBanco,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDepositoBanco,this.jTtoolBarDepositoBanco,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDepositoBanco,this.jTtoolBarDepositoBanco,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDepositoBanco,this.jTtoolBarDepositoBanco,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDepositoBanco,this.jTtoolBarDepositoBanco,
							"cerrar","cerrar","Salir"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDepositoBanco=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDepositoBanco;
			
				this.jButtonProcesarInformacionToolBarDepositoBanco=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDepositoBanco;
				
		//protected JButton jButtonModificarToolBarDepositoBanco;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDepositoBanco=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDepositoBanco=new JMenuMe("General");
		this.jmenuArchivoDepositoBanco=new JMenuMe("Archivo");
		this.jmenuAccionesDepositoBanco=new JMenuMe("Acciones");
		this.jmenuDatosDepositoBanco=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDepositoBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDepositoBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDepositoBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDepositoBanco= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDepositoBanco.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDepositoBanco,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDepositoBanco= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDepositoBanco.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDepositoBanco,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDepositoBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDepositoBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDepositoBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDepositoBanco= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDepositoBanco.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDepositoBanco,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDepositoBanco= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDepositoBanco.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDepositoBanco,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDepositoBanco= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDepositoBanco.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDepositoBanco,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDepositoBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDepositoBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDepositoBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDepositoBanco= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDepositoBanco.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDepositoBanco,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDepositoBanco= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDepositoBanco.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDepositoBanco,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDepositoBanco= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDepositoBanco.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDepositoBanco,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDepositoBanco= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDepositoBanco.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDepositoBanco,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDepositoBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDepositoBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDepositoBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDepositoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDepositoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDepositoBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDepositoBanco= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDepositoBanco.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDepositoBanco,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDepositoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDepositoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDepositoBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDepositoBanco= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDepositoBanco.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDepositoBanco,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDepositoBanco.add(this.jMenuItemCerrarDepositoBanco);
			
			this.jmenuAccionesDepositoBanco.add(this.jMenuItemNuevoDepositoBanco);
			this.jmenuAccionesDepositoBanco.add(this.jMenuItemNuevoGuardarCambiosDepositoBanco);
			this.jmenuAccionesDepositoBanco.add(this.jMenuItemNuevoRelacionesDepositoBanco);
			this.jmenuAccionesDepositoBanco.add(this.jMenuItemGuardarCambiosTablaDepositoBanco);		
			this.jmenuAccionesDepositoBanco.add(this.jMenuItemDuplicarDepositoBanco);		
			this.jmenuAccionesDepositoBanco.add(this.jMenuItemCopiarDepositoBanco);		
			this.jmenuAccionesDepositoBanco.add(this.jMenuItemVerFormDepositoBanco);		
			
			this.jmenuDatosDepositoBanco.add(this.jMenuItemRecargarInformacionDepositoBanco);				
			this.jmenuDatosDepositoBanco.add(this.jMenuItemAnterioresDepositoBanco);				
			this.jmenuDatosDepositoBanco.add(this.jMenuItemSiguientesDepositoBanco);				
			this.jmenuDatosDepositoBanco.add(this.jMenuItemAbrirOrderByDepositoBanco);				
			this.jmenuDatosDepositoBanco.add(this.jMenuItemMostrarOcultarDepositoBanco);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDepositoBanco.add(this.jMenuItemGuardarCambiosDepositoBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDepositoBanco.add(this.jmenuArchivoDepositoBanco);		
			this.jmenuBarDepositoBanco.add(this.jmenuAccionesDepositoBanco);		
			this.jmenuBarDepositoBanco.add(this.jmenuDatosDepositoBanco);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDepositoBanco);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDepositoBanco() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableDepositoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableDepositoBanco.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableDepositoBanco= new JButtonMe();
		this.jButtonFK_IdAsientoContableDepositoBanco.setText("Buscar");
		this.jButtonFK_IdAsientoContableDepositoBanco.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableDepositoBanco,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableDepositoBanco = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableDepositoBanco.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableDepositoBanco.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableDepositoBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDepositoBanco= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDepositoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDepositoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDepositoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDepositoBanco.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDepositoBanco.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDepositoBanco.setFocusable(false);

		this.jPanelFK_IdBancoDepositoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBancoDepositoBanco.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdBancoDepositoBanco= new JButtonMe();
		this.jButtonFK_IdBancoDepositoBanco.setText("Buscar");
		this.jButtonFK_IdBancoDepositoBanco.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBancoDepositoBanco,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBancoDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bancoFK_IdBancoDepositoBanco = new JLabelMe();
		jLabelid_bancoFK_IdBancoDepositoBanco.setText("Banco :");
		jLabelid_bancoFK_IdBancoDepositoBanco.setToolTipText("Banco");
		jLabelid_bancoFK_IdBancoDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bancoFK_IdBancoDepositoBanco,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bancoFK_IdBancoDepositoBanco= new JComboBoxMe();
		jComboBoxid_bancoFK_IdBancoDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoFK_IdBancoDepositoBanco,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDepositoBanco=new JTabbedPane();


		this.jTabbedPaneBusquedasDepositoBanco.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDepositoBanco.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDepositoBanco.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDepositoBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDepositoBanco,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDepositoBanco = new DepositoBancoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Deposito Banco DATOS");
			this.jInternalFrameDetalleFormDepositoBanco = new DepositoBancoDetalleFormJInternalFrame(jDesktopPane,this.depositobancoSessionBean.getConGuardarRelaciones(),this.depositobancoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDepositoBanco = null;//new DepositoBancoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDepositoBanco= new GridBagLayout();
		
		
		this.jTableDatosDepositoBanco = new JTableMe();      
		
		String sToolTipDepositoBanco="";
		sToolTipDepositoBanco=DepositoBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDepositoBanco+="(PuntoVenta.DepositoBanco)";
		}
		
		if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDepositoBanco+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDepositoBanco.setToolTipText(sToolTipDepositoBanco);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDepositoBanco);
		this.jTableDatosDepositoBanco.setAutoCreateRowSorter(true);
		this.jTableDatosDepositoBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDepositoBanco.setRowSelectionAllowed(true);
		this.jTableDatosDepositoBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDepositoBanco,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDepositoBanco = new JButtonMe();
		this.jButtonDuplicarDepositoBanco = new JButtonMe();
		this.jButtonCopiarDepositoBanco = new JButtonMe();
		this.jButtonVerFormDepositoBanco = new JButtonMe();
		this.jButtonNuevoRelacionesDepositoBanco = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDepositoBanco = new JButtonMe();
		this.jButtonCerrarDepositoBanco = new JButtonMe();
		
		this.jScrollPanelDatosDepositoBanco = new JScrollPane();   
        this.jScrollPanelDatosGeneralDepositoBanco = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDepositoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Deposito Banco";
		
		if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deposito Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosDepositoBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDepositoBanco.setToolTipText("Acciones");
        this.jPanelAccionesDepositoBanco.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDepositoBanco=new ReporteDinamicoJInternalFrame(DepositoBancoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDepositoBanco();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDepositoBanco=new ImportacionJInternalFrame(DepositoBancoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDepositoBanco();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDepositoBanco = new JButtonMe();
		
		this.jButtonAbrirOrderByDepositoBanco.setText("Orden");
		this.jButtonAbrirOrderByDepositoBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDepositoBanco,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDepositoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDepositoBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDepositoBanco,false,this);
			
			//this.cargarOrderByDepositoBanco(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDepositoBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDepositoBanco,true,this);
			
			//this.cargarOrderByDepositoBanco(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDepositoBanco.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosDepositoBanco.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosDepositoBanco.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosDepositoBanco.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDepositoBanco.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDepositoBanco.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDepositoBanco.setText("Nuevo");
		this.jButtonDuplicarDepositoBanco.setText("Duplicar");
		this.jButtonCopiarDepositoBanco.setText("Copiar");
		this.jButtonVerFormDepositoBanco.setText("Ver");
		this.jButtonNuevoRelacionesDepositoBanco.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDepositoBanco.setText("Guardar");
		this.jButtonCerrarDepositoBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDepositoBanco,"nuevo_button","Nuevo",this.depositobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDepositoBanco,"duplicar_button","Duplicar",this.depositobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDepositoBanco,"copiar_button","Copiar",this.depositobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDepositoBanco,"ver_form","Ver",this.depositobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDepositoBanco,"nuevorelaciones_button","Nuevo Rel",this.depositobancoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDepositoBanco,"guardarcambiostabla_button","Guardar",this.depositobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDepositoBanco,"cerrar_button","Salir",this.depositobancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDepositoBanco.setToolTipText("Nuevo"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDepositoBanco.setToolTipText("Duplicar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDepositoBanco.setToolTipText("Copiar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDepositoBanco.setToolTipText("Ver"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDepositoBanco.setToolTipText("Nuevo Rel"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDepositoBanco.setToolTipText("Guardar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDepositoBanco.setToolTipText("Salir"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDepositoBanco";
		inputMap = this.jButtonNuevoDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDepositoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDepositoBanco"));
		
		//DUPLICAR
		sMapKey = "DuplicarDepositoBanco";
		inputMap = this.jButtonDuplicarDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDepositoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDepositoBanco"));
		
		//COPIAR
		sMapKey = "CopiarDepositoBanco";
		inputMap = this.jButtonCopiarDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDepositoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDepositoBanco"));
		
		//VEr FORM
		sMapKey = "VerFormDepositoBanco";
		inputMap = this.jButtonVerFormDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDepositoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDepositoBanco"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDepositoBanco";
		inputMap = this.jButtonNuevoRelacionesDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDepositoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDepositoBanco"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDepositoBanco";
		inputMap = this.jButtonModificarDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDepositoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDepositoBanco"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDepositoBanco";
		inputMap = this.jButtonCerrarDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDepositoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDepositoBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDepositoBanco";
		inputMap = this.jButtonGuardarCambiosTablaDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDepositoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDepositoBanco"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDepositoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDepositoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDepositoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DepositoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DepositoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DepositoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DepositoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DepositoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDepositoBanco.setName("jPanelParametrosReportesDepositoBanco"); 
		
		this.jPanelParametrosReportesAccionesDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDepositoBanco.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDepositoBanco.setName("jPanelParametrosReportesAccionesDepositoBanco"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDepositoBanco = new JButtonMe();
		this.jButtonRecargarInformacionDepositoBanco.setText("Recargar");
		this.jButtonRecargarInformacionDepositoBanco.setToolTipText("Recargar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDepositoBanco,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDepositoBanco = new JButtonMe();
		this.jButtonProcesarInformacionDepositoBanco.setText("Procesar");
		this.jButtonProcesarInformacionDepositoBanco.setToolTipText("Procesar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDepositoBanco.setVisible(false);
			
		this.jButtonProcesarInformacionDepositoBanco.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDepositoBanco.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDepositoBanco.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDepositoBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDepositoBanco.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDepositoBanco.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDepositoBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDepositoBanco.setText("TIPO");       
		this.jComboBoxTiposReportesDepositoBanco.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDepositoBanco = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDepositoBanco.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDepositoBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDepositoBanco = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDepositoBanco.setText("Paginacion");
		this.jComboBoxTiposPaginacionDepositoBanco.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDepositoBanco = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDepositoBanco.setText("Accion");
		this.jComboBoxTiposRelacionesDepositoBanco.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDepositoBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDepositoBanco.setText("Accion");
		this.jComboBoxTiposAccionesDepositoBanco.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDepositoBanco = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDepositoBanco.setText("Accion");
		this.jComboBoxTiposSeleccionarDepositoBanco.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDepositoBanco=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDepositoBanco.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDepositoBanco.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDepositoBanco.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDepositoBanco = new JLabelMe();
		
		this.jLabelAccionesDepositoBanco.setText("Acciones");		
		this.jLabelAccionesDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDepositoBanco = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDepositoBanco.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDepositoBanco.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDepositoBanco = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDepositoBanco.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDepositoBanco.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDepositoBanco = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDepositoBanco.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDepositoBanco.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDepositoBanco = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDepositoBanco.setText("Graf.");
		this.jCheckBoxConGraficoReporteDepositoBanco.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDepositoBanco = new JButtonMe();
		//this.jButtonAnterioresDepositoBanco.setText("<<");
        this.jButtonAnterioresDepositoBanco.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDepositoBanco,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDepositoBanco = new JButtonMe();
		//this.jButtonSiguientesDepositoBanco.setText(">>");
        this.jButtonSiguientesDepositoBanco.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDepositoBanco,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDepositoBanco = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDepositoBanco.setText("Nue");
        this.jButtonNuevoGuardarCambiosDepositoBanco.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDepositoBanco,"nuevoguardarcambios_button","Nue",this.depositobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDepositoBanco";
		inputMap = this.jButtonNuevoGuardarCambiosDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDepositoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDepositoBanco"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDepositoBanco";
		inputMap = this.jButtonRecargarInformacionDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDepositoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDepositoBanco"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDepositoBanco";
		inputMap = this.jButtonSiguientesDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDepositoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDepositoBanco"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDepositoBanco";
		inputMap = this.jButtonAnterioresDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDepositoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDepositoBanco"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDepositoBanco();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDepositoBanco.setMinimumSize(new Dimension(this.getWidth(),DepositoBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DepositoBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDepositoBanco.setMaximumSize(new Dimension(this.getWidth(),DepositoBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DepositoBancoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDepositoBanco.setPreferredSize(new Dimension(this.getWidth(),DepositoBancoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DepositoBancoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDepositoBanco = new GridBagLayout();

			this.jPanelPaginacionDepositoBanco.setLayout(gridaBagLayoutPaginacionDepositoBanco);						
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy = 0;
			this.gridBagConstraintsDepositoBanco.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDepositoBanco.add(this.jButtonAnterioresDepositoBanco, this.gridBagConstraintsDepositoBanco);
					
						
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDepositoBanco.gridy = 0;
			
			this.jPanelPaginacionDepositoBanco.add(this.jButtonNuevoGuardarCambiosDepositoBanco, this.gridBagConstraintsDepositoBanco);
						
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDepositoBanco.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDepositoBanco.gridy = 0;
			this.jPanelPaginacionDepositoBanco.add(this.jButtonSiguientesDepositoBanco, this.gridBagConstraintsDepositoBanco);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy = 1;
			this.gridBagConstraintsDepositoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDepositoBanco.add(this.jButtonNuevoDepositoBanco, this.gridBagConstraintsDepositoBanco);
						
			
			
			if(!this.depositobancoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
				this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDepositoBanco.gridy = 1;
				this.gridBagConstraintsDepositoBanco.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDepositoBanco.add(this.jButtonGuardarCambiosTablaDepositoBanco, this.gridBagConstraintsDepositoBanco);
			}
			
			
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy = 1;
			this.gridBagConstraintsDepositoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDepositoBanco.add(this.jButtonDuplicarDepositoBanco, this.gridBagConstraintsDepositoBanco);
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy = 1;
			this.gridBagConstraintsDepositoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDepositoBanco.add(this.jButtonCopiarDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy = 1;
			this.gridBagConstraintsDepositoBanco.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDepositoBanco.add(this.jButtonVerFormDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy = 1;
			this.gridBagConstraintsDepositoBanco.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDepositoBanco.add(this.jButtonCerrarDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
		
		
		this.jButtonRecargarInformacionDepositoBanco.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDepositoBanco.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDepositoBanco.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDepositoBanco.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDepositoBanco.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDepositoBanco.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDepositoBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDepositoBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDepositoBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDepositoBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDepositoBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDepositoBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDepositoBanco.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDepositoBanco.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDepositoBanco.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDepositoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDepositoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDepositoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDepositoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDepositoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDepositoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDepositoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDepositoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDepositoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDepositoBanco.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDepositoBanco.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDepositoBanco.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDepositoBanco.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDepositoBanco.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDepositoBanco.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDepositoBanco.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDepositoBanco.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDepositoBanco.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDepositoBanco.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDepositoBanco.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDepositoBanco.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDepositoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDepositoBanco = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DepositoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DepositoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DepositoBanco = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DepositoBanco = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDepositoBanco.setLayout(gridaBagParametrosReportesDepositoBanco);
			this.jPanelParametrosReportesAccionesDepositoBanco.setLayout(gridaBagParametrosReportesAccionesDepositoBanco);
			
			
			this.jPanelParametrosAuxiliar1DepositoBanco.setLayout(gridaBagParametrosAuxiliar1DepositoBanco);
			this.jPanelParametrosAuxiliar2DepositoBanco.setLayout(gridaBagParametrosAuxiliar2DepositoBanco);
			this.jPanelParametrosAuxiliar3DepositoBanco.setLayout(gridaBagParametrosAuxiliar3DepositoBanco);
			this.jPanelParametrosAuxiliar4DepositoBanco.setLayout(gridaBagParametrosAuxiliar4DepositoBanco);
			//this.jPanelParametrosAuxiliar5DepositoBanco.setLayout(gridaBagParametrosAuxiliar2DepositoBanco);			
			
			
			
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDepositoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDepositoBanco.add(this.jButtonRecargarInformacionDepositoBanco, this.gridBagConstraintsDepositoBanco);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDepositoBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DepositoBanco.add(this.jComboBoxTiposPaginacionDepositoBanco, this.gridBagConstraintsDepositoBanco);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDepositoBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DepositoBanco.add(this.jCheckBoxConAltoMaximoTablaDepositoBanco, this.gridBagConstraintsDepositoBanco);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDepositoBanco.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DepositoBanco.add(this.jComboBoxTiposArchivosReportesDepositoBanco, this.gridBagConstraintsDepositoBanco);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepositoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDepositoBanco.add(this.jPanelParametrosAuxiliar1DepositoBanco, this.gridBagConstraintsDepositoBanco);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDepositoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DepositoBanco.add(this.jComboBoxTiposReportesDepositoBanco, this.gridBagConstraintsDepositoBanco);																		
			
			
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDepositoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DepositoBanco.add(this.jComboBoxTiposGraficosReportesDepositoBanco, this.gridBagConstraintsDepositoBanco);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepositoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDepositoBanco.add(this.jPanelParametrosAuxiliar4DepositoBanco, this.gridBagConstraintsDepositoBanco);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDepositoBanco.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDepositoBanco.add(this.jComboBoxTiposReportesDepositoBanco, this.gridBagConstraintsDepositoBanco);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepositoBanco.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDepositoBanco.add(this.jCheckBoxGenerarReporteDepositoBanco, this.gridBagConstraintsDepositoBanco);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepositoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDepositoBanco.add(this.jPanelParametrosAuxiliar2DepositoBanco, this.gridBagConstraintsDepositoBanco);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDepositoBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDepositoBanco.add(this.jLabelAccionesDepositoBanco, this.gridBagConstraintsDepositoBanco);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
				this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDepositoBanco.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDepositoBanco.add(this.jButtonAbrirOrderByDepositoBanco, this.gridBagConstraintsDepositoBanco);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepositoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDepositoBanco.add(this.jComboBoxTiposSeleccionarDepositoBanco, this.gridBagConstraintsDepositoBanco);			
			
			
			/*
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDepositoBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDepositoBanco.add(this.jCheckBoxSeleccionarTodosDepositoBanco, this.gridBagConstraintsDepositoBanco);
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDepositoBanco.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDepositoBanco.add(this.jCheckBoxConGraficoReporteDepositoBanco, this.gridBagConstraintsDepositoBanco);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDepositoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DepositoBanco.add(this.jCheckBoxSeleccionarTodosDepositoBanco, this.gridBagConstraintsDepositoBanco);															
				
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDepositoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DepositoBanco.add(this.jCheckBoxSeleccionadosDepositoBanco, this.gridBagConstraintsDepositoBanco);															
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDepositoBanco.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DepositoBanco.add(this.jCheckBoxConGraficoReporteDepositoBanco, this.gridBagConstraintsDepositoBanco);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepositoBanco.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDepositoBanco.add(this.jPanelParametrosAuxiliar3DepositoBanco, this.gridBagConstraintsDepositoBanco);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepositoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDepositoBanco.add(this.jComboBoxTiposAccionesDepositoBanco, this.gridBagConstraintsDepositoBanco);
	
				
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDepositoBanco.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDepositoBanco.add(this.jTextFieldValorCampoGeneralDepositoBanco, this.gridBagConstraintsDepositoBanco);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDepositoBanco = new GridBagLayout();

			this.jScrollPanelDatosDepositoBanco.setLayout(gridaBagLayoutDatosDepositoBanco);
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy = 0;
			this.gridBagConstraintsDepositoBanco.gridx = 0;
			
			this.jScrollPanelDatosDepositoBanco.add(this.jTableDatosDepositoBanco, this.gridBagConstraintsDepositoBanco);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDepositoBanco.setViewportView(this.jTableDatosDepositoBanco);
		this.jTableDatosDepositoBanco.setFillsViewportHeight(true);
		this.jTableDatosDepositoBanco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDepositoBanco= new GridBagLayout();
		this.jPanelAccionesDepositoBanco.setLayout(gridaBagLayoutAccionesDepositoBanco);
		
		
		/*	
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = 0;
			
		this.jPanelAccionesDepositoBanco.add(this.jButtonNuevoDepositoBanco, this.gridBagConstraintsDepositoBanco);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableDepositoBanco= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableDepositoBanco.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDepositoBanco.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDepositoBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableDepositoBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableDepositoBanco.setLayout(gridaBagLayoutFK_IdAsientoContableDepositoBanco);

		gridBagConstraintsDepositoBanco = new GridBagConstraints();
		gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepositoBanco.gridy = 0;
		gridBagConstraintsDepositoBanco.gridx = 0;
		jPanelFK_IdAsientoContableDepositoBanco.add(jLabelid_asiento_contableFK_IdAsientoContableDepositoBanco, gridBagConstraintsDepositoBanco);

		gridBagConstraintsDepositoBanco = new GridBagConstraints();
		gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepositoBanco.gridy = 0;
		gridBagConstraintsDepositoBanco.gridx = 1;
		jPanelFK_IdAsientoContableDepositoBanco.add(jComboBoxid_asiento_contableFK_IdAsientoContableDepositoBanco, gridBagConstraintsDepositoBanco);


		gridBagConstraintsDepositoBanco = new GridBagConstraints();
		gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDepositoBanco.fill = GridBagConstraints.NONE;
		gridBagConstraintsDepositoBanco.gridy = 0;
		gridBagConstraintsDepositoBanco.gridx = 0;
		jPanelFK_IdAsientoContableDepositoBanco.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDepositoBanco, gridBagConstraintsDepositoBanco);

		gridBagConstraintsDepositoBanco = new GridBagConstraints();
		gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepositoBanco.gridy = 1;
		gridBagConstraintsDepositoBanco.gridx =1;
		jPanelFK_IdAsientoContableDepositoBanco.add(jButtonFK_IdAsientoContableDepositoBanco, gridBagConstraintsDepositoBanco);

		jTabbedPaneBusquedasDepositoBanco.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableDepositoBanco);
		jTabbedPaneBusquedasDepositoBanco.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdBancoDepositoBanco= new GridBagLayout();
		gridaBagLayoutFK_IdBancoDepositoBanco.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBancoDepositoBanco.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBancoDepositoBanco.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBancoDepositoBanco.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBancoDepositoBanco.setLayout(gridaBagLayoutFK_IdBancoDepositoBanco);

		gridBagConstraintsDepositoBanco = new GridBagConstraints();
		gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepositoBanco.gridy = 0;
		gridBagConstraintsDepositoBanco.gridx = 0;
		jPanelFK_IdBancoDepositoBanco.add(jLabelid_bancoFK_IdBancoDepositoBanco, gridBagConstraintsDepositoBanco);

		gridBagConstraintsDepositoBanco = new GridBagConstraints();
		gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepositoBanco.gridy = 0;
		gridBagConstraintsDepositoBanco.gridx = 1;
		jPanelFK_IdBancoDepositoBanco.add(jComboBoxid_bancoFK_IdBancoDepositoBanco, gridBagConstraintsDepositoBanco);

		gridBagConstraintsDepositoBanco = new GridBagConstraints();
		gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDepositoBanco.gridy = 1;
		gridBagConstraintsDepositoBanco.gridx =1;
		jPanelFK_IdBancoDepositoBanco.add(jButtonFK_IdBancoDepositoBanco, gridBagConstraintsDepositoBanco);

		jTabbedPaneBusquedasDepositoBanco.addTab("2.-Por Banco ", jPanelFK_IdBancoDepositoBanco);
		jTabbedPaneBusquedasDepositoBanco.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDepositoBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDepositoBanco);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.depositobancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();						
			this.gridBagConstraintsDepositoBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDepositoBanco.gridx = 0;		
			//this.gridBagConstraintsDepositoBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDepositoBanco.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDepositoBanco, this.gridBagConstraintsDepositoBanco);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDepositoBanco.gridx = 0;		
		//this.gridBagConstraintsDepositoBanco.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDepositoBanco.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDepositoBanco);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDepositoBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDepositoBanco.gridx = 0;		
			this.gridBagConstraintsDepositoBanco.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDepositoBanco.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDepositoBanco, this.gridBagConstraintsDepositoBanco);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepositoBanco.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDepositoBanco, this.gridBagConstraintsDepositoBanco);								
		
		
		/*
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepositoBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDepositoBanco, this.gridBagConstraintsDepositoBanco);
		*/		
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDepositoBanco.gridx =0;
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDepositoBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDepositoBanco, this.gridBagConstraintsDepositoBanco);
				
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepositoBanco.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDepositoBanco, this.gridBagConstraintsDepositoBanco);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DepositoBancoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDepositoBanco= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDepositoBanco = new GridBagLayout();
			this.jPanelBusquedasParametrosDepositoBanco.setLayout(gridaBagLayoutBusquedasParametrosDepositoBanco);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDepositoBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDepositoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDepositoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDepositoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepositoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDepositoBanco, this.gridBagConstraintsDepositoBanco);
			
			
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepositoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
			
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDepositoBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDepositoBanco, this.gridBagConstraintsDepositoBanco);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDepositoBanco;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDepositoBanco() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDepositoBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDepositoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDepositoBanco.setName("jPanelReporteDinamicoDepositoBanco"); 
		
		this.jPanelReporteDinamicoDepositoBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDepositoBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDepositoBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDepositoBanco.setLayout(gridaBagLayoutReporteDinamicoDepositoBanco);
		
		
		this.jInternalFrameReporteDinamicoDepositoBanco= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDepositoBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDepositoBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDepositoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDepositoBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDepositoBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDepositoBanco.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDepositoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDepositoBanco.setResizable(true);
	    this.jInternalFrameReporteDinamicoDepositoBanco.setClosable(true);
	    this.jInternalFrameReporteDinamicoDepositoBanco.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDepositoBanco.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDepositoBanco.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDepositoBanco.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deposito Bancos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDepositoBanco = new JLabelMe();

		this.jLabelColumnasSelectReporteDepositoBanco.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDepositoBanco.add(this.jLabelColumnasSelectReporteDepositoBanco, this.gridBagConstraintsDepositoBanco);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDepositoBanco = new JList<Reporte>();
		this.jListColumnasSelectReporteDepositoBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDepositoBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDepositoBanco.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDepositoBanco.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDepositoBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDepositoBanco=new JScrollPane(this.jListColumnasSelectReporteDepositoBanco);
			
			this.jScrollColumnasSelectReporteDepositoBanco.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDepositoBanco.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDepositoBanco.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDepositoBanco.add(this.jListColumnasSelectReporteDepositoBanco, this.gridBagConstraintsDepositoBanco);
		this.jPanelReporteDinamicoDepositoBanco.add(this.jScrollColumnasSelectReporteDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDepositoBanco = new JLabelMe();

		this.jLabelRelacionesSelectReporteDepositoBanco.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDepositoBanco = new JList<Reporte>();
		this.jListRelacionesSelectReporteDepositoBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDepositoBanco.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDepositoBanco.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDepositoBanco.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDepositoBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDepositoBanco=new JScrollPane(this.jListRelacionesSelectReporteDepositoBanco);
			
			this.jScrollRelacionesSelectReporteDepositoBanco.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDepositoBanco.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDepositoBanco.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDepositoBanco = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDepositoBanco = new JComboBoxMe();
		this.jListColumnasValoresGraficoDepositoBanco = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDepositoBanco = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDepositoBanco.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDepositoBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDepositoBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDepositoBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDepositoBanco = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDepositoBanco.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDepositoBanco.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDepositoBanco.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDepositoBanco.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDepositoBanco = new JLabelMe();

		this.jLabelConGraficoDinamicoDepositoBanco.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDepositoBanco.add(this.jLabelConGraficoDinamicoDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDepositoBanco = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDepositoBanco.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDepositoBanco.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDepositoBanco.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDepositoBanco.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDepositoBanco.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepositoBanco.add(this.jCheckBoxConGraficoDinamicoDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDepositoBanco = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDepositoBanco.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDepositoBanco.add(this.jLabelColumnaCategoriaGraficoDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDepositoBanco = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDepositoBanco.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDepositoBanco.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDepositoBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDepositoBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDepositoBanco.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDepositoBanco.add(this.jComboBoxColumnaCategoriaGraficoDepositoBanco, this.gridBagConstraintsDepositoBanco);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDepositoBanco = new JLabelMe();

		this.jLabelColumnaCategoriaValorDepositoBanco.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepositoBanco.add(this.jLabelColumnaCategoriaValorDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDepositoBanco = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDepositoBanco.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDepositoBanco.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDepositoBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDepositoBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDepositoBanco.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDepositoBanco.add(this.jComboBoxColumnaCategoriaValorDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDepositoBanco = new JLabelMe();

		this.jLabelColumnasValoresGraficoDepositoBanco.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepositoBanco.add(this.jLabelColumnasValoresGraficoDepositoBanco, this.gridBagConstraintsDepositoBanco);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDepositoBanco = new JList<Reporte>();
		this.jListColumnasValoresGraficoDepositoBanco.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDepositoBanco.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDepositoBanco.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDepositoBanco.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDepositoBanco.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDepositoBanco=new JScrollPane(this.jListColumnasValoresGraficoDepositoBanco);
			
			this.jScrollColumnasValoresGraficoDepositoBanco.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDepositoBanco.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDepositoBanco.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDepositoBanco.add(this.jListColumnasSelectReporteDepositoBanco, this.gridBagConstraintsDepositoBanco);
		this.jPanelReporteDinamicoDepositoBanco.add(this.jScrollColumnasValoresGraficoDepositoBanco, this.gridBagConstraintsDepositoBanco);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDepositoBanco = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDepositoBanco.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepositoBanco.add(this.jLabelTiposGraficosReportesDinamicoDepositoBanco, this.gridBagConstraintsDepositoBanco);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDepositoBanco = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDepositoBanco.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDepositoBanco.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDepositoBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDepositoBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDepositoBanco.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepositoBanco.add(this.jComboBoxTiposGraficosReportesDinamicoDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDepositoBanco = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDepositoBanco.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepositoBanco.add(this.jLabelGenerarExcelReporteDinamicoDepositoBanco, this.gridBagConstraintsDepositoBanco);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDepositoBanco = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDepositoBanco.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDepositoBanco,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDepositoBanco.setToolTipText("Generar EXCEL"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDepositoBanco.add(this.jButtonGenerarExcelReporteDinamicoDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDepositoBanco.add(this.jComboBoxTiposReportesDinamicoDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDepositoBanco = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDepositoBanco.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDepositoBanco.add(this.jLabelTiposArchivoReporteDinamicoDepositoBanco, this.gridBagConstraintsDepositoBanco);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDepositoBanco.add(this.jComboBoxTiposArchivosReportesDinamicoDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDepositoBanco = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDepositoBanco.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDepositoBanco,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDepositoBanco.setToolTipText("Generar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDepositoBanco.add(this.jButtonGenerarReporteDinamicoDepositoBanco, this.gridBagConstraintsDepositoBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDepositoBanco = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDepositoBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDepositoBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDepositoBanco.setToolTipText("Cancelar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDepositoBanco.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDepositoBanco.add(this.jButtonCerrarReporteDinamicoDepositoBanco, this.gridBagConstraintsDepositoBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDepositoBanco = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDepositoBanco= new JScrollPane(jPanelReporteDinamicoDepositoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDepositoBanco.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDepositoBanco.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDepositoBanco.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deposito Bancos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDepositoBanco.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDepositoBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDepositoBanco.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDepositoBanco);
		this.jInternalFrameReporteDinamicoDepositoBanco.getContentPane().add(this.jScrollPanelReporteDinamicoDepositoBanco, this.gridBagConstraintsDepositoBanco);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDepositoBanco() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDepositoBanco = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDepositoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDepositoBanco.setName("jPanelImportacionDepositoBanco"); 
		
		this.jPanelImportacionDepositoBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDepositoBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDepositoBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDepositoBanco.setLayout(gridaBagLayoutImportacionDepositoBanco);
		
		
		this.jInternalFrameImportacionDepositoBanco= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDepositoBanco= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDepositoBanco = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDepositoBanco= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDepositoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDepositoBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDepositoBanco.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDepositoBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDepositoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDepositoBanco.setResizable(true);
	    this.jInternalFrameImportacionDepositoBanco.setClosable(true);
	    this.jInternalFrameImportacionDepositoBanco.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDepositoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDepositoBanco.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDepositoBanco.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDepositoBanco.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDepositoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDepositoBanco.setResizable(true);
	    this.jInternalFrameImportacionDepositoBanco.setClosable(true);
	    this.jInternalFrameImportacionDepositoBanco.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDepositoBanco.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDepositoBanco.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDepositoBanco.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deposito Bancos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDepositoBanco = new JLabelMe();

		this.jLabelArchivoImportacionDepositoBanco.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDepositoBanco.add(this.jLabelArchivoImportacionDepositoBanco, this.gridBagConstraintsDepositoBanco);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDepositoBanco = new JFileChooser();		
		this.jFileChooserImportacionDepositoBanco.setToolTipText("ESCOGER ARCHIVO"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDepositoBanco = new JButtonMe();
		this.jButtonAbrirImportacionDepositoBanco.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDepositoBanco,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDepositoBanco.setToolTipText("Generar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsDepositoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDepositoBanco.add(this.jButtonAbrirImportacionDepositoBanco, this.gridBagConstraintsDepositoBanco);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDepositoBanco = new JLabelMe();

		this.jLabelPathArchivoImportacionDepositoBanco.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYImportacion;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDepositoBanco.add(this.jLabelPathArchivoImportacionDepositoBanco, this.gridBagConstraintsDepositoBanco);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDepositoBanco=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDepositoBanco.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDepositoBanco.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDepositoBanco.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsDepositoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDepositoBanco.add(this.jTextFieldPathArchivoImportacionDepositoBanco, this.gridBagConstraintsDepositoBanco);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDepositoBanco = new JButtonMe();
		this.jButtonGenerarImportacionDepositoBanco.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDepositoBanco,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDepositoBanco.setToolTipText("Generar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsDepositoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDepositoBanco.add(this.jButtonGenerarImportacionDepositoBanco, this.gridBagConstraintsDepositoBanco);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDepositoBanco = new JButtonMe();
		this.jButtonCerrarImportacionDepositoBanco.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDepositoBanco,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDepositoBanco.setToolTipText("Cancelar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepositoBanco.gridy = iPosYImportacion;
		this.gridBagConstraintsDepositoBanco.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDepositoBanco.add(this.jButtonCerrarImportacionDepositoBanco, this.gridBagConstraintsDepositoBanco);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDepositoBanco = new GridBagLayout();
		
		this.jScrollPanelImportacionDepositoBanco= new JScrollPane(jPanelImportacionDepositoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy =iPosYImportacion;
		this.gridBagConstraintsDepositoBanco.gridx =iPosXImportacion;
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDepositoBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDepositoBanco.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDepositoBanco);
		this.jInternalFrameImportacionDepositoBanco.getContentPane().add(this.jScrollPanelImportacionDepositoBanco, this.gridBagConstraintsDepositoBanco);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDepositoBanco(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDepositoBanco = new JButtonMe();
			this.jButtonAbrirOrderByDepositoBanco.setText("Orden");
			this.jButtonAbrirOrderByDepositoBanco.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDepositoBanco,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDepositoBanco";
			inputMap = this.jButtonAbrirOrderByDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDepositoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDepositoBanco"));
		
		
			GridBagLayout gridaBagLayoutOrderByDepositoBanco = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDepositoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDepositoBanco.setName("jPanelOrderByDepositoBanco"); 
			
			this.jPanelOrderByDepositoBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDepositoBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDepositoBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDepositoBanco.setLayout(gridaBagLayoutOrderByDepositoBanco);
			
			
			this.jTableDatosDepositoBancoOrderBy = new JTableMe();        
			this.jTableDatosDepositoBancoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDepositoBancoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDepositoBancoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDepositoBancoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDepositoBancoOrderBy.setViewportView(this.jTableDatosDepositoBancoOrderBy);
			this.jTableDatosDepositoBancoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDepositoBancoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDepositoBanco= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDepositoBanco= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDepositoBanco = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDepositoBanco= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDepositoBanco.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDepositoBanco.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDepositoBanco.setTitle("Orden");
			this.jInternalFrameOrderByDepositoBanco.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDepositoBanco.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDepositoBanco.setResizable(true);
			this.jInternalFrameOrderByDepositoBanco.setClosable(true);
			this.jInternalFrameOrderByDepositoBanco.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDepositoBanco.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDepositoBanco.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDepositoBanco.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deposito Bancos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDepositoBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDepositoBanco.ipady =150;
				
			this.jPanelOrderByDepositoBanco.add(jScrollPanelDatosDepositoBancoOrderBy, this.gridBagConstraintsDepositoBanco);//this.jTableDatosDepositoBancoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDepositoBanco = new JButtonMe();
			this.jButtonCerrarOrderByDepositoBanco.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDepositoBanco,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDepositoBanco.setToolTipText("Cancelar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDepositoBanco.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDepositoBanco.add(this.jButtonCerrarOrderByDepositoBanco, this.gridBagConstraintsDepositoBanco);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDepositoBanco = new GridBagLayout();
			
			this.jScrollPanelOrderByDepositoBanco= new JScrollPane(jPanelOrderByDepositoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.gridy =iPosYOrderBy;
			this.gridBagConstraintsDepositoBanco.gridx =iPosXOrderBy;
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDepositoBanco.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDepositoBanco.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDepositoBanco);
			
			this.jInternalFrameOrderByDepositoBanco.getContentPane().add(this.jScrollPanelOrderByDepositoBanco, this.gridBagConstraintsDepositoBanco);			
		
		} else {
			this.jButtonAbrirOrderByDepositoBanco = new JButtonMe();
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
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.depositobancoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDepositoBanco.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDepositoBanco.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDepositoBanco.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDepositoBanco.getRowHeight();//DepositoBancoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DepositoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDepositoBanco.isSelected()) {
					iHeightTable=DepositoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DepositoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DepositoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DepositoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDepositoBanco.isSelected()) {
					iHeightTable=DepositoBancoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DepositoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DepositoBancoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDepositoBanco.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDepositoBanco.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDepositoBanco.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDepositoBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDepositoBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDepositoBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDepositoBanco!=null && this.jInternalFrameOrderByDepositoBanco.getjTableDatosOrderBy()!=null) {
			//if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDepositoBanco.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDepositoBanco.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDepositoBanco.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDepositoBanco.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDepositoBanco.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDepositoBanco.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDepositoBanco.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDepositoBanco.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDepositoBanco.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDepositoBanco.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=depositobancoLogic.getDepositoBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=depositobancos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DepositoBanco> TraerDepositoBancoBeans(List<DepositoBanco> depositobancos,ArrayList<Classe> classes)throws Exception {
		try {
			for(DepositoBanco depositobanco:depositobancos) {
					
				if(!(DepositoBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DepositoBancoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					depositobanco.setsDetalleGeneralEntityReporte(DepositoBancoConstantesFunciones.getDepositoBancoDescripcion(depositobanco));
										
						
					
						
					
				} else  {
							
					//depositobanco.setsDetalleGeneralEntityReporte(depositobanco.getsDetalleGeneralEntityReporte());
										
				}
				
				//depositobancobeans.add(depositobancobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return depositobancos;
    }
	//PARA REPORTES FIN
}
