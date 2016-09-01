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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.NivelLineaConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class NivelLineaJInternalFrame extends NivelLineaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNivelLinea;
	
	protected JMenuBar jmenuBarNivelLinea;
	
	protected JMenu jmenuNivelLinea;
	protected JMenu jmenuDatosNivelLinea;
	protected JMenu jmenuArchivoNivelLinea;
	protected JMenu jmenuAccionesNivelLinea;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNivelLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNivelLinea;	
	protected GridBagConstraints gridBagConstraintsNivelLinea;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NivelLineaDetalleFormJInternalFrame jInternalFrameDetalleFormNivelLinea;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNivelLinea;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNivelLinea;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public NivelLineaSessionBean nivellineaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<NivelLinea> nivellineas;		
	public List<NivelLinea> nivellineasEliminados;	
	public List<NivelLinea> nivellineasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNivelLinea;		
	protected JButton jButtonAbrirOrderByNivelLinea;
	
	
	//protected JPanel jPanelOrderByNivelLinea;
	//public JScrollPane jScrollPanelOrderByNivelLinea;	
	//protected JButton jButtonCerrarOrderByNivelLinea;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NivelLineaLogic nivellineaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNivelLinea;
	public JScrollPane jScrollPanelDatosEdicionNivelLinea;
	public JScrollPane jScrollPanelDatosGeneralNivelLinea;
    
	
	
	//public JScrollPane jScrollPanelDatosNivelLineaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNivelLinea;
	//public JScrollPane jScrollPanelImportacionNivelLinea;
	
	
	
	protected JPanel jPanelAccionesNivelLinea;
	
    protected JPanel jPanelPaginacionNivelLinea;
    protected JPanel jPanelParametrosReportesNivelLinea;
	protected JPanel jPanelParametrosReportesAccionesNivelLinea;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1NivelLinea;
	protected JPanel jPanelParametrosAuxiliar2NivelLinea;
	protected JPanel jPanelParametrosAuxiliar3NivelLinea;
	protected JPanel jPanelParametrosAuxiliar4NivelLinea;
	//protected JPanel jPanelParametrosAuxiliar5NivelLinea;
	
	
	
	//protected JPanel jPanelReporteDinamicoNivelLinea;
	//protected JPanel jPanelImportacionNivelLinea;
	
	
	public JTable jTableDatosNivelLinea;
	
	
	
	//public JTable jTableDatosNivelLineaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNivelLinea;
	protected JButton jButtonDuplicarNivelLinea;
	protected JButton jButtonCopiarNivelLinea;
	protected JButton jButtonVerFormNivelLinea;
	protected JButton jButtonNuevoRelacionesNivelLinea;
	protected JButton jButtonModificarNivelLinea;
	
    protected JButton jButtonGuardarCambiosTablaNivelLinea;
	protected JButton jButtonCerrarNivelLinea;
	
	
	protected JButton jButtonRecargarInformacionNivelLinea;
	protected JButton jButtonProcesarInformacionNivelLinea;
	
	
	protected JButton jButtonAnterioresNivelLinea;
	protected JButton jButtonSiguientesNivelLinea;
	protected JButton jButtonNuevoGuardarCambiosNivelLinea;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNivelLinea;
	//protected JButton jButtonCerrarReporteDinamicoNivelLinea;
	//protected JButton jButtonGenerarExcelReporteDinamicoNivelLinea;	
	
	
	
	//protected JButton jButtonAbrirImportacionNivelLinea;
	//protected JButton jButtonGenerarImportacionNivelLinea;
	//protected JButton jButtonCerrarImportacionNivelLinea;
	//protected JFileChooser jFileChooserImportacionNivelLinea;
	//protected File fileImportacionNivelLinea;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNivelLinea;
	protected JButton jButtonDuplicarToolBarNivelLinea;
	protected JButton jButtonNuevoRelacionesToolBarNivelLinea;
	
	
	public JButton jButtonGuardarCambiosToolBarNivelLinea;
	protected JButton jButtonCopiarToolBarNivelLinea;
	protected JButton jButtonVerFormToolBarNivelLinea;
	public JButton jButtonGuardarCambiosTablaToolBarNivelLinea;
	protected JButton jButtonMostrarOcultarTablaToolBarNivelLinea;
	protected JButton jButtonCerrarToolBarNivelLinea;
	
	protected JButton jButtonRecargarInformacionToolBarNivelLinea;
	protected JButton jButtonProcesarInformacionToolBarNivelLinea;
	protected JButton jButtonAnterioresToolBarNivelLinea;
	protected JButton jButtonSiguientesToolBarNivelLinea;
	protected JButton jButtonNuevoGuardarCambiosToolBarNivelLinea;
	protected JButton jButtonAbrirOrderByToolBarNivelLinea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNivelLinea;
	protected JMenuItem jMenuItemDuplicarNivelLinea;
	protected JMenuItem jMenuItemNuevoRelacionesNivelLinea;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNivelLinea;
	protected JMenuItem jMenuItemCopiarNivelLinea;
	protected JMenuItem jMenuItemVerFormNivelLinea;
	protected JMenuItem jMenuItemGuardarCambiosTablaNivelLinea;
	protected JMenuItem jMenuItemCerrarNivelLinea;
	protected JMenuItem jMenuItemDetalleCerrarNivelLinea;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNivelLinea;
	protected JMenuItem jMenuItemDetalleMostarOcultarNivelLinea;
	
	protected JMenuItem jMenuItemRecargarInformacionNivelLinea;
	protected JMenuItem jMenuItemProcesarInformacionNivelLinea;
	protected JMenuItem jMenuItemAnterioresNivelLinea;
	protected JMenuItem jMenuItemSiguientesNivelLinea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNivelLinea;
	protected JMenuItem jMenuItemAbrirOrderByNivelLinea;
	protected JMenuItem jMenuItemMostrarOcultarNivelLinea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNivelLinea;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNivelLinea;
	protected JCheckBox jCheckBoxSeleccionadosNivelLinea;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNivelLinea;
	protected JCheckBox jCheckBoxConGraficoReporteNivelLinea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNivelLinea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNivelLinea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNivelLinea;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNivelLinea;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNivelLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNivelLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNivelLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNivelLinea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNivelLinea;
	protected JTextField jTextFieldValorCampoGeneralNivelLinea;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNivelLinea;
	//public JList<Reporte> jListColumnasSelectReporteNivelLinea;
	//public JScrollPane jScrollColumnasSelectReporteNivelLinea;
	
	//public JLabel jLabelRelacionesSelectReporteNivelLinea;
	//public JList<Reporte> jListRelacionesSelectReporteNivelLinea;
	//public JScrollPane jScrollRelacionesSelectReporteNivelLinea;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNivelLinea;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNivelLinea;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNivelLinea;
	//public JLabel jLabelTiposArchivoReporteDinamicoNivelLinea;
	
		
	//public JLabel jLabelArchivoImportacionNivelLinea;	
	//public JLabel jLabelPathArchivoImportacionNivelLinea;
	//protected JTextField jTextFieldPathArchivoImportacionNivelLinea;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNivelLinea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNivelLinea;
	
	//public JLabel jLabelColumnaCategoriaValorNivelLinea;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNivelLinea;
	
	//public JLabel jLabelColumnasValoresGraficoNivelLinea;
	//public JList<Reporte> jListColumnasValoresGraficoNivelLinea;
	//public JScrollPane jScrollColumnasValoresGraficoNivelLinea;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNivelLinea;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNivelLinea;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	public NivelLineaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("NivelLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelLineaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelLineaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelLineaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NivelLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNivelLinea)	{
		this.jButtonRecargarInformacionNivelLinea = jButtonRecargarInformacionNivelLinea;
	}
	
	public JButton getjButtonProcesarInformacionNivelLinea() {
		return this.jButtonProcesarInformacionNivelLinea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNivelLinea)	{
		this.jButtonProcesarInformacionNivelLinea = jButtonProcesarInformacionNivelLinea;
	}
	
	
	public JButton getjButtonRecargarInformacionNivelLinea() {
		return this.jButtonRecargarInformacionNivelLinea;
	}
	
	
	public List<NivelLinea> getnivellineas() {
		return this.nivellineas;
	}

	public void setnivellineas(List<NivelLinea> nivellineas) {
		this.nivellineas = nivellineas;
	}
	
	public List<NivelLinea> getnivellineasAux() {
		return this.nivellineasAux;
	}

	public void setnivellineasAux(List<NivelLinea> nivellineasAux) {
		this.nivellineasAux = nivellineasAux;
	}
	
	public List<NivelLinea> getnivellineasEliminados() {
		return this.nivellineasEliminados;
	}

	public void setNivelLineasEliminados(List<NivelLinea> nivellineasEliminados) {
		this.nivellineasEliminados = nivellineasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNivelLinea() {
		return jComboBoxTiposSeleccionarNivelLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNivelLinea(
			JComboBox jComboBoxTiposSeleccionarNivelLinea) {
		this.jComboBoxTiposSeleccionarNivelLinea = jComboBoxTiposSeleccionarNivelLinea;
	}
	
	public void setBorderResaltarTiposSeleccionarNivelLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNivelLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNivelLinea .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNivelLinea() {
		return jTextFieldValorCampoGeneralNivelLinea;
	}

	public void setjTextFieldValorCampoGeneralNivelLinea(
			JTextField jTextFieldValorCampoGeneralNivelLinea) {
		this.jTextFieldValorCampoGeneralNivelLinea = jTextFieldValorCampoGeneralNivelLinea;
	}

	public void setBorderResaltarValorCampoGeneralNivelLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelLinea.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNivelLinea .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNivelLinea() {
		return this.jCheckBoxSeleccionarTodosNivelLinea;
	}

	public void setjCheckBoxSeleccionarTodosNivelLinea(
			JCheckBox jCheckBoxSeleccionarTodosNivelLinea) {
		this.jCheckBoxSeleccionarTodosNivelLinea = jCheckBoxSeleccionarTodosNivelLinea;
	}

	public void setBorderResaltarSeleccionarTodosNivelLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelLinea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNivelLinea .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNivelLinea() {
		return this.jCheckBoxSeleccionadosNivelLinea;
	}

	public void setjCheckBoxSeleccionadosNivelLinea(
			JCheckBox jCheckBoxSeleccionadosNivelLinea) {
		this.jCheckBoxSeleccionadosNivelLinea = jCheckBoxSeleccionadosNivelLinea;
	}
	
	public void setBorderResaltarSeleccionadosNivelLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelLinea.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNivelLinea .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNivelLinea() {
		return this.jComboBoxTiposArchivosReportesNivelLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNivelLinea(
			JComboBox jComboBoxTiposArchivosReportesNivelLinea) {
		this.jComboBoxTiposArchivosReportesNivelLinea = jComboBoxTiposArchivosReportesNivelLinea;
	}

	public void setBorderResaltarTiposArchivosReportesNivelLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNivelLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNivelLinea() {
		return this.jComboBoxTiposReportesNivelLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNivelLinea(
			JComboBox jComboBoxTiposReportesNivelLinea) {
		this.jComboBoxTiposReportesNivelLinea = jComboBoxTiposReportesNivelLinea;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNivelLinea() {
	//	return jComboBoxTiposReportesDinamicoNivelLinea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNivelLinea(
	//		JComboBox jComboBoxTiposReportesDinamicoNivelLinea) {
	//	this.jComboBoxTiposReportesDinamicoNivelLinea = jComboBoxTiposReportesDinamicoNivelLinea;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNivelLinea() {
	//	return jComboBoxTiposArchivosReportesDinamicoNivelLinea;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNivelLinea(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNivelLinea) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNivelLinea = jComboBoxTiposArchivosReportesDinamicoNivelLinea;
	//}
	
	public void setBorderResaltarTiposReportesNivelLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNivelLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNivelLinea() {
		return this.jComboBoxTiposGraficosReportesNivelLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNivelLinea(
			JComboBox jComboBoxTiposGraficosReportesNivelLinea) {
		this.jComboBoxTiposGraficosReportesNivelLinea = jComboBoxTiposGraficosReportesNivelLinea;
	}
	
	public void setBorderResaltarTiposGraficosReportesNivelLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNivelLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNivelLinea() {
		return this.jComboBoxTiposPaginacionNivelLinea;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNivelLinea(
			JComboBox jComboBoxTiposPaginacionNivelLinea) {
		this.jComboBoxTiposPaginacionNivelLinea = jComboBoxTiposPaginacionNivelLinea;
	}
	
	public void setBorderResaltarTiposPaginacionNivelLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNivelLinea .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNivelLinea() {
		return this.jComboBoxTiposRelacionesNivelLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNivelLinea() {
		return this.jComboBoxTiposAccionesNivelLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNivelLinea(
			JComboBox jComboBoxTiposRelacionesNivelLinea) {
		this.jComboBoxTiposRelacionesNivelLinea = jComboBoxTiposRelacionesNivelLinea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNivelLinea(
			JComboBox jComboBoxTiposAccionesNivelLinea) {
		this.jComboBoxTiposAccionesNivelLinea = jComboBoxTiposAccionesNivelLinea;
	}
	
	public void setBorderResaltarTiposRelacionesNivelLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNivelLinea .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNivelLinea() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelLinea.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNivelLinea .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNivelLinea() {
	//	return jCheckBoxConGraficoDinamicoNivelLinea;
	//}

	//public void setjCheckBoxConGraficoDinamicoNivelLinea(
	//		JCheckBox jCheckBoxConGraficoDinamicoNivelLinea) {
	//	this.jCheckBoxConGraficoDinamicoNivelLinea = jCheckBoxConGraficoDinamicoNivelLinea;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNivelLinea() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNivelLinea.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNivelLinea .setBorder(borderResaltar);		
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
		this.nivellineaSessionBean=new NivelLineaSessionBean();
		
		this.nivellineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.nivellineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.nivellineaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NivelLineaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NivelLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NivelLineaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NivelLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NivelLineaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Nivel Linea MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
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
		
		NivelLineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("NivelLinea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNivelLinea= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNivelLinea,this.jTtoolBarNivelLinea,
							"nuevo","nuevo","Nuevo"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNivelLinea,this.jTtoolBarNivelLinea,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNivelLinea,this.jTtoolBarNivelLinea,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNivelLinea,this.jTtoolBarNivelLinea,
							"duplicar","duplicar","Duplicar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNivelLinea,this.jTtoolBarNivelLinea,
							"copiar","copiar","Copiar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNivelLinea,this.jTtoolBarNivelLinea,
							"ver_form","ver_form","Ver"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNivelLinea,this.jTtoolBarNivelLinea,
							"recargar","recargar","Recargar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNivelLinea,this.jTtoolBarNivelLinea,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNivelLinea,this.jTtoolBarNivelLinea,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNivelLinea,this.jTtoolBarNivelLinea,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNivelLinea,this.jTtoolBarNivelLinea,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNivelLinea,this.jTtoolBarNivelLinea,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNivelLinea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNivelLinea,this.jTtoolBarNivelLinea,
							"cerrar","cerrar","Salir"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNivelLinea=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNivelLinea;
			
				this.jButtonProcesarInformacionToolBarNivelLinea=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNivelLinea;
				
		//protected JButton jButtonModificarToolBarNivelLinea;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNivelLinea=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNivelLinea=new JMenuMe("General");
		this.jmenuArchivoNivelLinea=new JMenuMe("Archivo");
		this.jmenuAccionesNivelLinea=new JMenuMe("Acciones");
		this.jmenuDatosNivelLinea=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNivelLinea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNivelLinea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNivelLinea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNivelLinea= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNivelLinea.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNivelLinea,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNivelLinea= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNivelLinea.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNivelLinea,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNivelLinea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNivelLinea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNivelLinea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNivelLinea= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNivelLinea.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNivelLinea,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNivelLinea= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNivelLinea.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNivelLinea,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNivelLinea= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNivelLinea.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNivelLinea,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNivelLinea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNivelLinea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNivelLinea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNivelLinea= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNivelLinea.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNivelLinea,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNivelLinea= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNivelLinea.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNivelLinea,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNivelLinea= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNivelLinea.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNivelLinea,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNivelLinea= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNivelLinea.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNivelLinea,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNivelLinea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNivelLinea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNivelLinea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNivelLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNivelLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNivelLinea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNivelLinea= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNivelLinea.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNivelLinea,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNivelLinea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNivelLinea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNivelLinea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNivelLinea= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNivelLinea.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNivelLinea,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNivelLinea.add(this.jMenuItemCerrarNivelLinea);
			
			this.jmenuAccionesNivelLinea.add(this.jMenuItemNuevoNivelLinea);
			this.jmenuAccionesNivelLinea.add(this.jMenuItemNuevoGuardarCambiosNivelLinea);
			this.jmenuAccionesNivelLinea.add(this.jMenuItemNuevoRelacionesNivelLinea);
			this.jmenuAccionesNivelLinea.add(this.jMenuItemGuardarCambiosTablaNivelLinea);		
			this.jmenuAccionesNivelLinea.add(this.jMenuItemDuplicarNivelLinea);		
			this.jmenuAccionesNivelLinea.add(this.jMenuItemCopiarNivelLinea);		
			this.jmenuAccionesNivelLinea.add(this.jMenuItemVerFormNivelLinea);		
			
			this.jmenuDatosNivelLinea.add(this.jMenuItemRecargarInformacionNivelLinea);				
			this.jmenuDatosNivelLinea.add(this.jMenuItemAnterioresNivelLinea);				
			this.jmenuDatosNivelLinea.add(this.jMenuItemSiguientesNivelLinea);				
			this.jmenuDatosNivelLinea.add(this.jMenuItemAbrirOrderByNivelLinea);				
			this.jmenuDatosNivelLinea.add(this.jMenuItemMostrarOcultarNivelLinea);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNivelLinea.add(this.jMenuItemGuardarCambiosNivelLinea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNivelLinea.add(this.jmenuArchivoNivelLinea);		
			this.jmenuBarNivelLinea.add(this.jmenuAccionesNivelLinea);		
			this.jmenuBarNivelLinea.add(this.jmenuDatosNivelLinea);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNivelLinea);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNivelLinea() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleNivelLinea = new NivelLineaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Nivel Linea DATOS");
			this.jInternalFrameDetalleFormNivelLinea = new NivelLineaDetalleFormJInternalFrame(jDesktopPane,this.nivellineaSessionBean.getConGuardarRelaciones(),this.nivellineaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNivelLinea = null;//new NivelLineaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNivelLinea= new GridBagLayout();
		
		
		this.jTableDatosNivelLinea = new JTableMe();      
		
		String sToolTipNivelLinea="";
		sToolTipNivelLinea=NivelLineaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNivelLinea+="(Inventario.NivelLinea)";
		}
		
		if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
			sToolTipNivelLinea+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNivelLinea.setToolTipText(sToolTipNivelLinea);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNivelLinea);
		this.jTableDatosNivelLinea.setAutoCreateRowSorter(true);
		this.jTableDatosNivelLinea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNivelLinea.setRowSelectionAllowed(true);
		this.jTableDatosNivelLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNivelLinea,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNivelLinea = new JButtonMe();
		this.jButtonDuplicarNivelLinea = new JButtonMe();
		this.jButtonCopiarNivelLinea = new JButtonMe();
		this.jButtonVerFormNivelLinea = new JButtonMe();
		this.jButtonNuevoRelacionesNivelLinea = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNivelLinea = new JButtonMe();
		this.jButtonCerrarNivelLinea = new JButtonMe();
		
		this.jScrollPanelDatosNivelLinea = new JScrollPane();   
        this.jScrollPanelDatosGeneralNivelLinea = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNivelLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Nivel Linea";
		
		if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Lineas" + this.sPath));
		} else {
			this.jScrollPanelDatosNivelLinea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNivelLinea.setToolTipText("Acciones");
        this.jPanelAccionesNivelLinea.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoNivelLinea=new ReporteDinamicoJInternalFrame(NivelLineaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNivelLinea();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNivelLinea=new ImportacionJInternalFrame(NivelLineaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNivelLinea();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNivelLinea = new JButtonMe();
		
		this.jButtonAbrirOrderByNivelLinea.setText("Orden");
		this.jButtonAbrirOrderByNivelLinea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNivelLinea,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNivelLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNivelLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelLinea,false,this);
			
			//this.cargarOrderByNivelLinea(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNivelLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelLinea,true,this);
			
			//this.cargarOrderByNivelLinea(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNivelLinea.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosNivelLinea.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosNivelLinea.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosNivelLinea.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNivelLinea.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNivelLinea.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNivelLinea.setText("Nuevo");
		this.jButtonDuplicarNivelLinea.setText("Duplicar");
		this.jButtonCopiarNivelLinea.setText("Copiar");
		this.jButtonVerFormNivelLinea.setText("Ver");
		this.jButtonNuevoRelacionesNivelLinea.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNivelLinea.setText("Guardar");
		this.jButtonCerrarNivelLinea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNivelLinea,"nuevo_button","Nuevo",this.nivellineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNivelLinea,"duplicar_button","Duplicar",this.nivellineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNivelLinea,"copiar_button","Copiar",this.nivellineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNivelLinea,"ver_form","Ver",this.nivellineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNivelLinea,"nuevorelaciones_button","Nuevo Rel",this.nivellineaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNivelLinea,"guardarcambiostabla_button","Guardar",this.nivellineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNivelLinea,"cerrar_button","Salir",this.nivellineaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNivelLinea.setToolTipText("Nuevo"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNivelLinea.setToolTipText("Duplicar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNivelLinea.setToolTipText("Copiar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNivelLinea.setToolTipText("Ver"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNivelLinea.setToolTipText("Nuevo Rel"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNivelLinea.setToolTipText("Guardar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNivelLinea.setToolTipText("Salir"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNivelLinea";
		inputMap = this.jButtonNuevoNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNivelLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNivelLinea"));
		
		//DUPLICAR
		sMapKey = "DuplicarNivelLinea";
		inputMap = this.jButtonDuplicarNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNivelLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNivelLinea"));
		
		//COPIAR
		sMapKey = "CopiarNivelLinea";
		inputMap = this.jButtonCopiarNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNivelLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNivelLinea"));
		
		//VEr FORM
		sMapKey = "VerFormNivelLinea";
		inputMap = this.jButtonVerFormNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNivelLinea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNivelLinea"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNivelLinea";
		inputMap = this.jButtonNuevoRelacionesNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNivelLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNivelLinea"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNivelLinea";
		inputMap = this.jButtonModificarNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNivelLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNivelLinea"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNivelLinea";
		inputMap = this.jButtonCerrarNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNivelLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNivelLinea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNivelLinea";
		inputMap = this.jButtonGuardarCambiosTablaNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNivelLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNivelLinea"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNivelLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNivelLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNivelLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1NivelLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2NivelLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3NivelLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4NivelLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5NivelLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNivelLinea.setName("jPanelParametrosReportesNivelLinea"); 
		
		this.jPanelParametrosReportesAccionesNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNivelLinea.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNivelLinea.setName("jPanelParametrosReportesAccionesNivelLinea"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNivelLinea, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNivelLinea = new JButtonMe();
		this.jButtonRecargarInformacionNivelLinea.setText("Recargar");
		this.jButtonRecargarInformacionNivelLinea.setToolTipText("Recargar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNivelLinea,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionNivelLinea = new JButtonMe();
		this.jButtonProcesarInformacionNivelLinea.setText("Procesar");
		this.jButtonProcesarInformacionNivelLinea.setToolTipText("Procesar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNivelLinea.setVisible(false);
			
		this.jButtonProcesarInformacionNivelLinea.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNivelLinea.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNivelLinea.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNivelLinea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNivelLinea.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNivelLinea.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNivelLinea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNivelLinea.setText("TIPO");       
		this.jComboBoxTiposReportesNivelLinea.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNivelLinea = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNivelLinea.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNivelLinea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNivelLinea = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNivelLinea.setText("Paginacion");
		this.jComboBoxTiposPaginacionNivelLinea.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNivelLinea = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNivelLinea.setText("Accion");
		this.jComboBoxTiposRelacionesNivelLinea.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNivelLinea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNivelLinea.setText("Accion");
		this.jComboBoxTiposAccionesNivelLinea.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNivelLinea = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNivelLinea.setText("Accion");
		this.jComboBoxTiposSeleccionarNivelLinea.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNivelLinea=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNivelLinea.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNivelLinea.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNivelLinea.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNivelLinea = new JLabelMe();
		
		this.jLabelAccionesNivelLinea.setText("Acciones");		
		this.jLabelAccionesNivelLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNivelLinea = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNivelLinea.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNivelLinea.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNivelLinea = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNivelLinea.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNivelLinea.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNivelLinea = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNivelLinea.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNivelLinea.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNivelLinea = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNivelLinea.setText("Graf.");
		this.jCheckBoxConGraficoReporteNivelLinea.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNivelLinea = new JButtonMe();
		//this.jButtonAnterioresNivelLinea.setText("<<");
        this.jButtonAnterioresNivelLinea.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNivelLinea,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNivelLinea = new JButtonMe();
		//this.jButtonSiguientesNivelLinea.setText(">>");
        this.jButtonSiguientesNivelLinea.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNivelLinea,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNivelLinea = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNivelLinea.setText("Nue");
        this.jButtonNuevoGuardarCambiosNivelLinea.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNivelLinea,"nuevoguardarcambios_button","Nue",this.nivellineaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNivelLinea";
		inputMap = this.jButtonNuevoGuardarCambiosNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNivelLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNivelLinea"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNivelLinea";
		inputMap = this.jButtonRecargarInformacionNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNivelLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNivelLinea"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNivelLinea";
		inputMap = this.jButtonSiguientesNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNivelLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNivelLinea"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNivelLinea";
		inputMap = this.jButtonAnterioresNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNivelLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNivelLinea"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNivelLinea();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNivelLinea.setMinimumSize(new Dimension(this.getWidth(),NivelLineaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NivelLineaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNivelLinea.setMaximumSize(new Dimension(this.getWidth(),NivelLineaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NivelLineaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNivelLinea.setPreferredSize(new Dimension(this.getWidth(),NivelLineaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NivelLineaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNivelLinea = new GridBagLayout();

			this.jPanelPaginacionNivelLinea.setLayout(gridaBagLayoutPaginacionNivelLinea);						
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.gridy = 0;
			this.gridBagConstraintsNivelLinea.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNivelLinea.add(this.jButtonAnterioresNivelLinea, this.gridBagConstraintsNivelLinea);
					
						
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNivelLinea.gridy = 0;
			
			this.jPanelPaginacionNivelLinea.add(this.jButtonNuevoGuardarCambiosNivelLinea, this.gridBagConstraintsNivelLinea);
						
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNivelLinea.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNivelLinea.gridy = 0;
			this.jPanelPaginacionNivelLinea.add(this.jButtonSiguientesNivelLinea, this.gridBagConstraintsNivelLinea);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.gridy = 1;
			this.gridBagConstraintsNivelLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelLinea.add(this.jButtonNuevoNivelLinea, this.gridBagConstraintsNivelLinea);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsNivelLinea = new GridBagConstraints();
				this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNivelLinea.gridy = 1;
				this.gridBagConstraintsNivelLinea.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionNivelLinea.add(this.jButtonNuevoRelacionesNivelLinea, this.gridBagConstraintsNivelLinea);
			}
			
			
			if(!this.nivellineaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNivelLinea = new GridBagConstraints();
				this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNivelLinea.gridy = 1;
				this.gridBagConstraintsNivelLinea.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionNivelLinea.add(this.jButtonGuardarCambiosTablaNivelLinea, this.gridBagConstraintsNivelLinea);
			}
			
			
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.gridy = 1;
			this.gridBagConstraintsNivelLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelLinea.add(this.jButtonDuplicarNivelLinea, this.gridBagConstraintsNivelLinea);
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.gridy = 1;
			this.gridBagConstraintsNivelLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelLinea.add(this.jButtonCopiarNivelLinea, this.gridBagConstraintsNivelLinea);
		
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.gridy = 1;
			this.gridBagConstraintsNivelLinea.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelLinea.add(this.jButtonVerFormNivelLinea, this.gridBagConstraintsNivelLinea);
		
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.gridy = 1;
			this.gridBagConstraintsNivelLinea.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNivelLinea.add(this.jButtonCerrarNivelLinea, this.gridBagConstraintsNivelLinea);
		
		
		
		this.jButtonRecargarInformacionNivelLinea.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNivelLinea.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNivelLinea.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNivelLinea.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNivelLinea.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNivelLinea.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNivelLinea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNivelLinea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNivelLinea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNivelLinea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNivelLinea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNivelLinea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNivelLinea.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNivelLinea.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNivelLinea.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNivelLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNivelLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNivelLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNivelLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNivelLinea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNivelLinea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNivelLinea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNivelLinea.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNivelLinea.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNivelLinea.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNivelLinea.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNivelLinea.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNivelLinea.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNivelLinea.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNivelLinea.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNivelLinea.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNivelLinea.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNivelLinea.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNivelLinea.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNivelLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNivelLinea = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1NivelLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2NivelLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3NivelLinea = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4NivelLinea = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNivelLinea.setLayout(gridaBagParametrosReportesNivelLinea);
			this.jPanelParametrosReportesAccionesNivelLinea.setLayout(gridaBagParametrosReportesAccionesNivelLinea);
			
			
			this.jPanelParametrosAuxiliar1NivelLinea.setLayout(gridaBagParametrosAuxiliar1NivelLinea);
			this.jPanelParametrosAuxiliar2NivelLinea.setLayout(gridaBagParametrosAuxiliar2NivelLinea);
			this.jPanelParametrosAuxiliar3NivelLinea.setLayout(gridaBagParametrosAuxiliar3NivelLinea);
			this.jPanelParametrosAuxiliar4NivelLinea.setLayout(gridaBagParametrosAuxiliar4NivelLinea);
			//this.jPanelParametrosAuxiliar5NivelLinea.setLayout(gridaBagParametrosAuxiliar2NivelLinea);			
			
			
			
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNivelLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelLinea.add(this.jButtonRecargarInformacionNivelLinea, this.gridBagConstraintsNivelLinea);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelLinea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NivelLinea.add(this.jComboBoxTiposPaginacionNivelLinea, this.gridBagConstraintsNivelLinea);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelLinea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NivelLinea.add(this.jCheckBoxConAltoMaximoTablaNivelLinea, this.gridBagConstraintsNivelLinea);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelLinea.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NivelLinea.add(this.jComboBoxTiposArchivosReportesNivelLinea, this.gridBagConstraintsNivelLinea);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelLinea.add(this.jPanelParametrosAuxiliar1NivelLinea, this.gridBagConstraintsNivelLinea);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNivelLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4NivelLinea.add(this.jComboBoxTiposReportesNivelLinea, this.gridBagConstraintsNivelLinea);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelLinea.add(this.jPanelParametrosAuxiliar4NivelLinea, this.gridBagConstraintsNivelLinea);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelLinea.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelLinea.add(this.jComboBoxTiposReportesNivelLinea, this.gridBagConstraintsNivelLinea);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelLinea.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNivelLinea.add(this.jCheckBoxGenerarReporteNivelLinea, this.gridBagConstraintsNivelLinea);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelLinea.add(this.jPanelParametrosAuxiliar2NivelLinea, this.gridBagConstraintsNivelLinea);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNivelLinea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNivelLinea.add(this.jLabelAccionesNivelLinea, this.gridBagConstraintsNivelLinea);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsNivelLinea = new GridBagConstraints();
				this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsNivelLinea.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesNivelLinea.add(this.jButtonAbrirOrderByNivelLinea, this.gridBagConstraintsNivelLinea);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelLinea.add(this.jComboBoxTiposSeleccionarNivelLinea, this.gridBagConstraintsNivelLinea);			
			
			
			/*
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNivelLinea.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNivelLinea.add(this.jCheckBoxSeleccionarTodosNivelLinea, this.gridBagConstraintsNivelLinea);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNivelLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NivelLinea.add(this.jCheckBoxSeleccionarTodosNivelLinea, this.gridBagConstraintsNivelLinea);															
				
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNivelLinea.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NivelLinea.add(this.jCheckBoxSeleccionadosNivelLinea, this.gridBagConstraintsNivelLinea);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelLinea.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelLinea.add(this.jPanelParametrosAuxiliar3NivelLinea, this.gridBagConstraintsNivelLinea);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelLinea.add(this.jComboBoxTiposRelacionesNivelLinea, this.gridBagConstraintsNivelLinea);
				
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelLinea.add(this.jComboBoxTiposAccionesNivelLinea, this.gridBagConstraintsNivelLinea);
	
				
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelLinea.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelLinea.add(this.jTextFieldValorCampoGeneralNivelLinea, this.gridBagConstraintsNivelLinea);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNivelLinea = new GridBagLayout();

			this.jScrollPanelDatosNivelLinea.setLayout(gridaBagLayoutDatosNivelLinea);
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.gridy = 0;
			this.gridBagConstraintsNivelLinea.gridx = 0;
			
			this.jScrollPanelDatosNivelLinea.add(this.jTableDatosNivelLinea, this.gridBagConstraintsNivelLinea);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNivelLinea.setViewportView(this.jTableDatosNivelLinea);
		this.jTableDatosNivelLinea.setFillsViewportHeight(true);
		this.jTableDatosNivelLinea.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNivelLinea= new GridBagLayout();
		this.jPanelAccionesNivelLinea.setLayout(gridaBagLayoutAccionesNivelLinea);
		
		
		/*	
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelLinea.gridy = 0;
		this.gridBagConstraintsNivelLinea.gridx = 0;
			
		this.jPanelAccionesNivelLinea.add(this.jButtonNuevoNivelLinea, this.gridBagConstraintsNivelLinea);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNivelLinea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNivelLinea);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.nivellineaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();						
			this.gridBagConstraintsNivelLinea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNivelLinea.gridx = 0;		
			//this.gridBagConstraintsNivelLinea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNivelLinea.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNivelLinea, this.gridBagConstraintsNivelLinea);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNivelLinea.gridx = 0;		
		//this.gridBagConstraintsNivelLinea.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelLinea.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNivelLinea.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNivelLinea);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelLinea.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNivelLinea, this.gridBagConstraintsNivelLinea);								
		
		
		/*
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelLinea.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNivelLinea, this.gridBagConstraintsNivelLinea);
		*/		
		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNivelLinea.gridx =0;
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNivelLinea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNivelLinea, this.gridBagConstraintsNivelLinea);
				
		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelLinea.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNivelLinea, this.gridBagConstraintsNivelLinea);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(NivelLineaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNivelLinea= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNivelLinea = new GridBagLayout();
			this.jPanelBusquedasParametrosNivelLinea.setLayout(gridaBagLayoutBusquedasParametrosNivelLinea);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNivelLinea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNivelLinea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelLinea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelLinea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNivelLinea, this.gridBagConstraintsNivelLinea);
			
			
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelLinea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNivelLinea, this.gridBagConstraintsNivelLinea);
		
			
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNivelLinea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNivelLinea, this.gridBagConstraintsNivelLinea);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNivelLinea;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNivelLinea() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNivelLinea = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNivelLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNivelLinea.setName("jPanelReporteDinamicoNivelLinea"); 
		
		this.jPanelReporteDinamicoNivelLinea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNivelLinea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNivelLinea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNivelLinea.setLayout(gridaBagLayoutReporteDinamicoNivelLinea);
		
		
		this.jInternalFrameReporteDinamicoNivelLinea= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNivelLinea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNivelLinea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNivelLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNivelLinea.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNivelLinea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNivelLinea.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNivelLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNivelLinea.setResizable(true);
	    this.jInternalFrameReporteDinamicoNivelLinea.setClosable(true);
	    this.jInternalFrameReporteDinamicoNivelLinea.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNivelLinea.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNivelLinea.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNivelLinea.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Lineas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNivelLinea = new JLabelMe();

		this.jLabelColumnasSelectReporteNivelLinea.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNivelLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNivelLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNivelLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelLinea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNivelLinea.add(this.jLabelColumnasSelectReporteNivelLinea, this.gridBagConstraintsNivelLinea);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNivelLinea = new JList<Reporte>();
		this.jListColumnasSelectReporteNivelLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNivelLinea.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNivelLinea.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNivelLinea.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNivelLinea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNivelLinea=new JScrollPane(this.jListColumnasSelectReporteNivelLinea);
			
			this.jScrollColumnasSelectReporteNivelLinea.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNivelLinea.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNivelLinea.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelLinea.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNivelLinea.add(this.jListColumnasSelectReporteNivelLinea, this.gridBagConstraintsNivelLinea);
		this.jPanelReporteDinamicoNivelLinea.add(this.jScrollColumnasSelectReporteNivelLinea, this.gridBagConstraintsNivelLinea);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNivelLinea = new JLabelMe();

		this.jLabelRelacionesSelectReporteNivelLinea.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNivelLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNivelLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNivelLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelLinea.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNivelLinea.add(this.jLabelRelacionesSelectReporteNivelLinea, this.gridBagConstraintsNivelLinea);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNivelLinea = new JList<Reporte>();
		this.jListRelacionesSelectReporteNivelLinea.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNivelLinea.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNivelLinea.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNivelLinea.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNivelLinea.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNivelLinea=new JScrollPane(this.jListRelacionesSelectReporteNivelLinea);
			
			this.jScrollRelacionesSelectReporteNivelLinea.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNivelLinea.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNivelLinea.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelLinea.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNivelLinea.add(this.jListRelacionesSelectReporteNivelLinea, this.gridBagConstraintsNivelLinea);
		this.jPanelReporteDinamicoNivelLinea.add(this.jScrollRelacionesSelectReporteNivelLinea, this.gridBagConstraintsNivelLinea);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoNivelLinea = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNivelLinea = new JComboBoxMe();
		this.jListColumnasValoresGraficoNivelLinea = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNivelLinea = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNivelLinea.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNivelLinea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNivelLinea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNivelLinea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNivelLinea = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNivelLinea.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNivelLinea.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNivelLinea.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNivelLinea.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNivelLinea = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNivelLinea.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNivelLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNivelLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNivelLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNivelLinea.add(this.jLabelGenerarExcelReporteDinamicoNivelLinea, this.gridBagConstraintsNivelLinea);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNivelLinea = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNivelLinea.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNivelLinea,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNivelLinea.setToolTipText("Generar EXCEL"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		//this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNivelLinea.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNivelLinea.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNivelLinea.add(this.jButtonGenerarExcelReporteDinamicoNivelLinea, this.gridBagConstraintsNivelLinea);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelLinea.add(this.jComboBoxTiposReportesDinamicoNivelLinea, this.gridBagConstraintsNivelLinea);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNivelLinea = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNivelLinea.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNivelLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNivelLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNivelLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelLinea.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNivelLinea.add(this.jLabelTiposArchivoReporteDinamicoNivelLinea, this.gridBagConstraintsNivelLinea);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelLinea.add(this.jComboBoxTiposArchivosReportesDinamicoNivelLinea, this.gridBagConstraintsNivelLinea);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNivelLinea = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNivelLinea.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNivelLinea,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNivelLinea.setToolTipText("Generar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelLinea.add(this.jButtonGenerarReporteDinamicoNivelLinea, this.gridBagConstraintsNivelLinea);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNivelLinea = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNivelLinea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNivelLinea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNivelLinea.setToolTipText("Cancelar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelLinea.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelLinea.add(this.jButtonCerrarReporteDinamicoNivelLinea, this.gridBagConstraintsNivelLinea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNivelLinea = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNivelLinea= new JScrollPane(jPanelReporteDinamicoNivelLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNivelLinea.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNivelLinea.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNivelLinea.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Lineas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNivelLinea.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNivelLinea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNivelLinea.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNivelLinea);
		this.jInternalFrameReporteDinamicoNivelLinea.getContentPane().add(this.jScrollPanelReporteDinamicoNivelLinea, this.gridBagConstraintsNivelLinea);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNivelLinea() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNivelLinea = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNivelLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNivelLinea.setName("jPanelImportacionNivelLinea"); 
		
		this.jPanelImportacionNivelLinea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNivelLinea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNivelLinea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNivelLinea.setLayout(gridaBagLayoutImportacionNivelLinea);
		
		
		this.jInternalFrameImportacionNivelLinea= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNivelLinea= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNivelLinea = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNivelLinea= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNivelLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNivelLinea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNivelLinea.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNivelLinea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNivelLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNivelLinea.setResizable(true);
	    this.jInternalFrameImportacionNivelLinea.setClosable(true);
	    this.jInternalFrameImportacionNivelLinea.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNivelLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNivelLinea.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNivelLinea.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNivelLinea.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNivelLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNivelLinea.setResizable(true);
	    this.jInternalFrameImportacionNivelLinea.setClosable(true);
	    this.jInternalFrameImportacionNivelLinea.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNivelLinea.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNivelLinea.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNivelLinea.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Lineas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNivelLinea = new JLabelMe();

		this.jLabelArchivoImportacionNivelLinea.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNivelLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNivelLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNivelLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYImportacion;		
		this.gridBagConstraintsNivelLinea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNivelLinea.add(this.jLabelArchivoImportacionNivelLinea, this.gridBagConstraintsNivelLinea);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNivelLinea = new JFileChooser();		
		this.jFileChooserImportacionNivelLinea.setToolTipText("ESCOGER ARCHIVO"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNivelLinea = new JButtonMe();
		this.jButtonAbrirImportacionNivelLinea.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNivelLinea,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNivelLinea.setToolTipText("Generar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelLinea.add(this.jButtonAbrirImportacionNivelLinea, this.gridBagConstraintsNivelLinea);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNivelLinea = new JLabelMe();

		this.jLabelPathArchivoImportacionNivelLinea.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNivelLinea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNivelLinea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNivelLinea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYImportacion;		
		this.gridBagConstraintsNivelLinea.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNivelLinea.add(this.jLabelPathArchivoImportacionNivelLinea, this.gridBagConstraintsNivelLinea);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNivelLinea=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNivelLinea.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNivelLinea.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNivelLinea.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelLinea.add(this.jTextFieldPathArchivoImportacionNivelLinea, this.gridBagConstraintsNivelLinea);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNivelLinea = new JButtonMe();
		this.jButtonGenerarImportacionNivelLinea.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNivelLinea,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNivelLinea.setToolTipText("Generar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelLinea.add(this.jButtonGenerarImportacionNivelLinea, this.gridBagConstraintsNivelLinea);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNivelLinea = new JButtonMe();
		this.jButtonCerrarImportacionNivelLinea.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNivelLinea,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNivelLinea.setToolTipText("Cancelar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelLinea.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelLinea.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelLinea.add(this.jButtonCerrarImportacionNivelLinea, this.gridBagConstraintsNivelLinea);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNivelLinea = new GridBagLayout();
		
		this.jScrollPanelImportacionNivelLinea= new JScrollPane(jPanelImportacionNivelLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNivelLinea = new GridBagConstraints();
		this.gridBagConstraintsNivelLinea.gridy =iPosYImportacion;
		this.gridBagConstraintsNivelLinea.gridx =iPosXImportacion;
		this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNivelLinea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNivelLinea.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNivelLinea);
		this.jInternalFrameImportacionNivelLinea.getContentPane().add(this.jScrollPanelImportacionNivelLinea, this.gridBagConstraintsNivelLinea);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNivelLinea(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNivelLinea = new JButtonMe();
			this.jButtonAbrirOrderByNivelLinea.setText("Orden");
			this.jButtonAbrirOrderByNivelLinea.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNivelLinea,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNivelLinea";
			inputMap = this.jButtonAbrirOrderByNivelLinea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNivelLinea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNivelLinea"));
		
		
			GridBagLayout gridaBagLayoutOrderByNivelLinea = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNivelLinea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNivelLinea.setName("jPanelOrderByNivelLinea"); 
			
			this.jPanelOrderByNivelLinea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNivelLinea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNivelLinea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNivelLinea.setLayout(gridaBagLayoutOrderByNivelLinea);
			
			
			this.jTableDatosNivelLineaOrderBy = new JTableMe();        
			this.jTableDatosNivelLineaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNivelLineaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNivelLineaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNivelLineaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNivelLineaOrderBy.setViewportView(this.jTableDatosNivelLineaOrderBy);
			this.jTableDatosNivelLineaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNivelLineaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNivelLinea= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNivelLinea= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNivelLinea = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNivelLinea= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNivelLinea.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNivelLinea.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNivelLinea.setTitle("Orden");
			this.jInternalFrameOrderByNivelLinea.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNivelLinea.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNivelLinea.setResizable(true);
			this.jInternalFrameOrderByNivelLinea.setClosable(true);
			this.jInternalFrameOrderByNivelLinea.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNivelLinea.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNivelLinea.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNivelLinea.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNivelLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Lineas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNivelLinea.gridx =iPosXOrderBy;
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNivelLinea.ipady =150;
				
			this.jPanelOrderByNivelLinea.add(jScrollPanelDatosNivelLineaOrderBy, this.gridBagConstraintsNivelLinea);//this.jTableDatosNivelLineaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNivelLinea = new JButtonMe();
			this.jButtonCerrarOrderByNivelLinea.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNivelLinea,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNivelLinea.setToolTipText("Cancelar"+" "+NivelLineaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNivelLinea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelLinea.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNivelLinea.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNivelLinea.add(this.jButtonCerrarOrderByNivelLinea, this.gridBagConstraintsNivelLinea);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNivelLinea = new GridBagLayout();
			
			this.jScrollPanelOrderByNivelLinea= new JScrollPane(jPanelOrderByNivelLinea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNivelLinea = new GridBagConstraints();
			this.gridBagConstraintsNivelLinea.gridy =iPosYOrderBy;
			this.gridBagConstraintsNivelLinea.gridx =iPosXOrderBy;
			this.gridBagConstraintsNivelLinea.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNivelLinea.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNivelLinea.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNivelLinea);
			
			this.jInternalFrameOrderByNivelLinea.getContentPane().add(this.jScrollPanelOrderByNivelLinea, this.gridBagConstraintsNivelLinea);			
		
		} else {
			this.jButtonAbrirOrderByNivelLinea = new JButtonMe();
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
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.nivellineaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNivelLinea.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNivelLinea.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNivelLinea.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosNivelLinea.getRowHeight();//NivelLineaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NivelLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNivelLinea.isSelected()) {
					iHeightTable=NivelLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NivelLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NivelLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NivelLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNivelLinea.isSelected()) {
					iHeightTable=NivelLineaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NivelLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NivelLineaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNivelLinea.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNivelLinea.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNivelLinea.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNivelLinea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNivelLinea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNivelLinea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNivelLinea!=null && this.jInternalFrameOrderByNivelLinea.getjTableDatosOrderBy()!=null) {
			//if(!this.nivellineaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNivelLinea.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNivelLinea.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNivelLinea.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNivelLinea.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNivelLinea.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNivelLinea.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNivelLinea.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNivelLinea.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNivelLinea.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNivelLinea.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=nivellineaLogic.getNivelLineas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=nivellineas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<NivelLinea> TraerNivelLineaBeans(List<NivelLinea> nivellineas,ArrayList<Classe> classes)throws Exception {
		try {
			for(NivelLinea nivellinea:nivellineas) {
					
				if(!(NivelLineaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NivelLineaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					nivellinea.setsDetalleGeneralEntityReporte(NivelLineaConstantesFunciones.getNivelLineaDescripcion(nivellinea));
										
						
					
					

					if(nivellinea.getLineas()!=null && Funciones.existeClass(classes,Linea.class)) {
						try{nivellinea.setlineasDescripcionReporte(new JRBeanCollectionDataSource(LineaJInternalFrame.TraerLineaBeans(nivellinea.getLineas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(nivellinea.getComisionConfigs()!=null && Funciones.existeClass(classes,ComisionConfig.class)) {
						try{nivellinea.setcomisionconfigsDescripcionReporte(new JRBeanCollectionDataSource(ComisionConfigJInternalFrame.TraerComisionConfigBeans(nivellinea.getComisionConfigs(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//nivellinea.setsDetalleGeneralEntityReporte(nivellinea.getsDetalleGeneralEntityReporte());
										
				}
				
				//nivellineabeans.add(nivellineabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return nivellineas;
    }
	//PARA REPORTES FIN
}
