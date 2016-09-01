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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.DetaFormaPagoFactuConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class DetaFormaPagoFactuJInternalFrame extends DetaFormaPagoFactuBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetaFormaPagoFactu;
	
	protected JMenuBar jmenuBarDetaFormaPagoFactu;
	
	protected JMenu jmenuDetaFormaPagoFactu;
	protected JMenu jmenuDatosDetaFormaPagoFactu;
	protected JMenu jmenuArchivoDetaFormaPagoFactu;
	protected JMenu jmenuAccionesDetaFormaPagoFactu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetaFormaPagoFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetaFormaPagoFactu;	
	protected GridBagConstraints gridBagConstraintsDetaFormaPagoFactu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetaFormaPagoFactuDetalleFormJInternalFrame jInternalFrameDetalleFormDetaFormaPagoFactu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetaFormaPagoFactu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetaFormaPagoFactu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";
	
	public DetaFormaPagoFactuSessionBean detaformapagofactuSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetaFormaPagoFactu> detaformapagofactus;		
	public List<DetaFormaPagoFactu> detaformapagofactusEliminados;	
	public List<DetaFormaPagoFactu> detaformapagofactusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetaFormaPagoFactu;		
	protected JButton jButtonAbrirOrderByDetaFormaPagoFactu;
	
	
	//protected JPanel jPanelOrderByDetaFormaPagoFactu;
	//public JScrollPane jScrollPanelOrderByDetaFormaPagoFactu;	
	//protected JButton jButtonCerrarOrderByDetaFormaPagoFactu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetaFormaPagoFactuLogic detaformapagofactuLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetaFormaPagoFactu;
	public JScrollPane jScrollPanelDatosEdicionDetaFormaPagoFactu;
	public JScrollPane jScrollPanelDatosGeneralDetaFormaPagoFactu;
    
	
	
	//public JScrollPane jScrollPanelDatosDetaFormaPagoFactuOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetaFormaPagoFactu;
	//public JScrollPane jScrollPanelImportacionDetaFormaPagoFactu;
	
	
	
	protected JPanel jPanelAccionesDetaFormaPagoFactu;
	
    protected JPanel jPanelPaginacionDetaFormaPagoFactu;
    protected JPanel jPanelParametrosReportesDetaFormaPagoFactu;
	protected JPanel jPanelParametrosReportesAccionesDetaFormaPagoFactu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetaFormaPagoFactu;
	protected JPanel jPanelParametrosAuxiliar2DetaFormaPagoFactu;
	protected JPanel jPanelParametrosAuxiliar3DetaFormaPagoFactu;
	protected JPanel jPanelParametrosAuxiliar4DetaFormaPagoFactu;
	//protected JPanel jPanelParametrosAuxiliar5DetaFormaPagoFactu;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetaFormaPagoFactu;
	//protected JPanel jPanelImportacionDetaFormaPagoFactu;
	
	
	public JTable jTableDatosDetaFormaPagoFactu;
	
	
	
	//public JTable jTableDatosDetaFormaPagoFactuOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetaFormaPagoFactu;
	protected JButton jButtonDuplicarDetaFormaPagoFactu;
	protected JButton jButtonCopiarDetaFormaPagoFactu;
	protected JButton jButtonVerFormDetaFormaPagoFactu;
	protected JButton jButtonNuevoRelacionesDetaFormaPagoFactu;
	protected JButton jButtonModificarDetaFormaPagoFactu;
	
    protected JButton jButtonGuardarCambiosTablaDetaFormaPagoFactu;
	protected JButton jButtonCerrarDetaFormaPagoFactu;
	
	
	protected JButton jButtonRecargarInformacionDetaFormaPagoFactu;
	protected JButton jButtonProcesarInformacionDetaFormaPagoFactu;
	
	
	protected JButton jButtonAnterioresDetaFormaPagoFactu;
	protected JButton jButtonSiguientesDetaFormaPagoFactu;
	protected JButton jButtonNuevoGuardarCambiosDetaFormaPagoFactu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetaFormaPagoFactu;
	//protected JButton jButtonCerrarReporteDinamicoDetaFormaPagoFactu;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetaFormaPagoFactu;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetaFormaPagoFactu;
	//protected JButton jButtonGenerarImportacionDetaFormaPagoFactu;
	//protected JButton jButtonCerrarImportacionDetaFormaPagoFactu;
	//protected JFileChooser jFileChooserImportacionDetaFormaPagoFactu;
	//protected File fileImportacionDetaFormaPagoFactu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetaFormaPagoFactu;
	protected JButton jButtonDuplicarToolBarDetaFormaPagoFactu;
	protected JButton jButtonNuevoRelacionesToolBarDetaFormaPagoFactu;
	
	
	public JButton jButtonGuardarCambiosToolBarDetaFormaPagoFactu;
	protected JButton jButtonCopiarToolBarDetaFormaPagoFactu;
	protected JButton jButtonVerFormToolBarDetaFormaPagoFactu;
	public JButton jButtonGuardarCambiosTablaToolBarDetaFormaPagoFactu;
	protected JButton jButtonMostrarOcultarTablaToolBarDetaFormaPagoFactu;
	protected JButton jButtonCerrarToolBarDetaFormaPagoFactu;
	
	protected JButton jButtonRecargarInformacionToolBarDetaFormaPagoFactu;
	protected JButton jButtonProcesarInformacionToolBarDetaFormaPagoFactu;
	protected JButton jButtonAnterioresToolBarDetaFormaPagoFactu;
	protected JButton jButtonSiguientesToolBarDetaFormaPagoFactu;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetaFormaPagoFactu;
	protected JButton jButtonAbrirOrderByToolBarDetaFormaPagoFactu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetaFormaPagoFactu;
	protected JMenuItem jMenuItemDuplicarDetaFormaPagoFactu;
	protected JMenuItem jMenuItemNuevoRelacionesDetaFormaPagoFactu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetaFormaPagoFactu;
	protected JMenuItem jMenuItemCopiarDetaFormaPagoFactu;
	protected JMenuItem jMenuItemVerFormDetaFormaPagoFactu;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetaFormaPagoFactu;
	protected JMenuItem jMenuItemCerrarDetaFormaPagoFactu;
	protected JMenuItem jMenuItemDetalleCerrarDetaFormaPagoFactu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetaFormaPagoFactu;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetaFormaPagoFactu;
	
	protected JMenuItem jMenuItemRecargarInformacionDetaFormaPagoFactu;
	protected JMenuItem jMenuItemProcesarInformacionDetaFormaPagoFactu;
	protected JMenuItem jMenuItemAnterioresDetaFormaPagoFactu;
	protected JMenuItem jMenuItemSiguientesDetaFormaPagoFactu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetaFormaPagoFactu;
	protected JMenuItem jMenuItemAbrirOrderByDetaFormaPagoFactu;
	protected JMenuItem jMenuItemMostrarOcultarDetaFormaPagoFactu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetaFormaPagoFactu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetaFormaPagoFactu;
	protected JCheckBox jCheckBoxSeleccionadosDetaFormaPagoFactu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetaFormaPagoFactu;
	protected JCheckBox jCheckBoxConGraficoReporteDetaFormaPagoFactu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetaFormaPagoFactu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetaFormaPagoFactu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetaFormaPagoFactu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetaFormaPagoFactu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetaFormaPagoFactu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetaFormaPagoFactu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetaFormaPagoFactu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetaFormaPagoFactu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetaFormaPagoFactu;
	protected JTextField jTextFieldValorCampoGeneralDetaFormaPagoFactu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetaFormaPagoFactu;
	//public JList<Reporte> jListColumnasSelectReporteDetaFormaPagoFactu;
	//public JScrollPane jScrollColumnasSelectReporteDetaFormaPagoFactu;
	
	//public JLabel jLabelRelacionesSelectReporteDetaFormaPagoFactu;
	//public JList<Reporte> jListRelacionesSelectReporteDetaFormaPagoFactu;
	//public JScrollPane jScrollRelacionesSelectReporteDetaFormaPagoFactu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetaFormaPagoFactu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetaFormaPagoFactu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetaFormaPagoFactu;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetaFormaPagoFactu;
	
		
	//public JLabel jLabelArchivoImportacionDetaFormaPagoFactu;	
	//public JLabel jLabelPathArchivoImportacionDetaFormaPagoFactu;
	//protected JTextField jTextFieldPathArchivoImportacionDetaFormaPagoFactu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetaFormaPagoFactu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetaFormaPagoFactu;
	
	//public JLabel jLabelColumnaCategoriaValorDetaFormaPagoFactu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetaFormaPagoFactu;
	
	//public JLabel jLabelColumnasValoresGraficoDetaFormaPagoFactu;
	//public JList<Reporte> jListColumnasValoresGraficoDetaFormaPagoFactu;
	//public JScrollPane jScrollColumnasValoresGraficoDetaFormaPagoFactu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetaFormaPagoFactu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetaFormaPagoFactu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetaFormaPagoFactu;
	public JPanel jPanelBusquedaPorNombreDetaFormaPagoFactu;
	public JButton jButtonBusquedaPorNombreDetaFormaPagoFactu;
	public JPanel jPanelFK_IdTipoFormaPagoDetaFormaPagoFactu;
	public JButton jButtonFK_IdTipoFormaPagoDetaFormaPagoFactu;
	
	public JPanel jPanelnombreBusquedaPorNombreDetaFormaPagoFactu;
	public JLabel jLabelnombreBusquedaPorNombreDetaFormaPagoFactu;
	public JTextArea jTextAreanombreBusquedaPorNombreDetaFormaPagoFactu;
	public JButton jButtonnombreBusquedaPorNombreDetaFormaPagoFactuBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu;
	public JLabel jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu;
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactuUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactuBusqueda= new JButtonMe();

	
	
	
	
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
	public DetaFormaPagoFactuJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetaFormaPagoFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaFormaPagoFactuJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaFormaPagoFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaFormaPagoFactuJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaFormaPagoFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaFormaPagoFactuJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetaFormaPagoFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetaFormaPagoFactu)	{
		this.jButtonRecargarInformacionDetaFormaPagoFactu = jButtonRecargarInformacionDetaFormaPagoFactu;
	}
	
	public JButton getjButtonProcesarInformacionDetaFormaPagoFactu() {
		return this.jButtonProcesarInformacionDetaFormaPagoFactu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetaFormaPagoFactu)	{
		this.jButtonProcesarInformacionDetaFormaPagoFactu = jButtonProcesarInformacionDetaFormaPagoFactu;
	}
	
	
	public JButton getjButtonRecargarInformacionDetaFormaPagoFactu() {
		return this.jButtonRecargarInformacionDetaFormaPagoFactu;
	}
	
	
	public List<DetaFormaPagoFactu> getdetaformapagofactus() {
		return this.detaformapagofactus;
	}

	public void setdetaformapagofactus(List<DetaFormaPagoFactu> detaformapagofactus) {
		this.detaformapagofactus = detaformapagofactus;
	}
	
	public List<DetaFormaPagoFactu> getdetaformapagofactusAux() {
		return this.detaformapagofactusAux;
	}

	public void setdetaformapagofactusAux(List<DetaFormaPagoFactu> detaformapagofactusAux) {
		this.detaformapagofactusAux = detaformapagofactusAux;
	}
	
	public List<DetaFormaPagoFactu> getdetaformapagofactusEliminados() {
		return this.detaformapagofactusEliminados;
	}

	public void setDetaFormaPagoFactusEliminados(List<DetaFormaPagoFactu> detaformapagofactusEliminados) {
		this.detaformapagofactusEliminados = detaformapagofactusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetaFormaPagoFactu() {
		return jComboBoxTiposSeleccionarDetaFormaPagoFactu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetaFormaPagoFactu(
			JComboBox jComboBoxTiposSeleccionarDetaFormaPagoFactu) {
		this.jComboBoxTiposSeleccionarDetaFormaPagoFactu = jComboBoxTiposSeleccionarDetaFormaPagoFactu;
	}
	
	public void setBorderResaltarTiposSeleccionarDetaFormaPagoFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetaFormaPagoFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetaFormaPagoFactu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetaFormaPagoFactu() {
		return jTextFieldValorCampoGeneralDetaFormaPagoFactu;
	}

	public void setjTextFieldValorCampoGeneralDetaFormaPagoFactu(
			JTextField jTextFieldValorCampoGeneralDetaFormaPagoFactu) {
		this.jTextFieldValorCampoGeneralDetaFormaPagoFactu = jTextFieldValorCampoGeneralDetaFormaPagoFactu;
	}

	public void setBorderResaltarValorCampoGeneralDetaFormaPagoFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPagoFactu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetaFormaPagoFactu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetaFormaPagoFactu() {
		return this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu;
	}

	public void setjCheckBoxSeleccionarTodosDetaFormaPagoFactu(
			JCheckBox jCheckBoxSeleccionarTodosDetaFormaPagoFactu) {
		this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu = jCheckBoxSeleccionarTodosDetaFormaPagoFactu;
	}

	public void setBorderResaltarSeleccionarTodosDetaFormaPagoFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPagoFactu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetaFormaPagoFactu() {
		return this.jCheckBoxSeleccionadosDetaFormaPagoFactu;
	}

	public void setjCheckBoxSeleccionadosDetaFormaPagoFactu(
			JCheckBox jCheckBoxSeleccionadosDetaFormaPagoFactu) {
		this.jCheckBoxSeleccionadosDetaFormaPagoFactu = jCheckBoxSeleccionadosDetaFormaPagoFactu;
	}
	
	public void setBorderResaltarSeleccionadosDetaFormaPagoFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPagoFactu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetaFormaPagoFactu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetaFormaPagoFactu() {
		return this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetaFormaPagoFactu(
			JComboBox jComboBoxTiposArchivosReportesDetaFormaPagoFactu) {
		this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu = jComboBoxTiposArchivosReportesDetaFormaPagoFactu;
	}

	public void setBorderResaltarTiposArchivosReportesDetaFormaPagoFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPagoFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetaFormaPagoFactu() {
		return this.jComboBoxTiposReportesDetaFormaPagoFactu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetaFormaPagoFactu(
			JComboBox jComboBoxTiposReportesDetaFormaPagoFactu) {
		this.jComboBoxTiposReportesDetaFormaPagoFactu = jComboBoxTiposReportesDetaFormaPagoFactu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetaFormaPagoFactu() {
	//	return jComboBoxTiposReportesDinamicoDetaFormaPagoFactu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetaFormaPagoFactu(
	//		JComboBox jComboBoxTiposReportesDinamicoDetaFormaPagoFactu) {
	//	this.jComboBoxTiposReportesDinamicoDetaFormaPagoFactu = jComboBoxTiposReportesDinamicoDetaFormaPagoFactu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetaFormaPagoFactu() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetaFormaPagoFactu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetaFormaPagoFactu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetaFormaPagoFactu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPagoFactu = jComboBoxTiposArchivosReportesDinamicoDetaFormaPagoFactu;
	//}
	
	public void setBorderResaltarTiposReportesDetaFormaPagoFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPagoFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetaFormaPagoFactu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetaFormaPagoFactu() {
		return this.jComboBoxTiposGraficosReportesDetaFormaPagoFactu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetaFormaPagoFactu(
			JComboBox jComboBoxTiposGraficosReportesDetaFormaPagoFactu) {
		this.jComboBoxTiposGraficosReportesDetaFormaPagoFactu = jComboBoxTiposGraficosReportesDetaFormaPagoFactu;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetaFormaPagoFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPagoFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetaFormaPagoFactu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetaFormaPagoFactu() {
		return this.jComboBoxTiposPaginacionDetaFormaPagoFactu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetaFormaPagoFactu(
			JComboBox jComboBoxTiposPaginacionDetaFormaPagoFactu) {
		this.jComboBoxTiposPaginacionDetaFormaPagoFactu = jComboBoxTiposPaginacionDetaFormaPagoFactu;
	}
	
	public void setBorderResaltarTiposPaginacionDetaFormaPagoFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPagoFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetaFormaPagoFactu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetaFormaPagoFactu() {
		return this.jComboBoxTiposRelacionesDetaFormaPagoFactu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetaFormaPagoFactu() {
		return this.jComboBoxTiposAccionesDetaFormaPagoFactu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetaFormaPagoFactu(
			JComboBox jComboBoxTiposRelacionesDetaFormaPagoFactu) {
		this.jComboBoxTiposRelacionesDetaFormaPagoFactu = jComboBoxTiposRelacionesDetaFormaPagoFactu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetaFormaPagoFactu(
			JComboBox jComboBoxTiposAccionesDetaFormaPagoFactu) {
		this.jComboBoxTiposAccionesDetaFormaPagoFactu = jComboBoxTiposAccionesDetaFormaPagoFactu;
	}
	
	public void setBorderResaltarTiposRelacionesDetaFormaPagoFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPagoFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetaFormaPagoFactu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetaFormaPagoFactu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetaFormaPagoFactu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetaFormaPagoFactu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetaFormaPagoFactu() {
	//	return jCheckBoxConGraficoDinamicoDetaFormaPagoFactu;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetaFormaPagoFactu(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetaFormaPagoFactu) {
	//	this.jCheckBoxConGraficoDinamicoDetaFormaPagoFactu = jCheckBoxConGraficoDinamicoDetaFormaPagoFactu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetaFormaPagoFactu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetaFormaPagoFactu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetaFormaPagoFactu .setBorder(borderResaltar);		
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
		this.detaformapagofactuSessionBean=new DetaFormaPagoFactuSessionBean();
		
		this.detaformapagofactuSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detaformapagofactuSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detaformapagofactuSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetaFormaPagoFactuJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetaFormaPagoFactuJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetaFormaPagoFactuJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetaFormaPagoFactuJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetaFormaPagoFactuJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Deta Forma Pago Factu MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
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
		
		DetaFormaPagoFactuJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetaFormaPagoFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetaFormaPagoFactu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetaFormaPagoFactu,this.jTtoolBarDetaFormaPagoFactu,
							"nuevo","nuevo","Nuevo"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetaFormaPagoFactu,this.jTtoolBarDetaFormaPagoFactu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetaFormaPagoFactu,this.jTtoolBarDetaFormaPagoFactu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetaFormaPagoFactu,this.jTtoolBarDetaFormaPagoFactu,
							"duplicar","duplicar","Duplicar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetaFormaPagoFactu,this.jTtoolBarDetaFormaPagoFactu,
							"copiar","copiar","Copiar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetaFormaPagoFactu,this.jTtoolBarDetaFormaPagoFactu,
							"ver_form","ver_form","Ver"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetaFormaPagoFactu,this.jTtoolBarDetaFormaPagoFactu,
							"recargar","recargar","Recargar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetaFormaPagoFactu,this.jTtoolBarDetaFormaPagoFactu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetaFormaPagoFactu,this.jTtoolBarDetaFormaPagoFactu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetaFormaPagoFactu,this.jTtoolBarDetaFormaPagoFactu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetaFormaPagoFactu,this.jTtoolBarDetaFormaPagoFactu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetaFormaPagoFactu,this.jTtoolBarDetaFormaPagoFactu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetaFormaPagoFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetaFormaPagoFactu,this.jTtoolBarDetaFormaPagoFactu,
							"cerrar","cerrar","Salir"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetaFormaPagoFactu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetaFormaPagoFactu;
			
				this.jButtonProcesarInformacionToolBarDetaFormaPagoFactu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetaFormaPagoFactu;
				
		//protected JButton jButtonModificarToolBarDetaFormaPagoFactu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetaFormaPagoFactu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetaFormaPagoFactu=new JMenuMe("General");
		this.jmenuArchivoDetaFormaPagoFactu=new JMenuMe("Archivo");
		this.jmenuAccionesDetaFormaPagoFactu=new JMenuMe("Acciones");
		this.jmenuDatosDetaFormaPagoFactu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetaFormaPagoFactu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetaFormaPagoFactu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetaFormaPagoFactu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetaFormaPagoFactu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetaFormaPagoFactu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetaFormaPagoFactu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetaFormaPagoFactu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetaFormaPagoFactu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetaFormaPagoFactu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetaFormaPagoFactu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetaFormaPagoFactu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetaFormaPagoFactu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetaFormaPagoFactu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetaFormaPagoFactu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetaFormaPagoFactu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetaFormaPagoFactu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetaFormaPagoFactu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetaFormaPagoFactu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetaFormaPagoFactu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetaFormaPagoFactu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetaFormaPagoFactu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetaFormaPagoFactu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetaFormaPagoFactu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetaFormaPagoFactu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetaFormaPagoFactu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetaFormaPagoFactu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetaFormaPagoFactu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetaFormaPagoFactu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetaFormaPagoFactu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetaFormaPagoFactu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetaFormaPagoFactu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetaFormaPagoFactu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetaFormaPagoFactu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetaFormaPagoFactu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetaFormaPagoFactu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetaFormaPagoFactu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetaFormaPagoFactu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetaFormaPagoFactu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetaFormaPagoFactu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetaFormaPagoFactu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetaFormaPagoFactu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetaFormaPagoFactu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetaFormaPagoFactu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetaFormaPagoFactu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetaFormaPagoFactu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetaFormaPagoFactu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetaFormaPagoFactu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetaFormaPagoFactu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetaFormaPagoFactu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetaFormaPagoFactu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetaFormaPagoFactu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetaFormaPagoFactu.add(this.jMenuItemCerrarDetaFormaPagoFactu);
			
			this.jmenuAccionesDetaFormaPagoFactu.add(this.jMenuItemNuevoDetaFormaPagoFactu);
			this.jmenuAccionesDetaFormaPagoFactu.add(this.jMenuItemNuevoGuardarCambiosDetaFormaPagoFactu);
			this.jmenuAccionesDetaFormaPagoFactu.add(this.jMenuItemNuevoRelacionesDetaFormaPagoFactu);
			this.jmenuAccionesDetaFormaPagoFactu.add(this.jMenuItemGuardarCambiosTablaDetaFormaPagoFactu);		
			this.jmenuAccionesDetaFormaPagoFactu.add(this.jMenuItemDuplicarDetaFormaPagoFactu);		
			this.jmenuAccionesDetaFormaPagoFactu.add(this.jMenuItemCopiarDetaFormaPagoFactu);		
			this.jmenuAccionesDetaFormaPagoFactu.add(this.jMenuItemVerFormDetaFormaPagoFactu);		
			
			this.jmenuDatosDetaFormaPagoFactu.add(this.jMenuItemRecargarInformacionDetaFormaPagoFactu);				
			this.jmenuDatosDetaFormaPagoFactu.add(this.jMenuItemAnterioresDetaFormaPagoFactu);				
			this.jmenuDatosDetaFormaPagoFactu.add(this.jMenuItemSiguientesDetaFormaPagoFactu);				
			this.jmenuDatosDetaFormaPagoFactu.add(this.jMenuItemAbrirOrderByDetaFormaPagoFactu);				
			this.jmenuDatosDetaFormaPagoFactu.add(this.jMenuItemMostrarOcultarDetaFormaPagoFactu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetaFormaPagoFactu.add(this.jMenuItemGuardarCambiosDetaFormaPagoFactu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetaFormaPagoFactu.add(this.jmenuArchivoDetaFormaPagoFactu);		
			this.jmenuBarDetaFormaPagoFactu.add(this.jmenuAccionesDetaFormaPagoFactu);		
			this.jmenuBarDetaFormaPagoFactu.add(this.jmenuDatosDetaFormaPagoFactu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetaFormaPagoFactu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetaFormaPagoFactu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreDetaFormaPagoFactu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreDetaFormaPagoFactu.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreDetaFormaPagoFactu= new JButtonMe();
		this.jButtonBusquedaPorNombreDetaFormaPagoFactu.setText("Buscar");
		this.jButtonBusquedaPorNombreDetaFormaPagoFactu.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreDetaFormaPagoFactu,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreDetaFormaPagoFactu = new JLabelMe();
		jLabelnombreBusquedaPorNombreDetaFormaPagoFactu.setText("Nombre :");
		jLabelnombreBusquedaPorNombreDetaFormaPagoFactu.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreDetaFormaPagoFactu= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoFormaPagoDetaFormaPagoFactu=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFormaPagoDetaFormaPagoFactu.setToolTipText("Buscar Por Tipo Forma Pago ");
		this.jButtonFK_IdTipoFormaPagoDetaFormaPagoFactu= new JButtonMe();
		this.jButtonFK_IdTipoFormaPagoDetaFormaPagoFactu.setText("Buscar");
		this.jButtonFK_IdTipoFormaPagoDetaFormaPagoFactu.setToolTipText("Buscar Por Tipo Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFormaPagoDetaFormaPagoFactu,"buscar_button","Buscar Por Tipo Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFormaPagoDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu = new JLabelMe();
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.setText("Tipo Forma Pago :");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.setToolTipText("Tipo Forma Pago");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetaFormaPagoFactu=new JTabbedPane();


		this.jTabbedPaneBusquedasDetaFormaPagoFactu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetaFormaPagoFactu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetaFormaPagoFactu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetaFormaPagoFactu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetaFormaPagoFactu = new DetaFormaPagoFactuDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Deta Forma Pago Factu DATOS");
			this.jInternalFrameDetalleFormDetaFormaPagoFactu = new DetaFormaPagoFactuDetalleFormJInternalFrame(jDesktopPane,this.detaformapagofactuSessionBean.getConGuardarRelaciones(),this.detaformapagofactuSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetaFormaPagoFactu = null;//new DetaFormaPagoFactuDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetaFormaPagoFactu= new GridBagLayout();
		
		
		this.jTableDatosDetaFormaPagoFactu = new JTableMe();      
		
		String sToolTipDetaFormaPagoFactu="";
		sToolTipDetaFormaPagoFactu=DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetaFormaPagoFactu+="(Facturacion.DetaFormaPagoFactu)";
		}
		
		if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetaFormaPagoFactu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetaFormaPagoFactu.setToolTipText(sToolTipDetaFormaPagoFactu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetaFormaPagoFactu);
		this.jTableDatosDetaFormaPagoFactu.setAutoCreateRowSorter(true);
		this.jTableDatosDetaFormaPagoFactu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetaFormaPagoFactu.setRowSelectionAllowed(true);
		this.jTableDatosDetaFormaPagoFactu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetaFormaPagoFactu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetaFormaPagoFactu = new JButtonMe();
		this.jButtonDuplicarDetaFormaPagoFactu = new JButtonMe();
		this.jButtonCopiarDetaFormaPagoFactu = new JButtonMe();
		this.jButtonVerFormDetaFormaPagoFactu = new JButtonMe();
		this.jButtonNuevoRelacionesDetaFormaPagoFactu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetaFormaPagoFactu = new JButtonMe();
		this.jButtonCerrarDetaFormaPagoFactu = new JButtonMe();
		
		this.jScrollPanelDatosDetaFormaPagoFactu = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetaFormaPagoFactu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetaFormaPagoFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Deta Forma Pago Factu";
		
		if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Forma Pago Factus" + this.sPath));
		} else {
			this.jScrollPanelDatosDetaFormaPagoFactu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetaFormaPagoFactu.setToolTipText("Acciones");
        this.jPanelAccionesDetaFormaPagoFactu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetaFormaPagoFactu=new ReporteDinamicoJInternalFrame(DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetaFormaPagoFactu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetaFormaPagoFactu=new ImportacionJInternalFrame(DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetaFormaPagoFactu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetaFormaPagoFactu = new JButtonMe();
		
		this.jButtonAbrirOrderByDetaFormaPagoFactu.setText("Orden");
		this.jButtonAbrirOrderByDetaFormaPagoFactu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetaFormaPagoFactu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetaFormaPagoFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetaFormaPagoFactu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetaFormaPagoFactu,false,this);
			
			//this.cargarOrderByDetaFormaPagoFactu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetaFormaPagoFactu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetaFormaPagoFactu,true,this);
			
			//this.cargarOrderByDetaFormaPagoFactu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetaFormaPagoFactu.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosDetaFormaPagoFactu.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosDetaFormaPagoFactu.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosDetaFormaPagoFactu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetaFormaPagoFactu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetaFormaPagoFactu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetaFormaPagoFactu.setText("Nuevo");
		this.jButtonDuplicarDetaFormaPagoFactu.setText("Duplicar");
		this.jButtonCopiarDetaFormaPagoFactu.setText("Copiar");
		this.jButtonVerFormDetaFormaPagoFactu.setText("Ver");
		this.jButtonNuevoRelacionesDetaFormaPagoFactu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetaFormaPagoFactu.setText("Guardar");
		this.jButtonCerrarDetaFormaPagoFactu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetaFormaPagoFactu,"nuevo_button","Nuevo",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetaFormaPagoFactu,"duplicar_button","Duplicar",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetaFormaPagoFactu,"copiar_button","Copiar",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetaFormaPagoFactu,"ver_form","Ver",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetaFormaPagoFactu,"nuevorelaciones_button","Nuevo Rel",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetaFormaPagoFactu,"guardarcambiostabla_button","Guardar",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetaFormaPagoFactu,"cerrar_button","Salir",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetaFormaPagoFactu.setToolTipText("Nuevo"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetaFormaPagoFactu.setToolTipText("Duplicar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetaFormaPagoFactu.setToolTipText("Copiar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetaFormaPagoFactu.setToolTipText("Ver"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetaFormaPagoFactu.setToolTipText("Nuevo Rel"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetaFormaPagoFactu.setToolTipText("Guardar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetaFormaPagoFactu.setToolTipText("Salir"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetaFormaPagoFactu";
		inputMap = this.jButtonNuevoDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetaFormaPagoFactu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetaFormaPagoFactu"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetaFormaPagoFactu";
		inputMap = this.jButtonDuplicarDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetaFormaPagoFactu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetaFormaPagoFactu"));
		
		//COPIAR
		sMapKey = "CopiarDetaFormaPagoFactu";
		inputMap = this.jButtonCopiarDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetaFormaPagoFactu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetaFormaPagoFactu"));
		
		//VEr FORM
		sMapKey = "VerFormDetaFormaPagoFactu";
		inputMap = this.jButtonVerFormDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetaFormaPagoFactu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetaFormaPagoFactu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetaFormaPagoFactu";
		inputMap = this.jButtonNuevoRelacionesDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetaFormaPagoFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetaFormaPagoFactu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetaFormaPagoFactu";
		inputMap = this.jButtonModificarDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetaFormaPagoFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetaFormaPagoFactu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetaFormaPagoFactu";
		inputMap = this.jButtonCerrarDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetaFormaPagoFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetaFormaPagoFactu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetaFormaPagoFactu";
		inputMap = this.jButtonGuardarCambiosTablaDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetaFormaPagoFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetaFormaPagoFactu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetaFormaPagoFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetaFormaPagoFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetaFormaPagoFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetaFormaPagoFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetaFormaPagoFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetaFormaPagoFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetaFormaPagoFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetaFormaPagoFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetaFormaPagoFactu.setName("jPanelParametrosReportesDetaFormaPagoFactu"); 
		
		this.jPanelParametrosReportesAccionesDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetaFormaPagoFactu.setName("jPanelParametrosReportesAccionesDetaFormaPagoFactu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetaFormaPagoFactu = new JButtonMe();
		this.jButtonRecargarInformacionDetaFormaPagoFactu.setText("Recargar");
		this.jButtonRecargarInformacionDetaFormaPagoFactu.setToolTipText("Recargar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetaFormaPagoFactu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetaFormaPagoFactu = new JButtonMe();
		this.jButtonProcesarInformacionDetaFormaPagoFactu.setText("Procesar");
		this.jButtonProcesarInformacionDetaFormaPagoFactu.setToolTipText("Procesar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetaFormaPagoFactu.setVisible(false);
			
		this.jButtonProcesarInformacionDetaFormaPagoFactu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetaFormaPagoFactu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetaFormaPagoFactu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetaFormaPagoFactu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu.setText("TIPO");       
		this.jComboBoxTiposReportesDetaFormaPagoFactu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetaFormaPagoFactu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetaFormaPagoFactu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetaFormaPagoFactu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetaFormaPagoFactu.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetaFormaPagoFactu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetaFormaPagoFactu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetaFormaPagoFactu.setText("Accion");
		this.jComboBoxTiposRelacionesDetaFormaPagoFactu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetaFormaPagoFactu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetaFormaPagoFactu.setText("Accion");
		this.jComboBoxTiposAccionesDetaFormaPagoFactu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetaFormaPagoFactu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetaFormaPagoFactu.setText("Accion");
		this.jComboBoxTiposSeleccionarDetaFormaPagoFactu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetaFormaPagoFactu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetaFormaPagoFactu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetaFormaPagoFactu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetaFormaPagoFactu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetaFormaPagoFactu = new JLabelMe();
		
		this.jLabelAccionesDetaFormaPagoFactu.setText("Acciones");		
		this.jLabelAccionesDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetaFormaPagoFactu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetaFormaPagoFactu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetaFormaPagoFactu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetaFormaPagoFactu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetaFormaPagoFactu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetaFormaPagoFactu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetaFormaPagoFactu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetaFormaPagoFactu.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetaFormaPagoFactu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetaFormaPagoFactu = new JButtonMe();
		//this.jButtonAnterioresDetaFormaPagoFactu.setText("<<");
        this.jButtonAnterioresDetaFormaPagoFactu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetaFormaPagoFactu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetaFormaPagoFactu = new JButtonMe();
		//this.jButtonSiguientesDetaFormaPagoFactu.setText(">>");
        this.jButtonSiguientesDetaFormaPagoFactu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetaFormaPagoFactu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetaFormaPagoFactu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetaFormaPagoFactu.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetaFormaPagoFactu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetaFormaPagoFactu,"nuevoguardarcambios_button","Nue",this.detaformapagofactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetaFormaPagoFactu";
		inputMap = this.jButtonNuevoGuardarCambiosDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetaFormaPagoFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetaFormaPagoFactu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetaFormaPagoFactu";
		inputMap = this.jButtonRecargarInformacionDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetaFormaPagoFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetaFormaPagoFactu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetaFormaPagoFactu";
		inputMap = this.jButtonSiguientesDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetaFormaPagoFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetaFormaPagoFactu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetaFormaPagoFactu";
		inputMap = this.jButtonAnterioresDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetaFormaPagoFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetaFormaPagoFactu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetaFormaPagoFactu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetaFormaPagoFactu.setMinimumSize(new Dimension(this.getWidth(),DetaFormaPagoFactuBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetaFormaPagoFactuBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetaFormaPagoFactu.setMaximumSize(new Dimension(this.getWidth(),DetaFormaPagoFactuBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetaFormaPagoFactuBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetaFormaPagoFactu.setPreferredSize(new Dimension(this.getWidth(),DetaFormaPagoFactuBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetaFormaPagoFactuBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetaFormaPagoFactu = new GridBagLayout();

			this.jPanelPaginacionDetaFormaPagoFactu.setLayout(gridaBagLayoutPaginacionDetaFormaPagoFactu);						
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetaFormaPagoFactu.add(this.jButtonAnterioresDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
					
						
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
			
			this.jPanelPaginacionDetaFormaPagoFactu.add(this.jButtonNuevoGuardarCambiosDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
						
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
			this.jPanelPaginacionDetaFormaPagoFactu.add(this.jButtonSiguientesDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = 1;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaFormaPagoFactu.add(this.jButtonNuevoDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
				this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetaFormaPagoFactu.gridy = 1;
				this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionDetaFormaPagoFactu.add(this.jButtonNuevoRelacionesDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
			}
			
			
			if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
				this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetaFormaPagoFactu.gridy = 1;
				this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetaFormaPagoFactu.add(this.jButtonGuardarCambiosTablaDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
			}
			
			
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = 1;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaFormaPagoFactu.add(this.jButtonDuplicarDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = 1;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaFormaPagoFactu.add(this.jButtonCopiarDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = 1;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetaFormaPagoFactu.add(this.jButtonVerFormDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = 1;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetaFormaPagoFactu.add(this.jButtonCerrarDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		
		
		
		this.jButtonRecargarInformacionDetaFormaPagoFactu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetaFormaPagoFactu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetaFormaPagoFactu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetaFormaPagoFactu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetaFormaPagoFactu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetaFormaPagoFactu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetaFormaPagoFactu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetaFormaPagoFactu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetaFormaPagoFactu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetaFormaPagoFactu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetaFormaPagoFactu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetaFormaPagoFactu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetaFormaPagoFactu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetaFormaPagoFactu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetaFormaPagoFactu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetaFormaPagoFactu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaFormaPagoFactu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaFormaPagoFactu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetaFormaPagoFactu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetaFormaPagoFactu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetaFormaPagoFactu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetaFormaPagoFactu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetaFormaPagoFactu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetaFormaPagoFactu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetaFormaPagoFactu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetaFormaPagoFactu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetaFormaPagoFactu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetaFormaPagoFactu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetaFormaPagoFactu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetaFormaPagoFactu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetaFormaPagoFactu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetaFormaPagoFactu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetaFormaPagoFactu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetaFormaPagoFactu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetaFormaPagoFactu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetaFormaPagoFactu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetaFormaPagoFactu.setLayout(gridaBagParametrosReportesDetaFormaPagoFactu);
			this.jPanelParametrosReportesAccionesDetaFormaPagoFactu.setLayout(gridaBagParametrosReportesAccionesDetaFormaPagoFactu);
			
			
			this.jPanelParametrosAuxiliar1DetaFormaPagoFactu.setLayout(gridaBagParametrosAuxiliar1DetaFormaPagoFactu);
			this.jPanelParametrosAuxiliar2DetaFormaPagoFactu.setLayout(gridaBagParametrosAuxiliar2DetaFormaPagoFactu);
			this.jPanelParametrosAuxiliar3DetaFormaPagoFactu.setLayout(gridaBagParametrosAuxiliar3DetaFormaPagoFactu);
			this.jPanelParametrosAuxiliar4DetaFormaPagoFactu.setLayout(gridaBagParametrosAuxiliar4DetaFormaPagoFactu);
			//this.jPanelParametrosAuxiliar5DetaFormaPagoFactu.setLayout(gridaBagParametrosAuxiliar2DetaFormaPagoFactu);			
			
			
			
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaFormaPagoFactu.add(this.jButtonRecargarInformacionDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetaFormaPagoFactu.add(this.jComboBoxTiposPaginacionDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetaFormaPagoFactu.add(this.jCheckBoxConAltoMaximoTablaDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetaFormaPagoFactu.add(this.jComboBoxTiposArchivosReportesDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaFormaPagoFactu.add(this.jPanelParametrosAuxiliar1DetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetaFormaPagoFactu.add(this.jComboBoxTiposReportesDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaFormaPagoFactu.add(this.jPanelParametrosAuxiliar4DetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaFormaPagoFactu.add(this.jComboBoxTiposReportesDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetaFormaPagoFactu.add(this.jCheckBoxGenerarReporteDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaFormaPagoFactu.add(this.jPanelParametrosAuxiliar2DetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetaFormaPagoFactu.add(this.jLabelAccionesDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
				this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetaFormaPagoFactu.add(this.jButtonAbrirOrderByDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaFormaPagoFactu.add(this.jComboBoxTiposSeleccionarDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);			
			
			
			/*
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetaFormaPagoFactu.add(this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetaFormaPagoFactu.add(this.jCheckBoxSeleccionarTodosDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);															
				
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetaFormaPagoFactu.add(this.jCheckBoxSeleccionadosDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetaFormaPagoFactu.add(this.jPanelParametrosAuxiliar3DetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaFormaPagoFactu.add(this.jComboBoxTiposRelacionesDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
				
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaFormaPagoFactu.add(this.jComboBoxTiposAccionesDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
	
				
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetaFormaPagoFactu.add(this.jTextFieldValorCampoGeneralDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetaFormaPagoFactu = new GridBagLayout();

			this.jScrollPanelDatosDetaFormaPagoFactu.setLayout(gridaBagLayoutDatosDetaFormaPagoFactu);
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
			
			this.jScrollPanelDatosDetaFormaPagoFactu.add(this.jTableDatosDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetaFormaPagoFactu.setViewportView(this.jTableDatosDetaFormaPagoFactu);
		this.jTableDatosDetaFormaPagoFactu.setFillsViewportHeight(true);
		this.jTableDatosDetaFormaPagoFactu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetaFormaPagoFactu= new GridBagLayout();
		this.jPanelAccionesDetaFormaPagoFactu.setLayout(gridaBagLayoutAccionesDetaFormaPagoFactu);
		
		
		/*	
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
			
		this.jPanelAccionesDetaFormaPagoFactu.add(this.jButtonNuevoDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreDetaFormaPagoFactu= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreDetaFormaPagoFactu.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreDetaFormaPagoFactu.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreDetaFormaPagoFactu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreDetaFormaPagoFactu.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreDetaFormaPagoFactu.setLayout(gridaBagLayoutBusquedaPorNombreDetaFormaPagoFactu);

		gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
		gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
		jPanelBusquedaPorNombreDetaFormaPagoFactu.add(jLabelnombreBusquedaPorNombreDetaFormaPagoFactu, gridBagConstraintsDetaFormaPagoFactu);

		gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
		gridBagConstraintsDetaFormaPagoFactu.gridx = 1;
		jPanelBusquedaPorNombreDetaFormaPagoFactu.add(jTextAreanombreBusquedaPorNombreDetaFormaPagoFactu, gridBagConstraintsDetaFormaPagoFactu);

		gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPagoFactu.gridy = 1;
		gridBagConstraintsDetaFormaPagoFactu.gridx =1;
		jPanelBusquedaPorNombreDetaFormaPagoFactu.add(jButtonBusquedaPorNombreDetaFormaPagoFactu, gridBagConstraintsDetaFormaPagoFactu);

		jTabbedPaneBusquedasDetaFormaPagoFactu.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreDetaFormaPagoFactu);
		jTabbedPaneBusquedasDetaFormaPagoFactu.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoFormaPagoDetaFormaPagoFactu= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFormaPagoDetaFormaPagoFactu.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoDetaFormaPagoFactu.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoDetaFormaPagoFactu.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFormaPagoDetaFormaPagoFactu.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFormaPagoDetaFormaPagoFactu.setLayout(gridaBagLayoutFK_IdTipoFormaPagoDetaFormaPagoFactu);

		gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
		gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
		jPanelFK_IdTipoFormaPagoDetaFormaPagoFactu.add(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu, gridBagConstraintsDetaFormaPagoFactu);

		gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPagoFactu.gridy = 0;
		gridBagConstraintsDetaFormaPagoFactu.gridx = 1;
		jPanelFK_IdTipoFormaPagoDetaFormaPagoFactu.add(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetaFormaPagoFactu, gridBagConstraintsDetaFormaPagoFactu);

		gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetaFormaPagoFactu.gridy = 1;
		gridBagConstraintsDetaFormaPagoFactu.gridx =1;
		jPanelFK_IdTipoFormaPagoDetaFormaPagoFactu.add(jButtonFK_IdTipoFormaPagoDetaFormaPagoFactu, gridBagConstraintsDetaFormaPagoFactu);

		jTabbedPaneBusquedasDetaFormaPagoFactu.addTab("2.-Por Tipo Forma Pago ", jPanelFK_IdTipoFormaPagoDetaFormaPagoFactu);
		jTabbedPaneBusquedasDetaFormaPagoFactu.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetaFormaPagoFactu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetaFormaPagoFactu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();						
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;		
			//this.gridBagConstraintsDetaFormaPagoFactu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;		
		//this.gridBagConstraintsDetaFormaPagoFactu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetaFormaPagoFactu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;		
			this.gridBagConstraintsDetaFormaPagoFactu.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetaFormaPagoFactu.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);								
		
		
		/*
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		*/		
		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx =0;
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetaFormaPagoFactu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
				
		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(DetaFormaPagoFactuJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetaFormaPagoFactu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetaFormaPagoFactu = new GridBagLayout();
			this.jPanelBusquedasParametrosDetaFormaPagoFactu.setLayout(gridaBagLayoutBusquedasParametrosDetaFormaPagoFactu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetaFormaPagoFactu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetaFormaPagoFactu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaFormaPagoFactu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaFormaPagoFactu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
			
			
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		
			
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetaFormaPagoFactu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetaFormaPagoFactu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetaFormaPagoFactu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetaFormaPagoFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetaFormaPagoFactu.setName("jPanelReporteDinamicoDetaFormaPagoFactu"); 
		
		this.jPanelReporteDinamicoDetaFormaPagoFactu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetaFormaPagoFactu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetaFormaPagoFactu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetaFormaPagoFactu.setLayout(gridaBagLayoutReporteDinamicoDetaFormaPagoFactu);
		
		
		this.jInternalFrameReporteDinamicoDetaFormaPagoFactu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetaFormaPagoFactu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetaFormaPagoFactu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetaFormaPagoFactu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetaFormaPagoFactu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetaFormaPagoFactu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Forma Pago Factus"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetaFormaPagoFactu = new JLabelMe();

		this.jLabelColumnasSelectReporteDetaFormaPagoFactu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetaFormaPagoFactu.add(this.jLabelColumnasSelectReporteDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetaFormaPagoFactu = new JList<Reporte>();
		this.jListColumnasSelectReporteDetaFormaPagoFactu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetaFormaPagoFactu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetaFormaPagoFactu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetaFormaPagoFactu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetaFormaPagoFactu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetaFormaPagoFactu=new JScrollPane(this.jListColumnasSelectReporteDetaFormaPagoFactu);
			
			this.jScrollColumnasSelectReporteDetaFormaPagoFactu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetaFormaPagoFactu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetaFormaPagoFactu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetaFormaPagoFactu.add(this.jListColumnasSelectReporteDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		this.jPanelReporteDinamicoDetaFormaPagoFactu.add(this.jScrollColumnasSelectReporteDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetaFormaPagoFactu = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetaFormaPagoFactu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetaFormaPagoFactu.add(this.jLabelRelacionesSelectReporteDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetaFormaPagoFactu = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetaFormaPagoFactu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetaFormaPagoFactu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetaFormaPagoFactu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetaFormaPagoFactu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetaFormaPagoFactu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetaFormaPagoFactu=new JScrollPane(this.jListRelacionesSelectReporteDetaFormaPagoFactu);
			
			this.jScrollRelacionesSelectReporteDetaFormaPagoFactu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetaFormaPagoFactu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetaFormaPagoFactu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetaFormaPagoFactu.add(this.jListRelacionesSelectReporteDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		this.jPanelReporteDinamicoDetaFormaPagoFactu.add(this.jScrollRelacionesSelectReporteDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoDetaFormaPagoFactu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetaFormaPagoFactu = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetaFormaPagoFactu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetaFormaPagoFactu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetaFormaPagoFactu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetaFormaPagoFactu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetaFormaPagoFactu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetaFormaPagoFactu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPagoFactu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPagoFactu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPagoFactu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPagoFactu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPagoFactu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetaFormaPagoFactu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetaFormaPagoFactu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaFormaPagoFactu.add(this.jLabelGenerarExcelReporteDinamicoDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetaFormaPagoFactu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetaFormaPagoFactu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetaFormaPagoFactu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetaFormaPagoFactu.setToolTipText("Generar EXCEL"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		//this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetaFormaPagoFactu.add(this.jButtonGenerarExcelReporteDinamicoDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaFormaPagoFactu.add(this.jComboBoxTiposReportesDinamicoDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetaFormaPagoFactu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetaFormaPagoFactu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetaFormaPagoFactu.add(this.jLabelTiposArchivoReporteDinamicoDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaFormaPagoFactu.add(this.jComboBoxTiposArchivosReportesDinamicoDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetaFormaPagoFactu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetaFormaPagoFactu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetaFormaPagoFactu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetaFormaPagoFactu.setToolTipText("Generar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaFormaPagoFactu.add(this.jButtonGenerarReporteDinamicoDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetaFormaPagoFactu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetaFormaPagoFactu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetaFormaPagoFactu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetaFormaPagoFactu.setToolTipText("Cancelar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetaFormaPagoFactu.add(this.jButtonCerrarReporteDinamicoDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetaFormaPagoFactu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetaFormaPagoFactu= new JScrollPane(jPanelReporteDinamicoDetaFormaPagoFactu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetaFormaPagoFactu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetaFormaPagoFactu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetaFormaPagoFactu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Forma Pago Factus"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetaFormaPagoFactu);
		this.jInternalFrameReporteDinamicoDetaFormaPagoFactu.getContentPane().add(this.jScrollPanelReporteDinamicoDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetaFormaPagoFactu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetaFormaPagoFactu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetaFormaPagoFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetaFormaPagoFactu.setName("jPanelImportacionDetaFormaPagoFactu"); 
		
		this.jPanelImportacionDetaFormaPagoFactu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetaFormaPagoFactu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetaFormaPagoFactu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetaFormaPagoFactu.setLayout(gridaBagLayoutImportacionDetaFormaPagoFactu);
		
		
		this.jInternalFrameImportacionDetaFormaPagoFactu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetaFormaPagoFactu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetaFormaPagoFactu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetaFormaPagoFactu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetaFormaPagoFactu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetaFormaPagoFactu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetaFormaPagoFactu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetaFormaPagoFactu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetaFormaPagoFactu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetaFormaPagoFactu.setResizable(true);
	    this.jInternalFrameImportacionDetaFormaPagoFactu.setClosable(true);
	    this.jInternalFrameImportacionDetaFormaPagoFactu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetaFormaPagoFactu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetaFormaPagoFactu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetaFormaPagoFactu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetaFormaPagoFactu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetaFormaPagoFactu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetaFormaPagoFactu.setResizable(true);
	    this.jInternalFrameImportacionDetaFormaPagoFactu.setClosable(true);
	    this.jInternalFrameImportacionDetaFormaPagoFactu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetaFormaPagoFactu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetaFormaPagoFactu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetaFormaPagoFactu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Forma Pago Factus"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetaFormaPagoFactu = new JLabelMe();

		this.jLabelArchivoImportacionDetaFormaPagoFactu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetaFormaPagoFactu.add(this.jLabelArchivoImportacionDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetaFormaPagoFactu = new JFileChooser();		
		this.jFileChooserImportacionDetaFormaPagoFactu.setToolTipText("ESCOGER ARCHIVO"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetaFormaPagoFactu = new JButtonMe();
		this.jButtonAbrirImportacionDetaFormaPagoFactu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetaFormaPagoFactu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetaFormaPagoFactu.setToolTipText("Generar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaFormaPagoFactu.add(this.jButtonAbrirImportacionDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetaFormaPagoFactu = new JLabelMe();

		this.jLabelPathArchivoImportacionDetaFormaPagoFactu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetaFormaPagoFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetaFormaPagoFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetaFormaPagoFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetaFormaPagoFactu.add(this.jLabelPathArchivoImportacionDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetaFormaPagoFactu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetaFormaPagoFactu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetaFormaPagoFactu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetaFormaPagoFactu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaFormaPagoFactu.add(this.jTextFieldPathArchivoImportacionDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetaFormaPagoFactu = new JButtonMe();
		this.jButtonGenerarImportacionDetaFormaPagoFactu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetaFormaPagoFactu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetaFormaPagoFactu.setToolTipText("Generar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaFormaPagoFactu.add(this.jButtonGenerarImportacionDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetaFormaPagoFactu = new JButtonMe();
		this.jButtonCerrarImportacionDetaFormaPagoFactu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetaFormaPagoFactu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetaFormaPagoFactu.setToolTipText("Cancelar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYImportacion;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetaFormaPagoFactu.add(this.jButtonCerrarImportacionDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetaFormaPagoFactu = new GridBagLayout();
		
		this.jScrollPanelImportacionDetaFormaPagoFactu= new JScrollPane(jPanelImportacionDetaFormaPagoFactu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
		this.gridBagConstraintsDetaFormaPagoFactu.gridy =iPosYImportacion;
		this.gridBagConstraintsDetaFormaPagoFactu.gridx =iPosXImportacion;
		this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetaFormaPagoFactu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetaFormaPagoFactu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetaFormaPagoFactu);
		this.jInternalFrameImportacionDetaFormaPagoFactu.getContentPane().add(this.jScrollPanelImportacionDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetaFormaPagoFactu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetaFormaPagoFactu = new JButtonMe();
			this.jButtonAbrirOrderByDetaFormaPagoFactu.setText("Orden");
			this.jButtonAbrirOrderByDetaFormaPagoFactu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetaFormaPagoFactu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetaFormaPagoFactu";
			inputMap = this.jButtonAbrirOrderByDetaFormaPagoFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetaFormaPagoFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetaFormaPagoFactu"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetaFormaPagoFactu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetaFormaPagoFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetaFormaPagoFactu.setName("jPanelOrderByDetaFormaPagoFactu"); 
			
			this.jPanelOrderByDetaFormaPagoFactu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetaFormaPagoFactu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetaFormaPagoFactu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetaFormaPagoFactu.setLayout(gridaBagLayoutOrderByDetaFormaPagoFactu);
			
			
			this.jTableDatosDetaFormaPagoFactuOrderBy = new JTableMe();        
			this.jTableDatosDetaFormaPagoFactuOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetaFormaPagoFactuOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetaFormaPagoFactuOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetaFormaPagoFactuOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetaFormaPagoFactuOrderBy.setViewportView(this.jTableDatosDetaFormaPagoFactuOrderBy);
			this.jTableDatosDetaFormaPagoFactuOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetaFormaPagoFactuOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetaFormaPagoFactu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetaFormaPagoFactu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetaFormaPagoFactu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetaFormaPagoFactu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetaFormaPagoFactu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetaFormaPagoFactu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetaFormaPagoFactu.setTitle("Orden");
			this.jInternalFrameOrderByDetaFormaPagoFactu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetaFormaPagoFactu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetaFormaPagoFactu.setResizable(true);
			this.jInternalFrameOrderByDetaFormaPagoFactu.setClosable(true);
			this.jInternalFrameOrderByDetaFormaPagoFactu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetaFormaPagoFactu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetaFormaPagoFactu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetaFormaPagoFactu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetaFormaPagoFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Forma Pago Factus"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetaFormaPagoFactu.ipady =150;
				
			this.jPanelOrderByDetaFormaPagoFactu.add(jScrollPanelDatosDetaFormaPagoFactuOrderBy, this.gridBagConstraintsDetaFormaPagoFactu);//this.jTableDatosDetaFormaPagoFactuTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetaFormaPagoFactu = new JButtonMe();
			this.jButtonCerrarOrderByDetaFormaPagoFactu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetaFormaPagoFactu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetaFormaPagoFactu.setToolTipText("Cancelar"+" "+DetaFormaPagoFactuConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetaFormaPagoFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaFormaPagoFactu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetaFormaPagoFactu.add(this.jButtonCerrarOrderByDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetaFormaPagoFactu = new GridBagLayout();
			
			this.jScrollPanelOrderByDetaFormaPagoFactu= new JScrollPane(jPanelOrderByDetaFormaPagoFactu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetaFormaPagoFactu = new GridBagConstraints();
			this.gridBagConstraintsDetaFormaPagoFactu.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetaFormaPagoFactu.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetaFormaPagoFactu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetaFormaPagoFactu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetaFormaPagoFactu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetaFormaPagoFactu);
			
			this.jInternalFrameOrderByDetaFormaPagoFactu.getContentPane().add(this.jScrollPanelOrderByDetaFormaPagoFactu, this.gridBagConstraintsDetaFormaPagoFactu);			
		
		} else {
			this.jButtonAbrirOrderByDetaFormaPagoFactu = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detaformapagofactuSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetaFormaPagoFactu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetaFormaPagoFactu.getRowHeight();//DetaFormaPagoFactuConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetaFormaPagoFactuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetaFormaPagoFactu.isSelected()) {
					iHeightTable=DetaFormaPagoFactuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetaFormaPagoFactuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetaFormaPagoFactuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetaFormaPagoFactuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetaFormaPagoFactu.isSelected()) {
					iHeightTable=DetaFormaPagoFactuConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetaFormaPagoFactuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetaFormaPagoFactuConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetaFormaPagoFactu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetaFormaPagoFactu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetaFormaPagoFactu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetaFormaPagoFactu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetaFormaPagoFactu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetaFormaPagoFactu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetaFormaPagoFactu!=null && this.jInternalFrameOrderByDetaFormaPagoFactu.getjTableDatosOrderBy()!=null) {
			//if(!this.detaformapagofactuSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetaFormaPagoFactu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetaFormaPagoFactu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetaFormaPagoFactu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetaFormaPagoFactu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetaFormaPagoFactu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetaFormaPagoFactu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetaFormaPagoFactu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetaFormaPagoFactu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetaFormaPagoFactu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetaFormaPagoFactu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detaformapagofactuLogic.getDetaFormaPagoFactus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detaformapagofactus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetaFormaPagoFactu> TraerDetaFormaPagoFactuBeans(List<DetaFormaPagoFactu> detaformapagofactus,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetaFormaPagoFactu detaformapagofactu:detaformapagofactus) {
					
				if(!(DetaFormaPagoFactuConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetaFormaPagoFactuConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detaformapagofactu.setsDetalleGeneralEntityReporte(DetaFormaPagoFactuConstantesFunciones.getDetaFormaPagoFactuDescripcion(detaformapagofactu));
										
						
					
					

					if(detaformapagofactu.getDetaFormaPagos()!=null && Funciones.existeClass(classes,DetaFormaPago.class)) {
						try{detaformapagofactu.setdetaformapagosDescripcionReporte(new JRBeanCollectionDataSource(DetaFormaPagoJInternalFrame.TraerDetaFormaPagoBeans(detaformapagofactu.getDetaFormaPagos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//detaformapagofactu.setsDetalleGeneralEntityReporte(detaformapagofactu.getsDetalleGeneralEntityReporte());
										
				}
				
				//detaformapagofactubeans.add(detaformapagofactubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detaformapagofactus;
    }
	//PARA REPORTES FIN
}
