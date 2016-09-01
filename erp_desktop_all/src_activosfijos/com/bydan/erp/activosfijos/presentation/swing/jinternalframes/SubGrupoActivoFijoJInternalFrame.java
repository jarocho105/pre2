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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.SubGrupoActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class SubGrupoActivoFijoJInternalFrame extends SubGrupoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSubGrupoActivoFijo;
	
	protected JMenuBar jmenuBarSubGrupoActivoFijo;
	
	protected JMenu jmenuSubGrupoActivoFijo;
	protected JMenu jmenuDatosSubGrupoActivoFijo;
	protected JMenu jmenuArchivoSubGrupoActivoFijo;
	protected JMenu jmenuAccionesSubGrupoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSubGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSubGrupoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsSubGrupoActivoFijo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SubGrupoActivoFijoDetalleFormJInternalFrame jInternalFrameDetalleFormSubGrupoActivoFijo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSubGrupoActivoFijo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSubGrupoActivoFijo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected DetalleGrupoActivoFijoBeanSwingJInternalFrame detallegrupoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallegrupoactivofijo="";
	
	public SubGrupoActivoFijoSessionBean subgrupoactivofijoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public DetalleGrupoActivoFijoSessionBean detallegrupoactivofijoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SubGrupoActivoFijo> subgrupoactivofijos;		
	public List<SubGrupoActivoFijo> subgrupoactivofijosEliminados;	
	public List<SubGrupoActivoFijo> subgrupoactivofijosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySubGrupoActivoFijo;		
	protected JButton jButtonAbrirOrderBySubGrupoActivoFijo;
	
	
	//protected JPanel jPanelOrderBySubGrupoActivoFijo;
	//public JScrollPane jScrollPanelOrderBySubGrupoActivoFijo;	
	//protected JButton jButtonCerrarOrderBySubGrupoActivoFijo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SubGrupoActivoFijoLogic subgrupoactivofijoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSubGrupoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionSubGrupoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralSubGrupoActivoFijo;
    
	
	
	//public JScrollPane jScrollPanelDatosSubGrupoActivoFijoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSubGrupoActivoFijo;
	//public JScrollPane jScrollPanelImportacionSubGrupoActivoFijo;
	
	
	
	protected JPanel jPanelAccionesSubGrupoActivoFijo;
	
    protected JPanel jPanelPaginacionSubGrupoActivoFijo;
    protected JPanel jPanelParametrosReportesSubGrupoActivoFijo;
	protected JPanel jPanelParametrosReportesAccionesSubGrupoActivoFijo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SubGrupoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar2SubGrupoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar3SubGrupoActivoFijo;
	protected JPanel jPanelParametrosAuxiliar4SubGrupoActivoFijo;
	//protected JPanel jPanelParametrosAuxiliar5SubGrupoActivoFijo;
	
	
	
	//protected JPanel jPanelReporteDinamicoSubGrupoActivoFijo;
	//protected JPanel jPanelImportacionSubGrupoActivoFijo;
	
	
	public JTable jTableDatosSubGrupoActivoFijo;
	
	
	
	//public JTable jTableDatosSubGrupoActivoFijoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSubGrupoActivoFijo;
	protected JButton jButtonDuplicarSubGrupoActivoFijo;
	protected JButton jButtonCopiarSubGrupoActivoFijo;
	protected JButton jButtonVerFormSubGrupoActivoFijo;
	protected JButton jButtonNuevoRelacionesSubGrupoActivoFijo;
	protected JButton jButtonModificarSubGrupoActivoFijo;
	
    protected JButton jButtonGuardarCambiosTablaSubGrupoActivoFijo;
	protected JButton jButtonCerrarSubGrupoActivoFijo;
	
	
	protected JButton jButtonRecargarInformacionSubGrupoActivoFijo;
	protected JButton jButtonProcesarInformacionSubGrupoActivoFijo;
	
	
	protected JButton jButtonAnterioresSubGrupoActivoFijo;
	protected JButton jButtonSiguientesSubGrupoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosSubGrupoActivoFijo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSubGrupoActivoFijo;
	//protected JButton jButtonCerrarReporteDinamicoSubGrupoActivoFijo;
	//protected JButton jButtonGenerarExcelReporteDinamicoSubGrupoActivoFijo;	
	
	
	
	//protected JButton jButtonAbrirImportacionSubGrupoActivoFijo;
	//protected JButton jButtonGenerarImportacionSubGrupoActivoFijo;
	//protected JButton jButtonCerrarImportacionSubGrupoActivoFijo;
	//protected JFileChooser jFileChooserImportacionSubGrupoActivoFijo;
	//protected File fileImportacionSubGrupoActivoFijo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSubGrupoActivoFijo;
	protected JButton jButtonDuplicarToolBarSubGrupoActivoFijo;
	protected JButton jButtonNuevoRelacionesToolBarSubGrupoActivoFijo;
	
	
	public JButton jButtonGuardarCambiosToolBarSubGrupoActivoFijo;
	protected JButton jButtonCopiarToolBarSubGrupoActivoFijo;
	protected JButton jButtonVerFormToolBarSubGrupoActivoFijo;
	public JButton jButtonGuardarCambiosTablaToolBarSubGrupoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarSubGrupoActivoFijo;
	protected JButton jButtonCerrarToolBarSubGrupoActivoFijo;
	
	protected JButton jButtonRecargarInformacionToolBarSubGrupoActivoFijo;
	protected JButton jButtonProcesarInformacionToolBarSubGrupoActivoFijo;
	protected JButton jButtonAnterioresToolBarSubGrupoActivoFijo;
	protected JButton jButtonSiguientesToolBarSubGrupoActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosToolBarSubGrupoActivoFijo;
	protected JButton jButtonAbrirOrderByToolBarSubGrupoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSubGrupoActivoFijo;
	protected JMenuItem jMenuItemDuplicarSubGrupoActivoFijo;
	protected JMenuItem jMenuItemNuevoRelacionesSubGrupoActivoFijo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSubGrupoActivoFijo;
	protected JMenuItem jMenuItemCopiarSubGrupoActivoFijo;
	protected JMenuItem jMenuItemVerFormSubGrupoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaSubGrupoActivoFijo;
	protected JMenuItem jMenuItemCerrarSubGrupoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarSubGrupoActivoFijo;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySubGrupoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarSubGrupoActivoFijo;
	
	protected JMenuItem jMenuItemRecargarInformacionSubGrupoActivoFijo;
	protected JMenuItem jMenuItemProcesarInformacionSubGrupoActivoFijo;
	protected JMenuItem jMenuItemAnterioresSubGrupoActivoFijo;
	protected JMenuItem jMenuItemSiguientesSubGrupoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSubGrupoActivoFijo;
	protected JMenuItem jMenuItemAbrirOrderBySubGrupoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarSubGrupoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSubGrupoActivoFijo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSubGrupoActivoFijo;
	protected JCheckBox jCheckBoxSeleccionadosSubGrupoActivoFijo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSubGrupoActivoFijo;
	protected JCheckBox jCheckBoxConGraficoReporteSubGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSubGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSubGrupoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSubGrupoActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSubGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSubGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSubGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSubGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSubGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSubGrupoActivoFijo;
	protected JTextField jTextFieldValorCampoGeneralSubGrupoActivoFijo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSubGrupoActivoFijo;
	//public JList<Reporte> jListColumnasSelectReporteSubGrupoActivoFijo;
	//public JScrollPane jScrollColumnasSelectReporteSubGrupoActivoFijo;
	
	//public JLabel jLabelRelacionesSelectReporteSubGrupoActivoFijo;
	//public JList<Reporte> jListRelacionesSelectReporteSubGrupoActivoFijo;
	//public JScrollPane jScrollRelacionesSelectReporteSubGrupoActivoFijo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSubGrupoActivoFijo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSubGrupoActivoFijo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSubGrupoActivoFijo;
	//public JLabel jLabelTiposArchivoReporteDinamicoSubGrupoActivoFijo;
	
		
	//public JLabel jLabelArchivoImportacionSubGrupoActivoFijo;	
	//public JLabel jLabelPathArchivoImportacionSubGrupoActivoFijo;
	//protected JTextField jTextFieldPathArchivoImportacionSubGrupoActivoFijo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSubGrupoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSubGrupoActivoFijo;
	
	//public JLabel jLabelColumnaCategoriaValorSubGrupoActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSubGrupoActivoFijo;
	
	//public JLabel jLabelColumnasValoresGraficoSubGrupoActivoFijo;
	//public JList<Reporte> jListColumnasValoresGraficoSubGrupoActivoFijo;
	//public JScrollPane jScrollColumnasValoresGraficoSubGrupoActivoFijo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSubGrupoActivoFijo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSubGrupoActivoFijo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSubGrupoActivoFijo;
	
	
	
	
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SubGrupoActivoFijoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SubGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubGrupoActivoFijoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubGrupoActivoFijoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SubGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SubGrupoActivoFijoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SubGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSubGrupoActivoFijo)	{
		this.jButtonRecargarInformacionSubGrupoActivoFijo = jButtonRecargarInformacionSubGrupoActivoFijo;
	}
	
	public JButton getjButtonProcesarInformacionSubGrupoActivoFijo() {
		return this.jButtonProcesarInformacionSubGrupoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSubGrupoActivoFijo)	{
		this.jButtonProcesarInformacionSubGrupoActivoFijo = jButtonProcesarInformacionSubGrupoActivoFijo;
	}
	
	
	public JButton getjButtonRecargarInformacionSubGrupoActivoFijo() {
		return this.jButtonRecargarInformacionSubGrupoActivoFijo;
	}
	
	
	public List<SubGrupoActivoFijo> getsubgrupoactivofijos() {
		return this.subgrupoactivofijos;
	}

	public void setsubgrupoactivofijos(List<SubGrupoActivoFijo> subgrupoactivofijos) {
		this.subgrupoactivofijos = subgrupoactivofijos;
	}
	
	public List<SubGrupoActivoFijo> getsubgrupoactivofijosAux() {
		return this.subgrupoactivofijosAux;
	}

	public void setsubgrupoactivofijosAux(List<SubGrupoActivoFijo> subgrupoactivofijosAux) {
		this.subgrupoactivofijosAux = subgrupoactivofijosAux;
	}
	
	public List<SubGrupoActivoFijo> getsubgrupoactivofijosEliminados() {
		return this.subgrupoactivofijosEliminados;
	}

	public void setSubGrupoActivoFijosEliminados(List<SubGrupoActivoFijo> subgrupoactivofijosEliminados) {
		this.subgrupoactivofijosEliminados = subgrupoactivofijosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSubGrupoActivoFijo() {
		return jComboBoxTiposSeleccionarSubGrupoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSubGrupoActivoFijo(
			JComboBox jComboBoxTiposSeleccionarSubGrupoActivoFijo) {
		this.jComboBoxTiposSeleccionarSubGrupoActivoFijo = jComboBoxTiposSeleccionarSubGrupoActivoFijo;
	}
	
	public void setBorderResaltarTiposSeleccionarSubGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSubGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSubGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSubGrupoActivoFijo() {
		return jTextFieldValorCampoGeneralSubGrupoActivoFijo;
	}

	public void setjTextFieldValorCampoGeneralSubGrupoActivoFijo(
			JTextField jTextFieldValorCampoGeneralSubGrupoActivoFijo) {
		this.jTextFieldValorCampoGeneralSubGrupoActivoFijo = jTextFieldValorCampoGeneralSubGrupoActivoFijo;
	}

	public void setBorderResaltarValorCampoGeneralSubGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSubGrupoActivoFijo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSubGrupoActivoFijo() {
		return this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo;
	}

	public void setjCheckBoxSeleccionarTodosSubGrupoActivoFijo(
			JCheckBox jCheckBoxSeleccionarTodosSubGrupoActivoFijo) {
		this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo = jCheckBoxSeleccionarTodosSubGrupoActivoFijo;
	}

	public void setBorderResaltarSeleccionarTodosSubGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSubGrupoActivoFijo() {
		return this.jCheckBoxSeleccionadosSubGrupoActivoFijo;
	}

	public void setjCheckBoxSeleccionadosSubGrupoActivoFijo(
			JCheckBox jCheckBoxSeleccionadosSubGrupoActivoFijo) {
		this.jCheckBoxSeleccionadosSubGrupoActivoFijo = jCheckBoxSeleccionadosSubGrupoActivoFijo;
	}
	
	public void setBorderResaltarSeleccionadosSubGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSubGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSubGrupoActivoFijo() {
		return this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSubGrupoActivoFijo(
			JComboBox jComboBoxTiposArchivosReportesSubGrupoActivoFijo) {
		this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo = jComboBoxTiposArchivosReportesSubGrupoActivoFijo;
	}

	public void setBorderResaltarTiposArchivosReportesSubGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSubGrupoActivoFijo() {
		return this.jComboBoxTiposReportesSubGrupoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSubGrupoActivoFijo(
			JComboBox jComboBoxTiposReportesSubGrupoActivoFijo) {
		this.jComboBoxTiposReportesSubGrupoActivoFijo = jComboBoxTiposReportesSubGrupoActivoFijo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSubGrupoActivoFijo() {
	//	return jComboBoxTiposReportesDinamicoSubGrupoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSubGrupoActivoFijo(
	//		JComboBox jComboBoxTiposReportesDinamicoSubGrupoActivoFijo) {
	//	this.jComboBoxTiposReportesDinamicoSubGrupoActivoFijo = jComboBoxTiposReportesDinamicoSubGrupoActivoFijo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSubGrupoActivoFijo() {
	//	return jComboBoxTiposArchivosReportesDinamicoSubGrupoActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSubGrupoActivoFijo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSubGrupoActivoFijo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSubGrupoActivoFijo = jComboBoxTiposArchivosReportesDinamicoSubGrupoActivoFijo;
	//}
	
	public void setBorderResaltarTiposReportesSubGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSubGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSubGrupoActivoFijo() {
		return this.jComboBoxTiposGraficosReportesSubGrupoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSubGrupoActivoFijo(
			JComboBox jComboBoxTiposGraficosReportesSubGrupoActivoFijo) {
		this.jComboBoxTiposGraficosReportesSubGrupoActivoFijo = jComboBoxTiposGraficosReportesSubGrupoActivoFijo;
	}
	
	public void setBorderResaltarTiposGraficosReportesSubGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSubGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSubGrupoActivoFijo() {
		return this.jComboBoxTiposPaginacionSubGrupoActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSubGrupoActivoFijo(
			JComboBox jComboBoxTiposPaginacionSubGrupoActivoFijo) {
		this.jComboBoxTiposPaginacionSubGrupoActivoFijo = jComboBoxTiposPaginacionSubGrupoActivoFijo;
	}
	
	public void setBorderResaltarTiposPaginacionSubGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSubGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSubGrupoActivoFijo() {
		return this.jComboBoxTiposRelacionesSubGrupoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSubGrupoActivoFijo() {
		return this.jComboBoxTiposAccionesSubGrupoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSubGrupoActivoFijo(
			JComboBox jComboBoxTiposRelacionesSubGrupoActivoFijo) {
		this.jComboBoxTiposRelacionesSubGrupoActivoFijo = jComboBoxTiposRelacionesSubGrupoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSubGrupoActivoFijo(
			JComboBox jComboBoxTiposAccionesSubGrupoActivoFijo) {
		this.jComboBoxTiposAccionesSubGrupoActivoFijo = jComboBoxTiposAccionesSubGrupoActivoFijo;
	}
	
	public void setBorderResaltarTiposRelacionesSubGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSubGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSubGrupoActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSubGrupoActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSubGrupoActivoFijo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSubGrupoActivoFijo() {
	//	return jCheckBoxConGraficoDinamicoSubGrupoActivoFijo;
	//}

	//public void setjCheckBoxConGraficoDinamicoSubGrupoActivoFijo(
	//		JCheckBox jCheckBoxConGraficoDinamicoSubGrupoActivoFijo) {
	//	this.jCheckBoxConGraficoDinamicoSubGrupoActivoFijo = jCheckBoxConGraficoDinamicoSubGrupoActivoFijo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSubGrupoActivoFijo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSubGrupoActivoFijo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSubGrupoActivoFijo .setBorder(borderResaltar);		
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
		this.subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean();
		
		this.subgrupoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.subgrupoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SubGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SubGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SubGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SubGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SubGrupoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sub Grupo Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
		
		SubGrupoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SubGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSubGrupoActivoFijo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSubGrupoActivoFijo,this.jTtoolBarSubGrupoActivoFijo,
							"nuevo","nuevo","Nuevo"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSubGrupoActivoFijo,this.jTtoolBarSubGrupoActivoFijo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSubGrupoActivoFijo,this.jTtoolBarSubGrupoActivoFijo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSubGrupoActivoFijo,this.jTtoolBarSubGrupoActivoFijo,
							"duplicar","duplicar","Duplicar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSubGrupoActivoFijo,this.jTtoolBarSubGrupoActivoFijo,
							"copiar","copiar","Copiar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSubGrupoActivoFijo,this.jTtoolBarSubGrupoActivoFijo,
							"ver_form","ver_form","Ver"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSubGrupoActivoFijo,this.jTtoolBarSubGrupoActivoFijo,
							"recargar","recargar","Recargar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSubGrupoActivoFijo,this.jTtoolBarSubGrupoActivoFijo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSubGrupoActivoFijo,this.jTtoolBarSubGrupoActivoFijo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSubGrupoActivoFijo,this.jTtoolBarSubGrupoActivoFijo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSubGrupoActivoFijo,this.jTtoolBarSubGrupoActivoFijo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSubGrupoActivoFijo,this.jTtoolBarSubGrupoActivoFijo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSubGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSubGrupoActivoFijo,this.jTtoolBarSubGrupoActivoFijo,
							"cerrar","cerrar","Salir"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSubGrupoActivoFijo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSubGrupoActivoFijo;
			
				this.jButtonProcesarInformacionToolBarSubGrupoActivoFijo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSubGrupoActivoFijo;
				
		//protected JButton jButtonModificarToolBarSubGrupoActivoFijo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSubGrupoActivoFijo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSubGrupoActivoFijo=new JMenuMe("General");
		this.jmenuArchivoSubGrupoActivoFijo=new JMenuMe("Archivo");
		this.jmenuAccionesSubGrupoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDatosSubGrupoActivoFijo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSubGrupoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSubGrupoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSubGrupoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSubGrupoActivoFijo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSubGrupoActivoFijo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSubGrupoActivoFijo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSubGrupoActivoFijo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSubGrupoActivoFijo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSubGrupoActivoFijo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSubGrupoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSubGrupoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSubGrupoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSubGrupoActivoFijo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSubGrupoActivoFijo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSubGrupoActivoFijo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSubGrupoActivoFijo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSubGrupoActivoFijo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSubGrupoActivoFijo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSubGrupoActivoFijo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSubGrupoActivoFijo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSubGrupoActivoFijo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSubGrupoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSubGrupoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSubGrupoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSubGrupoActivoFijo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSubGrupoActivoFijo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSubGrupoActivoFijo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSubGrupoActivoFijo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSubGrupoActivoFijo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSubGrupoActivoFijo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSubGrupoActivoFijo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSubGrupoActivoFijo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSubGrupoActivoFijo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSubGrupoActivoFijo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSubGrupoActivoFijo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSubGrupoActivoFijo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySubGrupoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySubGrupoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySubGrupoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSubGrupoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSubGrupoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSubGrupoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySubGrupoActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySubGrupoActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySubGrupoActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSubGrupoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSubGrupoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSubGrupoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSubGrupoActivoFijo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSubGrupoActivoFijo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSubGrupoActivoFijo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSubGrupoActivoFijo.add(this.jMenuItemCerrarSubGrupoActivoFijo);
			
			this.jmenuAccionesSubGrupoActivoFijo.add(this.jMenuItemNuevoSubGrupoActivoFijo);
			this.jmenuAccionesSubGrupoActivoFijo.add(this.jMenuItemNuevoGuardarCambiosSubGrupoActivoFijo);
			this.jmenuAccionesSubGrupoActivoFijo.add(this.jMenuItemNuevoRelacionesSubGrupoActivoFijo);
			this.jmenuAccionesSubGrupoActivoFijo.add(this.jMenuItemGuardarCambiosTablaSubGrupoActivoFijo);		
			this.jmenuAccionesSubGrupoActivoFijo.add(this.jMenuItemDuplicarSubGrupoActivoFijo);		
			this.jmenuAccionesSubGrupoActivoFijo.add(this.jMenuItemCopiarSubGrupoActivoFijo);		
			this.jmenuAccionesSubGrupoActivoFijo.add(this.jMenuItemVerFormSubGrupoActivoFijo);		
			
			this.jmenuDatosSubGrupoActivoFijo.add(this.jMenuItemRecargarInformacionSubGrupoActivoFijo);				
			this.jmenuDatosSubGrupoActivoFijo.add(this.jMenuItemAnterioresSubGrupoActivoFijo);				
			this.jmenuDatosSubGrupoActivoFijo.add(this.jMenuItemSiguientesSubGrupoActivoFijo);				
			this.jmenuDatosSubGrupoActivoFijo.add(this.jMenuItemAbrirOrderBySubGrupoActivoFijo);				
			this.jmenuDatosSubGrupoActivoFijo.add(this.jMenuItemMostrarOcultarSubGrupoActivoFijo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSubGrupoActivoFijo.add(this.jMenuItemGuardarCambiosSubGrupoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSubGrupoActivoFijo.add(this.jmenuArchivoSubGrupoActivoFijo);		
			this.jmenuBarSubGrupoActivoFijo.add(this.jmenuAccionesSubGrupoActivoFijo);		
			this.jmenuBarSubGrupoActivoFijo.add(this.jmenuDatosSubGrupoActivoFijo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSubGrupoActivoFijo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSubGrupoActivoFijo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasSubGrupoActivoFijo=new JTabbedPane();


		this.jTabbedPaneBusquedasSubGrupoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasSubGrupoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasSubGrupoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSubGrupoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSubGrupoActivoFijo = new SubGrupoActivoFijoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sub Grupo Activo Fijo DATOS");
			this.jInternalFrameDetalleFormSubGrupoActivoFijo = new SubGrupoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.subgrupoactivofijoSessionBean.getConGuardarRelaciones(),this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo = null;//new SubGrupoActivoFijoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSubGrupoActivoFijo= new GridBagLayout();
		
		
		this.jTableDatosSubGrupoActivoFijo = new JTableMe();      
		
		String sToolTipSubGrupoActivoFijo="";
		sToolTipSubGrupoActivoFijo=SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSubGrupoActivoFijo+="(ActivosFijos.SubGrupoActivoFijo)";
		}
		
		if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipSubGrupoActivoFijo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSubGrupoActivoFijo.setToolTipText(sToolTipSubGrupoActivoFijo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSubGrupoActivoFijo);
		this.jTableDatosSubGrupoActivoFijo.setAutoCreateRowSorter(true);
		this.jTableDatosSubGrupoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSubGrupoActivoFijo.setRowSelectionAllowed(true);
		this.jTableDatosSubGrupoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSubGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSubGrupoActivoFijo = new JButtonMe();
		this.jButtonDuplicarSubGrupoActivoFijo = new JButtonMe();
		this.jButtonCopiarSubGrupoActivoFijo = new JButtonMe();
		this.jButtonVerFormSubGrupoActivoFijo = new JButtonMe();
		this.jButtonNuevoRelacionesSubGrupoActivoFijo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSubGrupoActivoFijo = new JButtonMe();
		this.jButtonCerrarSubGrupoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosSubGrupoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosGeneralSubGrupoActivoFijo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSubGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Sub Grupo Activo Fijo";
		
		if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Grupo Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosSubGrupoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSubGrupoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesSubGrupoActivoFijo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSubGrupoActivoFijo=new ReporteDinamicoJInternalFrame(SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSubGrupoActivoFijo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSubGrupoActivoFijo=new ImportacionJInternalFrame(SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSubGrupoActivoFijo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySubGrupoActivoFijo = new JButtonMe();
		
		this.jButtonAbrirOrderBySubGrupoActivoFijo.setText("Orden");
		this.jButtonAbrirOrderBySubGrupoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySubGrupoActivoFijo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySubGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySubGrupoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubGrupoActivoFijo,false,this);
			
			//this.cargarOrderBySubGrupoActivoFijo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySubGrupoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubGrupoActivoFijo,true,this);
			
			//this.cargarOrderBySubGrupoActivoFijo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSubGrupoActivoFijo.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosSubGrupoActivoFijo.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosSubGrupoActivoFijo.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosSubGrupoActivoFijo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSubGrupoActivoFijo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSubGrupoActivoFijo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSubGrupoActivoFijo.setText("Nuevo");
		this.jButtonDuplicarSubGrupoActivoFijo.setText("Duplicar");
		this.jButtonCopiarSubGrupoActivoFijo.setText("Copiar");
		this.jButtonVerFormSubGrupoActivoFijo.setText("Ver");
		this.jButtonNuevoRelacionesSubGrupoActivoFijo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSubGrupoActivoFijo.setText("Guardar");
		this.jButtonCerrarSubGrupoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSubGrupoActivoFijo,"nuevo_button","Nuevo",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSubGrupoActivoFijo,"duplicar_button","Duplicar",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSubGrupoActivoFijo,"copiar_button","Copiar",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSubGrupoActivoFijo,"ver_form","Ver",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSubGrupoActivoFijo,"nuevorelaciones_button","Nuevo Rel",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSubGrupoActivoFijo,"guardarcambiostabla_button","Guardar",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSubGrupoActivoFijo,"cerrar_button","Salir",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSubGrupoActivoFijo.setToolTipText("Nuevo"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSubGrupoActivoFijo.setToolTipText("Duplicar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSubGrupoActivoFijo.setToolTipText("Copiar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSubGrupoActivoFijo.setToolTipText("Ver"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSubGrupoActivoFijo.setToolTipText("Nuevo Rel"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSubGrupoActivoFijo.setToolTipText("Guardar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSubGrupoActivoFijo.setToolTipText("Salir"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSubGrupoActivoFijo";
		inputMap = this.jButtonNuevoSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSubGrupoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSubGrupoActivoFijo"));
		
		//DUPLICAR
		sMapKey = "DuplicarSubGrupoActivoFijo";
		inputMap = this.jButtonDuplicarSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSubGrupoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSubGrupoActivoFijo"));
		
		//COPIAR
		sMapKey = "CopiarSubGrupoActivoFijo";
		inputMap = this.jButtonCopiarSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSubGrupoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSubGrupoActivoFijo"));
		
		//VEr FORM
		sMapKey = "VerFormSubGrupoActivoFijo";
		inputMap = this.jButtonVerFormSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSubGrupoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSubGrupoActivoFijo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSubGrupoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSubGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSubGrupoActivoFijo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSubGrupoActivoFijo";
		inputMap = this.jButtonModificarSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSubGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSubGrupoActivoFijo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSubGrupoActivoFijo";
		inputMap = this.jButtonCerrarSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSubGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSubGrupoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSubGrupoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSubGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSubGrupoActivoFijo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSubGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSubGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSubGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SubGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SubGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SubGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SubGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SubGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSubGrupoActivoFijo.setName("jPanelParametrosReportesSubGrupoActivoFijo"); 
		
		this.jPanelParametrosReportesAccionesSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSubGrupoActivoFijo.setName("jPanelParametrosReportesAccionesSubGrupoActivoFijo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSubGrupoActivoFijo = new JButtonMe();
		this.jButtonRecargarInformacionSubGrupoActivoFijo.setText("Recargar");
		this.jButtonRecargarInformacionSubGrupoActivoFijo.setToolTipText("Recargar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSubGrupoActivoFijo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSubGrupoActivoFijo = new JButtonMe();
		this.jButtonProcesarInformacionSubGrupoActivoFijo.setText("Procesar");
		this.jButtonProcesarInformacionSubGrupoActivoFijo.setToolTipText("Procesar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSubGrupoActivoFijo.setVisible(false);
			
		this.jButtonProcesarInformacionSubGrupoActivoFijo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSubGrupoActivoFijo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSubGrupoActivoFijo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSubGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposReportesSubGrupoActivoFijo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSubGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSubGrupoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSubGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSubGrupoActivoFijo.setText("Paginacion");
		this.jComboBoxTiposPaginacionSubGrupoActivoFijo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSubGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSubGrupoActivoFijo.setText("Accion");
		this.jComboBoxTiposRelacionesSubGrupoActivoFijo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSubGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSubGrupoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesSubGrupoActivoFijo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSubGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSubGrupoActivoFijo.setText("Accion");
		this.jComboBoxTiposSeleccionarSubGrupoActivoFijo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSubGrupoActivoFijo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSubGrupoActivoFijo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSubGrupoActivoFijo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSubGrupoActivoFijo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSubGrupoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesSubGrupoActivoFijo.setText("Acciones");		
		this.jLabelAccionesSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSubGrupoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSubGrupoActivoFijo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSubGrupoActivoFijo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSubGrupoActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSubGrupoActivoFijo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSubGrupoActivoFijo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSubGrupoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSubGrupoActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoReporteSubGrupoActivoFijo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSubGrupoActivoFijo = new JButtonMe();
		//this.jButtonAnterioresSubGrupoActivoFijo.setText("<<");
        this.jButtonAnterioresSubGrupoActivoFijo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSubGrupoActivoFijo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSubGrupoActivoFijo = new JButtonMe();
		//this.jButtonSiguientesSubGrupoActivoFijo.setText(">>");
        this.jButtonSiguientesSubGrupoActivoFijo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSubGrupoActivoFijo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSubGrupoActivoFijo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSubGrupoActivoFijo.setText("Nue");
        this.jButtonNuevoGuardarCambiosSubGrupoActivoFijo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSubGrupoActivoFijo,"nuevoguardarcambios_button","Nue",this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSubGrupoActivoFijo";
		inputMap = this.jButtonNuevoGuardarCambiosSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSubGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSubGrupoActivoFijo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSubGrupoActivoFijo";
		inputMap = this.jButtonRecargarInformacionSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSubGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSubGrupoActivoFijo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSubGrupoActivoFijo";
		inputMap = this.jButtonSiguientesSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSubGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSubGrupoActivoFijo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSubGrupoActivoFijo";
		inputMap = this.jButtonAnterioresSubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSubGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSubGrupoActivoFijo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSubGrupoActivoFijo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSubGrupoActivoFijo.setMinimumSize(new Dimension(this.getWidth(),SubGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SubGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSubGrupoActivoFijo.setMaximumSize(new Dimension(this.getWidth(),SubGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SubGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSubGrupoActivoFijo.setPreferredSize(new Dimension(this.getWidth(),SubGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SubGrupoActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSubGrupoActivoFijo = new GridBagLayout();

			this.jPanelPaginacionSubGrupoActivoFijo.setLayout(gridaBagLayoutPaginacionSubGrupoActivoFijo);						
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSubGrupoActivoFijo.add(this.jButtonAnterioresSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
					
						
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
			
			this.jPanelPaginacionSubGrupoActivoFijo.add(this.jButtonNuevoGuardarCambiosSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
						
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
			this.jPanelPaginacionSubGrupoActivoFijo.add(this.jButtonSiguientesSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = 1;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubGrupoActivoFijo.add(this.jButtonNuevoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSubGrupoActivoFijo.gridy = 1;
				this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionSubGrupoActivoFijo.add(this.jButtonNuevoRelacionesSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
			}
			
			
			if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSubGrupoActivoFijo.gridy = 1;
				this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSubGrupoActivoFijo.add(this.jButtonGuardarCambiosTablaSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
			}
			
			
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = 1;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubGrupoActivoFijo.add(this.jButtonDuplicarSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = 1;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubGrupoActivoFijo.add(this.jButtonCopiarSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = 1;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSubGrupoActivoFijo.add(this.jButtonVerFormSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = 1;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSubGrupoActivoFijo.add(this.jButtonCerrarSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		
		
		
		this.jButtonRecargarInformacionSubGrupoActivoFijo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSubGrupoActivoFijo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSubGrupoActivoFijo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSubGrupoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSubGrupoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSubGrupoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSubGrupoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSubGrupoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSubGrupoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSubGrupoActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSubGrupoActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSubGrupoActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSubGrupoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSubGrupoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSubGrupoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSubGrupoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubGrupoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSubGrupoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSubGrupoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSubGrupoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSubGrupoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSubGrupoActivoFijo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSubGrupoActivoFijo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSubGrupoActivoFijo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSubGrupoActivoFijo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSubGrupoActivoFijo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSubGrupoActivoFijo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSubGrupoActivoFijo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSubGrupoActivoFijo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSubGrupoActivoFijo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSubGrupoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSubGrupoActivoFijo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SubGrupoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SubGrupoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SubGrupoActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SubGrupoActivoFijo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSubGrupoActivoFijo.setLayout(gridaBagParametrosReportesSubGrupoActivoFijo);
			this.jPanelParametrosReportesAccionesSubGrupoActivoFijo.setLayout(gridaBagParametrosReportesAccionesSubGrupoActivoFijo);
			
			
			this.jPanelParametrosAuxiliar1SubGrupoActivoFijo.setLayout(gridaBagParametrosAuxiliar1SubGrupoActivoFijo);
			this.jPanelParametrosAuxiliar2SubGrupoActivoFijo.setLayout(gridaBagParametrosAuxiliar2SubGrupoActivoFijo);
			this.jPanelParametrosAuxiliar3SubGrupoActivoFijo.setLayout(gridaBagParametrosAuxiliar3SubGrupoActivoFijo);
			this.jPanelParametrosAuxiliar4SubGrupoActivoFijo.setLayout(gridaBagParametrosAuxiliar4SubGrupoActivoFijo);
			//this.jPanelParametrosAuxiliar5SubGrupoActivoFijo.setLayout(gridaBagParametrosAuxiliar2SubGrupoActivoFijo);			
			
			
			
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubGrupoActivoFijo.add(this.jButtonRecargarInformacionSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SubGrupoActivoFijo.add(this.jComboBoxTiposPaginacionSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SubGrupoActivoFijo.add(this.jCheckBoxConAltoMaximoTablaSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SubGrupoActivoFijo.add(this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubGrupoActivoFijo.add(this.jPanelParametrosAuxiliar1SubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SubGrupoActivoFijo.add(this.jComboBoxTiposReportesSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubGrupoActivoFijo.add(this.jPanelParametrosAuxiliar4SubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubGrupoActivoFijo.add(this.jComboBoxTiposReportesSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubGrupoActivoFijo.add(this.jCheckBoxGenerarReporteSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubGrupoActivoFijo.add(this.jPanelParametrosAuxiliar2SubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubGrupoActivoFijo.add(this.jLabelAccionesSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSubGrupoActivoFijo.add(this.jButtonAbrirOrderBySubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubGrupoActivoFijo.add(this.jComboBoxTiposSeleccionarSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);			
			
			
			/*
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSubGrupoActivoFijo.add(this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SubGrupoActivoFijo.add(this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);															
				
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SubGrupoActivoFijo.add(this.jCheckBoxSeleccionadosSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSubGrupoActivoFijo.add(this.jPanelParametrosAuxiliar3SubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubGrupoActivoFijo.add(this.jComboBoxTiposRelacionesSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
				
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubGrupoActivoFijo.add(this.jComboBoxTiposAccionesSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
	
				
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSubGrupoActivoFijo.add(this.jTextFieldValorCampoGeneralSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSubGrupoActivoFijo = new GridBagLayout();

			this.jScrollPanelDatosSubGrupoActivoFijo.setLayout(gridaBagLayoutDatosSubGrupoActivoFijo);
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
			
			this.jScrollPanelDatosSubGrupoActivoFijo.add(this.jTableDatosSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSubGrupoActivoFijo.setViewportView(this.jTableDatosSubGrupoActivoFijo);
		this.jTableDatosSubGrupoActivoFijo.setFillsViewportHeight(true);
		this.jTableDatosSubGrupoActivoFijo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSubGrupoActivoFijo= new GridBagLayout();
		this.jPanelAccionesSubGrupoActivoFijo.setLayout(gridaBagLayoutAccionesSubGrupoActivoFijo);
		
		
		/*	
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
			
		this.jPanelAccionesSubGrupoActivoFijo.add(this.jButtonNuevoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSubGrupoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSubGrupoActivoFijo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsSubGrupoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;		
		//this.gridBagConstraintsSubGrupoActivoFijo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoActivoFijo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSubGrupoActivoFijo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSubGrupoActivoFijo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);								
		
		
		/*
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		*/		
		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx =0;
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSubGrupoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
				
		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(SubGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSubGrupoActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSubGrupoActivoFijo = new GridBagLayout();
			this.jPanelBusquedasParametrosSubGrupoActivoFijo.setLayout(gridaBagLayoutBusquedasParametrosSubGrupoActivoFijo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSubGrupoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSubGrupoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubGrupoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSubGrupoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
			
			
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		
			
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSubGrupoActivoFijo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSubGrupoActivoFijo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSubGrupoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSubGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSubGrupoActivoFijo.setName("jPanelReporteDinamicoSubGrupoActivoFijo"); 
		
		this.jPanelReporteDinamicoSubGrupoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSubGrupoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSubGrupoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSubGrupoActivoFijo.setLayout(gridaBagLayoutReporteDinamicoSubGrupoActivoFijo);
		
		
		this.jInternalFrameReporteDinamicoSubGrupoActivoFijo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSubGrupoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSubGrupoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setResizable(true);
	    this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setClosable(true);
	    this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSubGrupoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSubGrupoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSubGrupoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Grupo Activo Fijos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSubGrupoActivoFijo = new JLabelMe();

		this.jLabelColumnasSelectReporteSubGrupoActivoFijo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSubGrupoActivoFijo.add(this.jLabelColumnasSelectReporteSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSubGrupoActivoFijo = new JList<Reporte>();
		this.jListColumnasSelectReporteSubGrupoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSubGrupoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSubGrupoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSubGrupoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSubGrupoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSubGrupoActivoFijo=new JScrollPane(this.jListColumnasSelectReporteSubGrupoActivoFijo);
			
			this.jScrollColumnasSelectReporteSubGrupoActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSubGrupoActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSubGrupoActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSubGrupoActivoFijo.add(this.jListColumnasSelectReporteSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		this.jPanelReporteDinamicoSubGrupoActivoFijo.add(this.jScrollColumnasSelectReporteSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSubGrupoActivoFijo = new JLabelMe();

		this.jLabelRelacionesSelectReporteSubGrupoActivoFijo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSubGrupoActivoFijo.add(this.jLabelRelacionesSelectReporteSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSubGrupoActivoFijo = new JList<Reporte>();
		this.jListRelacionesSelectReporteSubGrupoActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSubGrupoActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSubGrupoActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSubGrupoActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSubGrupoActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSubGrupoActivoFijo=new JScrollPane(this.jListRelacionesSelectReporteSubGrupoActivoFijo);
			
			this.jScrollRelacionesSelectReporteSubGrupoActivoFijo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSubGrupoActivoFijo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSubGrupoActivoFijo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSubGrupoActivoFijo.add(this.jListRelacionesSelectReporteSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		this.jPanelReporteDinamicoSubGrupoActivoFijo.add(this.jScrollRelacionesSelectReporteSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoSubGrupoActivoFijo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSubGrupoActivoFijo = new JComboBoxMe();
		this.jListColumnasValoresGraficoSubGrupoActivoFijo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSubGrupoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSubGrupoActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSubGrupoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSubGrupoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSubGrupoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSubGrupoActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSubGrupoActivoFijo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSubGrupoActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSubGrupoActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSubGrupoActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSubGrupoActivoFijo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSubGrupoActivoFijo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubGrupoActivoFijo.add(this.jLabelGenerarExcelReporteDinamicoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSubGrupoActivoFijo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSubGrupoActivoFijo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSubGrupoActivoFijo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSubGrupoActivoFijo.setToolTipText("Generar EXCEL"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSubGrupoActivoFijo.add(this.jButtonGenerarExcelReporteDinamicoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubGrupoActivoFijo.add(this.jComboBoxTiposReportesDinamicoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSubGrupoActivoFijo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSubGrupoActivoFijo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSubGrupoActivoFijo.add(this.jLabelTiposArchivoReporteDinamicoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubGrupoActivoFijo.add(this.jComboBoxTiposArchivosReportesDinamicoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSubGrupoActivoFijo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSubGrupoActivoFijo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSubGrupoActivoFijo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSubGrupoActivoFijo.setToolTipText("Generar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubGrupoActivoFijo.add(this.jButtonGenerarReporteDinamicoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSubGrupoActivoFijo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSubGrupoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSubGrupoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSubGrupoActivoFijo.setToolTipText("Cancelar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSubGrupoActivoFijo.add(this.jButtonCerrarReporteDinamicoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSubGrupoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSubGrupoActivoFijo= new JScrollPane(jPanelReporteDinamicoSubGrupoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSubGrupoActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSubGrupoActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSubGrupoActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Grupo Activo Fijos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSubGrupoActivoFijo);
		this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getContentPane().add(this.jScrollPanelReporteDinamicoSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSubGrupoActivoFijo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSubGrupoActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSubGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSubGrupoActivoFijo.setName("jPanelImportacionSubGrupoActivoFijo"); 
		
		this.jPanelImportacionSubGrupoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSubGrupoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSubGrupoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSubGrupoActivoFijo.setLayout(gridaBagLayoutImportacionSubGrupoActivoFijo);
		
		
		this.jInternalFrameImportacionSubGrupoActivoFijo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSubGrupoActivoFijo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSubGrupoActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSubGrupoActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSubGrupoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSubGrupoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSubGrupoActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSubGrupoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSubGrupoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSubGrupoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionSubGrupoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionSubGrupoActivoFijo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSubGrupoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSubGrupoActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSubGrupoActivoFijo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSubGrupoActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSubGrupoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSubGrupoActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionSubGrupoActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionSubGrupoActivoFijo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSubGrupoActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSubGrupoActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSubGrupoActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Grupo Activo Fijos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSubGrupoActivoFijo = new JLabelMe();

		this.jLabelArchivoImportacionSubGrupoActivoFijo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSubGrupoActivoFijo.add(this.jLabelArchivoImportacionSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSubGrupoActivoFijo = new JFileChooser();		
		this.jFileChooserImportacionSubGrupoActivoFijo.setToolTipText("ESCOGER ARCHIVO"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSubGrupoActivoFijo = new JButtonMe();
		this.jButtonAbrirImportacionSubGrupoActivoFijo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSubGrupoActivoFijo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSubGrupoActivoFijo.setToolTipText("Generar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubGrupoActivoFijo.add(this.jButtonAbrirImportacionSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSubGrupoActivoFijo = new JLabelMe();

		this.jLabelPathArchivoImportacionSubGrupoActivoFijo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSubGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSubGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSubGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSubGrupoActivoFijo.add(this.jLabelPathArchivoImportacionSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSubGrupoActivoFijo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSubGrupoActivoFijo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSubGrupoActivoFijo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSubGrupoActivoFijo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubGrupoActivoFijo.add(this.jTextFieldPathArchivoImportacionSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSubGrupoActivoFijo = new JButtonMe();
		this.jButtonGenerarImportacionSubGrupoActivoFijo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSubGrupoActivoFijo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSubGrupoActivoFijo.setToolTipText("Generar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubGrupoActivoFijo.add(this.jButtonGenerarImportacionSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSubGrupoActivoFijo = new JButtonMe();
		this.jButtonCerrarImportacionSubGrupoActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSubGrupoActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSubGrupoActivoFijo.setToolTipText("Cancelar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSubGrupoActivoFijo.add(this.jButtonCerrarImportacionSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSubGrupoActivoFijo = new GridBagLayout();
		
		this.jScrollPanelImportacionSubGrupoActivoFijo= new JScrollPane(jPanelImportacionSubGrupoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsSubGrupoActivoFijo.gridy =iPosYImportacion;
		this.gridBagConstraintsSubGrupoActivoFijo.gridx =iPosXImportacion;
		this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSubGrupoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSubGrupoActivoFijo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSubGrupoActivoFijo);
		this.jInternalFrameImportacionSubGrupoActivoFijo.getContentPane().add(this.jScrollPanelImportacionSubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySubGrupoActivoFijo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySubGrupoActivoFijo = new JButtonMe();
			this.jButtonAbrirOrderBySubGrupoActivoFijo.setText("Orden");
			this.jButtonAbrirOrderBySubGrupoActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySubGrupoActivoFijo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySubGrupoActivoFijo";
			inputMap = this.jButtonAbrirOrderBySubGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySubGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySubGrupoActivoFijo"));
		
		
			GridBagLayout gridaBagLayoutOrderBySubGrupoActivoFijo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySubGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySubGrupoActivoFijo.setName("jPanelOrderBySubGrupoActivoFijo"); 
			
			this.jPanelOrderBySubGrupoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySubGrupoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySubGrupoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySubGrupoActivoFijo.setLayout(gridaBagLayoutOrderBySubGrupoActivoFijo);
			
			
			this.jTableDatosSubGrupoActivoFijoOrderBy = new JTableMe();        
			this.jTableDatosSubGrupoActivoFijoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSubGrupoActivoFijoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSubGrupoActivoFijoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSubGrupoActivoFijoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSubGrupoActivoFijoOrderBy.setViewportView(this.jTableDatosSubGrupoActivoFijoOrderBy);
			this.jTableDatosSubGrupoActivoFijoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSubGrupoActivoFijoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySubGrupoActivoFijo= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySubGrupoActivoFijo= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySubGrupoActivoFijo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSubGrupoActivoFijo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySubGrupoActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySubGrupoActivoFijo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySubGrupoActivoFijo.setTitle("Orden");
			this.jInternalFrameOrderBySubGrupoActivoFijo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySubGrupoActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySubGrupoActivoFijo.setResizable(true);
			this.jInternalFrameOrderBySubGrupoActivoFijo.setClosable(true);
			this.jInternalFrameOrderBySubGrupoActivoFijo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySubGrupoActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySubGrupoActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySubGrupoActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySubGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sub Grupo Activo Fijos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSubGrupoActivoFijo.ipady =150;
				
			this.jPanelOrderBySubGrupoActivoFijo.add(jScrollPanelDatosSubGrupoActivoFijoOrderBy, this.gridBagConstraintsSubGrupoActivoFijo);//this.jTableDatosSubGrupoActivoFijoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySubGrupoActivoFijo = new JButtonMe();
			this.jButtonCerrarOrderBySubGrupoActivoFijo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySubGrupoActivoFijo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySubGrupoActivoFijo.setToolTipText("Cancelar"+" "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySubGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSubGrupoActivoFijo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySubGrupoActivoFijo.add(this.jButtonCerrarOrderBySubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSubGrupoActivoFijo = new GridBagLayout();
			
			this.jScrollPanelOrderBySubGrupoActivoFijo= new JScrollPane(jPanelOrderBySubGrupoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSubGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsSubGrupoActivoFijo.gridy =iPosYOrderBy;
			this.gridBagConstraintsSubGrupoActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsSubGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySubGrupoActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySubGrupoActivoFijo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSubGrupoActivoFijo);
			
			this.jInternalFrameOrderBySubGrupoActivoFijo.getContentPane().add(this.jScrollPanelOrderBySubGrupoActivoFijo, this.gridBagConstraintsSubGrupoActivoFijo);			
		
		} else {
			this.jButtonAbrirOrderBySubGrupoActivoFijo = new JButtonMe();
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
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSubGrupoActivoFijo.getRowHeight();//SubGrupoActivoFijoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SubGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSubGrupoActivoFijo.isSelected()) {
					iHeightTable=SubGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SubGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SubGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SubGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSubGrupoActivoFijo.isSelected()) {
					iHeightTable=SubGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SubGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SubGrupoActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSubGrupoActivoFijo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSubGrupoActivoFijo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSubGrupoActivoFijo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSubGrupoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSubGrupoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSubGrupoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySubGrupoActivoFijo!=null && this.jInternalFrameOrderBySubGrupoActivoFijo.getjTableDatosOrderBy()!=null) {
			//if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySubGrupoActivoFijo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySubGrupoActivoFijo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySubGrupoActivoFijo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySubGrupoActivoFijo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySubGrupoActivoFijo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySubGrupoActivoFijo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySubGrupoActivoFijo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSubGrupoActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSubGrupoActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSubGrupoActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=subgrupoactivofijoLogic.getSubGrupoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=subgrupoactivofijos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SubGrupoActivoFijo> TraerSubGrupoActivoFijoBeans(List<SubGrupoActivoFijo> subgrupoactivofijos,ArrayList<Classe> classes)throws Exception {
		try {
			for(SubGrupoActivoFijo subgrupoactivofijo:subgrupoactivofijos) {
					
				if(!(SubGrupoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SubGrupoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					subgrupoactivofijo.setsDetalleGeneralEntityReporte(SubGrupoActivoFijoConstantesFunciones.getSubGrupoActivoFijoDescripcion(subgrupoactivofijo));
										
					subgrupoactivofijo.setes_vehiculo_descripcion(SubGrupoActivoFijoConstantesFunciones.getes_vehiculoDescripcion(subgrupoactivofijo));	
					
					

					if(subgrupoactivofijo.getDetalleActivoFijos()!=null && Funciones.existeClass(classes,DetalleActivoFijo.class)) {
						try{subgrupoactivofijo.setdetalleactivofijosDescripcionReporte(new JRBeanCollectionDataSource(DetalleActivoFijoJInternalFrame.TraerDetalleActivoFijoBeans(subgrupoactivofijo.getDetalleActivoFijos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//subgrupoactivofijo.setsDetalleGeneralEntityReporte(subgrupoactivofijo.getsDetalleGeneralEntityReporte());
										
				}
				
				//subgrupoactivofijobeans.add(subgrupoactivofijobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return subgrupoactivofijos;
    }
	//PARA REPORTES FIN
}
