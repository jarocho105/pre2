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
import com.bydan.erp.contabilidad.util.NivelCuentaContableConstantesFunciones;

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
public class NivelCuentaContableJInternalFrame extends NivelCuentaContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNivelCuentaContable;
	
	protected JMenuBar jmenuBarNivelCuentaContable;
	
	protected JMenu jmenuNivelCuentaContable;
	protected JMenu jmenuDatosNivelCuentaContable;
	protected JMenu jmenuArchivoNivelCuentaContable;
	protected JMenu jmenuAccionesNivelCuentaContable;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNivelCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNivelCuentaContable;	
	protected GridBagConstraints gridBagConstraintsNivelCuentaContable;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NivelCuentaContableDetalleFormJInternalFrame jInternalFrameDetalleFormNivelCuentaContable;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNivelCuentaContable;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNivelCuentaContable;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public NivelCuentaContableSessionBean nivelcuentacontableSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<NivelCuentaContable> nivelcuentacontables;		
	public List<NivelCuentaContable> nivelcuentacontablesEliminados;	
	public List<NivelCuentaContable> nivelcuentacontablesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNivelCuentaContable;		
	protected JButton jButtonAbrirOrderByNivelCuentaContable;
	
	
	//protected JPanel jPanelOrderByNivelCuentaContable;
	//public JScrollPane jScrollPanelOrderByNivelCuentaContable;	
	//protected JButton jButtonCerrarOrderByNivelCuentaContable;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NivelCuentaContableLogic nivelcuentacontableLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNivelCuentaContable;
	public JScrollPane jScrollPanelDatosEdicionNivelCuentaContable;
	public JScrollPane jScrollPanelDatosGeneralNivelCuentaContable;
    
	
	
	//public JScrollPane jScrollPanelDatosNivelCuentaContableOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNivelCuentaContable;
	//public JScrollPane jScrollPanelImportacionNivelCuentaContable;
	
	
	
	protected JPanel jPanelAccionesNivelCuentaContable;
	
    protected JPanel jPanelPaginacionNivelCuentaContable;
    protected JPanel jPanelParametrosReportesNivelCuentaContable;
	protected JPanel jPanelParametrosReportesAccionesNivelCuentaContable;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1NivelCuentaContable;
	protected JPanel jPanelParametrosAuxiliar2NivelCuentaContable;
	protected JPanel jPanelParametrosAuxiliar3NivelCuentaContable;
	protected JPanel jPanelParametrosAuxiliar4NivelCuentaContable;
	//protected JPanel jPanelParametrosAuxiliar5NivelCuentaContable;
	
	
	
	//protected JPanel jPanelReporteDinamicoNivelCuentaContable;
	//protected JPanel jPanelImportacionNivelCuentaContable;
	
	
	public JTable jTableDatosNivelCuentaContable;
	
	
	
	//public JTable jTableDatosNivelCuentaContableOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNivelCuentaContable;
	protected JButton jButtonDuplicarNivelCuentaContable;
	protected JButton jButtonCopiarNivelCuentaContable;
	protected JButton jButtonVerFormNivelCuentaContable;
	protected JButton jButtonNuevoRelacionesNivelCuentaContable;
	protected JButton jButtonModificarNivelCuentaContable;
	
    protected JButton jButtonGuardarCambiosTablaNivelCuentaContable;
	protected JButton jButtonCerrarNivelCuentaContable;
	
	
	protected JButton jButtonRecargarInformacionNivelCuentaContable;
	protected JButton jButtonProcesarInformacionNivelCuentaContable;
	
	
	protected JButton jButtonAnterioresNivelCuentaContable;
	protected JButton jButtonSiguientesNivelCuentaContable;
	protected JButton jButtonNuevoGuardarCambiosNivelCuentaContable;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNivelCuentaContable;
	//protected JButton jButtonCerrarReporteDinamicoNivelCuentaContable;
	//protected JButton jButtonGenerarExcelReporteDinamicoNivelCuentaContable;	
	
	
	
	//protected JButton jButtonAbrirImportacionNivelCuentaContable;
	//protected JButton jButtonGenerarImportacionNivelCuentaContable;
	//protected JButton jButtonCerrarImportacionNivelCuentaContable;
	//protected JFileChooser jFileChooserImportacionNivelCuentaContable;
	//protected File fileImportacionNivelCuentaContable;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNivelCuentaContable;
	protected JButton jButtonDuplicarToolBarNivelCuentaContable;
	protected JButton jButtonNuevoRelacionesToolBarNivelCuentaContable;
	
	
	public JButton jButtonGuardarCambiosToolBarNivelCuentaContable;
	protected JButton jButtonCopiarToolBarNivelCuentaContable;
	protected JButton jButtonVerFormToolBarNivelCuentaContable;
	public JButton jButtonGuardarCambiosTablaToolBarNivelCuentaContable;
	protected JButton jButtonMostrarOcultarTablaToolBarNivelCuentaContable;
	protected JButton jButtonCerrarToolBarNivelCuentaContable;
	
	protected JButton jButtonRecargarInformacionToolBarNivelCuentaContable;
	protected JButton jButtonProcesarInformacionToolBarNivelCuentaContable;
	protected JButton jButtonAnterioresToolBarNivelCuentaContable;
	protected JButton jButtonSiguientesToolBarNivelCuentaContable;
	protected JButton jButtonNuevoGuardarCambiosToolBarNivelCuentaContable;
	protected JButton jButtonAbrirOrderByToolBarNivelCuentaContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNivelCuentaContable;
	protected JMenuItem jMenuItemDuplicarNivelCuentaContable;
	protected JMenuItem jMenuItemNuevoRelacionesNivelCuentaContable;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNivelCuentaContable;
	protected JMenuItem jMenuItemCopiarNivelCuentaContable;
	protected JMenuItem jMenuItemVerFormNivelCuentaContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaNivelCuentaContable;
	protected JMenuItem jMenuItemCerrarNivelCuentaContable;
	protected JMenuItem jMenuItemDetalleCerrarNivelCuentaContable;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNivelCuentaContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarNivelCuentaContable;
	
	protected JMenuItem jMenuItemRecargarInformacionNivelCuentaContable;
	protected JMenuItem jMenuItemProcesarInformacionNivelCuentaContable;
	protected JMenuItem jMenuItemAnterioresNivelCuentaContable;
	protected JMenuItem jMenuItemSiguientesNivelCuentaContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNivelCuentaContable;
	protected JMenuItem jMenuItemAbrirOrderByNivelCuentaContable;
	protected JMenuItem jMenuItemMostrarOcultarNivelCuentaContable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNivelCuentaContable;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNivelCuentaContable;
	protected JCheckBox jCheckBoxSeleccionadosNivelCuentaContable;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNivelCuentaContable;
	protected JCheckBox jCheckBoxConGraficoReporteNivelCuentaContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNivelCuentaContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNivelCuentaContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNivelCuentaContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNivelCuentaContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNivelCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNivelCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNivelCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNivelCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNivelCuentaContable;
	protected JTextField jTextFieldValorCampoGeneralNivelCuentaContable;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNivelCuentaContable;
	//public JList<Reporte> jListColumnasSelectReporteNivelCuentaContable;
	//public JScrollPane jScrollColumnasSelectReporteNivelCuentaContable;
	
	//public JLabel jLabelRelacionesSelectReporteNivelCuentaContable;
	//public JList<Reporte> jListRelacionesSelectReporteNivelCuentaContable;
	//public JScrollPane jScrollRelacionesSelectReporteNivelCuentaContable;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNivelCuentaContable;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNivelCuentaContable;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNivelCuentaContable;
	//public JLabel jLabelTiposArchivoReporteDinamicoNivelCuentaContable;
	
		
	//public JLabel jLabelArchivoImportacionNivelCuentaContable;	
	//public JLabel jLabelPathArchivoImportacionNivelCuentaContable;
	//protected JTextField jTextFieldPathArchivoImportacionNivelCuentaContable;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNivelCuentaContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNivelCuentaContable;
	
	//public JLabel jLabelColumnaCategoriaValorNivelCuentaContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNivelCuentaContable;
	
	//public JLabel jLabelColumnasValoresGraficoNivelCuentaContable;
	//public JList<Reporte> jListColumnasValoresGraficoNivelCuentaContable;
	//public JScrollPane jScrollColumnasValoresGraficoNivelCuentaContable;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNivelCuentaContable;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNivelCuentaContable;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasNivelCuentaContable;
	
	
	
	
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
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public NivelCuentaContableJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("NivelCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCuentaContableJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCuentaContableJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCuentaContableJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NivelCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNivelCuentaContable)	{
		this.jButtonRecargarInformacionNivelCuentaContable = jButtonRecargarInformacionNivelCuentaContable;
	}
	
	public JButton getjButtonProcesarInformacionNivelCuentaContable() {
		return this.jButtonProcesarInformacionNivelCuentaContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNivelCuentaContable)	{
		this.jButtonProcesarInformacionNivelCuentaContable = jButtonProcesarInformacionNivelCuentaContable;
	}
	
	
	public JButton getjButtonRecargarInformacionNivelCuentaContable() {
		return this.jButtonRecargarInformacionNivelCuentaContable;
	}
	
	
	public List<NivelCuentaContable> getnivelcuentacontables() {
		return this.nivelcuentacontables;
	}

	public void setnivelcuentacontables(List<NivelCuentaContable> nivelcuentacontables) {
		this.nivelcuentacontables = nivelcuentacontables;
	}
	
	public List<NivelCuentaContable> getnivelcuentacontablesAux() {
		return this.nivelcuentacontablesAux;
	}

	public void setnivelcuentacontablesAux(List<NivelCuentaContable> nivelcuentacontablesAux) {
		this.nivelcuentacontablesAux = nivelcuentacontablesAux;
	}
	
	public List<NivelCuentaContable> getnivelcuentacontablesEliminados() {
		return this.nivelcuentacontablesEliminados;
	}

	public void setNivelCuentaContablesEliminados(List<NivelCuentaContable> nivelcuentacontablesEliminados) {
		this.nivelcuentacontablesEliminados = nivelcuentacontablesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNivelCuentaContable() {
		return jComboBoxTiposSeleccionarNivelCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNivelCuentaContable(
			JComboBox jComboBoxTiposSeleccionarNivelCuentaContable) {
		this.jComboBoxTiposSeleccionarNivelCuentaContable = jComboBoxTiposSeleccionarNivelCuentaContable;
	}
	
	public void setBorderResaltarTiposSeleccionarNivelCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNivelCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNivelCuentaContable .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNivelCuentaContable() {
		return jTextFieldValorCampoGeneralNivelCuentaContable;
	}

	public void setjTextFieldValorCampoGeneralNivelCuentaContable(
			JTextField jTextFieldValorCampoGeneralNivelCuentaContable) {
		this.jTextFieldValorCampoGeneralNivelCuentaContable = jTextFieldValorCampoGeneralNivelCuentaContable;
	}

	public void setBorderResaltarValorCampoGeneralNivelCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuentaContable.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNivelCuentaContable .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNivelCuentaContable() {
		return this.jCheckBoxSeleccionarTodosNivelCuentaContable;
	}

	public void setjCheckBoxSeleccionarTodosNivelCuentaContable(
			JCheckBox jCheckBoxSeleccionarTodosNivelCuentaContable) {
		this.jCheckBoxSeleccionarTodosNivelCuentaContable = jCheckBoxSeleccionarTodosNivelCuentaContable;
	}

	public void setBorderResaltarSeleccionarTodosNivelCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuentaContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNivelCuentaContable .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNivelCuentaContable() {
		return this.jCheckBoxSeleccionadosNivelCuentaContable;
	}

	public void setjCheckBoxSeleccionadosNivelCuentaContable(
			JCheckBox jCheckBoxSeleccionadosNivelCuentaContable) {
		this.jCheckBoxSeleccionadosNivelCuentaContable = jCheckBoxSeleccionadosNivelCuentaContable;
	}
	
	public void setBorderResaltarSeleccionadosNivelCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuentaContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNivelCuentaContable .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNivelCuentaContable() {
		return this.jComboBoxTiposArchivosReportesNivelCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNivelCuentaContable(
			JComboBox jComboBoxTiposArchivosReportesNivelCuentaContable) {
		this.jComboBoxTiposArchivosReportesNivelCuentaContable = jComboBoxTiposArchivosReportesNivelCuentaContable;
	}

	public void setBorderResaltarTiposArchivosReportesNivelCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNivelCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNivelCuentaContable() {
		return this.jComboBoxTiposReportesNivelCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNivelCuentaContable(
			JComboBox jComboBoxTiposReportesNivelCuentaContable) {
		this.jComboBoxTiposReportesNivelCuentaContable = jComboBoxTiposReportesNivelCuentaContable;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNivelCuentaContable() {
	//	return jComboBoxTiposReportesDinamicoNivelCuentaContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNivelCuentaContable(
	//		JComboBox jComboBoxTiposReportesDinamicoNivelCuentaContable) {
	//	this.jComboBoxTiposReportesDinamicoNivelCuentaContable = jComboBoxTiposReportesDinamicoNivelCuentaContable;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNivelCuentaContable() {
	//	return jComboBoxTiposArchivosReportesDinamicoNivelCuentaContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNivelCuentaContable(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNivelCuentaContable) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNivelCuentaContable = jComboBoxTiposArchivosReportesDinamicoNivelCuentaContable;
	//}
	
	public void setBorderResaltarTiposReportesNivelCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNivelCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNivelCuentaContable() {
		return this.jComboBoxTiposGraficosReportesNivelCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNivelCuentaContable(
			JComboBox jComboBoxTiposGraficosReportesNivelCuentaContable) {
		this.jComboBoxTiposGraficosReportesNivelCuentaContable = jComboBoxTiposGraficosReportesNivelCuentaContable;
	}
	
	public void setBorderResaltarTiposGraficosReportesNivelCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNivelCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNivelCuentaContable() {
		return this.jComboBoxTiposPaginacionNivelCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNivelCuentaContable(
			JComboBox jComboBoxTiposPaginacionNivelCuentaContable) {
		this.jComboBoxTiposPaginacionNivelCuentaContable = jComboBoxTiposPaginacionNivelCuentaContable;
	}
	
	public void setBorderResaltarTiposPaginacionNivelCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNivelCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNivelCuentaContable() {
		return this.jComboBoxTiposRelacionesNivelCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNivelCuentaContable() {
		return this.jComboBoxTiposAccionesNivelCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNivelCuentaContable(
			JComboBox jComboBoxTiposRelacionesNivelCuentaContable) {
		this.jComboBoxTiposRelacionesNivelCuentaContable = jComboBoxTiposRelacionesNivelCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNivelCuentaContable(
			JComboBox jComboBoxTiposAccionesNivelCuentaContable) {
		this.jComboBoxTiposAccionesNivelCuentaContable = jComboBoxTiposAccionesNivelCuentaContable;
	}
	
	public void setBorderResaltarTiposRelacionesNivelCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNivelCuentaContable .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNivelCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNivelCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNivelCuentaContable .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNivelCuentaContable() {
	//	return jCheckBoxConGraficoDinamicoNivelCuentaContable;
	//}

	//public void setjCheckBoxConGraficoDinamicoNivelCuentaContable(
	//		JCheckBox jCheckBoxConGraficoDinamicoNivelCuentaContable) {
	//	this.jCheckBoxConGraficoDinamicoNivelCuentaContable = jCheckBoxConGraficoDinamicoNivelCuentaContable;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNivelCuentaContable() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNivelCuentaContable.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNivelCuentaContable .setBorder(borderResaltar);		
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
		this.nivelcuentacontableSessionBean=new NivelCuentaContableSessionBean();
		
		this.nivelcuentacontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.nivelcuentacontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.nivelcuentacontableSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NivelCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NivelCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NivelCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NivelCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NivelCuentaContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Nivel Cuenta Contable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
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
		
		NivelCuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("NivelCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNivelCuentaContable= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNivelCuentaContable,this.jTtoolBarNivelCuentaContable,
							"nuevo","nuevo","Nuevo"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNivelCuentaContable,this.jTtoolBarNivelCuentaContable,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNivelCuentaContable,this.jTtoolBarNivelCuentaContable,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNivelCuentaContable,this.jTtoolBarNivelCuentaContable,
							"duplicar","duplicar","Duplicar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNivelCuentaContable,this.jTtoolBarNivelCuentaContable,
							"copiar","copiar","Copiar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNivelCuentaContable,this.jTtoolBarNivelCuentaContable,
							"ver_form","ver_form","Ver"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNivelCuentaContable,this.jTtoolBarNivelCuentaContable,
							"recargar","recargar","Recargar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNivelCuentaContable,this.jTtoolBarNivelCuentaContable,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNivelCuentaContable,this.jTtoolBarNivelCuentaContable,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNivelCuentaContable,this.jTtoolBarNivelCuentaContable,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNivelCuentaContable,this.jTtoolBarNivelCuentaContable,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNivelCuentaContable,this.jTtoolBarNivelCuentaContable,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNivelCuentaContable,this.jTtoolBarNivelCuentaContable,
							"cerrar","cerrar","Salir"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNivelCuentaContable=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNivelCuentaContable;
			
				this.jButtonProcesarInformacionToolBarNivelCuentaContable=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNivelCuentaContable;
				
		//protected JButton jButtonModificarToolBarNivelCuentaContable;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNivelCuentaContable=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNivelCuentaContable=new JMenuMe("General");
		this.jmenuArchivoNivelCuentaContable=new JMenuMe("Archivo");
		this.jmenuAccionesNivelCuentaContable=new JMenuMe("Acciones");
		this.jmenuDatosNivelCuentaContable=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNivelCuentaContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNivelCuentaContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNivelCuentaContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNivelCuentaContable= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNivelCuentaContable.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNivelCuentaContable,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNivelCuentaContable= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNivelCuentaContable.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNivelCuentaContable,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNivelCuentaContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNivelCuentaContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNivelCuentaContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNivelCuentaContable= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNivelCuentaContable.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNivelCuentaContable,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNivelCuentaContable= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNivelCuentaContable.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNivelCuentaContable,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNivelCuentaContable= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNivelCuentaContable.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNivelCuentaContable,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNivelCuentaContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNivelCuentaContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNivelCuentaContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNivelCuentaContable= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNivelCuentaContable.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNivelCuentaContable,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNivelCuentaContable= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNivelCuentaContable.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNivelCuentaContable,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNivelCuentaContable= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNivelCuentaContable.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNivelCuentaContable,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNivelCuentaContable= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNivelCuentaContable.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNivelCuentaContable,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNivelCuentaContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNivelCuentaContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNivelCuentaContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNivelCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNivelCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNivelCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNivelCuentaContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNivelCuentaContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNivelCuentaContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNivelCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNivelCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNivelCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNivelCuentaContable= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNivelCuentaContable.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNivelCuentaContable,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNivelCuentaContable.add(this.jMenuItemCerrarNivelCuentaContable);
			
			this.jmenuAccionesNivelCuentaContable.add(this.jMenuItemNuevoNivelCuentaContable);
			this.jmenuAccionesNivelCuentaContable.add(this.jMenuItemNuevoGuardarCambiosNivelCuentaContable);
			this.jmenuAccionesNivelCuentaContable.add(this.jMenuItemNuevoRelacionesNivelCuentaContable);
			this.jmenuAccionesNivelCuentaContable.add(this.jMenuItemGuardarCambiosTablaNivelCuentaContable);		
			this.jmenuAccionesNivelCuentaContable.add(this.jMenuItemDuplicarNivelCuentaContable);		
			this.jmenuAccionesNivelCuentaContable.add(this.jMenuItemCopiarNivelCuentaContable);		
			this.jmenuAccionesNivelCuentaContable.add(this.jMenuItemVerFormNivelCuentaContable);		
			
			this.jmenuDatosNivelCuentaContable.add(this.jMenuItemRecargarInformacionNivelCuentaContable);				
			this.jmenuDatosNivelCuentaContable.add(this.jMenuItemAnterioresNivelCuentaContable);				
			this.jmenuDatosNivelCuentaContable.add(this.jMenuItemSiguientesNivelCuentaContable);				
			this.jmenuDatosNivelCuentaContable.add(this.jMenuItemAbrirOrderByNivelCuentaContable);				
			this.jmenuDatosNivelCuentaContable.add(this.jMenuItemMostrarOcultarNivelCuentaContable);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNivelCuentaContable.add(this.jMenuItemGuardarCambiosNivelCuentaContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNivelCuentaContable.add(this.jmenuArchivoNivelCuentaContable);		
			this.jmenuBarNivelCuentaContable.add(this.jmenuAccionesNivelCuentaContable);		
			this.jmenuBarNivelCuentaContable.add(this.jmenuDatosNivelCuentaContable);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNivelCuentaContable);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNivelCuentaContable() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasNivelCuentaContable=new JTabbedPane();


		this.jTabbedPaneBusquedasNivelCuentaContable.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNivelCuentaContable.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNivelCuentaContable.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasNivelCuentaContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasNivelCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleNivelCuentaContable = new NivelCuentaContableDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Nivel Cuenta Contable DATOS");
			this.jInternalFrameDetalleFormNivelCuentaContable = new NivelCuentaContableDetalleFormJInternalFrame(jDesktopPane,this.nivelcuentacontableSessionBean.getConGuardarRelaciones(),this.nivelcuentacontableSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNivelCuentaContable = null;//new NivelCuentaContableDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNivelCuentaContable= new GridBagLayout();
		
		
		this.jTableDatosNivelCuentaContable = new JTableMe();      
		
		String sToolTipNivelCuentaContable="";
		sToolTipNivelCuentaContable=NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNivelCuentaContable+="(Contabilidad.NivelCuentaContable)";
		}
		
		if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipNivelCuentaContable+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNivelCuentaContable.setToolTipText(sToolTipNivelCuentaContable);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNivelCuentaContable);
		this.jTableDatosNivelCuentaContable.setAutoCreateRowSorter(true);
		this.jTableDatosNivelCuentaContable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNivelCuentaContable.setRowSelectionAllowed(true);
		this.jTableDatosNivelCuentaContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNivelCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNivelCuentaContable = new JButtonMe();
		this.jButtonDuplicarNivelCuentaContable = new JButtonMe();
		this.jButtonCopiarNivelCuentaContable = new JButtonMe();
		this.jButtonVerFormNivelCuentaContable = new JButtonMe();
		this.jButtonNuevoRelacionesNivelCuentaContable = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNivelCuentaContable = new JButtonMe();
		this.jButtonCerrarNivelCuentaContable = new JButtonMe();
		
		this.jScrollPanelDatosNivelCuentaContable = new JScrollPane();   
        this.jScrollPanelDatosGeneralNivelCuentaContable = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNivelCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Nivel Cuenta Contable";
		
		if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Cuenta Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosNivelCuentaContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNivelCuentaContable.setToolTipText("Acciones");
        this.jPanelAccionesNivelCuentaContable.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoNivelCuentaContable=new ReporteDinamicoJInternalFrame(NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNivelCuentaContable();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNivelCuentaContable=new ImportacionJInternalFrame(NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNivelCuentaContable();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNivelCuentaContable = new JButtonMe();
		
		this.jButtonAbrirOrderByNivelCuentaContable.setText("Orden");
		this.jButtonAbrirOrderByNivelCuentaContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNivelCuentaContable,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNivelCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNivelCuentaContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelCuentaContable,false,this);
			
			//this.cargarOrderByNivelCuentaContable(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNivelCuentaContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelCuentaContable,true,this);
			
			//this.cargarOrderByNivelCuentaContable(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNivelCuentaContable.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosNivelCuentaContable.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosNivelCuentaContable.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosNivelCuentaContable.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNivelCuentaContable.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNivelCuentaContable.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNivelCuentaContable.setText("Nuevo");
		this.jButtonDuplicarNivelCuentaContable.setText("Duplicar");
		this.jButtonCopiarNivelCuentaContable.setText("Copiar");
		this.jButtonVerFormNivelCuentaContable.setText("Ver");
		this.jButtonNuevoRelacionesNivelCuentaContable.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNivelCuentaContable.setText("Guardar");
		this.jButtonCerrarNivelCuentaContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNivelCuentaContable,"nuevo_button","Nuevo",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNivelCuentaContable,"duplicar_button","Duplicar",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNivelCuentaContable,"copiar_button","Copiar",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNivelCuentaContable,"ver_form","Ver",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNivelCuentaContable,"nuevorelaciones_button","Nuevo Rel",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNivelCuentaContable,"guardarcambiostabla_button","Guardar",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNivelCuentaContable,"cerrar_button","Salir",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNivelCuentaContable.setToolTipText("Nuevo"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNivelCuentaContable.setToolTipText("Duplicar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNivelCuentaContable.setToolTipText("Copiar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNivelCuentaContable.setToolTipText("Ver"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNivelCuentaContable.setToolTipText("Nuevo Rel"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNivelCuentaContable.setToolTipText("Guardar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNivelCuentaContable.setToolTipText("Salir"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNivelCuentaContable";
		inputMap = this.jButtonNuevoNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNivelCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNivelCuentaContable"));
		
		//DUPLICAR
		sMapKey = "DuplicarNivelCuentaContable";
		inputMap = this.jButtonDuplicarNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNivelCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNivelCuentaContable"));
		
		//COPIAR
		sMapKey = "CopiarNivelCuentaContable";
		inputMap = this.jButtonCopiarNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNivelCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNivelCuentaContable"));
		
		//VEr FORM
		sMapKey = "VerFormNivelCuentaContable";
		inputMap = this.jButtonVerFormNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNivelCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNivelCuentaContable"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNivelCuentaContable";
		inputMap = this.jButtonNuevoRelacionesNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNivelCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNivelCuentaContable"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNivelCuentaContable";
		inputMap = this.jButtonModificarNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNivelCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNivelCuentaContable"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNivelCuentaContable";
		inputMap = this.jButtonCerrarNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNivelCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNivelCuentaContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNivelCuentaContable";
		inputMap = this.jButtonGuardarCambiosTablaNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNivelCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNivelCuentaContable"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNivelCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNivelCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNivelCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1NivelCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2NivelCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3NivelCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4NivelCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5NivelCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNivelCuentaContable.setName("jPanelParametrosReportesNivelCuentaContable"); 
		
		this.jPanelParametrosReportesAccionesNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNivelCuentaContable.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNivelCuentaContable.setName("jPanelParametrosReportesAccionesNivelCuentaContable"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNivelCuentaContable = new JButtonMe();
		this.jButtonRecargarInformacionNivelCuentaContable.setText("Recargar");
		this.jButtonRecargarInformacionNivelCuentaContable.setToolTipText("Recargar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNivelCuentaContable,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionNivelCuentaContable = new JButtonMe();
		this.jButtonProcesarInformacionNivelCuentaContable.setText("Procesar");
		this.jButtonProcesarInformacionNivelCuentaContable.setToolTipText("Procesar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNivelCuentaContable.setVisible(false);
			
		this.jButtonProcesarInformacionNivelCuentaContable.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNivelCuentaContable.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNivelCuentaContable.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNivelCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNivelCuentaContable.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNivelCuentaContable.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNivelCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNivelCuentaContable.setText("TIPO");       
		this.jComboBoxTiposReportesNivelCuentaContable.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNivelCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNivelCuentaContable.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNivelCuentaContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNivelCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNivelCuentaContable.setText("Paginacion");
		this.jComboBoxTiposPaginacionNivelCuentaContable.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNivelCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNivelCuentaContable.setText("Accion");
		this.jComboBoxTiposRelacionesNivelCuentaContable.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNivelCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNivelCuentaContable.setText("Accion");
		this.jComboBoxTiposAccionesNivelCuentaContable.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNivelCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNivelCuentaContable.setText("Accion");
		this.jComboBoxTiposSeleccionarNivelCuentaContable.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNivelCuentaContable=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNivelCuentaContable.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNivelCuentaContable.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNivelCuentaContable.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNivelCuentaContable = new JLabelMe();
		
		this.jLabelAccionesNivelCuentaContable.setText("Acciones");		
		this.jLabelAccionesNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNivelCuentaContable = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNivelCuentaContable.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNivelCuentaContable.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNivelCuentaContable = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNivelCuentaContable.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNivelCuentaContable.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNivelCuentaContable = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNivelCuentaContable.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNivelCuentaContable.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNivelCuentaContable = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNivelCuentaContable.setText("Graf.");
		this.jCheckBoxConGraficoReporteNivelCuentaContable.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNivelCuentaContable = new JButtonMe();
		//this.jButtonAnterioresNivelCuentaContable.setText("<<");
        this.jButtonAnterioresNivelCuentaContable.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNivelCuentaContable,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNivelCuentaContable = new JButtonMe();
		//this.jButtonSiguientesNivelCuentaContable.setText(">>");
        this.jButtonSiguientesNivelCuentaContable.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNivelCuentaContable,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNivelCuentaContable = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNivelCuentaContable.setText("Nue");
        this.jButtonNuevoGuardarCambiosNivelCuentaContable.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNivelCuentaContable,"nuevoguardarcambios_button","Nue",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNivelCuentaContable";
		inputMap = this.jButtonNuevoGuardarCambiosNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNivelCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNivelCuentaContable"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNivelCuentaContable";
		inputMap = this.jButtonRecargarInformacionNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNivelCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNivelCuentaContable"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNivelCuentaContable";
		inputMap = this.jButtonSiguientesNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNivelCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNivelCuentaContable"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNivelCuentaContable";
		inputMap = this.jButtonAnterioresNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNivelCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNivelCuentaContable"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNivelCuentaContable();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNivelCuentaContable.setMinimumSize(new Dimension(this.getWidth(),NivelCuentaContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NivelCuentaContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNivelCuentaContable.setMaximumSize(new Dimension(this.getWidth(),NivelCuentaContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NivelCuentaContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNivelCuentaContable.setPreferredSize(new Dimension(this.getWidth(),NivelCuentaContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NivelCuentaContableBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNivelCuentaContable = new GridBagLayout();

			this.jPanelPaginacionNivelCuentaContable.setLayout(gridaBagLayoutPaginacionNivelCuentaContable);						
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.gridy = 0;
			this.gridBagConstraintsNivelCuentaContable.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNivelCuentaContable.add(this.jButtonAnterioresNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
					
						
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNivelCuentaContable.gridy = 0;
			
			this.jPanelPaginacionNivelCuentaContable.add(this.jButtonNuevoGuardarCambiosNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
						
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNivelCuentaContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNivelCuentaContable.gridy = 0;
			this.jPanelPaginacionNivelCuentaContable.add(this.jButtonSiguientesNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.gridy = 1;
			this.gridBagConstraintsNivelCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelCuentaContable.add(this.jButtonNuevoNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
						
			
			
			if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
				this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNivelCuentaContable.gridy = 1;
				this.gridBagConstraintsNivelCuentaContable.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionNivelCuentaContable.add(this.jButtonGuardarCambiosTablaNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
			}
			
			
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.gridy = 1;
			this.gridBagConstraintsNivelCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelCuentaContable.add(this.jButtonDuplicarNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.gridy = 1;
			this.gridBagConstraintsNivelCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelCuentaContable.add(this.jButtonCopiarNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.gridy = 1;
			this.gridBagConstraintsNivelCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNivelCuentaContable.add(this.jButtonVerFormNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.gridy = 1;
			this.gridBagConstraintsNivelCuentaContable.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNivelCuentaContable.add(this.jButtonCerrarNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		
		
		
		this.jButtonRecargarInformacionNivelCuentaContable.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNivelCuentaContable.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNivelCuentaContable.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNivelCuentaContable.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNivelCuentaContable.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNivelCuentaContable.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNivelCuentaContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNivelCuentaContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNivelCuentaContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNivelCuentaContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNivelCuentaContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNivelCuentaContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNivelCuentaContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNivelCuentaContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNivelCuentaContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNivelCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNivelCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNivelCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNivelCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNivelCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNivelCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNivelCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNivelCuentaContable.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNivelCuentaContable.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNivelCuentaContable.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNivelCuentaContable.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNivelCuentaContable.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNivelCuentaContable.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNivelCuentaContable.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNivelCuentaContable.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNivelCuentaContable.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNivelCuentaContable.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNivelCuentaContable.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNivelCuentaContable.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNivelCuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNivelCuentaContable = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1NivelCuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2NivelCuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3NivelCuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4NivelCuentaContable = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNivelCuentaContable.setLayout(gridaBagParametrosReportesNivelCuentaContable);
			this.jPanelParametrosReportesAccionesNivelCuentaContable.setLayout(gridaBagParametrosReportesAccionesNivelCuentaContable);
			
			
			this.jPanelParametrosAuxiliar1NivelCuentaContable.setLayout(gridaBagParametrosAuxiliar1NivelCuentaContable);
			this.jPanelParametrosAuxiliar2NivelCuentaContable.setLayout(gridaBagParametrosAuxiliar2NivelCuentaContable);
			this.jPanelParametrosAuxiliar3NivelCuentaContable.setLayout(gridaBagParametrosAuxiliar3NivelCuentaContable);
			this.jPanelParametrosAuxiliar4NivelCuentaContable.setLayout(gridaBagParametrosAuxiliar4NivelCuentaContable);
			//this.jPanelParametrosAuxiliar5NivelCuentaContable.setLayout(gridaBagParametrosAuxiliar2NivelCuentaContable);			
			
			
			
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNivelCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelCuentaContable.add(this.jButtonRecargarInformacionNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuentaContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NivelCuentaContable.add(this.jComboBoxTiposPaginacionNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuentaContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NivelCuentaContable.add(this.jCheckBoxConAltoMaximoTablaNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuentaContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NivelCuentaContable.add(this.jComboBoxTiposArchivosReportesNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelCuentaContable.add(this.jPanelParametrosAuxiliar1NivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNivelCuentaContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4NivelCuentaContable.add(this.jComboBoxTiposReportesNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelCuentaContable.add(this.jPanelParametrosAuxiliar4NivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuentaContable.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelCuentaContable.add(this.jComboBoxTiposReportesNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuentaContable.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNivelCuentaContable.add(this.jCheckBoxGenerarReporteNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelCuentaContable.add(this.jPanelParametrosAuxiliar2NivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNivelCuentaContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNivelCuentaContable.add(this.jLabelAccionesNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
				this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsNivelCuentaContable.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesNivelCuentaContable.add(this.jButtonAbrirOrderByNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelCuentaContable.add(this.jComboBoxTiposSeleccionarNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);			
			
			
			/*
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNivelCuentaContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNivelCuentaContable.add(this.jCheckBoxSeleccionarTodosNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNivelCuentaContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NivelCuentaContable.add(this.jCheckBoxSeleccionarTodosNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);															
				
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNivelCuentaContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NivelCuentaContable.add(this.jCheckBoxSeleccionadosNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNivelCuentaContable.add(this.jPanelParametrosAuxiliar3NivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelCuentaContable.add(this.jComboBoxTiposAccionesNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
	
				
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNivelCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNivelCuentaContable.add(this.jTextFieldValorCampoGeneralNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNivelCuentaContable = new GridBagLayout();

			this.jScrollPanelDatosNivelCuentaContable.setLayout(gridaBagLayoutDatosNivelCuentaContable);
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.gridy = 0;
			this.gridBagConstraintsNivelCuentaContable.gridx = 0;
			
			this.jScrollPanelDatosNivelCuentaContable.add(this.jTableDatosNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNivelCuentaContable.setViewportView(this.jTableDatosNivelCuentaContable);
		this.jTableDatosNivelCuentaContable.setFillsViewportHeight(true);
		this.jTableDatosNivelCuentaContable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNivelCuentaContable= new GridBagLayout();
		this.jPanelAccionesNivelCuentaContable.setLayout(gridaBagLayoutAccionesNivelCuentaContable);
		
		
		/*	
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = 0;
		this.gridBagConstraintsNivelCuentaContable.gridx = 0;
			
		this.jPanelAccionesNivelCuentaContable.add(this.jButtonNuevoNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNivelCuentaContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNivelCuentaContable);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();						
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNivelCuentaContable.gridx = 0;		
			//this.gridBagConstraintsNivelCuentaContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNivelCuentaContable.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNivelCuentaContable.gridx = 0;		
		//this.gridBagConstraintsNivelCuentaContable.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNivelCuentaContable.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNivelCuentaContable);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuentaContable.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);								
		
		
		/*
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuentaContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		*/		
		
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNivelCuentaContable.gridx =0;
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNivelCuentaContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
				
		
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuentaContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(NivelCuentaContableJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNivelCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNivelCuentaContable = new GridBagLayout();
			this.jPanelBusquedasParametrosNivelCuentaContable.setLayout(gridaBagLayoutBusquedasParametrosNivelCuentaContable);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNivelCuentaContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNivelCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
			
			
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		
			
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuentaContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNivelCuentaContable;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNivelCuentaContable() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNivelCuentaContable = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNivelCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNivelCuentaContable.setName("jPanelReporteDinamicoNivelCuentaContable"); 
		
		this.jPanelReporteDinamicoNivelCuentaContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNivelCuentaContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNivelCuentaContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNivelCuentaContable.setLayout(gridaBagLayoutReporteDinamicoNivelCuentaContable);
		
		
		this.jInternalFrameReporteDinamicoNivelCuentaContable= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNivelCuentaContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNivelCuentaContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNivelCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNivelCuentaContable.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNivelCuentaContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNivelCuentaContable.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNivelCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNivelCuentaContable.setResizable(true);
	    this.jInternalFrameReporteDinamicoNivelCuentaContable.setClosable(true);
	    this.jInternalFrameReporteDinamicoNivelCuentaContable.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNivelCuentaContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNivelCuentaContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNivelCuentaContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Cuenta Contables"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNivelCuentaContable = new JLabelMe();

		this.jLabelColumnasSelectReporteNivelCuentaContable.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNivelCuentaContable.add(this.jLabelColumnasSelectReporteNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNivelCuentaContable = new JList<Reporte>();
		this.jListColumnasSelectReporteNivelCuentaContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNivelCuentaContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNivelCuentaContable.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNivelCuentaContable.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNivelCuentaContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNivelCuentaContable=new JScrollPane(this.jListColumnasSelectReporteNivelCuentaContable);
			
			this.jScrollColumnasSelectReporteNivelCuentaContable.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNivelCuentaContable.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNivelCuentaContable.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNivelCuentaContable.add(this.jListColumnasSelectReporteNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		this.jPanelReporteDinamicoNivelCuentaContable.add(this.jScrollColumnasSelectReporteNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNivelCuentaContable = new JLabelMe();

		this.jLabelRelacionesSelectReporteNivelCuentaContable.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNivelCuentaContable = new JList<Reporte>();
		this.jListRelacionesSelectReporteNivelCuentaContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNivelCuentaContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNivelCuentaContable.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNivelCuentaContable.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNivelCuentaContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNivelCuentaContable=new JScrollPane(this.jListRelacionesSelectReporteNivelCuentaContable);
			
			this.jScrollRelacionesSelectReporteNivelCuentaContable.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNivelCuentaContable.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNivelCuentaContable.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoNivelCuentaContable = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNivelCuentaContable = new JComboBoxMe();
		this.jListColumnasValoresGraficoNivelCuentaContable = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNivelCuentaContable = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNivelCuentaContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNivelCuentaContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNivelCuentaContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNivelCuentaContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNivelCuentaContable = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNivelCuentaContable.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNivelCuentaContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNivelCuentaContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNivelCuentaContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNivelCuentaContable = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNivelCuentaContable.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNivelCuentaContable.add(this.jLabelGenerarExcelReporteDinamicoNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNivelCuentaContable = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNivelCuentaContable.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNivelCuentaContable,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNivelCuentaContable.setToolTipText("Generar EXCEL"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNivelCuentaContable.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNivelCuentaContable.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNivelCuentaContable.add(this.jButtonGenerarExcelReporteDinamicoNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelCuentaContable.add(this.jComboBoxTiposReportesDinamicoNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNivelCuentaContable = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNivelCuentaContable.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNivelCuentaContable.add(this.jLabelTiposArchivoReporteDinamicoNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelCuentaContable.add(this.jComboBoxTiposArchivosReportesDinamicoNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNivelCuentaContable = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNivelCuentaContable.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNivelCuentaContable,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNivelCuentaContable.setToolTipText("Generar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelCuentaContable.add(this.jButtonGenerarReporteDinamicoNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNivelCuentaContable = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNivelCuentaContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNivelCuentaContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNivelCuentaContable.setToolTipText("Cancelar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNivelCuentaContable.add(this.jButtonCerrarReporteDinamicoNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNivelCuentaContable = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNivelCuentaContable= new JScrollPane(jPanelReporteDinamicoNivelCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNivelCuentaContable.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNivelCuentaContable.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNivelCuentaContable.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Cuenta Contables"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNivelCuentaContable.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNivelCuentaContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNivelCuentaContable.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNivelCuentaContable);
		this.jInternalFrameReporteDinamicoNivelCuentaContable.getContentPane().add(this.jScrollPanelReporteDinamicoNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNivelCuentaContable() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNivelCuentaContable = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNivelCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNivelCuentaContable.setName("jPanelImportacionNivelCuentaContable"); 
		
		this.jPanelImportacionNivelCuentaContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNivelCuentaContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNivelCuentaContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNivelCuentaContable.setLayout(gridaBagLayoutImportacionNivelCuentaContable);
		
		
		this.jInternalFrameImportacionNivelCuentaContable= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNivelCuentaContable= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNivelCuentaContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNivelCuentaContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNivelCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNivelCuentaContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNivelCuentaContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNivelCuentaContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNivelCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNivelCuentaContable.setResizable(true);
	    this.jInternalFrameImportacionNivelCuentaContable.setClosable(true);
	    this.jInternalFrameImportacionNivelCuentaContable.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNivelCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNivelCuentaContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNivelCuentaContable.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNivelCuentaContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNivelCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNivelCuentaContable.setResizable(true);
	    this.jInternalFrameImportacionNivelCuentaContable.setClosable(true);
	    this.jInternalFrameImportacionNivelCuentaContable.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNivelCuentaContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNivelCuentaContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNivelCuentaContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Cuenta Contables"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNivelCuentaContable = new JLabelMe();

		this.jLabelArchivoImportacionNivelCuentaContable.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNivelCuentaContable.add(this.jLabelArchivoImportacionNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNivelCuentaContable = new JFileChooser();		
		this.jFileChooserImportacionNivelCuentaContable.setToolTipText("ESCOGER ARCHIVO"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNivelCuentaContable = new JButtonMe();
		this.jButtonAbrirImportacionNivelCuentaContable.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNivelCuentaContable,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNivelCuentaContable.setToolTipText("Generar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelCuentaContable.add(this.jButtonAbrirImportacionNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNivelCuentaContable = new JLabelMe();

		this.jLabelPathArchivoImportacionNivelCuentaContable.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNivelCuentaContable.add(this.jLabelPathArchivoImportacionNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNivelCuentaContable=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNivelCuentaContable.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNivelCuentaContable.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNivelCuentaContable.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelCuentaContable.add(this.jTextFieldPathArchivoImportacionNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNivelCuentaContable = new JButtonMe();
		this.jButtonGenerarImportacionNivelCuentaContable.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNivelCuentaContable,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNivelCuentaContable.setToolTipText("Generar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelCuentaContable.add(this.jButtonGenerarImportacionNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNivelCuentaContable = new JButtonMe();
		this.jButtonCerrarImportacionNivelCuentaContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNivelCuentaContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNivelCuentaContable.setToolTipText("Cancelar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNivelCuentaContable.add(this.jButtonCerrarImportacionNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNivelCuentaContable = new GridBagLayout();
		
		this.jScrollPanelImportacionNivelCuentaContable= new JScrollPane(jPanelImportacionNivelCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy =iPosYImportacion;
		this.gridBagConstraintsNivelCuentaContable.gridx =iPosXImportacion;
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNivelCuentaContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNivelCuentaContable.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNivelCuentaContable);
		this.jInternalFrameImportacionNivelCuentaContable.getContentPane().add(this.jScrollPanelImportacionNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNivelCuentaContable(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNivelCuentaContable = new JButtonMe();
			this.jButtonAbrirOrderByNivelCuentaContable.setText("Orden");
			this.jButtonAbrirOrderByNivelCuentaContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNivelCuentaContable,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNivelCuentaContable";
			inputMap = this.jButtonAbrirOrderByNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNivelCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNivelCuentaContable"));
		
		
			GridBagLayout gridaBagLayoutOrderByNivelCuentaContable = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNivelCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNivelCuentaContable.setName("jPanelOrderByNivelCuentaContable"); 
			
			this.jPanelOrderByNivelCuentaContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNivelCuentaContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNivelCuentaContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNivelCuentaContable.setLayout(gridaBagLayoutOrderByNivelCuentaContable);
			
			
			this.jTableDatosNivelCuentaContableOrderBy = new JTableMe();        
			this.jTableDatosNivelCuentaContableOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNivelCuentaContableOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNivelCuentaContableOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNivelCuentaContableOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNivelCuentaContableOrderBy.setViewportView(this.jTableDatosNivelCuentaContableOrderBy);
			this.jTableDatosNivelCuentaContableOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNivelCuentaContableOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNivelCuentaContable= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNivelCuentaContable= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNivelCuentaContable = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNivelCuentaContable= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNivelCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNivelCuentaContable.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNivelCuentaContable.setTitle("Orden");
			this.jInternalFrameOrderByNivelCuentaContable.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNivelCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNivelCuentaContable.setResizable(true);
			this.jInternalFrameOrderByNivelCuentaContable.setClosable(true);
			this.jInternalFrameOrderByNivelCuentaContable.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNivelCuentaContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNivelCuentaContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNivelCuentaContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Cuenta Contables"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNivelCuentaContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNivelCuentaContable.ipady =150;
				
			this.jPanelOrderByNivelCuentaContable.add(jScrollPanelDatosNivelCuentaContableOrderBy, this.gridBagConstraintsNivelCuentaContable);//this.jTableDatosNivelCuentaContableTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNivelCuentaContable = new JButtonMe();
			this.jButtonCerrarOrderByNivelCuentaContable.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNivelCuentaContable,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNivelCuentaContable.setToolTipText("Cancelar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNivelCuentaContable.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNivelCuentaContable.add(this.jButtonCerrarOrderByNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNivelCuentaContable = new GridBagLayout();
			
			this.jScrollPanelOrderByNivelCuentaContable= new JScrollPane(jPanelOrderByNivelCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.gridy =iPosYOrderBy;
			this.gridBagConstraintsNivelCuentaContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNivelCuentaContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNivelCuentaContable.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNivelCuentaContable);
			
			this.jInternalFrameOrderByNivelCuentaContable.getContentPane().add(this.jScrollPanelOrderByNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);			
		
		} else {
			this.jButtonAbrirOrderByNivelCuentaContable = new JButtonMe();
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
			&& this.nivelcuentacontableSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNivelCuentaContable.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNivelCuentaContable.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNivelCuentaContable.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosNivelCuentaContable.getRowHeight();//NivelCuentaContableConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NivelCuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNivelCuentaContable.isSelected()) {
					iHeightTable=NivelCuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NivelCuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NivelCuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NivelCuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNivelCuentaContable.isSelected()) {
					iHeightTable=NivelCuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NivelCuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NivelCuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNivelCuentaContable.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNivelCuentaContable.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNivelCuentaContable.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNivelCuentaContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNivelCuentaContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNivelCuentaContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNivelCuentaContable!=null && this.jInternalFrameOrderByNivelCuentaContable.getjTableDatosOrderBy()!=null) {
			//if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNivelCuentaContable.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNivelCuentaContable.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNivelCuentaContable.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNivelCuentaContable.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNivelCuentaContable.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNivelCuentaContable.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNivelCuentaContable.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNivelCuentaContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNivelCuentaContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNivelCuentaContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=nivelcuentacontableLogic.getNivelCuentaContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=nivelcuentacontables.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<NivelCuentaContable> TraerNivelCuentaContableBeans(List<NivelCuentaContable> nivelcuentacontables,ArrayList<Classe> classes)throws Exception {
		try {
			for(NivelCuentaContable nivelcuentacontable:nivelcuentacontables) {
					
				if(!(NivelCuentaContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NivelCuentaContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					nivelcuentacontable.setsDetalleGeneralEntityReporte(NivelCuentaContableConstantesFunciones.getNivelCuentaContableDescripcion(nivelcuentacontable));
										
						
					
						
					
				} else  {
							
					//nivelcuentacontable.setsDetalleGeneralEntityReporte(nivelcuentacontable.getsDetalleGeneralEntityReporte());
										
				}
				
				//nivelcuentacontablebeans.add(nivelcuentacontablebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return nivelcuentacontables;
    }
	//PARA REPORTES FIN
}
