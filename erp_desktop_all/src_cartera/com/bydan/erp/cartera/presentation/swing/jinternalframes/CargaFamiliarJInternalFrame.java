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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.cartera.util.CargaFamiliarConstantesFunciones;

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
public class CargaFamiliarJInternalFrame extends CargaFamiliarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCargaFamiliar;
	
	protected JMenuBar jmenuBarCargaFamiliar;
	
	protected JMenu jmenuCargaFamiliar;
	protected JMenu jmenuDatosCargaFamiliar;
	protected JMenu jmenuArchivoCargaFamiliar;
	protected JMenu jmenuAccionesCargaFamiliar;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCargaFamiliar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCargaFamiliar;	
	protected GridBagConstraints gridBagConstraintsCargaFamiliar;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CargaFamiliarDetalleFormJInternalFrame jInternalFrameDetalleFormCargaFamiliar;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCargaFamiliar;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCargaFamiliar;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoCargaFamiBeanSwingJInternalFrame tipocargafamiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocargafami="";

	protected TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogenero="";

	protected EstadoCivilBeanSwingJInternalFrame estadocivilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocivil="";
	
	public CargaFamiliarSessionBean cargafamiliarSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoCargaFamiSessionBean tipocargafamiSessionBean;
	public TipoGeneroSessionBean tipogeneroSessionBean;
	public EstadoCivilSessionBean estadocivilSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CargaFamiliar> cargafamiliars;		
	public List<CargaFamiliar> cargafamiliarsEliminados;	
	public List<CargaFamiliar> cargafamiliarsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCargaFamiliar;		
	protected JButton jButtonAbrirOrderByCargaFamiliar;
	
	
	//protected JPanel jPanelOrderByCargaFamiliar;
	//public JScrollPane jScrollPanelOrderByCargaFamiliar;	
	//protected JButton jButtonCerrarOrderByCargaFamiliar;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CargaFamiliarLogic cargafamiliarLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCargaFamiliar;
	public JScrollPane jScrollPanelDatosEdicionCargaFamiliar;
	public JScrollPane jScrollPanelDatosGeneralCargaFamiliar;
    
	
	
	//public JScrollPane jScrollPanelDatosCargaFamiliarOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCargaFamiliar;
	//public JScrollPane jScrollPanelImportacionCargaFamiliar;
	
	
	
	protected JPanel jPanelAccionesCargaFamiliar;
	
    protected JPanel jPanelPaginacionCargaFamiliar;
    protected JPanel jPanelParametrosReportesCargaFamiliar;
	protected JPanel jPanelParametrosReportesAccionesCargaFamiliar;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CargaFamiliar;
	protected JPanel jPanelParametrosAuxiliar2CargaFamiliar;
	protected JPanel jPanelParametrosAuxiliar3CargaFamiliar;
	protected JPanel jPanelParametrosAuxiliar4CargaFamiliar;
	//protected JPanel jPanelParametrosAuxiliar5CargaFamiliar;
	
	
	
	//protected JPanel jPanelReporteDinamicoCargaFamiliar;
	//protected JPanel jPanelImportacionCargaFamiliar;
	
	
	public JTable jTableDatosCargaFamiliar;
	
	
	
	//public JTable jTableDatosCargaFamiliarOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCargaFamiliar;
	protected JButton jButtonDuplicarCargaFamiliar;
	protected JButton jButtonCopiarCargaFamiliar;
	protected JButton jButtonVerFormCargaFamiliar;
	protected JButton jButtonNuevoRelacionesCargaFamiliar;
	protected JButton jButtonModificarCargaFamiliar;
	
    protected JButton jButtonGuardarCambiosTablaCargaFamiliar;
	protected JButton jButtonCerrarCargaFamiliar;
	
	
	protected JButton jButtonRecargarInformacionCargaFamiliar;
	protected JButton jButtonProcesarInformacionCargaFamiliar;
	
	
	protected JButton jButtonAnterioresCargaFamiliar;
	protected JButton jButtonSiguientesCargaFamiliar;
	protected JButton jButtonNuevoGuardarCambiosCargaFamiliar;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCargaFamiliar;
	//protected JButton jButtonCerrarReporteDinamicoCargaFamiliar;
	//protected JButton jButtonGenerarExcelReporteDinamicoCargaFamiliar;	
	
	
	
	//protected JButton jButtonAbrirImportacionCargaFamiliar;
	//protected JButton jButtonGenerarImportacionCargaFamiliar;
	//protected JButton jButtonCerrarImportacionCargaFamiliar;
	//protected JFileChooser jFileChooserImportacionCargaFamiliar;
	//protected File fileImportacionCargaFamiliar;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCargaFamiliar;
	protected JButton jButtonDuplicarToolBarCargaFamiliar;
	protected JButton jButtonNuevoRelacionesToolBarCargaFamiliar;
	
	
	public JButton jButtonGuardarCambiosToolBarCargaFamiliar;
	protected JButton jButtonCopiarToolBarCargaFamiliar;
	protected JButton jButtonVerFormToolBarCargaFamiliar;
	public JButton jButtonGuardarCambiosTablaToolBarCargaFamiliar;
	protected JButton jButtonMostrarOcultarTablaToolBarCargaFamiliar;
	protected JButton jButtonCerrarToolBarCargaFamiliar;
	
	protected JButton jButtonRecargarInformacionToolBarCargaFamiliar;
	protected JButton jButtonProcesarInformacionToolBarCargaFamiliar;
	protected JButton jButtonAnterioresToolBarCargaFamiliar;
	protected JButton jButtonSiguientesToolBarCargaFamiliar;
	protected JButton jButtonNuevoGuardarCambiosToolBarCargaFamiliar;
	protected JButton jButtonAbrirOrderByToolBarCargaFamiliar;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCargaFamiliar;
	protected JMenuItem jMenuItemDuplicarCargaFamiliar;
	protected JMenuItem jMenuItemNuevoRelacionesCargaFamiliar;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCargaFamiliar;
	protected JMenuItem jMenuItemCopiarCargaFamiliar;
	protected JMenuItem jMenuItemVerFormCargaFamiliar;
	protected JMenuItem jMenuItemGuardarCambiosTablaCargaFamiliar;
	protected JMenuItem jMenuItemCerrarCargaFamiliar;
	protected JMenuItem jMenuItemDetalleCerrarCargaFamiliar;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCargaFamiliar;
	protected JMenuItem jMenuItemDetalleMostarOcultarCargaFamiliar;
	
	protected JMenuItem jMenuItemRecargarInformacionCargaFamiliar;
	protected JMenuItem jMenuItemProcesarInformacionCargaFamiliar;
	protected JMenuItem jMenuItemAnterioresCargaFamiliar;
	protected JMenuItem jMenuItemSiguientesCargaFamiliar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCargaFamiliar;
	protected JMenuItem jMenuItemAbrirOrderByCargaFamiliar;
	protected JMenuItem jMenuItemMostrarOcultarCargaFamiliar;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCargaFamiliar;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCargaFamiliar;
	protected JCheckBox jCheckBoxSeleccionadosCargaFamiliar;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCargaFamiliar;
	protected JCheckBox jCheckBoxConGraficoReporteCargaFamiliar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCargaFamiliar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCargaFamiliar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCargaFamiliar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCargaFamiliar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCargaFamiliar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCargaFamiliar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCargaFamiliar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCargaFamiliar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCargaFamiliar;
	protected JTextField jTextFieldValorCampoGeneralCargaFamiliar;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCargaFamiliar;
	//public JList<Reporte> jListColumnasSelectReporteCargaFamiliar;
	//public JScrollPane jScrollColumnasSelectReporteCargaFamiliar;
	
	//public JLabel jLabelRelacionesSelectReporteCargaFamiliar;
	//public JList<Reporte> jListRelacionesSelectReporteCargaFamiliar;
	//public JScrollPane jScrollRelacionesSelectReporteCargaFamiliar;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCargaFamiliar;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCargaFamiliar;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCargaFamiliar;
	//public JLabel jLabelTiposArchivoReporteDinamicoCargaFamiliar;
	
		
	//public JLabel jLabelArchivoImportacionCargaFamiliar;	
	//public JLabel jLabelPathArchivoImportacionCargaFamiliar;
	//protected JTextField jTextFieldPathArchivoImportacionCargaFamiliar;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCargaFamiliar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCargaFamiliar;
	
	//public JLabel jLabelColumnaCategoriaValorCargaFamiliar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCargaFamiliar;
	
	//public JLabel jLabelColumnasValoresGraficoCargaFamiliar;
	//public JList<Reporte> jListColumnasValoresGraficoCargaFamiliar;
	//public JScrollPane jScrollColumnasValoresGraficoCargaFamiliar;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCargaFamiliar;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCargaFamiliar;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCargaFamiliar;
	public JPanel jPanelFK_IdClienteCargaFamiliar;
	public JButton jButtonFK_IdClienteCargaFamiliar;
	public JPanel jPanelFK_IdEstadoCivilCargaFamiliar;
	public JButton jButtonFK_IdEstadoCivilCargaFamiliar;
	public JPanel jPanelFK_IdTipoCargaFamiCargaFamiliar;
	public JButton jButtonFK_IdTipoCargaFamiCargaFamiliar;
	public JPanel jPanelFK_IdTipoGeneroCargaFamiliar;
	public JButton jButtonFK_IdTipoGeneroCargaFamiliar;
	
	public JPanel jPanelid_clienteFK_IdClienteCargaFamiliar;
	public JLabel jLabelid_clienteFK_IdClienteCargaFamiliar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteCargaFamiliar;
	public JButton jButtonid_clienteFK_IdClienteCargaFamiliar= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteCargaFamiliarUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteCargaFamiliarBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteCargaFamiliar;
	
	public JPanel jPanelid_estado_civilFK_IdEstadoCivilCargaFamiliar;
	public JLabel jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar;
	public JButton jButtonid_estado_civilFK_IdEstadoCivilCargaFamiliar= new JButtonMe();
	public JButton jButtonid_estado_civilFK_IdEstadoCivilCargaFamiliarUpdate= new JButtonMe();
	public JButton jButtonid_estado_civilFK_IdEstadoCivilCargaFamiliarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar;
	public JLabel jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar;
	public JButton jButtonid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar= new JButtonMe();
	public JButton jButtonid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_generoFK_IdTipoGeneroCargaFamiliar;
	public JLabel jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar;
	public JButton jButtonid_tipo_generoFK_IdTipoGeneroCargaFamiliar= new JButtonMe();
	public JButton jButtonid_tipo_generoFK_IdTipoGeneroCargaFamiliarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_generoFK_IdTipoGeneroCargaFamiliarBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CargaFamiliarJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CargaFamiliar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargaFamiliarJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargaFamiliar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargaFamiliarJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargaFamiliar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargaFamiliarJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CargaFamiliar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCargaFamiliar)	{
		this.jButtonRecargarInformacionCargaFamiliar = jButtonRecargarInformacionCargaFamiliar;
	}
	
	public JButton getjButtonProcesarInformacionCargaFamiliar() {
		return this.jButtonProcesarInformacionCargaFamiliar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCargaFamiliar)	{
		this.jButtonProcesarInformacionCargaFamiliar = jButtonProcesarInformacionCargaFamiliar;
	}
	
	
	public JButton getjButtonRecargarInformacionCargaFamiliar() {
		return this.jButtonRecargarInformacionCargaFamiliar;
	}
	
	
	public List<CargaFamiliar> getcargafamiliars() {
		return this.cargafamiliars;
	}

	public void setcargafamiliars(List<CargaFamiliar> cargafamiliars) {
		this.cargafamiliars = cargafamiliars;
	}
	
	public List<CargaFamiliar> getcargafamiliarsAux() {
		return this.cargafamiliarsAux;
	}

	public void setcargafamiliarsAux(List<CargaFamiliar> cargafamiliarsAux) {
		this.cargafamiliarsAux = cargafamiliarsAux;
	}
	
	public List<CargaFamiliar> getcargafamiliarsEliminados() {
		return this.cargafamiliarsEliminados;
	}

	public void setCargaFamiliarsEliminados(List<CargaFamiliar> cargafamiliarsEliminados) {
		this.cargafamiliarsEliminados = cargafamiliarsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCargaFamiliar() {
		return jComboBoxTiposSeleccionarCargaFamiliar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCargaFamiliar(
			JComboBox jComboBoxTiposSeleccionarCargaFamiliar) {
		this.jComboBoxTiposSeleccionarCargaFamiliar = jComboBoxTiposSeleccionarCargaFamiliar;
	}
	
	public void setBorderResaltarTiposSeleccionarCargaFamiliar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCargaFamiliar.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCargaFamiliar .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCargaFamiliar() {
		return jTextFieldValorCampoGeneralCargaFamiliar;
	}

	public void setjTextFieldValorCampoGeneralCargaFamiliar(
			JTextField jTextFieldValorCampoGeneralCargaFamiliar) {
		this.jTextFieldValorCampoGeneralCargaFamiliar = jTextFieldValorCampoGeneralCargaFamiliar;
	}

	public void setBorderResaltarValorCampoGeneralCargaFamiliar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCargaFamiliar .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCargaFamiliar() {
		return this.jCheckBoxSeleccionarTodosCargaFamiliar;
	}

	public void setjCheckBoxSeleccionarTodosCargaFamiliar(
			JCheckBox jCheckBoxSeleccionarTodosCargaFamiliar) {
		this.jCheckBoxSeleccionarTodosCargaFamiliar = jCheckBoxSeleccionarTodosCargaFamiliar;
	}

	public void setBorderResaltarSeleccionarTodosCargaFamiliar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCargaFamiliar .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCargaFamiliar() {
		return this.jCheckBoxSeleccionadosCargaFamiliar;
	}

	public void setjCheckBoxSeleccionadosCargaFamiliar(
			JCheckBox jCheckBoxSeleccionadosCargaFamiliar) {
		this.jCheckBoxSeleccionadosCargaFamiliar = jCheckBoxSeleccionadosCargaFamiliar;
	}
	
	public void setBorderResaltarSeleccionadosCargaFamiliar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCargaFamiliar .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCargaFamiliar() {
		return this.jComboBoxTiposArchivosReportesCargaFamiliar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCargaFamiliar(
			JComboBox jComboBoxTiposArchivosReportesCargaFamiliar) {
		this.jComboBoxTiposArchivosReportesCargaFamiliar = jComboBoxTiposArchivosReportesCargaFamiliar;
	}

	public void setBorderResaltarTiposArchivosReportesCargaFamiliar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCargaFamiliar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCargaFamiliar() {
		return this.jComboBoxTiposReportesCargaFamiliar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCargaFamiliar(
			JComboBox jComboBoxTiposReportesCargaFamiliar) {
		this.jComboBoxTiposReportesCargaFamiliar = jComboBoxTiposReportesCargaFamiliar;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCargaFamiliar() {
	//	return jComboBoxTiposReportesDinamicoCargaFamiliar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCargaFamiliar(
	//		JComboBox jComboBoxTiposReportesDinamicoCargaFamiliar) {
	//	this.jComboBoxTiposReportesDinamicoCargaFamiliar = jComboBoxTiposReportesDinamicoCargaFamiliar;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCargaFamiliar() {
	//	return jComboBoxTiposArchivosReportesDinamicoCargaFamiliar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCargaFamiliar(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCargaFamiliar) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar = jComboBoxTiposArchivosReportesDinamicoCargaFamiliar;
	//}
	
	public void setBorderResaltarTiposReportesCargaFamiliar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCargaFamiliar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCargaFamiliar() {
		return this.jComboBoxTiposGraficosReportesCargaFamiliar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCargaFamiliar(
			JComboBox jComboBoxTiposGraficosReportesCargaFamiliar) {
		this.jComboBoxTiposGraficosReportesCargaFamiliar = jComboBoxTiposGraficosReportesCargaFamiliar;
	}
	
	public void setBorderResaltarTiposGraficosReportesCargaFamiliar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCargaFamiliar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCargaFamiliar() {
		return this.jComboBoxTiposPaginacionCargaFamiliar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCargaFamiliar(
			JComboBox jComboBoxTiposPaginacionCargaFamiliar) {
		this.jComboBoxTiposPaginacionCargaFamiliar = jComboBoxTiposPaginacionCargaFamiliar;
	}
	
	public void setBorderResaltarTiposPaginacionCargaFamiliar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCargaFamiliar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCargaFamiliar() {
		return this.jComboBoxTiposRelacionesCargaFamiliar;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCargaFamiliar() {
		return this.jComboBoxTiposAccionesCargaFamiliar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCargaFamiliar(
			JComboBox jComboBoxTiposRelacionesCargaFamiliar) {
		this.jComboBoxTiposRelacionesCargaFamiliar = jComboBoxTiposRelacionesCargaFamiliar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCargaFamiliar(
			JComboBox jComboBoxTiposAccionesCargaFamiliar) {
		this.jComboBoxTiposAccionesCargaFamiliar = jComboBoxTiposAccionesCargaFamiliar;
	}
	
	public void setBorderResaltarTiposRelacionesCargaFamiliar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCargaFamiliar .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCargaFamiliar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCargaFamiliar.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCargaFamiliar .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCargaFamiliar() {
	//	return jCheckBoxConGraficoDinamicoCargaFamiliar;
	//}

	//public void setjCheckBoxConGraficoDinamicoCargaFamiliar(
	//		JCheckBox jCheckBoxConGraficoDinamicoCargaFamiliar) {
	//	this.jCheckBoxConGraficoDinamicoCargaFamiliar = jCheckBoxConGraficoDinamicoCargaFamiliar;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCargaFamiliar() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCargaFamiliar.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCargaFamiliar .setBorder(borderResaltar);		
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
		this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
		
		this.cargafamiliarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cargafamiliarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cargafamiliarSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CargaFamiliarJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CargaFamiliarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CargaFamiliarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CargaFamiliarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CargaFamiliarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Carga Familiar MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
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
		
		CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CargaFamiliar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCargaFamiliar= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCargaFamiliar,this.jTtoolBarCargaFamiliar,
							"nuevo","nuevo","Nuevo"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCargaFamiliar,this.jTtoolBarCargaFamiliar,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCargaFamiliar,this.jTtoolBarCargaFamiliar,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCargaFamiliar,this.jTtoolBarCargaFamiliar,
							"duplicar","duplicar","Duplicar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCargaFamiliar,this.jTtoolBarCargaFamiliar,
							"copiar","copiar","Copiar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCargaFamiliar,this.jTtoolBarCargaFamiliar,
							"ver_form","ver_form","Ver"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCargaFamiliar,this.jTtoolBarCargaFamiliar,
							"recargar","recargar","Recargar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCargaFamiliar,this.jTtoolBarCargaFamiliar,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCargaFamiliar,this.jTtoolBarCargaFamiliar,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCargaFamiliar,this.jTtoolBarCargaFamiliar,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCargaFamiliar,this.jTtoolBarCargaFamiliar,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCargaFamiliar,this.jTtoolBarCargaFamiliar,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCargaFamiliar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCargaFamiliar,this.jTtoolBarCargaFamiliar,
							"cerrar","cerrar","Salir"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCargaFamiliar=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCargaFamiliar;
			
				this.jButtonProcesarInformacionToolBarCargaFamiliar=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCargaFamiliar;
				
		//protected JButton jButtonModificarToolBarCargaFamiliar;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCargaFamiliar=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCargaFamiliar=new JMenuMe("General");
		this.jmenuArchivoCargaFamiliar=new JMenuMe("Archivo");
		this.jmenuAccionesCargaFamiliar=new JMenuMe("Acciones");
		this.jmenuDatosCargaFamiliar=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCargaFamiliar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCargaFamiliar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCargaFamiliar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCargaFamiliar= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCargaFamiliar.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCargaFamiliar,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCargaFamiliar= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCargaFamiliar.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCargaFamiliar,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCargaFamiliar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCargaFamiliar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCargaFamiliar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCargaFamiliar= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCargaFamiliar.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCargaFamiliar,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCargaFamiliar= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCargaFamiliar.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCargaFamiliar,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCargaFamiliar= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCargaFamiliar.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCargaFamiliar,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCargaFamiliar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCargaFamiliar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCargaFamiliar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCargaFamiliar= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCargaFamiliar.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCargaFamiliar,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCargaFamiliar= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCargaFamiliar.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCargaFamiliar,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCargaFamiliar= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCargaFamiliar.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCargaFamiliar,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCargaFamiliar= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCargaFamiliar.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCargaFamiliar,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCargaFamiliar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCargaFamiliar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCargaFamiliar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCargaFamiliar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCargaFamiliar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCargaFamiliar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCargaFamiliar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCargaFamiliar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCargaFamiliar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCargaFamiliar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCargaFamiliar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCargaFamiliar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCargaFamiliar= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCargaFamiliar.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCargaFamiliar,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCargaFamiliar.add(this.jMenuItemCerrarCargaFamiliar);
			
			this.jmenuAccionesCargaFamiliar.add(this.jMenuItemNuevoCargaFamiliar);
			this.jmenuAccionesCargaFamiliar.add(this.jMenuItemNuevoGuardarCambiosCargaFamiliar);
			this.jmenuAccionesCargaFamiliar.add(this.jMenuItemNuevoRelacionesCargaFamiliar);
			this.jmenuAccionesCargaFamiliar.add(this.jMenuItemGuardarCambiosTablaCargaFamiliar);		
			this.jmenuAccionesCargaFamiliar.add(this.jMenuItemDuplicarCargaFamiliar);		
			this.jmenuAccionesCargaFamiliar.add(this.jMenuItemCopiarCargaFamiliar);		
			this.jmenuAccionesCargaFamiliar.add(this.jMenuItemVerFormCargaFamiliar);		
			
			this.jmenuDatosCargaFamiliar.add(this.jMenuItemRecargarInformacionCargaFamiliar);				
			this.jmenuDatosCargaFamiliar.add(this.jMenuItemAnterioresCargaFamiliar);				
			this.jmenuDatosCargaFamiliar.add(this.jMenuItemSiguientesCargaFamiliar);				
			this.jmenuDatosCargaFamiliar.add(this.jMenuItemAbrirOrderByCargaFamiliar);				
			this.jmenuDatosCargaFamiliar.add(this.jMenuItemMostrarOcultarCargaFamiliar);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCargaFamiliar.add(this.jMenuItemGuardarCambiosCargaFamiliar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCargaFamiliar.add(this.jmenuArchivoCargaFamiliar);		
			this.jmenuBarCargaFamiliar.add(this.jmenuAccionesCargaFamiliar);		
			this.jmenuBarCargaFamiliar.add(this.jmenuDatosCargaFamiliar);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCargaFamiliar);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCargaFamiliar() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteCargaFamiliar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteCargaFamiliar.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteCargaFamiliar= new JButtonMe();
		this.jButtonFK_IdClienteCargaFamiliar.setText("Buscar");
		this.jButtonFK_IdClienteCargaFamiliar.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteCargaFamiliar,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteCargaFamiliar = new JLabelMe();
		jLabelid_clienteFK_IdClienteCargaFamiliar.setText("Cliente :");
		jLabelid_clienteFK_IdClienteCargaFamiliar.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteCargaFamiliar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteCargaFamiliar= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteCargaFamiliar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteCargaFamiliar= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteCargaFamiliar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteCargaFamiliar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteCargaFamiliar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteCargaFamiliar.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteCargaFamiliar.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteCargaFamiliar.setFocusable(false);

		this.jPanelFK_IdEstadoCivilCargaFamiliar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoCivilCargaFamiliar.setToolTipText("Buscar Por Estado Civil ");
		this.jButtonFK_IdEstadoCivilCargaFamiliar= new JButtonMe();
		this.jButtonFK_IdEstadoCivilCargaFamiliar.setText("Buscar");
		this.jButtonFK_IdEstadoCivilCargaFamiliar.setToolTipText("Buscar Por Estado Civil ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoCivilCargaFamiliar,"buscar_button","Buscar Por Estado Civil ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoCivilCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar = new JLabelMe();
		jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar.setText("Estado Civil :");
		jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar.setToolTipText("Estado Civil");
		jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar= new JComboBoxMe();
		jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCargaFamiCargaFamiliar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCargaFamiCargaFamiliar.setToolTipText("Buscar Por Tipo Carga Fami ");
		this.jButtonFK_IdTipoCargaFamiCargaFamiliar= new JButtonMe();
		this.jButtonFK_IdTipoCargaFamiCargaFamiliar.setText("Buscar");
		this.jButtonFK_IdTipoCargaFamiCargaFamiliar.setToolTipText("Buscar Por Tipo Carga Fami ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCargaFamiCargaFamiliar,"buscar_button","Buscar Por Tipo Carga Fami ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCargaFamiCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar = new JLabelMe();
		jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.setText("Tipo Carga Fami :");
		jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.setToolTipText("Tipo Carga Fami");
		jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar= new JComboBoxMe();
		jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoGeneroCargaFamiliar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoGeneroCargaFamiliar.setToolTipText("Buscar Por Tipo Genero ");
		this.jButtonFK_IdTipoGeneroCargaFamiliar= new JButtonMe();
		this.jButtonFK_IdTipoGeneroCargaFamiliar.setText("Buscar");
		this.jButtonFK_IdTipoGeneroCargaFamiliar.setToolTipText("Buscar Por Tipo Genero ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoGeneroCargaFamiliar,"buscar_button","Buscar Por Tipo Genero ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoGeneroCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar = new JLabelMe();
		jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar.setText("Tipo Genero :");
		jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar.setToolTipText("Tipo Genero");
		jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar= new JComboBoxMe();
		jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCargaFamiliar=new JTabbedPane();


		this.jTabbedPaneBusquedasCargaFamiliar.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCargaFamiliar.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCargaFamiliar.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCargaFamiliar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCargaFamiliar,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCargaFamiliar = new CargaFamiliarDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Carga Familiar DATOS");
			this.jInternalFrameDetalleFormCargaFamiliar = new CargaFamiliarDetalleFormJInternalFrame(jDesktopPane,this.cargafamiliarSessionBean.getConGuardarRelaciones(),this.cargafamiliarSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCargaFamiliar = null;//new CargaFamiliarDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCargaFamiliar= new GridBagLayout();
		
		
		this.jTableDatosCargaFamiliar = new JTableMe();      
		
		String sToolTipCargaFamiliar="";
		sToolTipCargaFamiliar=CargaFamiliarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCargaFamiliar+="(Cartera.CargaFamiliar)";
		}
		
		if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
			sToolTipCargaFamiliar+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCargaFamiliar.setToolTipText(sToolTipCargaFamiliar);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCargaFamiliar);
		this.jTableDatosCargaFamiliar.setAutoCreateRowSorter(true);
		this.jTableDatosCargaFamiliar.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCargaFamiliar.setRowSelectionAllowed(true);
		this.jTableDatosCargaFamiliar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCargaFamiliar,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCargaFamiliar = new JButtonMe();
		this.jButtonDuplicarCargaFamiliar = new JButtonMe();
		this.jButtonCopiarCargaFamiliar = new JButtonMe();
		this.jButtonVerFormCargaFamiliar = new JButtonMe();
		this.jButtonNuevoRelacionesCargaFamiliar = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCargaFamiliar = new JButtonMe();
		this.jButtonCerrarCargaFamiliar = new JButtonMe();
		
		this.jScrollPanelDatosCargaFamiliar = new JScrollPane();   
        this.jScrollPanelDatosGeneralCargaFamiliar = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCargaFamiliar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Carga Familiar";
		
		if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carga Familiares" + this.sPath));
		} else {
			this.jScrollPanelDatosCargaFamiliar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCargaFamiliar.setToolTipText("Acciones");
        this.jPanelAccionesCargaFamiliar.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCargaFamiliar=new ReporteDinamicoJInternalFrame(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCargaFamiliar();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCargaFamiliar=new ImportacionJInternalFrame(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCargaFamiliar();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCargaFamiliar = new JButtonMe();
		
		this.jButtonAbrirOrderByCargaFamiliar.setText("Orden");
		this.jButtonAbrirOrderByCargaFamiliar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCargaFamiliar,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCargaFamiliar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCargaFamiliar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargaFamiliar,false,this);
			
			//this.cargarOrderByCargaFamiliar(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCargaFamiliar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargaFamiliar,true,this);
			
			//this.cargarOrderByCargaFamiliar(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCargaFamiliar.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosCargaFamiliar.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosCargaFamiliar.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosCargaFamiliar.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCargaFamiliar.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCargaFamiliar.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCargaFamiliar.setText("Nuevo");
		this.jButtonDuplicarCargaFamiliar.setText("Duplicar");
		this.jButtonCopiarCargaFamiliar.setText("Copiar");
		this.jButtonVerFormCargaFamiliar.setText("Ver");
		this.jButtonNuevoRelacionesCargaFamiliar.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCargaFamiliar.setText("Guardar");
		this.jButtonCerrarCargaFamiliar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCargaFamiliar,"nuevo_button","Nuevo",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCargaFamiliar,"duplicar_button","Duplicar",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCargaFamiliar,"copiar_button","Copiar",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCargaFamiliar,"ver_form","Ver",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCargaFamiliar,"nuevorelaciones_button","Nuevo Rel",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCargaFamiliar,"guardarcambiostabla_button","Guardar",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCargaFamiliar,"cerrar_button","Salir",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCargaFamiliar.setToolTipText("Nuevo"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCargaFamiliar.setToolTipText("Duplicar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCargaFamiliar.setToolTipText("Copiar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCargaFamiliar.setToolTipText("Ver"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCargaFamiliar.setToolTipText("Nuevo Rel"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCargaFamiliar.setToolTipText("Guardar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCargaFamiliar.setToolTipText("Salir"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCargaFamiliar";
		inputMap = this.jButtonNuevoCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCargaFamiliar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCargaFamiliar"));
		
		//DUPLICAR
		sMapKey = "DuplicarCargaFamiliar";
		inputMap = this.jButtonDuplicarCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCargaFamiliar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCargaFamiliar"));
		
		//COPIAR
		sMapKey = "CopiarCargaFamiliar";
		inputMap = this.jButtonCopiarCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCargaFamiliar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCargaFamiliar"));
		
		//VEr FORM
		sMapKey = "VerFormCargaFamiliar";
		inputMap = this.jButtonVerFormCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCargaFamiliar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCargaFamiliar"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCargaFamiliar";
		inputMap = this.jButtonNuevoRelacionesCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCargaFamiliar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCargaFamiliar"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCargaFamiliar";
		inputMap = this.jButtonModificarCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCargaFamiliar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCargaFamiliar"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCargaFamiliar";
		inputMap = this.jButtonCerrarCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCargaFamiliar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCargaFamiliar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCargaFamiliar";
		inputMap = this.jButtonGuardarCambiosTablaCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCargaFamiliar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCargaFamiliar"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCargaFamiliar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCargaFamiliar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCargaFamiliar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CargaFamiliar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CargaFamiliar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CargaFamiliar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CargaFamiliar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CargaFamiliar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCargaFamiliar.setName("jPanelParametrosReportesCargaFamiliar"); 
		
		this.jPanelParametrosReportesAccionesCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCargaFamiliar.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCargaFamiliar.setName("jPanelParametrosReportesAccionesCargaFamiliar"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCargaFamiliar, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCargaFamiliar = new JButtonMe();
		this.jButtonRecargarInformacionCargaFamiliar.setText("Recargar");
		this.jButtonRecargarInformacionCargaFamiliar.setToolTipText("Recargar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCargaFamiliar,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCargaFamiliar = new JButtonMe();
		this.jButtonProcesarInformacionCargaFamiliar.setText("Procesar");
		this.jButtonProcesarInformacionCargaFamiliar.setToolTipText("Procesar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCargaFamiliar.setVisible(false);
			
		this.jButtonProcesarInformacionCargaFamiliar.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCargaFamiliar.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCargaFamiliar.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCargaFamiliar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCargaFamiliar.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCargaFamiliar.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCargaFamiliar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCargaFamiliar.setText("TIPO");       
		this.jComboBoxTiposReportesCargaFamiliar.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCargaFamiliar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCargaFamiliar.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCargaFamiliar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCargaFamiliar = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCargaFamiliar.setText("Paginacion");
		this.jComboBoxTiposPaginacionCargaFamiliar.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCargaFamiliar = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCargaFamiliar.setText("Accion");
		this.jComboBoxTiposRelacionesCargaFamiliar.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCargaFamiliar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCargaFamiliar.setText("Accion");
		this.jComboBoxTiposAccionesCargaFamiliar.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCargaFamiliar = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCargaFamiliar.setText("Accion");
		this.jComboBoxTiposSeleccionarCargaFamiliar.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCargaFamiliar=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCargaFamiliar.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCargaFamiliar.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCargaFamiliar.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCargaFamiliar = new JLabelMe();
		
		this.jLabelAccionesCargaFamiliar.setText("Acciones");		
		this.jLabelAccionesCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCargaFamiliar = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCargaFamiliar.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCargaFamiliar.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCargaFamiliar = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCargaFamiliar.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCargaFamiliar.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCargaFamiliar = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCargaFamiliar.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCargaFamiliar.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCargaFamiliar = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCargaFamiliar.setText("Graf.");
		this.jCheckBoxConGraficoReporteCargaFamiliar.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCargaFamiliar = new JButtonMe();
		//this.jButtonAnterioresCargaFamiliar.setText("<<");
        this.jButtonAnterioresCargaFamiliar.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCargaFamiliar,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCargaFamiliar = new JButtonMe();
		//this.jButtonSiguientesCargaFamiliar.setText(">>");
        this.jButtonSiguientesCargaFamiliar.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCargaFamiliar,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCargaFamiliar = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCargaFamiliar.setText("Nue");
        this.jButtonNuevoGuardarCambiosCargaFamiliar.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCargaFamiliar,"nuevoguardarcambios_button","Nue",this.cargafamiliarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCargaFamiliar";
		inputMap = this.jButtonNuevoGuardarCambiosCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCargaFamiliar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCargaFamiliar"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCargaFamiliar";
		inputMap = this.jButtonRecargarInformacionCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCargaFamiliar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCargaFamiliar"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCargaFamiliar";
		inputMap = this.jButtonSiguientesCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCargaFamiliar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCargaFamiliar"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCargaFamiliar";
		inputMap = this.jButtonAnterioresCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCargaFamiliar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCargaFamiliar"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCargaFamiliar();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCargaFamiliar.setMinimumSize(new Dimension(this.getWidth(),CargaFamiliarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CargaFamiliarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCargaFamiliar.setMaximumSize(new Dimension(this.getWidth(),CargaFamiliarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CargaFamiliarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCargaFamiliar.setPreferredSize(new Dimension(this.getWidth(),CargaFamiliarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CargaFamiliarBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCargaFamiliar = new GridBagLayout();

			this.jPanelPaginacionCargaFamiliar.setLayout(gridaBagLayoutPaginacionCargaFamiliar);						
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy = 0;
			this.gridBagConstraintsCargaFamiliar.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCargaFamiliar.add(this.jButtonAnterioresCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
					
						
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCargaFamiliar.gridy = 0;
			
			this.jPanelPaginacionCargaFamiliar.add(this.jButtonNuevoGuardarCambiosCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
						
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCargaFamiliar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCargaFamiliar.gridy = 0;
			this.jPanelPaginacionCargaFamiliar.add(this.jButtonSiguientesCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy = 1;
			this.gridBagConstraintsCargaFamiliar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargaFamiliar.add(this.jButtonNuevoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
						
			
			
			if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
				this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCargaFamiliar.gridy = 1;
				this.gridBagConstraintsCargaFamiliar.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCargaFamiliar.add(this.jButtonGuardarCambiosTablaCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
			}
			
			
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy = 1;
			this.gridBagConstraintsCargaFamiliar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargaFamiliar.add(this.jButtonDuplicarCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy = 1;
			this.gridBagConstraintsCargaFamiliar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargaFamiliar.add(this.jButtonCopiarCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy = 1;
			this.gridBagConstraintsCargaFamiliar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCargaFamiliar.add(this.jButtonVerFormCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy = 1;
			this.gridBagConstraintsCargaFamiliar.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCargaFamiliar.add(this.jButtonCerrarCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
		
		
		this.jButtonRecargarInformacionCargaFamiliar.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCargaFamiliar.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCargaFamiliar.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCargaFamiliar.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCargaFamiliar.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCargaFamiliar.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCargaFamiliar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCargaFamiliar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCargaFamiliar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCargaFamiliar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCargaFamiliar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCargaFamiliar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCargaFamiliar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCargaFamiliar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCargaFamiliar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCargaFamiliar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCargaFamiliar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCargaFamiliar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCargaFamiliar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargaFamiliar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargaFamiliar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCargaFamiliar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCargaFamiliar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCargaFamiliar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCargaFamiliar.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCargaFamiliar.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCargaFamiliar.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCargaFamiliar.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCargaFamiliar.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCargaFamiliar.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCargaFamiliar.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCargaFamiliar.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCargaFamiliar.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCargaFamiliar.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCargaFamiliar.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCargaFamiliar.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCargaFamiliar = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCargaFamiliar = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CargaFamiliar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CargaFamiliar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CargaFamiliar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CargaFamiliar = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCargaFamiliar.setLayout(gridaBagParametrosReportesCargaFamiliar);
			this.jPanelParametrosReportesAccionesCargaFamiliar.setLayout(gridaBagParametrosReportesAccionesCargaFamiliar);
			
			
			this.jPanelParametrosAuxiliar1CargaFamiliar.setLayout(gridaBagParametrosAuxiliar1CargaFamiliar);
			this.jPanelParametrosAuxiliar2CargaFamiliar.setLayout(gridaBagParametrosAuxiliar2CargaFamiliar);
			this.jPanelParametrosAuxiliar3CargaFamiliar.setLayout(gridaBagParametrosAuxiliar3CargaFamiliar);
			this.jPanelParametrosAuxiliar4CargaFamiliar.setLayout(gridaBagParametrosAuxiliar4CargaFamiliar);
			//this.jPanelParametrosAuxiliar5CargaFamiliar.setLayout(gridaBagParametrosAuxiliar2CargaFamiliar);			
			
			
			
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargaFamiliar.add(this.jButtonRecargarInformacionCargaFamiliar, this.gridBagConstraintsCargaFamiliar);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CargaFamiliar.add(this.jComboBoxTiposPaginacionCargaFamiliar, this.gridBagConstraintsCargaFamiliar);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CargaFamiliar.add(this.jCheckBoxConAltoMaximoTablaCargaFamiliar, this.gridBagConstraintsCargaFamiliar);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CargaFamiliar.add(this.jComboBoxTiposArchivosReportesCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargaFamiliar.add(this.jPanelParametrosAuxiliar1CargaFamiliar, this.gridBagConstraintsCargaFamiliar);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CargaFamiliar.add(this.jComboBoxTiposReportesCargaFamiliar, this.gridBagConstraintsCargaFamiliar);																		
			
			
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CargaFamiliar.add(this.jComboBoxTiposGraficosReportesCargaFamiliar, this.gridBagConstraintsCargaFamiliar);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargaFamiliar.add(this.jPanelParametrosAuxiliar4CargaFamiliar, this.gridBagConstraintsCargaFamiliar);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargaFamiliar.add(this.jComboBoxTiposReportesCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargaFamiliar.add(this.jCheckBoxGenerarReporteCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargaFamiliar.add(this.jPanelParametrosAuxiliar2CargaFamiliar, this.gridBagConstraintsCargaFamiliar);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargaFamiliar.add(this.jLabelAccionesCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
				this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCargaFamiliar.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCargaFamiliar.add(this.jButtonAbrirOrderByCargaFamiliar, this.gridBagConstraintsCargaFamiliar);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargaFamiliar.add(this.jComboBoxTiposSeleccionarCargaFamiliar, this.gridBagConstraintsCargaFamiliar);			
			
			
			/*
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargaFamiliar.add(this.jCheckBoxSeleccionarTodosCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCargaFamiliar.add(this.jCheckBoxConGraficoReporteCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CargaFamiliar.add(this.jCheckBoxSeleccionarTodosCargaFamiliar, this.gridBagConstraintsCargaFamiliar);															
				
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CargaFamiliar.add(this.jCheckBoxSeleccionadosCargaFamiliar, this.gridBagConstraintsCargaFamiliar);															
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCargaFamiliar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CargaFamiliar.add(this.jCheckBoxConGraficoReporteCargaFamiliar, this.gridBagConstraintsCargaFamiliar);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCargaFamiliar.add(this.jPanelParametrosAuxiliar3CargaFamiliar, this.gridBagConstraintsCargaFamiliar);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargaFamiliar.add(this.jComboBoxTiposAccionesCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
	
				
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCargaFamiliar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCargaFamiliar.add(this.jTextFieldValorCampoGeneralCargaFamiliar, this.gridBagConstraintsCargaFamiliar);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCargaFamiliar = new GridBagLayout();

			this.jScrollPanelDatosCargaFamiliar.setLayout(gridaBagLayoutDatosCargaFamiliar);
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy = 0;
			this.gridBagConstraintsCargaFamiliar.gridx = 0;
			
			this.jScrollPanelDatosCargaFamiliar.add(this.jTableDatosCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCargaFamiliar.setViewportView(this.jTableDatosCargaFamiliar);
		this.jTableDatosCargaFamiliar.setFillsViewportHeight(true);
		this.jTableDatosCargaFamiliar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCargaFamiliar= new GridBagLayout();
		this.jPanelAccionesCargaFamiliar.setLayout(gridaBagLayoutAccionesCargaFamiliar);
		
		
		/*	
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar.gridy = 0;
		this.gridBagConstraintsCargaFamiliar.gridx = 0;
			
		this.jPanelAccionesCargaFamiliar.add(this.jButtonNuevoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteCargaFamiliar= new GridBagLayout();
		gridaBagLayoutFK_IdClienteCargaFamiliar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteCargaFamiliar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteCargaFamiliar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteCargaFamiliar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteCargaFamiliar.setLayout(gridaBagLayoutFK_IdClienteCargaFamiliar);

		gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar.gridy = 0;
		gridBagConstraintsCargaFamiliar.gridx = 0;
		jPanelFK_IdClienteCargaFamiliar.add(jLabelid_clienteFK_IdClienteCargaFamiliar, gridBagConstraintsCargaFamiliar);

		gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar.gridy = 0;
		gridBagConstraintsCargaFamiliar.gridx = 1;
		jPanelFK_IdClienteCargaFamiliar.add(jComboBoxid_clienteFK_IdClienteCargaFamiliar, gridBagConstraintsCargaFamiliar);


		gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.NONE;
		gridBagConstraintsCargaFamiliar.gridy = 0;
		gridBagConstraintsCargaFamiliar.gridx = 0;
		jPanelFK_IdClienteCargaFamiliar.add(this.jButtonBuscarFK_IdClienteid_clienteCargaFamiliar, gridBagConstraintsCargaFamiliar);

		gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar.gridy = 1;
		gridBagConstraintsCargaFamiliar.gridx =1;
		jPanelFK_IdClienteCargaFamiliar.add(jButtonFK_IdClienteCargaFamiliar, gridBagConstraintsCargaFamiliar);

		jTabbedPaneBusquedasCargaFamiliar.addTab("1.-Por Cliente ", jPanelFK_IdClienteCargaFamiliar);
		jTabbedPaneBusquedasCargaFamiliar.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstadoCivilCargaFamiliar= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoCivilCargaFamiliar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoCivilCargaFamiliar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoCivilCargaFamiliar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoCivilCargaFamiliar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoCivilCargaFamiliar.setLayout(gridaBagLayoutFK_IdEstadoCivilCargaFamiliar);

		gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar.gridy = 0;
		gridBagConstraintsCargaFamiliar.gridx = 0;
		jPanelFK_IdEstadoCivilCargaFamiliar.add(jLabelid_estado_civilFK_IdEstadoCivilCargaFamiliar, gridBagConstraintsCargaFamiliar);

		gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar.gridy = 0;
		gridBagConstraintsCargaFamiliar.gridx = 1;
		jPanelFK_IdEstadoCivilCargaFamiliar.add(jComboBoxid_estado_civilFK_IdEstadoCivilCargaFamiliar, gridBagConstraintsCargaFamiliar);

		gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar.gridy = 1;
		gridBagConstraintsCargaFamiliar.gridx =1;
		jPanelFK_IdEstadoCivilCargaFamiliar.add(jButtonFK_IdEstadoCivilCargaFamiliar, gridBagConstraintsCargaFamiliar);

		jTabbedPaneBusquedasCargaFamiliar.addTab("2.-Por Estado Civil ", jPanelFK_IdEstadoCivilCargaFamiliar);
		jTabbedPaneBusquedasCargaFamiliar.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoCargaFamiCargaFamiliar= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCargaFamiCargaFamiliar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCargaFamiCargaFamiliar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCargaFamiCargaFamiliar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCargaFamiCargaFamiliar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCargaFamiCargaFamiliar.setLayout(gridaBagLayoutFK_IdTipoCargaFamiCargaFamiliar);

		gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar.gridy = 0;
		gridBagConstraintsCargaFamiliar.gridx = 0;
		jPanelFK_IdTipoCargaFamiCargaFamiliar.add(jLabelid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar, gridBagConstraintsCargaFamiliar);

		gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar.gridy = 0;
		gridBagConstraintsCargaFamiliar.gridx = 1;
		jPanelFK_IdTipoCargaFamiCargaFamiliar.add(jComboBoxid_tipo_carga_famiFK_IdTipoCargaFamiCargaFamiliar, gridBagConstraintsCargaFamiliar);

		gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar.gridy = 1;
		gridBagConstraintsCargaFamiliar.gridx =1;
		jPanelFK_IdTipoCargaFamiCargaFamiliar.add(jButtonFK_IdTipoCargaFamiCargaFamiliar, gridBagConstraintsCargaFamiliar);

		jTabbedPaneBusquedasCargaFamiliar.addTab("3.-Por Tipo Carga Fami ", jPanelFK_IdTipoCargaFamiCargaFamiliar);
		jTabbedPaneBusquedasCargaFamiliar.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoGeneroCargaFamiliar= new GridBagLayout();
		gridaBagLayoutFK_IdTipoGeneroCargaFamiliar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoGeneroCargaFamiliar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoGeneroCargaFamiliar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoGeneroCargaFamiliar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoGeneroCargaFamiliar.setLayout(gridaBagLayoutFK_IdTipoGeneroCargaFamiliar);

		gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar.gridy = 0;
		gridBagConstraintsCargaFamiliar.gridx = 0;
		jPanelFK_IdTipoGeneroCargaFamiliar.add(jLabelid_tipo_generoFK_IdTipoGeneroCargaFamiliar, gridBagConstraintsCargaFamiliar);

		gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar.gridy = 0;
		gridBagConstraintsCargaFamiliar.gridx = 1;
		jPanelFK_IdTipoGeneroCargaFamiliar.add(jComboBoxid_tipo_generoFK_IdTipoGeneroCargaFamiliar, gridBagConstraintsCargaFamiliar);

		gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCargaFamiliar.gridy = 1;
		gridBagConstraintsCargaFamiliar.gridx =1;
		jPanelFK_IdTipoGeneroCargaFamiliar.add(jButtonFK_IdTipoGeneroCargaFamiliar, gridBagConstraintsCargaFamiliar);

		jTabbedPaneBusquedasCargaFamiliar.addTab("4.-Por Tipo Genero ", jPanelFK_IdTipoGeneroCargaFamiliar);
		jTabbedPaneBusquedasCargaFamiliar.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCargaFamiliar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCargaFamiliar);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();						
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCargaFamiliar.gridx = 0;		
			//this.gridBagConstraintsCargaFamiliar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCargaFamiliar.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCargaFamiliar, this.gridBagConstraintsCargaFamiliar);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCargaFamiliar.gridx = 0;		
		//this.gridBagConstraintsCargaFamiliar.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCargaFamiliar.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCargaFamiliar);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCargaFamiliar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCargaFamiliar.gridx = 0;		
			this.gridBagConstraintsCargaFamiliar.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCargaFamiliar.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCargaFamiliar, this.gridBagConstraintsCargaFamiliar);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCargaFamiliar, this.gridBagConstraintsCargaFamiliar);								
		
		
		/*
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		*/		
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCargaFamiliar.gridx =0;
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCargaFamiliar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
				
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CargaFamiliarJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCargaFamiliar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCargaFamiliar = new GridBagLayout();
			this.jPanelBusquedasParametrosCargaFamiliar.setLayout(gridaBagLayoutBusquedasParametrosCargaFamiliar);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCargaFamiliar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCargaFamiliar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargaFamiliar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargaFamiliar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
			
			
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
			
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCargaFamiliar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCargaFamiliar;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCargaFamiliar() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCargaFamiliar = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCargaFamiliar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCargaFamiliar.setName("jPanelReporteDinamicoCargaFamiliar"); 
		
		this.jPanelReporteDinamicoCargaFamiliar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCargaFamiliar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCargaFamiliar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCargaFamiliar.setLayout(gridaBagLayoutReporteDinamicoCargaFamiliar);
		
		
		this.jInternalFrameReporteDinamicoCargaFamiliar= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCargaFamiliar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCargaFamiliar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCargaFamiliar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCargaFamiliar.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCargaFamiliar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCargaFamiliar.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCargaFamiliar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCargaFamiliar.setResizable(true);
	    this.jInternalFrameReporteDinamicoCargaFamiliar.setClosable(true);
	    this.jInternalFrameReporteDinamicoCargaFamiliar.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCargaFamiliar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCargaFamiliar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCargaFamiliar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carga Familiares"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCargaFamiliar = new JLabelMe();

		this.jLabelColumnasSelectReporteCargaFamiliar.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jLabelColumnasSelectReporteCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCargaFamiliar = new JList<Reporte>();
		this.jListColumnasSelectReporteCargaFamiliar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCargaFamiliar.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCargaFamiliar.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCargaFamiliar.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCargaFamiliar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCargaFamiliar=new JScrollPane(this.jListColumnasSelectReporteCargaFamiliar);
			
			this.jScrollColumnasSelectReporteCargaFamiliar.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCargaFamiliar.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCargaFamiliar.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCargaFamiliar.add(this.jListColumnasSelectReporteCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jScrollColumnasSelectReporteCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCargaFamiliar = new JLabelMe();

		this.jLabelRelacionesSelectReporteCargaFamiliar.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCargaFamiliar = new JList<Reporte>();
		this.jListRelacionesSelectReporteCargaFamiliar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCargaFamiliar.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCargaFamiliar.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCargaFamiliar.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCargaFamiliar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCargaFamiliar=new JScrollPane(this.jListRelacionesSelectReporteCargaFamiliar);
			
			this.jScrollRelacionesSelectReporteCargaFamiliar.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCargaFamiliar.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCargaFamiliar.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCargaFamiliar = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCargaFamiliar = new JComboBoxMe();
		this.jListColumnasValoresGraficoCargaFamiliar = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCargaFamiliar = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCargaFamiliar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCargaFamiliar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCargaFamiliar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCargaFamiliar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCargaFamiliar = new JLabelMe();

		this.jLabelConGraficoDinamicoCargaFamiliar.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jLabelConGraficoDinamicoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCargaFamiliar = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCargaFamiliar.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCargaFamiliar.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCargaFamiliar.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCargaFamiliar.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCargaFamiliar.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jCheckBoxConGraficoDinamicoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCargaFamiliar = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCargaFamiliar.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jLabelColumnaCategoriaGraficoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCargaFamiliar = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCargaFamiliar.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCargaFamiliar.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCargaFamiliar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCargaFamiliar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCargaFamiliar.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jComboBoxColumnaCategoriaGraficoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCargaFamiliar = new JLabelMe();

		this.jLabelColumnaCategoriaValorCargaFamiliar.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jLabelColumnaCategoriaValorCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCargaFamiliar = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCargaFamiliar.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCargaFamiliar.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCargaFamiliar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCargaFamiliar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCargaFamiliar.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jComboBoxColumnaCategoriaValorCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCargaFamiliar = new JLabelMe();

		this.jLabelColumnasValoresGraficoCargaFamiliar.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jLabelColumnasValoresGraficoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCargaFamiliar = new JList<Reporte>();
		this.jListColumnasValoresGraficoCargaFamiliar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCargaFamiliar.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCargaFamiliar.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCargaFamiliar.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCargaFamiliar.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCargaFamiliar=new JScrollPane(this.jListColumnasValoresGraficoCargaFamiliar);
			
			this.jScrollColumnasValoresGraficoCargaFamiliar.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCargaFamiliar.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCargaFamiliar.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCargaFamiliar.add(this.jListColumnasSelectReporteCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jScrollColumnasValoresGraficoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCargaFamiliar = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCargaFamiliar.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jLabelTiposGraficosReportesDinamicoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCargaFamiliar = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCargaFamiliar.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCargaFamiliar.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCargaFamiliar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCargaFamiliar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCargaFamiliar.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jComboBoxTiposGraficosReportesDinamicoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCargaFamiliar = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCargaFamiliar.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jLabelGenerarExcelReporteDinamicoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCargaFamiliar = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCargaFamiliar.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCargaFamiliar,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCargaFamiliar.setToolTipText("Generar EXCEL"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		//this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCargaFamiliar.add(this.jButtonGenerarExcelReporteDinamicoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jComboBoxTiposReportesDinamicoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCargaFamiliar = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCargaFamiliar.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jLabelTiposArchivoReporteDinamicoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jComboBoxTiposArchivosReportesDinamicoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCargaFamiliar = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCargaFamiliar.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCargaFamiliar,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCargaFamiliar.setToolTipText("Generar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jButtonGenerarReporteDinamicoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCargaFamiliar = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCargaFamiliar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCargaFamiliar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCargaFamiliar.setToolTipText("Cancelar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCargaFamiliar.add(this.jButtonCerrarReporteDinamicoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCargaFamiliar = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCargaFamiliar= new JScrollPane(jPanelReporteDinamicoCargaFamiliar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCargaFamiliar.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCargaFamiliar.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCargaFamiliar.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carga Familiares"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCargaFamiliar.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCargaFamiliar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCargaFamiliar.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCargaFamiliar);
		this.jInternalFrameReporteDinamicoCargaFamiliar.getContentPane().add(this.jScrollPanelReporteDinamicoCargaFamiliar, this.gridBagConstraintsCargaFamiliar);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCargaFamiliar() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCargaFamiliar = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCargaFamiliar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCargaFamiliar.setName("jPanelImportacionCargaFamiliar"); 
		
		this.jPanelImportacionCargaFamiliar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCargaFamiliar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCargaFamiliar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCargaFamiliar.setLayout(gridaBagLayoutImportacionCargaFamiliar);
		
		
		this.jInternalFrameImportacionCargaFamiliar= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCargaFamiliar= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCargaFamiliar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCargaFamiliar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCargaFamiliar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCargaFamiliar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCargaFamiliar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCargaFamiliar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCargaFamiliar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCargaFamiliar.setResizable(true);
	    this.jInternalFrameImportacionCargaFamiliar.setClosable(true);
	    this.jInternalFrameImportacionCargaFamiliar.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCargaFamiliar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCargaFamiliar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCargaFamiliar.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCargaFamiliar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCargaFamiliar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCargaFamiliar.setResizable(true);
	    this.jInternalFrameImportacionCargaFamiliar.setClosable(true);
	    this.jInternalFrameImportacionCargaFamiliar.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCargaFamiliar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCargaFamiliar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCargaFamiliar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carga Familiares"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCargaFamiliar = new JLabelMe();

		this.jLabelArchivoImportacionCargaFamiliar.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYImportacion;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCargaFamiliar.add(this.jLabelArchivoImportacionCargaFamiliar, this.gridBagConstraintsCargaFamiliar);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCargaFamiliar = new JFileChooser();		
		this.jFileChooserImportacionCargaFamiliar.setToolTipText("ESCOGER ARCHIVO"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCargaFamiliar = new JButtonMe();
		this.jButtonAbrirImportacionCargaFamiliar.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCargaFamiliar,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCargaFamiliar.setToolTipText("Generar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYImportacion;
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargaFamiliar.add(this.jButtonAbrirImportacionCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCargaFamiliar = new JLabelMe();

		this.jLabelPathArchivoImportacionCargaFamiliar.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCargaFamiliar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCargaFamiliar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCargaFamiliar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYImportacion;		
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCargaFamiliar.add(this.jLabelPathArchivoImportacionCargaFamiliar, this.gridBagConstraintsCargaFamiliar);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCargaFamiliar=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCargaFamiliar.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCargaFamiliar.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCargaFamiliar.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYImportacion;
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargaFamiliar.add(this.jTextFieldPathArchivoImportacionCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCargaFamiliar = new JButtonMe();
		this.jButtonGenerarImportacionCargaFamiliar.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCargaFamiliar,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCargaFamiliar.setToolTipText("Generar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYImportacion;
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargaFamiliar.add(this.jButtonGenerarImportacionCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCargaFamiliar = new JButtonMe();
		this.jButtonCerrarImportacionCargaFamiliar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCargaFamiliar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCargaFamiliar.setToolTipText("Cancelar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargaFamiliar.gridy = iPosYImportacion;
		this.gridBagConstraintsCargaFamiliar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCargaFamiliar.add(this.jButtonCerrarImportacionCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCargaFamiliar = new GridBagLayout();
		
		this.jScrollPanelImportacionCargaFamiliar= new JScrollPane(jPanelImportacionCargaFamiliar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
		this.gridBagConstraintsCargaFamiliar.gridy =iPosYImportacion;
		this.gridBagConstraintsCargaFamiliar.gridx =iPosXImportacion;
		this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCargaFamiliar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCargaFamiliar.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCargaFamiliar);
		this.jInternalFrameImportacionCargaFamiliar.getContentPane().add(this.jScrollPanelImportacionCargaFamiliar, this.gridBagConstraintsCargaFamiliar);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCargaFamiliar(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCargaFamiliar = new JButtonMe();
			this.jButtonAbrirOrderByCargaFamiliar.setText("Orden");
			this.jButtonAbrirOrderByCargaFamiliar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCargaFamiliar,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCargaFamiliar";
			inputMap = this.jButtonAbrirOrderByCargaFamiliar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCargaFamiliar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCargaFamiliar"));
		
		
			GridBagLayout gridaBagLayoutOrderByCargaFamiliar = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCargaFamiliar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCargaFamiliar.setName("jPanelOrderByCargaFamiliar"); 
			
			this.jPanelOrderByCargaFamiliar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCargaFamiliar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCargaFamiliar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCargaFamiliar.setLayout(gridaBagLayoutOrderByCargaFamiliar);
			
			
			this.jTableDatosCargaFamiliarOrderBy = new JTableMe();        
			this.jTableDatosCargaFamiliarOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCargaFamiliarOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCargaFamiliarOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCargaFamiliarOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCargaFamiliarOrderBy.setViewportView(this.jTableDatosCargaFamiliarOrderBy);
			this.jTableDatosCargaFamiliarOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCargaFamiliarOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCargaFamiliar= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCargaFamiliar= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCargaFamiliar = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCargaFamiliar= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCargaFamiliar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCargaFamiliar.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCargaFamiliar.setTitle("Orden");
			this.jInternalFrameOrderByCargaFamiliar.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCargaFamiliar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCargaFamiliar.setResizable(true);
			this.jInternalFrameOrderByCargaFamiliar.setClosable(true);
			this.jInternalFrameOrderByCargaFamiliar.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCargaFamiliar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCargaFamiliar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCargaFamiliar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCargaFamiliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carga Familiares"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCargaFamiliar.gridx =iPosXOrderBy;
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCargaFamiliar.ipady =150;
				
			this.jPanelOrderByCargaFamiliar.add(jScrollPanelDatosCargaFamiliarOrderBy, this.gridBagConstraintsCargaFamiliar);//this.jTableDatosCargaFamiliarTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCargaFamiliar = new JButtonMe();
			this.jButtonCerrarOrderByCargaFamiliar.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCargaFamiliar,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCargaFamiliar.setToolTipText("Cancelar"+" "+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCargaFamiliar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargaFamiliar.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCargaFamiliar.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCargaFamiliar.add(this.jButtonCerrarOrderByCargaFamiliar, this.gridBagConstraintsCargaFamiliar);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCargaFamiliar = new GridBagLayout();
			
			this.jScrollPanelOrderByCargaFamiliar= new JScrollPane(jPanelOrderByCargaFamiliar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCargaFamiliar = new GridBagConstraints();
			this.gridBagConstraintsCargaFamiliar.gridy =iPosYOrderBy;
			this.gridBagConstraintsCargaFamiliar.gridx =iPosXOrderBy;
			this.gridBagConstraintsCargaFamiliar.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCargaFamiliar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCargaFamiliar.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCargaFamiliar);
			
			this.jInternalFrameOrderByCargaFamiliar.getContentPane().add(this.jScrollPanelOrderByCargaFamiliar, this.gridBagConstraintsCargaFamiliar);			
		
		} else {
			this.jButtonAbrirOrderByCargaFamiliar = new JButtonMe();
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
		int iWidthTableCalculado=0;//2430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cargafamiliarSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCargaFamiliar.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCargaFamiliar.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCargaFamiliar.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCargaFamiliar.getRowHeight();//CargaFamiliarConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CargaFamiliarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCargaFamiliar.isSelected()) {
					iHeightTable=CargaFamiliarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CargaFamiliarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CargaFamiliarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CargaFamiliarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCargaFamiliar.isSelected()) {
					iHeightTable=CargaFamiliarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CargaFamiliarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CargaFamiliarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCargaFamiliar.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCargaFamiliar.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCargaFamiliar.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCargaFamiliar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCargaFamiliar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCargaFamiliar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCargaFamiliar!=null && this.jInternalFrameOrderByCargaFamiliar.getjTableDatosOrderBy()!=null) {
			//if(!this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCargaFamiliar.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCargaFamiliar.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCargaFamiliar.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCargaFamiliar.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCargaFamiliar.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCargaFamiliar.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCargaFamiliar.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCargaFamiliar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCargaFamiliar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCargaFamiliar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cargafamiliarLogic.getCargaFamiliars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cargafamiliars.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CargaFamiliar> TraerCargaFamiliarBeans(List<CargaFamiliar> cargafamiliars,ArrayList<Classe> classes)throws Exception {
		try {
			for(CargaFamiliar cargafamiliar:cargafamiliars) {
					
				if(!(CargaFamiliarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CargaFamiliarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cargafamiliar.setsDetalleGeneralEntityReporte(CargaFamiliarConstantesFunciones.getCargaFamiliarDescripcion(cargafamiliar));
										
						
					
						
					
				} else  {
							
					//cargafamiliar.setsDetalleGeneralEntityReporte(cargafamiliar.getsDetalleGeneralEntityReporte());
										
				}
				
				//cargafamiliarbeans.add(cargafamiliarbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cargafamiliars;
    }
	//PARA REPORTES FIN
}
