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
import com.bydan.erp.activosfijos.util.AseguradoraConstantesFunciones;

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
public class AseguradoraJInternalFrame extends AseguradoraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAseguradora;
	
	protected JMenuBar jmenuBarAseguradora;
	
	protected JMenu jmenuAseguradora;
	protected JMenu jmenuDatosAseguradora;
	protected JMenu jmenuArchivoAseguradora;
	protected JMenu jmenuAccionesAseguradora;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAseguradora = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAseguradora;	
	protected GridBagConstraints gridBagConstraintsAseguradora;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AseguradoraDetalleFormJInternalFrame jInternalFrameDetalleFormAseguradora;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAseguradora;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAseguradora;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public AseguradoraSessionBean aseguradoraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Aseguradora> aseguradoras;		
	public List<Aseguradora> aseguradorasEliminados;	
	public List<Aseguradora> aseguradorasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAseguradora;		
	protected JButton jButtonAbrirOrderByAseguradora;
	
	
	//protected JPanel jPanelOrderByAseguradora;
	//public JScrollPane jScrollPanelOrderByAseguradora;	
	//protected JButton jButtonCerrarOrderByAseguradora;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AseguradoraLogic aseguradoraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAseguradora;
	public JScrollPane jScrollPanelDatosEdicionAseguradora;
	public JScrollPane jScrollPanelDatosGeneralAseguradora;
    
	
	
	//public JScrollPane jScrollPanelDatosAseguradoraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAseguradora;
	//public JScrollPane jScrollPanelImportacionAseguradora;
	
	
	
	protected JPanel jPanelAccionesAseguradora;
	
    protected JPanel jPanelPaginacionAseguradora;
    protected JPanel jPanelParametrosReportesAseguradora;
	protected JPanel jPanelParametrosReportesAccionesAseguradora;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Aseguradora;
	protected JPanel jPanelParametrosAuxiliar2Aseguradora;
	protected JPanel jPanelParametrosAuxiliar3Aseguradora;
	protected JPanel jPanelParametrosAuxiliar4Aseguradora;
	//protected JPanel jPanelParametrosAuxiliar5Aseguradora;
	
	
	
	//protected JPanel jPanelReporteDinamicoAseguradora;
	//protected JPanel jPanelImportacionAseguradora;
	
	
	public JTable jTableDatosAseguradora;
	
	
	
	//public JTable jTableDatosAseguradoraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAseguradora;
	protected JButton jButtonDuplicarAseguradora;
	protected JButton jButtonCopiarAseguradora;
	protected JButton jButtonVerFormAseguradora;
	protected JButton jButtonNuevoRelacionesAseguradora;
	protected JButton jButtonModificarAseguradora;
	
    protected JButton jButtonGuardarCambiosTablaAseguradora;
	protected JButton jButtonCerrarAseguradora;
	
	
	protected JButton jButtonRecargarInformacionAseguradora;
	protected JButton jButtonProcesarInformacionAseguradora;
	
	
	protected JButton jButtonAnterioresAseguradora;
	protected JButton jButtonSiguientesAseguradora;
	protected JButton jButtonNuevoGuardarCambiosAseguradora;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAseguradora;
	//protected JButton jButtonCerrarReporteDinamicoAseguradora;
	//protected JButton jButtonGenerarExcelReporteDinamicoAseguradora;	
	
	
	
	//protected JButton jButtonAbrirImportacionAseguradora;
	//protected JButton jButtonGenerarImportacionAseguradora;
	//protected JButton jButtonCerrarImportacionAseguradora;
	//protected JFileChooser jFileChooserImportacionAseguradora;
	//protected File fileImportacionAseguradora;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAseguradora;
	protected JButton jButtonDuplicarToolBarAseguradora;
	protected JButton jButtonNuevoRelacionesToolBarAseguradora;
	
	
	public JButton jButtonGuardarCambiosToolBarAseguradora;
	protected JButton jButtonCopiarToolBarAseguradora;
	protected JButton jButtonVerFormToolBarAseguradora;
	public JButton jButtonGuardarCambiosTablaToolBarAseguradora;
	protected JButton jButtonMostrarOcultarTablaToolBarAseguradora;
	protected JButton jButtonCerrarToolBarAseguradora;
	
	protected JButton jButtonRecargarInformacionToolBarAseguradora;
	protected JButton jButtonProcesarInformacionToolBarAseguradora;
	protected JButton jButtonAnterioresToolBarAseguradora;
	protected JButton jButtonSiguientesToolBarAseguradora;
	protected JButton jButtonNuevoGuardarCambiosToolBarAseguradora;
	protected JButton jButtonAbrirOrderByToolBarAseguradora;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAseguradora;
	protected JMenuItem jMenuItemDuplicarAseguradora;
	protected JMenuItem jMenuItemNuevoRelacionesAseguradora;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAseguradora;
	protected JMenuItem jMenuItemCopiarAseguradora;
	protected JMenuItem jMenuItemVerFormAseguradora;
	protected JMenuItem jMenuItemGuardarCambiosTablaAseguradora;
	protected JMenuItem jMenuItemCerrarAseguradora;
	protected JMenuItem jMenuItemDetalleCerrarAseguradora;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAseguradora;
	protected JMenuItem jMenuItemDetalleMostarOcultarAseguradora;
	
	protected JMenuItem jMenuItemRecargarInformacionAseguradora;
	protected JMenuItem jMenuItemProcesarInformacionAseguradora;
	protected JMenuItem jMenuItemAnterioresAseguradora;
	protected JMenuItem jMenuItemSiguientesAseguradora;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAseguradora;
	protected JMenuItem jMenuItemAbrirOrderByAseguradora;
	protected JMenuItem jMenuItemMostrarOcultarAseguradora;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAseguradora;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAseguradora;
	protected JCheckBox jCheckBoxSeleccionadosAseguradora;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAseguradora;
	protected JCheckBox jCheckBoxConGraficoReporteAseguradora;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAseguradora;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAseguradora;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAseguradora;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAseguradora;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAseguradora;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAseguradora;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAseguradora;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAseguradora;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAseguradora;
	protected JTextField jTextFieldValorCampoGeneralAseguradora;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAseguradora;
	//public JList<Reporte> jListColumnasSelectReporteAseguradora;
	//public JScrollPane jScrollColumnasSelectReporteAseguradora;
	
	//public JLabel jLabelRelacionesSelectReporteAseguradora;
	//public JList<Reporte> jListRelacionesSelectReporteAseguradora;
	//public JScrollPane jScrollRelacionesSelectReporteAseguradora;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAseguradora;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAseguradora;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAseguradora;
	//public JLabel jLabelTiposArchivoReporteDinamicoAseguradora;
	
		
	//public JLabel jLabelArchivoImportacionAseguradora;	
	//public JLabel jLabelPathArchivoImportacionAseguradora;
	//protected JTextField jTextFieldPathArchivoImportacionAseguradora;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAseguradora;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAseguradora;
	
	//public JLabel jLabelColumnaCategoriaValorAseguradora;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAseguradora;
	
	//public JLabel jLabelColumnasValoresGraficoAseguradora;
	//public JList<Reporte> jListColumnasValoresGraficoAseguradora;
	//public JScrollPane jScrollColumnasValoresGraficoAseguradora;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAseguradora;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAseguradora;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAseguradora;
	
	
	
	
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AseguradoraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Aseguradora No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AseguradoraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Aseguradora No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AseguradoraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Aseguradora No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AseguradoraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Aseguradora No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAseguradora)	{
		this.jButtonRecargarInformacionAseguradora = jButtonRecargarInformacionAseguradora;
	}
	
	public JButton getjButtonProcesarInformacionAseguradora() {
		return this.jButtonProcesarInformacionAseguradora;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAseguradora)	{
		this.jButtonProcesarInformacionAseguradora = jButtonProcesarInformacionAseguradora;
	}
	
	
	public JButton getjButtonRecargarInformacionAseguradora() {
		return this.jButtonRecargarInformacionAseguradora;
	}
	
	
	public List<Aseguradora> getaseguradoras() {
		return this.aseguradoras;
	}

	public void setaseguradoras(List<Aseguradora> aseguradoras) {
		this.aseguradoras = aseguradoras;
	}
	
	public List<Aseguradora> getaseguradorasAux() {
		return this.aseguradorasAux;
	}

	public void setaseguradorasAux(List<Aseguradora> aseguradorasAux) {
		this.aseguradorasAux = aseguradorasAux;
	}
	
	public List<Aseguradora> getaseguradorasEliminados() {
		return this.aseguradorasEliminados;
	}

	public void setAseguradorasEliminados(List<Aseguradora> aseguradorasEliminados) {
		this.aseguradorasEliminados = aseguradorasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAseguradora() {
		return jComboBoxTiposSeleccionarAseguradora;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAseguradora(
			JComboBox jComboBoxTiposSeleccionarAseguradora) {
		this.jComboBoxTiposSeleccionarAseguradora = jComboBoxTiposSeleccionarAseguradora;
	}
	
	public void setBorderResaltarTiposSeleccionarAseguradora() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAseguradora.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAseguradora .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAseguradora() {
		return jTextFieldValorCampoGeneralAseguradora;
	}

	public void setjTextFieldValorCampoGeneralAseguradora(
			JTextField jTextFieldValorCampoGeneralAseguradora) {
		this.jTextFieldValorCampoGeneralAseguradora = jTextFieldValorCampoGeneralAseguradora;
	}

	public void setBorderResaltarValorCampoGeneralAseguradora() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAseguradora.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAseguradora .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAseguradora() {
		return this.jCheckBoxSeleccionarTodosAseguradora;
	}

	public void setjCheckBoxSeleccionarTodosAseguradora(
			JCheckBox jCheckBoxSeleccionarTodosAseguradora) {
		this.jCheckBoxSeleccionarTodosAseguradora = jCheckBoxSeleccionarTodosAseguradora;
	}

	public void setBorderResaltarSeleccionarTodosAseguradora() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAseguradora.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAseguradora .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAseguradora() {
		return this.jCheckBoxSeleccionadosAseguradora;
	}

	public void setjCheckBoxSeleccionadosAseguradora(
			JCheckBox jCheckBoxSeleccionadosAseguradora) {
		this.jCheckBoxSeleccionadosAseguradora = jCheckBoxSeleccionadosAseguradora;
	}
	
	public void setBorderResaltarSeleccionadosAseguradora() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAseguradora.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAseguradora .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAseguradora() {
		return this.jComboBoxTiposArchivosReportesAseguradora;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAseguradora(
			JComboBox jComboBoxTiposArchivosReportesAseguradora) {
		this.jComboBoxTiposArchivosReportesAseguradora = jComboBoxTiposArchivosReportesAseguradora;
	}

	public void setBorderResaltarTiposArchivosReportesAseguradora() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAseguradora.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAseguradora .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAseguradora() {
		return this.jComboBoxTiposReportesAseguradora;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAseguradora(
			JComboBox jComboBoxTiposReportesAseguradora) {
		this.jComboBoxTiposReportesAseguradora = jComboBoxTiposReportesAseguradora;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAseguradora() {
	//	return jComboBoxTiposReportesDinamicoAseguradora;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAseguradora(
	//		JComboBox jComboBoxTiposReportesDinamicoAseguradora) {
	//	this.jComboBoxTiposReportesDinamicoAseguradora = jComboBoxTiposReportesDinamicoAseguradora;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAseguradora() {
	//	return jComboBoxTiposArchivosReportesDinamicoAseguradora;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAseguradora(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAseguradora) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAseguradora = jComboBoxTiposArchivosReportesDinamicoAseguradora;
	//}
	
	public void setBorderResaltarTiposReportesAseguradora() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAseguradora.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAseguradora .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAseguradora() {
		return this.jComboBoxTiposGraficosReportesAseguradora;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAseguradora(
			JComboBox jComboBoxTiposGraficosReportesAseguradora) {
		this.jComboBoxTiposGraficosReportesAseguradora = jComboBoxTiposGraficosReportesAseguradora;
	}
	
	public void setBorderResaltarTiposGraficosReportesAseguradora() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAseguradora.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAseguradora .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAseguradora() {
		return this.jComboBoxTiposPaginacionAseguradora;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAseguradora(
			JComboBox jComboBoxTiposPaginacionAseguradora) {
		this.jComboBoxTiposPaginacionAseguradora = jComboBoxTiposPaginacionAseguradora;
	}
	
	public void setBorderResaltarTiposPaginacionAseguradora() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAseguradora.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAseguradora .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAseguradora() {
		return this.jComboBoxTiposRelacionesAseguradora;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAseguradora() {
		return this.jComboBoxTiposAccionesAseguradora;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAseguradora(
			JComboBox jComboBoxTiposRelacionesAseguradora) {
		this.jComboBoxTiposRelacionesAseguradora = jComboBoxTiposRelacionesAseguradora;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAseguradora(
			JComboBox jComboBoxTiposAccionesAseguradora) {
		this.jComboBoxTiposAccionesAseguradora = jComboBoxTiposAccionesAseguradora;
	}
	
	public void setBorderResaltarTiposRelacionesAseguradora() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAseguradora.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAseguradora .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAseguradora() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAseguradora.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAseguradora .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAseguradora() {
	//	return jCheckBoxConGraficoDinamicoAseguradora;
	//}

	//public void setjCheckBoxConGraficoDinamicoAseguradora(
	//		JCheckBox jCheckBoxConGraficoDinamicoAseguradora) {
	//	this.jCheckBoxConGraficoDinamicoAseguradora = jCheckBoxConGraficoDinamicoAseguradora;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAseguradora() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAseguradora.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAseguradora .setBorder(borderResaltar);		
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
		this.aseguradoraSessionBean=new AseguradoraSessionBean();
		
		this.aseguradoraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.aseguradoraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.aseguradoraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AseguradoraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AseguradoraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AseguradoraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AseguradoraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AseguradoraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Aseguradora MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
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
		
		AseguradoraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Aseguradora No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAseguradora= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAseguradora,this.jTtoolBarAseguradora,
							"nuevo","nuevo","Nuevo"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAseguradora,this.jTtoolBarAseguradora,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAseguradora,this.jTtoolBarAseguradora,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAseguradora,this.jTtoolBarAseguradora,
							"duplicar","duplicar","Duplicar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAseguradora,this.jTtoolBarAseguradora,
							"copiar","copiar","Copiar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAseguradora,this.jTtoolBarAseguradora,
							"ver_form","ver_form","Ver"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAseguradora,this.jTtoolBarAseguradora,
							"recargar","recargar","Recargar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAseguradora,this.jTtoolBarAseguradora,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAseguradora,this.jTtoolBarAseguradora,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAseguradora,this.jTtoolBarAseguradora,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAseguradora,this.jTtoolBarAseguradora,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAseguradora,this.jTtoolBarAseguradora,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAseguradora=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAseguradora,this.jTtoolBarAseguradora,
							"cerrar","cerrar","Salir"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAseguradora=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAseguradora;
			
				this.jButtonProcesarInformacionToolBarAseguradora=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAseguradora;
				
		//protected JButton jButtonModificarToolBarAseguradora;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAseguradora=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAseguradora=new JMenuMe("General");
		this.jmenuArchivoAseguradora=new JMenuMe("Archivo");
		this.jmenuAccionesAseguradora=new JMenuMe("Acciones");
		this.jmenuDatosAseguradora=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAseguradora= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAseguradora.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAseguradora,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAseguradora= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAseguradora.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAseguradora,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAseguradora= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAseguradora.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAseguradora,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAseguradora= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAseguradora.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAseguradora,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAseguradora= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAseguradora.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAseguradora,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAseguradora= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAseguradora.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAseguradora,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAseguradora= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAseguradora.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAseguradora,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAseguradora= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAseguradora.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAseguradora,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAseguradora= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAseguradora.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAseguradora,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAseguradora= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAseguradora.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAseguradora,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAseguradora= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAseguradora.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAseguradora,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAseguradora= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAseguradora.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAseguradora,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAseguradora= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAseguradora.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAseguradora,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAseguradora= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAseguradora.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAseguradora,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAseguradora= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAseguradora.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAseguradora,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAseguradora= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAseguradora.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAseguradora,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAseguradora= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAseguradora.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAseguradora,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAseguradora.add(this.jMenuItemCerrarAseguradora);
			
			this.jmenuAccionesAseguradora.add(this.jMenuItemNuevoAseguradora);
			this.jmenuAccionesAseguradora.add(this.jMenuItemNuevoGuardarCambiosAseguradora);
			this.jmenuAccionesAseguradora.add(this.jMenuItemNuevoRelacionesAseguradora);
			this.jmenuAccionesAseguradora.add(this.jMenuItemGuardarCambiosTablaAseguradora);		
			this.jmenuAccionesAseguradora.add(this.jMenuItemDuplicarAseguradora);		
			this.jmenuAccionesAseguradora.add(this.jMenuItemCopiarAseguradora);		
			this.jmenuAccionesAseguradora.add(this.jMenuItemVerFormAseguradora);		
			
			this.jmenuDatosAseguradora.add(this.jMenuItemRecargarInformacionAseguradora);				
			this.jmenuDatosAseguradora.add(this.jMenuItemAnterioresAseguradora);				
			this.jmenuDatosAseguradora.add(this.jMenuItemSiguientesAseguradora);				
			this.jmenuDatosAseguradora.add(this.jMenuItemAbrirOrderByAseguradora);				
			this.jmenuDatosAseguradora.add(this.jMenuItemMostrarOcultarAseguradora);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAseguradora.add(this.jMenuItemGuardarCambiosAseguradora);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAseguradora.add(this.jmenuArchivoAseguradora);		
			this.jmenuBarAseguradora.add(this.jmenuAccionesAseguradora);		
			this.jmenuBarAseguradora.add(this.jmenuDatosAseguradora);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAseguradora);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAseguradora() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasAseguradora=new JTabbedPane();


		this.jTabbedPaneBusquedasAseguradora.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasAseguradora.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasAseguradora.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAseguradora.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAseguradora,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAseguradora = new AseguradoraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Aseguradora DATOS");
			this.jInternalFrameDetalleFormAseguradora = new AseguradoraDetalleFormJInternalFrame(jDesktopPane,this.aseguradoraSessionBean.getConGuardarRelaciones(),this.aseguradoraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAseguradora = null;//new AseguradoraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAseguradora= new GridBagLayout();
		
		
		this.jTableDatosAseguradora = new JTableMe();      
		
		String sToolTipAseguradora="";
		sToolTipAseguradora=AseguradoraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAseguradora+="(ActivosFijos.Aseguradora)";
		}
		
		if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
			sToolTipAseguradora+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAseguradora.setToolTipText(sToolTipAseguradora);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAseguradora);
		this.jTableDatosAseguradora.setAutoCreateRowSorter(true);
		this.jTableDatosAseguradora.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAseguradora.setRowSelectionAllowed(true);
		this.jTableDatosAseguradora.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAseguradora,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAseguradora = new JButtonMe();
		this.jButtonDuplicarAseguradora = new JButtonMe();
		this.jButtonCopiarAseguradora = new JButtonMe();
		this.jButtonVerFormAseguradora = new JButtonMe();
		this.jButtonNuevoRelacionesAseguradora = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAseguradora = new JButtonMe();
		this.jButtonCerrarAseguradora = new JButtonMe();
		
		this.jScrollPanelDatosAseguradora = new JScrollPane();   
        this.jScrollPanelDatosGeneralAseguradora = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAseguradora = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Aseguradora";
		
		if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Aseguradoras" + this.sPath));
		} else {
			this.jScrollPanelDatosAseguradora.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAseguradora.setToolTipText("Acciones");
        this.jPanelAccionesAseguradora.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAseguradora=new ReporteDinamicoJInternalFrame(AseguradoraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAseguradora();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAseguradora=new ImportacionJInternalFrame(AseguradoraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAseguradora();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAseguradora = new JButtonMe();
		
		this.jButtonAbrirOrderByAseguradora.setText("Orden");
		this.jButtonAbrirOrderByAseguradora.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAseguradora,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAseguradora.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAseguradora=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAseguradora,false,this);
			
			//this.cargarOrderByAseguradora(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAseguradora=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAseguradora,true,this);
			
			//this.cargarOrderByAseguradora(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAseguradora.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosAseguradora.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosAseguradora.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosAseguradora.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAseguradora.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAseguradora.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAseguradora.setText("Nuevo");
		this.jButtonDuplicarAseguradora.setText("Duplicar");
		this.jButtonCopiarAseguradora.setText("Copiar");
		this.jButtonVerFormAseguradora.setText("Ver");
		this.jButtonNuevoRelacionesAseguradora.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAseguradora.setText("Guardar");
		this.jButtonCerrarAseguradora.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAseguradora,"nuevo_button","Nuevo",this.aseguradoraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAseguradora,"duplicar_button","Duplicar",this.aseguradoraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAseguradora,"copiar_button","Copiar",this.aseguradoraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAseguradora,"ver_form","Ver",this.aseguradoraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAseguradora,"nuevorelaciones_button","Nuevo Rel",this.aseguradoraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAseguradora,"guardarcambiostabla_button","Guardar",this.aseguradoraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAseguradora,"cerrar_button","Salir",this.aseguradoraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAseguradora.setToolTipText("Nuevo"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAseguradora.setToolTipText("Duplicar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAseguradora.setToolTipText("Copiar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAseguradora.setToolTipText("Ver"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAseguradora.setToolTipText("Nuevo Rel"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAseguradora.setToolTipText("Guardar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAseguradora.setToolTipText("Salir"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAseguradora";
		inputMap = this.jButtonNuevoAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAseguradora.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAseguradora"));
		
		//DUPLICAR
		sMapKey = "DuplicarAseguradora";
		inputMap = this.jButtonDuplicarAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAseguradora.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAseguradora"));
		
		//COPIAR
		sMapKey = "CopiarAseguradora";
		inputMap = this.jButtonCopiarAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAseguradora.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAseguradora"));
		
		//VEr FORM
		sMapKey = "VerFormAseguradora";
		inputMap = this.jButtonVerFormAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAseguradora.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAseguradora"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAseguradora";
		inputMap = this.jButtonNuevoRelacionesAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAseguradora.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAseguradora"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAseguradora";
		inputMap = this.jButtonModificarAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAseguradora.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAseguradora"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAseguradora";
		inputMap = this.jButtonCerrarAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAseguradora.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAseguradora"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAseguradora";
		inputMap = this.jButtonGuardarCambiosTablaAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAseguradora.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAseguradora"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAseguradora = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAseguradora = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAseguradora = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Aseguradora= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Aseguradora= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Aseguradora= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Aseguradora= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Aseguradora= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAseguradora.setName("jPanelParametrosReportesAseguradora"); 
		
		this.jPanelParametrosReportesAccionesAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAseguradora.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAseguradora.setName("jPanelParametrosReportesAccionesAseguradora"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAseguradora, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAseguradora = new JButtonMe();
		this.jButtonRecargarInformacionAseguradora.setText("Recargar");
		this.jButtonRecargarInformacionAseguradora.setToolTipText("Recargar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAseguradora,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAseguradora = new JButtonMe();
		this.jButtonProcesarInformacionAseguradora.setText("Procesar");
		this.jButtonProcesarInformacionAseguradora.setToolTipText("Procesar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAseguradora.setVisible(false);
			
		this.jButtonProcesarInformacionAseguradora.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAseguradora.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAseguradora.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAseguradora = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAseguradora.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAseguradora.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAseguradora = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAseguradora.setText("TIPO");       
		this.jComboBoxTiposReportesAseguradora.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAseguradora = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAseguradora.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAseguradora.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAseguradora = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAseguradora.setText("Paginacion");
		this.jComboBoxTiposPaginacionAseguradora.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAseguradora = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAseguradora.setText("Accion");
		this.jComboBoxTiposRelacionesAseguradora.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAseguradora = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAseguradora.setText("Accion");
		this.jComboBoxTiposAccionesAseguradora.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAseguradora = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAseguradora.setText("Accion");
		this.jComboBoxTiposSeleccionarAseguradora.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAseguradora=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAseguradora.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAseguradora.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAseguradora.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAseguradora = new JLabelMe();
		
		this.jLabelAccionesAseguradora.setText("Acciones");		
		this.jLabelAccionesAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAseguradora = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAseguradora.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAseguradora.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAseguradora = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAseguradora.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAseguradora.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAseguradora = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAseguradora.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAseguradora.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAseguradora = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAseguradora.setText("Graf.");
		this.jCheckBoxConGraficoReporteAseguradora.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAseguradora = new JButtonMe();
		//this.jButtonAnterioresAseguradora.setText("<<");
        this.jButtonAnterioresAseguradora.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAseguradora,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAseguradora = new JButtonMe();
		//this.jButtonSiguientesAseguradora.setText(">>");
        this.jButtonSiguientesAseguradora.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAseguradora,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAseguradora = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAseguradora.setText("Nue");
        this.jButtonNuevoGuardarCambiosAseguradora.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAseguradora,"nuevoguardarcambios_button","Nue",this.aseguradoraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAseguradora";
		inputMap = this.jButtonNuevoGuardarCambiosAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAseguradora.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAseguradora"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAseguradora";
		inputMap = this.jButtonRecargarInformacionAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAseguradora.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAseguradora"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAseguradora";
		inputMap = this.jButtonSiguientesAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAseguradora.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAseguradora"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAseguradora";
		inputMap = this.jButtonAnterioresAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAseguradora.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAseguradora"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAseguradora();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAseguradora.setMinimumSize(new Dimension(this.getWidth(),AseguradoraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AseguradoraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAseguradora.setMaximumSize(new Dimension(this.getWidth(),AseguradoraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AseguradoraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAseguradora.setPreferredSize(new Dimension(this.getWidth(),AseguradoraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AseguradoraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAseguradora = new GridBagLayout();

			this.jPanelPaginacionAseguradora.setLayout(gridaBagLayoutPaginacionAseguradora);						
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.gridy = 0;
			this.gridBagConstraintsAseguradora.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAseguradora.add(this.jButtonAnterioresAseguradora, this.gridBagConstraintsAseguradora);
					
						
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAseguradora.gridy = 0;
			
			this.jPanelPaginacionAseguradora.add(this.jButtonNuevoGuardarCambiosAseguradora, this.gridBagConstraintsAseguradora);
						
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAseguradora.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAseguradora.gridy = 0;
			this.jPanelPaginacionAseguradora.add(this.jButtonSiguientesAseguradora, this.gridBagConstraintsAseguradora);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.gridy = 1;
			this.gridBagConstraintsAseguradora.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAseguradora.add(this.jButtonNuevoAseguradora, this.gridBagConstraintsAseguradora);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsAseguradora = new GridBagConstraints();
				this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAseguradora.gridy = 1;
				this.gridBagConstraintsAseguradora.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionAseguradora.add(this.jButtonNuevoRelacionesAseguradora, this.gridBagConstraintsAseguradora);
			}
			
			
			if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAseguradora = new GridBagConstraints();
				this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAseguradora.gridy = 1;
				this.gridBagConstraintsAseguradora.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAseguradora.add(this.jButtonGuardarCambiosTablaAseguradora, this.gridBagConstraintsAseguradora);
			}
			
			
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.gridy = 1;
			this.gridBagConstraintsAseguradora.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAseguradora.add(this.jButtonDuplicarAseguradora, this.gridBagConstraintsAseguradora);
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.gridy = 1;
			this.gridBagConstraintsAseguradora.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAseguradora.add(this.jButtonCopiarAseguradora, this.gridBagConstraintsAseguradora);
		
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.gridy = 1;
			this.gridBagConstraintsAseguradora.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAseguradora.add(this.jButtonVerFormAseguradora, this.gridBagConstraintsAseguradora);
		
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.gridy = 1;
			this.gridBagConstraintsAseguradora.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAseguradora.add(this.jButtonCerrarAseguradora, this.gridBagConstraintsAseguradora);
		
		
		
		this.jButtonRecargarInformacionAseguradora.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAseguradora.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAseguradora.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAseguradora.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAseguradora.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAseguradora.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAseguradora.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAseguradora.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAseguradora.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAseguradora.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAseguradora.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAseguradora.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAseguradora.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAseguradora.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAseguradora.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAseguradora.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAseguradora.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAseguradora.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAseguradora.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAseguradora.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAseguradora.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAseguradora.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAseguradora.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAseguradora.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAseguradora.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAseguradora.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAseguradora.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAseguradora.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAseguradora.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAseguradora.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAseguradora.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAseguradora.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAseguradora.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAseguradora.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAseguradora.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAseguradora.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAseguradora = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAseguradora = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Aseguradora = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Aseguradora = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Aseguradora = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Aseguradora = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAseguradora.setLayout(gridaBagParametrosReportesAseguradora);
			this.jPanelParametrosReportesAccionesAseguradora.setLayout(gridaBagParametrosReportesAccionesAseguradora);
			
			
			this.jPanelParametrosAuxiliar1Aseguradora.setLayout(gridaBagParametrosAuxiliar1Aseguradora);
			this.jPanelParametrosAuxiliar2Aseguradora.setLayout(gridaBagParametrosAuxiliar2Aseguradora);
			this.jPanelParametrosAuxiliar3Aseguradora.setLayout(gridaBagParametrosAuxiliar3Aseguradora);
			this.jPanelParametrosAuxiliar4Aseguradora.setLayout(gridaBagParametrosAuxiliar4Aseguradora);
			//this.jPanelParametrosAuxiliar5Aseguradora.setLayout(gridaBagParametrosAuxiliar2Aseguradora);			
			
			
			
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAseguradora.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAseguradora.add(this.jButtonRecargarInformacionAseguradora, this.gridBagConstraintsAseguradora);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAseguradora.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Aseguradora.add(this.jComboBoxTiposPaginacionAseguradora, this.gridBagConstraintsAseguradora);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAseguradora.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Aseguradora.add(this.jCheckBoxConAltoMaximoTablaAseguradora, this.gridBagConstraintsAseguradora);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAseguradora.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Aseguradora.add(this.jComboBoxTiposArchivosReportesAseguradora, this.gridBagConstraintsAseguradora);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAseguradora.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAseguradora.add(this.jPanelParametrosAuxiliar1Aseguradora, this.gridBagConstraintsAseguradora);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAseguradora.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Aseguradora.add(this.jComboBoxTiposReportesAseguradora, this.gridBagConstraintsAseguradora);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAseguradora.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAseguradora.add(this.jPanelParametrosAuxiliar4Aseguradora, this.gridBagConstraintsAseguradora);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAseguradora.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAseguradora.add(this.jComboBoxTiposReportesAseguradora, this.gridBagConstraintsAseguradora);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAseguradora.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAseguradora.add(this.jCheckBoxGenerarReporteAseguradora, this.gridBagConstraintsAseguradora);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAseguradora.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAseguradora.add(this.jPanelParametrosAuxiliar2Aseguradora, this.gridBagConstraintsAseguradora);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAseguradora.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAseguradora.add(this.jLabelAccionesAseguradora, this.gridBagConstraintsAseguradora);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAseguradora = new GridBagConstraints();
				this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAseguradora.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAseguradora.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAseguradora.add(this.jButtonAbrirOrderByAseguradora, this.gridBagConstraintsAseguradora);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAseguradora.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAseguradora.add(this.jComboBoxTiposSeleccionarAseguradora, this.gridBagConstraintsAseguradora);			
			
			
			/*
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAseguradora.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAseguradora.add(this.jCheckBoxSeleccionarTodosAseguradora, this.gridBagConstraintsAseguradora);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAseguradora.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Aseguradora.add(this.jCheckBoxSeleccionarTodosAseguradora, this.gridBagConstraintsAseguradora);															
				
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAseguradora.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Aseguradora.add(this.jCheckBoxSeleccionadosAseguradora, this.gridBagConstraintsAseguradora);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAseguradora.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAseguradora.add(this.jPanelParametrosAuxiliar3Aseguradora, this.gridBagConstraintsAseguradora);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAseguradora.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAseguradora.add(this.jComboBoxTiposRelacionesAseguradora, this.gridBagConstraintsAseguradora);
				
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAseguradora.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAseguradora.add(this.jComboBoxTiposAccionesAseguradora, this.gridBagConstraintsAseguradora);
	
				
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAseguradora.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAseguradora.add(this.jTextFieldValorCampoGeneralAseguradora, this.gridBagConstraintsAseguradora);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAseguradora = new GridBagLayout();

			this.jScrollPanelDatosAseguradora.setLayout(gridaBagLayoutDatosAseguradora);
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.gridy = 0;
			this.gridBagConstraintsAseguradora.gridx = 0;
			
			this.jScrollPanelDatosAseguradora.add(this.jTableDatosAseguradora, this.gridBagConstraintsAseguradora);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAseguradora.setViewportView(this.jTableDatosAseguradora);
		this.jTableDatosAseguradora.setFillsViewportHeight(true);
		this.jTableDatosAseguradora.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAseguradora= new GridBagLayout();
		this.jPanelAccionesAseguradora.setLayout(gridaBagLayoutAccionesAseguradora);
		
		
		/*	
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAseguradora.gridy = 0;
		this.gridBagConstraintsAseguradora.gridx = 0;
			
		this.jPanelAccionesAseguradora.add(this.jButtonNuevoAseguradora, this.gridBagConstraintsAseguradora);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAseguradora = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAseguradora);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.aseguradoraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAseguradora = new GridBagConstraints();						
			this.gridBagConstraintsAseguradora.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAseguradora.gridx = 0;		
			//this.gridBagConstraintsAseguradora.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAseguradora.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAseguradora, this.gridBagConstraintsAseguradora);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAseguradora.gridx = 0;		
		//this.gridBagConstraintsAseguradora.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAseguradora.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAseguradora.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAseguradora);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAseguradora.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAseguradora, this.gridBagConstraintsAseguradora);								
		
		
		/*
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAseguradora.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAseguradora, this.gridBagConstraintsAseguradora);
		*/		
		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAseguradora.gridx =0;
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAseguradora.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAseguradora, this.gridBagConstraintsAseguradora);
				
		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAseguradora.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAseguradora, this.gridBagConstraintsAseguradora);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(AseguradoraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAseguradora= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAseguradora = new GridBagLayout();
			this.jPanelBusquedasParametrosAseguradora.setLayout(gridaBagLayoutBusquedasParametrosAseguradora);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAseguradora=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAseguradora.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAseguradora.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAseguradora.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAseguradora.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAseguradora, this.gridBagConstraintsAseguradora);
			
			
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAseguradora.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAseguradora, this.gridBagConstraintsAseguradora);
		
			
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAseguradora.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAseguradora, this.gridBagConstraintsAseguradora);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAseguradora;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAseguradora() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAseguradora = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAseguradora = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAseguradora.setName("jPanelReporteDinamicoAseguradora"); 
		
		this.jPanelReporteDinamicoAseguradora.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAseguradora.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAseguradora.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAseguradora.setLayout(gridaBagLayoutReporteDinamicoAseguradora);
		
		
		this.jInternalFrameReporteDinamicoAseguradora= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAseguradora = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAseguradora= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAseguradora.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAseguradora.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAseguradora.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAseguradora.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAseguradora.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAseguradora.setResizable(true);
	    this.jInternalFrameReporteDinamicoAseguradora.setClosable(true);
	    this.jInternalFrameReporteDinamicoAseguradora.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAseguradora.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAseguradora.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAseguradora.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Aseguradoras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAseguradora = new JLabelMe();

		this.jLabelColumnasSelectReporteAseguradora.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAseguradora.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAseguradora.add(this.jLabelColumnasSelectReporteAseguradora, this.gridBagConstraintsAseguradora);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAseguradora = new JList<Reporte>();
		this.jListColumnasSelectReporteAseguradora.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAseguradora.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAseguradora.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAseguradora.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAseguradora.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAseguradora=new JScrollPane(this.jListColumnasSelectReporteAseguradora);
			
			this.jScrollColumnasSelectReporteAseguradora.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAseguradora.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAseguradora.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAseguradora.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAseguradora.add(this.jListColumnasSelectReporteAseguradora, this.gridBagConstraintsAseguradora);
		this.jPanelReporteDinamicoAseguradora.add(this.jScrollColumnasSelectReporteAseguradora, this.gridBagConstraintsAseguradora);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAseguradora = new JLabelMe();

		this.jLabelRelacionesSelectReporteAseguradora.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAseguradora.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAseguradora.add(this.jLabelRelacionesSelectReporteAseguradora, this.gridBagConstraintsAseguradora);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAseguradora = new JList<Reporte>();
		this.jListRelacionesSelectReporteAseguradora.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAseguradora.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAseguradora.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAseguradora.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAseguradora.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAseguradora=new JScrollPane(this.jListRelacionesSelectReporteAseguradora);
			
			this.jScrollRelacionesSelectReporteAseguradora.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAseguradora.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAseguradora.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAseguradora.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAseguradora.add(this.jListRelacionesSelectReporteAseguradora, this.gridBagConstraintsAseguradora);
		this.jPanelReporteDinamicoAseguradora.add(this.jScrollRelacionesSelectReporteAseguradora, this.gridBagConstraintsAseguradora);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoAseguradora = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAseguradora = new JComboBoxMe();
		this.jListColumnasValoresGraficoAseguradora = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAseguradora = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAseguradora.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAseguradora.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAseguradora.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAseguradora.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAseguradora = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAseguradora.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAseguradora.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAseguradora.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAseguradora.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAseguradora = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAseguradora.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAseguradora.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAseguradora.add(this.jLabelGenerarExcelReporteDinamicoAseguradora, this.gridBagConstraintsAseguradora);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAseguradora = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAseguradora.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAseguradora,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAseguradora.setToolTipText("Generar EXCEL"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAseguradora = new GridBagConstraints();
		//this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAseguradora.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAseguradora.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAseguradora.add(this.jButtonGenerarExcelReporteDinamicoAseguradora, this.gridBagConstraintsAseguradora);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAseguradora.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAseguradora.add(this.jComboBoxTiposReportesDinamicoAseguradora, this.gridBagConstraintsAseguradora);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAseguradora = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAseguradora.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAseguradora.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAseguradora.add(this.jLabelTiposArchivoReporteDinamicoAseguradora, this.gridBagConstraintsAseguradora);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAseguradora.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAseguradora.add(this.jComboBoxTiposArchivosReportesDinamicoAseguradora, this.gridBagConstraintsAseguradora);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAseguradora = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAseguradora.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAseguradora,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAseguradora.setToolTipText("Generar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAseguradora.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAseguradora.add(this.jButtonGenerarReporteDinamicoAseguradora, this.gridBagConstraintsAseguradora);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAseguradora = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAseguradora.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAseguradora,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAseguradora.setToolTipText("Cancelar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAseguradora.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAseguradora.add(this.jButtonCerrarReporteDinamicoAseguradora, this.gridBagConstraintsAseguradora);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAseguradora = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAseguradora= new JScrollPane(jPanelReporteDinamicoAseguradora,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAseguradora.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAseguradora.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAseguradora.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Aseguradoras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAseguradora.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAseguradora.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAseguradora.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAseguradora);
		this.jInternalFrameReporteDinamicoAseguradora.getContentPane().add(this.jScrollPanelReporteDinamicoAseguradora, this.gridBagConstraintsAseguradora);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAseguradora() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAseguradora = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAseguradora = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAseguradora.setName("jPanelImportacionAseguradora"); 
		
		this.jPanelImportacionAseguradora.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAseguradora.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAseguradora.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAseguradora.setLayout(gridaBagLayoutImportacionAseguradora);
		
		
		this.jInternalFrameImportacionAseguradora= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAseguradora= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAseguradora = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAseguradora= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAseguradora.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAseguradora.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAseguradora.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAseguradora.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAseguradora.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAseguradora.setResizable(true);
	    this.jInternalFrameImportacionAseguradora.setClosable(true);
	    this.jInternalFrameImportacionAseguradora.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAseguradora.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAseguradora.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAseguradora.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAseguradora.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAseguradora.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAseguradora.setResizable(true);
	    this.jInternalFrameImportacionAseguradora.setClosable(true);
	    this.jInternalFrameImportacionAseguradora.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAseguradora.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAseguradora.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAseguradora.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Aseguradoras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAseguradora = new JLabelMe();

		this.jLabelArchivoImportacionAseguradora.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYImportacion;		
		this.gridBagConstraintsAseguradora.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAseguradora.add(this.jLabelArchivoImportacionAseguradora, this.gridBagConstraintsAseguradora);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAseguradora = new JFileChooser();		
		this.jFileChooserImportacionAseguradora.setToolTipText("ESCOGER ARCHIVO"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAseguradora = new JButtonMe();
		this.jButtonAbrirImportacionAseguradora.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAseguradora,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAseguradora.setToolTipText("Generar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYImportacion;
		this.gridBagConstraintsAseguradora.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAseguradora.add(this.jButtonAbrirImportacionAseguradora, this.gridBagConstraintsAseguradora);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAseguradora = new JLabelMe();

		this.jLabelPathArchivoImportacionAseguradora.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAseguradora.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAseguradora.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAseguradora.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYImportacion;		
		this.gridBagConstraintsAseguradora.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAseguradora.add(this.jLabelPathArchivoImportacionAseguradora, this.gridBagConstraintsAseguradora);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAseguradora=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAseguradora.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAseguradora.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAseguradora.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYImportacion;
		this.gridBagConstraintsAseguradora.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAseguradora.add(this.jTextFieldPathArchivoImportacionAseguradora, this.gridBagConstraintsAseguradora);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAseguradora = new JButtonMe();
		this.jButtonGenerarImportacionAseguradora.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAseguradora,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAseguradora.setToolTipText("Generar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYImportacion;
		this.gridBagConstraintsAseguradora.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAseguradora.add(this.jButtonGenerarImportacionAseguradora, this.gridBagConstraintsAseguradora);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAseguradora = new JButtonMe();
		this.jButtonCerrarImportacionAseguradora.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAseguradora,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAseguradora.setToolTipText("Cancelar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAseguradora.gridy = iPosYImportacion;
		this.gridBagConstraintsAseguradora.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAseguradora.add(this.jButtonCerrarImportacionAseguradora, this.gridBagConstraintsAseguradora);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAseguradora = new GridBagLayout();
		
		this.jScrollPanelImportacionAseguradora= new JScrollPane(jPanelImportacionAseguradora,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAseguradora = new GridBagConstraints();
		this.gridBagConstraintsAseguradora.gridy =iPosYImportacion;
		this.gridBagConstraintsAseguradora.gridx =iPosXImportacion;
		this.gridBagConstraintsAseguradora.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAseguradora.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAseguradora.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAseguradora);
		this.jInternalFrameImportacionAseguradora.getContentPane().add(this.jScrollPanelImportacionAseguradora, this.gridBagConstraintsAseguradora);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAseguradora(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAseguradora = new JButtonMe();
			this.jButtonAbrirOrderByAseguradora.setText("Orden");
			this.jButtonAbrirOrderByAseguradora.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAseguradora,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAseguradora";
			inputMap = this.jButtonAbrirOrderByAseguradora.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAseguradora.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAseguradora"));
		
		
			GridBagLayout gridaBagLayoutOrderByAseguradora = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAseguradora = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAseguradora.setName("jPanelOrderByAseguradora"); 
			
			this.jPanelOrderByAseguradora.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAseguradora.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAseguradora.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAseguradora.setLayout(gridaBagLayoutOrderByAseguradora);
			
			
			this.jTableDatosAseguradoraOrderBy = new JTableMe();        
			this.jTableDatosAseguradoraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAseguradoraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAseguradoraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAseguradoraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAseguradoraOrderBy.setViewportView(this.jTableDatosAseguradoraOrderBy);
			this.jTableDatosAseguradoraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAseguradoraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAseguradora= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAseguradora= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAseguradora = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAseguradora= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAseguradora.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAseguradora.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAseguradora.setTitle("Orden");
			this.jInternalFrameOrderByAseguradora.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAseguradora.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAseguradora.setResizable(true);
			this.jInternalFrameOrderByAseguradora.setClosable(true);
			this.jInternalFrameOrderByAseguradora.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAseguradora.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAseguradora.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAseguradora.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAseguradora.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Aseguradoras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAseguradora.gridx =iPosXOrderBy;
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAseguradora.ipady =150;
				
			this.jPanelOrderByAseguradora.add(jScrollPanelDatosAseguradoraOrderBy, this.gridBagConstraintsAseguradora);//this.jTableDatosAseguradoraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAseguradora = new JButtonMe();
			this.jButtonCerrarOrderByAseguradora.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAseguradora,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAseguradora.setToolTipText("Cancelar"+" "+AseguradoraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAseguradora, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAseguradora.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAseguradora.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAseguradora.add(this.jButtonCerrarOrderByAseguradora, this.gridBagConstraintsAseguradora);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAseguradora = new GridBagLayout();
			
			this.jScrollPanelOrderByAseguradora= new JScrollPane(jPanelOrderByAseguradora,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAseguradora = new GridBagConstraints();
			this.gridBagConstraintsAseguradora.gridy =iPosYOrderBy;
			this.gridBagConstraintsAseguradora.gridx =iPosXOrderBy;
			this.gridBagConstraintsAseguradora.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAseguradora.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAseguradora.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAseguradora);
			
			this.jInternalFrameOrderByAseguradora.getContentPane().add(this.jScrollPanelOrderByAseguradora, this.gridBagConstraintsAseguradora);			
		
		} else {
			this.jButtonAbrirOrderByAseguradora = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.aseguradoraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAseguradora.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAseguradora.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAseguradora.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAseguradora.getRowHeight();//AseguradoraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AseguradoraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAseguradora.isSelected()) {
					iHeightTable=AseguradoraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AseguradoraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AseguradoraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AseguradoraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAseguradora.isSelected()) {
					iHeightTable=AseguradoraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AseguradoraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AseguradoraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAseguradora.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAseguradora.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAseguradora.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAseguradora.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAseguradora.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAseguradora.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAseguradora!=null && this.jInternalFrameOrderByAseguradora.getjTableDatosOrderBy()!=null) {
			//if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAseguradora.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAseguradora.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAseguradora.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAseguradora.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAseguradora.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAseguradora.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAseguradora.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAseguradora.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAseguradora.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAseguradora.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=aseguradoraLogic.getAseguradoras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=aseguradoras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Aseguradora> TraerAseguradoraBeans(List<Aseguradora> aseguradoras,ArrayList<Classe> classes)throws Exception {
		try {
			for(Aseguradora aseguradora:aseguradoras) {
					
				if(!(AseguradoraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AseguradoraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					aseguradora.setsDetalleGeneralEntityReporte(AseguradoraConstantesFunciones.getAseguradoraDescripcion(aseguradora));
										
						
					
					

					if(aseguradora.getVehiculos()!=null && Funciones.existeClass(classes,Vehiculo.class)) {
						try{aseguradora.setvehiculosDescripcionReporte(new JRBeanCollectionDataSource(VehiculoJInternalFrame.TraerVehiculoBeans(aseguradora.getVehiculos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//aseguradora.setsDetalleGeneralEntityReporte(aseguradora.getsDetalleGeneralEntityReporte());
										
				}
				
				//aseguradorabeans.add(aseguradorabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return aseguradoras;
    }
	//PARA REPORTES FIN
}
