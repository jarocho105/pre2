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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.inventario.util.ImpuestoInvenConstantesFunciones;

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
public class ImpuestoInvenJInternalFrame extends ImpuestoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarImpuestoInven;
	
	protected JMenuBar jmenuBarImpuestoInven;
	
	protected JMenu jmenuImpuestoInven;
	protected JMenu jmenuDatosImpuestoInven;
	protected JMenu jmenuArchivoImpuestoInven;
	protected JMenu jmenuAccionesImpuestoInven;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutImpuestoInven;	
	protected GridBagConstraints gridBagConstraintsImpuestoInven;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ImpuestoInvenDetalleFormJInternalFrame jInternalFrameDetalleFormImpuestoInven;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoImpuestoInven;	
	protected ImportacionJInternalFrame jInternalFrameImportacionImpuestoInven;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ImpuestoInvenSessionBean impuestoinvenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ImpuestoInven> impuestoinvens;		
	public List<ImpuestoInven> impuestoinvensEliminados;	
	public List<ImpuestoInven> impuestoinvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByImpuestoInven;		
	protected JButton jButtonAbrirOrderByImpuestoInven;
	
	
	//protected JPanel jPanelOrderByImpuestoInven;
	//public JScrollPane jScrollPanelOrderByImpuestoInven;	
	//protected JButton jButtonCerrarOrderByImpuestoInven;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ImpuestoInvenLogic impuestoinvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosImpuestoInven;
	public JScrollPane jScrollPanelDatosEdicionImpuestoInven;
	public JScrollPane jScrollPanelDatosGeneralImpuestoInven;
    
	
	
	//public JScrollPane jScrollPanelDatosImpuestoInvenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoImpuestoInven;
	//public JScrollPane jScrollPanelImportacionImpuestoInven;
	
	
	
	protected JPanel jPanelAccionesImpuestoInven;
	
    protected JPanel jPanelPaginacionImpuestoInven;
    protected JPanel jPanelParametrosReportesImpuestoInven;
	protected JPanel jPanelParametrosReportesAccionesImpuestoInven;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ImpuestoInven;
	protected JPanel jPanelParametrosAuxiliar2ImpuestoInven;
	protected JPanel jPanelParametrosAuxiliar3ImpuestoInven;
	protected JPanel jPanelParametrosAuxiliar4ImpuestoInven;
	//protected JPanel jPanelParametrosAuxiliar5ImpuestoInven;
	
	
	
	//protected JPanel jPanelReporteDinamicoImpuestoInven;
	//protected JPanel jPanelImportacionImpuestoInven;
	
	
	public JTable jTableDatosImpuestoInven;
	
	
	
	//public JTable jTableDatosImpuestoInvenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoImpuestoInven;
	protected JButton jButtonDuplicarImpuestoInven;
	protected JButton jButtonCopiarImpuestoInven;
	protected JButton jButtonVerFormImpuestoInven;
	protected JButton jButtonNuevoRelacionesImpuestoInven;
	protected JButton jButtonModificarImpuestoInven;
	
    protected JButton jButtonGuardarCambiosTablaImpuestoInven;
	protected JButton jButtonCerrarImpuestoInven;
	
	
	protected JButton jButtonRecargarInformacionImpuestoInven;
	protected JButton jButtonProcesarInformacionImpuestoInven;
	
	
	protected JButton jButtonAnterioresImpuestoInven;
	protected JButton jButtonSiguientesImpuestoInven;
	protected JButton jButtonNuevoGuardarCambiosImpuestoInven;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoImpuestoInven;
	//protected JButton jButtonCerrarReporteDinamicoImpuestoInven;
	//protected JButton jButtonGenerarExcelReporteDinamicoImpuestoInven;	
	
	
	
	//protected JButton jButtonAbrirImportacionImpuestoInven;
	//protected JButton jButtonGenerarImportacionImpuestoInven;
	//protected JButton jButtonCerrarImportacionImpuestoInven;
	//protected JFileChooser jFileChooserImportacionImpuestoInven;
	//protected File fileImportacionImpuestoInven;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarImpuestoInven;
	protected JButton jButtonDuplicarToolBarImpuestoInven;
	protected JButton jButtonNuevoRelacionesToolBarImpuestoInven;
	
	
	public JButton jButtonGuardarCambiosToolBarImpuestoInven;
	protected JButton jButtonCopiarToolBarImpuestoInven;
	protected JButton jButtonVerFormToolBarImpuestoInven;
	public JButton jButtonGuardarCambiosTablaToolBarImpuestoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarImpuestoInven;
	protected JButton jButtonCerrarToolBarImpuestoInven;
	
	protected JButton jButtonRecargarInformacionToolBarImpuestoInven;
	protected JButton jButtonProcesarInformacionToolBarImpuestoInven;
	protected JButton jButtonAnterioresToolBarImpuestoInven;
	protected JButton jButtonSiguientesToolBarImpuestoInven;
	protected JButton jButtonNuevoGuardarCambiosToolBarImpuestoInven;
	protected JButton jButtonAbrirOrderByToolBarImpuestoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoImpuestoInven;
	protected JMenuItem jMenuItemDuplicarImpuestoInven;
	protected JMenuItem jMenuItemNuevoRelacionesImpuestoInven;
	
	
	protected JMenuItem jMenuItemGuardarCambiosImpuestoInven;
	protected JMenuItem jMenuItemCopiarImpuestoInven;
	protected JMenuItem jMenuItemVerFormImpuestoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaImpuestoInven;
	protected JMenuItem jMenuItemCerrarImpuestoInven;
	protected JMenuItem jMenuItemDetalleCerrarImpuestoInven;
	protected JMenuItem jMenuItemDetalleAbrirOrderByImpuestoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarImpuestoInven;
	
	protected JMenuItem jMenuItemRecargarInformacionImpuestoInven;
	protected JMenuItem jMenuItemProcesarInformacionImpuestoInven;
	protected JMenuItem jMenuItemAnterioresImpuestoInven;
	protected JMenuItem jMenuItemSiguientesImpuestoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosImpuestoInven;
	protected JMenuItem jMenuItemAbrirOrderByImpuestoInven;
	protected JMenuItem jMenuItemMostrarOcultarImpuestoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesImpuestoInven;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosImpuestoInven;
	protected JCheckBox jCheckBoxSeleccionadosImpuestoInven;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaImpuestoInven;
	protected JCheckBox jCheckBoxConGraficoReporteImpuestoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesImpuestoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesImpuestoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoImpuestoInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoImpuestoInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesImpuestoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionImpuestoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesImpuestoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesImpuestoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarImpuestoInven;
	protected JTextField jTextFieldValorCampoGeneralImpuestoInven;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteImpuestoInven;
	//public JList<Reporte> jListColumnasSelectReporteImpuestoInven;
	//public JScrollPane jScrollColumnasSelectReporteImpuestoInven;
	
	//public JLabel jLabelRelacionesSelectReporteImpuestoInven;
	//public JList<Reporte> jListRelacionesSelectReporteImpuestoInven;
	//public JScrollPane jScrollRelacionesSelectReporteImpuestoInven;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoImpuestoInven;
	//protected JCheckBox jCheckBoxConGraficoDinamicoImpuestoInven;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoImpuestoInven;
	//public JLabel jLabelTiposArchivoReporteDinamicoImpuestoInven;
	
		
	//public JLabel jLabelArchivoImportacionImpuestoInven;	
	//public JLabel jLabelPathArchivoImportacionImpuestoInven;
	//protected JTextField jTextFieldPathArchivoImportacionImpuestoInven;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoImpuestoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoImpuestoInven;
	
	//public JLabel jLabelColumnaCategoriaValorImpuestoInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorImpuestoInven;
	
	//public JLabel jLabelColumnasValoresGraficoImpuestoInven;
	//public JList<Reporte> jListColumnasValoresGraficoImpuestoInven;
	//public JScrollPane jScrollColumnasValoresGraficoImpuestoInven;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoImpuestoInven;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoImpuestoInven;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasImpuestoInven;
	public JPanel jPanelBusquedaPorNombreImpuestoInven;
	public JButton jButtonBusquedaPorNombreImpuestoInven;
	
	public JPanel jPanelnombreBusquedaPorNombreImpuestoInven;
	public JLabel jLabelnombreBusquedaPorNombreImpuestoInven;
	public JTextArea jTextAreanombreBusquedaPorNombreImpuestoInven;
	public JButton jButtonnombreBusquedaPorNombreImpuestoInvenBusqueda= new JButtonMe();

	
	
	
	
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
	public ImpuestoInvenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImpuestoInvenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImpuestoInvenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImpuestoInvenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionImpuestoInven)	{
		this.jButtonRecargarInformacionImpuestoInven = jButtonRecargarInformacionImpuestoInven;
	}
	
	public JButton getjButtonProcesarInformacionImpuestoInven() {
		return this.jButtonProcesarInformacionImpuestoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionImpuestoInven)	{
		this.jButtonProcesarInformacionImpuestoInven = jButtonProcesarInformacionImpuestoInven;
	}
	
	
	public JButton getjButtonRecargarInformacionImpuestoInven() {
		return this.jButtonRecargarInformacionImpuestoInven;
	}
	
	
	public List<ImpuestoInven> getimpuestoinvens() {
		return this.impuestoinvens;
	}

	public void setimpuestoinvens(List<ImpuestoInven> impuestoinvens) {
		this.impuestoinvens = impuestoinvens;
	}
	
	public List<ImpuestoInven> getimpuestoinvensAux() {
		return this.impuestoinvensAux;
	}

	public void setimpuestoinvensAux(List<ImpuestoInven> impuestoinvensAux) {
		this.impuestoinvensAux = impuestoinvensAux;
	}
	
	public List<ImpuestoInven> getimpuestoinvensEliminados() {
		return this.impuestoinvensEliminados;
	}

	public void setImpuestoInvensEliminados(List<ImpuestoInven> impuestoinvensEliminados) {
		this.impuestoinvensEliminados = impuestoinvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarImpuestoInven() {
		return jComboBoxTiposSeleccionarImpuestoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarImpuestoInven(
			JComboBox jComboBoxTiposSeleccionarImpuestoInven) {
		this.jComboBoxTiposSeleccionarImpuestoInven = jComboBoxTiposSeleccionarImpuestoInven;
	}
	
	public void setBorderResaltarTiposSeleccionarImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarImpuestoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarImpuestoInven .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralImpuestoInven() {
		return jTextFieldValorCampoGeneralImpuestoInven;
	}

	public void setjTextFieldValorCampoGeneralImpuestoInven(
			JTextField jTextFieldValorCampoGeneralImpuestoInven) {
		this.jTextFieldValorCampoGeneralImpuestoInven = jTextFieldValorCampoGeneralImpuestoInven;
	}

	public void setBorderResaltarValorCampoGeneralImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoInven.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralImpuestoInven .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosImpuestoInven() {
		return this.jCheckBoxSeleccionarTodosImpuestoInven;
	}

	public void setjCheckBoxSeleccionarTodosImpuestoInven(
			JCheckBox jCheckBoxSeleccionarTodosImpuestoInven) {
		this.jCheckBoxSeleccionarTodosImpuestoInven = jCheckBoxSeleccionarTodosImpuestoInven;
	}

	public void setBorderResaltarSeleccionarTodosImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosImpuestoInven .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosImpuestoInven() {
		return this.jCheckBoxSeleccionadosImpuestoInven;
	}

	public void setjCheckBoxSeleccionadosImpuestoInven(
			JCheckBox jCheckBoxSeleccionadosImpuestoInven) {
		this.jCheckBoxSeleccionadosImpuestoInven = jCheckBoxSeleccionadosImpuestoInven;
	}
	
	public void setBorderResaltarSeleccionadosImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosImpuestoInven .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesImpuestoInven() {
		return this.jComboBoxTiposArchivosReportesImpuestoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesImpuestoInven(
			JComboBox jComboBoxTiposArchivosReportesImpuestoInven) {
		this.jComboBoxTiposArchivosReportesImpuestoInven = jComboBoxTiposArchivosReportesImpuestoInven;
	}

	public void setBorderResaltarTiposArchivosReportesImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesImpuestoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesImpuestoInven() {
		return this.jComboBoxTiposReportesImpuestoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesImpuestoInven(
			JComboBox jComboBoxTiposReportesImpuestoInven) {
		this.jComboBoxTiposReportesImpuestoInven = jComboBoxTiposReportesImpuestoInven;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoImpuestoInven() {
	//	return jComboBoxTiposReportesDinamicoImpuestoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoImpuestoInven(
	//		JComboBox jComboBoxTiposReportesDinamicoImpuestoInven) {
	//	this.jComboBoxTiposReportesDinamicoImpuestoInven = jComboBoxTiposReportesDinamicoImpuestoInven;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoImpuestoInven() {
	//	return jComboBoxTiposArchivosReportesDinamicoImpuestoInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoImpuestoInven(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoImpuestoInven) {
	//	this.jComboBoxTiposArchivosReportesDinamicoImpuestoInven = jComboBoxTiposArchivosReportesDinamicoImpuestoInven;
	//}
	
	public void setBorderResaltarTiposReportesImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesImpuestoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesImpuestoInven() {
		return this.jComboBoxTiposGraficosReportesImpuestoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesImpuestoInven(
			JComboBox jComboBoxTiposGraficosReportesImpuestoInven) {
		this.jComboBoxTiposGraficosReportesImpuestoInven = jComboBoxTiposGraficosReportesImpuestoInven;
	}
	
	public void setBorderResaltarTiposGraficosReportesImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesImpuestoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionImpuestoInven() {
		return this.jComboBoxTiposPaginacionImpuestoInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionImpuestoInven(
			JComboBox jComboBoxTiposPaginacionImpuestoInven) {
		this.jComboBoxTiposPaginacionImpuestoInven = jComboBoxTiposPaginacionImpuestoInven;
	}
	
	public void setBorderResaltarTiposPaginacionImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionImpuestoInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesImpuestoInven() {
		return this.jComboBoxTiposRelacionesImpuestoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesImpuestoInven() {
		return this.jComboBoxTiposAccionesImpuestoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesImpuestoInven(
			JComboBox jComboBoxTiposRelacionesImpuestoInven) {
		this.jComboBoxTiposRelacionesImpuestoInven = jComboBoxTiposRelacionesImpuestoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesImpuestoInven(
			JComboBox jComboBoxTiposAccionesImpuestoInven) {
		this.jComboBoxTiposAccionesImpuestoInven = jComboBoxTiposAccionesImpuestoInven;
	}
	
	public void setBorderResaltarTiposRelacionesImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesImpuestoInven .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesImpuestoInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesImpuestoInven .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoImpuestoInven() {
	//	return jCheckBoxConGraficoDinamicoImpuestoInven;
	//}

	//public void setjCheckBoxConGraficoDinamicoImpuestoInven(
	//		JCheckBox jCheckBoxConGraficoDinamicoImpuestoInven) {
	//	this.jCheckBoxConGraficoDinamicoImpuestoInven = jCheckBoxConGraficoDinamicoImpuestoInven;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoImpuestoInven() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarImpuestoInven.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoImpuestoInven .setBorder(borderResaltar);		
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
		this.impuestoinvenSessionBean=new ImpuestoInvenSessionBean();
		
		this.impuestoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.impuestoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.impuestoinvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ImpuestoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Impuesto Inven MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
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
		
		ImpuestoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarImpuestoInven= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarImpuestoInven,this.jTtoolBarImpuestoInven,
							"nuevo","nuevo","Nuevo"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarImpuestoInven,this.jTtoolBarImpuestoInven,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarImpuestoInven,this.jTtoolBarImpuestoInven,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarImpuestoInven,this.jTtoolBarImpuestoInven,
							"duplicar","duplicar","Duplicar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarImpuestoInven,this.jTtoolBarImpuestoInven,
							"copiar","copiar","Copiar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarImpuestoInven,this.jTtoolBarImpuestoInven,
							"ver_form","ver_form","Ver"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarImpuestoInven,this.jTtoolBarImpuestoInven,
							"recargar","recargar","Recargar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarImpuestoInven,this.jTtoolBarImpuestoInven,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarImpuestoInven,this.jTtoolBarImpuestoInven,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarImpuestoInven,this.jTtoolBarImpuestoInven,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarImpuestoInven,this.jTtoolBarImpuestoInven,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarImpuestoInven,this.jTtoolBarImpuestoInven,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarImpuestoInven,this.jTtoolBarImpuestoInven,
							"cerrar","cerrar","Salir"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarImpuestoInven=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarImpuestoInven;
			
				this.jButtonProcesarInformacionToolBarImpuestoInven=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarImpuestoInven;
				
		//protected JButton jButtonModificarToolBarImpuestoInven;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarImpuestoInven=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuImpuestoInven=new JMenuMe("General");
		this.jmenuArchivoImpuestoInven=new JMenuMe("Archivo");
		this.jmenuAccionesImpuestoInven=new JMenuMe("Acciones");
		this.jmenuDatosImpuestoInven=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoImpuestoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoImpuestoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoImpuestoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarImpuestoInven= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarImpuestoInven.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarImpuestoInven,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesImpuestoInven= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesImpuestoInven.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesImpuestoInven,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosImpuestoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosImpuestoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosImpuestoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarImpuestoInven= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarImpuestoInven.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarImpuestoInven,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormImpuestoInven= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormImpuestoInven.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormImpuestoInven,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaImpuestoInven= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaImpuestoInven.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaImpuestoInven,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarImpuestoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarImpuestoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarImpuestoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionImpuestoInven= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionImpuestoInven.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionImpuestoInven,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionImpuestoInven= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionImpuestoInven.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionImpuestoInven,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresImpuestoInven= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresImpuestoInven.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresImpuestoInven,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesImpuestoInven= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesImpuestoInven.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesImpuestoInven,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByImpuestoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByImpuestoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByImpuestoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarImpuestoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarImpuestoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarImpuestoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByImpuestoInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByImpuestoInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByImpuestoInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarImpuestoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarImpuestoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarImpuestoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosImpuestoInven= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosImpuestoInven.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosImpuestoInven,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoImpuestoInven.add(this.jMenuItemCerrarImpuestoInven);
			
			this.jmenuAccionesImpuestoInven.add(this.jMenuItemNuevoImpuestoInven);
			this.jmenuAccionesImpuestoInven.add(this.jMenuItemNuevoGuardarCambiosImpuestoInven);
			this.jmenuAccionesImpuestoInven.add(this.jMenuItemNuevoRelacionesImpuestoInven);
			this.jmenuAccionesImpuestoInven.add(this.jMenuItemGuardarCambiosTablaImpuestoInven);		
			this.jmenuAccionesImpuestoInven.add(this.jMenuItemDuplicarImpuestoInven);		
			this.jmenuAccionesImpuestoInven.add(this.jMenuItemCopiarImpuestoInven);		
			this.jmenuAccionesImpuestoInven.add(this.jMenuItemVerFormImpuestoInven);		
			
			this.jmenuDatosImpuestoInven.add(this.jMenuItemRecargarInformacionImpuestoInven);				
			this.jmenuDatosImpuestoInven.add(this.jMenuItemAnterioresImpuestoInven);				
			this.jmenuDatosImpuestoInven.add(this.jMenuItemSiguientesImpuestoInven);				
			this.jmenuDatosImpuestoInven.add(this.jMenuItemAbrirOrderByImpuestoInven);				
			this.jmenuDatosImpuestoInven.add(this.jMenuItemMostrarOcultarImpuestoInven);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesImpuestoInven.add(this.jMenuItemGuardarCambiosImpuestoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarImpuestoInven.add(this.jmenuArchivoImpuestoInven);		
			this.jmenuBarImpuestoInven.add(this.jmenuAccionesImpuestoInven);		
			this.jmenuBarImpuestoInven.add(this.jmenuDatosImpuestoInven);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarImpuestoInven);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasImpuestoInven() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreImpuestoInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreImpuestoInven.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreImpuestoInven= new JButtonMe();
		this.jButtonBusquedaPorNombreImpuestoInven.setText("Buscar");
		this.jButtonBusquedaPorNombreImpuestoInven.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreImpuestoInven,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreImpuestoInven = new JLabelMe();
		jLabelnombreBusquedaPorNombreImpuestoInven.setText("Nombre :");
		jLabelnombreBusquedaPorNombreImpuestoInven.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreImpuestoInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreImpuestoInven= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreImpuestoInven,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasImpuestoInven=new JTabbedPane();


		this.jTabbedPaneBusquedasImpuestoInven.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasImpuestoInven.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasImpuestoInven.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasImpuestoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasImpuestoInven,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleImpuestoInven = new ImpuestoInvenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Impuesto Inven DATOS");
			this.jInternalFrameDetalleFormImpuestoInven = new ImpuestoInvenDetalleFormJInternalFrame(jDesktopPane,this.impuestoinvenSessionBean.getConGuardarRelaciones(),this.impuestoinvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormImpuestoInven = null;//new ImpuestoInvenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutImpuestoInven= new GridBagLayout();
		
		
		this.jTableDatosImpuestoInven = new JTableMe();      
		
		String sToolTipImpuestoInven="";
		sToolTipImpuestoInven=ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipImpuestoInven+="(Inventario.ImpuestoInven)";
		}
		
		if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipImpuestoInven+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosImpuestoInven.setToolTipText(sToolTipImpuestoInven);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosImpuestoInven);
		this.jTableDatosImpuestoInven.setAutoCreateRowSorter(true);
		this.jTableDatosImpuestoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosImpuestoInven.setRowSelectionAllowed(true);
		this.jTableDatosImpuestoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosImpuestoInven,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoImpuestoInven = new JButtonMe();
		this.jButtonDuplicarImpuestoInven = new JButtonMe();
		this.jButtonCopiarImpuestoInven = new JButtonMe();
		this.jButtonVerFormImpuestoInven = new JButtonMe();
		this.jButtonNuevoRelacionesImpuestoInven = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaImpuestoInven = new JButtonMe();
		this.jButtonCerrarImpuestoInven = new JButtonMe();
		
		this.jScrollPanelDatosImpuestoInven = new JScrollPane();   
        this.jScrollPanelDatosGeneralImpuestoInven = new JScrollPane();
		
				
		
		
		this.jPanelAccionesImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Impuesto Inven";
		
		if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Impuesto Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosImpuestoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesImpuestoInven.setToolTipText("Acciones");
        this.jPanelAccionesImpuestoInven.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoImpuestoInven=new ReporteDinamicoJInternalFrame(ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoImpuestoInven();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionImpuestoInven=new ImportacionJInternalFrame(ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionImpuestoInven();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByImpuestoInven = new JButtonMe();
		
		this.jButtonAbrirOrderByImpuestoInven.setText("Orden");
		this.jButtonAbrirOrderByImpuestoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByImpuestoInven,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByImpuestoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByImpuestoInven,false,this);
			
			//this.cargarOrderByImpuestoInven(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByImpuestoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByImpuestoInven,true,this);
			
			//this.cargarOrderByImpuestoInven(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosImpuestoInven.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosImpuestoInven.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosImpuestoInven.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosImpuestoInven.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosImpuestoInven.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosImpuestoInven.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoImpuestoInven.setText("Nuevo");
		this.jButtonDuplicarImpuestoInven.setText("Duplicar");
		this.jButtonCopiarImpuestoInven.setText("Copiar");
		this.jButtonVerFormImpuestoInven.setText("Ver");
		this.jButtonNuevoRelacionesImpuestoInven.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaImpuestoInven.setText("Guardar");
		this.jButtonCerrarImpuestoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoImpuestoInven,"nuevo_button","Nuevo",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarImpuestoInven,"duplicar_button","Duplicar",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarImpuestoInven,"copiar_button","Copiar",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormImpuestoInven,"ver_form","Ver",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesImpuestoInven,"nuevorelaciones_button","Nuevo Rel",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaImpuestoInven,"guardarcambiostabla_button","Guardar",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImpuestoInven,"cerrar_button","Salir",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoImpuestoInven.setToolTipText("Nuevo"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarImpuestoInven.setToolTipText("Duplicar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarImpuestoInven.setToolTipText("Copiar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormImpuestoInven.setToolTipText("Ver"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesImpuestoInven.setToolTipText("Nuevo Rel"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaImpuestoInven.setToolTipText("Guardar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarImpuestoInven.setToolTipText("Salir"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoImpuestoInven";
		inputMap = this.jButtonNuevoImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoImpuestoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoImpuestoInven"));
		
		//DUPLICAR
		sMapKey = "DuplicarImpuestoInven";
		inputMap = this.jButtonDuplicarImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarImpuestoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarImpuestoInven"));
		
		//COPIAR
		sMapKey = "CopiarImpuestoInven";
		inputMap = this.jButtonCopiarImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarImpuestoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarImpuestoInven"));
		
		//VEr FORM
		sMapKey = "VerFormImpuestoInven";
		inputMap = this.jButtonVerFormImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormImpuestoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormImpuestoInven"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesImpuestoInven";
		inputMap = this.jButtonNuevoRelacionesImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesImpuestoInven"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarImpuestoInven";
		inputMap = this.jButtonModificarImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarImpuestoInven"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarImpuestoInven";
		inputMap = this.jButtonCerrarImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarImpuestoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaImpuestoInven";
		inputMap = this.jButtonGuardarCambiosTablaImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaImpuestoInven"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ImpuestoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ImpuestoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ImpuestoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ImpuestoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ImpuestoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesImpuestoInven.setName("jPanelParametrosReportesImpuestoInven"); 
		
		this.jPanelParametrosReportesAccionesImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesImpuestoInven.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesImpuestoInven.setName("jPanelParametrosReportesAccionesImpuestoInven"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionImpuestoInven = new JButtonMe();
		this.jButtonRecargarInformacionImpuestoInven.setText("Recargar");
		this.jButtonRecargarInformacionImpuestoInven.setToolTipText("Recargar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionImpuestoInven,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionImpuestoInven = new JButtonMe();
		this.jButtonProcesarInformacionImpuestoInven.setText("Procesar");
		this.jButtonProcesarInformacionImpuestoInven.setToolTipText("Procesar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionImpuestoInven.setVisible(false);
			
		this.jButtonProcesarInformacionImpuestoInven.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionImpuestoInven.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionImpuestoInven.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesImpuestoInven.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesImpuestoInven.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesImpuestoInven.setText("TIPO");       
		this.jComboBoxTiposReportesImpuestoInven.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesImpuestoInven.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesImpuestoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionImpuestoInven.setText("Paginacion");
		this.jComboBoxTiposPaginacionImpuestoInven.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesImpuestoInven.setText("Accion");
		this.jComboBoxTiposRelacionesImpuestoInven.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesImpuestoInven.setText("Accion");
		this.jComboBoxTiposAccionesImpuestoInven.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarImpuestoInven.setText("Accion");
		this.jComboBoxTiposSeleccionarImpuestoInven.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralImpuestoInven=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralImpuestoInven.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralImpuestoInven.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralImpuestoInven.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesImpuestoInven = new JLabelMe();
		
		this.jLabelAccionesImpuestoInven.setText("Acciones");		
		this.jLabelAccionesImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosImpuestoInven = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosImpuestoInven.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosImpuestoInven.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosImpuestoInven = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosImpuestoInven.setText("Seleccionados");
		this.jCheckBoxSeleccionadosImpuestoInven.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaImpuestoInven = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaImpuestoInven.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaImpuestoInven.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteImpuestoInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteImpuestoInven.setText("Graf.");
		this.jCheckBoxConGraficoReporteImpuestoInven.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresImpuestoInven = new JButtonMe();
		//this.jButtonAnterioresImpuestoInven.setText("<<");
        this.jButtonAnterioresImpuestoInven.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresImpuestoInven,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesImpuestoInven = new JButtonMe();
		//this.jButtonSiguientesImpuestoInven.setText(">>");
        this.jButtonSiguientesImpuestoInven.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesImpuestoInven,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosImpuestoInven = new JButtonMe();
		this.jButtonNuevoGuardarCambiosImpuestoInven.setText("Nue");
        this.jButtonNuevoGuardarCambiosImpuestoInven.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosImpuestoInven,"nuevoguardarcambios_button","Nue",this.impuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosImpuestoInven";
		inputMap = this.jButtonNuevoGuardarCambiosImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosImpuestoInven"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionImpuestoInven";
		inputMap = this.jButtonRecargarInformacionImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionImpuestoInven"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesImpuestoInven";
		inputMap = this.jButtonSiguientesImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesImpuestoInven"));
		
		//ANTERIORES		
		sMapKey = "AnterioresImpuestoInven";
		inputMap = this.jButtonAnterioresImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresImpuestoInven"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasImpuestoInven();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesImpuestoInven.setMinimumSize(new Dimension(this.getWidth(),ImpuestoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ImpuestoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesImpuestoInven.setMaximumSize(new Dimension(this.getWidth(),ImpuestoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ImpuestoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesImpuestoInven.setPreferredSize(new Dimension(this.getWidth(),ImpuestoInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ImpuestoInvenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionImpuestoInven = new GridBagLayout();

			this.jPanelPaginacionImpuestoInven.setLayout(gridaBagLayoutPaginacionImpuestoInven);						
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.gridy = 0;
			this.gridBagConstraintsImpuestoInven.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionImpuestoInven.add(this.jButtonAnterioresImpuestoInven, this.gridBagConstraintsImpuestoInven);
					
						
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsImpuestoInven.gridy = 0;
			
			this.jPanelPaginacionImpuestoInven.add(this.jButtonNuevoGuardarCambiosImpuestoInven, this.gridBagConstraintsImpuestoInven);
						
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsImpuestoInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsImpuestoInven.gridy = 0;
			this.jPanelPaginacionImpuestoInven.add(this.jButtonSiguientesImpuestoInven, this.gridBagConstraintsImpuestoInven);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.gridy = 1;
			this.gridBagConstraintsImpuestoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImpuestoInven.add(this.jButtonNuevoImpuestoInven, this.gridBagConstraintsImpuestoInven);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
				this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsImpuestoInven.gridy = 1;
				this.gridBagConstraintsImpuestoInven.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionImpuestoInven.add(this.jButtonNuevoRelacionesImpuestoInven, this.gridBagConstraintsImpuestoInven);
			}
			
			
			if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
				this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsImpuestoInven.gridy = 1;
				this.gridBagConstraintsImpuestoInven.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionImpuestoInven.add(this.jButtonGuardarCambiosTablaImpuestoInven, this.gridBagConstraintsImpuestoInven);
			}
			
			
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.gridy = 1;
			this.gridBagConstraintsImpuestoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImpuestoInven.add(this.jButtonDuplicarImpuestoInven, this.gridBagConstraintsImpuestoInven);
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.gridy = 1;
			this.gridBagConstraintsImpuestoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImpuestoInven.add(this.jButtonCopiarImpuestoInven, this.gridBagConstraintsImpuestoInven);
		
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.gridy = 1;
			this.gridBagConstraintsImpuestoInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImpuestoInven.add(this.jButtonVerFormImpuestoInven, this.gridBagConstraintsImpuestoInven);
		
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.gridy = 1;
			this.gridBagConstraintsImpuestoInven.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionImpuestoInven.add(this.jButtonCerrarImpuestoInven, this.gridBagConstraintsImpuestoInven);
		
		
		
		this.jButtonRecargarInformacionImpuestoInven.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionImpuestoInven.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionImpuestoInven.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesImpuestoInven.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesImpuestoInven.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesImpuestoInven.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesImpuestoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesImpuestoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesImpuestoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesImpuestoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesImpuestoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesImpuestoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionImpuestoInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionImpuestoInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionImpuestoInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesImpuestoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesImpuestoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesImpuestoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesImpuestoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImpuestoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImpuestoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarImpuestoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarImpuestoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarImpuestoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaImpuestoInven.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaImpuestoInven.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaImpuestoInven.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteImpuestoInven.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteImpuestoInven.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteImpuestoInven.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosImpuestoInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosImpuestoInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosImpuestoInven.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosImpuestoInven.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosImpuestoInven.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosImpuestoInven.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesImpuestoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesImpuestoInven = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ImpuestoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ImpuestoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ImpuestoInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ImpuestoInven = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesImpuestoInven.setLayout(gridaBagParametrosReportesImpuestoInven);
			this.jPanelParametrosReportesAccionesImpuestoInven.setLayout(gridaBagParametrosReportesAccionesImpuestoInven);
			
			
			this.jPanelParametrosAuxiliar1ImpuestoInven.setLayout(gridaBagParametrosAuxiliar1ImpuestoInven);
			this.jPanelParametrosAuxiliar2ImpuestoInven.setLayout(gridaBagParametrosAuxiliar2ImpuestoInven);
			this.jPanelParametrosAuxiliar3ImpuestoInven.setLayout(gridaBagParametrosAuxiliar3ImpuestoInven);
			this.jPanelParametrosAuxiliar4ImpuestoInven.setLayout(gridaBagParametrosAuxiliar4ImpuestoInven);
			//this.jPanelParametrosAuxiliar5ImpuestoInven.setLayout(gridaBagParametrosAuxiliar2ImpuestoInven);			
			
			
			
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsImpuestoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImpuestoInven.add(this.jButtonRecargarInformacionImpuestoInven, this.gridBagConstraintsImpuestoInven);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ImpuestoInven.add(this.jComboBoxTiposPaginacionImpuestoInven, this.gridBagConstraintsImpuestoInven);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ImpuestoInven.add(this.jCheckBoxConAltoMaximoTablaImpuestoInven, this.gridBagConstraintsImpuestoInven);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ImpuestoInven.add(this.jComboBoxTiposArchivosReportesImpuestoInven, this.gridBagConstraintsImpuestoInven);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImpuestoInven.add(this.jPanelParametrosAuxiliar1ImpuestoInven, this.gridBagConstraintsImpuestoInven);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImpuestoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ImpuestoInven.add(this.jComboBoxTiposReportesImpuestoInven, this.gridBagConstraintsImpuestoInven);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImpuestoInven.add(this.jPanelParametrosAuxiliar4ImpuestoInven, this.gridBagConstraintsImpuestoInven);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoInven.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImpuestoInven.add(this.jComboBoxTiposReportesImpuestoInven, this.gridBagConstraintsImpuestoInven);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoInven.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesImpuestoInven.add(this.jCheckBoxGenerarReporteImpuestoInven, this.gridBagConstraintsImpuestoInven);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImpuestoInven.add(this.jPanelParametrosAuxiliar2ImpuestoInven, this.gridBagConstraintsImpuestoInven);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsImpuestoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesImpuestoInven.add(this.jLabelAccionesImpuestoInven, this.gridBagConstraintsImpuestoInven);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
				this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsImpuestoInven.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesImpuestoInven.add(this.jButtonAbrirOrderByImpuestoInven, this.gridBagConstraintsImpuestoInven);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImpuestoInven.add(this.jComboBoxTiposSeleccionarImpuestoInven, this.gridBagConstraintsImpuestoInven);			
			
			
			/*
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsImpuestoInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesImpuestoInven.add(this.jCheckBoxSeleccionarTodosImpuestoInven, this.gridBagConstraintsImpuestoInven);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImpuestoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ImpuestoInven.add(this.jCheckBoxSeleccionarTodosImpuestoInven, this.gridBagConstraintsImpuestoInven);															
				
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImpuestoInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ImpuestoInven.add(this.jCheckBoxSeleccionadosImpuestoInven, this.gridBagConstraintsImpuestoInven);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImpuestoInven.add(this.jPanelParametrosAuxiliar3ImpuestoInven, this.gridBagConstraintsImpuestoInven);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImpuestoInven.add(this.jComboBoxTiposRelacionesImpuestoInven, this.gridBagConstraintsImpuestoInven);
				
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImpuestoInven.add(this.jComboBoxTiposAccionesImpuestoInven, this.gridBagConstraintsImpuestoInven);
	
				
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImpuestoInven.add(this.jTextFieldValorCampoGeneralImpuestoInven, this.gridBagConstraintsImpuestoInven);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosImpuestoInven = new GridBagLayout();

			this.jScrollPanelDatosImpuestoInven.setLayout(gridaBagLayoutDatosImpuestoInven);
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.gridy = 0;
			this.gridBagConstraintsImpuestoInven.gridx = 0;
			
			this.jScrollPanelDatosImpuestoInven.add(this.jTableDatosImpuestoInven, this.gridBagConstraintsImpuestoInven);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosImpuestoInven.setViewportView(this.jTableDatosImpuestoInven);
		this.jTableDatosImpuestoInven.setFillsViewportHeight(true);
		this.jTableDatosImpuestoInven.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesImpuestoInven= new GridBagLayout();
		this.jPanelAccionesImpuestoInven.setLayout(gridaBagLayoutAccionesImpuestoInven);
		
		
		/*	
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoInven.gridy = 0;
		this.gridBagConstraintsImpuestoInven.gridx = 0;
			
		this.jPanelAccionesImpuestoInven.add(this.jButtonNuevoImpuestoInven, this.gridBagConstraintsImpuestoInven);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreImpuestoInven= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreImpuestoInven.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreImpuestoInven.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreImpuestoInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreImpuestoInven.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreImpuestoInven.setLayout(gridaBagLayoutBusquedaPorNombreImpuestoInven);

		gridBagConstraintsImpuestoInven = new GridBagConstraints();
		gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImpuestoInven.gridy = 0;
		gridBagConstraintsImpuestoInven.gridx = 0;
		jPanelBusquedaPorNombreImpuestoInven.add(jLabelnombreBusquedaPorNombreImpuestoInven, gridBagConstraintsImpuestoInven);

		gridBagConstraintsImpuestoInven = new GridBagConstraints();
		gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImpuestoInven.gridy = 0;
		gridBagConstraintsImpuestoInven.gridx = 1;
		jPanelBusquedaPorNombreImpuestoInven.add(jTextAreanombreBusquedaPorNombreImpuestoInven, gridBagConstraintsImpuestoInven);

		gridBagConstraintsImpuestoInven = new GridBagConstraints();
		gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsImpuestoInven.gridy = 1;
		gridBagConstraintsImpuestoInven.gridx =1;
		jPanelBusquedaPorNombreImpuestoInven.add(jButtonBusquedaPorNombreImpuestoInven, gridBagConstraintsImpuestoInven);

		jTabbedPaneBusquedasImpuestoInven.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreImpuestoInven);
		jTabbedPaneBusquedasImpuestoInven.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutImpuestoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutImpuestoInven);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();						
			this.gridBagConstraintsImpuestoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsImpuestoInven.gridx = 0;		
			//this.gridBagConstraintsImpuestoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsImpuestoInven.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarImpuestoInven, this.gridBagConstraintsImpuestoInven);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy = iGridyPrincipal++;
		this.gridBagConstraintsImpuestoInven.gridx = 0;		
		//this.gridBagConstraintsImpuestoInven.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsImpuestoInven.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsImpuestoInven);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsImpuestoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsImpuestoInven.gridx = 0;		
			this.gridBagConstraintsImpuestoInven.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsImpuestoInven.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasImpuestoInven, this.gridBagConstraintsImpuestoInven);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoInven.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesImpuestoInven, this.gridBagConstraintsImpuestoInven);								
		
		
		/*
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesImpuestoInven, this.gridBagConstraintsImpuestoInven);
		*/		
		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsImpuestoInven.gridx =0;
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsImpuestoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosImpuestoInven, this.gridBagConstraintsImpuestoInven);
				
		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionImpuestoInven, this.gridBagConstraintsImpuestoInven);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosImpuestoInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosImpuestoInven = new GridBagLayout();
			this.jPanelBusquedasParametrosImpuestoInven.setLayout(gridaBagLayoutBusquedasParametrosImpuestoInven);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralImpuestoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralImpuestoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImpuestoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImpuestoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposImpuestoInven, this.gridBagConstraintsImpuestoInven);
			
			
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosImpuestoInven, this.gridBagConstraintsImpuestoInven);
		
			
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesImpuestoInven, this.gridBagConstraintsImpuestoInven);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralImpuestoInven;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoImpuestoInven() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoImpuestoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoImpuestoInven.setName("jPanelReporteDinamicoImpuestoInven"); 
		
		this.jPanelReporteDinamicoImpuestoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoImpuestoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoImpuestoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoImpuestoInven.setLayout(gridaBagLayoutReporteDinamicoImpuestoInven);
		
		
		this.jInternalFrameReporteDinamicoImpuestoInven= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoImpuestoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteImpuestoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoImpuestoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoImpuestoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoImpuestoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoImpuestoInven.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoImpuestoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoImpuestoInven.setResizable(true);
	    this.jInternalFrameReporteDinamicoImpuestoInven.setClosable(true);
	    this.jInternalFrameReporteDinamicoImpuestoInven.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoImpuestoInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoImpuestoInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoImpuestoInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Impuesto Invenes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteImpuestoInven = new JLabelMe();

		this.jLabelColumnasSelectReporteImpuestoInven.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoImpuestoInven.add(this.jLabelColumnasSelectReporteImpuestoInven, this.gridBagConstraintsImpuestoInven);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteImpuestoInven = new JList<Reporte>();
		this.jListColumnasSelectReporteImpuestoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteImpuestoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteImpuestoInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteImpuestoInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteImpuestoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteImpuestoInven=new JScrollPane(this.jListColumnasSelectReporteImpuestoInven);
			
			this.jScrollColumnasSelectReporteImpuestoInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteImpuestoInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteImpuestoInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoImpuestoInven.add(this.jListColumnasSelectReporteImpuestoInven, this.gridBagConstraintsImpuestoInven);
		this.jPanelReporteDinamicoImpuestoInven.add(this.jScrollColumnasSelectReporteImpuestoInven, this.gridBagConstraintsImpuestoInven);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteImpuestoInven = new JLabelMe();

		this.jLabelRelacionesSelectReporteImpuestoInven.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoImpuestoInven.add(this.jLabelRelacionesSelectReporteImpuestoInven, this.gridBagConstraintsImpuestoInven);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteImpuestoInven = new JList<Reporte>();
		this.jListRelacionesSelectReporteImpuestoInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteImpuestoInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteImpuestoInven.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteImpuestoInven.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteImpuestoInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteImpuestoInven=new JScrollPane(this.jListRelacionesSelectReporteImpuestoInven);
			
			this.jScrollRelacionesSelectReporteImpuestoInven.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteImpuestoInven.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteImpuestoInven.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoImpuestoInven.add(this.jListRelacionesSelectReporteImpuestoInven, this.gridBagConstraintsImpuestoInven);
		this.jPanelReporteDinamicoImpuestoInven.add(this.jScrollRelacionesSelectReporteImpuestoInven, this.gridBagConstraintsImpuestoInven);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoImpuestoInven = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoImpuestoInven = new JComboBoxMe();
		this.jListColumnasValoresGraficoImpuestoInven = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoImpuestoInven = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoImpuestoInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoImpuestoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoImpuestoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoImpuestoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoImpuestoInven = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoImpuestoInven.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoImpuestoInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoImpuestoInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoImpuestoInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoImpuestoInven = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoImpuestoInven.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImpuestoInven.add(this.jLabelGenerarExcelReporteDinamicoImpuestoInven, this.gridBagConstraintsImpuestoInven);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoImpuestoInven = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoImpuestoInven.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoImpuestoInven,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoImpuestoInven.setToolTipText("Generar EXCEL"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsImpuestoInven.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsImpuestoInven.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoImpuestoInven.add(this.jButtonGenerarExcelReporteDinamicoImpuestoInven, this.gridBagConstraintsImpuestoInven);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImpuestoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImpuestoInven.add(this.jComboBoxTiposReportesDinamicoImpuestoInven, this.gridBagConstraintsImpuestoInven);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoImpuestoInven = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoImpuestoInven.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImpuestoInven.add(this.jLabelTiposArchivoReporteDinamicoImpuestoInven, this.gridBagConstraintsImpuestoInven);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImpuestoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImpuestoInven.add(this.jComboBoxTiposArchivosReportesDinamicoImpuestoInven, this.gridBagConstraintsImpuestoInven);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoImpuestoInven = new JButtonMe();
		this.jButtonGenerarReporteDinamicoImpuestoInven.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoImpuestoInven,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoImpuestoInven.setToolTipText("Generar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImpuestoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImpuestoInven.add(this.jButtonGenerarReporteDinamicoImpuestoInven, this.gridBagConstraintsImpuestoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoImpuestoInven = new JButtonMe();
		this.jButtonCerrarReporteDinamicoImpuestoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoImpuestoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoImpuestoInven.setToolTipText("Cancelar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImpuestoInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImpuestoInven.add(this.jButtonCerrarReporteDinamicoImpuestoInven, this.gridBagConstraintsImpuestoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalImpuestoInven = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoImpuestoInven= new JScrollPane(jPanelReporteDinamicoImpuestoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoImpuestoInven.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoImpuestoInven.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoImpuestoInven.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Impuesto Invenes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsImpuestoInven.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoImpuestoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoImpuestoInven.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalImpuestoInven);
		this.jInternalFrameReporteDinamicoImpuestoInven.getContentPane().add(this.jScrollPanelReporteDinamicoImpuestoInven, this.gridBagConstraintsImpuestoInven);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionImpuestoInven() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionImpuestoInven = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionImpuestoInven.setName("jPanelImportacionImpuestoInven"); 
		
		this.jPanelImportacionImpuestoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionImpuestoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionImpuestoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionImpuestoInven.setLayout(gridaBagLayoutImportacionImpuestoInven);
		
		
		this.jInternalFrameImportacionImpuestoInven= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionImpuestoInven= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionImpuestoInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteImpuestoInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionImpuestoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionImpuestoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionImpuestoInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionImpuestoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionImpuestoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionImpuestoInven.setResizable(true);
	    this.jInternalFrameImportacionImpuestoInven.setClosable(true);
	    this.jInternalFrameImportacionImpuestoInven.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionImpuestoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionImpuestoInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionImpuestoInven.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionImpuestoInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionImpuestoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionImpuestoInven.setResizable(true);
	    this.jInternalFrameImportacionImpuestoInven.setClosable(true);
	    this.jInternalFrameImportacionImpuestoInven.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionImpuestoInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionImpuestoInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionImpuestoInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Impuesto Invenes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionImpuestoInven = new JLabelMe();

		this.jLabelArchivoImportacionImpuestoInven.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsImpuestoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionImpuestoInven.add(this.jLabelArchivoImportacionImpuestoInven, this.gridBagConstraintsImpuestoInven);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionImpuestoInven = new JFileChooser();		
		this.jFileChooserImportacionImpuestoInven.setToolTipText("ESCOGER ARCHIVO"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionImpuestoInven = new JButtonMe();
		this.jButtonAbrirImportacionImpuestoInven.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionImpuestoInven,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionImpuestoInven.setToolTipText("Generar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsImpuestoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImpuestoInven.add(this.jButtonAbrirImportacionImpuestoInven, this.gridBagConstraintsImpuestoInven);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionImpuestoInven = new JLabelMe();

		this.jLabelPathArchivoImportacionImpuestoInven.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsImpuestoInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionImpuestoInven.add(this.jLabelPathArchivoImportacionImpuestoInven, this.gridBagConstraintsImpuestoInven);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionImpuestoInven=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionImpuestoInven.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionImpuestoInven.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionImpuestoInven.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsImpuestoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImpuestoInven.add(this.jTextFieldPathArchivoImportacionImpuestoInven, this.gridBagConstraintsImpuestoInven);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionImpuestoInven = new JButtonMe();
		this.jButtonGenerarImportacionImpuestoInven.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionImpuestoInven,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionImpuestoInven.setToolTipText("Generar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsImpuestoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImpuestoInven.add(this.jButtonGenerarImportacionImpuestoInven, this.gridBagConstraintsImpuestoInven);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionImpuestoInven = new JButtonMe();
		this.jButtonCerrarImportacionImpuestoInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionImpuestoInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionImpuestoInven.setToolTipText("Cancelar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoInven.gridy = iPosYImportacion;
		this.gridBagConstraintsImpuestoInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImpuestoInven.add(this.jButtonCerrarImportacionImpuestoInven, this.gridBagConstraintsImpuestoInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalImpuestoInven = new GridBagLayout();
		
		this.jScrollPanelImportacionImpuestoInven= new JScrollPane(jPanelImportacionImpuestoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsImpuestoInven.gridy =iPosYImportacion;
		this.gridBagConstraintsImpuestoInven.gridx =iPosXImportacion;
		this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionImpuestoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionImpuestoInven.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalImpuestoInven);
		this.jInternalFrameImportacionImpuestoInven.getContentPane().add(this.jScrollPanelImportacionImpuestoInven, this.gridBagConstraintsImpuestoInven);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByImpuestoInven(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByImpuestoInven = new JButtonMe();
			this.jButtonAbrirOrderByImpuestoInven.setText("Orden");
			this.jButtonAbrirOrderByImpuestoInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByImpuestoInven,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByImpuestoInven";
			inputMap = this.jButtonAbrirOrderByImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByImpuestoInven"));
		
		
			GridBagLayout gridaBagLayoutOrderByImpuestoInven = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByImpuestoInven.setName("jPanelOrderByImpuestoInven"); 
			
			this.jPanelOrderByImpuestoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByImpuestoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByImpuestoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByImpuestoInven.setLayout(gridaBagLayoutOrderByImpuestoInven);
			
			
			this.jTableDatosImpuestoInvenOrderBy = new JTableMe();        
			this.jTableDatosImpuestoInvenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosImpuestoInvenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosImpuestoInvenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosImpuestoInvenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosImpuestoInvenOrderBy.setViewportView(this.jTableDatosImpuestoInvenOrderBy);
			this.jTableDatosImpuestoInvenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosImpuestoInvenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByImpuestoInven= new OrderByJInternalFrame();
			this.jInternalFrameOrderByImpuestoInven= new OrderByJInternalFrame();
			this.jScrollPanelOrderByImpuestoInven = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteImpuestoInven= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByImpuestoInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByImpuestoInven.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByImpuestoInven.setTitle("Orden");
			this.jInternalFrameOrderByImpuestoInven.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByImpuestoInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByImpuestoInven.setResizable(true);
			this.jInternalFrameOrderByImpuestoInven.setClosable(true);
			this.jInternalFrameOrderByImpuestoInven.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByImpuestoInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByImpuestoInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByImpuestoInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Impuesto Invenes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.gridy =iPosYOrderBy++;
			this.gridBagConstraintsImpuestoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsImpuestoInven.ipady =150;
				
			this.jPanelOrderByImpuestoInven.add(jScrollPanelDatosImpuestoInvenOrderBy, this.gridBagConstraintsImpuestoInven);//this.jTableDatosImpuestoInvenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByImpuestoInven = new JButtonMe();
			this.jButtonCerrarOrderByImpuestoInven.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByImpuestoInven,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByImpuestoInven.setToolTipText("Cancelar"+" "+ImpuestoInvenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoInven.gridy = iPosYOrderBy++;
			this.gridBagConstraintsImpuestoInven.gridx = iPosXOrderBy;
									
			this.jPanelOrderByImpuestoInven.add(this.jButtonCerrarOrderByImpuestoInven, this.gridBagConstraintsImpuestoInven);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalImpuestoInven = new GridBagLayout();
			
			this.jScrollPanelOrderByImpuestoInven= new JScrollPane(jPanelOrderByImpuestoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsImpuestoInven.gridy =iPosYOrderBy;
			this.gridBagConstraintsImpuestoInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsImpuestoInven.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByImpuestoInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByImpuestoInven.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalImpuestoInven);
			
			this.jInternalFrameOrderByImpuestoInven.getContentPane().add(this.jScrollPanelOrderByImpuestoInven, this.gridBagConstraintsImpuestoInven);			
		
		} else {
			this.jButtonAbrirOrderByImpuestoInven = new JButtonMe();
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
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.impuestoinvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosImpuestoInven.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosImpuestoInven.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosImpuestoInven.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosImpuestoInven.getRowHeight();//ImpuestoInvenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaImpuestoInven.isSelected()) {
					iHeightTable=ImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaImpuestoInven.isSelected()) {
					iHeightTable=ImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ImpuestoInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosImpuestoInven.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosImpuestoInven.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosImpuestoInven.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosImpuestoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosImpuestoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosImpuestoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByImpuestoInven!=null && this.jInternalFrameOrderByImpuestoInven.getjTableDatosOrderBy()!=null) {
			//if(!this.impuestoinvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByImpuestoInven.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByImpuestoInven.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByImpuestoInven.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByImpuestoInven.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByImpuestoInven.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByImpuestoInven.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByImpuestoInven.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosImpuestoInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosImpuestoInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosImpuestoInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=impuestoinvenLogic.getImpuestoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=impuestoinvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ImpuestoInven> TraerImpuestoInvenBeans(List<ImpuestoInven> impuestoinvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(ImpuestoInven impuestoinven:impuestoinvens) {
					
				if(!(ImpuestoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ImpuestoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					impuestoinven.setsDetalleGeneralEntityReporte(ImpuestoInvenConstantesFunciones.getImpuestoInvenDescripcion(impuestoinven));
										
						
					
					

					if(impuestoinven.getProductoImpuestos()!=null && Funciones.existeClass(classes,ProductoImpuesto.class)) {
						try{impuestoinven.setproductoimpuestosDescripcionReporte(new JRBeanCollectionDataSource(ProductoImpuestoJInternalFrame.TraerProductoImpuestoBeans(impuestoinven.getProductoImpuestos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(impuestoinven.getDetalleImpuestoInvens()!=null && Funciones.existeClass(classes,DetalleImpuestoInven.class)) {
						try{impuestoinven.setdetalleimpuestoinvensDescripcionReporte(new JRBeanCollectionDataSource(DetalleImpuestoInvenJInternalFrame.TraerDetalleImpuestoInvenBeans(impuestoinven.getDetalleImpuestoInvens(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//impuestoinven.setsDetalleGeneralEntityReporte(impuestoinven.getsDetalleGeneralEntityReporte());
										
				}
				
				//impuestoinvenbeans.add(impuestoinvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return impuestoinvens;
    }
	//PARA REPORTES FIN
}
