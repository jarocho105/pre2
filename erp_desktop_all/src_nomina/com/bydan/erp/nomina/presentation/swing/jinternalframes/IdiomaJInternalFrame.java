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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.nomina.util.IdiomaConstantesFunciones;

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
public class IdiomaJInternalFrame extends IdiomaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarIdioma;
	
	protected JMenuBar jmenuBarIdioma;
	
	protected JMenu jmenuIdioma;
	protected JMenu jmenuDatosIdioma;
	protected JMenu jmenuArchivoIdioma;
	protected JMenu jmenuAccionesIdioma;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutIdioma;	
	protected GridBagConstraints gridBagConstraintsIdioma;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public IdiomaDetalleFormJInternalFrame jInternalFrameDetalleFormIdioma;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoIdioma;	
	protected ImportacionJInternalFrame jInternalFrameImportacionIdioma;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public IdiomaSessionBean idiomaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Idioma> idiomas;		
	public List<Idioma> idiomasEliminados;	
	public List<Idioma> idiomasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByIdioma;		
	protected JButton jButtonAbrirOrderByIdioma;
	
	
	//protected JPanel jPanelOrderByIdioma;
	//public JScrollPane jScrollPanelOrderByIdioma;	
	//protected JButton jButtonCerrarOrderByIdioma;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public IdiomaLogic idiomaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosIdioma;
	public JScrollPane jScrollPanelDatosEdicionIdioma;
	public JScrollPane jScrollPanelDatosGeneralIdioma;
    
	
	
	//public JScrollPane jScrollPanelDatosIdiomaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoIdioma;
	//public JScrollPane jScrollPanelImportacionIdioma;
	
	
	
	protected JPanel jPanelAccionesIdioma;
	
    protected JPanel jPanelPaginacionIdioma;
    protected JPanel jPanelParametrosReportesIdioma;
	protected JPanel jPanelParametrosReportesAccionesIdioma;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Idioma;
	protected JPanel jPanelParametrosAuxiliar2Idioma;
	protected JPanel jPanelParametrosAuxiliar3Idioma;
	protected JPanel jPanelParametrosAuxiliar4Idioma;
	//protected JPanel jPanelParametrosAuxiliar5Idioma;
	
	
	
	//protected JPanel jPanelReporteDinamicoIdioma;
	//protected JPanel jPanelImportacionIdioma;
	
	
	public JTable jTableDatosIdioma;
	
	
	
	//public JTable jTableDatosIdiomaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoIdioma;
	protected JButton jButtonDuplicarIdioma;
	protected JButton jButtonCopiarIdioma;
	protected JButton jButtonVerFormIdioma;
	protected JButton jButtonNuevoRelacionesIdioma;
	protected JButton jButtonModificarIdioma;
	
    protected JButton jButtonGuardarCambiosTablaIdioma;
	protected JButton jButtonCerrarIdioma;
	
	
	protected JButton jButtonRecargarInformacionIdioma;
	protected JButton jButtonProcesarInformacionIdioma;
	
	
	protected JButton jButtonAnterioresIdioma;
	protected JButton jButtonSiguientesIdioma;
	protected JButton jButtonNuevoGuardarCambiosIdioma;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoIdioma;
	//protected JButton jButtonCerrarReporteDinamicoIdioma;
	//protected JButton jButtonGenerarExcelReporteDinamicoIdioma;	
	
	
	
	//protected JButton jButtonAbrirImportacionIdioma;
	//protected JButton jButtonGenerarImportacionIdioma;
	//protected JButton jButtonCerrarImportacionIdioma;
	//protected JFileChooser jFileChooserImportacionIdioma;
	//protected File fileImportacionIdioma;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarIdioma;
	protected JButton jButtonDuplicarToolBarIdioma;
	protected JButton jButtonNuevoRelacionesToolBarIdioma;
	
	
	public JButton jButtonGuardarCambiosToolBarIdioma;
	protected JButton jButtonCopiarToolBarIdioma;
	protected JButton jButtonVerFormToolBarIdioma;
	public JButton jButtonGuardarCambiosTablaToolBarIdioma;
	protected JButton jButtonMostrarOcultarTablaToolBarIdioma;
	protected JButton jButtonCerrarToolBarIdioma;
	
	protected JButton jButtonRecargarInformacionToolBarIdioma;
	protected JButton jButtonProcesarInformacionToolBarIdioma;
	protected JButton jButtonAnterioresToolBarIdioma;
	protected JButton jButtonSiguientesToolBarIdioma;
	protected JButton jButtonNuevoGuardarCambiosToolBarIdioma;
	protected JButton jButtonAbrirOrderByToolBarIdioma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoIdioma;
	protected JMenuItem jMenuItemDuplicarIdioma;
	protected JMenuItem jMenuItemNuevoRelacionesIdioma;
	
	
	protected JMenuItem jMenuItemGuardarCambiosIdioma;
	protected JMenuItem jMenuItemCopiarIdioma;
	protected JMenuItem jMenuItemVerFormIdioma;
	protected JMenuItem jMenuItemGuardarCambiosTablaIdioma;
	protected JMenuItem jMenuItemCerrarIdioma;
	protected JMenuItem jMenuItemDetalleCerrarIdioma;
	protected JMenuItem jMenuItemDetalleAbrirOrderByIdioma;
	protected JMenuItem jMenuItemDetalleMostarOcultarIdioma;
	
	protected JMenuItem jMenuItemRecargarInformacionIdioma;
	protected JMenuItem jMenuItemProcesarInformacionIdioma;
	protected JMenuItem jMenuItemAnterioresIdioma;
	protected JMenuItem jMenuItemSiguientesIdioma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosIdioma;
	protected JMenuItem jMenuItemAbrirOrderByIdioma;
	protected JMenuItem jMenuItemMostrarOcultarIdioma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesIdioma;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosIdioma;
	protected JCheckBox jCheckBoxSeleccionadosIdioma;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaIdioma;
	protected JCheckBox jCheckBoxConGraficoReporteIdioma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesIdioma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesIdioma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoIdioma;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoIdioma;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesIdioma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionIdioma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesIdioma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesIdioma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarIdioma;
	protected JTextField jTextFieldValorCampoGeneralIdioma;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteIdioma;
	//public JList<Reporte> jListColumnasSelectReporteIdioma;
	//public JScrollPane jScrollColumnasSelectReporteIdioma;
	
	//public JLabel jLabelRelacionesSelectReporteIdioma;
	//public JList<Reporte> jListRelacionesSelectReporteIdioma;
	//public JScrollPane jScrollRelacionesSelectReporteIdioma;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoIdioma;
	//protected JCheckBox jCheckBoxConGraficoDinamicoIdioma;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoIdioma;
	//public JLabel jLabelTiposArchivoReporteDinamicoIdioma;
	
		
	//public JLabel jLabelArchivoImportacionIdioma;	
	//public JLabel jLabelPathArchivoImportacionIdioma;
	//protected JTextField jTextFieldPathArchivoImportacionIdioma;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoIdioma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoIdioma;
	
	//public JLabel jLabelColumnaCategoriaValorIdioma;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorIdioma;
	
	//public JLabel jLabelColumnasValoresGraficoIdioma;
	//public JList<Reporte> jListColumnasValoresGraficoIdioma;
	//public JScrollPane jScrollColumnasValoresGraficoIdioma;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoIdioma;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoIdioma;	
	
	
	
	
	
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
	public IdiomaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Idioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IdiomaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Idioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IdiomaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Idioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IdiomaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Idioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionIdioma)	{
		this.jButtonRecargarInformacionIdioma = jButtonRecargarInformacionIdioma;
	}
	
	public JButton getjButtonProcesarInformacionIdioma() {
		return this.jButtonProcesarInformacionIdioma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionIdioma)	{
		this.jButtonProcesarInformacionIdioma = jButtonProcesarInformacionIdioma;
	}
	
	
	public JButton getjButtonRecargarInformacionIdioma() {
		return this.jButtonRecargarInformacionIdioma;
	}
	
	
	public List<Idioma> getidiomas() {
		return this.idiomas;
	}

	public void setidiomas(List<Idioma> idiomas) {
		this.idiomas = idiomas;
	}
	
	public List<Idioma> getidiomasAux() {
		return this.idiomasAux;
	}

	public void setidiomasAux(List<Idioma> idiomasAux) {
		this.idiomasAux = idiomasAux;
	}
	
	public List<Idioma> getidiomasEliminados() {
		return this.idiomasEliminados;
	}

	public void setIdiomasEliminados(List<Idioma> idiomasEliminados) {
		this.idiomasEliminados = idiomasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarIdioma() {
		return jComboBoxTiposSeleccionarIdioma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarIdioma(
			JComboBox jComboBoxTiposSeleccionarIdioma) {
		this.jComboBoxTiposSeleccionarIdioma = jComboBoxTiposSeleccionarIdioma;
	}
	
	public void setBorderResaltarTiposSeleccionarIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarIdioma.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarIdioma .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralIdioma() {
		return jTextFieldValorCampoGeneralIdioma;
	}

	public void setjTextFieldValorCampoGeneralIdioma(
			JTextField jTextFieldValorCampoGeneralIdioma) {
		this.jTextFieldValorCampoGeneralIdioma = jTextFieldValorCampoGeneralIdioma;
	}

	public void setBorderResaltarValorCampoGeneralIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIdioma.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralIdioma .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosIdioma() {
		return this.jCheckBoxSeleccionarTodosIdioma;
	}

	public void setjCheckBoxSeleccionarTodosIdioma(
			JCheckBox jCheckBoxSeleccionarTodosIdioma) {
		this.jCheckBoxSeleccionarTodosIdioma = jCheckBoxSeleccionarTodosIdioma;
	}

	public void setBorderResaltarSeleccionarTodosIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIdioma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosIdioma .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosIdioma() {
		return this.jCheckBoxSeleccionadosIdioma;
	}

	public void setjCheckBoxSeleccionadosIdioma(
			JCheckBox jCheckBoxSeleccionadosIdioma) {
		this.jCheckBoxSeleccionadosIdioma = jCheckBoxSeleccionadosIdioma;
	}
	
	public void setBorderResaltarSeleccionadosIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIdioma.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosIdioma .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesIdioma() {
		return this.jComboBoxTiposArchivosReportesIdioma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesIdioma(
			JComboBox jComboBoxTiposArchivosReportesIdioma) {
		this.jComboBoxTiposArchivosReportesIdioma = jComboBoxTiposArchivosReportesIdioma;
	}

	public void setBorderResaltarTiposArchivosReportesIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIdioma.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesIdioma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesIdioma() {
		return this.jComboBoxTiposReportesIdioma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesIdioma(
			JComboBox jComboBoxTiposReportesIdioma) {
		this.jComboBoxTiposReportesIdioma = jComboBoxTiposReportesIdioma;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoIdioma() {
	//	return jComboBoxTiposReportesDinamicoIdioma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoIdioma(
	//		JComboBox jComboBoxTiposReportesDinamicoIdioma) {
	//	this.jComboBoxTiposReportesDinamicoIdioma = jComboBoxTiposReportesDinamicoIdioma;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoIdioma() {
	//	return jComboBoxTiposArchivosReportesDinamicoIdioma;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoIdioma(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoIdioma) {
	//	this.jComboBoxTiposArchivosReportesDinamicoIdioma = jComboBoxTiposArchivosReportesDinamicoIdioma;
	//}
	
	public void setBorderResaltarTiposReportesIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIdioma.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesIdioma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesIdioma() {
		return this.jComboBoxTiposGraficosReportesIdioma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesIdioma(
			JComboBox jComboBoxTiposGraficosReportesIdioma) {
		this.jComboBoxTiposGraficosReportesIdioma = jComboBoxTiposGraficosReportesIdioma;
	}
	
	public void setBorderResaltarTiposGraficosReportesIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIdioma.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesIdioma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionIdioma() {
		return this.jComboBoxTiposPaginacionIdioma;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionIdioma(
			JComboBox jComboBoxTiposPaginacionIdioma) {
		this.jComboBoxTiposPaginacionIdioma = jComboBoxTiposPaginacionIdioma;
	}
	
	public void setBorderResaltarTiposPaginacionIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIdioma.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionIdioma .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesIdioma() {
		return this.jComboBoxTiposRelacionesIdioma;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesIdioma() {
		return this.jComboBoxTiposAccionesIdioma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesIdioma(
			JComboBox jComboBoxTiposRelacionesIdioma) {
		this.jComboBoxTiposRelacionesIdioma = jComboBoxTiposRelacionesIdioma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesIdioma(
			JComboBox jComboBoxTiposAccionesIdioma) {
		this.jComboBoxTiposAccionesIdioma = jComboBoxTiposAccionesIdioma;
	}
	
	public void setBorderResaltarTiposRelacionesIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIdioma.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesIdioma .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesIdioma() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIdioma.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesIdioma .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoIdioma() {
	//	return jCheckBoxConGraficoDinamicoIdioma;
	//}

	//public void setjCheckBoxConGraficoDinamicoIdioma(
	//		JCheckBox jCheckBoxConGraficoDinamicoIdioma) {
	//	this.jCheckBoxConGraficoDinamicoIdioma = jCheckBoxConGraficoDinamicoIdioma;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoIdioma() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarIdioma.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoIdioma .setBorder(borderResaltar);		
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
		this.idiomaSessionBean=new IdiomaSessionBean();
		
		this.idiomaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.idiomaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.idiomaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=IdiomaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=IdiomaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		IdiomaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		IdiomaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		IdiomaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Idioma MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
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
		
		IdiomaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Idioma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarIdioma= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarIdioma,this.jTtoolBarIdioma,
							"nuevo","nuevo","Nuevo"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarIdioma,this.jTtoolBarIdioma,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarIdioma,this.jTtoolBarIdioma,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarIdioma,this.jTtoolBarIdioma,
							"duplicar","duplicar","Duplicar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarIdioma,this.jTtoolBarIdioma,
							"copiar","copiar","Copiar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarIdioma,this.jTtoolBarIdioma,
							"ver_form","ver_form","Ver"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarIdioma,this.jTtoolBarIdioma,
							"recargar","recargar","Recargar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarIdioma,this.jTtoolBarIdioma,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarIdioma,this.jTtoolBarIdioma,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarIdioma,this.jTtoolBarIdioma,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarIdioma,this.jTtoolBarIdioma,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarIdioma,this.jTtoolBarIdioma,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarIdioma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarIdioma,this.jTtoolBarIdioma,
							"cerrar","cerrar","Salir"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarIdioma=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarIdioma;
			
				this.jButtonProcesarInformacionToolBarIdioma=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarIdioma;
				
		//protected JButton jButtonModificarToolBarIdioma;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarIdioma=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuIdioma=new JMenuMe("General");
		this.jmenuArchivoIdioma=new JMenuMe("Archivo");
		this.jmenuAccionesIdioma=new JMenuMe("Acciones");
		this.jmenuDatosIdioma=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoIdioma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoIdioma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoIdioma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarIdioma= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarIdioma.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarIdioma,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesIdioma= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesIdioma.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesIdioma,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosIdioma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosIdioma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosIdioma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarIdioma= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarIdioma.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarIdioma,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormIdioma= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormIdioma.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormIdioma,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaIdioma= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaIdioma.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaIdioma,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarIdioma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarIdioma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarIdioma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionIdioma= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionIdioma.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionIdioma,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionIdioma= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionIdioma.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionIdioma,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresIdioma= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresIdioma.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresIdioma,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesIdioma= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesIdioma.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesIdioma,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByIdioma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByIdioma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByIdioma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarIdioma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarIdioma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarIdioma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByIdioma= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByIdioma.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByIdioma,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarIdioma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarIdioma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarIdioma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosIdioma= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosIdioma.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosIdioma,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoIdioma.add(this.jMenuItemCerrarIdioma);
			
			this.jmenuAccionesIdioma.add(this.jMenuItemNuevoIdioma);
			this.jmenuAccionesIdioma.add(this.jMenuItemNuevoGuardarCambiosIdioma);
			this.jmenuAccionesIdioma.add(this.jMenuItemNuevoRelacionesIdioma);
			this.jmenuAccionesIdioma.add(this.jMenuItemGuardarCambiosTablaIdioma);		
			this.jmenuAccionesIdioma.add(this.jMenuItemDuplicarIdioma);		
			this.jmenuAccionesIdioma.add(this.jMenuItemCopiarIdioma);		
			this.jmenuAccionesIdioma.add(this.jMenuItemVerFormIdioma);		
			
			this.jmenuDatosIdioma.add(this.jMenuItemRecargarInformacionIdioma);				
			this.jmenuDatosIdioma.add(this.jMenuItemAnterioresIdioma);				
			this.jmenuDatosIdioma.add(this.jMenuItemSiguientesIdioma);				
			this.jmenuDatosIdioma.add(this.jMenuItemAbrirOrderByIdioma);				
			this.jmenuDatosIdioma.add(this.jMenuItemMostrarOcultarIdioma);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesIdioma.add(this.jMenuItemGuardarCambiosIdioma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarIdioma.add(this.jmenuArchivoIdioma);		
			this.jmenuBarIdioma.add(this.jmenuAccionesIdioma);		
			this.jmenuBarIdioma.add(this.jmenuDatosIdioma);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarIdioma);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasIdioma() {
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
			//this.jInternalFrameDetalleIdioma = new IdiomaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Idioma DATOS");
			this.jInternalFrameDetalleFormIdioma = new IdiomaDetalleFormJInternalFrame(jDesktopPane,this.idiomaSessionBean.getConGuardarRelaciones(),this.idiomaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormIdioma = null;//new IdiomaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutIdioma= new GridBagLayout();
		
		
		this.jTableDatosIdioma = new JTableMe();      
		
		String sToolTipIdioma="";
		sToolTipIdioma=IdiomaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipIdioma+="(Nomina.Idioma)";
		}
		
		if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
			sToolTipIdioma+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosIdioma.setToolTipText(sToolTipIdioma);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosIdioma);
		this.jTableDatosIdioma.setAutoCreateRowSorter(true);
		this.jTableDatosIdioma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosIdioma.setRowSelectionAllowed(true);
		this.jTableDatosIdioma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosIdioma,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoIdioma = new JButtonMe();
		this.jButtonDuplicarIdioma = new JButtonMe();
		this.jButtonCopiarIdioma = new JButtonMe();
		this.jButtonVerFormIdioma = new JButtonMe();
		this.jButtonNuevoRelacionesIdioma = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaIdioma = new JButtonMe();
		this.jButtonCerrarIdioma = new JButtonMe();
		
		this.jScrollPanelDatosIdioma = new JScrollPane();   
        this.jScrollPanelDatosGeneralIdioma = new JScrollPane();
		
				
		
		
		this.jPanelAccionesIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Idioma";
		
		if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Idiomas" + this.sPath));
		} else {
			this.jScrollPanelDatosIdioma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesIdioma.setToolTipText("Acciones");
        this.jPanelAccionesIdioma.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosIdioma, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoIdioma=new ReporteDinamicoJInternalFrame(IdiomaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoIdioma();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionIdioma=new ImportacionJInternalFrame(IdiomaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionIdioma();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByIdioma = new JButtonMe();
		
		this.jButtonAbrirOrderByIdioma.setText("Orden");
		this.jButtonAbrirOrderByIdioma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByIdioma,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByIdioma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIdioma,false,this);
			
			//this.cargarOrderByIdioma(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByIdioma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIdioma,true,this);
			
			//this.cargarOrderByIdioma(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosIdioma.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosIdioma.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosIdioma.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosIdioma.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosIdioma.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosIdioma.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoIdioma.setText("Nuevo");
		this.jButtonDuplicarIdioma.setText("Duplicar");
		this.jButtonCopiarIdioma.setText("Copiar");
		this.jButtonVerFormIdioma.setText("Ver");
		this.jButtonNuevoRelacionesIdioma.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaIdioma.setText("Guardar");
		this.jButtonCerrarIdioma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoIdioma,"nuevo_button","Nuevo",this.idiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarIdioma,"duplicar_button","Duplicar",this.idiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarIdioma,"copiar_button","Copiar",this.idiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormIdioma,"ver_form","Ver",this.idiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesIdioma,"nuevorelaciones_button","Nuevo Rel",this.idiomaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaIdioma,"guardarcambiostabla_button","Guardar",this.idiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarIdioma,"cerrar_button","Salir",this.idiomaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesIdioma, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoIdioma.setToolTipText("Nuevo"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarIdioma.setToolTipText("Duplicar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarIdioma.setToolTipText("Copiar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormIdioma.setToolTipText("Ver"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesIdioma.setToolTipText("Nuevo Rel"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaIdioma.setToolTipText("Guardar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarIdioma.setToolTipText("Salir"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoIdioma";
		inputMap = this.jButtonNuevoIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoIdioma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoIdioma"));
		
		//DUPLICAR
		sMapKey = "DuplicarIdioma";
		inputMap = this.jButtonDuplicarIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarIdioma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarIdioma"));
		
		//COPIAR
		sMapKey = "CopiarIdioma";
		inputMap = this.jButtonCopiarIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarIdioma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarIdioma"));
		
		//VEr FORM
		sMapKey = "VerFormIdioma";
		inputMap = this.jButtonVerFormIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormIdioma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormIdioma"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesIdioma";
		inputMap = this.jButtonNuevoRelacionesIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesIdioma"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarIdioma";
		inputMap = this.jButtonModificarIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarIdioma"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarIdioma";
		inputMap = this.jButtonCerrarIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarIdioma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaIdioma";
		inputMap = this.jButtonGuardarCambiosTablaIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaIdioma"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Idioma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Idioma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Idioma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Idioma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Idioma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesIdioma.setName("jPanelParametrosReportesIdioma"); 
		
		this.jPanelParametrosReportesAccionesIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesIdioma.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesIdioma.setName("jPanelParametrosReportesAccionesIdioma"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesIdioma, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionIdioma = new JButtonMe();
		this.jButtonRecargarInformacionIdioma.setText("Recargar");
		this.jButtonRecargarInformacionIdioma.setToolTipText("Recargar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionIdioma,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionIdioma = new JButtonMe();
		this.jButtonProcesarInformacionIdioma.setText("Procesar");
		this.jButtonProcesarInformacionIdioma.setToolTipText("Procesar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionIdioma.setVisible(false);
			
		this.jButtonProcesarInformacionIdioma.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionIdioma.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionIdioma.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesIdioma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesIdioma.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesIdioma.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesIdioma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesIdioma.setText("TIPO");       
		this.jComboBoxTiposReportesIdioma.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesIdioma = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesIdioma.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesIdioma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionIdioma = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionIdioma.setText("Paginacion");
		this.jComboBoxTiposPaginacionIdioma.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesIdioma = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesIdioma.setText("Accion");
		this.jComboBoxTiposRelacionesIdioma.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesIdioma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesIdioma.setText("Accion");
		this.jComboBoxTiposAccionesIdioma.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarIdioma = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarIdioma.setText("Accion");
		this.jComboBoxTiposSeleccionarIdioma.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralIdioma=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralIdioma.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralIdioma.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralIdioma.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesIdioma = new JLabelMe();
		
		this.jLabelAccionesIdioma.setText("Acciones");		
		this.jLabelAccionesIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosIdioma = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosIdioma.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosIdioma.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosIdioma = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosIdioma.setText("Seleccionados");
		this.jCheckBoxSeleccionadosIdioma.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaIdioma = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaIdioma.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaIdioma.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteIdioma = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteIdioma.setText("Graf.");
		this.jCheckBoxConGraficoReporteIdioma.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresIdioma = new JButtonMe();
		//this.jButtonAnterioresIdioma.setText("<<");
        this.jButtonAnterioresIdioma.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresIdioma,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesIdioma = new JButtonMe();
		//this.jButtonSiguientesIdioma.setText(">>");
        this.jButtonSiguientesIdioma.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesIdioma,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosIdioma = new JButtonMe();
		this.jButtonNuevoGuardarCambiosIdioma.setText("Nue");
        this.jButtonNuevoGuardarCambiosIdioma.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosIdioma,"nuevoguardarcambios_button","Nue",this.idiomaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosIdioma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosIdioma";
		inputMap = this.jButtonNuevoGuardarCambiosIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosIdioma"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionIdioma";
		inputMap = this.jButtonRecargarInformacionIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionIdioma"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesIdioma";
		inputMap = this.jButtonSiguientesIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesIdioma"));
		
		//ANTERIORES		
		sMapKey = "AnterioresIdioma";
		inputMap = this.jButtonAnterioresIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresIdioma"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasIdioma();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesIdioma.setMinimumSize(new Dimension(this.getWidth(),IdiomaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(IdiomaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesIdioma.setMaximumSize(new Dimension(this.getWidth(),IdiomaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(IdiomaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesIdioma.setPreferredSize(new Dimension(this.getWidth(),IdiomaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(IdiomaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionIdioma = new GridBagLayout();

			this.jPanelPaginacionIdioma.setLayout(gridaBagLayoutPaginacionIdioma);						
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.gridy = 0;
			this.gridBagConstraintsIdioma.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionIdioma.add(this.jButtonAnterioresIdioma, this.gridBagConstraintsIdioma);
					
						
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsIdioma.gridy = 0;
			
			this.jPanelPaginacionIdioma.add(this.jButtonNuevoGuardarCambiosIdioma, this.gridBagConstraintsIdioma);
						
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsIdioma.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsIdioma.gridy = 0;
			this.jPanelPaginacionIdioma.add(this.jButtonSiguientesIdioma, this.gridBagConstraintsIdioma);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.gridy = 1;
			this.gridBagConstraintsIdioma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIdioma.add(this.jButtonNuevoIdioma, this.gridBagConstraintsIdioma);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsIdioma = new GridBagConstraints();
				this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsIdioma.gridy = 1;
				this.gridBagConstraintsIdioma.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionIdioma.add(this.jButtonNuevoRelacionesIdioma, this.gridBagConstraintsIdioma);
			}
			
			
			if(!this.idiomaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsIdioma = new GridBagConstraints();
				this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsIdioma.gridy = 1;
				this.gridBagConstraintsIdioma.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionIdioma.add(this.jButtonGuardarCambiosTablaIdioma, this.gridBagConstraintsIdioma);
			}
			
			
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.gridy = 1;
			this.gridBagConstraintsIdioma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIdioma.add(this.jButtonDuplicarIdioma, this.gridBagConstraintsIdioma);
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.gridy = 1;
			this.gridBagConstraintsIdioma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIdioma.add(this.jButtonCopiarIdioma, this.gridBagConstraintsIdioma);
		
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.gridy = 1;
			this.gridBagConstraintsIdioma.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIdioma.add(this.jButtonVerFormIdioma, this.gridBagConstraintsIdioma);
		
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.gridy = 1;
			this.gridBagConstraintsIdioma.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionIdioma.add(this.jButtonCerrarIdioma, this.gridBagConstraintsIdioma);
		
		
		
		this.jButtonRecargarInformacionIdioma.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionIdioma.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionIdioma.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionIdioma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesIdioma.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesIdioma.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesIdioma.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesIdioma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesIdioma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesIdioma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesIdioma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesIdioma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesIdioma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionIdioma.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionIdioma.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionIdioma.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesIdioma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesIdioma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesIdioma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesIdioma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIdioma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIdioma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarIdioma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarIdioma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarIdioma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaIdioma.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaIdioma.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaIdioma.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteIdioma.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteIdioma.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteIdioma.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteIdioma, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosIdioma.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosIdioma.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosIdioma.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosIdioma.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosIdioma.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosIdioma.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesIdioma = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesIdioma = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Idioma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Idioma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Idioma = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Idioma = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesIdioma.setLayout(gridaBagParametrosReportesIdioma);
			this.jPanelParametrosReportesAccionesIdioma.setLayout(gridaBagParametrosReportesAccionesIdioma);
			
			
			this.jPanelParametrosAuxiliar1Idioma.setLayout(gridaBagParametrosAuxiliar1Idioma);
			this.jPanelParametrosAuxiliar2Idioma.setLayout(gridaBagParametrosAuxiliar2Idioma);
			this.jPanelParametrosAuxiliar3Idioma.setLayout(gridaBagParametrosAuxiliar3Idioma);
			this.jPanelParametrosAuxiliar4Idioma.setLayout(gridaBagParametrosAuxiliar4Idioma);
			//this.jPanelParametrosAuxiliar5Idioma.setLayout(gridaBagParametrosAuxiliar2Idioma);			
			
			
			
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIdioma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIdioma.add(this.jButtonRecargarInformacionIdioma, this.gridBagConstraintsIdioma);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsIdioma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Idioma.add(this.jComboBoxTiposPaginacionIdioma, this.gridBagConstraintsIdioma);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsIdioma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Idioma.add(this.jCheckBoxConAltoMaximoTablaIdioma, this.gridBagConstraintsIdioma);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsIdioma.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Idioma.add(this.jComboBoxTiposArchivosReportesIdioma, this.gridBagConstraintsIdioma);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIdioma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIdioma.add(this.jPanelParametrosAuxiliar1Idioma, this.gridBagConstraintsIdioma);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIdioma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Idioma.add(this.jComboBoxTiposReportesIdioma, this.gridBagConstraintsIdioma);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIdioma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIdioma.add(this.jPanelParametrosAuxiliar4Idioma, this.gridBagConstraintsIdioma);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsIdioma.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIdioma.add(this.jComboBoxTiposReportesIdioma, this.gridBagConstraintsIdioma);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIdioma.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIdioma.add(this.jCheckBoxGenerarReporteIdioma, this.gridBagConstraintsIdioma);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIdioma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIdioma.add(this.jPanelParametrosAuxiliar2Idioma, this.gridBagConstraintsIdioma);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIdioma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIdioma.add(this.jLabelAccionesIdioma, this.gridBagConstraintsIdioma);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsIdioma = new GridBagConstraints();
				this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsIdioma.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsIdioma.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesIdioma.add(this.jButtonAbrirOrderByIdioma, this.gridBagConstraintsIdioma);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIdioma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIdioma.add(this.jComboBoxTiposSeleccionarIdioma, this.gridBagConstraintsIdioma);			
			
			
			/*
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIdioma.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIdioma.add(this.jCheckBoxSeleccionarTodosIdioma, this.gridBagConstraintsIdioma);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIdioma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Idioma.add(this.jCheckBoxSeleccionarTodosIdioma, this.gridBagConstraintsIdioma);															
				
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIdioma.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Idioma.add(this.jCheckBoxSeleccionadosIdioma, this.gridBagConstraintsIdioma);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIdioma.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIdioma.add(this.jPanelParametrosAuxiliar3Idioma, this.gridBagConstraintsIdioma);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIdioma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIdioma.add(this.jComboBoxTiposRelacionesIdioma, this.gridBagConstraintsIdioma);
				
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIdioma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIdioma.add(this.jComboBoxTiposAccionesIdioma, this.gridBagConstraintsIdioma);
	
				
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIdioma.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIdioma.add(this.jTextFieldValorCampoGeneralIdioma, this.gridBagConstraintsIdioma);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosIdioma = new GridBagLayout();

			this.jScrollPanelDatosIdioma.setLayout(gridaBagLayoutDatosIdioma);
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.gridy = 0;
			this.gridBagConstraintsIdioma.gridx = 0;
			
			this.jScrollPanelDatosIdioma.add(this.jTableDatosIdioma, this.gridBagConstraintsIdioma);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosIdioma.setViewportView(this.jTableDatosIdioma);
		this.jTableDatosIdioma.setFillsViewportHeight(true);
		this.jTableDatosIdioma.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesIdioma= new GridBagLayout();
		this.jPanelAccionesIdioma.setLayout(gridaBagLayoutAccionesIdioma);
		
		
		/*	
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIdioma.gridy = 0;
		this.gridBagConstraintsIdioma.gridx = 0;
			
		this.jPanelAccionesIdioma.add(this.jButtonNuevoIdioma, this.gridBagConstraintsIdioma);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutIdioma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutIdioma);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.idiomaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsIdioma = new GridBagConstraints();						
			this.gridBagConstraintsIdioma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsIdioma.gridx = 0;		
			//this.gridBagConstraintsIdioma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsIdioma.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarIdioma, this.gridBagConstraintsIdioma);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy = iGridyPrincipal++;
		this.gridBagConstraintsIdioma.gridx = 0;		
		//this.gridBagConstraintsIdioma.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIdioma.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsIdioma.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsIdioma);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIdioma.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesIdioma, this.gridBagConstraintsIdioma);								
		
		
		/*
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIdioma.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesIdioma, this.gridBagConstraintsIdioma);
		*/		
		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsIdioma.gridx =0;
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsIdioma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosIdioma, this.gridBagConstraintsIdioma);
				
		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIdioma.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionIdioma, this.gridBagConstraintsIdioma);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(IdiomaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosIdioma= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosIdioma = new GridBagLayout();
			this.jPanelBusquedasParametrosIdioma.setLayout(gridaBagLayoutBusquedasParametrosIdioma);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralIdioma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralIdioma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIdioma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIdioma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIdioma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposIdioma, this.gridBagConstraintsIdioma);
			
			
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIdioma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosIdioma, this.gridBagConstraintsIdioma);
		
			
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsIdioma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesIdioma, this.gridBagConstraintsIdioma);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralIdioma;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoIdioma() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoIdioma = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoIdioma.setName("jPanelReporteDinamicoIdioma"); 
		
		this.jPanelReporteDinamicoIdioma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoIdioma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoIdioma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoIdioma.setLayout(gridaBagLayoutReporteDinamicoIdioma);
		
		
		this.jInternalFrameReporteDinamicoIdioma= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoIdioma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteIdioma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoIdioma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoIdioma.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoIdioma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoIdioma.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoIdioma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoIdioma.setResizable(true);
	    this.jInternalFrameReporteDinamicoIdioma.setClosable(true);
	    this.jInternalFrameReporteDinamicoIdioma.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoIdioma.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoIdioma.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoIdioma.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Idiomas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteIdioma = new JLabelMe();

		this.jLabelColumnasSelectReporteIdioma.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIdioma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIdioma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoIdioma.add(this.jLabelColumnasSelectReporteIdioma, this.gridBagConstraintsIdioma);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteIdioma = new JList<Reporte>();
		this.jListColumnasSelectReporteIdioma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteIdioma.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteIdioma.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteIdioma.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteIdioma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteIdioma=new JScrollPane(this.jListColumnasSelectReporteIdioma);
			
			this.jScrollColumnasSelectReporteIdioma.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteIdioma.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteIdioma.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIdioma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIdioma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoIdioma.add(this.jListColumnasSelectReporteIdioma, this.gridBagConstraintsIdioma);
		this.jPanelReporteDinamicoIdioma.add(this.jScrollColumnasSelectReporteIdioma, this.gridBagConstraintsIdioma);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteIdioma = new JLabelMe();

		this.jLabelRelacionesSelectReporteIdioma.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIdioma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIdioma.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoIdioma.add(this.jLabelRelacionesSelectReporteIdioma, this.gridBagConstraintsIdioma);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteIdioma = new JList<Reporte>();
		this.jListRelacionesSelectReporteIdioma.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteIdioma.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteIdioma.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteIdioma.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteIdioma.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteIdioma=new JScrollPane(this.jListRelacionesSelectReporteIdioma);
			
			this.jScrollRelacionesSelectReporteIdioma.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteIdioma.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteIdioma.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIdioma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIdioma.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoIdioma.add(this.jListRelacionesSelectReporteIdioma, this.gridBagConstraintsIdioma);
		this.jPanelReporteDinamicoIdioma.add(this.jScrollRelacionesSelectReporteIdioma, this.gridBagConstraintsIdioma);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoIdioma = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoIdioma = new JComboBoxMe();
		this.jListColumnasValoresGraficoIdioma = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoIdioma = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoIdioma.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoIdioma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoIdioma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoIdioma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoIdioma = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoIdioma.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoIdioma.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoIdioma.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoIdioma.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoIdioma = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoIdioma.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIdioma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIdioma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIdioma.add(this.jLabelGenerarExcelReporteDinamicoIdioma, this.gridBagConstraintsIdioma);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoIdioma = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoIdioma.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoIdioma,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoIdioma.setToolTipText("Generar EXCEL"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsIdioma = new GridBagConstraints();
		//this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsIdioma.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsIdioma.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoIdioma.add(this.jButtonGenerarExcelReporteDinamicoIdioma, this.gridBagConstraintsIdioma);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIdioma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIdioma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIdioma.add(this.jComboBoxTiposReportesDinamicoIdioma, this.gridBagConstraintsIdioma);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoIdioma = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoIdioma.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIdioma.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIdioma.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIdioma.add(this.jLabelTiposArchivoReporteDinamicoIdioma, this.gridBagConstraintsIdioma);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIdioma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIdioma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIdioma.add(this.jComboBoxTiposArchivosReportesDinamicoIdioma, this.gridBagConstraintsIdioma);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoIdioma = new JButtonMe();
		this.jButtonGenerarReporteDinamicoIdioma.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoIdioma,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoIdioma.setToolTipText("Generar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIdioma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIdioma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIdioma.add(this.jButtonGenerarReporteDinamicoIdioma, this.gridBagConstraintsIdioma);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoIdioma = new JButtonMe();
		this.jButtonCerrarReporteDinamicoIdioma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoIdioma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoIdioma.setToolTipText("Cancelar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIdioma.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIdioma.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIdioma.add(this.jButtonCerrarReporteDinamicoIdioma, this.gridBagConstraintsIdioma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalIdioma = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoIdioma= new JScrollPane(jPanelReporteDinamicoIdioma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoIdioma.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoIdioma.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoIdioma.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Idiomas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsIdioma.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoIdioma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoIdioma.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalIdioma);
		this.jInternalFrameReporteDinamicoIdioma.getContentPane().add(this.jScrollPanelReporteDinamicoIdioma, this.gridBagConstraintsIdioma);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionIdioma() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionIdioma = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionIdioma.setName("jPanelImportacionIdioma"); 
		
		this.jPanelImportacionIdioma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionIdioma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionIdioma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionIdioma.setLayout(gridaBagLayoutImportacionIdioma);
		
		
		this.jInternalFrameImportacionIdioma= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionIdioma= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionIdioma = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteIdioma= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionIdioma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionIdioma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionIdioma.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionIdioma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionIdioma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionIdioma.setResizable(true);
	    this.jInternalFrameImportacionIdioma.setClosable(true);
	    this.jInternalFrameImportacionIdioma.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionIdioma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionIdioma.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionIdioma.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionIdioma.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionIdioma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionIdioma.setResizable(true);
	    this.jInternalFrameImportacionIdioma.setClosable(true);
	    this.jInternalFrameImportacionIdioma.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionIdioma.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionIdioma.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionIdioma.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Idiomas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionIdioma = new JLabelMe();

		this.jLabelArchivoImportacionIdioma.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIdioma.gridy = iPosYImportacion;		
		this.gridBagConstraintsIdioma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionIdioma.add(this.jLabelArchivoImportacionIdioma, this.gridBagConstraintsIdioma);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionIdioma = new JFileChooser();		
		this.jFileChooserImportacionIdioma.setToolTipText("ESCOGER ARCHIVO"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionIdioma = new JButtonMe();
		this.jButtonAbrirImportacionIdioma.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionIdioma,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionIdioma.setToolTipText("Generar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIdioma.gridy = iPosYImportacion;
		this.gridBagConstraintsIdioma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIdioma.add(this.jButtonAbrirImportacionIdioma, this.gridBagConstraintsIdioma);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionIdioma = new JLabelMe();

		this.jLabelPathArchivoImportacionIdioma.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionIdioma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionIdioma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionIdioma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIdioma.gridy = iPosYImportacion;		
		this.gridBagConstraintsIdioma.gridx = iPosXImportacion++;
			
		this.jPanelImportacionIdioma.add(this.jLabelPathArchivoImportacionIdioma, this.gridBagConstraintsIdioma);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionIdioma=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionIdioma.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionIdioma.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionIdioma.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIdioma.gridy = iPosYImportacion;
		this.gridBagConstraintsIdioma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIdioma.add(this.jTextFieldPathArchivoImportacionIdioma, this.gridBagConstraintsIdioma);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionIdioma = new JButtonMe();
		this.jButtonGenerarImportacionIdioma.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionIdioma,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionIdioma.setToolTipText("Generar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIdioma.gridy = iPosYImportacion;
		this.gridBagConstraintsIdioma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIdioma.add(this.jButtonGenerarImportacionIdioma, this.gridBagConstraintsIdioma);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionIdioma = new JButtonMe();
		this.jButtonCerrarImportacionIdioma.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionIdioma,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionIdioma.setToolTipText("Cancelar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIdioma.gridy = iPosYImportacion;
		this.gridBagConstraintsIdioma.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIdioma.add(this.jButtonCerrarImportacionIdioma, this.gridBagConstraintsIdioma);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalIdioma = new GridBagLayout();
		
		this.jScrollPanelImportacionIdioma= new JScrollPane(jPanelImportacionIdioma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsIdioma = new GridBagConstraints();
		this.gridBagConstraintsIdioma.gridy =iPosYImportacion;
		this.gridBagConstraintsIdioma.gridx =iPosXImportacion;
		this.gridBagConstraintsIdioma.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionIdioma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionIdioma.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalIdioma);
		this.jInternalFrameImportacionIdioma.getContentPane().add(this.jScrollPanelImportacionIdioma, this.gridBagConstraintsIdioma);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByIdioma(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByIdioma = new JButtonMe();
			this.jButtonAbrirOrderByIdioma.setText("Orden");
			this.jButtonAbrirOrderByIdioma.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByIdioma,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByIdioma";
			inputMap = this.jButtonAbrirOrderByIdioma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByIdioma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByIdioma"));
		
		
			GridBagLayout gridaBagLayoutOrderByIdioma = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByIdioma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByIdioma.setName("jPanelOrderByIdioma"); 
			
			this.jPanelOrderByIdioma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByIdioma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByIdioma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByIdioma.setLayout(gridaBagLayoutOrderByIdioma);
			
			
			this.jTableDatosIdiomaOrderBy = new JTableMe();        
			this.jTableDatosIdiomaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosIdiomaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosIdiomaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosIdiomaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosIdiomaOrderBy.setViewportView(this.jTableDatosIdiomaOrderBy);
			this.jTableDatosIdiomaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosIdiomaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByIdioma= new OrderByJInternalFrame();
			this.jInternalFrameOrderByIdioma= new OrderByJInternalFrame();
			this.jScrollPanelOrderByIdioma = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteIdioma= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByIdioma.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByIdioma.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByIdioma.setTitle("Orden");
			this.jInternalFrameOrderByIdioma.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByIdioma.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByIdioma.setResizable(true);
			this.jInternalFrameOrderByIdioma.setClosable(true);
			this.jInternalFrameOrderByIdioma.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByIdioma.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByIdioma.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByIdioma.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Idiomas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.gridy =iPosYOrderBy++;
			this.gridBagConstraintsIdioma.gridx =iPosXOrderBy;
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsIdioma.ipady =150;
				
			this.jPanelOrderByIdioma.add(jScrollPanelDatosIdiomaOrderBy, this.gridBagConstraintsIdioma);//this.jTableDatosIdiomaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByIdioma = new JButtonMe();
			this.jButtonCerrarOrderByIdioma.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByIdioma,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByIdioma.setToolTipText("Cancelar"+" "+IdiomaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByIdioma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIdioma.gridy = iPosYOrderBy++;
			this.gridBagConstraintsIdioma.gridx = iPosXOrderBy;
									
			this.jPanelOrderByIdioma.add(this.jButtonCerrarOrderByIdioma, this.gridBagConstraintsIdioma);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalIdioma = new GridBagLayout();
			
			this.jScrollPanelOrderByIdioma= new JScrollPane(jPanelOrderByIdioma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsIdioma = new GridBagConstraints();
			this.gridBagConstraintsIdioma.gridy =iPosYOrderBy;
			this.gridBagConstraintsIdioma.gridx =iPosXOrderBy;
			this.gridBagConstraintsIdioma.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByIdioma.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByIdioma.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalIdioma);
			
			this.jInternalFrameOrderByIdioma.getContentPane().add(this.jScrollPanelOrderByIdioma, this.gridBagConstraintsIdioma);			
		
		} else {
			this.jButtonAbrirOrderByIdioma = new JButtonMe();
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
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.idiomaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosIdioma.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosIdioma.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosIdioma.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosIdioma.getRowHeight();//IdiomaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > IdiomaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaIdioma.isSelected()) {
					iHeightTable=IdiomaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < IdiomaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=IdiomaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > IdiomaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaIdioma.isSelected()) {
					iHeightTable=IdiomaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < IdiomaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=IdiomaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosIdioma.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosIdioma.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosIdioma.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosIdioma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosIdioma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosIdioma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByIdioma!=null && this.jInternalFrameOrderByIdioma.getjTableDatosOrderBy()!=null) {
			//if(!this.idiomaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByIdioma.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByIdioma.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByIdioma.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByIdioma.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByIdioma.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByIdioma.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByIdioma.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosIdioma.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosIdioma.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosIdioma.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=idiomaLogic.getIdiomas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=idiomas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Idioma> TraerIdiomaBeans(List<Idioma> idiomas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Idioma idioma:idiomas) {
					
				if(!(IdiomaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || IdiomaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					idioma.setsDetalleGeneralEntityReporte(IdiomaConstantesFunciones.getIdiomaDescripcion(idioma));
										
						
					
					

					if(idioma.getEmpleadoIdiomas()!=null && Funciones.existeClass(classes,EmpleadoIdioma.class)) {
						try{idioma.setempleadoidiomasDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoIdiomaJInternalFrame.TraerEmpleadoIdiomaBeans(idioma.getEmpleadoIdiomas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//idioma.setsDetalleGeneralEntityReporte(idioma.getsDetalleGeneralEntityReporte());
										
				}
				
				//idiomabeans.add(idiomabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return idiomas;
    }
	//PARA REPORTES FIN
}
