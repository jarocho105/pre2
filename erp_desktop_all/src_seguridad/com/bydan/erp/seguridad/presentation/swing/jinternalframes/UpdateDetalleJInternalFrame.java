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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.UpdateDetalleConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class UpdateDetalleJInternalFrame extends UpdateDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarUpdateDetalle;
	
	protected JMenuBar jmenuBarUpdateDetalle;
	
	protected JMenu jmenuUpdateDetalle;
	protected JMenu jmenuDatosUpdateDetalle;
	protected JMenu jmenuArchivoUpdateDetalle;
	protected JMenu jmenuAccionesUpdateDetalle;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosUpdateDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUpdateDetalle;	
	protected GridBagConstraints gridBagConstraintsUpdateDetalle;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public UpdateDetalleDetalleFormJInternalFrame jInternalFrameDetalleFormUpdateDetalle;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoUpdateDetalle;	
	protected ImportacionJInternalFrame jInternalFrameImportacionUpdateDetalle;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected UpdateBeanSwingJInternalFrame updateBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_update="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public UpdateDetalleSessionBean updatedetalleSessionBean;
		
	
	
	public UpdateSessionBean updateSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<UpdateDetalle> updatedetalles;		
	public List<UpdateDetalle> updatedetallesEliminados;	
	public List<UpdateDetalle> updatedetallesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByUpdateDetalle;		
	protected JButton jButtonAbrirOrderByUpdateDetalle;
	
	
	//protected JPanel jPanelOrderByUpdateDetalle;
	//public JScrollPane jScrollPanelOrderByUpdateDetalle;	
	//protected JButton jButtonCerrarOrderByUpdateDetalle;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public UpdateDetalleLogic updatedetalleLogic;
	
	
	
	public JScrollPane jScrollPanelDatosUpdateDetalle;
	public JScrollPane jScrollPanelDatosEdicionUpdateDetalle;
	public JScrollPane jScrollPanelDatosGeneralUpdateDetalle;
    
	
	
	//public JScrollPane jScrollPanelDatosUpdateDetalleOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoUpdateDetalle;
	//public JScrollPane jScrollPanelImportacionUpdateDetalle;
	
	
	
	protected JPanel jPanelAccionesUpdateDetalle;
	
    protected JPanel jPanelPaginacionUpdateDetalle;
    protected JPanel jPanelParametrosReportesUpdateDetalle;
	protected JPanel jPanelParametrosReportesAccionesUpdateDetalle;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1UpdateDetalle;
	protected JPanel jPanelParametrosAuxiliar2UpdateDetalle;
	protected JPanel jPanelParametrosAuxiliar3UpdateDetalle;
	protected JPanel jPanelParametrosAuxiliar4UpdateDetalle;
	//protected JPanel jPanelParametrosAuxiliar5UpdateDetalle;
	
	
	
	//protected JPanel jPanelReporteDinamicoUpdateDetalle;
	//protected JPanel jPanelImportacionUpdateDetalle;
	
	
	public JTable jTableDatosUpdateDetalle;
	
	
	
	//public JTable jTableDatosUpdateDetalleOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoUpdateDetalle;
	protected JButton jButtonDuplicarUpdateDetalle;
	protected JButton jButtonCopiarUpdateDetalle;
	protected JButton jButtonVerFormUpdateDetalle;
	protected JButton jButtonNuevoRelacionesUpdateDetalle;
	protected JButton jButtonModificarUpdateDetalle;
	
    protected JButton jButtonGuardarCambiosTablaUpdateDetalle;
	protected JButton jButtonCerrarUpdateDetalle;
	
	
	protected JButton jButtonRecargarInformacionUpdateDetalle;
	protected JButton jButtonProcesarInformacionUpdateDetalle;
	
	
	protected JButton jButtonAnterioresUpdateDetalle;
	protected JButton jButtonSiguientesUpdateDetalle;
	protected JButton jButtonNuevoGuardarCambiosUpdateDetalle;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoUpdateDetalle;
	//protected JButton jButtonCerrarReporteDinamicoUpdateDetalle;
	//protected JButton jButtonGenerarExcelReporteDinamicoUpdateDetalle;	
	
	
	
	//protected JButton jButtonAbrirImportacionUpdateDetalle;
	//protected JButton jButtonGenerarImportacionUpdateDetalle;
	//protected JButton jButtonCerrarImportacionUpdateDetalle;
	//protected JFileChooser jFileChooserImportacionUpdateDetalle;
	//protected File fileImportacionUpdateDetalle;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUpdateDetalle;
	protected JButton jButtonDuplicarToolBarUpdateDetalle;
	protected JButton jButtonNuevoRelacionesToolBarUpdateDetalle;
	
	
	public JButton jButtonGuardarCambiosToolBarUpdateDetalle;
	protected JButton jButtonCopiarToolBarUpdateDetalle;
	protected JButton jButtonVerFormToolBarUpdateDetalle;
	public JButton jButtonGuardarCambiosTablaToolBarUpdateDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarUpdateDetalle;
	protected JButton jButtonCerrarToolBarUpdateDetalle;
	
	protected JButton jButtonRecargarInformacionToolBarUpdateDetalle;
	protected JButton jButtonProcesarInformacionToolBarUpdateDetalle;
	protected JButton jButtonAnterioresToolBarUpdateDetalle;
	protected JButton jButtonSiguientesToolBarUpdateDetalle;
	protected JButton jButtonNuevoGuardarCambiosToolBarUpdateDetalle;
	protected JButton jButtonAbrirOrderByToolBarUpdateDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUpdateDetalle;
	protected JMenuItem jMenuItemDuplicarUpdateDetalle;
	protected JMenuItem jMenuItemNuevoRelacionesUpdateDetalle;
	
	
	protected JMenuItem jMenuItemGuardarCambiosUpdateDetalle;
	protected JMenuItem jMenuItemCopiarUpdateDetalle;
	protected JMenuItem jMenuItemVerFormUpdateDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaUpdateDetalle;
	protected JMenuItem jMenuItemCerrarUpdateDetalle;
	protected JMenuItem jMenuItemDetalleCerrarUpdateDetalle;
	protected JMenuItem jMenuItemDetalleAbrirOrderByUpdateDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarUpdateDetalle;
	
	protected JMenuItem jMenuItemRecargarInformacionUpdateDetalle;
	protected JMenuItem jMenuItemProcesarInformacionUpdateDetalle;
	protected JMenuItem jMenuItemAnterioresUpdateDetalle;
	protected JMenuItem jMenuItemSiguientesUpdateDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUpdateDetalle;
	protected JMenuItem jMenuItemAbrirOrderByUpdateDetalle;
	protected JMenuItem jMenuItemMostrarOcultarUpdateDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUpdateDetalle;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosUpdateDetalle;
	protected JCheckBox jCheckBoxSeleccionadosUpdateDetalle;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaUpdateDetalle;
	protected JCheckBox jCheckBoxConGraficoReporteUpdateDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesUpdateDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesUpdateDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoUpdateDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoUpdateDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesUpdateDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionUpdateDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUpdateDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUpdateDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarUpdateDetalle;
	protected JTextField jTextFieldValorCampoGeneralUpdateDetalle;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteUpdateDetalle;
	//public JList<Reporte> jListColumnasSelectReporteUpdateDetalle;
	//public JScrollPane jScrollColumnasSelectReporteUpdateDetalle;
	
	//public JLabel jLabelRelacionesSelectReporteUpdateDetalle;
	//public JList<Reporte> jListRelacionesSelectReporteUpdateDetalle;
	//public JScrollPane jScrollRelacionesSelectReporteUpdateDetalle;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoUpdateDetalle;
	//protected JCheckBox jCheckBoxConGraficoDinamicoUpdateDetalle;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoUpdateDetalle;
	//public JLabel jLabelTiposArchivoReporteDinamicoUpdateDetalle;
	
		
	//public JLabel jLabelArchivoImportacionUpdateDetalle;	
	//public JLabel jLabelPathArchivoImportacionUpdateDetalle;
	//protected JTextField jTextFieldPathArchivoImportacionUpdateDetalle;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoUpdateDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoUpdateDetalle;
	
	//public JLabel jLabelColumnaCategoriaValorUpdateDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorUpdateDetalle;
	
	//public JLabel jLabelColumnasValoresGraficoUpdateDetalle;
	//public JList<Reporte> jListColumnasValoresGraficoUpdateDetalle;
	//public JScrollPane jScrollColumnasValoresGraficoUpdateDetalle;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoUpdateDetalle;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoUpdateDetalle;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasUpdateDetalle;
	public JPanel jPanelFK_IdAnioUpdateDetalle;
	public JButton jButtonFK_IdAnioUpdateDetalle;
	public JPanel jPanelFK_IdMesUpdateDetalle;
	public JButton jButtonFK_IdMesUpdateDetalle;
	public JPanel jPanelFK_IdUpdateUpdateDetalle;
	public JButton jButtonFK_IdUpdateUpdateDetalle;
	
	public JPanel jPanelid_anioFK_IdAnioUpdateDetalle;
	public JLabel jLabelid_anioFK_IdAnioUpdateDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioUpdateDetalle;
	public JButton jButtonid_anioFK_IdAnioUpdateDetalle= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioUpdateDetalleUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioUpdateDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesUpdateDetalle;
	public JLabel jLabelid_mesFK_IdMesUpdateDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesUpdateDetalle;
	public JButton jButtonid_mesFK_IdMesUpdateDetalle= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesUpdateDetalleUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesUpdateDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelid_updateFK_IdUpdateUpdateDetalle;
	public JLabel jLabelid_updateFK_IdUpdateUpdateDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_updateFK_IdUpdateUpdateDetalle;
	public JButton jButtonid_updateFK_IdUpdateUpdateDetalle= new JButtonMe();
	public JButton jButtonid_updateFK_IdUpdateUpdateDetalleUpdate= new JButtonMe();
	public JButton jButtonid_updateFK_IdUpdateUpdateDetalleBusqueda= new JButtonMe();

	
	
	
	
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
	public UpdateDetalleJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("UpdateDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UpdateDetalleJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UpdateDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UpdateDetalleJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UpdateDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UpdateDetalleJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UpdateDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionUpdateDetalle)	{
		this.jButtonRecargarInformacionUpdateDetalle = jButtonRecargarInformacionUpdateDetalle;
	}
	
	public JButton getjButtonProcesarInformacionUpdateDetalle() {
		return this.jButtonProcesarInformacionUpdateDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUpdateDetalle)	{
		this.jButtonProcesarInformacionUpdateDetalle = jButtonProcesarInformacionUpdateDetalle;
	}
	
	
	public JButton getjButtonRecargarInformacionUpdateDetalle() {
		return this.jButtonRecargarInformacionUpdateDetalle;
	}
	
	
	public List<UpdateDetalle> getupdatedetalles() {
		return this.updatedetalles;
	}

	public void setupdatedetalles(List<UpdateDetalle> updatedetalles) {
		this.updatedetalles = updatedetalles;
	}
	
	public List<UpdateDetalle> getupdatedetallesAux() {
		return this.updatedetallesAux;
	}

	public void setupdatedetallesAux(List<UpdateDetalle> updatedetallesAux) {
		this.updatedetallesAux = updatedetallesAux;
	}
	
	public List<UpdateDetalle> getupdatedetallesEliminados() {
		return this.updatedetallesEliminados;
	}

	public void setUpdateDetallesEliminados(List<UpdateDetalle> updatedetallesEliminados) {
		this.updatedetallesEliminados = updatedetallesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarUpdateDetalle() {
		return jComboBoxTiposSeleccionarUpdateDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarUpdateDetalle(
			JComboBox jComboBoxTiposSeleccionarUpdateDetalle) {
		this.jComboBoxTiposSeleccionarUpdateDetalle = jComboBoxTiposSeleccionarUpdateDetalle;
	}
	
	public void setBorderResaltarTiposSeleccionarUpdateDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarUpdateDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarUpdateDetalle .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralUpdateDetalle() {
		return jTextFieldValorCampoGeneralUpdateDetalle;
	}

	public void setjTextFieldValorCampoGeneralUpdateDetalle(
			JTextField jTextFieldValorCampoGeneralUpdateDetalle) {
		this.jTextFieldValorCampoGeneralUpdateDetalle = jTextFieldValorCampoGeneralUpdateDetalle;
	}

	public void setBorderResaltarValorCampoGeneralUpdateDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdateDetalle.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralUpdateDetalle .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosUpdateDetalle() {
		return this.jCheckBoxSeleccionarTodosUpdateDetalle;
	}

	public void setjCheckBoxSeleccionarTodosUpdateDetalle(
			JCheckBox jCheckBoxSeleccionarTodosUpdateDetalle) {
		this.jCheckBoxSeleccionarTodosUpdateDetalle = jCheckBoxSeleccionarTodosUpdateDetalle;
	}

	public void setBorderResaltarSeleccionarTodosUpdateDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdateDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosUpdateDetalle .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosUpdateDetalle() {
		return this.jCheckBoxSeleccionadosUpdateDetalle;
	}

	public void setjCheckBoxSeleccionadosUpdateDetalle(
			JCheckBox jCheckBoxSeleccionadosUpdateDetalle) {
		this.jCheckBoxSeleccionadosUpdateDetalle = jCheckBoxSeleccionadosUpdateDetalle;
	}
	
	public void setBorderResaltarSeleccionadosUpdateDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdateDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosUpdateDetalle .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesUpdateDetalle() {
		return this.jComboBoxTiposArchivosReportesUpdateDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesUpdateDetalle(
			JComboBox jComboBoxTiposArchivosReportesUpdateDetalle) {
		this.jComboBoxTiposArchivosReportesUpdateDetalle = jComboBoxTiposArchivosReportesUpdateDetalle;
	}

	public void setBorderResaltarTiposArchivosReportesUpdateDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdateDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesUpdateDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesUpdateDetalle() {
		return this.jComboBoxTiposReportesUpdateDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesUpdateDetalle(
			JComboBox jComboBoxTiposReportesUpdateDetalle) {
		this.jComboBoxTiposReportesUpdateDetalle = jComboBoxTiposReportesUpdateDetalle;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoUpdateDetalle() {
	//	return jComboBoxTiposReportesDinamicoUpdateDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoUpdateDetalle(
	//		JComboBox jComboBoxTiposReportesDinamicoUpdateDetalle) {
	//	this.jComboBoxTiposReportesDinamicoUpdateDetalle = jComboBoxTiposReportesDinamicoUpdateDetalle;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoUpdateDetalle() {
	//	return jComboBoxTiposArchivosReportesDinamicoUpdateDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoUpdateDetalle(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoUpdateDetalle) {
	//	this.jComboBoxTiposArchivosReportesDinamicoUpdateDetalle = jComboBoxTiposArchivosReportesDinamicoUpdateDetalle;
	//}
	
	public void setBorderResaltarTiposReportesUpdateDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdateDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesUpdateDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesUpdateDetalle() {
		return this.jComboBoxTiposGraficosReportesUpdateDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesUpdateDetalle(
			JComboBox jComboBoxTiposGraficosReportesUpdateDetalle) {
		this.jComboBoxTiposGraficosReportesUpdateDetalle = jComboBoxTiposGraficosReportesUpdateDetalle;
	}
	
	public void setBorderResaltarTiposGraficosReportesUpdateDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdateDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesUpdateDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionUpdateDetalle() {
		return this.jComboBoxTiposPaginacionUpdateDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionUpdateDetalle(
			JComboBox jComboBoxTiposPaginacionUpdateDetalle) {
		this.jComboBoxTiposPaginacionUpdateDetalle = jComboBoxTiposPaginacionUpdateDetalle;
	}
	
	public void setBorderResaltarTiposPaginacionUpdateDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdateDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionUpdateDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesUpdateDetalle() {
		return this.jComboBoxTiposRelacionesUpdateDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUpdateDetalle() {
		return this.jComboBoxTiposAccionesUpdateDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUpdateDetalle(
			JComboBox jComboBoxTiposRelacionesUpdateDetalle) {
		this.jComboBoxTiposRelacionesUpdateDetalle = jComboBoxTiposRelacionesUpdateDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUpdateDetalle(
			JComboBox jComboBoxTiposAccionesUpdateDetalle) {
		this.jComboBoxTiposAccionesUpdateDetalle = jComboBoxTiposAccionesUpdateDetalle;
	}
	
	public void setBorderResaltarTiposRelacionesUpdateDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdateDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesUpdateDetalle .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesUpdateDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarUpdateDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesUpdateDetalle .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoUpdateDetalle() {
	//	return jCheckBoxConGraficoDinamicoUpdateDetalle;
	//}

	//public void setjCheckBoxConGraficoDinamicoUpdateDetalle(
	//		JCheckBox jCheckBoxConGraficoDinamicoUpdateDetalle) {
	//	this.jCheckBoxConGraficoDinamicoUpdateDetalle = jCheckBoxConGraficoDinamicoUpdateDetalle;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoUpdateDetalle() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarUpdateDetalle.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoUpdateDetalle .setBorder(borderResaltar);		
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
		this.updatedetalleSessionBean=new UpdateDetalleSessionBean();
		
		this.updatedetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.updatedetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.updatedetalleSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=UpdateDetalleJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=UpdateDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UpdateDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UpdateDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UpdateDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Update Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
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
		
		UpdateDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("UpdateDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarUpdateDetalle= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarUpdateDetalle,this.jTtoolBarUpdateDetalle,
							"nuevo","nuevo","Nuevo"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarUpdateDetalle,this.jTtoolBarUpdateDetalle,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarUpdateDetalle,this.jTtoolBarUpdateDetalle,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarUpdateDetalle,this.jTtoolBarUpdateDetalle,
							"duplicar","duplicar","Duplicar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarUpdateDetalle,this.jTtoolBarUpdateDetalle,
							"copiar","copiar","Copiar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarUpdateDetalle,this.jTtoolBarUpdateDetalle,
							"ver_form","ver_form","Ver"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUpdateDetalle,this.jTtoolBarUpdateDetalle,
							"recargar","recargar","Recargar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUpdateDetalle,this.jTtoolBarUpdateDetalle,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarUpdateDetalle,this.jTtoolBarUpdateDetalle,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarUpdateDetalle,this.jTtoolBarUpdateDetalle,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarUpdateDetalle,this.jTtoolBarUpdateDetalle,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarUpdateDetalle,this.jTtoolBarUpdateDetalle,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarUpdateDetalle,this.jTtoolBarUpdateDetalle,
							"cerrar","cerrar","Salir"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarUpdateDetalle=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarUpdateDetalle;
			
				this.jButtonProcesarInformacionToolBarUpdateDetalle=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarUpdateDetalle;
				
		//protected JButton jButtonModificarToolBarUpdateDetalle;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarUpdateDetalle=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuUpdateDetalle=new JMenuMe("General");
		this.jmenuArchivoUpdateDetalle=new JMenuMe("Archivo");
		this.jmenuAccionesUpdateDetalle=new JMenuMe("Acciones");
		this.jmenuDatosUpdateDetalle=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUpdateDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUpdateDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUpdateDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarUpdateDetalle= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarUpdateDetalle.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarUpdateDetalle,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesUpdateDetalle= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesUpdateDetalle.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesUpdateDetalle,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosUpdateDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUpdateDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUpdateDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarUpdateDetalle= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarUpdateDetalle.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarUpdateDetalle,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormUpdateDetalle= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormUpdateDetalle.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormUpdateDetalle,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaUpdateDetalle= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaUpdateDetalle.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaUpdateDetalle,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUpdateDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUpdateDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUpdateDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionUpdateDetalle= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionUpdateDetalle.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionUpdateDetalle,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionUpdateDetalle= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionUpdateDetalle.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionUpdateDetalle,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresUpdateDetalle= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresUpdateDetalle.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresUpdateDetalle,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesUpdateDetalle= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesUpdateDetalle.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesUpdateDetalle,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByUpdateDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByUpdateDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByUpdateDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUpdateDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUpdateDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUpdateDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByUpdateDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByUpdateDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByUpdateDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUpdateDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUpdateDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUpdateDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosUpdateDetalle= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosUpdateDetalle.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosUpdateDetalle,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoUpdateDetalle.add(this.jMenuItemCerrarUpdateDetalle);
			
			this.jmenuAccionesUpdateDetalle.add(this.jMenuItemNuevoUpdateDetalle);
			this.jmenuAccionesUpdateDetalle.add(this.jMenuItemNuevoGuardarCambiosUpdateDetalle);
			this.jmenuAccionesUpdateDetalle.add(this.jMenuItemNuevoRelacionesUpdateDetalle);
			this.jmenuAccionesUpdateDetalle.add(this.jMenuItemGuardarCambiosTablaUpdateDetalle);		
			this.jmenuAccionesUpdateDetalle.add(this.jMenuItemDuplicarUpdateDetalle);		
			this.jmenuAccionesUpdateDetalle.add(this.jMenuItemCopiarUpdateDetalle);		
			this.jmenuAccionesUpdateDetalle.add(this.jMenuItemVerFormUpdateDetalle);		
			
			this.jmenuDatosUpdateDetalle.add(this.jMenuItemRecargarInformacionUpdateDetalle);				
			this.jmenuDatosUpdateDetalle.add(this.jMenuItemAnterioresUpdateDetalle);				
			this.jmenuDatosUpdateDetalle.add(this.jMenuItemSiguientesUpdateDetalle);				
			this.jmenuDatosUpdateDetalle.add(this.jMenuItemAbrirOrderByUpdateDetalle);				
			this.jmenuDatosUpdateDetalle.add(this.jMenuItemMostrarOcultarUpdateDetalle);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesUpdateDetalle.add(this.jMenuItemGuardarCambiosUpdateDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarUpdateDetalle.add(this.jmenuArchivoUpdateDetalle);		
			this.jmenuBarUpdateDetalle.add(this.jmenuAccionesUpdateDetalle);		
			this.jmenuBarUpdateDetalle.add(this.jmenuDatosUpdateDetalle);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarUpdateDetalle);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasUpdateDetalle() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioUpdateDetalle.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioUpdateDetalle= new JButtonMe();
		this.jButtonFK_IdAnioUpdateDetalle.setText("Buscar");
		this.jButtonFK_IdAnioUpdateDetalle.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioUpdateDetalle,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioUpdateDetalle = new JLabelMe();
		jLabelid_anioFK_IdAnioUpdateDetalle.setText("Anio :");
		jLabelid_anioFK_IdAnioUpdateDetalle.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioUpdateDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioUpdateDetalle= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioUpdateDetalle,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesUpdateDetalle.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesUpdateDetalle= new JButtonMe();
		this.jButtonFK_IdMesUpdateDetalle.setText("Buscar");
		this.jButtonFK_IdMesUpdateDetalle.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesUpdateDetalle,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesUpdateDetalle = new JLabelMe();
		jLabelid_mesFK_IdMesUpdateDetalle.setText("Mes :");
		jLabelid_mesFK_IdMesUpdateDetalle.setToolTipText("Mes");
		jLabelid_mesFK_IdMesUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesUpdateDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesUpdateDetalle= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesUpdateDetalle,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUpdateUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUpdateUpdateDetalle.setToolTipText("Buscar Por Update ");
		this.jButtonFK_IdUpdateUpdateDetalle= new JButtonMe();
		this.jButtonFK_IdUpdateUpdateDetalle.setText("Buscar");
		this.jButtonFK_IdUpdateUpdateDetalle.setToolTipText("Buscar Por Update ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUpdateUpdateDetalle,"buscar_button","Buscar Por Update ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUpdateUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_updateFK_IdUpdateUpdateDetalle = new JLabelMe();
		jLabelid_updateFK_IdUpdateUpdateDetalle.setText("Update :");
		jLabelid_updateFK_IdUpdateUpdateDetalle.setToolTipText("Update");
		jLabelid_updateFK_IdUpdateUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_updateFK_IdUpdateUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_updateFK_IdUpdateUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_updateFK_IdUpdateUpdateDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_updateFK_IdUpdateUpdateDetalle= new JComboBoxMe();
		jComboBoxid_updateFK_IdUpdateUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_updateFK_IdUpdateUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_updateFK_IdUpdateUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_updateFK_IdUpdateUpdateDetalle,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasUpdateDetalle=new JTabbedPane();


		this.jTabbedPaneBusquedasUpdateDetalle.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUpdateDetalle.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasUpdateDetalle.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasUpdateDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasUpdateDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleUpdateDetalle = new UpdateDetalleDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Update Detalle DATOS");
			this.jInternalFrameDetalleFormUpdateDetalle = new UpdateDetalleDetalleFormJInternalFrame(jDesktopPane,this.updatedetalleSessionBean.getConGuardarRelaciones(),this.updatedetalleSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormUpdateDetalle = null;//new UpdateDetalleDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUpdateDetalle= new GridBagLayout();
		
		
		this.jTableDatosUpdateDetalle = new JTableMe();      
		
		String sToolTipUpdateDetalle="";
		sToolTipUpdateDetalle=UpdateDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUpdateDetalle+="(Seguridad.UpdateDetalle)";
		}
		
		if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipUpdateDetalle+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosUpdateDetalle.setToolTipText(sToolTipUpdateDetalle);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosUpdateDetalle);
		this.jTableDatosUpdateDetalle.setAutoCreateRowSorter(true);
		this.jTableDatosUpdateDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosUpdateDetalle.setRowSelectionAllowed(true);
		this.jTableDatosUpdateDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosUpdateDetalle,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoUpdateDetalle = new JButtonMe();
		this.jButtonDuplicarUpdateDetalle = new JButtonMe();
		this.jButtonCopiarUpdateDetalle = new JButtonMe();
		this.jButtonVerFormUpdateDetalle = new JButtonMe();
		this.jButtonNuevoRelacionesUpdateDetalle = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaUpdateDetalle = new JButtonMe();
		this.jButtonCerrarUpdateDetalle = new JButtonMe();
		
		this.jScrollPanelDatosUpdateDetalle = new JScrollPane();   
        this.jScrollPanelDatosGeneralUpdateDetalle = new JScrollPane();
		
				
		
		
		this.jPanelAccionesUpdateDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Update Detalle";
		
		if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Update Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosUpdateDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUpdateDetalle.setToolTipText("Acciones");
        this.jPanelAccionesUpdateDetalle.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoUpdateDetalle=new ReporteDinamicoJInternalFrame(UpdateDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoUpdateDetalle();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionUpdateDetalle=new ImportacionJInternalFrame(UpdateDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionUpdateDetalle();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByUpdateDetalle = new JButtonMe();
		
		this.jButtonAbrirOrderByUpdateDetalle.setText("Orden");
		this.jButtonAbrirOrderByUpdateDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUpdateDetalle,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByUpdateDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUpdateDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUpdateDetalle,false,this);
			
			//this.cargarOrderByUpdateDetalle(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByUpdateDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUpdateDetalle,true,this);
			
			//this.cargarOrderByUpdateDetalle(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosUpdateDetalle.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosUpdateDetalle.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosUpdateDetalle.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosUpdateDetalle.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosUpdateDetalle.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosUpdateDetalle.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoUpdateDetalle.setText("Nuevo");
		this.jButtonDuplicarUpdateDetalle.setText("Duplicar");
		this.jButtonCopiarUpdateDetalle.setText("Copiar");
		this.jButtonVerFormUpdateDetalle.setText("Ver");
		this.jButtonNuevoRelacionesUpdateDetalle.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaUpdateDetalle.setText("Guardar");
		this.jButtonCerrarUpdateDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUpdateDetalle,"nuevo_button","Nuevo",this.updatedetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarUpdateDetalle,"duplicar_button","Duplicar",this.updatedetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarUpdateDetalle,"copiar_button","Copiar",this.updatedetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormUpdateDetalle,"ver_form","Ver",this.updatedetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesUpdateDetalle,"nuevorelaciones_button","Nuevo Rel",this.updatedetalleSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUpdateDetalle,"guardarcambiostabla_button","Guardar",this.updatedetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUpdateDetalle,"cerrar_button","Salir",this.updatedetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoUpdateDetalle.setToolTipText("Nuevo"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarUpdateDetalle.setToolTipText("Duplicar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarUpdateDetalle.setToolTipText("Copiar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormUpdateDetalle.setToolTipText("Ver"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesUpdateDetalle.setToolTipText("Nuevo Rel"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaUpdateDetalle.setToolTipText("Guardar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUpdateDetalle.setToolTipText("Salir"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUpdateDetalle";
		inputMap = this.jButtonNuevoUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUpdateDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUpdateDetalle"));
		
		//DUPLICAR
		sMapKey = "DuplicarUpdateDetalle";
		inputMap = this.jButtonDuplicarUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarUpdateDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarUpdateDetalle"));
		
		//COPIAR
		sMapKey = "CopiarUpdateDetalle";
		inputMap = this.jButtonCopiarUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarUpdateDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarUpdateDetalle"));
		
		//VEr FORM
		sMapKey = "VerFormUpdateDetalle";
		inputMap = this.jButtonVerFormUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormUpdateDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormUpdateDetalle"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesUpdateDetalle";
		inputMap = this.jButtonNuevoRelacionesUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesUpdateDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesUpdateDetalle"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarUpdateDetalle";
		inputMap = this.jButtonModificarUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarUpdateDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarUpdateDetalle"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarUpdateDetalle";
		inputMap = this.jButtonCerrarUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUpdateDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUpdateDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUpdateDetalle";
		inputMap = this.jButtonGuardarCambiosTablaUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUpdateDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUpdateDetalle"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesUpdateDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesUpdateDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionUpdateDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1UpdateDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2UpdateDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3UpdateDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4UpdateDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5UpdateDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesUpdateDetalle.setName("jPanelParametrosReportesUpdateDetalle"); 
		
		this.jPanelParametrosReportesAccionesUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesUpdateDetalle.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesUpdateDetalle.setName("jPanelParametrosReportesAccionesUpdateDetalle"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionUpdateDetalle = new JButtonMe();
		this.jButtonRecargarInformacionUpdateDetalle.setText("Recargar");
		this.jButtonRecargarInformacionUpdateDetalle.setToolTipText("Recargar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionUpdateDetalle,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionUpdateDetalle = new JButtonMe();
		this.jButtonProcesarInformacionUpdateDetalle.setText("Procesar");
		this.jButtonProcesarInformacionUpdateDetalle.setToolTipText("Procesar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionUpdateDetalle.setVisible(false);
			
		this.jButtonProcesarInformacionUpdateDetalle.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUpdateDetalle.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionUpdateDetalle.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesUpdateDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUpdateDetalle.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesUpdateDetalle.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesUpdateDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUpdateDetalle.setText("TIPO");       
		this.jComboBoxTiposReportesUpdateDetalle.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesUpdateDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesUpdateDetalle.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesUpdateDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionUpdateDetalle = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionUpdateDetalle.setText("Paginacion");
		this.jComboBoxTiposPaginacionUpdateDetalle.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesUpdateDetalle = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesUpdateDetalle.setText("Accion");
		this.jComboBoxTiposRelacionesUpdateDetalle.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesUpdateDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUpdateDetalle.setText("Accion");
		this.jComboBoxTiposAccionesUpdateDetalle.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarUpdateDetalle = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarUpdateDetalle.setText("Accion");
		this.jComboBoxTiposSeleccionarUpdateDetalle.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralUpdateDetalle=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralUpdateDetalle.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUpdateDetalle.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralUpdateDetalle.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesUpdateDetalle = new JLabelMe();
		
		this.jLabelAccionesUpdateDetalle.setText("Acciones");		
		this.jLabelAccionesUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosUpdateDetalle = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosUpdateDetalle.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosUpdateDetalle.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosUpdateDetalle = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosUpdateDetalle.setText("Seleccionados");
		this.jCheckBoxSeleccionadosUpdateDetalle.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaUpdateDetalle = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaUpdateDetalle.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaUpdateDetalle.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteUpdateDetalle = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteUpdateDetalle.setText("Graf.");
		this.jCheckBoxConGraficoReporteUpdateDetalle.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresUpdateDetalle = new JButtonMe();
		//this.jButtonAnterioresUpdateDetalle.setText("<<");
        this.jButtonAnterioresUpdateDetalle.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresUpdateDetalle,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesUpdateDetalle = new JButtonMe();
		//this.jButtonSiguientesUpdateDetalle.setText(">>");
        this.jButtonSiguientesUpdateDetalle.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesUpdateDetalle,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosUpdateDetalle = new JButtonMe();
		this.jButtonNuevoGuardarCambiosUpdateDetalle.setText("Nue");
        this.jButtonNuevoGuardarCambiosUpdateDetalle.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosUpdateDetalle,"nuevoguardarcambios_button","Nue",this.updatedetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosUpdateDetalle";
		inputMap = this.jButtonNuevoGuardarCambiosUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosUpdateDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosUpdateDetalle"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionUpdateDetalle";
		inputMap = this.jButtonRecargarInformacionUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionUpdateDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionUpdateDetalle"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesUpdateDetalle";
		inputMap = this.jButtonSiguientesUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesUpdateDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesUpdateDetalle"));
		
		//ANTERIORES		
		sMapKey = "AnterioresUpdateDetalle";
		inputMap = this.jButtonAnterioresUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresUpdateDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresUpdateDetalle"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasUpdateDetalle();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesUpdateDetalle.setMinimumSize(new Dimension(this.getWidth(),UpdateDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UpdateDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUpdateDetalle.setMaximumSize(new Dimension(this.getWidth(),UpdateDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UpdateDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesUpdateDetalle.setPreferredSize(new Dimension(this.getWidth(),UpdateDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(UpdateDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionUpdateDetalle = new GridBagLayout();

			this.jPanelPaginacionUpdateDetalle.setLayout(gridaBagLayoutPaginacionUpdateDetalle);						
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.gridy = 0;
			this.gridBagConstraintsUpdateDetalle.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionUpdateDetalle.add(this.jButtonAnterioresUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
					
						
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUpdateDetalle.gridy = 0;
			
			this.jPanelPaginacionUpdateDetalle.add(this.jButtonNuevoGuardarCambiosUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
						
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsUpdateDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsUpdateDetalle.gridy = 0;
			this.jPanelPaginacionUpdateDetalle.add(this.jButtonSiguientesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.gridy = 1;
			this.gridBagConstraintsUpdateDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUpdateDetalle.add(this.jButtonNuevoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
						
			
			
			if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
				this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsUpdateDetalle.gridy = 1;
				this.gridBagConstraintsUpdateDetalle.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionUpdateDetalle.add(this.jButtonGuardarCambiosTablaUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
			}
			
			
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.gridy = 1;
			this.gridBagConstraintsUpdateDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUpdateDetalle.add(this.jButtonDuplicarUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.gridy = 1;
			this.gridBagConstraintsUpdateDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUpdateDetalle.add(this.jButtonCopiarUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.gridy = 1;
			this.gridBagConstraintsUpdateDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionUpdateDetalle.add(this.jButtonVerFormUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.gridy = 1;
			this.gridBagConstraintsUpdateDetalle.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionUpdateDetalle.add(this.jButtonCerrarUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		
		
		
		this.jButtonRecargarInformacionUpdateDetalle.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUpdateDetalle.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionUpdateDetalle.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesUpdateDetalle.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUpdateDetalle.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesUpdateDetalle.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesUpdateDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUpdateDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesUpdateDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesUpdateDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUpdateDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesUpdateDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionUpdateDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUpdateDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionUpdateDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesUpdateDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUpdateDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesUpdateDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesUpdateDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUpdateDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUpdateDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarUpdateDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUpdateDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarUpdateDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaUpdateDetalle.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUpdateDetalle.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaUpdateDetalle.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteUpdateDetalle.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUpdateDetalle.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteUpdateDetalle.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosUpdateDetalle.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUpdateDetalle.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosUpdateDetalle.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosUpdateDetalle.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUpdateDetalle.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosUpdateDetalle.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesUpdateDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesUpdateDetalle = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1UpdateDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2UpdateDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3UpdateDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4UpdateDetalle = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesUpdateDetalle.setLayout(gridaBagParametrosReportesUpdateDetalle);
			this.jPanelParametrosReportesAccionesUpdateDetalle.setLayout(gridaBagParametrosReportesAccionesUpdateDetalle);
			
			
			this.jPanelParametrosAuxiliar1UpdateDetalle.setLayout(gridaBagParametrosAuxiliar1UpdateDetalle);
			this.jPanelParametrosAuxiliar2UpdateDetalle.setLayout(gridaBagParametrosAuxiliar2UpdateDetalle);
			this.jPanelParametrosAuxiliar3UpdateDetalle.setLayout(gridaBagParametrosAuxiliar3UpdateDetalle);
			this.jPanelParametrosAuxiliar4UpdateDetalle.setLayout(gridaBagParametrosAuxiliar4UpdateDetalle);
			//this.jPanelParametrosAuxiliar5UpdateDetalle.setLayout(gridaBagParametrosAuxiliar2UpdateDetalle);			
			
			
			
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUpdateDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUpdateDetalle.add(this.jButtonRecargarInformacionUpdateDetalle, this.gridBagConstraintsUpdateDetalle);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUpdateDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UpdateDetalle.add(this.jComboBoxTiposPaginacionUpdateDetalle, this.gridBagConstraintsUpdateDetalle);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUpdateDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UpdateDetalle.add(this.jCheckBoxConAltoMaximoTablaUpdateDetalle, this.gridBagConstraintsUpdateDetalle);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsUpdateDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1UpdateDetalle.add(this.jComboBoxTiposArchivosReportesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUpdateDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUpdateDetalle.add(this.jPanelParametrosAuxiliar1UpdateDetalle, this.gridBagConstraintsUpdateDetalle);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUpdateDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4UpdateDetalle.add(this.jComboBoxTiposReportesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUpdateDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUpdateDetalle.add(this.jPanelParametrosAuxiliar4UpdateDetalle, this.gridBagConstraintsUpdateDetalle);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsUpdateDetalle.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUpdateDetalle.add(this.jComboBoxTiposReportesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUpdateDetalle.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUpdateDetalle.add(this.jCheckBoxGenerarReporteUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUpdateDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUpdateDetalle.add(this.jPanelParametrosAuxiliar2UpdateDetalle, this.gridBagConstraintsUpdateDetalle);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUpdateDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUpdateDetalle.add(this.jLabelAccionesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
				this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsUpdateDetalle.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsUpdateDetalle.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesUpdateDetalle.add(this.jButtonAbrirOrderByUpdateDetalle, this.gridBagConstraintsUpdateDetalle);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUpdateDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUpdateDetalle.add(this.jComboBoxTiposSeleccionarUpdateDetalle, this.gridBagConstraintsUpdateDetalle);			
			
			
			/*
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsUpdateDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesUpdateDetalle.add(this.jCheckBoxSeleccionarTodosUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUpdateDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UpdateDetalle.add(this.jCheckBoxSeleccionarTodosUpdateDetalle, this.gridBagConstraintsUpdateDetalle);															
				
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsUpdateDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3UpdateDetalle.add(this.jCheckBoxSeleccionadosUpdateDetalle, this.gridBagConstraintsUpdateDetalle);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUpdateDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesUpdateDetalle.add(this.jPanelParametrosAuxiliar3UpdateDetalle, this.gridBagConstraintsUpdateDetalle);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsUpdateDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesUpdateDetalle.add(this.jComboBoxTiposAccionesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosUpdateDetalle = new GridBagLayout();

			this.jScrollPanelDatosUpdateDetalle.setLayout(gridaBagLayoutDatosUpdateDetalle);
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.gridy = 0;
			this.gridBagConstraintsUpdateDetalle.gridx = 0;
			
			this.jScrollPanelDatosUpdateDetalle.add(this.jTableDatosUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosUpdateDetalle.setViewportView(this.jTableDatosUpdateDetalle);
		this.jTableDatosUpdateDetalle.setFillsViewportHeight(true);
		this.jTableDatosUpdateDetalle.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesUpdateDetalle= new GridBagLayout();
		this.jPanelAccionesUpdateDetalle.setLayout(gridaBagLayoutAccionesUpdateDetalle);
		
		
		/*	
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 0;
			
		this.jPanelAccionesUpdateDetalle.add(this.jButtonNuevoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioUpdateDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdAnioUpdateDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioUpdateDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioUpdateDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioUpdateDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioUpdateDetalle.setLayout(gridaBagLayoutFK_IdAnioUpdateDetalle);

		gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUpdateDetalle.gridy = 0;
		gridBagConstraintsUpdateDetalle.gridx = 0;
		jPanelFK_IdAnioUpdateDetalle.add(jLabelid_anioFK_IdAnioUpdateDetalle, gridBagConstraintsUpdateDetalle);

		gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUpdateDetalle.gridy = 0;
		gridBagConstraintsUpdateDetalle.gridx = 1;
		jPanelFK_IdAnioUpdateDetalle.add(jComboBoxid_anioFK_IdAnioUpdateDetalle, gridBagConstraintsUpdateDetalle);

		gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUpdateDetalle.gridy = 1;
		gridBagConstraintsUpdateDetalle.gridx =1;
		jPanelFK_IdAnioUpdateDetalle.add(jButtonFK_IdAnioUpdateDetalle, gridBagConstraintsUpdateDetalle);

		jTabbedPaneBusquedasUpdateDetalle.addTab("1.-Por Anio ", jPanelFK_IdAnioUpdateDetalle);
		jTabbedPaneBusquedasUpdateDetalle.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdMesUpdateDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdMesUpdateDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesUpdateDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesUpdateDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesUpdateDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesUpdateDetalle.setLayout(gridaBagLayoutFK_IdMesUpdateDetalle);

		gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUpdateDetalle.gridy = 0;
		gridBagConstraintsUpdateDetalle.gridx = 0;
		jPanelFK_IdMesUpdateDetalle.add(jLabelid_mesFK_IdMesUpdateDetalle, gridBagConstraintsUpdateDetalle);

		gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUpdateDetalle.gridy = 0;
		gridBagConstraintsUpdateDetalle.gridx = 1;
		jPanelFK_IdMesUpdateDetalle.add(jComboBoxid_mesFK_IdMesUpdateDetalle, gridBagConstraintsUpdateDetalle);

		gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUpdateDetalle.gridy = 1;
		gridBagConstraintsUpdateDetalle.gridx =1;
		jPanelFK_IdMesUpdateDetalle.add(jButtonFK_IdMesUpdateDetalle, gridBagConstraintsUpdateDetalle);

		jTabbedPaneBusquedasUpdateDetalle.addTab("2.-Por Mes ", jPanelFK_IdMesUpdateDetalle);
		jTabbedPaneBusquedasUpdateDetalle.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdUpdateUpdateDetalle= new GridBagLayout();
		gridaBagLayoutFK_IdUpdateUpdateDetalle.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUpdateUpdateDetalle.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUpdateUpdateDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUpdateUpdateDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUpdateUpdateDetalle.setLayout(gridaBagLayoutFK_IdUpdateUpdateDetalle);

		gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUpdateDetalle.gridy = 0;
		gridBagConstraintsUpdateDetalle.gridx = 0;
		jPanelFK_IdUpdateUpdateDetalle.add(jLabelid_updateFK_IdUpdateUpdateDetalle, gridBagConstraintsUpdateDetalle);

		gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUpdateDetalle.gridy = 0;
		gridBagConstraintsUpdateDetalle.gridx = 1;
		jPanelFK_IdUpdateUpdateDetalle.add(jComboBoxid_updateFK_IdUpdateUpdateDetalle, gridBagConstraintsUpdateDetalle);

		gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsUpdateDetalle.gridy = 1;
		gridBagConstraintsUpdateDetalle.gridx =1;
		jPanelFK_IdUpdateUpdateDetalle.add(jButtonFK_IdUpdateUpdateDetalle, gridBagConstraintsUpdateDetalle);

		jTabbedPaneBusquedasUpdateDetalle.addTab("3.-Por Update ", jPanelFK_IdUpdateUpdateDetalle);
		jTabbedPaneBusquedasUpdateDetalle.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUpdateDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUpdateDetalle);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.updatedetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();						
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUpdateDetalle.gridx = 0;		
			//this.gridBagConstraintsUpdateDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUpdateDetalle.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarUpdateDetalle, this.gridBagConstraintsUpdateDetalle);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy = iGridyPrincipal++;
		this.gridBagConstraintsUpdateDetalle.gridx = 0;		
		//this.gridBagConstraintsUpdateDetalle.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsUpdateDetalle.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsUpdateDetalle);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUpdateDetalle.gridx = 0;		
			this.gridBagConstraintsUpdateDetalle.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsUpdateDetalle.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasUpdateDetalle, this.gridBagConstraintsUpdateDetalle);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUpdateDetalle.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);								
		
		
		/*
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUpdateDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		*/		
		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUpdateDetalle.gridx =0;
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUpdateDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
				
		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUpdateDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(UpdateDetalleJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosUpdateDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUpdateDetalle = new GridBagLayout();
			this.jPanelBusquedasParametrosUpdateDetalle.setLayout(gridaBagLayoutBusquedasParametrosUpdateDetalle);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralUpdateDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUpdateDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUpdateDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUpdateDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUpdateDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
			
			
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUpdateDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		
			
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUpdateDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralUpdateDetalle;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoUpdateDetalle() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoUpdateDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoUpdateDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoUpdateDetalle.setName("jPanelReporteDinamicoUpdateDetalle"); 
		
		this.jPanelReporteDinamicoUpdateDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUpdateDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoUpdateDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoUpdateDetalle.setLayout(gridaBagLayoutReporteDinamicoUpdateDetalle);
		
		
		this.jInternalFrameReporteDinamicoUpdateDetalle= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoUpdateDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUpdateDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoUpdateDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoUpdateDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoUpdateDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoUpdateDetalle.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoUpdateDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoUpdateDetalle.setResizable(true);
	    this.jInternalFrameReporteDinamicoUpdateDetalle.setClosable(true);
	    this.jInternalFrameReporteDinamicoUpdateDetalle.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoUpdateDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUpdateDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoUpdateDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Update Detalles"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteUpdateDetalle = new JLabelMe();

		this.jLabelColumnasSelectReporteUpdateDetalle.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoUpdateDetalle.add(this.jLabelColumnasSelectReporteUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteUpdateDetalle = new JList<Reporte>();
		this.jListColumnasSelectReporteUpdateDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteUpdateDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteUpdateDetalle.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUpdateDetalle.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteUpdateDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteUpdateDetalle=new JScrollPane(this.jListColumnasSelectReporteUpdateDetalle);
			
			this.jScrollColumnasSelectReporteUpdateDetalle.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUpdateDetalle.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteUpdateDetalle.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoUpdateDetalle.add(this.jListColumnasSelectReporteUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		this.jPanelReporteDinamicoUpdateDetalle.add(this.jScrollColumnasSelectReporteUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteUpdateDetalle = new JLabelMe();

		this.jLabelRelacionesSelectReporteUpdateDetalle.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteUpdateDetalle = new JList<Reporte>();
		this.jListRelacionesSelectReporteUpdateDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteUpdateDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteUpdateDetalle.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUpdateDetalle.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteUpdateDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteUpdateDetalle=new JScrollPane(this.jListRelacionesSelectReporteUpdateDetalle);
			
			this.jScrollRelacionesSelectReporteUpdateDetalle.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUpdateDetalle.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteUpdateDetalle.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoUpdateDetalle = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoUpdateDetalle = new JComboBoxMe();
		this.jListColumnasValoresGraficoUpdateDetalle = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoUpdateDetalle = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoUpdateDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoUpdateDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUpdateDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoUpdateDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoUpdateDetalle = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoUpdateDetalle.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoUpdateDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUpdateDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoUpdateDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoUpdateDetalle = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoUpdateDetalle.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUpdateDetalle.add(this.jLabelGenerarExcelReporteDinamicoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoUpdateDetalle = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoUpdateDetalle.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoUpdateDetalle,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoUpdateDetalle.setToolTipText("Generar EXCEL"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsUpdateDetalle.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsUpdateDetalle.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoUpdateDetalle.add(this.jButtonGenerarExcelReporteDinamicoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdateDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUpdateDetalle.add(this.jComboBoxTiposReportesDinamicoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoUpdateDetalle = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoUpdateDetalle.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoUpdateDetalle.add(this.jLabelTiposArchivoReporteDinamicoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdateDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUpdateDetalle.add(this.jComboBoxTiposArchivosReportesDinamicoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoUpdateDetalle = new JButtonMe();
		this.jButtonGenerarReporteDinamicoUpdateDetalle.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoUpdateDetalle,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoUpdateDetalle.setToolTipText("Generar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdateDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUpdateDetalle.add(this.jButtonGenerarReporteDinamicoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoUpdateDetalle = new JButtonMe();
		this.jButtonCerrarReporteDinamicoUpdateDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoUpdateDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoUpdateDetalle.setToolTipText("Cancelar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdateDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoUpdateDetalle.add(this.jButtonCerrarReporteDinamicoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalUpdateDetalle = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoUpdateDetalle= new JScrollPane(jPanelReporteDinamicoUpdateDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoUpdateDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUpdateDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoUpdateDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Update Detalles"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsUpdateDetalle.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoUpdateDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoUpdateDetalle.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalUpdateDetalle);
		this.jInternalFrameReporteDinamicoUpdateDetalle.getContentPane().add(this.jScrollPanelReporteDinamicoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionUpdateDetalle() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionUpdateDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionUpdateDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionUpdateDetalle.setName("jPanelImportacionUpdateDetalle"); 
		
		this.jPanelImportacionUpdateDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUpdateDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionUpdateDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionUpdateDetalle.setLayout(gridaBagLayoutImportacionUpdateDetalle);
		
		
		this.jInternalFrameImportacionUpdateDetalle= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionUpdateDetalle= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionUpdateDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteUpdateDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionUpdateDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUpdateDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUpdateDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionUpdateDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUpdateDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUpdateDetalle.setResizable(true);
	    this.jInternalFrameImportacionUpdateDetalle.setClosable(true);
	    this.jInternalFrameImportacionUpdateDetalle.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionUpdateDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionUpdateDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionUpdateDetalle.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionUpdateDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionUpdateDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionUpdateDetalle.setResizable(true);
	    this.jInternalFrameImportacionUpdateDetalle.setClosable(true);
	    this.jInternalFrameImportacionUpdateDetalle.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionUpdateDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUpdateDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionUpdateDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Update Detalles"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionUpdateDetalle = new JLabelMe();

		this.jLabelArchivoImportacionUpdateDetalle.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUpdateDetalle.add(this.jLabelArchivoImportacionUpdateDetalle, this.gridBagConstraintsUpdateDetalle);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionUpdateDetalle = new JFileChooser();		
		this.jFileChooserImportacionUpdateDetalle.setToolTipText("ESCOGER ARCHIVO"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionUpdateDetalle = new JButtonMe();
		this.jButtonAbrirImportacionUpdateDetalle.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionUpdateDetalle,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionUpdateDetalle.setToolTipText("Generar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdateDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUpdateDetalle.add(this.jButtonAbrirImportacionUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionUpdateDetalle = new JLabelMe();

		this.jLabelPathArchivoImportacionUpdateDetalle.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionUpdateDetalle.add(this.jLabelPathArchivoImportacionUpdateDetalle, this.gridBagConstraintsUpdateDetalle);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionUpdateDetalle=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionUpdateDetalle.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUpdateDetalle.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionUpdateDetalle.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdateDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUpdateDetalle.add(this.jTextFieldPathArchivoImportacionUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionUpdateDetalle = new JButtonMe();
		this.jButtonGenerarImportacionUpdateDetalle.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionUpdateDetalle,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionUpdateDetalle.setToolTipText("Generar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdateDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUpdateDetalle.add(this.jButtonGenerarImportacionUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionUpdateDetalle = new JButtonMe();
		this.jButtonCerrarImportacionUpdateDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionUpdateDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionUpdateDetalle.setToolTipText("Cancelar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdateDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionUpdateDetalle.add(this.jButtonCerrarImportacionUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalUpdateDetalle = new GridBagLayout();
		
		this.jScrollPanelImportacionUpdateDetalle= new JScrollPane(jPanelImportacionUpdateDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy =iPosYImportacion;
		this.gridBagConstraintsUpdateDetalle.gridx =iPosXImportacion;
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionUpdateDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionUpdateDetalle.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalUpdateDetalle);
		this.jInternalFrameImportacionUpdateDetalle.getContentPane().add(this.jScrollPanelImportacionUpdateDetalle, this.gridBagConstraintsUpdateDetalle);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByUpdateDetalle(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByUpdateDetalle = new JButtonMe();
			this.jButtonAbrirOrderByUpdateDetalle.setText("Orden");
			this.jButtonAbrirOrderByUpdateDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByUpdateDetalle,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByUpdateDetalle";
			inputMap = this.jButtonAbrirOrderByUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByUpdateDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByUpdateDetalle"));
		
		
			GridBagLayout gridaBagLayoutOrderByUpdateDetalle = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByUpdateDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByUpdateDetalle.setName("jPanelOrderByUpdateDetalle"); 
			
			this.jPanelOrderByUpdateDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUpdateDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByUpdateDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByUpdateDetalle.setLayout(gridaBagLayoutOrderByUpdateDetalle);
			
			
			this.jTableDatosUpdateDetalleOrderBy = new JTableMe();        
			this.jTableDatosUpdateDetalleOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosUpdateDetalleOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosUpdateDetalleOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosUpdateDetalleOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosUpdateDetalleOrderBy.setViewportView(this.jTableDatosUpdateDetalleOrderBy);
			this.jTableDatosUpdateDetalleOrderBy.setFillsViewportHeight(true);
			this.jTableDatosUpdateDetalleOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByUpdateDetalle= new OrderByJInternalFrame();
			this.jInternalFrameOrderByUpdateDetalle= new OrderByJInternalFrame();
			this.jScrollPanelOrderByUpdateDetalle = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteUpdateDetalle= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByUpdateDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByUpdateDetalle.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByUpdateDetalle.setTitle("Orden");
			this.jInternalFrameOrderByUpdateDetalle.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByUpdateDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByUpdateDetalle.setResizable(true);
			this.jInternalFrameOrderByUpdateDetalle.setClosable(true);
			this.jInternalFrameOrderByUpdateDetalle.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByUpdateDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUpdateDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByUpdateDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Update Detalles"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.gridy =iPosYOrderBy++;
			this.gridBagConstraintsUpdateDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsUpdateDetalle.ipady =150;
				
			this.jPanelOrderByUpdateDetalle.add(jScrollPanelDatosUpdateDetalleOrderBy, this.gridBagConstraintsUpdateDetalle);//this.jTableDatosUpdateDetalleTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByUpdateDetalle = new JButtonMe();
			this.jButtonCerrarOrderByUpdateDetalle.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByUpdateDetalle,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByUpdateDetalle.setToolTipText("Cancelar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.gridy = iPosYOrderBy++;
			this.gridBagConstraintsUpdateDetalle.gridx = iPosXOrderBy;
									
			this.jPanelOrderByUpdateDetalle.add(this.jButtonCerrarOrderByUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalUpdateDetalle = new GridBagLayout();
			
			this.jScrollPanelOrderByUpdateDetalle= new JScrollPane(jPanelOrderByUpdateDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.gridy =iPosYOrderBy;
			this.gridBagConstraintsUpdateDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByUpdateDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByUpdateDetalle.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalUpdateDetalle);
			
			this.jInternalFrameOrderByUpdateDetalle.getContentPane().add(this.jScrollPanelOrderByUpdateDetalle, this.gridBagConstraintsUpdateDetalle);			
		
		} else {
			this.jButtonAbrirOrderByUpdateDetalle = new JButtonMe();
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
		int iWidthTableCalculado=0;//2930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.updatedetalleSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosUpdateDetalle.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosUpdateDetalle.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosUpdateDetalle.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosUpdateDetalle.getRowHeight();//UpdateDetalleConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > UpdateDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUpdateDetalle.isSelected()) {
					iHeightTable=UpdateDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UpdateDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UpdateDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > UpdateDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaUpdateDetalle.isSelected()) {
					iHeightTable=UpdateDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < UpdateDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=UpdateDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosUpdateDetalle.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUpdateDetalle.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosUpdateDetalle.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosUpdateDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUpdateDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosUpdateDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByUpdateDetalle!=null && this.jInternalFrameOrderByUpdateDetalle.getjTableDatosOrderBy()!=null) {
			//if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByUpdateDetalle.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByUpdateDetalle.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByUpdateDetalle.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByUpdateDetalle.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByUpdateDetalle.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByUpdateDetalle.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByUpdateDetalle.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosUpdateDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUpdateDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosUpdateDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=updatedetalleLogic.getUpdateDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=updatedetalles.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<UpdateDetalle> TraerUpdateDetalleBeans(List<UpdateDetalle> updatedetalles,ArrayList<Classe> classes)throws Exception {
		try {
			for(UpdateDetalle updatedetalle:updatedetalles) {
					
				if(!(UpdateDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || UpdateDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					updatedetalle.setsDetalleGeneralEntityReporte(UpdateDetalleConstantesFunciones.getUpdateDetalleDescripcion(updatedetalle));
										
					updatedetalle.setejecutado_descripcion(UpdateDetalleConstantesFunciones.getejecutadoDescripcion(updatedetalle));updatedetalle.setesta_activo_descripcion(UpdateDetalleConstantesFunciones.getesta_activoDescripcion(updatedetalle));	
					
						
					
				} else  {
							
					//updatedetalle.setsDetalleGeneralEntityReporte(updatedetalle.getsDetalleGeneralEntityReporte());
										
				}
				
				//updatedetallebeans.add(updatedetallebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return updatedetalles;
    }
	//PARA REPORTES FIN
}
