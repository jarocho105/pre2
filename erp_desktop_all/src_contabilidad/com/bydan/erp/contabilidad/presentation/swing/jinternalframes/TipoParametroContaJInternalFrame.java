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
import com.bydan.erp.contabilidad.util.TipoParametroContaConstantesFunciones;

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
public class TipoParametroContaJInternalFrame extends TipoParametroContaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoParametroConta;
	
	protected JMenuBar jmenuBarTipoParametroConta;
	
	protected JMenu jmenuTipoParametroConta;
	protected JMenu jmenuDatosTipoParametroConta;
	protected JMenu jmenuArchivoTipoParametroConta;
	protected JMenu jmenuAccionesTipoParametroConta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoParametroConta;	
	protected GridBagConstraints gridBagConstraintsTipoParametroConta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoParametroContaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoParametroConta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoParametroConta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoParametroConta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoParametroContaSessionBean tipoparametrocontaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoParametroConta> tipoparametrocontas;		
	public List<TipoParametroConta> tipoparametrocontasEliminados;	
	public List<TipoParametroConta> tipoparametrocontasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoParametroConta;		
	protected JButton jButtonAbrirOrderByTipoParametroConta;
	
	
	//protected JPanel jPanelOrderByTipoParametroConta;
	//public JScrollPane jScrollPanelOrderByTipoParametroConta;	
	//protected JButton jButtonCerrarOrderByTipoParametroConta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoParametroContaLogic tipoparametrocontaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoParametroConta;
	public JScrollPane jScrollPanelDatosEdicionTipoParametroConta;
	public JScrollPane jScrollPanelDatosGeneralTipoParametroConta;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoParametroContaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoParametroConta;
	//public JScrollPane jScrollPanelImportacionTipoParametroConta;
	
	
	
	protected JPanel jPanelAccionesTipoParametroConta;
	
    protected JPanel jPanelPaginacionTipoParametroConta;
    protected JPanel jPanelParametrosReportesTipoParametroConta;
	protected JPanel jPanelParametrosReportesAccionesTipoParametroConta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoParametroConta;
	protected JPanel jPanelParametrosAuxiliar2TipoParametroConta;
	protected JPanel jPanelParametrosAuxiliar3TipoParametroConta;
	protected JPanel jPanelParametrosAuxiliar4TipoParametroConta;
	//protected JPanel jPanelParametrosAuxiliar5TipoParametroConta;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoParametroConta;
	//protected JPanel jPanelImportacionTipoParametroConta;
	
	
	public JTable jTableDatosTipoParametroConta;
	
	
	
	//public JTable jTableDatosTipoParametroContaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoParametroConta;
	protected JButton jButtonDuplicarTipoParametroConta;
	protected JButton jButtonCopiarTipoParametroConta;
	protected JButton jButtonVerFormTipoParametroConta;
	protected JButton jButtonNuevoRelacionesTipoParametroConta;
	protected JButton jButtonModificarTipoParametroConta;
	
    protected JButton jButtonGuardarCambiosTablaTipoParametroConta;
	protected JButton jButtonCerrarTipoParametroConta;
	
	
	protected JButton jButtonRecargarInformacionTipoParametroConta;
	protected JButton jButtonProcesarInformacionTipoParametroConta;
	
	
	protected JButton jButtonAnterioresTipoParametroConta;
	protected JButton jButtonSiguientesTipoParametroConta;
	protected JButton jButtonNuevoGuardarCambiosTipoParametroConta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoParametroConta;
	//protected JButton jButtonCerrarReporteDinamicoTipoParametroConta;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoParametroConta;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoParametroConta;
	//protected JButton jButtonGenerarImportacionTipoParametroConta;
	//protected JButton jButtonCerrarImportacionTipoParametroConta;
	//protected JFileChooser jFileChooserImportacionTipoParametroConta;
	//protected File fileImportacionTipoParametroConta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoParametroConta;
	protected JButton jButtonDuplicarToolBarTipoParametroConta;
	protected JButton jButtonNuevoRelacionesToolBarTipoParametroConta;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoParametroConta;
	protected JButton jButtonCopiarToolBarTipoParametroConta;
	protected JButton jButtonVerFormToolBarTipoParametroConta;
	public JButton jButtonGuardarCambiosTablaToolBarTipoParametroConta;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoParametroConta;
	protected JButton jButtonCerrarToolBarTipoParametroConta;
	
	protected JButton jButtonRecargarInformacionToolBarTipoParametroConta;
	protected JButton jButtonProcesarInformacionToolBarTipoParametroConta;
	protected JButton jButtonAnterioresToolBarTipoParametroConta;
	protected JButton jButtonSiguientesToolBarTipoParametroConta;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoParametroConta;
	protected JButton jButtonAbrirOrderByToolBarTipoParametroConta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoParametroConta;
	protected JMenuItem jMenuItemDuplicarTipoParametroConta;
	protected JMenuItem jMenuItemNuevoRelacionesTipoParametroConta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoParametroConta;
	protected JMenuItem jMenuItemCopiarTipoParametroConta;
	protected JMenuItem jMenuItemVerFormTipoParametroConta;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoParametroConta;
	protected JMenuItem jMenuItemCerrarTipoParametroConta;
	protected JMenuItem jMenuItemDetalleCerrarTipoParametroConta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoParametroConta;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoParametroConta;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoParametroConta;
	protected JMenuItem jMenuItemProcesarInformacionTipoParametroConta;
	protected JMenuItem jMenuItemAnterioresTipoParametroConta;
	protected JMenuItem jMenuItemSiguientesTipoParametroConta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoParametroConta;
	protected JMenuItem jMenuItemAbrirOrderByTipoParametroConta;
	protected JMenuItem jMenuItemMostrarOcultarTipoParametroConta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoParametroConta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoParametroConta;
	protected JCheckBox jCheckBoxSeleccionadosTipoParametroConta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoParametroConta;
	protected JCheckBox jCheckBoxConGraficoReporteTipoParametroConta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoParametroConta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoParametroConta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoParametroConta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoParametroConta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoParametroConta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoParametroConta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoParametroConta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoParametroConta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoParametroConta;
	protected JTextField jTextFieldValorCampoGeneralTipoParametroConta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoParametroConta;
	//public JList<Reporte> jListColumnasSelectReporteTipoParametroConta;
	//public JScrollPane jScrollColumnasSelectReporteTipoParametroConta;
	
	//public JLabel jLabelRelacionesSelectReporteTipoParametroConta;
	//public JList<Reporte> jListRelacionesSelectReporteTipoParametroConta;
	//public JScrollPane jScrollRelacionesSelectReporteTipoParametroConta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoParametroConta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoParametroConta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoParametroConta;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoParametroConta;
	
		
	//public JLabel jLabelArchivoImportacionTipoParametroConta;	
	//public JLabel jLabelPathArchivoImportacionTipoParametroConta;
	//protected JTextField jTextFieldPathArchivoImportacionTipoParametroConta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoParametroConta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoParametroConta;
	
	//public JLabel jLabelColumnaCategoriaValorTipoParametroConta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoParametroConta;
	
	//public JLabel jLabelColumnasValoresGraficoTipoParametroConta;
	//public JList<Reporte> jListColumnasValoresGraficoTipoParametroConta;
	//public JScrollPane jScrollColumnasValoresGraficoTipoParametroConta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoParametroConta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoParametroConta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoParametroConta;
	
	
	
	
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
	public TipoParametroContaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParametroContaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParametroContaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParametroContaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoParametroConta)	{
		this.jButtonRecargarInformacionTipoParametroConta = jButtonRecargarInformacionTipoParametroConta;
	}
	
	public JButton getjButtonProcesarInformacionTipoParametroConta() {
		return this.jButtonProcesarInformacionTipoParametroConta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoParametroConta)	{
		this.jButtonProcesarInformacionTipoParametroConta = jButtonProcesarInformacionTipoParametroConta;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoParametroConta() {
		return this.jButtonRecargarInformacionTipoParametroConta;
	}
	
	
	public List<TipoParametroConta> gettipoparametrocontas() {
		return this.tipoparametrocontas;
	}

	public void settipoparametrocontas(List<TipoParametroConta> tipoparametrocontas) {
		this.tipoparametrocontas = tipoparametrocontas;
	}
	
	public List<TipoParametroConta> gettipoparametrocontasAux() {
		return this.tipoparametrocontasAux;
	}

	public void settipoparametrocontasAux(List<TipoParametroConta> tipoparametrocontasAux) {
		this.tipoparametrocontasAux = tipoparametrocontasAux;
	}
	
	public List<TipoParametroConta> gettipoparametrocontasEliminados() {
		return this.tipoparametrocontasEliminados;
	}

	public void setTipoParametroContasEliminados(List<TipoParametroConta> tipoparametrocontasEliminados) {
		this.tipoparametrocontasEliminados = tipoparametrocontasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoParametroConta() {
		return jComboBoxTiposSeleccionarTipoParametroConta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoParametroConta(
			JComboBox jComboBoxTiposSeleccionarTipoParametroConta) {
		this.jComboBoxTiposSeleccionarTipoParametroConta = jComboBoxTiposSeleccionarTipoParametroConta;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoParametroConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoParametroConta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoParametroConta() {
		return jTextFieldValorCampoGeneralTipoParametroConta;
	}

	public void setjTextFieldValorCampoGeneralTipoParametroConta(
			JTextField jTextFieldValorCampoGeneralTipoParametroConta) {
		this.jTextFieldValorCampoGeneralTipoParametroConta = jTextFieldValorCampoGeneralTipoParametroConta;
	}

	public void setBorderResaltarValorCampoGeneralTipoParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroConta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoParametroConta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoParametroConta() {
		return this.jCheckBoxSeleccionarTodosTipoParametroConta;
	}

	public void setjCheckBoxSeleccionarTodosTipoParametroConta(
			JCheckBox jCheckBoxSeleccionarTodosTipoParametroConta) {
		this.jCheckBoxSeleccionarTodosTipoParametroConta = jCheckBoxSeleccionarTodosTipoParametroConta;
	}

	public void setBorderResaltarSeleccionarTodosTipoParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroConta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoParametroConta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoParametroConta() {
		return this.jCheckBoxSeleccionadosTipoParametroConta;
	}

	public void setjCheckBoxSeleccionadosTipoParametroConta(
			JCheckBox jCheckBoxSeleccionadosTipoParametroConta) {
		this.jCheckBoxSeleccionadosTipoParametroConta = jCheckBoxSeleccionadosTipoParametroConta;
	}
	
	public void setBorderResaltarSeleccionadosTipoParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroConta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoParametroConta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoParametroConta() {
		return this.jComboBoxTiposArchivosReportesTipoParametroConta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoParametroConta(
			JComboBox jComboBoxTiposArchivosReportesTipoParametroConta) {
		this.jComboBoxTiposArchivosReportesTipoParametroConta = jComboBoxTiposArchivosReportesTipoParametroConta;
	}

	public void setBorderResaltarTiposArchivosReportesTipoParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoParametroConta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoParametroConta() {
		return this.jComboBoxTiposReportesTipoParametroConta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoParametroConta(
			JComboBox jComboBoxTiposReportesTipoParametroConta) {
		this.jComboBoxTiposReportesTipoParametroConta = jComboBoxTiposReportesTipoParametroConta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoParametroConta() {
	//	return jComboBoxTiposReportesDinamicoTipoParametroConta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoParametroConta(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoParametroConta) {
	//	this.jComboBoxTiposReportesDinamicoTipoParametroConta = jComboBoxTiposReportesDinamicoTipoParametroConta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoParametroConta() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoParametroConta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoParametroConta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoParametroConta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoParametroConta = jComboBoxTiposArchivosReportesDinamicoTipoParametroConta;
	//}
	
	public void setBorderResaltarTiposReportesTipoParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoParametroConta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoParametroConta() {
		return this.jComboBoxTiposGraficosReportesTipoParametroConta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoParametroConta(
			JComboBox jComboBoxTiposGraficosReportesTipoParametroConta) {
		this.jComboBoxTiposGraficosReportesTipoParametroConta = jComboBoxTiposGraficosReportesTipoParametroConta;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoParametroConta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoParametroConta() {
		return this.jComboBoxTiposPaginacionTipoParametroConta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoParametroConta(
			JComboBox jComboBoxTiposPaginacionTipoParametroConta) {
		this.jComboBoxTiposPaginacionTipoParametroConta = jComboBoxTiposPaginacionTipoParametroConta;
	}
	
	public void setBorderResaltarTiposPaginacionTipoParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoParametroConta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoParametroConta() {
		return this.jComboBoxTiposRelacionesTipoParametroConta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoParametroConta() {
		return this.jComboBoxTiposAccionesTipoParametroConta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoParametroConta(
			JComboBox jComboBoxTiposRelacionesTipoParametroConta) {
		this.jComboBoxTiposRelacionesTipoParametroConta = jComboBoxTiposRelacionesTipoParametroConta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoParametroConta(
			JComboBox jComboBoxTiposAccionesTipoParametroConta) {
		this.jComboBoxTiposAccionesTipoParametroConta = jComboBoxTiposAccionesTipoParametroConta;
	}
	
	public void setBorderResaltarTiposRelacionesTipoParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoParametroConta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoParametroConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoParametroConta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoParametroConta() {
	//	return jCheckBoxConGraficoDinamicoTipoParametroConta;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoParametroConta(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoParametroConta) {
	//	this.jCheckBoxConGraficoDinamicoTipoParametroConta = jCheckBoxConGraficoDinamicoTipoParametroConta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoParametroConta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoParametroConta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoParametroConta .setBorder(borderResaltar);		
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
		this.tipoparametrocontaSessionBean=new TipoParametroContaSessionBean();
		
		this.tipoparametrocontaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparametrocontaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoparametrocontaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoParametroContaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoParametroContaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoParametroContaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoParametroContaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoParametroContaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Parametro Conta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoParametroContaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoParametroConta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoParametroConta,this.jTtoolBarTipoParametroConta,
							"nuevo","nuevo","Nuevo"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoParametroConta,this.jTtoolBarTipoParametroConta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoParametroConta,this.jTtoolBarTipoParametroConta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoParametroConta,this.jTtoolBarTipoParametroConta,
							"duplicar","duplicar","Duplicar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoParametroConta,this.jTtoolBarTipoParametroConta,
							"copiar","copiar","Copiar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoParametroConta,this.jTtoolBarTipoParametroConta,
							"ver_form","ver_form","Ver"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParametroConta,this.jTtoolBarTipoParametroConta,
							"recargar","recargar","Recargar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParametroConta,this.jTtoolBarTipoParametroConta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParametroConta,this.jTtoolBarTipoParametroConta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoParametroConta,this.jTtoolBarTipoParametroConta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoParametroConta,this.jTtoolBarTipoParametroConta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoParametroConta,this.jTtoolBarTipoParametroConta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoParametroConta,this.jTtoolBarTipoParametroConta,
							"cerrar","cerrar","Salir"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoParametroConta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoParametroConta;
			
				this.jButtonProcesarInformacionToolBarTipoParametroConta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoParametroConta;
				
		//protected JButton jButtonModificarToolBarTipoParametroConta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoParametroConta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoParametroConta=new JMenuMe("General");
		this.jmenuArchivoTipoParametroConta=new JMenuMe("Archivo");
		this.jmenuAccionesTipoParametroConta=new JMenuMe("Acciones");
		this.jmenuDatosTipoParametroConta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoParametroConta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoParametroConta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoParametroConta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoParametroConta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoParametroConta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoParametroConta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoParametroConta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoParametroConta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoParametroConta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoParametroConta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoParametroConta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoParametroConta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoParametroConta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoParametroConta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoParametroConta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoParametroConta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoParametroConta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoParametroConta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoParametroConta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoParametroConta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoParametroConta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoParametroConta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoParametroConta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoParametroConta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoParametroConta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoParametroConta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoParametroConta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoParametroConta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoParametroConta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoParametroConta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoParametroConta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoParametroConta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoParametroConta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoParametroConta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoParametroConta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoParametroConta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoParametroConta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoParametroConta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoParametroConta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoParametroConta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoParametroConta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoParametroConta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoParametroConta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoParametroConta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoParametroConta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoParametroConta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoParametroConta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoParametroConta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoParametroConta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoParametroConta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoParametroConta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoParametroConta.add(this.jMenuItemCerrarTipoParametroConta);
			
			this.jmenuAccionesTipoParametroConta.add(this.jMenuItemNuevoTipoParametroConta);
			this.jmenuAccionesTipoParametroConta.add(this.jMenuItemNuevoGuardarCambiosTipoParametroConta);
			this.jmenuAccionesTipoParametroConta.add(this.jMenuItemNuevoRelacionesTipoParametroConta);
			this.jmenuAccionesTipoParametroConta.add(this.jMenuItemGuardarCambiosTablaTipoParametroConta);		
			this.jmenuAccionesTipoParametroConta.add(this.jMenuItemDuplicarTipoParametroConta);		
			this.jmenuAccionesTipoParametroConta.add(this.jMenuItemCopiarTipoParametroConta);		
			this.jmenuAccionesTipoParametroConta.add(this.jMenuItemVerFormTipoParametroConta);		
			
			this.jmenuDatosTipoParametroConta.add(this.jMenuItemRecargarInformacionTipoParametroConta);				
			this.jmenuDatosTipoParametroConta.add(this.jMenuItemAnterioresTipoParametroConta);				
			this.jmenuDatosTipoParametroConta.add(this.jMenuItemSiguientesTipoParametroConta);				
			this.jmenuDatosTipoParametroConta.add(this.jMenuItemAbrirOrderByTipoParametroConta);				
			this.jmenuDatosTipoParametroConta.add(this.jMenuItemMostrarOcultarTipoParametroConta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoParametroConta.add(this.jMenuItemGuardarCambiosTipoParametroConta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoParametroConta.add(this.jmenuArchivoTipoParametroConta);		
			this.jmenuBarTipoParametroConta.add(this.jmenuAccionesTipoParametroConta);		
			this.jmenuBarTipoParametroConta.add(this.jmenuDatosTipoParametroConta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoParametroConta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoParametroConta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoParametroConta=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoParametroConta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoParametroConta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoParametroConta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoParametroConta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoParametroConta = new TipoParametroContaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Parametro Conta DATOS");
			this.jInternalFrameDetalleFormTipoParametroConta = new TipoParametroContaDetalleFormJInternalFrame(jDesktopPane,this.tipoparametrocontaSessionBean.getConGuardarRelaciones(),this.tipoparametrocontaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoParametroConta = null;//new TipoParametroContaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoParametroConta= new GridBagLayout();
		
		
		this.jTableDatosTipoParametroConta = new JTableMe();      
		
		String sToolTipTipoParametroConta="";
		sToolTipTipoParametroConta=TipoParametroContaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoParametroConta+="(Contabilidad.TipoParametroConta)";
		}
		
		if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoParametroConta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoParametroConta.setToolTipText(sToolTipTipoParametroConta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoParametroConta);
		this.jTableDatosTipoParametroConta.setAutoCreateRowSorter(true);
		this.jTableDatosTipoParametroConta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoParametroConta.setRowSelectionAllowed(true);
		this.jTableDatosTipoParametroConta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoParametroConta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoParametroConta = new JButtonMe();
		this.jButtonDuplicarTipoParametroConta = new JButtonMe();
		this.jButtonCopiarTipoParametroConta = new JButtonMe();
		this.jButtonVerFormTipoParametroConta = new JButtonMe();
		this.jButtonNuevoRelacionesTipoParametroConta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoParametroConta = new JButtonMe();
		this.jButtonCerrarTipoParametroConta = new JButtonMe();
		
		this.jScrollPanelDatosTipoParametroConta = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoParametroConta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Parametro Conta";
		
		if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Parametro Contas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoParametroConta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoParametroConta.setToolTipText("Acciones");
        this.jPanelAccionesTipoParametroConta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoParametroConta=new ReporteDinamicoJInternalFrame(TipoParametroContaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoParametroConta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoParametroConta=new ImportacionJInternalFrame(TipoParametroContaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoParametroConta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoParametroConta = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoParametroConta.setText("Orden");
		this.jButtonAbrirOrderByTipoParametroConta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoParametroConta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoParametroConta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParametroConta,false,this);
			
			//this.cargarOrderByTipoParametroConta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoParametroConta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParametroConta,true,this);
			
			//this.cargarOrderByTipoParametroConta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoParametroConta.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoParametroConta.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoParametroConta.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoParametroConta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoParametroConta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoParametroConta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoParametroConta.setText("Nuevo");
		this.jButtonDuplicarTipoParametroConta.setText("Duplicar");
		this.jButtonCopiarTipoParametroConta.setText("Copiar");
		this.jButtonVerFormTipoParametroConta.setText("Ver");
		this.jButtonNuevoRelacionesTipoParametroConta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoParametroConta.setText("Guardar");
		this.jButtonCerrarTipoParametroConta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoParametroConta,"nuevo_button","Nuevo",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoParametroConta,"duplicar_button","Duplicar",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoParametroConta,"copiar_button","Copiar",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoParametroConta,"ver_form","Ver",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoParametroConta,"nuevorelaciones_button","Nuevo Rel",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoParametroConta,"guardarcambiostabla_button","Guardar",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoParametroConta,"cerrar_button","Salir",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoParametroConta.setToolTipText("Nuevo"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoParametroConta.setToolTipText("Duplicar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoParametroConta.setToolTipText("Copiar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoParametroConta.setToolTipText("Ver"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoParametroConta.setToolTipText("Nuevo Rel"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoParametroConta.setToolTipText("Guardar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoParametroConta.setToolTipText("Salir"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoParametroConta";
		inputMap = this.jButtonNuevoTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoParametroConta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoParametroConta"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoParametroConta";
		inputMap = this.jButtonDuplicarTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoParametroConta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoParametroConta"));
		
		//COPIAR
		sMapKey = "CopiarTipoParametroConta";
		inputMap = this.jButtonCopiarTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoParametroConta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoParametroConta"));
		
		//VEr FORM
		sMapKey = "VerFormTipoParametroConta";
		inputMap = this.jButtonVerFormTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoParametroConta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoParametroConta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoParametroConta";
		inputMap = this.jButtonNuevoRelacionesTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoParametroConta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoParametroConta";
		inputMap = this.jButtonModificarTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoParametroConta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoParametroConta";
		inputMap = this.jButtonCerrarTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoParametroConta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoParametroConta";
		inputMap = this.jButtonGuardarCambiosTablaTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoParametroConta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoParametroConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoParametroConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoParametroConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoParametroConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoParametroConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoParametroConta.setName("jPanelParametrosReportesTipoParametroConta"); 
		
		this.jPanelParametrosReportesAccionesTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoParametroConta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoParametroConta.setName("jPanelParametrosReportesAccionesTipoParametroConta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoParametroConta = new JButtonMe();
		this.jButtonRecargarInformacionTipoParametroConta.setText("Recargar");
		this.jButtonRecargarInformacionTipoParametroConta.setToolTipText("Recargar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoParametroConta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoParametroConta = new JButtonMe();
		this.jButtonProcesarInformacionTipoParametroConta.setText("Procesar");
		this.jButtonProcesarInformacionTipoParametroConta.setToolTipText("Procesar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoParametroConta.setVisible(false);
			
		this.jButtonProcesarInformacionTipoParametroConta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoParametroConta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoParametroConta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParametroConta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoParametroConta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParametroConta.setText("TIPO");       
		this.jComboBoxTiposReportesTipoParametroConta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParametroConta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoParametroConta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoParametroConta.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoParametroConta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoParametroConta.setText("Accion");
		this.jComboBoxTiposRelacionesTipoParametroConta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoParametroConta.setText("Accion");
		this.jComboBoxTiposAccionesTipoParametroConta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoParametroConta.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoParametroConta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoParametroConta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoParametroConta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoParametroConta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoParametroConta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoParametroConta = new JLabelMe();
		
		this.jLabelAccionesTipoParametroConta.setText("Acciones");		
		this.jLabelAccionesTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoParametroConta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoParametroConta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoParametroConta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoParametroConta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoParametroConta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoParametroConta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoParametroConta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoParametroConta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoParametroConta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoParametroConta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoParametroConta.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoParametroConta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoParametroConta = new JButtonMe();
		//this.jButtonAnterioresTipoParametroConta.setText("<<");
        this.jButtonAnterioresTipoParametroConta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoParametroConta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoParametroConta = new JButtonMe();
		//this.jButtonSiguientesTipoParametroConta.setText(">>");
        this.jButtonSiguientesTipoParametroConta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoParametroConta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoParametroConta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoParametroConta.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoParametroConta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoParametroConta,"nuevoguardarcambios_button","Nue",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoParametroConta";
		inputMap = this.jButtonNuevoGuardarCambiosTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoParametroConta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoParametroConta";
		inputMap = this.jButtonRecargarInformacionTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoParametroConta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoParametroConta";
		inputMap = this.jButtonSiguientesTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoParametroConta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoParametroConta";
		inputMap = this.jButtonAnterioresTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoParametroConta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoParametroConta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoParametroConta.setMinimumSize(new Dimension(this.getWidth(),TipoParametroContaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParametroContaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoParametroConta.setMaximumSize(new Dimension(this.getWidth(),TipoParametroContaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParametroContaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoParametroConta.setPreferredSize(new Dimension(this.getWidth(),TipoParametroContaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParametroContaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoParametroConta = new GridBagLayout();

			this.jPanelPaginacionTipoParametroConta.setLayout(gridaBagLayoutPaginacionTipoParametroConta);						
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.gridy = 0;
			this.gridBagConstraintsTipoParametroConta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoParametroConta.add(this.jButtonAnterioresTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
					
						
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoParametroConta.gridy = 0;
			
			this.jPanelPaginacionTipoParametroConta.add(this.jButtonNuevoGuardarCambiosTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
						
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoParametroConta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoParametroConta.gridy = 0;
			this.jPanelPaginacionTipoParametroConta.add(this.jButtonSiguientesTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.gridy = 1;
			this.gridBagConstraintsTipoParametroConta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParametroConta.add(this.jButtonNuevoTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
				this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoParametroConta.gridy = 1;
				this.gridBagConstraintsTipoParametroConta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoParametroConta.add(this.jButtonNuevoRelacionesTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
			}
			
			
			if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
				this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoParametroConta.gridy = 1;
				this.gridBagConstraintsTipoParametroConta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoParametroConta.add(this.jButtonGuardarCambiosTablaTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
			}
			
			
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.gridy = 1;
			this.gridBagConstraintsTipoParametroConta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParametroConta.add(this.jButtonDuplicarTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.gridy = 1;
			this.gridBagConstraintsTipoParametroConta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParametroConta.add(this.jButtonCopiarTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.gridy = 1;
			this.gridBagConstraintsTipoParametroConta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParametroConta.add(this.jButtonVerFormTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.gridy = 1;
			this.gridBagConstraintsTipoParametroConta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoParametroConta.add(this.jButtonCerrarTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		
		
		
		this.jButtonRecargarInformacionTipoParametroConta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoParametroConta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoParametroConta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoParametroConta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoParametroConta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoParametroConta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoParametroConta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoParametroConta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoParametroConta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoParametroConta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoParametroConta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoParametroConta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoParametroConta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoParametroConta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoParametroConta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoParametroConta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoParametroConta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoParametroConta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoParametroConta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParametroConta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParametroConta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoParametroConta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoParametroConta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoParametroConta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoParametroConta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoParametroConta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoParametroConta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoParametroConta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoParametroConta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoParametroConta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoParametroConta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoParametroConta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoParametroConta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoParametroConta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoParametroConta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoParametroConta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoParametroConta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoParametroConta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoParametroConta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoParametroConta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoParametroConta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoParametroConta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoParametroConta.setLayout(gridaBagParametrosReportesTipoParametroConta);
			this.jPanelParametrosReportesAccionesTipoParametroConta.setLayout(gridaBagParametrosReportesAccionesTipoParametroConta);
			
			
			this.jPanelParametrosAuxiliar1TipoParametroConta.setLayout(gridaBagParametrosAuxiliar1TipoParametroConta);
			this.jPanelParametrosAuxiliar2TipoParametroConta.setLayout(gridaBagParametrosAuxiliar2TipoParametroConta);
			this.jPanelParametrosAuxiliar3TipoParametroConta.setLayout(gridaBagParametrosAuxiliar3TipoParametroConta);
			this.jPanelParametrosAuxiliar4TipoParametroConta.setLayout(gridaBagParametrosAuxiliar4TipoParametroConta);
			//this.jPanelParametrosAuxiliar5TipoParametroConta.setLayout(gridaBagParametrosAuxiliar2TipoParametroConta);			
			
			
			
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParametroConta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParametroConta.add(this.jButtonRecargarInformacionTipoParametroConta, this.gridBagConstraintsTipoParametroConta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroConta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParametroConta.add(this.jComboBoxTiposPaginacionTipoParametroConta, this.gridBagConstraintsTipoParametroConta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroConta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParametroConta.add(this.jCheckBoxConAltoMaximoTablaTipoParametroConta, this.gridBagConstraintsTipoParametroConta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroConta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParametroConta.add(this.jComboBoxTiposArchivosReportesTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroConta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParametroConta.add(this.jPanelParametrosAuxiliar1TipoParametroConta, this.gridBagConstraintsTipoParametroConta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParametroConta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoParametroConta.add(this.jComboBoxTiposReportesTipoParametroConta, this.gridBagConstraintsTipoParametroConta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroConta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParametroConta.add(this.jPanelParametrosAuxiliar4TipoParametroConta, this.gridBagConstraintsTipoParametroConta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroConta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParametroConta.add(this.jComboBoxTiposReportesTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroConta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParametroConta.add(this.jCheckBoxGenerarReporteTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroConta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParametroConta.add(this.jPanelParametrosAuxiliar2TipoParametroConta, this.gridBagConstraintsTipoParametroConta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParametroConta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParametroConta.add(this.jLabelAccionesTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
				this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoParametroConta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoParametroConta.add(this.jButtonAbrirOrderByTipoParametroConta, this.gridBagConstraintsTipoParametroConta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroConta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParametroConta.add(this.jComboBoxTiposSeleccionarTipoParametroConta, this.gridBagConstraintsTipoParametroConta);			
			
			
			/*
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParametroConta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParametroConta.add(this.jCheckBoxSeleccionarTodosTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParametroConta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoParametroConta.add(this.jCheckBoxSeleccionarTodosTipoParametroConta, this.gridBagConstraintsTipoParametroConta);															
				
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParametroConta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoParametroConta.add(this.jCheckBoxSeleccionadosTipoParametroConta, this.gridBagConstraintsTipoParametroConta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroConta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParametroConta.add(this.jPanelParametrosAuxiliar3TipoParametroConta, this.gridBagConstraintsTipoParametroConta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroConta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParametroConta.add(this.jComboBoxTiposRelacionesTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
				
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroConta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParametroConta.add(this.jComboBoxTiposAccionesTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
	
				
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroConta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParametroConta.add(this.jTextFieldValorCampoGeneralTipoParametroConta, this.gridBagConstraintsTipoParametroConta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoParametroConta = new GridBagLayout();

			this.jScrollPanelDatosTipoParametroConta.setLayout(gridaBagLayoutDatosTipoParametroConta);
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.gridy = 0;
			this.gridBagConstraintsTipoParametroConta.gridx = 0;
			
			this.jScrollPanelDatosTipoParametroConta.add(this.jTableDatosTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoParametroConta.setViewportView(this.jTableDatosTipoParametroConta);
		this.jTableDatosTipoParametroConta.setFillsViewportHeight(true);
		this.jTableDatosTipoParametroConta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoParametroConta= new GridBagLayout();
		this.jPanelAccionesTipoParametroConta.setLayout(gridaBagLayoutAccionesTipoParametroConta);
		
		
		/*	
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroConta.gridy = 0;
		this.gridBagConstraintsTipoParametroConta.gridx = 0;
			
		this.jPanelAccionesTipoParametroConta.add(this.jButtonNuevoTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoParametroConta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoParametroConta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();						
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParametroConta.gridx = 0;		
			//this.gridBagConstraintsTipoParametroConta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoParametroConta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoParametroConta, this.gridBagConstraintsTipoParametroConta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoParametroConta.gridx = 0;		
		//this.gridBagConstraintsTipoParametroConta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoParametroConta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoParametroConta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroConta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoParametroConta, this.gridBagConstraintsTipoParametroConta);								
		
		
		/*
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroConta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		*/		
		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoParametroConta.gridx =0;
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoParametroConta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
				
		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroConta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoParametroContaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoParametroConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoParametroConta = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoParametroConta.setLayout(gridaBagLayoutBusquedasParametrosTipoParametroConta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoParametroConta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoParametroConta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParametroConta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParametroConta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroConta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
			
			
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroConta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		
			
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroConta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoParametroConta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoParametroConta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoParametroConta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoParametroConta.setName("jPanelReporteDinamicoTipoParametroConta"); 
		
		this.jPanelReporteDinamicoTipoParametroConta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoParametroConta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoParametroConta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoParametroConta.setLayout(gridaBagLayoutReporteDinamicoTipoParametroConta);
		
		
		this.jInternalFrameReporteDinamicoTipoParametroConta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoParametroConta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoParametroConta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoParametroConta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoParametroConta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoParametroConta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoParametroConta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoParametroConta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoParametroConta.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoParametroConta.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoParametroConta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoParametroConta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoParametroConta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoParametroConta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Parametro Contas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoParametroConta = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoParametroConta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoParametroConta.add(this.jLabelColumnasSelectReporteTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoParametroConta = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoParametroConta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoParametroConta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoParametroConta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoParametroConta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoParametroConta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoParametroConta=new JScrollPane(this.jListColumnasSelectReporteTipoParametroConta);
			
			this.jScrollColumnasSelectReporteTipoParametroConta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoParametroConta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoParametroConta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoParametroConta.add(this.jListColumnasSelectReporteTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		this.jPanelReporteDinamicoTipoParametroConta.add(this.jScrollColumnasSelectReporteTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoParametroConta = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoParametroConta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoParametroConta.add(this.jLabelRelacionesSelectReporteTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoParametroConta = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoParametroConta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoParametroConta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoParametroConta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoParametroConta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoParametroConta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoParametroConta=new JScrollPane(this.jListRelacionesSelectReporteTipoParametroConta);
			
			this.jScrollRelacionesSelectReporteTipoParametroConta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoParametroConta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoParametroConta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoParametroConta.add(this.jListRelacionesSelectReporteTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		this.jPanelReporteDinamicoTipoParametroConta.add(this.jScrollRelacionesSelectReporteTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoParametroConta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoParametroConta = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoParametroConta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoParametroConta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoParametroConta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoParametroConta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoParametroConta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoParametroConta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoParametroConta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoParametroConta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoParametroConta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoParametroConta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoParametroConta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoParametroConta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoParametroConta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoParametroConta.add(this.jLabelGenerarExcelReporteDinamicoTipoParametroConta, this.gridBagConstraintsTipoParametroConta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoParametroConta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoParametroConta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoParametroConta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoParametroConta.setToolTipText("Generar EXCEL"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoParametroConta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoParametroConta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoParametroConta.add(this.jButtonGenerarExcelReporteDinamicoTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParametroConta.add(this.jComboBoxTiposReportesDinamicoTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoParametroConta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoParametroConta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoParametroConta.add(this.jLabelTiposArchivoReporteDinamicoTipoParametroConta, this.gridBagConstraintsTipoParametroConta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParametroConta.add(this.jComboBoxTiposArchivosReportesDinamicoTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoParametroConta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoParametroConta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoParametroConta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoParametroConta.setToolTipText("Generar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParametroConta.add(this.jButtonGenerarReporteDinamicoTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoParametroConta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoParametroConta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoParametroConta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoParametroConta.setToolTipText("Cancelar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParametroConta.add(this.jButtonCerrarReporteDinamicoTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoParametroConta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoParametroConta= new JScrollPane(jPanelReporteDinamicoTipoParametroConta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoParametroConta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoParametroConta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoParametroConta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Parametro Contas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoParametroConta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoParametroConta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoParametroConta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoParametroConta);
		this.jInternalFrameReporteDinamicoTipoParametroConta.getContentPane().add(this.jScrollPanelReporteDinamicoTipoParametroConta, this.gridBagConstraintsTipoParametroConta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoParametroConta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoParametroConta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoParametroConta.setName("jPanelImportacionTipoParametroConta"); 
		
		this.jPanelImportacionTipoParametroConta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoParametroConta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoParametroConta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoParametroConta.setLayout(gridaBagLayoutImportacionTipoParametroConta);
		
		
		this.jInternalFrameImportacionTipoParametroConta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoParametroConta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoParametroConta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoParametroConta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoParametroConta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoParametroConta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoParametroConta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoParametroConta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoParametroConta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoParametroConta.setResizable(true);
	    this.jInternalFrameImportacionTipoParametroConta.setClosable(true);
	    this.jInternalFrameImportacionTipoParametroConta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoParametroConta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoParametroConta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoParametroConta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoParametroConta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoParametroConta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoParametroConta.setResizable(true);
	    this.jInternalFrameImportacionTipoParametroConta.setClosable(true);
	    this.jInternalFrameImportacionTipoParametroConta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoParametroConta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoParametroConta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoParametroConta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Parametro Contas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoParametroConta = new JLabelMe();

		this.jLabelArchivoImportacionTipoParametroConta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoParametroConta.add(this.jLabelArchivoImportacionTipoParametroConta, this.gridBagConstraintsTipoParametroConta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoParametroConta = new JFileChooser();		
		this.jFileChooserImportacionTipoParametroConta.setToolTipText("ESCOGER ARCHIVO"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoParametroConta = new JButtonMe();
		this.jButtonAbrirImportacionTipoParametroConta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoParametroConta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoParametroConta.setToolTipText("Generar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParametroConta.add(this.jButtonAbrirImportacionTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoParametroConta = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoParametroConta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoParametroConta.add(this.jLabelPathArchivoImportacionTipoParametroConta, this.gridBagConstraintsTipoParametroConta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoParametroConta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoParametroConta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoParametroConta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoParametroConta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParametroConta.add(this.jTextFieldPathArchivoImportacionTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoParametroConta = new JButtonMe();
		this.jButtonGenerarImportacionTipoParametroConta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoParametroConta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoParametroConta.setToolTipText("Generar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParametroConta.add(this.jButtonGenerarImportacionTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoParametroConta = new JButtonMe();
		this.jButtonCerrarImportacionTipoParametroConta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoParametroConta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoParametroConta.setToolTipText("Cancelar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroConta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParametroConta.add(this.jButtonCerrarImportacionTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoParametroConta = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoParametroConta= new JScrollPane(jPanelImportacionTipoParametroConta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoParametroConta.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoParametroConta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoParametroConta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoParametroConta);
		this.jInternalFrameImportacionTipoParametroConta.getContentPane().add(this.jScrollPanelImportacionTipoParametroConta, this.gridBagConstraintsTipoParametroConta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoParametroConta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoParametroConta = new JButtonMe();
			this.jButtonAbrirOrderByTipoParametroConta.setText("Orden");
			this.jButtonAbrirOrderByTipoParametroConta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoParametroConta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoParametroConta";
			inputMap = this.jButtonAbrirOrderByTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoParametroConta"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoParametroConta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoParametroConta.setName("jPanelOrderByTipoParametroConta"); 
			
			this.jPanelOrderByTipoParametroConta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoParametroConta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoParametroConta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoParametroConta.setLayout(gridaBagLayoutOrderByTipoParametroConta);
			
			
			this.jTableDatosTipoParametroContaOrderBy = new JTableMe();        
			this.jTableDatosTipoParametroContaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoParametroContaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoParametroContaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoParametroContaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoParametroContaOrderBy.setViewportView(this.jTableDatosTipoParametroContaOrderBy);
			this.jTableDatosTipoParametroContaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoParametroContaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoParametroConta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoParametroConta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoParametroConta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoParametroConta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoParametroConta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoParametroConta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoParametroConta.setTitle("Orden");
			this.jInternalFrameOrderByTipoParametroConta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoParametroConta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoParametroConta.setResizable(true);
			this.jInternalFrameOrderByTipoParametroConta.setClosable(true);
			this.jInternalFrameOrderByTipoParametroConta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoParametroConta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoParametroConta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoParametroConta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Parametro Contas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoParametroConta.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoParametroConta.ipady =150;
				
			this.jPanelOrderByTipoParametroConta.add(jScrollPanelDatosTipoParametroContaOrderBy, this.gridBagConstraintsTipoParametroConta);//this.jTableDatosTipoParametroContaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoParametroConta = new JButtonMe();
			this.jButtonCerrarOrderByTipoParametroConta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoParametroConta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoParametroConta.setToolTipText("Cancelar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoParametroConta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoParametroConta.add(this.jButtonCerrarOrderByTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoParametroConta = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoParametroConta= new JScrollPane(jPanelOrderByTipoParametroConta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoParametroConta.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoParametroConta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoParametroConta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoParametroConta);
			
			this.jInternalFrameOrderByTipoParametroConta.getContentPane().add(this.jScrollPanelOrderByTipoParametroConta, this.gridBagConstraintsTipoParametroConta);			
		
		} else {
			this.jButtonAbrirOrderByTipoParametroConta = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoparametrocontaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoParametroConta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoParametroConta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoParametroConta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoParametroConta.getRowHeight();//TipoParametroContaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoParametroContaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoParametroConta.isSelected()) {
					iHeightTable=TipoParametroContaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoParametroContaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoParametroContaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoParametroContaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoParametroConta.isSelected()) {
					iHeightTable=TipoParametroContaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoParametroContaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoParametroContaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoParametroConta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoParametroConta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoParametroConta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoParametroConta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoParametroConta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoParametroConta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoParametroConta!=null && this.jInternalFrameOrderByTipoParametroConta.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoParametroConta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoParametroConta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoParametroConta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoParametroConta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoParametroConta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoParametroConta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoParametroConta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoParametroConta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoParametroConta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoParametroConta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoparametrocontaLogic.getTipoParametroContas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparametrocontas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoParametroConta> TraerTipoParametroContaBeans(List<TipoParametroConta> tipoparametrocontas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoParametroConta tipoparametroconta:tipoparametrocontas) {
					
				if(!(TipoParametroContaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoParametroContaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoparametroconta.setsDetalleGeneralEntityReporte(TipoParametroContaConstantesFunciones.getTipoParametroContaDescripcion(tipoparametroconta));
										
						
					
					

					if(tipoparametroconta.getParametroContaDetalles()!=null && Funciones.existeClass(classes,ParametroContaDetalle.class)) {
						try{tipoparametroconta.setparametrocontadetallesDescripcionReporte(new JRBeanCollectionDataSource(ParametroContaDetalleJInternalFrame.TraerParametroContaDetalleBeans(tipoparametroconta.getParametroContaDetalles(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoparametroconta.setsDetalleGeneralEntityReporte(tipoparametroconta.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoparametrocontabeans.add(tipoparametrocontabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoparametrocontas;
    }
	//PARA REPORTES FIN
}
