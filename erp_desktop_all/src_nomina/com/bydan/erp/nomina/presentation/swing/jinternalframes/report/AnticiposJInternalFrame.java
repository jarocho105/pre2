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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

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
import com.bydan.erp.nomina.util.report.AnticiposConstantesFunciones;

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
public class AnticiposJInternalFrame extends AnticiposBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAnticipos;
	
	protected JMenuBar jmenuBarAnticipos;
	
	protected JMenu jmenuAnticipos;
	protected JMenu jmenuDatosAnticipos;
	protected JMenu jmenuArchivoAnticipos;
	protected JMenu jmenuAccionesAnticipos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAnticipos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAnticipos;	
	protected GridBagConstraints gridBagConstraintsAnticipos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AnticiposDetalleFormJInternalFrame jInternalFrameDetalleFormAnticipos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAnticipos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAnticipos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoContratoBeanSwingJInternalFrame tipocontratoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocontrato="";
	
	public AnticiposSessionBean anticiposSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoContratoSessionBean tipocontratoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Anticipos> anticiposs;		
	public List<Anticipos> anticipossEliminados;	
	public List<Anticipos> anticipossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAnticipos;		
	protected JButton jButtonAbrirOrderByAnticipos;
	
	
	//protected JPanel jPanelOrderByAnticipos;
	//public JScrollPane jScrollPanelOrderByAnticipos;	
	//protected JButton jButtonCerrarOrderByAnticipos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AnticiposLogic anticiposLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAnticipos;
	public JScrollPane jScrollPanelDatosEdicionAnticipos;
	public JScrollPane jScrollPanelDatosGeneralAnticipos;
    
	
	
	//public JScrollPane jScrollPanelDatosAnticiposOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAnticipos;
	//public JScrollPane jScrollPanelImportacionAnticipos;
	
	
	
	protected JPanel jPanelAccionesAnticipos;
	
    protected JPanel jPanelPaginacionAnticipos;
    protected JPanel jPanelParametrosReportesAnticipos;
	protected JPanel jPanelParametrosReportesAccionesAnticipos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Anticipos;
	protected JPanel jPanelParametrosAuxiliar2Anticipos;
	protected JPanel jPanelParametrosAuxiliar3Anticipos;
	protected JPanel jPanelParametrosAuxiliar4Anticipos;
	//protected JPanel jPanelParametrosAuxiliar5Anticipos;
	
	
	
	//protected JPanel jPanelReporteDinamicoAnticipos;
	//protected JPanel jPanelImportacionAnticipos;
	
	
	public JTable jTableDatosAnticipos;
	
	
	
	//public JTable jTableDatosAnticiposOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAnticipos;
	protected JButton jButtonDuplicarAnticipos;
	protected JButton jButtonCopiarAnticipos;
	protected JButton jButtonVerFormAnticipos;
	protected JButton jButtonNuevoRelacionesAnticipos;
	protected JButton jButtonModificarAnticipos;
	
    protected JButton jButtonGuardarCambiosTablaAnticipos;
	protected JButton jButtonCerrarAnticipos;
	
	
	protected JButton jButtonRecargarInformacionAnticipos;
	protected JButton jButtonProcesarInformacionAnticipos;
	
	
	protected JButton jButtonAnterioresAnticipos;
	protected JButton jButtonSiguientesAnticipos;
	protected JButton jButtonNuevoGuardarCambiosAnticipos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAnticipos;
	//protected JButton jButtonCerrarReporteDinamicoAnticipos;
	//protected JButton jButtonGenerarExcelReporteDinamicoAnticipos;	
	
	
	
	//protected JButton jButtonAbrirImportacionAnticipos;
	//protected JButton jButtonGenerarImportacionAnticipos;
	//protected JButton jButtonCerrarImportacionAnticipos;
	//protected JFileChooser jFileChooserImportacionAnticipos;
	//protected File fileImportacionAnticipos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAnticipos;
	protected JButton jButtonDuplicarToolBarAnticipos;
	protected JButton jButtonNuevoRelacionesToolBarAnticipos;
	
	
	public JButton jButtonGuardarCambiosToolBarAnticipos;
	protected JButton jButtonCopiarToolBarAnticipos;
	protected JButton jButtonVerFormToolBarAnticipos;
	public JButton jButtonGuardarCambiosTablaToolBarAnticipos;
	protected JButton jButtonMostrarOcultarTablaToolBarAnticipos;
	protected JButton jButtonCerrarToolBarAnticipos;
	
	protected JButton jButtonRecargarInformacionToolBarAnticipos;
	protected JButton jButtonProcesarInformacionToolBarAnticipos;
	protected JButton jButtonAnterioresToolBarAnticipos;
	protected JButton jButtonSiguientesToolBarAnticipos;
	protected JButton jButtonNuevoGuardarCambiosToolBarAnticipos;
	protected JButton jButtonAbrirOrderByToolBarAnticipos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAnticipos;
	protected JMenuItem jMenuItemDuplicarAnticipos;
	protected JMenuItem jMenuItemNuevoRelacionesAnticipos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAnticipos;
	protected JMenuItem jMenuItemCopiarAnticipos;
	protected JMenuItem jMenuItemVerFormAnticipos;
	protected JMenuItem jMenuItemGuardarCambiosTablaAnticipos;
	protected JMenuItem jMenuItemCerrarAnticipos;
	protected JMenuItem jMenuItemDetalleCerrarAnticipos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAnticipos;
	protected JMenuItem jMenuItemDetalleMostarOcultarAnticipos;
	
	protected JMenuItem jMenuItemRecargarInformacionAnticipos;
	protected JMenuItem jMenuItemProcesarInformacionAnticipos;
	protected JMenuItem jMenuItemAnterioresAnticipos;
	protected JMenuItem jMenuItemSiguientesAnticipos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAnticipos;
	protected JMenuItem jMenuItemAbrirOrderByAnticipos;
	protected JMenuItem jMenuItemMostrarOcultarAnticipos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAnticipos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAnticipos;
	protected JCheckBox jCheckBoxSeleccionadosAnticipos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAnticipos;
	protected JCheckBox jCheckBoxConGraficoReporteAnticipos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAnticipos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAnticipos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAnticipos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAnticipos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAnticipos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAnticipos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAnticipos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAnticipos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAnticipos;
	protected JTextField jTextFieldValorCampoGeneralAnticipos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAnticipos;
	//public JList<Reporte> jListColumnasSelectReporteAnticipos;
	//public JScrollPane jScrollColumnasSelectReporteAnticipos;
	
	//public JLabel jLabelRelacionesSelectReporteAnticipos;
	//public JList<Reporte> jListRelacionesSelectReporteAnticipos;
	//public JScrollPane jScrollRelacionesSelectReporteAnticipos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAnticipos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAnticipos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAnticipos;
	//public JLabel jLabelTiposArchivoReporteDinamicoAnticipos;
	
		
	//public JLabel jLabelArchivoImportacionAnticipos;	
	//public JLabel jLabelPathArchivoImportacionAnticipos;
	//protected JTextField jTextFieldPathArchivoImportacionAnticipos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAnticipos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAnticipos;
	
	//public JLabel jLabelColumnaCategoriaValorAnticipos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAnticipos;
	
	//public JLabel jLabelColumnasValoresGraficoAnticipos;
	//public JList<Reporte> jListColumnasValoresGraficoAnticipos;
	//public JScrollPane jScrollColumnasValoresGraficoAnticipos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAnticipos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAnticipos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAnticipos;
	public JPanel jPanelBusquedaAnticiposAnticipos;
	public JButton jButtonBusquedaAnticiposAnticipos;
	
	public JPanel jPanelid_tipo_contratoBusquedaAnticiposAnticipos;
	public JLabel jLabelid_tipo_contratoBusquedaAnticiposAnticipos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos;
	public JButton jButtonid_tipo_contratoBusquedaAnticiposAnticipos= new JButtonMe();
	public JButton jButtonid_tipo_contratoBusquedaAnticiposAnticiposUpdate= new JButtonMe();
	public JButton jButtonid_tipo_contratoBusquedaAnticiposAnticiposBusqueda= new JButtonMe();

	
	public JPanel jPanelcodigoBusquedaAnticiposAnticipos;
	public JLabel jLabelcodigoBusquedaAnticiposAnticipos;
	public JTextField jTextFieldcodigoBusquedaAnticiposAnticipos;
	public JButton jButtoncodigoBusquedaAnticiposAnticiposBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_desdeBusquedaAnticiposAnticipos;
	public JLabel jLabelfecha_desdeBusquedaAnticiposAnticipos;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaAnticiposAnticipos;

	public JDateChooser jDateChooserfecha_desdeBusquedaAnticiposAnticipos;
	public JButton jButtonfecha_desdeBusquedaAnticiposAnticiposBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaAnticiposAnticipos;
	public JLabel jLabelfecha_hastaBusquedaAnticiposAnticipos;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaAnticiposAnticipos;

	public JDateChooser jDateChooserfecha_hastaBusquedaAnticiposAnticipos;
	public JButton jButtonfecha_hastaBusquedaAnticiposAnticiposBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AnticiposJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Anticipos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnticiposJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Anticipos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnticiposJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Anticipos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AnticiposJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Anticipos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAnticipos)	{
		this.jButtonRecargarInformacionAnticipos = jButtonRecargarInformacionAnticipos;
	}
	
	public JButton getjButtonProcesarInformacionAnticipos() {
		return this.jButtonProcesarInformacionAnticipos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAnticipos)	{
		this.jButtonProcesarInformacionAnticipos = jButtonProcesarInformacionAnticipos;
	}
	
	
	public JButton getjButtonRecargarInformacionAnticipos() {
		return this.jButtonRecargarInformacionAnticipos;
	}
	
	
	public List<Anticipos> getanticiposs() {
		return this.anticiposs;
	}

	public void setanticiposs(List<Anticipos> anticiposs) {
		this.anticiposs = anticiposs;
	}
	
	public List<Anticipos> getanticipossAux() {
		return this.anticipossAux;
	}

	public void setanticipossAux(List<Anticipos> anticipossAux) {
		this.anticipossAux = anticipossAux;
	}
	
	public List<Anticipos> getanticipossEliminados() {
		return this.anticipossEliminados;
	}

	public void setAnticipossEliminados(List<Anticipos> anticipossEliminados) {
		this.anticipossEliminados = anticipossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAnticipos() {
		return jComboBoxTiposSeleccionarAnticipos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAnticipos(
			JComboBox jComboBoxTiposSeleccionarAnticipos) {
		this.jComboBoxTiposSeleccionarAnticipos = jComboBoxTiposSeleccionarAnticipos;
	}
	
	public void setBorderResaltarTiposSeleccionarAnticipos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAnticipos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAnticipos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAnticipos() {
		return jTextFieldValorCampoGeneralAnticipos;
	}

	public void setjTextFieldValorCampoGeneralAnticipos(
			JTextField jTextFieldValorCampoGeneralAnticipos) {
		this.jTextFieldValorCampoGeneralAnticipos = jTextFieldValorCampoGeneralAnticipos;
	}

	public void setBorderResaltarValorCampoGeneralAnticipos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAnticipos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAnticipos() {
		return this.jCheckBoxSeleccionarTodosAnticipos;
	}

	public void setjCheckBoxSeleccionarTodosAnticipos(
			JCheckBox jCheckBoxSeleccionarTodosAnticipos) {
		this.jCheckBoxSeleccionarTodosAnticipos = jCheckBoxSeleccionarTodosAnticipos;
	}

	public void setBorderResaltarSeleccionarTodosAnticipos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAnticipos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAnticipos() {
		return this.jCheckBoxSeleccionadosAnticipos;
	}

	public void setjCheckBoxSeleccionadosAnticipos(
			JCheckBox jCheckBoxSeleccionadosAnticipos) {
		this.jCheckBoxSeleccionadosAnticipos = jCheckBoxSeleccionadosAnticipos;
	}
	
	public void setBorderResaltarSeleccionadosAnticipos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAnticipos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAnticipos() {
		return this.jComboBoxTiposArchivosReportesAnticipos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAnticipos(
			JComboBox jComboBoxTiposArchivosReportesAnticipos) {
		this.jComboBoxTiposArchivosReportesAnticipos = jComboBoxTiposArchivosReportesAnticipos;
	}

	public void setBorderResaltarTiposArchivosReportesAnticipos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAnticipos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAnticipos() {
		return this.jComboBoxTiposReportesAnticipos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAnticipos(
			JComboBox jComboBoxTiposReportesAnticipos) {
		this.jComboBoxTiposReportesAnticipos = jComboBoxTiposReportesAnticipos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAnticipos() {
	//	return jComboBoxTiposReportesDinamicoAnticipos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAnticipos(
	//		JComboBox jComboBoxTiposReportesDinamicoAnticipos) {
	//	this.jComboBoxTiposReportesDinamicoAnticipos = jComboBoxTiposReportesDinamicoAnticipos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAnticipos() {
	//	return jComboBoxTiposArchivosReportesDinamicoAnticipos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAnticipos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAnticipos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAnticipos = jComboBoxTiposArchivosReportesDinamicoAnticipos;
	//}
	
	public void setBorderResaltarTiposReportesAnticipos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAnticipos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAnticipos() {
		return this.jComboBoxTiposGraficosReportesAnticipos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAnticipos(
			JComboBox jComboBoxTiposGraficosReportesAnticipos) {
		this.jComboBoxTiposGraficosReportesAnticipos = jComboBoxTiposGraficosReportesAnticipos;
	}
	
	public void setBorderResaltarTiposGraficosReportesAnticipos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAnticipos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAnticipos() {
		return this.jComboBoxTiposPaginacionAnticipos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAnticipos(
			JComboBox jComboBoxTiposPaginacionAnticipos) {
		this.jComboBoxTiposPaginacionAnticipos = jComboBoxTiposPaginacionAnticipos;
	}
	
	public void setBorderResaltarTiposPaginacionAnticipos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAnticipos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAnticipos() {
		return this.jComboBoxTiposRelacionesAnticipos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAnticipos() {
		return this.jComboBoxTiposAccionesAnticipos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAnticipos(
			JComboBox jComboBoxTiposRelacionesAnticipos) {
		this.jComboBoxTiposRelacionesAnticipos = jComboBoxTiposRelacionesAnticipos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAnticipos(
			JComboBox jComboBoxTiposAccionesAnticipos) {
		this.jComboBoxTiposAccionesAnticipos = jComboBoxTiposAccionesAnticipos;
	}
	
	public void setBorderResaltarTiposRelacionesAnticipos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAnticipos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAnticipos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAnticipos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAnticipos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAnticipos() {
	//	return jCheckBoxConGraficoDinamicoAnticipos;
	//}

	//public void setjCheckBoxConGraficoDinamicoAnticipos(
	//		JCheckBox jCheckBoxConGraficoDinamicoAnticipos) {
	//	this.jCheckBoxConGraficoDinamicoAnticipos = jCheckBoxConGraficoDinamicoAnticipos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAnticipos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAnticipos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAnticipos .setBorder(borderResaltar);		
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
		this.anticiposSessionBean=new AnticiposSessionBean();
		
		this.anticiposSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.anticiposSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.anticiposSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AnticiposJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AnticiposJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AnticiposJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AnticiposJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AnticiposJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Anticipos MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {
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
		
		AnticiposJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Anticipos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAnticipos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAnticipos,this.jTtoolBarAnticipos,
							"nuevo","nuevo","Nuevo"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAnticipos,this.jTtoolBarAnticipos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAnticipos,this.jTtoolBarAnticipos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAnticipos,this.jTtoolBarAnticipos,
							"duplicar","duplicar","Duplicar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAnticipos,this.jTtoolBarAnticipos,
							"copiar","copiar","Copiar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAnticipos,this.jTtoolBarAnticipos,
							"ver_form","ver_form","Ver"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAnticipos,this.jTtoolBarAnticipos,
							"recargar","recargar","Buscar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAnticipos,this.jTtoolBarAnticipos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAnticipos,this.jTtoolBarAnticipos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAnticipos,this.jTtoolBarAnticipos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAnticipos,this.jTtoolBarAnticipos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAnticipos,this.jTtoolBarAnticipos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAnticipos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAnticipos,this.jTtoolBarAnticipos,
							"cerrar","cerrar","Salir"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAnticipos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAnticipos;
			
				this.jButtonProcesarInformacionToolBarAnticipos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAnticipos;
				
		//protected JButton jButtonModificarToolBarAnticipos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAnticipos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAnticipos=new JMenuMe("General");
		this.jmenuArchivoAnticipos=new JMenuMe("Archivo");
		this.jmenuAccionesAnticipos=new JMenuMe("Acciones");
		this.jmenuDatosAnticipos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAnticipos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAnticipos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAnticipos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAnticipos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAnticipos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAnticipos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAnticipos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAnticipos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAnticipos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAnticipos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAnticipos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAnticipos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAnticipos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAnticipos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAnticipos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAnticipos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAnticipos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAnticipos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAnticipos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAnticipos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAnticipos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAnticipos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAnticipos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAnticipos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAnticipos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAnticipos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAnticipos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAnticipos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAnticipos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAnticipos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAnticipos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAnticipos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAnticipos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAnticipos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAnticipos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAnticipos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAnticipos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAnticipos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAnticipos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAnticipos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAnticipos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAnticipos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAnticipos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAnticipos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAnticipos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAnticipos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAnticipos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAnticipos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAnticipos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAnticipos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAnticipos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAnticipos.add(this.jMenuItemCerrarAnticipos);
			
			this.jmenuAccionesAnticipos.add(this.jMenuItemNuevoAnticipos);
			this.jmenuAccionesAnticipos.add(this.jMenuItemNuevoGuardarCambiosAnticipos);
			this.jmenuAccionesAnticipos.add(this.jMenuItemNuevoRelacionesAnticipos);
			this.jmenuAccionesAnticipos.add(this.jMenuItemGuardarCambiosTablaAnticipos);		
			this.jmenuAccionesAnticipos.add(this.jMenuItemDuplicarAnticipos);		
			this.jmenuAccionesAnticipos.add(this.jMenuItemCopiarAnticipos);		
			this.jmenuAccionesAnticipos.add(this.jMenuItemVerFormAnticipos);		
			
			this.jmenuDatosAnticipos.add(this.jMenuItemRecargarInformacionAnticipos);				
			this.jmenuDatosAnticipos.add(this.jMenuItemAnterioresAnticipos);				
			this.jmenuDatosAnticipos.add(this.jMenuItemSiguientesAnticipos);				
			this.jmenuDatosAnticipos.add(this.jMenuItemAbrirOrderByAnticipos);				
			this.jmenuDatosAnticipos.add(this.jMenuItemMostrarOcultarAnticipos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAnticipos.add(this.jMenuItemGuardarCambiosAnticipos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAnticipos.add(this.jmenuArchivoAnticipos);		
			this.jmenuBarAnticipos.add(this.jmenuAccionesAnticipos);		
			this.jmenuBarAnticipos.add(this.jmenuDatosAnticipos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAnticipos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAnticipos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaAnticiposAnticipos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaAnticiposAnticipos.setToolTipText("Buscar Por Tipo Contrato Por Codigo Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaAnticiposAnticipos= new JButtonMe();
		this.jButtonBusquedaAnticiposAnticipos.setText("Buscar");
		this.jButtonBusquedaAnticiposAnticipos.setToolTipText("Buscar Por Tipo Contrato Por Codigo Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaAnticiposAnticipos,"buscar_button","Buscar Por Tipo Contrato Por Codigo Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaAnticiposAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_contratoBusquedaAnticiposAnticipos = new JLabelMe();
		jLabelid_tipo_contratoBusquedaAnticiposAnticipos.setText("Tipo Contrato :");
		jLabelid_tipo_contratoBusquedaAnticiposAnticipos.setToolTipText("Tipo Contrato");
		jLabelid_tipo_contratoBusquedaAnticiposAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_contratoBusquedaAnticiposAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_contratoBusquedaAnticiposAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_contratoBusquedaAnticiposAnticipos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos= new JComboBoxMe();
		jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelcodigoBusquedaAnticiposAnticipos = new JLabelMe();
		jLabelcodigoBusquedaAnticiposAnticipos.setText("Codigo :");
		jLabelcodigoBusquedaAnticiposAnticipos.setToolTipText("Codigo");
		jLabelcodigoBusquedaAnticiposAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaAnticiposAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaAnticiposAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaAnticiposAnticipos,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaAnticiposAnticipos= new JTextFieldMe();
		jTextFieldcodigoBusquedaAnticiposAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaAnticiposAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaAnticiposAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaAnticiposAnticipos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_desdeBusquedaAnticiposAnticipos = new JLabelMe();
		jLabelfecha_desdeBusquedaAnticiposAnticipos.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaAnticiposAnticipos.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaAnticiposAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaAnticiposAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaAnticiposAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaAnticiposAnticipos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaAnticiposAnticipos= new JDateChooser();
		jDateChooserfecha_desdeBusquedaAnticiposAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaAnticiposAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaAnticiposAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaAnticiposAnticipos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaAnticiposAnticipos.setDate(new Date());
		jDateChooserfecha_desdeBusquedaAnticiposAnticipos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaAnticiposAnticipos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaAnticiposAnticipos = new JLabelMe();
		jLabelfecha_hastaBusquedaAnticiposAnticipos.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaAnticiposAnticipos.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaAnticiposAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaAnticiposAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaAnticiposAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaAnticiposAnticipos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaAnticiposAnticipos= new JDateChooser();
		jDateChooserfecha_hastaBusquedaAnticiposAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaAnticiposAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaAnticiposAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaAnticiposAnticipos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaAnticiposAnticipos.setDate(new Date());
		jDateChooserfecha_hastaBusquedaAnticiposAnticipos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaAnticiposAnticipos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasAnticipos=new JTabbedPane();


		this.jTabbedPaneBusquedasAnticipos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasAnticipos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasAnticipos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAnticipos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAnticipos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAnticipos = new AnticiposDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Anticipos DATOS");
			this.jInternalFrameDetalleFormAnticipos = new AnticiposDetalleFormJInternalFrame(jDesktopPane,this.anticiposSessionBean.getConGuardarRelaciones(),this.anticiposSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAnticipos = null;//new AnticiposDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAnticipos= new GridBagLayout();
		
		
		this.jTableDatosAnticipos = new JTableMe();      
		
		String sToolTipAnticipos="";
		sToolTipAnticipos=AnticiposConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAnticipos+="(Nomina.Anticipos)";
		}
		
		if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {
			sToolTipAnticipos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAnticipos.setToolTipText(sToolTipAnticipos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAnticipos);
		this.jTableDatosAnticipos.setAutoCreateRowSorter(true);
		this.jTableDatosAnticipos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAnticipos.setRowSelectionAllowed(true);
		this.jTableDatosAnticipos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAnticipos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAnticipos = new JButtonMe();
		this.jButtonDuplicarAnticipos = new JButtonMe();
		this.jButtonCopiarAnticipos = new JButtonMe();
		this.jButtonVerFormAnticipos = new JButtonMe();
		this.jButtonNuevoRelacionesAnticipos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAnticipos = new JButtonMe();
		this.jButtonCerrarAnticipos = new JButtonMe();
		
		this.jScrollPanelDatosAnticipos = new JScrollPane();   
        this.jScrollPanelDatosGeneralAnticipos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAnticipos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Anticipos";
		
		if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anticiposes" + this.sPath));
		} else {
			this.jScrollPanelDatosAnticipos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAnticipos.setToolTipText("Acciones");
        this.jPanelAccionesAnticipos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAnticipos=new ReporteDinamicoJInternalFrame(AnticiposConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAnticipos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAnticipos=new ImportacionJInternalFrame(AnticiposConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAnticipos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAnticipos = new JButtonMe();
		
		this.jButtonAbrirOrderByAnticipos.setText("Orden");
		this.jButtonAbrirOrderByAnticipos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAnticipos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAnticipos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAnticipos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAnticipos,false,this);
			
			//this.cargarOrderByAnticipos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAnticipos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAnticipos,true,this);
			
			//this.cargarOrderByAnticipos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAnticipos.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosAnticipos.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosAnticipos.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosAnticipos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAnticipos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAnticipos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAnticipos.setText("Nuevo");
		this.jButtonDuplicarAnticipos.setText("Duplicar");
		this.jButtonCopiarAnticipos.setText("Copiar");
		this.jButtonVerFormAnticipos.setText("Ver");
		this.jButtonNuevoRelacionesAnticipos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAnticipos.setText("Guardar");
		this.jButtonCerrarAnticipos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAnticipos,"nuevo_button","Nuevo",this.anticiposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAnticipos,"duplicar_button","Duplicar",this.anticiposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAnticipos,"copiar_button","Copiar",this.anticiposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAnticipos,"ver_form","Ver",this.anticiposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAnticipos,"nuevorelaciones_button","Nuevo Rel",this.anticiposSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAnticipos,"guardarcambiostabla_button","Guardar",this.anticiposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAnticipos,"cerrar_button","Salir",this.anticiposSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAnticipos.setToolTipText("Nuevo"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAnticipos.setToolTipText("Duplicar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAnticipos.setToolTipText("Copiar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAnticipos.setToolTipText("Ver"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAnticipos.setToolTipText("Nuevo Rel"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAnticipos.setToolTipText("Guardar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAnticipos.setToolTipText("Salir"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAnticipos";
		inputMap = this.jButtonNuevoAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAnticipos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAnticipos"));
		
		//DUPLICAR
		sMapKey = "DuplicarAnticipos";
		inputMap = this.jButtonDuplicarAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAnticipos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAnticipos"));
		
		//COPIAR
		sMapKey = "CopiarAnticipos";
		inputMap = this.jButtonCopiarAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAnticipos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAnticipos"));
		
		//VEr FORM
		sMapKey = "VerFormAnticipos";
		inputMap = this.jButtonVerFormAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAnticipos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAnticipos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAnticipos";
		inputMap = this.jButtonNuevoRelacionesAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAnticipos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAnticipos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAnticipos";
		inputMap = this.jButtonModificarAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAnticipos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAnticipos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAnticipos";
		inputMap = this.jButtonCerrarAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAnticipos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAnticipos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAnticipos";
		inputMap = this.jButtonGuardarCambiosTablaAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAnticipos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAnticipos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAnticipos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAnticipos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAnticipos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Anticipos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Anticipos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Anticipos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Anticipos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Anticipos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAnticipos.setName("jPanelParametrosReportesAnticipos"); 
		
		this.jPanelParametrosReportesAccionesAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAnticipos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAnticipos.setName("jPanelParametrosReportesAccionesAnticipos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAnticipos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAnticipos = new JButtonMe();
		this.jButtonRecargarInformacionAnticipos.setText("Buscar");
		this.jButtonRecargarInformacionAnticipos.setToolTipText("Buscar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAnticipos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionAnticipos.setVisible(false);
		
		
		this.jButtonProcesarInformacionAnticipos = new JButtonMe();
		this.jButtonProcesarInformacionAnticipos.setText("Procesar");
		this.jButtonProcesarInformacionAnticipos.setToolTipText("Procesar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAnticipos.setVisible(false);
			
		this.jButtonProcesarInformacionAnticipos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAnticipos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAnticipos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAnticipos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAnticipos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAnticipos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAnticipos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAnticipos.setText("TIPO");       
		this.jComboBoxTiposReportesAnticipos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAnticipos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAnticipos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAnticipos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAnticipos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAnticipos.setText("Paginacion");
		this.jComboBoxTiposPaginacionAnticipos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAnticipos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAnticipos.setText("Accion");
		this.jComboBoxTiposRelacionesAnticipos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAnticipos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAnticipos.setText("Accion");
		this.jComboBoxTiposAccionesAnticipos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAnticipos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAnticipos.setText("Accion");
		this.jComboBoxTiposSeleccionarAnticipos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAnticipos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAnticipos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAnticipos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAnticipos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAnticipos = new JLabelMe();
		
		this.jLabelAccionesAnticipos.setText("Acciones");		
		this.jLabelAccionesAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAnticipos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAnticipos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAnticipos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAnticipos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAnticipos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAnticipos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAnticipos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAnticipos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAnticipos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAnticipos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAnticipos.setText("Graf.");
		this.jCheckBoxConGraficoReporteAnticipos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAnticipos = new JButtonMe();
		//this.jButtonAnterioresAnticipos.setText("<<");
        this.jButtonAnterioresAnticipos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAnticipos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAnticipos = new JButtonMe();
		//this.jButtonSiguientesAnticipos.setText(">>");
        this.jButtonSiguientesAnticipos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAnticipos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAnticipos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAnticipos.setText("Nue");
        this.jButtonNuevoGuardarCambiosAnticipos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAnticipos,"nuevoguardarcambios_button","Nue",this.anticiposSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAnticipos";
		inputMap = this.jButtonNuevoGuardarCambiosAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAnticipos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAnticipos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAnticipos";
		inputMap = this.jButtonRecargarInformacionAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAnticipos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAnticipos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAnticipos";
		inputMap = this.jButtonSiguientesAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAnticipos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAnticipos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAnticipos";
		inputMap = this.jButtonAnterioresAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAnticipos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAnticipos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAnticipos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAnticipos.setMinimumSize(new Dimension(this.getWidth(),AnticiposBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AnticiposBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAnticipos.setMaximumSize(new Dimension(this.getWidth(),AnticiposBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AnticiposBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAnticipos.setPreferredSize(new Dimension(this.getWidth(),AnticiposBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AnticiposBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAnticipos = new GridBagLayout();

			this.jPanelPaginacionAnticipos.setLayout(gridaBagLayoutPaginacionAnticipos);						
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy = 0;
			this.gridBagConstraintsAnticipos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAnticipos.add(this.jButtonAnterioresAnticipos, this.gridBagConstraintsAnticipos);
					
						
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAnticipos.gridy = 0;
			
			this.jPanelPaginacionAnticipos.add(this.jButtonNuevoGuardarCambiosAnticipos, this.gridBagConstraintsAnticipos);
						
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAnticipos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAnticipos.gridy = 0;
			this.jPanelPaginacionAnticipos.add(this.jButtonSiguientesAnticipos, this.gridBagConstraintsAnticipos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy = 1;
			this.gridBagConstraintsAnticipos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnticipos.add(this.jButtonNuevoAnticipos, this.gridBagConstraintsAnticipos);
						
			
			
			if(!this.anticiposSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAnticipos = new GridBagConstraints();
				this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAnticipos.gridy = 1;
				this.gridBagConstraintsAnticipos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAnticipos.add(this.jButtonGuardarCambiosTablaAnticipos, this.gridBagConstraintsAnticipos);
			}
			
			
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy = 1;
			this.gridBagConstraintsAnticipos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnticipos.add(this.jButtonDuplicarAnticipos, this.gridBagConstraintsAnticipos);
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy = 1;
			this.gridBagConstraintsAnticipos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnticipos.add(this.jButtonCopiarAnticipos, this.gridBagConstraintsAnticipos);
		
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy = 1;
			this.gridBagConstraintsAnticipos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAnticipos.add(this.jButtonVerFormAnticipos, this.gridBagConstraintsAnticipos);
		
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy = 1;
			this.gridBagConstraintsAnticipos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAnticipos.add(this.jButtonCerrarAnticipos, this.gridBagConstraintsAnticipos);
		
		
		
		this.jButtonRecargarInformacionAnticipos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAnticipos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAnticipos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAnticipos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAnticipos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAnticipos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAnticipos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAnticipos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAnticipos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAnticipos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAnticipos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAnticipos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAnticipos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAnticipos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAnticipos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAnticipos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAnticipos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAnticipos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAnticipos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnticipos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAnticipos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAnticipos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAnticipos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAnticipos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAnticipos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAnticipos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAnticipos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAnticipos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAnticipos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAnticipos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAnticipos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAnticipos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAnticipos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAnticipos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAnticipos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAnticipos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAnticipos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAnticipos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Anticipos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Anticipos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Anticipos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Anticipos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAnticipos.setLayout(gridaBagParametrosReportesAnticipos);
			this.jPanelParametrosReportesAccionesAnticipos.setLayout(gridaBagParametrosReportesAccionesAnticipos);
			
			
			this.jPanelParametrosAuxiliar1Anticipos.setLayout(gridaBagParametrosAuxiliar1Anticipos);
			this.jPanelParametrosAuxiliar2Anticipos.setLayout(gridaBagParametrosAuxiliar2Anticipos);
			this.jPanelParametrosAuxiliar3Anticipos.setLayout(gridaBagParametrosAuxiliar3Anticipos);
			this.jPanelParametrosAuxiliar4Anticipos.setLayout(gridaBagParametrosAuxiliar4Anticipos);
			//this.jPanelParametrosAuxiliar5Anticipos.setLayout(gridaBagParametrosAuxiliar2Anticipos);			
			
			
			
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAnticipos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAnticipos.add(this.jButtonRecargarInformacionAnticipos, this.gridBagConstraintsAnticipos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Anticipos.add(this.jComboBoxTiposPaginacionAnticipos, this.gridBagConstraintsAnticipos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Anticipos.add(this.jCheckBoxConAltoMaximoTablaAnticipos, this.gridBagConstraintsAnticipos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Anticipos.add(this.jComboBoxTiposArchivosReportesAnticipos, this.gridBagConstraintsAnticipos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnticipos.add(this.jPanelParametrosAuxiliar1Anticipos, this.gridBagConstraintsAnticipos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnticipos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Anticipos.add(this.jComboBoxTiposReportesAnticipos, this.gridBagConstraintsAnticipos);																		
			
			
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnticipos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Anticipos.add(this.jComboBoxTiposGraficosReportesAnticipos, this.gridBagConstraintsAnticipos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnticipos.add(this.jPanelParametrosAuxiliar4Anticipos, this.gridBagConstraintsAnticipos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnticipos.add(this.jComboBoxTiposReportesAnticipos, this.gridBagConstraintsAnticipos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAnticipos.add(this.jCheckBoxGenerarReporteAnticipos, this.gridBagConstraintsAnticipos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnticipos.add(this.jPanelParametrosAuxiliar2Anticipos, this.gridBagConstraintsAnticipos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAnticipos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAnticipos.add(this.jLabelAccionesAnticipos, this.gridBagConstraintsAnticipos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAnticipos = new GridBagConstraints();
				this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAnticipos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAnticipos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAnticipos.add(this.jButtonAbrirOrderByAnticipos, this.gridBagConstraintsAnticipos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAnticipos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAnticipos.add(this.jComboBoxTiposSeleccionarAnticipos, this.gridBagConstraintsAnticipos);			
			
			
			/*
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAnticipos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAnticipos.add(this.jCheckBoxSeleccionarTodosAnticipos, this.gridBagConstraintsAnticipos);
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAnticipos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAnticipos.add(this.jCheckBoxConGraficoReporteAnticipos, this.gridBagConstraintsAnticipos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnticipos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Anticipos.add(this.jCheckBoxSeleccionarTodosAnticipos, this.gridBagConstraintsAnticipos);															
				
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnticipos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Anticipos.add(this.jCheckBoxSeleccionadosAnticipos, this.gridBagConstraintsAnticipos);															
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAnticipos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Anticipos.add(this.jCheckBoxConGraficoReporteAnticipos, this.gridBagConstraintsAnticipos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAnticipos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAnticipos.add(this.jPanelParametrosAuxiliar3Anticipos, this.gridBagConstraintsAnticipos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAnticipos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAnticipos.add(this.jComboBoxTiposAccionesAnticipos, this.gridBagConstraintsAnticipos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAnticipos = new GridBagLayout();

			this.jScrollPanelDatosAnticipos.setLayout(gridaBagLayoutDatosAnticipos);
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy = 0;
			this.gridBagConstraintsAnticipos.gridx = 0;
			
			this.jScrollPanelDatosAnticipos.add(this.jTableDatosAnticipos, this.gridBagConstraintsAnticipos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAnticipos.setViewportView(this.jTableDatosAnticipos);
		this.jTableDatosAnticipos.setFillsViewportHeight(true);
		this.jTableDatosAnticipos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAnticipos= new GridBagLayout();
		this.jPanelAccionesAnticipos.setLayout(gridaBagLayoutAccionesAnticipos);
		
		
		/*	
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipos.gridy = 0;
		this.gridBagConstraintsAnticipos.gridx = 0;
			
		this.jPanelAccionesAnticipos.add(this.jButtonNuevoAnticipos, this.gridBagConstraintsAnticipos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaAnticiposAnticipos= new GridBagLayout();
		gridaBagLayoutBusquedaAnticiposAnticipos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaAnticiposAnticipos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaAnticiposAnticipos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaAnticiposAnticipos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaAnticiposAnticipos.setLayout(gridaBagLayoutBusquedaAnticiposAnticipos);

		gridBagConstraintsAnticipos = new GridBagConstraints();
		gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipos.gridy = 0;
		gridBagConstraintsAnticipos.gridx = 0;
		jPanelBusquedaAnticiposAnticipos.add(jLabelid_tipo_contratoBusquedaAnticiposAnticipos, gridBagConstraintsAnticipos);

		gridBagConstraintsAnticipos = new GridBagConstraints();
		gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipos.gridy = 0;
		gridBagConstraintsAnticipos.gridx = 1;
		jPanelBusquedaAnticiposAnticipos.add(jComboBoxid_tipo_contratoBusquedaAnticiposAnticipos, gridBagConstraintsAnticipos);


		gridBagConstraintsAnticipos = new GridBagConstraints();
		gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipos.gridy = 1;
		gridBagConstraintsAnticipos.gridx = 0;
		jPanelBusquedaAnticiposAnticipos.add(jLabelcodigoBusquedaAnticiposAnticipos, gridBagConstraintsAnticipos);

		gridBagConstraintsAnticipos = new GridBagConstraints();
		gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipos.gridy = 1;
		gridBagConstraintsAnticipos.gridx = 1;
		jPanelBusquedaAnticiposAnticipos.add(jTextFieldcodigoBusquedaAnticiposAnticipos, gridBagConstraintsAnticipos);


		gridBagConstraintsAnticipos = new GridBagConstraints();
		gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipos.gridy = 2;
		gridBagConstraintsAnticipos.gridx = 0;
		jPanelBusquedaAnticiposAnticipos.add(jLabelfecha_desdeBusquedaAnticiposAnticipos, gridBagConstraintsAnticipos);

		gridBagConstraintsAnticipos = new GridBagConstraints();
		gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipos.gridy = 2;
		gridBagConstraintsAnticipos.gridx = 1;
		jPanelBusquedaAnticiposAnticipos.add(jDateChooserfecha_desdeBusquedaAnticiposAnticipos, gridBagConstraintsAnticipos);


		gridBagConstraintsAnticipos = new GridBagConstraints();
		gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipos.gridy = 3;
		gridBagConstraintsAnticipos.gridx = 0;
		jPanelBusquedaAnticiposAnticipos.add(jLabelfecha_hastaBusquedaAnticiposAnticipos, gridBagConstraintsAnticipos);

		gridBagConstraintsAnticipos = new GridBagConstraints();
		gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipos.gridy = 3;
		gridBagConstraintsAnticipos.gridx = 1;
		jPanelBusquedaAnticiposAnticipos.add(jDateChooserfecha_hastaBusquedaAnticiposAnticipos, gridBagConstraintsAnticipos);

		gridBagConstraintsAnticipos = new GridBagConstraints();
		gridBagConstraintsAnticipos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAnticipos.gridy = 4;
		gridBagConstraintsAnticipos.gridx =1;
		jPanelBusquedaAnticiposAnticipos.add(jButtonBusquedaAnticiposAnticipos, gridBagConstraintsAnticipos);

		jTabbedPaneBusquedasAnticipos.addTab("1.-Por Tipo Contrato Por Codigo Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaAnticiposAnticipos);
		jTabbedPaneBusquedasAnticipos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAnticipos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAnticipos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.anticiposSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAnticipos = new GridBagConstraints();						
			this.gridBagConstraintsAnticipos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAnticipos.gridx = 0;		
			//this.gridBagConstraintsAnticipos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAnticipos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAnticipos, this.gridBagConstraintsAnticipos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAnticipos.gridx = 0;		
		//this.gridBagConstraintsAnticipos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAnticipos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAnticipos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAnticipos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAnticipos.gridx = 0;		
			this.gridBagConstraintsAnticipos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAnticipos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAnticipos, this.gridBagConstraintsAnticipos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnticipos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAnticipos, this.gridBagConstraintsAnticipos);								
		
		
		/*
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnticipos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAnticipos, this.gridBagConstraintsAnticipos);
		*/		
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAnticipos.gridx =0;
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAnticipos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAnticipos, this.gridBagConstraintsAnticipos);
				
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnticipos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAnticipos, this.gridBagConstraintsAnticipos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AnticiposJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAnticipos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAnticipos = new GridBagLayout();
			this.jPanelBusquedasParametrosAnticipos.setLayout(gridaBagLayoutBusquedasParametrosAnticipos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAnticipos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAnticipos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnticipos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAnticipos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnticipos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAnticipos, this.gridBagConstraintsAnticipos);
			
			
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAnticipos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAnticipos, this.gridBagConstraintsAnticipos);
		
			
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAnticipos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAnticipos, this.gridBagConstraintsAnticipos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAnticipos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAnticipos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAnticipos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAnticipos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAnticipos.setName("jPanelReporteDinamicoAnticipos"); 
		
		this.jPanelReporteDinamicoAnticipos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAnticipos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAnticipos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAnticipos.setLayout(gridaBagLayoutReporteDinamicoAnticipos);
		
		
		this.jInternalFrameReporteDinamicoAnticipos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAnticipos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAnticipos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAnticipos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAnticipos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAnticipos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAnticipos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAnticipos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAnticipos.setResizable(true);
	    this.jInternalFrameReporteDinamicoAnticipos.setClosable(true);
	    this.jInternalFrameReporteDinamicoAnticipos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAnticipos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAnticipos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAnticipos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anticiposes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAnticipos = new JLabelMe();

		this.jLabelColumnasSelectReporteAnticipos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAnticipos.add(this.jLabelColumnasSelectReporteAnticipos, this.gridBagConstraintsAnticipos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAnticipos = new JList<Reporte>();
		this.jListColumnasSelectReporteAnticipos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAnticipos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAnticipos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAnticipos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAnticipos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAnticipos=new JScrollPane(this.jListColumnasSelectReporteAnticipos);
			
			this.jScrollColumnasSelectReporteAnticipos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAnticipos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAnticipos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAnticipos.add(this.jListColumnasSelectReporteAnticipos, this.gridBagConstraintsAnticipos);
		this.jPanelReporteDinamicoAnticipos.add(this.jScrollColumnasSelectReporteAnticipos, this.gridBagConstraintsAnticipos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAnticipos = new JLabelMe();

		this.jLabelRelacionesSelectReporteAnticipos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAnticipos = new JList<Reporte>();
		this.jListRelacionesSelectReporteAnticipos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAnticipos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAnticipos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAnticipos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAnticipos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAnticipos=new JScrollPane(this.jListRelacionesSelectReporteAnticipos);
			
			this.jScrollRelacionesSelectReporteAnticipos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAnticipos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAnticipos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAnticipos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAnticipos = new JComboBoxMe();
		this.jListColumnasValoresGraficoAnticipos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAnticipos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAnticipos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAnticipos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAnticipos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAnticipos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAnticipos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAnticipos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAnticipos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAnticipos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAnticipos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoAnticipos = new JLabelMe();

		this.jLabelConGraficoDinamicoAnticipos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAnticipos.add(this.jLabelConGraficoDinamicoAnticipos, this.gridBagConstraintsAnticipos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoAnticipos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoAnticipos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoAnticipos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoAnticipos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAnticipos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAnticipos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnticipos.add(this.jCheckBoxConGraficoDinamicoAnticipos, this.gridBagConstraintsAnticipos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoAnticipos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoAnticipos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAnticipos.add(this.jLabelColumnaCategoriaGraficoAnticipos, this.gridBagConstraintsAnticipos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoAnticipos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAnticipos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoAnticipos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoAnticipos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAnticipos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAnticipos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoAnticipos.add(this.jComboBoxColumnaCategoriaGraficoAnticipos, this.gridBagConstraintsAnticipos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorAnticipos = new JLabelMe();

		this.jLabelColumnaCategoriaValorAnticipos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnticipos.add(this.jLabelColumnaCategoriaValorAnticipos, this.gridBagConstraintsAnticipos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorAnticipos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorAnticipos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorAnticipos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorAnticipos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAnticipos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAnticipos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoAnticipos.add(this.jComboBoxColumnaCategoriaValorAnticipos, this.gridBagConstraintsAnticipos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoAnticipos = new JLabelMe();

		this.jLabelColumnasValoresGraficoAnticipos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnticipos.add(this.jLabelColumnasValoresGraficoAnticipos, this.gridBagConstraintsAnticipos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoAnticipos = new JList<Reporte>();
		this.jListColumnasValoresGraficoAnticipos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoAnticipos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoAnticipos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAnticipos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAnticipos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoAnticipos=new JScrollPane(this.jListColumnasValoresGraficoAnticipos);
			
			this.jScrollColumnasValoresGraficoAnticipos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAnticipos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAnticipos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoAnticipos.add(this.jListColumnasSelectReporteAnticipos, this.gridBagConstraintsAnticipos);
		this.jPanelReporteDinamicoAnticipos.add(this.jScrollColumnasValoresGraficoAnticipos, this.gridBagConstraintsAnticipos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoAnticipos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoAnticipos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnticipos.add(this.jLabelTiposGraficosReportesDinamicoAnticipos, this.gridBagConstraintsAnticipos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoAnticipos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAnticipos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoAnticipos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoAnticipos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAnticipos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAnticipos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnticipos.add(this.jComboBoxTiposGraficosReportesDinamicoAnticipos, this.gridBagConstraintsAnticipos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAnticipos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAnticipos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnticipos.add(this.jLabelGenerarExcelReporteDinamicoAnticipos, this.gridBagConstraintsAnticipos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAnticipos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAnticipos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAnticipos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAnticipos.setToolTipText("Generar EXCEL"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAnticipos = new GridBagConstraints();
		//this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAnticipos.add(this.jButtonGenerarExcelReporteDinamicoAnticipos, this.gridBagConstraintsAnticipos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnticipos.add(this.jComboBoxTiposReportesDinamicoAnticipos, this.gridBagConstraintsAnticipos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAnticipos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAnticipos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAnticipos.add(this.jLabelTiposArchivoReporteDinamicoAnticipos, this.gridBagConstraintsAnticipos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnticipos.add(this.jComboBoxTiposArchivosReportesDinamicoAnticipos, this.gridBagConstraintsAnticipos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAnticipos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAnticipos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAnticipos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAnticipos.setToolTipText("Generar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnticipos.add(this.jButtonGenerarReporteDinamicoAnticipos, this.gridBagConstraintsAnticipos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAnticipos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAnticipos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAnticipos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAnticipos.setToolTipText("Cancelar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAnticipos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAnticipos.add(this.jButtonCerrarReporteDinamicoAnticipos, this.gridBagConstraintsAnticipos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAnticipos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAnticipos= new JScrollPane(jPanelReporteDinamicoAnticipos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAnticipos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAnticipos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAnticipos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anticiposes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAnticipos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAnticipos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAnticipos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAnticipos);
		this.jInternalFrameReporteDinamicoAnticipos.getContentPane().add(this.jScrollPanelReporteDinamicoAnticipos, this.gridBagConstraintsAnticipos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAnticipos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAnticipos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAnticipos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAnticipos.setName("jPanelImportacionAnticipos"); 
		
		this.jPanelImportacionAnticipos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAnticipos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAnticipos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAnticipos.setLayout(gridaBagLayoutImportacionAnticipos);
		
		
		this.jInternalFrameImportacionAnticipos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAnticipos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAnticipos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAnticipos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAnticipos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAnticipos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAnticipos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAnticipos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAnticipos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAnticipos.setResizable(true);
	    this.jInternalFrameImportacionAnticipos.setClosable(true);
	    this.jInternalFrameImportacionAnticipos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAnticipos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAnticipos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAnticipos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAnticipos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAnticipos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAnticipos.setResizable(true);
	    this.jInternalFrameImportacionAnticipos.setClosable(true);
	    this.jInternalFrameImportacionAnticipos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAnticipos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAnticipos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAnticipos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anticiposes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAnticipos = new JLabelMe();

		this.jLabelArchivoImportacionAnticipos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYImportacion;		
		this.gridBagConstraintsAnticipos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAnticipos.add(this.jLabelArchivoImportacionAnticipos, this.gridBagConstraintsAnticipos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAnticipos = new JFileChooser();		
		this.jFileChooserImportacionAnticipos.setToolTipText("ESCOGER ARCHIVO"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAnticipos = new JButtonMe();
		this.jButtonAbrirImportacionAnticipos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAnticipos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAnticipos.setToolTipText("Generar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYImportacion;
		this.gridBagConstraintsAnticipos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnticipos.add(this.jButtonAbrirImportacionAnticipos, this.gridBagConstraintsAnticipos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAnticipos = new JLabelMe();

		this.jLabelPathArchivoImportacionAnticipos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAnticipos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAnticipos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAnticipos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYImportacion;		
		this.gridBagConstraintsAnticipos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAnticipos.add(this.jLabelPathArchivoImportacionAnticipos, this.gridBagConstraintsAnticipos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAnticipos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAnticipos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAnticipos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAnticipos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYImportacion;
		this.gridBagConstraintsAnticipos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnticipos.add(this.jTextFieldPathArchivoImportacionAnticipos, this.gridBagConstraintsAnticipos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAnticipos = new JButtonMe();
		this.jButtonGenerarImportacionAnticipos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAnticipos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAnticipos.setToolTipText("Generar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYImportacion;
		this.gridBagConstraintsAnticipos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnticipos.add(this.jButtonGenerarImportacionAnticipos, this.gridBagConstraintsAnticipos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAnticipos = new JButtonMe();
		this.jButtonCerrarImportacionAnticipos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAnticipos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAnticipos.setToolTipText("Cancelar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAnticipos.gridy = iPosYImportacion;
		this.gridBagConstraintsAnticipos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAnticipos.add(this.jButtonCerrarImportacionAnticipos, this.gridBagConstraintsAnticipos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAnticipos = new GridBagLayout();
		
		this.jScrollPanelImportacionAnticipos= new JScrollPane(jPanelImportacionAnticipos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAnticipos = new GridBagConstraints();
		this.gridBagConstraintsAnticipos.gridy =iPosYImportacion;
		this.gridBagConstraintsAnticipos.gridx =iPosXImportacion;
		this.gridBagConstraintsAnticipos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAnticipos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAnticipos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAnticipos);
		this.jInternalFrameImportacionAnticipos.getContentPane().add(this.jScrollPanelImportacionAnticipos, this.gridBagConstraintsAnticipos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAnticipos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAnticipos = new JButtonMe();
			this.jButtonAbrirOrderByAnticipos.setText("Orden");
			this.jButtonAbrirOrderByAnticipos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAnticipos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAnticipos";
			inputMap = this.jButtonAbrirOrderByAnticipos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAnticipos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAnticipos"));
		
		
			GridBagLayout gridaBagLayoutOrderByAnticipos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAnticipos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAnticipos.setName("jPanelOrderByAnticipos"); 
			
			this.jPanelOrderByAnticipos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAnticipos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAnticipos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAnticipos.setLayout(gridaBagLayoutOrderByAnticipos);
			
			
			this.jTableDatosAnticiposOrderBy = new JTableMe();        
			this.jTableDatosAnticiposOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAnticiposOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAnticiposOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAnticiposOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAnticiposOrderBy.setViewportView(this.jTableDatosAnticiposOrderBy);
			this.jTableDatosAnticiposOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAnticiposOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAnticipos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAnticipos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAnticipos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAnticipos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAnticipos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAnticipos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAnticipos.setTitle("Orden");
			this.jInternalFrameOrderByAnticipos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAnticipos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAnticipos.setResizable(true);
			this.jInternalFrameOrderByAnticipos.setClosable(true);
			this.jInternalFrameOrderByAnticipos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAnticipos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAnticipos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAnticipos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAnticipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Anticiposes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAnticipos.gridx =iPosXOrderBy;
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAnticipos.ipady =150;
				
			this.jPanelOrderByAnticipos.add(jScrollPanelDatosAnticiposOrderBy, this.gridBagConstraintsAnticipos);//this.jTableDatosAnticiposTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAnticipos = new JButtonMe();
			this.jButtonCerrarOrderByAnticipos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAnticipos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAnticipos.setToolTipText("Cancelar"+" "+AnticiposConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAnticipos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAnticipos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAnticipos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAnticipos.add(this.jButtonCerrarOrderByAnticipos, this.gridBagConstraintsAnticipos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAnticipos = new GridBagLayout();
			
			this.jScrollPanelOrderByAnticipos= new JScrollPane(jPanelOrderByAnticipos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAnticipos = new GridBagConstraints();
			this.gridBagConstraintsAnticipos.gridy =iPosYOrderBy;
			this.gridBagConstraintsAnticipos.gridx =iPosXOrderBy;
			this.gridBagConstraintsAnticipos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAnticipos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAnticipos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAnticipos);
			
			this.jInternalFrameOrderByAnticipos.getContentPane().add(this.jScrollPanelOrderByAnticipos, this.gridBagConstraintsAnticipos);			
		
		} else {
			this.jButtonAbrirOrderByAnticipos = new JButtonMe();
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
		//	&& this.anticiposSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAnticipos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAnticipos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAnticipos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosAnticipos.getRowHeight();//AnticiposConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AnticiposConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAnticipos.isSelected()) {
					iHeightTable=AnticiposConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AnticiposConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AnticiposConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AnticiposConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAnticipos.isSelected()) {
					iHeightTable=AnticiposConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AnticiposConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AnticiposConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAnticipos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAnticipos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAnticipos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAnticipos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAnticipos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAnticipos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAnticipos!=null && this.jInternalFrameOrderByAnticipos.getjTableDatosOrderBy()!=null) {
			//if(!this.anticiposSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAnticipos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAnticipos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAnticipos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAnticipos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAnticipos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAnticipos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAnticipos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAnticipos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAnticipos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAnticipos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=anticiposLogic.getAnticiposs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=anticiposs.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Anticipos> TraerAnticiposBeans(List<Anticipos> anticiposs,ArrayList<Classe> classes)throws Exception {
		try {
			for(Anticipos anticipos:anticiposs) {
					
				if(!(AnticiposConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AnticiposConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					anticipos.setsDetalleGeneralEntityReporte(AnticiposConstantesFunciones.getAnticiposDescripcion(anticipos));
										
						
					
						
					
				} else  {
							
					//anticipos.setsDetalleGeneralEntityReporte(anticipos.getsDetalleGeneralEntityReporte());
										
				}
				
				//anticiposbeans.add(anticiposbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return anticiposs;
    }
	//PARA REPORTES FIN
}
