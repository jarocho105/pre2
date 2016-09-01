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

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.activosfijos.util.ParteActivoFijoConstantesFunciones;

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
public class ParteActivoFijoJInternalFrame extends ParteActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParteActivoFijo;
	
	protected JMenuBar jmenuBarParteActivoFijo;
	
	protected JMenu jmenuParteActivoFijo;
	protected JMenu jmenuDatosParteActivoFijo;
	protected JMenu jmenuArchivoParteActivoFijo;
	protected JMenu jmenuAccionesParteActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParteActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParteActivoFijo;	
	protected GridBagConstraints gridBagConstraintsParteActivoFijo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParteActivoFijoDetalleFormJInternalFrame jInternalFrameDetalleFormParteActivoFijo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParteActivoFijo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParteActivoFijo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstadoActivoFijoBeanSwingJInternalFrame estadoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoactivofijo="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";
	
	public ParteActivoFijoSessionBean parteactivofijoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EstadoActivoFijoSessionBean estadoactivofijoSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParteActivoFijo> parteactivofijos;		
	public List<ParteActivoFijo> parteactivofijosEliminados;	
	public List<ParteActivoFijo> parteactivofijosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParteActivoFijo;		
	protected JButton jButtonAbrirOrderByParteActivoFijo;
	
	
	//protected JPanel jPanelOrderByParteActivoFijo;
	//public JScrollPane jScrollPanelOrderByParteActivoFijo;	
	//protected JButton jButtonCerrarOrderByParteActivoFijo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParteActivoFijoLogic parteactivofijoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParteActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionParteActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralParteActivoFijo;
    
	
	
	//public JScrollPane jScrollPanelDatosParteActivoFijoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParteActivoFijo;
	//public JScrollPane jScrollPanelImportacionParteActivoFijo;
	
	
	
	protected JPanel jPanelAccionesParteActivoFijo;
	
    protected JPanel jPanelPaginacionParteActivoFijo;
    protected JPanel jPanelParametrosReportesParteActivoFijo;
	protected JPanel jPanelParametrosReportesAccionesParteActivoFijo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParteActivoFijo;
	protected JPanel jPanelParametrosAuxiliar2ParteActivoFijo;
	protected JPanel jPanelParametrosAuxiliar3ParteActivoFijo;
	protected JPanel jPanelParametrosAuxiliar4ParteActivoFijo;
	//protected JPanel jPanelParametrosAuxiliar5ParteActivoFijo;
	
	
	
	//protected JPanel jPanelReporteDinamicoParteActivoFijo;
	//protected JPanel jPanelImportacionParteActivoFijo;
	
	
	public JTable jTableDatosParteActivoFijo;
	
	
	
	//public JTable jTableDatosParteActivoFijoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParteActivoFijo;
	protected JButton jButtonDuplicarParteActivoFijo;
	protected JButton jButtonCopiarParteActivoFijo;
	protected JButton jButtonVerFormParteActivoFijo;
	protected JButton jButtonNuevoRelacionesParteActivoFijo;
	protected JButton jButtonModificarParteActivoFijo;
	
    protected JButton jButtonGuardarCambiosTablaParteActivoFijo;
	protected JButton jButtonCerrarParteActivoFijo;
	
	
	protected JButton jButtonRecargarInformacionParteActivoFijo;
	protected JButton jButtonProcesarInformacionParteActivoFijo;
	
	
	protected JButton jButtonAnterioresParteActivoFijo;
	protected JButton jButtonSiguientesParteActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosParteActivoFijo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParteActivoFijo;
	//protected JButton jButtonCerrarReporteDinamicoParteActivoFijo;
	//protected JButton jButtonGenerarExcelReporteDinamicoParteActivoFijo;	
	
	
	
	//protected JButton jButtonAbrirImportacionParteActivoFijo;
	//protected JButton jButtonGenerarImportacionParteActivoFijo;
	//protected JButton jButtonCerrarImportacionParteActivoFijo;
	//protected JFileChooser jFileChooserImportacionParteActivoFijo;
	//protected File fileImportacionParteActivoFijo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParteActivoFijo;
	protected JButton jButtonDuplicarToolBarParteActivoFijo;
	protected JButton jButtonNuevoRelacionesToolBarParteActivoFijo;
	
	
	public JButton jButtonGuardarCambiosToolBarParteActivoFijo;
	protected JButton jButtonCopiarToolBarParteActivoFijo;
	protected JButton jButtonVerFormToolBarParteActivoFijo;
	public JButton jButtonGuardarCambiosTablaToolBarParteActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarParteActivoFijo;
	protected JButton jButtonCerrarToolBarParteActivoFijo;
	
	protected JButton jButtonRecargarInformacionToolBarParteActivoFijo;
	protected JButton jButtonProcesarInformacionToolBarParteActivoFijo;
	protected JButton jButtonAnterioresToolBarParteActivoFijo;
	protected JButton jButtonSiguientesToolBarParteActivoFijo;
	protected JButton jButtonNuevoGuardarCambiosToolBarParteActivoFijo;
	protected JButton jButtonAbrirOrderByToolBarParteActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParteActivoFijo;
	protected JMenuItem jMenuItemDuplicarParteActivoFijo;
	protected JMenuItem jMenuItemNuevoRelacionesParteActivoFijo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParteActivoFijo;
	protected JMenuItem jMenuItemCopiarParteActivoFijo;
	protected JMenuItem jMenuItemVerFormParteActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaParteActivoFijo;
	protected JMenuItem jMenuItemCerrarParteActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarParteActivoFijo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParteActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarParteActivoFijo;
	
	protected JMenuItem jMenuItemRecargarInformacionParteActivoFijo;
	protected JMenuItem jMenuItemProcesarInformacionParteActivoFijo;
	protected JMenuItem jMenuItemAnterioresParteActivoFijo;
	protected JMenuItem jMenuItemSiguientesParteActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParteActivoFijo;
	protected JMenuItem jMenuItemAbrirOrderByParteActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarParteActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParteActivoFijo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParteActivoFijo;
	protected JCheckBox jCheckBoxSeleccionadosParteActivoFijo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParteActivoFijo;
	protected JCheckBox jCheckBoxConGraficoReporteParteActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParteActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParteActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParteActivoFijo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParteActivoFijo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParteActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParteActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParteActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParteActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParteActivoFijo;
	protected JTextField jTextFieldValorCampoGeneralParteActivoFijo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParteActivoFijo;
	//public JList<Reporte> jListColumnasSelectReporteParteActivoFijo;
	//public JScrollPane jScrollColumnasSelectReporteParteActivoFijo;
	
	//public JLabel jLabelRelacionesSelectReporteParteActivoFijo;
	//public JList<Reporte> jListRelacionesSelectReporteParteActivoFijo;
	//public JScrollPane jScrollRelacionesSelectReporteParteActivoFijo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParteActivoFijo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParteActivoFijo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParteActivoFijo;
	//public JLabel jLabelTiposArchivoReporteDinamicoParteActivoFijo;
	
		
	//public JLabel jLabelArchivoImportacionParteActivoFijo;	
	//public JLabel jLabelPathArchivoImportacionParteActivoFijo;
	//protected JTextField jTextFieldPathArchivoImportacionParteActivoFijo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParteActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParteActivoFijo;
	
	//public JLabel jLabelColumnaCategoriaValorParteActivoFijo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParteActivoFijo;
	
	//public JLabel jLabelColumnasValoresGraficoParteActivoFijo;
	//public JList<Reporte> jListColumnasValoresGraficoParteActivoFijo;
	//public JScrollPane jScrollColumnasValoresGraficoParteActivoFijo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParteActivoFijo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParteActivoFijo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParteActivoFijo;
	public JPanel jPanelFK_IdDetalleActivoFijoParteActivoFijo;
	public JButton jButtonFK_IdDetalleActivoFijoParteActivoFijo;
	public JPanel jPanelFK_IdEstadoActivoFijoParteActivoFijo;
	public JButton jButtonFK_IdEstadoActivoFijoParteActivoFijo;
	
	public JPanel jPanelid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo;
	public JLabel jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo;
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo;
	public JLabel jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo;
	public JButton jButtonid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo= new JButtonMe();
	public JButton jButtonid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijoBusqueda= new JButtonMe();

	
	
	
	
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
	public ParteActivoFijoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParteActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParteActivoFijoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParteActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParteActivoFijoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParteActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParteActivoFijoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParteActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParteActivoFijo)	{
		this.jButtonRecargarInformacionParteActivoFijo = jButtonRecargarInformacionParteActivoFijo;
	}
	
	public JButton getjButtonProcesarInformacionParteActivoFijo() {
		return this.jButtonProcesarInformacionParteActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParteActivoFijo)	{
		this.jButtonProcesarInformacionParteActivoFijo = jButtonProcesarInformacionParteActivoFijo;
	}
	
	
	public JButton getjButtonRecargarInformacionParteActivoFijo() {
		return this.jButtonRecargarInformacionParteActivoFijo;
	}
	
	
	public List<ParteActivoFijo> getparteactivofijos() {
		return this.parteactivofijos;
	}

	public void setparteactivofijos(List<ParteActivoFijo> parteactivofijos) {
		this.parteactivofijos = parteactivofijos;
	}
	
	public List<ParteActivoFijo> getparteactivofijosAux() {
		return this.parteactivofijosAux;
	}

	public void setparteactivofijosAux(List<ParteActivoFijo> parteactivofijosAux) {
		this.parteactivofijosAux = parteactivofijosAux;
	}
	
	public List<ParteActivoFijo> getparteactivofijosEliminados() {
		return this.parteactivofijosEliminados;
	}

	public void setParteActivoFijosEliminados(List<ParteActivoFijo> parteactivofijosEliminados) {
		this.parteactivofijosEliminados = parteactivofijosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParteActivoFijo() {
		return jComboBoxTiposSeleccionarParteActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParteActivoFijo(
			JComboBox jComboBoxTiposSeleccionarParteActivoFijo) {
		this.jComboBoxTiposSeleccionarParteActivoFijo = jComboBoxTiposSeleccionarParteActivoFijo;
	}
	
	public void setBorderResaltarTiposSeleccionarParteActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParteActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParteActivoFijo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParteActivoFijo() {
		return jTextFieldValorCampoGeneralParteActivoFijo;
	}

	public void setjTextFieldValorCampoGeneralParteActivoFijo(
			JTextField jTextFieldValorCampoGeneralParteActivoFijo) {
		this.jTextFieldValorCampoGeneralParteActivoFijo = jTextFieldValorCampoGeneralParteActivoFijo;
	}

	public void setBorderResaltarValorCampoGeneralParteActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParteActivoFijo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParteActivoFijo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParteActivoFijo() {
		return this.jCheckBoxSeleccionarTodosParteActivoFijo;
	}

	public void setjCheckBoxSeleccionarTodosParteActivoFijo(
			JCheckBox jCheckBoxSeleccionarTodosParteActivoFijo) {
		this.jCheckBoxSeleccionarTodosParteActivoFijo = jCheckBoxSeleccionarTodosParteActivoFijo;
	}

	public void setBorderResaltarSeleccionarTodosParteActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParteActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParteActivoFijo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParteActivoFijo() {
		return this.jCheckBoxSeleccionadosParteActivoFijo;
	}

	public void setjCheckBoxSeleccionadosParteActivoFijo(
			JCheckBox jCheckBoxSeleccionadosParteActivoFijo) {
		this.jCheckBoxSeleccionadosParteActivoFijo = jCheckBoxSeleccionadosParteActivoFijo;
	}
	
	public void setBorderResaltarSeleccionadosParteActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParteActivoFijo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParteActivoFijo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParteActivoFijo() {
		return this.jComboBoxTiposArchivosReportesParteActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParteActivoFijo(
			JComboBox jComboBoxTiposArchivosReportesParteActivoFijo) {
		this.jComboBoxTiposArchivosReportesParteActivoFijo = jComboBoxTiposArchivosReportesParteActivoFijo;
	}

	public void setBorderResaltarTiposArchivosReportesParteActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParteActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParteActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParteActivoFijo() {
		return this.jComboBoxTiposReportesParteActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParteActivoFijo(
			JComboBox jComboBoxTiposReportesParteActivoFijo) {
		this.jComboBoxTiposReportesParteActivoFijo = jComboBoxTiposReportesParteActivoFijo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParteActivoFijo() {
	//	return jComboBoxTiposReportesDinamicoParteActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParteActivoFijo(
	//		JComboBox jComboBoxTiposReportesDinamicoParteActivoFijo) {
	//	this.jComboBoxTiposReportesDinamicoParteActivoFijo = jComboBoxTiposReportesDinamicoParteActivoFijo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParteActivoFijo() {
	//	return jComboBoxTiposArchivosReportesDinamicoParteActivoFijo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParteActivoFijo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParteActivoFijo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParteActivoFijo = jComboBoxTiposArchivosReportesDinamicoParteActivoFijo;
	//}
	
	public void setBorderResaltarTiposReportesParteActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParteActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParteActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParteActivoFijo() {
		return this.jComboBoxTiposGraficosReportesParteActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParteActivoFijo(
			JComboBox jComboBoxTiposGraficosReportesParteActivoFijo) {
		this.jComboBoxTiposGraficosReportesParteActivoFijo = jComboBoxTiposGraficosReportesParteActivoFijo;
	}
	
	public void setBorderResaltarTiposGraficosReportesParteActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParteActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParteActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParteActivoFijo() {
		return this.jComboBoxTiposPaginacionParteActivoFijo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParteActivoFijo(
			JComboBox jComboBoxTiposPaginacionParteActivoFijo) {
		this.jComboBoxTiposPaginacionParteActivoFijo = jComboBoxTiposPaginacionParteActivoFijo;
	}
	
	public void setBorderResaltarTiposPaginacionParteActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParteActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParteActivoFijo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParteActivoFijo() {
		return this.jComboBoxTiposRelacionesParteActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParteActivoFijo() {
		return this.jComboBoxTiposAccionesParteActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParteActivoFijo(
			JComboBox jComboBoxTiposRelacionesParteActivoFijo) {
		this.jComboBoxTiposRelacionesParteActivoFijo = jComboBoxTiposRelacionesParteActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParteActivoFijo(
			JComboBox jComboBoxTiposAccionesParteActivoFijo) {
		this.jComboBoxTiposAccionesParteActivoFijo = jComboBoxTiposAccionesParteActivoFijo;
	}
	
	public void setBorderResaltarTiposRelacionesParteActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParteActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParteActivoFijo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParteActivoFijo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParteActivoFijo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParteActivoFijo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParteActivoFijo() {
	//	return jCheckBoxConGraficoDinamicoParteActivoFijo;
	//}

	//public void setjCheckBoxConGraficoDinamicoParteActivoFijo(
	//		JCheckBox jCheckBoxConGraficoDinamicoParteActivoFijo) {
	//	this.jCheckBoxConGraficoDinamicoParteActivoFijo = jCheckBoxConGraficoDinamicoParteActivoFijo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParteActivoFijo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParteActivoFijo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParteActivoFijo .setBorder(borderResaltar);		
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
		this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
		
		this.parteactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parteactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parteactivofijoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParteActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParteActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParteActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParteActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParteActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parte Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
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
		
		ParteActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParteActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParteActivoFijo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParteActivoFijo,this.jTtoolBarParteActivoFijo,
							"nuevo","nuevo","Nuevo"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParteActivoFijo,this.jTtoolBarParteActivoFijo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParteActivoFijo,this.jTtoolBarParteActivoFijo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParteActivoFijo,this.jTtoolBarParteActivoFijo,
							"duplicar","duplicar","Duplicar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParteActivoFijo,this.jTtoolBarParteActivoFijo,
							"copiar","copiar","Copiar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParteActivoFijo,this.jTtoolBarParteActivoFijo,
							"ver_form","ver_form","Ver"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParteActivoFijo,this.jTtoolBarParteActivoFijo,
							"recargar","recargar","Recargar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParteActivoFijo,this.jTtoolBarParteActivoFijo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParteActivoFijo,this.jTtoolBarParteActivoFijo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParteActivoFijo,this.jTtoolBarParteActivoFijo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParteActivoFijo,this.jTtoolBarParteActivoFijo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParteActivoFijo,this.jTtoolBarParteActivoFijo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParteActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParteActivoFijo,this.jTtoolBarParteActivoFijo,
							"cerrar","cerrar","Salir"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParteActivoFijo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParteActivoFijo;
			
				this.jButtonProcesarInformacionToolBarParteActivoFijo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParteActivoFijo;
				
		//protected JButton jButtonModificarToolBarParteActivoFijo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParteActivoFijo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParteActivoFijo=new JMenuMe("General");
		this.jmenuArchivoParteActivoFijo=new JMenuMe("Archivo");
		this.jmenuAccionesParteActivoFijo=new JMenuMe("Acciones");
		this.jmenuDatosParteActivoFijo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParteActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParteActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParteActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParteActivoFijo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParteActivoFijo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParteActivoFijo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParteActivoFijo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParteActivoFijo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParteActivoFijo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParteActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParteActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParteActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParteActivoFijo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParteActivoFijo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParteActivoFijo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParteActivoFijo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParteActivoFijo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParteActivoFijo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParteActivoFijo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParteActivoFijo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParteActivoFijo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParteActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParteActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParteActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParteActivoFijo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParteActivoFijo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParteActivoFijo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParteActivoFijo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParteActivoFijo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParteActivoFijo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParteActivoFijo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParteActivoFijo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParteActivoFijo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParteActivoFijo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParteActivoFijo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParteActivoFijo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParteActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParteActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParteActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParteActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParteActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParteActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParteActivoFijo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParteActivoFijo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParteActivoFijo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParteActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParteActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParteActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParteActivoFijo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParteActivoFijo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParteActivoFijo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParteActivoFijo.add(this.jMenuItemCerrarParteActivoFijo);
			
			this.jmenuAccionesParteActivoFijo.add(this.jMenuItemNuevoParteActivoFijo);
			this.jmenuAccionesParteActivoFijo.add(this.jMenuItemNuevoGuardarCambiosParteActivoFijo);
			this.jmenuAccionesParteActivoFijo.add(this.jMenuItemNuevoRelacionesParteActivoFijo);
			this.jmenuAccionesParteActivoFijo.add(this.jMenuItemGuardarCambiosTablaParteActivoFijo);		
			this.jmenuAccionesParteActivoFijo.add(this.jMenuItemDuplicarParteActivoFijo);		
			this.jmenuAccionesParteActivoFijo.add(this.jMenuItemCopiarParteActivoFijo);		
			this.jmenuAccionesParteActivoFijo.add(this.jMenuItemVerFormParteActivoFijo);		
			
			this.jmenuDatosParteActivoFijo.add(this.jMenuItemRecargarInformacionParteActivoFijo);				
			this.jmenuDatosParteActivoFijo.add(this.jMenuItemAnterioresParteActivoFijo);				
			this.jmenuDatosParteActivoFijo.add(this.jMenuItemSiguientesParteActivoFijo);				
			this.jmenuDatosParteActivoFijo.add(this.jMenuItemAbrirOrderByParteActivoFijo);				
			this.jmenuDatosParteActivoFijo.add(this.jMenuItemMostrarOcultarParteActivoFijo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParteActivoFijo.add(this.jMenuItemGuardarCambiosParteActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParteActivoFijo.add(this.jmenuArchivoParteActivoFijo);		
			this.jmenuBarParteActivoFijo.add(this.jmenuAccionesParteActivoFijo);		
			this.jmenuBarParteActivoFijo.add(this.jmenuDatosParteActivoFijo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParteActivoFijo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParteActivoFijo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdDetalleActivoFijoParteActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleActivoFijoParteActivoFijo.setToolTipText("Buscar Por Detalle Activo Fijo ");
		this.jButtonFK_IdDetalleActivoFijoParteActivoFijo= new JButtonMe();
		this.jButtonFK_IdDetalleActivoFijoParteActivoFijo.setText("Buscar");
		this.jButtonFK_IdDetalleActivoFijoParteActivoFijo.setToolTipText("Buscar Por Detalle Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleActivoFijoParteActivoFijo,"buscar_button","Buscar Por Detalle Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleActivoFijoParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo = new JLabelMe();
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.setText("Detalle Activo Fijo :");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.setToolTipText("Detalle Activo Fijo");
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoActivoFijoParteActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoActivoFijoParteActivoFijo.setToolTipText("Buscar Por Estado Activo Fijo ");
		this.jButtonFK_IdEstadoActivoFijoParteActivoFijo= new JButtonMe();
		this.jButtonFK_IdEstadoActivoFijoParteActivoFijo.setText("Buscar");
		this.jButtonFK_IdEstadoActivoFijoParteActivoFijo.setToolTipText("Buscar Por Estado Activo Fijo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoActivoFijoParteActivoFijo,"buscar_button","Buscar Por Estado Activo Fijo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoActivoFijoParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo = new JLabelMe();
		jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.setText("Estado Activo Fijo :");
		jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.setToolTipText("Estado Activo Fijo");
		jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo= new JComboBoxMe();
		jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParteActivoFijo=new JTabbedPane();


		this.jTabbedPaneBusquedasParteActivoFijo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasParteActivoFijo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasParteActivoFijo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParteActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParteActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParteActivoFijo = new ParteActivoFijoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parte Activo Fijo DATOS");
			this.jInternalFrameDetalleFormParteActivoFijo = new ParteActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.parteactivofijoSessionBean.getConGuardarRelaciones(),this.parteactivofijoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParteActivoFijo = null;//new ParteActivoFijoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParteActivoFijo= new GridBagLayout();
		
		
		this.jTableDatosParteActivoFijo = new JTableMe();      
		
		String sToolTipParteActivoFijo="";
		sToolTipParteActivoFijo=ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParteActivoFijo+="(ActivosFijos.ParteActivoFijo)";
		}
		
		if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParteActivoFijo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParteActivoFijo.setToolTipText(sToolTipParteActivoFijo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParteActivoFijo);
		this.jTableDatosParteActivoFijo.setAutoCreateRowSorter(true);
		this.jTableDatosParteActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParteActivoFijo.setRowSelectionAllowed(true);
		this.jTableDatosParteActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParteActivoFijo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParteActivoFijo = new JButtonMe();
		this.jButtonDuplicarParteActivoFijo = new JButtonMe();
		this.jButtonCopiarParteActivoFijo = new JButtonMe();
		this.jButtonVerFormParteActivoFijo = new JButtonMe();
		this.jButtonNuevoRelacionesParteActivoFijo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParteActivoFijo = new JButtonMe();
		this.jButtonCerrarParteActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosParteActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosGeneralParteActivoFijo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParteActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Parte Activo Fijo";
		
		if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parte Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosParteActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParteActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesParteActivoFijo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoParteActivoFijo=new ReporteDinamicoJInternalFrame(ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParteActivoFijo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParteActivoFijo=new ImportacionJInternalFrame(ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParteActivoFijo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParteActivoFijo = new JButtonMe();
		
		this.jButtonAbrirOrderByParteActivoFijo.setText("Orden");
		this.jButtonAbrirOrderByParteActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParteActivoFijo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParteActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParteActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParteActivoFijo,false,this);
			
			//this.cargarOrderByParteActivoFijo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParteActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParteActivoFijo,true,this);
			
			//this.cargarOrderByParteActivoFijo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParteActivoFijo.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosParteActivoFijo.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosParteActivoFijo.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosParteActivoFijo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParteActivoFijo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParteActivoFijo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParteActivoFijo.setText("Nuevo");
		this.jButtonDuplicarParteActivoFijo.setText("Duplicar");
		this.jButtonCopiarParteActivoFijo.setText("Copiar");
		this.jButtonVerFormParteActivoFijo.setText("Ver");
		this.jButtonNuevoRelacionesParteActivoFijo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParteActivoFijo.setText("Guardar");
		this.jButtonCerrarParteActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParteActivoFijo,"nuevo_button","Nuevo",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParteActivoFijo,"duplicar_button","Duplicar",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParteActivoFijo,"copiar_button","Copiar",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParteActivoFijo,"ver_form","Ver",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParteActivoFijo,"nuevorelaciones_button","Nuevo Rel",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParteActivoFijo,"guardarcambiostabla_button","Guardar",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParteActivoFijo,"cerrar_button","Salir",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParteActivoFijo.setToolTipText("Nuevo"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParteActivoFijo.setToolTipText("Duplicar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParteActivoFijo.setToolTipText("Copiar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParteActivoFijo.setToolTipText("Ver"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParteActivoFijo.setToolTipText("Nuevo Rel"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParteActivoFijo.setToolTipText("Guardar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParteActivoFijo.setToolTipText("Salir"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParteActivoFijo";
		inputMap = this.jButtonNuevoParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParteActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParteActivoFijo"));
		
		//DUPLICAR
		sMapKey = "DuplicarParteActivoFijo";
		inputMap = this.jButtonDuplicarParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParteActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParteActivoFijo"));
		
		//COPIAR
		sMapKey = "CopiarParteActivoFijo";
		inputMap = this.jButtonCopiarParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParteActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParteActivoFijo"));
		
		//VEr FORM
		sMapKey = "VerFormParteActivoFijo";
		inputMap = this.jButtonVerFormParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParteActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParteActivoFijo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParteActivoFijo";
		inputMap = this.jButtonNuevoRelacionesParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParteActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParteActivoFijo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParteActivoFijo";
		inputMap = this.jButtonModificarParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParteActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParteActivoFijo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParteActivoFijo";
		inputMap = this.jButtonCerrarParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParteActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParteActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParteActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParteActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParteActivoFijo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParteActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParteActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParteActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParteActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParteActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParteActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParteActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParteActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParteActivoFijo.setName("jPanelParametrosReportesParteActivoFijo"); 
		
		this.jPanelParametrosReportesAccionesParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParteActivoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParteActivoFijo.setName("jPanelParametrosReportesAccionesParteActivoFijo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParteActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParteActivoFijo = new JButtonMe();
		this.jButtonRecargarInformacionParteActivoFijo.setText("Recargar");
		this.jButtonRecargarInformacionParteActivoFijo.setToolTipText("Recargar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParteActivoFijo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParteActivoFijo = new JButtonMe();
		this.jButtonProcesarInformacionParteActivoFijo.setText("Procesar");
		this.jButtonProcesarInformacionParteActivoFijo.setToolTipText("Procesar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParteActivoFijo.setVisible(false);
			
		this.jButtonProcesarInformacionParteActivoFijo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParteActivoFijo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParteActivoFijo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParteActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParteActivoFijo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParteActivoFijo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParteActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParteActivoFijo.setText("TIPO");       
		this.jComboBoxTiposReportesParteActivoFijo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParteActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParteActivoFijo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParteActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParteActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParteActivoFijo.setText("Paginacion");
		this.jComboBoxTiposPaginacionParteActivoFijo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParteActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParteActivoFijo.setText("Accion");
		this.jComboBoxTiposRelacionesParteActivoFijo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParteActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParteActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesParteActivoFijo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParteActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParteActivoFijo.setText("Accion");
		this.jComboBoxTiposSeleccionarParteActivoFijo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParteActivoFijo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParteActivoFijo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParteActivoFijo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParteActivoFijo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParteActivoFijo = new JLabelMe();
		
		this.jLabelAccionesParteActivoFijo.setText("Acciones");		
		this.jLabelAccionesParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParteActivoFijo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParteActivoFijo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParteActivoFijo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParteActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParteActivoFijo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParteActivoFijo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParteActivoFijo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParteActivoFijo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParteActivoFijo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParteActivoFijo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParteActivoFijo.setText("Graf.");
		this.jCheckBoxConGraficoReporteParteActivoFijo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParteActivoFijo = new JButtonMe();
		//this.jButtonAnterioresParteActivoFijo.setText("<<");
        this.jButtonAnterioresParteActivoFijo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParteActivoFijo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParteActivoFijo = new JButtonMe();
		//this.jButtonSiguientesParteActivoFijo.setText(">>");
        this.jButtonSiguientesParteActivoFijo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParteActivoFijo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParteActivoFijo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParteActivoFijo.setText("Nue");
        this.jButtonNuevoGuardarCambiosParteActivoFijo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParteActivoFijo,"nuevoguardarcambios_button","Nue",this.parteactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParteActivoFijo";
		inputMap = this.jButtonNuevoGuardarCambiosParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParteActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParteActivoFijo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParteActivoFijo";
		inputMap = this.jButtonRecargarInformacionParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParteActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParteActivoFijo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParteActivoFijo";
		inputMap = this.jButtonSiguientesParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParteActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParteActivoFijo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParteActivoFijo";
		inputMap = this.jButtonAnterioresParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParteActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParteActivoFijo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParteActivoFijo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParteActivoFijo.setMinimumSize(new Dimension(this.getWidth(),ParteActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParteActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParteActivoFijo.setMaximumSize(new Dimension(this.getWidth(),ParteActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParteActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParteActivoFijo.setPreferredSize(new Dimension(this.getWidth(),ParteActivoFijoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParteActivoFijoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParteActivoFijo = new GridBagLayout();

			this.jPanelPaginacionParteActivoFijo.setLayout(gridaBagLayoutPaginacionParteActivoFijo);						
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.gridy = 0;
			this.gridBagConstraintsParteActivoFijo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParteActivoFijo.add(this.jButtonAnterioresParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
					
						
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParteActivoFijo.gridy = 0;
			
			this.jPanelPaginacionParteActivoFijo.add(this.jButtonNuevoGuardarCambiosParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
						
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParteActivoFijo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParteActivoFijo.gridy = 0;
			this.jPanelPaginacionParteActivoFijo.add(this.jButtonSiguientesParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.gridy = 1;
			this.gridBagConstraintsParteActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParteActivoFijo.add(this.jButtonNuevoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
						
			
			
			if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParteActivoFijo.gridy = 1;
				this.gridBagConstraintsParteActivoFijo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParteActivoFijo.add(this.jButtonGuardarCambiosTablaParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
			}
			
			
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.gridy = 1;
			this.gridBagConstraintsParteActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParteActivoFijo.add(this.jButtonDuplicarParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.gridy = 1;
			this.gridBagConstraintsParteActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParteActivoFijo.add(this.jButtonCopiarParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.gridy = 1;
			this.gridBagConstraintsParteActivoFijo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParteActivoFijo.add(this.jButtonVerFormParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.gridy = 1;
			this.gridBagConstraintsParteActivoFijo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParteActivoFijo.add(this.jButtonCerrarParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		
		
		
		this.jButtonRecargarInformacionParteActivoFijo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParteActivoFijo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParteActivoFijo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParteActivoFijo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParteActivoFijo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParteActivoFijo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParteActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParteActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParteActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParteActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParteActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParteActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParteActivoFijo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParteActivoFijo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParteActivoFijo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParteActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParteActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParteActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParteActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParteActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParteActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParteActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParteActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParteActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParteActivoFijo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParteActivoFijo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParteActivoFijo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParteActivoFijo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParteActivoFijo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParteActivoFijo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParteActivoFijo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParteActivoFijo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParteActivoFijo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParteActivoFijo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParteActivoFijo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParteActivoFijo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParteActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParteActivoFijo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParteActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParteActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParteActivoFijo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParteActivoFijo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParteActivoFijo.setLayout(gridaBagParametrosReportesParteActivoFijo);
			this.jPanelParametrosReportesAccionesParteActivoFijo.setLayout(gridaBagParametrosReportesAccionesParteActivoFijo);
			
			
			this.jPanelParametrosAuxiliar1ParteActivoFijo.setLayout(gridaBagParametrosAuxiliar1ParteActivoFijo);
			this.jPanelParametrosAuxiliar2ParteActivoFijo.setLayout(gridaBagParametrosAuxiliar2ParteActivoFijo);
			this.jPanelParametrosAuxiliar3ParteActivoFijo.setLayout(gridaBagParametrosAuxiliar3ParteActivoFijo);
			this.jPanelParametrosAuxiliar4ParteActivoFijo.setLayout(gridaBagParametrosAuxiliar4ParteActivoFijo);
			//this.jPanelParametrosAuxiliar5ParteActivoFijo.setLayout(gridaBagParametrosAuxiliar2ParteActivoFijo);			
			
			
			
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParteActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParteActivoFijo.add(this.jButtonRecargarInformacionParteActivoFijo, this.gridBagConstraintsParteActivoFijo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParteActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParteActivoFijo.add(this.jComboBoxTiposPaginacionParteActivoFijo, this.gridBagConstraintsParteActivoFijo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParteActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParteActivoFijo.add(this.jCheckBoxConAltoMaximoTablaParteActivoFijo, this.gridBagConstraintsParteActivoFijo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParteActivoFijo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParteActivoFijo.add(this.jComboBoxTiposArchivosReportesParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParteActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParteActivoFijo.add(this.jPanelParametrosAuxiliar1ParteActivoFijo, this.gridBagConstraintsParteActivoFijo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParteActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParteActivoFijo.add(this.jComboBoxTiposReportesParteActivoFijo, this.gridBagConstraintsParteActivoFijo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParteActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParteActivoFijo.add(this.jPanelParametrosAuxiliar4ParteActivoFijo, this.gridBagConstraintsParteActivoFijo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParteActivoFijo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParteActivoFijo.add(this.jComboBoxTiposReportesParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParteActivoFijo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParteActivoFijo.add(this.jCheckBoxGenerarReporteParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParteActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParteActivoFijo.add(this.jPanelParametrosAuxiliar2ParteActivoFijo, this.gridBagConstraintsParteActivoFijo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParteActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParteActivoFijo.add(this.jLabelAccionesParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParteActivoFijo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParteActivoFijo.add(this.jButtonAbrirOrderByParteActivoFijo, this.gridBagConstraintsParteActivoFijo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParteActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParteActivoFijo.add(this.jComboBoxTiposSeleccionarParteActivoFijo, this.gridBagConstraintsParteActivoFijo);			
			
			
			/*
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParteActivoFijo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParteActivoFijo.add(this.jCheckBoxSeleccionarTodosParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParteActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParteActivoFijo.add(this.jCheckBoxSeleccionarTodosParteActivoFijo, this.gridBagConstraintsParteActivoFijo);															
				
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParteActivoFijo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParteActivoFijo.add(this.jCheckBoxSeleccionadosParteActivoFijo, this.gridBagConstraintsParteActivoFijo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParteActivoFijo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParteActivoFijo.add(this.jPanelParametrosAuxiliar3ParteActivoFijo, this.gridBagConstraintsParteActivoFijo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParteActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParteActivoFijo.add(this.jComboBoxTiposAccionesParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
	
				
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParteActivoFijo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParteActivoFijo.add(this.jTextFieldValorCampoGeneralParteActivoFijo, this.gridBagConstraintsParteActivoFijo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParteActivoFijo = new GridBagLayout();

			this.jScrollPanelDatosParteActivoFijo.setLayout(gridaBagLayoutDatosParteActivoFijo);
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.gridy = 0;
			this.gridBagConstraintsParteActivoFijo.gridx = 0;
			
			this.jScrollPanelDatosParteActivoFijo.add(this.jTableDatosParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParteActivoFijo.setViewportView(this.jTableDatosParteActivoFijo);
		this.jTableDatosParteActivoFijo.setFillsViewportHeight(true);
		this.jTableDatosParteActivoFijo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParteActivoFijo= new GridBagLayout();
		this.jPanelAccionesParteActivoFijo.setLayout(gridaBagLayoutAccionesParteActivoFijo);
		
		
		/*	
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParteActivoFijo.gridy = 0;
		this.gridBagConstraintsParteActivoFijo.gridx = 0;
			
		this.jPanelAccionesParteActivoFijo.add(this.jButtonNuevoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdDetalleActivoFijoParteActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleActivoFijoParteActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoParteActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleActivoFijoParteActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleActivoFijoParteActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleActivoFijoParteActivoFijo.setLayout(gridaBagLayoutFK_IdDetalleActivoFijoParteActivoFijo);

		gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParteActivoFijo.gridy = 0;
		gridBagConstraintsParteActivoFijo.gridx = 0;
		jPanelFK_IdDetalleActivoFijoParteActivoFijo.add(jLabelid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo, gridBagConstraintsParteActivoFijo);

		gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParteActivoFijo.gridy = 0;
		gridBagConstraintsParteActivoFijo.gridx = 1;
		jPanelFK_IdDetalleActivoFijoParteActivoFijo.add(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoParteActivoFijo, gridBagConstraintsParteActivoFijo);

		gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParteActivoFijo.gridy = 1;
		gridBagConstraintsParteActivoFijo.gridx =1;
		jPanelFK_IdDetalleActivoFijoParteActivoFijo.add(jButtonFK_IdDetalleActivoFijoParteActivoFijo, gridBagConstraintsParteActivoFijo);

		jTabbedPaneBusquedasParteActivoFijo.addTab("1.-Por Detalle Activo Fijo ", jPanelFK_IdDetalleActivoFijoParteActivoFijo);
		jTabbedPaneBusquedasParteActivoFijo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstadoActivoFijoParteActivoFijo= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoActivoFijoParteActivoFijo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoActivoFijoParteActivoFijo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoActivoFijoParteActivoFijo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoActivoFijoParteActivoFijo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoActivoFijoParteActivoFijo.setLayout(gridaBagLayoutFK_IdEstadoActivoFijoParteActivoFijo);

		gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParteActivoFijo.gridy = 0;
		gridBagConstraintsParteActivoFijo.gridx = 0;
		jPanelFK_IdEstadoActivoFijoParteActivoFijo.add(jLabelid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo, gridBagConstraintsParteActivoFijo);

		gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParteActivoFijo.gridy = 0;
		gridBagConstraintsParteActivoFijo.gridx = 1;
		jPanelFK_IdEstadoActivoFijoParteActivoFijo.add(jComboBoxid_estado_activo_fijoFK_IdEstadoActivoFijoParteActivoFijo, gridBagConstraintsParteActivoFijo);

		gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParteActivoFijo.gridy = 1;
		gridBagConstraintsParteActivoFijo.gridx =1;
		jPanelFK_IdEstadoActivoFijoParteActivoFijo.add(jButtonFK_IdEstadoActivoFijoParteActivoFijo, gridBagConstraintsParteActivoFijo);

		jTabbedPaneBusquedasParteActivoFijo.addTab("2.-Por Estado Activo Fijo ", jPanelFK_IdEstadoActivoFijoParteActivoFijo);
		jTabbedPaneBusquedasParteActivoFijo.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParteActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParteActivoFijo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParteActivoFijo.gridx = 0;		
			//this.gridBagConstraintsParteActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParteActivoFijo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParteActivoFijo, this.gridBagConstraintsParteActivoFijo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParteActivoFijo.gridx = 0;		
		//this.gridBagConstraintsParteActivoFijo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParteActivoFijo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParteActivoFijo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsParteActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParteActivoFijo.gridx = 0;		
			this.gridBagConstraintsParteActivoFijo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsParteActivoFijo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasParteActivoFijo, this.gridBagConstraintsParteActivoFijo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParteActivoFijo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParteActivoFijo, this.gridBagConstraintsParteActivoFijo);								
		
		
		/*
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParteActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		*/		
		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParteActivoFijo.gridx =0;
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParteActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
				
		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParteActivoFijo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParteActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParteActivoFijo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParteActivoFijo = new GridBagLayout();
			this.jPanelBusquedasParametrosParteActivoFijo.setLayout(gridaBagLayoutBusquedasParametrosParteActivoFijo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParteActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParteActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParteActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParteActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParteActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
			
			
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParteActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		
			
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParteActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParteActivoFijo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParteActivoFijo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParteActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParteActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParteActivoFijo.setName("jPanelReporteDinamicoParteActivoFijo"); 
		
		this.jPanelReporteDinamicoParteActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParteActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParteActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParteActivoFijo.setLayout(gridaBagLayoutReporteDinamicoParteActivoFijo);
		
		
		this.jInternalFrameReporteDinamicoParteActivoFijo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParteActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParteActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParteActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParteActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParteActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParteActivoFijo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParteActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParteActivoFijo.setResizable(true);
	    this.jInternalFrameReporteDinamicoParteActivoFijo.setClosable(true);
	    this.jInternalFrameReporteDinamicoParteActivoFijo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParteActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParteActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParteActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parte Activo Fijos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParteActivoFijo = new JLabelMe();

		this.jLabelColumnasSelectReporteParteActivoFijo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParteActivoFijo.add(this.jLabelColumnasSelectReporteParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParteActivoFijo = new JList<Reporte>();
		this.jListColumnasSelectReporteParteActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParteActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParteActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParteActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParteActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParteActivoFijo=new JScrollPane(this.jListColumnasSelectReporteParteActivoFijo);
			
			this.jScrollColumnasSelectReporteParteActivoFijo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParteActivoFijo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParteActivoFijo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParteActivoFijo.add(this.jListColumnasSelectReporteParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		this.jPanelReporteDinamicoParteActivoFijo.add(this.jScrollColumnasSelectReporteParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParteActivoFijo = new JLabelMe();

		this.jLabelRelacionesSelectReporteParteActivoFijo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParteActivoFijo = new JList<Reporte>();
		this.jListRelacionesSelectReporteParteActivoFijo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParteActivoFijo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParteActivoFijo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParteActivoFijo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParteActivoFijo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParteActivoFijo=new JScrollPane(this.jListRelacionesSelectReporteParteActivoFijo);
			
			this.jScrollRelacionesSelectReporteParteActivoFijo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParteActivoFijo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParteActivoFijo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParteActivoFijo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParteActivoFijo = new JComboBoxMe();
		this.jListColumnasValoresGraficoParteActivoFijo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParteActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParteActivoFijo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParteActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParteActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParteActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParteActivoFijo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParteActivoFijo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParteActivoFijo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParteActivoFijo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParteActivoFijo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParteActivoFijo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParteActivoFijo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParteActivoFijo.add(this.jLabelGenerarExcelReporteDinamicoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParteActivoFijo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParteActivoFijo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParteActivoFijo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParteActivoFijo.setToolTipText("Generar EXCEL"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParteActivoFijo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParteActivoFijo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParteActivoFijo.add(this.jButtonGenerarExcelReporteDinamicoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParteActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParteActivoFijo.add(this.jComboBoxTiposReportesDinamicoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParteActivoFijo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParteActivoFijo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParteActivoFijo.add(this.jLabelTiposArchivoReporteDinamicoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParteActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParteActivoFijo.add(this.jComboBoxTiposArchivosReportesDinamicoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParteActivoFijo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParteActivoFijo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParteActivoFijo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParteActivoFijo.setToolTipText("Generar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParteActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParteActivoFijo.add(this.jButtonGenerarReporteDinamicoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParteActivoFijo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParteActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParteActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParteActivoFijo.setToolTipText("Cancelar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParteActivoFijo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParteActivoFijo.add(this.jButtonCerrarReporteDinamicoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParteActivoFijo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParteActivoFijo= new JScrollPane(jPanelReporteDinamicoParteActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParteActivoFijo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParteActivoFijo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParteActivoFijo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parte Activo Fijos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParteActivoFijo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParteActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParteActivoFijo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParteActivoFijo);
		this.jInternalFrameReporteDinamicoParteActivoFijo.getContentPane().add(this.jScrollPanelReporteDinamicoParteActivoFijo, this.gridBagConstraintsParteActivoFijo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParteActivoFijo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParteActivoFijo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParteActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParteActivoFijo.setName("jPanelImportacionParteActivoFijo"); 
		
		this.jPanelImportacionParteActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParteActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParteActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParteActivoFijo.setLayout(gridaBagLayoutImportacionParteActivoFijo);
		
		
		this.jInternalFrameImportacionParteActivoFijo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParteActivoFijo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParteActivoFijo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParteActivoFijo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParteActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParteActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParteActivoFijo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParteActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParteActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParteActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionParteActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionParteActivoFijo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParteActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParteActivoFijo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParteActivoFijo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParteActivoFijo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParteActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParteActivoFijo.setResizable(true);
	    this.jInternalFrameImportacionParteActivoFijo.setClosable(true);
	    this.jInternalFrameImportacionParteActivoFijo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParteActivoFijo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParteActivoFijo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParteActivoFijo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parte Activo Fijos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParteActivoFijo = new JLabelMe();

		this.jLabelArchivoImportacionParteActivoFijo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParteActivoFijo.add(this.jLabelArchivoImportacionParteActivoFijo, this.gridBagConstraintsParteActivoFijo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParteActivoFijo = new JFileChooser();		
		this.jFileChooserImportacionParteActivoFijo.setToolTipText("ESCOGER ARCHIVO"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParteActivoFijo = new JButtonMe();
		this.jButtonAbrirImportacionParteActivoFijo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParteActivoFijo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParteActivoFijo.setToolTipText("Generar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParteActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParteActivoFijo.add(this.jButtonAbrirImportacionParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParteActivoFijo = new JLabelMe();

		this.jLabelPathArchivoImportacionParteActivoFijo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParteActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParteActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParteActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParteActivoFijo.gridy = iPosYImportacion;		
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParteActivoFijo.add(this.jLabelPathArchivoImportacionParteActivoFijo, this.gridBagConstraintsParteActivoFijo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParteActivoFijo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParteActivoFijo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParteActivoFijo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParteActivoFijo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParteActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParteActivoFijo.add(this.jTextFieldPathArchivoImportacionParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParteActivoFijo = new JButtonMe();
		this.jButtonGenerarImportacionParteActivoFijo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParteActivoFijo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParteActivoFijo.setToolTipText("Generar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParteActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParteActivoFijo.add(this.jButtonGenerarImportacionParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParteActivoFijo = new JButtonMe();
		this.jButtonCerrarImportacionParteActivoFijo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParteActivoFijo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParteActivoFijo.setToolTipText("Cancelar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParteActivoFijo.gridy = iPosYImportacion;
		this.gridBagConstraintsParteActivoFijo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParteActivoFijo.add(this.jButtonCerrarImportacionParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParteActivoFijo = new GridBagLayout();
		
		this.jScrollPanelImportacionParteActivoFijo= new JScrollPane(jPanelImportacionParteActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsParteActivoFijo.gridy =iPosYImportacion;
		this.gridBagConstraintsParteActivoFijo.gridx =iPosXImportacion;
		this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParteActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParteActivoFijo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParteActivoFijo);
		this.jInternalFrameImportacionParteActivoFijo.getContentPane().add(this.jScrollPanelImportacionParteActivoFijo, this.gridBagConstraintsParteActivoFijo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParteActivoFijo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParteActivoFijo = new JButtonMe();
			this.jButtonAbrirOrderByParteActivoFijo.setText("Orden");
			this.jButtonAbrirOrderByParteActivoFijo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParteActivoFijo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParteActivoFijo";
			inputMap = this.jButtonAbrirOrderByParteActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParteActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParteActivoFijo"));
		
		
			GridBagLayout gridaBagLayoutOrderByParteActivoFijo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParteActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParteActivoFijo.setName("jPanelOrderByParteActivoFijo"); 
			
			this.jPanelOrderByParteActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParteActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParteActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParteActivoFijo.setLayout(gridaBagLayoutOrderByParteActivoFijo);
			
			
			this.jTableDatosParteActivoFijoOrderBy = new JTableMe();        
			this.jTableDatosParteActivoFijoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParteActivoFijoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParteActivoFijoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParteActivoFijoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParteActivoFijoOrderBy.setViewportView(this.jTableDatosParteActivoFijoOrderBy);
			this.jTableDatosParteActivoFijoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParteActivoFijoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParteActivoFijo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParteActivoFijo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParteActivoFijo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParteActivoFijo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParteActivoFijo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParteActivoFijo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParteActivoFijo.setTitle("Orden");
			this.jInternalFrameOrderByParteActivoFijo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParteActivoFijo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParteActivoFijo.setResizable(true);
			this.jInternalFrameOrderByParteActivoFijo.setClosable(true);
			this.jInternalFrameOrderByParteActivoFijo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParteActivoFijo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParteActivoFijo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParteActivoFijo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParteActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parte Activo Fijos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParteActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParteActivoFijo.ipady =150;
				
			this.jPanelOrderByParteActivoFijo.add(jScrollPanelDatosParteActivoFijoOrderBy, this.gridBagConstraintsParteActivoFijo);//this.jTableDatosParteActivoFijoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParteActivoFijo = new JButtonMe();
			this.jButtonCerrarOrderByParteActivoFijo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParteActivoFijo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParteActivoFijo.setToolTipText("Cancelar"+" "+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParteActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParteActivoFijo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParteActivoFijo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParteActivoFijo.add(this.jButtonCerrarOrderByParteActivoFijo, this.gridBagConstraintsParteActivoFijo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParteActivoFijo = new GridBagLayout();
			
			this.jScrollPanelOrderByParteActivoFijo= new JScrollPane(jPanelOrderByParteActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParteActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsParteActivoFijo.gridy =iPosYOrderBy;
			this.gridBagConstraintsParteActivoFijo.gridx =iPosXOrderBy;
			this.gridBagConstraintsParteActivoFijo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParteActivoFijo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParteActivoFijo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParteActivoFijo);
			
			this.jInternalFrameOrderByParteActivoFijo.getContentPane().add(this.jScrollPanelOrderByParteActivoFijo, this.gridBagConstraintsParteActivoFijo);			
		
		} else {
			this.jButtonAbrirOrderByParteActivoFijo = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parteactivofijoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParteActivoFijo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParteActivoFijo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParteActivoFijo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParteActivoFijo.getRowHeight();//ParteActivoFijoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParteActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParteActivoFijo.isSelected()) {
					iHeightTable=ParteActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParteActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParteActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParteActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParteActivoFijo.isSelected()) {
					iHeightTable=ParteActivoFijoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParteActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParteActivoFijoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParteActivoFijo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParteActivoFijo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParteActivoFijo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParteActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParteActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParteActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParteActivoFijo!=null && this.jInternalFrameOrderByParteActivoFijo.getjTableDatosOrderBy()!=null) {
			//if(!this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParteActivoFijo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParteActivoFijo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParteActivoFijo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParteActivoFijo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParteActivoFijo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParteActivoFijo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParteActivoFijo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParteActivoFijo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParteActivoFijo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParteActivoFijo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parteactivofijoLogic.getParteActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parteactivofijos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParteActivoFijo> TraerParteActivoFijoBeans(List<ParteActivoFijo> parteactivofijos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParteActivoFijo parteactivofijo:parteactivofijos) {
					
				if(!(ParteActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParteActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parteactivofijo.setsDetalleGeneralEntityReporte(ParteActivoFijoConstantesFunciones.getParteActivoFijoDescripcion(parteactivofijo));
										
						
					
						
					
				} else  {
							
					//parteactivofijo.setsDetalleGeneralEntityReporte(parteactivofijo.getsDetalleGeneralEntityReporte());
										
				}
				
				//parteactivofijobeans.add(parteactivofijobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parteactivofijos;
    }
	//PARA REPORTES FIN
}
