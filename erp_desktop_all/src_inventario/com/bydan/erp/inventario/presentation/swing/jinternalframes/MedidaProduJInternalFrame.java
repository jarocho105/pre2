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
import com.bydan.erp.inventario.util.MedidaProduConstantesFunciones;

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
public class MedidaProduJInternalFrame extends MedidaProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarMedidaProdu;
	
	protected JMenuBar jmenuBarMedidaProdu;
	
	protected JMenu jmenuMedidaProdu;
	protected JMenu jmenuDatosMedidaProdu;
	protected JMenu jmenuArchivoMedidaProdu;
	protected JMenu jmenuAccionesMedidaProdu;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosMedidaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMedidaProdu;	
	protected GridBagConstraints gridBagConstraintsMedidaProdu;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public MedidaProduDetalleFormJInternalFrame jInternalFrameDetalleFormMedidaProdu;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoMedidaProdu;	
	protected ImportacionJInternalFrame jInternalFrameImportacionMedidaProdu;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public MedidaProduSessionBean medidaproduSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<MedidaProdu> medidaprodus;		
	public List<MedidaProdu> medidaprodusEliminados;	
	public List<MedidaProdu> medidaprodusAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByMedidaProdu;		
	protected JButton jButtonAbrirOrderByMedidaProdu;
	
	
	//protected JPanel jPanelOrderByMedidaProdu;
	//public JScrollPane jScrollPanelOrderByMedidaProdu;	
	//protected JButton jButtonCerrarOrderByMedidaProdu;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public MedidaProduLogic medidaproduLogic;
	
	
	
	public JScrollPane jScrollPanelDatosMedidaProdu;
	public JScrollPane jScrollPanelDatosEdicionMedidaProdu;
	public JScrollPane jScrollPanelDatosGeneralMedidaProdu;
    
	
	
	//public JScrollPane jScrollPanelDatosMedidaProduOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoMedidaProdu;
	//public JScrollPane jScrollPanelImportacionMedidaProdu;
	
	
	
	protected JPanel jPanelAccionesMedidaProdu;
	
    protected JPanel jPanelPaginacionMedidaProdu;
    protected JPanel jPanelParametrosReportesMedidaProdu;
	protected JPanel jPanelParametrosReportesAccionesMedidaProdu;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1MedidaProdu;
	protected JPanel jPanelParametrosAuxiliar2MedidaProdu;
	protected JPanel jPanelParametrosAuxiliar3MedidaProdu;
	protected JPanel jPanelParametrosAuxiliar4MedidaProdu;
	//protected JPanel jPanelParametrosAuxiliar5MedidaProdu;
	
	
	
	//protected JPanel jPanelReporteDinamicoMedidaProdu;
	//protected JPanel jPanelImportacionMedidaProdu;
	
	
	public JTable jTableDatosMedidaProdu;
	
	
	
	//public JTable jTableDatosMedidaProduOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoMedidaProdu;
	protected JButton jButtonDuplicarMedidaProdu;
	protected JButton jButtonCopiarMedidaProdu;
	protected JButton jButtonVerFormMedidaProdu;
	protected JButton jButtonNuevoRelacionesMedidaProdu;
	protected JButton jButtonModificarMedidaProdu;
	
    protected JButton jButtonGuardarCambiosTablaMedidaProdu;
	protected JButton jButtonCerrarMedidaProdu;
	
	
	protected JButton jButtonRecargarInformacionMedidaProdu;
	protected JButton jButtonProcesarInformacionMedidaProdu;
	
	
	protected JButton jButtonAnterioresMedidaProdu;
	protected JButton jButtonSiguientesMedidaProdu;
	protected JButton jButtonNuevoGuardarCambiosMedidaProdu;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoMedidaProdu;
	//protected JButton jButtonCerrarReporteDinamicoMedidaProdu;
	//protected JButton jButtonGenerarExcelReporteDinamicoMedidaProdu;	
	
	
	
	//protected JButton jButtonAbrirImportacionMedidaProdu;
	//protected JButton jButtonGenerarImportacionMedidaProdu;
	//protected JButton jButtonCerrarImportacionMedidaProdu;
	//protected JFileChooser jFileChooserImportacionMedidaProdu;
	//protected File fileImportacionMedidaProdu;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMedidaProdu;
	protected JButton jButtonDuplicarToolBarMedidaProdu;
	protected JButton jButtonNuevoRelacionesToolBarMedidaProdu;
	
	
	public JButton jButtonGuardarCambiosToolBarMedidaProdu;
	protected JButton jButtonCopiarToolBarMedidaProdu;
	protected JButton jButtonVerFormToolBarMedidaProdu;
	public JButton jButtonGuardarCambiosTablaToolBarMedidaProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarMedidaProdu;
	protected JButton jButtonCerrarToolBarMedidaProdu;
	
	protected JButton jButtonRecargarInformacionToolBarMedidaProdu;
	protected JButton jButtonProcesarInformacionToolBarMedidaProdu;
	protected JButton jButtonAnterioresToolBarMedidaProdu;
	protected JButton jButtonSiguientesToolBarMedidaProdu;
	protected JButton jButtonNuevoGuardarCambiosToolBarMedidaProdu;
	protected JButton jButtonAbrirOrderByToolBarMedidaProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMedidaProdu;
	protected JMenuItem jMenuItemDuplicarMedidaProdu;
	protected JMenuItem jMenuItemNuevoRelacionesMedidaProdu;
	
	
	protected JMenuItem jMenuItemGuardarCambiosMedidaProdu;
	protected JMenuItem jMenuItemCopiarMedidaProdu;
	protected JMenuItem jMenuItemVerFormMedidaProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaMedidaProdu;
	protected JMenuItem jMenuItemCerrarMedidaProdu;
	protected JMenuItem jMenuItemDetalleCerrarMedidaProdu;
	protected JMenuItem jMenuItemDetalleAbrirOrderByMedidaProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarMedidaProdu;
	
	protected JMenuItem jMenuItemRecargarInformacionMedidaProdu;
	protected JMenuItem jMenuItemProcesarInformacionMedidaProdu;
	protected JMenuItem jMenuItemAnterioresMedidaProdu;
	protected JMenuItem jMenuItemSiguientesMedidaProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMedidaProdu;
	protected JMenuItem jMenuItemAbrirOrderByMedidaProdu;
	protected JMenuItem jMenuItemMostrarOcultarMedidaProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMedidaProdu;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosMedidaProdu;
	protected JCheckBox jCheckBoxSeleccionadosMedidaProdu;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaMedidaProdu;
	protected JCheckBox jCheckBoxConGraficoReporteMedidaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesMedidaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesMedidaProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoMedidaProdu;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoMedidaProdu;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesMedidaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionMedidaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMedidaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMedidaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarMedidaProdu;
	protected JTextField jTextFieldValorCampoGeneralMedidaProdu;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteMedidaProdu;
	//public JList<Reporte> jListColumnasSelectReporteMedidaProdu;
	//public JScrollPane jScrollColumnasSelectReporteMedidaProdu;
	
	//public JLabel jLabelRelacionesSelectReporteMedidaProdu;
	//public JList<Reporte> jListRelacionesSelectReporteMedidaProdu;
	//public JScrollPane jScrollRelacionesSelectReporteMedidaProdu;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoMedidaProdu;
	//protected JCheckBox jCheckBoxConGraficoDinamicoMedidaProdu;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoMedidaProdu;
	//public JLabel jLabelTiposArchivoReporteDinamicoMedidaProdu;
	
		
	//public JLabel jLabelArchivoImportacionMedidaProdu;	
	//public JLabel jLabelPathArchivoImportacionMedidaProdu;
	//protected JTextField jTextFieldPathArchivoImportacionMedidaProdu;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoMedidaProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoMedidaProdu;
	
	//public JLabel jLabelColumnaCategoriaValorMedidaProdu;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorMedidaProdu;
	
	//public JLabel jLabelColumnasValoresGraficoMedidaProdu;
	//public JList<Reporte> jListColumnasValoresGraficoMedidaProdu;
	//public JScrollPane jScrollColumnasValoresGraficoMedidaProdu;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoMedidaProdu;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoMedidaProdu;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasMedidaProdu;
	
	
	
	
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
	public MedidaProduJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("MedidaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MedidaProduJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MedidaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MedidaProduJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MedidaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MedidaProduJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MedidaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionMedidaProdu)	{
		this.jButtonRecargarInformacionMedidaProdu = jButtonRecargarInformacionMedidaProdu;
	}
	
	public JButton getjButtonProcesarInformacionMedidaProdu() {
		return this.jButtonProcesarInformacionMedidaProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMedidaProdu)	{
		this.jButtonProcesarInformacionMedidaProdu = jButtonProcesarInformacionMedidaProdu;
	}
	
	
	public JButton getjButtonRecargarInformacionMedidaProdu() {
		return this.jButtonRecargarInformacionMedidaProdu;
	}
	
	
	public List<MedidaProdu> getmedidaprodus() {
		return this.medidaprodus;
	}

	public void setmedidaprodus(List<MedidaProdu> medidaprodus) {
		this.medidaprodus = medidaprodus;
	}
	
	public List<MedidaProdu> getmedidaprodusAux() {
		return this.medidaprodusAux;
	}

	public void setmedidaprodusAux(List<MedidaProdu> medidaprodusAux) {
		this.medidaprodusAux = medidaprodusAux;
	}
	
	public List<MedidaProdu> getmedidaprodusEliminados() {
		return this.medidaprodusEliminados;
	}

	public void setMedidaProdusEliminados(List<MedidaProdu> medidaprodusEliminados) {
		this.medidaprodusEliminados = medidaprodusEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarMedidaProdu() {
		return jComboBoxTiposSeleccionarMedidaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarMedidaProdu(
			JComboBox jComboBoxTiposSeleccionarMedidaProdu) {
		this.jComboBoxTiposSeleccionarMedidaProdu = jComboBoxTiposSeleccionarMedidaProdu;
	}
	
	public void setBorderResaltarTiposSeleccionarMedidaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarMedidaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarMedidaProdu .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralMedidaProdu() {
		return jTextFieldValorCampoGeneralMedidaProdu;
	}

	public void setjTextFieldValorCampoGeneralMedidaProdu(
			JTextField jTextFieldValorCampoGeneralMedidaProdu) {
		this.jTextFieldValorCampoGeneralMedidaProdu = jTextFieldValorCampoGeneralMedidaProdu;
	}

	public void setBorderResaltarValorCampoGeneralMedidaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMedidaProdu.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralMedidaProdu .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosMedidaProdu() {
		return this.jCheckBoxSeleccionarTodosMedidaProdu;
	}

	public void setjCheckBoxSeleccionarTodosMedidaProdu(
			JCheckBox jCheckBoxSeleccionarTodosMedidaProdu) {
		this.jCheckBoxSeleccionarTodosMedidaProdu = jCheckBoxSeleccionarTodosMedidaProdu;
	}

	public void setBorderResaltarSeleccionarTodosMedidaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMedidaProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosMedidaProdu .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosMedidaProdu() {
		return this.jCheckBoxSeleccionadosMedidaProdu;
	}

	public void setjCheckBoxSeleccionadosMedidaProdu(
			JCheckBox jCheckBoxSeleccionadosMedidaProdu) {
		this.jCheckBoxSeleccionadosMedidaProdu = jCheckBoxSeleccionadosMedidaProdu;
	}
	
	public void setBorderResaltarSeleccionadosMedidaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMedidaProdu.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosMedidaProdu .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesMedidaProdu() {
		return this.jComboBoxTiposArchivosReportesMedidaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesMedidaProdu(
			JComboBox jComboBoxTiposArchivosReportesMedidaProdu) {
		this.jComboBoxTiposArchivosReportesMedidaProdu = jComboBoxTiposArchivosReportesMedidaProdu;
	}

	public void setBorderResaltarTiposArchivosReportesMedidaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMedidaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesMedidaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesMedidaProdu() {
		return this.jComboBoxTiposReportesMedidaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesMedidaProdu(
			JComboBox jComboBoxTiposReportesMedidaProdu) {
		this.jComboBoxTiposReportesMedidaProdu = jComboBoxTiposReportesMedidaProdu;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoMedidaProdu() {
	//	return jComboBoxTiposReportesDinamicoMedidaProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoMedidaProdu(
	//		JComboBox jComboBoxTiposReportesDinamicoMedidaProdu) {
	//	this.jComboBoxTiposReportesDinamicoMedidaProdu = jComboBoxTiposReportesDinamicoMedidaProdu;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoMedidaProdu() {
	//	return jComboBoxTiposArchivosReportesDinamicoMedidaProdu;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoMedidaProdu(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoMedidaProdu) {
	//	this.jComboBoxTiposArchivosReportesDinamicoMedidaProdu = jComboBoxTiposArchivosReportesDinamicoMedidaProdu;
	//}
	
	public void setBorderResaltarTiposReportesMedidaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMedidaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesMedidaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesMedidaProdu() {
		return this.jComboBoxTiposGraficosReportesMedidaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesMedidaProdu(
			JComboBox jComboBoxTiposGraficosReportesMedidaProdu) {
		this.jComboBoxTiposGraficosReportesMedidaProdu = jComboBoxTiposGraficosReportesMedidaProdu;
	}
	
	public void setBorderResaltarTiposGraficosReportesMedidaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMedidaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesMedidaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionMedidaProdu() {
		return this.jComboBoxTiposPaginacionMedidaProdu;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionMedidaProdu(
			JComboBox jComboBoxTiposPaginacionMedidaProdu) {
		this.jComboBoxTiposPaginacionMedidaProdu = jComboBoxTiposPaginacionMedidaProdu;
	}
	
	public void setBorderResaltarTiposPaginacionMedidaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMedidaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionMedidaProdu .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesMedidaProdu() {
		return this.jComboBoxTiposRelacionesMedidaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMedidaProdu() {
		return this.jComboBoxTiposAccionesMedidaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMedidaProdu(
			JComboBox jComboBoxTiposRelacionesMedidaProdu) {
		this.jComboBoxTiposRelacionesMedidaProdu = jComboBoxTiposRelacionesMedidaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMedidaProdu(
			JComboBox jComboBoxTiposAccionesMedidaProdu) {
		this.jComboBoxTiposAccionesMedidaProdu = jComboBoxTiposAccionesMedidaProdu;
	}
	
	public void setBorderResaltarTiposRelacionesMedidaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMedidaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesMedidaProdu .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesMedidaProdu() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarMedidaProdu.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesMedidaProdu .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoMedidaProdu() {
	//	return jCheckBoxConGraficoDinamicoMedidaProdu;
	//}

	//public void setjCheckBoxConGraficoDinamicoMedidaProdu(
	//		JCheckBox jCheckBoxConGraficoDinamicoMedidaProdu) {
	//	this.jCheckBoxConGraficoDinamicoMedidaProdu = jCheckBoxConGraficoDinamicoMedidaProdu;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoMedidaProdu() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarMedidaProdu.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoMedidaProdu .setBorder(borderResaltar);		
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
		this.medidaproduSessionBean=new MedidaProduSessionBean();
		
		this.medidaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.medidaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.medidaproduSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=MedidaProduJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=MedidaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MedidaProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MedidaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MedidaProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Medida Produ MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
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
		
		MedidaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("MedidaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarMedidaProdu= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarMedidaProdu,this.jTtoolBarMedidaProdu,
							"nuevo","nuevo","Nuevo"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarMedidaProdu,this.jTtoolBarMedidaProdu,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarMedidaProdu,this.jTtoolBarMedidaProdu,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarMedidaProdu,this.jTtoolBarMedidaProdu,
							"duplicar","duplicar","Duplicar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarMedidaProdu,this.jTtoolBarMedidaProdu,
							"copiar","copiar","Copiar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarMedidaProdu,this.jTtoolBarMedidaProdu,
							"ver_form","ver_form","Ver"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMedidaProdu,this.jTtoolBarMedidaProdu,
							"recargar","recargar","Recargar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMedidaProdu,this.jTtoolBarMedidaProdu,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarMedidaProdu,this.jTtoolBarMedidaProdu,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarMedidaProdu,this.jTtoolBarMedidaProdu,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarMedidaProdu,this.jTtoolBarMedidaProdu,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarMedidaProdu,this.jTtoolBarMedidaProdu,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarMedidaProdu,this.jTtoolBarMedidaProdu,
							"cerrar","cerrar","Salir"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarMedidaProdu=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarMedidaProdu;
			
				this.jButtonProcesarInformacionToolBarMedidaProdu=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarMedidaProdu;
				
		//protected JButton jButtonModificarToolBarMedidaProdu;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarMedidaProdu=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuMedidaProdu=new JMenuMe("General");
		this.jmenuArchivoMedidaProdu=new JMenuMe("Archivo");
		this.jmenuAccionesMedidaProdu=new JMenuMe("Acciones");
		this.jmenuDatosMedidaProdu=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMedidaProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMedidaProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMedidaProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarMedidaProdu= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarMedidaProdu.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarMedidaProdu,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesMedidaProdu= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesMedidaProdu.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesMedidaProdu,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosMedidaProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMedidaProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMedidaProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarMedidaProdu= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarMedidaProdu.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarMedidaProdu,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormMedidaProdu= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormMedidaProdu.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormMedidaProdu,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaMedidaProdu= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaMedidaProdu.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaMedidaProdu,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMedidaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMedidaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMedidaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionMedidaProdu= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionMedidaProdu.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionMedidaProdu,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionMedidaProdu= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionMedidaProdu.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionMedidaProdu,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresMedidaProdu= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresMedidaProdu.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresMedidaProdu,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesMedidaProdu= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesMedidaProdu.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesMedidaProdu,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByMedidaProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByMedidaProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByMedidaProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMedidaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMedidaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMedidaProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByMedidaProdu= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByMedidaProdu.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByMedidaProdu,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMedidaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMedidaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMedidaProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosMedidaProdu= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosMedidaProdu.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosMedidaProdu,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoMedidaProdu.add(this.jMenuItemCerrarMedidaProdu);
			
			this.jmenuAccionesMedidaProdu.add(this.jMenuItemNuevoMedidaProdu);
			this.jmenuAccionesMedidaProdu.add(this.jMenuItemNuevoGuardarCambiosMedidaProdu);
			this.jmenuAccionesMedidaProdu.add(this.jMenuItemNuevoRelacionesMedidaProdu);
			this.jmenuAccionesMedidaProdu.add(this.jMenuItemGuardarCambiosTablaMedidaProdu);		
			this.jmenuAccionesMedidaProdu.add(this.jMenuItemDuplicarMedidaProdu);		
			this.jmenuAccionesMedidaProdu.add(this.jMenuItemCopiarMedidaProdu);		
			this.jmenuAccionesMedidaProdu.add(this.jMenuItemVerFormMedidaProdu);		
			
			this.jmenuDatosMedidaProdu.add(this.jMenuItemRecargarInformacionMedidaProdu);				
			this.jmenuDatosMedidaProdu.add(this.jMenuItemAnterioresMedidaProdu);				
			this.jmenuDatosMedidaProdu.add(this.jMenuItemSiguientesMedidaProdu);				
			this.jmenuDatosMedidaProdu.add(this.jMenuItemAbrirOrderByMedidaProdu);				
			this.jmenuDatosMedidaProdu.add(this.jMenuItemMostrarOcultarMedidaProdu);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesMedidaProdu.add(this.jMenuItemGuardarCambiosMedidaProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarMedidaProdu.add(this.jmenuArchivoMedidaProdu);		
			this.jmenuBarMedidaProdu.add(this.jmenuAccionesMedidaProdu);		
			this.jmenuBarMedidaProdu.add(this.jmenuDatosMedidaProdu);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarMedidaProdu);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasMedidaProdu() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasMedidaProdu=new JTabbedPane();


		this.jTabbedPaneBusquedasMedidaProdu.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMedidaProdu.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasMedidaProdu.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasMedidaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasMedidaProdu,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleMedidaProdu = new MedidaProduDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Medida Produ DATOS");
			this.jInternalFrameDetalleFormMedidaProdu = new MedidaProduDetalleFormJInternalFrame(jDesktopPane,this.medidaproduSessionBean.getConGuardarRelaciones(),this.medidaproduSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormMedidaProdu = null;//new MedidaProduDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMedidaProdu= new GridBagLayout();
		
		
		this.jTableDatosMedidaProdu = new JTableMe();      
		
		String sToolTipMedidaProdu="";
		sToolTipMedidaProdu=MedidaProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMedidaProdu+="(Inventario.MedidaProdu)";
		}
		
		if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipMedidaProdu+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosMedidaProdu.setToolTipText(sToolTipMedidaProdu);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosMedidaProdu);
		this.jTableDatosMedidaProdu.setAutoCreateRowSorter(true);
		this.jTableDatosMedidaProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosMedidaProdu.setRowSelectionAllowed(true);
		this.jTableDatosMedidaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosMedidaProdu,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoMedidaProdu = new JButtonMe();
		this.jButtonDuplicarMedidaProdu = new JButtonMe();
		this.jButtonCopiarMedidaProdu = new JButtonMe();
		this.jButtonVerFormMedidaProdu = new JButtonMe();
		this.jButtonNuevoRelacionesMedidaProdu = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaMedidaProdu = new JButtonMe();
		this.jButtonCerrarMedidaProdu = new JButtonMe();
		
		this.jScrollPanelDatosMedidaProdu = new JScrollPane();   
        this.jScrollPanelDatosGeneralMedidaProdu = new JScrollPane();
		
				
		
		
		this.jPanelAccionesMedidaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Medida Produ";
		
		if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Medida Produs" + this.sPath));
		} else {
			this.jScrollPanelDatosMedidaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMedidaProdu.setToolTipText("Acciones");
        this.jPanelAccionesMedidaProdu.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoMedidaProdu=new ReporteDinamicoJInternalFrame(MedidaProduConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoMedidaProdu();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionMedidaProdu=new ImportacionJInternalFrame(MedidaProduConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionMedidaProdu();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByMedidaProdu = new JButtonMe();
		
		this.jButtonAbrirOrderByMedidaProdu.setText("Orden");
		this.jButtonAbrirOrderByMedidaProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMedidaProdu,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByMedidaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMedidaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMedidaProdu,false,this);
			
			//this.cargarOrderByMedidaProdu(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByMedidaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMedidaProdu,true,this);
			
			//this.cargarOrderByMedidaProdu(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosMedidaProdu.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosMedidaProdu.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosMedidaProdu.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosMedidaProdu.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosMedidaProdu.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosMedidaProdu.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoMedidaProdu.setText("Nuevo");
		this.jButtonDuplicarMedidaProdu.setText("Duplicar");
		this.jButtonCopiarMedidaProdu.setText("Copiar");
		this.jButtonVerFormMedidaProdu.setText("Ver");
		this.jButtonNuevoRelacionesMedidaProdu.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaMedidaProdu.setText("Guardar");
		this.jButtonCerrarMedidaProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMedidaProdu,"nuevo_button","Nuevo",this.medidaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarMedidaProdu,"duplicar_button","Duplicar",this.medidaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarMedidaProdu,"copiar_button","Copiar",this.medidaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormMedidaProdu,"ver_form","Ver",this.medidaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesMedidaProdu,"nuevorelaciones_button","Nuevo Rel",this.medidaproduSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMedidaProdu,"guardarcambiostabla_button","Guardar",this.medidaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMedidaProdu,"cerrar_button","Salir",this.medidaproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoMedidaProdu.setToolTipText("Nuevo"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarMedidaProdu.setToolTipText("Duplicar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarMedidaProdu.setToolTipText("Copiar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormMedidaProdu.setToolTipText("Ver"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesMedidaProdu.setToolTipText("Nuevo Rel"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaMedidaProdu.setToolTipText("Guardar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMedidaProdu.setToolTipText("Salir"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMedidaProdu";
		inputMap = this.jButtonNuevoMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMedidaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMedidaProdu"));
		
		//DUPLICAR
		sMapKey = "DuplicarMedidaProdu";
		inputMap = this.jButtonDuplicarMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarMedidaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarMedidaProdu"));
		
		//COPIAR
		sMapKey = "CopiarMedidaProdu";
		inputMap = this.jButtonCopiarMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarMedidaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarMedidaProdu"));
		
		//VEr FORM
		sMapKey = "VerFormMedidaProdu";
		inputMap = this.jButtonVerFormMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormMedidaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormMedidaProdu"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesMedidaProdu";
		inputMap = this.jButtonNuevoRelacionesMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesMedidaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesMedidaProdu"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarMedidaProdu";
		inputMap = this.jButtonModificarMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarMedidaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarMedidaProdu"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarMedidaProdu";
		inputMap = this.jButtonCerrarMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMedidaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMedidaProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMedidaProdu";
		inputMap = this.jButtonGuardarCambiosTablaMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMedidaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMedidaProdu"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesMedidaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesMedidaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionMedidaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1MedidaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2MedidaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3MedidaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4MedidaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5MedidaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesMedidaProdu.setName("jPanelParametrosReportesMedidaProdu"); 
		
		this.jPanelParametrosReportesAccionesMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesMedidaProdu.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesMedidaProdu.setName("jPanelParametrosReportesAccionesMedidaProdu"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionMedidaProdu = new JButtonMe();
		this.jButtonRecargarInformacionMedidaProdu.setText("Recargar");
		this.jButtonRecargarInformacionMedidaProdu.setToolTipText("Recargar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionMedidaProdu,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionMedidaProdu = new JButtonMe();
		this.jButtonProcesarInformacionMedidaProdu.setText("Procesar");
		this.jButtonProcesarInformacionMedidaProdu.setToolTipText("Procesar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionMedidaProdu.setVisible(false);
			
		this.jButtonProcesarInformacionMedidaProdu.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMedidaProdu.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionMedidaProdu.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesMedidaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMedidaProdu.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesMedidaProdu.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesMedidaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMedidaProdu.setText("TIPO");       
		this.jComboBoxTiposReportesMedidaProdu.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesMedidaProdu = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesMedidaProdu.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesMedidaProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionMedidaProdu = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionMedidaProdu.setText("Paginacion");
		this.jComboBoxTiposPaginacionMedidaProdu.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesMedidaProdu = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesMedidaProdu.setText("Accion");
		this.jComboBoxTiposRelacionesMedidaProdu.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesMedidaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMedidaProdu.setText("Accion");
		this.jComboBoxTiposAccionesMedidaProdu.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarMedidaProdu = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarMedidaProdu.setText("Accion");
		this.jComboBoxTiposSeleccionarMedidaProdu.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralMedidaProdu=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralMedidaProdu.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMedidaProdu.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralMedidaProdu.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesMedidaProdu = new JLabelMe();
		
		this.jLabelAccionesMedidaProdu.setText("Acciones");		
		this.jLabelAccionesMedidaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMedidaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMedidaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosMedidaProdu = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosMedidaProdu.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosMedidaProdu.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosMedidaProdu = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosMedidaProdu.setText("Seleccionados");
		this.jCheckBoxSeleccionadosMedidaProdu.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaMedidaProdu = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaMedidaProdu.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaMedidaProdu.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteMedidaProdu = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteMedidaProdu.setText("Graf.");
		this.jCheckBoxConGraficoReporteMedidaProdu.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresMedidaProdu = new JButtonMe();
		//this.jButtonAnterioresMedidaProdu.setText("<<");
        this.jButtonAnterioresMedidaProdu.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresMedidaProdu,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesMedidaProdu = new JButtonMe();
		//this.jButtonSiguientesMedidaProdu.setText(">>");
        this.jButtonSiguientesMedidaProdu.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesMedidaProdu,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosMedidaProdu = new JButtonMe();
		this.jButtonNuevoGuardarCambiosMedidaProdu.setText("Nue");
        this.jButtonNuevoGuardarCambiosMedidaProdu.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosMedidaProdu,"nuevoguardarcambios_button","Nue",this.medidaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosMedidaProdu";
		inputMap = this.jButtonNuevoGuardarCambiosMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosMedidaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosMedidaProdu"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionMedidaProdu";
		inputMap = this.jButtonRecargarInformacionMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionMedidaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionMedidaProdu"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesMedidaProdu";
		inputMap = this.jButtonSiguientesMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesMedidaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesMedidaProdu"));
		
		//ANTERIORES		
		sMapKey = "AnterioresMedidaProdu";
		inputMap = this.jButtonAnterioresMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresMedidaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresMedidaProdu"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasMedidaProdu();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesMedidaProdu.setMinimumSize(new Dimension(this.getWidth(),MedidaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MedidaProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMedidaProdu.setMaximumSize(new Dimension(this.getWidth(),MedidaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MedidaProduBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesMedidaProdu.setPreferredSize(new Dimension(this.getWidth(),MedidaProduBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(MedidaProduBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionMedidaProdu = new GridBagLayout();

			this.jPanelPaginacionMedidaProdu.setLayout(gridaBagLayoutPaginacionMedidaProdu);						
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.gridy = 0;
			this.gridBagConstraintsMedidaProdu.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionMedidaProdu.add(this.jButtonAnterioresMedidaProdu, this.gridBagConstraintsMedidaProdu);
					
						
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMedidaProdu.gridy = 0;
			
			this.jPanelPaginacionMedidaProdu.add(this.jButtonNuevoGuardarCambiosMedidaProdu, this.gridBagConstraintsMedidaProdu);
						
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsMedidaProdu.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsMedidaProdu.gridy = 0;
			this.jPanelPaginacionMedidaProdu.add(this.jButtonSiguientesMedidaProdu, this.gridBagConstraintsMedidaProdu);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.gridy = 1;
			this.gridBagConstraintsMedidaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMedidaProdu.add(this.jButtonNuevoMedidaProdu, this.gridBagConstraintsMedidaProdu);
						
			
			
			if(!this.medidaproduSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
				this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsMedidaProdu.gridy = 1;
				this.gridBagConstraintsMedidaProdu.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionMedidaProdu.add(this.jButtonGuardarCambiosTablaMedidaProdu, this.gridBagConstraintsMedidaProdu);
			}
			
			
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.gridy = 1;
			this.gridBagConstraintsMedidaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMedidaProdu.add(this.jButtonDuplicarMedidaProdu, this.gridBagConstraintsMedidaProdu);
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.gridy = 1;
			this.gridBagConstraintsMedidaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMedidaProdu.add(this.jButtonCopiarMedidaProdu, this.gridBagConstraintsMedidaProdu);
		
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.gridy = 1;
			this.gridBagConstraintsMedidaProdu.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionMedidaProdu.add(this.jButtonVerFormMedidaProdu, this.gridBagConstraintsMedidaProdu);
		
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.gridy = 1;
			this.gridBagConstraintsMedidaProdu.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionMedidaProdu.add(this.jButtonCerrarMedidaProdu, this.gridBagConstraintsMedidaProdu);
		
		
		
		this.jButtonRecargarInformacionMedidaProdu.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMedidaProdu.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionMedidaProdu.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesMedidaProdu.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMedidaProdu.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesMedidaProdu.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesMedidaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMedidaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesMedidaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesMedidaProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMedidaProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesMedidaProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionMedidaProdu.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMedidaProdu.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionMedidaProdu.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesMedidaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMedidaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesMedidaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesMedidaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMedidaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMedidaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarMedidaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMedidaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarMedidaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaMedidaProdu.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMedidaProdu.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaMedidaProdu.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteMedidaProdu.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMedidaProdu.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteMedidaProdu.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosMedidaProdu.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMedidaProdu.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosMedidaProdu.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosMedidaProdu.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMedidaProdu.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosMedidaProdu.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesMedidaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesMedidaProdu = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1MedidaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2MedidaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3MedidaProdu = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4MedidaProdu = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesMedidaProdu.setLayout(gridaBagParametrosReportesMedidaProdu);
			this.jPanelParametrosReportesAccionesMedidaProdu.setLayout(gridaBagParametrosReportesAccionesMedidaProdu);
			
			
			this.jPanelParametrosAuxiliar1MedidaProdu.setLayout(gridaBagParametrosAuxiliar1MedidaProdu);
			this.jPanelParametrosAuxiliar2MedidaProdu.setLayout(gridaBagParametrosAuxiliar2MedidaProdu);
			this.jPanelParametrosAuxiliar3MedidaProdu.setLayout(gridaBagParametrosAuxiliar3MedidaProdu);
			this.jPanelParametrosAuxiliar4MedidaProdu.setLayout(gridaBagParametrosAuxiliar4MedidaProdu);
			//this.jPanelParametrosAuxiliar5MedidaProdu.setLayout(gridaBagParametrosAuxiliar2MedidaProdu);			
			
			
			
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMedidaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMedidaProdu.add(this.jButtonRecargarInformacionMedidaProdu, this.gridBagConstraintsMedidaProdu);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMedidaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MedidaProdu.add(this.jComboBoxTiposPaginacionMedidaProdu, this.gridBagConstraintsMedidaProdu);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMedidaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MedidaProdu.add(this.jCheckBoxConAltoMaximoTablaMedidaProdu, this.gridBagConstraintsMedidaProdu);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsMedidaProdu.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1MedidaProdu.add(this.jComboBoxTiposArchivosReportesMedidaProdu, this.gridBagConstraintsMedidaProdu);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMedidaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMedidaProdu.add(this.jPanelParametrosAuxiliar1MedidaProdu, this.gridBagConstraintsMedidaProdu);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMedidaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4MedidaProdu.add(this.jComboBoxTiposReportesMedidaProdu, this.gridBagConstraintsMedidaProdu);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMedidaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMedidaProdu.add(this.jPanelParametrosAuxiliar4MedidaProdu, this.gridBagConstraintsMedidaProdu);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsMedidaProdu.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMedidaProdu.add(this.jComboBoxTiposReportesMedidaProdu, this.gridBagConstraintsMedidaProdu);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMedidaProdu.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMedidaProdu.add(this.jCheckBoxGenerarReporteMedidaProdu, this.gridBagConstraintsMedidaProdu);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMedidaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMedidaProdu.add(this.jPanelParametrosAuxiliar2MedidaProdu, this.gridBagConstraintsMedidaProdu);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMedidaProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMedidaProdu.add(this.jLabelAccionesMedidaProdu, this.gridBagConstraintsMedidaProdu);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
				this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsMedidaProdu.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesMedidaProdu.add(this.jButtonAbrirOrderByMedidaProdu, this.gridBagConstraintsMedidaProdu);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMedidaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMedidaProdu.add(this.jComboBoxTiposSeleccionarMedidaProdu, this.gridBagConstraintsMedidaProdu);			
			
			
			/*
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsMedidaProdu.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesMedidaProdu.add(this.jCheckBoxSeleccionarTodosMedidaProdu, this.gridBagConstraintsMedidaProdu);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMedidaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MedidaProdu.add(this.jCheckBoxSeleccionarTodosMedidaProdu, this.gridBagConstraintsMedidaProdu);															
				
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsMedidaProdu.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3MedidaProdu.add(this.jCheckBoxSeleccionadosMedidaProdu, this.gridBagConstraintsMedidaProdu);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMedidaProdu.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesMedidaProdu.add(this.jPanelParametrosAuxiliar3MedidaProdu, this.gridBagConstraintsMedidaProdu);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMedidaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMedidaProdu.add(this.jComboBoxTiposAccionesMedidaProdu, this.gridBagConstraintsMedidaProdu);
	
				
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsMedidaProdu.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesMedidaProdu.add(this.jTextFieldValorCampoGeneralMedidaProdu, this.gridBagConstraintsMedidaProdu);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosMedidaProdu = new GridBagLayout();

			this.jScrollPanelDatosMedidaProdu.setLayout(gridaBagLayoutDatosMedidaProdu);
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.gridy = 0;
			this.gridBagConstraintsMedidaProdu.gridx = 0;
			
			this.jScrollPanelDatosMedidaProdu.add(this.jTableDatosMedidaProdu, this.gridBagConstraintsMedidaProdu);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosMedidaProdu.setViewportView(this.jTableDatosMedidaProdu);
		this.jTableDatosMedidaProdu.setFillsViewportHeight(true);
		this.jTableDatosMedidaProdu.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesMedidaProdu= new GridBagLayout();
		this.jPanelAccionesMedidaProdu.setLayout(gridaBagLayoutAccionesMedidaProdu);
		
		
		/*	
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMedidaProdu.gridy = 0;
		this.gridBagConstraintsMedidaProdu.gridx = 0;
			
		this.jPanelAccionesMedidaProdu.add(this.jButtonNuevoMedidaProdu, this.gridBagConstraintsMedidaProdu);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMedidaProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMedidaProdu);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.medidaproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();						
			this.gridBagConstraintsMedidaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMedidaProdu.gridx = 0;		
			//this.gridBagConstraintsMedidaProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMedidaProdu.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarMedidaProdu, this.gridBagConstraintsMedidaProdu);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy = iGridyPrincipal++;
		this.gridBagConstraintsMedidaProdu.gridx = 0;		
		//this.gridBagConstraintsMedidaProdu.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsMedidaProdu.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsMedidaProdu);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMedidaProdu.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesMedidaProdu, this.gridBagConstraintsMedidaProdu);								
		
		
		/*
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMedidaProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesMedidaProdu, this.gridBagConstraintsMedidaProdu);
		*/		
		
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMedidaProdu.gridx =0;
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMedidaProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMedidaProdu, this.gridBagConstraintsMedidaProdu);
				
		
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMedidaProdu.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionMedidaProdu, this.gridBagConstraintsMedidaProdu);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(MedidaProduJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosMedidaProdu= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMedidaProdu = new GridBagLayout();
			this.jPanelBusquedasParametrosMedidaProdu.setLayout(gridaBagLayoutBusquedasParametrosMedidaProdu);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralMedidaProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMedidaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMedidaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMedidaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMedidaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMedidaProdu, this.gridBagConstraintsMedidaProdu);
			
			
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMedidaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMedidaProdu, this.gridBagConstraintsMedidaProdu);
		
			
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMedidaProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMedidaProdu, this.gridBagConstraintsMedidaProdu);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralMedidaProdu;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoMedidaProdu() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoMedidaProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoMedidaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoMedidaProdu.setName("jPanelReporteDinamicoMedidaProdu"); 
		
		this.jPanelReporteDinamicoMedidaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMedidaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoMedidaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoMedidaProdu.setLayout(gridaBagLayoutReporteDinamicoMedidaProdu);
		
		
		this.jInternalFrameReporteDinamicoMedidaProdu= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoMedidaProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMedidaProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoMedidaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoMedidaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoMedidaProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoMedidaProdu.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoMedidaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoMedidaProdu.setResizable(true);
	    this.jInternalFrameReporteDinamicoMedidaProdu.setClosable(true);
	    this.jInternalFrameReporteDinamicoMedidaProdu.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoMedidaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMedidaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoMedidaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Medida Produs"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteMedidaProdu = new JLabelMe();

		this.jLabelColumnasSelectReporteMedidaProdu.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteMedidaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMedidaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteMedidaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMedidaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMedidaProdu.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoMedidaProdu.add(this.jLabelColumnasSelectReporteMedidaProdu, this.gridBagConstraintsMedidaProdu);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteMedidaProdu = new JList<Reporte>();
		this.jListColumnasSelectReporteMedidaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteMedidaProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteMedidaProdu.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMedidaProdu.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteMedidaProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteMedidaProdu=new JScrollPane(this.jListColumnasSelectReporteMedidaProdu);
			
			this.jScrollColumnasSelectReporteMedidaProdu.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMedidaProdu.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteMedidaProdu.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMedidaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMedidaProdu.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoMedidaProdu.add(this.jListColumnasSelectReporteMedidaProdu, this.gridBagConstraintsMedidaProdu);
		this.jPanelReporteDinamicoMedidaProdu.add(this.jScrollColumnasSelectReporteMedidaProdu, this.gridBagConstraintsMedidaProdu);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteMedidaProdu = new JLabelMe();

		this.jLabelRelacionesSelectReporteMedidaProdu.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteMedidaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMedidaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteMedidaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteMedidaProdu = new JList<Reporte>();
		this.jListRelacionesSelectReporteMedidaProdu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteMedidaProdu.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteMedidaProdu.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMedidaProdu.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteMedidaProdu.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteMedidaProdu=new JScrollPane(this.jListRelacionesSelectReporteMedidaProdu);
			
			this.jScrollRelacionesSelectReporteMedidaProdu.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMedidaProdu.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteMedidaProdu.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoMedidaProdu = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoMedidaProdu = new JComboBoxMe();
		this.jListColumnasValoresGraficoMedidaProdu = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoMedidaProdu = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoMedidaProdu.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoMedidaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMedidaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoMedidaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoMedidaProdu = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoMedidaProdu.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoMedidaProdu.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMedidaProdu.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoMedidaProdu.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoMedidaProdu = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoMedidaProdu.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoMedidaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMedidaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoMedidaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMedidaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMedidaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMedidaProdu.add(this.jLabelGenerarExcelReporteDinamicoMedidaProdu, this.gridBagConstraintsMedidaProdu);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoMedidaProdu = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoMedidaProdu.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoMedidaProdu,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoMedidaProdu.setToolTipText("Generar EXCEL"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		//this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsMedidaProdu.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsMedidaProdu.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoMedidaProdu.add(this.jButtonGenerarExcelReporteDinamicoMedidaProdu, this.gridBagConstraintsMedidaProdu);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMedidaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMedidaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMedidaProdu.add(this.jComboBoxTiposReportesDinamicoMedidaProdu, this.gridBagConstraintsMedidaProdu);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoMedidaProdu = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoMedidaProdu.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoMedidaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMedidaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoMedidaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMedidaProdu.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsMedidaProdu.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoMedidaProdu.add(this.jLabelTiposArchivoReporteDinamicoMedidaProdu, this.gridBagConstraintsMedidaProdu);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMedidaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMedidaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMedidaProdu.add(this.jComboBoxTiposArchivosReportesDinamicoMedidaProdu, this.gridBagConstraintsMedidaProdu);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoMedidaProdu = new JButtonMe();
		this.jButtonGenerarReporteDinamicoMedidaProdu.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoMedidaProdu,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoMedidaProdu.setToolTipText("Generar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMedidaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMedidaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMedidaProdu.add(this.jButtonGenerarReporteDinamicoMedidaProdu, this.gridBagConstraintsMedidaProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoMedidaProdu = new JButtonMe();
		this.jButtonCerrarReporteDinamicoMedidaProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoMedidaProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoMedidaProdu.setToolTipText("Cancelar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMedidaProdu.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsMedidaProdu.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoMedidaProdu.add(this.jButtonCerrarReporteDinamicoMedidaProdu, this.gridBagConstraintsMedidaProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalMedidaProdu = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoMedidaProdu= new JScrollPane(jPanelReporteDinamicoMedidaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoMedidaProdu.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMedidaProdu.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoMedidaProdu.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Medida Produs"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsMedidaProdu.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoMedidaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoMedidaProdu.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalMedidaProdu);
		this.jInternalFrameReporteDinamicoMedidaProdu.getContentPane().add(this.jScrollPanelReporteDinamicoMedidaProdu, this.gridBagConstraintsMedidaProdu);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionMedidaProdu() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionMedidaProdu = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionMedidaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionMedidaProdu.setName("jPanelImportacionMedidaProdu"); 
		
		this.jPanelImportacionMedidaProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMedidaProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionMedidaProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionMedidaProdu.setLayout(gridaBagLayoutImportacionMedidaProdu);
		
		
		this.jInternalFrameImportacionMedidaProdu= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionMedidaProdu= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionMedidaProdu = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteMedidaProdu= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionMedidaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMedidaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMedidaProdu.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionMedidaProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMedidaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMedidaProdu.setResizable(true);
	    this.jInternalFrameImportacionMedidaProdu.setClosable(true);
	    this.jInternalFrameImportacionMedidaProdu.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionMedidaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionMedidaProdu.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionMedidaProdu.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionMedidaProdu.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionMedidaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionMedidaProdu.setResizable(true);
	    this.jInternalFrameImportacionMedidaProdu.setClosable(true);
	    this.jInternalFrameImportacionMedidaProdu.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionMedidaProdu.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMedidaProdu.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionMedidaProdu.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Medida Produs"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionMedidaProdu = new JLabelMe();

		this.jLabelArchivoImportacionMedidaProdu.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionMedidaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMedidaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionMedidaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMedidaProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsMedidaProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMedidaProdu.add(this.jLabelArchivoImportacionMedidaProdu, this.gridBagConstraintsMedidaProdu);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionMedidaProdu = new JFileChooser();		
		this.jFileChooserImportacionMedidaProdu.setToolTipText("ESCOGER ARCHIVO"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionMedidaProdu = new JButtonMe();
		this.jButtonAbrirImportacionMedidaProdu.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionMedidaProdu,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionMedidaProdu.setToolTipText("Generar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMedidaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsMedidaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMedidaProdu.add(this.jButtonAbrirImportacionMedidaProdu, this.gridBagConstraintsMedidaProdu);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionMedidaProdu = new JLabelMe();

		this.jLabelPathArchivoImportacionMedidaProdu.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionMedidaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMedidaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionMedidaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMedidaProdu.gridy = iPosYImportacion;		
		this.gridBagConstraintsMedidaProdu.gridx = iPosXImportacion++;
			
		this.jPanelImportacionMedidaProdu.add(this.jLabelPathArchivoImportacionMedidaProdu, this.gridBagConstraintsMedidaProdu);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionMedidaProdu=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionMedidaProdu.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMedidaProdu.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionMedidaProdu.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMedidaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsMedidaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMedidaProdu.add(this.jTextFieldPathArchivoImportacionMedidaProdu, this.gridBagConstraintsMedidaProdu);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionMedidaProdu = new JButtonMe();
		this.jButtonGenerarImportacionMedidaProdu.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionMedidaProdu,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionMedidaProdu.setToolTipText("Generar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMedidaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsMedidaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMedidaProdu.add(this.jButtonGenerarImportacionMedidaProdu, this.gridBagConstraintsMedidaProdu);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionMedidaProdu = new JButtonMe();
		this.jButtonCerrarImportacionMedidaProdu.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionMedidaProdu,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionMedidaProdu.setToolTipText("Cancelar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMedidaProdu.gridy = iPosYImportacion;
		this.gridBagConstraintsMedidaProdu.gridx = iPosXImportacion++;
							
		this.jPanelImportacionMedidaProdu.add(this.jButtonCerrarImportacionMedidaProdu, this.gridBagConstraintsMedidaProdu);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalMedidaProdu = new GridBagLayout();
		
		this.jScrollPanelImportacionMedidaProdu= new JScrollPane(jPanelImportacionMedidaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy =iPosYImportacion;
		this.gridBagConstraintsMedidaProdu.gridx =iPosXImportacion;
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionMedidaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionMedidaProdu.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalMedidaProdu);
		this.jInternalFrameImportacionMedidaProdu.getContentPane().add(this.jScrollPanelImportacionMedidaProdu, this.gridBagConstraintsMedidaProdu);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByMedidaProdu(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByMedidaProdu = new JButtonMe();
			this.jButtonAbrirOrderByMedidaProdu.setText("Orden");
			this.jButtonAbrirOrderByMedidaProdu.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByMedidaProdu,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByMedidaProdu";
			inputMap = this.jButtonAbrirOrderByMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByMedidaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByMedidaProdu"));
		
		
			GridBagLayout gridaBagLayoutOrderByMedidaProdu = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByMedidaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByMedidaProdu.setName("jPanelOrderByMedidaProdu"); 
			
			this.jPanelOrderByMedidaProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMedidaProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByMedidaProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByMedidaProdu.setLayout(gridaBagLayoutOrderByMedidaProdu);
			
			
			this.jTableDatosMedidaProduOrderBy = new JTableMe();        
			this.jTableDatosMedidaProduOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosMedidaProduOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosMedidaProduOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosMedidaProduOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosMedidaProduOrderBy.setViewportView(this.jTableDatosMedidaProduOrderBy);
			this.jTableDatosMedidaProduOrderBy.setFillsViewportHeight(true);
			this.jTableDatosMedidaProduOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByMedidaProdu= new OrderByJInternalFrame();
			this.jInternalFrameOrderByMedidaProdu= new OrderByJInternalFrame();
			this.jScrollPanelOrderByMedidaProdu = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteMedidaProdu= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByMedidaProdu.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByMedidaProdu.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByMedidaProdu.setTitle("Orden");
			this.jInternalFrameOrderByMedidaProdu.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByMedidaProdu.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByMedidaProdu.setResizable(true);
			this.jInternalFrameOrderByMedidaProdu.setClosable(true);
			this.jInternalFrameOrderByMedidaProdu.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByMedidaProdu.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMedidaProdu.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByMedidaProdu.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Medida Produs"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.gridy =iPosYOrderBy++;
			this.gridBagConstraintsMedidaProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsMedidaProdu.ipady =150;
				
			this.jPanelOrderByMedidaProdu.add(jScrollPanelDatosMedidaProduOrderBy, this.gridBagConstraintsMedidaProdu);//this.jTableDatosMedidaProduTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByMedidaProdu = new JButtonMe();
			this.jButtonCerrarOrderByMedidaProdu.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByMedidaProdu,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByMedidaProdu.setToolTipText("Cancelar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.gridy = iPosYOrderBy++;
			this.gridBagConstraintsMedidaProdu.gridx = iPosXOrderBy;
									
			this.jPanelOrderByMedidaProdu.add(this.jButtonCerrarOrderByMedidaProdu, this.gridBagConstraintsMedidaProdu);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalMedidaProdu = new GridBagLayout();
			
			this.jScrollPanelOrderByMedidaProdu= new JScrollPane(jPanelOrderByMedidaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.gridy =iPosYOrderBy;
			this.gridBagConstraintsMedidaProdu.gridx =iPosXOrderBy;
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByMedidaProdu.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByMedidaProdu.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalMedidaProdu);
			
			this.jInternalFrameOrderByMedidaProdu.getContentPane().add(this.jScrollPanelOrderByMedidaProdu, this.gridBagConstraintsMedidaProdu);			
		
		} else {
			this.jButtonAbrirOrderByMedidaProdu = new JButtonMe();
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
		int iWidthTableCalculado=0;//630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.medidaproduSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosMedidaProdu.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosMedidaProdu.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosMedidaProdu.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosMedidaProdu.getRowHeight();//MedidaProduConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > MedidaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMedidaProdu.isSelected()) {
					iHeightTable=MedidaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MedidaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MedidaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > MedidaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaMedidaProdu.isSelected()) {
					iHeightTable=MedidaProduConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < MedidaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=MedidaProduConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosMedidaProdu.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMedidaProdu.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosMedidaProdu.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosMedidaProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMedidaProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosMedidaProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByMedidaProdu!=null && this.jInternalFrameOrderByMedidaProdu.getjTableDatosOrderBy()!=null) {
			//if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByMedidaProdu.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByMedidaProdu.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByMedidaProdu.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByMedidaProdu.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByMedidaProdu.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByMedidaProdu.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByMedidaProdu.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosMedidaProdu.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMedidaProdu.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosMedidaProdu.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=medidaproduLogic.getMedidaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=medidaprodus.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<MedidaProdu> TraerMedidaProduBeans(List<MedidaProdu> medidaprodus,ArrayList<Classe> classes)throws Exception {
		try {
			for(MedidaProdu medidaprodu:medidaprodus) {
					
				if(!(MedidaProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || MedidaProduConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					medidaprodu.setsDetalleGeneralEntityReporte(MedidaProduConstantesFunciones.getMedidaProduDescripcion(medidaprodu));
										
						
					
						
					
				} else  {
							
					//medidaprodu.setsDetalleGeneralEntityReporte(medidaprodu.getsDetalleGeneralEntityReporte());
										
				}
				
				//medidaprodubeans.add(medidaprodubean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return medidaprodus;
    }
	//PARA REPORTES FIN
}
