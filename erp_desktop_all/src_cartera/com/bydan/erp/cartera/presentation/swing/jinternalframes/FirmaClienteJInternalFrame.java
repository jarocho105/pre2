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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.FirmaClienteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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

	
import java.util.Iterator;
import java.util.List;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@SuppressWarnings("unused")
public class FirmaClienteJInternalFrame extends FirmaClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFirmaCliente;
	
	protected JMenuBar jmenuBarFirmaCliente;
	
	protected JMenu jmenuFirmaCliente;
	protected JMenu jmenuDatosFirmaCliente;
	protected JMenu jmenuArchivoFirmaCliente;
	protected JMenu jmenuAccionesFirmaCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFirmaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFirmaCliente;	
	protected GridBagConstraints gridBagConstraintsFirmaCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FirmaClienteDetalleFormJInternalFrame jInternalFrameDetalleFormFirmaCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFirmaCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFirmaCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoImagenBeanSwingJInternalFrame tipoimagenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoimagen="";
	
	public FirmaClienteSessionBean firmaclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoImagenSessionBean tipoimagenSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<FirmaCliente> firmaclientes;		
	public List<FirmaCliente> firmaclientesEliminados;	
	public List<FirmaCliente> firmaclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFirmaCliente;		
	protected JButton jButtonAbrirOrderByFirmaCliente;
	
	
	//protected JPanel jPanelOrderByFirmaCliente;
	//public JScrollPane jScrollPanelOrderByFirmaCliente;	
	//protected JButton jButtonCerrarOrderByFirmaCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FirmaClienteLogic firmaclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFirmaCliente;
	public JScrollPane jScrollPanelDatosEdicionFirmaCliente;
	public JScrollPane jScrollPanelDatosGeneralFirmaCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosFirmaClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFirmaCliente;
	//public JScrollPane jScrollPanelImportacionFirmaCliente;
	
	
	
	protected JPanel jPanelAccionesFirmaCliente;
	
    protected JPanel jPanelPaginacionFirmaCliente;
    protected JPanel jPanelParametrosReportesFirmaCliente;
	protected JPanel jPanelParametrosReportesAccionesFirmaCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1FirmaCliente;
	protected JPanel jPanelParametrosAuxiliar2FirmaCliente;
	protected JPanel jPanelParametrosAuxiliar3FirmaCliente;
	protected JPanel jPanelParametrosAuxiliar4FirmaCliente;
	//protected JPanel jPanelParametrosAuxiliar5FirmaCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoFirmaCliente;
	//protected JPanel jPanelImportacionFirmaCliente;
	
	
	public JTable jTableDatosFirmaCliente;
	
	
	
	//public JTable jTableDatosFirmaClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFirmaCliente;
	protected JButton jButtonDuplicarFirmaCliente;
	protected JButton jButtonCopiarFirmaCliente;
	protected JButton jButtonVerFormFirmaCliente;
	protected JButton jButtonNuevoRelacionesFirmaCliente;
	protected JButton jButtonModificarFirmaCliente;
	
    protected JButton jButtonGuardarCambiosTablaFirmaCliente;
	protected JButton jButtonCerrarFirmaCliente;
	
	
	protected JButton jButtonRecargarInformacionFirmaCliente;
	protected JButton jButtonProcesarInformacionFirmaCliente;
	
	
	protected JButton jButtonAnterioresFirmaCliente;
	protected JButton jButtonSiguientesFirmaCliente;
	protected JButton jButtonNuevoGuardarCambiosFirmaCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFirmaCliente;
	//protected JButton jButtonCerrarReporteDinamicoFirmaCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoFirmaCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionFirmaCliente;
	//protected JButton jButtonGenerarImportacionFirmaCliente;
	//protected JButton jButtonCerrarImportacionFirmaCliente;
	//protected JFileChooser jFileChooserImportacionFirmaCliente;
	//protected File fileImportacionFirmaCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFirmaCliente;
	protected JButton jButtonDuplicarToolBarFirmaCliente;
	protected JButton jButtonNuevoRelacionesToolBarFirmaCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarFirmaCliente;
	protected JButton jButtonCopiarToolBarFirmaCliente;
	protected JButton jButtonVerFormToolBarFirmaCliente;
	public JButton jButtonGuardarCambiosTablaToolBarFirmaCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarFirmaCliente;
	protected JButton jButtonCerrarToolBarFirmaCliente;
	
	protected JButton jButtonRecargarInformacionToolBarFirmaCliente;
	protected JButton jButtonProcesarInformacionToolBarFirmaCliente;
	protected JButton jButtonAnterioresToolBarFirmaCliente;
	protected JButton jButtonSiguientesToolBarFirmaCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarFirmaCliente;
	protected JButton jButtonAbrirOrderByToolBarFirmaCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFirmaCliente;
	protected JMenuItem jMenuItemDuplicarFirmaCliente;
	protected JMenuItem jMenuItemNuevoRelacionesFirmaCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFirmaCliente;
	protected JMenuItem jMenuItemCopiarFirmaCliente;
	protected JMenuItem jMenuItemVerFormFirmaCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaFirmaCliente;
	protected JMenuItem jMenuItemCerrarFirmaCliente;
	protected JMenuItem jMenuItemDetalleCerrarFirmaCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFirmaCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarFirmaCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionFirmaCliente;
	protected JMenuItem jMenuItemProcesarInformacionFirmaCliente;
	protected JMenuItem jMenuItemAnterioresFirmaCliente;
	protected JMenuItem jMenuItemSiguientesFirmaCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFirmaCliente;
	protected JMenuItem jMenuItemAbrirOrderByFirmaCliente;
	protected JMenuItem jMenuItemMostrarOcultarFirmaCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFirmaCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFirmaCliente;
	protected JCheckBox jCheckBoxSeleccionadosFirmaCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFirmaCliente;
	protected JCheckBox jCheckBoxConGraficoReporteFirmaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFirmaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFirmaCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFirmaCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFirmaCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFirmaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFirmaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFirmaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFirmaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFirmaCliente;
	protected JTextField jTextFieldValorCampoGeneralFirmaCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFirmaCliente;
	//public JList<Reporte> jListColumnasSelectReporteFirmaCliente;
	//public JScrollPane jScrollColumnasSelectReporteFirmaCliente;
	
	//public JLabel jLabelRelacionesSelectReporteFirmaCliente;
	//public JList<Reporte> jListRelacionesSelectReporteFirmaCliente;
	//public JScrollPane jScrollRelacionesSelectReporteFirmaCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFirmaCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFirmaCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFirmaCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoFirmaCliente;
	
		
	//public JLabel jLabelArchivoImportacionFirmaCliente;	
	//public JLabel jLabelPathArchivoImportacionFirmaCliente;
	//protected JTextField jTextFieldPathArchivoImportacionFirmaCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFirmaCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFirmaCliente;
	
	//public JLabel jLabelColumnaCategoriaValorFirmaCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFirmaCliente;
	
	//public JLabel jLabelColumnasValoresGraficoFirmaCliente;
	//public JList<Reporte> jListColumnasValoresGraficoFirmaCliente;
	//public JScrollPane jScrollColumnasValoresGraficoFirmaCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFirmaCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFirmaCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFirmaCliente;
	public JPanel jPanelFK_IdClienteFirmaCliente;
	public JButton jButtonFK_IdClienteFirmaCliente;
	public JPanel jPanelFK_IdTipoImagenFirmaCliente;
	public JButton jButtonFK_IdTipoImagenFirmaCliente;
	
	public JPanel jPanelid_clienteFK_IdClienteFirmaCliente;
	public JLabel jLabelid_clienteFK_IdClienteFirmaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteFirmaCliente;
	public JButton jButtonid_clienteFK_IdClienteFirmaCliente= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteFirmaClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteFirmaClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteFirmaCliente;
	
	public JPanel jPanelid_tipo_imagenFK_IdTipoImagenFirmaCliente;
	public JLabel jLabelid_tipo_imagenFK_IdTipoImagenFirmaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente;
	public JButton jButtonid_tipo_imagenFK_IdTipoImagenFirmaCliente= new JButtonMe();
	public JButton jButtonid_tipo_imagenFK_IdTipoImagenFirmaClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_imagenFK_IdTipoImagenFirmaClienteBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FirmaClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("FirmaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FirmaClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FirmaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FirmaClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FirmaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FirmaClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FirmaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFirmaCliente)	{
		this.jButtonRecargarInformacionFirmaCliente = jButtonRecargarInformacionFirmaCliente;
	}
	
	public JButton getjButtonProcesarInformacionFirmaCliente() {
		return this.jButtonProcesarInformacionFirmaCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFirmaCliente)	{
		this.jButtonProcesarInformacionFirmaCliente = jButtonProcesarInformacionFirmaCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionFirmaCliente() {
		return this.jButtonRecargarInformacionFirmaCliente;
	}
	
	
	public List<FirmaCliente> getfirmaclientes() {
		return this.firmaclientes;
	}

	public void setfirmaclientes(List<FirmaCliente> firmaclientes) {
		this.firmaclientes = firmaclientes;
	}
	
	public List<FirmaCliente> getfirmaclientesAux() {
		return this.firmaclientesAux;
	}

	public void setfirmaclientesAux(List<FirmaCliente> firmaclientesAux) {
		this.firmaclientesAux = firmaclientesAux;
	}
	
	public List<FirmaCliente> getfirmaclientesEliminados() {
		return this.firmaclientesEliminados;
	}

	public void setFirmaClientesEliminados(List<FirmaCliente> firmaclientesEliminados) {
		this.firmaclientesEliminados = firmaclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFirmaCliente() {
		return jComboBoxTiposSeleccionarFirmaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFirmaCliente(
			JComboBox jComboBoxTiposSeleccionarFirmaCliente) {
		this.jComboBoxTiposSeleccionarFirmaCliente = jComboBoxTiposSeleccionarFirmaCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarFirmaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFirmaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFirmaCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFirmaCliente() {
		return jTextFieldValorCampoGeneralFirmaCliente;
	}

	public void setjTextFieldValorCampoGeneralFirmaCliente(
			JTextField jTextFieldValorCampoGeneralFirmaCliente) {
		this.jTextFieldValorCampoGeneralFirmaCliente = jTextFieldValorCampoGeneralFirmaCliente;
	}

	public void setBorderResaltarValorCampoGeneralFirmaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFirmaCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFirmaCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFirmaCliente() {
		return this.jCheckBoxSeleccionarTodosFirmaCliente;
	}

	public void setjCheckBoxSeleccionarTodosFirmaCliente(
			JCheckBox jCheckBoxSeleccionarTodosFirmaCliente) {
		this.jCheckBoxSeleccionarTodosFirmaCliente = jCheckBoxSeleccionarTodosFirmaCliente;
	}

	public void setBorderResaltarSeleccionarTodosFirmaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFirmaCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFirmaCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFirmaCliente() {
		return this.jCheckBoxSeleccionadosFirmaCliente;
	}

	public void setjCheckBoxSeleccionadosFirmaCliente(
			JCheckBox jCheckBoxSeleccionadosFirmaCliente) {
		this.jCheckBoxSeleccionadosFirmaCliente = jCheckBoxSeleccionadosFirmaCliente;
	}
	
	public void setBorderResaltarSeleccionadosFirmaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFirmaCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFirmaCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFirmaCliente() {
		return this.jComboBoxTiposArchivosReportesFirmaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFirmaCliente(
			JComboBox jComboBoxTiposArchivosReportesFirmaCliente) {
		this.jComboBoxTiposArchivosReportesFirmaCliente = jComboBoxTiposArchivosReportesFirmaCliente;
	}

	public void setBorderResaltarTiposArchivosReportesFirmaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFirmaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFirmaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFirmaCliente() {
		return this.jComboBoxTiposReportesFirmaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFirmaCliente(
			JComboBox jComboBoxTiposReportesFirmaCliente) {
		this.jComboBoxTiposReportesFirmaCliente = jComboBoxTiposReportesFirmaCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFirmaCliente() {
	//	return jComboBoxTiposReportesDinamicoFirmaCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFirmaCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoFirmaCliente) {
	//	this.jComboBoxTiposReportesDinamicoFirmaCliente = jComboBoxTiposReportesDinamicoFirmaCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFirmaCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoFirmaCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFirmaCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFirmaCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFirmaCliente = jComboBoxTiposArchivosReportesDinamicoFirmaCliente;
	//}
	
	public void setBorderResaltarTiposReportesFirmaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFirmaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFirmaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFirmaCliente() {
		return this.jComboBoxTiposGraficosReportesFirmaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFirmaCliente(
			JComboBox jComboBoxTiposGraficosReportesFirmaCliente) {
		this.jComboBoxTiposGraficosReportesFirmaCliente = jComboBoxTiposGraficosReportesFirmaCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesFirmaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFirmaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFirmaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFirmaCliente() {
		return this.jComboBoxTiposPaginacionFirmaCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFirmaCliente(
			JComboBox jComboBoxTiposPaginacionFirmaCliente) {
		this.jComboBoxTiposPaginacionFirmaCliente = jComboBoxTiposPaginacionFirmaCliente;
	}
	
	public void setBorderResaltarTiposPaginacionFirmaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFirmaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFirmaCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFirmaCliente() {
		return this.jComboBoxTiposRelacionesFirmaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFirmaCliente() {
		return this.jComboBoxTiposAccionesFirmaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFirmaCliente(
			JComboBox jComboBoxTiposRelacionesFirmaCliente) {
		this.jComboBoxTiposRelacionesFirmaCliente = jComboBoxTiposRelacionesFirmaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFirmaCliente(
			JComboBox jComboBoxTiposAccionesFirmaCliente) {
		this.jComboBoxTiposAccionesFirmaCliente = jComboBoxTiposAccionesFirmaCliente;
	}
	
	public void setBorderResaltarTiposRelacionesFirmaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFirmaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFirmaCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFirmaCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFirmaCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFirmaCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFirmaCliente() {
	//	return jCheckBoxConGraficoDinamicoFirmaCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoFirmaCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoFirmaCliente) {
	//	this.jCheckBoxConGraficoDinamicoFirmaCliente = jCheckBoxConGraficoDinamicoFirmaCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFirmaCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFirmaCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFirmaCliente .setBorder(borderResaltar);		
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
		this.firmaclienteSessionBean=new FirmaClienteSessionBean();
		
		this.firmaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.firmaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.firmaclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FirmaClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FirmaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FirmaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FirmaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FirmaClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Firma Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		FirmaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("FirmaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFirmaCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFirmaCliente,this.jTtoolBarFirmaCliente,
							"nuevo","nuevo","Nuevo"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFirmaCliente,this.jTtoolBarFirmaCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFirmaCliente,this.jTtoolBarFirmaCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFirmaCliente,this.jTtoolBarFirmaCliente,
							"duplicar","duplicar","Duplicar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFirmaCliente,this.jTtoolBarFirmaCliente,
							"copiar","copiar","Copiar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFirmaCliente,this.jTtoolBarFirmaCliente,
							"ver_form","ver_form","Ver"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFirmaCliente,this.jTtoolBarFirmaCliente,
							"recargar","recargar","Recargar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFirmaCliente,this.jTtoolBarFirmaCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFirmaCliente,this.jTtoolBarFirmaCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFirmaCliente,this.jTtoolBarFirmaCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFirmaCliente,this.jTtoolBarFirmaCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFirmaCliente,this.jTtoolBarFirmaCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFirmaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFirmaCliente,this.jTtoolBarFirmaCliente,
							"cerrar","cerrar","Salir"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFirmaCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFirmaCliente;
			
				this.jButtonProcesarInformacionToolBarFirmaCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFirmaCliente;
				
		//protected JButton jButtonModificarToolBarFirmaCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFirmaCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFirmaCliente=new JMenuMe("General");
		this.jmenuArchivoFirmaCliente=new JMenuMe("Archivo");
		this.jmenuAccionesFirmaCliente=new JMenuMe("Acciones");
		this.jmenuDatosFirmaCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFirmaCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFirmaCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFirmaCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFirmaCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFirmaCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFirmaCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFirmaCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFirmaCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFirmaCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFirmaCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFirmaCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFirmaCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFirmaCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFirmaCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFirmaCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFirmaCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFirmaCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFirmaCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFirmaCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFirmaCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFirmaCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFirmaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFirmaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFirmaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFirmaCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFirmaCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFirmaCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFirmaCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFirmaCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFirmaCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFirmaCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFirmaCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFirmaCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFirmaCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFirmaCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFirmaCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFirmaCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFirmaCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFirmaCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFirmaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFirmaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFirmaCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFirmaCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFirmaCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFirmaCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFirmaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFirmaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFirmaCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFirmaCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFirmaCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFirmaCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFirmaCliente.add(this.jMenuItemCerrarFirmaCliente);
			
			this.jmenuAccionesFirmaCliente.add(this.jMenuItemNuevoFirmaCliente);
			this.jmenuAccionesFirmaCliente.add(this.jMenuItemNuevoGuardarCambiosFirmaCliente);
			this.jmenuAccionesFirmaCliente.add(this.jMenuItemNuevoRelacionesFirmaCliente);
			this.jmenuAccionesFirmaCliente.add(this.jMenuItemGuardarCambiosTablaFirmaCliente);		
			this.jmenuAccionesFirmaCliente.add(this.jMenuItemDuplicarFirmaCliente);		
			this.jmenuAccionesFirmaCliente.add(this.jMenuItemCopiarFirmaCliente);		
			this.jmenuAccionesFirmaCliente.add(this.jMenuItemVerFormFirmaCliente);		
			
			this.jmenuDatosFirmaCliente.add(this.jMenuItemRecargarInformacionFirmaCliente);				
			this.jmenuDatosFirmaCliente.add(this.jMenuItemAnterioresFirmaCliente);				
			this.jmenuDatosFirmaCliente.add(this.jMenuItemSiguientesFirmaCliente);				
			this.jmenuDatosFirmaCliente.add(this.jMenuItemAbrirOrderByFirmaCliente);				
			this.jmenuDatosFirmaCliente.add(this.jMenuItemMostrarOcultarFirmaCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFirmaCliente.add(this.jMenuItemGuardarCambiosFirmaCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFirmaCliente.add(this.jmenuArchivoFirmaCliente);		
			this.jmenuBarFirmaCliente.add(this.jmenuAccionesFirmaCliente);		
			this.jmenuBarFirmaCliente.add(this.jmenuDatosFirmaCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFirmaCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFirmaCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteFirmaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteFirmaCliente.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteFirmaCliente= new JButtonMe();
		this.jButtonFK_IdClienteFirmaCliente.setText("Buscar");
		this.jButtonFK_IdClienteFirmaCliente.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteFirmaCliente,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteFirmaCliente = new JLabelMe();
		jLabelid_clienteFK_IdClienteFirmaCliente.setText("Cliente :");
		jLabelid_clienteFK_IdClienteFirmaCliente.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteFirmaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteFirmaCliente= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteFirmaCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteFirmaCliente= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteFirmaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteFirmaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteFirmaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteFirmaCliente.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteFirmaCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteFirmaCliente.setFocusable(false);

		this.jPanelFK_IdTipoImagenFirmaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoImagenFirmaCliente.setToolTipText("Buscar Por Idtipo Imagen ");
		this.jButtonFK_IdTipoImagenFirmaCliente= new JButtonMe();
		this.jButtonFK_IdTipoImagenFirmaCliente.setText("Buscar");
		this.jButtonFK_IdTipoImagenFirmaCliente.setToolTipText("Buscar Por Idtipo Imagen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoImagenFirmaCliente,"buscar_button","Buscar Por Idtipo Imagen ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoImagenFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_imagenFK_IdTipoImagenFirmaCliente = new JLabelMe();
		jLabelid_tipo_imagenFK_IdTipoImagenFirmaCliente.setText("Idtipo Imagen :");
		jLabelid_tipo_imagenFK_IdTipoImagenFirmaCliente.setToolTipText("Idtipo Imagen");
		jLabelid_tipo_imagenFK_IdTipoImagenFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_imagenFK_IdTipoImagenFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_imagenFK_IdTipoImagenFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_imagenFK_IdTipoImagenFirmaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente= new JComboBoxMe();
		jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasFirmaCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasFirmaCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFirmaCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFirmaCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFirmaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFirmaCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFirmaCliente = new FirmaClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Firma Cliente DATOS");
			this.jInternalFrameDetalleFormFirmaCliente = new FirmaClienteDetalleFormJInternalFrame(jDesktopPane,this.firmaclienteSessionBean.getConGuardarRelaciones(),this.firmaclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFirmaCliente = null;//new FirmaClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFirmaCliente= new GridBagLayout();
		
		
		this.jTableDatosFirmaCliente = new JTableMe();      
		
		String sToolTipFirmaCliente="";
		sToolTipFirmaCliente=FirmaClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFirmaCliente+="(Cartera.FirmaCliente)";
		}
		
		if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipFirmaCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFirmaCliente.setToolTipText(sToolTipFirmaCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFirmaCliente);
		this.jTableDatosFirmaCliente.setAutoCreateRowSorter(true);
		this.jTableDatosFirmaCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFirmaCliente.setRowSelectionAllowed(true);
		this.jTableDatosFirmaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFirmaCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFirmaCliente = new JButtonMe();
		this.jButtonDuplicarFirmaCliente = new JButtonMe();
		this.jButtonCopiarFirmaCliente = new JButtonMe();
		this.jButtonVerFormFirmaCliente = new JButtonMe();
		this.jButtonNuevoRelacionesFirmaCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFirmaCliente = new JButtonMe();
		this.jButtonCerrarFirmaCliente = new JButtonMe();
		
		this.jScrollPanelDatosFirmaCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralFirmaCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFirmaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Firma Cliente";
		
		if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Firma Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosFirmaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFirmaCliente.setToolTipText("Acciones");
        this.jPanelAccionesFirmaCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFirmaCliente=new ReporteDinamicoJInternalFrame(FirmaClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFirmaCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFirmaCliente=new ImportacionJInternalFrame(FirmaClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFirmaCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFirmaCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByFirmaCliente.setText("Orden");
		this.jButtonAbrirOrderByFirmaCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFirmaCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFirmaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFirmaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFirmaCliente,false,this);
			
			//this.cargarOrderByFirmaCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFirmaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFirmaCliente,true,this);
			
			//this.cargarOrderByFirmaCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFirmaCliente.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosFirmaCliente.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosFirmaCliente.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosFirmaCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFirmaCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFirmaCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFirmaCliente.setText("Nuevo");
		this.jButtonDuplicarFirmaCliente.setText("Duplicar");
		this.jButtonCopiarFirmaCliente.setText("Copiar");
		this.jButtonVerFormFirmaCliente.setText("Ver");
		this.jButtonNuevoRelacionesFirmaCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFirmaCliente.setText("Guardar");
		this.jButtonCerrarFirmaCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFirmaCliente,"nuevo_button","Nuevo",this.firmaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFirmaCliente,"duplicar_button","Duplicar",this.firmaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFirmaCliente,"copiar_button","Copiar",this.firmaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFirmaCliente,"ver_form","Ver",this.firmaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFirmaCliente,"nuevorelaciones_button","Nuevo Rel",this.firmaclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFirmaCliente,"guardarcambiostabla_button","Guardar",this.firmaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFirmaCliente,"cerrar_button","Salir",this.firmaclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFirmaCliente.setToolTipText("Nuevo"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFirmaCliente.setToolTipText("Duplicar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFirmaCliente.setToolTipText("Copiar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFirmaCliente.setToolTipText("Ver"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFirmaCliente.setToolTipText("Nuevo Rel"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFirmaCliente.setToolTipText("Guardar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFirmaCliente.setToolTipText("Salir"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFirmaCliente";
		inputMap = this.jButtonNuevoFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFirmaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFirmaCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarFirmaCliente";
		inputMap = this.jButtonDuplicarFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFirmaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFirmaCliente"));
		
		//COPIAR
		sMapKey = "CopiarFirmaCliente";
		inputMap = this.jButtonCopiarFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFirmaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFirmaCliente"));
		
		//VEr FORM
		sMapKey = "VerFormFirmaCliente";
		inputMap = this.jButtonVerFormFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFirmaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFirmaCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFirmaCliente";
		inputMap = this.jButtonNuevoRelacionesFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFirmaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFirmaCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFirmaCliente";
		inputMap = this.jButtonModificarFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFirmaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFirmaCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFirmaCliente";
		inputMap = this.jButtonCerrarFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFirmaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFirmaCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFirmaCliente";
		inputMap = this.jButtonGuardarCambiosTablaFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFirmaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFirmaCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFirmaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFirmaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFirmaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1FirmaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2FirmaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3FirmaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4FirmaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5FirmaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFirmaCliente.setName("jPanelParametrosReportesFirmaCliente"); 
		
		this.jPanelParametrosReportesAccionesFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFirmaCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFirmaCliente.setName("jPanelParametrosReportesAccionesFirmaCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFirmaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFirmaCliente = new JButtonMe();
		this.jButtonRecargarInformacionFirmaCliente.setText("Recargar");
		this.jButtonRecargarInformacionFirmaCliente.setToolTipText("Recargar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFirmaCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFirmaCliente = new JButtonMe();
		this.jButtonProcesarInformacionFirmaCliente.setText("Procesar");
		this.jButtonProcesarInformacionFirmaCliente.setToolTipText("Procesar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFirmaCliente.setVisible(false);
			
		this.jButtonProcesarInformacionFirmaCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFirmaCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFirmaCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFirmaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFirmaCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFirmaCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFirmaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFirmaCliente.setText("TIPO");       
		this.jComboBoxTiposReportesFirmaCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFirmaCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFirmaCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFirmaCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFirmaCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFirmaCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionFirmaCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFirmaCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFirmaCliente.setText("Accion");
		this.jComboBoxTiposRelacionesFirmaCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFirmaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFirmaCliente.setText("Accion");
		this.jComboBoxTiposAccionesFirmaCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFirmaCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFirmaCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarFirmaCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFirmaCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFirmaCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFirmaCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFirmaCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFirmaCliente = new JLabelMe();
		
		this.jLabelAccionesFirmaCliente.setText("Acciones");		
		this.jLabelAccionesFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFirmaCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFirmaCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFirmaCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFirmaCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFirmaCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFirmaCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFirmaCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFirmaCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFirmaCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFirmaCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFirmaCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteFirmaCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFirmaCliente = new JButtonMe();
		//this.jButtonAnterioresFirmaCliente.setText("<<");
        this.jButtonAnterioresFirmaCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFirmaCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFirmaCliente = new JButtonMe();
		//this.jButtonSiguientesFirmaCliente.setText(">>");
        this.jButtonSiguientesFirmaCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFirmaCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFirmaCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFirmaCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosFirmaCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFirmaCliente,"nuevoguardarcambios_button","Nue",this.firmaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFirmaCliente";
		inputMap = this.jButtonNuevoGuardarCambiosFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFirmaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFirmaCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFirmaCliente";
		inputMap = this.jButtonRecargarInformacionFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFirmaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFirmaCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFirmaCliente";
		inputMap = this.jButtonSiguientesFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFirmaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFirmaCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFirmaCliente";
		inputMap = this.jButtonAnterioresFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFirmaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFirmaCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFirmaCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFirmaCliente.setMinimumSize(new Dimension(this.getWidth(),FirmaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FirmaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFirmaCliente.setMaximumSize(new Dimension(this.getWidth(),FirmaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FirmaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFirmaCliente.setPreferredSize(new Dimension(this.getWidth(),FirmaClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FirmaClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFirmaCliente = new GridBagLayout();

			this.jPanelPaginacionFirmaCliente.setLayout(gridaBagLayoutPaginacionFirmaCliente);						
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.gridy = 0;
			this.gridBagConstraintsFirmaCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFirmaCliente.add(this.jButtonAnterioresFirmaCliente, this.gridBagConstraintsFirmaCliente);
					
						
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFirmaCliente.gridy = 0;
			
			this.jPanelPaginacionFirmaCliente.add(this.jButtonNuevoGuardarCambiosFirmaCliente, this.gridBagConstraintsFirmaCliente);
						
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFirmaCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFirmaCliente.gridy = 0;
			this.jPanelPaginacionFirmaCliente.add(this.jButtonSiguientesFirmaCliente, this.gridBagConstraintsFirmaCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.gridy = 1;
			this.gridBagConstraintsFirmaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFirmaCliente.add(this.jButtonNuevoFirmaCliente, this.gridBagConstraintsFirmaCliente);
						
			
			
			if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
				this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFirmaCliente.gridy = 1;
				this.gridBagConstraintsFirmaCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFirmaCliente.add(this.jButtonGuardarCambiosTablaFirmaCliente, this.gridBagConstraintsFirmaCliente);
			}
			
			
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.gridy = 1;
			this.gridBagConstraintsFirmaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFirmaCliente.add(this.jButtonDuplicarFirmaCliente, this.gridBagConstraintsFirmaCliente);
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.gridy = 1;
			this.gridBagConstraintsFirmaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFirmaCliente.add(this.jButtonCopiarFirmaCliente, this.gridBagConstraintsFirmaCliente);
		
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.gridy = 1;
			this.gridBagConstraintsFirmaCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFirmaCliente.add(this.jButtonVerFormFirmaCliente, this.gridBagConstraintsFirmaCliente);
		
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.gridy = 1;
			this.gridBagConstraintsFirmaCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFirmaCliente.add(this.jButtonCerrarFirmaCliente, this.gridBagConstraintsFirmaCliente);
		
		
		
		this.jButtonRecargarInformacionFirmaCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFirmaCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFirmaCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFirmaCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFirmaCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFirmaCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFirmaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFirmaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFirmaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFirmaCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFirmaCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFirmaCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFirmaCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFirmaCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFirmaCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFirmaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFirmaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFirmaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFirmaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFirmaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFirmaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFirmaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFirmaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFirmaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFirmaCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFirmaCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFirmaCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFirmaCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFirmaCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFirmaCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFirmaCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFirmaCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFirmaCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFirmaCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFirmaCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFirmaCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFirmaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFirmaCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1FirmaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2FirmaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3FirmaCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4FirmaCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFirmaCliente.setLayout(gridaBagParametrosReportesFirmaCliente);
			this.jPanelParametrosReportesAccionesFirmaCliente.setLayout(gridaBagParametrosReportesAccionesFirmaCliente);
			
			
			this.jPanelParametrosAuxiliar1FirmaCliente.setLayout(gridaBagParametrosAuxiliar1FirmaCliente);
			this.jPanelParametrosAuxiliar2FirmaCliente.setLayout(gridaBagParametrosAuxiliar2FirmaCliente);
			this.jPanelParametrosAuxiliar3FirmaCliente.setLayout(gridaBagParametrosAuxiliar3FirmaCliente);
			this.jPanelParametrosAuxiliar4FirmaCliente.setLayout(gridaBagParametrosAuxiliar4FirmaCliente);
			//this.jPanelParametrosAuxiliar5FirmaCliente.setLayout(gridaBagParametrosAuxiliar2FirmaCliente);			
			
			
			
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFirmaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFirmaCliente.add(this.jButtonRecargarInformacionFirmaCliente, this.gridBagConstraintsFirmaCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFirmaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FirmaCliente.add(this.jComboBoxTiposPaginacionFirmaCliente, this.gridBagConstraintsFirmaCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFirmaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FirmaCliente.add(this.jCheckBoxConAltoMaximoTablaFirmaCliente, this.gridBagConstraintsFirmaCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFirmaCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1FirmaCliente.add(this.jComboBoxTiposArchivosReportesFirmaCliente, this.gridBagConstraintsFirmaCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFirmaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFirmaCliente.add(this.jPanelParametrosAuxiliar1FirmaCliente, this.gridBagConstraintsFirmaCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFirmaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4FirmaCliente.add(this.jComboBoxTiposReportesFirmaCliente, this.gridBagConstraintsFirmaCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFirmaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFirmaCliente.add(this.jPanelParametrosAuxiliar4FirmaCliente, this.gridBagConstraintsFirmaCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFirmaCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFirmaCliente.add(this.jComboBoxTiposReportesFirmaCliente, this.gridBagConstraintsFirmaCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFirmaCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFirmaCliente.add(this.jCheckBoxGenerarReporteFirmaCliente, this.gridBagConstraintsFirmaCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFirmaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFirmaCliente.add(this.jPanelParametrosAuxiliar2FirmaCliente, this.gridBagConstraintsFirmaCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFirmaCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFirmaCliente.add(this.jLabelAccionesFirmaCliente, this.gridBagConstraintsFirmaCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
				this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFirmaCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFirmaCliente.add(this.jButtonAbrirOrderByFirmaCliente, this.gridBagConstraintsFirmaCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFirmaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFirmaCliente.add(this.jComboBoxTiposSeleccionarFirmaCliente, this.gridBagConstraintsFirmaCliente);			
			
			
			/*
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFirmaCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFirmaCliente.add(this.jCheckBoxSeleccionarTodosFirmaCliente, this.gridBagConstraintsFirmaCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFirmaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FirmaCliente.add(this.jCheckBoxSeleccionarTodosFirmaCliente, this.gridBagConstraintsFirmaCliente);															
				
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFirmaCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3FirmaCliente.add(this.jCheckBoxSeleccionadosFirmaCliente, this.gridBagConstraintsFirmaCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFirmaCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFirmaCliente.add(this.jPanelParametrosAuxiliar3FirmaCliente, this.gridBagConstraintsFirmaCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFirmaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFirmaCliente.add(this.jComboBoxTiposAccionesFirmaCliente, this.gridBagConstraintsFirmaCliente);
	
				
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFirmaCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFirmaCliente.add(this.jTextFieldValorCampoGeneralFirmaCliente, this.gridBagConstraintsFirmaCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFirmaCliente = new GridBagLayout();

			this.jScrollPanelDatosFirmaCliente.setLayout(gridaBagLayoutDatosFirmaCliente);
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.gridy = 0;
			this.gridBagConstraintsFirmaCliente.gridx = 0;
			
			this.jScrollPanelDatosFirmaCliente.add(this.jTableDatosFirmaCliente, this.gridBagConstraintsFirmaCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFirmaCliente.setViewportView(this.jTableDatosFirmaCliente);
		this.jTableDatosFirmaCliente.setFillsViewportHeight(true);
		this.jTableDatosFirmaCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFirmaCliente= new GridBagLayout();
		this.jPanelAccionesFirmaCliente.setLayout(gridaBagLayoutAccionesFirmaCliente);
		
		
		/*	
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFirmaCliente.gridy = 0;
		this.gridBagConstraintsFirmaCliente.gridx = 0;
			
		this.jPanelAccionesFirmaCliente.add(this.jButtonNuevoFirmaCliente, this.gridBagConstraintsFirmaCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteFirmaCliente= new GridBagLayout();
		gridaBagLayoutFK_IdClienteFirmaCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteFirmaCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteFirmaCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteFirmaCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteFirmaCliente.setLayout(gridaBagLayoutFK_IdClienteFirmaCliente);

		gridBagConstraintsFirmaCliente = new GridBagConstraints();
		gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFirmaCliente.gridy = 0;
		gridBagConstraintsFirmaCliente.gridx = 0;
		jPanelFK_IdClienteFirmaCliente.add(jLabelid_clienteFK_IdClienteFirmaCliente, gridBagConstraintsFirmaCliente);

		gridBagConstraintsFirmaCliente = new GridBagConstraints();
		gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFirmaCliente.gridy = 0;
		gridBagConstraintsFirmaCliente.gridx = 1;
		jPanelFK_IdClienteFirmaCliente.add(jComboBoxid_clienteFK_IdClienteFirmaCliente, gridBagConstraintsFirmaCliente);


		gridBagConstraintsFirmaCliente = new GridBagConstraints();
		gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFirmaCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsFirmaCliente.gridy = 0;
		gridBagConstraintsFirmaCliente.gridx = 0;
		jPanelFK_IdClienteFirmaCliente.add(this.jButtonBuscarFK_IdClienteid_clienteFirmaCliente, gridBagConstraintsFirmaCliente);

		gridBagConstraintsFirmaCliente = new GridBagConstraints();
		gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFirmaCliente.gridy = 1;
		gridBagConstraintsFirmaCliente.gridx =1;
		jPanelFK_IdClienteFirmaCliente.add(jButtonFK_IdClienteFirmaCliente, gridBagConstraintsFirmaCliente);

		jTabbedPaneBusquedasFirmaCliente.addTab("1.-Por Cliente ", jPanelFK_IdClienteFirmaCliente);
		jTabbedPaneBusquedasFirmaCliente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoImagenFirmaCliente= new GridBagLayout();
		gridaBagLayoutFK_IdTipoImagenFirmaCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoImagenFirmaCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoImagenFirmaCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoImagenFirmaCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoImagenFirmaCliente.setLayout(gridaBagLayoutFK_IdTipoImagenFirmaCliente);

		gridBagConstraintsFirmaCliente = new GridBagConstraints();
		gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFirmaCliente.gridy = 0;
		gridBagConstraintsFirmaCliente.gridx = 0;
		jPanelFK_IdTipoImagenFirmaCliente.add(jLabelid_tipo_imagenFK_IdTipoImagenFirmaCliente, gridBagConstraintsFirmaCliente);

		gridBagConstraintsFirmaCliente = new GridBagConstraints();
		gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFirmaCliente.gridy = 0;
		gridBagConstraintsFirmaCliente.gridx = 1;
		jPanelFK_IdTipoImagenFirmaCliente.add(jComboBoxid_tipo_imagenFK_IdTipoImagenFirmaCliente, gridBagConstraintsFirmaCliente);

		gridBagConstraintsFirmaCliente = new GridBagConstraints();
		gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFirmaCliente.gridy = 1;
		gridBagConstraintsFirmaCliente.gridx =1;
		jPanelFK_IdTipoImagenFirmaCliente.add(jButtonFK_IdTipoImagenFirmaCliente, gridBagConstraintsFirmaCliente);

		jTabbedPaneBusquedasFirmaCliente.addTab("2.-Por Idtipo Imagen ", jPanelFK_IdTipoImagenFirmaCliente);
		jTabbedPaneBusquedasFirmaCliente.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFirmaCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFirmaCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.firmaclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();						
			this.gridBagConstraintsFirmaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFirmaCliente.gridx = 0;		
			//this.gridBagConstraintsFirmaCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFirmaCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFirmaCliente, this.gridBagConstraintsFirmaCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFirmaCliente.gridx = 0;		
		//this.gridBagConstraintsFirmaCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFirmaCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFirmaCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFirmaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFirmaCliente.gridx = 0;		
			this.gridBagConstraintsFirmaCliente.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFirmaCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFirmaCliente, this.gridBagConstraintsFirmaCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFirmaCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFirmaCliente, this.gridBagConstraintsFirmaCliente);								
		
		
		/*
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFirmaCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFirmaCliente, this.gridBagConstraintsFirmaCliente);
		*/		
		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFirmaCliente.gridx =0;
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFirmaCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFirmaCliente, this.gridBagConstraintsFirmaCliente);
				
		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFirmaCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFirmaCliente, this.gridBagConstraintsFirmaCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FirmaClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFirmaCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFirmaCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosFirmaCliente.setLayout(gridaBagLayoutBusquedasParametrosFirmaCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFirmaCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFirmaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFirmaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFirmaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFirmaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFirmaCliente, this.gridBagConstraintsFirmaCliente);
			
			
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFirmaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFirmaCliente, this.gridBagConstraintsFirmaCliente);
		
			
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFirmaCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFirmaCliente, this.gridBagConstraintsFirmaCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFirmaCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFirmaCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFirmaCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFirmaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFirmaCliente.setName("jPanelReporteDinamicoFirmaCliente"); 
		
		this.jPanelReporteDinamicoFirmaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFirmaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFirmaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFirmaCliente.setLayout(gridaBagLayoutReporteDinamicoFirmaCliente);
		
		
		this.jInternalFrameReporteDinamicoFirmaCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFirmaCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFirmaCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFirmaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFirmaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFirmaCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFirmaCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFirmaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFirmaCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoFirmaCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoFirmaCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFirmaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFirmaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFirmaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Firma Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFirmaCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteFirmaCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFirmaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFirmaCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFirmaCliente.add(this.jLabelColumnasSelectReporteFirmaCliente, this.gridBagConstraintsFirmaCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFirmaCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteFirmaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFirmaCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFirmaCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFirmaCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFirmaCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFirmaCliente=new JScrollPane(this.jListColumnasSelectReporteFirmaCliente);
			
			this.jScrollColumnasSelectReporteFirmaCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFirmaCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFirmaCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFirmaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFirmaCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFirmaCliente.add(this.jListColumnasSelectReporteFirmaCliente, this.gridBagConstraintsFirmaCliente);
		this.jPanelReporteDinamicoFirmaCliente.add(this.jScrollColumnasSelectReporteFirmaCliente, this.gridBagConstraintsFirmaCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFirmaCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteFirmaCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFirmaCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteFirmaCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFirmaCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFirmaCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFirmaCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFirmaCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFirmaCliente=new JScrollPane(this.jListRelacionesSelectReporteFirmaCliente);
			
			this.jScrollRelacionesSelectReporteFirmaCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFirmaCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFirmaCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFirmaCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFirmaCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoFirmaCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFirmaCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFirmaCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFirmaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFirmaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFirmaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFirmaCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFirmaCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFirmaCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFirmaCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFirmaCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFirmaCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFirmaCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFirmaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFirmaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFirmaCliente.add(this.jLabelGenerarExcelReporteDinamicoFirmaCliente, this.gridBagConstraintsFirmaCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFirmaCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFirmaCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFirmaCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFirmaCliente.setToolTipText("Generar EXCEL"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		//this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFirmaCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFirmaCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFirmaCliente.add(this.jButtonGenerarExcelReporteDinamicoFirmaCliente, this.gridBagConstraintsFirmaCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFirmaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFirmaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFirmaCliente.add(this.jComboBoxTiposReportesDinamicoFirmaCliente, this.gridBagConstraintsFirmaCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFirmaCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFirmaCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFirmaCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFirmaCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFirmaCliente.add(this.jLabelTiposArchivoReporteDinamicoFirmaCliente, this.gridBagConstraintsFirmaCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFirmaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFirmaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFirmaCliente.add(this.jComboBoxTiposArchivosReportesDinamicoFirmaCliente, this.gridBagConstraintsFirmaCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFirmaCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFirmaCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFirmaCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFirmaCliente.setToolTipText("Generar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFirmaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFirmaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFirmaCliente.add(this.jButtonGenerarReporteDinamicoFirmaCliente, this.gridBagConstraintsFirmaCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFirmaCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFirmaCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFirmaCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFirmaCliente.setToolTipText("Cancelar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFirmaCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFirmaCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFirmaCliente.add(this.jButtonCerrarReporteDinamicoFirmaCliente, this.gridBagConstraintsFirmaCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFirmaCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFirmaCliente= new JScrollPane(jPanelReporteDinamicoFirmaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFirmaCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFirmaCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFirmaCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Firma Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFirmaCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFirmaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFirmaCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFirmaCliente);
		this.jInternalFrameReporteDinamicoFirmaCliente.getContentPane().add(this.jScrollPanelReporteDinamicoFirmaCliente, this.gridBagConstraintsFirmaCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFirmaCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFirmaCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFirmaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFirmaCliente.setName("jPanelImportacionFirmaCliente"); 
		
		this.jPanelImportacionFirmaCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFirmaCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFirmaCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFirmaCliente.setLayout(gridaBagLayoutImportacionFirmaCliente);
		
		
		this.jInternalFrameImportacionFirmaCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFirmaCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFirmaCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFirmaCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFirmaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFirmaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFirmaCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFirmaCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFirmaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFirmaCliente.setResizable(true);
	    this.jInternalFrameImportacionFirmaCliente.setClosable(true);
	    this.jInternalFrameImportacionFirmaCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFirmaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFirmaCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFirmaCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFirmaCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFirmaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFirmaCliente.setResizable(true);
	    this.jInternalFrameImportacionFirmaCliente.setClosable(true);
	    this.jInternalFrameImportacionFirmaCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFirmaCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFirmaCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFirmaCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Firma Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFirmaCliente = new JLabelMe();

		this.jLabelArchivoImportacionFirmaCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFirmaCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsFirmaCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFirmaCliente.add(this.jLabelArchivoImportacionFirmaCliente, this.gridBagConstraintsFirmaCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFirmaCliente = new JFileChooser();		
		this.jFileChooserImportacionFirmaCliente.setToolTipText("ESCOGER ARCHIVO"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFirmaCliente = new JButtonMe();
		this.jButtonAbrirImportacionFirmaCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFirmaCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFirmaCliente.setToolTipText("Generar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFirmaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsFirmaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFirmaCliente.add(this.jButtonAbrirImportacionFirmaCliente, this.gridBagConstraintsFirmaCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFirmaCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionFirmaCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFirmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFirmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFirmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFirmaCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsFirmaCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFirmaCliente.add(this.jLabelPathArchivoImportacionFirmaCliente, this.gridBagConstraintsFirmaCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFirmaCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFirmaCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFirmaCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFirmaCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFirmaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsFirmaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFirmaCliente.add(this.jTextFieldPathArchivoImportacionFirmaCliente, this.gridBagConstraintsFirmaCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFirmaCliente = new JButtonMe();
		this.jButtonGenerarImportacionFirmaCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFirmaCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFirmaCliente.setToolTipText("Generar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFirmaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsFirmaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFirmaCliente.add(this.jButtonGenerarImportacionFirmaCliente, this.gridBagConstraintsFirmaCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFirmaCliente = new JButtonMe();
		this.jButtonCerrarImportacionFirmaCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFirmaCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFirmaCliente.setToolTipText("Cancelar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFirmaCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsFirmaCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFirmaCliente.add(this.jButtonCerrarImportacionFirmaCliente, this.gridBagConstraintsFirmaCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFirmaCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionFirmaCliente= new JScrollPane(jPanelImportacionFirmaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
		this.gridBagConstraintsFirmaCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsFirmaCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFirmaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFirmaCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFirmaCliente);
		this.jInternalFrameImportacionFirmaCliente.getContentPane().add(this.jScrollPanelImportacionFirmaCliente, this.gridBagConstraintsFirmaCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFirmaCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFirmaCliente = new JButtonMe();
			this.jButtonAbrirOrderByFirmaCliente.setText("Orden");
			this.jButtonAbrirOrderByFirmaCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFirmaCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFirmaCliente";
			inputMap = this.jButtonAbrirOrderByFirmaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFirmaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFirmaCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByFirmaCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFirmaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFirmaCliente.setName("jPanelOrderByFirmaCliente"); 
			
			this.jPanelOrderByFirmaCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFirmaCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFirmaCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFirmaCliente.setLayout(gridaBagLayoutOrderByFirmaCliente);
			
			
			this.jTableDatosFirmaClienteOrderBy = new JTableMe();        
			this.jTableDatosFirmaClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFirmaClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFirmaClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFirmaClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFirmaClienteOrderBy.setViewportView(this.jTableDatosFirmaClienteOrderBy);
			this.jTableDatosFirmaClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFirmaClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFirmaCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFirmaCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFirmaCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFirmaCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFirmaCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFirmaCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFirmaCliente.setTitle("Orden");
			this.jInternalFrameOrderByFirmaCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFirmaCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFirmaCliente.setResizable(true);
			this.jInternalFrameOrderByFirmaCliente.setClosable(true);
			this.jInternalFrameOrderByFirmaCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFirmaCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFirmaCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFirmaCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFirmaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Firma Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFirmaCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFirmaCliente.ipady =150;
				
			this.jPanelOrderByFirmaCliente.add(jScrollPanelDatosFirmaClienteOrderBy, this.gridBagConstraintsFirmaCliente);//this.jTableDatosFirmaClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFirmaCliente = new JButtonMe();
			this.jButtonCerrarOrderByFirmaCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFirmaCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFirmaCliente.setToolTipText("Cancelar"+" "+FirmaClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFirmaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFirmaCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFirmaCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFirmaCliente.add(this.jButtonCerrarOrderByFirmaCliente, this.gridBagConstraintsFirmaCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFirmaCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByFirmaCliente= new JScrollPane(jPanelOrderByFirmaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFirmaCliente = new GridBagConstraints();
			this.gridBagConstraintsFirmaCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsFirmaCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsFirmaCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFirmaCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFirmaCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFirmaCliente);
			
			this.jInternalFrameOrderByFirmaCliente.getContentPane().add(this.jScrollPanelOrderByFirmaCliente, this.gridBagConstraintsFirmaCliente);			
		
		} else {
			this.jButtonAbrirOrderByFirmaCliente = new JButtonMe();
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
			&& this.firmaclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFirmaCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFirmaCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFirmaCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFirmaCliente.getRowHeight();//FirmaClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FirmaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFirmaCliente.isSelected()) {
					iHeightTable=FirmaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FirmaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FirmaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FirmaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFirmaCliente.isSelected()) {
					iHeightTable=FirmaClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FirmaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FirmaClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFirmaCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFirmaCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFirmaCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFirmaCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFirmaCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFirmaCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFirmaCliente!=null && this.jInternalFrameOrderByFirmaCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.firmaclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFirmaCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFirmaCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFirmaCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFirmaCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFirmaCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFirmaCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFirmaCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFirmaCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFirmaCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFirmaCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=firmaclienteLogic.getFirmaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=firmaclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<FirmaCliente> TraerFirmaClienteBeans(List<FirmaCliente> firmaclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(FirmaCliente firmacliente:firmaclientes) {
					
				if(!(FirmaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FirmaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					firmacliente.setsDetalleGeneralEntityReporte(FirmaClienteConstantesFunciones.getFirmaClienteDescripcion(firmacliente));
										
						
					
						
					
				} else  {
							
					//firmacliente.setsDetalleGeneralEntityReporte(firmacliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//firmaclientebeans.add(firmaclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return firmaclientes;
    }
	//PARA REPORTES FIN
}
