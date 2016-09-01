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
import com.bydan.erp.contabilidad.util.SubGrupoParametroFormularioIvaConstantesFunciones;

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
public class SubGrupoParametroFormularioIvaJInternalFrame extends SubGrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSubGrupoParametroFormularioIva;
	
	protected JMenuBar jmenuBarSubGrupoParametroFormularioIva;
	
	protected JMenu jmenuSubGrupoParametroFormularioIva;
	protected JMenu jmenuDatosSubGrupoParametroFormularioIva;
	protected JMenu jmenuArchivoSubGrupoParametroFormularioIva;
	protected JMenu jmenuAccionesSubGrupoParametroFormularioIva;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSubGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSubGrupoParametroFormularioIva;	
	protected GridBagConstraints gridBagConstraintsSubGrupoParametroFormularioIva;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SubGrupoParametroFormularioIvaDetalleFormJInternalFrame jInternalFrameDetalleFormSubGrupoParametroFormularioIva;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSubGrupoParametroFormularioIva;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public SubGrupoParametroFormularioIvaSessionBean subgrupoparametroformularioivaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivas;		
	public List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasEliminados;	
	public List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySubGrupoParametroFormularioIva;		
	protected JButton jButtonAbrirOrderBySubGrupoParametroFormularioIva;
	
	
	//protected JPanel jPanelOrderBySubGrupoParametroFormularioIva;
	//public JScrollPane jScrollPanelOrderBySubGrupoParametroFormularioIva;	
	//protected JButton jButtonCerrarOrderBySubGrupoParametroFormularioIva;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SubGrupoParametroFormularioIvaLogic subgrupoparametroformularioivaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSubGrupoParametroFormularioIva;
	public JScrollPane jScrollPanelDatosEdicionSubGrupoParametroFormularioIva;
	public JScrollPane jScrollPanelDatosGeneralSubGrupoParametroFormularioIva;
    
	
	
	//public JScrollPane jScrollPanelDatosSubGrupoParametroFormularioIvaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSubGrupoParametroFormularioIva;
	//public JScrollPane jScrollPanelImportacionSubGrupoParametroFormularioIva;
	
	
	
	protected JPanel jPanelAccionesSubGrupoParametroFormularioIva;
	
    protected JPanel jPanelPaginacionSubGrupoParametroFormularioIva;
    protected JPanel jPanelParametrosReportesSubGrupoParametroFormularioIva;
	protected JPanel jPanelParametrosReportesAccionesSubGrupoParametroFormularioIva;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SubGrupoParametroFormularioIva;
	protected JPanel jPanelParametrosAuxiliar2SubGrupoParametroFormularioIva;
	protected JPanel jPanelParametrosAuxiliar3SubGrupoParametroFormularioIva;
	protected JPanel jPanelParametrosAuxiliar4SubGrupoParametroFormularioIva;
	//protected JPanel jPanelParametrosAuxiliar5SubGrupoParametroFormularioIva;
	
	
	
	//protected JPanel jPanelReporteDinamicoSubGrupoParametroFormularioIva;
	//protected JPanel jPanelImportacionSubGrupoParametroFormularioIva;
	
	
	public JTable jTableDatosSubGrupoParametroFormularioIva;
	
	
	
	//public JTable jTableDatosSubGrupoParametroFormularioIvaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSubGrupoParametroFormularioIva;
	protected JButton jButtonDuplicarSubGrupoParametroFormularioIva;
	protected JButton jButtonCopiarSubGrupoParametroFormularioIva;
	protected JButton jButtonVerFormSubGrupoParametroFormularioIva;
	protected JButton jButtonNuevoRelacionesSubGrupoParametroFormularioIva;
	protected JButton jButtonModificarSubGrupoParametroFormularioIva;
	
    protected JButton jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva;
	protected JButton jButtonCerrarSubGrupoParametroFormularioIva;
	
	
	protected JButton jButtonRecargarInformacionSubGrupoParametroFormularioIva;
	protected JButton jButtonProcesarInformacionSubGrupoParametroFormularioIva;
	
	
	protected JButton jButtonAnterioresSubGrupoParametroFormularioIva;
	protected JButton jButtonSiguientesSubGrupoParametroFormularioIva;
	protected JButton jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIva;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSubGrupoParametroFormularioIva;
	//protected JButton jButtonCerrarReporteDinamicoSubGrupoParametroFormularioIva;
	//protected JButton jButtonGenerarExcelReporteDinamicoSubGrupoParametroFormularioIva;	
	
	
	
	//protected JButton jButtonAbrirImportacionSubGrupoParametroFormularioIva;
	//protected JButton jButtonGenerarImportacionSubGrupoParametroFormularioIva;
	//protected JButton jButtonCerrarImportacionSubGrupoParametroFormularioIva;
	//protected JFileChooser jFileChooserImportacionSubGrupoParametroFormularioIva;
	//protected File fileImportacionSubGrupoParametroFormularioIva;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonDuplicarToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonNuevoRelacionesToolBarSubGrupoParametroFormularioIva;
	
	
	public JButton jButtonGuardarCambiosToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonCopiarToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonVerFormToolBarSubGrupoParametroFormularioIva;
	public JButton jButtonGuardarCambiosTablaToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonMostrarOcultarTablaToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonCerrarToolBarSubGrupoParametroFormularioIva;
	
	protected JButton jButtonRecargarInformacionToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonProcesarInformacionToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonAnterioresToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonSiguientesToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonNuevoGuardarCambiosToolBarSubGrupoParametroFormularioIva;
	protected JButton jButtonAbrirOrderByToolBarSubGrupoParametroFormularioIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemDuplicarSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemNuevoRelacionesSubGrupoParametroFormularioIva;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemCopiarSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemVerFormSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemCerrarSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleCerrarSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarSubGrupoParametroFormularioIva;
	
	protected JMenuItem jMenuItemRecargarInformacionSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemProcesarInformacionSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemAnterioresSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemSiguientesSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemAbrirOrderBySubGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemMostrarOcultarSubGrupoParametroFormularioIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSubGrupoParametroFormularioIva;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva;
	protected JCheckBox jCheckBoxSeleccionadosSubGrupoParametroFormularioIva;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSubGrupoParametroFormularioIva;
	protected JCheckBox jCheckBoxConGraficoReporteSubGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSubGrupoParametroFormularioIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSubGrupoParametroFormularioIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSubGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSubGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSubGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSubGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva;
	protected JTextField jTextFieldValorCampoGeneralSubGrupoParametroFormularioIva;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSubGrupoParametroFormularioIva;
	//public JList<Reporte> jListColumnasSelectReporteSubGrupoParametroFormularioIva;
	//public JScrollPane jScrollColumnasSelectReporteSubGrupoParametroFormularioIva;
	
	//public JLabel jLabelRelacionesSelectReporteSubGrupoParametroFormularioIva;
	//public JList<Reporte> jListRelacionesSelectReporteSubGrupoParametroFormularioIva;
	//public JScrollPane jScrollRelacionesSelectReporteSubGrupoParametroFormularioIva;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSubGrupoParametroFormularioIva;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSubGrupoParametroFormularioIva;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSubGrupoParametroFormularioIva;
	//public JLabel jLabelTiposArchivoReporteDinamicoSubGrupoParametroFormularioIva;
	
		
	//public JLabel jLabelArchivoImportacionSubGrupoParametroFormularioIva;	
	//public JLabel jLabelPathArchivoImportacionSubGrupoParametroFormularioIva;
	//protected JTextField jTextFieldPathArchivoImportacionSubGrupoParametroFormularioIva;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSubGrupoParametroFormularioIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSubGrupoParametroFormularioIva;
	
	//public JLabel jLabelColumnaCategoriaValorSubGrupoParametroFormularioIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSubGrupoParametroFormularioIva;
	
	//public JLabel jLabelColumnasValoresGraficoSubGrupoParametroFormularioIva;
	//public JList<Reporte> jListColumnasValoresGraficoSubGrupoParametroFormularioIva;
	//public JScrollPane jScrollColumnasValoresGraficoSubGrupoParametroFormularioIva;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSubGrupoParametroFormularioIva;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSubGrupoParametroFormularioIva;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSubGrupoParametroFormularioIva;
	public JPanel jPanelBusquedaPorIdSubGrupoParametroFormularioIva;
	public JButton jButtonBusquedaPorIdSubGrupoParametroFormularioIva;
	public JPanel jPanelBusquedaPorNombreSubGrupoParametroFormularioIva;
	public JButton jButtonBusquedaPorNombreSubGrupoParametroFormularioIva;
	
	public JPanel jPanelIdIdBusquedaPorIdSubGrupoParametroFormularioIva;
	public JLabel jLabelidBusquedaPorIdSubGrupoParametroFormularioIva;
	public JTextFieldMe jLabelidSubGrupoParametroFormularioIvaBusquedaPorId;
	public JButton jButtonidBusquedaPorIdSubGrupoParametroFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreSubGrupoParametroFormularioIva;
	public JLabel jLabelnombreBusquedaPorNombreSubGrupoParametroFormularioIva;
	public JTextArea jTextAreanombreBusquedaPorNombreSubGrupoParametroFormularioIva;
	public JButton jButtonnombreBusquedaPorNombreSubGrupoParametroFormularioIvaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SubGrupoParametroFormularioIvaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SubGrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubGrupoParametroFormularioIvaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubGrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubGrupoParametroFormularioIvaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubGrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubGrupoParametroFormularioIvaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SubGrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSubGrupoParametroFormularioIva)	{
		this.jButtonRecargarInformacionSubGrupoParametroFormularioIva = jButtonRecargarInformacionSubGrupoParametroFormularioIva;
	}
	
	public JButton getjButtonProcesarInformacionSubGrupoParametroFormularioIva() {
		return this.jButtonProcesarInformacionSubGrupoParametroFormularioIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSubGrupoParametroFormularioIva)	{
		this.jButtonProcesarInformacionSubGrupoParametroFormularioIva = jButtonProcesarInformacionSubGrupoParametroFormularioIva;
	}
	
	
	public JButton getjButtonRecargarInformacionSubGrupoParametroFormularioIva() {
		return this.jButtonRecargarInformacionSubGrupoParametroFormularioIva;
	}
	
	
	public List<SubGrupoParametroFormularioIva> getsubgrupoparametroformularioivas() {
		return this.subgrupoparametroformularioivas;
	}

	public void setsubgrupoparametroformularioivas(List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivas) {
		this.subgrupoparametroformularioivas = subgrupoparametroformularioivas;
	}
	
	public List<SubGrupoParametroFormularioIva> getsubgrupoparametroformularioivasAux() {
		return this.subgrupoparametroformularioivasAux;
	}

	public void setsubgrupoparametroformularioivasAux(List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasAux) {
		this.subgrupoparametroformularioivasAux = subgrupoparametroformularioivasAux;
	}
	
	public List<SubGrupoParametroFormularioIva> getsubgrupoparametroformularioivasEliminados() {
		return this.subgrupoparametroformularioivasEliminados;
	}

	public void setSubGrupoParametroFormularioIvasEliminados(List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivasEliminados) {
		this.subgrupoparametroformularioivasEliminados = subgrupoparametroformularioivasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSubGrupoParametroFormularioIva() {
		return jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSubGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva) {
		this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva = jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposSeleccionarSubGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSubGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSubGrupoParametroFormularioIva() {
		return jTextFieldValorCampoGeneralSubGrupoParametroFormularioIva;
	}

	public void setjTextFieldValorCampoGeneralSubGrupoParametroFormularioIva(
			JTextField jTextFieldValorCampoGeneralSubGrupoParametroFormularioIva) {
		this.jTextFieldValorCampoGeneralSubGrupoParametroFormularioIva = jTextFieldValorCampoGeneralSubGrupoParametroFormularioIva;
	}

	public void setBorderResaltarValorCampoGeneralSubGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSubGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva() {
		return this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva;
	}

	public void setjCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva(
			JCheckBox jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva) {
		this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva = jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva;
	}

	public void setBorderResaltarSeleccionarTodosSubGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSubGrupoParametroFormularioIva() {
		return this.jCheckBoxSeleccionadosSubGrupoParametroFormularioIva;
	}

	public void setjCheckBoxSeleccionadosSubGrupoParametroFormularioIva(
			JCheckBox jCheckBoxSeleccionadosSubGrupoParametroFormularioIva) {
		this.jCheckBoxSeleccionadosSubGrupoParametroFormularioIva = jCheckBoxSeleccionadosSubGrupoParametroFormularioIva;
	}
	
	public void setBorderResaltarSeleccionadosSubGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSubGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva() {
		return this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva) {
		this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva = jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva;
	}

	public void setBorderResaltarTiposArchivosReportesSubGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSubGrupoParametroFormularioIva() {
		return this.jComboBoxTiposReportesSubGrupoParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSubGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposReportesSubGrupoParametroFormularioIva) {
		this.jComboBoxTiposReportesSubGrupoParametroFormularioIva = jComboBoxTiposReportesSubGrupoParametroFormularioIva;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSubGrupoParametroFormularioIva() {
	//	return jComboBoxTiposReportesDinamicoSubGrupoParametroFormularioIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSubGrupoParametroFormularioIva(
	//		JComboBox jComboBoxTiposReportesDinamicoSubGrupoParametroFormularioIva) {
	//	this.jComboBoxTiposReportesDinamicoSubGrupoParametroFormularioIva = jComboBoxTiposReportesDinamicoSubGrupoParametroFormularioIva;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSubGrupoParametroFormularioIva() {
	//	return jComboBoxTiposArchivosReportesDinamicoSubGrupoParametroFormularioIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSubGrupoParametroFormularioIva(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSubGrupoParametroFormularioIva) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSubGrupoParametroFormularioIva = jComboBoxTiposArchivosReportesDinamicoSubGrupoParametroFormularioIva;
	//}
	
	public void setBorderResaltarTiposReportesSubGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSubGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva() {
		return this.jComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva) {
		this.jComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva = jComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposGraficosReportesSubGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSubGrupoParametroFormularioIva() {
		return this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSubGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposPaginacionSubGrupoParametroFormularioIva) {
		this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva = jComboBoxTiposPaginacionSubGrupoParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposPaginacionSubGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSubGrupoParametroFormularioIva() {
		return this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSubGrupoParametroFormularioIva() {
		return this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSubGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposRelacionesSubGrupoParametroFormularioIva) {
		this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva = jComboBoxTiposRelacionesSubGrupoParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSubGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposAccionesSubGrupoParametroFormularioIva) {
		this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva = jComboBoxTiposAccionesSubGrupoParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposRelacionesSubGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSubGrupoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSubGrupoParametroFormularioIva() {
	//	return jCheckBoxConGraficoDinamicoSubGrupoParametroFormularioIva;
	//}

	//public void setjCheckBoxConGraficoDinamicoSubGrupoParametroFormularioIva(
	//		JCheckBox jCheckBoxConGraficoDinamicoSubGrupoParametroFormularioIva) {
	//	this.jCheckBoxConGraficoDinamicoSubGrupoParametroFormularioIva = jCheckBoxConGraficoDinamicoSubGrupoParametroFormularioIva;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSubGrupoParametroFormularioIva() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSubGrupoParametroFormularioIva.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSubGrupoParametroFormularioIva .setBorder(borderResaltar);		
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
		this.subgrupoparametroformularioivaSessionBean=new SubGrupoParametroFormularioIvaSessionBean();
		
		this.subgrupoparametroformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.subgrupoparametroformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SubGrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SubGrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SubGrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SubGrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SubGrupoParametroFormularioIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sub Grupo Parametro Formulario Iva  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
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
		
		SubGrupoParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SubGrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSubGrupoParametroFormularioIva= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSubGrupoParametroFormularioIva,this.jTtoolBarSubGrupoParametroFormularioIva,
							"nuevo","nuevo","Nuevo"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSubGrupoParametroFormularioIva,this.jTtoolBarSubGrupoParametroFormularioIva,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSubGrupoParametroFormularioIva,this.jTtoolBarSubGrupoParametroFormularioIva,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSubGrupoParametroFormularioIva,this.jTtoolBarSubGrupoParametroFormularioIva,
							"duplicar","duplicar","Duplicar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSubGrupoParametroFormularioIva,this.jTtoolBarSubGrupoParametroFormularioIva,
							"copiar","copiar","Copiar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSubGrupoParametroFormularioIva,this.jTtoolBarSubGrupoParametroFormularioIva,
							"ver_form","ver_form","Ver"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSubGrupoParametroFormularioIva,this.jTtoolBarSubGrupoParametroFormularioIva,
							"recargar","recargar","Recargar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSubGrupoParametroFormularioIva,this.jTtoolBarSubGrupoParametroFormularioIva,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSubGrupoParametroFormularioIva,this.jTtoolBarSubGrupoParametroFormularioIva,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSubGrupoParametroFormularioIva,this.jTtoolBarSubGrupoParametroFormularioIva,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSubGrupoParametroFormularioIva,this.jTtoolBarSubGrupoParametroFormularioIva,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSubGrupoParametroFormularioIva,this.jTtoolBarSubGrupoParametroFormularioIva,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSubGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSubGrupoParametroFormularioIva,this.jTtoolBarSubGrupoParametroFormularioIva,
							"cerrar","cerrar","Salir"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSubGrupoParametroFormularioIva=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSubGrupoParametroFormularioIva;
			
				this.jButtonProcesarInformacionToolBarSubGrupoParametroFormularioIva=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSubGrupoParametroFormularioIva;
				
		//protected JButton jButtonModificarToolBarSubGrupoParametroFormularioIva;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSubGrupoParametroFormularioIva=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSubGrupoParametroFormularioIva=new JMenuMe("General");
		this.jmenuArchivoSubGrupoParametroFormularioIva=new JMenuMe("Archivo");
		this.jmenuAccionesSubGrupoParametroFormularioIva=new JMenuMe("Acciones");
		this.jmenuDatosSubGrupoParametroFormularioIva=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSubGrupoParametroFormularioIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSubGrupoParametroFormularioIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSubGrupoParametroFormularioIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSubGrupoParametroFormularioIva= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSubGrupoParametroFormularioIva.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSubGrupoParametroFormularioIva,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSubGrupoParametroFormularioIva= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSubGrupoParametroFormularioIva.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSubGrupoParametroFormularioIva,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSubGrupoParametroFormularioIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSubGrupoParametroFormularioIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSubGrupoParametroFormularioIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSubGrupoParametroFormularioIva= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSubGrupoParametroFormularioIva.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSubGrupoParametroFormularioIva,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSubGrupoParametroFormularioIva= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSubGrupoParametroFormularioIva.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSubGrupoParametroFormularioIva,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSubGrupoParametroFormularioIva= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSubGrupoParametroFormularioIva.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSubGrupoParametroFormularioIva,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSubGrupoParametroFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSubGrupoParametroFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSubGrupoParametroFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSubGrupoParametroFormularioIva= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSubGrupoParametroFormularioIva.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSubGrupoParametroFormularioIva,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSubGrupoParametroFormularioIva= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSubGrupoParametroFormularioIva.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSubGrupoParametroFormularioIva,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSubGrupoParametroFormularioIva= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSubGrupoParametroFormularioIva.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSubGrupoParametroFormularioIva,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSubGrupoParametroFormularioIva= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSubGrupoParametroFormularioIva.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSubGrupoParametroFormularioIva,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySubGrupoParametroFormularioIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySubGrupoParametroFormularioIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySubGrupoParametroFormularioIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSubGrupoParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSubGrupoParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSubGrupoParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySubGrupoParametroFormularioIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySubGrupoParametroFormularioIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySubGrupoParametroFormularioIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSubGrupoParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSubGrupoParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSubGrupoParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSubGrupoParametroFormularioIva= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSubGrupoParametroFormularioIva.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSubGrupoParametroFormularioIva,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSubGrupoParametroFormularioIva.add(this.jMenuItemCerrarSubGrupoParametroFormularioIva);
			
			this.jmenuAccionesSubGrupoParametroFormularioIva.add(this.jMenuItemNuevoSubGrupoParametroFormularioIva);
			this.jmenuAccionesSubGrupoParametroFormularioIva.add(this.jMenuItemNuevoGuardarCambiosSubGrupoParametroFormularioIva);
			this.jmenuAccionesSubGrupoParametroFormularioIva.add(this.jMenuItemNuevoRelacionesSubGrupoParametroFormularioIva);
			this.jmenuAccionesSubGrupoParametroFormularioIva.add(this.jMenuItemGuardarCambiosTablaSubGrupoParametroFormularioIva);		
			this.jmenuAccionesSubGrupoParametroFormularioIva.add(this.jMenuItemDuplicarSubGrupoParametroFormularioIva);		
			this.jmenuAccionesSubGrupoParametroFormularioIva.add(this.jMenuItemCopiarSubGrupoParametroFormularioIva);		
			this.jmenuAccionesSubGrupoParametroFormularioIva.add(this.jMenuItemVerFormSubGrupoParametroFormularioIva);		
			
			this.jmenuDatosSubGrupoParametroFormularioIva.add(this.jMenuItemRecargarInformacionSubGrupoParametroFormularioIva);				
			this.jmenuDatosSubGrupoParametroFormularioIva.add(this.jMenuItemAnterioresSubGrupoParametroFormularioIva);				
			this.jmenuDatosSubGrupoParametroFormularioIva.add(this.jMenuItemSiguientesSubGrupoParametroFormularioIva);				
			this.jmenuDatosSubGrupoParametroFormularioIva.add(this.jMenuItemAbrirOrderBySubGrupoParametroFormularioIva);				
			this.jmenuDatosSubGrupoParametroFormularioIva.add(this.jMenuItemMostrarOcultarSubGrupoParametroFormularioIva);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSubGrupoParametroFormularioIva.add(this.jMenuItemGuardarCambiosSubGrupoParametroFormularioIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSubGrupoParametroFormularioIva.add(this.jmenuArchivoSubGrupoParametroFormularioIva);		
			this.jmenuBarSubGrupoParametroFormularioIva.add(this.jmenuAccionesSubGrupoParametroFormularioIva);		
			this.jmenuBarSubGrupoParametroFormularioIva.add(this.jmenuDatosSubGrupoParametroFormularioIva);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSubGrupoParametroFormularioIva);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSubGrupoParametroFormularioIva() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdSubGrupoParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdSubGrupoParametroFormularioIva.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaPorIdSubGrupoParametroFormularioIva= new JButtonMe();
		this.jButtonBusquedaPorIdSubGrupoParametroFormularioIva.setText("Buscar");
		this.jButtonBusquedaPorIdSubGrupoParametroFormularioIva.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdSubGrupoParametroFormularioIva,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaPorIdSubGrupoParametroFormularioIva = new JLabelMe();
		jLabelidBusquedaPorIdSubGrupoParametroFormularioIva.setText("Id :");
		jLabelidBusquedaPorIdSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaPorIdSubGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidSubGrupoParametroFormularioIvaBusquedaPorId= new JTextFieldMe();
		jLabelidSubGrupoParametroFormularioIvaBusquedaPorId.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSubGrupoParametroFormularioIvaBusquedaPorId.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSubGrupoParametroFormularioIvaBusquedaPorId.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



		this.jPanelBusquedaPorNombreSubGrupoParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreSubGrupoParametroFormularioIva.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreSubGrupoParametroFormularioIva= new JButtonMe();
		this.jButtonBusquedaPorNombreSubGrupoParametroFormularioIva.setText("Buscar");
		this.jButtonBusquedaPorNombreSubGrupoParametroFormularioIva.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreSubGrupoParametroFormularioIva,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreSubGrupoParametroFormularioIva = new JLabelMe();
		jLabelnombreBusquedaPorNombreSubGrupoParametroFormularioIva.setText("Nombre :");
		jLabelnombreBusquedaPorNombreSubGrupoParametroFormularioIva.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreSubGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreSubGrupoParametroFormularioIva= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreSubGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva=new JTabbedPane();


		this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSubGrupoParametroFormularioIva = new SubGrupoParametroFormularioIvaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sub Grupo Parametro Formulario Iva  DATOS");
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva = new SubGrupoParametroFormularioIvaDetalleFormJInternalFrame(jDesktopPane,this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones(),this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSubGrupoParametroFormularioIva = null;//new SubGrupoParametroFormularioIvaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSubGrupoParametroFormularioIva= new GridBagLayout();
		
		
		this.jTableDatosSubGrupoParametroFormularioIva = new JTableMe();      
		
		String sToolTipSubGrupoParametroFormularioIva="";
		sToolTipSubGrupoParametroFormularioIva=SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSubGrupoParametroFormularioIva+="(Contabilidad.SubGrupoParametroFormularioIva)";
		}
		
		if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipSubGrupoParametroFormularioIva+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSubGrupoParametroFormularioIva.setToolTipText(sToolTipSubGrupoParametroFormularioIva);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSubGrupoParametroFormularioIva);
		this.jTableDatosSubGrupoParametroFormularioIva.setAutoCreateRowSorter(true);
		this.jTableDatosSubGrupoParametroFormularioIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSubGrupoParametroFormularioIva.setRowSelectionAllowed(true);
		this.jTableDatosSubGrupoParametroFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSubGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonDuplicarSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonCopiarSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonVerFormSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarSubGrupoParametroFormularioIva = new JButtonMe();
		
		this.jScrollPanelDatosSubGrupoParametroFormularioIva = new JScrollPane();   
        this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSubGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Sub Grupo Parametro Formulario Iva ";
		
		if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Grupo Parametro Formulario Iva s" + this.sPath));
		} else {
			this.jScrollPanelDatosSubGrupoParametroFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSubGrupoParametroFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesSubGrupoParametroFormularioIva.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva=new ReporteDinamicoJInternalFrame(SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSubGrupoParametroFormularioIva();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSubGrupoParametroFormularioIva=new ImportacionJInternalFrame(SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSubGrupoParametroFormularioIva();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySubGrupoParametroFormularioIva = new JButtonMe();
		
		this.jButtonAbrirOrderBySubGrupoParametroFormularioIva.setText("Orden");
		this.jButtonAbrirOrderBySubGrupoParametroFormularioIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySubGrupoParametroFormularioIva,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySubGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySubGrupoParametroFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubGrupoParametroFormularioIva,false,this);
			
			//this.cargarOrderBySubGrupoParametroFormularioIva(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySubGrupoParametroFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubGrupoParametroFormularioIva,true,this);
			
			//this.cargarOrderBySubGrupoParametroFormularioIva(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSubGrupoParametroFormularioIva.setText("Nuevo");
		this.jButtonDuplicarSubGrupoParametroFormularioIva.setText("Duplicar");
		this.jButtonCopiarSubGrupoParametroFormularioIva.setText("Copiar");
		this.jButtonVerFormSubGrupoParametroFormularioIva.setText("Ver");
		this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva.setText("Guardar");
		this.jButtonCerrarSubGrupoParametroFormularioIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSubGrupoParametroFormularioIva,"nuevo_button","Nuevo",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSubGrupoParametroFormularioIva,"duplicar_button","Duplicar",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSubGrupoParametroFormularioIva,"copiar_button","Copiar",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSubGrupoParametroFormularioIva,"ver_form","Ver",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva,"nuevorelaciones_button","Nuevo Rel",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva,"guardarcambiostabla_button","Guardar",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSubGrupoParametroFormularioIva,"cerrar_button","Salir",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSubGrupoParametroFormularioIva.setToolTipText("Nuevo"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSubGrupoParametroFormularioIva.setToolTipText("Duplicar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSubGrupoParametroFormularioIva.setToolTipText("Copiar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSubGrupoParametroFormularioIva.setToolTipText("Ver"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva.setToolTipText("Nuevo Rel"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva.setToolTipText("Guardar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSubGrupoParametroFormularioIva.setToolTipText("Salir"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSubGrupoParametroFormularioIva";
		inputMap = this.jButtonNuevoSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSubGrupoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSubGrupoParametroFormularioIva"));
		
		//DUPLICAR
		sMapKey = "DuplicarSubGrupoParametroFormularioIva";
		inputMap = this.jButtonDuplicarSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSubGrupoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSubGrupoParametroFormularioIva"));
		
		//COPIAR
		sMapKey = "CopiarSubGrupoParametroFormularioIva";
		inputMap = this.jButtonCopiarSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSubGrupoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSubGrupoParametroFormularioIva"));
		
		//VEr FORM
		sMapKey = "VerFormSubGrupoParametroFormularioIva";
		inputMap = this.jButtonVerFormSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSubGrupoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSubGrupoParametroFormularioIva"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSubGrupoParametroFormularioIva";
		inputMap = this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSubGrupoParametroFormularioIva"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSubGrupoParametroFormularioIva";
		inputMap = this.jButtonModificarSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSubGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSubGrupoParametroFormularioIva"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSubGrupoParametroFormularioIva";
		inputMap = this.jButtonCerrarSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSubGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSubGrupoParametroFormularioIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSubGrupoParametroFormularioIva";
		inputMap = this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSubGrupoParametroFormularioIva"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSubGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSubGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSubGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SubGrupoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SubGrupoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SubGrupoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SubGrupoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SubGrupoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSubGrupoParametroFormularioIva.setName("jPanelParametrosReportesSubGrupoParametroFormularioIva"); 
		
		this.jPanelParametrosReportesAccionesSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSubGrupoParametroFormularioIva.setName("jPanelParametrosReportesAccionesSubGrupoParametroFormularioIva"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonRecargarInformacionSubGrupoParametroFormularioIva.setText("Recargar");
		this.jButtonRecargarInformacionSubGrupoParametroFormularioIva.setToolTipText("Recargar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSubGrupoParametroFormularioIva,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonProcesarInformacionSubGrupoParametroFormularioIva.setText("Procesar");
		this.jButtonProcesarInformacionSubGrupoParametroFormularioIva.setToolTipText("Procesar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSubGrupoParametroFormularioIva.setVisible(false);
			
		this.jButtonProcesarInformacionSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSubGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva.setText("TIPO");       
		this.jComboBoxTiposReportesSubGrupoParametroFormularioIva.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva.setText("Paginacion");
		this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSubGrupoParametroFormularioIva=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSubGrupoParametroFormularioIva = new JLabelMe();
		
		this.jLabelAccionesSubGrupoParametroFormularioIva.setText("Acciones");		
		this.jLabelAccionesSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSubGrupoParametroFormularioIva = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSubGrupoParametroFormularioIva.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSubGrupoParametroFormularioIva.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSubGrupoParametroFormularioIva = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSubGrupoParametroFormularioIva.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSubGrupoParametroFormularioIva.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSubGrupoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSubGrupoParametroFormularioIva.setText("Graf.");
		this.jCheckBoxConGraficoReporteSubGrupoParametroFormularioIva.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSubGrupoParametroFormularioIva = new JButtonMe();
		//this.jButtonAnterioresSubGrupoParametroFormularioIva.setText("<<");
        this.jButtonAnterioresSubGrupoParametroFormularioIva.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSubGrupoParametroFormularioIva,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSubGrupoParametroFormularioIva = new JButtonMe();
		//this.jButtonSiguientesSubGrupoParametroFormularioIva.setText(">>");
        this.jButtonSiguientesSubGrupoParametroFormularioIva.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSubGrupoParametroFormularioIva,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIva.setText("Nue");
        this.jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIva.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIva,"nuevoguardarcambios_button","Nue",this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSubGrupoParametroFormularioIva";
		inputMap = this.jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSubGrupoParametroFormularioIva"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSubGrupoParametroFormularioIva";
		inputMap = this.jButtonRecargarInformacionSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSubGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSubGrupoParametroFormularioIva"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSubGrupoParametroFormularioIva";
		inputMap = this.jButtonSiguientesSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSubGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSubGrupoParametroFormularioIva"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSubGrupoParametroFormularioIva";
		inputMap = this.jButtonAnterioresSubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSubGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSubGrupoParametroFormularioIva"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSubGrupoParametroFormularioIva();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(this.getWidth(),SubGrupoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SubGrupoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(this.getWidth(),SubGrupoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SubGrupoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(this.getWidth(),SubGrupoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SubGrupoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSubGrupoParametroFormularioIva = new GridBagLayout();

			this.jPanelPaginacionSubGrupoParametroFormularioIva.setLayout(gridaBagLayoutPaginacionSubGrupoParametroFormularioIva);						
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSubGrupoParametroFormularioIva.add(this.jButtonAnterioresSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
					
						
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
			
			this.jPanelPaginacionSubGrupoParametroFormularioIva.add(this.jButtonNuevoGuardarCambiosSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
						
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
			this.jPanelPaginacionSubGrupoParametroFormularioIva.add(this.jButtonSiguientesSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubGrupoParametroFormularioIva.add(this.jButtonNuevoSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 1;
				this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionSubGrupoParametroFormularioIva.add(this.jButtonNuevoRelacionesSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
			}
			
			
			if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 1;
				this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSubGrupoParametroFormularioIva.add(this.jButtonGuardarCambiosTablaSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
			}
			
			
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubGrupoParametroFormularioIva.add(this.jButtonDuplicarSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubGrupoParametroFormularioIva.add(this.jButtonCopiarSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubGrupoParametroFormularioIva.add(this.jButtonVerFormSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSubGrupoParametroFormularioIva.add(this.jButtonCerrarSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		
		
		
		this.jButtonRecargarInformacionSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSubGrupoParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSubGrupoParametroFormularioIva = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SubGrupoParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SubGrupoParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SubGrupoParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SubGrupoParametroFormularioIva = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSubGrupoParametroFormularioIva.setLayout(gridaBagParametrosReportesSubGrupoParametroFormularioIva);
			this.jPanelParametrosReportesAccionesSubGrupoParametroFormularioIva.setLayout(gridaBagParametrosReportesAccionesSubGrupoParametroFormularioIva);
			
			
			this.jPanelParametrosAuxiliar1SubGrupoParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar1SubGrupoParametroFormularioIva);
			this.jPanelParametrosAuxiliar2SubGrupoParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar2SubGrupoParametroFormularioIva);
			this.jPanelParametrosAuxiliar3SubGrupoParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar3SubGrupoParametroFormularioIva);
			this.jPanelParametrosAuxiliar4SubGrupoParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar4SubGrupoParametroFormularioIva);
			//this.jPanelParametrosAuxiliar5SubGrupoParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar2SubGrupoParametroFormularioIva);			
			
			
			
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubGrupoParametroFormularioIva.add(this.jButtonRecargarInformacionSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SubGrupoParametroFormularioIva.add(this.jComboBoxTiposPaginacionSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SubGrupoParametroFormularioIva.add(this.jCheckBoxConAltoMaximoTablaSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SubGrupoParametroFormularioIva.add(this.jComboBoxTiposArchivosReportesSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubGrupoParametroFormularioIva.add(this.jPanelParametrosAuxiliar1SubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SubGrupoParametroFormularioIva.add(this.jComboBoxTiposReportesSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubGrupoParametroFormularioIva.add(this.jPanelParametrosAuxiliar4SubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubGrupoParametroFormularioIva.add(this.jComboBoxTiposReportesSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubGrupoParametroFormularioIva.add(this.jCheckBoxGenerarReporteSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubGrupoParametroFormularioIva.add(this.jPanelParametrosAuxiliar2SubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubGrupoParametroFormularioIva.add(this.jLabelAccionesSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSubGrupoParametroFormularioIva.add(this.jButtonAbrirOrderBySubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubGrupoParametroFormularioIva.add(this.jComboBoxTiposSeleccionarSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);			
			
			
			/*
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubGrupoParametroFormularioIva.add(this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SubGrupoParametroFormularioIva.add(this.jCheckBoxSeleccionarTodosSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);															
				
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SubGrupoParametroFormularioIva.add(this.jCheckBoxSeleccionadosSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubGrupoParametroFormularioIva.add(this.jPanelParametrosAuxiliar3SubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubGrupoParametroFormularioIva.add(this.jComboBoxTiposRelacionesSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
				
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubGrupoParametroFormularioIva.add(this.jComboBoxTiposAccionesSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSubGrupoParametroFormularioIva = new GridBagLayout();

			this.jScrollPanelDatosSubGrupoParametroFormularioIva.setLayout(gridaBagLayoutDatosSubGrupoParametroFormularioIva);
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
			
			this.jScrollPanelDatosSubGrupoParametroFormularioIva.add(this.jTableDatosSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSubGrupoParametroFormularioIva.setViewportView(this.jTableDatosSubGrupoParametroFormularioIva);
		this.jTableDatosSubGrupoParametroFormularioIva.setFillsViewportHeight(true);
		this.jTableDatosSubGrupoParametroFormularioIva.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSubGrupoParametroFormularioIva= new GridBagLayout();
		this.jPanelAccionesSubGrupoParametroFormularioIva.setLayout(gridaBagLayoutAccionesSubGrupoParametroFormularioIva);
		
		
		/*	
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
			
		this.jPanelAccionesSubGrupoParametroFormularioIva.add(this.jButtonNuevoSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdSubGrupoParametroFormularioIva= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdSubGrupoParametroFormularioIva.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdSubGrupoParametroFormularioIva.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdSubGrupoParametroFormularioIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdSubGrupoParametroFormularioIva.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdSubGrupoParametroFormularioIva.setLayout(gridaBagLayoutBusquedaPorIdSubGrupoParametroFormularioIva);

		gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
		gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
		jPanelBusquedaPorIdSubGrupoParametroFormularioIva.add(jLabelidBusquedaPorIdSubGrupoParametroFormularioIva, gridBagConstraintsSubGrupoParametroFormularioIva);

		gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
		gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 1;
		jPanelBusquedaPorIdSubGrupoParametroFormularioIva.add(jLabelidSubGrupoParametroFormularioIvaBusquedaPorId, gridBagConstraintsSubGrupoParametroFormularioIva);

		gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 1;
		gridBagConstraintsSubGrupoParametroFormularioIva.gridx =1;
		jPanelBusquedaPorIdSubGrupoParametroFormularioIva.add(jButtonBusquedaPorIdSubGrupoParametroFormularioIva, gridBagConstraintsSubGrupoParametroFormularioIva);

		jTabbedPaneBusquedasSubGrupoParametroFormularioIva.addTab("1.-Por Id ", jPanelBusquedaPorIdSubGrupoParametroFormularioIva);
		jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreSubGrupoParametroFormularioIva= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreSubGrupoParametroFormularioIva.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreSubGrupoParametroFormularioIva.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreSubGrupoParametroFormularioIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreSubGrupoParametroFormularioIva.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreSubGrupoParametroFormularioIva.setLayout(gridaBagLayoutBusquedaPorNombreSubGrupoParametroFormularioIva);

		gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
		gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
		jPanelBusquedaPorNombreSubGrupoParametroFormularioIva.add(jLabelnombreBusquedaPorNombreSubGrupoParametroFormularioIva, gridBagConstraintsSubGrupoParametroFormularioIva);

		gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 0;
		gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 1;
		jPanelBusquedaPorNombreSubGrupoParametroFormularioIva.add(jTextAreanombreBusquedaPorNombreSubGrupoParametroFormularioIva, gridBagConstraintsSubGrupoParametroFormularioIva);

		gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSubGrupoParametroFormularioIva.gridy = 1;
		gridBagConstraintsSubGrupoParametroFormularioIva.gridx =1;
		jPanelBusquedaPorNombreSubGrupoParametroFormularioIva.add(jButtonBusquedaPorNombreSubGrupoParametroFormularioIva, gridBagConstraintsSubGrupoParametroFormularioIva);

		jTabbedPaneBusquedasSubGrupoParametroFormularioIva.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreSubGrupoParametroFormularioIva);
		jTabbedPaneBusquedasSubGrupoParametroFormularioIva.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSubGrupoParametroFormularioIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSubGrupoParametroFormularioIva);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();						
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;		
			//this.gridBagConstraintsSubGrupoParametroFormularioIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;		
		//this.gridBagConstraintsSubGrupoParametroFormularioIva.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;		
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);								
		
		
		/*
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		*/		
		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx =0;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSubGrupoParametroFormularioIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
				
		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(SubGrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSubGrupoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSubGrupoParametroFormularioIva = new GridBagLayout();
			this.jPanelBusquedasParametrosSubGrupoParametroFormularioIva.setLayout(gridaBagLayoutBusquedasParametrosSubGrupoParametroFormularioIva);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
			
			
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		
			
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSubGrupoParametroFormularioIva;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSubGrupoParametroFormularioIva() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSubGrupoParametroFormularioIva = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.setName("jPanelReporteDinamicoSubGrupoParametroFormularioIva"); 
		
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.setLayout(gridaBagLayoutReporteDinamicoSubGrupoParametroFormularioIva);
		
		
		this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSubGrupoParametroFormularioIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSubGrupoParametroFormularioIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setResizable(true);
	    this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setClosable(true);
	    this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Grupo Parametro Formulario Iva s"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSubGrupoParametroFormularioIva = new JLabelMe();

		this.jLabelColumnasSelectReporteSubGrupoParametroFormularioIva.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.add(this.jLabelColumnasSelectReporteSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSubGrupoParametroFormularioIva = new JList<Reporte>();
		this.jListColumnasSelectReporteSubGrupoParametroFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSubGrupoParametroFormularioIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSubGrupoParametroFormularioIva=new JScrollPane(this.jListColumnasSelectReporteSubGrupoParametroFormularioIva);
			
			this.jScrollColumnasSelectReporteSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.add(this.jListColumnasSelectReporteSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.add(this.jScrollColumnasSelectReporteSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSubGrupoParametroFormularioIva = new JLabelMe();

		this.jLabelRelacionesSelectReporteSubGrupoParametroFormularioIva.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.add(this.jLabelRelacionesSelectReporteSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSubGrupoParametroFormularioIva = new JList<Reporte>();
		this.jListRelacionesSelectReporteSubGrupoParametroFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSubGrupoParametroFormularioIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSubGrupoParametroFormularioIva=new JScrollPane(this.jListRelacionesSelectReporteSubGrupoParametroFormularioIva);
			
			this.jScrollRelacionesSelectReporteSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.add(this.jListRelacionesSelectReporteSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.add(this.jScrollRelacionesSelectReporteSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoSubGrupoParametroFormularioIva = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSubGrupoParametroFormularioIva = new JComboBoxMe();
		this.jListColumnasValoresGraficoSubGrupoParametroFormularioIva = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSubGrupoParametroFormularioIva = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSubGrupoParametroFormularioIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSubGrupoParametroFormularioIva = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSubGrupoParametroFormularioIva.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSubGrupoParametroFormularioIva = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSubGrupoParametroFormularioIva.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.add(this.jLabelGenerarExcelReporteDinamicoSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSubGrupoParametroFormularioIva.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSubGrupoParametroFormularioIva,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSubGrupoParametroFormularioIva.setToolTipText("Generar EXCEL"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.add(this.jButtonGenerarExcelReporteDinamicoSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.add(this.jComboBoxTiposReportesDinamicoSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSubGrupoParametroFormularioIva = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSubGrupoParametroFormularioIva.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.add(this.jLabelTiposArchivoReporteDinamicoSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.add(this.jComboBoxTiposArchivosReportesDinamicoSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSubGrupoParametroFormularioIva.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSubGrupoParametroFormularioIva,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSubGrupoParametroFormularioIva.setToolTipText("Generar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.add(this.jButtonGenerarReporteDinamicoSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSubGrupoParametroFormularioIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSubGrupoParametroFormularioIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSubGrupoParametroFormularioIva.setToolTipText("Cancelar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubGrupoParametroFormularioIva.add(this.jButtonCerrarReporteDinamicoSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSubGrupoParametroFormularioIva = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSubGrupoParametroFormularioIva= new JScrollPane(jPanelReporteDinamicoSubGrupoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Grupo Parametro Formulario Iva s"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSubGrupoParametroFormularioIva);
		this.jInternalFrameReporteDinamicoSubGrupoParametroFormularioIva.getContentPane().add(this.jScrollPanelReporteDinamicoSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSubGrupoParametroFormularioIva() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSubGrupoParametroFormularioIva = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSubGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSubGrupoParametroFormularioIva.setName("jPanelImportacionSubGrupoParametroFormularioIva"); 
		
		this.jPanelImportacionSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSubGrupoParametroFormularioIva.setLayout(gridaBagLayoutImportacionSubGrupoParametroFormularioIva);
		
		
		this.jInternalFrameImportacionSubGrupoParametroFormularioIva= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSubGrupoParametroFormularioIva= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSubGrupoParametroFormularioIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSubGrupoParametroFormularioIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setResizable(true);
	    this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setClosable(true);
	    this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setResizable(true);
	    this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setClosable(true);
	    this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Grupo Parametro Formulario Iva s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSubGrupoParametroFormularioIva = new JLabelMe();

		this.jLabelArchivoImportacionSubGrupoParametroFormularioIva.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSubGrupoParametroFormularioIva.add(this.jLabelArchivoImportacionSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSubGrupoParametroFormularioIva = new JFileChooser();		
		this.jFileChooserImportacionSubGrupoParametroFormularioIva.setToolTipText("ESCOGER ARCHIVO"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonAbrirImportacionSubGrupoParametroFormularioIva.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSubGrupoParametroFormularioIva,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSubGrupoParametroFormularioIva.setToolTipText("Generar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubGrupoParametroFormularioIva.add(this.jButtonAbrirImportacionSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSubGrupoParametroFormularioIva = new JLabelMe();

		this.jLabelPathArchivoImportacionSubGrupoParametroFormularioIva.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSubGrupoParametroFormularioIva.add(this.jLabelPathArchivoImportacionSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSubGrupoParametroFormularioIva=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubGrupoParametroFormularioIva.add(this.jTextFieldPathArchivoImportacionSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonGenerarImportacionSubGrupoParametroFormularioIva.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSubGrupoParametroFormularioIva,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSubGrupoParametroFormularioIva.setToolTipText("Generar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubGrupoParametroFormularioIva.add(this.jButtonGenerarImportacionSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSubGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarImportacionSubGrupoParametroFormularioIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSubGrupoParametroFormularioIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSubGrupoParametroFormularioIva.setToolTipText("Cancelar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubGrupoParametroFormularioIva.add(this.jButtonCerrarImportacionSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSubGrupoParametroFormularioIva = new GridBagLayout();
		
		this.jScrollPanelImportacionSubGrupoParametroFormularioIva= new JScrollPane(jPanelImportacionSubGrupoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy =iPosYImportacion;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx =iPosXImportacion;
		this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSubGrupoParametroFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSubGrupoParametroFormularioIva.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSubGrupoParametroFormularioIva);
		this.jInternalFrameImportacionSubGrupoParametroFormularioIva.getContentPane().add(this.jScrollPanelImportacionSubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySubGrupoParametroFormularioIva(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySubGrupoParametroFormularioIva = new JButtonMe();
			this.jButtonAbrirOrderBySubGrupoParametroFormularioIva.setText("Orden");
			this.jButtonAbrirOrderBySubGrupoParametroFormularioIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySubGrupoParametroFormularioIva,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySubGrupoParametroFormularioIva";
			inputMap = this.jButtonAbrirOrderBySubGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySubGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySubGrupoParametroFormularioIva"));
		
		
			GridBagLayout gridaBagLayoutOrderBySubGrupoParametroFormularioIva = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySubGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySubGrupoParametroFormularioIva.setName("jPanelOrderBySubGrupoParametroFormularioIva"); 
			
			this.jPanelOrderBySubGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySubGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySubGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySubGrupoParametroFormularioIva.setLayout(gridaBagLayoutOrderBySubGrupoParametroFormularioIva);
			
			
			this.jTableDatosSubGrupoParametroFormularioIvaOrderBy = new JTableMe();        
			this.jTableDatosSubGrupoParametroFormularioIvaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSubGrupoParametroFormularioIvaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSubGrupoParametroFormularioIvaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSubGrupoParametroFormularioIvaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSubGrupoParametroFormularioIvaOrderBy.setViewportView(this.jTableDatosSubGrupoParametroFormularioIvaOrderBy);
			this.jTableDatosSubGrupoParametroFormularioIvaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSubGrupoParametroFormularioIvaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySubGrupoParametroFormularioIva = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSubGrupoParametroFormularioIva= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setTitle("Orden");
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setResizable(true);
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setClosable(true);
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySubGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySubGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySubGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySubGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Grupo Parametro Formulario Iva s"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSubGrupoParametroFormularioIva.ipady =150;
				
			this.jPanelOrderBySubGrupoParametroFormularioIva.add(jScrollPanelDatosSubGrupoParametroFormularioIvaOrderBy, this.gridBagConstraintsSubGrupoParametroFormularioIva);//this.jTableDatosSubGrupoParametroFormularioIvaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySubGrupoParametroFormularioIva = new JButtonMe();
			this.jButtonCerrarOrderBySubGrupoParametroFormularioIva.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySubGrupoParametroFormularioIva,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySubGrupoParametroFormularioIva.setToolTipText("Cancelar"+" "+SubGrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySubGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySubGrupoParametroFormularioIva.add(this.jButtonCerrarOrderBySubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSubGrupoParametroFormularioIva = new GridBagLayout();
			
			this.jScrollPanelOrderBySubGrupoParametroFormularioIva= new JScrollPane(jPanelOrderBySubGrupoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSubGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridy =iPosYOrderBy;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsSubGrupoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSubGrupoParametroFormularioIva);
			
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getContentPane().add(this.jScrollPanelOrderBySubGrupoParametroFormularioIva, this.gridBagConstraintsSubGrupoParametroFormularioIva);			
		
		} else {
			this.jButtonAbrirOrderBySubGrupoParametroFormularioIva = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.subgrupoparametroformularioivaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSubGrupoParametroFormularioIva.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSubGrupoParametroFormularioIva.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSubGrupoParametroFormularioIva.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSubGrupoParametroFormularioIva.getRowHeight();//SubGrupoParametroFormularioIvaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SubGrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSubGrupoParametroFormularioIva.isSelected()) {
					iHeightTable=SubGrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SubGrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SubGrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SubGrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSubGrupoParametroFormularioIva.isSelected()) {
					iHeightTable=SubGrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SubGrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SubGrupoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySubGrupoParametroFormularioIva!=null && this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjTableDatosOrderBy()!=null) {
			//if(!this.subgrupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySubGrupoParametroFormularioIva.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSubGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSubGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSubGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=subgrupoparametroformularioivaLogic.getSubGrupoParametroFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=subgrupoparametroformularioivas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SubGrupoParametroFormularioIva> TraerSubGrupoParametroFormularioIvaBeans(List<SubGrupoParametroFormularioIva> subgrupoparametroformularioivas,ArrayList<Classe> classes)throws Exception {
		try {
			for(SubGrupoParametroFormularioIva subgrupoparametroformularioiva:subgrupoparametroformularioivas) {
					
				if(!(SubGrupoParametroFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SubGrupoParametroFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					subgrupoparametroformularioiva.setsDetalleGeneralEntityReporte(SubGrupoParametroFormularioIvaConstantesFunciones.getSubGrupoParametroFormularioIvaDescripcion(subgrupoparametroformularioiva));
										
						
					
					

					if(subgrupoparametroformularioiva.getParametroFormularioIvas()!=null && Funciones.existeClass(classes,ParametroFormularioIva.class)) {
						try{subgrupoparametroformularioiva.setparametroformularioivasDescripcionReporte(new JRBeanCollectionDataSource(ParametroFormularioIvaJInternalFrame.TraerParametroFormularioIvaBeans(subgrupoparametroformularioiva.getParametroFormularioIvas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//subgrupoparametroformularioiva.setsDetalleGeneralEntityReporte(subgrupoparametroformularioiva.getsDetalleGeneralEntityReporte());
										
				}
				
				//subgrupoparametroformularioivabeans.add(subgrupoparametroformularioivabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return subgrupoparametroformularioivas;
    }
	//PARA REPORTES FIN
}
