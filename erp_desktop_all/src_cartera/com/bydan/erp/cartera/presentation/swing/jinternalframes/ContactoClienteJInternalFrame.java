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
import com.bydan.erp.cartera.util.ContactoClienteConstantesFunciones;

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


@SuppressWarnings("unused")
public class ContactoClienteJInternalFrame extends ContactoClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarContactoCliente;
	
	protected JMenuBar jmenuBarContactoCliente;
	
	protected JMenu jmenuContactoCliente;
	protected JMenu jmenuDatosContactoCliente;
	protected JMenu jmenuArchivoContactoCliente;
	protected JMenu jmenuAccionesContactoCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosContactoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutContactoCliente;	
	protected GridBagConstraints gridBagConstraintsContactoCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ContactoClienteDetalleFormJInternalFrame jInternalFrameDetalleFormContactoCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoContactoCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionContactoCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public ContactoClienteSessionBean contactoclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ContactoCliente> contactoclientes;		
	public List<ContactoCliente> contactoclientesEliminados;	
	public List<ContactoCliente> contactoclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByContactoCliente;		
	protected JButton jButtonAbrirOrderByContactoCliente;
	
	
	//protected JPanel jPanelOrderByContactoCliente;
	//public JScrollPane jScrollPanelOrderByContactoCliente;	
	//protected JButton jButtonCerrarOrderByContactoCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ContactoClienteLogic contactoclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosContactoCliente;
	public JScrollPane jScrollPanelDatosEdicionContactoCliente;
	public JScrollPane jScrollPanelDatosGeneralContactoCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosContactoClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoContactoCliente;
	//public JScrollPane jScrollPanelImportacionContactoCliente;
	
	
	
	protected JPanel jPanelAccionesContactoCliente;
	
    protected JPanel jPanelPaginacionContactoCliente;
    protected JPanel jPanelParametrosReportesContactoCliente;
	protected JPanel jPanelParametrosReportesAccionesContactoCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ContactoCliente;
	protected JPanel jPanelParametrosAuxiliar2ContactoCliente;
	protected JPanel jPanelParametrosAuxiliar3ContactoCliente;
	protected JPanel jPanelParametrosAuxiliar4ContactoCliente;
	//protected JPanel jPanelParametrosAuxiliar5ContactoCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoContactoCliente;
	//protected JPanel jPanelImportacionContactoCliente;
	
	
	public JTable jTableDatosContactoCliente;
	
	
	
	//public JTable jTableDatosContactoClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoContactoCliente;
	protected JButton jButtonDuplicarContactoCliente;
	protected JButton jButtonCopiarContactoCliente;
	protected JButton jButtonVerFormContactoCliente;
	protected JButton jButtonNuevoRelacionesContactoCliente;
	protected JButton jButtonModificarContactoCliente;
	
    protected JButton jButtonGuardarCambiosTablaContactoCliente;
	protected JButton jButtonCerrarContactoCliente;
	
	
	protected JButton jButtonRecargarInformacionContactoCliente;
	protected JButton jButtonProcesarInformacionContactoCliente;
	
	
	protected JButton jButtonAnterioresContactoCliente;
	protected JButton jButtonSiguientesContactoCliente;
	protected JButton jButtonNuevoGuardarCambiosContactoCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoContactoCliente;
	//protected JButton jButtonCerrarReporteDinamicoContactoCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoContactoCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionContactoCliente;
	//protected JButton jButtonGenerarImportacionContactoCliente;
	//protected JButton jButtonCerrarImportacionContactoCliente;
	//protected JFileChooser jFileChooserImportacionContactoCliente;
	//protected File fileImportacionContactoCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarContactoCliente;
	protected JButton jButtonDuplicarToolBarContactoCliente;
	protected JButton jButtonNuevoRelacionesToolBarContactoCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarContactoCliente;
	protected JButton jButtonCopiarToolBarContactoCliente;
	protected JButton jButtonVerFormToolBarContactoCliente;
	public JButton jButtonGuardarCambiosTablaToolBarContactoCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarContactoCliente;
	protected JButton jButtonCerrarToolBarContactoCliente;
	
	protected JButton jButtonRecargarInformacionToolBarContactoCliente;
	protected JButton jButtonProcesarInformacionToolBarContactoCliente;
	protected JButton jButtonAnterioresToolBarContactoCliente;
	protected JButton jButtonSiguientesToolBarContactoCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarContactoCliente;
	protected JButton jButtonAbrirOrderByToolBarContactoCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoContactoCliente;
	protected JMenuItem jMenuItemDuplicarContactoCliente;
	protected JMenuItem jMenuItemNuevoRelacionesContactoCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosContactoCliente;
	protected JMenuItem jMenuItemCopiarContactoCliente;
	protected JMenuItem jMenuItemVerFormContactoCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaContactoCliente;
	protected JMenuItem jMenuItemCerrarContactoCliente;
	protected JMenuItem jMenuItemDetalleCerrarContactoCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByContactoCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarContactoCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionContactoCliente;
	protected JMenuItem jMenuItemProcesarInformacionContactoCliente;
	protected JMenuItem jMenuItemAnterioresContactoCliente;
	protected JMenuItem jMenuItemSiguientesContactoCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosContactoCliente;
	protected JMenuItem jMenuItemAbrirOrderByContactoCliente;
	protected JMenuItem jMenuItemMostrarOcultarContactoCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesContactoCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosContactoCliente;
	protected JCheckBox jCheckBoxSeleccionadosContactoCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaContactoCliente;
	protected JCheckBox jCheckBoxConGraficoReporteContactoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesContactoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesContactoCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoContactoCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoContactoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesContactoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionContactoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesContactoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesContactoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarContactoCliente;
	protected JTextField jTextFieldValorCampoGeneralContactoCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteContactoCliente;
	//public JList<Reporte> jListColumnasSelectReporteContactoCliente;
	//public JScrollPane jScrollColumnasSelectReporteContactoCliente;
	
	//public JLabel jLabelRelacionesSelectReporteContactoCliente;
	//public JList<Reporte> jListRelacionesSelectReporteContactoCliente;
	//public JScrollPane jScrollRelacionesSelectReporteContactoCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoContactoCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoContactoCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoContactoCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoContactoCliente;
	
		
	//public JLabel jLabelArchivoImportacionContactoCliente;	
	//public JLabel jLabelPathArchivoImportacionContactoCliente;
	//protected JTextField jTextFieldPathArchivoImportacionContactoCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoContactoCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoContactoCliente;
	
	//public JLabel jLabelColumnaCategoriaValorContactoCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorContactoCliente;
	
	//public JLabel jLabelColumnasValoresGraficoContactoCliente;
	//public JList<Reporte> jListColumnasValoresGraficoContactoCliente;
	//public JScrollPane jScrollColumnasValoresGraficoContactoCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoContactoCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoContactoCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasContactoCliente;
	public JPanel jPanelFK_IdClienteContactoCliente;
	public JButton jButtonFK_IdClienteContactoCliente;
	
	public JPanel jPanelid_clienteFK_IdClienteContactoCliente;
	public JLabel jLabelid_clienteFK_IdClienteContactoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteContactoCliente;
	public JButton jButtonid_clienteFK_IdClienteContactoCliente= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteContactoClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteContactoClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteContactoCliente;
	
	
	
	
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
	//public int iHeightFormulario=1122;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ContactoClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ContactoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContactoClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ContactoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContactoClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ContactoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContactoClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ContactoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionContactoCliente)	{
		this.jButtonRecargarInformacionContactoCliente = jButtonRecargarInformacionContactoCliente;
	}
	
	public JButton getjButtonProcesarInformacionContactoCliente() {
		return this.jButtonProcesarInformacionContactoCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionContactoCliente)	{
		this.jButtonProcesarInformacionContactoCliente = jButtonProcesarInformacionContactoCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionContactoCliente() {
		return this.jButtonRecargarInformacionContactoCliente;
	}
	
	
	public List<ContactoCliente> getcontactoclientes() {
		return this.contactoclientes;
	}

	public void setcontactoclientes(List<ContactoCliente> contactoclientes) {
		this.contactoclientes = contactoclientes;
	}
	
	public List<ContactoCliente> getcontactoclientesAux() {
		return this.contactoclientesAux;
	}

	public void setcontactoclientesAux(List<ContactoCliente> contactoclientesAux) {
		this.contactoclientesAux = contactoclientesAux;
	}
	
	public List<ContactoCliente> getcontactoclientesEliminados() {
		return this.contactoclientesEliminados;
	}

	public void setContactoClientesEliminados(List<ContactoCliente> contactoclientesEliminados) {
		this.contactoclientesEliminados = contactoclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarContactoCliente() {
		return jComboBoxTiposSeleccionarContactoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarContactoCliente(
			JComboBox jComboBoxTiposSeleccionarContactoCliente) {
		this.jComboBoxTiposSeleccionarContactoCliente = jComboBoxTiposSeleccionarContactoCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarContactoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarContactoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarContactoCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralContactoCliente() {
		return jTextFieldValorCampoGeneralContactoCliente;
	}

	public void setjTextFieldValorCampoGeneralContactoCliente(
			JTextField jTextFieldValorCampoGeneralContactoCliente) {
		this.jTextFieldValorCampoGeneralContactoCliente = jTextFieldValorCampoGeneralContactoCliente;
	}

	public void setBorderResaltarValorCampoGeneralContactoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContactoCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralContactoCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosContactoCliente() {
		return this.jCheckBoxSeleccionarTodosContactoCliente;
	}

	public void setjCheckBoxSeleccionarTodosContactoCliente(
			JCheckBox jCheckBoxSeleccionarTodosContactoCliente) {
		this.jCheckBoxSeleccionarTodosContactoCliente = jCheckBoxSeleccionarTodosContactoCliente;
	}

	public void setBorderResaltarSeleccionarTodosContactoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContactoCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosContactoCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosContactoCliente() {
		return this.jCheckBoxSeleccionadosContactoCliente;
	}

	public void setjCheckBoxSeleccionadosContactoCliente(
			JCheckBox jCheckBoxSeleccionadosContactoCliente) {
		this.jCheckBoxSeleccionadosContactoCliente = jCheckBoxSeleccionadosContactoCliente;
	}
	
	public void setBorderResaltarSeleccionadosContactoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContactoCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosContactoCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesContactoCliente() {
		return this.jComboBoxTiposArchivosReportesContactoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesContactoCliente(
			JComboBox jComboBoxTiposArchivosReportesContactoCliente) {
		this.jComboBoxTiposArchivosReportesContactoCliente = jComboBoxTiposArchivosReportesContactoCliente;
	}

	public void setBorderResaltarTiposArchivosReportesContactoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContactoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesContactoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesContactoCliente() {
		return this.jComboBoxTiposReportesContactoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesContactoCliente(
			JComboBox jComboBoxTiposReportesContactoCliente) {
		this.jComboBoxTiposReportesContactoCliente = jComboBoxTiposReportesContactoCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoContactoCliente() {
	//	return jComboBoxTiposReportesDinamicoContactoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoContactoCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoContactoCliente) {
	//	this.jComboBoxTiposReportesDinamicoContactoCliente = jComboBoxTiposReportesDinamicoContactoCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoContactoCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoContactoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoContactoCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoContactoCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoContactoCliente = jComboBoxTiposArchivosReportesDinamicoContactoCliente;
	//}
	
	public void setBorderResaltarTiposReportesContactoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContactoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesContactoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesContactoCliente() {
		return this.jComboBoxTiposGraficosReportesContactoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesContactoCliente(
			JComboBox jComboBoxTiposGraficosReportesContactoCliente) {
		this.jComboBoxTiposGraficosReportesContactoCliente = jComboBoxTiposGraficosReportesContactoCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesContactoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContactoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesContactoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionContactoCliente() {
		return this.jComboBoxTiposPaginacionContactoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionContactoCliente(
			JComboBox jComboBoxTiposPaginacionContactoCliente) {
		this.jComboBoxTiposPaginacionContactoCliente = jComboBoxTiposPaginacionContactoCliente;
	}
	
	public void setBorderResaltarTiposPaginacionContactoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContactoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionContactoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesContactoCliente() {
		return this.jComboBoxTiposRelacionesContactoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesContactoCliente() {
		return this.jComboBoxTiposAccionesContactoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesContactoCliente(
			JComboBox jComboBoxTiposRelacionesContactoCliente) {
		this.jComboBoxTiposRelacionesContactoCliente = jComboBoxTiposRelacionesContactoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesContactoCliente(
			JComboBox jComboBoxTiposAccionesContactoCliente) {
		this.jComboBoxTiposAccionesContactoCliente = jComboBoxTiposAccionesContactoCliente;
	}
	
	public void setBorderResaltarTiposRelacionesContactoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContactoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesContactoCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesContactoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarContactoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesContactoCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoContactoCliente() {
	//	return jCheckBoxConGraficoDinamicoContactoCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoContactoCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoContactoCliente) {
	//	this.jCheckBoxConGraficoDinamicoContactoCliente = jCheckBoxConGraficoDinamicoContactoCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoContactoCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarContactoCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoContactoCliente .setBorder(borderResaltar);		
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
		this.contactoclienteSessionBean=new ContactoClienteSessionBean();
		
		this.contactoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.contactoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.contactoclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ContactoClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ContactoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ContactoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ContactoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ContactoClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Contacto Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		ContactoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ContactoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarContactoCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarContactoCliente,this.jTtoolBarContactoCliente,
							"nuevo","nuevo","Nuevo"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarContactoCliente,this.jTtoolBarContactoCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarContactoCliente,this.jTtoolBarContactoCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarContactoCliente,this.jTtoolBarContactoCliente,
							"duplicar","duplicar","Duplicar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarContactoCliente,this.jTtoolBarContactoCliente,
							"copiar","copiar","Copiar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarContactoCliente,this.jTtoolBarContactoCliente,
							"ver_form","ver_form","Ver"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarContactoCliente,this.jTtoolBarContactoCliente,
							"recargar","recargar","Recargar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarContactoCliente,this.jTtoolBarContactoCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarContactoCliente,this.jTtoolBarContactoCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarContactoCliente,this.jTtoolBarContactoCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarContactoCliente,this.jTtoolBarContactoCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarContactoCliente,this.jTtoolBarContactoCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarContactoCliente,this.jTtoolBarContactoCliente,
							"cerrar","cerrar","Salir"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarContactoCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarContactoCliente;
			
				this.jButtonProcesarInformacionToolBarContactoCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarContactoCliente;
				
		//protected JButton jButtonModificarToolBarContactoCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarContactoCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuContactoCliente=new JMenuMe("General");
		this.jmenuArchivoContactoCliente=new JMenuMe("Archivo");
		this.jmenuAccionesContactoCliente=new JMenuMe("Acciones");
		this.jmenuDatosContactoCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoContactoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoContactoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoContactoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarContactoCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarContactoCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarContactoCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesContactoCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesContactoCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesContactoCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosContactoCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosContactoCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosContactoCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarContactoCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarContactoCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarContactoCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormContactoCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormContactoCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormContactoCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaContactoCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaContactoCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaContactoCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarContactoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarContactoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarContactoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionContactoCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionContactoCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionContactoCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionContactoCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionContactoCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionContactoCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresContactoCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresContactoCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresContactoCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesContactoCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesContactoCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesContactoCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByContactoCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByContactoCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByContactoCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarContactoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarContactoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarContactoCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByContactoCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByContactoCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByContactoCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarContactoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarContactoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarContactoCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosContactoCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosContactoCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosContactoCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoContactoCliente.add(this.jMenuItemCerrarContactoCliente);
			
			this.jmenuAccionesContactoCliente.add(this.jMenuItemNuevoContactoCliente);
			this.jmenuAccionesContactoCliente.add(this.jMenuItemNuevoGuardarCambiosContactoCliente);
			this.jmenuAccionesContactoCliente.add(this.jMenuItemNuevoRelacionesContactoCliente);
			this.jmenuAccionesContactoCliente.add(this.jMenuItemGuardarCambiosTablaContactoCliente);		
			this.jmenuAccionesContactoCliente.add(this.jMenuItemDuplicarContactoCliente);		
			this.jmenuAccionesContactoCliente.add(this.jMenuItemCopiarContactoCliente);		
			this.jmenuAccionesContactoCliente.add(this.jMenuItemVerFormContactoCliente);		
			
			this.jmenuDatosContactoCliente.add(this.jMenuItemRecargarInformacionContactoCliente);				
			this.jmenuDatosContactoCliente.add(this.jMenuItemAnterioresContactoCliente);				
			this.jmenuDatosContactoCliente.add(this.jMenuItemSiguientesContactoCliente);				
			this.jmenuDatosContactoCliente.add(this.jMenuItemAbrirOrderByContactoCliente);				
			this.jmenuDatosContactoCliente.add(this.jMenuItemMostrarOcultarContactoCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesContactoCliente.add(this.jMenuItemGuardarCambiosContactoCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarContactoCliente.add(this.jmenuArchivoContactoCliente);		
			this.jmenuBarContactoCliente.add(this.jmenuAccionesContactoCliente);		
			this.jmenuBarContactoCliente.add(this.jmenuDatosContactoCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarContactoCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasContactoCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteContactoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteContactoCliente.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteContactoCliente= new JButtonMe();
		this.jButtonFK_IdClienteContactoCliente.setText("Buscar");
		this.jButtonFK_IdClienteContactoCliente.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteContactoCliente,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteContactoCliente = new JLabelMe();
		jLabelid_clienteFK_IdClienteContactoCliente.setText("Cliente :");
		jLabelid_clienteFK_IdClienteContactoCliente.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteContactoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteContactoCliente= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteContactoCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteContactoCliente= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteContactoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteContactoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteContactoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteContactoCliente.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteContactoCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteContactoCliente.setFocusable(false);


		this.jTabbedPaneBusquedasContactoCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasContactoCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasContactoCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasContactoCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasContactoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasContactoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleContactoCliente = new ContactoClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Contacto Cliente DATOS");
			this.jInternalFrameDetalleFormContactoCliente = new ContactoClienteDetalleFormJInternalFrame(jDesktopPane,this.contactoclienteSessionBean.getConGuardarRelaciones(),this.contactoclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormContactoCliente = null;//new ContactoClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutContactoCliente= new GridBagLayout();
		
		
		this.jTableDatosContactoCliente = new JTableMe();      
		
		String sToolTipContactoCliente="";
		sToolTipContactoCliente=ContactoClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipContactoCliente+="(Cartera.ContactoCliente)";
		}
		
		if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipContactoCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosContactoCliente.setToolTipText(sToolTipContactoCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosContactoCliente);
		this.jTableDatosContactoCliente.setAutoCreateRowSorter(true);
		this.jTableDatosContactoCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosContactoCliente.setRowSelectionAllowed(true);
		this.jTableDatosContactoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosContactoCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoContactoCliente = new JButtonMe();
		this.jButtonDuplicarContactoCliente = new JButtonMe();
		this.jButtonCopiarContactoCliente = new JButtonMe();
		this.jButtonVerFormContactoCliente = new JButtonMe();
		this.jButtonNuevoRelacionesContactoCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaContactoCliente = new JButtonMe();
		this.jButtonCerrarContactoCliente = new JButtonMe();
		
		this.jScrollPanelDatosContactoCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralContactoCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesContactoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Contacto Cliente";
		
		if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contacto Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosContactoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesContactoCliente.setToolTipText("Acciones");
        this.jPanelAccionesContactoCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoContactoCliente=new ReporteDinamicoJInternalFrame(ContactoClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoContactoCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionContactoCliente=new ImportacionJInternalFrame(ContactoClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionContactoCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByContactoCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByContactoCliente.setText("Orden");
		this.jButtonAbrirOrderByContactoCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByContactoCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByContactoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByContactoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContactoCliente,false,this);
			
			//this.cargarOrderByContactoCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByContactoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContactoCliente,true,this);
			
			//this.cargarOrderByContactoCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosContactoCliente.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosContactoCliente.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosContactoCliente.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosContactoCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosContactoCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosContactoCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoContactoCliente.setText("Nuevo");
		this.jButtonDuplicarContactoCliente.setText("Duplicar");
		this.jButtonCopiarContactoCliente.setText("Copiar");
		this.jButtonVerFormContactoCliente.setText("Ver");
		this.jButtonNuevoRelacionesContactoCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaContactoCliente.setText("Guardar");
		this.jButtonCerrarContactoCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoContactoCliente,"nuevo_button","Nuevo",this.contactoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarContactoCliente,"duplicar_button","Duplicar",this.contactoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarContactoCliente,"copiar_button","Copiar",this.contactoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormContactoCliente,"ver_form","Ver",this.contactoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesContactoCliente,"nuevorelaciones_button","Nuevo Rel",this.contactoclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaContactoCliente,"guardarcambiostabla_button","Guardar",this.contactoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarContactoCliente,"cerrar_button","Salir",this.contactoclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoContactoCliente.setToolTipText("Nuevo"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarContactoCliente.setToolTipText("Duplicar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarContactoCliente.setToolTipText("Copiar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormContactoCliente.setToolTipText("Ver"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesContactoCliente.setToolTipText("Nuevo Rel"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaContactoCliente.setToolTipText("Guardar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarContactoCliente.setToolTipText("Salir"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoContactoCliente";
		inputMap = this.jButtonNuevoContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoContactoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoContactoCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarContactoCliente";
		inputMap = this.jButtonDuplicarContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarContactoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarContactoCliente"));
		
		//COPIAR
		sMapKey = "CopiarContactoCliente";
		inputMap = this.jButtonCopiarContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarContactoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarContactoCliente"));
		
		//VEr FORM
		sMapKey = "VerFormContactoCliente";
		inputMap = this.jButtonVerFormContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormContactoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormContactoCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesContactoCliente";
		inputMap = this.jButtonNuevoRelacionesContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesContactoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesContactoCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarContactoCliente";
		inputMap = this.jButtonModificarContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarContactoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarContactoCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarContactoCliente";
		inputMap = this.jButtonCerrarContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarContactoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarContactoCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaContactoCliente";
		inputMap = this.jButtonGuardarCambiosTablaContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaContactoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaContactoCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesContactoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesContactoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionContactoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ContactoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ContactoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ContactoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ContactoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ContactoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesContactoCliente.setName("jPanelParametrosReportesContactoCliente"); 
		
		this.jPanelParametrosReportesAccionesContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesContactoCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesContactoCliente.setName("jPanelParametrosReportesAccionesContactoCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionContactoCliente = new JButtonMe();
		this.jButtonRecargarInformacionContactoCliente.setText("Recargar");
		this.jButtonRecargarInformacionContactoCliente.setToolTipText("Recargar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionContactoCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionContactoCliente = new JButtonMe();
		this.jButtonProcesarInformacionContactoCliente.setText("Procesar");
		this.jButtonProcesarInformacionContactoCliente.setToolTipText("Procesar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionContactoCliente.setVisible(false);
			
		this.jButtonProcesarInformacionContactoCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionContactoCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionContactoCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesContactoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesContactoCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesContactoCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesContactoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesContactoCliente.setText("TIPO");       
		this.jComboBoxTiposReportesContactoCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesContactoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesContactoCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesContactoCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionContactoCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionContactoCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionContactoCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesContactoCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesContactoCliente.setText("Accion");
		this.jComboBoxTiposRelacionesContactoCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesContactoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesContactoCliente.setText("Accion");
		this.jComboBoxTiposAccionesContactoCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarContactoCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarContactoCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarContactoCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralContactoCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralContactoCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralContactoCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralContactoCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesContactoCliente = new JLabelMe();
		
		this.jLabelAccionesContactoCliente.setText("Acciones");		
		this.jLabelAccionesContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosContactoCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosContactoCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosContactoCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosContactoCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosContactoCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosContactoCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaContactoCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaContactoCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaContactoCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteContactoCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteContactoCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteContactoCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresContactoCliente = new JButtonMe();
		//this.jButtonAnterioresContactoCliente.setText("<<");
        this.jButtonAnterioresContactoCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresContactoCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesContactoCliente = new JButtonMe();
		//this.jButtonSiguientesContactoCliente.setText(">>");
        this.jButtonSiguientesContactoCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesContactoCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosContactoCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosContactoCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosContactoCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosContactoCliente,"nuevoguardarcambios_button","Nue",this.contactoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosContactoCliente";
		inputMap = this.jButtonNuevoGuardarCambiosContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosContactoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosContactoCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionContactoCliente";
		inputMap = this.jButtonRecargarInformacionContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionContactoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionContactoCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesContactoCliente";
		inputMap = this.jButtonSiguientesContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesContactoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesContactoCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresContactoCliente";
		inputMap = this.jButtonAnterioresContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresContactoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresContactoCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasContactoCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesContactoCliente.setMinimumSize(new Dimension(this.getWidth(),ContactoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ContactoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesContactoCliente.setMaximumSize(new Dimension(this.getWidth(),ContactoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ContactoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesContactoCliente.setPreferredSize(new Dimension(this.getWidth(),ContactoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ContactoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionContactoCliente = new GridBagLayout();

			this.jPanelPaginacionContactoCliente.setLayout(gridaBagLayoutPaginacionContactoCliente);						
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.gridy = 0;
			this.gridBagConstraintsContactoCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionContactoCliente.add(this.jButtonAnterioresContactoCliente, this.gridBagConstraintsContactoCliente);
					
						
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsContactoCliente.gridy = 0;
			
			this.jPanelPaginacionContactoCliente.add(this.jButtonNuevoGuardarCambiosContactoCliente, this.gridBagConstraintsContactoCliente);
						
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsContactoCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsContactoCliente.gridy = 0;
			this.jPanelPaginacionContactoCliente.add(this.jButtonSiguientesContactoCliente, this.gridBagConstraintsContactoCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.gridy = 1;
			this.gridBagConstraintsContactoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContactoCliente.add(this.jButtonNuevoContactoCliente, this.gridBagConstraintsContactoCliente);
						
			
			
			if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsContactoCliente = new GridBagConstraints();
				this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsContactoCliente.gridy = 1;
				this.gridBagConstraintsContactoCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionContactoCliente.add(this.jButtonGuardarCambiosTablaContactoCliente, this.gridBagConstraintsContactoCliente);
			}
			
			
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.gridy = 1;
			this.gridBagConstraintsContactoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContactoCliente.add(this.jButtonDuplicarContactoCliente, this.gridBagConstraintsContactoCliente);
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.gridy = 1;
			this.gridBagConstraintsContactoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContactoCliente.add(this.jButtonCopiarContactoCliente, this.gridBagConstraintsContactoCliente);
		
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.gridy = 1;
			this.gridBagConstraintsContactoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionContactoCliente.add(this.jButtonVerFormContactoCliente, this.gridBagConstraintsContactoCliente);
		
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.gridy = 1;
			this.gridBagConstraintsContactoCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionContactoCliente.add(this.jButtonCerrarContactoCliente, this.gridBagConstraintsContactoCliente);
		
		
		
		this.jButtonRecargarInformacionContactoCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionContactoCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionContactoCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesContactoCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesContactoCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesContactoCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesContactoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesContactoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesContactoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesContactoCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesContactoCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesContactoCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionContactoCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionContactoCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionContactoCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesContactoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesContactoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesContactoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesContactoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContactoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContactoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarContactoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarContactoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarContactoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaContactoCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaContactoCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaContactoCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteContactoCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteContactoCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteContactoCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosContactoCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosContactoCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosContactoCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosContactoCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosContactoCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosContactoCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesContactoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesContactoCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ContactoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ContactoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ContactoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ContactoCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesContactoCliente.setLayout(gridaBagParametrosReportesContactoCliente);
			this.jPanelParametrosReportesAccionesContactoCliente.setLayout(gridaBagParametrosReportesAccionesContactoCliente);
			
			
			this.jPanelParametrosAuxiliar1ContactoCliente.setLayout(gridaBagParametrosAuxiliar1ContactoCliente);
			this.jPanelParametrosAuxiliar2ContactoCliente.setLayout(gridaBagParametrosAuxiliar2ContactoCliente);
			this.jPanelParametrosAuxiliar3ContactoCliente.setLayout(gridaBagParametrosAuxiliar3ContactoCliente);
			this.jPanelParametrosAuxiliar4ContactoCliente.setLayout(gridaBagParametrosAuxiliar4ContactoCliente);
			//this.jPanelParametrosAuxiliar5ContactoCliente.setLayout(gridaBagParametrosAuxiliar2ContactoCliente);			
			
			
			
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsContactoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContactoCliente.add(this.jButtonRecargarInformacionContactoCliente, this.gridBagConstraintsContactoCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsContactoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ContactoCliente.add(this.jComboBoxTiposPaginacionContactoCliente, this.gridBagConstraintsContactoCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsContactoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ContactoCliente.add(this.jCheckBoxConAltoMaximoTablaContactoCliente, this.gridBagConstraintsContactoCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsContactoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ContactoCliente.add(this.jComboBoxTiposArchivosReportesContactoCliente, this.gridBagConstraintsContactoCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContactoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContactoCliente.add(this.jPanelParametrosAuxiliar1ContactoCliente, this.gridBagConstraintsContactoCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsContactoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ContactoCliente.add(this.jComboBoxTiposReportesContactoCliente, this.gridBagConstraintsContactoCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContactoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContactoCliente.add(this.jPanelParametrosAuxiliar4ContactoCliente, this.gridBagConstraintsContactoCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsContactoCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContactoCliente.add(this.jComboBoxTiposReportesContactoCliente, this.gridBagConstraintsContactoCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContactoCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesContactoCliente.add(this.jCheckBoxGenerarReporteContactoCliente, this.gridBagConstraintsContactoCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContactoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContactoCliente.add(this.jPanelParametrosAuxiliar2ContactoCliente, this.gridBagConstraintsContactoCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsContactoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesContactoCliente.add(this.jLabelAccionesContactoCliente, this.gridBagConstraintsContactoCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsContactoCliente = new GridBagConstraints();
				this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsContactoCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesContactoCliente.add(this.jButtonAbrirOrderByContactoCliente, this.gridBagConstraintsContactoCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContactoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContactoCliente.add(this.jComboBoxTiposSeleccionarContactoCliente, this.gridBagConstraintsContactoCliente);			
			
			
			/*
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsContactoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesContactoCliente.add(this.jCheckBoxSeleccionarTodosContactoCliente, this.gridBagConstraintsContactoCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsContactoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ContactoCliente.add(this.jCheckBoxSeleccionarTodosContactoCliente, this.gridBagConstraintsContactoCliente);															
				
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsContactoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ContactoCliente.add(this.jCheckBoxSeleccionadosContactoCliente, this.gridBagConstraintsContactoCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContactoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesContactoCliente.add(this.jPanelParametrosAuxiliar3ContactoCliente, this.gridBagConstraintsContactoCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContactoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContactoCliente.add(this.jComboBoxTiposAccionesContactoCliente, this.gridBagConstraintsContactoCliente);
	
				
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsContactoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesContactoCliente.add(this.jTextFieldValorCampoGeneralContactoCliente, this.gridBagConstraintsContactoCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosContactoCliente = new GridBagLayout();

			this.jScrollPanelDatosContactoCliente.setLayout(gridaBagLayoutDatosContactoCliente);
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.gridy = 0;
			this.gridBagConstraintsContactoCliente.gridx = 0;
			
			this.jScrollPanelDatosContactoCliente.add(this.jTableDatosContactoCliente, this.gridBagConstraintsContactoCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosContactoCliente.setViewportView(this.jTableDatosContactoCliente);
		this.jTableDatosContactoCliente.setFillsViewportHeight(true);
		this.jTableDatosContactoCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesContactoCliente= new GridBagLayout();
		this.jPanelAccionesContactoCliente.setLayout(gridaBagLayoutAccionesContactoCliente);
		
		
		/*	
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx = 0;
			
		this.jPanelAccionesContactoCliente.add(this.jButtonNuevoContactoCliente, this.gridBagConstraintsContactoCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteContactoCliente= new GridBagLayout();
		gridaBagLayoutFK_IdClienteContactoCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteContactoCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteContactoCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteContactoCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteContactoCliente.setLayout(gridaBagLayoutFK_IdClienteContactoCliente);

		gridBagConstraintsContactoCliente = new GridBagConstraints();
		gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsContactoCliente.gridy = 0;
		gridBagConstraintsContactoCliente.gridx = 0;
		jPanelFK_IdClienteContactoCliente.add(jLabelid_clienteFK_IdClienteContactoCliente, gridBagConstraintsContactoCliente);

		gridBagConstraintsContactoCliente = new GridBagConstraints();
		gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsContactoCliente.gridy = 0;
		gridBagConstraintsContactoCliente.gridx = 1;
		jPanelFK_IdClienteContactoCliente.add(jComboBoxid_clienteFK_IdClienteContactoCliente, gridBagConstraintsContactoCliente);


		gridBagConstraintsContactoCliente = new GridBagConstraints();
		gridBagConstraintsContactoCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsContactoCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsContactoCliente.gridy = 0;
		gridBagConstraintsContactoCliente.gridx = 0;
		jPanelFK_IdClienteContactoCliente.add(this.jButtonBuscarFK_IdClienteid_clienteContactoCliente, gridBagConstraintsContactoCliente);

		gridBagConstraintsContactoCliente = new GridBagConstraints();
		gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsContactoCliente.gridy = 1;
		gridBagConstraintsContactoCliente.gridx =1;
		jPanelFK_IdClienteContactoCliente.add(jButtonFK_IdClienteContactoCliente, gridBagConstraintsContactoCliente);

		jTabbedPaneBusquedasContactoCliente.addTab("1.-Por Cliente ", jPanelFK_IdClienteContactoCliente);
		jTabbedPaneBusquedasContactoCliente.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutContactoCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutContactoCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.contactoclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();						
			this.gridBagConstraintsContactoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsContactoCliente.gridx = 0;		
			//this.gridBagConstraintsContactoCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsContactoCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarContactoCliente, this.gridBagConstraintsContactoCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsContactoCliente.gridx = 0;		
		//this.gridBagConstraintsContactoCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsContactoCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsContactoCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsContactoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsContactoCliente.gridx = 0;		
			this.gridBagConstraintsContactoCliente.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsContactoCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasContactoCliente, this.gridBagConstraintsContactoCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContactoCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesContactoCliente, this.gridBagConstraintsContactoCliente);								
		
		
		/*
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContactoCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesContactoCliente, this.gridBagConstraintsContactoCliente);
		*/		
		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsContactoCliente.gridx =0;
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsContactoCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosContactoCliente, this.gridBagConstraintsContactoCliente);
				
		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContactoCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionContactoCliente, this.gridBagConstraintsContactoCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ContactoClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosContactoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosContactoCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosContactoCliente.setLayout(gridaBagLayoutBusquedasParametrosContactoCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralContactoCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralContactoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContactoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContactoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContactoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposContactoCliente, this.gridBagConstraintsContactoCliente);
			
			
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContactoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosContactoCliente, this.gridBagConstraintsContactoCliente);
		
			
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsContactoCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesContactoCliente, this.gridBagConstraintsContactoCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralContactoCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoContactoCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoContactoCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoContactoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoContactoCliente.setName("jPanelReporteDinamicoContactoCliente"); 
		
		this.jPanelReporteDinamicoContactoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoContactoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoContactoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoContactoCliente.setLayout(gridaBagLayoutReporteDinamicoContactoCliente);
		
		
		this.jInternalFrameReporteDinamicoContactoCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoContactoCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteContactoCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoContactoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoContactoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoContactoCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoContactoCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoContactoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoContactoCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoContactoCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoContactoCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoContactoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoContactoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoContactoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contacto Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteContactoCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteContactoCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContactoCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoContactoCliente.add(this.jLabelColumnasSelectReporteContactoCliente, this.gridBagConstraintsContactoCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteContactoCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteContactoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteContactoCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteContactoCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteContactoCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteContactoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteContactoCliente=new JScrollPane(this.jListColumnasSelectReporteContactoCliente);
			
			this.jScrollColumnasSelectReporteContactoCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteContactoCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteContactoCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContactoCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoContactoCliente.add(this.jListColumnasSelectReporteContactoCliente, this.gridBagConstraintsContactoCliente);
		this.jPanelReporteDinamicoContactoCliente.add(this.jScrollColumnasSelectReporteContactoCliente, this.gridBagConstraintsContactoCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteContactoCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteContactoCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteContactoCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteContactoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteContactoCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteContactoCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteContactoCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteContactoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteContactoCliente=new JScrollPane(this.jListRelacionesSelectReporteContactoCliente);
			
			this.jScrollRelacionesSelectReporteContactoCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteContactoCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteContactoCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoContactoCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoContactoCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoContactoCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoContactoCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoContactoCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoContactoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoContactoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoContactoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoContactoCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoContactoCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoContactoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoContactoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoContactoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoContactoCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoContactoCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContactoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoContactoCliente.add(this.jLabelGenerarExcelReporteDinamicoContactoCliente, this.gridBagConstraintsContactoCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoContactoCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoContactoCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoContactoCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoContactoCliente.setToolTipText("Generar EXCEL"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		//this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsContactoCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsContactoCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoContactoCliente.add(this.jButtonGenerarExcelReporteDinamicoContactoCliente, this.gridBagConstraintsContactoCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContactoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContactoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContactoCliente.add(this.jComboBoxTiposReportesDinamicoContactoCliente, this.gridBagConstraintsContactoCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoContactoCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoContactoCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsContactoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoContactoCliente.add(this.jLabelTiposArchivoReporteDinamicoContactoCliente, this.gridBagConstraintsContactoCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContactoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContactoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContactoCliente.add(this.jComboBoxTiposArchivosReportesDinamicoContactoCliente, this.gridBagConstraintsContactoCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoContactoCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoContactoCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoContactoCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoContactoCliente.setToolTipText("Generar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContactoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContactoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContactoCliente.add(this.jButtonGenerarReporteDinamicoContactoCliente, this.gridBagConstraintsContactoCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoContactoCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoContactoCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoContactoCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoContactoCliente.setToolTipText("Cancelar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContactoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsContactoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoContactoCliente.add(this.jButtonCerrarReporteDinamicoContactoCliente, this.gridBagConstraintsContactoCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalContactoCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoContactoCliente= new JScrollPane(jPanelReporteDinamicoContactoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoContactoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoContactoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoContactoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contacto Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsContactoCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoContactoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoContactoCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalContactoCliente);
		this.jInternalFrameReporteDinamicoContactoCliente.getContentPane().add(this.jScrollPanelReporteDinamicoContactoCliente, this.gridBagConstraintsContactoCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionContactoCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionContactoCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionContactoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionContactoCliente.setName("jPanelImportacionContactoCliente"); 
		
		this.jPanelImportacionContactoCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionContactoCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionContactoCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionContactoCliente.setLayout(gridaBagLayoutImportacionContactoCliente);
		
		
		this.jInternalFrameImportacionContactoCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionContactoCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionContactoCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteContactoCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionContactoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionContactoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionContactoCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionContactoCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionContactoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionContactoCliente.setResizable(true);
	    this.jInternalFrameImportacionContactoCliente.setClosable(true);
	    this.jInternalFrameImportacionContactoCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionContactoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionContactoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionContactoCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionContactoCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionContactoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionContactoCliente.setResizable(true);
	    this.jInternalFrameImportacionContactoCliente.setClosable(true);
	    this.jInternalFrameImportacionContactoCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionContactoCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionContactoCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionContactoCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contacto Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionContactoCliente = new JLabelMe();

		this.jLabelArchivoImportacionContactoCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsContactoCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionContactoCliente.add(this.jLabelArchivoImportacionContactoCliente, this.gridBagConstraintsContactoCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionContactoCliente = new JFileChooser();		
		this.jFileChooserImportacionContactoCliente.setToolTipText("ESCOGER ARCHIVO"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionContactoCliente = new JButtonMe();
		this.jButtonAbrirImportacionContactoCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionContactoCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionContactoCliente.setToolTipText("Generar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContactoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsContactoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContactoCliente.add(this.jButtonAbrirImportacionContactoCliente, this.gridBagConstraintsContactoCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionContactoCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionContactoCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsContactoCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionContactoCliente.add(this.jLabelPathArchivoImportacionContactoCliente, this.gridBagConstraintsContactoCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionContactoCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionContactoCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionContactoCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionContactoCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContactoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsContactoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContactoCliente.add(this.jTextFieldPathArchivoImportacionContactoCliente, this.gridBagConstraintsContactoCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionContactoCliente = new JButtonMe();
		this.jButtonGenerarImportacionContactoCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionContactoCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionContactoCliente.setToolTipText("Generar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContactoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsContactoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContactoCliente.add(this.jButtonGenerarImportacionContactoCliente, this.gridBagConstraintsContactoCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionContactoCliente = new JButtonMe();
		this.jButtonCerrarImportacionContactoCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionContactoCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionContactoCliente.setToolTipText("Cancelar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContactoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsContactoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionContactoCliente.add(this.jButtonCerrarImportacionContactoCliente, this.gridBagConstraintsContactoCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalContactoCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionContactoCliente= new JScrollPane(jPanelImportacionContactoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsContactoCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionContactoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionContactoCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalContactoCliente);
		this.jInternalFrameImportacionContactoCliente.getContentPane().add(this.jScrollPanelImportacionContactoCliente, this.gridBagConstraintsContactoCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByContactoCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByContactoCliente = new JButtonMe();
			this.jButtonAbrirOrderByContactoCliente.setText("Orden");
			this.jButtonAbrirOrderByContactoCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByContactoCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByContactoCliente";
			inputMap = this.jButtonAbrirOrderByContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByContactoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByContactoCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByContactoCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByContactoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByContactoCliente.setName("jPanelOrderByContactoCliente"); 
			
			this.jPanelOrderByContactoCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByContactoCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByContactoCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByContactoCliente.setLayout(gridaBagLayoutOrderByContactoCliente);
			
			
			this.jTableDatosContactoClienteOrderBy = new JTableMe();        
			this.jTableDatosContactoClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosContactoClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosContactoClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosContactoClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosContactoClienteOrderBy.setViewportView(this.jTableDatosContactoClienteOrderBy);
			this.jTableDatosContactoClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosContactoClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByContactoCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByContactoCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByContactoCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteContactoCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByContactoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByContactoCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByContactoCliente.setTitle("Orden");
			this.jInternalFrameOrderByContactoCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByContactoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByContactoCliente.setResizable(true);
			this.jInternalFrameOrderByContactoCliente.setClosable(true);
			this.jInternalFrameOrderByContactoCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByContactoCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByContactoCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByContactoCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contacto Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsContactoCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsContactoCliente.ipady =150;
				
			this.jPanelOrderByContactoCliente.add(jScrollPanelDatosContactoClienteOrderBy, this.gridBagConstraintsContactoCliente);//this.jTableDatosContactoClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByContactoCliente = new JButtonMe();
			this.jButtonCerrarOrderByContactoCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByContactoCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByContactoCliente.setToolTipText("Cancelar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsContactoCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByContactoCliente.add(this.jButtonCerrarOrderByContactoCliente, this.gridBagConstraintsContactoCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalContactoCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByContactoCliente= new JScrollPane(jPanelOrderByContactoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsContactoCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByContactoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByContactoCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalContactoCliente);
			
			this.jInternalFrameOrderByContactoCliente.getContentPane().add(this.jScrollPanelOrderByContactoCliente, this.gridBagConstraintsContactoCliente);			
		
		} else {
			this.jButtonAbrirOrderByContactoCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.contactoclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosContactoCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosContactoCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosContactoCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosContactoCliente.getRowHeight();//ContactoClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ContactoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaContactoCliente.isSelected()) {
					iHeightTable=ContactoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ContactoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ContactoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ContactoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaContactoCliente.isSelected()) {
					iHeightTable=ContactoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ContactoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ContactoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosContactoCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosContactoCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosContactoCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosContactoCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosContactoCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosContactoCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByContactoCliente!=null && this.jInternalFrameOrderByContactoCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByContactoCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByContactoCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByContactoCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByContactoCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByContactoCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByContactoCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByContactoCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosContactoCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosContactoCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosContactoCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=contactoclienteLogic.getContactoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=contactoclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ContactoCliente> TraerContactoClienteBeans(List<ContactoCliente> contactoclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(ContactoCliente contactocliente:contactoclientes) {
					
				if(!(ContactoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ContactoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					contactocliente.setsDetalleGeneralEntityReporte(ContactoClienteConstantesFunciones.getContactoClienteDescripcion(contactocliente));
										
						
					
						
					
				} else  {
							
					//contactocliente.setsDetalleGeneralEntityReporte(contactocliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//contactoclientebeans.add(contactoclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return contactoclientes;
    }
	//PARA REPORTES FIN
}
