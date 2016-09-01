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
import com.bydan.erp.contabilidad.util.TipoDetalleDocumentoConstantesFunciones;

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
public class TipoDetalleDocumentoJInternalFrame extends TipoDetalleDocumentoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoDetalleDocumento;
	
	protected JMenuBar jmenuBarTipoDetalleDocumento;
	
	protected JMenu jmenuTipoDetalleDocumento;
	protected JMenu jmenuDatosTipoDetalleDocumento;
	protected JMenu jmenuArchivoTipoDetalleDocumento;
	protected JMenu jmenuAccionesTipoDetalleDocumento;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDetalleDocumento;	
	protected GridBagConstraints gridBagConstraintsTipoDetalleDocumento;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoDetalleDocumentoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoDetalleDocumento;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoDetalleDocumento;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoDetalleDocumento;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoDetalleDocumentoSessionBean tipodetalledocumentoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoDetalleDocumento> tipodetalledocumentos;		
	public List<TipoDetalleDocumento> tipodetalledocumentosEliminados;	
	public List<TipoDetalleDocumento> tipodetalledocumentosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoDetalleDocumento;		
	protected JButton jButtonAbrirOrderByTipoDetalleDocumento;
	
	
	//protected JPanel jPanelOrderByTipoDetalleDocumento;
	//public JScrollPane jScrollPanelOrderByTipoDetalleDocumento;	
	//protected JButton jButtonCerrarOrderByTipoDetalleDocumento;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoDetalleDocumentoLogic tipodetalledocumentoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoDetalleDocumento;
	public JScrollPane jScrollPanelDatosEdicionTipoDetalleDocumento;
	public JScrollPane jScrollPanelDatosGeneralTipoDetalleDocumento;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoDetalleDocumentoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoDetalleDocumento;
	//public JScrollPane jScrollPanelImportacionTipoDetalleDocumento;
	
	
	
	protected JPanel jPanelAccionesTipoDetalleDocumento;
	
    protected JPanel jPanelPaginacionTipoDetalleDocumento;
    protected JPanel jPanelParametrosReportesTipoDetalleDocumento;
	protected JPanel jPanelParametrosReportesAccionesTipoDetalleDocumento;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoDetalleDocumento;
	protected JPanel jPanelParametrosAuxiliar2TipoDetalleDocumento;
	protected JPanel jPanelParametrosAuxiliar3TipoDetalleDocumento;
	protected JPanel jPanelParametrosAuxiliar4TipoDetalleDocumento;
	//protected JPanel jPanelParametrosAuxiliar5TipoDetalleDocumento;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoDetalleDocumento;
	//protected JPanel jPanelImportacionTipoDetalleDocumento;
	
	
	public JTable jTableDatosTipoDetalleDocumento;
	
	
	
	//public JTable jTableDatosTipoDetalleDocumentoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoDetalleDocumento;
	protected JButton jButtonDuplicarTipoDetalleDocumento;
	protected JButton jButtonCopiarTipoDetalleDocumento;
	protected JButton jButtonVerFormTipoDetalleDocumento;
	protected JButton jButtonNuevoRelacionesTipoDetalleDocumento;
	protected JButton jButtonModificarTipoDetalleDocumento;
	
    protected JButton jButtonGuardarCambiosTablaTipoDetalleDocumento;
	protected JButton jButtonCerrarTipoDetalleDocumento;
	
	
	protected JButton jButtonRecargarInformacionTipoDetalleDocumento;
	protected JButton jButtonProcesarInformacionTipoDetalleDocumento;
	
	
	protected JButton jButtonAnterioresTipoDetalleDocumento;
	protected JButton jButtonSiguientesTipoDetalleDocumento;
	protected JButton jButtonNuevoGuardarCambiosTipoDetalleDocumento;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoDetalleDocumento;
	//protected JButton jButtonCerrarReporteDinamicoTipoDetalleDocumento;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoDetalleDocumento;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoDetalleDocumento;
	//protected JButton jButtonGenerarImportacionTipoDetalleDocumento;
	//protected JButton jButtonCerrarImportacionTipoDetalleDocumento;
	//protected JFileChooser jFileChooserImportacionTipoDetalleDocumento;
	//protected File fileImportacionTipoDetalleDocumento;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDetalleDocumento;
	protected JButton jButtonDuplicarToolBarTipoDetalleDocumento;
	protected JButton jButtonNuevoRelacionesToolBarTipoDetalleDocumento;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoDetalleDocumento;
	protected JButton jButtonCopiarToolBarTipoDetalleDocumento;
	protected JButton jButtonVerFormToolBarTipoDetalleDocumento;
	public JButton jButtonGuardarCambiosTablaToolBarTipoDetalleDocumento;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDetalleDocumento;
	protected JButton jButtonCerrarToolBarTipoDetalleDocumento;
	
	protected JButton jButtonRecargarInformacionToolBarTipoDetalleDocumento;
	protected JButton jButtonProcesarInformacionToolBarTipoDetalleDocumento;
	protected JButton jButtonAnterioresToolBarTipoDetalleDocumento;
	protected JButton jButtonSiguientesToolBarTipoDetalleDocumento;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoDetalleDocumento;
	protected JButton jButtonAbrirOrderByToolBarTipoDetalleDocumento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDetalleDocumento;
	protected JMenuItem jMenuItemDuplicarTipoDetalleDocumento;
	protected JMenuItem jMenuItemNuevoRelacionesTipoDetalleDocumento;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoDetalleDocumento;
	protected JMenuItem jMenuItemCopiarTipoDetalleDocumento;
	protected JMenuItem jMenuItemVerFormTipoDetalleDocumento;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDetalleDocumento;
	protected JMenuItem jMenuItemCerrarTipoDetalleDocumento;
	protected JMenuItem jMenuItemDetalleCerrarTipoDetalleDocumento;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoDetalleDocumento;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDetalleDocumento;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoDetalleDocumento;
	protected JMenuItem jMenuItemProcesarInformacionTipoDetalleDocumento;
	protected JMenuItem jMenuItemAnterioresTipoDetalleDocumento;
	protected JMenuItem jMenuItemSiguientesTipoDetalleDocumento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDetalleDocumento;
	protected JMenuItem jMenuItemAbrirOrderByTipoDetalleDocumento;
	protected JMenuItem jMenuItemMostrarOcultarTipoDetalleDocumento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDetalleDocumento;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoDetalleDocumento;
	protected JCheckBox jCheckBoxSeleccionadosTipoDetalleDocumento;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoDetalleDocumento;
	protected JCheckBox jCheckBoxConGraficoReporteTipoDetalleDocumento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoDetalleDocumento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoDetalleDocumento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDetalleDocumento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoDetalleDocumento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoDetalleDocumento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoDetalleDocumento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDetalleDocumento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDetalleDocumento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoDetalleDocumento;
	protected JTextField jTextFieldValorCampoGeneralTipoDetalleDocumento;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoDetalleDocumento;
	//public JList<Reporte> jListColumnasSelectReporteTipoDetalleDocumento;
	//public JScrollPane jScrollColumnasSelectReporteTipoDetalleDocumento;
	
	//public JLabel jLabelRelacionesSelectReporteTipoDetalleDocumento;
	//public JList<Reporte> jListRelacionesSelectReporteTipoDetalleDocumento;
	//public JScrollPane jScrollRelacionesSelectReporteTipoDetalleDocumento;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoDetalleDocumento;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoDetalleDocumento;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoDetalleDocumento;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoDetalleDocumento;
	
		
	//public JLabel jLabelArchivoImportacionTipoDetalleDocumento;	
	//public JLabel jLabelPathArchivoImportacionTipoDetalleDocumento;
	//protected JTextField jTextFieldPathArchivoImportacionTipoDetalleDocumento;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoDetalleDocumento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoDetalleDocumento;
	
	//public JLabel jLabelColumnaCategoriaValorTipoDetalleDocumento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoDetalleDocumento;
	
	//public JLabel jLabelColumnasValoresGraficoTipoDetalleDocumento;
	//public JList<Reporte> jListColumnasValoresGraficoTipoDetalleDocumento;
	//public JScrollPane jScrollColumnasValoresGraficoTipoDetalleDocumento;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoDetalleDocumento;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoDetalleDocumento;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoDetalleDocumento;
	public JPanel jPanelBusquedaPorCodigoTipoDetalleDocumento;
	public JButton jButtonBusquedaPorCodigoTipoDetalleDocumento;
	public JPanel jPanelBusquedaPorNombreTipoDetalleDocumento;
	public JButton jButtonBusquedaPorNombreTipoDetalleDocumento;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoDetalleDocumento;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoDetalleDocumento;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoDetalleDocumento;
	public JButton jButtoncodigoBusquedaPorCodigoTipoDetalleDocumentoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoDetalleDocumento;
	public JLabel jLabelnombreBusquedaPorNombreTipoDetalleDocumento;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoDetalleDocumento;
	public JButton jButtonnombreBusquedaPorNombreTipoDetalleDocumentoBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoDetalleDocumentoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoDetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetalleDocumentoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetalleDocumentoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetalleDocumentoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoDetalleDocumento)	{
		this.jButtonRecargarInformacionTipoDetalleDocumento = jButtonRecargarInformacionTipoDetalleDocumento;
	}
	
	public JButton getjButtonProcesarInformacionTipoDetalleDocumento() {
		return this.jButtonProcesarInformacionTipoDetalleDocumento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDetalleDocumento)	{
		this.jButtonProcesarInformacionTipoDetalleDocumento = jButtonProcesarInformacionTipoDetalleDocumento;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoDetalleDocumento() {
		return this.jButtonRecargarInformacionTipoDetalleDocumento;
	}
	
	
	public List<TipoDetalleDocumento> gettipodetalledocumentos() {
		return this.tipodetalledocumentos;
	}

	public void settipodetalledocumentos(List<TipoDetalleDocumento> tipodetalledocumentos) {
		this.tipodetalledocumentos = tipodetalledocumentos;
	}
	
	public List<TipoDetalleDocumento> gettipodetalledocumentosAux() {
		return this.tipodetalledocumentosAux;
	}

	public void settipodetalledocumentosAux(List<TipoDetalleDocumento> tipodetalledocumentosAux) {
		this.tipodetalledocumentosAux = tipodetalledocumentosAux;
	}
	
	public List<TipoDetalleDocumento> gettipodetalledocumentosEliminados() {
		return this.tipodetalledocumentosEliminados;
	}

	public void setTipoDetalleDocumentosEliminados(List<TipoDetalleDocumento> tipodetalledocumentosEliminados) {
		this.tipodetalledocumentosEliminados = tipodetalledocumentosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoDetalleDocumento() {
		return jComboBoxTiposSeleccionarTipoDetalleDocumento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoDetalleDocumento(
			JComboBox jComboBoxTiposSeleccionarTipoDetalleDocumento) {
		this.jComboBoxTiposSeleccionarTipoDetalleDocumento = jComboBoxTiposSeleccionarTipoDetalleDocumento;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoDetalleDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoDetalleDocumento .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoDetalleDocumento() {
		return jTextFieldValorCampoGeneralTipoDetalleDocumento;
	}

	public void setjTextFieldValorCampoGeneralTipoDetalleDocumento(
			JTextField jTextFieldValorCampoGeneralTipoDetalleDocumento) {
		this.jTextFieldValorCampoGeneralTipoDetalleDocumento = jTextFieldValorCampoGeneralTipoDetalleDocumento;
	}

	public void setBorderResaltarValorCampoGeneralTipoDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleDocumento.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoDetalleDocumento .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoDetalleDocumento() {
		return this.jCheckBoxSeleccionarTodosTipoDetalleDocumento;
	}

	public void setjCheckBoxSeleccionarTodosTipoDetalleDocumento(
			JCheckBox jCheckBoxSeleccionarTodosTipoDetalleDocumento) {
		this.jCheckBoxSeleccionarTodosTipoDetalleDocumento = jCheckBoxSeleccionarTodosTipoDetalleDocumento;
	}

	public void setBorderResaltarSeleccionarTodosTipoDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleDocumento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoDetalleDocumento .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoDetalleDocumento() {
		return this.jCheckBoxSeleccionadosTipoDetalleDocumento;
	}

	public void setjCheckBoxSeleccionadosTipoDetalleDocumento(
			JCheckBox jCheckBoxSeleccionadosTipoDetalleDocumento) {
		this.jCheckBoxSeleccionadosTipoDetalleDocumento = jCheckBoxSeleccionadosTipoDetalleDocumento;
	}
	
	public void setBorderResaltarSeleccionadosTipoDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleDocumento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoDetalleDocumento .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoDetalleDocumento() {
		return this.jComboBoxTiposArchivosReportesTipoDetalleDocumento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoDetalleDocumento(
			JComboBox jComboBoxTiposArchivosReportesTipoDetalleDocumento) {
		this.jComboBoxTiposArchivosReportesTipoDetalleDocumento = jComboBoxTiposArchivosReportesTipoDetalleDocumento;
	}

	public void setBorderResaltarTiposArchivosReportesTipoDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoDetalleDocumento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoDetalleDocumento() {
		return this.jComboBoxTiposReportesTipoDetalleDocumento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoDetalleDocumento(
			JComboBox jComboBoxTiposReportesTipoDetalleDocumento) {
		this.jComboBoxTiposReportesTipoDetalleDocumento = jComboBoxTiposReportesTipoDetalleDocumento;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoDetalleDocumento() {
	//	return jComboBoxTiposReportesDinamicoTipoDetalleDocumento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoDetalleDocumento(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoDetalleDocumento) {
	//	this.jComboBoxTiposReportesDinamicoTipoDetalleDocumento = jComboBoxTiposReportesDinamicoTipoDetalleDocumento;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoDetalleDocumento() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoDetalleDocumento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoDetalleDocumento(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDetalleDocumento) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleDocumento = jComboBoxTiposArchivosReportesDinamicoTipoDetalleDocumento;
	//}
	
	public void setBorderResaltarTiposReportesTipoDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoDetalleDocumento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoDetalleDocumento() {
		return this.jComboBoxTiposGraficosReportesTipoDetalleDocumento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoDetalleDocumento(
			JComboBox jComboBoxTiposGraficosReportesTipoDetalleDocumento) {
		this.jComboBoxTiposGraficosReportesTipoDetalleDocumento = jComboBoxTiposGraficosReportesTipoDetalleDocumento;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoDetalleDocumento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoDetalleDocumento() {
		return this.jComboBoxTiposPaginacionTipoDetalleDocumento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoDetalleDocumento(
			JComboBox jComboBoxTiposPaginacionTipoDetalleDocumento) {
		this.jComboBoxTiposPaginacionTipoDetalleDocumento = jComboBoxTiposPaginacionTipoDetalleDocumento;
	}
	
	public void setBorderResaltarTiposPaginacionTipoDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoDetalleDocumento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoDetalleDocumento() {
		return this.jComboBoxTiposRelacionesTipoDetalleDocumento;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDetalleDocumento() {
		return this.jComboBoxTiposAccionesTipoDetalleDocumento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDetalleDocumento(
			JComboBox jComboBoxTiposRelacionesTipoDetalleDocumento) {
		this.jComboBoxTiposRelacionesTipoDetalleDocumento = jComboBoxTiposRelacionesTipoDetalleDocumento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDetalleDocumento(
			JComboBox jComboBoxTiposAccionesTipoDetalleDocumento) {
		this.jComboBoxTiposAccionesTipoDetalleDocumento = jComboBoxTiposAccionesTipoDetalleDocumento;
	}
	
	public void setBorderResaltarTiposRelacionesTipoDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoDetalleDocumento .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoDetalleDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDetalleDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoDetalleDocumento .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoDetalleDocumento() {
	//	return jCheckBoxConGraficoDinamicoTipoDetalleDocumento;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoDetalleDocumento(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoDetalleDocumento) {
	//	this.jCheckBoxConGraficoDinamicoTipoDetalleDocumento = jCheckBoxConGraficoDinamicoTipoDetalleDocumento;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoDetalleDocumento() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoDetalleDocumento.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoDetalleDocumento .setBorder(borderResaltar);		
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
		this.tipodetalledocumentoSessionBean=new TipoDetalleDocumentoSessionBean();
		
		this.tipodetalledocumentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodetalledocumentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoDetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoDetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDetalleDocumentoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Detalle Documento MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoDetalleDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoDetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoDetalleDocumento= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoDetalleDocumento,this.jTtoolBarTipoDetalleDocumento,
							"nuevo","nuevo","Nuevo"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoDetalleDocumento,this.jTtoolBarTipoDetalleDocumento,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoDetalleDocumento,this.jTtoolBarTipoDetalleDocumento,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoDetalleDocumento,this.jTtoolBarTipoDetalleDocumento,
							"duplicar","duplicar","Duplicar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoDetalleDocumento,this.jTtoolBarTipoDetalleDocumento,
							"copiar","copiar","Copiar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoDetalleDocumento,this.jTtoolBarTipoDetalleDocumento,
							"ver_form","ver_form","Ver"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDetalleDocumento,this.jTtoolBarTipoDetalleDocumento,
							"recargar","recargar","Recargar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDetalleDocumento,this.jTtoolBarTipoDetalleDocumento,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDetalleDocumento,this.jTtoolBarTipoDetalleDocumento,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoDetalleDocumento,this.jTtoolBarTipoDetalleDocumento,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoDetalleDocumento,this.jTtoolBarTipoDetalleDocumento,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoDetalleDocumento,this.jTtoolBarTipoDetalleDocumento,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoDetalleDocumento,this.jTtoolBarTipoDetalleDocumento,
							"cerrar","cerrar","Salir"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoDetalleDocumento=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoDetalleDocumento;
			
				this.jButtonProcesarInformacionToolBarTipoDetalleDocumento=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoDetalleDocumento;
				
		//protected JButton jButtonModificarToolBarTipoDetalleDocumento;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoDetalleDocumento=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoDetalleDocumento=new JMenuMe("General");
		this.jmenuArchivoTipoDetalleDocumento=new JMenuMe("Archivo");
		this.jmenuAccionesTipoDetalleDocumento=new JMenuMe("Acciones");
		this.jmenuDatosTipoDetalleDocumento=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDetalleDocumento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDetalleDocumento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDetalleDocumento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoDetalleDocumento= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoDetalleDocumento.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoDetalleDocumento,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoDetalleDocumento= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoDetalleDocumento.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoDetalleDocumento,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoDetalleDocumento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDetalleDocumento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDetalleDocumento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoDetalleDocumento= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoDetalleDocumento.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoDetalleDocumento,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoDetalleDocumento= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoDetalleDocumento.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoDetalleDocumento,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoDetalleDocumento= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoDetalleDocumento.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoDetalleDocumento,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDetalleDocumento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDetalleDocumento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDetalleDocumento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoDetalleDocumento= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoDetalleDocumento.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoDetalleDocumento,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoDetalleDocumento= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoDetalleDocumento.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoDetalleDocumento,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoDetalleDocumento= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoDetalleDocumento.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoDetalleDocumento,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoDetalleDocumento= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoDetalleDocumento.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoDetalleDocumento,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoDetalleDocumento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoDetalleDocumento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoDetalleDocumento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDetalleDocumento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDetalleDocumento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDetalleDocumento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoDetalleDocumento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoDetalleDocumento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoDetalleDocumento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDetalleDocumento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDetalleDocumento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDetalleDocumento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoDetalleDocumento= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoDetalleDocumento.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoDetalleDocumento,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoDetalleDocumento.add(this.jMenuItemCerrarTipoDetalleDocumento);
			
			this.jmenuAccionesTipoDetalleDocumento.add(this.jMenuItemNuevoTipoDetalleDocumento);
			this.jmenuAccionesTipoDetalleDocumento.add(this.jMenuItemNuevoGuardarCambiosTipoDetalleDocumento);
			this.jmenuAccionesTipoDetalleDocumento.add(this.jMenuItemNuevoRelacionesTipoDetalleDocumento);
			this.jmenuAccionesTipoDetalleDocumento.add(this.jMenuItemGuardarCambiosTablaTipoDetalleDocumento);		
			this.jmenuAccionesTipoDetalleDocumento.add(this.jMenuItemDuplicarTipoDetalleDocumento);		
			this.jmenuAccionesTipoDetalleDocumento.add(this.jMenuItemCopiarTipoDetalleDocumento);		
			this.jmenuAccionesTipoDetalleDocumento.add(this.jMenuItemVerFormTipoDetalleDocumento);		
			
			this.jmenuDatosTipoDetalleDocumento.add(this.jMenuItemRecargarInformacionTipoDetalleDocumento);				
			this.jmenuDatosTipoDetalleDocumento.add(this.jMenuItemAnterioresTipoDetalleDocumento);				
			this.jmenuDatosTipoDetalleDocumento.add(this.jMenuItemSiguientesTipoDetalleDocumento);				
			this.jmenuDatosTipoDetalleDocumento.add(this.jMenuItemAbrirOrderByTipoDetalleDocumento);				
			this.jmenuDatosTipoDetalleDocumento.add(this.jMenuItemMostrarOcultarTipoDetalleDocumento);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoDetalleDocumento.add(this.jMenuItemGuardarCambiosTipoDetalleDocumento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoDetalleDocumento.add(this.jmenuArchivoTipoDetalleDocumento);		
			this.jmenuBarTipoDetalleDocumento.add(this.jmenuAccionesTipoDetalleDocumento);		
			this.jmenuBarTipoDetalleDocumento.add(this.jmenuDatosTipoDetalleDocumento);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoDetalleDocumento);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoDetalleDocumento() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoDetalleDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoDetalleDocumento.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoDetalleDocumento= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoDetalleDocumento.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoDetalleDocumento.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoDetalleDocumento,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoDetalleDocumento = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoDetalleDocumento.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoDetalleDocumento.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoDetalleDocumento= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoDetalleDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoDetalleDocumento.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoDetalleDocumento= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoDetalleDocumento.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoDetalleDocumento.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoDetalleDocumento,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoDetalleDocumento = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoDetalleDocumento.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoDetalleDocumento.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoDetalleDocumento= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoDetalleDocumento=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoDetalleDocumento.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDetalleDocumento.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDetalleDocumento.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoDetalleDocumento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoDetalleDocumento = new TipoDetalleDocumentoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Detalle Documento DATOS");
			this.jInternalFrameDetalleFormTipoDetalleDocumento = new TipoDetalleDocumentoDetalleFormJInternalFrame(jDesktopPane,this.tipodetalledocumentoSessionBean.getConGuardarRelaciones(),this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoDetalleDocumento = null;//new TipoDetalleDocumentoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDetalleDocumento= new GridBagLayout();
		
		
		this.jTableDatosTipoDetalleDocumento = new JTableMe();      
		
		String sToolTipTipoDetalleDocumento="";
		sToolTipTipoDetalleDocumento=TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDetalleDocumento+="(Contabilidad.TipoDetalleDocumento)";
		}
		
		if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDetalleDocumento+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoDetalleDocumento.setToolTipText(sToolTipTipoDetalleDocumento);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoDetalleDocumento);
		this.jTableDatosTipoDetalleDocumento.setAutoCreateRowSorter(true);
		this.jTableDatosTipoDetalleDocumento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoDetalleDocumento.setRowSelectionAllowed(true);
		this.jTableDatosTipoDetalleDocumento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoDetalleDocumento = new JButtonMe();
		this.jButtonDuplicarTipoDetalleDocumento = new JButtonMe();
		this.jButtonCopiarTipoDetalleDocumento = new JButtonMe();
		this.jButtonVerFormTipoDetalleDocumento = new JButtonMe();
		this.jButtonNuevoRelacionesTipoDetalleDocumento = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoDetalleDocumento = new JButtonMe();
		this.jButtonCerrarTipoDetalleDocumento = new JButtonMe();
		
		this.jScrollPanelDatosTipoDetalleDocumento = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoDetalleDocumento = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Detalle Documento";
		
		if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Documentos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDetalleDocumento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDetalleDocumento.setToolTipText("Acciones");
        this.jPanelAccionesTipoDetalleDocumento.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoDetalleDocumento=new ReporteDinamicoJInternalFrame(TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoDetalleDocumento();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoDetalleDocumento=new ImportacionJInternalFrame(TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoDetalleDocumento();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoDetalleDocumento = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoDetalleDocumento.setText("Orden");
		this.jButtonAbrirOrderByTipoDetalleDocumento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDetalleDocumento,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDetalleDocumento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetalleDocumento,false,this);
			
			//this.cargarOrderByTipoDetalleDocumento(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDetalleDocumento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetalleDocumento,true,this);
			
			//this.cargarOrderByTipoDetalleDocumento(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoDetalleDocumento.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDetalleDocumento.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDetalleDocumento.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoDetalleDocumento.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDetalleDocumento.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDetalleDocumento.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoDetalleDocumento.setText("Nuevo");
		this.jButtonDuplicarTipoDetalleDocumento.setText("Duplicar");
		this.jButtonCopiarTipoDetalleDocumento.setText("Copiar");
		this.jButtonVerFormTipoDetalleDocumento.setText("Ver");
		this.jButtonNuevoRelacionesTipoDetalleDocumento.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoDetalleDocumento.setText("Guardar");
		this.jButtonCerrarTipoDetalleDocumento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDetalleDocumento,"nuevo_button","Nuevo",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoDetalleDocumento,"duplicar_button","Duplicar",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoDetalleDocumento,"copiar_button","Copiar",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoDetalleDocumento,"ver_form","Ver",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoDetalleDocumento,"nuevorelaciones_button","Nuevo Rel",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDetalleDocumento,"guardarcambiostabla_button","Guardar",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDetalleDocumento,"cerrar_button","Salir",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoDetalleDocumento.setToolTipText("Nuevo"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoDetalleDocumento.setToolTipText("Duplicar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoDetalleDocumento.setToolTipText("Copiar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoDetalleDocumento.setToolTipText("Ver"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoDetalleDocumento.setToolTipText("Nuevo Rel"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoDetalleDocumento.setToolTipText("Guardar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDetalleDocumento.setToolTipText("Salir"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDetalleDocumento";
		inputMap = this.jButtonNuevoTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDetalleDocumento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDetalleDocumento"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoDetalleDocumento";
		inputMap = this.jButtonDuplicarTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoDetalleDocumento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoDetalleDocumento"));
		
		//COPIAR
		sMapKey = "CopiarTipoDetalleDocumento";
		inputMap = this.jButtonCopiarTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoDetalleDocumento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoDetalleDocumento"));
		
		//VEr FORM
		sMapKey = "VerFormTipoDetalleDocumento";
		inputMap = this.jButtonVerFormTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoDetalleDocumento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoDetalleDocumento"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoDetalleDocumento";
		inputMap = this.jButtonNuevoRelacionesTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoDetalleDocumento"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoDetalleDocumento";
		inputMap = this.jButtonModificarTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoDetalleDocumento"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoDetalleDocumento";
		inputMap = this.jButtonCerrarTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDetalleDocumento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDetalleDocumento";
		inputMap = this.jButtonGuardarCambiosTablaTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDetalleDocumento"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoDetalleDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoDetalleDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoDetalleDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoDetalleDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoDetalleDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoDetalleDocumento.setName("jPanelParametrosReportesTipoDetalleDocumento"); 
		
		this.jPanelParametrosReportesAccionesTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoDetalleDocumento.setName("jPanelParametrosReportesAccionesTipoDetalleDocumento"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoDetalleDocumento = new JButtonMe();
		this.jButtonRecargarInformacionTipoDetalleDocumento.setText("Recargar");
		this.jButtonRecargarInformacionTipoDetalleDocumento.setToolTipText("Recargar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoDetalleDocumento,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoDetalleDocumento = new JButtonMe();
		this.jButtonProcesarInformacionTipoDetalleDocumento.setText("Procesar");
		this.jButtonProcesarInformacionTipoDetalleDocumento.setToolTipText("Procesar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoDetalleDocumento.setVisible(false);
			
		this.jButtonProcesarInformacionTipoDetalleDocumento.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDetalleDocumento.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDetalleDocumento.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDetalleDocumento.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoDetalleDocumento.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDetalleDocumento.setText("TIPO");       
		this.jComboBoxTiposReportesTipoDetalleDocumento.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDetalleDocumento.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoDetalleDocumento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoDetalleDocumento.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoDetalleDocumento.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoDetalleDocumento.setText("Accion");
		this.jComboBoxTiposRelacionesTipoDetalleDocumento.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDetalleDocumento.setText("Accion");
		this.jComboBoxTiposAccionesTipoDetalleDocumento.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoDetalleDocumento.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoDetalleDocumento.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoDetalleDocumento=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoDetalleDocumento.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDetalleDocumento.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDetalleDocumento.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoDetalleDocumento = new JLabelMe();
		
		this.jLabelAccionesTipoDetalleDocumento.setText("Acciones");		
		this.jLabelAccionesTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoDetalleDocumento = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoDetalleDocumento.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoDetalleDocumento.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoDetalleDocumento = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoDetalleDocumento.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoDetalleDocumento.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoDetalleDocumento = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoDetalleDocumento.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoDetalleDocumento.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoDetalleDocumento = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoDetalleDocumento.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoDetalleDocumento.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoDetalleDocumento = new JButtonMe();
		//this.jButtonAnterioresTipoDetalleDocumento.setText("<<");
        this.jButtonAnterioresTipoDetalleDocumento.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoDetalleDocumento,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoDetalleDocumento = new JButtonMe();
		//this.jButtonSiguientesTipoDetalleDocumento.setText(">>");
        this.jButtonSiguientesTipoDetalleDocumento.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoDetalleDocumento,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoDetalleDocumento = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoDetalleDocumento.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoDetalleDocumento.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoDetalleDocumento,"nuevoguardarcambios_button","Nue",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoDetalleDocumento";
		inputMap = this.jButtonNuevoGuardarCambiosTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoDetalleDocumento"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoDetalleDocumento";
		inputMap = this.jButtonRecargarInformacionTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoDetalleDocumento"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoDetalleDocumento";
		inputMap = this.jButtonSiguientesTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoDetalleDocumento"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoDetalleDocumento";
		inputMap = this.jButtonAnterioresTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoDetalleDocumento"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoDetalleDocumento();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoDetalleDocumento.setMinimumSize(new Dimension(this.getWidth(),TipoDetalleDocumentoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDetalleDocumentoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDetalleDocumento.setMaximumSize(new Dimension(this.getWidth(),TipoDetalleDocumentoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDetalleDocumentoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDetalleDocumento.setPreferredSize(new Dimension(this.getWidth(),TipoDetalleDocumentoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDetalleDocumentoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoDetalleDocumento = new GridBagLayout();

			this.jPanelPaginacionTipoDetalleDocumento.setLayout(gridaBagLayoutPaginacionTipoDetalleDocumento);						
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoDetalleDocumento.add(this.jButtonAnterioresTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
					
						
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
			
			this.jPanelPaginacionTipoDetalleDocumento.add(this.jButtonNuevoGuardarCambiosTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
						
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
			this.jPanelPaginacionTipoDetalleDocumento.add(this.jButtonSiguientesTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = 1;
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetalleDocumento.add(this.jButtonNuevoTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
				this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDetalleDocumento.gridy = 1;
				this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoDetalleDocumento.add(this.jButtonNuevoRelacionesTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
			}
			
			
			if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
				this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDetalleDocumento.gridy = 1;
				this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoDetalleDocumento.add(this.jButtonGuardarCambiosTablaTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
			}
			
			
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = 1;
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetalleDocumento.add(this.jButtonDuplicarTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = 1;
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetalleDocumento.add(this.jButtonCopiarTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = 1;
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDetalleDocumento.add(this.jButtonVerFormTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = 1;
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoDetalleDocumento.add(this.jButtonCerrarTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		
		
		
		this.jButtonRecargarInformacionTipoDetalleDocumento.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDetalleDocumento.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDetalleDocumento.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoDetalleDocumento.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDetalleDocumento.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDetalleDocumento.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoDetalleDocumento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDetalleDocumento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDetalleDocumento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoDetalleDocumento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDetalleDocumento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDetalleDocumento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoDetalleDocumento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDetalleDocumento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDetalleDocumento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoDetalleDocumento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDetalleDocumento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDetalleDocumento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoDetalleDocumento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetalleDocumento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetalleDocumento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoDetalleDocumento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDetalleDocumento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDetalleDocumento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoDetalleDocumento.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDetalleDocumento.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDetalleDocumento.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoDetalleDocumento.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDetalleDocumento.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDetalleDocumento.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoDetalleDocumento.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDetalleDocumento.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDetalleDocumento.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoDetalleDocumento.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDetalleDocumento.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDetalleDocumento.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoDetalleDocumento = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoDetalleDocumento = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoDetalleDocumento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoDetalleDocumento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoDetalleDocumento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoDetalleDocumento = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoDetalleDocumento.setLayout(gridaBagParametrosReportesTipoDetalleDocumento);
			this.jPanelParametrosReportesAccionesTipoDetalleDocumento.setLayout(gridaBagParametrosReportesAccionesTipoDetalleDocumento);
			
			
			this.jPanelParametrosAuxiliar1TipoDetalleDocumento.setLayout(gridaBagParametrosAuxiliar1TipoDetalleDocumento);
			this.jPanelParametrosAuxiliar2TipoDetalleDocumento.setLayout(gridaBagParametrosAuxiliar2TipoDetalleDocumento);
			this.jPanelParametrosAuxiliar3TipoDetalleDocumento.setLayout(gridaBagParametrosAuxiliar3TipoDetalleDocumento);
			this.jPanelParametrosAuxiliar4TipoDetalleDocumento.setLayout(gridaBagParametrosAuxiliar4TipoDetalleDocumento);
			//this.jPanelParametrosAuxiliar5TipoDetalleDocumento.setLayout(gridaBagParametrosAuxiliar2TipoDetalleDocumento);			
			
			
			
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetalleDocumento.add(this.jButtonRecargarInformacionTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDetalleDocumento.add(this.jComboBoxTiposPaginacionTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDetalleDocumento.add(this.jCheckBoxConAltoMaximoTablaTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDetalleDocumento.add(this.jComboBoxTiposArchivosReportesTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetalleDocumento.add(this.jPanelParametrosAuxiliar1TipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetalleDocumento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoDetalleDocumento.add(this.jComboBoxTiposReportesTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetalleDocumento.add(this.jPanelParametrosAuxiliar4TipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetalleDocumento.add(this.jComboBoxTiposReportesTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDetalleDocumento.add(this.jCheckBoxGenerarReporteTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetalleDocumento.add(this.jPanelParametrosAuxiliar2TipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetalleDocumento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDetalleDocumento.add(this.jLabelAccionesTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
				this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoDetalleDocumento.add(this.jButtonAbrirOrderByTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetalleDocumento.add(this.jComboBoxTiposSeleccionarTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);			
			
			
			/*
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetalleDocumento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDetalleDocumento.add(this.jCheckBoxSeleccionarTodosTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetalleDocumento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDetalleDocumento.add(this.jCheckBoxSeleccionarTodosTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);															
				
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDetalleDocumento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDetalleDocumento.add(this.jCheckBoxSeleccionadosTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDetalleDocumento.add(this.jPanelParametrosAuxiliar3TipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetalleDocumento.add(this.jComboBoxTiposRelacionesTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
				
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetalleDocumento.add(this.jComboBoxTiposAccionesTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
	
				
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDetalleDocumento.add(this.jTextFieldValorCampoGeneralTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoDetalleDocumento = new GridBagLayout();

			this.jScrollPanelDatosTipoDetalleDocumento.setLayout(gridaBagLayoutDatosTipoDetalleDocumento);
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
			this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
			
			this.jScrollPanelDatosTipoDetalleDocumento.add(this.jTableDatosTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoDetalleDocumento.setViewportView(this.jTableDatosTipoDetalleDocumento);
		this.jTableDatosTipoDetalleDocumento.setFillsViewportHeight(true);
		this.jTableDatosTipoDetalleDocumento.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoDetalleDocumento= new GridBagLayout();
		this.jPanelAccionesTipoDetalleDocumento.setLayout(gridaBagLayoutAccionesTipoDetalleDocumento);
		
		
		/*	
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
		this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
			
		this.jPanelAccionesTipoDetalleDocumento.add(this.jButtonNuevoTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoDetalleDocumento= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoDetalleDocumento.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoDetalleDocumento.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoDetalleDocumento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoDetalleDocumento.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoDetalleDocumento.setLayout(gridaBagLayoutBusquedaPorCodigoTipoDetalleDocumento);

		gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetalleDocumento.gridy = 0;
		gridBagConstraintsTipoDetalleDocumento.gridx = 0;
		jPanelBusquedaPorCodigoTipoDetalleDocumento.add(jLabelcodigoBusquedaPorCodigoTipoDetalleDocumento, gridBagConstraintsTipoDetalleDocumento);

		gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetalleDocumento.gridy = 0;
		gridBagConstraintsTipoDetalleDocumento.gridx = 1;
		jPanelBusquedaPorCodigoTipoDetalleDocumento.add(jTextFieldcodigoBusquedaPorCodigoTipoDetalleDocumento, gridBagConstraintsTipoDetalleDocumento);

		gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetalleDocumento.gridy = 1;
		gridBagConstraintsTipoDetalleDocumento.gridx =1;
		jPanelBusquedaPorCodigoTipoDetalleDocumento.add(jButtonBusquedaPorCodigoTipoDetalleDocumento, gridBagConstraintsTipoDetalleDocumento);

		jTabbedPaneBusquedasTipoDetalleDocumento.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoDetalleDocumento);
		jTabbedPaneBusquedasTipoDetalleDocumento.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoDetalleDocumento= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoDetalleDocumento.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDetalleDocumento.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDetalleDocumento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoDetalleDocumento.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoDetalleDocumento.setLayout(gridaBagLayoutBusquedaPorNombreTipoDetalleDocumento);

		gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetalleDocumento.gridy = 0;
		gridBagConstraintsTipoDetalleDocumento.gridx = 0;
		jPanelBusquedaPorNombreTipoDetalleDocumento.add(jLabelnombreBusquedaPorNombreTipoDetalleDocumento, gridBagConstraintsTipoDetalleDocumento);

		gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetalleDocumento.gridy = 0;
		gridBagConstraintsTipoDetalleDocumento.gridx = 1;
		jPanelBusquedaPorNombreTipoDetalleDocumento.add(jTextAreanombreBusquedaPorNombreTipoDetalleDocumento, gridBagConstraintsTipoDetalleDocumento);

		gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDetalleDocumento.gridy = 1;
		gridBagConstraintsTipoDetalleDocumento.gridx =1;
		jPanelBusquedaPorNombreTipoDetalleDocumento.add(jButtonBusquedaPorNombreTipoDetalleDocumento, gridBagConstraintsTipoDetalleDocumento);

		jTabbedPaneBusquedasTipoDetalleDocumento.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoDetalleDocumento);
		jTabbedPaneBusquedasTipoDetalleDocumento.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDetalleDocumento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDetalleDocumento);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();						
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;		
			//this.gridBagConstraintsTipoDetalleDocumento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDetalleDocumento.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;		
		//this.gridBagConstraintsTipoDetalleDocumento.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoDetalleDocumento.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoDetalleDocumento);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;		
			this.gridBagConstraintsTipoDetalleDocumento.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoDetalleDocumento.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);								
		
		
		/*
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		*/		
		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDetalleDocumento.gridx =0;
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDetalleDocumento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
				
		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoDetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoDetalleDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDetalleDocumento = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoDetalleDocumento.setLayout(gridaBagLayoutBusquedasParametrosTipoDetalleDocumento);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoDetalleDocumento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDetalleDocumento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetalleDocumento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetalleDocumento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
			
			
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		
			
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoDetalleDocumento;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoDetalleDocumento() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoDetalleDocumento = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoDetalleDocumento.setName("jPanelReporteDinamicoTipoDetalleDocumento"); 
		
		this.jPanelReporteDinamicoTipoDetalleDocumento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDetalleDocumento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDetalleDocumento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoDetalleDocumento.setLayout(gridaBagLayoutReporteDinamicoTipoDetalleDocumento);
		
		
		this.jInternalFrameReporteDinamicoTipoDetalleDocumento= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoDetalleDocumento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDetalleDocumento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoDetalleDocumento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDetalleDocumento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDetalleDocumento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Documentos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoDetalleDocumento = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoDetalleDocumento.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDetalleDocumento.add(this.jLabelColumnasSelectReporteTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoDetalleDocumento = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoDetalleDocumento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoDetalleDocumento.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoDetalleDocumento.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDetalleDocumento.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDetalleDocumento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoDetalleDocumento=new JScrollPane(this.jListColumnasSelectReporteTipoDetalleDocumento);
			
			this.jScrollColumnasSelectReporteTipoDetalleDocumento.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDetalleDocumento.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDetalleDocumento.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDetalleDocumento.add(this.jListColumnasSelectReporteTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		this.jPanelReporteDinamicoTipoDetalleDocumento.add(this.jScrollColumnasSelectReporteTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoDetalleDocumento = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoDetalleDocumento.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDetalleDocumento.add(this.jLabelRelacionesSelectReporteTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoDetalleDocumento = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoDetalleDocumento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoDetalleDocumento.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoDetalleDocumento.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDetalleDocumento.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDetalleDocumento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoDetalleDocumento=new JScrollPane(this.jListRelacionesSelectReporteTipoDetalleDocumento);
			
			this.jScrollRelacionesSelectReporteTipoDetalleDocumento.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDetalleDocumento.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDetalleDocumento.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDetalleDocumento.add(this.jListRelacionesSelectReporteTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		this.jPanelReporteDinamicoTipoDetalleDocumento.add(this.jScrollRelacionesSelectReporteTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoDetalleDocumento = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoDetalleDocumento = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoDetalleDocumento = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoDetalleDocumento = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoDetalleDocumento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoDetalleDocumento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDetalleDocumento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDetalleDocumento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleDocumento = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleDocumento.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleDocumento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleDocumento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleDocumento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoDetalleDocumento = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoDetalleDocumento.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDetalleDocumento.add(this.jLabelGenerarExcelReporteDinamicoTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoDetalleDocumento = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoDetalleDocumento.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoDetalleDocumento,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoDetalleDocumento.setToolTipText("Generar EXCEL"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoDetalleDocumento.add(this.jButtonGenerarExcelReporteDinamicoTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetalleDocumento.add(this.jComboBoxTiposReportesDinamicoTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoDetalleDocumento = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoDetalleDocumento.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDetalleDocumento.add(this.jLabelTiposArchivoReporteDinamicoTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetalleDocumento.add(this.jComboBoxTiposArchivosReportesDinamicoTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoDetalleDocumento = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoDetalleDocumento.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoDetalleDocumento,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoDetalleDocumento.setToolTipText("Generar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetalleDocumento.add(this.jButtonGenerarReporteDinamicoTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoDetalleDocumento = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoDetalleDocumento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoDetalleDocumento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoDetalleDocumento.setToolTipText("Cancelar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDetalleDocumento.add(this.jButtonCerrarReporteDinamicoTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoDetalleDocumento = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoDetalleDocumento= new JScrollPane(jPanelReporteDinamicoTipoDetalleDocumento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoDetalleDocumento.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDetalleDocumento.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDetalleDocumento.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Documentos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoDetalleDocumento.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoDetalleDocumento);
		this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getContentPane().add(this.jScrollPanelReporteDinamicoTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoDetalleDocumento() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoDetalleDocumento = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoDetalleDocumento.setName("jPanelImportacionTipoDetalleDocumento"); 
		
		this.jPanelImportacionTipoDetalleDocumento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDetalleDocumento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDetalleDocumento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoDetalleDocumento.setLayout(gridaBagLayoutImportacionTipoDetalleDocumento);
		
		
		this.jInternalFrameImportacionTipoDetalleDocumento= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoDetalleDocumento= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoDetalleDocumento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDetalleDocumento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoDetalleDocumento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDetalleDocumento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDetalleDocumento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoDetalleDocumento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDetalleDocumento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDetalleDocumento.setResizable(true);
	    this.jInternalFrameImportacionTipoDetalleDocumento.setClosable(true);
	    this.jInternalFrameImportacionTipoDetalleDocumento.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoDetalleDocumento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDetalleDocumento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDetalleDocumento.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoDetalleDocumento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDetalleDocumento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDetalleDocumento.setResizable(true);
	    this.jInternalFrameImportacionTipoDetalleDocumento.setClosable(true);
	    this.jInternalFrameImportacionTipoDetalleDocumento.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoDetalleDocumento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDetalleDocumento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDetalleDocumento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Documentos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoDetalleDocumento = new JLabelMe();

		this.jLabelArchivoImportacionTipoDetalleDocumento.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDetalleDocumento.add(this.jLabelArchivoImportacionTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoDetalleDocumento = new JFileChooser();		
		this.jFileChooserImportacionTipoDetalleDocumento.setToolTipText("ESCOGER ARCHIVO"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoDetalleDocumento = new JButtonMe();
		this.jButtonAbrirImportacionTipoDetalleDocumento.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoDetalleDocumento,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoDetalleDocumento.setToolTipText("Generar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetalleDocumento.add(this.jButtonAbrirImportacionTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoDetalleDocumento = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoDetalleDocumento.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDetalleDocumento.add(this.jLabelPathArchivoImportacionTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoDetalleDocumento=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoDetalleDocumento.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDetalleDocumento.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDetalleDocumento.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetalleDocumento.add(this.jTextFieldPathArchivoImportacionTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoDetalleDocumento = new JButtonMe();
		this.jButtonGenerarImportacionTipoDetalleDocumento.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoDetalleDocumento,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoDetalleDocumento.setToolTipText("Generar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetalleDocumento.add(this.jButtonGenerarImportacionTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoDetalleDocumento = new JButtonMe();
		this.jButtonCerrarImportacionTipoDetalleDocumento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoDetalleDocumento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoDetalleDocumento.setToolTipText("Cancelar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDetalleDocumento.add(this.jButtonCerrarImportacionTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoDetalleDocumento = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoDetalleDocumento= new JScrollPane(jPanelImportacionTipoDetalleDocumento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoDetalleDocumento.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoDetalleDocumento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoDetalleDocumento.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoDetalleDocumento);
		this.jInternalFrameImportacionTipoDetalleDocumento.getContentPane().add(this.jScrollPanelImportacionTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoDetalleDocumento(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoDetalleDocumento = new JButtonMe();
			this.jButtonAbrirOrderByTipoDetalleDocumento.setText("Orden");
			this.jButtonAbrirOrderByTipoDetalleDocumento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDetalleDocumento,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoDetalleDocumento";
			inputMap = this.jButtonAbrirOrderByTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoDetalleDocumento"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoDetalleDocumento = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoDetalleDocumento.setName("jPanelOrderByTipoDetalleDocumento"); 
			
			this.jPanelOrderByTipoDetalleDocumento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDetalleDocumento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDetalleDocumento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoDetalleDocumento.setLayout(gridaBagLayoutOrderByTipoDetalleDocumento);
			
			
			this.jTableDatosTipoDetalleDocumentoOrderBy = new JTableMe();        
			this.jTableDatosTipoDetalleDocumentoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoDetalleDocumentoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoDetalleDocumentoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoDetalleDocumentoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoDetalleDocumentoOrderBy.setViewportView(this.jTableDatosTipoDetalleDocumentoOrderBy);
			this.jTableDatosTipoDetalleDocumentoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoDetalleDocumentoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoDetalleDocumento= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoDetalleDocumento= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoDetalleDocumento = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoDetalleDocumento= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoDetalleDocumento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoDetalleDocumento.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoDetalleDocumento.setTitle("Orden");
			this.jInternalFrameOrderByTipoDetalleDocumento.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoDetalleDocumento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoDetalleDocumento.setResizable(true);
			this.jInternalFrameOrderByTipoDetalleDocumento.setClosable(true);
			this.jInternalFrameOrderByTipoDetalleDocumento.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoDetalleDocumento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDetalleDocumento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDetalleDocumento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Documentos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoDetalleDocumento.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoDetalleDocumento.ipady =150;
				
			this.jPanelOrderByTipoDetalleDocumento.add(jScrollPanelDatosTipoDetalleDocumentoOrderBy, this.gridBagConstraintsTipoDetalleDocumento);//this.jTableDatosTipoDetalleDocumentoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoDetalleDocumento = new JButtonMe();
			this.jButtonCerrarOrderByTipoDetalleDocumento.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoDetalleDocumento,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoDetalleDocumento.setToolTipText("Cancelar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoDetalleDocumento.add(this.jButtonCerrarOrderByTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoDetalleDocumento = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoDetalleDocumento= new JScrollPane(jPanelOrderByTipoDetalleDocumento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoDetalleDocumento.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoDetalleDocumento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoDetalleDocumento.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoDetalleDocumento);
			
			this.jInternalFrameOrderByTipoDetalleDocumento.getContentPane().add(this.jScrollPanelOrderByTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);			
		
		} else {
			this.jButtonAbrirOrderByTipoDetalleDocumento = new JButtonMe();
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
			&& this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoDetalleDocumento.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoDetalleDocumento.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoDetalleDocumento.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoDetalleDocumento.getRowHeight();//TipoDetalleDocumentoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoDetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDetalleDocumento.isSelected()) {
					iHeightTable=TipoDetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoDetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDetalleDocumento.isSelected()) {
					iHeightTable=TipoDetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDetalleDocumentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoDetalleDocumento.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDetalleDocumento.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDetalleDocumento.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoDetalleDocumento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDetalleDocumento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDetalleDocumento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoDetalleDocumento!=null && this.jInternalFrameOrderByTipoDetalleDocumento.getjTableDatosOrderBy()!=null) {
			//if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoDetalleDocumento.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoDetalleDocumento.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoDetalleDocumento.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoDetalleDocumento.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoDetalleDocumento.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoDetalleDocumento.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoDetalleDocumento.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoDetalleDocumento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDetalleDocumento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDetalleDocumento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipodetalledocumentoLogic.getTipoDetalleDocumentos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodetalledocumentos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoDetalleDocumento> TraerTipoDetalleDocumentoBeans(List<TipoDetalleDocumento> tipodetalledocumentos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoDetalleDocumento tipodetalledocumento:tipodetalledocumentos) {
					
				if(!(TipoDetalleDocumentoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoDetalleDocumentoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipodetalledocumento.setsDetalleGeneralEntityReporte(TipoDetalleDocumentoConstantesFunciones.getTipoDetalleDocumentoDescripcion(tipodetalledocumento));
										
						
					
					

					if(tipodetalledocumento.getDetalleDocumentos()!=null && Funciones.existeClass(classes,DetalleDocumento.class)) {
						try{tipodetalledocumento.setdetalledocumentosDescripcionReporte(new JRBeanCollectionDataSource(DetalleDocumentoJInternalFrame.TraerDetalleDocumentoBeans(tipodetalledocumento.getDetalleDocumentos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipodetalledocumento.setsDetalleGeneralEntityReporte(tipodetalledocumento.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipodetalledocumentobeans.add(tipodetalledocumentobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipodetalledocumentos;
    }
	//PARA REPORTES FIN
}
