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
import com.bydan.erp.cartera.util.ReferenciaPersonalConstantesFunciones;

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
public class ReferenciaPersonalJInternalFrame extends ReferenciaPersonalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarReferenciaPersonal;
	
	protected JMenuBar jmenuBarReferenciaPersonal;
	
	protected JMenu jmenuReferenciaPersonal;
	protected JMenu jmenuDatosReferenciaPersonal;
	protected JMenu jmenuArchivoReferenciaPersonal;
	protected JMenu jmenuAccionesReferenciaPersonal;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosReferenciaPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutReferenciaPersonal;	
	protected GridBagConstraints gridBagConstraintsReferenciaPersonal;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ReferenciaPersonalDetalleFormJInternalFrame jInternalFrameDetalleFormReferenciaPersonal;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoReferenciaPersonal;	
	protected ImportacionJInternalFrame jInternalFrameImportacionReferenciaPersonal;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoRefePersoBeanSwingJInternalFrame tiporefepersoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporefeperso="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public ReferenciaPersonalSessionBean referenciapersonalSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoRefePersoSessionBean tiporefepersoSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ReferenciaPersonal> referenciapersonals;		
	public List<ReferenciaPersonal> referenciapersonalsEliminados;	
	public List<ReferenciaPersonal> referenciapersonalsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByReferenciaPersonal;		
	protected JButton jButtonAbrirOrderByReferenciaPersonal;
	
	
	//protected JPanel jPanelOrderByReferenciaPersonal;
	//public JScrollPane jScrollPanelOrderByReferenciaPersonal;	
	//protected JButton jButtonCerrarOrderByReferenciaPersonal;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ReferenciaPersonalLogic referenciapersonalLogic;
	
	
	
	public JScrollPane jScrollPanelDatosReferenciaPersonal;
	public JScrollPane jScrollPanelDatosEdicionReferenciaPersonal;
	public JScrollPane jScrollPanelDatosGeneralReferenciaPersonal;
    
	
	
	//public JScrollPane jScrollPanelDatosReferenciaPersonalOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoReferenciaPersonal;
	//public JScrollPane jScrollPanelImportacionReferenciaPersonal;
	
	
	
	protected JPanel jPanelAccionesReferenciaPersonal;
	
    protected JPanel jPanelPaginacionReferenciaPersonal;
    protected JPanel jPanelParametrosReportesReferenciaPersonal;
	protected JPanel jPanelParametrosReportesAccionesReferenciaPersonal;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ReferenciaPersonal;
	protected JPanel jPanelParametrosAuxiliar2ReferenciaPersonal;
	protected JPanel jPanelParametrosAuxiliar3ReferenciaPersonal;
	protected JPanel jPanelParametrosAuxiliar4ReferenciaPersonal;
	//protected JPanel jPanelParametrosAuxiliar5ReferenciaPersonal;
	
	
	
	//protected JPanel jPanelReporteDinamicoReferenciaPersonal;
	//protected JPanel jPanelImportacionReferenciaPersonal;
	
	
	public JTable jTableDatosReferenciaPersonal;
	
	
	
	//public JTable jTableDatosReferenciaPersonalOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoReferenciaPersonal;
	protected JButton jButtonDuplicarReferenciaPersonal;
	protected JButton jButtonCopiarReferenciaPersonal;
	protected JButton jButtonVerFormReferenciaPersonal;
	protected JButton jButtonNuevoRelacionesReferenciaPersonal;
	protected JButton jButtonModificarReferenciaPersonal;
	
    protected JButton jButtonGuardarCambiosTablaReferenciaPersonal;
	protected JButton jButtonCerrarReferenciaPersonal;
	
	
	protected JButton jButtonRecargarInformacionReferenciaPersonal;
	protected JButton jButtonProcesarInformacionReferenciaPersonal;
	
	
	protected JButton jButtonAnterioresReferenciaPersonal;
	protected JButton jButtonSiguientesReferenciaPersonal;
	protected JButton jButtonNuevoGuardarCambiosReferenciaPersonal;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoReferenciaPersonal;
	//protected JButton jButtonCerrarReporteDinamicoReferenciaPersonal;
	//protected JButton jButtonGenerarExcelReporteDinamicoReferenciaPersonal;	
	
	
	
	//protected JButton jButtonAbrirImportacionReferenciaPersonal;
	//protected JButton jButtonGenerarImportacionReferenciaPersonal;
	//protected JButton jButtonCerrarImportacionReferenciaPersonal;
	//protected JFileChooser jFileChooserImportacionReferenciaPersonal;
	//protected File fileImportacionReferenciaPersonal;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarReferenciaPersonal;
	protected JButton jButtonDuplicarToolBarReferenciaPersonal;
	protected JButton jButtonNuevoRelacionesToolBarReferenciaPersonal;
	
	
	public JButton jButtonGuardarCambiosToolBarReferenciaPersonal;
	protected JButton jButtonCopiarToolBarReferenciaPersonal;
	protected JButton jButtonVerFormToolBarReferenciaPersonal;
	public JButton jButtonGuardarCambiosTablaToolBarReferenciaPersonal;
	protected JButton jButtonMostrarOcultarTablaToolBarReferenciaPersonal;
	protected JButton jButtonCerrarToolBarReferenciaPersonal;
	
	protected JButton jButtonRecargarInformacionToolBarReferenciaPersonal;
	protected JButton jButtonProcesarInformacionToolBarReferenciaPersonal;
	protected JButton jButtonAnterioresToolBarReferenciaPersonal;
	protected JButton jButtonSiguientesToolBarReferenciaPersonal;
	protected JButton jButtonNuevoGuardarCambiosToolBarReferenciaPersonal;
	protected JButton jButtonAbrirOrderByToolBarReferenciaPersonal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoReferenciaPersonal;
	protected JMenuItem jMenuItemDuplicarReferenciaPersonal;
	protected JMenuItem jMenuItemNuevoRelacionesReferenciaPersonal;
	
	
	protected JMenuItem jMenuItemGuardarCambiosReferenciaPersonal;
	protected JMenuItem jMenuItemCopiarReferenciaPersonal;
	protected JMenuItem jMenuItemVerFormReferenciaPersonal;
	protected JMenuItem jMenuItemGuardarCambiosTablaReferenciaPersonal;
	protected JMenuItem jMenuItemCerrarReferenciaPersonal;
	protected JMenuItem jMenuItemDetalleCerrarReferenciaPersonal;
	protected JMenuItem jMenuItemDetalleAbrirOrderByReferenciaPersonal;
	protected JMenuItem jMenuItemDetalleMostarOcultarReferenciaPersonal;
	
	protected JMenuItem jMenuItemRecargarInformacionReferenciaPersonal;
	protected JMenuItem jMenuItemProcesarInformacionReferenciaPersonal;
	protected JMenuItem jMenuItemAnterioresReferenciaPersonal;
	protected JMenuItem jMenuItemSiguientesReferenciaPersonal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosReferenciaPersonal;
	protected JMenuItem jMenuItemAbrirOrderByReferenciaPersonal;
	protected JMenuItem jMenuItemMostrarOcultarReferenciaPersonal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesReferenciaPersonal;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosReferenciaPersonal;
	protected JCheckBox jCheckBoxSeleccionadosReferenciaPersonal;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaReferenciaPersonal;
	protected JCheckBox jCheckBoxConGraficoReporteReferenciaPersonal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesReferenciaPersonal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesReferenciaPersonal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoReferenciaPersonal;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoReferenciaPersonal;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesReferenciaPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionReferenciaPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesReferenciaPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesReferenciaPersonal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarReferenciaPersonal;
	protected JTextField jTextFieldValorCampoGeneralReferenciaPersonal;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteReferenciaPersonal;
	//public JList<Reporte> jListColumnasSelectReporteReferenciaPersonal;
	//public JScrollPane jScrollColumnasSelectReporteReferenciaPersonal;
	
	//public JLabel jLabelRelacionesSelectReporteReferenciaPersonal;
	//public JList<Reporte> jListRelacionesSelectReporteReferenciaPersonal;
	//public JScrollPane jScrollRelacionesSelectReporteReferenciaPersonal;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoReferenciaPersonal;
	//protected JCheckBox jCheckBoxConGraficoDinamicoReferenciaPersonal;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoReferenciaPersonal;
	//public JLabel jLabelTiposArchivoReporteDinamicoReferenciaPersonal;
	
		
	//public JLabel jLabelArchivoImportacionReferenciaPersonal;	
	//public JLabel jLabelPathArchivoImportacionReferenciaPersonal;
	//protected JTextField jTextFieldPathArchivoImportacionReferenciaPersonal;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoReferenciaPersonal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoReferenciaPersonal;
	
	//public JLabel jLabelColumnaCategoriaValorReferenciaPersonal;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorReferenciaPersonal;
	
	//public JLabel jLabelColumnasValoresGraficoReferenciaPersonal;
	//public JList<Reporte> jListColumnasValoresGraficoReferenciaPersonal;
	//public JScrollPane jScrollColumnasValoresGraficoReferenciaPersonal;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoReferenciaPersonal;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoReferenciaPersonal;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasReferenciaPersonal;
	public JPanel jPanelFK_IdCiudadReferenciaPersonal;
	public JButton jButtonFK_IdCiudadReferenciaPersonal;
	public JPanel jPanelFK_IdClienteReferenciaPersonal;
	public JButton jButtonFK_IdClienteReferenciaPersonal;
	public JPanel jPanelFK_IdPaisReferenciaPersonal;
	public JButton jButtonFK_IdPaisReferenciaPersonal;
	public JPanel jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal;
	public JButton jButtonFK_IdTipoReferenciaPersonalReferenciaPersonal;
	
	public JPanel jPanelidciudadFK_IdCiudadReferenciaPersonal;
	public JLabel jLabelidciudadFK_IdCiudadReferenciaPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidciudadFK_IdCiudadReferenciaPersonal;
	public JButton jButtonidciudadFK_IdCiudadReferenciaPersonal= new JButtonMe();
	public JButton jButtonidciudadFK_IdCiudadReferenciaPersonalUpdate= new JButtonMe();
	public JButton jButtonidciudadFK_IdCiudadReferenciaPersonalBusqueda= new JButtonMe();

	
	public JPanel jPanelidclienteFK_IdClienteReferenciaPersonal;
	public JLabel jLabelidclienteFK_IdClienteReferenciaPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidclienteFK_IdClienteReferenciaPersonal;
	public JButton jButtonidclienteFK_IdClienteReferenciaPersonal= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteReferenciaPersonalUpdate= new JButtonMe();
	public JButton jButtonidclienteFK_IdClienteReferenciaPersonalBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteidclienteReferenciaPersonal;
	
	public JPanel jPanelid_paisFK_IdPaisReferenciaPersonal;
	public JLabel jLabelid_paisFK_IdPaisReferenciaPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisReferenciaPersonal;
	public JButton jButtonid_paisFK_IdPaisReferenciaPersonal= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisReferenciaPersonalUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisReferenciaPersonalBusqueda= new JButtonMe();

	
	public JPanel jPanelidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal;
	public JLabel jLabelidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal;
	public JButton jButtonidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal= new JButtonMe();
	public JButton jButtonidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonalUpdate= new JButtonMe();
	public JButton jButtonidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonalBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=1078;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ReferenciaPersonalJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ReferenciaPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaPersonalJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReferenciaPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaPersonalJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReferenciaPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaPersonalJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ReferenciaPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionReferenciaPersonal)	{
		this.jButtonRecargarInformacionReferenciaPersonal = jButtonRecargarInformacionReferenciaPersonal;
	}
	
	public JButton getjButtonProcesarInformacionReferenciaPersonal() {
		return this.jButtonProcesarInformacionReferenciaPersonal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionReferenciaPersonal)	{
		this.jButtonProcesarInformacionReferenciaPersonal = jButtonProcesarInformacionReferenciaPersonal;
	}
	
	
	public JButton getjButtonRecargarInformacionReferenciaPersonal() {
		return this.jButtonRecargarInformacionReferenciaPersonal;
	}
	
	
	public List<ReferenciaPersonal> getreferenciapersonals() {
		return this.referenciapersonals;
	}

	public void setreferenciapersonals(List<ReferenciaPersonal> referenciapersonals) {
		this.referenciapersonals = referenciapersonals;
	}
	
	public List<ReferenciaPersonal> getreferenciapersonalsAux() {
		return this.referenciapersonalsAux;
	}

	public void setreferenciapersonalsAux(List<ReferenciaPersonal> referenciapersonalsAux) {
		this.referenciapersonalsAux = referenciapersonalsAux;
	}
	
	public List<ReferenciaPersonal> getreferenciapersonalsEliminados() {
		return this.referenciapersonalsEliminados;
	}

	public void setReferenciaPersonalsEliminados(List<ReferenciaPersonal> referenciapersonalsEliminados) {
		this.referenciapersonalsEliminados = referenciapersonalsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarReferenciaPersonal() {
		return jComboBoxTiposSeleccionarReferenciaPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarReferenciaPersonal(
			JComboBox jComboBoxTiposSeleccionarReferenciaPersonal) {
		this.jComboBoxTiposSeleccionarReferenciaPersonal = jComboBoxTiposSeleccionarReferenciaPersonal;
	}
	
	public void setBorderResaltarTiposSeleccionarReferenciaPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarReferenciaPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarReferenciaPersonal .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralReferenciaPersonal() {
		return jTextFieldValorCampoGeneralReferenciaPersonal;
	}

	public void setjTextFieldValorCampoGeneralReferenciaPersonal(
			JTextField jTextFieldValorCampoGeneralReferenciaPersonal) {
		this.jTextFieldValorCampoGeneralReferenciaPersonal = jTextFieldValorCampoGeneralReferenciaPersonal;
	}

	public void setBorderResaltarValorCampoGeneralReferenciaPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaPersonal.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralReferenciaPersonal .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosReferenciaPersonal() {
		return this.jCheckBoxSeleccionarTodosReferenciaPersonal;
	}

	public void setjCheckBoxSeleccionarTodosReferenciaPersonal(
			JCheckBox jCheckBoxSeleccionarTodosReferenciaPersonal) {
		this.jCheckBoxSeleccionarTodosReferenciaPersonal = jCheckBoxSeleccionarTodosReferenciaPersonal;
	}

	public void setBorderResaltarSeleccionarTodosReferenciaPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaPersonal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosReferenciaPersonal .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosReferenciaPersonal() {
		return this.jCheckBoxSeleccionadosReferenciaPersonal;
	}

	public void setjCheckBoxSeleccionadosReferenciaPersonal(
			JCheckBox jCheckBoxSeleccionadosReferenciaPersonal) {
		this.jCheckBoxSeleccionadosReferenciaPersonal = jCheckBoxSeleccionadosReferenciaPersonal;
	}
	
	public void setBorderResaltarSeleccionadosReferenciaPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaPersonal.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosReferenciaPersonal .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesReferenciaPersonal() {
		return this.jComboBoxTiposArchivosReportesReferenciaPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesReferenciaPersonal(
			JComboBox jComboBoxTiposArchivosReportesReferenciaPersonal) {
		this.jComboBoxTiposArchivosReportesReferenciaPersonal = jComboBoxTiposArchivosReportesReferenciaPersonal;
	}

	public void setBorderResaltarTiposArchivosReportesReferenciaPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesReferenciaPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesReferenciaPersonal() {
		return this.jComboBoxTiposReportesReferenciaPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesReferenciaPersonal(
			JComboBox jComboBoxTiposReportesReferenciaPersonal) {
		this.jComboBoxTiposReportesReferenciaPersonal = jComboBoxTiposReportesReferenciaPersonal;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoReferenciaPersonal() {
	//	return jComboBoxTiposReportesDinamicoReferenciaPersonal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoReferenciaPersonal(
	//		JComboBox jComboBoxTiposReportesDinamicoReferenciaPersonal) {
	//	this.jComboBoxTiposReportesDinamicoReferenciaPersonal = jComboBoxTiposReportesDinamicoReferenciaPersonal;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoReferenciaPersonal() {
	//	return jComboBoxTiposArchivosReportesDinamicoReferenciaPersonal;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoReferenciaPersonal(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoReferenciaPersonal) {
	//	this.jComboBoxTiposArchivosReportesDinamicoReferenciaPersonal = jComboBoxTiposArchivosReportesDinamicoReferenciaPersonal;
	//}
	
	public void setBorderResaltarTiposReportesReferenciaPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesReferenciaPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesReferenciaPersonal() {
		return this.jComboBoxTiposGraficosReportesReferenciaPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesReferenciaPersonal(
			JComboBox jComboBoxTiposGraficosReportesReferenciaPersonal) {
		this.jComboBoxTiposGraficosReportesReferenciaPersonal = jComboBoxTiposGraficosReportesReferenciaPersonal;
	}
	
	public void setBorderResaltarTiposGraficosReportesReferenciaPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesReferenciaPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionReferenciaPersonal() {
		return this.jComboBoxTiposPaginacionReferenciaPersonal;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionReferenciaPersonal(
			JComboBox jComboBoxTiposPaginacionReferenciaPersonal) {
		this.jComboBoxTiposPaginacionReferenciaPersonal = jComboBoxTiposPaginacionReferenciaPersonal;
	}
	
	public void setBorderResaltarTiposPaginacionReferenciaPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionReferenciaPersonal .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesReferenciaPersonal() {
		return this.jComboBoxTiposRelacionesReferenciaPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesReferenciaPersonal() {
		return this.jComboBoxTiposAccionesReferenciaPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesReferenciaPersonal(
			JComboBox jComboBoxTiposRelacionesReferenciaPersonal) {
		this.jComboBoxTiposRelacionesReferenciaPersonal = jComboBoxTiposRelacionesReferenciaPersonal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesReferenciaPersonal(
			JComboBox jComboBoxTiposAccionesReferenciaPersonal) {
		this.jComboBoxTiposAccionesReferenciaPersonal = jComboBoxTiposAccionesReferenciaPersonal;
	}
	
	public void setBorderResaltarTiposRelacionesReferenciaPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesReferenciaPersonal .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesReferenciaPersonal() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarReferenciaPersonal.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesReferenciaPersonal .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoReferenciaPersonal() {
	//	return jCheckBoxConGraficoDinamicoReferenciaPersonal;
	//}

	//public void setjCheckBoxConGraficoDinamicoReferenciaPersonal(
	//		JCheckBox jCheckBoxConGraficoDinamicoReferenciaPersonal) {
	//	this.jCheckBoxConGraficoDinamicoReferenciaPersonal = jCheckBoxConGraficoDinamicoReferenciaPersonal;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoReferenciaPersonal() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarReferenciaPersonal.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoReferenciaPersonal .setBorder(borderResaltar);		
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
		this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
		
		this.referenciapersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.referenciapersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.referenciapersonalSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ReferenciaPersonalJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ReferenciaPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ReferenciaPersonalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ReferenciaPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ReferenciaPersonalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Referencia Personal MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
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
		
		ReferenciaPersonalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ReferenciaPersonal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarReferenciaPersonal= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarReferenciaPersonal,this.jTtoolBarReferenciaPersonal,
							"nuevo","nuevo","Nuevo"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarReferenciaPersonal,this.jTtoolBarReferenciaPersonal,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarReferenciaPersonal,this.jTtoolBarReferenciaPersonal,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarReferenciaPersonal,this.jTtoolBarReferenciaPersonal,
							"duplicar","duplicar","Duplicar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarReferenciaPersonal,this.jTtoolBarReferenciaPersonal,
							"copiar","copiar","Copiar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarReferenciaPersonal,this.jTtoolBarReferenciaPersonal,
							"ver_form","ver_form","Ver"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReferenciaPersonal,this.jTtoolBarReferenciaPersonal,
							"recargar","recargar","Recargar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReferenciaPersonal,this.jTtoolBarReferenciaPersonal,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarReferenciaPersonal,this.jTtoolBarReferenciaPersonal,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarReferenciaPersonal,this.jTtoolBarReferenciaPersonal,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarReferenciaPersonal,this.jTtoolBarReferenciaPersonal,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarReferenciaPersonal,this.jTtoolBarReferenciaPersonal,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarReferenciaPersonal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarReferenciaPersonal,this.jTtoolBarReferenciaPersonal,
							"cerrar","cerrar","Salir"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarReferenciaPersonal=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarReferenciaPersonal;
			
				this.jButtonProcesarInformacionToolBarReferenciaPersonal=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarReferenciaPersonal;
				
		//protected JButton jButtonModificarToolBarReferenciaPersonal;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarReferenciaPersonal=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuReferenciaPersonal=new JMenuMe("General");
		this.jmenuArchivoReferenciaPersonal=new JMenuMe("Archivo");
		this.jmenuAccionesReferenciaPersonal=new JMenuMe("Acciones");
		this.jmenuDatosReferenciaPersonal=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoReferenciaPersonal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoReferenciaPersonal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoReferenciaPersonal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarReferenciaPersonal= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarReferenciaPersonal.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarReferenciaPersonal,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesReferenciaPersonal= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesReferenciaPersonal.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesReferenciaPersonal,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosReferenciaPersonal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosReferenciaPersonal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosReferenciaPersonal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarReferenciaPersonal= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarReferenciaPersonal.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarReferenciaPersonal,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormReferenciaPersonal= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormReferenciaPersonal.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormReferenciaPersonal,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaReferenciaPersonal= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaReferenciaPersonal.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaReferenciaPersonal,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarReferenciaPersonal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarReferenciaPersonal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarReferenciaPersonal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionReferenciaPersonal= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionReferenciaPersonal.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionReferenciaPersonal,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionReferenciaPersonal= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionReferenciaPersonal.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionReferenciaPersonal,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresReferenciaPersonal= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresReferenciaPersonal.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresReferenciaPersonal,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesReferenciaPersonal= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesReferenciaPersonal.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesReferenciaPersonal,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByReferenciaPersonal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByReferenciaPersonal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByReferenciaPersonal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarReferenciaPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarReferenciaPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarReferenciaPersonal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByReferenciaPersonal= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByReferenciaPersonal.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByReferenciaPersonal,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarReferenciaPersonal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarReferenciaPersonal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarReferenciaPersonal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosReferenciaPersonal= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosReferenciaPersonal.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosReferenciaPersonal,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoReferenciaPersonal.add(this.jMenuItemCerrarReferenciaPersonal);
			
			this.jmenuAccionesReferenciaPersonal.add(this.jMenuItemNuevoReferenciaPersonal);
			this.jmenuAccionesReferenciaPersonal.add(this.jMenuItemNuevoGuardarCambiosReferenciaPersonal);
			this.jmenuAccionesReferenciaPersonal.add(this.jMenuItemNuevoRelacionesReferenciaPersonal);
			this.jmenuAccionesReferenciaPersonal.add(this.jMenuItemGuardarCambiosTablaReferenciaPersonal);		
			this.jmenuAccionesReferenciaPersonal.add(this.jMenuItemDuplicarReferenciaPersonal);		
			this.jmenuAccionesReferenciaPersonal.add(this.jMenuItemCopiarReferenciaPersonal);		
			this.jmenuAccionesReferenciaPersonal.add(this.jMenuItemVerFormReferenciaPersonal);		
			
			this.jmenuDatosReferenciaPersonal.add(this.jMenuItemRecargarInformacionReferenciaPersonal);				
			this.jmenuDatosReferenciaPersonal.add(this.jMenuItemAnterioresReferenciaPersonal);				
			this.jmenuDatosReferenciaPersonal.add(this.jMenuItemSiguientesReferenciaPersonal);				
			this.jmenuDatosReferenciaPersonal.add(this.jMenuItemAbrirOrderByReferenciaPersonal);				
			this.jmenuDatosReferenciaPersonal.add(this.jMenuItemMostrarOcultarReferenciaPersonal);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesReferenciaPersonal.add(this.jMenuItemGuardarCambiosReferenciaPersonal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarReferenciaPersonal.add(this.jmenuArchivoReferenciaPersonal);		
			this.jmenuBarReferenciaPersonal.add(this.jmenuAccionesReferenciaPersonal);		
			this.jmenuBarReferenciaPersonal.add(this.jmenuDatosReferenciaPersonal);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarReferenciaPersonal);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasReferenciaPersonal() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCiudadReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadReferenciaPersonal.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadReferenciaPersonal= new JButtonMe();
		this.jButtonFK_IdCiudadReferenciaPersonal.setText("Buscar");
		this.jButtonFK_IdCiudadReferenciaPersonal.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadReferenciaPersonal,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidciudadFK_IdCiudadReferenciaPersonal = new JLabelMe();
		jLabelidciudadFK_IdCiudadReferenciaPersonal.setText("Ciudad :");
		jLabelidciudadFK_IdCiudadReferenciaPersonal.setToolTipText("Ciudad");
		jLabelidciudadFK_IdCiudadReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidciudadFK_IdCiudadReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidciudadFK_IdCiudadReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidciudadFK_IdCiudadReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidciudadFK_IdCiudadReferenciaPersonal= new JComboBoxMe();
		jComboBoxidciudadFK_IdCiudadReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadFK_IdCiudadReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidciudadFK_IdCiudadReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidciudadFK_IdCiudadReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteReferenciaPersonal.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteReferenciaPersonal= new JButtonMe();
		this.jButtonFK_IdClienteReferenciaPersonal.setText("Buscar");
		this.jButtonFK_IdClienteReferenciaPersonal.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteReferenciaPersonal,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidclienteFK_IdClienteReferenciaPersonal = new JLabelMe();
		jLabelidclienteFK_IdClienteReferenciaPersonal.setText("Cliente :");
		jLabelidclienteFK_IdClienteReferenciaPersonal.setToolTipText("Cliente");
		jLabelidclienteFK_IdClienteReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelidclienteFK_IdClienteReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelidclienteFK_IdClienteReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidclienteFK_IdClienteReferenciaPersonal= new JComboBoxMe();
		jComboBoxidclienteFK_IdClienteReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidclienteFK_IdClienteReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidclienteFK_IdClienteReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteidclienteReferenciaPersonal= new JButtonMe();
		this.jButtonBuscarFK_IdClienteidclienteReferenciaPersonal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteReferenciaPersonal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteidclienteReferenciaPersonal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteidclienteReferenciaPersonal.setText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteReferenciaPersonal.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteidclienteReferenciaPersonal.setFocusable(false);

		this.jPanelFK_IdPaisReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisReferenciaPersonal.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisReferenciaPersonal= new JButtonMe();
		this.jButtonFK_IdPaisReferenciaPersonal.setText("Buscar");
		this.jButtonFK_IdPaisReferenciaPersonal.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisReferenciaPersonal,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisReferenciaPersonal = new JLabelMe();
		jLabelid_paisFK_IdPaisReferenciaPersonal.setText("Pais :");
		jLabelid_paisFK_IdPaisReferenciaPersonal.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisReferenciaPersonal= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal.setToolTipText("Buscar Por Tipo Refe Perso ");
		this.jButtonFK_IdTipoReferenciaPersonalReferenciaPersonal= new JButtonMe();
		this.jButtonFK_IdTipoReferenciaPersonalReferenciaPersonal.setText("Buscar");
		this.jButtonFK_IdTipoReferenciaPersonalReferenciaPersonal.setToolTipText("Buscar Por Tipo Refe Perso ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoReferenciaPersonalReferenciaPersonal,"buscar_button","Buscar Por Tipo Refe Perso ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoReferenciaPersonalReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal = new JLabelMe();
		jLabelidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.setText("Tipo Refe Perso :");
		jLabelidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.setToolTipText("Tipo Refe Perso");
		jLabelidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal= new JComboBoxMe();
		jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasReferenciaPersonal=new JTabbedPane();


		this.jTabbedPaneBusquedasReferenciaPersonal.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasReferenciaPersonal.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasReferenciaPersonal.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasReferenciaPersonal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleReferenciaPersonal = new ReferenciaPersonalDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Referencia Personal DATOS");
			this.jInternalFrameDetalleFormReferenciaPersonal = new ReferenciaPersonalDetalleFormJInternalFrame(jDesktopPane,this.referenciapersonalSessionBean.getConGuardarRelaciones(),this.referenciapersonalSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormReferenciaPersonal = null;//new ReferenciaPersonalDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutReferenciaPersonal= new GridBagLayout();
		
		
		this.jTableDatosReferenciaPersonal = new JTableMe();      
		
		String sToolTipReferenciaPersonal="";
		sToolTipReferenciaPersonal=ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipReferenciaPersonal+="(Cartera.ReferenciaPersonal)";
		}
		
		if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
			sToolTipReferenciaPersonal+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosReferenciaPersonal.setToolTipText(sToolTipReferenciaPersonal);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosReferenciaPersonal);
		this.jTableDatosReferenciaPersonal.setAutoCreateRowSorter(true);
		this.jTableDatosReferenciaPersonal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosReferenciaPersonal.setRowSelectionAllowed(true);
		this.jTableDatosReferenciaPersonal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosReferenciaPersonal,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoReferenciaPersonal = new JButtonMe();
		this.jButtonDuplicarReferenciaPersonal = new JButtonMe();
		this.jButtonCopiarReferenciaPersonal = new JButtonMe();
		this.jButtonVerFormReferenciaPersonal = new JButtonMe();
		this.jButtonNuevoRelacionesReferenciaPersonal = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaReferenciaPersonal = new JButtonMe();
		this.jButtonCerrarReferenciaPersonal = new JButtonMe();
		
		this.jScrollPanelDatosReferenciaPersonal = new JScrollPane();   
        this.jScrollPanelDatosGeneralReferenciaPersonal = new JScrollPane();
		
				
		
		
		this.jPanelAccionesReferenciaPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Referencia Personal";
		
		if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Personales" + this.sPath));
		} else {
			this.jScrollPanelDatosReferenciaPersonal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesReferenciaPersonal.setToolTipText("Acciones");
        this.jPanelAccionesReferenciaPersonal.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoReferenciaPersonal=new ReporteDinamicoJInternalFrame(ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoReferenciaPersonal();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionReferenciaPersonal=new ImportacionJInternalFrame(ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionReferenciaPersonal();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByReferenciaPersonal = new JButtonMe();
		
		this.jButtonAbrirOrderByReferenciaPersonal.setText("Orden");
		this.jButtonAbrirOrderByReferenciaPersonal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByReferenciaPersonal,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByReferenciaPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByReferenciaPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferenciaPersonal,false,this);
			
			//this.cargarOrderByReferenciaPersonal(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByReferenciaPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferenciaPersonal,true,this);
			
			//this.cargarOrderByReferenciaPersonal(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosReferenciaPersonal.setMinimumSize(new Dimension(400,50));//2130
		this.jTableDatosReferenciaPersonal.setMaximumSize(new Dimension(400,50));//2130
		this.jTableDatosReferenciaPersonal.setPreferredSize(new Dimension(400,50));//2130
		
		this.jScrollPanelDatosReferenciaPersonal.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosReferenciaPersonal.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosReferenciaPersonal.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoReferenciaPersonal.setText("Nuevo");
		this.jButtonDuplicarReferenciaPersonal.setText("Duplicar");
		this.jButtonCopiarReferenciaPersonal.setText("Copiar");
		this.jButtonVerFormReferenciaPersonal.setText("Ver");
		this.jButtonNuevoRelacionesReferenciaPersonal.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaReferenciaPersonal.setText("Guardar");
		this.jButtonCerrarReferenciaPersonal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoReferenciaPersonal,"nuevo_button","Nuevo",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarReferenciaPersonal,"duplicar_button","Duplicar",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarReferenciaPersonal,"copiar_button","Copiar",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormReferenciaPersonal,"ver_form","Ver",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesReferenciaPersonal,"nuevorelaciones_button","Nuevo Rel",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaReferenciaPersonal,"guardarcambiostabla_button","Guardar",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReferenciaPersonal,"cerrar_button","Salir",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoReferenciaPersonal.setToolTipText("Nuevo"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarReferenciaPersonal.setToolTipText("Duplicar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarReferenciaPersonal.setToolTipText("Copiar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormReferenciaPersonal.setToolTipText("Ver"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesReferenciaPersonal.setToolTipText("Nuevo Rel"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaReferenciaPersonal.setToolTipText("Guardar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarReferenciaPersonal.setToolTipText("Salir"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoReferenciaPersonal";
		inputMap = this.jButtonNuevoReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoReferenciaPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoReferenciaPersonal"));
		
		//DUPLICAR
		sMapKey = "DuplicarReferenciaPersonal";
		inputMap = this.jButtonDuplicarReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarReferenciaPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarReferenciaPersonal"));
		
		//COPIAR
		sMapKey = "CopiarReferenciaPersonal";
		inputMap = this.jButtonCopiarReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarReferenciaPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarReferenciaPersonal"));
		
		//VEr FORM
		sMapKey = "VerFormReferenciaPersonal";
		inputMap = this.jButtonVerFormReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormReferenciaPersonal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormReferenciaPersonal"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesReferenciaPersonal";
		inputMap = this.jButtonNuevoRelacionesReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesReferenciaPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesReferenciaPersonal"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarReferenciaPersonal";
		inputMap = this.jButtonModificarReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarReferenciaPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarReferenciaPersonal"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarReferenciaPersonal";
		inputMap = this.jButtonCerrarReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarReferenciaPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarReferenciaPersonal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaReferenciaPersonal";
		inputMap = this.jButtonGuardarCambiosTablaReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaReferenciaPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaReferenciaPersonal"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesReferenciaPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesReferenciaPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionReferenciaPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ReferenciaPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ReferenciaPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ReferenciaPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ReferenciaPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ReferenciaPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesReferenciaPersonal.setName("jPanelParametrosReportesReferenciaPersonal"); 
		
		this.jPanelParametrosReportesAccionesReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesReferenciaPersonal.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesReferenciaPersonal.setName("jPanelParametrosReportesAccionesReferenciaPersonal"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionReferenciaPersonal = new JButtonMe();
		this.jButtonRecargarInformacionReferenciaPersonal.setText("Recargar");
		this.jButtonRecargarInformacionReferenciaPersonal.setToolTipText("Recargar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionReferenciaPersonal,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionReferenciaPersonal = new JButtonMe();
		this.jButtonProcesarInformacionReferenciaPersonal.setText("Procesar");
		this.jButtonProcesarInformacionReferenciaPersonal.setToolTipText("Procesar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionReferenciaPersonal.setVisible(false);
			
		this.jButtonProcesarInformacionReferenciaPersonal.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionReferenciaPersonal.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionReferenciaPersonal.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesReferenciaPersonal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReferenciaPersonal.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesReferenciaPersonal.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesReferenciaPersonal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReferenciaPersonal.setText("TIPO");       
		this.jComboBoxTiposReportesReferenciaPersonal.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesReferenciaPersonal = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesReferenciaPersonal.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesReferenciaPersonal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionReferenciaPersonal = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionReferenciaPersonal.setText("Paginacion");
		this.jComboBoxTiposPaginacionReferenciaPersonal.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesReferenciaPersonal = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesReferenciaPersonal.setText("Accion");
		this.jComboBoxTiposRelacionesReferenciaPersonal.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesReferenciaPersonal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesReferenciaPersonal.setText("Accion");
		this.jComboBoxTiposAccionesReferenciaPersonal.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarReferenciaPersonal = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarReferenciaPersonal.setText("Accion");
		this.jComboBoxTiposSeleccionarReferenciaPersonal.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralReferenciaPersonal=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralReferenciaPersonal.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralReferenciaPersonal.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralReferenciaPersonal.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesReferenciaPersonal = new JLabelMe();
		
		this.jLabelAccionesReferenciaPersonal.setText("Acciones");		
		this.jLabelAccionesReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosReferenciaPersonal = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosReferenciaPersonal.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosReferenciaPersonal.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosReferenciaPersonal = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosReferenciaPersonal.setText("Seleccionados");
		this.jCheckBoxSeleccionadosReferenciaPersonal.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaReferenciaPersonal = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaReferenciaPersonal.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaReferenciaPersonal.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteReferenciaPersonal = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteReferenciaPersonal.setText("Graf.");
		this.jCheckBoxConGraficoReporteReferenciaPersonal.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresReferenciaPersonal = new JButtonMe();
		//this.jButtonAnterioresReferenciaPersonal.setText("<<");
        this.jButtonAnterioresReferenciaPersonal.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresReferenciaPersonal,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesReferenciaPersonal = new JButtonMe();
		//this.jButtonSiguientesReferenciaPersonal.setText(">>");
        this.jButtonSiguientesReferenciaPersonal.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesReferenciaPersonal,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosReferenciaPersonal = new JButtonMe();
		this.jButtonNuevoGuardarCambiosReferenciaPersonal.setText("Nue");
        this.jButtonNuevoGuardarCambiosReferenciaPersonal.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosReferenciaPersonal,"nuevoguardarcambios_button","Nue",this.referenciapersonalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosReferenciaPersonal";
		inputMap = this.jButtonNuevoGuardarCambiosReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosReferenciaPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosReferenciaPersonal"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionReferenciaPersonal";
		inputMap = this.jButtonRecargarInformacionReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionReferenciaPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionReferenciaPersonal"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesReferenciaPersonal";
		inputMap = this.jButtonSiguientesReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesReferenciaPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesReferenciaPersonal"));
		
		//ANTERIORES		
		sMapKey = "AnterioresReferenciaPersonal";
		inputMap = this.jButtonAnterioresReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresReferenciaPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresReferenciaPersonal"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasReferenciaPersonal();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesReferenciaPersonal.setMinimumSize(new Dimension(this.getWidth(),ReferenciaPersonalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReferenciaPersonalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesReferenciaPersonal.setMaximumSize(new Dimension(this.getWidth(),ReferenciaPersonalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReferenciaPersonalBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesReferenciaPersonal.setPreferredSize(new Dimension(this.getWidth(),ReferenciaPersonalBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ReferenciaPersonalBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionReferenciaPersonal = new GridBagLayout();

			this.jPanelPaginacionReferenciaPersonal.setLayout(gridaBagLayoutPaginacionReferenciaPersonal);						
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.gridy = 0;
			this.gridBagConstraintsReferenciaPersonal.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionReferenciaPersonal.add(this.jButtonAnterioresReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
					
						
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsReferenciaPersonal.gridy = 0;
			
			this.jPanelPaginacionReferenciaPersonal.add(this.jButtonNuevoGuardarCambiosReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
						
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsReferenciaPersonal.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsReferenciaPersonal.gridy = 0;
			this.jPanelPaginacionReferenciaPersonal.add(this.jButtonSiguientesReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.gridy = 1;
			this.gridBagConstraintsReferenciaPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferenciaPersonal.add(this.jButtonNuevoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
						
			
			
			if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
				this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsReferenciaPersonal.gridy = 1;
				this.gridBagConstraintsReferenciaPersonal.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionReferenciaPersonal.add(this.jButtonGuardarCambiosTablaReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
			}
			
			
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.gridy = 1;
			this.gridBagConstraintsReferenciaPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferenciaPersonal.add(this.jButtonDuplicarReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.gridy = 1;
			this.gridBagConstraintsReferenciaPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferenciaPersonal.add(this.jButtonCopiarReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.gridy = 1;
			this.gridBagConstraintsReferenciaPersonal.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionReferenciaPersonal.add(this.jButtonVerFormReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.gridy = 1;
			this.gridBagConstraintsReferenciaPersonal.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionReferenciaPersonal.add(this.jButtonCerrarReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		
		
		
		this.jButtonRecargarInformacionReferenciaPersonal.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionReferenciaPersonal.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionReferenciaPersonal.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesReferenciaPersonal.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesReferenciaPersonal.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesReferenciaPersonal.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesReferenciaPersonal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesReferenciaPersonal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesReferenciaPersonal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesReferenciaPersonal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesReferenciaPersonal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesReferenciaPersonal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionReferenciaPersonal.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionReferenciaPersonal.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionReferenciaPersonal.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesReferenciaPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesReferenciaPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesReferenciaPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesReferenciaPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferenciaPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferenciaPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarReferenciaPersonal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarReferenciaPersonal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarReferenciaPersonal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaReferenciaPersonal.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaReferenciaPersonal.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaReferenciaPersonal.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteReferenciaPersonal.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteReferenciaPersonal.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteReferenciaPersonal.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosReferenciaPersonal.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosReferenciaPersonal.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosReferenciaPersonal.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosReferenciaPersonal.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosReferenciaPersonal.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosReferenciaPersonal.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesReferenciaPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesReferenciaPersonal = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ReferenciaPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ReferenciaPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ReferenciaPersonal = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ReferenciaPersonal = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesReferenciaPersonal.setLayout(gridaBagParametrosReportesReferenciaPersonal);
			this.jPanelParametrosReportesAccionesReferenciaPersonal.setLayout(gridaBagParametrosReportesAccionesReferenciaPersonal);
			
			
			this.jPanelParametrosAuxiliar1ReferenciaPersonal.setLayout(gridaBagParametrosAuxiliar1ReferenciaPersonal);
			this.jPanelParametrosAuxiliar2ReferenciaPersonal.setLayout(gridaBagParametrosAuxiliar2ReferenciaPersonal);
			this.jPanelParametrosAuxiliar3ReferenciaPersonal.setLayout(gridaBagParametrosAuxiliar3ReferenciaPersonal);
			this.jPanelParametrosAuxiliar4ReferenciaPersonal.setLayout(gridaBagParametrosAuxiliar4ReferenciaPersonal);
			//this.jPanelParametrosAuxiliar5ReferenciaPersonal.setLayout(gridaBagParametrosAuxiliar2ReferenciaPersonal);			
			
			
			
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferenciaPersonal.add(this.jButtonRecargarInformacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaPersonal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ReferenciaPersonal.add(this.jComboBoxTiposPaginacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaPersonal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ReferenciaPersonal.add(this.jCheckBoxConAltoMaximoTablaReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaPersonal.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ReferenciaPersonal.add(this.jComboBoxTiposArchivosReportesReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferenciaPersonal.add(this.jPanelParametrosAuxiliar1ReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaPersonal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ReferenciaPersonal.add(this.jComboBoxTiposReportesReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferenciaPersonal.add(this.jPanelParametrosAuxiliar4ReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaPersonal.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferenciaPersonal.add(this.jComboBoxTiposReportesReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaPersonal.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReferenciaPersonal.add(this.jCheckBoxGenerarReporteReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferenciaPersonal.add(this.jPanelParametrosAuxiliar2ReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaPersonal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReferenciaPersonal.add(this.jLabelAccionesReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
				this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsReferenciaPersonal.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesReferenciaPersonal.add(this.jButtonAbrirOrderByReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferenciaPersonal.add(this.jComboBoxTiposSeleccionarReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);			
			
			
			/*
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaPersonal.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesReferenciaPersonal.add(this.jCheckBoxSeleccionarTodosReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaPersonal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ReferenciaPersonal.add(this.jCheckBoxSeleccionarTodosReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);															
				
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsReferenciaPersonal.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ReferenciaPersonal.add(this.jCheckBoxSeleccionadosReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaPersonal.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesReferenciaPersonal.add(this.jPanelParametrosAuxiliar3ReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferenciaPersonal.add(this.jComboBoxTiposAccionesReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
	
				
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsReferenciaPersonal.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesReferenciaPersonal.add(this.jTextFieldValorCampoGeneralReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosReferenciaPersonal = new GridBagLayout();

			this.jScrollPanelDatosReferenciaPersonal.setLayout(gridaBagLayoutDatosReferenciaPersonal);
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.gridy = 0;
			this.gridBagConstraintsReferenciaPersonal.gridx = 0;
			
			this.jScrollPanelDatosReferenciaPersonal.add(this.jTableDatosReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosReferenciaPersonal.setViewportView(this.jTableDatosReferenciaPersonal);
		this.jTableDatosReferenciaPersonal.setFillsViewportHeight(true);
		this.jTableDatosReferenciaPersonal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesReferenciaPersonal= new GridBagLayout();
		this.jPanelAccionesReferenciaPersonal.setLayout(gridaBagLayoutAccionesReferenciaPersonal);
		
		
		/*	
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = 0;
		this.gridBagConstraintsReferenciaPersonal.gridx = 0;
			
		this.jPanelAccionesReferenciaPersonal.add(this.jButtonNuevoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCiudadReferenciaPersonal= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadReferenciaPersonal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadReferenciaPersonal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadReferenciaPersonal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadReferenciaPersonal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadReferenciaPersonal.setLayout(gridaBagLayoutFK_IdCiudadReferenciaPersonal);

		gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaPersonal.gridy = 0;
		gridBagConstraintsReferenciaPersonal.gridx = 0;
		jPanelFK_IdCiudadReferenciaPersonal.add(jLabelidciudadFK_IdCiudadReferenciaPersonal, gridBagConstraintsReferenciaPersonal);

		gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaPersonal.gridy = 0;
		gridBagConstraintsReferenciaPersonal.gridx = 1;
		jPanelFK_IdCiudadReferenciaPersonal.add(jComboBoxidciudadFK_IdCiudadReferenciaPersonal, gridBagConstraintsReferenciaPersonal);

		gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaPersonal.gridy = 1;
		gridBagConstraintsReferenciaPersonal.gridx =1;
		jPanelFK_IdCiudadReferenciaPersonal.add(jButtonFK_IdCiudadReferenciaPersonal, gridBagConstraintsReferenciaPersonal);

		jTabbedPaneBusquedasReferenciaPersonal.addTab("1.-Por Ciudad ", jPanelFK_IdCiudadReferenciaPersonal);
		jTabbedPaneBusquedasReferenciaPersonal.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteReferenciaPersonal= new GridBagLayout();
		gridaBagLayoutFK_IdClienteReferenciaPersonal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteReferenciaPersonal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteReferenciaPersonal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteReferenciaPersonal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteReferenciaPersonal.setLayout(gridaBagLayoutFK_IdClienteReferenciaPersonal);

		gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaPersonal.gridy = 0;
		gridBagConstraintsReferenciaPersonal.gridx = 0;
		jPanelFK_IdClienteReferenciaPersonal.add(jLabelidclienteFK_IdClienteReferenciaPersonal, gridBagConstraintsReferenciaPersonal);

		gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaPersonal.gridy = 0;
		gridBagConstraintsReferenciaPersonal.gridx = 1;
		jPanelFK_IdClienteReferenciaPersonal.add(jComboBoxidclienteFK_IdClienteReferenciaPersonal, gridBagConstraintsReferenciaPersonal);


		gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.EAST;
		gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.NONE;
		gridBagConstraintsReferenciaPersonal.gridy = 0;
		gridBagConstraintsReferenciaPersonal.gridx = 0;
		jPanelFK_IdClienteReferenciaPersonal.add(this.jButtonBuscarFK_IdClienteidclienteReferenciaPersonal, gridBagConstraintsReferenciaPersonal);

		gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaPersonal.gridy = 1;
		gridBagConstraintsReferenciaPersonal.gridx =1;
		jPanelFK_IdClienteReferenciaPersonal.add(jButtonFK_IdClienteReferenciaPersonal, gridBagConstraintsReferenciaPersonal);

		jTabbedPaneBusquedasReferenciaPersonal.addTab("2.-Por Cliente ", jPanelFK_IdClienteReferenciaPersonal);
		jTabbedPaneBusquedasReferenciaPersonal.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPaisReferenciaPersonal= new GridBagLayout();
		gridaBagLayoutFK_IdPaisReferenciaPersonal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisReferenciaPersonal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisReferenciaPersonal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisReferenciaPersonal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisReferenciaPersonal.setLayout(gridaBagLayoutFK_IdPaisReferenciaPersonal);

		gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaPersonal.gridy = 0;
		gridBagConstraintsReferenciaPersonal.gridx = 0;
		jPanelFK_IdPaisReferenciaPersonal.add(jLabelid_paisFK_IdPaisReferenciaPersonal, gridBagConstraintsReferenciaPersonal);

		gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaPersonal.gridy = 0;
		gridBagConstraintsReferenciaPersonal.gridx = 1;
		jPanelFK_IdPaisReferenciaPersonal.add(jComboBoxid_paisFK_IdPaisReferenciaPersonal, gridBagConstraintsReferenciaPersonal);

		gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaPersonal.gridy = 1;
		gridBagConstraintsReferenciaPersonal.gridx =1;
		jPanelFK_IdPaisReferenciaPersonal.add(jButtonFK_IdPaisReferenciaPersonal, gridBagConstraintsReferenciaPersonal);

		jTabbedPaneBusquedasReferenciaPersonal.addTab("3.-Por Pais ", jPanelFK_IdPaisReferenciaPersonal);
		jTabbedPaneBusquedasReferenciaPersonal.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoReferenciaPersonalReferenciaPersonal= new GridBagLayout();
		gridaBagLayoutFK_IdTipoReferenciaPersonalReferenciaPersonal.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoReferenciaPersonalReferenciaPersonal.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoReferenciaPersonalReferenciaPersonal.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoReferenciaPersonalReferenciaPersonal.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal.setLayout(gridaBagLayoutFK_IdTipoReferenciaPersonalReferenciaPersonal);

		gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaPersonal.gridy = 0;
		gridBagConstraintsReferenciaPersonal.gridx = 0;
		jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal.add(jLabelidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal, gridBagConstraintsReferenciaPersonal);

		gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaPersonal.gridy = 0;
		gridBagConstraintsReferenciaPersonal.gridx = 1;
		jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal.add(jComboBoxidvalorclientereferenciapersonalFK_IdTipoReferenciaPersonalReferenciaPersonal, gridBagConstraintsReferenciaPersonal);

		gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.WEST;
		gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsReferenciaPersonal.gridy = 1;
		gridBagConstraintsReferenciaPersonal.gridx =1;
		jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal.add(jButtonFK_IdTipoReferenciaPersonalReferenciaPersonal, gridBagConstraintsReferenciaPersonal);

		jTabbedPaneBusquedasReferenciaPersonal.addTab("4.-Por Tipo Refe Perso ", jPanelFK_IdTipoReferenciaPersonalReferenciaPersonal);
		jTabbedPaneBusquedasReferenciaPersonal.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutReferenciaPersonal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutReferenciaPersonal);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();						
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReferenciaPersonal.gridx = 0;		
			//this.gridBagConstraintsReferenciaPersonal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsReferenciaPersonal.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy = iGridyPrincipal++;
		this.gridBagConstraintsReferenciaPersonal.gridx = 0;		
		//this.gridBagConstraintsReferenciaPersonal.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsReferenciaPersonal.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsReferenciaPersonal);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsReferenciaPersonal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReferenciaPersonal.gridx = 0;		
			this.gridBagConstraintsReferenciaPersonal.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsReferenciaPersonal.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaPersonal.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);								
		
		
		/*
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaPersonal.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		*/		
		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsReferenciaPersonal.gridx =0;
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsReferenciaPersonal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
				
		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaPersonal.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ReferenciaPersonalJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosReferenciaPersonal= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosReferenciaPersonal = new GridBagLayout();
			this.jPanelBusquedasParametrosReferenciaPersonal.setLayout(gridaBagLayoutBusquedasParametrosReferenciaPersonal);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralReferenciaPersonal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralReferenciaPersonal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferenciaPersonal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferenciaPersonal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
			
			
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaPersonal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		
			
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsReferenciaPersonal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralReferenciaPersonal;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoReferenciaPersonal() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoReferenciaPersonal = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoReferenciaPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoReferenciaPersonal.setName("jPanelReporteDinamicoReferenciaPersonal"); 
		
		this.jPanelReporteDinamicoReferenciaPersonal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoReferenciaPersonal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoReferenciaPersonal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoReferenciaPersonal.setLayout(gridaBagLayoutReporteDinamicoReferenciaPersonal);
		
		
		this.jInternalFrameReporteDinamicoReferenciaPersonal= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoReferenciaPersonal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteReferenciaPersonal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoReferenciaPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoReferenciaPersonal.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoReferenciaPersonal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoReferenciaPersonal.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoReferenciaPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoReferenciaPersonal.setResizable(true);
	    this.jInternalFrameReporteDinamicoReferenciaPersonal.setClosable(true);
	    this.jInternalFrameReporteDinamicoReferenciaPersonal.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoReferenciaPersonal.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoReferenciaPersonal.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoReferenciaPersonal.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Personales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteReferenciaPersonal = new JLabelMe();

		this.jLabelColumnasSelectReporteReferenciaPersonal.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoReferenciaPersonal.add(this.jLabelColumnasSelectReporteReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteReferenciaPersonal = new JList<Reporte>();
		this.jListColumnasSelectReporteReferenciaPersonal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteReferenciaPersonal.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteReferenciaPersonal.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteReferenciaPersonal.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteReferenciaPersonal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteReferenciaPersonal=new JScrollPane(this.jListColumnasSelectReporteReferenciaPersonal);
			
			this.jScrollColumnasSelectReporteReferenciaPersonal.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteReferenciaPersonal.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteReferenciaPersonal.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoReferenciaPersonal.add(this.jListColumnasSelectReporteReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		this.jPanelReporteDinamicoReferenciaPersonal.add(this.jScrollColumnasSelectReporteReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteReferenciaPersonal = new JLabelMe();

		this.jLabelRelacionesSelectReporteReferenciaPersonal.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteReferenciaPersonal = new JList<Reporte>();
		this.jListRelacionesSelectReporteReferenciaPersonal.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteReferenciaPersonal.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteReferenciaPersonal.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteReferenciaPersonal.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteReferenciaPersonal.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteReferenciaPersonal=new JScrollPane(this.jListRelacionesSelectReporteReferenciaPersonal);
			
			this.jScrollRelacionesSelectReporteReferenciaPersonal.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteReferenciaPersonal.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteReferenciaPersonal.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoReferenciaPersonal = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoReferenciaPersonal = new JComboBoxMe();
		this.jListColumnasValoresGraficoReferenciaPersonal = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoReferenciaPersonal = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoReferenciaPersonal.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoReferenciaPersonal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoReferenciaPersonal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoReferenciaPersonal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoReferenciaPersonal = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoReferenciaPersonal.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoReferenciaPersonal.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoReferenciaPersonal.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoReferenciaPersonal.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoReferenciaPersonal = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoReferenciaPersonal.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaPersonal.add(this.jLabelGenerarExcelReporteDinamicoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoReferenciaPersonal = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoReferenciaPersonal.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoReferenciaPersonal,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoReferenciaPersonal.setToolTipText("Generar EXCEL"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		//this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsReferenciaPersonal.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsReferenciaPersonal.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoReferenciaPersonal.add(this.jButtonGenerarExcelReporteDinamicoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferenciaPersonal.add(this.jComboBoxTiposReportesDinamicoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoReferenciaPersonal = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoReferenciaPersonal.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoReferenciaPersonal.add(this.jLabelTiposArchivoReporteDinamicoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferenciaPersonal.add(this.jComboBoxTiposArchivosReportesDinamicoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoReferenciaPersonal = new JButtonMe();
		this.jButtonGenerarReporteDinamicoReferenciaPersonal.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoReferenciaPersonal,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoReferenciaPersonal.setToolTipText("Generar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferenciaPersonal.add(this.jButtonGenerarReporteDinamicoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoReferenciaPersonal = new JButtonMe();
		this.jButtonCerrarReporteDinamicoReferenciaPersonal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoReferenciaPersonal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoReferenciaPersonal.setToolTipText("Cancelar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoReferenciaPersonal.add(this.jButtonCerrarReporteDinamicoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalReferenciaPersonal = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoReferenciaPersonal= new JScrollPane(jPanelReporteDinamicoReferenciaPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoReferenciaPersonal.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoReferenciaPersonal.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoReferenciaPersonal.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Personales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsReferenciaPersonal.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoReferenciaPersonal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoReferenciaPersonal.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalReferenciaPersonal);
		this.jInternalFrameReporteDinamicoReferenciaPersonal.getContentPane().add(this.jScrollPanelReporteDinamicoReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionReferenciaPersonal() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionReferenciaPersonal = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionReferenciaPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionReferenciaPersonal.setName("jPanelImportacionReferenciaPersonal"); 
		
		this.jPanelImportacionReferenciaPersonal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionReferenciaPersonal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionReferenciaPersonal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionReferenciaPersonal.setLayout(gridaBagLayoutImportacionReferenciaPersonal);
		
		
		this.jInternalFrameImportacionReferenciaPersonal= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionReferenciaPersonal= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionReferenciaPersonal = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteReferenciaPersonal= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionReferenciaPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionReferenciaPersonal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionReferenciaPersonal.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionReferenciaPersonal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionReferenciaPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionReferenciaPersonal.setResizable(true);
	    this.jInternalFrameImportacionReferenciaPersonal.setClosable(true);
	    this.jInternalFrameImportacionReferenciaPersonal.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionReferenciaPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionReferenciaPersonal.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionReferenciaPersonal.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionReferenciaPersonal.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionReferenciaPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionReferenciaPersonal.setResizable(true);
	    this.jInternalFrameImportacionReferenciaPersonal.setClosable(true);
	    this.jInternalFrameImportacionReferenciaPersonal.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionReferenciaPersonal.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionReferenciaPersonal.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionReferenciaPersonal.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Personales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionReferenciaPersonal = new JLabelMe();

		this.jLabelArchivoImportacionReferenciaPersonal.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = iPosYImportacion;		
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionReferenciaPersonal.add(this.jLabelArchivoImportacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionReferenciaPersonal = new JFileChooser();		
		this.jFileChooserImportacionReferenciaPersonal.setToolTipText("ESCOGER ARCHIVO"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionReferenciaPersonal = new JButtonMe();
		this.jButtonAbrirImportacionReferenciaPersonal.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionReferenciaPersonal,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionReferenciaPersonal.setToolTipText("Generar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferenciaPersonal.add(this.jButtonAbrirImportacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionReferenciaPersonal = new JLabelMe();

		this.jLabelPathArchivoImportacionReferenciaPersonal.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionReferenciaPersonal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionReferenciaPersonal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionReferenciaPersonal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = iPosYImportacion;		
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXImportacion++;
			
		this.jPanelImportacionReferenciaPersonal.add(this.jLabelPathArchivoImportacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionReferenciaPersonal=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionReferenciaPersonal.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionReferenciaPersonal.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionReferenciaPersonal.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferenciaPersonal.add(this.jTextFieldPathArchivoImportacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionReferenciaPersonal = new JButtonMe();
		this.jButtonGenerarImportacionReferenciaPersonal.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionReferenciaPersonal,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionReferenciaPersonal.setToolTipText("Generar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferenciaPersonal.add(this.jButtonGenerarImportacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionReferenciaPersonal = new JButtonMe();
		this.jButtonCerrarImportacionReferenciaPersonal.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionReferenciaPersonal,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionReferenciaPersonal.setToolTipText("Cancelar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferenciaPersonal.gridy = iPosYImportacion;
		this.gridBagConstraintsReferenciaPersonal.gridx = iPosXImportacion++;
							
		this.jPanelImportacionReferenciaPersonal.add(this.jButtonCerrarImportacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalReferenciaPersonal = new GridBagLayout();
		
		this.jScrollPanelImportacionReferenciaPersonal= new JScrollPane(jPanelImportacionReferenciaPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
		this.gridBagConstraintsReferenciaPersonal.gridy =iPosYImportacion;
		this.gridBagConstraintsReferenciaPersonal.gridx =iPosXImportacion;
		this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionReferenciaPersonal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionReferenciaPersonal.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalReferenciaPersonal);
		this.jInternalFrameImportacionReferenciaPersonal.getContentPane().add(this.jScrollPanelImportacionReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByReferenciaPersonal(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByReferenciaPersonal = new JButtonMe();
			this.jButtonAbrirOrderByReferenciaPersonal.setText("Orden");
			this.jButtonAbrirOrderByReferenciaPersonal.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByReferenciaPersonal,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByReferenciaPersonal";
			inputMap = this.jButtonAbrirOrderByReferenciaPersonal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByReferenciaPersonal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByReferenciaPersonal"));
		
		
			GridBagLayout gridaBagLayoutOrderByReferenciaPersonal = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByReferenciaPersonal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByReferenciaPersonal.setName("jPanelOrderByReferenciaPersonal"); 
			
			this.jPanelOrderByReferenciaPersonal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByReferenciaPersonal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByReferenciaPersonal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByReferenciaPersonal.setLayout(gridaBagLayoutOrderByReferenciaPersonal);
			
			
			this.jTableDatosReferenciaPersonalOrderBy = new JTableMe();        
			this.jTableDatosReferenciaPersonalOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosReferenciaPersonalOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosReferenciaPersonalOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosReferenciaPersonalOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosReferenciaPersonalOrderBy.setViewportView(this.jTableDatosReferenciaPersonalOrderBy);
			this.jTableDatosReferenciaPersonalOrderBy.setFillsViewportHeight(true);
			this.jTableDatosReferenciaPersonalOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByReferenciaPersonal= new OrderByJInternalFrame();
			this.jInternalFrameOrderByReferenciaPersonal= new OrderByJInternalFrame();
			this.jScrollPanelOrderByReferenciaPersonal = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteReferenciaPersonal= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByReferenciaPersonal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByReferenciaPersonal.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByReferenciaPersonal.setTitle("Orden");
			this.jInternalFrameOrderByReferenciaPersonal.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByReferenciaPersonal.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByReferenciaPersonal.setResizable(true);
			this.jInternalFrameOrderByReferenciaPersonal.setClosable(true);
			this.jInternalFrameOrderByReferenciaPersonal.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByReferenciaPersonal.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByReferenciaPersonal.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByReferenciaPersonal.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByReferenciaPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencia Personales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.gridy =iPosYOrderBy++;
			this.gridBagConstraintsReferenciaPersonal.gridx =iPosXOrderBy;
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsReferenciaPersonal.ipady =150;
				
			this.jPanelOrderByReferenciaPersonal.add(jScrollPanelDatosReferenciaPersonalOrderBy, this.gridBagConstraintsReferenciaPersonal);//this.jTableDatosReferenciaPersonalTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByReferenciaPersonal = new JButtonMe();
			this.jButtonCerrarOrderByReferenciaPersonal.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByReferenciaPersonal,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByReferenciaPersonal.setToolTipText("Cancelar"+" "+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByReferenciaPersonal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferenciaPersonal.gridy = iPosYOrderBy++;
			this.gridBagConstraintsReferenciaPersonal.gridx = iPosXOrderBy;
									
			this.jPanelOrderByReferenciaPersonal.add(this.jButtonCerrarOrderByReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalReferenciaPersonal = new GridBagLayout();
			
			this.jScrollPanelOrderByReferenciaPersonal= new JScrollPane(jPanelOrderByReferenciaPersonal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsReferenciaPersonal = new GridBagConstraints();
			this.gridBagConstraintsReferenciaPersonal.gridy =iPosYOrderBy;
			this.gridBagConstraintsReferenciaPersonal.gridx =iPosXOrderBy;
			this.gridBagConstraintsReferenciaPersonal.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByReferenciaPersonal.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByReferenciaPersonal.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalReferenciaPersonal);
			
			this.jInternalFrameOrderByReferenciaPersonal.getContentPane().add(this.jScrollPanelOrderByReferenciaPersonal, this.gridBagConstraintsReferenciaPersonal);			
		
		} else {
			this.jButtonAbrirOrderByReferenciaPersonal = new JButtonMe();
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
		int iWidthTableCalculado=0;//4230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.referenciapersonalSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosReferenciaPersonal.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosReferenciaPersonal.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosReferenciaPersonal.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosReferenciaPersonal.getRowHeight();//ReferenciaPersonalConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ReferenciaPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaReferenciaPersonal.isSelected()) {
					iHeightTable=ReferenciaPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ReferenciaPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ReferenciaPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ReferenciaPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaReferenciaPersonal.isSelected()) {
					iHeightTable=ReferenciaPersonalConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ReferenciaPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ReferenciaPersonalConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosReferenciaPersonal.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosReferenciaPersonal.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosReferenciaPersonal.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosReferenciaPersonal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosReferenciaPersonal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosReferenciaPersonal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByReferenciaPersonal!=null && this.jInternalFrameOrderByReferenciaPersonal.getjTableDatosOrderBy()!=null) {
			//if(!this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByReferenciaPersonal.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByReferenciaPersonal.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByReferenciaPersonal.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByReferenciaPersonal.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByReferenciaPersonal.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByReferenciaPersonal.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByReferenciaPersonal.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosReferenciaPersonal.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosReferenciaPersonal.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosReferenciaPersonal.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=referenciapersonalLogic.getReferenciaPersonals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=referenciapersonals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ReferenciaPersonal> TraerReferenciaPersonalBeans(List<ReferenciaPersonal> referenciapersonals,ArrayList<Classe> classes)throws Exception {
		try {
			for(ReferenciaPersonal referenciapersonal:referenciapersonals) {
					
				if(!(ReferenciaPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ReferenciaPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					referenciapersonal.setsDetalleGeneralEntityReporte(ReferenciaPersonalConstantesFunciones.getReferenciaPersonalDescripcion(referenciapersonal));
										
					referenciapersonal.setesta_trabajando_descripcion(ReferenciaPersonalConstantesFunciones.getesta_trabajandoDescripcion(referenciapersonal));referenciapersonal.setesactivo_descripcion(ReferenciaPersonalConstantesFunciones.getesactivoDescripcion(referenciapersonal));	
					
						
					
				} else  {
							
					//referenciapersonal.setsDetalleGeneralEntityReporte(referenciapersonal.getsDetalleGeneralEntityReporte());
										
				}
				
				//referenciapersonalbeans.add(referenciapersonalbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return referenciapersonals;
    }
	//PARA REPORTES FIN
}
