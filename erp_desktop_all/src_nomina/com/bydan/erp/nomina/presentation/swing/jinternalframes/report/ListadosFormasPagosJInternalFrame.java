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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.ListadosFormasPagosConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class ListadosFormasPagosJInternalFrame extends ListadosFormasPagosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarListadosFormasPagos;
	
	protected JMenuBar jmenuBarListadosFormasPagos;
	
	protected JMenu jmenuListadosFormasPagos;
	protected JMenu jmenuDatosListadosFormasPagos;
	protected JMenu jmenuArchivoListadosFormasPagos;
	protected JMenu jmenuAccionesListadosFormasPagos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosListadosFormasPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadosFormasPagos;	
	protected GridBagConstraints gridBagConstraintsListadosFormasPagos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ListadosFormasPagosDetalleFormJInternalFrame jInternalFrameDetalleFormListadosFormasPagos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoListadosFormasPagos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionListadosFormasPagos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoGrupoFormaPagoBeanSwingJInternalFrame tipogrupoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogrupoformapago="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public ListadosFormasPagosSessionBean listadosformaspagosSessionBean;
		
	
	
	public TipoGrupoFormaPagoSessionBean tipogrupoformapagoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ListadosFormasPagos> listadosformaspagoss;		
	public List<ListadosFormasPagos> listadosformaspagossEliminados;	
	public List<ListadosFormasPagos> listadosformaspagossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByListadosFormasPagos;		
	protected JButton jButtonAbrirOrderByListadosFormasPagos;
	
	
	//protected JPanel jPanelOrderByListadosFormasPagos;
	//public JScrollPane jScrollPanelOrderByListadosFormasPagos;	
	//protected JButton jButtonCerrarOrderByListadosFormasPagos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ListadosFormasPagosLogic listadosformaspagosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosListadosFormasPagos;
	public JScrollPane jScrollPanelDatosEdicionListadosFormasPagos;
	public JScrollPane jScrollPanelDatosGeneralListadosFormasPagos;
    
	
	
	//public JScrollPane jScrollPanelDatosListadosFormasPagosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoListadosFormasPagos;
	//public JScrollPane jScrollPanelImportacionListadosFormasPagos;
	
	
	
	protected JPanel jPanelAccionesListadosFormasPagos;
	
    protected JPanel jPanelPaginacionListadosFormasPagos;
    protected JPanel jPanelParametrosReportesListadosFormasPagos;
	protected JPanel jPanelParametrosReportesAccionesListadosFormasPagos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ListadosFormasPagos;
	protected JPanel jPanelParametrosAuxiliar2ListadosFormasPagos;
	protected JPanel jPanelParametrosAuxiliar3ListadosFormasPagos;
	protected JPanel jPanelParametrosAuxiliar4ListadosFormasPagos;
	//protected JPanel jPanelParametrosAuxiliar5ListadosFormasPagos;
	
	
	
	//protected JPanel jPanelReporteDinamicoListadosFormasPagos;
	//protected JPanel jPanelImportacionListadosFormasPagos;
	
	
	public JTable jTableDatosListadosFormasPagos;
	
	
	
	//public JTable jTableDatosListadosFormasPagosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoListadosFormasPagos;
	protected JButton jButtonDuplicarListadosFormasPagos;
	protected JButton jButtonCopiarListadosFormasPagos;
	protected JButton jButtonVerFormListadosFormasPagos;
	protected JButton jButtonNuevoRelacionesListadosFormasPagos;
	protected JButton jButtonModificarListadosFormasPagos;
	
    protected JButton jButtonGuardarCambiosTablaListadosFormasPagos;
	protected JButton jButtonCerrarListadosFormasPagos;
	
	
	protected JButton jButtonRecargarInformacionListadosFormasPagos;
	protected JButton jButtonProcesarInformacionListadosFormasPagos;
	
	
	protected JButton jButtonAnterioresListadosFormasPagos;
	protected JButton jButtonSiguientesListadosFormasPagos;
	protected JButton jButtonNuevoGuardarCambiosListadosFormasPagos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoListadosFormasPagos;
	//protected JButton jButtonCerrarReporteDinamicoListadosFormasPagos;
	//protected JButton jButtonGenerarExcelReporteDinamicoListadosFormasPagos;	
	
	
	
	//protected JButton jButtonAbrirImportacionListadosFormasPagos;
	//protected JButton jButtonGenerarImportacionListadosFormasPagos;
	//protected JButton jButtonCerrarImportacionListadosFormasPagos;
	//protected JFileChooser jFileChooserImportacionListadosFormasPagos;
	//protected File fileImportacionListadosFormasPagos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadosFormasPagos;
	protected JButton jButtonDuplicarToolBarListadosFormasPagos;
	protected JButton jButtonNuevoRelacionesToolBarListadosFormasPagos;
	
	
	public JButton jButtonGuardarCambiosToolBarListadosFormasPagos;
	protected JButton jButtonCopiarToolBarListadosFormasPagos;
	protected JButton jButtonVerFormToolBarListadosFormasPagos;
	public JButton jButtonGuardarCambiosTablaToolBarListadosFormasPagos;
	protected JButton jButtonMostrarOcultarTablaToolBarListadosFormasPagos;
	protected JButton jButtonCerrarToolBarListadosFormasPagos;
	
	protected JButton jButtonRecargarInformacionToolBarListadosFormasPagos;
	protected JButton jButtonProcesarInformacionToolBarListadosFormasPagos;
	protected JButton jButtonAnterioresToolBarListadosFormasPagos;
	protected JButton jButtonSiguientesToolBarListadosFormasPagos;
	protected JButton jButtonNuevoGuardarCambiosToolBarListadosFormasPagos;
	protected JButton jButtonAbrirOrderByToolBarListadosFormasPagos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadosFormasPagos;
	protected JMenuItem jMenuItemDuplicarListadosFormasPagos;
	protected JMenuItem jMenuItemNuevoRelacionesListadosFormasPagos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosListadosFormasPagos;
	protected JMenuItem jMenuItemCopiarListadosFormasPagos;
	protected JMenuItem jMenuItemVerFormListadosFormasPagos;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadosFormasPagos;
	protected JMenuItem jMenuItemCerrarListadosFormasPagos;
	protected JMenuItem jMenuItemDetalleCerrarListadosFormasPagos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByListadosFormasPagos;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadosFormasPagos;
	
	protected JMenuItem jMenuItemRecargarInformacionListadosFormasPagos;
	protected JMenuItem jMenuItemProcesarInformacionListadosFormasPagos;
	protected JMenuItem jMenuItemAnterioresListadosFormasPagos;
	protected JMenuItem jMenuItemSiguientesListadosFormasPagos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadosFormasPagos;
	protected JMenuItem jMenuItemAbrirOrderByListadosFormasPagos;
	protected JMenuItem jMenuItemMostrarOcultarListadosFormasPagos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadosFormasPagos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosListadosFormasPagos;
	protected JCheckBox jCheckBoxSeleccionadosListadosFormasPagos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaListadosFormasPagos;
	protected JCheckBox jCheckBoxConGraficoReporteListadosFormasPagos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesListadosFormasPagos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesListadosFormasPagos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoListadosFormasPagos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoListadosFormasPagos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesListadosFormasPagos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionListadosFormasPagos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadosFormasPagos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadosFormasPagos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarListadosFormasPagos;
	protected JTextField jTextFieldValorCampoGeneralListadosFormasPagos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteListadosFormasPagos;
	//public JList<Reporte> jListColumnasSelectReporteListadosFormasPagos;
	//public JScrollPane jScrollColumnasSelectReporteListadosFormasPagos;
	
	//public JLabel jLabelRelacionesSelectReporteListadosFormasPagos;
	//public JList<Reporte> jListRelacionesSelectReporteListadosFormasPagos;
	//public JScrollPane jScrollRelacionesSelectReporteListadosFormasPagos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoListadosFormasPagos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoListadosFormasPagos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoListadosFormasPagos;
	//public JLabel jLabelTiposArchivoReporteDinamicoListadosFormasPagos;
	
		
	//public JLabel jLabelArchivoImportacionListadosFormasPagos;	
	//public JLabel jLabelPathArchivoImportacionListadosFormasPagos;
	//protected JTextField jTextFieldPathArchivoImportacionListadosFormasPagos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoListadosFormasPagos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoListadosFormasPagos;
	
	//public JLabel jLabelColumnaCategoriaValorListadosFormasPagos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorListadosFormasPagos;
	
	//public JLabel jLabelColumnasValoresGraficoListadosFormasPagos;
	//public JList<Reporte> jListColumnasValoresGraficoListadosFormasPagos;
	//public JScrollPane jScrollColumnasValoresGraficoListadosFormasPagos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoListadosFormasPagos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoListadosFormasPagos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasListadosFormasPagos;
	public JPanel jPanelBusquedaListadosFormasPagosListadosFormasPagos;
	public JButton jButtonBusquedaListadosFormasPagosListadosFormasPagos;
	
	public JPanel jPanelid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos;
	public JLabel jLabelid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos;
	public JButton jButtonid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos;
	public JLabel jLabelfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos;

	public JDateChooser jDateChooserfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos;
	public JButton jButtonfecha_desdeBusquedaListadosFormasPagosListadosFormasPagosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos;
	public JLabel jLabelfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos;

	public JDateChooser jDateChooserfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos;
	public JButton jButtonfecha_hastaBusquedaListadosFormasPagosListadosFormasPagosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ListadosFormasPagosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ListadosFormasPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosFormasPagosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosFormasPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosFormasPagosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosFormasPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosFormasPagosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadosFormasPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionListadosFormasPagos)	{
		this.jButtonRecargarInformacionListadosFormasPagos = jButtonRecargarInformacionListadosFormasPagos;
	}
	
	public JButton getjButtonProcesarInformacionListadosFormasPagos() {
		return this.jButtonProcesarInformacionListadosFormasPagos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadosFormasPagos)	{
		this.jButtonProcesarInformacionListadosFormasPagos = jButtonProcesarInformacionListadosFormasPagos;
	}
	
	
	public JButton getjButtonRecargarInformacionListadosFormasPagos() {
		return this.jButtonRecargarInformacionListadosFormasPagos;
	}
	
	
	public List<ListadosFormasPagos> getlistadosformaspagoss() {
		return this.listadosformaspagoss;
	}

	public void setlistadosformaspagoss(List<ListadosFormasPagos> listadosformaspagoss) {
		this.listadosformaspagoss = listadosformaspagoss;
	}
	
	public List<ListadosFormasPagos> getlistadosformaspagossAux() {
		return this.listadosformaspagossAux;
	}

	public void setlistadosformaspagossAux(List<ListadosFormasPagos> listadosformaspagossAux) {
		this.listadosformaspagossAux = listadosformaspagossAux;
	}
	
	public List<ListadosFormasPagos> getlistadosformaspagossEliminados() {
		return this.listadosformaspagossEliminados;
	}

	public void setListadosFormasPagossEliminados(List<ListadosFormasPagos> listadosformaspagossEliminados) {
		this.listadosformaspagossEliminados = listadosformaspagossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarListadosFormasPagos() {
		return jComboBoxTiposSeleccionarListadosFormasPagos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarListadosFormasPagos(
			JComboBox jComboBoxTiposSeleccionarListadosFormasPagos) {
		this.jComboBoxTiposSeleccionarListadosFormasPagos = jComboBoxTiposSeleccionarListadosFormasPagos;
	}
	
	public void setBorderResaltarTiposSeleccionarListadosFormasPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarListadosFormasPagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarListadosFormasPagos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralListadosFormasPagos() {
		return jTextFieldValorCampoGeneralListadosFormasPagos;
	}

	public void setjTextFieldValorCampoGeneralListadosFormasPagos(
			JTextField jTextFieldValorCampoGeneralListadosFormasPagos) {
		this.jTextFieldValorCampoGeneralListadosFormasPagos = jTextFieldValorCampoGeneralListadosFormasPagos;
	}

	public void setBorderResaltarValorCampoGeneralListadosFormasPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosFormasPagos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralListadosFormasPagos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosListadosFormasPagos() {
		return this.jCheckBoxSeleccionarTodosListadosFormasPagos;
	}

	public void setjCheckBoxSeleccionarTodosListadosFormasPagos(
			JCheckBox jCheckBoxSeleccionarTodosListadosFormasPagos) {
		this.jCheckBoxSeleccionarTodosListadosFormasPagos = jCheckBoxSeleccionarTodosListadosFormasPagos;
	}

	public void setBorderResaltarSeleccionarTodosListadosFormasPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosFormasPagos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosListadosFormasPagos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosListadosFormasPagos() {
		return this.jCheckBoxSeleccionadosListadosFormasPagos;
	}

	public void setjCheckBoxSeleccionadosListadosFormasPagos(
			JCheckBox jCheckBoxSeleccionadosListadosFormasPagos) {
		this.jCheckBoxSeleccionadosListadosFormasPagos = jCheckBoxSeleccionadosListadosFormasPagos;
	}
	
	public void setBorderResaltarSeleccionadosListadosFormasPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosFormasPagos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosListadosFormasPagos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesListadosFormasPagos() {
		return this.jComboBoxTiposArchivosReportesListadosFormasPagos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesListadosFormasPagos(
			JComboBox jComboBoxTiposArchivosReportesListadosFormasPagos) {
		this.jComboBoxTiposArchivosReportesListadosFormasPagos = jComboBoxTiposArchivosReportesListadosFormasPagos;
	}

	public void setBorderResaltarTiposArchivosReportesListadosFormasPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosFormasPagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesListadosFormasPagos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesListadosFormasPagos() {
		return this.jComboBoxTiposReportesListadosFormasPagos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesListadosFormasPagos(
			JComboBox jComboBoxTiposReportesListadosFormasPagos) {
		this.jComboBoxTiposReportesListadosFormasPagos = jComboBoxTiposReportesListadosFormasPagos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoListadosFormasPagos() {
	//	return jComboBoxTiposReportesDinamicoListadosFormasPagos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoListadosFormasPagos(
	//		JComboBox jComboBoxTiposReportesDinamicoListadosFormasPagos) {
	//	this.jComboBoxTiposReportesDinamicoListadosFormasPagos = jComboBoxTiposReportesDinamicoListadosFormasPagos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoListadosFormasPagos() {
	//	return jComboBoxTiposArchivosReportesDinamicoListadosFormasPagos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoListadosFormasPagos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoListadosFormasPagos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoListadosFormasPagos = jComboBoxTiposArchivosReportesDinamicoListadosFormasPagos;
	//}
	
	public void setBorderResaltarTiposReportesListadosFormasPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosFormasPagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesListadosFormasPagos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesListadosFormasPagos() {
		return this.jComboBoxTiposGraficosReportesListadosFormasPagos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesListadosFormasPagos(
			JComboBox jComboBoxTiposGraficosReportesListadosFormasPagos) {
		this.jComboBoxTiposGraficosReportesListadosFormasPagos = jComboBoxTiposGraficosReportesListadosFormasPagos;
	}
	
	public void setBorderResaltarTiposGraficosReportesListadosFormasPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosFormasPagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesListadosFormasPagos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionListadosFormasPagos() {
		return this.jComboBoxTiposPaginacionListadosFormasPagos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionListadosFormasPagos(
			JComboBox jComboBoxTiposPaginacionListadosFormasPagos) {
		this.jComboBoxTiposPaginacionListadosFormasPagos = jComboBoxTiposPaginacionListadosFormasPagos;
	}
	
	public void setBorderResaltarTiposPaginacionListadosFormasPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosFormasPagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionListadosFormasPagos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesListadosFormasPagos() {
		return this.jComboBoxTiposRelacionesListadosFormasPagos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadosFormasPagos() {
		return this.jComboBoxTiposAccionesListadosFormasPagos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadosFormasPagos(
			JComboBox jComboBoxTiposRelacionesListadosFormasPagos) {
		this.jComboBoxTiposRelacionesListadosFormasPagos = jComboBoxTiposRelacionesListadosFormasPagos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadosFormasPagos(
			JComboBox jComboBoxTiposAccionesListadosFormasPagos) {
		this.jComboBoxTiposAccionesListadosFormasPagos = jComboBoxTiposAccionesListadosFormasPagos;
	}
	
	public void setBorderResaltarTiposRelacionesListadosFormasPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosFormasPagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesListadosFormasPagos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesListadosFormasPagos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosFormasPagos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesListadosFormasPagos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoListadosFormasPagos() {
	//	return jCheckBoxConGraficoDinamicoListadosFormasPagos;
	//}

	//public void setjCheckBoxConGraficoDinamicoListadosFormasPagos(
	//		JCheckBox jCheckBoxConGraficoDinamicoListadosFormasPagos) {
	//	this.jCheckBoxConGraficoDinamicoListadosFormasPagos = jCheckBoxConGraficoDinamicoListadosFormasPagos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoListadosFormasPagos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarListadosFormasPagos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoListadosFormasPagos .setBorder(borderResaltar);		
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
		this.listadosformaspagosSessionBean=new ListadosFormasPagosSessionBean();
		
		this.listadosformaspagosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadosformaspagosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadosformaspagosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ListadosFormasPagosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ListadosFormasPagosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadosFormasPagosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadosFormasPagosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadosFormasPagosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listados Formas Pagos MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
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
		
		ListadosFormasPagosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ListadosFormasPagos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarListadosFormasPagos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarListadosFormasPagos,this.jTtoolBarListadosFormasPagos,
							"nuevo","nuevo","Nuevo"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarListadosFormasPagos,this.jTtoolBarListadosFormasPagos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarListadosFormasPagos,this.jTtoolBarListadosFormasPagos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarListadosFormasPagos,this.jTtoolBarListadosFormasPagos,
							"duplicar","duplicar","Duplicar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarListadosFormasPagos,this.jTtoolBarListadosFormasPagos,
							"copiar","copiar","Copiar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarListadosFormasPagos,this.jTtoolBarListadosFormasPagos,
							"ver_form","ver_form","Ver"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadosFormasPagos,this.jTtoolBarListadosFormasPagos,
							"recargar","recargar","Buscar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadosFormasPagos,this.jTtoolBarListadosFormasPagos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadosFormasPagos,this.jTtoolBarListadosFormasPagos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarListadosFormasPagos,this.jTtoolBarListadosFormasPagos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarListadosFormasPagos,this.jTtoolBarListadosFormasPagos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarListadosFormasPagos,this.jTtoolBarListadosFormasPagos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarListadosFormasPagos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarListadosFormasPagos,this.jTtoolBarListadosFormasPagos,
							"cerrar","cerrar","Salir"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarListadosFormasPagos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarListadosFormasPagos;
			
				this.jButtonProcesarInformacionToolBarListadosFormasPagos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarListadosFormasPagos;
				
		//protected JButton jButtonModificarToolBarListadosFormasPagos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarListadosFormasPagos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuListadosFormasPagos=new JMenuMe("General");
		this.jmenuArchivoListadosFormasPagos=new JMenuMe("Archivo");
		this.jmenuAccionesListadosFormasPagos=new JMenuMe("Acciones");
		this.jmenuDatosListadosFormasPagos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadosFormasPagos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadosFormasPagos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadosFormasPagos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarListadosFormasPagos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarListadosFormasPagos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarListadosFormasPagos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesListadosFormasPagos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesListadosFormasPagos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesListadosFormasPagos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosListadosFormasPagos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadosFormasPagos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadosFormasPagos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarListadosFormasPagos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarListadosFormasPagos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarListadosFormasPagos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormListadosFormasPagos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormListadosFormasPagos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormListadosFormasPagos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaListadosFormasPagos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaListadosFormasPagos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaListadosFormasPagos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadosFormasPagos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadosFormasPagos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadosFormasPagos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionListadosFormasPagos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionListadosFormasPagos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionListadosFormasPagos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionListadosFormasPagos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionListadosFormasPagos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionListadosFormasPagos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresListadosFormasPagos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresListadosFormasPagos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresListadosFormasPagos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesListadosFormasPagos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesListadosFormasPagos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesListadosFormasPagos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByListadosFormasPagos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByListadosFormasPagos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByListadosFormasPagos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadosFormasPagos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadosFormasPagos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadosFormasPagos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByListadosFormasPagos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByListadosFormasPagos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByListadosFormasPagos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadosFormasPagos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadosFormasPagos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadosFormasPagos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosListadosFormasPagos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosListadosFormasPagos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosListadosFormasPagos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoListadosFormasPagos.add(this.jMenuItemCerrarListadosFormasPagos);
			
			this.jmenuAccionesListadosFormasPagos.add(this.jMenuItemNuevoListadosFormasPagos);
			this.jmenuAccionesListadosFormasPagos.add(this.jMenuItemNuevoGuardarCambiosListadosFormasPagos);
			this.jmenuAccionesListadosFormasPagos.add(this.jMenuItemNuevoRelacionesListadosFormasPagos);
			this.jmenuAccionesListadosFormasPagos.add(this.jMenuItemGuardarCambiosTablaListadosFormasPagos);		
			this.jmenuAccionesListadosFormasPagos.add(this.jMenuItemDuplicarListadosFormasPagos);		
			this.jmenuAccionesListadosFormasPagos.add(this.jMenuItemCopiarListadosFormasPagos);		
			this.jmenuAccionesListadosFormasPagos.add(this.jMenuItemVerFormListadosFormasPagos);		
			
			this.jmenuDatosListadosFormasPagos.add(this.jMenuItemRecargarInformacionListadosFormasPagos);				
			this.jmenuDatosListadosFormasPagos.add(this.jMenuItemAnterioresListadosFormasPagos);				
			this.jmenuDatosListadosFormasPagos.add(this.jMenuItemSiguientesListadosFormasPagos);				
			this.jmenuDatosListadosFormasPagos.add(this.jMenuItemAbrirOrderByListadosFormasPagos);				
			this.jmenuDatosListadosFormasPagos.add(this.jMenuItemMostrarOcultarListadosFormasPagos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesListadosFormasPagos.add(this.jMenuItemGuardarCambiosListadosFormasPagos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarListadosFormasPagos.add(this.jmenuArchivoListadosFormasPagos);		
			this.jmenuBarListadosFormasPagos.add(this.jmenuAccionesListadosFormasPagos);		
			this.jmenuBarListadosFormasPagos.add(this.jmenuDatosListadosFormasPagos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarListadosFormasPagos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasListadosFormasPagos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaListadosFormasPagosListadosFormasPagos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaListadosFormasPagosListadosFormasPagos.setToolTipText("Buscar Por Tipo Grupo Forma Pago Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaListadosFormasPagosListadosFormasPagos= new JButtonMe();
		this.jButtonBusquedaListadosFormasPagosListadosFormasPagos.setText("Buscar");
		this.jButtonBusquedaListadosFormasPagosListadosFormasPagos.setToolTipText("Buscar Por Tipo Grupo Forma Pago Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaListadosFormasPagosListadosFormasPagos,"buscar_button","Buscar Por Tipo Grupo Forma Pago Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaListadosFormasPagosListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos = new JLabelMe();
		jLabelid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.setText("Tipo Grupo Forma Pago :");
		jLabelid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.setToolTipText("Tipo Grupo Forma Pago");
		jLabelid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos= new JComboBoxMe();
		jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos = new JLabelMe();
		jLabelfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos= new JDateChooser();
		jDateChooserfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos.setDate(new Date());
		jDateChooserfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos = new JLabelMe();
		jLabelfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos= new JDateChooser();
		jDateChooserfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos.setDate(new Date());
		jDateChooserfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasListadosFormasPagos=new JTabbedPane();


		this.jTabbedPaneBusquedasListadosFormasPagos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasListadosFormasPagos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));
		this.jTabbedPaneBusquedasListadosFormasPagos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,50)));

		//this.jTabbedPaneBusquedasListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasListadosFormasPagos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleListadosFormasPagos = new ListadosFormasPagosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Listados Formas Pagos DATOS");
			this.jInternalFrameDetalleFormListadosFormasPagos = new ListadosFormasPagosDetalleFormJInternalFrame(jDesktopPane,this.listadosformaspagosSessionBean.getConGuardarRelaciones(),this.listadosformaspagosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormListadosFormasPagos = null;//new ListadosFormasPagosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadosFormasPagos= new GridBagLayout();
		
		
		this.jTableDatosListadosFormasPagos = new JTableMe();      
		
		String sToolTipListadosFormasPagos="";
		sToolTipListadosFormasPagos=ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadosFormasPagos+="(Nomina.ListadosFormasPagos)";
		}
		
		if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadosFormasPagos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosListadosFormasPagos.setToolTipText(sToolTipListadosFormasPagos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosListadosFormasPagos);
		this.jTableDatosListadosFormasPagos.setAutoCreateRowSorter(true);
		this.jTableDatosListadosFormasPagos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosListadosFormasPagos.setRowSelectionAllowed(true);
		this.jTableDatosListadosFormasPagos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosListadosFormasPagos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoListadosFormasPagos = new JButtonMe();
		this.jButtonDuplicarListadosFormasPagos = new JButtonMe();
		this.jButtonCopiarListadosFormasPagos = new JButtonMe();
		this.jButtonVerFormListadosFormasPagos = new JButtonMe();
		this.jButtonNuevoRelacionesListadosFormasPagos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaListadosFormasPagos = new JButtonMe();
		this.jButtonCerrarListadosFormasPagos = new JButtonMe();
		
		this.jScrollPanelDatosListadosFormasPagos = new JScrollPane();   
        this.jScrollPanelDatosGeneralListadosFormasPagos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesListadosFormasPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Listados Formas Pagos";
		
		if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Formas Pagoses" + this.sPath));
		} else {
			this.jScrollPanelDatosListadosFormasPagos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadosFormasPagos.setToolTipText("Acciones");
        this.jPanelAccionesListadosFormasPagos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoListadosFormasPagos=new ReporteDinamicoJInternalFrame(ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoListadosFormasPagos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionListadosFormasPagos=new ImportacionJInternalFrame(ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionListadosFormasPagos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByListadosFormasPagos = new JButtonMe();
		
		this.jButtonAbrirOrderByListadosFormasPagos.setText("Orden");
		this.jButtonAbrirOrderByListadosFormasPagos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadosFormasPagos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByListadosFormasPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadosFormasPagos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosFormasPagos,false,this);
			
			//this.cargarOrderByListadosFormasPagos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadosFormasPagos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosFormasPagos,true,this);
			
			//this.cargarOrderByListadosFormasPagos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosListadosFormasPagos.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosListadosFormasPagos.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosListadosFormasPagos.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosListadosFormasPagos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadosFormasPagos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadosFormasPagos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoListadosFormasPagos.setText("Nuevo");
		this.jButtonDuplicarListadosFormasPagos.setText("Duplicar");
		this.jButtonCopiarListadosFormasPagos.setText("Copiar");
		this.jButtonVerFormListadosFormasPagos.setText("Ver");
		this.jButtonNuevoRelacionesListadosFormasPagos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaListadosFormasPagos.setText("Guardar");
		this.jButtonCerrarListadosFormasPagos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadosFormasPagos,"nuevo_button","Nuevo",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarListadosFormasPagos,"duplicar_button","Duplicar",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarListadosFormasPagos,"copiar_button","Copiar",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormListadosFormasPagos,"ver_form","Ver",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesListadosFormasPagos,"nuevorelaciones_button","Nuevo Rel",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadosFormasPagos,"guardarcambiostabla_button","Guardar",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadosFormasPagos,"cerrar_button","Salir",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoListadosFormasPagos.setToolTipText("Nuevo"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarListadosFormasPagos.setToolTipText("Duplicar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarListadosFormasPagos.setToolTipText("Copiar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormListadosFormasPagos.setToolTipText("Ver"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesListadosFormasPagos.setToolTipText("Nuevo Rel"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaListadosFormasPagos.setToolTipText("Guardar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadosFormasPagos.setToolTipText("Salir"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadosFormasPagos";
		inputMap = this.jButtonNuevoListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadosFormasPagos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadosFormasPagos"));
		
		//DUPLICAR
		sMapKey = "DuplicarListadosFormasPagos";
		inputMap = this.jButtonDuplicarListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarListadosFormasPagos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarListadosFormasPagos"));
		
		//COPIAR
		sMapKey = "CopiarListadosFormasPagos";
		inputMap = this.jButtonCopiarListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarListadosFormasPagos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarListadosFormasPagos"));
		
		//VEr FORM
		sMapKey = "VerFormListadosFormasPagos";
		inputMap = this.jButtonVerFormListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormListadosFormasPagos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormListadosFormasPagos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesListadosFormasPagos";
		inputMap = this.jButtonNuevoRelacionesListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesListadosFormasPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesListadosFormasPagos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarListadosFormasPagos";
		inputMap = this.jButtonModificarListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarListadosFormasPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarListadosFormasPagos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarListadosFormasPagos";
		inputMap = this.jButtonCerrarListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadosFormasPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadosFormasPagos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadosFormasPagos";
		inputMap = this.jButtonGuardarCambiosTablaListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadosFormasPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadosFormasPagos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesListadosFormasPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesListadosFormasPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionListadosFormasPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ListadosFormasPagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ListadosFormasPagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ListadosFormasPagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ListadosFormasPagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ListadosFormasPagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesListadosFormasPagos.setName("jPanelParametrosReportesListadosFormasPagos"); 
		
		this.jPanelParametrosReportesAccionesListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesListadosFormasPagos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesListadosFormasPagos.setName("jPanelParametrosReportesAccionesListadosFormasPagos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionListadosFormasPagos = new JButtonMe();
		this.jButtonRecargarInformacionListadosFormasPagos.setText("Buscar");
		this.jButtonRecargarInformacionListadosFormasPagos.setToolTipText("Buscar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionListadosFormasPagos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionListadosFormasPagos.setVisible(false);
		
		
		this.jButtonProcesarInformacionListadosFormasPagos = new JButtonMe();
		this.jButtonProcesarInformacionListadosFormasPagos.setText("Procesar");
		this.jButtonProcesarInformacionListadosFormasPagos.setToolTipText("Procesar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionListadosFormasPagos.setVisible(false);
			
		this.jButtonProcesarInformacionListadosFormasPagos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadosFormasPagos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadosFormasPagos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesListadosFormasPagos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadosFormasPagos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesListadosFormasPagos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesListadosFormasPagos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadosFormasPagos.setText("TIPO");       
		this.jComboBoxTiposReportesListadosFormasPagos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesListadosFormasPagos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadosFormasPagos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesListadosFormasPagos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionListadosFormasPagos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionListadosFormasPagos.setText("Paginacion");
		this.jComboBoxTiposPaginacionListadosFormasPagos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesListadosFormasPagos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesListadosFormasPagos.setText("Accion");
		this.jComboBoxTiposRelacionesListadosFormasPagos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesListadosFormasPagos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadosFormasPagos.setText("Accion");
		this.jComboBoxTiposAccionesListadosFormasPagos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarListadosFormasPagos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarListadosFormasPagos.setText("Accion");
		this.jComboBoxTiposSeleccionarListadosFormasPagos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralListadosFormasPagos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralListadosFormasPagos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadosFormasPagos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadosFormasPagos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesListadosFormasPagos = new JLabelMe();
		
		this.jLabelAccionesListadosFormasPagos.setText("Acciones");		
		this.jLabelAccionesListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosListadosFormasPagos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosListadosFormasPagos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosListadosFormasPagos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosListadosFormasPagos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosListadosFormasPagos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosListadosFormasPagos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaListadosFormasPagos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaListadosFormasPagos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaListadosFormasPagos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteListadosFormasPagos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteListadosFormasPagos.setText("Graf.");
		this.jCheckBoxConGraficoReporteListadosFormasPagos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresListadosFormasPagos = new JButtonMe();
		//this.jButtonAnterioresListadosFormasPagos.setText("<<");
        this.jButtonAnterioresListadosFormasPagos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresListadosFormasPagos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesListadosFormasPagos = new JButtonMe();
		//this.jButtonSiguientesListadosFormasPagos.setText(">>");
        this.jButtonSiguientesListadosFormasPagos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesListadosFormasPagos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosListadosFormasPagos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosListadosFormasPagos.setText("Nue");
        this.jButtonNuevoGuardarCambiosListadosFormasPagos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosListadosFormasPagos,"nuevoguardarcambios_button","Nue",this.listadosformaspagosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosListadosFormasPagos";
		inputMap = this.jButtonNuevoGuardarCambiosListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosListadosFormasPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosListadosFormasPagos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionListadosFormasPagos";
		inputMap = this.jButtonRecargarInformacionListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionListadosFormasPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionListadosFormasPagos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesListadosFormasPagos";
		inputMap = this.jButtonSiguientesListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesListadosFormasPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesListadosFormasPagos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresListadosFormasPagos";
		inputMap = this.jButtonAnterioresListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresListadosFormasPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresListadosFormasPagos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasListadosFormasPagos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesListadosFormasPagos.setMinimumSize(new Dimension(this.getWidth(),ListadosFormasPagosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadosFormasPagosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadosFormasPagos.setMaximumSize(new Dimension(this.getWidth(),ListadosFormasPagosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadosFormasPagosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadosFormasPagos.setPreferredSize(new Dimension(this.getWidth(),ListadosFormasPagosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadosFormasPagosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionListadosFormasPagos = new GridBagLayout();

			this.jPanelPaginacionListadosFormasPagos.setLayout(gridaBagLayoutPaginacionListadosFormasPagos);						
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy = 0;
			this.gridBagConstraintsListadosFormasPagos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionListadosFormasPagos.add(this.jButtonAnterioresListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
					
						
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadosFormasPagos.gridy = 0;
			
			this.jPanelPaginacionListadosFormasPagos.add(this.jButtonNuevoGuardarCambiosListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
						
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsListadosFormasPagos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadosFormasPagos.gridy = 0;
			this.jPanelPaginacionListadosFormasPagos.add(this.jButtonSiguientesListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy = 1;
			this.gridBagConstraintsListadosFormasPagos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosFormasPagos.add(this.jButtonNuevoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
						
			
			
			if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
				this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsListadosFormasPagos.gridy = 1;
				this.gridBagConstraintsListadosFormasPagos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionListadosFormasPagos.add(this.jButtonGuardarCambiosTablaListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
			}
			
			
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy = 1;
			this.gridBagConstraintsListadosFormasPagos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosFormasPagos.add(this.jButtonDuplicarListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy = 1;
			this.gridBagConstraintsListadosFormasPagos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosFormasPagos.add(this.jButtonCopiarListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy = 1;
			this.gridBagConstraintsListadosFormasPagos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosFormasPagos.add(this.jButtonVerFormListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy = 1;
			this.gridBagConstraintsListadosFormasPagos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionListadosFormasPagos.add(this.jButtonCerrarListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
		
		
		this.jButtonRecargarInformacionListadosFormasPagos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadosFormasPagos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadosFormasPagos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesListadosFormasPagos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadosFormasPagos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadosFormasPagos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesListadosFormasPagos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadosFormasPagos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadosFormasPagos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesListadosFormasPagos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadosFormasPagos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadosFormasPagos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionListadosFormasPagos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadosFormasPagos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadosFormasPagos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesListadosFormasPagos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadosFormasPagos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadosFormasPagos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesListadosFormasPagos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosFormasPagos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosFormasPagos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarListadosFormasPagos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadosFormasPagos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadosFormasPagos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaListadosFormasPagos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadosFormasPagos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadosFormasPagos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteListadosFormasPagos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadosFormasPagos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadosFormasPagos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosListadosFormasPagos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadosFormasPagos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadosFormasPagos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosListadosFormasPagos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadosFormasPagos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadosFormasPagos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesListadosFormasPagos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesListadosFormasPagos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ListadosFormasPagos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ListadosFormasPagos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ListadosFormasPagos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ListadosFormasPagos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesListadosFormasPagos.setLayout(gridaBagParametrosReportesListadosFormasPagos);
			this.jPanelParametrosReportesAccionesListadosFormasPagos.setLayout(gridaBagParametrosReportesAccionesListadosFormasPagos);
			
			
			this.jPanelParametrosAuxiliar1ListadosFormasPagos.setLayout(gridaBagParametrosAuxiliar1ListadosFormasPagos);
			this.jPanelParametrosAuxiliar2ListadosFormasPagos.setLayout(gridaBagParametrosAuxiliar2ListadosFormasPagos);
			this.jPanelParametrosAuxiliar3ListadosFormasPagos.setLayout(gridaBagParametrosAuxiliar3ListadosFormasPagos);
			this.jPanelParametrosAuxiliar4ListadosFormasPagos.setLayout(gridaBagParametrosAuxiliar4ListadosFormasPagos);
			//this.jPanelParametrosAuxiliar5ListadosFormasPagos.setLayout(gridaBagParametrosAuxiliar2ListadosFormasPagos);			
			
			
			
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosFormasPagos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadosFormasPagos.add(this.jButtonRecargarInformacionListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosFormasPagos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadosFormasPagos.add(this.jComboBoxTiposPaginacionListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosFormasPagos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadosFormasPagos.add(this.jCheckBoxConAltoMaximoTablaListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosFormasPagos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadosFormasPagos.add(this.jComboBoxTiposArchivosReportesListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosFormasPagos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosFormasPagos.add(this.jPanelParametrosAuxiliar1ListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosFormasPagos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ListadosFormasPagos.add(this.jComboBoxTiposReportesListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);																		
			
			
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosFormasPagos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ListadosFormasPagos.add(this.jComboBoxTiposGraficosReportesListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosFormasPagos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosFormasPagos.add(this.jPanelParametrosAuxiliar4ListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosFormasPagos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosFormasPagos.add(this.jComboBoxTiposReportesListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosFormasPagos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosFormasPagos.add(this.jCheckBoxGenerarReporteListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosFormasPagos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosFormasPagos.add(this.jPanelParametrosAuxiliar2ListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosFormasPagos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosFormasPagos.add(this.jLabelAccionesListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
				this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsListadosFormasPagos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesListadosFormasPagos.add(this.jButtonAbrirOrderByListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosFormasPagos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadosFormasPagos.add(this.jComboBoxTiposSeleccionarListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);			
			
			
			/*
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosFormasPagos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosFormasPagos.add(this.jCheckBoxSeleccionarTodosListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosFormasPagos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosFormasPagos.add(this.jCheckBoxConGraficoReporteListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosFormasPagos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadosFormasPagos.add(this.jCheckBoxSeleccionarTodosListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);															
				
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosFormasPagos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadosFormasPagos.add(this.jCheckBoxSeleccionadosListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);															
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosFormasPagos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadosFormasPagos.add(this.jCheckBoxConGraficoReporteListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosFormasPagos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosFormasPagos.add(this.jPanelParametrosAuxiliar3ListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosFormasPagos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadosFormasPagos.add(this.jComboBoxTiposAccionesListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosListadosFormasPagos = new GridBagLayout();

			this.jScrollPanelDatosListadosFormasPagos.setLayout(gridaBagLayoutDatosListadosFormasPagos);
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy = 0;
			this.gridBagConstraintsListadosFormasPagos.gridx = 0;
			
			this.jScrollPanelDatosListadosFormasPagos.add(this.jTableDatosListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosListadosFormasPagos.setViewportView(this.jTableDatosListadosFormasPagos);
		this.jTableDatosListadosFormasPagos.setFillsViewportHeight(true);
		this.jTableDatosListadosFormasPagos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesListadosFormasPagos= new GridBagLayout();
		this.jPanelAccionesListadosFormasPagos.setLayout(gridaBagLayoutAccionesListadosFormasPagos);
		
		
		/*	
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = 0;
		this.gridBagConstraintsListadosFormasPagos.gridx = 0;
			
		this.jPanelAccionesListadosFormasPagos.add(this.jButtonNuevoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaListadosFormasPagosListadosFormasPagos= new GridBagLayout();
		gridaBagLayoutBusquedaListadosFormasPagosListadosFormasPagos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaListadosFormasPagosListadosFormasPagos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaListadosFormasPagosListadosFormasPagos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaListadosFormasPagosListadosFormasPagos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaListadosFormasPagosListadosFormasPagos.setLayout(gridaBagLayoutBusquedaListadosFormasPagosListadosFormasPagos);

		gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosFormasPagos.gridy = 0;
		gridBagConstraintsListadosFormasPagos.gridx = 0;
		jPanelBusquedaListadosFormasPagosListadosFormasPagos.add(jLabelid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos, gridBagConstraintsListadosFormasPagos);

		gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosFormasPagos.gridy = 0;
		gridBagConstraintsListadosFormasPagos.gridx = 1;
		jPanelBusquedaListadosFormasPagosListadosFormasPagos.add(jComboBoxid_tipo_grupo_forma_pagoBusquedaListadosFormasPagosListadosFormasPagos, gridBagConstraintsListadosFormasPagos);


		gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosFormasPagos.gridy = 1;
		gridBagConstraintsListadosFormasPagos.gridx = 0;
		jPanelBusquedaListadosFormasPagosListadosFormasPagos.add(jLabelfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos, gridBagConstraintsListadosFormasPagos);

		gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosFormasPagos.gridy = 1;
		gridBagConstraintsListadosFormasPagos.gridx = 1;
		jPanelBusquedaListadosFormasPagosListadosFormasPagos.add(jDateChooserfecha_desdeBusquedaListadosFormasPagosListadosFormasPagos, gridBagConstraintsListadosFormasPagos);


		gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosFormasPagos.gridy = 2;
		gridBagConstraintsListadosFormasPagos.gridx = 0;
		jPanelBusquedaListadosFormasPagosListadosFormasPagos.add(jLabelfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos, gridBagConstraintsListadosFormasPagos);

		gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosFormasPagos.gridy = 2;
		gridBagConstraintsListadosFormasPagos.gridx = 1;
		jPanelBusquedaListadosFormasPagosListadosFormasPagos.add(jDateChooserfecha_hastaBusquedaListadosFormasPagosListadosFormasPagos, gridBagConstraintsListadosFormasPagos);

		gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosFormasPagos.gridy = 3;
		gridBagConstraintsListadosFormasPagos.gridx =1;
		jPanelBusquedaListadosFormasPagosListadosFormasPagos.add(jButtonBusquedaListadosFormasPagosListadosFormasPagos, gridBagConstraintsListadosFormasPagos);

		jTabbedPaneBusquedasListadosFormasPagos.addTab("1.-Por Tipo Grupo Forma Pago Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaListadosFormasPagosListadosFormasPagos);
		jTabbedPaneBusquedasListadosFormasPagos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadosFormasPagos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadosFormasPagos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();						
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadosFormasPagos.gridx = 0;		
			//this.gridBagConstraintsListadosFormasPagos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadosFormasPagos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsListadosFormasPagos.gridx = 0;		
		//this.gridBagConstraintsListadosFormasPagos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsListadosFormasPagos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsListadosFormasPagos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsListadosFormasPagos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadosFormasPagos.gridx = 0;		
			this.gridBagConstraintsListadosFormasPagos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsListadosFormasPagos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosFormasPagos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);								
		
		
		/*
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosFormasPagos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		*/		
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadosFormasPagos.gridx =0;
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadosFormasPagos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
				
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosFormasPagos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ListadosFormasPagosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosListadosFormasPagos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadosFormasPagos = new GridBagLayout();
			this.jPanelBusquedasParametrosListadosFormasPagos.setLayout(gridaBagLayoutBusquedasParametrosListadosFormasPagos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralListadosFormasPagos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadosFormasPagos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosFormasPagos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosFormasPagos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosFormasPagos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
			
			
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosFormasPagos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
			
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadosFormasPagos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralListadosFormasPagos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoListadosFormasPagos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoListadosFormasPagos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoListadosFormasPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoListadosFormasPagos.setName("jPanelReporteDinamicoListadosFormasPagos"); 
		
		this.jPanelReporteDinamicoListadosFormasPagos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadosFormasPagos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadosFormasPagos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoListadosFormasPagos.setLayout(gridaBagLayoutReporteDinamicoListadosFormasPagos);
		
		
		this.jInternalFrameReporteDinamicoListadosFormasPagos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoListadosFormasPagos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadosFormasPagos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoListadosFormasPagos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoListadosFormasPagos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoListadosFormasPagos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoListadosFormasPagos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoListadosFormasPagos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoListadosFormasPagos.setResizable(true);
	    this.jInternalFrameReporteDinamicoListadosFormasPagos.setClosable(true);
	    this.jInternalFrameReporteDinamicoListadosFormasPagos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoListadosFormasPagos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadosFormasPagos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadosFormasPagos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Formas Pagoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteListadosFormasPagos = new JLabelMe();

		this.jLabelColumnasSelectReporteListadosFormasPagos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jLabelColumnasSelectReporteListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteListadosFormasPagos = new JList<Reporte>();
		this.jListColumnasSelectReporteListadosFormasPagos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteListadosFormasPagos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteListadosFormasPagos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadosFormasPagos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadosFormasPagos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteListadosFormasPagos=new JScrollPane(this.jListColumnasSelectReporteListadosFormasPagos);
			
			this.jScrollColumnasSelectReporteListadosFormasPagos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadosFormasPagos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadosFormasPagos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoListadosFormasPagos.add(this.jListColumnasSelectReporteListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jScrollColumnasSelectReporteListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteListadosFormasPagos = new JLabelMe();

		this.jLabelRelacionesSelectReporteListadosFormasPagos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteListadosFormasPagos = new JList<Reporte>();
		this.jListRelacionesSelectReporteListadosFormasPagos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteListadosFormasPagos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteListadosFormasPagos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadosFormasPagos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadosFormasPagos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteListadosFormasPagos=new JScrollPane(this.jListRelacionesSelectReporteListadosFormasPagos);
			
			this.jScrollRelacionesSelectReporteListadosFormasPagos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadosFormasPagos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadosFormasPagos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoListadosFormasPagos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoListadosFormasPagos = new JComboBoxMe();
		this.jListColumnasValoresGraficoListadosFormasPagos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoListadosFormasPagos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoListadosFormasPagos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoListadosFormasPagos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadosFormasPagos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadosFormasPagos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoListadosFormasPagos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoListadosFormasPagos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoListadosFormasPagos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadosFormasPagos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadosFormasPagos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoListadosFormasPagos = new JLabelMe();

		this.jLabelConGraficoDinamicoListadosFormasPagos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jLabelConGraficoDinamicoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoListadosFormasPagos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoListadosFormasPagos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoListadosFormasPagos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoListadosFormasPagos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoListadosFormasPagos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoListadosFormasPagos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jCheckBoxConGraficoDinamicoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoListadosFormasPagos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoListadosFormasPagos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jLabelColumnaCategoriaGraficoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoListadosFormasPagos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoListadosFormasPagos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoListadosFormasPagos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoListadosFormasPagos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoListadosFormasPagos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoListadosFormasPagos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jComboBoxColumnaCategoriaGraficoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorListadosFormasPagos = new JLabelMe();

		this.jLabelColumnaCategoriaValorListadosFormasPagos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jLabelColumnaCategoriaValorListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorListadosFormasPagos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorListadosFormasPagos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorListadosFormasPagos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorListadosFormasPagos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorListadosFormasPagos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorListadosFormasPagos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jComboBoxColumnaCategoriaValorListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoListadosFormasPagos = new JLabelMe();

		this.jLabelColumnasValoresGraficoListadosFormasPagos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jLabelColumnasValoresGraficoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoListadosFormasPagos = new JList<Reporte>();
		this.jListColumnasValoresGraficoListadosFormasPagos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoListadosFormasPagos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoListadosFormasPagos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoListadosFormasPagos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoListadosFormasPagos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoListadosFormasPagos=new JScrollPane(this.jListColumnasValoresGraficoListadosFormasPagos);
			
			this.jScrollColumnasValoresGraficoListadosFormasPagos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoListadosFormasPagos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoListadosFormasPagos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoListadosFormasPagos.add(this.jListColumnasSelectReporteListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jScrollColumnasValoresGraficoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoListadosFormasPagos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoListadosFormasPagos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jLabelTiposGraficosReportesDinamicoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoListadosFormasPagos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoListadosFormasPagos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoListadosFormasPagos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoListadosFormasPagos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoListadosFormasPagos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoListadosFormasPagos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jComboBoxTiposGraficosReportesDinamicoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoListadosFormasPagos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoListadosFormasPagos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jLabelGenerarExcelReporteDinamicoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoListadosFormasPagos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoListadosFormasPagos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoListadosFormasPagos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoListadosFormasPagos.setToolTipText("Generar EXCEL"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		//this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoListadosFormasPagos.add(this.jButtonGenerarExcelReporteDinamicoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jComboBoxTiposReportesDinamicoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoListadosFormasPagos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoListadosFormasPagos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jLabelTiposArchivoReporteDinamicoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jComboBoxTiposArchivosReportesDinamicoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoListadosFormasPagos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoListadosFormasPagos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoListadosFormasPagos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoListadosFormasPagos.setToolTipText("Generar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jButtonGenerarReporteDinamicoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoListadosFormasPagos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoListadosFormasPagos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoListadosFormasPagos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoListadosFormasPagos.setToolTipText("Cancelar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosFormasPagos.add(this.jButtonCerrarReporteDinamicoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalListadosFormasPagos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoListadosFormasPagos= new JScrollPane(jPanelReporteDinamicoListadosFormasPagos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoListadosFormasPagos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadosFormasPagos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadosFormasPagos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Formas Pagoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsListadosFormasPagos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoListadosFormasPagos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoListadosFormasPagos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalListadosFormasPagos);
		this.jInternalFrameReporteDinamicoListadosFormasPagos.getContentPane().add(this.jScrollPanelReporteDinamicoListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionListadosFormasPagos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionListadosFormasPagos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionListadosFormasPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionListadosFormasPagos.setName("jPanelImportacionListadosFormasPagos"); 
		
		this.jPanelImportacionListadosFormasPagos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadosFormasPagos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadosFormasPagos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionListadosFormasPagos.setLayout(gridaBagLayoutImportacionListadosFormasPagos);
		
		
		this.jInternalFrameImportacionListadosFormasPagos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionListadosFormasPagos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionListadosFormasPagos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadosFormasPagos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionListadosFormasPagos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadosFormasPagos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadosFormasPagos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionListadosFormasPagos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadosFormasPagos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadosFormasPagos.setResizable(true);
	    this.jInternalFrameImportacionListadosFormasPagos.setClosable(true);
	    this.jInternalFrameImportacionListadosFormasPagos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionListadosFormasPagos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadosFormasPagos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadosFormasPagos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionListadosFormasPagos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadosFormasPagos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadosFormasPagos.setResizable(true);
	    this.jInternalFrameImportacionListadosFormasPagos.setClosable(true);
	    this.jInternalFrameImportacionListadosFormasPagos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionListadosFormasPagos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadosFormasPagos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadosFormasPagos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Formas Pagoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionListadosFormasPagos = new JLabelMe();

		this.jLabelArchivoImportacionListadosFormasPagos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadosFormasPagos.add(this.jLabelArchivoImportacionListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionListadosFormasPagos = new JFileChooser();		
		this.jFileChooserImportacionListadosFormasPagos.setToolTipText("ESCOGER ARCHIVO"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionListadosFormasPagos = new JButtonMe();
		this.jButtonAbrirImportacionListadosFormasPagos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionListadosFormasPagos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionListadosFormasPagos.setToolTipText("Generar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosFormasPagos.add(this.jButtonAbrirImportacionListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionListadosFormasPagos = new JLabelMe();

		this.jLabelPathArchivoImportacionListadosFormasPagos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionListadosFormasPagos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadosFormasPagos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadosFormasPagos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadosFormasPagos.add(this.jLabelPathArchivoImportacionListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionListadosFormasPagos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionListadosFormasPagos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadosFormasPagos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadosFormasPagos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosFormasPagos.add(this.jTextFieldPathArchivoImportacionListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionListadosFormasPagos = new JButtonMe();
		this.jButtonGenerarImportacionListadosFormasPagos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionListadosFormasPagos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionListadosFormasPagos.setToolTipText("Generar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosFormasPagos.add(this.jButtonGenerarImportacionListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionListadosFormasPagos = new JButtonMe();
		this.jButtonCerrarImportacionListadosFormasPagos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionListadosFormasPagos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionListadosFormasPagos.setToolTipText("Cancelar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosFormasPagos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosFormasPagos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosFormasPagos.add(this.jButtonCerrarImportacionListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalListadosFormasPagos = new GridBagLayout();
		
		this.jScrollPanelImportacionListadosFormasPagos= new JScrollPane(jPanelImportacionListadosFormasPagos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
		this.gridBagConstraintsListadosFormasPagos.gridy =iPosYImportacion;
		this.gridBagConstraintsListadosFormasPagos.gridx =iPosXImportacion;
		this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionListadosFormasPagos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionListadosFormasPagos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalListadosFormasPagos);
		this.jInternalFrameImportacionListadosFormasPagos.getContentPane().add(this.jScrollPanelImportacionListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByListadosFormasPagos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByListadosFormasPagos = new JButtonMe();
			this.jButtonAbrirOrderByListadosFormasPagos.setText("Orden");
			this.jButtonAbrirOrderByListadosFormasPagos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadosFormasPagos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByListadosFormasPagos";
			inputMap = this.jButtonAbrirOrderByListadosFormasPagos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByListadosFormasPagos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByListadosFormasPagos"));
		
		
			GridBagLayout gridaBagLayoutOrderByListadosFormasPagos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByListadosFormasPagos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByListadosFormasPagos.setName("jPanelOrderByListadosFormasPagos"); 
			
			this.jPanelOrderByListadosFormasPagos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadosFormasPagos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadosFormasPagos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByListadosFormasPagos.setLayout(gridaBagLayoutOrderByListadosFormasPagos);
			
			
			this.jTableDatosListadosFormasPagosOrderBy = new JTableMe();        
			this.jTableDatosListadosFormasPagosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosListadosFormasPagosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosListadosFormasPagosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosListadosFormasPagosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosListadosFormasPagosOrderBy.setViewportView(this.jTableDatosListadosFormasPagosOrderBy);
			this.jTableDatosListadosFormasPagosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosListadosFormasPagosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByListadosFormasPagos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByListadosFormasPagos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByListadosFormasPagos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteListadosFormasPagos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByListadosFormasPagos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByListadosFormasPagos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByListadosFormasPagos.setTitle("Orden");
			this.jInternalFrameOrderByListadosFormasPagos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByListadosFormasPagos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByListadosFormasPagos.setResizable(true);
			this.jInternalFrameOrderByListadosFormasPagos.setClosable(true);
			this.jInternalFrameOrderByListadosFormasPagos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByListadosFormasPagos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadosFormasPagos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadosFormasPagos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByListadosFormasPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Formas Pagoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsListadosFormasPagos.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsListadosFormasPagos.ipady =150;
				
			this.jPanelOrderByListadosFormasPagos.add(jScrollPanelDatosListadosFormasPagosOrderBy, this.gridBagConstraintsListadosFormasPagos);//this.jTableDatosListadosFormasPagosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByListadosFormasPagos = new JButtonMe();
			this.jButtonCerrarOrderByListadosFormasPagos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByListadosFormasPagos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByListadosFormasPagos.setToolTipText("Cancelar"+" "+ListadosFormasPagosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByListadosFormasPagos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosFormasPagos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsListadosFormasPagos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByListadosFormasPagos.add(this.jButtonCerrarOrderByListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalListadosFormasPagos = new GridBagLayout();
			
			this.jScrollPanelOrderByListadosFormasPagos= new JScrollPane(jPanelOrderByListadosFormasPagos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsListadosFormasPagos = new GridBagConstraints();
			this.gridBagConstraintsListadosFormasPagos.gridy =iPosYOrderBy;
			this.gridBagConstraintsListadosFormasPagos.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadosFormasPagos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByListadosFormasPagos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByListadosFormasPagos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalListadosFormasPagos);
			
			this.jInternalFrameOrderByListadosFormasPagos.getContentPane().add(this.jScrollPanelOrderByListadosFormasPagos, this.gridBagConstraintsListadosFormasPagos);			
		
		} else {
			this.jButtonAbrirOrderByListadosFormasPagos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.listadosformaspagosSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosListadosFormasPagos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosListadosFormasPagos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosListadosFormasPagos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosListadosFormasPagos.getRowHeight();//ListadosFormasPagosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ListadosFormasPagosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadosFormasPagos.isSelected()) {
					iHeightTable=ListadosFormasPagosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadosFormasPagosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadosFormasPagosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ListadosFormasPagosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadosFormasPagos.isSelected()) {
					iHeightTable=ListadosFormasPagosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadosFormasPagosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadosFormasPagosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosListadosFormasPagos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadosFormasPagos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadosFormasPagos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosListadosFormasPagos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadosFormasPagos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadosFormasPagos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByListadosFormasPagos!=null && this.jInternalFrameOrderByListadosFormasPagos.getjTableDatosOrderBy()!=null) {
			//if(!this.listadosformaspagosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByListadosFormasPagos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByListadosFormasPagos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByListadosFormasPagos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByListadosFormasPagos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByListadosFormasPagos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByListadosFormasPagos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByListadosFormasPagos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosListadosFormasPagos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadosFormasPagos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadosFormasPagos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=listadosformaspagosLogic.getListadosFormasPagoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadosformaspagoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ListadosFormasPagos> TraerListadosFormasPagosBeans(List<ListadosFormasPagos> listadosformaspagoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ListadosFormasPagos listadosformaspagos:listadosformaspagoss) {
					
				if(!(ListadosFormasPagosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ListadosFormasPagosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					listadosformaspagos.setsDetalleGeneralEntityReporte(ListadosFormasPagosConstantesFunciones.getListadosFormasPagosDescripcion(listadosformaspagos));
										
						
					
						
					
				} else  {
							
					//listadosformaspagos.setsDetalleGeneralEntityReporte(listadosformaspagos.getsDetalleGeneralEntityReporte());
										
				}
				
				//listadosformaspagosbeans.add(listadosformaspagosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return listadosformaspagoss;
    }
	//PARA REPORTES FIN
}
