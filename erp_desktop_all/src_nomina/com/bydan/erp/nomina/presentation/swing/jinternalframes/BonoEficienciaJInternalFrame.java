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
import com.bydan.erp.nomina.util.BonoEficienciaConstantesFunciones;

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
public class BonoEficienciaJInternalFrame extends BonoEficienciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarBonoEficiencia;
	
	protected JMenuBar jmenuBarBonoEficiencia;
	
	protected JMenu jmenuBonoEficiencia;
	protected JMenu jmenuDatosBonoEficiencia;
	protected JMenu jmenuArchivoBonoEficiencia;
	protected JMenu jmenuAccionesBonoEficiencia;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosBonoEficiencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBonoEficiencia;	
	protected GridBagConstraints gridBagConstraintsBonoEficiencia;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public BonoEficienciaDetalleFormJInternalFrame jInternalFrameDetalleFormBonoEficiencia;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoBonoEficiencia;	
	protected ImportacionJInternalFrame jInternalFrameImportacionBonoEficiencia;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public BonoEficienciaSessionBean bonoeficienciaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<BonoEficiencia> bonoeficiencias;		
	public List<BonoEficiencia> bonoeficienciasEliminados;	
	public List<BonoEficiencia> bonoeficienciasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByBonoEficiencia;		
	protected JButton jButtonAbrirOrderByBonoEficiencia;
	
	
	//protected JPanel jPanelOrderByBonoEficiencia;
	//public JScrollPane jScrollPanelOrderByBonoEficiencia;	
	//protected JButton jButtonCerrarOrderByBonoEficiencia;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public BonoEficienciaLogic bonoeficienciaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosBonoEficiencia;
	public JScrollPane jScrollPanelDatosEdicionBonoEficiencia;
	public JScrollPane jScrollPanelDatosGeneralBonoEficiencia;
    
	
	
	//public JScrollPane jScrollPanelDatosBonoEficienciaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoBonoEficiencia;
	//public JScrollPane jScrollPanelImportacionBonoEficiencia;
	
	
	
	protected JPanel jPanelAccionesBonoEficiencia;
	
    protected JPanel jPanelPaginacionBonoEficiencia;
    protected JPanel jPanelParametrosReportesBonoEficiencia;
	protected JPanel jPanelParametrosReportesAccionesBonoEficiencia;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1BonoEficiencia;
	protected JPanel jPanelParametrosAuxiliar2BonoEficiencia;
	protected JPanel jPanelParametrosAuxiliar3BonoEficiencia;
	protected JPanel jPanelParametrosAuxiliar4BonoEficiencia;
	//protected JPanel jPanelParametrosAuxiliar5BonoEficiencia;
	
	
	
	//protected JPanel jPanelReporteDinamicoBonoEficiencia;
	//protected JPanel jPanelImportacionBonoEficiencia;
	
	
	public JTable jTableDatosBonoEficiencia;
	
	
	
	//public JTable jTableDatosBonoEficienciaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoBonoEficiencia;
	protected JButton jButtonDuplicarBonoEficiencia;
	protected JButton jButtonCopiarBonoEficiencia;
	protected JButton jButtonVerFormBonoEficiencia;
	protected JButton jButtonNuevoRelacionesBonoEficiencia;
	protected JButton jButtonModificarBonoEficiencia;
	
    protected JButton jButtonGuardarCambiosTablaBonoEficiencia;
	protected JButton jButtonCerrarBonoEficiencia;
	
	
	protected JButton jButtonRecargarInformacionBonoEficiencia;
	protected JButton jButtonProcesarInformacionBonoEficiencia;
	
	
	protected JButton jButtonAnterioresBonoEficiencia;
	protected JButton jButtonSiguientesBonoEficiencia;
	protected JButton jButtonNuevoGuardarCambiosBonoEficiencia;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoBonoEficiencia;
	//protected JButton jButtonCerrarReporteDinamicoBonoEficiencia;
	//protected JButton jButtonGenerarExcelReporteDinamicoBonoEficiencia;	
	
	
	
	//protected JButton jButtonAbrirImportacionBonoEficiencia;
	//protected JButton jButtonGenerarImportacionBonoEficiencia;
	//protected JButton jButtonCerrarImportacionBonoEficiencia;
	//protected JFileChooser jFileChooserImportacionBonoEficiencia;
	//protected File fileImportacionBonoEficiencia;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBonoEficiencia;
	protected JButton jButtonDuplicarToolBarBonoEficiencia;
	protected JButton jButtonNuevoRelacionesToolBarBonoEficiencia;
	
	
	public JButton jButtonGuardarCambiosToolBarBonoEficiencia;
	protected JButton jButtonCopiarToolBarBonoEficiencia;
	protected JButton jButtonVerFormToolBarBonoEficiencia;
	public JButton jButtonGuardarCambiosTablaToolBarBonoEficiencia;
	protected JButton jButtonMostrarOcultarTablaToolBarBonoEficiencia;
	protected JButton jButtonCerrarToolBarBonoEficiencia;
	
	protected JButton jButtonRecargarInformacionToolBarBonoEficiencia;
	protected JButton jButtonProcesarInformacionToolBarBonoEficiencia;
	protected JButton jButtonAnterioresToolBarBonoEficiencia;
	protected JButton jButtonSiguientesToolBarBonoEficiencia;
	protected JButton jButtonNuevoGuardarCambiosToolBarBonoEficiencia;
	protected JButton jButtonAbrirOrderByToolBarBonoEficiencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBonoEficiencia;
	protected JMenuItem jMenuItemDuplicarBonoEficiencia;
	protected JMenuItem jMenuItemNuevoRelacionesBonoEficiencia;
	
	
	protected JMenuItem jMenuItemGuardarCambiosBonoEficiencia;
	protected JMenuItem jMenuItemCopiarBonoEficiencia;
	protected JMenuItem jMenuItemVerFormBonoEficiencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaBonoEficiencia;
	protected JMenuItem jMenuItemCerrarBonoEficiencia;
	protected JMenuItem jMenuItemDetalleCerrarBonoEficiencia;
	protected JMenuItem jMenuItemDetalleAbrirOrderByBonoEficiencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarBonoEficiencia;
	
	protected JMenuItem jMenuItemRecargarInformacionBonoEficiencia;
	protected JMenuItem jMenuItemProcesarInformacionBonoEficiencia;
	protected JMenuItem jMenuItemAnterioresBonoEficiencia;
	protected JMenuItem jMenuItemSiguientesBonoEficiencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBonoEficiencia;
	protected JMenuItem jMenuItemAbrirOrderByBonoEficiencia;
	protected JMenuItem jMenuItemMostrarOcultarBonoEficiencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBonoEficiencia;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosBonoEficiencia;
	protected JCheckBox jCheckBoxSeleccionadosBonoEficiencia;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaBonoEficiencia;
	protected JCheckBox jCheckBoxConGraficoReporteBonoEficiencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesBonoEficiencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesBonoEficiencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoBonoEficiencia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoBonoEficiencia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesBonoEficiencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionBonoEficiencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBonoEficiencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBonoEficiencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarBonoEficiencia;
	protected JTextField jTextFieldValorCampoGeneralBonoEficiencia;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteBonoEficiencia;
	//public JList<Reporte> jListColumnasSelectReporteBonoEficiencia;
	//public JScrollPane jScrollColumnasSelectReporteBonoEficiencia;
	
	//public JLabel jLabelRelacionesSelectReporteBonoEficiencia;
	//public JList<Reporte> jListRelacionesSelectReporteBonoEficiencia;
	//public JScrollPane jScrollRelacionesSelectReporteBonoEficiencia;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoBonoEficiencia;
	//protected JCheckBox jCheckBoxConGraficoDinamicoBonoEficiencia;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoBonoEficiencia;
	//public JLabel jLabelTiposArchivoReporteDinamicoBonoEficiencia;
	
		
	//public JLabel jLabelArchivoImportacionBonoEficiencia;	
	//public JLabel jLabelPathArchivoImportacionBonoEficiencia;
	//protected JTextField jTextFieldPathArchivoImportacionBonoEficiencia;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoBonoEficiencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoBonoEficiencia;
	
	//public JLabel jLabelColumnaCategoriaValorBonoEficiencia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorBonoEficiencia;
	
	//public JLabel jLabelColumnasValoresGraficoBonoEficiencia;
	//public JList<Reporte> jListColumnasValoresGraficoBonoEficiencia;
	//public JScrollPane jScrollColumnasValoresGraficoBonoEficiencia;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoBonoEficiencia;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoBonoEficiencia;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasBonoEficiencia;
	
	
	
	
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
	public BonoEficienciaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("BonoEficiencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BonoEficienciaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BonoEficiencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BonoEficienciaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BonoEficiencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BonoEficienciaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BonoEficiencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionBonoEficiencia)	{
		this.jButtonRecargarInformacionBonoEficiencia = jButtonRecargarInformacionBonoEficiencia;
	}
	
	public JButton getjButtonProcesarInformacionBonoEficiencia() {
		return this.jButtonProcesarInformacionBonoEficiencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBonoEficiencia)	{
		this.jButtonProcesarInformacionBonoEficiencia = jButtonProcesarInformacionBonoEficiencia;
	}
	
	
	public JButton getjButtonRecargarInformacionBonoEficiencia() {
		return this.jButtonRecargarInformacionBonoEficiencia;
	}
	
	
	public List<BonoEficiencia> getbonoeficiencias() {
		return this.bonoeficiencias;
	}

	public void setbonoeficiencias(List<BonoEficiencia> bonoeficiencias) {
		this.bonoeficiencias = bonoeficiencias;
	}
	
	public List<BonoEficiencia> getbonoeficienciasAux() {
		return this.bonoeficienciasAux;
	}

	public void setbonoeficienciasAux(List<BonoEficiencia> bonoeficienciasAux) {
		this.bonoeficienciasAux = bonoeficienciasAux;
	}
	
	public List<BonoEficiencia> getbonoeficienciasEliminados() {
		return this.bonoeficienciasEliminados;
	}

	public void setBonoEficienciasEliminados(List<BonoEficiencia> bonoeficienciasEliminados) {
		this.bonoeficienciasEliminados = bonoeficienciasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarBonoEficiencia() {
		return jComboBoxTiposSeleccionarBonoEficiencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarBonoEficiencia(
			JComboBox jComboBoxTiposSeleccionarBonoEficiencia) {
		this.jComboBoxTiposSeleccionarBonoEficiencia = jComboBoxTiposSeleccionarBonoEficiencia;
	}
	
	public void setBorderResaltarTiposSeleccionarBonoEficiencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarBonoEficiencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarBonoEficiencia .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralBonoEficiencia() {
		return jTextFieldValorCampoGeneralBonoEficiencia;
	}

	public void setjTextFieldValorCampoGeneralBonoEficiencia(
			JTextField jTextFieldValorCampoGeneralBonoEficiencia) {
		this.jTextFieldValorCampoGeneralBonoEficiencia = jTextFieldValorCampoGeneralBonoEficiencia;
	}

	public void setBorderResaltarValorCampoGeneralBonoEficiencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBonoEficiencia.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralBonoEficiencia .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosBonoEficiencia() {
		return this.jCheckBoxSeleccionarTodosBonoEficiencia;
	}

	public void setjCheckBoxSeleccionarTodosBonoEficiencia(
			JCheckBox jCheckBoxSeleccionarTodosBonoEficiencia) {
		this.jCheckBoxSeleccionarTodosBonoEficiencia = jCheckBoxSeleccionarTodosBonoEficiencia;
	}

	public void setBorderResaltarSeleccionarTodosBonoEficiencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBonoEficiencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosBonoEficiencia .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosBonoEficiencia() {
		return this.jCheckBoxSeleccionadosBonoEficiencia;
	}

	public void setjCheckBoxSeleccionadosBonoEficiencia(
			JCheckBox jCheckBoxSeleccionadosBonoEficiencia) {
		this.jCheckBoxSeleccionadosBonoEficiencia = jCheckBoxSeleccionadosBonoEficiencia;
	}
	
	public void setBorderResaltarSeleccionadosBonoEficiencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBonoEficiencia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosBonoEficiencia .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesBonoEficiencia() {
		return this.jComboBoxTiposArchivosReportesBonoEficiencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesBonoEficiencia(
			JComboBox jComboBoxTiposArchivosReportesBonoEficiencia) {
		this.jComboBoxTiposArchivosReportesBonoEficiencia = jComboBoxTiposArchivosReportesBonoEficiencia;
	}

	public void setBorderResaltarTiposArchivosReportesBonoEficiencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBonoEficiencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesBonoEficiencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesBonoEficiencia() {
		return this.jComboBoxTiposReportesBonoEficiencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesBonoEficiencia(
			JComboBox jComboBoxTiposReportesBonoEficiencia) {
		this.jComboBoxTiposReportesBonoEficiencia = jComboBoxTiposReportesBonoEficiencia;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoBonoEficiencia() {
	//	return jComboBoxTiposReportesDinamicoBonoEficiencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoBonoEficiencia(
	//		JComboBox jComboBoxTiposReportesDinamicoBonoEficiencia) {
	//	this.jComboBoxTiposReportesDinamicoBonoEficiencia = jComboBoxTiposReportesDinamicoBonoEficiencia;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoBonoEficiencia() {
	//	return jComboBoxTiposArchivosReportesDinamicoBonoEficiencia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoBonoEficiencia(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoBonoEficiencia) {
	//	this.jComboBoxTiposArchivosReportesDinamicoBonoEficiencia = jComboBoxTiposArchivosReportesDinamicoBonoEficiencia;
	//}
	
	public void setBorderResaltarTiposReportesBonoEficiencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBonoEficiencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesBonoEficiencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesBonoEficiencia() {
		return this.jComboBoxTiposGraficosReportesBonoEficiencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesBonoEficiencia(
			JComboBox jComboBoxTiposGraficosReportesBonoEficiencia) {
		this.jComboBoxTiposGraficosReportesBonoEficiencia = jComboBoxTiposGraficosReportesBonoEficiencia;
	}
	
	public void setBorderResaltarTiposGraficosReportesBonoEficiencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBonoEficiencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesBonoEficiencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionBonoEficiencia() {
		return this.jComboBoxTiposPaginacionBonoEficiencia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionBonoEficiencia(
			JComboBox jComboBoxTiposPaginacionBonoEficiencia) {
		this.jComboBoxTiposPaginacionBonoEficiencia = jComboBoxTiposPaginacionBonoEficiencia;
	}
	
	public void setBorderResaltarTiposPaginacionBonoEficiencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBonoEficiencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionBonoEficiencia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesBonoEficiencia() {
		return this.jComboBoxTiposRelacionesBonoEficiencia;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBonoEficiencia() {
		return this.jComboBoxTiposAccionesBonoEficiencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBonoEficiencia(
			JComboBox jComboBoxTiposRelacionesBonoEficiencia) {
		this.jComboBoxTiposRelacionesBonoEficiencia = jComboBoxTiposRelacionesBonoEficiencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBonoEficiencia(
			JComboBox jComboBoxTiposAccionesBonoEficiencia) {
		this.jComboBoxTiposAccionesBonoEficiencia = jComboBoxTiposAccionesBonoEficiencia;
	}
	
	public void setBorderResaltarTiposRelacionesBonoEficiencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBonoEficiencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesBonoEficiencia .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesBonoEficiencia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBonoEficiencia.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesBonoEficiencia .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoBonoEficiencia() {
	//	return jCheckBoxConGraficoDinamicoBonoEficiencia;
	//}

	//public void setjCheckBoxConGraficoDinamicoBonoEficiencia(
	//		JCheckBox jCheckBoxConGraficoDinamicoBonoEficiencia) {
	//	this.jCheckBoxConGraficoDinamicoBonoEficiencia = jCheckBoxConGraficoDinamicoBonoEficiencia;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoBonoEficiencia() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarBonoEficiencia.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoBonoEficiencia .setBorder(borderResaltar);		
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
		this.bonoeficienciaSessionBean=new BonoEficienciaSessionBean();
		
		this.bonoeficienciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bonoeficienciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bonoeficienciaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=BonoEficienciaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=BonoEficienciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BonoEficienciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BonoEficienciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BonoEficienciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Bono Eficiencia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
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
		
		BonoEficienciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("BonoEficiencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarBonoEficiencia= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarBonoEficiencia,this.jTtoolBarBonoEficiencia,
							"nuevo","nuevo","Nuevo"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarBonoEficiencia,this.jTtoolBarBonoEficiencia,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarBonoEficiencia,this.jTtoolBarBonoEficiencia,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarBonoEficiencia,this.jTtoolBarBonoEficiencia,
							"duplicar","duplicar","Duplicar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarBonoEficiencia,this.jTtoolBarBonoEficiencia,
							"copiar","copiar","Copiar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarBonoEficiencia,this.jTtoolBarBonoEficiencia,
							"ver_form","ver_form","Ver"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBonoEficiencia,this.jTtoolBarBonoEficiencia,
							"recargar","recargar","Recargar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBonoEficiencia,this.jTtoolBarBonoEficiencia,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBonoEficiencia,this.jTtoolBarBonoEficiencia,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarBonoEficiencia,this.jTtoolBarBonoEficiencia,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarBonoEficiencia,this.jTtoolBarBonoEficiencia,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarBonoEficiencia,this.jTtoolBarBonoEficiencia,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarBonoEficiencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarBonoEficiencia,this.jTtoolBarBonoEficiencia,
							"cerrar","cerrar","Salir"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarBonoEficiencia=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarBonoEficiencia;
			
				this.jButtonProcesarInformacionToolBarBonoEficiencia=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarBonoEficiencia;
				
		//protected JButton jButtonModificarToolBarBonoEficiencia;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarBonoEficiencia=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuBonoEficiencia=new JMenuMe("General");
		this.jmenuArchivoBonoEficiencia=new JMenuMe("Archivo");
		this.jmenuAccionesBonoEficiencia=new JMenuMe("Acciones");
		this.jmenuDatosBonoEficiencia=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBonoEficiencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBonoEficiencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBonoEficiencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarBonoEficiencia= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarBonoEficiencia.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarBonoEficiencia,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesBonoEficiencia= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesBonoEficiencia.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesBonoEficiencia,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosBonoEficiencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBonoEficiencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBonoEficiencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarBonoEficiencia= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarBonoEficiencia.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarBonoEficiencia,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormBonoEficiencia= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormBonoEficiencia.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormBonoEficiencia,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaBonoEficiencia= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaBonoEficiencia.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaBonoEficiencia,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBonoEficiencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBonoEficiencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBonoEficiencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionBonoEficiencia= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionBonoEficiencia.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionBonoEficiencia,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionBonoEficiencia= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionBonoEficiencia.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionBonoEficiencia,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresBonoEficiencia= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresBonoEficiencia.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresBonoEficiencia,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesBonoEficiencia= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesBonoEficiencia.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesBonoEficiencia,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByBonoEficiencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByBonoEficiencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByBonoEficiencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBonoEficiencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBonoEficiencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBonoEficiencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByBonoEficiencia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByBonoEficiencia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByBonoEficiencia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBonoEficiencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBonoEficiencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBonoEficiencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosBonoEficiencia= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosBonoEficiencia.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosBonoEficiencia,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoBonoEficiencia.add(this.jMenuItemCerrarBonoEficiencia);
			
			this.jmenuAccionesBonoEficiencia.add(this.jMenuItemNuevoBonoEficiencia);
			this.jmenuAccionesBonoEficiencia.add(this.jMenuItemNuevoGuardarCambiosBonoEficiencia);
			this.jmenuAccionesBonoEficiencia.add(this.jMenuItemNuevoRelacionesBonoEficiencia);
			this.jmenuAccionesBonoEficiencia.add(this.jMenuItemGuardarCambiosTablaBonoEficiencia);		
			this.jmenuAccionesBonoEficiencia.add(this.jMenuItemDuplicarBonoEficiencia);		
			this.jmenuAccionesBonoEficiencia.add(this.jMenuItemCopiarBonoEficiencia);		
			this.jmenuAccionesBonoEficiencia.add(this.jMenuItemVerFormBonoEficiencia);		
			
			this.jmenuDatosBonoEficiencia.add(this.jMenuItemRecargarInformacionBonoEficiencia);				
			this.jmenuDatosBonoEficiencia.add(this.jMenuItemAnterioresBonoEficiencia);				
			this.jmenuDatosBonoEficiencia.add(this.jMenuItemSiguientesBonoEficiencia);				
			this.jmenuDatosBonoEficiencia.add(this.jMenuItemAbrirOrderByBonoEficiencia);				
			this.jmenuDatosBonoEficiencia.add(this.jMenuItemMostrarOcultarBonoEficiencia);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesBonoEficiencia.add(this.jMenuItemGuardarCambiosBonoEficiencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarBonoEficiencia.add(this.jmenuArchivoBonoEficiencia);		
			this.jmenuBarBonoEficiencia.add(this.jmenuAccionesBonoEficiencia);		
			this.jmenuBarBonoEficiencia.add(this.jmenuDatosBonoEficiencia);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarBonoEficiencia);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasBonoEficiencia() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasBonoEficiencia=new JTabbedPane();


		this.jTabbedPaneBusquedasBonoEficiencia.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasBonoEficiencia.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasBonoEficiencia.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasBonoEficiencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasBonoEficiencia,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleBonoEficiencia = new BonoEficienciaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Bono Eficiencia DATOS");
			this.jInternalFrameDetalleFormBonoEficiencia = new BonoEficienciaDetalleFormJInternalFrame(jDesktopPane,this.bonoeficienciaSessionBean.getConGuardarRelaciones(),this.bonoeficienciaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormBonoEficiencia = null;//new BonoEficienciaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBonoEficiencia= new GridBagLayout();
		
		
		this.jTableDatosBonoEficiencia = new JTableMe();      
		
		String sToolTipBonoEficiencia="";
		sToolTipBonoEficiencia=BonoEficienciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBonoEficiencia+="(Nomina.BonoEficiencia)";
		}
		
		if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipBonoEficiencia+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosBonoEficiencia.setToolTipText(sToolTipBonoEficiencia);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosBonoEficiencia);
		this.jTableDatosBonoEficiencia.setAutoCreateRowSorter(true);
		this.jTableDatosBonoEficiencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosBonoEficiencia.setRowSelectionAllowed(true);
		this.jTableDatosBonoEficiencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosBonoEficiencia,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoBonoEficiencia = new JButtonMe();
		this.jButtonDuplicarBonoEficiencia = new JButtonMe();
		this.jButtonCopiarBonoEficiencia = new JButtonMe();
		this.jButtonVerFormBonoEficiencia = new JButtonMe();
		this.jButtonNuevoRelacionesBonoEficiencia = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaBonoEficiencia = new JButtonMe();
		this.jButtonCerrarBonoEficiencia = new JButtonMe();
		
		this.jScrollPanelDatosBonoEficiencia = new JScrollPane();   
        this.jScrollPanelDatosGeneralBonoEficiencia = new JScrollPane();
		
				
		
		
		this.jPanelAccionesBonoEficiencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Bono Eficiencia";
		
		if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bono Eficiencias" + this.sPath));
		} else {
			this.jScrollPanelDatosBonoEficiencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBonoEficiencia.setToolTipText("Acciones");
        this.jPanelAccionesBonoEficiencia.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoBonoEficiencia=new ReporteDinamicoJInternalFrame(BonoEficienciaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoBonoEficiencia();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionBonoEficiencia=new ImportacionJInternalFrame(BonoEficienciaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionBonoEficiencia();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByBonoEficiencia = new JButtonMe();
		
		this.jButtonAbrirOrderByBonoEficiencia.setText("Orden");
		this.jButtonAbrirOrderByBonoEficiencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBonoEficiencia,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByBonoEficiencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBonoEficiencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBonoEficiencia,false,this);
			
			//this.cargarOrderByBonoEficiencia(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBonoEficiencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBonoEficiencia,true,this);
			
			//this.cargarOrderByBonoEficiencia(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosBonoEficiencia.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosBonoEficiencia.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosBonoEficiencia.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosBonoEficiencia.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosBonoEficiencia.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosBonoEficiencia.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoBonoEficiencia.setText("Nuevo");
		this.jButtonDuplicarBonoEficiencia.setText("Duplicar");
		this.jButtonCopiarBonoEficiencia.setText("Copiar");
		this.jButtonVerFormBonoEficiencia.setText("Ver");
		this.jButtonNuevoRelacionesBonoEficiencia.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaBonoEficiencia.setText("Guardar");
		this.jButtonCerrarBonoEficiencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBonoEficiencia,"nuevo_button","Nuevo",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarBonoEficiencia,"duplicar_button","Duplicar",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarBonoEficiencia,"copiar_button","Copiar",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormBonoEficiencia,"ver_form","Ver",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesBonoEficiencia,"nuevorelaciones_button","Nuevo Rel",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBonoEficiencia,"guardarcambiostabla_button","Guardar",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBonoEficiencia,"cerrar_button","Salir",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoBonoEficiencia.setToolTipText("Nuevo"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarBonoEficiencia.setToolTipText("Duplicar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarBonoEficiencia.setToolTipText("Copiar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormBonoEficiencia.setToolTipText("Ver"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesBonoEficiencia.setToolTipText("Nuevo Rel"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaBonoEficiencia.setToolTipText("Guardar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBonoEficiencia.setToolTipText("Salir"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBonoEficiencia";
		inputMap = this.jButtonNuevoBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBonoEficiencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBonoEficiencia"));
		
		//DUPLICAR
		sMapKey = "DuplicarBonoEficiencia";
		inputMap = this.jButtonDuplicarBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarBonoEficiencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarBonoEficiencia"));
		
		//COPIAR
		sMapKey = "CopiarBonoEficiencia";
		inputMap = this.jButtonCopiarBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarBonoEficiencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarBonoEficiencia"));
		
		//VEr FORM
		sMapKey = "VerFormBonoEficiencia";
		inputMap = this.jButtonVerFormBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormBonoEficiencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormBonoEficiencia"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesBonoEficiencia";
		inputMap = this.jButtonNuevoRelacionesBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesBonoEficiencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesBonoEficiencia"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarBonoEficiencia";
		inputMap = this.jButtonModificarBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarBonoEficiencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarBonoEficiencia"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarBonoEficiencia";
		inputMap = this.jButtonCerrarBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBonoEficiencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBonoEficiencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBonoEficiencia";
		inputMap = this.jButtonGuardarCambiosTablaBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBonoEficiencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBonoEficiencia"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesBonoEficiencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesBonoEficiencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionBonoEficiencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1BonoEficiencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2BonoEficiencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3BonoEficiencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4BonoEficiencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5BonoEficiencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesBonoEficiencia.setName("jPanelParametrosReportesBonoEficiencia"); 
		
		this.jPanelParametrosReportesAccionesBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesBonoEficiencia.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesBonoEficiencia.setName("jPanelParametrosReportesAccionesBonoEficiencia"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesBonoEficiencia, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionBonoEficiencia = new JButtonMe();
		this.jButtonRecargarInformacionBonoEficiencia.setText("Recargar");
		this.jButtonRecargarInformacionBonoEficiencia.setToolTipText("Recargar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionBonoEficiencia,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionBonoEficiencia = new JButtonMe();
		this.jButtonProcesarInformacionBonoEficiencia.setText("Procesar");
		this.jButtonProcesarInformacionBonoEficiencia.setToolTipText("Procesar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionBonoEficiencia.setVisible(false);
			
		this.jButtonProcesarInformacionBonoEficiencia.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBonoEficiencia.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBonoEficiencia.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesBonoEficiencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBonoEficiencia.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesBonoEficiencia.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesBonoEficiencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBonoEficiencia.setText("TIPO");       
		this.jComboBoxTiposReportesBonoEficiencia.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesBonoEficiencia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBonoEficiencia.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesBonoEficiencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionBonoEficiencia = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionBonoEficiencia.setText("Paginacion");
		this.jComboBoxTiposPaginacionBonoEficiencia.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesBonoEficiencia = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesBonoEficiencia.setText("Accion");
		this.jComboBoxTiposRelacionesBonoEficiencia.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesBonoEficiencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBonoEficiencia.setText("Accion");
		this.jComboBoxTiposAccionesBonoEficiencia.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarBonoEficiencia = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarBonoEficiencia.setText("Accion");
		this.jComboBoxTiposSeleccionarBonoEficiencia.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralBonoEficiencia=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralBonoEficiencia.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBonoEficiencia.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBonoEficiencia.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesBonoEficiencia = new JLabelMe();
		
		this.jLabelAccionesBonoEficiencia.setText("Acciones");		
		this.jLabelAccionesBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosBonoEficiencia = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosBonoEficiencia.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosBonoEficiencia.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosBonoEficiencia = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosBonoEficiencia.setText("Seleccionados");
		this.jCheckBoxSeleccionadosBonoEficiencia.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaBonoEficiencia = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaBonoEficiencia.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaBonoEficiencia.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteBonoEficiencia = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteBonoEficiencia.setText("Graf.");
		this.jCheckBoxConGraficoReporteBonoEficiencia.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresBonoEficiencia = new JButtonMe();
		//this.jButtonAnterioresBonoEficiencia.setText("<<");
        this.jButtonAnterioresBonoEficiencia.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresBonoEficiencia,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesBonoEficiencia = new JButtonMe();
		//this.jButtonSiguientesBonoEficiencia.setText(">>");
        this.jButtonSiguientesBonoEficiencia.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesBonoEficiencia,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosBonoEficiencia = new JButtonMe();
		this.jButtonNuevoGuardarCambiosBonoEficiencia.setText("Nue");
        this.jButtonNuevoGuardarCambiosBonoEficiencia.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosBonoEficiencia,"nuevoguardarcambios_button","Nue",this.bonoeficienciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosBonoEficiencia";
		inputMap = this.jButtonNuevoGuardarCambiosBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosBonoEficiencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosBonoEficiencia"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionBonoEficiencia";
		inputMap = this.jButtonRecargarInformacionBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionBonoEficiencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionBonoEficiencia"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesBonoEficiencia";
		inputMap = this.jButtonSiguientesBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesBonoEficiencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesBonoEficiencia"));
		
		//ANTERIORES		
		sMapKey = "AnterioresBonoEficiencia";
		inputMap = this.jButtonAnterioresBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresBonoEficiencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresBonoEficiencia"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasBonoEficiencia();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesBonoEficiencia.setMinimumSize(new Dimension(this.getWidth(),BonoEficienciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BonoEficienciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBonoEficiencia.setMaximumSize(new Dimension(this.getWidth(),BonoEficienciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BonoEficienciaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBonoEficiencia.setPreferredSize(new Dimension(this.getWidth(),BonoEficienciaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BonoEficienciaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionBonoEficiencia = new GridBagLayout();

			this.jPanelPaginacionBonoEficiencia.setLayout(gridaBagLayoutPaginacionBonoEficiencia);						
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy = 0;
			this.gridBagConstraintsBonoEficiencia.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionBonoEficiencia.add(this.jButtonAnterioresBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
					
						
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBonoEficiencia.gridy = 0;
			
			this.jPanelPaginacionBonoEficiencia.add(this.jButtonNuevoGuardarCambiosBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
						
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsBonoEficiencia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBonoEficiencia.gridy = 0;
			this.jPanelPaginacionBonoEficiencia.add(this.jButtonSiguientesBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy = 1;
			this.gridBagConstraintsBonoEficiencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBonoEficiencia.add(this.jButtonNuevoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
						
			
			
			if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
				this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsBonoEficiencia.gridy = 1;
				this.gridBagConstraintsBonoEficiencia.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionBonoEficiencia.add(this.jButtonGuardarCambiosTablaBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
			}
			
			
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy = 1;
			this.gridBagConstraintsBonoEficiencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBonoEficiencia.add(this.jButtonDuplicarBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy = 1;
			this.gridBagConstraintsBonoEficiencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBonoEficiencia.add(this.jButtonCopiarBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy = 1;
			this.gridBagConstraintsBonoEficiencia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBonoEficiencia.add(this.jButtonVerFormBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy = 1;
			this.gridBagConstraintsBonoEficiencia.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionBonoEficiencia.add(this.jButtonCerrarBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
		
		
		this.jButtonRecargarInformacionBonoEficiencia.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBonoEficiencia.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBonoEficiencia.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesBonoEficiencia.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBonoEficiencia.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBonoEficiencia.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesBonoEficiencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBonoEficiencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBonoEficiencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesBonoEficiencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBonoEficiencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBonoEficiencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionBonoEficiencia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBonoEficiencia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBonoEficiencia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesBonoEficiencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBonoEficiencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBonoEficiencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesBonoEficiencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBonoEficiencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBonoEficiencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarBonoEficiencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBonoEficiencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBonoEficiencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaBonoEficiencia.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBonoEficiencia.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBonoEficiencia.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteBonoEficiencia.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBonoEficiencia.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBonoEficiencia.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosBonoEficiencia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBonoEficiencia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBonoEficiencia.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosBonoEficiencia.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBonoEficiencia.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBonoEficiencia.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesBonoEficiencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesBonoEficiencia = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1BonoEficiencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2BonoEficiencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3BonoEficiencia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4BonoEficiencia = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesBonoEficiencia.setLayout(gridaBagParametrosReportesBonoEficiencia);
			this.jPanelParametrosReportesAccionesBonoEficiencia.setLayout(gridaBagParametrosReportesAccionesBonoEficiencia);
			
			
			this.jPanelParametrosAuxiliar1BonoEficiencia.setLayout(gridaBagParametrosAuxiliar1BonoEficiencia);
			this.jPanelParametrosAuxiliar2BonoEficiencia.setLayout(gridaBagParametrosAuxiliar2BonoEficiencia);
			this.jPanelParametrosAuxiliar3BonoEficiencia.setLayout(gridaBagParametrosAuxiliar3BonoEficiencia);
			this.jPanelParametrosAuxiliar4BonoEficiencia.setLayout(gridaBagParametrosAuxiliar4BonoEficiencia);
			//this.jPanelParametrosAuxiliar5BonoEficiencia.setLayout(gridaBagParametrosAuxiliar2BonoEficiencia);			
			
			
			
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBonoEficiencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBonoEficiencia.add(this.jButtonRecargarInformacionBonoEficiencia, this.gridBagConstraintsBonoEficiencia);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBonoEficiencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BonoEficiencia.add(this.jComboBoxTiposPaginacionBonoEficiencia, this.gridBagConstraintsBonoEficiencia);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBonoEficiencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BonoEficiencia.add(this.jCheckBoxConAltoMaximoTablaBonoEficiencia, this.gridBagConstraintsBonoEficiencia);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBonoEficiencia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BonoEficiencia.add(this.jComboBoxTiposArchivosReportesBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBonoEficiencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBonoEficiencia.add(this.jPanelParametrosAuxiliar1BonoEficiencia, this.gridBagConstraintsBonoEficiencia);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBonoEficiencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4BonoEficiencia.add(this.jComboBoxTiposReportesBonoEficiencia, this.gridBagConstraintsBonoEficiencia);																		
			
			
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBonoEficiencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4BonoEficiencia.add(this.jComboBoxTiposGraficosReportesBonoEficiencia, this.gridBagConstraintsBonoEficiencia);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBonoEficiencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBonoEficiencia.add(this.jPanelParametrosAuxiliar4BonoEficiencia, this.gridBagConstraintsBonoEficiencia);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsBonoEficiencia.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBonoEficiencia.add(this.jComboBoxTiposReportesBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBonoEficiencia.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBonoEficiencia.add(this.jCheckBoxGenerarReporteBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBonoEficiencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBonoEficiencia.add(this.jPanelParametrosAuxiliar2BonoEficiencia, this.gridBagConstraintsBonoEficiencia);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBonoEficiencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBonoEficiencia.add(this.jLabelAccionesBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
				this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsBonoEficiencia.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesBonoEficiencia.add(this.jButtonAbrirOrderByBonoEficiencia, this.gridBagConstraintsBonoEficiencia);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBonoEficiencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBonoEficiencia.add(this.jComboBoxTiposSeleccionarBonoEficiencia, this.gridBagConstraintsBonoEficiencia);			
			
			
			/*
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBonoEficiencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBonoEficiencia.add(this.jCheckBoxSeleccionarTodosBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBonoEficiencia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBonoEficiencia.add(this.jCheckBoxConGraficoReporteBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBonoEficiencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BonoEficiencia.add(this.jCheckBoxSeleccionarTodosBonoEficiencia, this.gridBagConstraintsBonoEficiencia);															
				
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBonoEficiencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BonoEficiencia.add(this.jCheckBoxSeleccionadosBonoEficiencia, this.gridBagConstraintsBonoEficiencia);															
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBonoEficiencia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BonoEficiencia.add(this.jCheckBoxConGraficoReporteBonoEficiencia, this.gridBagConstraintsBonoEficiencia);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBonoEficiencia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBonoEficiencia.add(this.jPanelParametrosAuxiliar3BonoEficiencia, this.gridBagConstraintsBonoEficiencia);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBonoEficiencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBonoEficiencia.add(this.jComboBoxTiposAccionesBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
	
				
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBonoEficiencia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBonoEficiencia.add(this.jTextFieldValorCampoGeneralBonoEficiencia, this.gridBagConstraintsBonoEficiencia);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosBonoEficiencia = new GridBagLayout();

			this.jScrollPanelDatosBonoEficiencia.setLayout(gridaBagLayoutDatosBonoEficiencia);
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy = 0;
			this.gridBagConstraintsBonoEficiencia.gridx = 0;
			
			this.jScrollPanelDatosBonoEficiencia.add(this.jTableDatosBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosBonoEficiencia.setViewportView(this.jTableDatosBonoEficiencia);
		this.jTableDatosBonoEficiencia.setFillsViewportHeight(true);
		this.jTableDatosBonoEficiencia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesBonoEficiencia= new GridBagLayout();
		this.jPanelAccionesBonoEficiencia.setLayout(gridaBagLayoutAccionesBonoEficiencia);
		
		
		/*	
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBonoEficiencia.gridy = 0;
		this.gridBagConstraintsBonoEficiencia.gridx = 0;
			
		this.jPanelAccionesBonoEficiencia.add(this.jButtonNuevoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBonoEficiencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBonoEficiencia);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();						
			this.gridBagConstraintsBonoEficiencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBonoEficiencia.gridx = 0;		
			//this.gridBagConstraintsBonoEficiencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBonoEficiencia.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarBonoEficiencia, this.gridBagConstraintsBonoEficiencia);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy = iGridyPrincipal++;
		this.gridBagConstraintsBonoEficiencia.gridx = 0;		
		//this.gridBagConstraintsBonoEficiencia.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBonoEficiencia.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsBonoEficiencia.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsBonoEficiencia);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBonoEficiencia.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesBonoEficiencia, this.gridBagConstraintsBonoEficiencia);								
		
		
		/*
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBonoEficiencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		*/		
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBonoEficiencia.gridx =0;
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBonoEficiencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
				
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBonoEficiencia.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(BonoEficienciaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosBonoEficiencia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBonoEficiencia = new GridBagLayout();
			this.jPanelBusquedasParametrosBonoEficiencia.setLayout(gridaBagLayoutBusquedasParametrosBonoEficiencia);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralBonoEficiencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBonoEficiencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBonoEficiencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBonoEficiencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBonoEficiencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
			
			
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBonoEficiencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
			
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBonoEficiencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralBonoEficiencia;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoBonoEficiencia() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoBonoEficiencia = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoBonoEficiencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoBonoEficiencia.setName("jPanelReporteDinamicoBonoEficiencia"); 
		
		this.jPanelReporteDinamicoBonoEficiencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBonoEficiencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBonoEficiencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoBonoEficiencia.setLayout(gridaBagLayoutReporteDinamicoBonoEficiencia);
		
		
		this.jInternalFrameReporteDinamicoBonoEficiencia= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoBonoEficiencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBonoEficiencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoBonoEficiencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoBonoEficiencia.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoBonoEficiencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoBonoEficiencia.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoBonoEficiencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoBonoEficiencia.setResizable(true);
	    this.jInternalFrameReporteDinamicoBonoEficiencia.setClosable(true);
	    this.jInternalFrameReporteDinamicoBonoEficiencia.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoBonoEficiencia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBonoEficiencia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBonoEficiencia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bono Eficiencias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteBonoEficiencia = new JLabelMe();

		this.jLabelColumnasSelectReporteBonoEficiencia.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jLabelColumnasSelectReporteBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteBonoEficiencia = new JList<Reporte>();
		this.jListColumnasSelectReporteBonoEficiencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteBonoEficiencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteBonoEficiencia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBonoEficiencia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBonoEficiencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteBonoEficiencia=new JScrollPane(this.jListColumnasSelectReporteBonoEficiencia);
			
			this.jScrollColumnasSelectReporteBonoEficiencia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBonoEficiencia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBonoEficiencia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoBonoEficiencia.add(this.jListColumnasSelectReporteBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jScrollColumnasSelectReporteBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteBonoEficiencia = new JLabelMe();

		this.jLabelRelacionesSelectReporteBonoEficiencia.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteBonoEficiencia = new JList<Reporte>();
		this.jListRelacionesSelectReporteBonoEficiencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteBonoEficiencia.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteBonoEficiencia.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBonoEficiencia.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBonoEficiencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteBonoEficiencia=new JScrollPane(this.jListRelacionesSelectReporteBonoEficiencia);
			
			this.jScrollRelacionesSelectReporteBonoEficiencia.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBonoEficiencia.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBonoEficiencia.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoBonoEficiencia = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoBonoEficiencia = new JComboBoxMe();
		this.jListColumnasValoresGraficoBonoEficiencia = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoBonoEficiencia = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoBonoEficiencia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoBonoEficiencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBonoEficiencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBonoEficiencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoBonoEficiencia = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoBonoEficiencia.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoBonoEficiencia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBonoEficiencia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBonoEficiencia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoBonoEficiencia = new JLabelMe();

		this.jLabelConGraficoDinamicoBonoEficiencia.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jLabelConGraficoDinamicoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoBonoEficiencia = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoBonoEficiencia.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoBonoEficiencia.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoBonoEficiencia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBonoEficiencia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBonoEficiencia.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jCheckBoxConGraficoDinamicoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoBonoEficiencia = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoBonoEficiencia.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jLabelColumnaCategoriaGraficoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoBonoEficiencia = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBonoEficiencia.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoBonoEficiencia.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoBonoEficiencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBonoEficiencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBonoEficiencia.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jComboBoxColumnaCategoriaGraficoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorBonoEficiencia = new JLabelMe();

		this.jLabelColumnaCategoriaValorBonoEficiencia.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jLabelColumnaCategoriaValorBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorBonoEficiencia = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorBonoEficiencia.setText("Accion");
        this.jComboBoxColumnaCategoriaValorBonoEficiencia.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorBonoEficiencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBonoEficiencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBonoEficiencia.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jComboBoxColumnaCategoriaValorBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoBonoEficiencia = new JLabelMe();

		this.jLabelColumnasValoresGraficoBonoEficiencia.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jLabelColumnasValoresGraficoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoBonoEficiencia = new JList<Reporte>();
		this.jListColumnasValoresGraficoBonoEficiencia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoBonoEficiencia.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoBonoEficiencia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBonoEficiencia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBonoEficiencia.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoBonoEficiencia=new JScrollPane(this.jListColumnasValoresGraficoBonoEficiencia);
			
			this.jScrollColumnasValoresGraficoBonoEficiencia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBonoEficiencia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBonoEficiencia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoBonoEficiencia.add(this.jListColumnasSelectReporteBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jScrollColumnasValoresGraficoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoBonoEficiencia = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoBonoEficiencia.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jLabelTiposGraficosReportesDinamicoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoBonoEficiencia = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBonoEficiencia.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoBonoEficiencia.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoBonoEficiencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBonoEficiencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBonoEficiencia.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jComboBoxTiposGraficosReportesDinamicoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoBonoEficiencia = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoBonoEficiencia.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jLabelGenerarExcelReporteDinamicoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoBonoEficiencia = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoBonoEficiencia.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoBonoEficiencia,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoBonoEficiencia.setToolTipText("Generar EXCEL"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		//this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoBonoEficiencia.add(this.jButtonGenerarExcelReporteDinamicoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jComboBoxTiposReportesDinamicoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoBonoEficiencia = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoBonoEficiencia.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jLabelTiposArchivoReporteDinamicoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jComboBoxTiposArchivosReportesDinamicoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoBonoEficiencia = new JButtonMe();
		this.jButtonGenerarReporteDinamicoBonoEficiencia.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoBonoEficiencia,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoBonoEficiencia.setToolTipText("Generar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jButtonGenerarReporteDinamicoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoBonoEficiencia = new JButtonMe();
		this.jButtonCerrarReporteDinamicoBonoEficiencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoBonoEficiencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoBonoEficiencia.setToolTipText("Cancelar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBonoEficiencia.add(this.jButtonCerrarReporteDinamicoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalBonoEficiencia = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoBonoEficiencia= new JScrollPane(jPanelReporteDinamicoBonoEficiencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoBonoEficiencia.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBonoEficiencia.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBonoEficiencia.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bono Eficiencias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsBonoEficiencia.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoBonoEficiencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoBonoEficiencia.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalBonoEficiencia);
		this.jInternalFrameReporteDinamicoBonoEficiencia.getContentPane().add(this.jScrollPanelReporteDinamicoBonoEficiencia, this.gridBagConstraintsBonoEficiencia);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionBonoEficiencia() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionBonoEficiencia = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionBonoEficiencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionBonoEficiencia.setName("jPanelImportacionBonoEficiencia"); 
		
		this.jPanelImportacionBonoEficiencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBonoEficiencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBonoEficiencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionBonoEficiencia.setLayout(gridaBagLayoutImportacionBonoEficiencia);
		
		
		this.jInternalFrameImportacionBonoEficiencia= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionBonoEficiencia= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionBonoEficiencia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBonoEficiencia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionBonoEficiencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBonoEficiencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBonoEficiencia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionBonoEficiencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBonoEficiencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBonoEficiencia.setResizable(true);
	    this.jInternalFrameImportacionBonoEficiencia.setClosable(true);
	    this.jInternalFrameImportacionBonoEficiencia.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionBonoEficiencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBonoEficiencia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBonoEficiencia.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionBonoEficiencia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBonoEficiencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBonoEficiencia.setResizable(true);
	    this.jInternalFrameImportacionBonoEficiencia.setClosable(true);
	    this.jInternalFrameImportacionBonoEficiencia.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionBonoEficiencia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBonoEficiencia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBonoEficiencia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bono Eficiencias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionBonoEficiencia = new JLabelMe();

		this.jLabelArchivoImportacionBonoEficiencia.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBonoEficiencia.add(this.jLabelArchivoImportacionBonoEficiencia, this.gridBagConstraintsBonoEficiencia);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionBonoEficiencia = new JFileChooser();		
		this.jFileChooserImportacionBonoEficiencia.setToolTipText("ESCOGER ARCHIVO"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionBonoEficiencia = new JButtonMe();
		this.jButtonAbrirImportacionBonoEficiencia.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionBonoEficiencia,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionBonoEficiencia.setToolTipText("Generar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYImportacion;
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBonoEficiencia.add(this.jButtonAbrirImportacionBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionBonoEficiencia = new JLabelMe();

		this.jLabelPathArchivoImportacionBonoEficiencia.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionBonoEficiencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBonoEficiencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBonoEficiencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYImportacion;		
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBonoEficiencia.add(this.jLabelPathArchivoImportacionBonoEficiencia, this.gridBagConstraintsBonoEficiencia);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionBonoEficiencia=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionBonoEficiencia.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBonoEficiencia.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBonoEficiencia.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYImportacion;
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBonoEficiencia.add(this.jTextFieldPathArchivoImportacionBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionBonoEficiencia = new JButtonMe();
		this.jButtonGenerarImportacionBonoEficiencia.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionBonoEficiencia,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionBonoEficiencia.setToolTipText("Generar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYImportacion;
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBonoEficiencia.add(this.jButtonGenerarImportacionBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionBonoEficiencia = new JButtonMe();
		this.jButtonCerrarImportacionBonoEficiencia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionBonoEficiencia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionBonoEficiencia.setToolTipText("Cancelar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBonoEficiencia.gridy = iPosYImportacion;
		this.gridBagConstraintsBonoEficiencia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBonoEficiencia.add(this.jButtonCerrarImportacionBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalBonoEficiencia = new GridBagLayout();
		
		this.jScrollPanelImportacionBonoEficiencia= new JScrollPane(jPanelImportacionBonoEficiencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
		this.gridBagConstraintsBonoEficiencia.gridy =iPosYImportacion;
		this.gridBagConstraintsBonoEficiencia.gridx =iPosXImportacion;
		this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionBonoEficiencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionBonoEficiencia.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalBonoEficiencia);
		this.jInternalFrameImportacionBonoEficiencia.getContentPane().add(this.jScrollPanelImportacionBonoEficiencia, this.gridBagConstraintsBonoEficiencia);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByBonoEficiencia(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByBonoEficiencia = new JButtonMe();
			this.jButtonAbrirOrderByBonoEficiencia.setText("Orden");
			this.jButtonAbrirOrderByBonoEficiencia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBonoEficiencia,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByBonoEficiencia";
			inputMap = this.jButtonAbrirOrderByBonoEficiencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByBonoEficiencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByBonoEficiencia"));
		
		
			GridBagLayout gridaBagLayoutOrderByBonoEficiencia = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByBonoEficiencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByBonoEficiencia.setName("jPanelOrderByBonoEficiencia"); 
			
			this.jPanelOrderByBonoEficiencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBonoEficiencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBonoEficiencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByBonoEficiencia.setLayout(gridaBagLayoutOrderByBonoEficiencia);
			
			
			this.jTableDatosBonoEficienciaOrderBy = new JTableMe();        
			this.jTableDatosBonoEficienciaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosBonoEficienciaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosBonoEficienciaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosBonoEficienciaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosBonoEficienciaOrderBy.setViewportView(this.jTableDatosBonoEficienciaOrderBy);
			this.jTableDatosBonoEficienciaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosBonoEficienciaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByBonoEficiencia= new OrderByJInternalFrame();
			this.jInternalFrameOrderByBonoEficiencia= new OrderByJInternalFrame();
			this.jScrollPanelOrderByBonoEficiencia = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteBonoEficiencia= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByBonoEficiencia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByBonoEficiencia.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByBonoEficiencia.setTitle("Orden");
			this.jInternalFrameOrderByBonoEficiencia.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByBonoEficiencia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByBonoEficiencia.setResizable(true);
			this.jInternalFrameOrderByBonoEficiencia.setClosable(true);
			this.jInternalFrameOrderByBonoEficiencia.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByBonoEficiencia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBonoEficiencia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBonoEficiencia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByBonoEficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bono Eficiencias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.gridy =iPosYOrderBy++;
			this.gridBagConstraintsBonoEficiencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsBonoEficiencia.ipady =150;
				
			this.jPanelOrderByBonoEficiencia.add(jScrollPanelDatosBonoEficienciaOrderBy, this.gridBagConstraintsBonoEficiencia);//this.jTableDatosBonoEficienciaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByBonoEficiencia = new JButtonMe();
			this.jButtonCerrarOrderByBonoEficiencia.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByBonoEficiencia,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByBonoEficiencia.setToolTipText("Cancelar"+" "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByBonoEficiencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBonoEficiencia.gridy = iPosYOrderBy++;
			this.gridBagConstraintsBonoEficiencia.gridx = iPosXOrderBy;
									
			this.jPanelOrderByBonoEficiencia.add(this.jButtonCerrarOrderByBonoEficiencia, this.gridBagConstraintsBonoEficiencia);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalBonoEficiencia = new GridBagLayout();
			
			this.jScrollPanelOrderByBonoEficiencia= new JScrollPane(jPanelOrderByBonoEficiencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsBonoEficiencia = new GridBagConstraints();
			this.gridBagConstraintsBonoEficiencia.gridy =iPosYOrderBy;
			this.gridBagConstraintsBonoEficiencia.gridx =iPosXOrderBy;
			this.gridBagConstraintsBonoEficiencia.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByBonoEficiencia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByBonoEficiencia.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalBonoEficiencia);
			
			this.jInternalFrameOrderByBonoEficiencia.getContentPane().add(this.jScrollPanelOrderByBonoEficiencia, this.gridBagConstraintsBonoEficiencia);			
		
		} else {
			this.jButtonAbrirOrderByBonoEficiencia = new JButtonMe();
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
			&& this.bonoeficienciaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosBonoEficiencia.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosBonoEficiencia.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosBonoEficiencia.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosBonoEficiencia.getRowHeight();//BonoEficienciaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > BonoEficienciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBonoEficiencia.isSelected()) {
					iHeightTable=BonoEficienciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BonoEficienciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BonoEficienciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > BonoEficienciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBonoEficiencia.isSelected()) {
					iHeightTable=BonoEficienciaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BonoEficienciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BonoEficienciaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosBonoEficiencia.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBonoEficiencia.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBonoEficiencia.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosBonoEficiencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBonoEficiencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBonoEficiencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByBonoEficiencia!=null && this.jInternalFrameOrderByBonoEficiencia.getjTableDatosOrderBy()!=null) {
			//if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByBonoEficiencia.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByBonoEficiencia.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByBonoEficiencia.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByBonoEficiencia.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByBonoEficiencia.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByBonoEficiencia.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByBonoEficiencia.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosBonoEficiencia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBonoEficiencia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBonoEficiencia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=bonoeficienciaLogic.getBonoEficiencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bonoeficiencias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<BonoEficiencia> TraerBonoEficienciaBeans(List<BonoEficiencia> bonoeficiencias,ArrayList<Classe> classes)throws Exception {
		try {
			for(BonoEficiencia bonoeficiencia:bonoeficiencias) {
					
				if(!(BonoEficienciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || BonoEficienciaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					bonoeficiencia.setsDetalleGeneralEntityReporte(BonoEficienciaConstantesFunciones.getBonoEficienciaDescripcion(bonoeficiencia));
										
						
					
						
					
				} else  {
							
					//bonoeficiencia.setsDetalleGeneralEntityReporte(bonoeficiencia.getsDetalleGeneralEntityReporte());
										
				}
				
				//bonoeficienciabeans.add(bonoeficienciabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return bonoeficiencias;
    }
	//PARA REPORTES FIN
}
