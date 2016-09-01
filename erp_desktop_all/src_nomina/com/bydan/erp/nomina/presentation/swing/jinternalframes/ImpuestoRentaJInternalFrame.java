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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.ImpuestoRentaConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class ImpuestoRentaJInternalFrame extends ImpuestoRentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarImpuestoRenta;
	
	protected JMenuBar jmenuBarImpuestoRenta;
	
	protected JMenu jmenuImpuestoRenta;
	protected JMenu jmenuDatosImpuestoRenta;
	protected JMenu jmenuArchivoImpuestoRenta;
	protected JMenu jmenuAccionesImpuestoRenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutImpuestoRenta;	
	protected GridBagConstraints gridBagConstraintsImpuestoRenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ImpuestoRentaDetalleFormJInternalFrame jInternalFrameDetalleFormImpuestoRenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoImpuestoRenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionImpuestoRenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ImpuestoRentaSessionBean impuestorentaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ImpuestoRenta> impuestorentas;		
	public List<ImpuestoRenta> impuestorentasEliminados;	
	public List<ImpuestoRenta> impuestorentasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByImpuestoRenta;		
	protected JButton jButtonAbrirOrderByImpuestoRenta;
	
	
	//protected JPanel jPanelOrderByImpuestoRenta;
	//public JScrollPane jScrollPanelOrderByImpuestoRenta;	
	//protected JButton jButtonCerrarOrderByImpuestoRenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ImpuestoRentaLogic impuestorentaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosImpuestoRenta;
	public JScrollPane jScrollPanelDatosEdicionImpuestoRenta;
	public JScrollPane jScrollPanelDatosGeneralImpuestoRenta;
    
	
	
	//public JScrollPane jScrollPanelDatosImpuestoRentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoImpuestoRenta;
	//public JScrollPane jScrollPanelImportacionImpuestoRenta;
	
	
	
	protected JPanel jPanelAccionesImpuestoRenta;
	
    protected JPanel jPanelPaginacionImpuestoRenta;
    protected JPanel jPanelParametrosReportesImpuestoRenta;
	protected JPanel jPanelParametrosReportesAccionesImpuestoRenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ImpuestoRenta;
	protected JPanel jPanelParametrosAuxiliar2ImpuestoRenta;
	protected JPanel jPanelParametrosAuxiliar3ImpuestoRenta;
	protected JPanel jPanelParametrosAuxiliar4ImpuestoRenta;
	//protected JPanel jPanelParametrosAuxiliar5ImpuestoRenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoImpuestoRenta;
	//protected JPanel jPanelImportacionImpuestoRenta;
	
	
	public JTable jTableDatosImpuestoRenta;
	
	
	
	//public JTable jTableDatosImpuestoRentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoImpuestoRenta;
	protected JButton jButtonDuplicarImpuestoRenta;
	protected JButton jButtonCopiarImpuestoRenta;
	protected JButton jButtonVerFormImpuestoRenta;
	protected JButton jButtonNuevoRelacionesImpuestoRenta;
	protected JButton jButtonModificarImpuestoRenta;
	
    protected JButton jButtonGuardarCambiosTablaImpuestoRenta;
	protected JButton jButtonCerrarImpuestoRenta;
	
	
	protected JButton jButtonRecargarInformacionImpuestoRenta;
	protected JButton jButtonProcesarInformacionImpuestoRenta;
	
	
	protected JButton jButtonAnterioresImpuestoRenta;
	protected JButton jButtonSiguientesImpuestoRenta;
	protected JButton jButtonNuevoGuardarCambiosImpuestoRenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoImpuestoRenta;
	//protected JButton jButtonCerrarReporteDinamicoImpuestoRenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoImpuestoRenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionImpuestoRenta;
	//protected JButton jButtonGenerarImportacionImpuestoRenta;
	//protected JButton jButtonCerrarImportacionImpuestoRenta;
	//protected JFileChooser jFileChooserImportacionImpuestoRenta;
	//protected File fileImportacionImpuestoRenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarImpuestoRenta;
	protected JButton jButtonDuplicarToolBarImpuestoRenta;
	protected JButton jButtonNuevoRelacionesToolBarImpuestoRenta;
	
	
	public JButton jButtonGuardarCambiosToolBarImpuestoRenta;
	protected JButton jButtonCopiarToolBarImpuestoRenta;
	protected JButton jButtonVerFormToolBarImpuestoRenta;
	public JButton jButtonGuardarCambiosTablaToolBarImpuestoRenta;
	protected JButton jButtonMostrarOcultarTablaToolBarImpuestoRenta;
	protected JButton jButtonCerrarToolBarImpuestoRenta;
	
	protected JButton jButtonRecargarInformacionToolBarImpuestoRenta;
	protected JButton jButtonProcesarInformacionToolBarImpuestoRenta;
	protected JButton jButtonAnterioresToolBarImpuestoRenta;
	protected JButton jButtonSiguientesToolBarImpuestoRenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarImpuestoRenta;
	protected JButton jButtonAbrirOrderByToolBarImpuestoRenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoImpuestoRenta;
	protected JMenuItem jMenuItemDuplicarImpuestoRenta;
	protected JMenuItem jMenuItemNuevoRelacionesImpuestoRenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosImpuestoRenta;
	protected JMenuItem jMenuItemCopiarImpuestoRenta;
	protected JMenuItem jMenuItemVerFormImpuestoRenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaImpuestoRenta;
	protected JMenuItem jMenuItemCerrarImpuestoRenta;
	protected JMenuItem jMenuItemDetalleCerrarImpuestoRenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByImpuestoRenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarImpuestoRenta;
	
	protected JMenuItem jMenuItemRecargarInformacionImpuestoRenta;
	protected JMenuItem jMenuItemProcesarInformacionImpuestoRenta;
	protected JMenuItem jMenuItemAnterioresImpuestoRenta;
	protected JMenuItem jMenuItemSiguientesImpuestoRenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosImpuestoRenta;
	protected JMenuItem jMenuItemAbrirOrderByImpuestoRenta;
	protected JMenuItem jMenuItemMostrarOcultarImpuestoRenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesImpuestoRenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosImpuestoRenta;
	protected JCheckBox jCheckBoxSeleccionadosImpuestoRenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaImpuestoRenta;
	protected JCheckBox jCheckBoxConGraficoReporteImpuestoRenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesImpuestoRenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesImpuestoRenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoImpuestoRenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoImpuestoRenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesImpuestoRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionImpuestoRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesImpuestoRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesImpuestoRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarImpuestoRenta;
	protected JTextField jTextFieldValorCampoGeneralImpuestoRenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteImpuestoRenta;
	//public JList<Reporte> jListColumnasSelectReporteImpuestoRenta;
	//public JScrollPane jScrollColumnasSelectReporteImpuestoRenta;
	
	//public JLabel jLabelRelacionesSelectReporteImpuestoRenta;
	//public JList<Reporte> jListRelacionesSelectReporteImpuestoRenta;
	//public JScrollPane jScrollRelacionesSelectReporteImpuestoRenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoImpuestoRenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoImpuestoRenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoImpuestoRenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoImpuestoRenta;
	
		
	//public JLabel jLabelArchivoImportacionImpuestoRenta;	
	//public JLabel jLabelPathArchivoImportacionImpuestoRenta;
	//protected JTextField jTextFieldPathArchivoImportacionImpuestoRenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoImpuestoRenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoImpuestoRenta;
	
	//public JLabel jLabelColumnaCategoriaValorImpuestoRenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorImpuestoRenta;
	
	//public JLabel jLabelColumnasValoresGraficoImpuestoRenta;
	//public JList<Reporte> jListColumnasValoresGraficoImpuestoRenta;
	//public JScrollPane jScrollColumnasValoresGraficoImpuestoRenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoImpuestoRenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoImpuestoRenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasImpuestoRenta;
	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ImpuestoRentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImpuestoRentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImpuestoRentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImpuestoRentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionImpuestoRenta)	{
		this.jButtonRecargarInformacionImpuestoRenta = jButtonRecargarInformacionImpuestoRenta;
	}
	
	public JButton getjButtonProcesarInformacionImpuestoRenta() {
		return this.jButtonProcesarInformacionImpuestoRenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionImpuestoRenta)	{
		this.jButtonProcesarInformacionImpuestoRenta = jButtonProcesarInformacionImpuestoRenta;
	}
	
	
	public JButton getjButtonRecargarInformacionImpuestoRenta() {
		return this.jButtonRecargarInformacionImpuestoRenta;
	}
	
	
	public List<ImpuestoRenta> getimpuestorentas() {
		return this.impuestorentas;
	}

	public void setimpuestorentas(List<ImpuestoRenta> impuestorentas) {
		this.impuestorentas = impuestorentas;
	}
	
	public List<ImpuestoRenta> getimpuestorentasAux() {
		return this.impuestorentasAux;
	}

	public void setimpuestorentasAux(List<ImpuestoRenta> impuestorentasAux) {
		this.impuestorentasAux = impuestorentasAux;
	}
	
	public List<ImpuestoRenta> getimpuestorentasEliminados() {
		return this.impuestorentasEliminados;
	}

	public void setImpuestoRentasEliminados(List<ImpuestoRenta> impuestorentasEliminados) {
		this.impuestorentasEliminados = impuestorentasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarImpuestoRenta() {
		return jComboBoxTiposSeleccionarImpuestoRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarImpuestoRenta(
			JComboBox jComboBoxTiposSeleccionarImpuestoRenta) {
		this.jComboBoxTiposSeleccionarImpuestoRenta = jComboBoxTiposSeleccionarImpuestoRenta;
	}
	
	public void setBorderResaltarTiposSeleccionarImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarImpuestoRenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralImpuestoRenta() {
		return jTextFieldValorCampoGeneralImpuestoRenta;
	}

	public void setjTextFieldValorCampoGeneralImpuestoRenta(
			JTextField jTextFieldValorCampoGeneralImpuestoRenta) {
		this.jTextFieldValorCampoGeneralImpuestoRenta = jTextFieldValorCampoGeneralImpuestoRenta;
	}

	public void setBorderResaltarValorCampoGeneralImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoRenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralImpuestoRenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosImpuestoRenta() {
		return this.jCheckBoxSeleccionarTodosImpuestoRenta;
	}

	public void setjCheckBoxSeleccionarTodosImpuestoRenta(
			JCheckBox jCheckBoxSeleccionarTodosImpuestoRenta) {
		this.jCheckBoxSeleccionarTodosImpuestoRenta = jCheckBoxSeleccionarTodosImpuestoRenta;
	}

	public void setBorderResaltarSeleccionarTodosImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoRenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosImpuestoRenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosImpuestoRenta() {
		return this.jCheckBoxSeleccionadosImpuestoRenta;
	}

	public void setjCheckBoxSeleccionadosImpuestoRenta(
			JCheckBox jCheckBoxSeleccionadosImpuestoRenta) {
		this.jCheckBoxSeleccionadosImpuestoRenta = jCheckBoxSeleccionadosImpuestoRenta;
	}
	
	public void setBorderResaltarSeleccionadosImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoRenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosImpuestoRenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesImpuestoRenta() {
		return this.jComboBoxTiposArchivosReportesImpuestoRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesImpuestoRenta(
			JComboBox jComboBoxTiposArchivosReportesImpuestoRenta) {
		this.jComboBoxTiposArchivosReportesImpuestoRenta = jComboBoxTiposArchivosReportesImpuestoRenta;
	}

	public void setBorderResaltarTiposArchivosReportesImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesImpuestoRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesImpuestoRenta() {
		return this.jComboBoxTiposReportesImpuestoRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesImpuestoRenta(
			JComboBox jComboBoxTiposReportesImpuestoRenta) {
		this.jComboBoxTiposReportesImpuestoRenta = jComboBoxTiposReportesImpuestoRenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoImpuestoRenta() {
	//	return jComboBoxTiposReportesDinamicoImpuestoRenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoImpuestoRenta(
	//		JComboBox jComboBoxTiposReportesDinamicoImpuestoRenta) {
	//	this.jComboBoxTiposReportesDinamicoImpuestoRenta = jComboBoxTiposReportesDinamicoImpuestoRenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoImpuestoRenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoImpuestoRenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoImpuestoRenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoImpuestoRenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoImpuestoRenta = jComboBoxTiposArchivosReportesDinamicoImpuestoRenta;
	//}
	
	public void setBorderResaltarTiposReportesImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesImpuestoRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesImpuestoRenta() {
		return this.jComboBoxTiposGraficosReportesImpuestoRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesImpuestoRenta(
			JComboBox jComboBoxTiposGraficosReportesImpuestoRenta) {
		this.jComboBoxTiposGraficosReportesImpuestoRenta = jComboBoxTiposGraficosReportesImpuestoRenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesImpuestoRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionImpuestoRenta() {
		return this.jComboBoxTiposPaginacionImpuestoRenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionImpuestoRenta(
			JComboBox jComboBoxTiposPaginacionImpuestoRenta) {
		this.jComboBoxTiposPaginacionImpuestoRenta = jComboBoxTiposPaginacionImpuestoRenta;
	}
	
	public void setBorderResaltarTiposPaginacionImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionImpuestoRenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesImpuestoRenta() {
		return this.jComboBoxTiposRelacionesImpuestoRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesImpuestoRenta() {
		return this.jComboBoxTiposAccionesImpuestoRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesImpuestoRenta(
			JComboBox jComboBoxTiposRelacionesImpuestoRenta) {
		this.jComboBoxTiposRelacionesImpuestoRenta = jComboBoxTiposRelacionesImpuestoRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesImpuestoRenta(
			JComboBox jComboBoxTiposAccionesImpuestoRenta) {
		this.jComboBoxTiposAccionesImpuestoRenta = jComboBoxTiposAccionesImpuestoRenta;
	}
	
	public void setBorderResaltarTiposRelacionesImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesImpuestoRenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesImpuestoRenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarImpuestoRenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesImpuestoRenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoImpuestoRenta() {
	//	return jCheckBoxConGraficoDinamicoImpuestoRenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoImpuestoRenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoImpuestoRenta) {
	//	this.jCheckBoxConGraficoDinamicoImpuestoRenta = jCheckBoxConGraficoDinamicoImpuestoRenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoImpuestoRenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarImpuestoRenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoImpuestoRenta .setBorder(borderResaltar);		
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
		this.impuestorentaSessionBean=new ImpuestoRentaSessionBean();
		
		this.impuestorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.impuestorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.impuestorentaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ImpuestoRentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Impuesto Renta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
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
		
		ImpuestoRentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ImpuestoRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarImpuestoRenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarImpuestoRenta,this.jTtoolBarImpuestoRenta,
							"nuevo","nuevo","Nuevo"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarImpuestoRenta,this.jTtoolBarImpuestoRenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarImpuestoRenta,this.jTtoolBarImpuestoRenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarImpuestoRenta,this.jTtoolBarImpuestoRenta,
							"duplicar","duplicar","Duplicar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarImpuestoRenta,this.jTtoolBarImpuestoRenta,
							"copiar","copiar","Copiar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarImpuestoRenta,this.jTtoolBarImpuestoRenta,
							"ver_form","ver_form","Ver"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarImpuestoRenta,this.jTtoolBarImpuestoRenta,
							"recargar","recargar","Recargar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarImpuestoRenta,this.jTtoolBarImpuestoRenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarImpuestoRenta,this.jTtoolBarImpuestoRenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarImpuestoRenta,this.jTtoolBarImpuestoRenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarImpuestoRenta,this.jTtoolBarImpuestoRenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarImpuestoRenta,this.jTtoolBarImpuestoRenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarImpuestoRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarImpuestoRenta,this.jTtoolBarImpuestoRenta,
							"cerrar","cerrar","Salir"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarImpuestoRenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarImpuestoRenta;
			
				this.jButtonProcesarInformacionToolBarImpuestoRenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarImpuestoRenta;
				
		//protected JButton jButtonModificarToolBarImpuestoRenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarImpuestoRenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuImpuestoRenta=new JMenuMe("General");
		this.jmenuArchivoImpuestoRenta=new JMenuMe("Archivo");
		this.jmenuAccionesImpuestoRenta=new JMenuMe("Acciones");
		this.jmenuDatosImpuestoRenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoImpuestoRenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoImpuestoRenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoImpuestoRenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarImpuestoRenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarImpuestoRenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarImpuestoRenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesImpuestoRenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesImpuestoRenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesImpuestoRenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosImpuestoRenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosImpuestoRenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosImpuestoRenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarImpuestoRenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarImpuestoRenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarImpuestoRenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormImpuestoRenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormImpuestoRenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormImpuestoRenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaImpuestoRenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaImpuestoRenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaImpuestoRenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarImpuestoRenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarImpuestoRenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarImpuestoRenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionImpuestoRenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionImpuestoRenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionImpuestoRenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionImpuestoRenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionImpuestoRenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionImpuestoRenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresImpuestoRenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresImpuestoRenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresImpuestoRenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesImpuestoRenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesImpuestoRenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesImpuestoRenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByImpuestoRenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByImpuestoRenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByImpuestoRenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarImpuestoRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarImpuestoRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarImpuestoRenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByImpuestoRenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByImpuestoRenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByImpuestoRenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarImpuestoRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarImpuestoRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarImpuestoRenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosImpuestoRenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosImpuestoRenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosImpuestoRenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoImpuestoRenta.add(this.jMenuItemCerrarImpuestoRenta);
			
			this.jmenuAccionesImpuestoRenta.add(this.jMenuItemNuevoImpuestoRenta);
			this.jmenuAccionesImpuestoRenta.add(this.jMenuItemNuevoGuardarCambiosImpuestoRenta);
			this.jmenuAccionesImpuestoRenta.add(this.jMenuItemNuevoRelacionesImpuestoRenta);
			this.jmenuAccionesImpuestoRenta.add(this.jMenuItemGuardarCambiosTablaImpuestoRenta);		
			this.jmenuAccionesImpuestoRenta.add(this.jMenuItemDuplicarImpuestoRenta);		
			this.jmenuAccionesImpuestoRenta.add(this.jMenuItemCopiarImpuestoRenta);		
			this.jmenuAccionesImpuestoRenta.add(this.jMenuItemVerFormImpuestoRenta);		
			
			this.jmenuDatosImpuestoRenta.add(this.jMenuItemRecargarInformacionImpuestoRenta);				
			this.jmenuDatosImpuestoRenta.add(this.jMenuItemAnterioresImpuestoRenta);				
			this.jmenuDatosImpuestoRenta.add(this.jMenuItemSiguientesImpuestoRenta);				
			this.jmenuDatosImpuestoRenta.add(this.jMenuItemAbrirOrderByImpuestoRenta);				
			this.jmenuDatosImpuestoRenta.add(this.jMenuItemMostrarOcultarImpuestoRenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesImpuestoRenta.add(this.jMenuItemGuardarCambiosImpuestoRenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarImpuestoRenta.add(this.jmenuArchivoImpuestoRenta);		
			this.jmenuBarImpuestoRenta.add(this.jmenuAccionesImpuestoRenta);		
			this.jmenuBarImpuestoRenta.add(this.jmenuDatosImpuestoRenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarImpuestoRenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasImpuestoRenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasImpuestoRenta=new JTabbedPane();


		this.jTabbedPaneBusquedasImpuestoRenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasImpuestoRenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasImpuestoRenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasImpuestoRenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleImpuestoRenta = new ImpuestoRentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Impuesto Renta DATOS");
			this.jInternalFrameDetalleFormImpuestoRenta = new ImpuestoRentaDetalleFormJInternalFrame(jDesktopPane,this.impuestorentaSessionBean.getConGuardarRelaciones(),this.impuestorentaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormImpuestoRenta = null;//new ImpuestoRentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutImpuestoRenta= new GridBagLayout();
		
		
		this.jTableDatosImpuestoRenta = new JTableMe();      
		
		String sToolTipImpuestoRenta="";
		sToolTipImpuestoRenta=ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipImpuestoRenta+="(Nomina.ImpuestoRenta)";
		}
		
		if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipImpuestoRenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosImpuestoRenta.setToolTipText(sToolTipImpuestoRenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosImpuestoRenta);
		this.jTableDatosImpuestoRenta.setAutoCreateRowSorter(true);
		this.jTableDatosImpuestoRenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosImpuestoRenta.setRowSelectionAllowed(true);
		this.jTableDatosImpuestoRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosImpuestoRenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoImpuestoRenta = new JButtonMe();
		this.jButtonDuplicarImpuestoRenta = new JButtonMe();
		this.jButtonCopiarImpuestoRenta = new JButtonMe();
		this.jButtonVerFormImpuestoRenta = new JButtonMe();
		this.jButtonNuevoRelacionesImpuestoRenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaImpuestoRenta = new JButtonMe();
		this.jButtonCerrarImpuestoRenta = new JButtonMe();
		
		this.jScrollPanelDatosImpuestoRenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralImpuestoRenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Impuesto Renta";
		
		if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Impuesto Rentas" + this.sPath));
		} else {
			this.jScrollPanelDatosImpuestoRenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesImpuestoRenta.setToolTipText("Acciones");
        this.jPanelAccionesImpuestoRenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoImpuestoRenta=new ReporteDinamicoJInternalFrame(ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoImpuestoRenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionImpuestoRenta=new ImportacionJInternalFrame(ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionImpuestoRenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByImpuestoRenta = new JButtonMe();
		
		this.jButtonAbrirOrderByImpuestoRenta.setText("Orden");
		this.jButtonAbrirOrderByImpuestoRenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByImpuestoRenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByImpuestoRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByImpuestoRenta,false,this);
			
			//this.cargarOrderByImpuestoRenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByImpuestoRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByImpuestoRenta,true,this);
			
			//this.cargarOrderByImpuestoRenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosImpuestoRenta.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosImpuestoRenta.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosImpuestoRenta.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosImpuestoRenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosImpuestoRenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosImpuestoRenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoImpuestoRenta.setText("Nuevo");
		this.jButtonDuplicarImpuestoRenta.setText("Duplicar");
		this.jButtonCopiarImpuestoRenta.setText("Copiar");
		this.jButtonVerFormImpuestoRenta.setText("Ver");
		this.jButtonNuevoRelacionesImpuestoRenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaImpuestoRenta.setText("Guardar");
		this.jButtonCerrarImpuestoRenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoImpuestoRenta,"nuevo_button","Nuevo",this.impuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarImpuestoRenta,"duplicar_button","Duplicar",this.impuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarImpuestoRenta,"copiar_button","Copiar",this.impuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormImpuestoRenta,"ver_form","Ver",this.impuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesImpuestoRenta,"nuevorelaciones_button","Nuevo Rel",this.impuestorentaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaImpuestoRenta,"guardarcambiostabla_button","Guardar",this.impuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImpuestoRenta,"cerrar_button","Salir",this.impuestorentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoImpuestoRenta.setToolTipText("Nuevo"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarImpuestoRenta.setToolTipText("Duplicar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarImpuestoRenta.setToolTipText("Copiar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormImpuestoRenta.setToolTipText("Ver"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesImpuestoRenta.setToolTipText("Nuevo Rel"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaImpuestoRenta.setToolTipText("Guardar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarImpuestoRenta.setToolTipText("Salir"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoImpuestoRenta";
		inputMap = this.jButtonNuevoImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoImpuestoRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoImpuestoRenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarImpuestoRenta";
		inputMap = this.jButtonDuplicarImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarImpuestoRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarImpuestoRenta"));
		
		//COPIAR
		sMapKey = "CopiarImpuestoRenta";
		inputMap = this.jButtonCopiarImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarImpuestoRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarImpuestoRenta"));
		
		//VEr FORM
		sMapKey = "VerFormImpuestoRenta";
		inputMap = this.jButtonVerFormImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormImpuestoRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormImpuestoRenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesImpuestoRenta";
		inputMap = this.jButtonNuevoRelacionesImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesImpuestoRenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarImpuestoRenta";
		inputMap = this.jButtonModificarImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarImpuestoRenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarImpuestoRenta";
		inputMap = this.jButtonCerrarImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarImpuestoRenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaImpuestoRenta";
		inputMap = this.jButtonGuardarCambiosTablaImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaImpuestoRenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesImpuestoRenta.setName("jPanelParametrosReportesImpuestoRenta"); 
		
		this.jPanelParametrosReportesAccionesImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesImpuestoRenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesImpuestoRenta.setName("jPanelParametrosReportesAccionesImpuestoRenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesImpuestoRenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionImpuestoRenta = new JButtonMe();
		this.jButtonRecargarInformacionImpuestoRenta.setText("Recargar");
		this.jButtonRecargarInformacionImpuestoRenta.setToolTipText("Recargar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionImpuestoRenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionImpuestoRenta = new JButtonMe();
		this.jButtonProcesarInformacionImpuestoRenta.setText("Procesar");
		this.jButtonProcesarInformacionImpuestoRenta.setToolTipText("Procesar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionImpuestoRenta.setVisible(false);
			
		this.jButtonProcesarInformacionImpuestoRenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionImpuestoRenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionImpuestoRenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesImpuestoRenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesImpuestoRenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesImpuestoRenta.setText("TIPO");       
		this.jComboBoxTiposReportesImpuestoRenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesImpuestoRenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesImpuestoRenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionImpuestoRenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionImpuestoRenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesImpuestoRenta.setText("Accion");
		this.jComboBoxTiposRelacionesImpuestoRenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesImpuestoRenta.setText("Accion");
		this.jComboBoxTiposAccionesImpuestoRenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarImpuestoRenta.setText("Accion");
		this.jComboBoxTiposSeleccionarImpuestoRenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralImpuestoRenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralImpuestoRenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralImpuestoRenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralImpuestoRenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesImpuestoRenta = new JLabelMe();
		
		this.jLabelAccionesImpuestoRenta.setText("Acciones");		
		this.jLabelAccionesImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosImpuestoRenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosImpuestoRenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosImpuestoRenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosImpuestoRenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosImpuestoRenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaImpuestoRenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaImpuestoRenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaImpuestoRenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteImpuestoRenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteImpuestoRenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresImpuestoRenta = new JButtonMe();
		//this.jButtonAnterioresImpuestoRenta.setText("<<");
        this.jButtonAnterioresImpuestoRenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresImpuestoRenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesImpuestoRenta = new JButtonMe();
		//this.jButtonSiguientesImpuestoRenta.setText(">>");
        this.jButtonSiguientesImpuestoRenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesImpuestoRenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosImpuestoRenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosImpuestoRenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosImpuestoRenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosImpuestoRenta,"nuevoguardarcambios_button","Nue",this.impuestorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosImpuestoRenta";
		inputMap = this.jButtonNuevoGuardarCambiosImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosImpuestoRenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionImpuestoRenta";
		inputMap = this.jButtonRecargarInformacionImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionImpuestoRenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesImpuestoRenta";
		inputMap = this.jButtonSiguientesImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesImpuestoRenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresImpuestoRenta";
		inputMap = this.jButtonAnterioresImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresImpuestoRenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasImpuestoRenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesImpuestoRenta.setMinimumSize(new Dimension(this.getWidth(),ImpuestoRentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ImpuestoRentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesImpuestoRenta.setMaximumSize(new Dimension(this.getWidth(),ImpuestoRentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ImpuestoRentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesImpuestoRenta.setPreferredSize(new Dimension(this.getWidth(),ImpuestoRentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ImpuestoRentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionImpuestoRenta = new GridBagLayout();

			this.jPanelPaginacionImpuestoRenta.setLayout(gridaBagLayoutPaginacionImpuestoRenta);						
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy = 0;
			this.gridBagConstraintsImpuestoRenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionImpuestoRenta.add(this.jButtonAnterioresImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
					
						
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsImpuestoRenta.gridy = 0;
			
			this.jPanelPaginacionImpuestoRenta.add(this.jButtonNuevoGuardarCambiosImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
						
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsImpuestoRenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsImpuestoRenta.gridy = 0;
			this.jPanelPaginacionImpuestoRenta.add(this.jButtonSiguientesImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy = 1;
			this.gridBagConstraintsImpuestoRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImpuestoRenta.add(this.jButtonNuevoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
						
			
			
			if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
				this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsImpuestoRenta.gridy = 1;
				this.gridBagConstraintsImpuestoRenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionImpuestoRenta.add(this.jButtonGuardarCambiosTablaImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
			}
			
			
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy = 1;
			this.gridBagConstraintsImpuestoRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImpuestoRenta.add(this.jButtonDuplicarImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy = 1;
			this.gridBagConstraintsImpuestoRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImpuestoRenta.add(this.jButtonCopiarImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy = 1;
			this.gridBagConstraintsImpuestoRenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionImpuestoRenta.add(this.jButtonVerFormImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy = 1;
			this.gridBagConstraintsImpuestoRenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionImpuestoRenta.add(this.jButtonCerrarImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
		
		
		this.jButtonRecargarInformacionImpuestoRenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionImpuestoRenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionImpuestoRenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesImpuestoRenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesImpuestoRenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesImpuestoRenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesImpuestoRenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesImpuestoRenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesImpuestoRenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesImpuestoRenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesImpuestoRenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesImpuestoRenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionImpuestoRenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionImpuestoRenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionImpuestoRenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesImpuestoRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesImpuestoRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesImpuestoRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesImpuestoRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImpuestoRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImpuestoRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarImpuestoRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarImpuestoRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarImpuestoRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaImpuestoRenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaImpuestoRenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaImpuestoRenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteImpuestoRenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteImpuestoRenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteImpuestoRenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosImpuestoRenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosImpuestoRenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosImpuestoRenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosImpuestoRenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosImpuestoRenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosImpuestoRenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesImpuestoRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesImpuestoRenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ImpuestoRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ImpuestoRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ImpuestoRenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ImpuestoRenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesImpuestoRenta.setLayout(gridaBagParametrosReportesImpuestoRenta);
			this.jPanelParametrosReportesAccionesImpuestoRenta.setLayout(gridaBagParametrosReportesAccionesImpuestoRenta);
			
			
			this.jPanelParametrosAuxiliar1ImpuestoRenta.setLayout(gridaBagParametrosAuxiliar1ImpuestoRenta);
			this.jPanelParametrosAuxiliar2ImpuestoRenta.setLayout(gridaBagParametrosAuxiliar2ImpuestoRenta);
			this.jPanelParametrosAuxiliar3ImpuestoRenta.setLayout(gridaBagParametrosAuxiliar3ImpuestoRenta);
			this.jPanelParametrosAuxiliar4ImpuestoRenta.setLayout(gridaBagParametrosAuxiliar4ImpuestoRenta);
			//this.jPanelParametrosAuxiliar5ImpuestoRenta.setLayout(gridaBagParametrosAuxiliar2ImpuestoRenta);			
			
			
			
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImpuestoRenta.add(this.jButtonRecargarInformacionImpuestoRenta, this.gridBagConstraintsImpuestoRenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoRenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ImpuestoRenta.add(this.jComboBoxTiposPaginacionImpuestoRenta, this.gridBagConstraintsImpuestoRenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoRenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ImpuestoRenta.add(this.jCheckBoxConAltoMaximoTablaImpuestoRenta, this.gridBagConstraintsImpuestoRenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoRenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ImpuestoRenta.add(this.jComboBoxTiposArchivosReportesImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImpuestoRenta.add(this.jPanelParametrosAuxiliar1ImpuestoRenta, this.gridBagConstraintsImpuestoRenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImpuestoRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ImpuestoRenta.add(this.jComboBoxTiposReportesImpuestoRenta, this.gridBagConstraintsImpuestoRenta);																		
			
			
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImpuestoRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ImpuestoRenta.add(this.jComboBoxTiposGraficosReportesImpuestoRenta, this.gridBagConstraintsImpuestoRenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImpuestoRenta.add(this.jPanelParametrosAuxiliar4ImpuestoRenta, this.gridBagConstraintsImpuestoRenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoRenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImpuestoRenta.add(this.jComboBoxTiposReportesImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoRenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesImpuestoRenta.add(this.jCheckBoxGenerarReporteImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImpuestoRenta.add(this.jPanelParametrosAuxiliar2ImpuestoRenta, this.gridBagConstraintsImpuestoRenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsImpuestoRenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesImpuestoRenta.add(this.jLabelAccionesImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
				this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsImpuestoRenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesImpuestoRenta.add(this.jButtonAbrirOrderByImpuestoRenta, this.gridBagConstraintsImpuestoRenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImpuestoRenta.add(this.jComboBoxTiposSeleccionarImpuestoRenta, this.gridBagConstraintsImpuestoRenta);			
			
			
			/*
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsImpuestoRenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesImpuestoRenta.add(this.jCheckBoxSeleccionarTodosImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsImpuestoRenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesImpuestoRenta.add(this.jCheckBoxConGraficoReporteImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImpuestoRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ImpuestoRenta.add(this.jCheckBoxSeleccionarTodosImpuestoRenta, this.gridBagConstraintsImpuestoRenta);															
				
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImpuestoRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ImpuestoRenta.add(this.jCheckBoxSeleccionadosImpuestoRenta, this.gridBagConstraintsImpuestoRenta);															
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsImpuestoRenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ImpuestoRenta.add(this.jCheckBoxConGraficoReporteImpuestoRenta, this.gridBagConstraintsImpuestoRenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesImpuestoRenta.add(this.jPanelParametrosAuxiliar3ImpuestoRenta, this.gridBagConstraintsImpuestoRenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImpuestoRenta.add(this.jComboBoxTiposAccionesImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
	
				
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsImpuestoRenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesImpuestoRenta.add(this.jTextFieldValorCampoGeneralImpuestoRenta, this.gridBagConstraintsImpuestoRenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosImpuestoRenta = new GridBagLayout();

			this.jScrollPanelDatosImpuestoRenta.setLayout(gridaBagLayoutDatosImpuestoRenta);
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy = 0;
			this.gridBagConstraintsImpuestoRenta.gridx = 0;
			
			this.jScrollPanelDatosImpuestoRenta.add(this.jTableDatosImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosImpuestoRenta.setViewportView(this.jTableDatosImpuestoRenta);
		this.jTableDatosImpuestoRenta.setFillsViewportHeight(true);
		this.jTableDatosImpuestoRenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesImpuestoRenta= new GridBagLayout();
		this.jPanelAccionesImpuestoRenta.setLayout(gridaBagLayoutAccionesImpuestoRenta);
		
		
		/*	
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoRenta.gridy = 0;
		this.gridBagConstraintsImpuestoRenta.gridx = 0;
			
		this.jPanelAccionesImpuestoRenta.add(this.jButtonNuevoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutImpuestoRenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutImpuestoRenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.impuestorentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();						
			this.gridBagConstraintsImpuestoRenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsImpuestoRenta.gridx = 0;		
			//this.gridBagConstraintsImpuestoRenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsImpuestoRenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarImpuestoRenta, this.gridBagConstraintsImpuestoRenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsImpuestoRenta.gridx = 0;		
		//this.gridBagConstraintsImpuestoRenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoRenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsImpuestoRenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsImpuestoRenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoRenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesImpuestoRenta, this.gridBagConstraintsImpuestoRenta);								
		
		
		/*
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoRenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		*/		
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsImpuestoRenta.gridx =0;
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsImpuestoRenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
				
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoRenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosImpuestoRenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosImpuestoRenta = new GridBagLayout();
			this.jPanelBusquedasParametrosImpuestoRenta.setLayout(gridaBagLayoutBusquedasParametrosImpuestoRenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralImpuestoRenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralImpuestoRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImpuestoRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImpuestoRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
			
			
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
			
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsImpuestoRenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralImpuestoRenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoImpuestoRenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoImpuestoRenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoImpuestoRenta.setName("jPanelReporteDinamicoImpuestoRenta"); 
		
		this.jPanelReporteDinamicoImpuestoRenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoImpuestoRenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoImpuestoRenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoImpuestoRenta.setLayout(gridaBagLayoutReporteDinamicoImpuestoRenta);
		
		
		this.jInternalFrameReporteDinamicoImpuestoRenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoImpuestoRenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteImpuestoRenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoImpuestoRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoImpuestoRenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoImpuestoRenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoImpuestoRenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoImpuestoRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoImpuestoRenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoImpuestoRenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoImpuestoRenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoImpuestoRenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoImpuestoRenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoImpuestoRenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Impuesto Rentas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteImpuestoRenta = new JLabelMe();

		this.jLabelColumnasSelectReporteImpuestoRenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jLabelColumnasSelectReporteImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteImpuestoRenta = new JList<Reporte>();
		this.jListColumnasSelectReporteImpuestoRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteImpuestoRenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteImpuestoRenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteImpuestoRenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteImpuestoRenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteImpuestoRenta=new JScrollPane(this.jListColumnasSelectReporteImpuestoRenta);
			
			this.jScrollColumnasSelectReporteImpuestoRenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteImpuestoRenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteImpuestoRenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoImpuestoRenta.add(this.jListColumnasSelectReporteImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jScrollColumnasSelectReporteImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteImpuestoRenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteImpuestoRenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteImpuestoRenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteImpuestoRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteImpuestoRenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteImpuestoRenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteImpuestoRenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteImpuestoRenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteImpuestoRenta=new JScrollPane(this.jListRelacionesSelectReporteImpuestoRenta);
			
			this.jScrollRelacionesSelectReporteImpuestoRenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteImpuestoRenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteImpuestoRenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoImpuestoRenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoImpuestoRenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoImpuestoRenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoImpuestoRenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoImpuestoRenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoImpuestoRenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoImpuestoRenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoImpuestoRenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoImpuestoRenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoImpuestoRenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoImpuestoRenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoImpuestoRenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoImpuestoRenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoImpuestoRenta = new JLabelMe();

		this.jLabelConGraficoDinamicoImpuestoRenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jLabelConGraficoDinamicoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoImpuestoRenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoImpuestoRenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoImpuestoRenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoImpuestoRenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoImpuestoRenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoImpuestoRenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jCheckBoxConGraficoDinamicoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoImpuestoRenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoImpuestoRenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jLabelColumnaCategoriaGraficoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoImpuestoRenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoImpuestoRenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoImpuestoRenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoImpuestoRenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoImpuestoRenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jComboBoxColumnaCategoriaGraficoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorImpuestoRenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorImpuestoRenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jLabelColumnaCategoriaValorImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorImpuestoRenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorImpuestoRenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorImpuestoRenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorImpuestoRenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorImpuestoRenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jComboBoxColumnaCategoriaValorImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoImpuestoRenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoImpuestoRenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jLabelColumnasValoresGraficoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoImpuestoRenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoImpuestoRenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoImpuestoRenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoImpuestoRenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoImpuestoRenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoImpuestoRenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoImpuestoRenta=new JScrollPane(this.jListColumnasValoresGraficoImpuestoRenta);
			
			this.jScrollColumnasValoresGraficoImpuestoRenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoImpuestoRenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoImpuestoRenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoImpuestoRenta.add(this.jListColumnasSelectReporteImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jScrollColumnasValoresGraficoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoImpuestoRenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoImpuestoRenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jLabelTiposGraficosReportesDinamicoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoImpuestoRenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoImpuestoRenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoImpuestoRenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoImpuestoRenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoImpuestoRenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoImpuestoRenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jComboBoxTiposGraficosReportesDinamicoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoImpuestoRenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoImpuestoRenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jLabelGenerarExcelReporteDinamicoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoImpuestoRenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoImpuestoRenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoImpuestoRenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoImpuestoRenta.setToolTipText("Generar EXCEL"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		//this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoImpuestoRenta.add(this.jButtonGenerarExcelReporteDinamicoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jComboBoxTiposReportesDinamicoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoImpuestoRenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoImpuestoRenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jLabelTiposArchivoReporteDinamicoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jComboBoxTiposArchivosReportesDinamicoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoImpuestoRenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoImpuestoRenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoImpuestoRenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoImpuestoRenta.setToolTipText("Generar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jButtonGenerarReporteDinamicoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoImpuestoRenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoImpuestoRenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoImpuestoRenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoImpuestoRenta.setToolTipText("Cancelar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoImpuestoRenta.add(this.jButtonCerrarReporteDinamicoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalImpuestoRenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoImpuestoRenta= new JScrollPane(jPanelReporteDinamicoImpuestoRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoImpuestoRenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoImpuestoRenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoImpuestoRenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Impuesto Rentas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsImpuestoRenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoImpuestoRenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoImpuestoRenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalImpuestoRenta);
		this.jInternalFrameReporteDinamicoImpuestoRenta.getContentPane().add(this.jScrollPanelReporteDinamicoImpuestoRenta, this.gridBagConstraintsImpuestoRenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionImpuestoRenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionImpuestoRenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionImpuestoRenta.setName("jPanelImportacionImpuestoRenta"); 
		
		this.jPanelImportacionImpuestoRenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionImpuestoRenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionImpuestoRenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionImpuestoRenta.setLayout(gridaBagLayoutImportacionImpuestoRenta);
		
		
		this.jInternalFrameImportacionImpuestoRenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionImpuestoRenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionImpuestoRenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteImpuestoRenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionImpuestoRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionImpuestoRenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionImpuestoRenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionImpuestoRenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionImpuestoRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionImpuestoRenta.setResizable(true);
	    this.jInternalFrameImportacionImpuestoRenta.setClosable(true);
	    this.jInternalFrameImportacionImpuestoRenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionImpuestoRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionImpuestoRenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionImpuestoRenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionImpuestoRenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionImpuestoRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionImpuestoRenta.setResizable(true);
	    this.jInternalFrameImportacionImpuestoRenta.setClosable(true);
	    this.jInternalFrameImportacionImpuestoRenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionImpuestoRenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionImpuestoRenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionImpuestoRenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Impuesto Rentas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionImpuestoRenta = new JLabelMe();

		this.jLabelArchivoImportacionImpuestoRenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionImpuestoRenta.add(this.jLabelArchivoImportacionImpuestoRenta, this.gridBagConstraintsImpuestoRenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionImpuestoRenta = new JFileChooser();		
		this.jFileChooserImportacionImpuestoRenta.setToolTipText("ESCOGER ARCHIVO"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionImpuestoRenta = new JButtonMe();
		this.jButtonAbrirImportacionImpuestoRenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionImpuestoRenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionImpuestoRenta.setToolTipText("Generar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImpuestoRenta.add(this.jButtonAbrirImportacionImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionImpuestoRenta = new JLabelMe();

		this.jLabelPathArchivoImportacionImpuestoRenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionImpuestoRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionImpuestoRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionImpuestoRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionImpuestoRenta.add(this.jLabelPathArchivoImportacionImpuestoRenta, this.gridBagConstraintsImpuestoRenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionImpuestoRenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionImpuestoRenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionImpuestoRenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionImpuestoRenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImpuestoRenta.add(this.jTextFieldPathArchivoImportacionImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionImpuestoRenta = new JButtonMe();
		this.jButtonGenerarImportacionImpuestoRenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionImpuestoRenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionImpuestoRenta.setToolTipText("Generar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImpuestoRenta.add(this.jButtonGenerarImportacionImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionImpuestoRenta = new JButtonMe();
		this.jButtonCerrarImportacionImpuestoRenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionImpuestoRenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionImpuestoRenta.setToolTipText("Cancelar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImpuestoRenta.gridy = iPosYImportacion;
		this.gridBagConstraintsImpuestoRenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionImpuestoRenta.add(this.jButtonCerrarImportacionImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalImpuestoRenta = new GridBagLayout();
		
		this.jScrollPanelImportacionImpuestoRenta= new JScrollPane(jPanelImportacionImpuestoRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
		this.gridBagConstraintsImpuestoRenta.gridy =iPosYImportacion;
		this.gridBagConstraintsImpuestoRenta.gridx =iPosXImportacion;
		this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionImpuestoRenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionImpuestoRenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalImpuestoRenta);
		this.jInternalFrameImportacionImpuestoRenta.getContentPane().add(this.jScrollPanelImportacionImpuestoRenta, this.gridBagConstraintsImpuestoRenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByImpuestoRenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByImpuestoRenta = new JButtonMe();
			this.jButtonAbrirOrderByImpuestoRenta.setText("Orden");
			this.jButtonAbrirOrderByImpuestoRenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByImpuestoRenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByImpuestoRenta";
			inputMap = this.jButtonAbrirOrderByImpuestoRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByImpuestoRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByImpuestoRenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByImpuestoRenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByImpuestoRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByImpuestoRenta.setName("jPanelOrderByImpuestoRenta"); 
			
			this.jPanelOrderByImpuestoRenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByImpuestoRenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByImpuestoRenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByImpuestoRenta.setLayout(gridaBagLayoutOrderByImpuestoRenta);
			
			
			this.jTableDatosImpuestoRentaOrderBy = new JTableMe();        
			this.jTableDatosImpuestoRentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosImpuestoRentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosImpuestoRentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosImpuestoRentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosImpuestoRentaOrderBy.setViewportView(this.jTableDatosImpuestoRentaOrderBy);
			this.jTableDatosImpuestoRentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosImpuestoRentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByImpuestoRenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByImpuestoRenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByImpuestoRenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteImpuestoRenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByImpuestoRenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByImpuestoRenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByImpuestoRenta.setTitle("Orden");
			this.jInternalFrameOrderByImpuestoRenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByImpuestoRenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByImpuestoRenta.setResizable(true);
			this.jInternalFrameOrderByImpuestoRenta.setClosable(true);
			this.jInternalFrameOrderByImpuestoRenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByImpuestoRenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByImpuestoRenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByImpuestoRenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByImpuestoRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Impuesto Rentas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsImpuestoRenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsImpuestoRenta.ipady =150;
				
			this.jPanelOrderByImpuestoRenta.add(jScrollPanelDatosImpuestoRentaOrderBy, this.gridBagConstraintsImpuestoRenta);//this.jTableDatosImpuestoRentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByImpuestoRenta = new JButtonMe();
			this.jButtonCerrarOrderByImpuestoRenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByImpuestoRenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByImpuestoRenta.setToolTipText("Cancelar"+" "+ImpuestoRentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByImpuestoRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImpuestoRenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsImpuestoRenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByImpuestoRenta.add(this.jButtonCerrarOrderByImpuestoRenta, this.gridBagConstraintsImpuestoRenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalImpuestoRenta = new GridBagLayout();
			
			this.jScrollPanelOrderByImpuestoRenta= new JScrollPane(jPanelOrderByImpuestoRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsImpuestoRenta = new GridBagConstraints();
			this.gridBagConstraintsImpuestoRenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsImpuestoRenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsImpuestoRenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByImpuestoRenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByImpuestoRenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalImpuestoRenta);
			
			this.jInternalFrameOrderByImpuestoRenta.getContentPane().add(this.jScrollPanelOrderByImpuestoRenta, this.gridBagConstraintsImpuestoRenta);			
		
		} else {
			this.jButtonAbrirOrderByImpuestoRenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.impuestorentaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosImpuestoRenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosImpuestoRenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosImpuestoRenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosImpuestoRenta.getRowHeight();//ImpuestoRentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaImpuestoRenta.isSelected()) {
					iHeightTable=ImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaImpuestoRenta.isSelected()) {
					iHeightTable=ImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ImpuestoRentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosImpuestoRenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosImpuestoRenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosImpuestoRenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosImpuestoRenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosImpuestoRenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosImpuestoRenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByImpuestoRenta!=null && this.jInternalFrameOrderByImpuestoRenta.getjTableDatosOrderBy()!=null) {
			//if(!this.impuestorentaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByImpuestoRenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByImpuestoRenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByImpuestoRenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByImpuestoRenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByImpuestoRenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByImpuestoRenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByImpuestoRenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosImpuestoRenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosImpuestoRenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosImpuestoRenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=impuestorentaLogic.getImpuestoRentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=impuestorentas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ImpuestoRenta> TraerImpuestoRentaBeans(List<ImpuestoRenta> impuestorentas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ImpuestoRenta impuestorenta:impuestorentas) {
					
				if(!(ImpuestoRentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ImpuestoRentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					impuestorenta.setsDetalleGeneralEntityReporte(ImpuestoRentaConstantesFunciones.getImpuestoRentaDescripcion(impuestorenta));
										
						
					
						
					
				} else  {
							
					//impuestorenta.setsDetalleGeneralEntityReporte(impuestorenta.getsDetalleGeneralEntityReporte());
										
				}
				
				//impuestorentabeans.add(impuestorentabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return impuestorentas;
    }
	//PARA REPORTES FIN
}
