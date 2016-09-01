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
import com.bydan.erp.cartera.util.ClienteArchivoConstantesFunciones;

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
public class ClienteArchivoJInternalFrame extends ClienteArchivoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarClienteArchivo;
	
	protected JMenuBar jmenuBarClienteArchivo;
	
	protected JMenu jmenuClienteArchivo;
	protected JMenu jmenuDatosClienteArchivo;
	protected JMenu jmenuArchivoClienteArchivo;
	protected JMenu jmenuAccionesClienteArchivo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosClienteArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutClienteArchivo;	
	protected GridBagConstraints gridBagConstraintsClienteArchivo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ClienteArchivoDetalleFormJInternalFrame jInternalFrameDetalleFormClienteArchivo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoClienteArchivo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionClienteArchivo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoArchivoBeanSwingJInternalFrame tipoarchivoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoarchivo="";
	
	public ClienteArchivoSessionBean clientearchivoSessionBean;
		
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoArchivoSessionBean tipoarchivoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ClienteArchivo> clientearchivos;		
	public List<ClienteArchivo> clientearchivosEliminados;	
	public List<ClienteArchivo> clientearchivosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByClienteArchivo;		
	protected JButton jButtonAbrirOrderByClienteArchivo;
	
	
	//protected JPanel jPanelOrderByClienteArchivo;
	//public JScrollPane jScrollPanelOrderByClienteArchivo;	
	//protected JButton jButtonCerrarOrderByClienteArchivo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ClienteArchivoLogic clientearchivoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosClienteArchivo;
	public JScrollPane jScrollPanelDatosEdicionClienteArchivo;
	public JScrollPane jScrollPanelDatosGeneralClienteArchivo;
    
	
	
	//public JScrollPane jScrollPanelDatosClienteArchivoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoClienteArchivo;
	//public JScrollPane jScrollPanelImportacionClienteArchivo;
	
	
	
	protected JPanel jPanelAccionesClienteArchivo;
	
    protected JPanel jPanelPaginacionClienteArchivo;
    protected JPanel jPanelParametrosReportesClienteArchivo;
	protected JPanel jPanelParametrosReportesAccionesClienteArchivo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ClienteArchivo;
	protected JPanel jPanelParametrosAuxiliar2ClienteArchivo;
	protected JPanel jPanelParametrosAuxiliar3ClienteArchivo;
	protected JPanel jPanelParametrosAuxiliar4ClienteArchivo;
	//protected JPanel jPanelParametrosAuxiliar5ClienteArchivo;
	
	
	
	//protected JPanel jPanelReporteDinamicoClienteArchivo;
	//protected JPanel jPanelImportacionClienteArchivo;
	
	
	public JTable jTableDatosClienteArchivo;
	
	
	
	//public JTable jTableDatosClienteArchivoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoClienteArchivo;
	protected JButton jButtonDuplicarClienteArchivo;
	protected JButton jButtonCopiarClienteArchivo;
	protected JButton jButtonVerFormClienteArchivo;
	protected JButton jButtonNuevoRelacionesClienteArchivo;
	protected JButton jButtonModificarClienteArchivo;
	
    protected JButton jButtonGuardarCambiosTablaClienteArchivo;
	protected JButton jButtonCerrarClienteArchivo;
	
	
	protected JButton jButtonRecargarInformacionClienteArchivo;
	protected JButton jButtonProcesarInformacionClienteArchivo;
	
	
	protected JButton jButtonAnterioresClienteArchivo;
	protected JButton jButtonSiguientesClienteArchivo;
	protected JButton jButtonNuevoGuardarCambiosClienteArchivo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoClienteArchivo;
	//protected JButton jButtonCerrarReporteDinamicoClienteArchivo;
	//protected JButton jButtonGenerarExcelReporteDinamicoClienteArchivo;	
	
	
	
	//protected JButton jButtonAbrirImportacionClienteArchivo;
	//protected JButton jButtonGenerarImportacionClienteArchivo;
	//protected JButton jButtonCerrarImportacionClienteArchivo;
	//protected JFileChooser jFileChooserImportacionClienteArchivo;
	//protected File fileImportacionClienteArchivo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarClienteArchivo;
	protected JButton jButtonDuplicarToolBarClienteArchivo;
	protected JButton jButtonNuevoRelacionesToolBarClienteArchivo;
	
	
	public JButton jButtonGuardarCambiosToolBarClienteArchivo;
	protected JButton jButtonCopiarToolBarClienteArchivo;
	protected JButton jButtonVerFormToolBarClienteArchivo;
	public JButton jButtonGuardarCambiosTablaToolBarClienteArchivo;
	protected JButton jButtonMostrarOcultarTablaToolBarClienteArchivo;
	protected JButton jButtonCerrarToolBarClienteArchivo;
	
	protected JButton jButtonRecargarInformacionToolBarClienteArchivo;
	protected JButton jButtonProcesarInformacionToolBarClienteArchivo;
	protected JButton jButtonAnterioresToolBarClienteArchivo;
	protected JButton jButtonSiguientesToolBarClienteArchivo;
	protected JButton jButtonNuevoGuardarCambiosToolBarClienteArchivo;
	protected JButton jButtonAbrirOrderByToolBarClienteArchivo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoClienteArchivo;
	protected JMenuItem jMenuItemDuplicarClienteArchivo;
	protected JMenuItem jMenuItemNuevoRelacionesClienteArchivo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosClienteArchivo;
	protected JMenuItem jMenuItemCopiarClienteArchivo;
	protected JMenuItem jMenuItemVerFormClienteArchivo;
	protected JMenuItem jMenuItemGuardarCambiosTablaClienteArchivo;
	protected JMenuItem jMenuItemCerrarClienteArchivo;
	protected JMenuItem jMenuItemDetalleCerrarClienteArchivo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByClienteArchivo;
	protected JMenuItem jMenuItemDetalleMostarOcultarClienteArchivo;
	
	protected JMenuItem jMenuItemRecargarInformacionClienteArchivo;
	protected JMenuItem jMenuItemProcesarInformacionClienteArchivo;
	protected JMenuItem jMenuItemAnterioresClienteArchivo;
	protected JMenuItem jMenuItemSiguientesClienteArchivo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosClienteArchivo;
	protected JMenuItem jMenuItemAbrirOrderByClienteArchivo;
	protected JMenuItem jMenuItemMostrarOcultarClienteArchivo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesClienteArchivo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosClienteArchivo;
	protected JCheckBox jCheckBoxSeleccionadosClienteArchivo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaClienteArchivo;
	protected JCheckBox jCheckBoxConGraficoReporteClienteArchivo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesClienteArchivo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesClienteArchivo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoClienteArchivo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoClienteArchivo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesClienteArchivo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionClienteArchivo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesClienteArchivo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesClienteArchivo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarClienteArchivo;
	protected JTextField jTextFieldValorCampoGeneralClienteArchivo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteClienteArchivo;
	//public JList<Reporte> jListColumnasSelectReporteClienteArchivo;
	//public JScrollPane jScrollColumnasSelectReporteClienteArchivo;
	
	//public JLabel jLabelRelacionesSelectReporteClienteArchivo;
	//public JList<Reporte> jListRelacionesSelectReporteClienteArchivo;
	//public JScrollPane jScrollRelacionesSelectReporteClienteArchivo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoClienteArchivo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoClienteArchivo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoClienteArchivo;
	//public JLabel jLabelTiposArchivoReporteDinamicoClienteArchivo;
	
		
	//public JLabel jLabelArchivoImportacionClienteArchivo;	
	//public JLabel jLabelPathArchivoImportacionClienteArchivo;
	//protected JTextField jTextFieldPathArchivoImportacionClienteArchivo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoClienteArchivo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoClienteArchivo;
	
	//public JLabel jLabelColumnaCategoriaValorClienteArchivo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorClienteArchivo;
	
	//public JLabel jLabelColumnasValoresGraficoClienteArchivo;
	//public JList<Reporte> jListColumnasValoresGraficoClienteArchivo;
	//public JScrollPane jScrollColumnasValoresGraficoClienteArchivo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoClienteArchivo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoClienteArchivo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasClienteArchivo;
	public JPanel jPanelFK_IdClienteClienteArchivo;
	public JButton jButtonFK_IdClienteClienteArchivo;
	public JPanel jPanelFK_IdTipoArchivoClienteArchivo;
	public JButton jButtonFK_IdTipoArchivoClienteArchivo;
	
	public JPanel jPanelid_clienteFK_IdClienteClienteArchivo;
	public JLabel jLabelid_clienteFK_IdClienteClienteArchivo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteClienteArchivo;
	public JButton jButtonid_clienteFK_IdClienteClienteArchivo= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteClienteArchivoUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteClienteArchivoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteClienteArchivo;
	
	public JPanel jPanelid_tipo_archivoFK_IdTipoArchivoClienteArchivo;
	public JLabel jLabelid_tipo_archivoFK_IdTipoArchivoClienteArchivo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo;
	public JButton jButtonid_tipo_archivoFK_IdTipoArchivoClienteArchivo= new JButtonMe();
	public JButton jButtonid_tipo_archivoFK_IdTipoArchivoClienteArchivoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_archivoFK_IdTipoArchivoClienteArchivoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ClienteArchivoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ClienteArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteArchivoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteArchivoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteArchivoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ClienteArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionClienteArchivo)	{
		this.jButtonRecargarInformacionClienteArchivo = jButtonRecargarInformacionClienteArchivo;
	}
	
	public JButton getjButtonProcesarInformacionClienteArchivo() {
		return this.jButtonProcesarInformacionClienteArchivo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionClienteArchivo)	{
		this.jButtonProcesarInformacionClienteArchivo = jButtonProcesarInformacionClienteArchivo;
	}
	
	
	public JButton getjButtonRecargarInformacionClienteArchivo() {
		return this.jButtonRecargarInformacionClienteArchivo;
	}
	
	
	public List<ClienteArchivo> getclientearchivos() {
		return this.clientearchivos;
	}

	public void setclientearchivos(List<ClienteArchivo> clientearchivos) {
		this.clientearchivos = clientearchivos;
	}
	
	public List<ClienteArchivo> getclientearchivosAux() {
		return this.clientearchivosAux;
	}

	public void setclientearchivosAux(List<ClienteArchivo> clientearchivosAux) {
		this.clientearchivosAux = clientearchivosAux;
	}
	
	public List<ClienteArchivo> getclientearchivosEliminados() {
		return this.clientearchivosEliminados;
	}

	public void setClienteArchivosEliminados(List<ClienteArchivo> clientearchivosEliminados) {
		this.clientearchivosEliminados = clientearchivosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarClienteArchivo() {
		return jComboBoxTiposSeleccionarClienteArchivo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarClienteArchivo(
			JComboBox jComboBoxTiposSeleccionarClienteArchivo) {
		this.jComboBoxTiposSeleccionarClienteArchivo = jComboBoxTiposSeleccionarClienteArchivo;
	}
	
	public void setBorderResaltarTiposSeleccionarClienteArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarClienteArchivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarClienteArchivo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralClienteArchivo() {
		return jTextFieldValorCampoGeneralClienteArchivo;
	}

	public void setjTextFieldValorCampoGeneralClienteArchivo(
			JTextField jTextFieldValorCampoGeneralClienteArchivo) {
		this.jTextFieldValorCampoGeneralClienteArchivo = jTextFieldValorCampoGeneralClienteArchivo;
	}

	public void setBorderResaltarValorCampoGeneralClienteArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteArchivo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralClienteArchivo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosClienteArchivo() {
		return this.jCheckBoxSeleccionarTodosClienteArchivo;
	}

	public void setjCheckBoxSeleccionarTodosClienteArchivo(
			JCheckBox jCheckBoxSeleccionarTodosClienteArchivo) {
		this.jCheckBoxSeleccionarTodosClienteArchivo = jCheckBoxSeleccionarTodosClienteArchivo;
	}

	public void setBorderResaltarSeleccionarTodosClienteArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteArchivo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosClienteArchivo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosClienteArchivo() {
		return this.jCheckBoxSeleccionadosClienteArchivo;
	}

	public void setjCheckBoxSeleccionadosClienteArchivo(
			JCheckBox jCheckBoxSeleccionadosClienteArchivo) {
		this.jCheckBoxSeleccionadosClienteArchivo = jCheckBoxSeleccionadosClienteArchivo;
	}
	
	public void setBorderResaltarSeleccionadosClienteArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteArchivo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosClienteArchivo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesClienteArchivo() {
		return this.jComboBoxTiposArchivosReportesClienteArchivo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesClienteArchivo(
			JComboBox jComboBoxTiposArchivosReportesClienteArchivo) {
		this.jComboBoxTiposArchivosReportesClienteArchivo = jComboBoxTiposArchivosReportesClienteArchivo;
	}

	public void setBorderResaltarTiposArchivosReportesClienteArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteArchivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesClienteArchivo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesClienteArchivo() {
		return this.jComboBoxTiposReportesClienteArchivo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesClienteArchivo(
			JComboBox jComboBoxTiposReportesClienteArchivo) {
		this.jComboBoxTiposReportesClienteArchivo = jComboBoxTiposReportesClienteArchivo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoClienteArchivo() {
	//	return jComboBoxTiposReportesDinamicoClienteArchivo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoClienteArchivo(
	//		JComboBox jComboBoxTiposReportesDinamicoClienteArchivo) {
	//	this.jComboBoxTiposReportesDinamicoClienteArchivo = jComboBoxTiposReportesDinamicoClienteArchivo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoClienteArchivo() {
	//	return jComboBoxTiposArchivosReportesDinamicoClienteArchivo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoClienteArchivo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoClienteArchivo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoClienteArchivo = jComboBoxTiposArchivosReportesDinamicoClienteArchivo;
	//}
	
	public void setBorderResaltarTiposReportesClienteArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteArchivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesClienteArchivo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesClienteArchivo() {
		return this.jComboBoxTiposGraficosReportesClienteArchivo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesClienteArchivo(
			JComboBox jComboBoxTiposGraficosReportesClienteArchivo) {
		this.jComboBoxTiposGraficosReportesClienteArchivo = jComboBoxTiposGraficosReportesClienteArchivo;
	}
	
	public void setBorderResaltarTiposGraficosReportesClienteArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteArchivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesClienteArchivo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionClienteArchivo() {
		return this.jComboBoxTiposPaginacionClienteArchivo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionClienteArchivo(
			JComboBox jComboBoxTiposPaginacionClienteArchivo) {
		this.jComboBoxTiposPaginacionClienteArchivo = jComboBoxTiposPaginacionClienteArchivo;
	}
	
	public void setBorderResaltarTiposPaginacionClienteArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteArchivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionClienteArchivo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesClienteArchivo() {
		return this.jComboBoxTiposRelacionesClienteArchivo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesClienteArchivo() {
		return this.jComboBoxTiposAccionesClienteArchivo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesClienteArchivo(
			JComboBox jComboBoxTiposRelacionesClienteArchivo) {
		this.jComboBoxTiposRelacionesClienteArchivo = jComboBoxTiposRelacionesClienteArchivo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesClienteArchivo(
			JComboBox jComboBoxTiposAccionesClienteArchivo) {
		this.jComboBoxTiposAccionesClienteArchivo = jComboBoxTiposAccionesClienteArchivo;
	}
	
	public void setBorderResaltarTiposRelacionesClienteArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteArchivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesClienteArchivo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesClienteArchivo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteArchivo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesClienteArchivo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoClienteArchivo() {
	//	return jCheckBoxConGraficoDinamicoClienteArchivo;
	//}

	//public void setjCheckBoxConGraficoDinamicoClienteArchivo(
	//		JCheckBox jCheckBoxConGraficoDinamicoClienteArchivo) {
	//	this.jCheckBoxConGraficoDinamicoClienteArchivo = jCheckBoxConGraficoDinamicoClienteArchivo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoClienteArchivo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarClienteArchivo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoClienteArchivo .setBorder(borderResaltar);		
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
		this.clientearchivoSessionBean=new ClienteArchivoSessionBean();
		
		this.clientearchivoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.clientearchivoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.clientearchivoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ClienteArchivoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ClienteArchivoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ClienteArchivoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ClienteArchivoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ClienteArchivoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cliente Archivo MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
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
		
		ClienteArchivoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ClienteArchivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarClienteArchivo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarClienteArchivo,this.jTtoolBarClienteArchivo,
							"nuevo","nuevo","Nuevo"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarClienteArchivo,this.jTtoolBarClienteArchivo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarClienteArchivo,this.jTtoolBarClienteArchivo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarClienteArchivo,this.jTtoolBarClienteArchivo,
							"duplicar","duplicar","Duplicar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarClienteArchivo,this.jTtoolBarClienteArchivo,
							"copiar","copiar","Copiar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarClienteArchivo,this.jTtoolBarClienteArchivo,
							"ver_form","ver_form","Ver"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClienteArchivo,this.jTtoolBarClienteArchivo,
							"recargar","recargar","Recargar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClienteArchivo,this.jTtoolBarClienteArchivo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClienteArchivo,this.jTtoolBarClienteArchivo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarClienteArchivo,this.jTtoolBarClienteArchivo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarClienteArchivo,this.jTtoolBarClienteArchivo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarClienteArchivo,this.jTtoolBarClienteArchivo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarClienteArchivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarClienteArchivo,this.jTtoolBarClienteArchivo,
							"cerrar","cerrar","Salir"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarClienteArchivo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarClienteArchivo;
			
				this.jButtonProcesarInformacionToolBarClienteArchivo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarClienteArchivo;
				
		//protected JButton jButtonModificarToolBarClienteArchivo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarClienteArchivo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuClienteArchivo=new JMenuMe("General");
		this.jmenuArchivoClienteArchivo=new JMenuMe("Archivo");
		this.jmenuAccionesClienteArchivo=new JMenuMe("Acciones");
		this.jmenuDatosClienteArchivo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoClienteArchivo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoClienteArchivo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoClienteArchivo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarClienteArchivo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarClienteArchivo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarClienteArchivo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesClienteArchivo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesClienteArchivo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesClienteArchivo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosClienteArchivo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosClienteArchivo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosClienteArchivo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarClienteArchivo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarClienteArchivo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarClienteArchivo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormClienteArchivo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormClienteArchivo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormClienteArchivo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaClienteArchivo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaClienteArchivo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaClienteArchivo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarClienteArchivo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarClienteArchivo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarClienteArchivo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionClienteArchivo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionClienteArchivo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionClienteArchivo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionClienteArchivo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionClienteArchivo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionClienteArchivo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresClienteArchivo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresClienteArchivo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresClienteArchivo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesClienteArchivo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesClienteArchivo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesClienteArchivo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByClienteArchivo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByClienteArchivo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByClienteArchivo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarClienteArchivo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarClienteArchivo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarClienteArchivo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByClienteArchivo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByClienteArchivo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByClienteArchivo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarClienteArchivo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarClienteArchivo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarClienteArchivo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosClienteArchivo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosClienteArchivo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosClienteArchivo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoClienteArchivo.add(this.jMenuItemCerrarClienteArchivo);
			
			this.jmenuAccionesClienteArchivo.add(this.jMenuItemNuevoClienteArchivo);
			this.jmenuAccionesClienteArchivo.add(this.jMenuItemNuevoGuardarCambiosClienteArchivo);
			this.jmenuAccionesClienteArchivo.add(this.jMenuItemNuevoRelacionesClienteArchivo);
			this.jmenuAccionesClienteArchivo.add(this.jMenuItemGuardarCambiosTablaClienteArchivo);		
			this.jmenuAccionesClienteArchivo.add(this.jMenuItemDuplicarClienteArchivo);		
			this.jmenuAccionesClienteArchivo.add(this.jMenuItemCopiarClienteArchivo);		
			this.jmenuAccionesClienteArchivo.add(this.jMenuItemVerFormClienteArchivo);		
			
			this.jmenuDatosClienteArchivo.add(this.jMenuItemRecargarInformacionClienteArchivo);				
			this.jmenuDatosClienteArchivo.add(this.jMenuItemAnterioresClienteArchivo);				
			this.jmenuDatosClienteArchivo.add(this.jMenuItemSiguientesClienteArchivo);				
			this.jmenuDatosClienteArchivo.add(this.jMenuItemAbrirOrderByClienteArchivo);				
			this.jmenuDatosClienteArchivo.add(this.jMenuItemMostrarOcultarClienteArchivo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesClienteArchivo.add(this.jMenuItemGuardarCambiosClienteArchivo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarClienteArchivo.add(this.jmenuArchivoClienteArchivo);		
			this.jmenuBarClienteArchivo.add(this.jmenuAccionesClienteArchivo);		
			this.jmenuBarClienteArchivo.add(this.jmenuDatosClienteArchivo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarClienteArchivo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasClienteArchivo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteClienteArchivo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteClienteArchivo.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteClienteArchivo= new JButtonMe();
		this.jButtonFK_IdClienteClienteArchivo.setText("Buscar");
		this.jButtonFK_IdClienteClienteArchivo.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteClienteArchivo,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteClienteArchivo = new JLabelMe();
		jLabelid_clienteFK_IdClienteClienteArchivo.setText("Cliente :");
		jLabelid_clienteFK_IdClienteClienteArchivo.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteClienteArchivo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteClienteArchivo= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteClienteArchivo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteClienteArchivo= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteClienteArchivo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteClienteArchivo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteClienteArchivo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteClienteArchivo.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteClienteArchivo.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteClienteArchivo.setFocusable(false);

		this.jPanelFK_IdTipoArchivoClienteArchivo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoArchivoClienteArchivo.setToolTipText("Buscar Por Tipo Archivo ");
		this.jButtonFK_IdTipoArchivoClienteArchivo= new JButtonMe();
		this.jButtonFK_IdTipoArchivoClienteArchivo.setText("Buscar");
		this.jButtonFK_IdTipoArchivoClienteArchivo.setToolTipText("Buscar Por Tipo Archivo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoArchivoClienteArchivo,"buscar_button","Buscar Por Tipo Archivo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoArchivoClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_archivoFK_IdTipoArchivoClienteArchivo = new JLabelMe();
		jLabelid_tipo_archivoFK_IdTipoArchivoClienteArchivo.setText("Tipo Archivo :");
		jLabelid_tipo_archivoFK_IdTipoArchivoClienteArchivo.setToolTipText("Tipo Archivo");
		jLabelid_tipo_archivoFK_IdTipoArchivoClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_archivoFK_IdTipoArchivoClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_archivoFK_IdTipoArchivoClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_archivoFK_IdTipoArchivoClienteArchivo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo= new JComboBoxMe();
		jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasClienteArchivo=new JTabbedPane();


		this.jTabbedPaneBusquedasClienteArchivo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasClienteArchivo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasClienteArchivo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasClienteArchivo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasClienteArchivo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleClienteArchivo = new ClienteArchivoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cliente Archivo DATOS");
			this.jInternalFrameDetalleFormClienteArchivo = new ClienteArchivoDetalleFormJInternalFrame(jDesktopPane,this.clientearchivoSessionBean.getConGuardarRelaciones(),this.clientearchivoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormClienteArchivo = null;//new ClienteArchivoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutClienteArchivo= new GridBagLayout();
		
		
		this.jTableDatosClienteArchivo = new JTableMe();      
		
		String sToolTipClienteArchivo="";
		sToolTipClienteArchivo=ClienteArchivoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipClienteArchivo+="(Cartera.ClienteArchivo)";
		}
		
		if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
			sToolTipClienteArchivo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosClienteArchivo.setToolTipText(sToolTipClienteArchivo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosClienteArchivo);
		this.jTableDatosClienteArchivo.setAutoCreateRowSorter(true);
		this.jTableDatosClienteArchivo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosClienteArchivo.setRowSelectionAllowed(true);
		this.jTableDatosClienteArchivo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosClienteArchivo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoClienteArchivo = new JButtonMe();
		this.jButtonDuplicarClienteArchivo = new JButtonMe();
		this.jButtonCopiarClienteArchivo = new JButtonMe();
		this.jButtonVerFormClienteArchivo = new JButtonMe();
		this.jButtonNuevoRelacionesClienteArchivo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaClienteArchivo = new JButtonMe();
		this.jButtonCerrarClienteArchivo = new JButtonMe();
		
		this.jScrollPanelDatosClienteArchivo = new JScrollPane();   
        this.jScrollPanelDatosGeneralClienteArchivo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesClienteArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cliente Archivo";
		
		if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente Archivos" + this.sPath));
		} else {
			this.jScrollPanelDatosClienteArchivo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesClienteArchivo.setToolTipText("Acciones");
        this.jPanelAccionesClienteArchivo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoClienteArchivo=new ReporteDinamicoJInternalFrame(ClienteArchivoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoClienteArchivo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionClienteArchivo=new ImportacionJInternalFrame(ClienteArchivoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionClienteArchivo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByClienteArchivo = new JButtonMe();
		
		this.jButtonAbrirOrderByClienteArchivo.setText("Orden");
		this.jButtonAbrirOrderByClienteArchivo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByClienteArchivo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByClienteArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByClienteArchivo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClienteArchivo,false,this);
			
			//this.cargarOrderByClienteArchivo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByClienteArchivo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClienteArchivo,true,this);
			
			//this.cargarOrderByClienteArchivo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosClienteArchivo.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosClienteArchivo.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosClienteArchivo.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosClienteArchivo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosClienteArchivo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosClienteArchivo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoClienteArchivo.setText("Nuevo");
		this.jButtonDuplicarClienteArchivo.setText("Duplicar");
		this.jButtonCopiarClienteArchivo.setText("Copiar");
		this.jButtonVerFormClienteArchivo.setText("Ver");
		this.jButtonNuevoRelacionesClienteArchivo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaClienteArchivo.setText("Guardar");
		this.jButtonCerrarClienteArchivo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoClienteArchivo,"nuevo_button","Nuevo",this.clientearchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarClienteArchivo,"duplicar_button","Duplicar",this.clientearchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarClienteArchivo,"copiar_button","Copiar",this.clientearchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormClienteArchivo,"ver_form","Ver",this.clientearchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesClienteArchivo,"nuevorelaciones_button","Nuevo Rel",this.clientearchivoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaClienteArchivo,"guardarcambiostabla_button","Guardar",this.clientearchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarClienteArchivo,"cerrar_button","Salir",this.clientearchivoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoClienteArchivo.setToolTipText("Nuevo"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarClienteArchivo.setToolTipText("Duplicar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarClienteArchivo.setToolTipText("Copiar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormClienteArchivo.setToolTipText("Ver"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesClienteArchivo.setToolTipText("Nuevo Rel"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaClienteArchivo.setToolTipText("Guardar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarClienteArchivo.setToolTipText("Salir"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoClienteArchivo";
		inputMap = this.jButtonNuevoClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoClienteArchivo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoClienteArchivo"));
		
		//DUPLICAR
		sMapKey = "DuplicarClienteArchivo";
		inputMap = this.jButtonDuplicarClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarClienteArchivo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarClienteArchivo"));
		
		//COPIAR
		sMapKey = "CopiarClienteArchivo";
		inputMap = this.jButtonCopiarClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarClienteArchivo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarClienteArchivo"));
		
		//VEr FORM
		sMapKey = "VerFormClienteArchivo";
		inputMap = this.jButtonVerFormClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormClienteArchivo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormClienteArchivo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesClienteArchivo";
		inputMap = this.jButtonNuevoRelacionesClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesClienteArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesClienteArchivo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarClienteArchivo";
		inputMap = this.jButtonModificarClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarClienteArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarClienteArchivo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarClienteArchivo";
		inputMap = this.jButtonCerrarClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarClienteArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarClienteArchivo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaClienteArchivo";
		inputMap = this.jButtonGuardarCambiosTablaClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaClienteArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaClienteArchivo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesClienteArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesClienteArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionClienteArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ClienteArchivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ClienteArchivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ClienteArchivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ClienteArchivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ClienteArchivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesClienteArchivo.setName("jPanelParametrosReportesClienteArchivo"); 
		
		this.jPanelParametrosReportesAccionesClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesClienteArchivo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesClienteArchivo.setName("jPanelParametrosReportesAccionesClienteArchivo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesClienteArchivo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionClienteArchivo = new JButtonMe();
		this.jButtonRecargarInformacionClienteArchivo.setText("Recargar");
		this.jButtonRecargarInformacionClienteArchivo.setToolTipText("Recargar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionClienteArchivo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionClienteArchivo = new JButtonMe();
		this.jButtonProcesarInformacionClienteArchivo.setText("Procesar");
		this.jButtonProcesarInformacionClienteArchivo.setToolTipText("Procesar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionClienteArchivo.setVisible(false);
			
		this.jButtonProcesarInformacionClienteArchivo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionClienteArchivo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionClienteArchivo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesClienteArchivo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClienteArchivo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesClienteArchivo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesClienteArchivo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClienteArchivo.setText("TIPO");       
		this.jComboBoxTiposReportesClienteArchivo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesClienteArchivo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClienteArchivo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesClienteArchivo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionClienteArchivo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionClienteArchivo.setText("Paginacion");
		this.jComboBoxTiposPaginacionClienteArchivo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesClienteArchivo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesClienteArchivo.setText("Accion");
		this.jComboBoxTiposRelacionesClienteArchivo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesClienteArchivo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesClienteArchivo.setText("Accion");
		this.jComboBoxTiposAccionesClienteArchivo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarClienteArchivo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarClienteArchivo.setText("Accion");
		this.jComboBoxTiposSeleccionarClienteArchivo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralClienteArchivo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralClienteArchivo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralClienteArchivo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralClienteArchivo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesClienteArchivo = new JLabelMe();
		
		this.jLabelAccionesClienteArchivo.setText("Acciones");		
		this.jLabelAccionesClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosClienteArchivo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosClienteArchivo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosClienteArchivo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosClienteArchivo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosClienteArchivo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosClienteArchivo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaClienteArchivo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaClienteArchivo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaClienteArchivo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteClienteArchivo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteClienteArchivo.setText("Graf.");
		this.jCheckBoxConGraficoReporteClienteArchivo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresClienteArchivo = new JButtonMe();
		//this.jButtonAnterioresClienteArchivo.setText("<<");
        this.jButtonAnterioresClienteArchivo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresClienteArchivo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesClienteArchivo = new JButtonMe();
		//this.jButtonSiguientesClienteArchivo.setText(">>");
        this.jButtonSiguientesClienteArchivo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesClienteArchivo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosClienteArchivo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosClienteArchivo.setText("Nue");
        this.jButtonNuevoGuardarCambiosClienteArchivo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosClienteArchivo,"nuevoguardarcambios_button","Nue",this.clientearchivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosClienteArchivo";
		inputMap = this.jButtonNuevoGuardarCambiosClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosClienteArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosClienteArchivo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionClienteArchivo";
		inputMap = this.jButtonRecargarInformacionClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionClienteArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionClienteArchivo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesClienteArchivo";
		inputMap = this.jButtonSiguientesClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesClienteArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesClienteArchivo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresClienteArchivo";
		inputMap = this.jButtonAnterioresClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresClienteArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresClienteArchivo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasClienteArchivo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesClienteArchivo.setMinimumSize(new Dimension(this.getWidth(),ClienteArchivoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClienteArchivoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesClienteArchivo.setMaximumSize(new Dimension(this.getWidth(),ClienteArchivoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClienteArchivoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesClienteArchivo.setPreferredSize(new Dimension(this.getWidth(),ClienteArchivoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClienteArchivoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionClienteArchivo = new GridBagLayout();

			this.jPanelPaginacionClienteArchivo.setLayout(gridaBagLayoutPaginacionClienteArchivo);						
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.gridy = 0;
			this.gridBagConstraintsClienteArchivo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionClienteArchivo.add(this.jButtonAnterioresClienteArchivo, this.gridBagConstraintsClienteArchivo);
					
						
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsClienteArchivo.gridy = 0;
			
			this.jPanelPaginacionClienteArchivo.add(this.jButtonNuevoGuardarCambiosClienteArchivo, this.gridBagConstraintsClienteArchivo);
						
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsClienteArchivo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsClienteArchivo.gridy = 0;
			this.jPanelPaginacionClienteArchivo.add(this.jButtonSiguientesClienteArchivo, this.gridBagConstraintsClienteArchivo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.gridy = 1;
			this.gridBagConstraintsClienteArchivo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteArchivo.add(this.jButtonNuevoClienteArchivo, this.gridBagConstraintsClienteArchivo);
						
			
			
			if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
				this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsClienteArchivo.gridy = 1;
				this.gridBagConstraintsClienteArchivo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionClienteArchivo.add(this.jButtonGuardarCambiosTablaClienteArchivo, this.gridBagConstraintsClienteArchivo);
			}
			
			
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.gridy = 1;
			this.gridBagConstraintsClienteArchivo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteArchivo.add(this.jButtonDuplicarClienteArchivo, this.gridBagConstraintsClienteArchivo);
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.gridy = 1;
			this.gridBagConstraintsClienteArchivo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteArchivo.add(this.jButtonCopiarClienteArchivo, this.gridBagConstraintsClienteArchivo);
		
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.gridy = 1;
			this.gridBagConstraintsClienteArchivo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteArchivo.add(this.jButtonVerFormClienteArchivo, this.gridBagConstraintsClienteArchivo);
		
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.gridy = 1;
			this.gridBagConstraintsClienteArchivo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionClienteArchivo.add(this.jButtonCerrarClienteArchivo, this.gridBagConstraintsClienteArchivo);
		
		
		
		this.jButtonRecargarInformacionClienteArchivo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionClienteArchivo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionClienteArchivo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesClienteArchivo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesClienteArchivo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesClienteArchivo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesClienteArchivo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesClienteArchivo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesClienteArchivo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesClienteArchivo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesClienteArchivo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesClienteArchivo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionClienteArchivo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionClienteArchivo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionClienteArchivo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesClienteArchivo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesClienteArchivo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesClienteArchivo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesClienteArchivo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteArchivo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteArchivo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarClienteArchivo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarClienteArchivo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarClienteArchivo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaClienteArchivo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaClienteArchivo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaClienteArchivo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteClienteArchivo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteClienteArchivo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteClienteArchivo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosClienteArchivo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosClienteArchivo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosClienteArchivo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosClienteArchivo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosClienteArchivo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosClienteArchivo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesClienteArchivo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesClienteArchivo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ClienteArchivo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ClienteArchivo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ClienteArchivo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ClienteArchivo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesClienteArchivo.setLayout(gridaBagParametrosReportesClienteArchivo);
			this.jPanelParametrosReportesAccionesClienteArchivo.setLayout(gridaBagParametrosReportesAccionesClienteArchivo);
			
			
			this.jPanelParametrosAuxiliar1ClienteArchivo.setLayout(gridaBagParametrosAuxiliar1ClienteArchivo);
			this.jPanelParametrosAuxiliar2ClienteArchivo.setLayout(gridaBagParametrosAuxiliar2ClienteArchivo);
			this.jPanelParametrosAuxiliar3ClienteArchivo.setLayout(gridaBagParametrosAuxiliar3ClienteArchivo);
			this.jPanelParametrosAuxiliar4ClienteArchivo.setLayout(gridaBagParametrosAuxiliar4ClienteArchivo);
			//this.jPanelParametrosAuxiliar5ClienteArchivo.setLayout(gridaBagParametrosAuxiliar2ClienteArchivo);			
			
			
			
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClienteArchivo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClienteArchivo.add(this.jButtonRecargarInformacionClienteArchivo, this.gridBagConstraintsClienteArchivo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteArchivo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClienteArchivo.add(this.jComboBoxTiposPaginacionClienteArchivo, this.gridBagConstraintsClienteArchivo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteArchivo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClienteArchivo.add(this.jCheckBoxConAltoMaximoTablaClienteArchivo, this.gridBagConstraintsClienteArchivo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteArchivo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClienteArchivo.add(this.jComboBoxTiposArchivosReportesClienteArchivo, this.gridBagConstraintsClienteArchivo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteArchivo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteArchivo.add(this.jPanelParametrosAuxiliar1ClienteArchivo, this.gridBagConstraintsClienteArchivo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClienteArchivo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ClienteArchivo.add(this.jComboBoxTiposReportesClienteArchivo, this.gridBagConstraintsClienteArchivo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteArchivo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteArchivo.add(this.jPanelParametrosAuxiliar4ClienteArchivo, this.gridBagConstraintsClienteArchivo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteArchivo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteArchivo.add(this.jComboBoxTiposReportesClienteArchivo, this.gridBagConstraintsClienteArchivo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteArchivo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClienteArchivo.add(this.jCheckBoxGenerarReporteClienteArchivo, this.gridBagConstraintsClienteArchivo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteArchivo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteArchivo.add(this.jPanelParametrosAuxiliar2ClienteArchivo, this.gridBagConstraintsClienteArchivo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClienteArchivo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClienteArchivo.add(this.jLabelAccionesClienteArchivo, this.gridBagConstraintsClienteArchivo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
				this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsClienteArchivo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesClienteArchivo.add(this.jButtonAbrirOrderByClienteArchivo, this.gridBagConstraintsClienteArchivo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteArchivo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClienteArchivo.add(this.jComboBoxTiposSeleccionarClienteArchivo, this.gridBagConstraintsClienteArchivo);			
			
			
			/*
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClienteArchivo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClienteArchivo.add(this.jCheckBoxSeleccionarTodosClienteArchivo, this.gridBagConstraintsClienteArchivo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClienteArchivo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ClienteArchivo.add(this.jCheckBoxSeleccionarTodosClienteArchivo, this.gridBagConstraintsClienteArchivo);															
				
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClienteArchivo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ClienteArchivo.add(this.jCheckBoxSeleccionadosClienteArchivo, this.gridBagConstraintsClienteArchivo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteArchivo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteArchivo.add(this.jPanelParametrosAuxiliar3ClienteArchivo, this.gridBagConstraintsClienteArchivo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteArchivo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClienteArchivo.add(this.jComboBoxTiposAccionesClienteArchivo, this.gridBagConstraintsClienteArchivo);
	
				
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteArchivo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClienteArchivo.add(this.jTextFieldValorCampoGeneralClienteArchivo, this.gridBagConstraintsClienteArchivo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosClienteArchivo = new GridBagLayout();

			this.jScrollPanelDatosClienteArchivo.setLayout(gridaBagLayoutDatosClienteArchivo);
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.gridy = 0;
			this.gridBagConstraintsClienteArchivo.gridx = 0;
			
			this.jScrollPanelDatosClienteArchivo.add(this.jTableDatosClienteArchivo, this.gridBagConstraintsClienteArchivo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosClienteArchivo.setViewportView(this.jTableDatosClienteArchivo);
		this.jTableDatosClienteArchivo.setFillsViewportHeight(true);
		this.jTableDatosClienteArchivo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesClienteArchivo= new GridBagLayout();
		this.jPanelAccionesClienteArchivo.setLayout(gridaBagLayoutAccionesClienteArchivo);
		
		
		/*	
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteArchivo.gridy = 0;
		this.gridBagConstraintsClienteArchivo.gridx = 0;
			
		this.jPanelAccionesClienteArchivo.add(this.jButtonNuevoClienteArchivo, this.gridBagConstraintsClienteArchivo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteClienteArchivo= new GridBagLayout();
		gridaBagLayoutFK_IdClienteClienteArchivo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteClienteArchivo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteClienteArchivo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteClienteArchivo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteClienteArchivo.setLayout(gridaBagLayoutFK_IdClienteClienteArchivo);

		gridBagConstraintsClienteArchivo = new GridBagConstraints();
		gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteArchivo.gridy = 0;
		gridBagConstraintsClienteArchivo.gridx = 0;
		jPanelFK_IdClienteClienteArchivo.add(jLabelid_clienteFK_IdClienteClienteArchivo, gridBagConstraintsClienteArchivo);

		gridBagConstraintsClienteArchivo = new GridBagConstraints();
		gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteArchivo.gridy = 0;
		gridBagConstraintsClienteArchivo.gridx = 1;
		jPanelFK_IdClienteClienteArchivo.add(jComboBoxid_clienteFK_IdClienteClienteArchivo, gridBagConstraintsClienteArchivo);


		gridBagConstraintsClienteArchivo = new GridBagConstraints();
		gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.EAST;
		gridBagConstraintsClienteArchivo.fill = GridBagConstraints.NONE;
		gridBagConstraintsClienteArchivo.gridy = 0;
		gridBagConstraintsClienteArchivo.gridx = 0;
		jPanelFK_IdClienteClienteArchivo.add(this.jButtonBuscarFK_IdClienteid_clienteClienteArchivo, gridBagConstraintsClienteArchivo);

		gridBagConstraintsClienteArchivo = new GridBagConstraints();
		gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteArchivo.gridy = 1;
		gridBagConstraintsClienteArchivo.gridx =1;
		jPanelFK_IdClienteClienteArchivo.add(jButtonFK_IdClienteClienteArchivo, gridBagConstraintsClienteArchivo);

		jTabbedPaneBusquedasClienteArchivo.addTab("1.-Por Cliente ", jPanelFK_IdClienteClienteArchivo);
		jTabbedPaneBusquedasClienteArchivo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoArchivoClienteArchivo= new GridBagLayout();
		gridaBagLayoutFK_IdTipoArchivoClienteArchivo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoArchivoClienteArchivo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoArchivoClienteArchivo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoArchivoClienteArchivo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoArchivoClienteArchivo.setLayout(gridaBagLayoutFK_IdTipoArchivoClienteArchivo);

		gridBagConstraintsClienteArchivo = new GridBagConstraints();
		gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteArchivo.gridy = 0;
		gridBagConstraintsClienteArchivo.gridx = 0;
		jPanelFK_IdTipoArchivoClienteArchivo.add(jLabelid_tipo_archivoFK_IdTipoArchivoClienteArchivo, gridBagConstraintsClienteArchivo);

		gridBagConstraintsClienteArchivo = new GridBagConstraints();
		gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteArchivo.gridy = 0;
		gridBagConstraintsClienteArchivo.gridx = 1;
		jPanelFK_IdTipoArchivoClienteArchivo.add(jComboBoxid_tipo_archivoFK_IdTipoArchivoClienteArchivo, gridBagConstraintsClienteArchivo);

		gridBagConstraintsClienteArchivo = new GridBagConstraints();
		gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteArchivo.gridy = 1;
		gridBagConstraintsClienteArchivo.gridx =1;
		jPanelFK_IdTipoArchivoClienteArchivo.add(jButtonFK_IdTipoArchivoClienteArchivo, gridBagConstraintsClienteArchivo);

		jTabbedPaneBusquedasClienteArchivo.addTab("2.-Por Tipo Archivo ", jPanelFK_IdTipoArchivoClienteArchivo);
		jTabbedPaneBusquedasClienteArchivo.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutClienteArchivo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutClienteArchivo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.clientearchivoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();						
			this.gridBagConstraintsClienteArchivo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClienteArchivo.gridx = 0;		
			//this.gridBagConstraintsClienteArchivo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsClienteArchivo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarClienteArchivo, this.gridBagConstraintsClienteArchivo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsClienteArchivo.gridx = 0;		
		//this.gridBagConstraintsClienteArchivo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsClienteArchivo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsClienteArchivo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsClienteArchivo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClienteArchivo.gridx = 0;		
			this.gridBagConstraintsClienteArchivo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsClienteArchivo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasClienteArchivo, this.gridBagConstraintsClienteArchivo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteArchivo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesClienteArchivo, this.gridBagConstraintsClienteArchivo);								
		
		
		/*
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteArchivo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesClienteArchivo, this.gridBagConstraintsClienteArchivo);
		*/		
		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsClienteArchivo.gridx =0;
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsClienteArchivo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosClienteArchivo, this.gridBagConstraintsClienteArchivo);
				
		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteArchivo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionClienteArchivo, this.gridBagConstraintsClienteArchivo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ClienteArchivoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosClienteArchivo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosClienteArchivo = new GridBagLayout();
			this.jPanelBusquedasParametrosClienteArchivo.setLayout(gridaBagLayoutBusquedasParametrosClienteArchivo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralClienteArchivo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralClienteArchivo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteArchivo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteArchivo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteArchivo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposClienteArchivo, this.gridBagConstraintsClienteArchivo);
			
			
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteArchivo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosClienteArchivo, this.gridBagConstraintsClienteArchivo);
		
			
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsClienteArchivo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesClienteArchivo, this.gridBagConstraintsClienteArchivo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralClienteArchivo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoClienteArchivo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoClienteArchivo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoClienteArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoClienteArchivo.setName("jPanelReporteDinamicoClienteArchivo"); 
		
		this.jPanelReporteDinamicoClienteArchivo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoClienteArchivo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoClienteArchivo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoClienteArchivo.setLayout(gridaBagLayoutReporteDinamicoClienteArchivo);
		
		
		this.jInternalFrameReporteDinamicoClienteArchivo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoClienteArchivo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteClienteArchivo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoClienteArchivo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoClienteArchivo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoClienteArchivo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoClienteArchivo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoClienteArchivo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoClienteArchivo.setResizable(true);
	    this.jInternalFrameReporteDinamicoClienteArchivo.setClosable(true);
	    this.jInternalFrameReporteDinamicoClienteArchivo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoClienteArchivo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoClienteArchivo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoClienteArchivo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente Archivos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteClienteArchivo = new JLabelMe();

		this.jLabelColumnasSelectReporteClienteArchivo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteArchivo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteArchivo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoClienteArchivo.add(this.jLabelColumnasSelectReporteClienteArchivo, this.gridBagConstraintsClienteArchivo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteClienteArchivo = new JList<Reporte>();
		this.jListColumnasSelectReporteClienteArchivo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteClienteArchivo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteClienteArchivo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteClienteArchivo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteClienteArchivo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteClienteArchivo=new JScrollPane(this.jListColumnasSelectReporteClienteArchivo);
			
			this.jScrollColumnasSelectReporteClienteArchivo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteClienteArchivo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteClienteArchivo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteArchivo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteArchivo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoClienteArchivo.add(this.jListColumnasSelectReporteClienteArchivo, this.gridBagConstraintsClienteArchivo);
		this.jPanelReporteDinamicoClienteArchivo.add(this.jScrollColumnasSelectReporteClienteArchivo, this.gridBagConstraintsClienteArchivo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteClienteArchivo = new JLabelMe();

		this.jLabelRelacionesSelectReporteClienteArchivo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteClienteArchivo = new JList<Reporte>();
		this.jListRelacionesSelectReporteClienteArchivo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteClienteArchivo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteClienteArchivo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteClienteArchivo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteClienteArchivo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteClienteArchivo=new JScrollPane(this.jListRelacionesSelectReporteClienteArchivo);
			
			this.jScrollRelacionesSelectReporteClienteArchivo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteClienteArchivo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteClienteArchivo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoClienteArchivo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoClienteArchivo = new JComboBoxMe();
		this.jListColumnasValoresGraficoClienteArchivo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoClienteArchivo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoClienteArchivo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoClienteArchivo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoClienteArchivo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoClienteArchivo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoClienteArchivo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoClienteArchivo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoClienteArchivo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoClienteArchivo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoClienteArchivo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoClienteArchivo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoClienteArchivo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteArchivo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteArchivo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClienteArchivo.add(this.jLabelGenerarExcelReporteDinamicoClienteArchivo, this.gridBagConstraintsClienteArchivo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoClienteArchivo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoClienteArchivo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoClienteArchivo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoClienteArchivo.setToolTipText("Generar EXCEL"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		//this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsClienteArchivo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsClienteArchivo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoClienteArchivo.add(this.jButtonGenerarExcelReporteDinamicoClienteArchivo, this.gridBagConstraintsClienteArchivo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteArchivo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteArchivo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteArchivo.add(this.jComboBoxTiposReportesDinamicoClienteArchivo, this.gridBagConstraintsClienteArchivo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoClienteArchivo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoClienteArchivo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteArchivo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteArchivo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClienteArchivo.add(this.jLabelTiposArchivoReporteDinamicoClienteArchivo, this.gridBagConstraintsClienteArchivo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteArchivo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteArchivo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteArchivo.add(this.jComboBoxTiposArchivosReportesDinamicoClienteArchivo, this.gridBagConstraintsClienteArchivo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoClienteArchivo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoClienteArchivo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoClienteArchivo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoClienteArchivo.setToolTipText("Generar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteArchivo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteArchivo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteArchivo.add(this.jButtonGenerarReporteDinamicoClienteArchivo, this.gridBagConstraintsClienteArchivo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoClienteArchivo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoClienteArchivo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoClienteArchivo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoClienteArchivo.setToolTipText("Cancelar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteArchivo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteArchivo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteArchivo.add(this.jButtonCerrarReporteDinamicoClienteArchivo, this.gridBagConstraintsClienteArchivo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalClienteArchivo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoClienteArchivo= new JScrollPane(jPanelReporteDinamicoClienteArchivo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoClienteArchivo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoClienteArchivo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoClienteArchivo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente Archivos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsClienteArchivo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoClienteArchivo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoClienteArchivo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalClienteArchivo);
		this.jInternalFrameReporteDinamicoClienteArchivo.getContentPane().add(this.jScrollPanelReporteDinamicoClienteArchivo, this.gridBagConstraintsClienteArchivo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionClienteArchivo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionClienteArchivo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionClienteArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionClienteArchivo.setName("jPanelImportacionClienteArchivo"); 
		
		this.jPanelImportacionClienteArchivo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionClienteArchivo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionClienteArchivo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionClienteArchivo.setLayout(gridaBagLayoutImportacionClienteArchivo);
		
		
		this.jInternalFrameImportacionClienteArchivo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionClienteArchivo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionClienteArchivo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteClienteArchivo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionClienteArchivo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionClienteArchivo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionClienteArchivo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionClienteArchivo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionClienteArchivo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionClienteArchivo.setResizable(true);
	    this.jInternalFrameImportacionClienteArchivo.setClosable(true);
	    this.jInternalFrameImportacionClienteArchivo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionClienteArchivo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionClienteArchivo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionClienteArchivo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionClienteArchivo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionClienteArchivo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionClienteArchivo.setResizable(true);
	    this.jInternalFrameImportacionClienteArchivo.setClosable(true);
	    this.jInternalFrameImportacionClienteArchivo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionClienteArchivo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionClienteArchivo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionClienteArchivo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente Archivos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionClienteArchivo = new JLabelMe();

		this.jLabelArchivoImportacionClienteArchivo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteArchivo.gridy = iPosYImportacion;		
		this.gridBagConstraintsClienteArchivo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionClienteArchivo.add(this.jLabelArchivoImportacionClienteArchivo, this.gridBagConstraintsClienteArchivo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionClienteArchivo = new JFileChooser();		
		this.jFileChooserImportacionClienteArchivo.setToolTipText("ESCOGER ARCHIVO"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionClienteArchivo = new JButtonMe();
		this.jButtonAbrirImportacionClienteArchivo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionClienteArchivo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionClienteArchivo.setToolTipText("Generar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteArchivo.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteArchivo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteArchivo.add(this.jButtonAbrirImportacionClienteArchivo, this.gridBagConstraintsClienteArchivo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionClienteArchivo = new JLabelMe();

		this.jLabelPathArchivoImportacionClienteArchivo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionClienteArchivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionClienteArchivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionClienteArchivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteArchivo.gridy = iPosYImportacion;		
		this.gridBagConstraintsClienteArchivo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionClienteArchivo.add(this.jLabelPathArchivoImportacionClienteArchivo, this.gridBagConstraintsClienteArchivo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionClienteArchivo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionClienteArchivo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionClienteArchivo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionClienteArchivo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteArchivo.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteArchivo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteArchivo.add(this.jTextFieldPathArchivoImportacionClienteArchivo, this.gridBagConstraintsClienteArchivo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionClienteArchivo = new JButtonMe();
		this.jButtonGenerarImportacionClienteArchivo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionClienteArchivo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionClienteArchivo.setToolTipText("Generar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteArchivo.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteArchivo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteArchivo.add(this.jButtonGenerarImportacionClienteArchivo, this.gridBagConstraintsClienteArchivo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionClienteArchivo = new JButtonMe();
		this.jButtonCerrarImportacionClienteArchivo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionClienteArchivo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionClienteArchivo.setToolTipText("Cancelar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteArchivo.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteArchivo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteArchivo.add(this.jButtonCerrarImportacionClienteArchivo, this.gridBagConstraintsClienteArchivo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalClienteArchivo = new GridBagLayout();
		
		this.jScrollPanelImportacionClienteArchivo= new JScrollPane(jPanelImportacionClienteArchivo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
		this.gridBagConstraintsClienteArchivo.gridy =iPosYImportacion;
		this.gridBagConstraintsClienteArchivo.gridx =iPosXImportacion;
		this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionClienteArchivo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionClienteArchivo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalClienteArchivo);
		this.jInternalFrameImportacionClienteArchivo.getContentPane().add(this.jScrollPanelImportacionClienteArchivo, this.gridBagConstraintsClienteArchivo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByClienteArchivo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByClienteArchivo = new JButtonMe();
			this.jButtonAbrirOrderByClienteArchivo.setText("Orden");
			this.jButtonAbrirOrderByClienteArchivo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByClienteArchivo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByClienteArchivo";
			inputMap = this.jButtonAbrirOrderByClienteArchivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByClienteArchivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByClienteArchivo"));
		
		
			GridBagLayout gridaBagLayoutOrderByClienteArchivo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByClienteArchivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByClienteArchivo.setName("jPanelOrderByClienteArchivo"); 
			
			this.jPanelOrderByClienteArchivo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByClienteArchivo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByClienteArchivo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByClienteArchivo.setLayout(gridaBagLayoutOrderByClienteArchivo);
			
			
			this.jTableDatosClienteArchivoOrderBy = new JTableMe();        
			this.jTableDatosClienteArchivoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosClienteArchivoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosClienteArchivoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosClienteArchivoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosClienteArchivoOrderBy.setViewportView(this.jTableDatosClienteArchivoOrderBy);
			this.jTableDatosClienteArchivoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosClienteArchivoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByClienteArchivo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByClienteArchivo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByClienteArchivo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteClienteArchivo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByClienteArchivo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByClienteArchivo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByClienteArchivo.setTitle("Orden");
			this.jInternalFrameOrderByClienteArchivo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByClienteArchivo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByClienteArchivo.setResizable(true);
			this.jInternalFrameOrderByClienteArchivo.setClosable(true);
			this.jInternalFrameOrderByClienteArchivo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByClienteArchivo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByClienteArchivo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByClienteArchivo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByClienteArchivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente Archivos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsClienteArchivo.gridx =iPosXOrderBy;
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsClienteArchivo.ipady =150;
				
			this.jPanelOrderByClienteArchivo.add(jScrollPanelDatosClienteArchivoOrderBy, this.gridBagConstraintsClienteArchivo);//this.jTableDatosClienteArchivoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByClienteArchivo = new JButtonMe();
			this.jButtonCerrarOrderByClienteArchivo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByClienteArchivo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByClienteArchivo.setToolTipText("Cancelar"+" "+ClienteArchivoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByClienteArchivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteArchivo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsClienteArchivo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByClienteArchivo.add(this.jButtonCerrarOrderByClienteArchivo, this.gridBagConstraintsClienteArchivo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalClienteArchivo = new GridBagLayout();
			
			this.jScrollPanelOrderByClienteArchivo= new JScrollPane(jPanelOrderByClienteArchivo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsClienteArchivo = new GridBagConstraints();
			this.gridBagConstraintsClienteArchivo.gridy =iPosYOrderBy;
			this.gridBagConstraintsClienteArchivo.gridx =iPosXOrderBy;
			this.gridBagConstraintsClienteArchivo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByClienteArchivo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByClienteArchivo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalClienteArchivo);
			
			this.jInternalFrameOrderByClienteArchivo.getContentPane().add(this.jScrollPanelOrderByClienteArchivo, this.gridBagConstraintsClienteArchivo);			
		
		} else {
			this.jButtonAbrirOrderByClienteArchivo = new JButtonMe();
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
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.clientearchivoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosClienteArchivo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosClienteArchivo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosClienteArchivo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosClienteArchivo.getRowHeight();//ClienteArchivoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ClienteArchivoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaClienteArchivo.isSelected()) {
					iHeightTable=ClienteArchivoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ClienteArchivoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ClienteArchivoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ClienteArchivoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaClienteArchivo.isSelected()) {
					iHeightTable=ClienteArchivoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ClienteArchivoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ClienteArchivoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosClienteArchivo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosClienteArchivo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosClienteArchivo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosClienteArchivo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosClienteArchivo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosClienteArchivo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByClienteArchivo!=null && this.jInternalFrameOrderByClienteArchivo.getjTableDatosOrderBy()!=null) {
			//if(!this.clientearchivoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByClienteArchivo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByClienteArchivo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByClienteArchivo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByClienteArchivo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByClienteArchivo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByClienteArchivo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByClienteArchivo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosClienteArchivo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosClienteArchivo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosClienteArchivo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=clientearchivoLogic.getClienteArchivos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=clientearchivos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ClienteArchivo> TraerClienteArchivoBeans(List<ClienteArchivo> clientearchivos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ClienteArchivo clientearchivo:clientearchivos) {
					
				if(!(ClienteArchivoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ClienteArchivoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					clientearchivo.setsDetalleGeneralEntityReporte(ClienteArchivoConstantesFunciones.getClienteArchivoDescripcion(clientearchivo));
										
						
					
						
					
				} else  {
							
					//clientearchivo.setsDetalleGeneralEntityReporte(clientearchivo.getsDetalleGeneralEntityReporte());
										
				}
				
				//clientearchivobeans.add(clientearchivobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return clientearchivos;
    }
	//PARA REPORTES FIN
}
