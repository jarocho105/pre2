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
import com.bydan.erp.cartera.util.ClienteImagenConstantesFunciones;

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
public class ClienteImagenJInternalFrame extends ClienteImagenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarClienteImagen;
	
	protected JMenuBar jmenuBarClienteImagen;
	
	protected JMenu jmenuClienteImagen;
	protected JMenu jmenuDatosClienteImagen;
	protected JMenu jmenuArchivoClienteImagen;
	protected JMenu jmenuAccionesClienteImagen;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosClienteImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutClienteImagen;	
	protected GridBagConstraints gridBagConstraintsClienteImagen;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ClienteImagenDetalleFormJInternalFrame jInternalFrameDetalleFormClienteImagen;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoClienteImagen;	
	protected ImportacionJInternalFrame jInternalFrameImportacionClienteImagen;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoImagenPersonaBeanSwingJInternalFrame tipoimagenpersonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoimagenpersona="";

	protected TipoImagenBeanSwingJInternalFrame tipoimagenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoimagen="";
	
	public ClienteImagenSessionBean clienteimagenSessionBean;
		
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoImagenPersonaSessionBean tipoimagenpersonaSessionBean;
	public TipoImagenSessionBean tipoimagenSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ClienteImagen> clienteimagens;		
	public List<ClienteImagen> clienteimagensEliminados;	
	public List<ClienteImagen> clienteimagensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByClienteImagen;		
	protected JButton jButtonAbrirOrderByClienteImagen;
	
	
	//protected JPanel jPanelOrderByClienteImagen;
	//public JScrollPane jScrollPanelOrderByClienteImagen;	
	//protected JButton jButtonCerrarOrderByClienteImagen;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ClienteImagenLogic clienteimagenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosClienteImagen;
	public JScrollPane jScrollPanelDatosEdicionClienteImagen;
	public JScrollPane jScrollPanelDatosGeneralClienteImagen;
    
	
	
	//public JScrollPane jScrollPanelDatosClienteImagenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoClienteImagen;
	//public JScrollPane jScrollPanelImportacionClienteImagen;
	
	
	
	protected JPanel jPanelAccionesClienteImagen;
	
    protected JPanel jPanelPaginacionClienteImagen;
    protected JPanel jPanelParametrosReportesClienteImagen;
	protected JPanel jPanelParametrosReportesAccionesClienteImagen;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ClienteImagen;
	protected JPanel jPanelParametrosAuxiliar2ClienteImagen;
	protected JPanel jPanelParametrosAuxiliar3ClienteImagen;
	protected JPanel jPanelParametrosAuxiliar4ClienteImagen;
	//protected JPanel jPanelParametrosAuxiliar5ClienteImagen;
	
	
	
	//protected JPanel jPanelReporteDinamicoClienteImagen;
	//protected JPanel jPanelImportacionClienteImagen;
	
	
	public JTable jTableDatosClienteImagen;
	
	
	
	//public JTable jTableDatosClienteImagenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoClienteImagen;
	protected JButton jButtonDuplicarClienteImagen;
	protected JButton jButtonCopiarClienteImagen;
	protected JButton jButtonVerFormClienteImagen;
	protected JButton jButtonNuevoRelacionesClienteImagen;
	protected JButton jButtonModificarClienteImagen;
	
    protected JButton jButtonGuardarCambiosTablaClienteImagen;
	protected JButton jButtonCerrarClienteImagen;
	
	
	protected JButton jButtonRecargarInformacionClienteImagen;
	protected JButton jButtonProcesarInformacionClienteImagen;
	
	
	protected JButton jButtonAnterioresClienteImagen;
	protected JButton jButtonSiguientesClienteImagen;
	protected JButton jButtonNuevoGuardarCambiosClienteImagen;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoClienteImagen;
	//protected JButton jButtonCerrarReporteDinamicoClienteImagen;
	//protected JButton jButtonGenerarExcelReporteDinamicoClienteImagen;	
	
	
	
	//protected JButton jButtonAbrirImportacionClienteImagen;
	//protected JButton jButtonGenerarImportacionClienteImagen;
	//protected JButton jButtonCerrarImportacionClienteImagen;
	//protected JFileChooser jFileChooserImportacionClienteImagen;
	//protected File fileImportacionClienteImagen;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarClienteImagen;
	protected JButton jButtonDuplicarToolBarClienteImagen;
	protected JButton jButtonNuevoRelacionesToolBarClienteImagen;
	
	
	public JButton jButtonGuardarCambiosToolBarClienteImagen;
	protected JButton jButtonCopiarToolBarClienteImagen;
	protected JButton jButtonVerFormToolBarClienteImagen;
	public JButton jButtonGuardarCambiosTablaToolBarClienteImagen;
	protected JButton jButtonMostrarOcultarTablaToolBarClienteImagen;
	protected JButton jButtonCerrarToolBarClienteImagen;
	
	protected JButton jButtonRecargarInformacionToolBarClienteImagen;
	protected JButton jButtonProcesarInformacionToolBarClienteImagen;
	protected JButton jButtonAnterioresToolBarClienteImagen;
	protected JButton jButtonSiguientesToolBarClienteImagen;
	protected JButton jButtonNuevoGuardarCambiosToolBarClienteImagen;
	protected JButton jButtonAbrirOrderByToolBarClienteImagen;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoClienteImagen;
	protected JMenuItem jMenuItemDuplicarClienteImagen;
	protected JMenuItem jMenuItemNuevoRelacionesClienteImagen;
	
	
	protected JMenuItem jMenuItemGuardarCambiosClienteImagen;
	protected JMenuItem jMenuItemCopiarClienteImagen;
	protected JMenuItem jMenuItemVerFormClienteImagen;
	protected JMenuItem jMenuItemGuardarCambiosTablaClienteImagen;
	protected JMenuItem jMenuItemCerrarClienteImagen;
	protected JMenuItem jMenuItemDetalleCerrarClienteImagen;
	protected JMenuItem jMenuItemDetalleAbrirOrderByClienteImagen;
	protected JMenuItem jMenuItemDetalleMostarOcultarClienteImagen;
	
	protected JMenuItem jMenuItemRecargarInformacionClienteImagen;
	protected JMenuItem jMenuItemProcesarInformacionClienteImagen;
	protected JMenuItem jMenuItemAnterioresClienteImagen;
	protected JMenuItem jMenuItemSiguientesClienteImagen;
	protected JMenuItem jMenuItemNuevoGuardarCambiosClienteImagen;
	protected JMenuItem jMenuItemAbrirOrderByClienteImagen;
	protected JMenuItem jMenuItemMostrarOcultarClienteImagen;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesClienteImagen;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosClienteImagen;
	protected JCheckBox jCheckBoxSeleccionadosClienteImagen;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaClienteImagen;
	protected JCheckBox jCheckBoxConGraficoReporteClienteImagen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesClienteImagen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesClienteImagen;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoClienteImagen;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoClienteImagen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesClienteImagen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionClienteImagen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesClienteImagen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesClienteImagen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarClienteImagen;
	protected JTextField jTextFieldValorCampoGeneralClienteImagen;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteClienteImagen;
	//public JList<Reporte> jListColumnasSelectReporteClienteImagen;
	//public JScrollPane jScrollColumnasSelectReporteClienteImagen;
	
	//public JLabel jLabelRelacionesSelectReporteClienteImagen;
	//public JList<Reporte> jListRelacionesSelectReporteClienteImagen;
	//public JScrollPane jScrollRelacionesSelectReporteClienteImagen;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoClienteImagen;
	//protected JCheckBox jCheckBoxConGraficoDinamicoClienteImagen;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoClienteImagen;
	//public JLabel jLabelTiposArchivoReporteDinamicoClienteImagen;
	
		
	//public JLabel jLabelArchivoImportacionClienteImagen;	
	//public JLabel jLabelPathArchivoImportacionClienteImagen;
	//protected JTextField jTextFieldPathArchivoImportacionClienteImagen;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoClienteImagen;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoClienteImagen;
	
	//public JLabel jLabelColumnaCategoriaValorClienteImagen;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorClienteImagen;
	
	//public JLabel jLabelColumnasValoresGraficoClienteImagen;
	//public JList<Reporte> jListColumnasValoresGraficoClienteImagen;
	//public JScrollPane jScrollColumnasValoresGraficoClienteImagen;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoClienteImagen;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoClienteImagen;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasClienteImagen;
	public JPanel jPanelFK_IdClienteClienteImagen;
	public JButton jButtonFK_IdClienteClienteImagen;
	public JPanel jPanelFK_IdTipoImagenClienteImagen;
	public JButton jButtonFK_IdTipoImagenClienteImagen;
	public JPanel jPanelFK_IdTipoImagenPersonaClienteImagen;
	public JButton jButtonFK_IdTipoImagenPersonaClienteImagen;
	
	public JPanel jPanelid_clienteFK_IdClienteClienteImagen;
	public JLabel jLabelid_clienteFK_IdClienteClienteImagen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteClienteImagen;
	public JButton jButtonid_clienteFK_IdClienteClienteImagen= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteClienteImagenUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteClienteImagenBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteClienteImagen;
	
	public JPanel jPanelid_tipo_imagenFK_IdTipoImagenClienteImagen;
	public JLabel jLabelid_tipo_imagenFK_IdTipoImagenClienteImagen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen;
	public JButton jButtonid_tipo_imagenFK_IdTipoImagenClienteImagen= new JButtonMe();
	public JButton jButtonid_tipo_imagenFK_IdTipoImagenClienteImagenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_imagenFK_IdTipoImagenClienteImagenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen;
	public JLabel jLabelid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen;
	public JButton jButtonid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen= new JButtonMe();
	public JButton jButtonid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagenBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ClienteImagenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ClienteImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteImagenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteImagenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteImagenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ClienteImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionClienteImagen)	{
		this.jButtonRecargarInformacionClienteImagen = jButtonRecargarInformacionClienteImagen;
	}
	
	public JButton getjButtonProcesarInformacionClienteImagen() {
		return this.jButtonProcesarInformacionClienteImagen;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionClienteImagen)	{
		this.jButtonProcesarInformacionClienteImagen = jButtonProcesarInformacionClienteImagen;
	}
	
	
	public JButton getjButtonRecargarInformacionClienteImagen() {
		return this.jButtonRecargarInformacionClienteImagen;
	}
	
	
	public List<ClienteImagen> getclienteimagens() {
		return this.clienteimagens;
	}

	public void setclienteimagens(List<ClienteImagen> clienteimagens) {
		this.clienteimagens = clienteimagens;
	}
	
	public List<ClienteImagen> getclienteimagensAux() {
		return this.clienteimagensAux;
	}

	public void setclienteimagensAux(List<ClienteImagen> clienteimagensAux) {
		this.clienteimagensAux = clienteimagensAux;
	}
	
	public List<ClienteImagen> getclienteimagensEliminados() {
		return this.clienteimagensEliminados;
	}

	public void setClienteImagensEliminados(List<ClienteImagen> clienteimagensEliminados) {
		this.clienteimagensEliminados = clienteimagensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarClienteImagen() {
		return jComboBoxTiposSeleccionarClienteImagen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarClienteImagen(
			JComboBox jComboBoxTiposSeleccionarClienteImagen) {
		this.jComboBoxTiposSeleccionarClienteImagen = jComboBoxTiposSeleccionarClienteImagen;
	}
	
	public void setBorderResaltarTiposSeleccionarClienteImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarClienteImagen.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarClienteImagen .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralClienteImagen() {
		return jTextFieldValorCampoGeneralClienteImagen;
	}

	public void setjTextFieldValorCampoGeneralClienteImagen(
			JTextField jTextFieldValorCampoGeneralClienteImagen) {
		this.jTextFieldValorCampoGeneralClienteImagen = jTextFieldValorCampoGeneralClienteImagen;
	}

	public void setBorderResaltarValorCampoGeneralClienteImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteImagen.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralClienteImagen .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosClienteImagen() {
		return this.jCheckBoxSeleccionarTodosClienteImagen;
	}

	public void setjCheckBoxSeleccionarTodosClienteImagen(
			JCheckBox jCheckBoxSeleccionarTodosClienteImagen) {
		this.jCheckBoxSeleccionarTodosClienteImagen = jCheckBoxSeleccionarTodosClienteImagen;
	}

	public void setBorderResaltarSeleccionarTodosClienteImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteImagen.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosClienteImagen .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosClienteImagen() {
		return this.jCheckBoxSeleccionadosClienteImagen;
	}

	public void setjCheckBoxSeleccionadosClienteImagen(
			JCheckBox jCheckBoxSeleccionadosClienteImagen) {
		this.jCheckBoxSeleccionadosClienteImagen = jCheckBoxSeleccionadosClienteImagen;
	}
	
	public void setBorderResaltarSeleccionadosClienteImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteImagen.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosClienteImagen .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesClienteImagen() {
		return this.jComboBoxTiposArchivosReportesClienteImagen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesClienteImagen(
			JComboBox jComboBoxTiposArchivosReportesClienteImagen) {
		this.jComboBoxTiposArchivosReportesClienteImagen = jComboBoxTiposArchivosReportesClienteImagen;
	}

	public void setBorderResaltarTiposArchivosReportesClienteImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteImagen.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesClienteImagen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesClienteImagen() {
		return this.jComboBoxTiposReportesClienteImagen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesClienteImagen(
			JComboBox jComboBoxTiposReportesClienteImagen) {
		this.jComboBoxTiposReportesClienteImagen = jComboBoxTiposReportesClienteImagen;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoClienteImagen() {
	//	return jComboBoxTiposReportesDinamicoClienteImagen;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoClienteImagen(
	//		JComboBox jComboBoxTiposReportesDinamicoClienteImagen) {
	//	this.jComboBoxTiposReportesDinamicoClienteImagen = jComboBoxTiposReportesDinamicoClienteImagen;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoClienteImagen() {
	//	return jComboBoxTiposArchivosReportesDinamicoClienteImagen;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoClienteImagen(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoClienteImagen) {
	//	this.jComboBoxTiposArchivosReportesDinamicoClienteImagen = jComboBoxTiposArchivosReportesDinamicoClienteImagen;
	//}
	
	public void setBorderResaltarTiposReportesClienteImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteImagen.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesClienteImagen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesClienteImagen() {
		return this.jComboBoxTiposGraficosReportesClienteImagen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesClienteImagen(
			JComboBox jComboBoxTiposGraficosReportesClienteImagen) {
		this.jComboBoxTiposGraficosReportesClienteImagen = jComboBoxTiposGraficosReportesClienteImagen;
	}
	
	public void setBorderResaltarTiposGraficosReportesClienteImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteImagen.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesClienteImagen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionClienteImagen() {
		return this.jComboBoxTiposPaginacionClienteImagen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionClienteImagen(
			JComboBox jComboBoxTiposPaginacionClienteImagen) {
		this.jComboBoxTiposPaginacionClienteImagen = jComboBoxTiposPaginacionClienteImagen;
	}
	
	public void setBorderResaltarTiposPaginacionClienteImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteImagen.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionClienteImagen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesClienteImagen() {
		return this.jComboBoxTiposRelacionesClienteImagen;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesClienteImagen() {
		return this.jComboBoxTiposAccionesClienteImagen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesClienteImagen(
			JComboBox jComboBoxTiposRelacionesClienteImagen) {
		this.jComboBoxTiposRelacionesClienteImagen = jComboBoxTiposRelacionesClienteImagen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesClienteImagen(
			JComboBox jComboBoxTiposAccionesClienteImagen) {
		this.jComboBoxTiposAccionesClienteImagen = jComboBoxTiposAccionesClienteImagen;
	}
	
	public void setBorderResaltarTiposRelacionesClienteImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteImagen.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesClienteImagen .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesClienteImagen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteImagen.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesClienteImagen .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoClienteImagen() {
	//	return jCheckBoxConGraficoDinamicoClienteImagen;
	//}

	//public void setjCheckBoxConGraficoDinamicoClienteImagen(
	//		JCheckBox jCheckBoxConGraficoDinamicoClienteImagen) {
	//	this.jCheckBoxConGraficoDinamicoClienteImagen = jCheckBoxConGraficoDinamicoClienteImagen;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoClienteImagen() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarClienteImagen.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoClienteImagen .setBorder(borderResaltar);		
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
		this.clienteimagenSessionBean=new ClienteImagenSessionBean();
		
		this.clienteimagenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.clienteimagenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.clienteimagenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ClienteImagenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ClienteImagenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ClienteImagenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ClienteImagenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ClienteImagenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cliente Imagen MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
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
		
		ClienteImagenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ClienteImagen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarClienteImagen= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarClienteImagen,this.jTtoolBarClienteImagen,
							"nuevo","nuevo","Nuevo"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarClienteImagen,this.jTtoolBarClienteImagen,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarClienteImagen,this.jTtoolBarClienteImagen,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarClienteImagen,this.jTtoolBarClienteImagen,
							"duplicar","duplicar","Duplicar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarClienteImagen,this.jTtoolBarClienteImagen,
							"copiar","copiar","Copiar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarClienteImagen,this.jTtoolBarClienteImagen,
							"ver_form","ver_form","Ver"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClienteImagen,this.jTtoolBarClienteImagen,
							"recargar","recargar","Recargar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClienteImagen,this.jTtoolBarClienteImagen,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClienteImagen,this.jTtoolBarClienteImagen,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarClienteImagen,this.jTtoolBarClienteImagen,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarClienteImagen,this.jTtoolBarClienteImagen,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarClienteImagen,this.jTtoolBarClienteImagen,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarClienteImagen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarClienteImagen,this.jTtoolBarClienteImagen,
							"cerrar","cerrar","Salir"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarClienteImagen=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarClienteImagen;
			
				this.jButtonProcesarInformacionToolBarClienteImagen=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarClienteImagen;
				
		//protected JButton jButtonModificarToolBarClienteImagen;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarClienteImagen=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuClienteImagen=new JMenuMe("General");
		this.jmenuArchivoClienteImagen=new JMenuMe("Archivo");
		this.jmenuAccionesClienteImagen=new JMenuMe("Acciones");
		this.jmenuDatosClienteImagen=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoClienteImagen= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoClienteImagen.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoClienteImagen,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarClienteImagen= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarClienteImagen.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarClienteImagen,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesClienteImagen= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesClienteImagen.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesClienteImagen,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosClienteImagen= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosClienteImagen.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosClienteImagen,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarClienteImagen= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarClienteImagen.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarClienteImagen,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormClienteImagen= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormClienteImagen.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormClienteImagen,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaClienteImagen= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaClienteImagen.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaClienteImagen,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarClienteImagen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarClienteImagen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarClienteImagen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionClienteImagen= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionClienteImagen.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionClienteImagen,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionClienteImagen= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionClienteImagen.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionClienteImagen,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresClienteImagen= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresClienteImagen.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresClienteImagen,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesClienteImagen= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesClienteImagen.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesClienteImagen,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByClienteImagen= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByClienteImagen.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByClienteImagen,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarClienteImagen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarClienteImagen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarClienteImagen,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByClienteImagen= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByClienteImagen.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByClienteImagen,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarClienteImagen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarClienteImagen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarClienteImagen,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosClienteImagen= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosClienteImagen.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosClienteImagen,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoClienteImagen.add(this.jMenuItemCerrarClienteImagen);
			
			this.jmenuAccionesClienteImagen.add(this.jMenuItemNuevoClienteImagen);
			this.jmenuAccionesClienteImagen.add(this.jMenuItemNuevoGuardarCambiosClienteImagen);
			this.jmenuAccionesClienteImagen.add(this.jMenuItemNuevoRelacionesClienteImagen);
			this.jmenuAccionesClienteImagen.add(this.jMenuItemGuardarCambiosTablaClienteImagen);		
			this.jmenuAccionesClienteImagen.add(this.jMenuItemDuplicarClienteImagen);		
			this.jmenuAccionesClienteImagen.add(this.jMenuItemCopiarClienteImagen);		
			this.jmenuAccionesClienteImagen.add(this.jMenuItemVerFormClienteImagen);		
			
			this.jmenuDatosClienteImagen.add(this.jMenuItemRecargarInformacionClienteImagen);				
			this.jmenuDatosClienteImagen.add(this.jMenuItemAnterioresClienteImagen);				
			this.jmenuDatosClienteImagen.add(this.jMenuItemSiguientesClienteImagen);				
			this.jmenuDatosClienteImagen.add(this.jMenuItemAbrirOrderByClienteImagen);				
			this.jmenuDatosClienteImagen.add(this.jMenuItemMostrarOcultarClienteImagen);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesClienteImagen.add(this.jMenuItemGuardarCambiosClienteImagen);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarClienteImagen.add(this.jmenuArchivoClienteImagen);		
			this.jmenuBarClienteImagen.add(this.jmenuAccionesClienteImagen);		
			this.jmenuBarClienteImagen.add(this.jmenuDatosClienteImagen);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarClienteImagen);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasClienteImagen() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteClienteImagen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteClienteImagen.setToolTipText("Buscar Por Idcliente ");
		this.jButtonFK_IdClienteClienteImagen= new JButtonMe();
		this.jButtonFK_IdClienteClienteImagen.setText("Buscar");
		this.jButtonFK_IdClienteClienteImagen.setToolTipText("Buscar Por Idcliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteClienteImagen,"buscar_button","Buscar Por Idcliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteClienteImagen = new JLabelMe();
		jLabelid_clienteFK_IdClienteClienteImagen.setText("Idcliente :");
		jLabelid_clienteFK_IdClienteClienteImagen.setToolTipText("Idcliente");
		jLabelid_clienteFK_IdClienteClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteClienteImagen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteClienteImagen= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteClienteImagen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteClienteImagen= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteClienteImagen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteClienteImagen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteClienteImagen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteClienteImagen.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteClienteImagen.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteClienteImagen.setFocusable(false);

		this.jPanelFK_IdTipoImagenClienteImagen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoImagenClienteImagen.setToolTipText("Buscar Por Tipo Imagen ");
		this.jButtonFK_IdTipoImagenClienteImagen= new JButtonMe();
		this.jButtonFK_IdTipoImagenClienteImagen.setText("Buscar");
		this.jButtonFK_IdTipoImagenClienteImagen.setToolTipText("Buscar Por Tipo Imagen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoImagenClienteImagen,"buscar_button","Buscar Por Tipo Imagen ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoImagenClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_imagenFK_IdTipoImagenClienteImagen = new JLabelMe();
		jLabelid_tipo_imagenFK_IdTipoImagenClienteImagen.setText("Tipo Imagen :");
		jLabelid_tipo_imagenFK_IdTipoImagenClienteImagen.setToolTipText("Tipo Imagen");
		jLabelid_tipo_imagenFK_IdTipoImagenClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_imagenFK_IdTipoImagenClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_imagenFK_IdTipoImagenClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_imagenFK_IdTipoImagenClienteImagen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen= new JComboBoxMe();
		jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoImagenPersonaClienteImagen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoImagenPersonaClienteImagen.setToolTipText("Buscar Por Tipo Imagen Persona ");
		this.jButtonFK_IdTipoImagenPersonaClienteImagen= new JButtonMe();
		this.jButtonFK_IdTipoImagenPersonaClienteImagen.setText("Buscar");
		this.jButtonFK_IdTipoImagenPersonaClienteImagen.setToolTipText("Buscar Por Tipo Imagen Persona ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoImagenPersonaClienteImagen,"buscar_button","Buscar Por Tipo Imagen Persona ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoImagenPersonaClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen = new JLabelMe();
		jLabelid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.setText("Tipo Imagen Persona :");
		jLabelid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.setToolTipText("Tipo Imagen Persona");
		jLabelid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen= new JComboBoxMe();
		jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasClienteImagen=new JTabbedPane();


		this.jTabbedPaneBusquedasClienteImagen.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasClienteImagen.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasClienteImagen.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasClienteImagen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasClienteImagen,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleClienteImagen = new ClienteImagenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cliente Imagen DATOS");
			this.jInternalFrameDetalleFormClienteImagen = new ClienteImagenDetalleFormJInternalFrame(jDesktopPane,this.clienteimagenSessionBean.getConGuardarRelaciones(),this.clienteimagenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormClienteImagen = null;//new ClienteImagenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutClienteImagen= new GridBagLayout();
		
		
		this.jTableDatosClienteImagen = new JTableMe();      
		
		String sToolTipClienteImagen="";
		sToolTipClienteImagen=ClienteImagenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipClienteImagen+="(Cartera.ClienteImagen)";
		}
		
		if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
			sToolTipClienteImagen+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosClienteImagen.setToolTipText(sToolTipClienteImagen);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosClienteImagen);
		this.jTableDatosClienteImagen.setAutoCreateRowSorter(true);
		this.jTableDatosClienteImagen.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosClienteImagen.setRowSelectionAllowed(true);
		this.jTableDatosClienteImagen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosClienteImagen,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoClienteImagen = new JButtonMe();
		this.jButtonDuplicarClienteImagen = new JButtonMe();
		this.jButtonCopiarClienteImagen = new JButtonMe();
		this.jButtonVerFormClienteImagen = new JButtonMe();
		this.jButtonNuevoRelacionesClienteImagen = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaClienteImagen = new JButtonMe();
		this.jButtonCerrarClienteImagen = new JButtonMe();
		
		this.jScrollPanelDatosClienteImagen = new JScrollPane();   
        this.jScrollPanelDatosGeneralClienteImagen = new JScrollPane();
		
				
		
		
		this.jPanelAccionesClienteImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cliente Imagen";
		
		if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente Imagenes" + this.sPath));
		} else {
			this.jScrollPanelDatosClienteImagen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesClienteImagen.setToolTipText("Acciones");
        this.jPanelAccionesClienteImagen.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoClienteImagen=new ReporteDinamicoJInternalFrame(ClienteImagenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoClienteImagen();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionClienteImagen=new ImportacionJInternalFrame(ClienteImagenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionClienteImagen();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByClienteImagen = new JButtonMe();
		
		this.jButtonAbrirOrderByClienteImagen.setText("Orden");
		this.jButtonAbrirOrderByClienteImagen.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByClienteImagen,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByClienteImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByClienteImagen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClienteImagen,false,this);
			
			//this.cargarOrderByClienteImagen(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByClienteImagen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClienteImagen,true,this);
			
			//this.cargarOrderByClienteImagen(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosClienteImagen.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosClienteImagen.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosClienteImagen.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosClienteImagen.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosClienteImagen.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosClienteImagen.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoClienteImagen.setText("Nuevo");
		this.jButtonDuplicarClienteImagen.setText("Duplicar");
		this.jButtonCopiarClienteImagen.setText("Copiar");
		this.jButtonVerFormClienteImagen.setText("Ver");
		this.jButtonNuevoRelacionesClienteImagen.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaClienteImagen.setText("Guardar");
		this.jButtonCerrarClienteImagen.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoClienteImagen,"nuevo_button","Nuevo",this.clienteimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarClienteImagen,"duplicar_button","Duplicar",this.clienteimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarClienteImagen,"copiar_button","Copiar",this.clienteimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormClienteImagen,"ver_form","Ver",this.clienteimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesClienteImagen,"nuevorelaciones_button","Nuevo Rel",this.clienteimagenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaClienteImagen,"guardarcambiostabla_button","Guardar",this.clienteimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarClienteImagen,"cerrar_button","Salir",this.clienteimagenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoClienteImagen.setToolTipText("Nuevo"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarClienteImagen.setToolTipText("Duplicar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarClienteImagen.setToolTipText("Copiar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormClienteImagen.setToolTipText("Ver"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesClienteImagen.setToolTipText("Nuevo Rel"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaClienteImagen.setToolTipText("Guardar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarClienteImagen.setToolTipText("Salir"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoClienteImagen";
		inputMap = this.jButtonNuevoClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoClienteImagen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoClienteImagen"));
		
		//DUPLICAR
		sMapKey = "DuplicarClienteImagen";
		inputMap = this.jButtonDuplicarClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarClienteImagen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarClienteImagen"));
		
		//COPIAR
		sMapKey = "CopiarClienteImagen";
		inputMap = this.jButtonCopiarClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarClienteImagen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarClienteImagen"));
		
		//VEr FORM
		sMapKey = "VerFormClienteImagen";
		inputMap = this.jButtonVerFormClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormClienteImagen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormClienteImagen"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesClienteImagen";
		inputMap = this.jButtonNuevoRelacionesClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesClienteImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesClienteImagen"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarClienteImagen";
		inputMap = this.jButtonModificarClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarClienteImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarClienteImagen"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarClienteImagen";
		inputMap = this.jButtonCerrarClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarClienteImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarClienteImagen"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaClienteImagen";
		inputMap = this.jButtonGuardarCambiosTablaClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaClienteImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaClienteImagen"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesClienteImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesClienteImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionClienteImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ClienteImagen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ClienteImagen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ClienteImagen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ClienteImagen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ClienteImagen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesClienteImagen.setName("jPanelParametrosReportesClienteImagen"); 
		
		this.jPanelParametrosReportesAccionesClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesClienteImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesClienteImagen.setName("jPanelParametrosReportesAccionesClienteImagen"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesClienteImagen, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionClienteImagen = new JButtonMe();
		this.jButtonRecargarInformacionClienteImagen.setText("Recargar");
		this.jButtonRecargarInformacionClienteImagen.setToolTipText("Recargar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionClienteImagen,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionClienteImagen = new JButtonMe();
		this.jButtonProcesarInformacionClienteImagen.setText("Procesar");
		this.jButtonProcesarInformacionClienteImagen.setToolTipText("Procesar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionClienteImagen.setVisible(false);
			
		this.jButtonProcesarInformacionClienteImagen.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionClienteImagen.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionClienteImagen.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesClienteImagen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClienteImagen.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesClienteImagen.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesClienteImagen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClienteImagen.setText("TIPO");       
		this.jComboBoxTiposReportesClienteImagen.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesClienteImagen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClienteImagen.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesClienteImagen.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionClienteImagen = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionClienteImagen.setText("Paginacion");
		this.jComboBoxTiposPaginacionClienteImagen.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesClienteImagen = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesClienteImagen.setText("Accion");
		this.jComboBoxTiposRelacionesClienteImagen.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesClienteImagen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesClienteImagen.setText("Accion");
		this.jComboBoxTiposAccionesClienteImagen.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarClienteImagen = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarClienteImagen.setText("Accion");
		this.jComboBoxTiposSeleccionarClienteImagen.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralClienteImagen=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralClienteImagen.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralClienteImagen.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralClienteImagen.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesClienteImagen = new JLabelMe();
		
		this.jLabelAccionesClienteImagen.setText("Acciones");		
		this.jLabelAccionesClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosClienteImagen = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosClienteImagen.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosClienteImagen.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosClienteImagen = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosClienteImagen.setText("Seleccionados");
		this.jCheckBoxSeleccionadosClienteImagen.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaClienteImagen = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaClienteImagen.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaClienteImagen.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteClienteImagen = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteClienteImagen.setText("Graf.");
		this.jCheckBoxConGraficoReporteClienteImagen.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresClienteImagen = new JButtonMe();
		//this.jButtonAnterioresClienteImagen.setText("<<");
        this.jButtonAnterioresClienteImagen.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresClienteImagen,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesClienteImagen = new JButtonMe();
		//this.jButtonSiguientesClienteImagen.setText(">>");
        this.jButtonSiguientesClienteImagen.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesClienteImagen,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosClienteImagen = new JButtonMe();
		this.jButtonNuevoGuardarCambiosClienteImagen.setText("Nue");
        this.jButtonNuevoGuardarCambiosClienteImagen.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosClienteImagen,"nuevoguardarcambios_button","Nue",this.clienteimagenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosClienteImagen";
		inputMap = this.jButtonNuevoGuardarCambiosClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosClienteImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosClienteImagen"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionClienteImagen";
		inputMap = this.jButtonRecargarInformacionClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionClienteImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionClienteImagen"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesClienteImagen";
		inputMap = this.jButtonSiguientesClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesClienteImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesClienteImagen"));
		
		//ANTERIORES		
		sMapKey = "AnterioresClienteImagen";
		inputMap = this.jButtonAnterioresClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresClienteImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresClienteImagen"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasClienteImagen();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesClienteImagen.setMinimumSize(new Dimension(this.getWidth(),ClienteImagenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClienteImagenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesClienteImagen.setMaximumSize(new Dimension(this.getWidth(),ClienteImagenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClienteImagenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesClienteImagen.setPreferredSize(new Dimension(this.getWidth(),ClienteImagenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClienteImagenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionClienteImagen = new GridBagLayout();

			this.jPanelPaginacionClienteImagen.setLayout(gridaBagLayoutPaginacionClienteImagen);						
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.gridy = 0;
			this.gridBagConstraintsClienteImagen.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionClienteImagen.add(this.jButtonAnterioresClienteImagen, this.gridBagConstraintsClienteImagen);
					
						
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsClienteImagen.gridy = 0;
			
			this.jPanelPaginacionClienteImagen.add(this.jButtonNuevoGuardarCambiosClienteImagen, this.gridBagConstraintsClienteImagen);
						
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsClienteImagen.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsClienteImagen.gridy = 0;
			this.jPanelPaginacionClienteImagen.add(this.jButtonSiguientesClienteImagen, this.gridBagConstraintsClienteImagen);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.gridy = 1;
			this.gridBagConstraintsClienteImagen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteImagen.add(this.jButtonNuevoClienteImagen, this.gridBagConstraintsClienteImagen);
						
			
			
			if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsClienteImagen = new GridBagConstraints();
				this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsClienteImagen.gridy = 1;
				this.gridBagConstraintsClienteImagen.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionClienteImagen.add(this.jButtonGuardarCambiosTablaClienteImagen, this.gridBagConstraintsClienteImagen);
			}
			
			
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.gridy = 1;
			this.gridBagConstraintsClienteImagen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteImagen.add(this.jButtonDuplicarClienteImagen, this.gridBagConstraintsClienteImagen);
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.gridy = 1;
			this.gridBagConstraintsClienteImagen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteImagen.add(this.jButtonCopiarClienteImagen, this.gridBagConstraintsClienteImagen);
		
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.gridy = 1;
			this.gridBagConstraintsClienteImagen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteImagen.add(this.jButtonVerFormClienteImagen, this.gridBagConstraintsClienteImagen);
		
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.gridy = 1;
			this.gridBagConstraintsClienteImagen.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionClienteImagen.add(this.jButtonCerrarClienteImagen, this.gridBagConstraintsClienteImagen);
		
		
		
		this.jButtonRecargarInformacionClienteImagen.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionClienteImagen.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionClienteImagen.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesClienteImagen.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesClienteImagen.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesClienteImagen.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesClienteImagen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesClienteImagen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesClienteImagen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesClienteImagen.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesClienteImagen.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesClienteImagen.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionClienteImagen.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionClienteImagen.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionClienteImagen.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesClienteImagen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesClienteImagen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesClienteImagen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesClienteImagen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteImagen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteImagen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarClienteImagen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarClienteImagen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarClienteImagen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaClienteImagen.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaClienteImagen.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaClienteImagen.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteClienteImagen.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteClienteImagen.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteClienteImagen.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosClienteImagen.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosClienteImagen.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosClienteImagen.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosClienteImagen.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosClienteImagen.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosClienteImagen.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesClienteImagen = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesClienteImagen = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ClienteImagen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ClienteImagen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ClienteImagen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ClienteImagen = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesClienteImagen.setLayout(gridaBagParametrosReportesClienteImagen);
			this.jPanelParametrosReportesAccionesClienteImagen.setLayout(gridaBagParametrosReportesAccionesClienteImagen);
			
			
			this.jPanelParametrosAuxiliar1ClienteImagen.setLayout(gridaBagParametrosAuxiliar1ClienteImagen);
			this.jPanelParametrosAuxiliar2ClienteImagen.setLayout(gridaBagParametrosAuxiliar2ClienteImagen);
			this.jPanelParametrosAuxiliar3ClienteImagen.setLayout(gridaBagParametrosAuxiliar3ClienteImagen);
			this.jPanelParametrosAuxiliar4ClienteImagen.setLayout(gridaBagParametrosAuxiliar4ClienteImagen);
			//this.jPanelParametrosAuxiliar5ClienteImagen.setLayout(gridaBagParametrosAuxiliar2ClienteImagen);			
			
			
			
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClienteImagen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClienteImagen.add(this.jButtonRecargarInformacionClienteImagen, this.gridBagConstraintsClienteImagen);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteImagen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteImagen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClienteImagen.add(this.jComboBoxTiposPaginacionClienteImagen, this.gridBagConstraintsClienteImagen);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteImagen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteImagen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClienteImagen.add(this.jCheckBoxConAltoMaximoTablaClienteImagen, this.gridBagConstraintsClienteImagen);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteImagen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteImagen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClienteImagen.add(this.jComboBoxTiposArchivosReportesClienteImagen, this.gridBagConstraintsClienteImagen);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteImagen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteImagen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteImagen.add(this.jPanelParametrosAuxiliar1ClienteImagen, this.gridBagConstraintsClienteImagen);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClienteImagen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ClienteImagen.add(this.jComboBoxTiposReportesClienteImagen, this.gridBagConstraintsClienteImagen);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteImagen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteImagen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteImagen.add(this.jPanelParametrosAuxiliar4ClienteImagen, this.gridBagConstraintsClienteImagen);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteImagen.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteImagen.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteImagen.add(this.jComboBoxTiposReportesClienteImagen, this.gridBagConstraintsClienteImagen);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteImagen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteImagen.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClienteImagen.add(this.jCheckBoxGenerarReporteClienteImagen, this.gridBagConstraintsClienteImagen);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteImagen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteImagen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteImagen.add(this.jPanelParametrosAuxiliar2ClienteImagen, this.gridBagConstraintsClienteImagen);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClienteImagen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClienteImagen.add(this.jLabelAccionesClienteImagen, this.gridBagConstraintsClienteImagen);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsClienteImagen = new GridBagConstraints();
				this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsClienteImagen.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsClienteImagen.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesClienteImagen.add(this.jButtonAbrirOrderByClienteImagen, this.gridBagConstraintsClienteImagen);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsClienteImagen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteImagen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClienteImagen.add(this.jComboBoxTiposSeleccionarClienteImagen, this.gridBagConstraintsClienteImagen);			
			
			
			/*
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClienteImagen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClienteImagen.add(this.jCheckBoxSeleccionarTodosClienteImagen, this.gridBagConstraintsClienteImagen);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClienteImagen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ClienteImagen.add(this.jCheckBoxSeleccionarTodosClienteImagen, this.gridBagConstraintsClienteImagen);															
				
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClienteImagen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ClienteImagen.add(this.jCheckBoxSeleccionadosClienteImagen, this.gridBagConstraintsClienteImagen);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteImagen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteImagen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteImagen.add(this.jPanelParametrosAuxiliar3ClienteImagen, this.gridBagConstraintsClienteImagen);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteImagen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClienteImagen.add(this.jComboBoxTiposAccionesClienteImagen, this.gridBagConstraintsClienteImagen);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosClienteImagen = new GridBagLayout();

			this.jScrollPanelDatosClienteImagen.setLayout(gridaBagLayoutDatosClienteImagen);
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.gridy = 0;
			this.gridBagConstraintsClienteImagen.gridx = 0;
			
			this.jScrollPanelDatosClienteImagen.add(this.jTableDatosClienteImagen, this.gridBagConstraintsClienteImagen);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosClienteImagen.setViewportView(this.jTableDatosClienteImagen);
		this.jTableDatosClienteImagen.setFillsViewportHeight(true);
		this.jTableDatosClienteImagen.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesClienteImagen= new GridBagLayout();
		this.jPanelAccionesClienteImagen.setLayout(gridaBagLayoutAccionesClienteImagen);
		
		
		/*	
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteImagen.gridy = 0;
		this.gridBagConstraintsClienteImagen.gridx = 0;
			
		this.jPanelAccionesClienteImagen.add(this.jButtonNuevoClienteImagen, this.gridBagConstraintsClienteImagen);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteClienteImagen= new GridBagLayout();
		gridaBagLayoutFK_IdClienteClienteImagen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteClienteImagen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteClienteImagen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteClienteImagen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteClienteImagen.setLayout(gridaBagLayoutFK_IdClienteClienteImagen);

		gridBagConstraintsClienteImagen = new GridBagConstraints();
		gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteImagen.gridy = 0;
		gridBagConstraintsClienteImagen.gridx = 0;
		jPanelFK_IdClienteClienteImagen.add(jLabelid_clienteFK_IdClienteClienteImagen, gridBagConstraintsClienteImagen);

		gridBagConstraintsClienteImagen = new GridBagConstraints();
		gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteImagen.gridy = 0;
		gridBagConstraintsClienteImagen.gridx = 1;
		jPanelFK_IdClienteClienteImagen.add(jComboBoxid_clienteFK_IdClienteClienteImagen, gridBagConstraintsClienteImagen);


		gridBagConstraintsClienteImagen = new GridBagConstraints();
		gridBagConstraintsClienteImagen.anchor = GridBagConstraints.EAST;
		gridBagConstraintsClienteImagen.fill = GridBagConstraints.NONE;
		gridBagConstraintsClienteImagen.gridy = 0;
		gridBagConstraintsClienteImagen.gridx = 0;
		jPanelFK_IdClienteClienteImagen.add(this.jButtonBuscarFK_IdClienteid_clienteClienteImagen, gridBagConstraintsClienteImagen);

		gridBagConstraintsClienteImagen = new GridBagConstraints();
		gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteImagen.gridy = 1;
		gridBagConstraintsClienteImagen.gridx =1;
		jPanelFK_IdClienteClienteImagen.add(jButtonFK_IdClienteClienteImagen, gridBagConstraintsClienteImagen);

		jTabbedPaneBusquedasClienteImagen.addTab("1.-Por Idcliente ", jPanelFK_IdClienteClienteImagen);
		jTabbedPaneBusquedasClienteImagen.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoImagenClienteImagen= new GridBagLayout();
		gridaBagLayoutFK_IdTipoImagenClienteImagen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoImagenClienteImagen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoImagenClienteImagen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoImagenClienteImagen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoImagenClienteImagen.setLayout(gridaBagLayoutFK_IdTipoImagenClienteImagen);

		gridBagConstraintsClienteImagen = new GridBagConstraints();
		gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteImagen.gridy = 0;
		gridBagConstraintsClienteImagen.gridx = 0;
		jPanelFK_IdTipoImagenClienteImagen.add(jLabelid_tipo_imagenFK_IdTipoImagenClienteImagen, gridBagConstraintsClienteImagen);

		gridBagConstraintsClienteImagen = new GridBagConstraints();
		gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteImagen.gridy = 0;
		gridBagConstraintsClienteImagen.gridx = 1;
		jPanelFK_IdTipoImagenClienteImagen.add(jComboBoxid_tipo_imagenFK_IdTipoImagenClienteImagen, gridBagConstraintsClienteImagen);

		gridBagConstraintsClienteImagen = new GridBagConstraints();
		gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteImagen.gridy = 1;
		gridBagConstraintsClienteImagen.gridx =1;
		jPanelFK_IdTipoImagenClienteImagen.add(jButtonFK_IdTipoImagenClienteImagen, gridBagConstraintsClienteImagen);

		jTabbedPaneBusquedasClienteImagen.addTab("2.-Por Tipo Imagen ", jPanelFK_IdTipoImagenClienteImagen);
		jTabbedPaneBusquedasClienteImagen.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoImagenPersonaClienteImagen= new GridBagLayout();
		gridaBagLayoutFK_IdTipoImagenPersonaClienteImagen.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoImagenPersonaClienteImagen.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoImagenPersonaClienteImagen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoImagenPersonaClienteImagen.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoImagenPersonaClienteImagen.setLayout(gridaBagLayoutFK_IdTipoImagenPersonaClienteImagen);

		gridBagConstraintsClienteImagen = new GridBagConstraints();
		gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteImagen.gridy = 0;
		gridBagConstraintsClienteImagen.gridx = 0;
		jPanelFK_IdTipoImagenPersonaClienteImagen.add(jLabelid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen, gridBagConstraintsClienteImagen);

		gridBagConstraintsClienteImagen = new GridBagConstraints();
		gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteImagen.gridy = 0;
		gridBagConstraintsClienteImagen.gridx = 1;
		jPanelFK_IdTipoImagenPersonaClienteImagen.add(jComboBoxid_tipo_imagen_personaFK_IdTipoImagenPersonaClienteImagen, gridBagConstraintsClienteImagen);

		gridBagConstraintsClienteImagen = new GridBagConstraints();
		gridBagConstraintsClienteImagen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteImagen.gridy = 1;
		gridBagConstraintsClienteImagen.gridx =1;
		jPanelFK_IdTipoImagenPersonaClienteImagen.add(jButtonFK_IdTipoImagenPersonaClienteImagen, gridBagConstraintsClienteImagen);

		jTabbedPaneBusquedasClienteImagen.addTab("3.-Por Tipo Imagen Persona ", jPanelFK_IdTipoImagenPersonaClienteImagen);
		jTabbedPaneBusquedasClienteImagen.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutClienteImagen = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutClienteImagen);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.clienteimagenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();						
			this.gridBagConstraintsClienteImagen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClienteImagen.gridx = 0;		
			//this.gridBagConstraintsClienteImagen.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsClienteImagen.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarClienteImagen, this.gridBagConstraintsClienteImagen);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy = iGridyPrincipal++;
		this.gridBagConstraintsClienteImagen.gridx = 0;		
		//this.gridBagConstraintsClienteImagen.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsClienteImagen.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsClienteImagen);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsClienteImagen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClienteImagen.gridx = 0;		
			this.gridBagConstraintsClienteImagen.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsClienteImagen.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasClienteImagen, this.gridBagConstraintsClienteImagen);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteImagen.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesClienteImagen, this.gridBagConstraintsClienteImagen);								
		
		
		/*
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteImagen.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesClienteImagen, this.gridBagConstraintsClienteImagen);
		*/		
		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy =iGridyPrincipal++;
		this.gridBagConstraintsClienteImagen.gridx =0;
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsClienteImagen.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosClienteImagen, this.gridBagConstraintsClienteImagen);
				
		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteImagen.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionClienteImagen, this.gridBagConstraintsClienteImagen);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ClienteImagenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosClienteImagen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosClienteImagen = new GridBagLayout();
			this.jPanelBusquedasParametrosClienteImagen.setLayout(gridaBagLayoutBusquedasParametrosClienteImagen);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralClienteImagen=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralClienteImagen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteImagen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteImagen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteImagen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposClienteImagen, this.gridBagConstraintsClienteImagen);
			
			
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteImagen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosClienteImagen, this.gridBagConstraintsClienteImagen);
		
			
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsClienteImagen.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesClienteImagen, this.gridBagConstraintsClienteImagen);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralClienteImagen;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoClienteImagen() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoClienteImagen = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoClienteImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoClienteImagen.setName("jPanelReporteDinamicoClienteImagen"); 
		
		this.jPanelReporteDinamicoClienteImagen.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoClienteImagen.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoClienteImagen.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoClienteImagen.setLayout(gridaBagLayoutReporteDinamicoClienteImagen);
		
		
		this.jInternalFrameReporteDinamicoClienteImagen= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoClienteImagen = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteClienteImagen= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoClienteImagen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoClienteImagen.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoClienteImagen.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoClienteImagen.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoClienteImagen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoClienteImagen.setResizable(true);
	    this.jInternalFrameReporteDinamicoClienteImagen.setClosable(true);
	    this.jInternalFrameReporteDinamicoClienteImagen.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoClienteImagen.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoClienteImagen.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoClienteImagen.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente Imagenes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteClienteImagen = new JLabelMe();

		this.jLabelColumnasSelectReporteClienteImagen.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteImagen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteImagen.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoClienteImagen.add(this.jLabelColumnasSelectReporteClienteImagen, this.gridBagConstraintsClienteImagen);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteClienteImagen = new JList<Reporte>();
		this.jListColumnasSelectReporteClienteImagen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteClienteImagen.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteClienteImagen.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteClienteImagen.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteClienteImagen.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteClienteImagen=new JScrollPane(this.jListColumnasSelectReporteClienteImagen);
			
			this.jScrollColumnasSelectReporteClienteImagen.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteClienteImagen.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteClienteImagen.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteImagen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteImagen.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoClienteImagen.add(this.jListColumnasSelectReporteClienteImagen, this.gridBagConstraintsClienteImagen);
		this.jPanelReporteDinamicoClienteImagen.add(this.jScrollColumnasSelectReporteClienteImagen, this.gridBagConstraintsClienteImagen);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteClienteImagen = new JLabelMe();

		this.jLabelRelacionesSelectReporteClienteImagen.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteClienteImagen = new JList<Reporte>();
		this.jListRelacionesSelectReporteClienteImagen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteClienteImagen.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteClienteImagen.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteClienteImagen.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteClienteImagen.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteClienteImagen=new JScrollPane(this.jListRelacionesSelectReporteClienteImagen);
			
			this.jScrollRelacionesSelectReporteClienteImagen.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteClienteImagen.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteClienteImagen.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoClienteImagen = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoClienteImagen = new JComboBoxMe();
		this.jListColumnasValoresGraficoClienteImagen = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoClienteImagen = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoClienteImagen.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoClienteImagen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoClienteImagen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoClienteImagen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoClienteImagen = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoClienteImagen.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoClienteImagen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoClienteImagen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoClienteImagen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoClienteImagen = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoClienteImagen.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteImagen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteImagen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClienteImagen.add(this.jLabelGenerarExcelReporteDinamicoClienteImagen, this.gridBagConstraintsClienteImagen);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoClienteImagen = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoClienteImagen.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoClienteImagen,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoClienteImagen.setToolTipText("Generar EXCEL"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		//this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsClienteImagen.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsClienteImagen.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoClienteImagen.add(this.jButtonGenerarExcelReporteDinamicoClienteImagen, this.gridBagConstraintsClienteImagen);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteImagen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteImagen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteImagen.add(this.jComboBoxTiposReportesDinamicoClienteImagen, this.gridBagConstraintsClienteImagen);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoClienteImagen = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoClienteImagen.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteImagen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteImagen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClienteImagen.add(this.jLabelTiposArchivoReporteDinamicoClienteImagen, this.gridBagConstraintsClienteImagen);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteImagen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteImagen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteImagen.add(this.jComboBoxTiposArchivosReportesDinamicoClienteImagen, this.gridBagConstraintsClienteImagen);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoClienteImagen = new JButtonMe();
		this.jButtonGenerarReporteDinamicoClienteImagen.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoClienteImagen,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoClienteImagen.setToolTipText("Generar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteImagen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteImagen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteImagen.add(this.jButtonGenerarReporteDinamicoClienteImagen, this.gridBagConstraintsClienteImagen);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoClienteImagen = new JButtonMe();
		this.jButtonCerrarReporteDinamicoClienteImagen.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoClienteImagen,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoClienteImagen.setToolTipText("Cancelar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteImagen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteImagen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteImagen.add(this.jButtonCerrarReporteDinamicoClienteImagen, this.gridBagConstraintsClienteImagen);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalClienteImagen = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoClienteImagen= new JScrollPane(jPanelReporteDinamicoClienteImagen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoClienteImagen.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoClienteImagen.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoClienteImagen.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente Imagenes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsClienteImagen.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoClienteImagen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoClienteImagen.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalClienteImagen);
		this.jInternalFrameReporteDinamicoClienteImagen.getContentPane().add(this.jScrollPanelReporteDinamicoClienteImagen, this.gridBagConstraintsClienteImagen);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionClienteImagen() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionClienteImagen = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionClienteImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionClienteImagen.setName("jPanelImportacionClienteImagen"); 
		
		this.jPanelImportacionClienteImagen.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionClienteImagen.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionClienteImagen.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionClienteImagen.setLayout(gridaBagLayoutImportacionClienteImagen);
		
		
		this.jInternalFrameImportacionClienteImagen= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionClienteImagen= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionClienteImagen = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteClienteImagen= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionClienteImagen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionClienteImagen.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionClienteImagen.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionClienteImagen.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionClienteImagen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionClienteImagen.setResizable(true);
	    this.jInternalFrameImportacionClienteImagen.setClosable(true);
	    this.jInternalFrameImportacionClienteImagen.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionClienteImagen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionClienteImagen.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionClienteImagen.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionClienteImagen.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionClienteImagen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionClienteImagen.setResizable(true);
	    this.jInternalFrameImportacionClienteImagen.setClosable(true);
	    this.jInternalFrameImportacionClienteImagen.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionClienteImagen.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionClienteImagen.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionClienteImagen.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente Imagenes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionClienteImagen = new JLabelMe();

		this.jLabelArchivoImportacionClienteImagen.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteImagen.gridy = iPosYImportacion;		
		this.gridBagConstraintsClienteImagen.gridx = iPosXImportacion++;
			
		this.jPanelImportacionClienteImagen.add(this.jLabelArchivoImportacionClienteImagen, this.gridBagConstraintsClienteImagen);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionClienteImagen = new JFileChooser();		
		this.jFileChooserImportacionClienteImagen.setToolTipText("ESCOGER ARCHIVO"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionClienteImagen = new JButtonMe();
		this.jButtonAbrirImportacionClienteImagen.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionClienteImagen,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionClienteImagen.setToolTipText("Generar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteImagen.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteImagen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteImagen.add(this.jButtonAbrirImportacionClienteImagen, this.gridBagConstraintsClienteImagen);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionClienteImagen = new JLabelMe();

		this.jLabelPathArchivoImportacionClienteImagen.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionClienteImagen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionClienteImagen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionClienteImagen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteImagen.gridy = iPosYImportacion;		
		this.gridBagConstraintsClienteImagen.gridx = iPosXImportacion++;
			
		this.jPanelImportacionClienteImagen.add(this.jLabelPathArchivoImportacionClienteImagen, this.gridBagConstraintsClienteImagen);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionClienteImagen=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionClienteImagen.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionClienteImagen.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionClienteImagen.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteImagen.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteImagen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteImagen.add(this.jTextFieldPathArchivoImportacionClienteImagen, this.gridBagConstraintsClienteImagen);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionClienteImagen = new JButtonMe();
		this.jButtonGenerarImportacionClienteImagen.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionClienteImagen,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionClienteImagen.setToolTipText("Generar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteImagen.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteImagen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteImagen.add(this.jButtonGenerarImportacionClienteImagen, this.gridBagConstraintsClienteImagen);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionClienteImagen = new JButtonMe();
		this.jButtonCerrarImportacionClienteImagen.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionClienteImagen,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionClienteImagen.setToolTipText("Cancelar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteImagen.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteImagen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteImagen.add(this.jButtonCerrarImportacionClienteImagen, this.gridBagConstraintsClienteImagen);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalClienteImagen = new GridBagLayout();
		
		this.jScrollPanelImportacionClienteImagen= new JScrollPane(jPanelImportacionClienteImagen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsClienteImagen = new GridBagConstraints();
		this.gridBagConstraintsClienteImagen.gridy =iPosYImportacion;
		this.gridBagConstraintsClienteImagen.gridx =iPosXImportacion;
		this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionClienteImagen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionClienteImagen.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalClienteImagen);
		this.jInternalFrameImportacionClienteImagen.getContentPane().add(this.jScrollPanelImportacionClienteImagen, this.gridBagConstraintsClienteImagen);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByClienteImagen(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByClienteImagen = new JButtonMe();
			this.jButtonAbrirOrderByClienteImagen.setText("Orden");
			this.jButtonAbrirOrderByClienteImagen.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByClienteImagen,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByClienteImagen";
			inputMap = this.jButtonAbrirOrderByClienteImagen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByClienteImagen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByClienteImagen"));
		
		
			GridBagLayout gridaBagLayoutOrderByClienteImagen = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByClienteImagen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByClienteImagen.setName("jPanelOrderByClienteImagen"); 
			
			this.jPanelOrderByClienteImagen.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByClienteImagen.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByClienteImagen.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByClienteImagen.setLayout(gridaBagLayoutOrderByClienteImagen);
			
			
			this.jTableDatosClienteImagenOrderBy = new JTableMe();        
			this.jTableDatosClienteImagenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosClienteImagenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosClienteImagenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosClienteImagenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosClienteImagenOrderBy.setViewportView(this.jTableDatosClienteImagenOrderBy);
			this.jTableDatosClienteImagenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosClienteImagenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByClienteImagen= new OrderByJInternalFrame();
			this.jInternalFrameOrderByClienteImagen= new OrderByJInternalFrame();
			this.jScrollPanelOrderByClienteImagen = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteClienteImagen= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByClienteImagen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByClienteImagen.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByClienteImagen.setTitle("Orden");
			this.jInternalFrameOrderByClienteImagen.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByClienteImagen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByClienteImagen.setResizable(true);
			this.jInternalFrameOrderByClienteImagen.setClosable(true);
			this.jInternalFrameOrderByClienteImagen.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByClienteImagen.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByClienteImagen.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByClienteImagen.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByClienteImagen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente Imagenes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.gridy =iPosYOrderBy++;
			this.gridBagConstraintsClienteImagen.gridx =iPosXOrderBy;
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsClienteImagen.ipady =150;
				
			this.jPanelOrderByClienteImagen.add(jScrollPanelDatosClienteImagenOrderBy, this.gridBagConstraintsClienteImagen);//this.jTableDatosClienteImagenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByClienteImagen = new JButtonMe();
			this.jButtonCerrarOrderByClienteImagen.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByClienteImagen,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByClienteImagen.setToolTipText("Cancelar"+" "+ClienteImagenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByClienteImagen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteImagen.gridy = iPosYOrderBy++;
			this.gridBagConstraintsClienteImagen.gridx = iPosXOrderBy;
									
			this.jPanelOrderByClienteImagen.add(this.jButtonCerrarOrderByClienteImagen, this.gridBagConstraintsClienteImagen);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalClienteImagen = new GridBagLayout();
			
			this.jScrollPanelOrderByClienteImagen= new JScrollPane(jPanelOrderByClienteImagen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsClienteImagen = new GridBagConstraints();
			this.gridBagConstraintsClienteImagen.gridy =iPosYOrderBy;
			this.gridBagConstraintsClienteImagen.gridx =iPosXOrderBy;
			this.gridBagConstraintsClienteImagen.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByClienteImagen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByClienteImagen.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalClienteImagen);
			
			this.jInternalFrameOrderByClienteImagen.getContentPane().add(this.jScrollPanelOrderByClienteImagen, this.gridBagConstraintsClienteImagen);			
		
		} else {
			this.jButtonAbrirOrderByClienteImagen = new JButtonMe();
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
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.clienteimagenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosClienteImagen.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosClienteImagen.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosClienteImagen.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosClienteImagen.getRowHeight();//ClienteImagenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ClienteImagenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaClienteImagen.isSelected()) {
					iHeightTable=ClienteImagenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ClienteImagenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ClienteImagenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ClienteImagenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaClienteImagen.isSelected()) {
					iHeightTable=ClienteImagenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ClienteImagenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ClienteImagenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosClienteImagen.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosClienteImagen.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosClienteImagen.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosClienteImagen.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosClienteImagen.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosClienteImagen.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByClienteImagen!=null && this.jInternalFrameOrderByClienteImagen.getjTableDatosOrderBy()!=null) {
			//if(!this.clienteimagenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByClienteImagen.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByClienteImagen.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByClienteImagen.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByClienteImagen.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByClienteImagen.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByClienteImagen.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByClienteImagen.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosClienteImagen.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosClienteImagen.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosClienteImagen.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=clienteimagenLogic.getClienteImagens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=clienteimagens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ClienteImagen> TraerClienteImagenBeans(List<ClienteImagen> clienteimagens,ArrayList<Classe> classes)throws Exception {
		try {
			for(ClienteImagen clienteimagen:clienteimagens) {
					
				if(!(ClienteImagenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ClienteImagenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					clienteimagen.setsDetalleGeneralEntityReporte(ClienteImagenConstantesFunciones.getClienteImagenDescripcion(clienteimagen));
										
						
					
						
					
				} else  {
							
					//clienteimagen.setsDetalleGeneralEntityReporte(clienteimagen.getsDetalleGeneralEntityReporte());
										
				}
				
				//clienteimagenbeans.add(clienteimagenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return clienteimagens;
    }
	//PARA REPORTES FIN
}
