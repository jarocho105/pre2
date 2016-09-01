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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.InformacionFinancieraConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class InformacionFinancieraJInternalFrame extends InformacionFinancieraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarInformacionFinanciera;
	
	protected JMenuBar jmenuBarInformacionFinanciera;
	
	protected JMenu jmenuInformacionFinanciera;
	protected JMenu jmenuDatosInformacionFinanciera;
	protected JMenu jmenuArchivoInformacionFinanciera;
	protected JMenu jmenuAccionesInformacionFinanciera;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosInformacionFinanciera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutInformacionFinanciera;	
	protected GridBagConstraints gridBagConstraintsInformacionFinanciera;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public InformacionFinancieraDetalleFormJInternalFrame jInternalFrameDetalleFormInformacionFinanciera;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoInformacionFinanciera;	
	protected ImportacionJInternalFrame jInternalFrameImportacionInformacionFinanciera;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoMoviFinanBeanSwingJInternalFrame tipomovifinanBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovifinan="";
	
	public InformacionFinancieraSessionBean informacionfinancieraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoMoviFinanSessionBean tipomovifinanSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<InformacionFinanciera> informacionfinancieras;		
	public List<InformacionFinanciera> informacionfinancierasEliminados;	
	public List<InformacionFinanciera> informacionfinancierasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByInformacionFinanciera;		
	protected JButton jButtonAbrirOrderByInformacionFinanciera;
	
	
	//protected JPanel jPanelOrderByInformacionFinanciera;
	//public JScrollPane jScrollPanelOrderByInformacionFinanciera;	
	//protected JButton jButtonCerrarOrderByInformacionFinanciera;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public InformacionFinancieraLogic informacionfinancieraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosInformacionFinanciera;
	public JScrollPane jScrollPanelDatosEdicionInformacionFinanciera;
	public JScrollPane jScrollPanelDatosGeneralInformacionFinanciera;
    
	
	
	//public JScrollPane jScrollPanelDatosInformacionFinancieraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoInformacionFinanciera;
	//public JScrollPane jScrollPanelImportacionInformacionFinanciera;
	
	
	
	protected JPanel jPanelAccionesInformacionFinanciera;
	
    protected JPanel jPanelPaginacionInformacionFinanciera;
    protected JPanel jPanelParametrosReportesInformacionFinanciera;
	protected JPanel jPanelParametrosReportesAccionesInformacionFinanciera;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1InformacionFinanciera;
	protected JPanel jPanelParametrosAuxiliar2InformacionFinanciera;
	protected JPanel jPanelParametrosAuxiliar3InformacionFinanciera;
	protected JPanel jPanelParametrosAuxiliar4InformacionFinanciera;
	//protected JPanel jPanelParametrosAuxiliar5InformacionFinanciera;
	
	
	
	//protected JPanel jPanelReporteDinamicoInformacionFinanciera;
	//protected JPanel jPanelImportacionInformacionFinanciera;
	
	
	public JTable jTableDatosInformacionFinanciera;
	
	
	
	//public JTable jTableDatosInformacionFinancieraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoInformacionFinanciera;
	protected JButton jButtonDuplicarInformacionFinanciera;
	protected JButton jButtonCopiarInformacionFinanciera;
	protected JButton jButtonVerFormInformacionFinanciera;
	protected JButton jButtonNuevoRelacionesInformacionFinanciera;
	protected JButton jButtonModificarInformacionFinanciera;
	
    protected JButton jButtonGuardarCambiosTablaInformacionFinanciera;
	protected JButton jButtonCerrarInformacionFinanciera;
	
	
	protected JButton jButtonRecargarInformacionInformacionFinanciera;
	protected JButton jButtonProcesarInformacionInformacionFinanciera;
	
	
	protected JButton jButtonAnterioresInformacionFinanciera;
	protected JButton jButtonSiguientesInformacionFinanciera;
	protected JButton jButtonNuevoGuardarCambiosInformacionFinanciera;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoInformacionFinanciera;
	//protected JButton jButtonCerrarReporteDinamicoInformacionFinanciera;
	//protected JButton jButtonGenerarExcelReporteDinamicoInformacionFinanciera;	
	
	
	
	//protected JButton jButtonAbrirImportacionInformacionFinanciera;
	//protected JButton jButtonGenerarImportacionInformacionFinanciera;
	//protected JButton jButtonCerrarImportacionInformacionFinanciera;
	//protected JFileChooser jFileChooserImportacionInformacionFinanciera;
	//protected File fileImportacionInformacionFinanciera;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarInformacionFinanciera;
	protected JButton jButtonDuplicarToolBarInformacionFinanciera;
	protected JButton jButtonNuevoRelacionesToolBarInformacionFinanciera;
	
	
	public JButton jButtonGuardarCambiosToolBarInformacionFinanciera;
	protected JButton jButtonCopiarToolBarInformacionFinanciera;
	protected JButton jButtonVerFormToolBarInformacionFinanciera;
	public JButton jButtonGuardarCambiosTablaToolBarInformacionFinanciera;
	protected JButton jButtonMostrarOcultarTablaToolBarInformacionFinanciera;
	protected JButton jButtonCerrarToolBarInformacionFinanciera;
	
	protected JButton jButtonRecargarInformacionToolBarInformacionFinanciera;
	protected JButton jButtonProcesarInformacionToolBarInformacionFinanciera;
	protected JButton jButtonAnterioresToolBarInformacionFinanciera;
	protected JButton jButtonSiguientesToolBarInformacionFinanciera;
	protected JButton jButtonNuevoGuardarCambiosToolBarInformacionFinanciera;
	protected JButton jButtonAbrirOrderByToolBarInformacionFinanciera;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoInformacionFinanciera;
	protected JMenuItem jMenuItemDuplicarInformacionFinanciera;
	protected JMenuItem jMenuItemNuevoRelacionesInformacionFinanciera;
	
	
	protected JMenuItem jMenuItemGuardarCambiosInformacionFinanciera;
	protected JMenuItem jMenuItemCopiarInformacionFinanciera;
	protected JMenuItem jMenuItemVerFormInformacionFinanciera;
	protected JMenuItem jMenuItemGuardarCambiosTablaInformacionFinanciera;
	protected JMenuItem jMenuItemCerrarInformacionFinanciera;
	protected JMenuItem jMenuItemDetalleCerrarInformacionFinanciera;
	protected JMenuItem jMenuItemDetalleAbrirOrderByInformacionFinanciera;
	protected JMenuItem jMenuItemDetalleMostarOcultarInformacionFinanciera;
	
	protected JMenuItem jMenuItemRecargarInformacionInformacionFinanciera;
	protected JMenuItem jMenuItemProcesarInformacionInformacionFinanciera;
	protected JMenuItem jMenuItemAnterioresInformacionFinanciera;
	protected JMenuItem jMenuItemSiguientesInformacionFinanciera;
	protected JMenuItem jMenuItemNuevoGuardarCambiosInformacionFinanciera;
	protected JMenuItem jMenuItemAbrirOrderByInformacionFinanciera;
	protected JMenuItem jMenuItemMostrarOcultarInformacionFinanciera;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesInformacionFinanciera;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosInformacionFinanciera;
	protected JCheckBox jCheckBoxSeleccionadosInformacionFinanciera;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaInformacionFinanciera;
	protected JCheckBox jCheckBoxConGraficoReporteInformacionFinanciera;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesInformacionFinanciera;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesInformacionFinanciera;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoInformacionFinanciera;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoInformacionFinanciera;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesInformacionFinanciera;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionInformacionFinanciera;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesInformacionFinanciera;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesInformacionFinanciera;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarInformacionFinanciera;
	protected JTextField jTextFieldValorCampoGeneralInformacionFinanciera;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteInformacionFinanciera;
	//public JList<Reporte> jListColumnasSelectReporteInformacionFinanciera;
	//public JScrollPane jScrollColumnasSelectReporteInformacionFinanciera;
	
	//public JLabel jLabelRelacionesSelectReporteInformacionFinanciera;
	//public JList<Reporte> jListRelacionesSelectReporteInformacionFinanciera;
	//public JScrollPane jScrollRelacionesSelectReporteInformacionFinanciera;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoInformacionFinanciera;
	//protected JCheckBox jCheckBoxConGraficoDinamicoInformacionFinanciera;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoInformacionFinanciera;
	//public JLabel jLabelTiposArchivoReporteDinamicoInformacionFinanciera;
	
		
	//public JLabel jLabelArchivoImportacionInformacionFinanciera;	
	//public JLabel jLabelPathArchivoImportacionInformacionFinanciera;
	//protected JTextField jTextFieldPathArchivoImportacionInformacionFinanciera;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoInformacionFinanciera;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoInformacionFinanciera;
	
	//public JLabel jLabelColumnaCategoriaValorInformacionFinanciera;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorInformacionFinanciera;
	
	//public JLabel jLabelColumnasValoresGraficoInformacionFinanciera;
	//public JList<Reporte> jListColumnasValoresGraficoInformacionFinanciera;
	//public JScrollPane jScrollColumnasValoresGraficoInformacionFinanciera;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoInformacionFinanciera;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoInformacionFinanciera;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasInformacionFinanciera;
	public JPanel jPanelFK_IdClienteInformacionFinanciera;
	public JButton jButtonFK_IdClienteInformacionFinanciera;
	public JPanel jPanelFK_IdValorClienteMovimientoInformacionFinanciera;
	public JButton jButtonFK_IdValorClienteMovimientoInformacionFinanciera;
	
	public JPanel jPanelidclienteFK_IdClienteInformacionFinanciera;
	public JLabel jLabelidclienteFK_IdClienteInformacionFinanciera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteFK_IdClienteInformacionFinanciera;
	public JButton jButtonidclienteFK_IdClienteInformacionFinanciera= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteInformacionFinancieraUpdate= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteInformacionFinancieraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteidclienteInformacionFinanciera;
	
	public JPanel jPanelidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera;
	public JLabel jLabelidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera;
	public JButton jButtonidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera= new JButtonMe();
	public JButton jButtonidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinancieraUpdate= new JButtonMe();
	public JButton jButtonidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinancieraBusqueda= new JButtonMe();

	
	
	
	
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
	public InformacionFinancieraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("InformacionFinanciera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionFinancieraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformacionFinanciera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionFinancieraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("InformacionFinanciera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public InformacionFinancieraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("InformacionFinanciera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionInformacionFinanciera)	{
		this.jButtonRecargarInformacionInformacionFinanciera = jButtonRecargarInformacionInformacionFinanciera;
	}
	
	public JButton getjButtonProcesarInformacionInformacionFinanciera() {
		return this.jButtonProcesarInformacionInformacionFinanciera;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionInformacionFinanciera)	{
		this.jButtonProcesarInformacionInformacionFinanciera = jButtonProcesarInformacionInformacionFinanciera;
	}
	
	
	public JButton getjButtonRecargarInformacionInformacionFinanciera() {
		return this.jButtonRecargarInformacionInformacionFinanciera;
	}
	
	
	public List<InformacionFinanciera> getinformacionfinancieras() {
		return this.informacionfinancieras;
	}

	public void setinformacionfinancieras(List<InformacionFinanciera> informacionfinancieras) {
		this.informacionfinancieras = informacionfinancieras;
	}
	
	public List<InformacionFinanciera> getinformacionfinancierasAux() {
		return this.informacionfinancierasAux;
	}

	public void setinformacionfinancierasAux(List<InformacionFinanciera> informacionfinancierasAux) {
		this.informacionfinancierasAux = informacionfinancierasAux;
	}
	
	public List<InformacionFinanciera> getinformacionfinancierasEliminados() {
		return this.informacionfinancierasEliminados;
	}

	public void setInformacionFinancierasEliminados(List<InformacionFinanciera> informacionfinancierasEliminados) {
		this.informacionfinancierasEliminados = informacionfinancierasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarInformacionFinanciera() {
		return jComboBoxTiposSeleccionarInformacionFinanciera;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarInformacionFinanciera(
			JComboBox jComboBoxTiposSeleccionarInformacionFinanciera) {
		this.jComboBoxTiposSeleccionarInformacionFinanciera = jComboBoxTiposSeleccionarInformacionFinanciera;
	}
	
	public void setBorderResaltarTiposSeleccionarInformacionFinanciera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarInformacionFinanciera.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarInformacionFinanciera .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralInformacionFinanciera() {
		return jTextFieldValorCampoGeneralInformacionFinanciera;
	}

	public void setjTextFieldValorCampoGeneralInformacionFinanciera(
			JTextField jTextFieldValorCampoGeneralInformacionFinanciera) {
		this.jTextFieldValorCampoGeneralInformacionFinanciera = jTextFieldValorCampoGeneralInformacionFinanciera;
	}

	public void setBorderResaltarValorCampoGeneralInformacionFinanciera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionFinanciera.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralInformacionFinanciera .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosInformacionFinanciera() {
		return this.jCheckBoxSeleccionarTodosInformacionFinanciera;
	}

	public void setjCheckBoxSeleccionarTodosInformacionFinanciera(
			JCheckBox jCheckBoxSeleccionarTodosInformacionFinanciera) {
		this.jCheckBoxSeleccionarTodosInformacionFinanciera = jCheckBoxSeleccionarTodosInformacionFinanciera;
	}

	public void setBorderResaltarSeleccionarTodosInformacionFinanciera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionFinanciera.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosInformacionFinanciera .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosInformacionFinanciera() {
		return this.jCheckBoxSeleccionadosInformacionFinanciera;
	}

	public void setjCheckBoxSeleccionadosInformacionFinanciera(
			JCheckBox jCheckBoxSeleccionadosInformacionFinanciera) {
		this.jCheckBoxSeleccionadosInformacionFinanciera = jCheckBoxSeleccionadosInformacionFinanciera;
	}
	
	public void setBorderResaltarSeleccionadosInformacionFinanciera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionFinanciera.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosInformacionFinanciera .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesInformacionFinanciera() {
		return this.jComboBoxTiposArchivosReportesInformacionFinanciera;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesInformacionFinanciera(
			JComboBox jComboBoxTiposArchivosReportesInformacionFinanciera) {
		this.jComboBoxTiposArchivosReportesInformacionFinanciera = jComboBoxTiposArchivosReportesInformacionFinanciera;
	}

	public void setBorderResaltarTiposArchivosReportesInformacionFinanciera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionFinanciera.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesInformacionFinanciera .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesInformacionFinanciera() {
		return this.jComboBoxTiposReportesInformacionFinanciera;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesInformacionFinanciera(
			JComboBox jComboBoxTiposReportesInformacionFinanciera) {
		this.jComboBoxTiposReportesInformacionFinanciera = jComboBoxTiposReportesInformacionFinanciera;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoInformacionFinanciera() {
	//	return jComboBoxTiposReportesDinamicoInformacionFinanciera;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoInformacionFinanciera(
	//		JComboBox jComboBoxTiposReportesDinamicoInformacionFinanciera) {
	//	this.jComboBoxTiposReportesDinamicoInformacionFinanciera = jComboBoxTiposReportesDinamicoInformacionFinanciera;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoInformacionFinanciera() {
	//	return jComboBoxTiposArchivosReportesDinamicoInformacionFinanciera;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoInformacionFinanciera(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoInformacionFinanciera) {
	//	this.jComboBoxTiposArchivosReportesDinamicoInformacionFinanciera = jComboBoxTiposArchivosReportesDinamicoInformacionFinanciera;
	//}
	
	public void setBorderResaltarTiposReportesInformacionFinanciera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionFinanciera.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesInformacionFinanciera .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesInformacionFinanciera() {
		return this.jComboBoxTiposGraficosReportesInformacionFinanciera;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesInformacionFinanciera(
			JComboBox jComboBoxTiposGraficosReportesInformacionFinanciera) {
		this.jComboBoxTiposGraficosReportesInformacionFinanciera = jComboBoxTiposGraficosReportesInformacionFinanciera;
	}
	
	public void setBorderResaltarTiposGraficosReportesInformacionFinanciera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionFinanciera.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesInformacionFinanciera .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionInformacionFinanciera() {
		return this.jComboBoxTiposPaginacionInformacionFinanciera;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionInformacionFinanciera(
			JComboBox jComboBoxTiposPaginacionInformacionFinanciera) {
		this.jComboBoxTiposPaginacionInformacionFinanciera = jComboBoxTiposPaginacionInformacionFinanciera;
	}
	
	public void setBorderResaltarTiposPaginacionInformacionFinanciera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionFinanciera.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionInformacionFinanciera .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesInformacionFinanciera() {
		return this.jComboBoxTiposRelacionesInformacionFinanciera;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesInformacionFinanciera() {
		return this.jComboBoxTiposAccionesInformacionFinanciera;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesInformacionFinanciera(
			JComboBox jComboBoxTiposRelacionesInformacionFinanciera) {
		this.jComboBoxTiposRelacionesInformacionFinanciera = jComboBoxTiposRelacionesInformacionFinanciera;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesInformacionFinanciera(
			JComboBox jComboBoxTiposAccionesInformacionFinanciera) {
		this.jComboBoxTiposAccionesInformacionFinanciera = jComboBoxTiposAccionesInformacionFinanciera;
	}
	
	public void setBorderResaltarTiposRelacionesInformacionFinanciera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionFinanciera.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesInformacionFinanciera .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesInformacionFinanciera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarInformacionFinanciera.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesInformacionFinanciera .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoInformacionFinanciera() {
	//	return jCheckBoxConGraficoDinamicoInformacionFinanciera;
	//}

	//public void setjCheckBoxConGraficoDinamicoInformacionFinanciera(
	//		JCheckBox jCheckBoxConGraficoDinamicoInformacionFinanciera) {
	//	this.jCheckBoxConGraficoDinamicoInformacionFinanciera = jCheckBoxConGraficoDinamicoInformacionFinanciera;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoInformacionFinanciera() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarInformacionFinanciera.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoInformacionFinanciera .setBorder(borderResaltar);		
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
		this.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
		
		this.informacionfinancieraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.informacionfinancieraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.informacionfinancieraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=InformacionFinancieraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=InformacionFinancieraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		InformacionFinancieraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		InformacionFinancieraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		InformacionFinancieraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Informacion Financiera MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
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
		
		InformacionFinancieraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("InformacionFinanciera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarInformacionFinanciera= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarInformacionFinanciera,this.jTtoolBarInformacionFinanciera,
							"nuevo","nuevo","Nuevo"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarInformacionFinanciera,this.jTtoolBarInformacionFinanciera,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarInformacionFinanciera,this.jTtoolBarInformacionFinanciera,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarInformacionFinanciera,this.jTtoolBarInformacionFinanciera,
							"duplicar","duplicar","Duplicar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarInformacionFinanciera,this.jTtoolBarInformacionFinanciera,
							"copiar","copiar","Copiar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarInformacionFinanciera,this.jTtoolBarInformacionFinanciera,
							"ver_form","ver_form","Ver"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarInformacionFinanciera,this.jTtoolBarInformacionFinanciera,
							"recargar","recargar","Recargar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarInformacionFinanciera,this.jTtoolBarInformacionFinanciera,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarInformacionFinanciera,this.jTtoolBarInformacionFinanciera,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarInformacionFinanciera,this.jTtoolBarInformacionFinanciera,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarInformacionFinanciera,this.jTtoolBarInformacionFinanciera,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarInformacionFinanciera,this.jTtoolBarInformacionFinanciera,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarInformacionFinanciera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarInformacionFinanciera,this.jTtoolBarInformacionFinanciera,
							"cerrar","cerrar","Salir"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarInformacionFinanciera=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarInformacionFinanciera;
			
				this.jButtonProcesarInformacionToolBarInformacionFinanciera=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarInformacionFinanciera;
				
		//protected JButton jButtonModificarToolBarInformacionFinanciera;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarInformacionFinanciera=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuInformacionFinanciera=new JMenuMe("General");
		this.jmenuArchivoInformacionFinanciera=new JMenuMe("Archivo");
		this.jmenuAccionesInformacionFinanciera=new JMenuMe("Acciones");
		this.jmenuDatosInformacionFinanciera=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoInformacionFinanciera= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoInformacionFinanciera.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoInformacionFinanciera,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarInformacionFinanciera= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarInformacionFinanciera.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarInformacionFinanciera,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesInformacionFinanciera= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesInformacionFinanciera.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesInformacionFinanciera,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosInformacionFinanciera= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosInformacionFinanciera.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosInformacionFinanciera,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarInformacionFinanciera= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarInformacionFinanciera.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarInformacionFinanciera,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormInformacionFinanciera= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormInformacionFinanciera.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormInformacionFinanciera,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaInformacionFinanciera= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaInformacionFinanciera.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaInformacionFinanciera,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarInformacionFinanciera= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarInformacionFinanciera.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarInformacionFinanciera,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionInformacionFinanciera= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionInformacionFinanciera.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionInformacionFinanciera,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionInformacionFinanciera= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionInformacionFinanciera.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionInformacionFinanciera,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresInformacionFinanciera= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresInformacionFinanciera.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresInformacionFinanciera,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesInformacionFinanciera= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesInformacionFinanciera.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesInformacionFinanciera,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByInformacionFinanciera= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByInformacionFinanciera.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByInformacionFinanciera,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarInformacionFinanciera= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarInformacionFinanciera.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarInformacionFinanciera,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByInformacionFinanciera= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByInformacionFinanciera.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByInformacionFinanciera,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarInformacionFinanciera= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarInformacionFinanciera.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarInformacionFinanciera,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosInformacionFinanciera= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosInformacionFinanciera.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosInformacionFinanciera,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoInformacionFinanciera.add(this.jMenuItemCerrarInformacionFinanciera);
			
			this.jmenuAccionesInformacionFinanciera.add(this.jMenuItemNuevoInformacionFinanciera);
			this.jmenuAccionesInformacionFinanciera.add(this.jMenuItemNuevoGuardarCambiosInformacionFinanciera);
			this.jmenuAccionesInformacionFinanciera.add(this.jMenuItemNuevoRelacionesInformacionFinanciera);
			this.jmenuAccionesInformacionFinanciera.add(this.jMenuItemGuardarCambiosTablaInformacionFinanciera);		
			this.jmenuAccionesInformacionFinanciera.add(this.jMenuItemDuplicarInformacionFinanciera);		
			this.jmenuAccionesInformacionFinanciera.add(this.jMenuItemCopiarInformacionFinanciera);		
			this.jmenuAccionesInformacionFinanciera.add(this.jMenuItemVerFormInformacionFinanciera);		
			
			this.jmenuDatosInformacionFinanciera.add(this.jMenuItemRecargarInformacionInformacionFinanciera);				
			this.jmenuDatosInformacionFinanciera.add(this.jMenuItemAnterioresInformacionFinanciera);				
			this.jmenuDatosInformacionFinanciera.add(this.jMenuItemSiguientesInformacionFinanciera);				
			this.jmenuDatosInformacionFinanciera.add(this.jMenuItemAbrirOrderByInformacionFinanciera);				
			this.jmenuDatosInformacionFinanciera.add(this.jMenuItemMostrarOcultarInformacionFinanciera);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesInformacionFinanciera.add(this.jMenuItemGuardarCambiosInformacionFinanciera);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarInformacionFinanciera.add(this.jmenuArchivoInformacionFinanciera);		
			this.jmenuBarInformacionFinanciera.add(this.jmenuAccionesInformacionFinanciera);		
			this.jmenuBarInformacionFinanciera.add(this.jmenuDatosInformacionFinanciera);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarInformacionFinanciera);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasInformacionFinanciera() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteInformacionFinanciera=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteInformacionFinanciera.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteInformacionFinanciera= new JButtonMe();
		this.jButtonFK_IdClienteInformacionFinanciera.setText("Buscar");
		this.jButtonFK_IdClienteInformacionFinanciera.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteInformacionFinanciera,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidclienteFK_IdClienteInformacionFinanciera = new JLabelMe();
		jLabelidclienteFK_IdClienteInformacionFinanciera.setText("Cliente :");
		jLabelidclienteFK_IdClienteInformacionFinanciera.setToolTipText("Cliente");
		jLabelidclienteFK_IdClienteInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidclienteFK_IdClienteInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidclienteFK_IdClienteInformacionFinanciera= new JComboBoxMe();
		jComboBoxidclienteFK_IdClienteInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteFK_IdClienteInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteidclienteInformacionFinanciera= new JButtonMe();
		this.jButtonBuscarFK_IdClienteidclienteInformacionFinanciera.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteInformacionFinanciera.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteInformacionFinanciera.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteidclienteInformacionFinanciera.setText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteInformacionFinanciera.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteInformacionFinanciera.setFocusable(false);

		this.jPanelFK_IdValorClienteMovimientoInformacionFinanciera=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdValorClienteMovimientoInformacionFinanciera.setToolTipText("Buscar Por Tipo Movi Finan ");
		this.jButtonFK_IdValorClienteMovimientoInformacionFinanciera= new JButtonMe();
		this.jButtonFK_IdValorClienteMovimientoInformacionFinanciera.setText("Buscar");
		this.jButtonFK_IdValorClienteMovimientoInformacionFinanciera.setToolTipText("Buscar Por Tipo Movi Finan ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdValorClienteMovimientoInformacionFinanciera,"buscar_button","Buscar Por Tipo Movi Finan ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdValorClienteMovimientoInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera = new JLabelMe();
		jLabelidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.setText("Tipo Movi Finan :");
		jLabelidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.setToolTipText("Tipo Movi Finan");
		jLabelidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera= new JComboBoxMe();
		jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasInformacionFinanciera=new JTabbedPane();


		this.jTabbedPaneBusquedasInformacionFinanciera.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasInformacionFinanciera.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasInformacionFinanciera.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasInformacionFinanciera.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleInformacionFinanciera = new InformacionFinancieraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Informacion Financiera DATOS");
			this.jInternalFrameDetalleFormInformacionFinanciera = new InformacionFinancieraDetalleFormJInternalFrame(jDesktopPane,this.informacionfinancieraSessionBean.getConGuardarRelaciones(),this.informacionfinancieraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormInformacionFinanciera = null;//new InformacionFinancieraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutInformacionFinanciera= new GridBagLayout();
		
		
		this.jTableDatosInformacionFinanciera = new JTableMe();      
		
		String sToolTipInformacionFinanciera="";
		sToolTipInformacionFinanciera=InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipInformacionFinanciera+="(Cartera.InformacionFinanciera)";
		}
		
		if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
			sToolTipInformacionFinanciera+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosInformacionFinanciera.setToolTipText(sToolTipInformacionFinanciera);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosInformacionFinanciera);
		this.jTableDatosInformacionFinanciera.setAutoCreateRowSorter(true);
		this.jTableDatosInformacionFinanciera.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosInformacionFinanciera.setRowSelectionAllowed(true);
		this.jTableDatosInformacionFinanciera.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosInformacionFinanciera,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoInformacionFinanciera = new JButtonMe();
		this.jButtonDuplicarInformacionFinanciera = new JButtonMe();
		this.jButtonCopiarInformacionFinanciera = new JButtonMe();
		this.jButtonVerFormInformacionFinanciera = new JButtonMe();
		this.jButtonNuevoRelacionesInformacionFinanciera = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaInformacionFinanciera = new JButtonMe();
		this.jButtonCerrarInformacionFinanciera = new JButtonMe();
		
		this.jScrollPanelDatosInformacionFinanciera = new JScrollPane();   
        this.jScrollPanelDatosGeneralInformacionFinanciera = new JScrollPane();
		
				
		
		
		this.jPanelAccionesInformacionFinanciera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Informacion Financiera";
		
		if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Financieras" + this.sPath));
		} else {
			this.jScrollPanelDatosInformacionFinanciera.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesInformacionFinanciera.setToolTipText("Acciones");
        this.jPanelAccionesInformacionFinanciera.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoInformacionFinanciera=new ReporteDinamicoJInternalFrame(InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoInformacionFinanciera();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionInformacionFinanciera=new ImportacionJInternalFrame(InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionInformacionFinanciera();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByInformacionFinanciera = new JButtonMe();
		
		this.jButtonAbrirOrderByInformacionFinanciera.setText("Orden");
		this.jButtonAbrirOrderByInformacionFinanciera.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByInformacionFinanciera,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByInformacionFinanciera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByInformacionFinanciera=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformacionFinanciera,false,this);
			
			//this.cargarOrderByInformacionFinanciera(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByInformacionFinanciera=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformacionFinanciera,true,this);
			
			//this.cargarOrderByInformacionFinanciera(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosInformacionFinanciera.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosInformacionFinanciera.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosInformacionFinanciera.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosInformacionFinanciera.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosInformacionFinanciera.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosInformacionFinanciera.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoInformacionFinanciera.setText("Nuevo");
		this.jButtonDuplicarInformacionFinanciera.setText("Duplicar");
		this.jButtonCopiarInformacionFinanciera.setText("Copiar");
		this.jButtonVerFormInformacionFinanciera.setText("Ver");
		this.jButtonNuevoRelacionesInformacionFinanciera.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaInformacionFinanciera.setText("Guardar");
		this.jButtonCerrarInformacionFinanciera.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoInformacionFinanciera,"nuevo_button","Nuevo",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarInformacionFinanciera,"duplicar_button","Duplicar",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarInformacionFinanciera,"copiar_button","Copiar",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormInformacionFinanciera,"ver_form","Ver",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesInformacionFinanciera,"nuevorelaciones_button","Nuevo Rel",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaInformacionFinanciera,"guardarcambiostabla_button","Guardar",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarInformacionFinanciera,"cerrar_button","Salir",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoInformacionFinanciera.setToolTipText("Nuevo"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarInformacionFinanciera.setToolTipText("Duplicar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarInformacionFinanciera.setToolTipText("Copiar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormInformacionFinanciera.setToolTipText("Ver"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesInformacionFinanciera.setToolTipText("Nuevo Rel"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaInformacionFinanciera.setToolTipText("Guardar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarInformacionFinanciera.setToolTipText("Salir"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoInformacionFinanciera";
		inputMap = this.jButtonNuevoInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoInformacionFinanciera.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoInformacionFinanciera"));
		
		//DUPLICAR
		sMapKey = "DuplicarInformacionFinanciera";
		inputMap = this.jButtonDuplicarInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarInformacionFinanciera.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarInformacionFinanciera"));
		
		//COPIAR
		sMapKey = "CopiarInformacionFinanciera";
		inputMap = this.jButtonCopiarInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarInformacionFinanciera.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarInformacionFinanciera"));
		
		//VEr FORM
		sMapKey = "VerFormInformacionFinanciera";
		inputMap = this.jButtonVerFormInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormInformacionFinanciera.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormInformacionFinanciera"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesInformacionFinanciera";
		inputMap = this.jButtonNuevoRelacionesInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesInformacionFinanciera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesInformacionFinanciera"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarInformacionFinanciera";
		inputMap = this.jButtonModificarInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarInformacionFinanciera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarInformacionFinanciera"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarInformacionFinanciera";
		inputMap = this.jButtonCerrarInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarInformacionFinanciera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarInformacionFinanciera"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaInformacionFinanciera";
		inputMap = this.jButtonGuardarCambiosTablaInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaInformacionFinanciera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaInformacionFinanciera"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesInformacionFinanciera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesInformacionFinanciera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionInformacionFinanciera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1InformacionFinanciera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2InformacionFinanciera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3InformacionFinanciera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4InformacionFinanciera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5InformacionFinanciera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesInformacionFinanciera.setName("jPanelParametrosReportesInformacionFinanciera"); 
		
		this.jPanelParametrosReportesAccionesInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesInformacionFinanciera.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesInformacionFinanciera.setName("jPanelParametrosReportesAccionesInformacionFinanciera"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionInformacionFinanciera = new JButtonMe();
		this.jButtonRecargarInformacionInformacionFinanciera.setText("Recargar");
		this.jButtonRecargarInformacionInformacionFinanciera.setToolTipText("Recargar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionInformacionFinanciera,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionInformacionFinanciera = new JButtonMe();
		this.jButtonProcesarInformacionInformacionFinanciera.setText("Procesar");
		this.jButtonProcesarInformacionInformacionFinanciera.setToolTipText("Procesar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionInformacionFinanciera.setVisible(false);
			
		this.jButtonProcesarInformacionInformacionFinanciera.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionInformacionFinanciera.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionInformacionFinanciera.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesInformacionFinanciera = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesInformacionFinanciera.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesInformacionFinanciera.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesInformacionFinanciera = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesInformacionFinanciera.setText("TIPO");       
		this.jComboBoxTiposReportesInformacionFinanciera.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesInformacionFinanciera = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesInformacionFinanciera.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesInformacionFinanciera.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionInformacionFinanciera = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionInformacionFinanciera.setText("Paginacion");
		this.jComboBoxTiposPaginacionInformacionFinanciera.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesInformacionFinanciera = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesInformacionFinanciera.setText("Accion");
		this.jComboBoxTiposRelacionesInformacionFinanciera.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesInformacionFinanciera = new JComboBoxMe();
		//this.jComboBoxTiposAccionesInformacionFinanciera.setText("Accion");
		this.jComboBoxTiposAccionesInformacionFinanciera.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarInformacionFinanciera = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarInformacionFinanciera.setText("Accion");
		this.jComboBoxTiposSeleccionarInformacionFinanciera.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralInformacionFinanciera=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralInformacionFinanciera.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralInformacionFinanciera.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralInformacionFinanciera.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesInformacionFinanciera = new JLabelMe();
		
		this.jLabelAccionesInformacionFinanciera.setText("Acciones");		
		this.jLabelAccionesInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosInformacionFinanciera = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosInformacionFinanciera.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosInformacionFinanciera.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosInformacionFinanciera = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosInformacionFinanciera.setText("Seleccionados");
		this.jCheckBoxSeleccionadosInformacionFinanciera.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaInformacionFinanciera = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaInformacionFinanciera.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaInformacionFinanciera.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteInformacionFinanciera = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteInformacionFinanciera.setText("Graf.");
		this.jCheckBoxConGraficoReporteInformacionFinanciera.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresInformacionFinanciera = new JButtonMe();
		//this.jButtonAnterioresInformacionFinanciera.setText("<<");
        this.jButtonAnterioresInformacionFinanciera.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresInformacionFinanciera,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesInformacionFinanciera = new JButtonMe();
		//this.jButtonSiguientesInformacionFinanciera.setText(">>");
        this.jButtonSiguientesInformacionFinanciera.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesInformacionFinanciera,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosInformacionFinanciera = new JButtonMe();
		this.jButtonNuevoGuardarCambiosInformacionFinanciera.setText("Nue");
        this.jButtonNuevoGuardarCambiosInformacionFinanciera.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosInformacionFinanciera,"nuevoguardarcambios_button","Nue",this.informacionfinancieraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosInformacionFinanciera";
		inputMap = this.jButtonNuevoGuardarCambiosInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosInformacionFinanciera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosInformacionFinanciera"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionInformacionFinanciera";
		inputMap = this.jButtonRecargarInformacionInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionInformacionFinanciera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionInformacionFinanciera"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesInformacionFinanciera";
		inputMap = this.jButtonSiguientesInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesInformacionFinanciera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesInformacionFinanciera"));
		
		//ANTERIORES		
		sMapKey = "AnterioresInformacionFinanciera";
		inputMap = this.jButtonAnterioresInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresInformacionFinanciera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresInformacionFinanciera"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasInformacionFinanciera();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesInformacionFinanciera.setMinimumSize(new Dimension(this.getWidth(),InformacionFinancieraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(InformacionFinancieraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesInformacionFinanciera.setMaximumSize(new Dimension(this.getWidth(),InformacionFinancieraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(InformacionFinancieraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesInformacionFinanciera.setPreferredSize(new Dimension(this.getWidth(),InformacionFinancieraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(InformacionFinancieraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionInformacionFinanciera = new GridBagLayout();

			this.jPanelPaginacionInformacionFinanciera.setLayout(gridaBagLayoutPaginacionInformacionFinanciera);						
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy = 0;
			this.gridBagConstraintsInformacionFinanciera.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionInformacionFinanciera.add(this.jButtonAnterioresInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
					
						
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsInformacionFinanciera.gridy = 0;
			
			this.jPanelPaginacionInformacionFinanciera.add(this.jButtonNuevoGuardarCambiosInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
						
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsInformacionFinanciera.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsInformacionFinanciera.gridy = 0;
			this.jPanelPaginacionInformacionFinanciera.add(this.jButtonSiguientesInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy = 1;
			this.gridBagConstraintsInformacionFinanciera.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformacionFinanciera.add(this.jButtonNuevoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
						
			
			
			if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
				this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsInformacionFinanciera.gridy = 1;
				this.gridBagConstraintsInformacionFinanciera.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionInformacionFinanciera.add(this.jButtonGuardarCambiosTablaInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
			}
			
			
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy = 1;
			this.gridBagConstraintsInformacionFinanciera.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformacionFinanciera.add(this.jButtonDuplicarInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy = 1;
			this.gridBagConstraintsInformacionFinanciera.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformacionFinanciera.add(this.jButtonCopiarInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy = 1;
			this.gridBagConstraintsInformacionFinanciera.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionInformacionFinanciera.add(this.jButtonVerFormInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy = 1;
			this.gridBagConstraintsInformacionFinanciera.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionInformacionFinanciera.add(this.jButtonCerrarInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
		
		
		this.jButtonRecargarInformacionInformacionFinanciera.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionInformacionFinanciera.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionInformacionFinanciera.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesInformacionFinanciera.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesInformacionFinanciera.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesInformacionFinanciera.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesInformacionFinanciera.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesInformacionFinanciera.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesInformacionFinanciera.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesInformacionFinanciera.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesInformacionFinanciera.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesInformacionFinanciera.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionInformacionFinanciera.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionInformacionFinanciera.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionInformacionFinanciera.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesInformacionFinanciera.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesInformacionFinanciera.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesInformacionFinanciera.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesInformacionFinanciera.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformacionFinanciera.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesInformacionFinanciera.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarInformacionFinanciera.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarInformacionFinanciera.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarInformacionFinanciera.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaInformacionFinanciera.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaInformacionFinanciera.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaInformacionFinanciera.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteInformacionFinanciera.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteInformacionFinanciera.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteInformacionFinanciera.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosInformacionFinanciera.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosInformacionFinanciera.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosInformacionFinanciera.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosInformacionFinanciera.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosInformacionFinanciera.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosInformacionFinanciera.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesInformacionFinanciera = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesInformacionFinanciera = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1InformacionFinanciera = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2InformacionFinanciera = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3InformacionFinanciera = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4InformacionFinanciera = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesInformacionFinanciera.setLayout(gridaBagParametrosReportesInformacionFinanciera);
			this.jPanelParametrosReportesAccionesInformacionFinanciera.setLayout(gridaBagParametrosReportesAccionesInformacionFinanciera);
			
			
			this.jPanelParametrosAuxiliar1InformacionFinanciera.setLayout(gridaBagParametrosAuxiliar1InformacionFinanciera);
			this.jPanelParametrosAuxiliar2InformacionFinanciera.setLayout(gridaBagParametrosAuxiliar2InformacionFinanciera);
			this.jPanelParametrosAuxiliar3InformacionFinanciera.setLayout(gridaBagParametrosAuxiliar3InformacionFinanciera);
			this.jPanelParametrosAuxiliar4InformacionFinanciera.setLayout(gridaBagParametrosAuxiliar4InformacionFinanciera);
			//this.jPanelParametrosAuxiliar5InformacionFinanciera.setLayout(gridaBagParametrosAuxiliar2InformacionFinanciera);			
			
			
			
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInformacionFinanciera.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInformacionFinanciera.add(this.jButtonRecargarInformacionInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionFinanciera.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1InformacionFinanciera.add(this.jComboBoxTiposPaginacionInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionFinanciera.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1InformacionFinanciera.add(this.jCheckBoxConAltoMaximoTablaInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionFinanciera.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1InformacionFinanciera.add(this.jComboBoxTiposArchivosReportesInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionFinanciera.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformacionFinanciera.add(this.jPanelParametrosAuxiliar1InformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInformacionFinanciera.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4InformacionFinanciera.add(this.jComboBoxTiposReportesInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);																		
			
			
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInformacionFinanciera.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4InformacionFinanciera.add(this.jComboBoxTiposGraficosReportesInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionFinanciera.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformacionFinanciera.add(this.jPanelParametrosAuxiliar4InformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionFinanciera.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformacionFinanciera.add(this.jComboBoxTiposReportesInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionFinanciera.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInformacionFinanciera.add(this.jCheckBoxGenerarReporteInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionFinanciera.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformacionFinanciera.add(this.jPanelParametrosAuxiliar2InformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInformacionFinanciera.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInformacionFinanciera.add(this.jLabelAccionesInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
				this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsInformacionFinanciera.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesInformacionFinanciera.add(this.jButtonAbrirOrderByInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionFinanciera.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInformacionFinanciera.add(this.jComboBoxTiposSeleccionarInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);			
			
			
			/*
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInformacionFinanciera.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInformacionFinanciera.add(this.jCheckBoxSeleccionarTodosInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsInformacionFinanciera.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesInformacionFinanciera.add(this.jCheckBoxConGraficoReporteInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInformacionFinanciera.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3InformacionFinanciera.add(this.jCheckBoxSeleccionarTodosInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);															
				
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInformacionFinanciera.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3InformacionFinanciera.add(this.jCheckBoxSeleccionadosInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);															
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsInformacionFinanciera.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3InformacionFinanciera.add(this.jCheckBoxConGraficoReporteInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionFinanciera.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesInformacionFinanciera.add(this.jPanelParametrosAuxiliar3InformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionFinanciera.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInformacionFinanciera.add(this.jComboBoxTiposAccionesInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
	
				
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsInformacionFinanciera.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesInformacionFinanciera.add(this.jTextFieldValorCampoGeneralInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosInformacionFinanciera = new GridBagLayout();

			this.jScrollPanelDatosInformacionFinanciera.setLayout(gridaBagLayoutDatosInformacionFinanciera);
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy = 0;
			this.gridBagConstraintsInformacionFinanciera.gridx = 0;
			
			this.jScrollPanelDatosInformacionFinanciera.add(this.jTableDatosInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosInformacionFinanciera.setViewportView(this.jTableDatosInformacionFinanciera);
		this.jTableDatosInformacionFinanciera.setFillsViewportHeight(true);
		this.jTableDatosInformacionFinanciera.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesInformacionFinanciera= new GridBagLayout();
		this.jPanelAccionesInformacionFinanciera.setLayout(gridaBagLayoutAccionesInformacionFinanciera);
		
		
		/*	
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = 0;
		this.gridBagConstraintsInformacionFinanciera.gridx = 0;
			
		this.jPanelAccionesInformacionFinanciera.add(this.jButtonNuevoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteInformacionFinanciera= new GridBagLayout();
		gridaBagLayoutFK_IdClienteInformacionFinanciera.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteInformacionFinanciera.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteInformacionFinanciera.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteInformacionFinanciera.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteInformacionFinanciera.setLayout(gridaBagLayoutFK_IdClienteInformacionFinanciera);

		gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionFinanciera.gridy = 0;
		gridBagConstraintsInformacionFinanciera.gridx = 0;
		jPanelFK_IdClienteInformacionFinanciera.add(jLabelidclienteFK_IdClienteInformacionFinanciera, gridBagConstraintsInformacionFinanciera);

		gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionFinanciera.gridy = 0;
		gridBagConstraintsInformacionFinanciera.gridx = 1;
		jPanelFK_IdClienteInformacionFinanciera.add(jComboBoxidclienteFK_IdClienteInformacionFinanciera, gridBagConstraintsInformacionFinanciera);


		gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.EAST;
		gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.NONE;
		gridBagConstraintsInformacionFinanciera.gridy = 0;
		gridBagConstraintsInformacionFinanciera.gridx = 0;
		jPanelFK_IdClienteInformacionFinanciera.add(this.jButtonBuscarFK_IdClienteidclienteInformacionFinanciera, gridBagConstraintsInformacionFinanciera);

		gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionFinanciera.gridy = 1;
		gridBagConstraintsInformacionFinanciera.gridx =1;
		jPanelFK_IdClienteInformacionFinanciera.add(jButtonFK_IdClienteInformacionFinanciera, gridBagConstraintsInformacionFinanciera);

		jTabbedPaneBusquedasInformacionFinanciera.addTab("1.-Por Cliente ", jPanelFK_IdClienteInformacionFinanciera);
		jTabbedPaneBusquedasInformacionFinanciera.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdValorClienteMovimientoInformacionFinanciera= new GridBagLayout();
		gridaBagLayoutFK_IdValorClienteMovimientoInformacionFinanciera.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdValorClienteMovimientoInformacionFinanciera.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdValorClienteMovimientoInformacionFinanciera.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdValorClienteMovimientoInformacionFinanciera.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdValorClienteMovimientoInformacionFinanciera.setLayout(gridaBagLayoutFK_IdValorClienteMovimientoInformacionFinanciera);

		gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionFinanciera.gridy = 0;
		gridBagConstraintsInformacionFinanciera.gridx = 0;
		jPanelFK_IdValorClienteMovimientoInformacionFinanciera.add(jLabelidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera, gridBagConstraintsInformacionFinanciera);

		gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionFinanciera.gridy = 0;
		gridBagConstraintsInformacionFinanciera.gridx = 1;
		jPanelFK_IdValorClienteMovimientoInformacionFinanciera.add(jComboBoxidvalorclientemovimientoFK_IdValorClienteMovimientoInformacionFinanciera, gridBagConstraintsInformacionFinanciera);

		gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.WEST;
		gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsInformacionFinanciera.gridy = 1;
		gridBagConstraintsInformacionFinanciera.gridx =1;
		jPanelFK_IdValorClienteMovimientoInformacionFinanciera.add(jButtonFK_IdValorClienteMovimientoInformacionFinanciera, gridBagConstraintsInformacionFinanciera);

		jTabbedPaneBusquedasInformacionFinanciera.addTab("2.-Por Tipo Movi Finan ", jPanelFK_IdValorClienteMovimientoInformacionFinanciera);
		jTabbedPaneBusquedasInformacionFinanciera.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutInformacionFinanciera = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutInformacionFinanciera);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();						
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyPrincipal++;
			this.gridBagConstraintsInformacionFinanciera.gridx = 0;		
			//this.gridBagConstraintsInformacionFinanciera.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsInformacionFinanciera.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy = iGridyPrincipal++;
		this.gridBagConstraintsInformacionFinanciera.gridx = 0;		
		//this.gridBagConstraintsInformacionFinanciera.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsInformacionFinanciera.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsInformacionFinanciera);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsInformacionFinanciera.gridy = iGridyPrincipal++;
			this.gridBagConstraintsInformacionFinanciera.gridx = 0;		
			this.gridBagConstraintsInformacionFinanciera.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsInformacionFinanciera.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionFinanciera.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);								
		
		
		/*
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionFinanciera.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		*/		
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy =iGridyPrincipal++;
		this.gridBagConstraintsInformacionFinanciera.gridx =0;
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsInformacionFinanciera.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
				
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionFinanciera.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(InformacionFinancieraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosInformacionFinanciera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosInformacionFinanciera = new GridBagLayout();
			this.jPanelBusquedasParametrosInformacionFinanciera.setLayout(gridaBagLayoutBusquedasParametrosInformacionFinanciera);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralInformacionFinanciera=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralInformacionFinanciera.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformacionFinanciera.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralInformacionFinanciera.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionFinanciera.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
			
			
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsInformacionFinanciera.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
			
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsInformacionFinanciera.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralInformacionFinanciera;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoInformacionFinanciera() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoInformacionFinanciera = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoInformacionFinanciera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoInformacionFinanciera.setName("jPanelReporteDinamicoInformacionFinanciera"); 
		
		this.jPanelReporteDinamicoInformacionFinanciera.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoInformacionFinanciera.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoInformacionFinanciera.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoInformacionFinanciera.setLayout(gridaBagLayoutReporteDinamicoInformacionFinanciera);
		
		
		this.jInternalFrameReporteDinamicoInformacionFinanciera= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoInformacionFinanciera = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteInformacionFinanciera= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoInformacionFinanciera.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoInformacionFinanciera.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoInformacionFinanciera.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoInformacionFinanciera.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoInformacionFinanciera.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoInformacionFinanciera.setResizable(true);
	    this.jInternalFrameReporteDinamicoInformacionFinanciera.setClosable(true);
	    this.jInternalFrameReporteDinamicoInformacionFinanciera.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoInformacionFinanciera.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoInformacionFinanciera.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoInformacionFinanciera.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Financieras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteInformacionFinanciera = new JLabelMe();

		this.jLabelColumnasSelectReporteInformacionFinanciera.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jLabelColumnasSelectReporteInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteInformacionFinanciera = new JList<Reporte>();
		this.jListColumnasSelectReporteInformacionFinanciera.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteInformacionFinanciera.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteInformacionFinanciera.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteInformacionFinanciera.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteInformacionFinanciera.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteInformacionFinanciera=new JScrollPane(this.jListColumnasSelectReporteInformacionFinanciera);
			
			this.jScrollColumnasSelectReporteInformacionFinanciera.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteInformacionFinanciera.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteInformacionFinanciera.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoInformacionFinanciera.add(this.jListColumnasSelectReporteInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jScrollColumnasSelectReporteInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteInformacionFinanciera = new JLabelMe();

		this.jLabelRelacionesSelectReporteInformacionFinanciera.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteInformacionFinanciera = new JList<Reporte>();
		this.jListRelacionesSelectReporteInformacionFinanciera.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteInformacionFinanciera.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteInformacionFinanciera.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteInformacionFinanciera.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteInformacionFinanciera.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteInformacionFinanciera=new JScrollPane(this.jListRelacionesSelectReporteInformacionFinanciera);
			
			this.jScrollRelacionesSelectReporteInformacionFinanciera.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteInformacionFinanciera.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteInformacionFinanciera.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoInformacionFinanciera = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoInformacionFinanciera = new JComboBoxMe();
		this.jListColumnasValoresGraficoInformacionFinanciera = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoInformacionFinanciera = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoInformacionFinanciera.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoInformacionFinanciera.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoInformacionFinanciera.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoInformacionFinanciera.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoInformacionFinanciera = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoInformacionFinanciera.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoInformacionFinanciera.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoInformacionFinanciera.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoInformacionFinanciera.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoInformacionFinanciera = new JLabelMe();

		this.jLabelConGraficoDinamicoInformacionFinanciera.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jLabelConGraficoDinamicoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoInformacionFinanciera = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoInformacionFinanciera.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoInformacionFinanciera.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoInformacionFinanciera.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoInformacionFinanciera.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoInformacionFinanciera.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jCheckBoxConGraficoDinamicoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoInformacionFinanciera = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoInformacionFinanciera.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jLabelColumnaCategoriaGraficoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoInformacionFinanciera = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoInformacionFinanciera.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoInformacionFinanciera.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoInformacionFinanciera.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoInformacionFinanciera.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoInformacionFinanciera.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jComboBoxColumnaCategoriaGraficoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorInformacionFinanciera = new JLabelMe();

		this.jLabelColumnaCategoriaValorInformacionFinanciera.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jLabelColumnaCategoriaValorInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorInformacionFinanciera = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorInformacionFinanciera.setText("Accion");
        this.jComboBoxColumnaCategoriaValorInformacionFinanciera.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorInformacionFinanciera.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorInformacionFinanciera.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorInformacionFinanciera.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jComboBoxColumnaCategoriaValorInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoInformacionFinanciera = new JLabelMe();

		this.jLabelColumnasValoresGraficoInformacionFinanciera.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jLabelColumnasValoresGraficoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoInformacionFinanciera = new JList<Reporte>();
		this.jListColumnasValoresGraficoInformacionFinanciera.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoInformacionFinanciera.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoInformacionFinanciera.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoInformacionFinanciera.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoInformacionFinanciera.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoInformacionFinanciera=new JScrollPane(this.jListColumnasValoresGraficoInformacionFinanciera);
			
			this.jScrollColumnasValoresGraficoInformacionFinanciera.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoInformacionFinanciera.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoInformacionFinanciera.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoInformacionFinanciera.add(this.jListColumnasSelectReporteInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jScrollColumnasValoresGraficoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoInformacionFinanciera = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoInformacionFinanciera.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jLabelTiposGraficosReportesDinamicoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoInformacionFinanciera = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoInformacionFinanciera.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoInformacionFinanciera.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoInformacionFinanciera.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoInformacionFinanciera.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoInformacionFinanciera.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jComboBoxTiposGraficosReportesDinamicoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoInformacionFinanciera = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoInformacionFinanciera.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jLabelGenerarExcelReporteDinamicoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoInformacionFinanciera = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoInformacionFinanciera.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoInformacionFinanciera,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoInformacionFinanciera.setToolTipText("Generar EXCEL"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		//this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoInformacionFinanciera.add(this.jButtonGenerarExcelReporteDinamicoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jComboBoxTiposReportesDinamicoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoInformacionFinanciera = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoInformacionFinanciera.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jLabelTiposArchivoReporteDinamicoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jComboBoxTiposArchivosReportesDinamicoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoInformacionFinanciera = new JButtonMe();
		this.jButtonGenerarReporteDinamicoInformacionFinanciera.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoInformacionFinanciera,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoInformacionFinanciera.setToolTipText("Generar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jButtonGenerarReporteDinamicoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoInformacionFinanciera = new JButtonMe();
		this.jButtonCerrarReporteDinamicoInformacionFinanciera.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoInformacionFinanciera,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoInformacionFinanciera.setToolTipText("Cancelar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoInformacionFinanciera.add(this.jButtonCerrarReporteDinamicoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalInformacionFinanciera = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoInformacionFinanciera= new JScrollPane(jPanelReporteDinamicoInformacionFinanciera,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoInformacionFinanciera.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoInformacionFinanciera.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoInformacionFinanciera.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Financieras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsInformacionFinanciera.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoInformacionFinanciera.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoInformacionFinanciera.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalInformacionFinanciera);
		this.jInternalFrameReporteDinamicoInformacionFinanciera.getContentPane().add(this.jScrollPanelReporteDinamicoInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionInformacionFinanciera() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionInformacionFinanciera = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionInformacionFinanciera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionInformacionFinanciera.setName("jPanelImportacionInformacionFinanciera"); 
		
		this.jPanelImportacionInformacionFinanciera.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionInformacionFinanciera.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionInformacionFinanciera.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionInformacionFinanciera.setLayout(gridaBagLayoutImportacionInformacionFinanciera);
		
		
		this.jInternalFrameImportacionInformacionFinanciera= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionInformacionFinanciera= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionInformacionFinanciera = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteInformacionFinanciera= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionInformacionFinanciera.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionInformacionFinanciera.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionInformacionFinanciera.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionInformacionFinanciera.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionInformacionFinanciera.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionInformacionFinanciera.setResizable(true);
	    this.jInternalFrameImportacionInformacionFinanciera.setClosable(true);
	    this.jInternalFrameImportacionInformacionFinanciera.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionInformacionFinanciera.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionInformacionFinanciera.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionInformacionFinanciera.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionInformacionFinanciera.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionInformacionFinanciera.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionInformacionFinanciera.setResizable(true);
	    this.jInternalFrameImportacionInformacionFinanciera.setClosable(true);
	    this.jInternalFrameImportacionInformacionFinanciera.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionInformacionFinanciera.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionInformacionFinanciera.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionInformacionFinanciera.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Financieras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionInformacionFinanciera = new JLabelMe();

		this.jLabelArchivoImportacionInformacionFinanciera.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYImportacion;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXImportacion++;
			
		this.jPanelImportacionInformacionFinanciera.add(this.jLabelArchivoImportacionInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionInformacionFinanciera = new JFileChooser();		
		this.jFileChooserImportacionInformacionFinanciera.setToolTipText("ESCOGER ARCHIVO"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionInformacionFinanciera = new JButtonMe();
		this.jButtonAbrirImportacionInformacionFinanciera.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionInformacionFinanciera,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionInformacionFinanciera.setToolTipText("Generar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYImportacion;
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformacionFinanciera.add(this.jButtonAbrirImportacionInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionInformacionFinanciera = new JLabelMe();

		this.jLabelPathArchivoImportacionInformacionFinanciera.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionInformacionFinanciera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionInformacionFinanciera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionInformacionFinanciera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYImportacion;		
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXImportacion++;
			
		this.jPanelImportacionInformacionFinanciera.add(this.jLabelPathArchivoImportacionInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionInformacionFinanciera=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionInformacionFinanciera.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionInformacionFinanciera.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionInformacionFinanciera.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYImportacion;
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformacionFinanciera.add(this.jTextFieldPathArchivoImportacionInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionInformacionFinanciera = new JButtonMe();
		this.jButtonGenerarImportacionInformacionFinanciera.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionInformacionFinanciera,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionInformacionFinanciera.setToolTipText("Generar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYImportacion;
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformacionFinanciera.add(this.jButtonGenerarImportacionInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionInformacionFinanciera = new JButtonMe();
		this.jButtonCerrarImportacionInformacionFinanciera.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionInformacionFinanciera,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionInformacionFinanciera.setToolTipText("Cancelar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsInformacionFinanciera.gridy = iPosYImportacion;
		this.gridBagConstraintsInformacionFinanciera.gridx = iPosXImportacion++;
							
		this.jPanelImportacionInformacionFinanciera.add(this.jButtonCerrarImportacionInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalInformacionFinanciera = new GridBagLayout();
		
		this.jScrollPanelImportacionInformacionFinanciera= new JScrollPane(jPanelImportacionInformacionFinanciera,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
		this.gridBagConstraintsInformacionFinanciera.gridy =iPosYImportacion;
		this.gridBagConstraintsInformacionFinanciera.gridx =iPosXImportacion;
		this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionInformacionFinanciera.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionInformacionFinanciera.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalInformacionFinanciera);
		this.jInternalFrameImportacionInformacionFinanciera.getContentPane().add(this.jScrollPanelImportacionInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByInformacionFinanciera(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByInformacionFinanciera = new JButtonMe();
			this.jButtonAbrirOrderByInformacionFinanciera.setText("Orden");
			this.jButtonAbrirOrderByInformacionFinanciera.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByInformacionFinanciera,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByInformacionFinanciera";
			inputMap = this.jButtonAbrirOrderByInformacionFinanciera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByInformacionFinanciera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByInformacionFinanciera"));
		
		
			GridBagLayout gridaBagLayoutOrderByInformacionFinanciera = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByInformacionFinanciera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByInformacionFinanciera.setName("jPanelOrderByInformacionFinanciera"); 
			
			this.jPanelOrderByInformacionFinanciera.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByInformacionFinanciera.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByInformacionFinanciera.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByInformacionFinanciera.setLayout(gridaBagLayoutOrderByInformacionFinanciera);
			
			
			this.jTableDatosInformacionFinancieraOrderBy = new JTableMe();        
			this.jTableDatosInformacionFinancieraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosInformacionFinancieraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosInformacionFinancieraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosInformacionFinancieraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosInformacionFinancieraOrderBy.setViewportView(this.jTableDatosInformacionFinancieraOrderBy);
			this.jTableDatosInformacionFinancieraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosInformacionFinancieraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByInformacionFinanciera= new OrderByJInternalFrame();
			this.jInternalFrameOrderByInformacionFinanciera= new OrderByJInternalFrame();
			this.jScrollPanelOrderByInformacionFinanciera = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteInformacionFinanciera= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByInformacionFinanciera.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByInformacionFinanciera.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByInformacionFinanciera.setTitle("Orden");
			this.jInternalFrameOrderByInformacionFinanciera.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByInformacionFinanciera.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByInformacionFinanciera.setResizable(true);
			this.jInternalFrameOrderByInformacionFinanciera.setClosable(true);
			this.jInternalFrameOrderByInformacionFinanciera.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByInformacionFinanciera.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByInformacionFinanciera.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByInformacionFinanciera.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByInformacionFinanciera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Informacion Financieras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.gridy =iPosYOrderBy++;
			this.gridBagConstraintsInformacionFinanciera.gridx =iPosXOrderBy;
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsInformacionFinanciera.ipady =150;
				
			this.jPanelOrderByInformacionFinanciera.add(jScrollPanelDatosInformacionFinancieraOrderBy, this.gridBagConstraintsInformacionFinanciera);//this.jTableDatosInformacionFinancieraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByInformacionFinanciera = new JButtonMe();
			this.jButtonCerrarOrderByInformacionFinanciera.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByInformacionFinanciera,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByInformacionFinanciera.setToolTipText("Cancelar"+" "+InformacionFinancieraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByInformacionFinanciera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsInformacionFinanciera.gridy = iPosYOrderBy++;
			this.gridBagConstraintsInformacionFinanciera.gridx = iPosXOrderBy;
									
			this.jPanelOrderByInformacionFinanciera.add(this.jButtonCerrarOrderByInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalInformacionFinanciera = new GridBagLayout();
			
			this.jScrollPanelOrderByInformacionFinanciera= new JScrollPane(jPanelOrderByInformacionFinanciera,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsInformacionFinanciera = new GridBagConstraints();
			this.gridBagConstraintsInformacionFinanciera.gridy =iPosYOrderBy;
			this.gridBagConstraintsInformacionFinanciera.gridx =iPosXOrderBy;
			this.gridBagConstraintsInformacionFinanciera.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByInformacionFinanciera.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByInformacionFinanciera.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalInformacionFinanciera);
			
			this.jInternalFrameOrderByInformacionFinanciera.getContentPane().add(this.jScrollPanelOrderByInformacionFinanciera, this.gridBagConstraintsInformacionFinanciera);			
		
		} else {
			this.jButtonAbrirOrderByInformacionFinanciera = new JButtonMe();
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
			&& this.informacionfinancieraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosInformacionFinanciera.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosInformacionFinanciera.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosInformacionFinanciera.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosInformacionFinanciera.getRowHeight();//InformacionFinancieraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > InformacionFinancieraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaInformacionFinanciera.isSelected()) {
					iHeightTable=InformacionFinancieraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < InformacionFinancieraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=InformacionFinancieraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > InformacionFinancieraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaInformacionFinanciera.isSelected()) {
					iHeightTable=InformacionFinancieraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < InformacionFinancieraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=InformacionFinancieraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosInformacionFinanciera.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosInformacionFinanciera.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosInformacionFinanciera.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosInformacionFinanciera.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosInformacionFinanciera.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosInformacionFinanciera.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByInformacionFinanciera!=null && this.jInternalFrameOrderByInformacionFinanciera.getjTableDatosOrderBy()!=null) {
			//if(!this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByInformacionFinanciera.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByInformacionFinanciera.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByInformacionFinanciera.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByInformacionFinanciera.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByInformacionFinanciera.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByInformacionFinanciera.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByInformacionFinanciera.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosInformacionFinanciera.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosInformacionFinanciera.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosInformacionFinanciera.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=informacionfinancieraLogic.getInformacionFinancieras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=informacionfinancieras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<InformacionFinanciera> TraerInformacionFinancieraBeans(List<InformacionFinanciera> informacionfinancieras,ArrayList<Classe> classes)throws Exception {
		try {
			for(InformacionFinanciera informacionfinanciera:informacionfinancieras) {
					
				if(!(InformacionFinancieraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || InformacionFinancieraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					informacionfinanciera.setsDetalleGeneralEntityReporte(InformacionFinancieraConstantesFunciones.getInformacionFinancieraDescripcion(informacionfinanciera));
										
					informacionfinanciera.setesactivo_descripcion(InformacionFinancieraConstantesFunciones.getesactivoDescripcion(informacionfinanciera));	
					
						
					
				} else  {
							
					//informacionfinanciera.setsDetalleGeneralEntityReporte(informacionfinanciera.getsDetalleGeneralEntityReporte());
										
				}
				
				//informacionfinancierabeans.add(informacionfinancierabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return informacionfinancieras;
    }
	//PARA REPORTES FIN
}
