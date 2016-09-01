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



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.cartera.util.AccionistaConstantesFunciones;

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
public class AccionistaJInternalFrame extends AccionistaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAccionista;
	
	protected JMenuBar jmenuBarAccionista;
	
	protected JMenu jmenuAccionista;
	protected JMenu jmenuDatosAccionista;
	protected JMenu jmenuArchivoAccionista;
	protected JMenu jmenuAccionesAccionista;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAccionista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAccionista;	
	protected GridBagConstraints gridBagConstraintsAccionista;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AccionistaDetalleFormJInternalFrame jInternalFrameDetalleFormAccionista;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAccionista;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAccionista;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoInversionBeanSwingJInternalFrame tipoinversionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoinversion="";

	protected TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoidentificacion="";
	
	public AccionistaSessionBean accionistaSessionBean;
		
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoInversionSessionBean tipoinversionSessionBean;
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Accionista> accionistas;		
	public List<Accionista> accionistasEliminados;	
	public List<Accionista> accionistasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAccionista;		
	protected JButton jButtonAbrirOrderByAccionista;
	
	
	//protected JPanel jPanelOrderByAccionista;
	//public JScrollPane jScrollPanelOrderByAccionista;	
	//protected JButton jButtonCerrarOrderByAccionista;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AccionistaLogic accionistaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAccionista;
	public JScrollPane jScrollPanelDatosEdicionAccionista;
	public JScrollPane jScrollPanelDatosGeneralAccionista;
    
	
	
	//public JScrollPane jScrollPanelDatosAccionistaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAccionista;
	//public JScrollPane jScrollPanelImportacionAccionista;
	
	
	
	protected JPanel jPanelAccionesAccionista;
	
    protected JPanel jPanelPaginacionAccionista;
    protected JPanel jPanelParametrosReportesAccionista;
	protected JPanel jPanelParametrosReportesAccionesAccionista;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Accionista;
	protected JPanel jPanelParametrosAuxiliar2Accionista;
	protected JPanel jPanelParametrosAuxiliar3Accionista;
	protected JPanel jPanelParametrosAuxiliar4Accionista;
	//protected JPanel jPanelParametrosAuxiliar5Accionista;
	
	
	
	//protected JPanel jPanelReporteDinamicoAccionista;
	//protected JPanel jPanelImportacionAccionista;
	
	
	public JTable jTableDatosAccionista;
	
	
	
	//public JTable jTableDatosAccionistaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAccionista;
	protected JButton jButtonDuplicarAccionista;
	protected JButton jButtonCopiarAccionista;
	protected JButton jButtonVerFormAccionista;
	protected JButton jButtonNuevoRelacionesAccionista;
	protected JButton jButtonModificarAccionista;
	
    protected JButton jButtonGuardarCambiosTablaAccionista;
	protected JButton jButtonCerrarAccionista;
	
	
	protected JButton jButtonRecargarInformacionAccionista;
	protected JButton jButtonProcesarInformacionAccionista;
	
	
	protected JButton jButtonAnterioresAccionista;
	protected JButton jButtonSiguientesAccionista;
	protected JButton jButtonNuevoGuardarCambiosAccionista;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAccionista;
	//protected JButton jButtonCerrarReporteDinamicoAccionista;
	//protected JButton jButtonGenerarExcelReporteDinamicoAccionista;	
	
	
	
	//protected JButton jButtonAbrirImportacionAccionista;
	//protected JButton jButtonGenerarImportacionAccionista;
	//protected JButton jButtonCerrarImportacionAccionista;
	//protected JFileChooser jFileChooserImportacionAccionista;
	//protected File fileImportacionAccionista;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAccionista;
	protected JButton jButtonDuplicarToolBarAccionista;
	protected JButton jButtonNuevoRelacionesToolBarAccionista;
	
	
	public JButton jButtonGuardarCambiosToolBarAccionista;
	protected JButton jButtonCopiarToolBarAccionista;
	protected JButton jButtonVerFormToolBarAccionista;
	public JButton jButtonGuardarCambiosTablaToolBarAccionista;
	protected JButton jButtonMostrarOcultarTablaToolBarAccionista;
	protected JButton jButtonCerrarToolBarAccionista;
	
	protected JButton jButtonRecargarInformacionToolBarAccionista;
	protected JButton jButtonProcesarInformacionToolBarAccionista;
	protected JButton jButtonAnterioresToolBarAccionista;
	protected JButton jButtonSiguientesToolBarAccionista;
	protected JButton jButtonNuevoGuardarCambiosToolBarAccionista;
	protected JButton jButtonAbrirOrderByToolBarAccionista;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAccionista;
	protected JMenuItem jMenuItemDuplicarAccionista;
	protected JMenuItem jMenuItemNuevoRelacionesAccionista;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAccionista;
	protected JMenuItem jMenuItemCopiarAccionista;
	protected JMenuItem jMenuItemVerFormAccionista;
	protected JMenuItem jMenuItemGuardarCambiosTablaAccionista;
	protected JMenuItem jMenuItemCerrarAccionista;
	protected JMenuItem jMenuItemDetalleCerrarAccionista;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAccionista;
	protected JMenuItem jMenuItemDetalleMostarOcultarAccionista;
	
	protected JMenuItem jMenuItemRecargarInformacionAccionista;
	protected JMenuItem jMenuItemProcesarInformacionAccionista;
	protected JMenuItem jMenuItemAnterioresAccionista;
	protected JMenuItem jMenuItemSiguientesAccionista;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAccionista;
	protected JMenuItem jMenuItemAbrirOrderByAccionista;
	protected JMenuItem jMenuItemMostrarOcultarAccionista;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAccionista;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAccionista;
	protected JCheckBox jCheckBoxSeleccionadosAccionista;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAccionista;
	protected JCheckBox jCheckBoxConGraficoReporteAccionista;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAccionista;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAccionista;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAccionista;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAccionista;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAccionista;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAccionista;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAccionista;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAccionista;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAccionista;
	protected JTextField jTextFieldValorCampoGeneralAccionista;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAccionista;
	//public JList<Reporte> jListColumnasSelectReporteAccionista;
	//public JScrollPane jScrollColumnasSelectReporteAccionista;
	
	//public JLabel jLabelRelacionesSelectReporteAccionista;
	//public JList<Reporte> jListRelacionesSelectReporteAccionista;
	//public JScrollPane jScrollRelacionesSelectReporteAccionista;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAccionista;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAccionista;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAccionista;
	//public JLabel jLabelTiposArchivoReporteDinamicoAccionista;
	
		
	//public JLabel jLabelArchivoImportacionAccionista;	
	//public JLabel jLabelPathArchivoImportacionAccionista;
	//protected JTextField jTextFieldPathArchivoImportacionAccionista;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAccionista;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAccionista;
	
	//public JLabel jLabelColumnaCategoriaValorAccionista;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAccionista;
	
	//public JLabel jLabelColumnasValoresGraficoAccionista;
	//public JList<Reporte> jListColumnasValoresGraficoAccionista;
	//public JScrollPane jScrollColumnasValoresGraficoAccionista;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAccionista;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAccionista;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAccionista;
	public JPanel jPanelBusquedaPorIdClientePorNombreCortoAccionista;
	public JButton jButtonBusquedaPorIdClientePorNombreCortoAccionista;
	public JPanel jPanelFK_IdClienteAccionista;
	public JButton jButtonFK_IdClienteAccionista;
	public JPanel jPanelFK_IdValorClienteInversionAccionista;
	public JButton jButtonFK_IdValorClienteInversionAccionista;
	public JPanel jPanelFK_IdValorIdentificacionAccionista;
	public JButton jButtonFK_IdValorIdentificacionAccionista;
	
	public JPanel jPanelidclienteBusquedaPorIdClientePorNombreCortoAccionista;
	public JLabel jLabelidclienteBusquedaPorIdClientePorNombreCortoAccionista;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista;
	public JButton jButtonidclienteBusquedaPorIdClientePorNombreCortoAccionista= new JButtonMe();
	public JButton jButtonidclienteBusquedaPorIdClientePorNombreCortoAccionistaUpdate= new JButtonMe();
	public JButton jButtonidclienteBusquedaPorIdClientePorNombreCortoAccionistaBusqueda= new JButtonMe();

	public JButton jButtonBuscarBusquedaPorIdClientePorNombreCortoidclienteAccionista;
	
	public JPanel jPanelnombrecortoBusquedaPorIdClientePorNombreCortoAccionista;
	public JLabel jLabelnombrecortoBusquedaPorIdClientePorNombreCortoAccionista;
	public JTextArea jTextAreanombrecortoBusquedaPorIdClientePorNombreCortoAccionista;
	public JButton jButtonnombrecortoBusquedaPorIdClientePorNombreCortoAccionistaBusqueda= new JButtonMe();

	
	public JPanel jPanelidclienteFK_IdClienteAccionista;
	public JLabel jLabelidclienteFK_IdClienteAccionista;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteFK_IdClienteAccionista;
	public JButton jButtonidclienteFK_IdClienteAccionista= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteAccionistaUpdate= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteAccionistaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteidclienteAccionista;
	
	public JPanel jPanelidvalorclienteinversionFK_IdValorClienteInversionAccionista;
	public JLabel jLabelidvalorclienteinversionFK_IdValorClienteInversionAccionista;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista;
	public JButton jButtonidvalorclienteinversionFK_IdValorClienteInversionAccionista= new JButtonMe();
	public JButton jButtonidvalorclienteinversionFK_IdValorClienteInversionAccionistaUpdate= new JButtonMe();
	public JButton jButtonidvalorclienteinversionFK_IdValorClienteInversionAccionistaBusqueda= new JButtonMe();

	
	public JPanel jPanelidvaloridentificacionFK_IdValorIdentificacionAccionista;
	public JLabel jLabelidvaloridentificacionFK_IdValorIdentificacionAccionista;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista;
	public JButton jButtonidvaloridentificacionFK_IdValorIdentificacionAccionista= new JButtonMe();
	public JButton jButtonidvaloridentificacionFK_IdValorIdentificacionAccionistaUpdate= new JButtonMe();
	public JButton jButtonidvaloridentificacionFK_IdValorIdentificacionAccionistaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1166;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AccionistaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Accionista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AccionistaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Accionista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AccionistaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Accionista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AccionistaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Accionista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAccionista)	{
		this.jButtonRecargarInformacionAccionista = jButtonRecargarInformacionAccionista;
	}
	
	public JButton getjButtonProcesarInformacionAccionista() {
		return this.jButtonProcesarInformacionAccionista;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAccionista)	{
		this.jButtonProcesarInformacionAccionista = jButtonProcesarInformacionAccionista;
	}
	
	
	public JButton getjButtonRecargarInformacionAccionista() {
		return this.jButtonRecargarInformacionAccionista;
	}
	
	
	public List<Accionista> getaccionistas() {
		return this.accionistas;
	}

	public void setaccionistas(List<Accionista> accionistas) {
		this.accionistas = accionistas;
	}
	
	public List<Accionista> getaccionistasAux() {
		return this.accionistasAux;
	}

	public void setaccionistasAux(List<Accionista> accionistasAux) {
		this.accionistasAux = accionistasAux;
	}
	
	public List<Accionista> getaccionistasEliminados() {
		return this.accionistasEliminados;
	}

	public void setAccionistasEliminados(List<Accionista> accionistasEliminados) {
		this.accionistasEliminados = accionistasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAccionista() {
		return jComboBoxTiposSeleccionarAccionista;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAccionista(
			JComboBox jComboBoxTiposSeleccionarAccionista) {
		this.jComboBoxTiposSeleccionarAccionista = jComboBoxTiposSeleccionarAccionista;
	}
	
	public void setBorderResaltarTiposSeleccionarAccionista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAccionista.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAccionista .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAccionista() {
		return jTextFieldValorCampoGeneralAccionista;
	}

	public void setjTextFieldValorCampoGeneralAccionista(
			JTextField jTextFieldValorCampoGeneralAccionista) {
		this.jTextFieldValorCampoGeneralAccionista = jTextFieldValorCampoGeneralAccionista;
	}

	public void setBorderResaltarValorCampoGeneralAccionista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccionista.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAccionista .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAccionista() {
		return this.jCheckBoxSeleccionarTodosAccionista;
	}

	public void setjCheckBoxSeleccionarTodosAccionista(
			JCheckBox jCheckBoxSeleccionarTodosAccionista) {
		this.jCheckBoxSeleccionarTodosAccionista = jCheckBoxSeleccionarTodosAccionista;
	}

	public void setBorderResaltarSeleccionarTodosAccionista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccionista.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAccionista .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAccionista() {
		return this.jCheckBoxSeleccionadosAccionista;
	}

	public void setjCheckBoxSeleccionadosAccionista(
			JCheckBox jCheckBoxSeleccionadosAccionista) {
		this.jCheckBoxSeleccionadosAccionista = jCheckBoxSeleccionadosAccionista;
	}
	
	public void setBorderResaltarSeleccionadosAccionista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccionista.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAccionista .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAccionista() {
		return this.jComboBoxTiposArchivosReportesAccionista;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAccionista(
			JComboBox jComboBoxTiposArchivosReportesAccionista) {
		this.jComboBoxTiposArchivosReportesAccionista = jComboBoxTiposArchivosReportesAccionista;
	}

	public void setBorderResaltarTiposArchivosReportesAccionista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccionista.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAccionista .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAccionista() {
		return this.jComboBoxTiposReportesAccionista;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAccionista(
			JComboBox jComboBoxTiposReportesAccionista) {
		this.jComboBoxTiposReportesAccionista = jComboBoxTiposReportesAccionista;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAccionista() {
	//	return jComboBoxTiposReportesDinamicoAccionista;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAccionista(
	//		JComboBox jComboBoxTiposReportesDinamicoAccionista) {
	//	this.jComboBoxTiposReportesDinamicoAccionista = jComboBoxTiposReportesDinamicoAccionista;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAccionista() {
	//	return jComboBoxTiposArchivosReportesDinamicoAccionista;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAccionista(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAccionista) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAccionista = jComboBoxTiposArchivosReportesDinamicoAccionista;
	//}
	
	public void setBorderResaltarTiposReportesAccionista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccionista.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAccionista .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAccionista() {
		return this.jComboBoxTiposGraficosReportesAccionista;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAccionista(
			JComboBox jComboBoxTiposGraficosReportesAccionista) {
		this.jComboBoxTiposGraficosReportesAccionista = jComboBoxTiposGraficosReportesAccionista;
	}
	
	public void setBorderResaltarTiposGraficosReportesAccionista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccionista.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAccionista .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAccionista() {
		return this.jComboBoxTiposPaginacionAccionista;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAccionista(
			JComboBox jComboBoxTiposPaginacionAccionista) {
		this.jComboBoxTiposPaginacionAccionista = jComboBoxTiposPaginacionAccionista;
	}
	
	public void setBorderResaltarTiposPaginacionAccionista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccionista.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAccionista .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAccionista() {
		return this.jComboBoxTiposRelacionesAccionista;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAccionista() {
		return this.jComboBoxTiposAccionesAccionista;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAccionista(
			JComboBox jComboBoxTiposRelacionesAccionista) {
		this.jComboBoxTiposRelacionesAccionista = jComboBoxTiposRelacionesAccionista;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAccionista(
			JComboBox jComboBoxTiposAccionesAccionista) {
		this.jComboBoxTiposAccionesAccionista = jComboBoxTiposAccionesAccionista;
	}
	
	public void setBorderResaltarTiposRelacionesAccionista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccionista.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAccionista .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAccionista() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAccionista.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAccionista .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAccionista() {
	//	return jCheckBoxConGraficoDinamicoAccionista;
	//}

	//public void setjCheckBoxConGraficoDinamicoAccionista(
	//		JCheckBox jCheckBoxConGraficoDinamicoAccionista) {
	//	this.jCheckBoxConGraficoDinamicoAccionista = jCheckBoxConGraficoDinamicoAccionista;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAccionista() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAccionista.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAccionista .setBorder(borderResaltar);		
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
		this.accionistaSessionBean=new AccionistaSessionBean();
		
		this.accionistaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.accionistaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.accionistaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AccionistaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AccionistaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AccionistaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AccionistaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AccionistaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Accionista MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
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
		
		AccionistaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Accionista No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAccionista= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAccionista,this.jTtoolBarAccionista,
							"nuevo","nuevo","Nuevo"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAccionista,this.jTtoolBarAccionista,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAccionista,this.jTtoolBarAccionista,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAccionista,this.jTtoolBarAccionista,
							"duplicar","duplicar","Duplicar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAccionista,this.jTtoolBarAccionista,
							"copiar","copiar","Copiar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAccionista,this.jTtoolBarAccionista,
							"ver_form","ver_form","Ver"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAccionista,this.jTtoolBarAccionista,
							"recargar","recargar","Recargar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAccionista,this.jTtoolBarAccionista,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAccionista,this.jTtoolBarAccionista,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAccionista,this.jTtoolBarAccionista,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAccionista,this.jTtoolBarAccionista,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAccionista,this.jTtoolBarAccionista,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAccionista=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAccionista,this.jTtoolBarAccionista,
							"cerrar","cerrar","Salir"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAccionista=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAccionista;
			
				this.jButtonProcesarInformacionToolBarAccionista=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAccionista;
				
		//protected JButton jButtonModificarToolBarAccionista;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAccionista=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAccionista=new JMenuMe("General");
		this.jmenuArchivoAccionista=new JMenuMe("Archivo");
		this.jmenuAccionesAccionista=new JMenuMe("Acciones");
		this.jmenuDatosAccionista=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAccionista= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAccionista.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAccionista,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAccionista= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAccionista.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAccionista,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAccionista= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAccionista.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAccionista,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAccionista= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAccionista.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAccionista,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAccionista= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAccionista.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAccionista,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAccionista= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAccionista.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAccionista,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAccionista= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAccionista.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAccionista,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAccionista= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAccionista.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAccionista,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAccionista= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAccionista.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAccionista,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAccionista= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAccionista.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAccionista,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAccionista= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAccionista.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAccionista,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAccionista= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAccionista.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAccionista,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAccionista= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAccionista.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAccionista,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAccionista= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAccionista.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAccionista,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAccionista= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAccionista.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAccionista,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAccionista= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAccionista.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAccionista,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAccionista= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAccionista.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAccionista,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAccionista.add(this.jMenuItemCerrarAccionista);
			
			this.jmenuAccionesAccionista.add(this.jMenuItemNuevoAccionista);
			this.jmenuAccionesAccionista.add(this.jMenuItemNuevoGuardarCambiosAccionista);
			this.jmenuAccionesAccionista.add(this.jMenuItemNuevoRelacionesAccionista);
			this.jmenuAccionesAccionista.add(this.jMenuItemGuardarCambiosTablaAccionista);		
			this.jmenuAccionesAccionista.add(this.jMenuItemDuplicarAccionista);		
			this.jmenuAccionesAccionista.add(this.jMenuItemCopiarAccionista);		
			this.jmenuAccionesAccionista.add(this.jMenuItemVerFormAccionista);		
			
			this.jmenuDatosAccionista.add(this.jMenuItemRecargarInformacionAccionista);				
			this.jmenuDatosAccionista.add(this.jMenuItemAnterioresAccionista);				
			this.jmenuDatosAccionista.add(this.jMenuItemSiguientesAccionista);				
			this.jmenuDatosAccionista.add(this.jMenuItemAbrirOrderByAccionista);				
			this.jmenuDatosAccionista.add(this.jMenuItemMostrarOcultarAccionista);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAccionista.add(this.jMenuItemGuardarCambiosAccionista);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAccionista.add(this.jmenuArchivoAccionista);		
			this.jmenuBarAccionista.add(this.jmenuAccionesAccionista);		
			this.jmenuBarAccionista.add(this.jmenuDatosAccionista);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAccionista);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAccionista() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdClientePorNombreCortoAccionista=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdClientePorNombreCortoAccionista.setToolTipText("Buscar Por Cliente Por Nombre Corto ");
		this.jButtonBusquedaPorIdClientePorNombreCortoAccionista= new JButtonMe();
		this.jButtonBusquedaPorIdClientePorNombreCortoAccionista.setText("Buscar");
		this.jButtonBusquedaPorIdClientePorNombreCortoAccionista.setToolTipText("Buscar Por Cliente Por Nombre Corto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdClientePorNombreCortoAccionista,"buscar_button","Buscar Por Cliente Por Nombre Corto ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdClientePorNombreCortoAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidclienteBusquedaPorIdClientePorNombreCortoAccionista = new JLabelMe();
		jLabelidclienteBusquedaPorIdClientePorNombreCortoAccionista.setText("Cliente :");
		jLabelidclienteBusquedaPorIdClientePorNombreCortoAccionista.setToolTipText("Cliente");
		jLabelidclienteBusquedaPorIdClientePorNombreCortoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteBusquedaPorIdClientePorNombreCortoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteBusquedaPorIdClientePorNombreCortoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidclienteBusquedaPorIdClientePorNombreCortoAccionista,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista= new JComboBoxMe();
		jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarBusquedaPorIdClientePorNombreCortoidclienteAccionista= new JButtonMe();
		this.jButtonBuscarBusquedaPorIdClientePorNombreCortoidclienteAccionista.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarBusquedaPorIdClientePorNombreCortoidclienteAccionista.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarBusquedaPorIdClientePorNombreCortoidclienteAccionista.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarBusquedaPorIdClientePorNombreCortoidclienteAccionista.setText("Buscar");
		this.jButtonBuscarBusquedaPorIdClientePorNombreCortoidclienteAccionista.setToolTipText("Buscar");
		this.jButtonBuscarBusquedaPorIdClientePorNombreCortoidclienteAccionista.setFocusable(false);

	
		jLabelnombrecortoBusquedaPorIdClientePorNombreCortoAccionista = new JLabelMe();
		jLabelnombrecortoBusquedaPorIdClientePorNombreCortoAccionista.setText("Nombre Corto :");
		jLabelnombrecortoBusquedaPorIdClientePorNombreCortoAccionista.setToolTipText("Nombre Corto");
		jLabelnombrecortoBusquedaPorIdClientePorNombreCortoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombrecortoBusquedaPorIdClientePorNombreCortoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombrecortoBusquedaPorIdClientePorNombreCortoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombrecortoBusquedaPorIdClientePorNombreCortoAccionista,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombrecortoBusquedaPorIdClientePorNombreCortoAccionista= new JTextAreaMe();
		jTextAreanombrecortoBusquedaPorIdClientePorNombreCortoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrecortoBusquedaPorIdClientePorNombreCortoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrecortoBusquedaPorIdClientePorNombreCortoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombrecortoBusquedaPorIdClientePorNombreCortoAccionista,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteAccionista=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteAccionista.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteAccionista= new JButtonMe();
		this.jButtonFK_IdClienteAccionista.setText("Buscar");
		this.jButtonFK_IdClienteAccionista.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteAccionista,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidclienteFK_IdClienteAccionista = new JLabelMe();
		jLabelidclienteFK_IdClienteAccionista.setText("Cliente :");
		jLabelidclienteFK_IdClienteAccionista.setToolTipText("Cliente");
		jLabelidclienteFK_IdClienteAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidclienteFK_IdClienteAccionista,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidclienteFK_IdClienteAccionista= new JComboBoxMe();
		jComboBoxidclienteFK_IdClienteAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteFK_IdClienteAccionista,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteidclienteAccionista= new JButtonMe();
		this.jButtonBuscarFK_IdClienteidclienteAccionista.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteAccionista.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteAccionista.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteidclienteAccionista.setText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteAccionista.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteAccionista.setFocusable(false);

		this.jPanelFK_IdValorClienteInversionAccionista=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdValorClienteInversionAccionista.setToolTipText("Buscar Por Tipo Inversion ");
		this.jButtonFK_IdValorClienteInversionAccionista= new JButtonMe();
		this.jButtonFK_IdValorClienteInversionAccionista.setText("Buscar");
		this.jButtonFK_IdValorClienteInversionAccionista.setToolTipText("Buscar Por Tipo Inversion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdValorClienteInversionAccionista,"buscar_button","Buscar Por Tipo Inversion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdValorClienteInversionAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvalorclienteinversionFK_IdValorClienteInversionAccionista = new JLabelMe();
		jLabelidvalorclienteinversionFK_IdValorClienteInversionAccionista.setText("Tipo Inversion :");
		jLabelidvalorclienteinversionFK_IdValorClienteInversionAccionista.setToolTipText("Tipo Inversion");
		jLabelidvalorclienteinversionFK_IdValorClienteInversionAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidvalorclienteinversionFK_IdValorClienteInversionAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidvalorclienteinversionFK_IdValorClienteInversionAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidvalorclienteinversionFK_IdValorClienteInversionAccionista,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista= new JComboBoxMe();
		jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdValorIdentificacionAccionista=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdValorIdentificacionAccionista.setToolTipText("Buscar Por Tipo Identificacion ");
		this.jButtonFK_IdValorIdentificacionAccionista= new JButtonMe();
		this.jButtonFK_IdValorIdentificacionAccionista.setText("Buscar");
		this.jButtonFK_IdValorIdentificacionAccionista.setToolTipText("Buscar Por Tipo Identificacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdValorIdentificacionAccionista,"buscar_button","Buscar Por Tipo Identificacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdValorIdentificacionAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvaloridentificacionFK_IdValorIdentificacionAccionista = new JLabelMe();
		jLabelidvaloridentificacionFK_IdValorIdentificacionAccionista.setText("Tipo Identificacion :");
		jLabelidvaloridentificacionFK_IdValorIdentificacionAccionista.setToolTipText("Tipo Identificacion");
		jLabelidvaloridentificacionFK_IdValorIdentificacionAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvaloridentificacionFK_IdValorIdentificacionAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvaloridentificacionFK_IdValorIdentificacionAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelidvaloridentificacionFK_IdValorIdentificacionAccionista,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista= new JComboBoxMe();
		jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAccionista=new JTabbedPane();


		this.jTabbedPaneBusquedasAccionista.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAccionista.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAccionista.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAccionista.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAccionista,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAccionista = new AccionistaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Accionista DATOS");
			this.jInternalFrameDetalleFormAccionista = new AccionistaDetalleFormJInternalFrame(jDesktopPane,this.accionistaSessionBean.getConGuardarRelaciones(),this.accionistaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAccionista = null;//new AccionistaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAccionista= new GridBagLayout();
		
		
		this.jTableDatosAccionista = new JTableMe();      
		
		String sToolTipAccionista="";
		sToolTipAccionista=AccionistaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAccionista+="(Cartera.Accionista)";
		}
		
		if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
			sToolTipAccionista+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAccionista.setToolTipText(sToolTipAccionista);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAccionista);
		this.jTableDatosAccionista.setAutoCreateRowSorter(true);
		this.jTableDatosAccionista.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAccionista.setRowSelectionAllowed(true);
		this.jTableDatosAccionista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAccionista,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAccionista = new JButtonMe();
		this.jButtonDuplicarAccionista = new JButtonMe();
		this.jButtonCopiarAccionista = new JButtonMe();
		this.jButtonVerFormAccionista = new JButtonMe();
		this.jButtonNuevoRelacionesAccionista = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAccionista = new JButtonMe();
		this.jButtonCerrarAccionista = new JButtonMe();
		
		this.jScrollPanelDatosAccionista = new JScrollPane();   
        this.jScrollPanelDatosGeneralAccionista = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAccionista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Accionista";
		
		if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Accionistas" + this.sPath));
		} else {
			this.jScrollPanelDatosAccionista.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAccionista.setToolTipText("Acciones");
        this.jPanelAccionesAccionista.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAccionista, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAccionista, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAccionista=new ReporteDinamicoJInternalFrame(AccionistaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAccionista();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAccionista=new ImportacionJInternalFrame(AccionistaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAccionista();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAccionista = new JButtonMe();
		
		this.jButtonAbrirOrderByAccionista.setText("Orden");
		this.jButtonAbrirOrderByAccionista.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAccionista,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAccionista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAccionista=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAccionista,false,this);
			
			//this.cargarOrderByAccionista(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAccionista=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAccionista,true,this);
			
			//this.cargarOrderByAccionista(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAccionista.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosAccionista.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosAccionista.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosAccionista.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAccionista.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAccionista.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAccionista.setText("Nuevo");
		this.jButtonDuplicarAccionista.setText("Duplicar");
		this.jButtonCopiarAccionista.setText("Copiar");
		this.jButtonVerFormAccionista.setText("Ver");
		this.jButtonNuevoRelacionesAccionista.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAccionista.setText("Guardar");
		this.jButtonCerrarAccionista.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAccionista,"nuevo_button","Nuevo",this.accionistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAccionista,"duplicar_button","Duplicar",this.accionistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAccionista,"copiar_button","Copiar",this.accionistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAccionista,"ver_form","Ver",this.accionistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAccionista,"nuevorelaciones_button","Nuevo Rel",this.accionistaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAccionista,"guardarcambiostabla_button","Guardar",this.accionistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAccionista,"cerrar_button","Salir",this.accionistaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAccionista, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAccionista.setToolTipText("Nuevo"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAccionista.setToolTipText("Duplicar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAccionista.setToolTipText("Copiar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAccionista.setToolTipText("Ver"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAccionista.setToolTipText("Nuevo Rel"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAccionista.setToolTipText("Guardar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAccionista.setToolTipText("Salir"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAccionista";
		inputMap = this.jButtonNuevoAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAccionista.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAccionista"));
		
		//DUPLICAR
		sMapKey = "DuplicarAccionista";
		inputMap = this.jButtonDuplicarAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAccionista.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAccionista"));
		
		//COPIAR
		sMapKey = "CopiarAccionista";
		inputMap = this.jButtonCopiarAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAccionista.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAccionista"));
		
		//VEr FORM
		sMapKey = "VerFormAccionista";
		inputMap = this.jButtonVerFormAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAccionista.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAccionista"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAccionista";
		inputMap = this.jButtonNuevoRelacionesAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAccionista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAccionista"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAccionista";
		inputMap = this.jButtonModificarAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAccionista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAccionista"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAccionista";
		inputMap = this.jButtonCerrarAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAccionista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAccionista"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAccionista";
		inputMap = this.jButtonGuardarCambiosTablaAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAccionista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAccionista"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAccionista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAccionista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAccionista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Accionista= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Accionista= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Accionista= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Accionista= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Accionista= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAccionista.setName("jPanelParametrosReportesAccionista"); 
		
		this.jPanelParametrosReportesAccionesAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAccionista.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAccionista.setName("jPanelParametrosReportesAccionesAccionista"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionista, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAccionista, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAccionista = new JButtonMe();
		this.jButtonRecargarInformacionAccionista.setText("Recargar");
		this.jButtonRecargarInformacionAccionista.setToolTipText("Recargar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAccionista,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAccionista = new JButtonMe();
		this.jButtonProcesarInformacionAccionista.setText("Procesar");
		this.jButtonProcesarInformacionAccionista.setToolTipText("Procesar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAccionista.setVisible(false);
			
		this.jButtonProcesarInformacionAccionista.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAccionista.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAccionista.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAccionista = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAccionista.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAccionista.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAccionista = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAccionista.setText("TIPO");       
		this.jComboBoxTiposReportesAccionista.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAccionista = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAccionista.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAccionista.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAccionista = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAccionista.setText("Paginacion");
		this.jComboBoxTiposPaginacionAccionista.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAccionista = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAccionista.setText("Accion");
		this.jComboBoxTiposRelacionesAccionista.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAccionista = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAccionista.setText("Accion");
		this.jComboBoxTiposAccionesAccionista.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAccionista = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAccionista.setText("Accion");
		this.jComboBoxTiposSeleccionarAccionista.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAccionista=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAccionista.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAccionista.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAccionista.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAccionista = new JLabelMe();
		
		this.jLabelAccionesAccionista.setText("Acciones");		
		this.jLabelAccionesAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAccionista = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAccionista.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAccionista.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAccionista = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAccionista.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAccionista.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAccionista = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAccionista.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAccionista.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAccionista = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAccionista.setText("Graf.");
		this.jCheckBoxConGraficoReporteAccionista.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAccionista = new JButtonMe();
		//this.jButtonAnterioresAccionista.setText("<<");
        this.jButtonAnterioresAccionista.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAccionista,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAccionista = new JButtonMe();
		//this.jButtonSiguientesAccionista.setText(">>");
        this.jButtonSiguientesAccionista.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAccionista,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAccionista = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAccionista.setText("Nue");
        this.jButtonNuevoGuardarCambiosAccionista.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAccionista,"nuevoguardarcambios_button","Nue",this.accionistaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAccionista, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAccionista";
		inputMap = this.jButtonNuevoGuardarCambiosAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAccionista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAccionista"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAccionista";
		inputMap = this.jButtonRecargarInformacionAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAccionista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAccionista"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAccionista";
		inputMap = this.jButtonSiguientesAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAccionista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAccionista"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAccionista";
		inputMap = this.jButtonAnterioresAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAccionista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAccionista"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAccionista();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAccionista.setMinimumSize(new Dimension(this.getWidth(),AccionistaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AccionistaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAccionista.setMaximumSize(new Dimension(this.getWidth(),AccionistaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AccionistaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAccionista.setPreferredSize(new Dimension(this.getWidth(),AccionistaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AccionistaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAccionista = new GridBagLayout();

			this.jPanelPaginacionAccionista.setLayout(gridaBagLayoutPaginacionAccionista);						
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.gridy = 0;
			this.gridBagConstraintsAccionista.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAccionista.add(this.jButtonAnterioresAccionista, this.gridBagConstraintsAccionista);
					
						
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAccionista.gridy = 0;
			
			this.jPanelPaginacionAccionista.add(this.jButtonNuevoGuardarCambiosAccionista, this.gridBagConstraintsAccionista);
						
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAccionista.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAccionista.gridy = 0;
			this.jPanelPaginacionAccionista.add(this.jButtonSiguientesAccionista, this.gridBagConstraintsAccionista);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.gridy = 1;
			this.gridBagConstraintsAccionista.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAccionista.add(this.jButtonNuevoAccionista, this.gridBagConstraintsAccionista);
						
			
			
			if(!this.accionistaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAccionista = new GridBagConstraints();
				this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAccionista.gridy = 1;
				this.gridBagConstraintsAccionista.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAccionista.add(this.jButtonGuardarCambiosTablaAccionista, this.gridBagConstraintsAccionista);
			}
			
			
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.gridy = 1;
			this.gridBagConstraintsAccionista.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAccionista.add(this.jButtonDuplicarAccionista, this.gridBagConstraintsAccionista);
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.gridy = 1;
			this.gridBagConstraintsAccionista.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAccionista.add(this.jButtonCopiarAccionista, this.gridBagConstraintsAccionista);
		
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.gridy = 1;
			this.gridBagConstraintsAccionista.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAccionista.add(this.jButtonVerFormAccionista, this.gridBagConstraintsAccionista);
		
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.gridy = 1;
			this.gridBagConstraintsAccionista.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAccionista.add(this.jButtonCerrarAccionista, this.gridBagConstraintsAccionista);
		
		
		
		this.jButtonRecargarInformacionAccionista.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAccionista.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAccionista.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAccionista, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAccionista.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAccionista.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAccionista.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAccionista.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAccionista.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAccionista.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAccionista.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAccionista.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAccionista.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAccionista.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAccionista.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAccionista.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAccionista.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAccionista.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAccionista.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAccionista.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAccionista.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAccionista.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAccionista.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAccionista.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAccionista.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAccionista.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAccionista.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAccionista.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAccionista.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAccionista.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAccionista.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAccionista, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAccionista.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAccionista.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAccionista.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAccionista.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAccionista.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAccionista.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAccionista = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAccionista = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Accionista = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Accionista = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Accionista = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Accionista = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAccionista.setLayout(gridaBagParametrosReportesAccionista);
			this.jPanelParametrosReportesAccionesAccionista.setLayout(gridaBagParametrosReportesAccionesAccionista);
			
			
			this.jPanelParametrosAuxiliar1Accionista.setLayout(gridaBagParametrosAuxiliar1Accionista);
			this.jPanelParametrosAuxiliar2Accionista.setLayout(gridaBagParametrosAuxiliar2Accionista);
			this.jPanelParametrosAuxiliar3Accionista.setLayout(gridaBagParametrosAuxiliar3Accionista);
			this.jPanelParametrosAuxiliar4Accionista.setLayout(gridaBagParametrosAuxiliar4Accionista);
			//this.jPanelParametrosAuxiliar5Accionista.setLayout(gridaBagParametrosAuxiliar2Accionista);			
			
			
			
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAccionista.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAccionista.add(this.jButtonRecargarInformacionAccionista, this.gridBagConstraintsAccionista);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccionista.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAccionista.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Accionista.add(this.jComboBoxTiposPaginacionAccionista, this.gridBagConstraintsAccionista);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccionista.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAccionista.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Accionista.add(this.jCheckBoxConAltoMaximoTablaAccionista, this.gridBagConstraintsAccionista);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccionista.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAccionista.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Accionista.add(this.jComboBoxTiposArchivosReportesAccionista, this.gridBagConstraintsAccionista);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccionista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccionista.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAccionista.add(this.jPanelParametrosAuxiliar1Accionista, this.gridBagConstraintsAccionista);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAccionista.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Accionista.add(this.jComboBoxTiposReportesAccionista, this.gridBagConstraintsAccionista);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccionista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccionista.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAccionista.add(this.jPanelParametrosAuxiliar4Accionista, this.gridBagConstraintsAccionista);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccionista.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAccionista.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAccionista.add(this.jComboBoxTiposReportesAccionista, this.gridBagConstraintsAccionista);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccionista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccionista.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAccionista.add(this.jCheckBoxGenerarReporteAccionista, this.gridBagConstraintsAccionista);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccionista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccionista.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAccionista.add(this.jPanelParametrosAuxiliar2Accionista, this.gridBagConstraintsAccionista);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAccionista.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAccionista.add(this.jLabelAccionesAccionista, this.gridBagConstraintsAccionista);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAccionista = new GridBagConstraints();
				this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAccionista.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAccionista.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAccionista.add(this.jButtonAbrirOrderByAccionista, this.gridBagConstraintsAccionista);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAccionista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccionista.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAccionista.add(this.jComboBoxTiposSeleccionarAccionista, this.gridBagConstraintsAccionista);			
			
			
			/*
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAccionista.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAccionista.add(this.jCheckBoxSeleccionarTodosAccionista, this.gridBagConstraintsAccionista);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAccionista.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Accionista.add(this.jCheckBoxSeleccionarTodosAccionista, this.gridBagConstraintsAccionista);															
				
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAccionista.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Accionista.add(this.jCheckBoxSeleccionadosAccionista, this.gridBagConstraintsAccionista);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAccionista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccionista.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAccionista.add(this.jPanelParametrosAuxiliar3Accionista, this.gridBagConstraintsAccionista);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccionista.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAccionista.add(this.jComboBoxTiposAccionesAccionista, this.gridBagConstraintsAccionista);
	
				
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAccionista.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAccionista.add(this.jTextFieldValorCampoGeneralAccionista, this.gridBagConstraintsAccionista);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAccionista = new GridBagLayout();

			this.jScrollPanelDatosAccionista.setLayout(gridaBagLayoutDatosAccionista);
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.gridy = 0;
			this.gridBagConstraintsAccionista.gridx = 0;
			
			this.jScrollPanelDatosAccionista.add(this.jTableDatosAccionista, this.gridBagConstraintsAccionista);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAccionista.setViewportView(this.jTableDatosAccionista);
		this.jTableDatosAccionista.setFillsViewportHeight(true);
		this.jTableDatosAccionista.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAccionista= new GridBagLayout();
		this.jPanelAccionesAccionista.setLayout(gridaBagLayoutAccionesAccionista);
		
		
		/*	
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccionista.gridy = 0;
		this.gridBagConstraintsAccionista.gridx = 0;
			
		this.jPanelAccionesAccionista.add(this.jButtonNuevoAccionista, this.gridBagConstraintsAccionista);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdClientePorNombreCortoAccionista= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdClientePorNombreCortoAccionista.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdClientePorNombreCortoAccionista.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdClientePorNombreCortoAccionista.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdClientePorNombreCortoAccionista.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdClientePorNombreCortoAccionista.setLayout(gridaBagLayoutBusquedaPorIdClientePorNombreCortoAccionista);

		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccionista.gridy = 0;
		gridBagConstraintsAccionista.gridx = 0;
		jPanelBusquedaPorIdClientePorNombreCortoAccionista.add(jLabelidclienteBusquedaPorIdClientePorNombreCortoAccionista, gridBagConstraintsAccionista);

		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccionista.gridy = 0;
		gridBagConstraintsAccionista.gridx = 1;
		jPanelBusquedaPorIdClientePorNombreCortoAccionista.add(jComboBoxidclienteBusquedaPorIdClientePorNombreCortoAccionista, gridBagConstraintsAccionista);


		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.NONE;
		gridBagConstraintsAccionista.gridy = 0;
		gridBagConstraintsAccionista.gridx = 0;
		jPanelBusquedaPorIdClientePorNombreCortoAccionista.add(this.jButtonBuscarBusquedaPorIdClientePorNombreCortoidclienteAccionista, gridBagConstraintsAccionista);


		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccionista.gridy = 1;
		gridBagConstraintsAccionista.gridx = 0;
		jPanelBusquedaPorIdClientePorNombreCortoAccionista.add(jLabelnombrecortoBusquedaPorIdClientePorNombreCortoAccionista, gridBagConstraintsAccionista);

		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccionista.gridy = 1;
		gridBagConstraintsAccionista.gridx = 1;
		jPanelBusquedaPorIdClientePorNombreCortoAccionista.add(jTextAreanombrecortoBusquedaPorIdClientePorNombreCortoAccionista, gridBagConstraintsAccionista);

		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccionista.gridy = 2;
		gridBagConstraintsAccionista.gridx =1;
		jPanelBusquedaPorIdClientePorNombreCortoAccionista.add(jButtonBusquedaPorIdClientePorNombreCortoAccionista, gridBagConstraintsAccionista);

		jTabbedPaneBusquedasAccionista.addTab("1.-Por Cliente Por Nombre Corto ", jPanelBusquedaPorIdClientePorNombreCortoAccionista);
		jTabbedPaneBusquedasAccionista.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteAccionista= new GridBagLayout();
		gridaBagLayoutFK_IdClienteAccionista.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteAccionista.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteAccionista.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteAccionista.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteAccionista.setLayout(gridaBagLayoutFK_IdClienteAccionista);

		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccionista.gridy = 0;
		gridBagConstraintsAccionista.gridx = 0;
		jPanelFK_IdClienteAccionista.add(jLabelidclienteFK_IdClienteAccionista, gridBagConstraintsAccionista);

		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccionista.gridy = 0;
		gridBagConstraintsAccionista.gridx = 1;
		jPanelFK_IdClienteAccionista.add(jComboBoxidclienteFK_IdClienteAccionista, gridBagConstraintsAccionista);


		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.NONE;
		gridBagConstraintsAccionista.gridy = 0;
		gridBagConstraintsAccionista.gridx = 0;
		jPanelFK_IdClienteAccionista.add(this.jButtonBuscarFK_IdClienteidclienteAccionista, gridBagConstraintsAccionista);

		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccionista.gridy = 1;
		gridBagConstraintsAccionista.gridx =1;
		jPanelFK_IdClienteAccionista.add(jButtonFK_IdClienteAccionista, gridBagConstraintsAccionista);

		jTabbedPaneBusquedasAccionista.addTab("2.-Por Cliente ", jPanelFK_IdClienteAccionista);
		jTabbedPaneBusquedasAccionista.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdValorClienteInversionAccionista= new GridBagLayout();
		gridaBagLayoutFK_IdValorClienteInversionAccionista.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdValorClienteInversionAccionista.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdValorClienteInversionAccionista.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdValorClienteInversionAccionista.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdValorClienteInversionAccionista.setLayout(gridaBagLayoutFK_IdValorClienteInversionAccionista);

		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccionista.gridy = 0;
		gridBagConstraintsAccionista.gridx = 0;
		jPanelFK_IdValorClienteInversionAccionista.add(jLabelidvalorclienteinversionFK_IdValorClienteInversionAccionista, gridBagConstraintsAccionista);

		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccionista.gridy = 0;
		gridBagConstraintsAccionista.gridx = 1;
		jPanelFK_IdValorClienteInversionAccionista.add(jComboBoxidvalorclienteinversionFK_IdValorClienteInversionAccionista, gridBagConstraintsAccionista);

		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccionista.gridy = 1;
		gridBagConstraintsAccionista.gridx =1;
		jPanelFK_IdValorClienteInversionAccionista.add(jButtonFK_IdValorClienteInversionAccionista, gridBagConstraintsAccionista);

		jTabbedPaneBusquedasAccionista.addTab("3.-Por Tipo Inversion ", jPanelFK_IdValorClienteInversionAccionista);
		jTabbedPaneBusquedasAccionista.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdValorIdentificacionAccionista= new GridBagLayout();
		gridaBagLayoutFK_IdValorIdentificacionAccionista.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdValorIdentificacionAccionista.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdValorIdentificacionAccionista.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdValorIdentificacionAccionista.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdValorIdentificacionAccionista.setLayout(gridaBagLayoutFK_IdValorIdentificacionAccionista);

		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccionista.gridy = 0;
		gridBagConstraintsAccionista.gridx = 0;
		jPanelFK_IdValorIdentificacionAccionista.add(jLabelidvaloridentificacionFK_IdValorIdentificacionAccionista, gridBagConstraintsAccionista);

		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccionista.gridy = 0;
		gridBagConstraintsAccionista.gridx = 1;
		jPanelFK_IdValorIdentificacionAccionista.add(jComboBoxidvaloridentificacionFK_IdValorIdentificacionAccionista, gridBagConstraintsAccionista);

		gridBagConstraintsAccionista = new GridBagConstraints();
		gridBagConstraintsAccionista.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAccionista.gridy = 1;
		gridBagConstraintsAccionista.gridx =1;
		jPanelFK_IdValorIdentificacionAccionista.add(jButtonFK_IdValorIdentificacionAccionista, gridBagConstraintsAccionista);

		jTabbedPaneBusquedasAccionista.addTab("4.-Por Tipo Identificacion ", jPanelFK_IdValorIdentificacionAccionista);
		jTabbedPaneBusquedasAccionista.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAccionista = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAccionista);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.accionistaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAccionista = new GridBagConstraints();						
			this.gridBagConstraintsAccionista.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAccionista.gridx = 0;		
			//this.gridBagConstraintsAccionista.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAccionista.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAccionista, this.gridBagConstraintsAccionista);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAccionista.gridx = 0;		
		//this.gridBagConstraintsAccionista.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccionista.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAccionista.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAccionista);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAccionista.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAccionista.gridx = 0;		
			this.gridBagConstraintsAccionista.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAccionista.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAccionista, this.gridBagConstraintsAccionista);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAccionista.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionista, this.gridBagConstraintsAccionista);								
		
		
		/*
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAccionista.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAccionista, this.gridBagConstraintsAccionista);
		*/		
		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAccionista.gridx =0;
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAccionista.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAccionista, this.gridBagConstraintsAccionista);
				
		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAccionista.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAccionista, this.gridBagConstraintsAccionista);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AccionistaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAccionista= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAccionista = new GridBagLayout();
			this.jPanelBusquedasParametrosAccionista.setLayout(gridaBagLayoutBusquedasParametrosAccionista);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAccionista=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAccionista.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAccionista.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAccionista.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAccionista.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAccionista, this.gridBagConstraintsAccionista);
			
			
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAccionista.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAccionista, this.gridBagConstraintsAccionista);
		
			
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAccionista.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAccionista, this.gridBagConstraintsAccionista);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAccionista;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAccionista() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAccionista = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAccionista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAccionista.setName("jPanelReporteDinamicoAccionista"); 
		
		this.jPanelReporteDinamicoAccionista.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAccionista.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAccionista.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAccionista.setLayout(gridaBagLayoutReporteDinamicoAccionista);
		
		
		this.jInternalFrameReporteDinamicoAccionista= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAccionista = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAccionista= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAccionista.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAccionista.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAccionista.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAccionista.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAccionista.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAccionista.setResizable(true);
	    this.jInternalFrameReporteDinamicoAccionista.setClosable(true);
	    this.jInternalFrameReporteDinamicoAccionista.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAccionista.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAccionista.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAccionista.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Accionistas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAccionista = new JLabelMe();

		this.jLabelColumnasSelectReporteAccionista.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAccionista.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAccionista.add(this.jLabelColumnasSelectReporteAccionista, this.gridBagConstraintsAccionista);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAccionista = new JList<Reporte>();
		this.jListColumnasSelectReporteAccionista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAccionista.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAccionista.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAccionista.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAccionista.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAccionista=new JScrollPane(this.jListColumnasSelectReporteAccionista);
			
			this.jScrollColumnasSelectReporteAccionista.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAccionista.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAccionista.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAccionista.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAccionista.add(this.jListColumnasSelectReporteAccionista, this.gridBagConstraintsAccionista);
		this.jPanelReporteDinamicoAccionista.add(this.jScrollColumnasSelectReporteAccionista, this.gridBagConstraintsAccionista);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAccionista = new JLabelMe();

		this.jLabelRelacionesSelectReporteAccionista.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAccionista = new JList<Reporte>();
		this.jListRelacionesSelectReporteAccionista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAccionista.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAccionista.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAccionista.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAccionista.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAccionista=new JScrollPane(this.jListRelacionesSelectReporteAccionista);
			
			this.jScrollRelacionesSelectReporteAccionista.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAccionista.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAccionista.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAccionista = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAccionista = new JComboBoxMe();
		this.jListColumnasValoresGraficoAccionista = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAccionista = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAccionista.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAccionista.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAccionista.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAccionista.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAccionista = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAccionista.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAccionista.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAccionista.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAccionista.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAccionista = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAccionista.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAccionista.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAccionista.add(this.jLabelGenerarExcelReporteDinamicoAccionista, this.gridBagConstraintsAccionista);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAccionista = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAccionista.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAccionista,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAccionista.setToolTipText("Generar EXCEL"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAccionista = new GridBagConstraints();
		//this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAccionista.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAccionista.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAccionista.add(this.jButtonGenerarExcelReporteDinamicoAccionista, this.gridBagConstraintsAccionista);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccionista.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAccionista.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAccionista.add(this.jComboBoxTiposReportesDinamicoAccionista, this.gridBagConstraintsAccionista);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAccionista = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAccionista.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAccionista.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAccionista.add(this.jLabelTiposArchivoReporteDinamicoAccionista, this.gridBagConstraintsAccionista);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccionista.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAccionista.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAccionista.add(this.jComboBoxTiposArchivosReportesDinamicoAccionista, this.gridBagConstraintsAccionista);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAccionista = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAccionista.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAccionista,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAccionista.setToolTipText("Generar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccionista.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAccionista.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAccionista.add(this.jButtonGenerarReporteDinamicoAccionista, this.gridBagConstraintsAccionista);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAccionista = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAccionista.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAccionista,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAccionista.setToolTipText("Cancelar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccionista.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAccionista.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAccionista.add(this.jButtonCerrarReporteDinamicoAccionista, this.gridBagConstraintsAccionista);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAccionista = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAccionista= new JScrollPane(jPanelReporteDinamicoAccionista,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAccionista.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAccionista.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAccionista.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Accionistas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAccionista.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAccionista.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAccionista.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAccionista);
		this.jInternalFrameReporteDinamicoAccionista.getContentPane().add(this.jScrollPanelReporteDinamicoAccionista, this.gridBagConstraintsAccionista);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAccionista() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAccionista = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAccionista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAccionista.setName("jPanelImportacionAccionista"); 
		
		this.jPanelImportacionAccionista.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAccionista.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAccionista.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAccionista.setLayout(gridaBagLayoutImportacionAccionista);
		
		
		this.jInternalFrameImportacionAccionista= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAccionista= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAccionista = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAccionista= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAccionista.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAccionista.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAccionista.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAccionista.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAccionista.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAccionista.setResizable(true);
	    this.jInternalFrameImportacionAccionista.setClosable(true);
	    this.jInternalFrameImportacionAccionista.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAccionista.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAccionista.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAccionista.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAccionista.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAccionista.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAccionista.setResizable(true);
	    this.jInternalFrameImportacionAccionista.setClosable(true);
	    this.jInternalFrameImportacionAccionista.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAccionista.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAccionista.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAccionista.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Accionistas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAccionista = new JLabelMe();

		this.jLabelArchivoImportacionAccionista.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = iPosYImportacion;		
		this.gridBagConstraintsAccionista.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAccionista.add(this.jLabelArchivoImportacionAccionista, this.gridBagConstraintsAccionista);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAccionista = new JFileChooser();		
		this.jFileChooserImportacionAccionista.setToolTipText("ESCOGER ARCHIVO"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAccionista = new JButtonMe();
		this.jButtonAbrirImportacionAccionista.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAccionista,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAccionista.setToolTipText("Generar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccionista.gridy = iPosYImportacion;
		this.gridBagConstraintsAccionista.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAccionista.add(this.jButtonAbrirImportacionAccionista, this.gridBagConstraintsAccionista);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAccionista = new JLabelMe();

		this.jLabelPathArchivoImportacionAccionista.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAccionista.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAccionista.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAccionista.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAccionista.gridy = iPosYImportacion;		
		this.gridBagConstraintsAccionista.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAccionista.add(this.jLabelPathArchivoImportacionAccionista, this.gridBagConstraintsAccionista);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAccionista=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAccionista.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAccionista.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAccionista.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccionista.gridy = iPosYImportacion;
		this.gridBagConstraintsAccionista.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAccionista.add(this.jTextFieldPathArchivoImportacionAccionista, this.gridBagConstraintsAccionista);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAccionista = new JButtonMe();
		this.jButtonGenerarImportacionAccionista.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAccionista,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAccionista.setToolTipText("Generar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccionista.gridy = iPosYImportacion;
		this.gridBagConstraintsAccionista.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAccionista.add(this.jButtonGenerarImportacionAccionista, this.gridBagConstraintsAccionista);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAccionista = new JButtonMe();
		this.jButtonCerrarImportacionAccionista.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAccionista,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAccionista.setToolTipText("Cancelar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAccionista.gridy = iPosYImportacion;
		this.gridBagConstraintsAccionista.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAccionista.add(this.jButtonCerrarImportacionAccionista, this.gridBagConstraintsAccionista);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAccionista = new GridBagLayout();
		
		this.jScrollPanelImportacionAccionista= new JScrollPane(jPanelImportacionAccionista,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAccionista = new GridBagConstraints();
		this.gridBagConstraintsAccionista.gridy =iPosYImportacion;
		this.gridBagConstraintsAccionista.gridx =iPosXImportacion;
		this.gridBagConstraintsAccionista.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAccionista.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAccionista.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAccionista);
		this.jInternalFrameImportacionAccionista.getContentPane().add(this.jScrollPanelImportacionAccionista, this.gridBagConstraintsAccionista);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAccionista(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAccionista = new JButtonMe();
			this.jButtonAbrirOrderByAccionista.setText("Orden");
			this.jButtonAbrirOrderByAccionista.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAccionista,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAccionista";
			inputMap = this.jButtonAbrirOrderByAccionista.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAccionista.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAccionista"));
		
		
			GridBagLayout gridaBagLayoutOrderByAccionista = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAccionista = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAccionista.setName("jPanelOrderByAccionista"); 
			
			this.jPanelOrderByAccionista.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAccionista.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAccionista.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAccionista.setLayout(gridaBagLayoutOrderByAccionista);
			
			
			this.jTableDatosAccionistaOrderBy = new JTableMe();        
			this.jTableDatosAccionistaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAccionistaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAccionistaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAccionistaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAccionistaOrderBy.setViewportView(this.jTableDatosAccionistaOrderBy);
			this.jTableDatosAccionistaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAccionistaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAccionista= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAccionista= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAccionista = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAccionista= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAccionista.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAccionista.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAccionista.setTitle("Orden");
			this.jInternalFrameOrderByAccionista.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAccionista.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAccionista.setResizable(true);
			this.jInternalFrameOrderByAccionista.setClosable(true);
			this.jInternalFrameOrderByAccionista.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAccionista.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAccionista.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAccionista.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAccionista.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Accionistas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAccionista.gridx =iPosXOrderBy;
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAccionista.ipady =150;
				
			this.jPanelOrderByAccionista.add(jScrollPanelDatosAccionistaOrderBy, this.gridBagConstraintsAccionista);//this.jTableDatosAccionistaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAccionista = new JButtonMe();
			this.jButtonCerrarOrderByAccionista.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAccionista,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAccionista.setToolTipText("Cancelar"+" "+AccionistaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAccionista, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAccionista.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAccionista.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAccionista.add(this.jButtonCerrarOrderByAccionista, this.gridBagConstraintsAccionista);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAccionista = new GridBagLayout();
			
			this.jScrollPanelOrderByAccionista= new JScrollPane(jPanelOrderByAccionista,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAccionista = new GridBagConstraints();
			this.gridBagConstraintsAccionista.gridy =iPosYOrderBy;
			this.gridBagConstraintsAccionista.gridx =iPosXOrderBy;
			this.gridBagConstraintsAccionista.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAccionista.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAccionista.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAccionista);
			
			this.jInternalFrameOrderByAccionista.getContentPane().add(this.jScrollPanelOrderByAccionista, this.gridBagConstraintsAccionista);			
		
		} else {
			this.jButtonAbrirOrderByAccionista = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.accionistaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAccionista.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAccionista.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAccionista.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAccionista.getRowHeight();//AccionistaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AccionistaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAccionista.isSelected()) {
					iHeightTable=AccionistaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AccionistaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AccionistaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AccionistaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAccionista.isSelected()) {
					iHeightTable=AccionistaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AccionistaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AccionistaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAccionista.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAccionista.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAccionista.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAccionista.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAccionista.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAccionista.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAccionista!=null && this.jInternalFrameOrderByAccionista.getjTableDatosOrderBy()!=null) {
			//if(!this.accionistaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAccionista.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAccionista.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAccionista.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAccionista.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAccionista.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAccionista.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAccionista.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAccionista.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAccionista.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAccionista.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=accionistaLogic.getAccionistas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=accionistas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Accionista> TraerAccionistaBeans(List<Accionista> accionistas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Accionista accionista:accionistas) {
					
				if(!(AccionistaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AccionistaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					accionista.setsDetalleGeneralEntityReporte(AccionistaConstantesFunciones.getAccionistaDescripcion(accionista));
										
					accionista.setesactivo_descripcion(AccionistaConstantesFunciones.getesactivoDescripcion(accionista));	
					
						
					
				} else  {
							
					//accionista.setsDetalleGeneralEntityReporte(accionista.getsDetalleGeneralEntityReporte());
										
				}
				
				//accionistabeans.add(accionistabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return accionistas;
    }
	//PARA REPORTES FIN
}
