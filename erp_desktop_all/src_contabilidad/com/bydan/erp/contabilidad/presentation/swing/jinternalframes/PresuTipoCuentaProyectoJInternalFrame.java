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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.contabilidad.util.PresuTipoCuentaProyectoConstantesFunciones;

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
public class PresuTipoCuentaProyectoJInternalFrame extends PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPresuTipoCuentaProyecto;
	
	protected JMenuBar jmenuBarPresuTipoCuentaProyecto;
	
	protected JMenu jmenuPresuTipoCuentaProyecto;
	protected JMenu jmenuDatosPresuTipoCuentaProyecto;
	protected JMenu jmenuArchivoPresuTipoCuentaProyecto;
	protected JMenu jmenuAccionesPresuTipoCuentaProyecto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPresuTipoCuentaProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresuTipoCuentaProyecto;	
	protected GridBagConstraints gridBagConstraintsPresuTipoCuentaProyecto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PresuTipoCuentaProyectoDetalleFormJInternalFrame jInternalFrameDetalleFormPresuTipoCuentaProyecto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPresuTipoCuentaProyecto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPresuTipoCuentaProyecto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PresuTipoCuentaProyectoSessionBean presutipocuentaproyectoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PresuTipoCuentaProyecto> presutipocuentaproyectos;		
	public List<PresuTipoCuentaProyecto> presutipocuentaproyectosEliminados;	
	public List<PresuTipoCuentaProyecto> presutipocuentaproyectosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPresuTipoCuentaProyecto;		
	protected JButton jButtonAbrirOrderByPresuTipoCuentaProyecto;
	
	
	//protected JPanel jPanelOrderByPresuTipoCuentaProyecto;
	//public JScrollPane jScrollPanelOrderByPresuTipoCuentaProyecto;	
	//protected JButton jButtonCerrarOrderByPresuTipoCuentaProyecto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PresuTipoCuentaProyectoLogic presutipocuentaproyectoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPresuTipoCuentaProyecto;
	public JScrollPane jScrollPanelDatosEdicionPresuTipoCuentaProyecto;
	public JScrollPane jScrollPanelDatosGeneralPresuTipoCuentaProyecto;
    
	
	
	//public JScrollPane jScrollPanelDatosPresuTipoCuentaProyectoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPresuTipoCuentaProyecto;
	//public JScrollPane jScrollPanelImportacionPresuTipoCuentaProyecto;
	
	
	
	protected JPanel jPanelAccionesPresuTipoCuentaProyecto;
	
    protected JPanel jPanelPaginacionPresuTipoCuentaProyecto;
    protected JPanel jPanelParametrosReportesPresuTipoCuentaProyecto;
	protected JPanel jPanelParametrosReportesAccionesPresuTipoCuentaProyecto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PresuTipoCuentaProyecto;
	protected JPanel jPanelParametrosAuxiliar2PresuTipoCuentaProyecto;
	protected JPanel jPanelParametrosAuxiliar3PresuTipoCuentaProyecto;
	protected JPanel jPanelParametrosAuxiliar4PresuTipoCuentaProyecto;
	//protected JPanel jPanelParametrosAuxiliar5PresuTipoCuentaProyecto;
	
	
	
	//protected JPanel jPanelReporteDinamicoPresuTipoCuentaProyecto;
	//protected JPanel jPanelImportacionPresuTipoCuentaProyecto;
	
	
	public JTable jTableDatosPresuTipoCuentaProyecto;
	
	
	
	//public JTable jTableDatosPresuTipoCuentaProyectoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPresuTipoCuentaProyecto;
	protected JButton jButtonDuplicarPresuTipoCuentaProyecto;
	protected JButton jButtonCopiarPresuTipoCuentaProyecto;
	protected JButton jButtonVerFormPresuTipoCuentaProyecto;
	protected JButton jButtonNuevoRelacionesPresuTipoCuentaProyecto;
	protected JButton jButtonModificarPresuTipoCuentaProyecto;
	
    protected JButton jButtonGuardarCambiosTablaPresuTipoCuentaProyecto;
	protected JButton jButtonCerrarPresuTipoCuentaProyecto;
	
	
	protected JButton jButtonRecargarInformacionPresuTipoCuentaProyecto;
	protected JButton jButtonProcesarInformacionPresuTipoCuentaProyecto;
	
	
	protected JButton jButtonAnterioresPresuTipoCuentaProyecto;
	protected JButton jButtonSiguientesPresuTipoCuentaProyecto;
	protected JButton jButtonNuevoGuardarCambiosPresuTipoCuentaProyecto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPresuTipoCuentaProyecto;
	//protected JButton jButtonCerrarReporteDinamicoPresuTipoCuentaProyecto;
	//protected JButton jButtonGenerarExcelReporteDinamicoPresuTipoCuentaProyecto;	
	
	
	
	//protected JButton jButtonAbrirImportacionPresuTipoCuentaProyecto;
	//protected JButton jButtonGenerarImportacionPresuTipoCuentaProyecto;
	//protected JButton jButtonCerrarImportacionPresuTipoCuentaProyecto;
	//protected JFileChooser jFileChooserImportacionPresuTipoCuentaProyecto;
	//protected File fileImportacionPresuTipoCuentaProyecto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonDuplicarToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonNuevoRelacionesToolBarPresuTipoCuentaProyecto;
	
	
	public JButton jButtonGuardarCambiosToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonCopiarToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonVerFormToolBarPresuTipoCuentaProyecto;
	public JButton jButtonGuardarCambiosTablaToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonMostrarOcultarTablaToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonCerrarToolBarPresuTipoCuentaProyecto;
	
	protected JButton jButtonRecargarInformacionToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonProcesarInformacionToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonAnterioresToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonSiguientesToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonNuevoGuardarCambiosToolBarPresuTipoCuentaProyecto;
	protected JButton jButtonAbrirOrderByToolBarPresuTipoCuentaProyecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemDuplicarPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemNuevoRelacionesPresuTipoCuentaProyecto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemCopiarPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemVerFormPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemCerrarPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemDetalleCerrarPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresuTipoCuentaProyecto;
	
	protected JMenuItem jMenuItemRecargarInformacionPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemProcesarInformacionPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemAnterioresPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemSiguientesPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemAbrirOrderByPresuTipoCuentaProyecto;
	protected JMenuItem jMenuItemMostrarOcultarPresuTipoCuentaProyecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresuTipoCuentaProyecto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto;
	protected JCheckBox jCheckBoxSeleccionadosPresuTipoCuentaProyecto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPresuTipoCuentaProyecto;
	protected JCheckBox jCheckBoxConGraficoReportePresuTipoCuentaProyecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPresuTipoCuentaProyecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPresuTipoCuentaProyecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPresuTipoCuentaProyecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPresuTipoCuentaProyecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPresuTipoCuentaProyecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresuTipoCuentaProyecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresuTipoCuentaProyecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPresuTipoCuentaProyecto;
	protected JTextField jTextFieldValorCampoGeneralPresuTipoCuentaProyecto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePresuTipoCuentaProyecto;
	//public JList<Reporte> jListColumnasSelectReportePresuTipoCuentaProyecto;
	//public JScrollPane jScrollColumnasSelectReportePresuTipoCuentaProyecto;
	
	//public JLabel jLabelRelacionesSelectReportePresuTipoCuentaProyecto;
	//public JList<Reporte> jListRelacionesSelectReportePresuTipoCuentaProyecto;
	//public JScrollPane jScrollRelacionesSelectReportePresuTipoCuentaProyecto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPresuTipoCuentaProyecto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPresuTipoCuentaProyecto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPresuTipoCuentaProyecto;
	//public JLabel jLabelTiposArchivoReporteDinamicoPresuTipoCuentaProyecto;
	
		
	//public JLabel jLabelArchivoImportacionPresuTipoCuentaProyecto;	
	//public JLabel jLabelPathArchivoImportacionPresuTipoCuentaProyecto;
	//protected JTextField jTextFieldPathArchivoImportacionPresuTipoCuentaProyecto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPresuTipoCuentaProyecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPresuTipoCuentaProyecto;
	
	//public JLabel jLabelColumnaCategoriaValorPresuTipoCuentaProyecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPresuTipoCuentaProyecto;
	
	//public JLabel jLabelColumnasValoresGraficoPresuTipoCuentaProyecto;
	//public JList<Reporte> jListColumnasValoresGraficoPresuTipoCuentaProyecto;
	//public JScrollPane jScrollColumnasValoresGraficoPresuTipoCuentaProyecto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPresuTipoCuentaProyecto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPresuTipoCuentaProyecto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPresuTipoCuentaProyecto;
	public JPanel jPanelBusquedaPorCodigoPresuTipoCuentaProyecto;
	public JButton jButtonBusquedaPorCodigoPresuTipoCuentaProyecto;
	public JPanel jPanelBusquedaPorNombrePresuTipoCuentaProyecto;
	public JButton jButtonBusquedaPorNombrePresuTipoCuentaProyecto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoPresuTipoCuentaProyecto;
	public JLabel jLabelcodigoBusquedaPorCodigoPresuTipoCuentaProyecto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoPresuTipoCuentaProyecto;
	public JButton jButtoncodigoBusquedaPorCodigoPresuTipoCuentaProyectoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombrePresuTipoCuentaProyecto;
	public JLabel jLabelnombreBusquedaPorNombrePresuTipoCuentaProyecto;
	public JTextArea jTextAreanombreBusquedaPorNombrePresuTipoCuentaProyecto;
	public JButton jButtonnombreBusquedaPorNombrePresuTipoCuentaProyectoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PresuTipoCuentaProyectoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PresuTipoCuentaProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTipoCuentaProyectoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuTipoCuentaProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTipoCuentaProyectoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuTipoCuentaProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTipoCuentaProyectoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresuTipoCuentaProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPresuTipoCuentaProyecto)	{
		this.jButtonRecargarInformacionPresuTipoCuentaProyecto = jButtonRecargarInformacionPresuTipoCuentaProyecto;
	}
	
	public JButton getjButtonProcesarInformacionPresuTipoCuentaProyecto() {
		return this.jButtonProcesarInformacionPresuTipoCuentaProyecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresuTipoCuentaProyecto)	{
		this.jButtonProcesarInformacionPresuTipoCuentaProyecto = jButtonProcesarInformacionPresuTipoCuentaProyecto;
	}
	
	
	public JButton getjButtonRecargarInformacionPresuTipoCuentaProyecto() {
		return this.jButtonRecargarInformacionPresuTipoCuentaProyecto;
	}
	
	
	public List<PresuTipoCuentaProyecto> getpresutipocuentaproyectos() {
		return this.presutipocuentaproyectos;
	}

	public void setpresutipocuentaproyectos(List<PresuTipoCuentaProyecto> presutipocuentaproyectos) {
		this.presutipocuentaproyectos = presutipocuentaproyectos;
	}
	
	public List<PresuTipoCuentaProyecto> getpresutipocuentaproyectosAux() {
		return this.presutipocuentaproyectosAux;
	}

	public void setpresutipocuentaproyectosAux(List<PresuTipoCuentaProyecto> presutipocuentaproyectosAux) {
		this.presutipocuentaproyectosAux = presutipocuentaproyectosAux;
	}
	
	public List<PresuTipoCuentaProyecto> getpresutipocuentaproyectosEliminados() {
		return this.presutipocuentaproyectosEliminados;
	}

	public void setPresuTipoCuentaProyectosEliminados(List<PresuTipoCuentaProyecto> presutipocuentaproyectosEliminados) {
		this.presutipocuentaproyectosEliminados = presutipocuentaproyectosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPresuTipoCuentaProyecto() {
		return jComboBoxTiposSeleccionarPresuTipoCuentaProyecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPresuTipoCuentaProyecto(
			JComboBox jComboBoxTiposSeleccionarPresuTipoCuentaProyecto) {
		this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto = jComboBoxTiposSeleccionarPresuTipoCuentaProyecto;
	}
	
	public void setBorderResaltarTiposSeleccionarPresuTipoCuentaProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPresuTipoCuentaProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPresuTipoCuentaProyecto() {
		return jTextFieldValorCampoGeneralPresuTipoCuentaProyecto;
	}

	public void setjTextFieldValorCampoGeneralPresuTipoCuentaProyecto(
			JTextField jTextFieldValorCampoGeneralPresuTipoCuentaProyecto) {
		this.jTextFieldValorCampoGeneralPresuTipoCuentaProyecto = jTextFieldValorCampoGeneralPresuTipoCuentaProyecto;
	}

	public void setBorderResaltarValorCampoGeneralPresuTipoCuentaProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoCuentaProyecto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPresuTipoCuentaProyecto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPresuTipoCuentaProyecto() {
		return this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto;
	}

	public void setjCheckBoxSeleccionarTodosPresuTipoCuentaProyecto(
			JCheckBox jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto) {
		this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto = jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto;
	}

	public void setBorderResaltarSeleccionarTodosPresuTipoCuentaProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoCuentaProyecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPresuTipoCuentaProyecto() {
		return this.jCheckBoxSeleccionadosPresuTipoCuentaProyecto;
	}

	public void setjCheckBoxSeleccionadosPresuTipoCuentaProyecto(
			JCheckBox jCheckBoxSeleccionadosPresuTipoCuentaProyecto) {
		this.jCheckBoxSeleccionadosPresuTipoCuentaProyecto = jCheckBoxSeleccionadosPresuTipoCuentaProyecto;
	}
	
	public void setBorderResaltarSeleccionadosPresuTipoCuentaProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoCuentaProyecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPresuTipoCuentaProyecto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPresuTipoCuentaProyecto() {
		return this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPresuTipoCuentaProyecto(
			JComboBox jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto) {
		this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto = jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto;
	}

	public void setBorderResaltarTiposArchivosReportesPresuTipoCuentaProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoCuentaProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPresuTipoCuentaProyecto() {
		return this.jComboBoxTiposReportesPresuTipoCuentaProyecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPresuTipoCuentaProyecto(
			JComboBox jComboBoxTiposReportesPresuTipoCuentaProyecto) {
		this.jComboBoxTiposReportesPresuTipoCuentaProyecto = jComboBoxTiposReportesPresuTipoCuentaProyecto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPresuTipoCuentaProyecto() {
	//	return jComboBoxTiposReportesDinamicoPresuTipoCuentaProyecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPresuTipoCuentaProyecto(
	//		JComboBox jComboBoxTiposReportesDinamicoPresuTipoCuentaProyecto) {
	//	this.jComboBoxTiposReportesDinamicoPresuTipoCuentaProyecto = jComboBoxTiposReportesDinamicoPresuTipoCuentaProyecto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPresuTipoCuentaProyecto() {
	//	return jComboBoxTiposArchivosReportesDinamicoPresuTipoCuentaProyecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPresuTipoCuentaProyecto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPresuTipoCuentaProyecto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPresuTipoCuentaProyecto = jComboBoxTiposArchivosReportesDinamicoPresuTipoCuentaProyecto;
	//}
	
	public void setBorderResaltarTiposReportesPresuTipoCuentaProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoCuentaProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPresuTipoCuentaProyecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPresuTipoCuentaProyecto() {
		return this.jComboBoxTiposGraficosReportesPresuTipoCuentaProyecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPresuTipoCuentaProyecto(
			JComboBox jComboBoxTiposGraficosReportesPresuTipoCuentaProyecto) {
		this.jComboBoxTiposGraficosReportesPresuTipoCuentaProyecto = jComboBoxTiposGraficosReportesPresuTipoCuentaProyecto;
	}
	
	public void setBorderResaltarTiposGraficosReportesPresuTipoCuentaProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoCuentaProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPresuTipoCuentaProyecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPresuTipoCuentaProyecto() {
		return this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPresuTipoCuentaProyecto(
			JComboBox jComboBoxTiposPaginacionPresuTipoCuentaProyecto) {
		this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto = jComboBoxTiposPaginacionPresuTipoCuentaProyecto;
	}
	
	public void setBorderResaltarTiposPaginacionPresuTipoCuentaProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoCuentaProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPresuTipoCuentaProyecto() {
		return this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresuTipoCuentaProyecto() {
		return this.jComboBoxTiposAccionesPresuTipoCuentaProyecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresuTipoCuentaProyecto(
			JComboBox jComboBoxTiposRelacionesPresuTipoCuentaProyecto) {
		this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto = jComboBoxTiposRelacionesPresuTipoCuentaProyecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresuTipoCuentaProyecto(
			JComboBox jComboBoxTiposAccionesPresuTipoCuentaProyecto) {
		this.jComboBoxTiposAccionesPresuTipoCuentaProyecto = jComboBoxTiposAccionesPresuTipoCuentaProyecto;
	}
	
	public void setBorderResaltarTiposRelacionesPresuTipoCuentaProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoCuentaProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPresuTipoCuentaProyecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPresuTipoCuentaProyecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPresuTipoCuentaProyecto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPresuTipoCuentaProyecto() {
	//	return jCheckBoxConGraficoDinamicoPresuTipoCuentaProyecto;
	//}

	//public void setjCheckBoxConGraficoDinamicoPresuTipoCuentaProyecto(
	//		JCheckBox jCheckBoxConGraficoDinamicoPresuTipoCuentaProyecto) {
	//	this.jCheckBoxConGraficoDinamicoPresuTipoCuentaProyecto = jCheckBoxConGraficoDinamicoPresuTipoCuentaProyecto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPresuTipoCuentaProyecto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPresuTipoCuentaProyecto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPresuTipoCuentaProyecto .setBorder(borderResaltar);		
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
		this.presutipocuentaproyectoSessionBean=new PresuTipoCuentaProyectoSessionBean();
		
		this.presutipocuentaproyectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presutipocuentaproyectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PresuTipoCuentaProyectoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PresuTipoCuentaProyectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresuTipoCuentaProyectoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresuTipoCuentaProyectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresuTipoCuentaProyectoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cuenta Proyecto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
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
		
		PresuTipoCuentaProyectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PresuTipoCuentaProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPresuTipoCuentaProyecto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPresuTipoCuentaProyecto,this.jTtoolBarPresuTipoCuentaProyecto,
							"nuevo","nuevo","Nuevo"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPresuTipoCuentaProyecto,this.jTtoolBarPresuTipoCuentaProyecto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPresuTipoCuentaProyecto,this.jTtoolBarPresuTipoCuentaProyecto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPresuTipoCuentaProyecto,this.jTtoolBarPresuTipoCuentaProyecto,
							"duplicar","duplicar","Duplicar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPresuTipoCuentaProyecto,this.jTtoolBarPresuTipoCuentaProyecto,
							"copiar","copiar","Copiar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPresuTipoCuentaProyecto,this.jTtoolBarPresuTipoCuentaProyecto,
							"ver_form","ver_form","Ver"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuTipoCuentaProyecto,this.jTtoolBarPresuTipoCuentaProyecto,
							"recargar","recargar","Recargar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuTipoCuentaProyecto,this.jTtoolBarPresuTipoCuentaProyecto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPresuTipoCuentaProyecto,this.jTtoolBarPresuTipoCuentaProyecto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPresuTipoCuentaProyecto,this.jTtoolBarPresuTipoCuentaProyecto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPresuTipoCuentaProyecto,this.jTtoolBarPresuTipoCuentaProyecto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPresuTipoCuentaProyecto,this.jTtoolBarPresuTipoCuentaProyecto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPresuTipoCuentaProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPresuTipoCuentaProyecto,this.jTtoolBarPresuTipoCuentaProyecto,
							"cerrar","cerrar","Salir"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPresuTipoCuentaProyecto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPresuTipoCuentaProyecto;
			
				this.jButtonProcesarInformacionToolBarPresuTipoCuentaProyecto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPresuTipoCuentaProyecto;
				
		//protected JButton jButtonModificarToolBarPresuTipoCuentaProyecto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPresuTipoCuentaProyecto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPresuTipoCuentaProyecto=new JMenuMe("General");
		this.jmenuArchivoPresuTipoCuentaProyecto=new JMenuMe("Archivo");
		this.jmenuAccionesPresuTipoCuentaProyecto=new JMenuMe("Acciones");
		this.jmenuDatosPresuTipoCuentaProyecto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresuTipoCuentaProyecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresuTipoCuentaProyecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresuTipoCuentaProyecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPresuTipoCuentaProyecto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPresuTipoCuentaProyecto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPresuTipoCuentaProyecto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPresuTipoCuentaProyecto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPresuTipoCuentaProyecto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPresuTipoCuentaProyecto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPresuTipoCuentaProyecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresuTipoCuentaProyecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresuTipoCuentaProyecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPresuTipoCuentaProyecto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPresuTipoCuentaProyecto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPresuTipoCuentaProyecto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPresuTipoCuentaProyecto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPresuTipoCuentaProyecto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPresuTipoCuentaProyecto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPresuTipoCuentaProyecto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPresuTipoCuentaProyecto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPresuTipoCuentaProyecto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresuTipoCuentaProyecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresuTipoCuentaProyecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresuTipoCuentaProyecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPresuTipoCuentaProyecto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPresuTipoCuentaProyecto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPresuTipoCuentaProyecto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPresuTipoCuentaProyecto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPresuTipoCuentaProyecto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPresuTipoCuentaProyecto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPresuTipoCuentaProyecto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPresuTipoCuentaProyecto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPresuTipoCuentaProyecto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPresuTipoCuentaProyecto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPresuTipoCuentaProyecto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPresuTipoCuentaProyecto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPresuTipoCuentaProyecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPresuTipoCuentaProyecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPresuTipoCuentaProyecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresuTipoCuentaProyecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresuTipoCuentaProyecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresuTipoCuentaProyecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPresuTipoCuentaProyecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPresuTipoCuentaProyecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPresuTipoCuentaProyecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresuTipoCuentaProyecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresuTipoCuentaProyecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresuTipoCuentaProyecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPresuTipoCuentaProyecto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPresuTipoCuentaProyecto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPresuTipoCuentaProyecto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPresuTipoCuentaProyecto.add(this.jMenuItemCerrarPresuTipoCuentaProyecto);
			
			this.jmenuAccionesPresuTipoCuentaProyecto.add(this.jMenuItemNuevoPresuTipoCuentaProyecto);
			this.jmenuAccionesPresuTipoCuentaProyecto.add(this.jMenuItemNuevoGuardarCambiosPresuTipoCuentaProyecto);
			this.jmenuAccionesPresuTipoCuentaProyecto.add(this.jMenuItemNuevoRelacionesPresuTipoCuentaProyecto);
			this.jmenuAccionesPresuTipoCuentaProyecto.add(this.jMenuItemGuardarCambiosTablaPresuTipoCuentaProyecto);		
			this.jmenuAccionesPresuTipoCuentaProyecto.add(this.jMenuItemDuplicarPresuTipoCuentaProyecto);		
			this.jmenuAccionesPresuTipoCuentaProyecto.add(this.jMenuItemCopiarPresuTipoCuentaProyecto);		
			this.jmenuAccionesPresuTipoCuentaProyecto.add(this.jMenuItemVerFormPresuTipoCuentaProyecto);		
			
			this.jmenuDatosPresuTipoCuentaProyecto.add(this.jMenuItemRecargarInformacionPresuTipoCuentaProyecto);				
			this.jmenuDatosPresuTipoCuentaProyecto.add(this.jMenuItemAnterioresPresuTipoCuentaProyecto);				
			this.jmenuDatosPresuTipoCuentaProyecto.add(this.jMenuItemSiguientesPresuTipoCuentaProyecto);				
			this.jmenuDatosPresuTipoCuentaProyecto.add(this.jMenuItemAbrirOrderByPresuTipoCuentaProyecto);				
			this.jmenuDatosPresuTipoCuentaProyecto.add(this.jMenuItemMostrarOcultarPresuTipoCuentaProyecto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPresuTipoCuentaProyecto.add(this.jMenuItemGuardarCambiosPresuTipoCuentaProyecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPresuTipoCuentaProyecto.add(this.jmenuArchivoPresuTipoCuentaProyecto);		
			this.jmenuBarPresuTipoCuentaProyecto.add(this.jmenuAccionesPresuTipoCuentaProyecto);		
			this.jmenuBarPresuTipoCuentaProyecto.add(this.jmenuDatosPresuTipoCuentaProyecto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPresuTipoCuentaProyecto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPresuTipoCuentaProyecto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoPresuTipoCuentaProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoPresuTipoCuentaProyecto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoPresuTipoCuentaProyecto= new JButtonMe();
		this.jButtonBusquedaPorCodigoPresuTipoCuentaProyecto.setText("Buscar");
		this.jButtonBusquedaPorCodigoPresuTipoCuentaProyecto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoPresuTipoCuentaProyecto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoPresuTipoCuentaProyecto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoPresuTipoCuentaProyecto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoPresuTipoCuentaProyecto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoPresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoPresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoPresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoPresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoPresuTipoCuentaProyecto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoPresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoPresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoPresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoPresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombrePresuTipoCuentaProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombrePresuTipoCuentaProyecto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombrePresuTipoCuentaProyecto= new JButtonMe();
		this.jButtonBusquedaPorNombrePresuTipoCuentaProyecto.setText("Buscar");
		this.jButtonBusquedaPorNombrePresuTipoCuentaProyecto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombrePresuTipoCuentaProyecto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombrePresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombrePresuTipoCuentaProyecto = new JLabelMe();
		jLabelnombreBusquedaPorNombrePresuTipoCuentaProyecto.setText("Nombre :");
		jLabelnombreBusquedaPorNombrePresuTipoCuentaProyecto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombrePresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombrePresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombrePresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombrePresuTipoCuentaProyecto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombrePresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombrePresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombrePresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombrePresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPresuTipoCuentaProyecto=new JTabbedPane();


		this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePresuTipoCuentaProyecto = new PresuTipoCuentaProyectoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Cuenta Proyecto DATOS");
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto = new PresuTipoCuentaProyectoDetalleFormJInternalFrame(jDesktopPane,this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones(),this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto = null;//new PresuTipoCuentaProyectoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresuTipoCuentaProyecto= new GridBagLayout();
		
		
		this.jTableDatosPresuTipoCuentaProyecto = new JTableMe();      
		
		String sToolTipPresuTipoCuentaProyecto="";
		sToolTipPresuTipoCuentaProyecto=PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresuTipoCuentaProyecto+="(Contabilidad.PresuTipoCuentaProyecto)";
		}
		
		if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresuTipoCuentaProyecto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPresuTipoCuentaProyecto.setToolTipText(sToolTipPresuTipoCuentaProyecto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPresuTipoCuentaProyecto);
		this.jTableDatosPresuTipoCuentaProyecto.setAutoCreateRowSorter(true);
		this.jTableDatosPresuTipoCuentaProyecto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPresuTipoCuentaProyecto.setRowSelectionAllowed(true);
		this.jTableDatosPresuTipoCuentaProyecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPresuTipoCuentaProyecto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonDuplicarPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonCopiarPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonVerFormPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonNuevoRelacionesPresuTipoCuentaProyecto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonCerrarPresuTipoCuentaProyecto = new JButtonMe();
		
		this.jScrollPanelDatosPresuTipoCuentaProyecto = new JScrollPane();   
        this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPresuTipoCuentaProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cuenta Proyecto";
		
		if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Proyectos" + this.sPath));
		} else {
			this.jScrollPanelDatosPresuTipoCuentaProyecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresuTipoCuentaProyecto.setToolTipText("Acciones");
        this.jPanelAccionesPresuTipoCuentaProyecto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto=new ReporteDinamicoJInternalFrame(PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPresuTipoCuentaProyecto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPresuTipoCuentaProyecto=new ImportacionJInternalFrame(PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPresuTipoCuentaProyecto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPresuTipoCuentaProyecto = new JButtonMe();
		
		this.jButtonAbrirOrderByPresuTipoCuentaProyecto.setText("Orden");
		this.jButtonAbrirOrderByPresuTipoCuentaProyecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresuTipoCuentaProyecto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPresuTipoCuentaProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresuTipoCuentaProyecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuTipoCuentaProyecto,false,this);
			
			//this.cargarOrderByPresuTipoCuentaProyecto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPresuTipoCuentaProyecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuTipoCuentaProyecto,true,this);
			
			//this.cargarOrderByPresuTipoCuentaProyecto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPresuTipoCuentaProyecto.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosPresuTipoCuentaProyecto.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosPresuTipoCuentaProyecto.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosPresuTipoCuentaProyecto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresuTipoCuentaProyecto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPresuTipoCuentaProyecto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPresuTipoCuentaProyecto.setText("Nuevo");
		this.jButtonDuplicarPresuTipoCuentaProyecto.setText("Duplicar");
		this.jButtonCopiarPresuTipoCuentaProyecto.setText("Copiar");
		this.jButtonVerFormPresuTipoCuentaProyecto.setText("Ver");
		this.jButtonNuevoRelacionesPresuTipoCuentaProyecto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto.setText("Guardar");
		this.jButtonCerrarPresuTipoCuentaProyecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresuTipoCuentaProyecto,"nuevo_button","Nuevo",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPresuTipoCuentaProyecto,"duplicar_button","Duplicar",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPresuTipoCuentaProyecto,"copiar_button","Copiar",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPresuTipoCuentaProyecto,"ver_form","Ver",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPresuTipoCuentaProyecto,"nuevorelaciones_button","Nuevo Rel",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto,"guardarcambiostabla_button","Guardar",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresuTipoCuentaProyecto,"cerrar_button","Salir",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPresuTipoCuentaProyecto.setToolTipText("Nuevo"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPresuTipoCuentaProyecto.setToolTipText("Duplicar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPresuTipoCuentaProyecto.setToolTipText("Copiar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPresuTipoCuentaProyecto.setToolTipText("Ver"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPresuTipoCuentaProyecto.setToolTipText("Nuevo Rel"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto.setToolTipText("Guardar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresuTipoCuentaProyecto.setToolTipText("Salir"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresuTipoCuentaProyecto";
		inputMap = this.jButtonNuevoPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresuTipoCuentaProyecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresuTipoCuentaProyecto"));
		
		//DUPLICAR
		sMapKey = "DuplicarPresuTipoCuentaProyecto";
		inputMap = this.jButtonDuplicarPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPresuTipoCuentaProyecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPresuTipoCuentaProyecto"));
		
		//COPIAR
		sMapKey = "CopiarPresuTipoCuentaProyecto";
		inputMap = this.jButtonCopiarPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPresuTipoCuentaProyecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPresuTipoCuentaProyecto"));
		
		//VEr FORM
		sMapKey = "VerFormPresuTipoCuentaProyecto";
		inputMap = this.jButtonVerFormPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPresuTipoCuentaProyecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPresuTipoCuentaProyecto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPresuTipoCuentaProyecto";
		inputMap = this.jButtonNuevoRelacionesPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPresuTipoCuentaProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPresuTipoCuentaProyecto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPresuTipoCuentaProyecto";
		inputMap = this.jButtonModificarPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPresuTipoCuentaProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPresuTipoCuentaProyecto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPresuTipoCuentaProyecto";
		inputMap = this.jButtonCerrarPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresuTipoCuentaProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresuTipoCuentaProyecto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresuTipoCuentaProyecto";
		inputMap = this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresuTipoCuentaProyecto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPresuTipoCuentaProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPresuTipoCuentaProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPresuTipoCuentaProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PresuTipoCuentaProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PresuTipoCuentaProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PresuTipoCuentaProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PresuTipoCuentaProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PresuTipoCuentaProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPresuTipoCuentaProyecto.setName("jPanelParametrosReportesPresuTipoCuentaProyecto"); 
		
		this.jPanelParametrosReportesAccionesPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPresuTipoCuentaProyecto.setName("jPanelParametrosReportesAccionesPresuTipoCuentaProyecto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonRecargarInformacionPresuTipoCuentaProyecto.setText("Recargar");
		this.jButtonRecargarInformacionPresuTipoCuentaProyecto.setToolTipText("Recargar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPresuTipoCuentaProyecto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonProcesarInformacionPresuTipoCuentaProyecto.setText("Procesar");
		this.jButtonProcesarInformacionPresuTipoCuentaProyecto.setToolTipText("Procesar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPresuTipoCuentaProyecto.setVisible(false);
			
		this.jButtonProcesarInformacionPresuTipoCuentaProyecto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresuTipoCuentaProyecto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPresuTipoCuentaProyecto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPresuTipoCuentaProyecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto.setText("TIPO");       
		this.jComboBoxTiposReportesPresuTipoCuentaProyecto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPresuTipoCuentaProyecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPresuTipoCuentaProyecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto.setText("Paginacion");
		this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto.setText("Accion");
		this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPresuTipoCuentaProyecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setText("Accion");
		this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto.setText("Accion");
		this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPresuTipoCuentaProyecto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPresuTipoCuentaProyecto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresuTipoCuentaProyecto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPresuTipoCuentaProyecto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPresuTipoCuentaProyecto = new JLabelMe();
		
		this.jLabelAccionesPresuTipoCuentaProyecto.setText("Acciones");		
		this.jLabelAccionesPresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPresuTipoCuentaProyecto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPresuTipoCuentaProyecto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPresuTipoCuentaProyecto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPresuTipoCuentaProyecto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPresuTipoCuentaProyecto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPresuTipoCuentaProyecto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePresuTipoCuentaProyecto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePresuTipoCuentaProyecto.setText("Graf.");
		this.jCheckBoxConGraficoReportePresuTipoCuentaProyecto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPresuTipoCuentaProyecto = new JButtonMe();
		//this.jButtonAnterioresPresuTipoCuentaProyecto.setText("<<");
        this.jButtonAnterioresPresuTipoCuentaProyecto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPresuTipoCuentaProyecto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPresuTipoCuentaProyecto = new JButtonMe();
		//this.jButtonSiguientesPresuTipoCuentaProyecto.setText(">>");
        this.jButtonSiguientesPresuTipoCuentaProyecto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPresuTipoCuentaProyecto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPresuTipoCuentaProyecto.setText("Nue");
        this.jButtonNuevoGuardarCambiosPresuTipoCuentaProyecto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPresuTipoCuentaProyecto,"nuevoguardarcambios_button","Nue",this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPresuTipoCuentaProyecto";
		inputMap = this.jButtonNuevoGuardarCambiosPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPresuTipoCuentaProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPresuTipoCuentaProyecto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPresuTipoCuentaProyecto";
		inputMap = this.jButtonRecargarInformacionPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPresuTipoCuentaProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPresuTipoCuentaProyecto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPresuTipoCuentaProyecto";
		inputMap = this.jButtonSiguientesPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPresuTipoCuentaProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPresuTipoCuentaProyecto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPresuTipoCuentaProyecto";
		inputMap = this.jButtonAnterioresPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPresuTipoCuentaProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPresuTipoCuentaProyecto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPresuTipoCuentaProyecto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPresuTipoCuentaProyecto.setMinimumSize(new Dimension(this.getWidth(),PresuTipoCuentaProyectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuTipoCuentaProyectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresuTipoCuentaProyecto.setMaximumSize(new Dimension(this.getWidth(),PresuTipoCuentaProyectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuTipoCuentaProyectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPresuTipoCuentaProyecto.setPreferredSize(new Dimension(this.getWidth(),PresuTipoCuentaProyectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PresuTipoCuentaProyectoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPresuTipoCuentaProyecto = new GridBagLayout();

			this.jPanelPaginacionPresuTipoCuentaProyecto.setLayout(gridaBagLayoutPaginacionPresuTipoCuentaProyecto);						
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPresuTipoCuentaProyecto.add(this.jButtonAnterioresPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
					
						
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
			
			this.jPanelPaginacionPresuTipoCuentaProyecto.add(this.jButtonNuevoGuardarCambiosPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
						
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
			this.jPanelPaginacionPresuTipoCuentaProyecto.add(this.jButtonSiguientesPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 1;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuTipoCuentaProyecto.add(this.jButtonNuevoPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
						
			
			
			if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
				this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 1;
				this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPresuTipoCuentaProyecto.add(this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
			}
			
			
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 1;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuTipoCuentaProyecto.add(this.jButtonDuplicarPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 1;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuTipoCuentaProyecto.add(this.jButtonCopiarPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 1;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPresuTipoCuentaProyecto.add(this.jButtonVerFormPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 1;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPresuTipoCuentaProyecto.add(this.jButtonCerrarPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		
		
		
		this.jButtonRecargarInformacionPresuTipoCuentaProyecto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresuTipoCuentaProyecto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPresuTipoCuentaProyecto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPresuTipoCuentaProyecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresuTipoCuentaProyecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPresuTipoCuentaProyecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPresuTipoCuentaProyecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresuTipoCuentaProyecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPresuTipoCuentaProyecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPresuTipoCuentaProyecto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresuTipoCuentaProyecto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPresuTipoCuentaProyecto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePresuTipoCuentaProyecto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresuTipoCuentaProyecto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePresuTipoCuentaProyecto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPresuTipoCuentaProyecto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresuTipoCuentaProyecto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPresuTipoCuentaProyecto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPresuTipoCuentaProyecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPresuTipoCuentaProyecto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PresuTipoCuentaProyecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PresuTipoCuentaProyecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PresuTipoCuentaProyecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PresuTipoCuentaProyecto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPresuTipoCuentaProyecto.setLayout(gridaBagParametrosReportesPresuTipoCuentaProyecto);
			this.jPanelParametrosReportesAccionesPresuTipoCuentaProyecto.setLayout(gridaBagParametrosReportesAccionesPresuTipoCuentaProyecto);
			
			
			this.jPanelParametrosAuxiliar1PresuTipoCuentaProyecto.setLayout(gridaBagParametrosAuxiliar1PresuTipoCuentaProyecto);
			this.jPanelParametrosAuxiliar2PresuTipoCuentaProyecto.setLayout(gridaBagParametrosAuxiliar2PresuTipoCuentaProyecto);
			this.jPanelParametrosAuxiliar3PresuTipoCuentaProyecto.setLayout(gridaBagParametrosAuxiliar3PresuTipoCuentaProyecto);
			this.jPanelParametrosAuxiliar4PresuTipoCuentaProyecto.setLayout(gridaBagParametrosAuxiliar4PresuTipoCuentaProyecto);
			//this.jPanelParametrosAuxiliar5PresuTipoCuentaProyecto.setLayout(gridaBagParametrosAuxiliar2PresuTipoCuentaProyecto);			
			
			
			
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuTipoCuentaProyecto.add(this.jButtonRecargarInformacionPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuTipoCuentaProyecto.add(this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuTipoCuentaProyecto.add(this.jCheckBoxConAltoMaximoTablaPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PresuTipoCuentaProyecto.add(this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuTipoCuentaProyecto.add(this.jPanelParametrosAuxiliar1PresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PresuTipoCuentaProyecto.add(this.jComboBoxTiposReportesPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuTipoCuentaProyecto.add(this.jPanelParametrosAuxiliar4PresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuTipoCuentaProyecto.add(this.jComboBoxTiposReportesPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuTipoCuentaProyecto.add(this.jCheckBoxGenerarReportePresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuTipoCuentaProyecto.add(this.jPanelParametrosAuxiliar2PresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuTipoCuentaProyecto.add(this.jLabelAccionesPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
				this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPresuTipoCuentaProyecto.add(this.jButtonAbrirOrderByPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuTipoCuentaProyecto.add(this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);			
			
			
			/*
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPresuTipoCuentaProyecto.add(this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuTipoCuentaProyecto.add(this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);															
				
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PresuTipoCuentaProyecto.add(this.jCheckBoxSeleccionadosPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPresuTipoCuentaProyecto.add(this.jPanelParametrosAuxiliar3PresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuTipoCuentaProyecto.add(this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
				
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuTipoCuentaProyecto.add(this.jComboBoxTiposAccionesPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
	
				
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPresuTipoCuentaProyecto.add(this.jTextFieldValorCampoGeneralPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPresuTipoCuentaProyecto = new GridBagLayout();

			this.jScrollPanelDatosPresuTipoCuentaProyecto.setLayout(gridaBagLayoutDatosPresuTipoCuentaProyecto);
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
			
			this.jScrollPanelDatosPresuTipoCuentaProyecto.add(this.jTableDatosPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPresuTipoCuentaProyecto.setViewportView(this.jTableDatosPresuTipoCuentaProyecto);
		this.jTableDatosPresuTipoCuentaProyecto.setFillsViewportHeight(true);
		this.jTableDatosPresuTipoCuentaProyecto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPresuTipoCuentaProyecto= new GridBagLayout();
		this.jPanelAccionesPresuTipoCuentaProyecto.setLayout(gridaBagLayoutAccionesPresuTipoCuentaProyecto);
		
		
		/*	
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
			
		this.jPanelAccionesPresuTipoCuentaProyecto.add(this.jButtonNuevoPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoPresuTipoCuentaProyecto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoPresuTipoCuentaProyecto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoPresuTipoCuentaProyecto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoPresuTipoCuentaProyecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoPresuTipoCuentaProyecto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoPresuTipoCuentaProyecto.setLayout(gridaBagLayoutBusquedaPorCodigoPresuTipoCuentaProyecto);

		gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
		gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
		jPanelBusquedaPorCodigoPresuTipoCuentaProyecto.add(jLabelcodigoBusquedaPorCodigoPresuTipoCuentaProyecto, gridBagConstraintsPresuTipoCuentaProyecto);

		gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
		gridBagConstraintsPresuTipoCuentaProyecto.gridx = 1;
		jPanelBusquedaPorCodigoPresuTipoCuentaProyecto.add(jTextFieldcodigoBusquedaPorCodigoPresuTipoCuentaProyecto, gridBagConstraintsPresuTipoCuentaProyecto);

		gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTipoCuentaProyecto.gridy = 1;
		gridBagConstraintsPresuTipoCuentaProyecto.gridx =1;
		jPanelBusquedaPorCodigoPresuTipoCuentaProyecto.add(jButtonBusquedaPorCodigoPresuTipoCuentaProyecto, gridBagConstraintsPresuTipoCuentaProyecto);

		jTabbedPaneBusquedasPresuTipoCuentaProyecto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoPresuTipoCuentaProyecto);
		jTabbedPaneBusquedasPresuTipoCuentaProyecto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombrePresuTipoCuentaProyecto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombrePresuTipoCuentaProyecto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePresuTipoCuentaProyecto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePresuTipoCuentaProyecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombrePresuTipoCuentaProyecto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombrePresuTipoCuentaProyecto.setLayout(gridaBagLayoutBusquedaPorNombrePresuTipoCuentaProyecto);

		gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
		gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
		jPanelBusquedaPorNombrePresuTipoCuentaProyecto.add(jLabelnombreBusquedaPorNombrePresuTipoCuentaProyecto, gridBagConstraintsPresuTipoCuentaProyecto);

		gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTipoCuentaProyecto.gridy = 0;
		gridBagConstraintsPresuTipoCuentaProyecto.gridx = 1;
		jPanelBusquedaPorNombrePresuTipoCuentaProyecto.add(jTextAreanombreBusquedaPorNombrePresuTipoCuentaProyecto, gridBagConstraintsPresuTipoCuentaProyecto);

		gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPresuTipoCuentaProyecto.gridy = 1;
		gridBagConstraintsPresuTipoCuentaProyecto.gridx =1;
		jPanelBusquedaPorNombrePresuTipoCuentaProyecto.add(jButtonBusquedaPorNombrePresuTipoCuentaProyecto, gridBagConstraintsPresuTipoCuentaProyecto);

		jTabbedPaneBusquedasPresuTipoCuentaProyecto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombrePresuTipoCuentaProyecto);
		jTabbedPaneBusquedasPresuTipoCuentaProyecto.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresuTipoCuentaProyecto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresuTipoCuentaProyecto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();						
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;		
			//this.gridBagConstraintsPresuTipoCuentaProyecto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;		
		//this.gridBagConstraintsPresuTipoCuentaProyecto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPresuTipoCuentaProyecto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;		
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPresuTipoCuentaProyecto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);								
		
		
		/*
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		*/		
		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx =0;
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresuTipoCuentaProyecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
				
		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PresuTipoCuentaProyectoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPresuTipoCuentaProyecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresuTipoCuentaProyecto = new GridBagLayout();
			this.jPanelBusquedasParametrosPresuTipoCuentaProyecto.setLayout(gridaBagLayoutBusquedasParametrosPresuTipoCuentaProyecto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
			
			
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		
			
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPresuTipoCuentaProyecto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPresuTipoCuentaProyecto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPresuTipoCuentaProyecto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPresuTipoCuentaProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPresuTipoCuentaProyecto.setName("jPanelReporteDinamicoPresuTipoCuentaProyecto"); 
		
		this.jPanelReporteDinamicoPresuTipoCuentaProyecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresuTipoCuentaProyecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPresuTipoCuentaProyecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPresuTipoCuentaProyecto.setLayout(gridaBagLayoutReporteDinamicoPresuTipoCuentaProyecto);
		
		
		this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPresuTipoCuentaProyecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresuTipoCuentaProyecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setResizable(true);
	    this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setClosable(true);
	    this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPresuTipoCuentaProyecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresuTipoCuentaProyecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPresuTipoCuentaProyecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Proyectos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePresuTipoCuentaProyecto = new JLabelMe();

		this.jLabelColumnasSelectReportePresuTipoCuentaProyecto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPresuTipoCuentaProyecto.add(this.jLabelColumnasSelectReportePresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePresuTipoCuentaProyecto = new JList<Reporte>();
		this.jListColumnasSelectReportePresuTipoCuentaProyecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePresuTipoCuentaProyecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePresuTipoCuentaProyecto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresuTipoCuentaProyecto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePresuTipoCuentaProyecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePresuTipoCuentaProyecto=new JScrollPane(this.jListColumnasSelectReportePresuTipoCuentaProyecto);
			
			this.jScrollColumnasSelectReportePresuTipoCuentaProyecto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresuTipoCuentaProyecto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePresuTipoCuentaProyecto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPresuTipoCuentaProyecto.add(this.jListColumnasSelectReportePresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		this.jPanelReporteDinamicoPresuTipoCuentaProyecto.add(this.jScrollColumnasSelectReportePresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePresuTipoCuentaProyecto = new JLabelMe();

		this.jLabelRelacionesSelectReportePresuTipoCuentaProyecto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePresuTipoCuentaProyecto = new JList<Reporte>();
		this.jListRelacionesSelectReportePresuTipoCuentaProyecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePresuTipoCuentaProyecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePresuTipoCuentaProyecto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresuTipoCuentaProyecto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePresuTipoCuentaProyecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePresuTipoCuentaProyecto=new JScrollPane(this.jListRelacionesSelectReportePresuTipoCuentaProyecto);
			
			this.jScrollRelacionesSelectReportePresuTipoCuentaProyecto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresuTipoCuentaProyecto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePresuTipoCuentaProyecto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPresuTipoCuentaProyecto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPresuTipoCuentaProyecto = new JComboBoxMe();
		this.jListColumnasValoresGraficoPresuTipoCuentaProyecto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPresuTipoCuentaProyecto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPresuTipoCuentaProyecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPresuTipoCuentaProyecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresuTipoCuentaProyecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPresuTipoCuentaProyecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPresuTipoCuentaProyecto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPresuTipoCuentaProyecto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPresuTipoCuentaProyecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresuTipoCuentaProyecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPresuTipoCuentaProyecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPresuTipoCuentaProyecto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPresuTipoCuentaProyecto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuTipoCuentaProyecto.add(this.jLabelGenerarExcelReporteDinamicoPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPresuTipoCuentaProyecto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPresuTipoCuentaProyecto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPresuTipoCuentaProyecto.setToolTipText("Generar EXCEL"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPresuTipoCuentaProyecto.add(this.jButtonGenerarExcelReporteDinamicoPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuTipoCuentaProyecto.add(this.jComboBoxTiposReportesDinamicoPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPresuTipoCuentaProyecto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPresuTipoCuentaProyecto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPresuTipoCuentaProyecto.add(this.jLabelTiposArchivoReporteDinamicoPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuTipoCuentaProyecto.add(this.jComboBoxTiposArchivosReportesDinamicoPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPresuTipoCuentaProyecto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPresuTipoCuentaProyecto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPresuTipoCuentaProyecto.setToolTipText("Generar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuTipoCuentaProyecto.add(this.jButtonGenerarReporteDinamicoPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPresuTipoCuentaProyecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPresuTipoCuentaProyecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPresuTipoCuentaProyecto.setToolTipText("Cancelar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPresuTipoCuentaProyecto.add(this.jButtonCerrarReporteDinamicoPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPresuTipoCuentaProyecto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPresuTipoCuentaProyecto= new JScrollPane(jPanelReporteDinamicoPresuTipoCuentaProyecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPresuTipoCuentaProyecto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresuTipoCuentaProyecto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPresuTipoCuentaProyecto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Proyectos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPresuTipoCuentaProyecto);
		this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getContentPane().add(this.jScrollPanelReporteDinamicoPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPresuTipoCuentaProyecto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPresuTipoCuentaProyecto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPresuTipoCuentaProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPresuTipoCuentaProyecto.setName("jPanelImportacionPresuTipoCuentaProyecto"); 
		
		this.jPanelImportacionPresuTipoCuentaProyecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresuTipoCuentaProyecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPresuTipoCuentaProyecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPresuTipoCuentaProyecto.setLayout(gridaBagLayoutImportacionPresuTipoCuentaProyecto);
		
		
		this.jInternalFrameImportacionPresuTipoCuentaProyecto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPresuTipoCuentaProyecto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPresuTipoCuentaProyecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePresuTipoCuentaProyecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPresuTipoCuentaProyecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresuTipoCuentaProyecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresuTipoCuentaProyecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPresuTipoCuentaProyecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresuTipoCuentaProyecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresuTipoCuentaProyecto.setResizable(true);
	    this.jInternalFrameImportacionPresuTipoCuentaProyecto.setClosable(true);
	    this.jInternalFrameImportacionPresuTipoCuentaProyecto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPresuTipoCuentaProyecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPresuTipoCuentaProyecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPresuTipoCuentaProyecto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPresuTipoCuentaProyecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPresuTipoCuentaProyecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPresuTipoCuentaProyecto.setResizable(true);
	    this.jInternalFrameImportacionPresuTipoCuentaProyecto.setClosable(true);
	    this.jInternalFrameImportacionPresuTipoCuentaProyecto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPresuTipoCuentaProyecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresuTipoCuentaProyecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPresuTipoCuentaProyecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Proyectos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPresuTipoCuentaProyecto = new JLabelMe();

		this.jLabelArchivoImportacionPresuTipoCuentaProyecto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresuTipoCuentaProyecto.add(this.jLabelArchivoImportacionPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPresuTipoCuentaProyecto = new JFileChooser();		
		this.jFileChooserImportacionPresuTipoCuentaProyecto.setToolTipText("ESCOGER ARCHIVO"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonAbrirImportacionPresuTipoCuentaProyecto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPresuTipoCuentaProyecto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPresuTipoCuentaProyecto.setToolTipText("Generar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuTipoCuentaProyecto.add(this.jButtonAbrirImportacionPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPresuTipoCuentaProyecto = new JLabelMe();

		this.jLabelPathArchivoImportacionPresuTipoCuentaProyecto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPresuTipoCuentaProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresuTipoCuentaProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPresuTipoCuentaProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPresuTipoCuentaProyecto.add(this.jLabelPathArchivoImportacionPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPresuTipoCuentaProyecto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPresuTipoCuentaProyecto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresuTipoCuentaProyecto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPresuTipoCuentaProyecto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuTipoCuentaProyecto.add(this.jTextFieldPathArchivoImportacionPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonGenerarImportacionPresuTipoCuentaProyecto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPresuTipoCuentaProyecto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPresuTipoCuentaProyecto.setToolTipText("Generar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuTipoCuentaProyecto.add(this.jButtonGenerarImportacionPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPresuTipoCuentaProyecto = new JButtonMe();
		this.jButtonCerrarImportacionPresuTipoCuentaProyecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPresuTipoCuentaProyecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPresuTipoCuentaProyecto.setToolTipText("Cancelar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYImportacion;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPresuTipoCuentaProyecto.add(this.jButtonCerrarImportacionPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPresuTipoCuentaProyecto = new GridBagLayout();
		
		this.jScrollPanelImportacionPresuTipoCuentaProyecto= new JScrollPane(jPanelImportacionPresuTipoCuentaProyecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridy =iPosYImportacion;
		this.gridBagConstraintsPresuTipoCuentaProyecto.gridx =iPosXImportacion;
		this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPresuTipoCuentaProyecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPresuTipoCuentaProyecto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPresuTipoCuentaProyecto);
		this.jInternalFrameImportacionPresuTipoCuentaProyecto.getContentPane().add(this.jScrollPanelImportacionPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPresuTipoCuentaProyecto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPresuTipoCuentaProyecto = new JButtonMe();
			this.jButtonAbrirOrderByPresuTipoCuentaProyecto.setText("Orden");
			this.jButtonAbrirOrderByPresuTipoCuentaProyecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPresuTipoCuentaProyecto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPresuTipoCuentaProyecto";
			inputMap = this.jButtonAbrirOrderByPresuTipoCuentaProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPresuTipoCuentaProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPresuTipoCuentaProyecto"));
		
		
			GridBagLayout gridaBagLayoutOrderByPresuTipoCuentaProyecto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPresuTipoCuentaProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPresuTipoCuentaProyecto.setName("jPanelOrderByPresuTipoCuentaProyecto"); 
			
			this.jPanelOrderByPresuTipoCuentaProyecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresuTipoCuentaProyecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPresuTipoCuentaProyecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPresuTipoCuentaProyecto.setLayout(gridaBagLayoutOrderByPresuTipoCuentaProyecto);
			
			
			this.jTableDatosPresuTipoCuentaProyectoOrderBy = new JTableMe();        
			this.jTableDatosPresuTipoCuentaProyectoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPresuTipoCuentaProyectoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPresuTipoCuentaProyectoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPresuTipoCuentaProyectoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPresuTipoCuentaProyectoOrderBy.setViewportView(this.jTableDatosPresuTipoCuentaProyectoOrderBy);
			this.jTableDatosPresuTipoCuentaProyectoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPresuTipoCuentaProyectoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPresuTipoCuentaProyecto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPresuTipoCuentaProyecto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPresuTipoCuentaProyecto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePresuTipoCuentaProyecto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.setTitle("Orden");
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.setResizable(true);
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.setClosable(true);
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPresuTipoCuentaProyecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresuTipoCuentaProyecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPresuTipoCuentaProyecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPresuTipoCuentaProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Proyectos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPresuTipoCuentaProyecto.ipady =150;
				
			this.jPanelOrderByPresuTipoCuentaProyecto.add(jScrollPanelDatosPresuTipoCuentaProyectoOrderBy, this.gridBagConstraintsPresuTipoCuentaProyecto);//this.jTableDatosPresuTipoCuentaProyectoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPresuTipoCuentaProyecto = new JButtonMe();
			this.jButtonCerrarOrderByPresuTipoCuentaProyecto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPresuTipoCuentaProyecto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPresuTipoCuentaProyecto.setToolTipText("Cancelar"+" "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPresuTipoCuentaProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPresuTipoCuentaProyecto.add(this.jButtonCerrarOrderByPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPresuTipoCuentaProyecto = new GridBagLayout();
			
			this.jScrollPanelOrderByPresuTipoCuentaProyecto= new JScrollPane(jPanelOrderByPresuTipoCuentaProyecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPresuTipoCuentaProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridy =iPosYOrderBy;
			this.gridBagConstraintsPresuTipoCuentaProyecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsPresuTipoCuentaProyecto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPresuTipoCuentaProyecto);
			
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.getContentPane().add(this.jScrollPanelOrderByPresuTipoCuentaProyecto, this.gridBagConstraintsPresuTipoCuentaProyecto);			
		
		} else {
			this.jButtonAbrirOrderByPresuTipoCuentaProyecto = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPresuTipoCuentaProyecto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPresuTipoCuentaProyecto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPresuTipoCuentaProyecto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPresuTipoCuentaProyecto.getRowHeight();//PresuTipoCuentaProyectoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PresuTipoCuentaProyectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresuTipoCuentaProyecto.isSelected()) {
					iHeightTable=PresuTipoCuentaProyectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresuTipoCuentaProyectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresuTipoCuentaProyectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PresuTipoCuentaProyectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPresuTipoCuentaProyecto.isSelected()) {
					iHeightTable=PresuTipoCuentaProyectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PresuTipoCuentaProyectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PresuTipoCuentaProyectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPresuTipoCuentaProyecto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresuTipoCuentaProyecto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPresuTipoCuentaProyecto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPresuTipoCuentaProyecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresuTipoCuentaProyecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPresuTipoCuentaProyecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPresuTipoCuentaProyecto!=null && this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjTableDatosOrderBy()!=null) {
			//if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPresuTipoCuentaProyecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresuTipoCuentaProyecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPresuTipoCuentaProyecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presutipocuentaproyectos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PresuTipoCuentaProyecto> TraerPresuTipoCuentaProyectoBeans(List<PresuTipoCuentaProyecto> presutipocuentaproyectos,ArrayList<Classe> classes)throws Exception {
		try {
			for(PresuTipoCuentaProyecto presutipocuentaproyecto:presutipocuentaproyectos) {
					
				if(!(PresuTipoCuentaProyectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PresuTipoCuentaProyectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					presutipocuentaproyecto.setsDetalleGeneralEntityReporte(PresuTipoCuentaProyectoConstantesFunciones.getPresuTipoCuentaProyectoDescripcion(presutipocuentaproyecto));
										
						
					
						
					
				} else  {
							
					//presutipocuentaproyecto.setsDetalleGeneralEntityReporte(presutipocuentaproyecto.getsDetalleGeneralEntityReporte());
										
				}
				
				//presutipocuentaproyectobeans.add(presutipocuentaproyectobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return presutipocuentaproyectos;
    }
	//PARA REPORTES FIN
}
