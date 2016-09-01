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

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.contabilidad.util.LineaFlujoCajaConstantesFunciones;

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
public class LineaFlujoCajaJInternalFrame extends LineaFlujoCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarLineaFlujoCaja;
	
	protected JMenuBar jmenuBarLineaFlujoCaja;
	
	protected JMenu jmenuLineaFlujoCaja;
	protected JMenu jmenuDatosLineaFlujoCaja;
	protected JMenu jmenuArchivoLineaFlujoCaja;
	protected JMenu jmenuAccionesLineaFlujoCaja;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLineaFlujoCaja;	
	protected GridBagConstraints gridBagConstraintsLineaFlujoCaja;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public LineaFlujoCajaDetalleFormJInternalFrame jInternalFrameDetalleFormLineaFlujoCaja;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoLineaFlujoCaja;	
	protected ImportacionJInternalFrame jInternalFrameImportacionLineaFlujoCaja;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoGrupoFlujoCajaBeanSwingJInternalFrame tipogrupoflujocajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogrupoflujocaja="";

	protected TipoLineaFlujoCajaBeanSwingJInternalFrame tipolineaflujocajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipolineaflujocaja="";
	
	public LineaFlujoCajaSessionBean lineaflujocajaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoGrupoFlujoCajaSessionBean tipogrupoflujocajaSessionBean;
	public TipoLineaFlujoCajaSessionBean tipolineaflujocajaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<LineaFlujoCaja> lineaflujocajas;		
	public List<LineaFlujoCaja> lineaflujocajasEliminados;	
	public List<LineaFlujoCaja> lineaflujocajasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByLineaFlujoCaja;		
	protected JButton jButtonAbrirOrderByLineaFlujoCaja;
	
	
	//protected JPanel jPanelOrderByLineaFlujoCaja;
	//public JScrollPane jScrollPanelOrderByLineaFlujoCaja;	
	//protected JButton jButtonCerrarOrderByLineaFlujoCaja;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public LineaFlujoCajaLogic lineaflujocajaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosLineaFlujoCaja;
	public JScrollPane jScrollPanelDatosEdicionLineaFlujoCaja;
	public JScrollPane jScrollPanelDatosGeneralLineaFlujoCaja;
    
	
	
	//public JScrollPane jScrollPanelDatosLineaFlujoCajaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoLineaFlujoCaja;
	//public JScrollPane jScrollPanelImportacionLineaFlujoCaja;
	
	
	
	protected JPanel jPanelAccionesLineaFlujoCaja;
	
    protected JPanel jPanelPaginacionLineaFlujoCaja;
    protected JPanel jPanelParametrosReportesLineaFlujoCaja;
	protected JPanel jPanelParametrosReportesAccionesLineaFlujoCaja;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1LineaFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar2LineaFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar3LineaFlujoCaja;
	protected JPanel jPanelParametrosAuxiliar4LineaFlujoCaja;
	//protected JPanel jPanelParametrosAuxiliar5LineaFlujoCaja;
	
	
	
	//protected JPanel jPanelReporteDinamicoLineaFlujoCaja;
	//protected JPanel jPanelImportacionLineaFlujoCaja;
	
	
	public JTable jTableDatosLineaFlujoCaja;
	
	
	
	//public JTable jTableDatosLineaFlujoCajaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoLineaFlujoCaja;
	protected JButton jButtonDuplicarLineaFlujoCaja;
	protected JButton jButtonCopiarLineaFlujoCaja;
	protected JButton jButtonVerFormLineaFlujoCaja;
	protected JButton jButtonNuevoRelacionesLineaFlujoCaja;
	protected JButton jButtonModificarLineaFlujoCaja;
	
    protected JButton jButtonGuardarCambiosTablaLineaFlujoCaja;
	protected JButton jButtonCerrarLineaFlujoCaja;
	
	
	protected JButton jButtonRecargarInformacionLineaFlujoCaja;
	protected JButton jButtonProcesarInformacionLineaFlujoCaja;
	
	
	protected JButton jButtonAnterioresLineaFlujoCaja;
	protected JButton jButtonSiguientesLineaFlujoCaja;
	protected JButton jButtonNuevoGuardarCambiosLineaFlujoCaja;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoLineaFlujoCaja;
	//protected JButton jButtonCerrarReporteDinamicoLineaFlujoCaja;
	//protected JButton jButtonGenerarExcelReporteDinamicoLineaFlujoCaja;	
	
	
	
	//protected JButton jButtonAbrirImportacionLineaFlujoCaja;
	//protected JButton jButtonGenerarImportacionLineaFlujoCaja;
	//protected JButton jButtonCerrarImportacionLineaFlujoCaja;
	//protected JFileChooser jFileChooserImportacionLineaFlujoCaja;
	//protected File fileImportacionLineaFlujoCaja;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLineaFlujoCaja;
	protected JButton jButtonDuplicarToolBarLineaFlujoCaja;
	protected JButton jButtonNuevoRelacionesToolBarLineaFlujoCaja;
	
	
	public JButton jButtonGuardarCambiosToolBarLineaFlujoCaja;
	protected JButton jButtonCopiarToolBarLineaFlujoCaja;
	protected JButton jButtonVerFormToolBarLineaFlujoCaja;
	public JButton jButtonGuardarCambiosTablaToolBarLineaFlujoCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarLineaFlujoCaja;
	protected JButton jButtonCerrarToolBarLineaFlujoCaja;
	
	protected JButton jButtonRecargarInformacionToolBarLineaFlujoCaja;
	protected JButton jButtonProcesarInformacionToolBarLineaFlujoCaja;
	protected JButton jButtonAnterioresToolBarLineaFlujoCaja;
	protected JButton jButtonSiguientesToolBarLineaFlujoCaja;
	protected JButton jButtonNuevoGuardarCambiosToolBarLineaFlujoCaja;
	protected JButton jButtonAbrirOrderByToolBarLineaFlujoCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLineaFlujoCaja;
	protected JMenuItem jMenuItemDuplicarLineaFlujoCaja;
	protected JMenuItem jMenuItemNuevoRelacionesLineaFlujoCaja;
	
	
	protected JMenuItem jMenuItemGuardarCambiosLineaFlujoCaja;
	protected JMenuItem jMenuItemCopiarLineaFlujoCaja;
	protected JMenuItem jMenuItemVerFormLineaFlujoCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaLineaFlujoCaja;
	protected JMenuItem jMenuItemCerrarLineaFlujoCaja;
	protected JMenuItem jMenuItemDetalleCerrarLineaFlujoCaja;
	protected JMenuItem jMenuItemDetalleAbrirOrderByLineaFlujoCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarLineaFlujoCaja;
	
	protected JMenuItem jMenuItemRecargarInformacionLineaFlujoCaja;
	protected JMenuItem jMenuItemProcesarInformacionLineaFlujoCaja;
	protected JMenuItem jMenuItemAnterioresLineaFlujoCaja;
	protected JMenuItem jMenuItemSiguientesLineaFlujoCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLineaFlujoCaja;
	protected JMenuItem jMenuItemAbrirOrderByLineaFlujoCaja;
	protected JMenuItem jMenuItemMostrarOcultarLineaFlujoCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesLineaFlujoCaja;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosLineaFlujoCaja;
	protected JCheckBox jCheckBoxSeleccionadosLineaFlujoCaja;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaLineaFlujoCaja;
	protected JCheckBox jCheckBoxConGraficoReporteLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesLineaFlujoCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoLineaFlujoCaja;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarLineaFlujoCaja;
	protected JTextField jTextFieldValorCampoGeneralLineaFlujoCaja;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteLineaFlujoCaja;
	//public JList<Reporte> jListColumnasSelectReporteLineaFlujoCaja;
	//public JScrollPane jScrollColumnasSelectReporteLineaFlujoCaja;
	
	//public JLabel jLabelRelacionesSelectReporteLineaFlujoCaja;
	//public JList<Reporte> jListRelacionesSelectReporteLineaFlujoCaja;
	//public JScrollPane jScrollRelacionesSelectReporteLineaFlujoCaja;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoLineaFlujoCaja;
	//protected JCheckBox jCheckBoxConGraficoDinamicoLineaFlujoCaja;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoLineaFlujoCaja;
	//public JLabel jLabelTiposArchivoReporteDinamicoLineaFlujoCaja;
	
		
	//public JLabel jLabelArchivoImportacionLineaFlujoCaja;	
	//public JLabel jLabelPathArchivoImportacionLineaFlujoCaja;
	//protected JTextField jTextFieldPathArchivoImportacionLineaFlujoCaja;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoLineaFlujoCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoLineaFlujoCaja;
	
	//public JLabel jLabelColumnaCategoriaValorLineaFlujoCaja;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorLineaFlujoCaja;
	
	//public JLabel jLabelColumnasValoresGraficoLineaFlujoCaja;
	//public JList<Reporte> jListColumnasValoresGraficoLineaFlujoCaja;
	//public JScrollPane jScrollColumnasValoresGraficoLineaFlujoCaja;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoLineaFlujoCaja;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoLineaFlujoCaja;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasLineaFlujoCaja;
	public JPanel jPanelBusquedaPorCodigoLineaFlujoCaja;
	public JButton jButtonBusquedaPorCodigoLineaFlujoCaja;
	public JPanel jPanelBusquedaPorNombreLineaFlujoCaja;
	public JButton jButtonBusquedaPorNombreLineaFlujoCaja;
	public JPanel jPanelFK_IdTipoGrupoFlujoCajaLineaFlujoCaja;
	public JButton jButtonFK_IdTipoGrupoFlujoCajaLineaFlujoCaja;
	public JPanel jPanelFK_IdTipoLineaFlujoCajaLineaFlujoCaja;
	public JButton jButtonFK_IdTipoLineaFlujoCajaLineaFlujoCaja;
	
	public JPanel jPanelcodigoBusquedaPorCodigoLineaFlujoCaja;
	public JLabel jLabelcodigoBusquedaPorCodigoLineaFlujoCaja;
	public JTextField jTextFieldcodigoBusquedaPorCodigoLineaFlujoCaja;
	public JButton jButtoncodigoBusquedaPorCodigoLineaFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreLineaFlujoCaja;
	public JLabel jLabelnombreBusquedaPorNombreLineaFlujoCaja;
	public JTextArea jTextAreanombreBusquedaPorNombreLineaFlujoCaja;
	public JButton jButtonnombreBusquedaPorNombreLineaFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja;
	public JLabel jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja;
	public JButton jButtonid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja= new JButtonMe();
	public JButton jButtonid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja;
	public JLabel jLabelid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja;
	public JButton jButtonid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja= new JButtonMe();
	public JButton jButtonid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCajaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public LineaFlujoCajaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("LineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaFlujoCajaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaFlujoCajaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaFlujoCajaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("LineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionLineaFlujoCaja)	{
		this.jButtonRecargarInformacionLineaFlujoCaja = jButtonRecargarInformacionLineaFlujoCaja;
	}
	
	public JButton getjButtonProcesarInformacionLineaFlujoCaja() {
		return this.jButtonProcesarInformacionLineaFlujoCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLineaFlujoCaja)	{
		this.jButtonProcesarInformacionLineaFlujoCaja = jButtonProcesarInformacionLineaFlujoCaja;
	}
	
	
	public JButton getjButtonRecargarInformacionLineaFlujoCaja() {
		return this.jButtonRecargarInformacionLineaFlujoCaja;
	}
	
	
	public List<LineaFlujoCaja> getlineaflujocajas() {
		return this.lineaflujocajas;
	}

	public void setlineaflujocajas(List<LineaFlujoCaja> lineaflujocajas) {
		this.lineaflujocajas = lineaflujocajas;
	}
	
	public List<LineaFlujoCaja> getlineaflujocajasAux() {
		return this.lineaflujocajasAux;
	}

	public void setlineaflujocajasAux(List<LineaFlujoCaja> lineaflujocajasAux) {
		this.lineaflujocajasAux = lineaflujocajasAux;
	}
	
	public List<LineaFlujoCaja> getlineaflujocajasEliminados() {
		return this.lineaflujocajasEliminados;
	}

	public void setLineaFlujoCajasEliminados(List<LineaFlujoCaja> lineaflujocajasEliminados) {
		this.lineaflujocajasEliminados = lineaflujocajasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarLineaFlujoCaja() {
		return jComboBoxTiposSeleccionarLineaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarLineaFlujoCaja(
			JComboBox jComboBoxTiposSeleccionarLineaFlujoCaja) {
		this.jComboBoxTiposSeleccionarLineaFlujoCaja = jComboBoxTiposSeleccionarLineaFlujoCaja;
	}
	
	public void setBorderResaltarTiposSeleccionarLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralLineaFlujoCaja() {
		return jTextFieldValorCampoGeneralLineaFlujoCaja;
	}

	public void setjTextFieldValorCampoGeneralLineaFlujoCaja(
			JTextField jTextFieldValorCampoGeneralLineaFlujoCaja) {
		this.jTextFieldValorCampoGeneralLineaFlujoCaja = jTextFieldValorCampoGeneralLineaFlujoCaja;
	}

	public void setBorderResaltarValorCampoGeneralLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralLineaFlujoCaja .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosLineaFlujoCaja() {
		return this.jCheckBoxSeleccionarTodosLineaFlujoCaja;
	}

	public void setjCheckBoxSeleccionarTodosLineaFlujoCaja(
			JCheckBox jCheckBoxSeleccionarTodosLineaFlujoCaja) {
		this.jCheckBoxSeleccionarTodosLineaFlujoCaja = jCheckBoxSeleccionarTodosLineaFlujoCaja;
	}

	public void setBorderResaltarSeleccionarTodosLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosLineaFlujoCaja() {
		return this.jCheckBoxSeleccionadosLineaFlujoCaja;
	}

	public void setjCheckBoxSeleccionadosLineaFlujoCaja(
			JCheckBox jCheckBoxSeleccionadosLineaFlujoCaja) {
		this.jCheckBoxSeleccionadosLineaFlujoCaja = jCheckBoxSeleccionadosLineaFlujoCaja;
	}
	
	public void setBorderResaltarSeleccionadosLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesLineaFlujoCaja() {
		return this.jComboBoxTiposArchivosReportesLineaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesLineaFlujoCaja(
			JComboBox jComboBoxTiposArchivosReportesLineaFlujoCaja) {
		this.jComboBoxTiposArchivosReportesLineaFlujoCaja = jComboBoxTiposArchivosReportesLineaFlujoCaja;
	}

	public void setBorderResaltarTiposArchivosReportesLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesLineaFlujoCaja() {
		return this.jComboBoxTiposReportesLineaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesLineaFlujoCaja(
			JComboBox jComboBoxTiposReportesLineaFlujoCaja) {
		this.jComboBoxTiposReportesLineaFlujoCaja = jComboBoxTiposReportesLineaFlujoCaja;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoLineaFlujoCaja() {
	//	return jComboBoxTiposReportesDinamicoLineaFlujoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoLineaFlujoCaja(
	//		JComboBox jComboBoxTiposReportesDinamicoLineaFlujoCaja) {
	//	this.jComboBoxTiposReportesDinamicoLineaFlujoCaja = jComboBoxTiposReportesDinamicoLineaFlujoCaja;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoLineaFlujoCaja() {
	//	return jComboBoxTiposArchivosReportesDinamicoLineaFlujoCaja;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoLineaFlujoCaja(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoLineaFlujoCaja) {
	//	this.jComboBoxTiposArchivosReportesDinamicoLineaFlujoCaja = jComboBoxTiposArchivosReportesDinamicoLineaFlujoCaja;
	//}
	
	public void setBorderResaltarTiposReportesLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesLineaFlujoCaja() {
		return this.jComboBoxTiposGraficosReportesLineaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesLineaFlujoCaja(
			JComboBox jComboBoxTiposGraficosReportesLineaFlujoCaja) {
		this.jComboBoxTiposGraficosReportesLineaFlujoCaja = jComboBoxTiposGraficosReportesLineaFlujoCaja;
	}
	
	public void setBorderResaltarTiposGraficosReportesLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionLineaFlujoCaja() {
		return this.jComboBoxTiposPaginacionLineaFlujoCaja;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionLineaFlujoCaja(
			JComboBox jComboBoxTiposPaginacionLineaFlujoCaja) {
		this.jComboBoxTiposPaginacionLineaFlujoCaja = jComboBoxTiposPaginacionLineaFlujoCaja;
	}
	
	public void setBorderResaltarTiposPaginacionLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesLineaFlujoCaja() {
		return this.jComboBoxTiposRelacionesLineaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLineaFlujoCaja() {
		return this.jComboBoxTiposAccionesLineaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLineaFlujoCaja(
			JComboBox jComboBoxTiposRelacionesLineaFlujoCaja) {
		this.jComboBoxTiposRelacionesLineaFlujoCaja = jComboBoxTiposRelacionesLineaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLineaFlujoCaja(
			JComboBox jComboBoxTiposAccionesLineaFlujoCaja) {
		this.jComboBoxTiposAccionesLineaFlujoCaja = jComboBoxTiposAccionesLineaFlujoCaja;
	}
	
	public void setBorderResaltarTiposRelacionesLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesLineaFlujoCaja() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaFlujoCaja.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesLineaFlujoCaja .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoLineaFlujoCaja() {
	//	return jCheckBoxConGraficoDinamicoLineaFlujoCaja;
	//}

	//public void setjCheckBoxConGraficoDinamicoLineaFlujoCaja(
	//		JCheckBox jCheckBoxConGraficoDinamicoLineaFlujoCaja) {
	//	this.jCheckBoxConGraficoDinamicoLineaFlujoCaja = jCheckBoxConGraficoDinamicoLineaFlujoCaja;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoLineaFlujoCaja() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarLineaFlujoCaja.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoLineaFlujoCaja .setBorder(borderResaltar);		
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
		this.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
		
		this.lineaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.lineaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.lineaflujocajaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=LineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=LineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LineaFlujoCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Linea Flujo Caja MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
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
		
		LineaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("LineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarLineaFlujoCaja= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarLineaFlujoCaja,this.jTtoolBarLineaFlujoCaja,
							"nuevo","nuevo","Nuevo"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarLineaFlujoCaja,this.jTtoolBarLineaFlujoCaja,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarLineaFlujoCaja,this.jTtoolBarLineaFlujoCaja,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarLineaFlujoCaja,this.jTtoolBarLineaFlujoCaja,
							"duplicar","duplicar","Duplicar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarLineaFlujoCaja,this.jTtoolBarLineaFlujoCaja,
							"copiar","copiar","Copiar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarLineaFlujoCaja,this.jTtoolBarLineaFlujoCaja,
							"ver_form","ver_form","Ver"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLineaFlujoCaja,this.jTtoolBarLineaFlujoCaja,
							"recargar","recargar","Recargar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLineaFlujoCaja,this.jTtoolBarLineaFlujoCaja,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLineaFlujoCaja,this.jTtoolBarLineaFlujoCaja,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarLineaFlujoCaja,this.jTtoolBarLineaFlujoCaja,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarLineaFlujoCaja,this.jTtoolBarLineaFlujoCaja,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarLineaFlujoCaja,this.jTtoolBarLineaFlujoCaja,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarLineaFlujoCaja,this.jTtoolBarLineaFlujoCaja,
							"cerrar","cerrar","Salir"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarLineaFlujoCaja=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarLineaFlujoCaja;
			
				this.jButtonProcesarInformacionToolBarLineaFlujoCaja=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarLineaFlujoCaja;
				
		//protected JButton jButtonModificarToolBarLineaFlujoCaja;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarLineaFlujoCaja=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuLineaFlujoCaja=new JMenuMe("General");
		this.jmenuArchivoLineaFlujoCaja=new JMenuMe("Archivo");
		this.jmenuAccionesLineaFlujoCaja=new JMenuMe("Acciones");
		this.jmenuDatosLineaFlujoCaja=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLineaFlujoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLineaFlujoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLineaFlujoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarLineaFlujoCaja= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarLineaFlujoCaja.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarLineaFlujoCaja,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesLineaFlujoCaja= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesLineaFlujoCaja.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesLineaFlujoCaja,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosLineaFlujoCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLineaFlujoCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLineaFlujoCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarLineaFlujoCaja= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarLineaFlujoCaja.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarLineaFlujoCaja,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormLineaFlujoCaja= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormLineaFlujoCaja.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormLineaFlujoCaja,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaLineaFlujoCaja= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaLineaFlujoCaja.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaLineaFlujoCaja,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLineaFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLineaFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLineaFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionLineaFlujoCaja= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionLineaFlujoCaja.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionLineaFlujoCaja,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionLineaFlujoCaja= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionLineaFlujoCaja.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionLineaFlujoCaja,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresLineaFlujoCaja= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresLineaFlujoCaja.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresLineaFlujoCaja,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesLineaFlujoCaja= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesLineaFlujoCaja.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesLineaFlujoCaja,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByLineaFlujoCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByLineaFlujoCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByLineaFlujoCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLineaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLineaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLineaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByLineaFlujoCaja= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByLineaFlujoCaja.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByLineaFlujoCaja,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLineaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLineaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLineaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosLineaFlujoCaja= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosLineaFlujoCaja.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosLineaFlujoCaja,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoLineaFlujoCaja.add(this.jMenuItemCerrarLineaFlujoCaja);
			
			this.jmenuAccionesLineaFlujoCaja.add(this.jMenuItemNuevoLineaFlujoCaja);
			this.jmenuAccionesLineaFlujoCaja.add(this.jMenuItemNuevoGuardarCambiosLineaFlujoCaja);
			this.jmenuAccionesLineaFlujoCaja.add(this.jMenuItemNuevoRelacionesLineaFlujoCaja);
			this.jmenuAccionesLineaFlujoCaja.add(this.jMenuItemGuardarCambiosTablaLineaFlujoCaja);		
			this.jmenuAccionesLineaFlujoCaja.add(this.jMenuItemDuplicarLineaFlujoCaja);		
			this.jmenuAccionesLineaFlujoCaja.add(this.jMenuItemCopiarLineaFlujoCaja);		
			this.jmenuAccionesLineaFlujoCaja.add(this.jMenuItemVerFormLineaFlujoCaja);		
			
			this.jmenuDatosLineaFlujoCaja.add(this.jMenuItemRecargarInformacionLineaFlujoCaja);				
			this.jmenuDatosLineaFlujoCaja.add(this.jMenuItemAnterioresLineaFlujoCaja);				
			this.jmenuDatosLineaFlujoCaja.add(this.jMenuItemSiguientesLineaFlujoCaja);				
			this.jmenuDatosLineaFlujoCaja.add(this.jMenuItemAbrirOrderByLineaFlujoCaja);				
			this.jmenuDatosLineaFlujoCaja.add(this.jMenuItemMostrarOcultarLineaFlujoCaja);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesLineaFlujoCaja.add(this.jMenuItemGuardarCambiosLineaFlujoCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarLineaFlujoCaja.add(this.jmenuArchivoLineaFlujoCaja);		
			this.jmenuBarLineaFlujoCaja.add(this.jmenuAccionesLineaFlujoCaja);		
			this.jmenuBarLineaFlujoCaja.add(this.jmenuDatosLineaFlujoCaja);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarLineaFlujoCaja);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasLineaFlujoCaja() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoLineaFlujoCaja.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoLineaFlujoCaja= new JButtonMe();
		this.jButtonBusquedaPorCodigoLineaFlujoCaja.setText("Buscar");
		this.jButtonBusquedaPorCodigoLineaFlujoCaja.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoLineaFlujoCaja,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoLineaFlujoCaja = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoLineaFlujoCaja.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoLineaFlujoCaja.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoLineaFlujoCaja= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreLineaFlujoCaja.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreLineaFlujoCaja= new JButtonMe();
		this.jButtonBusquedaPorNombreLineaFlujoCaja.setText("Buscar");
		this.jButtonBusquedaPorNombreLineaFlujoCaja.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreLineaFlujoCaja,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreLineaFlujoCaja = new JLabelMe();
		jLabelnombreBusquedaPorNombreLineaFlujoCaja.setText("Nombre :");
		jLabelnombreBusquedaPorNombreLineaFlujoCaja.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreLineaFlujoCaja= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoGrupoFlujoCajaLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setToolTipText("Buscar Por Tipo Grupo Flujo Caja ");
		this.jButtonFK_IdTipoGrupoFlujoCajaLineaFlujoCaja= new JButtonMe();
		this.jButtonFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setText("Buscar");
		this.jButtonFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setToolTipText("Buscar Por Tipo Grupo Flujo Caja ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoGrupoFlujoCajaLineaFlujoCaja,"buscar_button","Buscar Por Tipo Grupo Flujo Caja ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoGrupoFlujoCajaLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja = new JLabelMe();
		jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setText("Tipo Grupo Flujo Caja :");
		jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setToolTipText("Tipo Grupo Flujo Caja");
		jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja= new JComboBoxMe();
		jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoLineaFlujoCajaLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setToolTipText("Buscar Por Tipo Linea Flujo Caja ");
		this.jButtonFK_IdTipoLineaFlujoCajaLineaFlujoCaja= new JButtonMe();
		this.jButtonFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setText("Buscar");
		this.jButtonFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setToolTipText("Buscar Por Tipo Linea Flujo Caja ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoLineaFlujoCajaLineaFlujoCaja,"buscar_button","Buscar Por Tipo Linea Flujo Caja ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoLineaFlujoCajaLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja = new JLabelMe();
		jLabelid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setText("Tipo Linea Flujo Caja :");
		jLabelid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setToolTipText("Tipo Linea Flujo Caja");
		jLabelid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja= new JComboBoxMe();
		jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasLineaFlujoCaja=new JTabbedPane();


		this.jTabbedPaneBusquedasLineaFlujoCaja.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLineaFlujoCaja.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLineaFlujoCaja.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasLineaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleLineaFlujoCaja = new LineaFlujoCajaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Linea Flujo Caja DATOS");
			this.jInternalFrameDetalleFormLineaFlujoCaja = new LineaFlujoCajaDetalleFormJInternalFrame(jDesktopPane,this.lineaflujocajaSessionBean.getConGuardarRelaciones(),this.lineaflujocajaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormLineaFlujoCaja = null;//new LineaFlujoCajaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLineaFlujoCaja= new GridBagLayout();
		
		
		this.jTableDatosLineaFlujoCaja = new JTableMe();      
		
		String sToolTipLineaFlujoCaja="";
		sToolTipLineaFlujoCaja=LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLineaFlujoCaja+="(Contabilidad.LineaFlujoCaja)";
		}
		
		if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipLineaFlujoCaja+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosLineaFlujoCaja.setToolTipText(sToolTipLineaFlujoCaja);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosLineaFlujoCaja);
		this.jTableDatosLineaFlujoCaja.setAutoCreateRowSorter(true);
		this.jTableDatosLineaFlujoCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosLineaFlujoCaja.setRowSelectionAllowed(true);
		this.jTableDatosLineaFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoLineaFlujoCaja = new JButtonMe();
		this.jButtonDuplicarLineaFlujoCaja = new JButtonMe();
		this.jButtonCopiarLineaFlujoCaja = new JButtonMe();
		this.jButtonVerFormLineaFlujoCaja = new JButtonMe();
		this.jButtonNuevoRelacionesLineaFlujoCaja = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaLineaFlujoCaja = new JButtonMe();
		this.jButtonCerrarLineaFlujoCaja = new JButtonMe();
		
		this.jScrollPanelDatosLineaFlujoCaja = new JScrollPane();   
        this.jScrollPanelDatosGeneralLineaFlujoCaja = new JScrollPane();
		
				
		
		
		this.jPanelAccionesLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Linea Flujo Caja";
		
		if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea Flujo Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosLineaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLineaFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesLineaFlujoCaja.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoLineaFlujoCaja=new ReporteDinamicoJInternalFrame(LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoLineaFlujoCaja();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionLineaFlujoCaja=new ImportacionJInternalFrame(LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionLineaFlujoCaja();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByLineaFlujoCaja = new JButtonMe();
		
		this.jButtonAbrirOrderByLineaFlujoCaja.setText("Orden");
		this.jButtonAbrirOrderByLineaFlujoCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLineaFlujoCaja,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLineaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLineaFlujoCaja,false,this);
			
			//this.cargarOrderByLineaFlujoCaja(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLineaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLineaFlujoCaja,true,this);
			
			//this.cargarOrderByLineaFlujoCaja(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosLineaFlujoCaja.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosLineaFlujoCaja.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosLineaFlujoCaja.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosLineaFlujoCaja.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosLineaFlujoCaja.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosLineaFlujoCaja.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoLineaFlujoCaja.setText("Nuevo");
		this.jButtonDuplicarLineaFlujoCaja.setText("Duplicar");
		this.jButtonCopiarLineaFlujoCaja.setText("Copiar");
		this.jButtonVerFormLineaFlujoCaja.setText("Ver");
		this.jButtonNuevoRelacionesLineaFlujoCaja.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaLineaFlujoCaja.setText("Guardar");
		this.jButtonCerrarLineaFlujoCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLineaFlujoCaja,"nuevo_button","Nuevo",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarLineaFlujoCaja,"duplicar_button","Duplicar",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarLineaFlujoCaja,"copiar_button","Copiar",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormLineaFlujoCaja,"ver_form","Ver",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesLineaFlujoCaja,"nuevorelaciones_button","Nuevo Rel",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLineaFlujoCaja,"guardarcambiostabla_button","Guardar",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLineaFlujoCaja,"cerrar_button","Salir",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoLineaFlujoCaja.setToolTipText("Nuevo"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarLineaFlujoCaja.setToolTipText("Duplicar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarLineaFlujoCaja.setToolTipText("Copiar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormLineaFlujoCaja.setToolTipText("Ver"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesLineaFlujoCaja.setToolTipText("Nuevo Rel"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaLineaFlujoCaja.setToolTipText("Guardar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLineaFlujoCaja.setToolTipText("Salir"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoLineaFlujoCaja";
		inputMap = this.jButtonNuevoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLineaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLineaFlujoCaja"));
		
		//DUPLICAR
		sMapKey = "DuplicarLineaFlujoCaja";
		inputMap = this.jButtonDuplicarLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarLineaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarLineaFlujoCaja"));
		
		//COPIAR
		sMapKey = "CopiarLineaFlujoCaja";
		inputMap = this.jButtonCopiarLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarLineaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarLineaFlujoCaja"));
		
		//VEr FORM
		sMapKey = "VerFormLineaFlujoCaja";
		inputMap = this.jButtonVerFormLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormLineaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormLineaFlujoCaja"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesLineaFlujoCaja";
		inputMap = this.jButtonNuevoRelacionesLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesLineaFlujoCaja"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarLineaFlujoCaja";
		inputMap = this.jButtonModificarLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarLineaFlujoCaja"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarLineaFlujoCaja";
		inputMap = this.jButtonCerrarLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLineaFlujoCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLineaFlujoCaja";
		inputMap = this.jButtonGuardarCambiosTablaLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLineaFlujoCaja"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1LineaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2LineaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3LineaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4LineaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5LineaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesLineaFlujoCaja.setName("jPanelParametrosReportesLineaFlujoCaja"); 
		
		this.jPanelParametrosReportesAccionesLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesLineaFlujoCaja.setName("jPanelParametrosReportesAccionesLineaFlujoCaja"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionLineaFlujoCaja = new JButtonMe();
		this.jButtonRecargarInformacionLineaFlujoCaja.setText("Recargar");
		this.jButtonRecargarInformacionLineaFlujoCaja.setToolTipText("Recargar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionLineaFlujoCaja,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionLineaFlujoCaja = new JButtonMe();
		this.jButtonProcesarInformacionLineaFlujoCaja.setText("Procesar");
		this.jButtonProcesarInformacionLineaFlujoCaja.setToolTipText("Procesar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionLineaFlujoCaja.setVisible(false);
			
		this.jButtonProcesarInformacionLineaFlujoCaja.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLineaFlujoCaja.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLineaFlujoCaja.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLineaFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesLineaFlujoCaja.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLineaFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposReportesLineaFlujoCaja.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLineaFlujoCaja.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesLineaFlujoCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionLineaFlujoCaja.setText("Paginacion");
		this.jComboBoxTiposPaginacionLineaFlujoCaja.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesLineaFlujoCaja.setText("Accion");
		this.jComboBoxTiposRelacionesLineaFlujoCaja.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLineaFlujoCaja.setText("Accion");
		this.jComboBoxTiposAccionesLineaFlujoCaja.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarLineaFlujoCaja.setText("Accion");
		this.jComboBoxTiposSeleccionarLineaFlujoCaja.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralLineaFlujoCaja=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralLineaFlujoCaja.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLineaFlujoCaja.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLineaFlujoCaja.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesLineaFlujoCaja = new JLabelMe();
		
		this.jLabelAccionesLineaFlujoCaja.setText("Acciones");		
		this.jLabelAccionesLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosLineaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosLineaFlujoCaja.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosLineaFlujoCaja.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosLineaFlujoCaja = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosLineaFlujoCaja.setText("Seleccionados");
		this.jCheckBoxSeleccionadosLineaFlujoCaja.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaLineaFlujoCaja = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaLineaFlujoCaja.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaLineaFlujoCaja.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteLineaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteLineaFlujoCaja.setText("Graf.");
		this.jCheckBoxConGraficoReporteLineaFlujoCaja.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresLineaFlujoCaja = new JButtonMe();
		//this.jButtonAnterioresLineaFlujoCaja.setText("<<");
        this.jButtonAnterioresLineaFlujoCaja.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresLineaFlujoCaja,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesLineaFlujoCaja = new JButtonMe();
		//this.jButtonSiguientesLineaFlujoCaja.setText(">>");
        this.jButtonSiguientesLineaFlujoCaja.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesLineaFlujoCaja,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosLineaFlujoCaja = new JButtonMe();
		this.jButtonNuevoGuardarCambiosLineaFlujoCaja.setText("Nue");
        this.jButtonNuevoGuardarCambiosLineaFlujoCaja.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosLineaFlujoCaja,"nuevoguardarcambios_button","Nue",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosLineaFlujoCaja";
		inputMap = this.jButtonNuevoGuardarCambiosLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosLineaFlujoCaja"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionLineaFlujoCaja";
		inputMap = this.jButtonRecargarInformacionLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionLineaFlujoCaja"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesLineaFlujoCaja";
		inputMap = this.jButtonSiguientesLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesLineaFlujoCaja"));
		
		//ANTERIORES		
		sMapKey = "AnterioresLineaFlujoCaja";
		inputMap = this.jButtonAnterioresLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresLineaFlujoCaja"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasLineaFlujoCaja();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesLineaFlujoCaja.setMinimumSize(new Dimension(this.getWidth(),LineaFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LineaFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLineaFlujoCaja.setMaximumSize(new Dimension(this.getWidth(),LineaFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LineaFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLineaFlujoCaja.setPreferredSize(new Dimension(this.getWidth(),LineaFlujoCajaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LineaFlujoCajaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionLineaFlujoCaja = new GridBagLayout();

			this.jPanelPaginacionLineaFlujoCaja.setLayout(gridaBagLayoutPaginacionLineaFlujoCaja);						
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
			this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionLineaFlujoCaja.add(this.jButtonAnterioresLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
					
						
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
			
			this.jPanelPaginacionLineaFlujoCaja.add(this.jButtonNuevoGuardarCambiosLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
						
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
			this.jPanelPaginacionLineaFlujoCaja.add(this.jButtonSiguientesLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.gridy = 1;
			this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLineaFlujoCaja.add(this.jButtonNuevoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
						
			
			
			if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsLineaFlujoCaja.gridy = 1;
				this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionLineaFlujoCaja.add(this.jButtonGuardarCambiosTablaLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
			}
			
			
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.gridy = 1;
			this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLineaFlujoCaja.add(this.jButtonDuplicarLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.gridy = 1;
			this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLineaFlujoCaja.add(this.jButtonCopiarLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.gridy = 1;
			this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLineaFlujoCaja.add(this.jButtonVerFormLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.gridy = 1;
			this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionLineaFlujoCaja.add(this.jButtonCerrarLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		
		
		
		this.jButtonRecargarInformacionLineaFlujoCaja.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLineaFlujoCaja.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLineaFlujoCaja.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesLineaFlujoCaja.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLineaFlujoCaja.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLineaFlujoCaja.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesLineaFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLineaFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLineaFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesLineaFlujoCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLineaFlujoCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLineaFlujoCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionLineaFlujoCaja.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLineaFlujoCaja.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLineaFlujoCaja.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesLineaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLineaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLineaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesLineaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLineaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLineaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarLineaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLineaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLineaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaLineaFlujoCaja.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLineaFlujoCaja.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLineaFlujoCaja.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteLineaFlujoCaja.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLineaFlujoCaja.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLineaFlujoCaja.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosLineaFlujoCaja.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLineaFlujoCaja.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLineaFlujoCaja.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosLineaFlujoCaja.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLineaFlujoCaja.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLineaFlujoCaja.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesLineaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesLineaFlujoCaja = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1LineaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2LineaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3LineaFlujoCaja = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4LineaFlujoCaja = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesLineaFlujoCaja.setLayout(gridaBagParametrosReportesLineaFlujoCaja);
			this.jPanelParametrosReportesAccionesLineaFlujoCaja.setLayout(gridaBagParametrosReportesAccionesLineaFlujoCaja);
			
			
			this.jPanelParametrosAuxiliar1LineaFlujoCaja.setLayout(gridaBagParametrosAuxiliar1LineaFlujoCaja);
			this.jPanelParametrosAuxiliar2LineaFlujoCaja.setLayout(gridaBagParametrosAuxiliar2LineaFlujoCaja);
			this.jPanelParametrosAuxiliar3LineaFlujoCaja.setLayout(gridaBagParametrosAuxiliar3LineaFlujoCaja);
			this.jPanelParametrosAuxiliar4LineaFlujoCaja.setLayout(gridaBagParametrosAuxiliar4LineaFlujoCaja);
			//this.jPanelParametrosAuxiliar5LineaFlujoCaja.setLayout(gridaBagParametrosAuxiliar2LineaFlujoCaja);			
			
			
			
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLineaFlujoCaja.add(this.jButtonRecargarInformacionLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LineaFlujoCaja.add(this.jComboBoxTiposPaginacionLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LineaFlujoCaja.add(this.jCheckBoxConAltoMaximoTablaLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LineaFlujoCaja.add(this.jComboBoxTiposArchivosReportesLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLineaFlujoCaja.add(this.jPanelParametrosAuxiliar1LineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLineaFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4LineaFlujoCaja.add(this.jComboBoxTiposReportesLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLineaFlujoCaja.add(this.jPanelParametrosAuxiliar4LineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLineaFlujoCaja.add(this.jComboBoxTiposReportesLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLineaFlujoCaja.add(this.jCheckBoxGenerarReporteLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLineaFlujoCaja.add(this.jPanelParametrosAuxiliar2LineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLineaFlujoCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLineaFlujoCaja.add(this.jLabelAccionesLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsLineaFlujoCaja.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesLineaFlujoCaja.add(this.jButtonAbrirOrderByLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLineaFlujoCaja.add(this.jComboBoxTiposSeleccionarLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);			
			
			
			/*
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLineaFlujoCaja.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLineaFlujoCaja.add(this.jCheckBoxSeleccionarTodosLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLineaFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LineaFlujoCaja.add(this.jCheckBoxSeleccionarTodosLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);															
				
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLineaFlujoCaja.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LineaFlujoCaja.add(this.jCheckBoxSeleccionadosLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLineaFlujoCaja.add(this.jPanelParametrosAuxiliar3LineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLineaFlujoCaja.add(this.jComboBoxTiposAccionesLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
	
				
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLineaFlujoCaja.add(this.jTextFieldValorCampoGeneralLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosLineaFlujoCaja = new GridBagLayout();

			this.jScrollPanelDatosLineaFlujoCaja.setLayout(gridaBagLayoutDatosLineaFlujoCaja);
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
			this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
			
			this.jScrollPanelDatosLineaFlujoCaja.add(this.jTableDatosLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosLineaFlujoCaja.setViewportView(this.jTableDatosLineaFlujoCaja);
		this.jTableDatosLineaFlujoCaja.setFillsViewportHeight(true);
		this.jTableDatosLineaFlujoCaja.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesLineaFlujoCaja= new GridBagLayout();
		this.jPanelAccionesLineaFlujoCaja.setLayout(gridaBagLayoutAccionesLineaFlujoCaja);
		
		
		/*	
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
			
		this.jPanelAccionesLineaFlujoCaja.add(this.jButtonNuevoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoLineaFlujoCaja= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoLineaFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoLineaFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoLineaFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoLineaFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoLineaFlujoCaja.setLayout(gridaBagLayoutBusquedaPorCodigoLineaFlujoCaja);

		gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaFlujoCaja.gridy = 0;
		gridBagConstraintsLineaFlujoCaja.gridx = 0;
		jPanelBusquedaPorCodigoLineaFlujoCaja.add(jLabelcodigoBusquedaPorCodigoLineaFlujoCaja, gridBagConstraintsLineaFlujoCaja);

		gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaFlujoCaja.gridy = 0;
		gridBagConstraintsLineaFlujoCaja.gridx = 1;
		jPanelBusquedaPorCodigoLineaFlujoCaja.add(jTextFieldcodigoBusquedaPorCodigoLineaFlujoCaja, gridBagConstraintsLineaFlujoCaja);

		gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaFlujoCaja.gridy = 1;
		gridBagConstraintsLineaFlujoCaja.gridx =1;
		jPanelBusquedaPorCodigoLineaFlujoCaja.add(jButtonBusquedaPorCodigoLineaFlujoCaja, gridBagConstraintsLineaFlujoCaja);

		jTabbedPaneBusquedasLineaFlujoCaja.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoLineaFlujoCaja);
		jTabbedPaneBusquedasLineaFlujoCaja.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreLineaFlujoCaja= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreLineaFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreLineaFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreLineaFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreLineaFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreLineaFlujoCaja.setLayout(gridaBagLayoutBusquedaPorNombreLineaFlujoCaja);

		gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaFlujoCaja.gridy = 0;
		gridBagConstraintsLineaFlujoCaja.gridx = 0;
		jPanelBusquedaPorNombreLineaFlujoCaja.add(jLabelnombreBusquedaPorNombreLineaFlujoCaja, gridBagConstraintsLineaFlujoCaja);

		gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaFlujoCaja.gridy = 0;
		gridBagConstraintsLineaFlujoCaja.gridx = 1;
		jPanelBusquedaPorNombreLineaFlujoCaja.add(jTextAreanombreBusquedaPorNombreLineaFlujoCaja, gridBagConstraintsLineaFlujoCaja);

		gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaFlujoCaja.gridy = 1;
		gridBagConstraintsLineaFlujoCaja.gridx =1;
		jPanelBusquedaPorNombreLineaFlujoCaja.add(jButtonBusquedaPorNombreLineaFlujoCaja, gridBagConstraintsLineaFlujoCaja);

		jTabbedPaneBusquedasLineaFlujoCaja.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreLineaFlujoCaja);
		jTabbedPaneBusquedasLineaFlujoCaja.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoGrupoFlujoCajaLineaFlujoCaja= new GridBagLayout();
		gridaBagLayoutFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setLayout(gridaBagLayoutFK_IdTipoGrupoFlujoCajaLineaFlujoCaja);

		gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaFlujoCaja.gridy = 0;
		gridBagConstraintsLineaFlujoCaja.gridx = 0;
		jPanelFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.add(jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja, gridBagConstraintsLineaFlujoCaja);

		gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaFlujoCaja.gridy = 0;
		gridBagConstraintsLineaFlujoCaja.gridx = 1;
		jPanelFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.add(jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja, gridBagConstraintsLineaFlujoCaja);

		gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaFlujoCaja.gridy = 1;
		gridBagConstraintsLineaFlujoCaja.gridx =1;
		jPanelFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.add(jButtonFK_IdTipoGrupoFlujoCajaLineaFlujoCaja, gridBagConstraintsLineaFlujoCaja);

		jTabbedPaneBusquedasLineaFlujoCaja.addTab("3.-Por Tipo Grupo Flujo Caja ", jPanelFK_IdTipoGrupoFlujoCajaLineaFlujoCaja);
		jTabbedPaneBusquedasLineaFlujoCaja.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoLineaFlujoCajaLineaFlujoCaja= new GridBagLayout();
		gridaBagLayoutFK_IdTipoLineaFlujoCajaLineaFlujoCaja.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoLineaFlujoCajaLineaFlujoCaja.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoLineaFlujoCajaLineaFlujoCaja.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoLineaFlujoCajaLineaFlujoCaja.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setLayout(gridaBagLayoutFK_IdTipoLineaFlujoCajaLineaFlujoCaja);

		gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaFlujoCaja.gridy = 0;
		gridBagConstraintsLineaFlujoCaja.gridx = 0;
		jPanelFK_IdTipoLineaFlujoCajaLineaFlujoCaja.add(jLabelid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja, gridBagConstraintsLineaFlujoCaja);

		gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaFlujoCaja.gridy = 0;
		gridBagConstraintsLineaFlujoCaja.gridx = 1;
		jPanelFK_IdTipoLineaFlujoCajaLineaFlujoCaja.add(jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja, gridBagConstraintsLineaFlujoCaja);

		gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaFlujoCaja.gridy = 1;
		gridBagConstraintsLineaFlujoCaja.gridx =1;
		jPanelFK_IdTipoLineaFlujoCajaLineaFlujoCaja.add(jButtonFK_IdTipoLineaFlujoCajaLineaFlujoCaja, gridBagConstraintsLineaFlujoCaja);

		jTabbedPaneBusquedasLineaFlujoCaja.addTab("4.-Por Tipo Linea Flujo Caja ", jPanelFK_IdTipoLineaFlujoCajaLineaFlujoCaja);
		jTabbedPaneBusquedasLineaFlujoCaja.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLineaFlujoCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLineaFlujoCaja);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();						
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLineaFlujoCaja.gridx = 0;		
			//this.gridBagConstraintsLineaFlujoCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLineaFlujoCaja.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyPrincipal++;
		this.gridBagConstraintsLineaFlujoCaja.gridx = 0;		
		//this.gridBagConstraintsLineaFlujoCaja.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsLineaFlujoCaja.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsLineaFlujoCaja);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLineaFlujoCaja.gridx = 0;		
			this.gridBagConstraintsLineaFlujoCaja.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsLineaFlujoCaja.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);								
		
		
		/*
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		*/		
		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLineaFlujoCaja.gridx =0;
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLineaFlujoCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
				
		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(LineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosLineaFlujoCaja= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLineaFlujoCaja = new GridBagLayout();
			this.jPanelBusquedasParametrosLineaFlujoCaja.setLayout(gridaBagLayoutBusquedasParametrosLineaFlujoCaja);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralLineaFlujoCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLineaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLineaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLineaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
			
			
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		
			
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLineaFlujoCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralLineaFlujoCaja;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoLineaFlujoCaja() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoLineaFlujoCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoLineaFlujoCaja.setName("jPanelReporteDinamicoLineaFlujoCaja"); 
		
		this.jPanelReporteDinamicoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoLineaFlujoCaja.setLayout(gridaBagLayoutReporteDinamicoLineaFlujoCaja);
		
		
		this.jInternalFrameReporteDinamicoLineaFlujoCaja= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoLineaFlujoCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLineaFlujoCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoLineaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoLineaFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoLineaFlujoCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoLineaFlujoCaja.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoLineaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoLineaFlujoCaja.setResizable(true);
	    this.jInternalFrameReporteDinamicoLineaFlujoCaja.setClosable(true);
	    this.jInternalFrameReporteDinamicoLineaFlujoCaja.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea Flujo Cajas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteLineaFlujoCaja = new JLabelMe();

		this.jLabelColumnasSelectReporteLineaFlujoCaja.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLineaFlujoCaja.add(this.jLabelColumnasSelectReporteLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteLineaFlujoCaja = new JList<Reporte>();
		this.jListColumnasSelectReporteLineaFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteLineaFlujoCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteLineaFlujoCaja.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLineaFlujoCaja.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLineaFlujoCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteLineaFlujoCaja=new JScrollPane(this.jListColumnasSelectReporteLineaFlujoCaja);
			
			this.jScrollColumnasSelectReporteLineaFlujoCaja.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLineaFlujoCaja.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLineaFlujoCaja.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoLineaFlujoCaja.add(this.jListColumnasSelectReporteLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		this.jPanelReporteDinamicoLineaFlujoCaja.add(this.jScrollColumnasSelectReporteLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteLineaFlujoCaja = new JLabelMe();

		this.jLabelRelacionesSelectReporteLineaFlujoCaja.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteLineaFlujoCaja = new JList<Reporte>();
		this.jListRelacionesSelectReporteLineaFlujoCaja.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteLineaFlujoCaja.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteLineaFlujoCaja.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLineaFlujoCaja.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLineaFlujoCaja.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteLineaFlujoCaja=new JScrollPane(this.jListRelacionesSelectReporteLineaFlujoCaja);
			
			this.jScrollRelacionesSelectReporteLineaFlujoCaja.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLineaFlujoCaja.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLineaFlujoCaja.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoLineaFlujoCaja = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoLineaFlujoCaja = new JComboBoxMe();
		this.jListColumnasValoresGraficoLineaFlujoCaja = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoLineaFlujoCaja = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoLineaFlujoCaja.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoLineaFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLineaFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLineaFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoLineaFlujoCaja = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoLineaFlujoCaja.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoLineaFlujoCaja.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLineaFlujoCaja.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLineaFlujoCaja.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoLineaFlujoCaja = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoLineaFlujoCaja.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLineaFlujoCaja.add(this.jLabelGenerarExcelReporteDinamicoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoLineaFlujoCaja = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoLineaFlujoCaja.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoLineaFlujoCaja,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoLineaFlujoCaja.setToolTipText("Generar EXCEL"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoLineaFlujoCaja.add(this.jButtonGenerarExcelReporteDinamicoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLineaFlujoCaja.add(this.jComboBoxTiposReportesDinamicoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoLineaFlujoCaja = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoLineaFlujoCaja.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLineaFlujoCaja.add(this.jLabelTiposArchivoReporteDinamicoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLineaFlujoCaja.add(this.jComboBoxTiposArchivosReportesDinamicoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoLineaFlujoCaja = new JButtonMe();
		this.jButtonGenerarReporteDinamicoLineaFlujoCaja.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoLineaFlujoCaja,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoLineaFlujoCaja.setToolTipText("Generar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLineaFlujoCaja.add(this.jButtonGenerarReporteDinamicoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoLineaFlujoCaja = new JButtonMe();
		this.jButtonCerrarReporteDinamicoLineaFlujoCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoLineaFlujoCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoLineaFlujoCaja.setToolTipText("Cancelar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLineaFlujoCaja.add(this.jButtonCerrarReporteDinamicoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalLineaFlujoCaja = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoLineaFlujoCaja= new JScrollPane(jPanelReporteDinamicoLineaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea Flujo Cajas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsLineaFlujoCaja.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoLineaFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoLineaFlujoCaja.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalLineaFlujoCaja);
		this.jInternalFrameReporteDinamicoLineaFlujoCaja.getContentPane().add(this.jScrollPanelReporteDinamicoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionLineaFlujoCaja() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionLineaFlujoCaja = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionLineaFlujoCaja.setName("jPanelImportacionLineaFlujoCaja"); 
		
		this.jPanelImportacionLineaFlujoCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLineaFlujoCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLineaFlujoCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionLineaFlujoCaja.setLayout(gridaBagLayoutImportacionLineaFlujoCaja);
		
		
		this.jInternalFrameImportacionLineaFlujoCaja= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionLineaFlujoCaja= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionLineaFlujoCaja = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLineaFlujoCaja= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionLineaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLineaFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLineaFlujoCaja.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionLineaFlujoCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLineaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLineaFlujoCaja.setResizable(true);
	    this.jInternalFrameImportacionLineaFlujoCaja.setClosable(true);
	    this.jInternalFrameImportacionLineaFlujoCaja.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionLineaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLineaFlujoCaja.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLineaFlujoCaja.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionLineaFlujoCaja.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLineaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLineaFlujoCaja.setResizable(true);
	    this.jInternalFrameImportacionLineaFlujoCaja.setClosable(true);
	    this.jInternalFrameImportacionLineaFlujoCaja.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionLineaFlujoCaja.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLineaFlujoCaja.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLineaFlujoCaja.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea Flujo Cajas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionLineaFlujoCaja = new JLabelMe();

		this.jLabelArchivoImportacionLineaFlujoCaja.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLineaFlujoCaja.add(this.jLabelArchivoImportacionLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionLineaFlujoCaja = new JFileChooser();		
		this.jFileChooserImportacionLineaFlujoCaja.setToolTipText("ESCOGER ARCHIVO"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionLineaFlujoCaja = new JButtonMe();
		this.jButtonAbrirImportacionLineaFlujoCaja.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionLineaFlujoCaja,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionLineaFlujoCaja.setToolTipText("Generar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLineaFlujoCaja.add(this.jButtonAbrirImportacionLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionLineaFlujoCaja = new JLabelMe();

		this.jLabelPathArchivoImportacionLineaFlujoCaja.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYImportacion;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLineaFlujoCaja.add(this.jLabelPathArchivoImportacionLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionLineaFlujoCaja=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionLineaFlujoCaja.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLineaFlujoCaja.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLineaFlujoCaja.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLineaFlujoCaja.add(this.jTextFieldPathArchivoImportacionLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionLineaFlujoCaja = new JButtonMe();
		this.jButtonGenerarImportacionLineaFlujoCaja.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionLineaFlujoCaja,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionLineaFlujoCaja.setToolTipText("Generar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLineaFlujoCaja.add(this.jButtonGenerarImportacionLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionLineaFlujoCaja = new JButtonMe();
		this.jButtonCerrarImportacionLineaFlujoCaja.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionLineaFlujoCaja,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionLineaFlujoCaja.setToolTipText("Cancelar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYImportacion;
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLineaFlujoCaja.add(this.jButtonCerrarImportacionLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalLineaFlujoCaja = new GridBagLayout();
		
		this.jScrollPanelImportacionLineaFlujoCaja= new JScrollPane(jPanelImportacionLineaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy =iPosYImportacion;
		this.gridBagConstraintsLineaFlujoCaja.gridx =iPosXImportacion;
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionLineaFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionLineaFlujoCaja.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalLineaFlujoCaja);
		this.jInternalFrameImportacionLineaFlujoCaja.getContentPane().add(this.jScrollPanelImportacionLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByLineaFlujoCaja(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByLineaFlujoCaja = new JButtonMe();
			this.jButtonAbrirOrderByLineaFlujoCaja.setText("Orden");
			this.jButtonAbrirOrderByLineaFlujoCaja.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLineaFlujoCaja,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByLineaFlujoCaja";
			inputMap = this.jButtonAbrirOrderByLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByLineaFlujoCaja"));
		
		
			GridBagLayout gridaBagLayoutOrderByLineaFlujoCaja = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByLineaFlujoCaja.setName("jPanelOrderByLineaFlujoCaja"); 
			
			this.jPanelOrderByLineaFlujoCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLineaFlujoCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLineaFlujoCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByLineaFlujoCaja.setLayout(gridaBagLayoutOrderByLineaFlujoCaja);
			
			
			this.jTableDatosLineaFlujoCajaOrderBy = new JTableMe();        
			this.jTableDatosLineaFlujoCajaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosLineaFlujoCajaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosLineaFlujoCajaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosLineaFlujoCajaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosLineaFlujoCajaOrderBy.setViewportView(this.jTableDatosLineaFlujoCajaOrderBy);
			this.jTableDatosLineaFlujoCajaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosLineaFlujoCajaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByLineaFlujoCaja= new OrderByJInternalFrame();
			this.jInternalFrameOrderByLineaFlujoCaja= new OrderByJInternalFrame();
			this.jScrollPanelOrderByLineaFlujoCaja = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteLineaFlujoCaja= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByLineaFlujoCaja.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByLineaFlujoCaja.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByLineaFlujoCaja.setTitle("Orden");
			this.jInternalFrameOrderByLineaFlujoCaja.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByLineaFlujoCaja.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByLineaFlujoCaja.setResizable(true);
			this.jInternalFrameOrderByLineaFlujoCaja.setClosable(true);
			this.jInternalFrameOrderByLineaFlujoCaja.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByLineaFlujoCaja.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLineaFlujoCaja.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLineaFlujoCaja.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea Flujo Cajas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.gridy =iPosYOrderBy++;
			this.gridBagConstraintsLineaFlujoCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsLineaFlujoCaja.ipady =150;
				
			this.jPanelOrderByLineaFlujoCaja.add(jScrollPanelDatosLineaFlujoCajaOrderBy, this.gridBagConstraintsLineaFlujoCaja);//this.jTableDatosLineaFlujoCajaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByLineaFlujoCaja = new JButtonMe();
			this.jButtonCerrarOrderByLineaFlujoCaja.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByLineaFlujoCaja,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByLineaFlujoCaja.setToolTipText("Cancelar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.gridy = iPosYOrderBy++;
			this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXOrderBy;
									
			this.jPanelOrderByLineaFlujoCaja.add(this.jButtonCerrarOrderByLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalLineaFlujoCaja = new GridBagLayout();
			
			this.jScrollPanelOrderByLineaFlujoCaja= new JScrollPane(jPanelOrderByLineaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.gridy =iPosYOrderBy;
			this.gridBagConstraintsLineaFlujoCaja.gridx =iPosXOrderBy;
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByLineaFlujoCaja.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByLineaFlujoCaja.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalLineaFlujoCaja);
			
			this.jInternalFrameOrderByLineaFlujoCaja.getContentPane().add(this.jScrollPanelOrderByLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);			
		
		} else {
			this.jButtonAbrirOrderByLineaFlujoCaja = new JButtonMe();
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
		int iWidthTableCalculado=0;//1630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.lineaflujocajaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosLineaFlujoCaja.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosLineaFlujoCaja.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosLineaFlujoCaja.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosLineaFlujoCaja.getRowHeight();//LineaFlujoCajaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > LineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLineaFlujoCaja.isSelected()) {
					iHeightTable=LineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > LineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLineaFlujoCaja.isSelected()) {
					iHeightTable=LineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LineaFlujoCajaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosLineaFlujoCaja.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLineaFlujoCaja.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLineaFlujoCaja.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosLineaFlujoCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLineaFlujoCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLineaFlujoCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByLineaFlujoCaja!=null && this.jInternalFrameOrderByLineaFlujoCaja.getjTableDatosOrderBy()!=null) {
			//if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByLineaFlujoCaja.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByLineaFlujoCaja.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByLineaFlujoCaja.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByLineaFlujoCaja.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByLineaFlujoCaja.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByLineaFlujoCaja.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByLineaFlujoCaja.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosLineaFlujoCaja.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLineaFlujoCaja.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLineaFlujoCaja.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=lineaflujocajaLogic.getLineaFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=lineaflujocajas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<LineaFlujoCaja> TraerLineaFlujoCajaBeans(List<LineaFlujoCaja> lineaflujocajas,ArrayList<Classe> classes)throws Exception {
		try {
			for(LineaFlujoCaja lineaflujocaja:lineaflujocajas) {
					
				if(!(LineaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || LineaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					lineaflujocaja.setsDetalleGeneralEntityReporte(LineaFlujoCajaConstantesFunciones.getLineaFlujoCajaDescripcion(lineaflujocaja));
										
					lineaflujocaja.setes_consolidado_descripcion(LineaFlujoCajaConstantesFunciones.getes_consolidadoDescripcion(lineaflujocaja));lineaflujocaja.setesta_proyeccion_descripcion(LineaFlujoCajaConstantesFunciones.getesta_proyeccionDescripcion(lineaflujocaja));	
					
						
					
				} else  {
							
					//lineaflujocaja.setsDetalleGeneralEntityReporte(lineaflujocaja.getsDetalleGeneralEntityReporte());
										
				}
				
				//lineaflujocajabeans.add(lineaflujocajabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return lineaflujocajas;
    }
	//PARA REPORTES FIN
}
