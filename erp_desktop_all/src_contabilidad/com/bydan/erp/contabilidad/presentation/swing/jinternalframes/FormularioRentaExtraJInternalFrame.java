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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.FormularioRentaExtraConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class FormularioRentaExtraJInternalFrame extends FormularioRentaExtraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFormularioRentaExtra;
	
	protected JMenuBar jmenuBarFormularioRentaExtra;
	
	protected JMenu jmenuFormularioRentaExtra;
	protected JMenu jmenuDatosFormularioRentaExtra;
	protected JMenu jmenuArchivoFormularioRentaExtra;
	protected JMenu jmenuAccionesFormularioRentaExtra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFormularioRentaExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormularioRentaExtra;	
	protected GridBagConstraints gridBagConstraintsFormularioRentaExtra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FormularioRentaExtraDetalleFormJInternalFrame jInternalFrameDetalleFormFormularioRentaExtra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFormularioRentaExtra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFormularioRentaExtra;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected DatoFormularioRentaBeanSwingJInternalFrame datoformulariorentaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_datoformulariorenta="";

	protected FormaPagoBeanSwingJInternalFrame formapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formapago="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";
	
	public FormularioRentaExtraSessionBean formulariorentaextraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public DatoFormularioRentaSessionBean datoformulariorentaSessionBean;
	public FormaPagoSessionBean formapagoSessionBean;
	public BancoSessionBean bancoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FormularioRentaExtra> formulariorentaextras;		
	public List<FormularioRentaExtra> formulariorentaextrasEliminados;	
	public List<FormularioRentaExtra> formulariorentaextrasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFormularioRentaExtra;		
	protected JButton jButtonAbrirOrderByFormularioRentaExtra;
	
	
	//protected JPanel jPanelOrderByFormularioRentaExtra;
	//public JScrollPane jScrollPanelOrderByFormularioRentaExtra;	
	//protected JButton jButtonCerrarOrderByFormularioRentaExtra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FormularioRentaExtraLogic formulariorentaextraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFormularioRentaExtra;
	public JScrollPane jScrollPanelDatosEdicionFormularioRentaExtra;
	public JScrollPane jScrollPanelDatosGeneralFormularioRentaExtra;
    
	
	
	//public JScrollPane jScrollPanelDatosFormularioRentaExtraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFormularioRentaExtra;
	//public JScrollPane jScrollPanelImportacionFormularioRentaExtra;
	
	
	
	protected JPanel jPanelAccionesFormularioRentaExtra;
	
    protected JPanel jPanelPaginacionFormularioRentaExtra;
    protected JPanel jPanelParametrosReportesFormularioRentaExtra;
	protected JPanel jPanelParametrosReportesAccionesFormularioRentaExtra;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FormularioRentaExtra;
	protected JPanel jPanelParametrosAuxiliar2FormularioRentaExtra;
	protected JPanel jPanelParametrosAuxiliar3FormularioRentaExtra;
	protected JPanel jPanelParametrosAuxiliar4FormularioRentaExtra;
	//protected JPanel jPanelParametrosAuxiliar5FormularioRentaExtra;
	
	
	
	//protected JPanel jPanelReporteDinamicoFormularioRentaExtra;
	//protected JPanel jPanelImportacionFormularioRentaExtra;
	
	
	public JTable jTableDatosFormularioRentaExtra;
	
	
	
	//public JTable jTableDatosFormularioRentaExtraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFormularioRentaExtra;
	protected JButton jButtonDuplicarFormularioRentaExtra;
	protected JButton jButtonCopiarFormularioRentaExtra;
	protected JButton jButtonVerFormFormularioRentaExtra;
	protected JButton jButtonNuevoRelacionesFormularioRentaExtra;
	protected JButton jButtonModificarFormularioRentaExtra;
	
    protected JButton jButtonGuardarCambiosTablaFormularioRentaExtra;
	protected JButton jButtonCerrarFormularioRentaExtra;
	
	
	protected JButton jButtonRecargarInformacionFormularioRentaExtra;
	protected JButton jButtonProcesarInformacionFormularioRentaExtra;
	
	
	protected JButton jButtonAnterioresFormularioRentaExtra;
	protected JButton jButtonSiguientesFormularioRentaExtra;
	protected JButton jButtonNuevoGuardarCambiosFormularioRentaExtra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFormularioRentaExtra;
	//protected JButton jButtonCerrarReporteDinamicoFormularioRentaExtra;
	//protected JButton jButtonGenerarExcelReporteDinamicoFormularioRentaExtra;	
	
	
	
	//protected JButton jButtonAbrirImportacionFormularioRentaExtra;
	//protected JButton jButtonGenerarImportacionFormularioRentaExtra;
	//protected JButton jButtonCerrarImportacionFormularioRentaExtra;
	//protected JFileChooser jFileChooserImportacionFormularioRentaExtra;
	//protected File fileImportacionFormularioRentaExtra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormularioRentaExtra;
	protected JButton jButtonDuplicarToolBarFormularioRentaExtra;
	protected JButton jButtonNuevoRelacionesToolBarFormularioRentaExtra;
	
	
	public JButton jButtonGuardarCambiosToolBarFormularioRentaExtra;
	protected JButton jButtonCopiarToolBarFormularioRentaExtra;
	protected JButton jButtonVerFormToolBarFormularioRentaExtra;
	public JButton jButtonGuardarCambiosTablaToolBarFormularioRentaExtra;
	protected JButton jButtonMostrarOcultarTablaToolBarFormularioRentaExtra;
	protected JButton jButtonCerrarToolBarFormularioRentaExtra;
	
	protected JButton jButtonRecargarInformacionToolBarFormularioRentaExtra;
	protected JButton jButtonProcesarInformacionToolBarFormularioRentaExtra;
	protected JButton jButtonAnterioresToolBarFormularioRentaExtra;
	protected JButton jButtonSiguientesToolBarFormularioRentaExtra;
	protected JButton jButtonNuevoGuardarCambiosToolBarFormularioRentaExtra;
	protected JButton jButtonAbrirOrderByToolBarFormularioRentaExtra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormularioRentaExtra;
	protected JMenuItem jMenuItemDuplicarFormularioRentaExtra;
	protected JMenuItem jMenuItemNuevoRelacionesFormularioRentaExtra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFormularioRentaExtra;
	protected JMenuItem jMenuItemCopiarFormularioRentaExtra;
	protected JMenuItem jMenuItemVerFormFormularioRentaExtra;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormularioRentaExtra;
	protected JMenuItem jMenuItemCerrarFormularioRentaExtra;
	protected JMenuItem jMenuItemDetalleCerrarFormularioRentaExtra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFormularioRentaExtra;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormularioRentaExtra;
	
	protected JMenuItem jMenuItemRecargarInformacionFormularioRentaExtra;
	protected JMenuItem jMenuItemProcesarInformacionFormularioRentaExtra;
	protected JMenuItem jMenuItemAnterioresFormularioRentaExtra;
	protected JMenuItem jMenuItemSiguientesFormularioRentaExtra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormularioRentaExtra;
	protected JMenuItem jMenuItemAbrirOrderByFormularioRentaExtra;
	protected JMenuItem jMenuItemMostrarOcultarFormularioRentaExtra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormularioRentaExtra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFormularioRentaExtra;
	protected JCheckBox jCheckBoxSeleccionadosFormularioRentaExtra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFormularioRentaExtra;
	protected JCheckBox jCheckBoxConGraficoReporteFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFormularioRentaExtra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFormularioRentaExtra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFormularioRentaExtra;
	protected JTextField jTextFieldValorCampoGeneralFormularioRentaExtra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFormularioRentaExtra;
	//public JList<Reporte> jListColumnasSelectReporteFormularioRentaExtra;
	//public JScrollPane jScrollColumnasSelectReporteFormularioRentaExtra;
	
	//public JLabel jLabelRelacionesSelectReporteFormularioRentaExtra;
	//public JList<Reporte> jListRelacionesSelectReporteFormularioRentaExtra;
	//public JScrollPane jScrollRelacionesSelectReporteFormularioRentaExtra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFormularioRentaExtra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFormularioRentaExtra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFormularioRentaExtra;
	//public JLabel jLabelTiposArchivoReporteDinamicoFormularioRentaExtra;
	
		
	//public JLabel jLabelArchivoImportacionFormularioRentaExtra;	
	//public JLabel jLabelPathArchivoImportacionFormularioRentaExtra;
	//protected JTextField jTextFieldPathArchivoImportacionFormularioRentaExtra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFormularioRentaExtra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFormularioRentaExtra;
	
	//public JLabel jLabelColumnaCategoriaValorFormularioRentaExtra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFormularioRentaExtra;
	
	//public JLabel jLabelColumnasValoresGraficoFormularioRentaExtra;
	//public JList<Reporte> jListColumnasValoresGraficoFormularioRentaExtra;
	//public JScrollPane jScrollColumnasValoresGraficoFormularioRentaExtra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFormularioRentaExtra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFormularioRentaExtra;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFormularioRentaExtra;
	public JPanel jPanelFK_IdBancoFormularioRentaExtra;
	public JButton jButtonFK_IdBancoFormularioRentaExtra;
	public JPanel jPanelFK_IdDatoFormularioRentaFormularioRentaExtra;
	public JButton jButtonFK_IdDatoFormularioRentaFormularioRentaExtra;
	public JPanel jPanelFK_IdFormaPagoFormularioRentaExtra;
	public JButton jButtonFK_IdFormaPagoFormularioRentaExtra;
	
	public JPanel jPanelid_bancoFK_IdBancoFormularioRentaExtra;
	public JLabel jLabelid_bancoFK_IdBancoFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoFK_IdBancoFormularioRentaExtra;
	public JButton jButtonid_bancoFK_IdBancoFormularioRentaExtra= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoFormularioRentaExtraUpdate= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoFormularioRentaExtraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra;
	public JLabel jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra;
	public JButton jButtonid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra= new JButtonMe();
	public JButton jButtonid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtraUpdate= new JButtonMe();
	public JButton jButtonid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_forma_pagoFK_IdFormaPagoFormularioRentaExtra;
	public JLabel jLabelid_forma_pagoFK_IdFormaPagoFormularioRentaExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_forma_pagoFK_IdFormaPagoFormularioRentaExtra;
	public JButton jButtonid_forma_pagoFK_IdFormaPagoFormularioRentaExtra= new JButtonMe();
	public JButton jButtonid_forma_pagoFK_IdFormaPagoFormularioRentaExtraUpdate= new JButtonMe();
	public JButton jButtonid_forma_pagoFK_IdFormaPagoFormularioRentaExtraBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1350;//(screenSize.width-screenSize.width/2)+(250*3);
	//public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FormularioRentaExtraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FormularioRentaExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRentaExtraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioRentaExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRentaExtraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormularioRentaExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormularioRentaExtraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormularioRentaExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFormularioRentaExtra)	{
		this.jButtonRecargarInformacionFormularioRentaExtra = jButtonRecargarInformacionFormularioRentaExtra;
	}
	
	public JButton getjButtonProcesarInformacionFormularioRentaExtra() {
		return this.jButtonProcesarInformacionFormularioRentaExtra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormularioRentaExtra)	{
		this.jButtonProcesarInformacionFormularioRentaExtra = jButtonProcesarInformacionFormularioRentaExtra;
	}
	
	
	public JButton getjButtonRecargarInformacionFormularioRentaExtra() {
		return this.jButtonRecargarInformacionFormularioRentaExtra;
	}
	
	
	public List<FormularioRentaExtra> getformulariorentaextras() {
		return this.formulariorentaextras;
	}

	public void setformulariorentaextras(List<FormularioRentaExtra> formulariorentaextras) {
		this.formulariorentaextras = formulariorentaextras;
	}
	
	public List<FormularioRentaExtra> getformulariorentaextrasAux() {
		return this.formulariorentaextrasAux;
	}

	public void setformulariorentaextrasAux(List<FormularioRentaExtra> formulariorentaextrasAux) {
		this.formulariorentaextrasAux = formulariorentaextrasAux;
	}
	
	public List<FormularioRentaExtra> getformulariorentaextrasEliminados() {
		return this.formulariorentaextrasEliminados;
	}

	public void setFormularioRentaExtrasEliminados(List<FormularioRentaExtra> formulariorentaextrasEliminados) {
		this.formulariorentaextrasEliminados = formulariorentaextrasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFormularioRentaExtra() {
		return jComboBoxTiposSeleccionarFormularioRentaExtra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFormularioRentaExtra(
			JComboBox jComboBoxTiposSeleccionarFormularioRentaExtra) {
		this.jComboBoxTiposSeleccionarFormularioRentaExtra = jComboBoxTiposSeleccionarFormularioRentaExtra;
	}
	
	public void setBorderResaltarTiposSeleccionarFormularioRentaExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFormularioRentaExtra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFormularioRentaExtra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFormularioRentaExtra() {
		return jTextFieldValorCampoGeneralFormularioRentaExtra;
	}

	public void setjTextFieldValorCampoGeneralFormularioRentaExtra(
			JTextField jTextFieldValorCampoGeneralFormularioRentaExtra) {
		this.jTextFieldValorCampoGeneralFormularioRentaExtra = jTextFieldValorCampoGeneralFormularioRentaExtra;
	}

	public void setBorderResaltarValorCampoGeneralFormularioRentaExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRentaExtra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFormularioRentaExtra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFormularioRentaExtra() {
		return this.jCheckBoxSeleccionarTodosFormularioRentaExtra;
	}

	public void setjCheckBoxSeleccionarTodosFormularioRentaExtra(
			JCheckBox jCheckBoxSeleccionarTodosFormularioRentaExtra) {
		this.jCheckBoxSeleccionarTodosFormularioRentaExtra = jCheckBoxSeleccionarTodosFormularioRentaExtra;
	}

	public void setBorderResaltarSeleccionarTodosFormularioRentaExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRentaExtra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFormularioRentaExtra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFormularioRentaExtra() {
		return this.jCheckBoxSeleccionadosFormularioRentaExtra;
	}

	public void setjCheckBoxSeleccionadosFormularioRentaExtra(
			JCheckBox jCheckBoxSeleccionadosFormularioRentaExtra) {
		this.jCheckBoxSeleccionadosFormularioRentaExtra = jCheckBoxSeleccionadosFormularioRentaExtra;
	}
	
	public void setBorderResaltarSeleccionadosFormularioRentaExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRentaExtra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFormularioRentaExtra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFormularioRentaExtra() {
		return this.jComboBoxTiposArchivosReportesFormularioRentaExtra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFormularioRentaExtra(
			JComboBox jComboBoxTiposArchivosReportesFormularioRentaExtra) {
		this.jComboBoxTiposArchivosReportesFormularioRentaExtra = jComboBoxTiposArchivosReportesFormularioRentaExtra;
	}

	public void setBorderResaltarTiposArchivosReportesFormularioRentaExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRentaExtra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFormularioRentaExtra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFormularioRentaExtra() {
		return this.jComboBoxTiposReportesFormularioRentaExtra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFormularioRentaExtra(
			JComboBox jComboBoxTiposReportesFormularioRentaExtra) {
		this.jComboBoxTiposReportesFormularioRentaExtra = jComboBoxTiposReportesFormularioRentaExtra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFormularioRentaExtra() {
	//	return jComboBoxTiposReportesDinamicoFormularioRentaExtra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFormularioRentaExtra(
	//		JComboBox jComboBoxTiposReportesDinamicoFormularioRentaExtra) {
	//	this.jComboBoxTiposReportesDinamicoFormularioRentaExtra = jComboBoxTiposReportesDinamicoFormularioRentaExtra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFormularioRentaExtra() {
	//	return jComboBoxTiposArchivosReportesDinamicoFormularioRentaExtra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFormularioRentaExtra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFormularioRentaExtra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFormularioRentaExtra = jComboBoxTiposArchivosReportesDinamicoFormularioRentaExtra;
	//}
	
	public void setBorderResaltarTiposReportesFormularioRentaExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRentaExtra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFormularioRentaExtra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFormularioRentaExtra() {
		return this.jComboBoxTiposGraficosReportesFormularioRentaExtra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFormularioRentaExtra(
			JComboBox jComboBoxTiposGraficosReportesFormularioRentaExtra) {
		this.jComboBoxTiposGraficosReportesFormularioRentaExtra = jComboBoxTiposGraficosReportesFormularioRentaExtra;
	}
	
	public void setBorderResaltarTiposGraficosReportesFormularioRentaExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRentaExtra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFormularioRentaExtra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFormularioRentaExtra() {
		return this.jComboBoxTiposPaginacionFormularioRentaExtra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFormularioRentaExtra(
			JComboBox jComboBoxTiposPaginacionFormularioRentaExtra) {
		this.jComboBoxTiposPaginacionFormularioRentaExtra = jComboBoxTiposPaginacionFormularioRentaExtra;
	}
	
	public void setBorderResaltarTiposPaginacionFormularioRentaExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRentaExtra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFormularioRentaExtra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFormularioRentaExtra() {
		return this.jComboBoxTiposRelacionesFormularioRentaExtra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRentaExtra() {
		return this.jComboBoxTiposAccionesFormularioRentaExtra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormularioRentaExtra(
			JComboBox jComboBoxTiposRelacionesFormularioRentaExtra) {
		this.jComboBoxTiposRelacionesFormularioRentaExtra = jComboBoxTiposRelacionesFormularioRentaExtra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRentaExtra(
			JComboBox jComboBoxTiposAccionesFormularioRentaExtra) {
		this.jComboBoxTiposAccionesFormularioRentaExtra = jComboBoxTiposAccionesFormularioRentaExtra;
	}
	
	public void setBorderResaltarTiposRelacionesFormularioRentaExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRentaExtra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFormularioRentaExtra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFormularioRentaExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFormularioRentaExtra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFormularioRentaExtra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFormularioRentaExtra() {
	//	return jCheckBoxConGraficoDinamicoFormularioRentaExtra;
	//}

	//public void setjCheckBoxConGraficoDinamicoFormularioRentaExtra(
	//		JCheckBox jCheckBoxConGraficoDinamicoFormularioRentaExtra) {
	//	this.jCheckBoxConGraficoDinamicoFormularioRentaExtra = jCheckBoxConGraficoDinamicoFormularioRentaExtra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFormularioRentaExtra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFormularioRentaExtra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFormularioRentaExtra .setBorder(borderResaltar);		
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
		this.formulariorentaextraSessionBean=new FormularioRentaExtraSessionBean();
		
		this.formulariorentaextraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formulariorentaextraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formulariorentaextraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FormularioRentaExtraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FormularioRentaExtraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormularioRentaExtraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormularioRentaExtraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormularioRentaExtraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formulario Renta Extra MANTENIMIENTO"));
		
		
		if(iWidth > 3150) {
			iWidth=3150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.formulariorentaextraSessionBean.getEsGuardarRelacionado()) {
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
		
		FormularioRentaExtraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FormularioRentaExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFormularioRentaExtra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFormularioRentaExtra,this.jTtoolBarFormularioRentaExtra,
							"nuevo","nuevo","Nuevo"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFormularioRentaExtra,this.jTtoolBarFormularioRentaExtra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFormularioRentaExtra,this.jTtoolBarFormularioRentaExtra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFormularioRentaExtra,this.jTtoolBarFormularioRentaExtra,
							"duplicar","duplicar","Duplicar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFormularioRentaExtra,this.jTtoolBarFormularioRentaExtra,
							"copiar","copiar","Copiar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFormularioRentaExtra,this.jTtoolBarFormularioRentaExtra,
							"ver_form","ver_form","Ver"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormularioRentaExtra,this.jTtoolBarFormularioRentaExtra,
							"recargar","recargar","Recargar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormularioRentaExtra,this.jTtoolBarFormularioRentaExtra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFormularioRentaExtra,this.jTtoolBarFormularioRentaExtra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFormularioRentaExtra,this.jTtoolBarFormularioRentaExtra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFormularioRentaExtra,this.jTtoolBarFormularioRentaExtra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFormularioRentaExtra,this.jTtoolBarFormularioRentaExtra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFormularioRentaExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFormularioRentaExtra,this.jTtoolBarFormularioRentaExtra,
							"cerrar","cerrar","Salir"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFormularioRentaExtra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFormularioRentaExtra;
			
				this.jButtonProcesarInformacionToolBarFormularioRentaExtra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFormularioRentaExtra;
				
		//protected JButton jButtonModificarToolBarFormularioRentaExtra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFormularioRentaExtra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFormularioRentaExtra=new JMenuMe("General");
		this.jmenuArchivoFormularioRentaExtra=new JMenuMe("Archivo");
		this.jmenuAccionesFormularioRentaExtra=new JMenuMe("Acciones");
		this.jmenuDatosFormularioRentaExtra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormularioRentaExtra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormularioRentaExtra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormularioRentaExtra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFormularioRentaExtra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFormularioRentaExtra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFormularioRentaExtra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFormularioRentaExtra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFormularioRentaExtra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFormularioRentaExtra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFormularioRentaExtra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormularioRentaExtra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormularioRentaExtra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFormularioRentaExtra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFormularioRentaExtra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFormularioRentaExtra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFormularioRentaExtra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFormularioRentaExtra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFormularioRentaExtra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFormularioRentaExtra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFormularioRentaExtra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFormularioRentaExtra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormularioRentaExtra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormularioRentaExtra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormularioRentaExtra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFormularioRentaExtra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFormularioRentaExtra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFormularioRentaExtra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFormularioRentaExtra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFormularioRentaExtra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFormularioRentaExtra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFormularioRentaExtra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFormularioRentaExtra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFormularioRentaExtra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFormularioRentaExtra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFormularioRentaExtra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFormularioRentaExtra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFormularioRentaExtra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFormularioRentaExtra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFormularioRentaExtra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormularioRentaExtra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormularioRentaExtra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormularioRentaExtra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFormularioRentaExtra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFormularioRentaExtra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFormularioRentaExtra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormularioRentaExtra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormularioRentaExtra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormularioRentaExtra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFormularioRentaExtra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFormularioRentaExtra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFormularioRentaExtra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFormularioRentaExtra.add(this.jMenuItemCerrarFormularioRentaExtra);
			
			this.jmenuAccionesFormularioRentaExtra.add(this.jMenuItemNuevoFormularioRentaExtra);
			this.jmenuAccionesFormularioRentaExtra.add(this.jMenuItemNuevoGuardarCambiosFormularioRentaExtra);
			this.jmenuAccionesFormularioRentaExtra.add(this.jMenuItemNuevoRelacionesFormularioRentaExtra);
			this.jmenuAccionesFormularioRentaExtra.add(this.jMenuItemGuardarCambiosTablaFormularioRentaExtra);		
			this.jmenuAccionesFormularioRentaExtra.add(this.jMenuItemDuplicarFormularioRentaExtra);		
			this.jmenuAccionesFormularioRentaExtra.add(this.jMenuItemCopiarFormularioRentaExtra);		
			this.jmenuAccionesFormularioRentaExtra.add(this.jMenuItemVerFormFormularioRentaExtra);		
			
			this.jmenuDatosFormularioRentaExtra.add(this.jMenuItemRecargarInformacionFormularioRentaExtra);				
			this.jmenuDatosFormularioRentaExtra.add(this.jMenuItemAnterioresFormularioRentaExtra);				
			this.jmenuDatosFormularioRentaExtra.add(this.jMenuItemSiguientesFormularioRentaExtra);				
			this.jmenuDatosFormularioRentaExtra.add(this.jMenuItemAbrirOrderByFormularioRentaExtra);				
			this.jmenuDatosFormularioRentaExtra.add(this.jMenuItemMostrarOcultarFormularioRentaExtra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFormularioRentaExtra.add(this.jMenuItemGuardarCambiosFormularioRentaExtra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFormularioRentaExtra.add(this.jmenuArchivoFormularioRentaExtra);		
			this.jmenuBarFormularioRentaExtra.add(this.jmenuAccionesFormularioRentaExtra);		
			this.jmenuBarFormularioRentaExtra.add(this.jmenuDatosFormularioRentaExtra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFormularioRentaExtra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFormularioRentaExtra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBancoFormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBancoFormularioRentaExtra.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdBancoFormularioRentaExtra= new JButtonMe();
		this.jButtonFK_IdBancoFormularioRentaExtra.setText("Buscar");
		this.jButtonFK_IdBancoFormularioRentaExtra.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBancoFormularioRentaExtra,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBancoFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bancoFK_IdBancoFormularioRentaExtra = new JLabelMe();
		jLabelid_bancoFK_IdBancoFormularioRentaExtra.setText("Banco :");
		jLabelid_bancoFK_IdBancoFormularioRentaExtra.setToolTipText("Banco");
		jLabelid_bancoFK_IdBancoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bancoFK_IdBancoFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bancoFK_IdBancoFormularioRentaExtra= new JComboBoxMe();
		jComboBoxid_bancoFK_IdBancoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoFK_IdBancoFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDatoFormularioRentaFormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDatoFormularioRentaFormularioRentaExtra.setToolTipText("Buscar Por Dato Formulario Renta ");
		this.jButtonFK_IdDatoFormularioRentaFormularioRentaExtra= new JButtonMe();
		this.jButtonFK_IdDatoFormularioRentaFormularioRentaExtra.setText("Buscar");
		this.jButtonFK_IdDatoFormularioRentaFormularioRentaExtra.setToolTipText("Buscar Por Dato Formulario Renta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDatoFormularioRentaFormularioRentaExtra,"buscar_button","Buscar Por Dato Formulario Renta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDatoFormularioRentaFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra = new JLabelMe();
		jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra.setText("Dato Formulario Renta :");
		jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra.setToolTipText("Dato Formulario Renta");
		jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra= new JComboBoxMe();
		jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormaPagoFormularioRentaExtra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormaPagoFormularioRentaExtra.setToolTipText("Buscar Por Forma Pago ");
		this.jButtonFK_IdFormaPagoFormularioRentaExtra= new JButtonMe();
		this.jButtonFK_IdFormaPagoFormularioRentaExtra.setText("Buscar");
		this.jButtonFK_IdFormaPagoFormularioRentaExtra.setToolTipText("Buscar Por Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormaPagoFormularioRentaExtra,"buscar_button","Buscar Por Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormaPagoFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_forma_pagoFK_IdFormaPagoFormularioRentaExtra = new JLabelMe();
		jLabelid_forma_pagoFK_IdFormaPagoFormularioRentaExtra.setText("Forma Pago :");
		jLabelid_forma_pagoFK_IdFormaPagoFormularioRentaExtra.setToolTipText("Forma Pago");
		jLabelid_forma_pagoFK_IdFormaPagoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_forma_pagoFK_IdFormaPagoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_forma_pagoFK_IdFormaPagoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_forma_pagoFK_IdFormaPagoFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_forma_pagoFK_IdFormaPagoFormularioRentaExtra= new JComboBoxMe();
		jComboBoxid_forma_pagoFK_IdFormaPagoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_forma_pagoFK_IdFormaPagoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_forma_pagoFK_IdFormaPagoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_forma_pagoFK_IdFormaPagoFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFormularioRentaExtra=new JTabbedPane();


		this.jTabbedPaneBusquedasFormularioRentaExtra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormularioRentaExtra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFormularioRentaExtra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFormularioRentaExtra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFormularioRentaExtra = new FormularioRentaExtraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Formulario Renta Extra DATOS");
			this.jInternalFrameDetalleFormFormularioRentaExtra = new FormularioRentaExtraDetalleFormJInternalFrame(jDesktopPane,this.formulariorentaextraSessionBean.getConGuardarRelaciones(),this.formulariorentaextraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFormularioRentaExtra = null;//new FormularioRentaExtraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormularioRentaExtra= new GridBagLayout();
		
		
		this.jTableDatosFormularioRentaExtra = new JTableMe();      
		
		String sToolTipFormularioRentaExtra="";
		sToolTipFormularioRentaExtra=FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormularioRentaExtra+="(Contabilidad.FormularioRentaExtra)";
		}
		
		if(!this.formulariorentaextraSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormularioRentaExtra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFormularioRentaExtra.setToolTipText(sToolTipFormularioRentaExtra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFormularioRentaExtra);
		this.jTableDatosFormularioRentaExtra.setAutoCreateRowSorter(true);
		this.jTableDatosFormularioRentaExtra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFormularioRentaExtra.setRowSelectionAllowed(true);
		this.jTableDatosFormularioRentaExtra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFormularioRentaExtra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFormularioRentaExtra = new JButtonMe();
		this.jButtonDuplicarFormularioRentaExtra = new JButtonMe();
		this.jButtonCopiarFormularioRentaExtra = new JButtonMe();
		this.jButtonVerFormFormularioRentaExtra = new JButtonMe();
		this.jButtonNuevoRelacionesFormularioRentaExtra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFormularioRentaExtra = new JButtonMe();
		this.jButtonCerrarFormularioRentaExtra = new JButtonMe();
		
		this.jScrollPanelDatosFormularioRentaExtra = new JScrollPane();   
        this.jScrollPanelDatosGeneralFormularioRentaExtra = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFormularioRentaExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Formulario Renta Extra";
		
		if(!this.formulariorentaextraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Renta Extras" + this.sPath));
		} else {
			this.jScrollPanelDatosFormularioRentaExtra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormularioRentaExtra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRentaExtra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFormularioRentaExtra=new ReporteDinamicoJInternalFrame(FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFormularioRentaExtra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFormularioRentaExtra=new ImportacionJInternalFrame(FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFormularioRentaExtra();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFormularioRentaExtra = new JButtonMe();
		
		this.jButtonAbrirOrderByFormularioRentaExtra.setText("Orden");
		this.jButtonAbrirOrderByFormularioRentaExtra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormularioRentaExtra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFormularioRentaExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormularioRentaExtra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormularioRentaExtra,false,this);
			
			//this.cargarOrderByFormularioRentaExtra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFormularioRentaExtra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormularioRentaExtra,true,this);
			
			//this.cargarOrderByFormularioRentaExtra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFormularioRentaExtra.setMinimumSize(new Dimension(400,50));//3130
		this.jTableDatosFormularioRentaExtra.setMaximumSize(new Dimension(400,50));//3130
		this.jTableDatosFormularioRentaExtra.setPreferredSize(new Dimension(400,50));//3130
		
		this.jScrollPanelDatosFormularioRentaExtra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormularioRentaExtra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFormularioRentaExtra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFormularioRentaExtra.setText("Nuevo");
		this.jButtonDuplicarFormularioRentaExtra.setText("Duplicar");
		this.jButtonCopiarFormularioRentaExtra.setText("Copiar");
		this.jButtonVerFormFormularioRentaExtra.setText("Ver");
		this.jButtonNuevoRelacionesFormularioRentaExtra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFormularioRentaExtra.setText("Guardar");
		this.jButtonCerrarFormularioRentaExtra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormularioRentaExtra,"nuevo_button","Nuevo",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFormularioRentaExtra,"duplicar_button","Duplicar",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFormularioRentaExtra,"copiar_button","Copiar",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFormularioRentaExtra,"ver_form","Ver",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFormularioRentaExtra,"nuevorelaciones_button","Nuevo Rel",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormularioRentaExtra,"guardarcambiostabla_button","Guardar",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormularioRentaExtra,"cerrar_button","Salir",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFormularioRentaExtra.setToolTipText("Nuevo"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFormularioRentaExtra.setToolTipText("Duplicar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFormularioRentaExtra.setToolTipText("Copiar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFormularioRentaExtra.setToolTipText("Ver"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFormularioRentaExtra.setToolTipText("Nuevo Rel"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFormularioRentaExtra.setToolTipText("Guardar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormularioRentaExtra.setToolTipText("Salir"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormularioRentaExtra";
		inputMap = this.jButtonNuevoFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormularioRentaExtra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormularioRentaExtra"));
		
		//DUPLICAR
		sMapKey = "DuplicarFormularioRentaExtra";
		inputMap = this.jButtonDuplicarFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFormularioRentaExtra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFormularioRentaExtra"));
		
		//COPIAR
		sMapKey = "CopiarFormularioRentaExtra";
		inputMap = this.jButtonCopiarFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFormularioRentaExtra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFormularioRentaExtra"));
		
		//VEr FORM
		sMapKey = "VerFormFormularioRentaExtra";
		inputMap = this.jButtonVerFormFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFormularioRentaExtra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFormularioRentaExtra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFormularioRentaExtra";
		inputMap = this.jButtonNuevoRelacionesFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFormularioRentaExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFormularioRentaExtra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFormularioRentaExtra";
		inputMap = this.jButtonModificarFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFormularioRentaExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFormularioRentaExtra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFormularioRentaExtra";
		inputMap = this.jButtonCerrarFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormularioRentaExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormularioRentaExtra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormularioRentaExtra";
		inputMap = this.jButtonGuardarCambiosTablaFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormularioRentaExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormularioRentaExtra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFormularioRentaExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFormularioRentaExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFormularioRentaExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FormularioRentaExtra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FormularioRentaExtra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FormularioRentaExtra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FormularioRentaExtra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FormularioRentaExtra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFormularioRentaExtra.setName("jPanelParametrosReportesFormularioRentaExtra"); 
		
		this.jPanelParametrosReportesAccionesFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFormularioRentaExtra.setName("jPanelParametrosReportesAccionesFormularioRentaExtra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFormularioRentaExtra = new JButtonMe();
		this.jButtonRecargarInformacionFormularioRentaExtra.setText("Recargar");
		this.jButtonRecargarInformacionFormularioRentaExtra.setToolTipText("Recargar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFormularioRentaExtra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFormularioRentaExtra = new JButtonMe();
		this.jButtonProcesarInformacionFormularioRentaExtra.setText("Procesar");
		this.jButtonProcesarInformacionFormularioRentaExtra.setToolTipText("Procesar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFormularioRentaExtra.setVisible(false);
			
		this.jButtonProcesarInformacionFormularioRentaExtra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormularioRentaExtra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFormularioRentaExtra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFormularioRentaExtra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormularioRentaExtra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFormularioRentaExtra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFormularioRentaExtra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormularioRentaExtra.setText("TIPO");       
		this.jComboBoxTiposReportesFormularioRentaExtra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFormularioRentaExtra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFormularioRentaExtra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFormularioRentaExtra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFormularioRentaExtra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFormularioRentaExtra.setText("Paginacion");
		this.jComboBoxTiposPaginacionFormularioRentaExtra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFormularioRentaExtra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFormularioRentaExtra.setText("Accion");
		this.jComboBoxTiposRelacionesFormularioRentaExtra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFormularioRentaExtra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRentaExtra.setText("Accion");
		this.jComboBoxTiposAccionesFormularioRentaExtra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFormularioRentaExtra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFormularioRentaExtra.setText("Accion");
		this.jComboBoxTiposSeleccionarFormularioRentaExtra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFormularioRentaExtra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFormularioRentaExtra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormularioRentaExtra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFormularioRentaExtra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFormularioRentaExtra = new JLabelMe();
		
		this.jLabelAccionesFormularioRentaExtra.setText("Acciones");		
		this.jLabelAccionesFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFormularioRentaExtra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFormularioRentaExtra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFormularioRentaExtra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFormularioRentaExtra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFormularioRentaExtra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFormularioRentaExtra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFormularioRentaExtra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFormularioRentaExtra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFormularioRentaExtra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFormularioRentaExtra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFormularioRentaExtra.setText("Graf.");
		this.jCheckBoxConGraficoReporteFormularioRentaExtra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFormularioRentaExtra = new JButtonMe();
		//this.jButtonAnterioresFormularioRentaExtra.setText("<<");
        this.jButtonAnterioresFormularioRentaExtra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFormularioRentaExtra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFormularioRentaExtra = new JButtonMe();
		//this.jButtonSiguientesFormularioRentaExtra.setText(">>");
        this.jButtonSiguientesFormularioRentaExtra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFormularioRentaExtra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFormularioRentaExtra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFormularioRentaExtra.setText("Nue");
        this.jButtonNuevoGuardarCambiosFormularioRentaExtra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFormularioRentaExtra,"nuevoguardarcambios_button","Nue",this.formulariorentaextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFormularioRentaExtra";
		inputMap = this.jButtonNuevoGuardarCambiosFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFormularioRentaExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFormularioRentaExtra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFormularioRentaExtra";
		inputMap = this.jButtonRecargarInformacionFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFormularioRentaExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFormularioRentaExtra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFormularioRentaExtra";
		inputMap = this.jButtonSiguientesFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFormularioRentaExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFormularioRentaExtra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFormularioRentaExtra";
		inputMap = this.jButtonAnterioresFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFormularioRentaExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFormularioRentaExtra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFormularioRentaExtra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFormularioRentaExtra.setMinimumSize(new Dimension(this.getWidth(),FormularioRentaExtraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormularioRentaExtraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormularioRentaExtra.setMaximumSize(new Dimension(this.getWidth(),FormularioRentaExtraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormularioRentaExtraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFormularioRentaExtra.setPreferredSize(new Dimension(this.getWidth(),FormularioRentaExtraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FormularioRentaExtraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFormularioRentaExtra = new GridBagLayout();

			this.jPanelPaginacionFormularioRentaExtra.setLayout(gridaBagLayoutPaginacionFormularioRentaExtra);						
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
			this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFormularioRentaExtra.add(this.jButtonAnterioresFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
					
						
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
			
			this.jPanelPaginacionFormularioRentaExtra.add(this.jButtonNuevoGuardarCambiosFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
						
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
			this.jPanelPaginacionFormularioRentaExtra.add(this.jButtonSiguientesFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy = 1;
			this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioRentaExtra.add(this.jButtonNuevoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
						
			
			
			if(!this.formulariorentaextraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
				this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFormularioRentaExtra.gridy = 1;
				this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFormularioRentaExtra.add(this.jButtonGuardarCambiosTablaFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
			}
			
			
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy = 1;
			this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioRentaExtra.add(this.jButtonDuplicarFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy = 1;
			this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioRentaExtra.add(this.jButtonCopiarFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy = 1;
			this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFormularioRentaExtra.add(this.jButtonVerFormFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy = 1;
			this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFormularioRentaExtra.add(this.jButtonCerrarFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
		
		
		this.jButtonRecargarInformacionFormularioRentaExtra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormularioRentaExtra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFormularioRentaExtra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFormularioRentaExtra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormularioRentaExtra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFormularioRentaExtra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFormularioRentaExtra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormularioRentaExtra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFormularioRentaExtra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFormularioRentaExtra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormularioRentaExtra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFormularioRentaExtra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFormularioRentaExtra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormularioRentaExtra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFormularioRentaExtra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFormularioRentaExtra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormularioRentaExtra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFormularioRentaExtra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFormularioRentaExtra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioRentaExtra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormularioRentaExtra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFormularioRentaExtra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormularioRentaExtra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFormularioRentaExtra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFormularioRentaExtra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormularioRentaExtra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFormularioRentaExtra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFormularioRentaExtra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormularioRentaExtra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFormularioRentaExtra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFormularioRentaExtra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormularioRentaExtra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFormularioRentaExtra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFormularioRentaExtra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormularioRentaExtra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFormularioRentaExtra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFormularioRentaExtra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFormularioRentaExtra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FormularioRentaExtra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FormularioRentaExtra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FormularioRentaExtra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FormularioRentaExtra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFormularioRentaExtra.setLayout(gridaBagParametrosReportesFormularioRentaExtra);
			this.jPanelParametrosReportesAccionesFormularioRentaExtra.setLayout(gridaBagParametrosReportesAccionesFormularioRentaExtra);
			
			
			this.jPanelParametrosAuxiliar1FormularioRentaExtra.setLayout(gridaBagParametrosAuxiliar1FormularioRentaExtra);
			this.jPanelParametrosAuxiliar2FormularioRentaExtra.setLayout(gridaBagParametrosAuxiliar2FormularioRentaExtra);
			this.jPanelParametrosAuxiliar3FormularioRentaExtra.setLayout(gridaBagParametrosAuxiliar3FormularioRentaExtra);
			this.jPanelParametrosAuxiliar4FormularioRentaExtra.setLayout(gridaBagParametrosAuxiliar4FormularioRentaExtra);
			//this.jPanelParametrosAuxiliar5FormularioRentaExtra.setLayout(gridaBagParametrosAuxiliar2FormularioRentaExtra);			
			
			
			
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRentaExtra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioRentaExtra.add(this.jButtonRecargarInformacionFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormularioRentaExtra.add(this.jComboBoxTiposPaginacionFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormularioRentaExtra.add(this.jCheckBoxConAltoMaximoTablaFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FormularioRentaExtra.add(this.jComboBoxTiposArchivosReportesFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioRentaExtra.add(this.jPanelParametrosAuxiliar1FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRentaExtra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FormularioRentaExtra.add(this.jComboBoxTiposReportesFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);																		
			
			
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRentaExtra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4FormularioRentaExtra.add(this.jComboBoxTiposGraficosReportesFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioRentaExtra.add(this.jPanelParametrosAuxiliar4FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioRentaExtra.add(this.jComboBoxTiposReportesFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormularioRentaExtra.add(this.jCheckBoxGenerarReporteFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioRentaExtra.add(this.jPanelParametrosAuxiliar2FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRentaExtra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormularioRentaExtra.add(this.jLabelAccionesFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
				this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFormularioRentaExtra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFormularioRentaExtra.add(this.jButtonAbrirOrderByFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioRentaExtra.add(this.jComboBoxTiposSeleccionarFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);			
			
			
			/*
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRentaExtra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormularioRentaExtra.add(this.jCheckBoxSeleccionarTodosFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRentaExtra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFormularioRentaExtra.add(this.jCheckBoxConGraficoReporteFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRentaExtra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormularioRentaExtra.add(this.jCheckBoxSeleccionarTodosFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);															
				
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRentaExtra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormularioRentaExtra.add(this.jCheckBoxSeleccionadosFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);															
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFormularioRentaExtra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FormularioRentaExtra.add(this.jCheckBoxConGraficoReporteFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFormularioRentaExtra.add(this.jPanelParametrosAuxiliar3FormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioRentaExtra.add(this.jComboBoxTiposAccionesFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
	
				
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFormularioRentaExtra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFormularioRentaExtra.add(this.jTextFieldValorCampoGeneralFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFormularioRentaExtra = new GridBagLayout();

			this.jScrollPanelDatosFormularioRentaExtra.setLayout(gridaBagLayoutDatosFormularioRentaExtra);
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
			this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
			
			this.jScrollPanelDatosFormularioRentaExtra.add(this.jTableDatosFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFormularioRentaExtra.setViewportView(this.jTableDatosFormularioRentaExtra);
		this.jTableDatosFormularioRentaExtra.setFillsViewportHeight(true);
		this.jTableDatosFormularioRentaExtra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFormularioRentaExtra= new GridBagLayout();
		this.jPanelAccionesFormularioRentaExtra.setLayout(gridaBagLayoutAccionesFormularioRentaExtra);
		
		
		/*	
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = 0;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
			
		this.jPanelAccionesFormularioRentaExtra.add(this.jButtonNuevoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBancoFormularioRentaExtra= new GridBagLayout();
		gridaBagLayoutFK_IdBancoFormularioRentaExtra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBancoFormularioRentaExtra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBancoFormularioRentaExtra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBancoFormularioRentaExtra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBancoFormularioRentaExtra.setLayout(gridaBagLayoutFK_IdBancoFormularioRentaExtra);

		gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRentaExtra.gridy = 0;
		gridBagConstraintsFormularioRentaExtra.gridx = 0;
		jPanelFK_IdBancoFormularioRentaExtra.add(jLabelid_bancoFK_IdBancoFormularioRentaExtra, gridBagConstraintsFormularioRentaExtra);

		gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRentaExtra.gridy = 0;
		gridBagConstraintsFormularioRentaExtra.gridx = 1;
		jPanelFK_IdBancoFormularioRentaExtra.add(jComboBoxid_bancoFK_IdBancoFormularioRentaExtra, gridBagConstraintsFormularioRentaExtra);

		gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRentaExtra.gridy = 1;
		gridBagConstraintsFormularioRentaExtra.gridx =1;
		jPanelFK_IdBancoFormularioRentaExtra.add(jButtonFK_IdBancoFormularioRentaExtra, gridBagConstraintsFormularioRentaExtra);

		jTabbedPaneBusquedasFormularioRentaExtra.addTab("1.-Por Banco ", jPanelFK_IdBancoFormularioRentaExtra);
		jTabbedPaneBusquedasFormularioRentaExtra.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdDatoFormularioRentaFormularioRentaExtra= new GridBagLayout();
		gridaBagLayoutFK_IdDatoFormularioRentaFormularioRentaExtra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDatoFormularioRentaFormularioRentaExtra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDatoFormularioRentaFormularioRentaExtra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDatoFormularioRentaFormularioRentaExtra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDatoFormularioRentaFormularioRentaExtra.setLayout(gridaBagLayoutFK_IdDatoFormularioRentaFormularioRentaExtra);

		gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRentaExtra.gridy = 0;
		gridBagConstraintsFormularioRentaExtra.gridx = 0;
		jPanelFK_IdDatoFormularioRentaFormularioRentaExtra.add(jLabelid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra, gridBagConstraintsFormularioRentaExtra);

		gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRentaExtra.gridy = 0;
		gridBagConstraintsFormularioRentaExtra.gridx = 1;
		jPanelFK_IdDatoFormularioRentaFormularioRentaExtra.add(jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRentaExtra, gridBagConstraintsFormularioRentaExtra);

		gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRentaExtra.gridy = 1;
		gridBagConstraintsFormularioRentaExtra.gridx =1;
		jPanelFK_IdDatoFormularioRentaFormularioRentaExtra.add(jButtonFK_IdDatoFormularioRentaFormularioRentaExtra, gridBagConstraintsFormularioRentaExtra);

		jTabbedPaneBusquedasFormularioRentaExtra.addTab("2.-Por Dato Formulario Renta ", jPanelFK_IdDatoFormularioRentaFormularioRentaExtra);
		jTabbedPaneBusquedasFormularioRentaExtra.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdFormaPagoFormularioRentaExtra= new GridBagLayout();
		gridaBagLayoutFK_IdFormaPagoFormularioRentaExtra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormaPagoFormularioRentaExtra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormaPagoFormularioRentaExtra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormaPagoFormularioRentaExtra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormaPagoFormularioRentaExtra.setLayout(gridaBagLayoutFK_IdFormaPagoFormularioRentaExtra);

		gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRentaExtra.gridy = 0;
		gridBagConstraintsFormularioRentaExtra.gridx = 0;
		jPanelFK_IdFormaPagoFormularioRentaExtra.add(jLabelid_forma_pagoFK_IdFormaPagoFormularioRentaExtra, gridBagConstraintsFormularioRentaExtra);

		gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRentaExtra.gridy = 0;
		gridBagConstraintsFormularioRentaExtra.gridx = 1;
		jPanelFK_IdFormaPagoFormularioRentaExtra.add(jComboBoxid_forma_pagoFK_IdFormaPagoFormularioRentaExtra, gridBagConstraintsFormularioRentaExtra);

		gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFormularioRentaExtra.gridy = 1;
		gridBagConstraintsFormularioRentaExtra.gridx =1;
		jPanelFK_IdFormaPagoFormularioRentaExtra.add(jButtonFK_IdFormaPagoFormularioRentaExtra, gridBagConstraintsFormularioRentaExtra);

		jTabbedPaneBusquedasFormularioRentaExtra.addTab("3.-Por Forma Pago ", jPanelFK_IdFormaPagoFormularioRentaExtra);
		jTabbedPaneBusquedasFormularioRentaExtra.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormularioRentaExtra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormularioRentaExtra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formulariorentaextraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();						
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormularioRentaExtra.gridx = 0;		
			//this.gridBagConstraintsFormularioRentaExtra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormularioRentaExtra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFormularioRentaExtra.gridx = 0;		
		//this.gridBagConstraintsFormularioRentaExtra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFormularioRentaExtra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFormularioRentaExtra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormularioRentaExtra.gridx = 0;		
			this.gridBagConstraintsFormularioRentaExtra.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFormularioRentaExtra.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);								
		
		
		/*
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		*/		
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormularioRentaExtra.gridx =0;
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormularioRentaExtra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
				
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FormularioRentaExtraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFormularioRentaExtra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormularioRentaExtra = new GridBagLayout();
			this.jPanelBusquedasParametrosFormularioRentaExtra.setLayout(gridaBagLayoutBusquedasParametrosFormularioRentaExtra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFormularioRentaExtra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormularioRentaExtra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioRentaExtra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormularioRentaExtra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
			
			
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
			
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormularioRentaExtra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFormularioRentaExtra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFormularioRentaExtra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFormularioRentaExtra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFormularioRentaExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFormularioRentaExtra.setName("jPanelReporteDinamicoFormularioRentaExtra"); 
		
		this.jPanelReporteDinamicoFormularioRentaExtra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormularioRentaExtra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFormularioRentaExtra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFormularioRentaExtra.setLayout(gridaBagLayoutReporteDinamicoFormularioRentaExtra);
		
		
		this.jInternalFrameReporteDinamicoFormularioRentaExtra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFormularioRentaExtra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormularioRentaExtra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFormularioRentaExtra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFormularioRentaExtra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFormularioRentaExtra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFormularioRentaExtra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFormularioRentaExtra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFormularioRentaExtra.setResizable(true);
	    this.jInternalFrameReporteDinamicoFormularioRentaExtra.setClosable(true);
	    this.jInternalFrameReporteDinamicoFormularioRentaExtra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFormularioRentaExtra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormularioRentaExtra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFormularioRentaExtra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Renta Extras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFormularioRentaExtra = new JLabelMe();

		this.jLabelColumnasSelectReporteFormularioRentaExtra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jLabelColumnasSelectReporteFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFormularioRentaExtra = new JList<Reporte>();
		this.jListColumnasSelectReporteFormularioRentaExtra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFormularioRentaExtra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFormularioRentaExtra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormularioRentaExtra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFormularioRentaExtra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFormularioRentaExtra=new JScrollPane(this.jListColumnasSelectReporteFormularioRentaExtra);
			
			this.jScrollColumnasSelectReporteFormularioRentaExtra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormularioRentaExtra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFormularioRentaExtra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jListColumnasSelectReporteFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jScrollColumnasSelectReporteFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFormularioRentaExtra = new JLabelMe();

		this.jLabelRelacionesSelectReporteFormularioRentaExtra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFormularioRentaExtra = new JList<Reporte>();
		this.jListRelacionesSelectReporteFormularioRentaExtra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFormularioRentaExtra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFormularioRentaExtra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormularioRentaExtra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFormularioRentaExtra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFormularioRentaExtra=new JScrollPane(this.jListRelacionesSelectReporteFormularioRentaExtra);
			
			this.jScrollRelacionesSelectReporteFormularioRentaExtra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormularioRentaExtra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFormularioRentaExtra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFormularioRentaExtra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFormularioRentaExtra = new JComboBoxMe();
		this.jListColumnasValoresGraficoFormularioRentaExtra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFormularioRentaExtra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFormularioRentaExtra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFormularioRentaExtra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormularioRentaExtra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFormularioRentaExtra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFormularioRentaExtra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFormularioRentaExtra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFormularioRentaExtra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormularioRentaExtra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFormularioRentaExtra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFormularioRentaExtra = new JLabelMe();

		this.jLabelConGraficoDinamicoFormularioRentaExtra.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jLabelConGraficoDinamicoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFormularioRentaExtra = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFormularioRentaExtra.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFormularioRentaExtra.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFormularioRentaExtra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormularioRentaExtra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFormularioRentaExtra.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jCheckBoxConGraficoDinamicoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFormularioRentaExtra = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFormularioRentaExtra.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jLabelColumnaCategoriaGraficoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFormularioRentaExtra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormularioRentaExtra.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFormularioRentaExtra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFormularioRentaExtra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormularioRentaExtra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFormularioRentaExtra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jComboBoxColumnaCategoriaGraficoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFormularioRentaExtra = new JLabelMe();

		this.jLabelColumnaCategoriaValorFormularioRentaExtra.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jLabelColumnaCategoriaValorFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFormularioRentaExtra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFormularioRentaExtra.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFormularioRentaExtra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFormularioRentaExtra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormularioRentaExtra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFormularioRentaExtra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jComboBoxColumnaCategoriaValorFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFormularioRentaExtra = new JLabelMe();

		this.jLabelColumnasValoresGraficoFormularioRentaExtra.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jLabelColumnasValoresGraficoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFormularioRentaExtra = new JList<Reporte>();
		this.jListColumnasValoresGraficoFormularioRentaExtra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFormularioRentaExtra.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFormularioRentaExtra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormularioRentaExtra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFormularioRentaExtra.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFormularioRentaExtra=new JScrollPane(this.jListColumnasValoresGraficoFormularioRentaExtra);
			
			this.jScrollColumnasValoresGraficoFormularioRentaExtra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormularioRentaExtra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFormularioRentaExtra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jListColumnasSelectReporteFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jScrollColumnasValoresGraficoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFormularioRentaExtra = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFormularioRentaExtra.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jLabelTiposGraficosReportesDinamicoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFormularioRentaExtra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFormularioRentaExtra.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFormularioRentaExtra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFormularioRentaExtra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormularioRentaExtra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFormularioRentaExtra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jComboBoxTiposGraficosReportesDinamicoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFormularioRentaExtra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFormularioRentaExtra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jLabelGenerarExcelReporteDinamicoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFormularioRentaExtra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFormularioRentaExtra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFormularioRentaExtra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFormularioRentaExtra.setToolTipText("Generar EXCEL"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		//this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jButtonGenerarExcelReporteDinamicoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jComboBoxTiposReportesDinamicoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFormularioRentaExtra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFormularioRentaExtra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jLabelTiposArchivoReporteDinamicoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jComboBoxTiposArchivosReportesDinamicoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFormularioRentaExtra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFormularioRentaExtra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFormularioRentaExtra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFormularioRentaExtra.setToolTipText("Generar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jButtonGenerarReporteDinamicoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFormularioRentaExtra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFormularioRentaExtra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFormularioRentaExtra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFormularioRentaExtra.setToolTipText("Cancelar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFormularioRentaExtra.add(this.jButtonCerrarReporteDinamicoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFormularioRentaExtra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFormularioRentaExtra= new JScrollPane(jPanelReporteDinamicoFormularioRentaExtra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFormularioRentaExtra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormularioRentaExtra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFormularioRentaExtra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Renta Extras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFormularioRentaExtra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFormularioRentaExtra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFormularioRentaExtra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFormularioRentaExtra);
		this.jInternalFrameReporteDinamicoFormularioRentaExtra.getContentPane().add(this.jScrollPanelReporteDinamicoFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFormularioRentaExtra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFormularioRentaExtra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFormularioRentaExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFormularioRentaExtra.setName("jPanelImportacionFormularioRentaExtra"); 
		
		this.jPanelImportacionFormularioRentaExtra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormularioRentaExtra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFormularioRentaExtra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFormularioRentaExtra.setLayout(gridaBagLayoutImportacionFormularioRentaExtra);
		
		
		this.jInternalFrameImportacionFormularioRentaExtra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFormularioRentaExtra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFormularioRentaExtra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFormularioRentaExtra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFormularioRentaExtra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormularioRentaExtra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormularioRentaExtra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFormularioRentaExtra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormularioRentaExtra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormularioRentaExtra.setResizable(true);
	    this.jInternalFrameImportacionFormularioRentaExtra.setClosable(true);
	    this.jInternalFrameImportacionFormularioRentaExtra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFormularioRentaExtra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFormularioRentaExtra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFormularioRentaExtra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFormularioRentaExtra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFormularioRentaExtra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFormularioRentaExtra.setResizable(true);
	    this.jInternalFrameImportacionFormularioRentaExtra.setClosable(true);
	    this.jInternalFrameImportacionFormularioRentaExtra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFormularioRentaExtra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormularioRentaExtra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFormularioRentaExtra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Renta Extras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFormularioRentaExtra = new JLabelMe();

		this.jLabelArchivoImportacionFormularioRentaExtra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormularioRentaExtra.add(this.jLabelArchivoImportacionFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFormularioRentaExtra = new JFileChooser();		
		this.jFileChooserImportacionFormularioRentaExtra.setToolTipText("ESCOGER ARCHIVO"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFormularioRentaExtra = new JButtonMe();
		this.jButtonAbrirImportacionFormularioRentaExtra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFormularioRentaExtra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFormularioRentaExtra.setToolTipText("Generar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioRentaExtra.add(this.jButtonAbrirImportacionFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFormularioRentaExtra = new JLabelMe();

		this.jLabelPathArchivoImportacionFormularioRentaExtra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFormularioRentaExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormularioRentaExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFormularioRentaExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYImportacion;		
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFormularioRentaExtra.add(this.jLabelPathArchivoImportacionFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFormularioRentaExtra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFormularioRentaExtra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormularioRentaExtra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFormularioRentaExtra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioRentaExtra.add(this.jTextFieldPathArchivoImportacionFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFormularioRentaExtra = new JButtonMe();
		this.jButtonGenerarImportacionFormularioRentaExtra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFormularioRentaExtra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFormularioRentaExtra.setToolTipText("Generar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioRentaExtra.add(this.jButtonGenerarImportacionFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFormularioRentaExtra = new JButtonMe();
		this.jButtonCerrarImportacionFormularioRentaExtra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFormularioRentaExtra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFormularioRentaExtra.setToolTipText("Cancelar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYImportacion;
		this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFormularioRentaExtra.add(this.jButtonCerrarImportacionFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFormularioRentaExtra = new GridBagLayout();
		
		this.jScrollPanelImportacionFormularioRentaExtra= new JScrollPane(jPanelImportacionFormularioRentaExtra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
		this.gridBagConstraintsFormularioRentaExtra.gridy =iPosYImportacion;
		this.gridBagConstraintsFormularioRentaExtra.gridx =iPosXImportacion;
		this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFormularioRentaExtra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFormularioRentaExtra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFormularioRentaExtra);
		this.jInternalFrameImportacionFormularioRentaExtra.getContentPane().add(this.jScrollPanelImportacionFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFormularioRentaExtra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFormularioRentaExtra = new JButtonMe();
			this.jButtonAbrirOrderByFormularioRentaExtra.setText("Orden");
			this.jButtonAbrirOrderByFormularioRentaExtra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFormularioRentaExtra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFormularioRentaExtra";
			inputMap = this.jButtonAbrirOrderByFormularioRentaExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFormularioRentaExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFormularioRentaExtra"));
		
		
			GridBagLayout gridaBagLayoutOrderByFormularioRentaExtra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFormularioRentaExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFormularioRentaExtra.setName("jPanelOrderByFormularioRentaExtra"); 
			
			this.jPanelOrderByFormularioRentaExtra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormularioRentaExtra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFormularioRentaExtra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFormularioRentaExtra.setLayout(gridaBagLayoutOrderByFormularioRentaExtra);
			
			
			this.jTableDatosFormularioRentaExtraOrderBy = new JTableMe();        
			this.jTableDatosFormularioRentaExtraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFormularioRentaExtraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFormularioRentaExtraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFormularioRentaExtraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFormularioRentaExtraOrderBy.setViewportView(this.jTableDatosFormularioRentaExtraOrderBy);
			this.jTableDatosFormularioRentaExtraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFormularioRentaExtraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFormularioRentaExtra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFormularioRentaExtra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFormularioRentaExtra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFormularioRentaExtra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFormularioRentaExtra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFormularioRentaExtra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFormularioRentaExtra.setTitle("Orden");
			this.jInternalFrameOrderByFormularioRentaExtra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFormularioRentaExtra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFormularioRentaExtra.setResizable(true);
			this.jInternalFrameOrderByFormularioRentaExtra.setClosable(true);
			this.jInternalFrameOrderByFormularioRentaExtra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFormularioRentaExtra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormularioRentaExtra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFormularioRentaExtra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFormularioRentaExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulario Renta Extras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFormularioRentaExtra.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFormularioRentaExtra.ipady =150;
				
			this.jPanelOrderByFormularioRentaExtra.add(jScrollPanelDatosFormularioRentaExtraOrderBy, this.gridBagConstraintsFormularioRentaExtra);//this.jTableDatosFormularioRentaExtraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFormularioRentaExtra = new JButtonMe();
			this.jButtonCerrarOrderByFormularioRentaExtra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFormularioRentaExtra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFormularioRentaExtra.setToolTipText("Cancelar"+" "+FormularioRentaExtraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFormularioRentaExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormularioRentaExtra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFormularioRentaExtra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFormularioRentaExtra.add(this.jButtonCerrarOrderByFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFormularioRentaExtra = new GridBagLayout();
			
			this.jScrollPanelOrderByFormularioRentaExtra= new JScrollPane(jPanelOrderByFormularioRentaExtra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFormularioRentaExtra = new GridBagConstraints();
			this.gridBagConstraintsFormularioRentaExtra.gridy =iPosYOrderBy;
			this.gridBagConstraintsFormularioRentaExtra.gridx =iPosXOrderBy;
			this.gridBagConstraintsFormularioRentaExtra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFormularioRentaExtra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFormularioRentaExtra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFormularioRentaExtra);
			
			this.jInternalFrameOrderByFormularioRentaExtra.getContentPane().add(this.jScrollPanelOrderByFormularioRentaExtra, this.gridBagConstraintsFormularioRentaExtra);			
		
		} else {
			this.jButtonAbrirOrderByFormularioRentaExtra = new JButtonMe();
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
		int iWidthTableCalculado=0;//6430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.formulariorentaextraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFormularioRentaExtra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFormularioRentaExtra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFormularioRentaExtra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFormularioRentaExtra.getRowHeight();//FormularioRentaExtraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.formulariorentaextraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FormularioRentaExtraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormularioRentaExtra.isSelected()) {
					iHeightTable=FormularioRentaExtraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormularioRentaExtraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormularioRentaExtraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FormularioRentaExtraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFormularioRentaExtra.isSelected()) {
					iHeightTable=FormularioRentaExtraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FormularioRentaExtraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FormularioRentaExtraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFormularioRentaExtra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormularioRentaExtra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFormularioRentaExtra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFormularioRentaExtra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormularioRentaExtra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFormularioRentaExtra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFormularioRentaExtra!=null && this.jInternalFrameOrderByFormularioRentaExtra.getjTableDatosOrderBy()!=null) {
			//if(!this.formulariorentaextraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFormularioRentaExtra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFormularioRentaExtra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFormularioRentaExtra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFormularioRentaExtra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFormularioRentaExtra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFormularioRentaExtra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFormularioRentaExtra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFormularioRentaExtra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormularioRentaExtra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFormularioRentaExtra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=formulariorentaextraLogic.getFormularioRentaExtras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formulariorentaextras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FormularioRentaExtra> TraerFormularioRentaExtraBeans(List<FormularioRentaExtra> formulariorentaextras,ArrayList<Classe> classes)throws Exception {
		try {
			for(FormularioRentaExtra formulariorentaextra:formulariorentaextras) {
					
				if(!(FormularioRentaExtraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FormularioRentaExtraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					formulariorentaextra.setsDetalleGeneralEntityReporte(FormularioRentaExtraConstantesFunciones.getFormularioRentaExtraDescripcion(formulariorentaextra));
										
						
					
						
					
				} else  {
							
					//formulariorentaextra.setsDetalleGeneralEntityReporte(formulariorentaextra.getsDetalleGeneralEntityReporte());
										
				}
				
				//formulariorentaextrabeans.add(formulariorentaextrabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return formulariorentaextras;
    }
	//PARA REPORTES FIN
}
